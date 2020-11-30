package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class RandomStringGenerator {

    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private char[] lowerChars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
            'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private char[] upperChars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
            'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private static final String DIGITS = "0123456789";
    private char[] digitsChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private static final String PUNCTUATION = "!@#$%&*()_+-=[]|,./?><";
    private char[] punctuationChars = {'!', '@', '#', '$', '%', '&', '*', '(', ')', '_', '+', '-', '=', '[', ']', '|', ',',
            '.', '/', '?', '>', '<'};
    private boolean useLower;
    private boolean useUpper;
    private boolean useDigits;
    private boolean usePunctuation;

    private RandomStringGenerator() {
        throw new UnsupportedOperationException("Empty constructor is not supported.");
    }

    private RandomStringGenerator(RandomStringGeneratorBuilder builder) {
        this.useLower = builder.useLower;
        this.useUpper = builder.useUpper;
        this.useDigits = builder.useDigits;
        this.usePunctuation = builder.usePunctuation;
    }

    public static class RandomStringGeneratorBuilder {

        private boolean useLower;
        private boolean useUpper;
        private boolean useDigits;
        private boolean usePunctuation;

        public RandomStringGeneratorBuilder() {
            this.useLower = false;
            this.useUpper = false;
            this.useDigits = false;
            this.usePunctuation = false;
        }

        /**
         * Set true in case you would like to include lower characters
         * (abc...xyz). Default false.
         *
         * @param useLower true in case you would like to include lower
         *                 characters (abc...xyz). Default false.
         * @return the builder for chaining.
         */
        public RandomStringGeneratorBuilder useLower(boolean useLower) {
            this.useLower = useLower;
            return this;
        }

        /**
         * Set true in case you would like to include upper characters
         * (ABC...XYZ). Default false.
         *
         * @param useUpper true in case you would like to include upper
         *                 characters (ABC...XYZ). Default false.
         * @return the builder for chaining.
         */
        public RandomStringGeneratorBuilder useUpper(boolean useUpper) {
            this.useUpper = useUpper;
            return this;
        }

        /**
         * Set true in case you would like to include digit characters (123..).
         * Default false.
         *
         * @param useDigits true in case you would like to include digit
         *                  characters (123..). Default false.
         * @return the builder for chaining.
         */
        public RandomStringGeneratorBuilder useDigits(boolean useDigits) {
            this.useDigits = useDigits;
            return this;
        }

        /**
         * Set true in case you would like to include punctuation characters
         * (!@#..). Default false.
         *
         * @param usePunctuation true in case you would like to include
         *                       punctuation characters (!@#..). Default false.
         * @return the builder for chaining.
         */
        public RandomStringGeneratorBuilder usePunctuation(boolean usePunctuation) {
            this.usePunctuation = usePunctuation;
            return this;
        }

        public RandomStringGenerator build() {
            return new RandomStringGenerator(this);
        }
    }

    /**
     * This method will generate a password depending the use* properties you
     * define. It will use the categories with a probability. It is not sure
     * that all of the defined categories will be used.
     *
     * @param length the length of the password you would like to generate.
     * @return a password that uses the categories you define when constructing
     * the object with a probability.
     */
    public String generate(int length) {
        String generatedPassword = "";
        int x = 1;
        while (x == 1) {
            // Argument Validation.
            if (length <= 0) {
                return "";
            }

            // Variables.
            StringBuilder password = new StringBuilder(length);
            Random random = new Random(System.nanoTime());

            // Collect the categories to use.
            List<String> charCategories = new ArrayList<>(4);
            if (useLower) {
                charCategories.add(LOWER);
            }
            if (useUpper) {
                charCategories.add(UPPER);
            }
            if (useDigits) {
                charCategories.add(DIGITS);
            }
            if (usePunctuation) {
                charCategories.add(PUNCTUATION);
            }

            // Build the password.
            for (int i = 0; i < length; i++) {
                String charCategory = charCategories.get(random.nextInt(charCategories.size()));
                int position = random.nextInt(charCategory.length());
                password.append(charCategory.charAt(position));

            }

            generatedPassword = new String(password);


            int[] hasLower = {0, 0};
            int[] hasUpper = {0, 0};
            int[] hasNumbers = {0, 0};
            int[] hasPunctuation = {0, 0};

            //check if generated password has a
            if (useLower) {
                for (int i = 0; i < generatedPassword.length(); i++) {
                    char ch = generatedPassword.charAt(i);
                    for (int j = 0; j < lowerChars.length; j++) {
                        if (lowerChars[j] == ch) {
                            hasLower[0] += 1;
                        } else {
                            hasLower[1] += 1;
                        }
                    }
                }
            }
            if (useUpper) {
                for (int i = 0; i < generatedPassword.length(); i++) {
                    char ch = generatedPassword.charAt(i);
                    for (int j = 0; j < upperChars.length; j++) {
                        if (upperChars[j] == ch) {
                            hasUpper[0] += 1;
                        } else {
                            hasUpper[1] += 1;
                        }
                    }
                }
            }
            if (usePunctuation) {
                for (int i = 0; i < generatedPassword.length(); i++) {
                    char ch = generatedPassword.charAt(i);
                    for (int j = 0; j < punctuationChars.length; j++) {
                        if (punctuationChars[j] == ch) {
                            hasPunctuation[0] += 1;
                        } else {
                            hasPunctuation[1] += 1;
                        }
                    }
                }
            }
            if (useDigits) {
                for (int i = 0; i < generatedPassword.length(); i++) {
                    char ch = generatedPassword.charAt(i);
                    for (int j = 0; j < digitsChars.length; j++) {
                        if (digitsChars[j] == ch) {
                            hasNumbers[0] += 1;
                        } else {
                            hasNumbers[1] += 1;
                        }
                    }
                }
            }

            boolean lowerCondition = false;
            boolean upperCondition = false;
            boolean numberCondition = false;
            boolean punctuationCondition = false;

            if (hasLower[0] == 0 && hasLower[1] == 0) {
                lowerCondition = true;
            } else if (hasLower[0] > 0) {
                lowerCondition = true;
            }
            if (hasUpper[0] == 0 && hasUpper[1] == 0) {
                upperCondition = true;
            } else if (hasUpper[0] > 0) {
                upperCondition = true;
            }
            if (hasNumbers[0] == 0 && hasNumbers[1] == 0) {
                numberCondition = true;
            } else if (hasNumbers[0] > 0) {
                numberCondition = true;
            }
            if (hasPunctuation[0] == 0 && hasPunctuation[1] == 0) {
                punctuationCondition = true;
            } else if (hasPunctuation[0] > 0) {
                punctuationCondition = true;
            }

            if (lowerCondition == true && numberCondition == true && punctuationCondition == true && upperCondition == true) {
                return generatedPassword;

            }
        }return generatedPassword;
    }


}


