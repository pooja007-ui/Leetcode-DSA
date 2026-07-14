class Solution {
    public double[] convertTemperature(double celsius) {
        double Kelvin = celsius + 273.15;
        double Farenhite = celsius * 1.80 + 32.00;   
        double [] ans = {Kelvin , Farenhite};
        return ans;
    }
}