package tech.meliora.natujenge.builder;

public class Student {

    private String name;

    private String registrationNumber;

    private Gender gender;

    private Address address;

    public Student(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.registrationNumber = builder.registrationNumber;
        this.gender = builder.gender;
    }

    public static class Builder{
        private String name;

        private String registrationNumber;

        private Gender gender;

        private Address address;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder reg(String registrationNumber){
            this.registrationNumber = registrationNumber;
            return this;
        }

        public Builder gender(Gender gender){
            this.gender = gender;
            return this;
        }

        public Builder address(Address address){
            this.address = address;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", gender=" + gender +
                ", address=" + address +
                '}';
    }
}
