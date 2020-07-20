package org.example;

/**
 * Hello world!
 *
 */
    public class StringUtils {

        private static final String ALL_VOWELS = "aeiouyAEIOUY";

        /**
         * Renvoie la chaine formée par les voyelles d'une chaine de caractères
         * @return Chaine avec uniquement des voyelles
         */
        public static String vowels(String candidate) {
            if (candidate == null) {
                throw new IllegalArgumentException("not null");
            }

            String vowels = "";
            char[] letters = candidate.toCharArray();
            for (int i = 0; i < candidate.length(); i++) {
                if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                        vowels += letters[i];
                }
            }
            return vowels;
        }

    public static String uniqueVowels(String candidate) {
        if (candidate == null) {
            throw new IllegalArgumentException("not null");
        }

        String vowels = "";
        char[] letters = candidate.toCharArray();
        for (int i = 0; i < candidate.length(); i++) {
            if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                if (!vowels.contains(Character.toString(letters[i]))) {
                    vowels += letters[i];
                }
            }
        }
        return vowels;
    }

    }