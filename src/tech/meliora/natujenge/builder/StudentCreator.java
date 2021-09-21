package tech.meliora.natujenge.builder;

public class StudentCreator {
    public static void main(String[] args) {

        Address address = new Address.Builder()
                .county("Kitui")
                .subCounty("Kanyangi")
                .village("Kalulini")
                .build();

        Student student = new Student.Builder()
                .address(address)
                .gender(Gender.MALE)
                .reg("CI/00005/018")
                .name("Brian")
                .build();

        System.out.println(student);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("hello")
                .append(" ")
                .append("world");

        System.out.println(stringBuilder.toString());

    }
}
