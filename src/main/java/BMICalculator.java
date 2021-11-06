/*

Name: Cornelia Krautstingl
Email: s44784@edu.campus02.at
Matrikel-Number: 52010893

 */


public class BMICalculator {

    private String firstname;
    private String lastname;
    private char gender;
    private int bodyHeight;
    private double bodyWeight;

    // TODO: Implement Constructor

    public BMICalculator(String firstname, String lastname, char gender, int bodyHeight, double bodyWeight) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.bodyHeight = bodyHeight;
        this.bodyWeight = bodyWeight;
    }

    // TODO: Implement getter/setter

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public char getGender() {
        return gender;
    }

    public int getBodyHeight() {
        return bodyHeight;
    }

    public double getBodyWeight() {
        return bodyWeight;
    }

    public void setBodyHeight(int bodyHeight) {
        this.bodyHeight = bodyHeight;
    }

    public void setBodyWeight(double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    private double round(double value) {
        return Math.round(value * 100) / 100D;
    }

    public double calculateBMI() {
        // TODO: Your implementation

        double BMI = bodyHeight / (bodyHeight / 100) * (bodyHeight / 100);
        return BMI;
    }

    public int calculateBMICategory() {
        // TODO: Your implementation
        if ((calculateBMI() < 16.0 && getGender() == 'm') || (calculateBMI() < 15.0 && getGender() == 'w')) {
            return -2;
        } else if ((calculateBMI() >= 16.0 && calculateBMI() <= 18.4 && getGender() == 'm') ||
                ((calculateBMI() >= 15.0 && calculateBMI() <= 17.4 && getGender() == 'w')) {
            return -1;
        }

            else if ((calculateBMI() >= 18.5 && calculateBMI() <= 24.9) && getGender() == 'm') ||
        ((calculateBMI() >= 17.5 && calculateBMI() <= 23.9) && getGender() == 'w') {
            return 0;
        }

              else if ((calculateBMI() >= 25.0 && calculateBMI() <= 34.9) && getGender() == 'm') ||
        ((calculateBMI() >= 24.0 && calculateBMI() <= 33.9) || getGender() == 'w') {
            return 1;
        }
                            else if ((calculateBMI() >= 35.0 && getGender() == 'm')) ||
        ((calculateBMI() >= 34.0 && getGender() == 'w')) {
            return 2;
        }
    }

    public String getBMICategoryName() {
        // TODO: Your implementation
        return "";
    }

}
