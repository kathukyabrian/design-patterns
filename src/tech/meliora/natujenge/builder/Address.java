package tech.meliora.natujenge.builder;

public class Address {

    private String county;

    private String subCounty;

    private String village;

    public Address(Builder builder) {
        this.county = builder.county;
        this.subCounty = builder.subCounty;
        this.village = builder.village;
    }

    public static class Builder{
        private String county;

        private String subCounty;

        private String village;

        public Builder county(String county){
            this.county = county;
            return this;
        }

        public Builder subCounty(String subCounty){
            this.subCounty = subCounty;
            return this;
        }

        public Builder village(String village){
            this.village = village;
            return this;
        }

        public Address build(){
            return new Address(this);
        }

    }

    @Override
    public String toString() {
        return "Address{" +
                "county='" + county + '\'' +
                ", subCounty='" + subCounty + '\'' +
                ", village='" + village + '\'' +
                '}';
    }
}
