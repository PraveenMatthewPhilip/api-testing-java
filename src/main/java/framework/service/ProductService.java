package framework.service;

import com.fasterxml.jackson.core.type.TypeReference;
import framework.model.CarbonCreditsCategory;
import framework.model.error.ValidationError;
import framework.utils.common.RestUtil;
import framework.utils.exceptions.AutomationException;
import framework.utils.globalConstants.APIEndPoint;
import framework.utils.globalConstants.HttpStatus;
import framework.utils.reportManagement.extent.ExtentTestManager;
import io.restassured.http.ContentType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ProductService {

    private final Logger _logger = LogManager.getLogger(ProductService.class);

    private Object responsePayload;
    private boolean isNegativeTest = false;
    private HttpStatus httpStatus = HttpStatus.OK;
    private ContentType responseContentType = ContentType.JSON;

    public static ProductService init() {
        return new ProductService();
    }

    public ProductService isNegativeTest(HttpStatus httpStatus) {
        this.responseContentType = ContentType.JSON;
        this.isNegativeTest = true;
        this.httpStatus = httpStatus;
        return this;
    }

    public ProductService getProductDetails() throws AutomationException {

        ExtentTestManager.step(_logger, "Get Product Details");

        RestUtil restInstance =
                RestUtil.init()
                        .path(APIEndPoint.ENDPOINT)
                        .expectedStatusCode(httpStatus)
                        .expectedResponseContentType(responseContentType)
                        .get();

        if (!isNegativeTest) {
            responsePayload = restInstance.responseToPojo(new TypeReference<CarbonCreditsCategory>() {});
        } else {
            responsePayload = restInstance.responseToPojo(ValidationError.class);
        }

        return this;
    }



    public Object getResponse() {
        return responsePayload;
    }

}
