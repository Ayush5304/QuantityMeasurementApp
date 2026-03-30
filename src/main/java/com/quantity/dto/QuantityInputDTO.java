package com.quantity.dto;

public class QuantityInputDTO {

    private QuantityDTO quantity1;
    private QuantityDTO quantity2;

    public QuantityInputDTO() {
    }

	public QuantityDTO getQuantity1() {
		return quantity1;
	}

	public void setQuantity1(QuantityDTO quantity1) {
		this.quantity1 = quantity1;
	}

	public QuantityDTO getQuantity2() {
		return quantity2;
	}

	public void setQuantity2(QuantityDTO quantity2) {
		this.quantity2 = quantity2;
	}

	public QuantityInputDTO(QuantityDTO quantity1, QuantityDTO quantity2) {
		super();
		this.quantity1 = quantity1;
		this.quantity2 = quantity2;
	}
}
