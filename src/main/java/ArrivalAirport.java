public enum ArrivalAirport {
    EDI,
    GLA,
    SEA,
    YVR,
    LHR;

    private String arrivalAirportCode;

    ArrivalAirport(String arrivalAirportCode) {
        this.arrivalAirportCode = arrivalAirportCode;
    }
}
