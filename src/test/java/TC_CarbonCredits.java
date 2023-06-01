import framework.model.CarbonCreditsCategory;
import framework.service.ProductService;
import framework.utils.exceptions.AutomationException;
import framework.utils.initializers.TestInit;
import framework.utils.reportManagement.extent.ExtentTestManager;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TC_CarbonCredits extends TestInit {

    /**
     * Test Case: TC_CarbonCredits
     * Test Type: Positive
     * Description: To verify values of Carbon Credits API
     *
     * @throws AutomationException
     */




    @Test
    public void TC01_VerifyProductName() throws AutomationException {

        ExtentTestManager.startTest("Carbon Credits", "To verify output has name value as Carbon Credits");

        CarbonCreditsCategory carbonCreditsCategory = (CarbonCreditsCategory) ProductService
                .init()
                        .getProductDetails().getResponse();

        assertThat(carbonCreditsCategory.getName()).isEqualTo("Carbon credits");

    }
    @Test
    public void TC02_VerifyCanRelist() throws AutomationException {

        ExtentTestManager.startTest("Carbon Credits", "To verify output has can relist value as true");

        CarbonCreditsCategory carbonCreditsCategory = (CarbonCreditsCategory) ProductService
                .init()
                .getProductDetails().getResponse();

        assertThat(carbonCreditsCategory.isCanRelist()).isTrue();

    }

    @Test
    public void TC03_VerifyPromotionDescription() throws AutomationException {

        ExtentTestManager.startTest("Carbon Credits", "To verify that promotion titled gallery has valid description");

        CarbonCreditsCategory carbonCreditsCategory = (CarbonCreditsCategory) ProductService
                .init()
                .getProductDetails().getResponse();

        CarbonCreditsCategory.Promotion promotion = carbonCreditsCategory.getPromotions().stream().filter(item -> item.getName().equals("Gallery")).findFirst().get();

        assertThat(promotion).isNotNull();

        assertThat(promotion.getDescription()).isEqualTo("Good position in category");

    }


}
