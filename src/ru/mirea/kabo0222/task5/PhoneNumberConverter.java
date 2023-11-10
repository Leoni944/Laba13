package ru.mirea.kab0022.task5;
public class PhoneNumberConverter {

    public static void main(String[] args) {
        String phoneNumber1 = "+79175655655";
        String phoneNumber2 = "+104289652211";
        String phoneNumber3 = "89175655655";

        String formattedPhoneNumber1 = formatPhoneNumber(phoneNumber1);
        System.out.println(formattedPhoneNumber1);

        String formattedPhoneNumber2 = formatPhoneNumber(phoneNumber2);
        System.out.println(formattedPhoneNumber2);

        String formattedPhoneNumber3 = formatPhoneNumber(phoneNumber3);
        System.out.println(formattedPhoneNumber3);
    }

    public static String formatPhoneNumber(String phoneNumber) {
        String formattedPhoneNumber = null;

        if (phoneNumber.startsWith("+") && phoneNumber.length() == 12) {
            String countryCode = phoneNumber.substring(1, 4);
            String number = phoneNumber.substring(4);

            formattedPhoneNumber = "+" + countryCode + " " + number.substring(0, 3) + "-" + number.substring(3, 6) + "-" + number.substring(6);
        } else if (phoneNumber.startsWith("8") && phoneNumber.length() == 11) {
            String number = phoneNumber.substring(1);

            formattedPhoneNumber = "+7 " + number.substring(0, 3) + "-" + number.substring(3, 6) + "-" + number.substring(6);
        }

        return formattedPhoneNumber;
    }
}