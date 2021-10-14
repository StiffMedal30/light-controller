package za.co.dotze.lightcontroller.dto;

public class LightResponseDto {
    private Integer statusCode;


    public Integer getStatusCode() {
        return statusCode;
    }

    public LightResponseDto setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
