package com.xworkz.airport;

public class AirportImp implements AirportRules {

	@Override
	public boolean passengerCheck() {
		System.out.println("running passenger check");
		return true;
	}

	@Override
	public boolean luggageCheck() {
		System.out.println("running luggage check");
		return true;
	}

	@Override
	public boolean checkPassport() {
		System.out.println("running passport check");
		return true;
	}

	@Override
	public boolean checkBoardingPass() {
		System.out.println("running boarding pass check");
		return true;
	}

	@Override
	public float maxWeight() {
		System.out.println("running max weight");
		return 15f;
	}

	@Override
	public boolean checkForWeapons() {
		System.out.println("running weapon check");
		return true;
	}

	@Override
	public boolean checkForElectronics() {
		System.out.println("running electronics check");
		return false;
	}

	@Override
	public float importDuty() {
		System.out.println("running import duty");
		return 15.5f;
	}
	

	
	

}