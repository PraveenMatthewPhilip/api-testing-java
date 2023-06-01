package framework.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import java.util.List;

public class CarbonCreditsCategory {
    @JsonProperty
    private int CategoryId;
    @JsonProperty
    private String Name;
    @JsonProperty
    private String Path;
    @JsonProperty
    private boolean CanListAuctions;
    @JsonProperty
    private boolean CanListClassifieds;
    @JsonProperty
    private boolean CanRelist;
    @JsonProperty
    private String LegalNotice;
    @JsonProperty
    private int DefaultDuration;
    @JsonProperty
    private List<Integer> AllowedDurations;
    @JsonProperty
    private Fees Fees;
    @JsonProperty
    private int FreePhotoCount;
    @JsonProperty
    private int MaximumPhotoCount;
    @JsonProperty
    private boolean IsFreeToRelist;
    @JsonProperty
    private List<Promotion> Promotions;
    @JsonProperty
    private List<String> EmbeddedContentOptions;
    @JsonProperty
    private int MaximumTitleLength;
    @JsonProperty
    private int AreaOfBusiness;
    @JsonProperty
    private int DefaultRelistDuration;
    @JsonProperty
    private boolean CanUseCounterOffers;

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String path) {
        Path = path;
    }

    public boolean isCanListAuctions() {
        return CanListAuctions;
    }

    public void setCanListAuctions(boolean canListAuctions) {
        CanListAuctions = canListAuctions;
    }

    public boolean isCanListClassifieds() {
        return CanListClassifieds;
    }

    public void setCanListClassifieds(boolean canListClassifieds) {
        CanListClassifieds = canListClassifieds;
    }

    public boolean isCanRelist() {
        return CanRelist;
    }

    public void setCanRelist(boolean canRelist) {
        CanRelist = canRelist;
    }

    public String getLegalNotice() {
        return LegalNotice;
    }

    public void setLegalNotice(String legalNotice) {
        LegalNotice = legalNotice;
    }

    public int getDefaultDuration() {
        return DefaultDuration;
    }

    public void setDefaultDuration(int defaultDuration) {
        DefaultDuration = defaultDuration;
    }

    public List<Integer> getAllowedDurations() {
        return AllowedDurations;
    }

    public void setAllowedDurations(List<Integer> allowedDurations) {
        AllowedDurations = allowedDurations;
    }

    public Fees getFees() {
        return Fees;
    }

    public void setFees(Fees fees) {
        this.Fees = fees;
    }

    public int getFreePhotoCount() {
        return FreePhotoCount;
    }

    public void setFreePhotoCount(int freePhotoCount) {
        FreePhotoCount = freePhotoCount;
    }

    public int getMaximumPhotoCount() {
        return MaximumPhotoCount;
    }

    public void setMaximumPhotoCount(int maximumPhotoCount) {
        MaximumPhotoCount = maximumPhotoCount;
    }

    public boolean isFreeToRelist() {
        return IsFreeToRelist;
    }

    public void setFreeToRelist(boolean freeToRelist) {
        IsFreeToRelist = freeToRelist;
    }

    public List<Promotion> getPromotions() {
        return Promotions;
    }

    public void setPromotions(List<Promotion> promotions) {
        Promotions = promotions;
    }

    public List<String> getEmbeddedContentOptions() {
        return EmbeddedContentOptions;
    }

    public void setEmbeddedContentOptions(List<String> embeddedContentOptions) {
        EmbeddedContentOptions = embeddedContentOptions;
    }

    public int getMaximumTitleLength() {
        return MaximumTitleLength;
    }

    public void setMaximumTitleLength(int maximumTitleLength) {
        MaximumTitleLength = maximumTitleLength;
    }

    public int getAreaOfBusiness() {
        return AreaOfBusiness;
    }

    public void setAreaOfBusiness(int areaOfBusiness) {
        AreaOfBusiness = areaOfBusiness;
    }

    public int getDefaultRelistDuration() {
        return DefaultRelistDuration;
    }

    public void setDefaultRelistDuration(int defaultRelistDuration) {
        DefaultRelistDuration = defaultRelistDuration;
    }

    public boolean isCanUseCounterOffers() {
        return CanUseCounterOffers;
    }

    public void setCanUseCounterOffers(boolean canUseCounterOffers) {
        CanUseCounterOffers = canUseCounterOffers;
    }

    public static class Fees {
        @JsonProperty
        private double Bundle;
        @JsonProperty
        private double EndDate;
        @JsonProperty
        private double Feature;
        @JsonProperty
        private double Gallery;
        @JsonProperty
        private double Listing;
        @JsonProperty
        private double Reserve;
        @JsonProperty
        private double Subtitle;
        @JsonProperty
        private double TenDays;
        @JsonProperty
        private List<ListingFeeTier> ListingFeeTiers;
        @JsonProperty
        private double SecondCategory;

        public double getBundle() {
            return Bundle;
        }

        public void setBundle(double bundle) {
            Bundle = bundle;
        }

        public double getEndDate() {
            return EndDate;
        }

        public void setEndDate(double endDate) {
            EndDate = endDate;
        }

        public double getFeature() {
            return Feature;
        }

        public void setFeature(double feature) {
            Feature = feature;
        }

        public double getGallery() {
            return Gallery;
        }

        public void setGallery(double gallery) {
            Gallery = gallery;
        }

        public double getListing() {
            return Listing;
        }

        public void setListing(double listing) {
            Listing = listing;
        }

        public double getReserve() {
            return Reserve;
        }

        public void setReserve(double reserve) {
            Reserve = reserve;
        }

        public double getSubtitle() {
            return Subtitle;
        }

        public void setSubtitle(double subtitle) {
            Subtitle = subtitle;
        }

        public double getTenDays() {
            return TenDays;
        }

        public void setTenDays(double tenDays) {
            TenDays = tenDays;
        }

        public List<ListingFeeTier> getListingFeeTiers() {
            return ListingFeeTiers;
        }

        public void setListingFeeTiers(List<ListingFeeTier> listingFeeTiers) {
            ListingFeeTiers = listingFeeTiers;
        }

        public double getSecondCategory() {
            return SecondCategory;
        }

        public void setSecondCategory(double secondCategory) {
            SecondCategory = secondCategory;
        }
    }

    public static class Promotion {
        @JsonProperty
        private int Id;
        @JsonProperty
        private String Name;
        @JsonProperty
        private String Description;
        @JsonProperty
        private double Price;
        @JsonProperty
        private double OriginalPrice;
        @JsonProperty
        private int MinimumPhotoCount;
        @JsonProperty
        private boolean Recommended;

        public int getId() {
            return Id;
        }

        public void setId(int id) {
            Id = id;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getDescription() {
            return Description;
        }

        public void setDescription(String description) {
            Description = description;
        }

        public double getPrice() {
            return Price;
        }

        public void setPrice(double price) {
            Price = price;
        }

        public double getOriginalPrice() {
            return OriginalPrice;
        }

        public void setOriginalPrice(double originalPrice) {
            OriginalPrice = originalPrice;
        }

        public int getMinimumPhotoCount() {
            return MinimumPhotoCount;
        }

        public void setMinimumPhotoCount(int minimumPhotoCount) {
            MinimumPhotoCount = minimumPhotoCount;
        }

        public boolean isRecommended() {
            return Recommended;
        }

        public void setRecommended(boolean recommended) {
            Recommended = recommended;
        }
    }

    public static class ListingFeeTier {
        @JsonProperty
        private double MinimumTierPrice;
        @JsonProperty
        private double FixedFee;

        public double getMinimumTierPrice() {
            return MinimumTierPrice;
        }

        public void setMinimumTierPrice(double minimumTierPrice) {
            MinimumTierPrice = minimumTierPrice;
        }

        public double getFixedFee() {
            return FixedFee;
        }

        public void setFixedFee(double fixedFee) {
            FixedFee = fixedFee;
        }
    }
}
