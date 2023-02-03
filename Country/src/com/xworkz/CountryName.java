package com.xworkz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lombok.ToString;

@ToString
public class CountryName {

	public static void main(String[] args) {
		List<String> country = new LinkedList<String>();
		country.add("India");
		country.add("China");
		country.add("United States");
		country.add("Indonesia");
		country.add("Pakistan");
		country.add("Brazil");
		country.add("Nigeria");
		country.add("Bangladesh");
		country.add("Russia");
		country.add("Mexico");
		country.add("Japan");
		country.add("Egypt");
		country.add("Vietnam");
		country.add("DR Congo");
		country.add("Turkey");
		country.add("Iran");
		country.add("Germany");
		country.add("Thailand");
		country.add("United Kingdom");
		country.add("France");
		country.add("Italy");
		country.add("Tanzania");
		country.add("South Africa");
		country.add("Myanmar");
		country.add("Kenya");
		country.add("South Korea");
		country.add("Colombia");
		country.add("Spain");
		country.add("Uganda");
		country.add("Argentina");
		country.add("Algeria");
		country.add("Sudan");
		country.add("Ukraine");
		country.add("Iraq");
		country.add("Poland");
		country.add("Canada");
		country.add("Morocco");
		country.add("Saudi Arabia");
		country.add("Uzbekistan");
		country.add("Peru");
		country.add("Angola");
		country.add("Angola");
		country.add("Mozambique");
		country.add("Ghana");
		country.add("Yemen");
		country.add("Nepal");
		country.add("Venezuela");
		country.add("Madagascar");
		country.add("Cameroon");
		country.add("Côte d'Ivoire");
		country.add("North Korea");
		country.add("Australia");
		country.add("Niger");
		country.add("Sri Lanka");
		country.add("Burkina Faso");
		country.add("Mali");
		country.add("Romania");
		country.add("Malawi");
		country.add("Chile");
		country.add("Kazakhstan");
		country.add("Zambia");
		country.add("Guatemala");
		country.add("Ecuador");
		country.add("Syria");
		country.add("Netherlands");
		country.add("Senegal");
		country.add("Cambodia");
		country.add("Chad");
		country.add("Somalia");
		country.add("Zimbabwe");
		country.add("Guinea");
		country.add("Rwanda");
		country.add("Benin");
		country.add("Burundi");
		country.add("Tunisia");
		country.add("Bolivia");
		country.add("Belgium");
		country.add("Haiti");
		country.add("Cuba");
		country.add("South Sudan");
		country.add("Dominican Republic");
		country.add("Czech Republic");
		country.add("Greece");
		country.add("Jordan");
		country.add("Portugal");
		country.add("Azerbaijan");
		country.add("Sweden");
		country.add("Honduras");
		country.add("United Arab Emirates");
		country.add("Hungary");
		country.add("Tajikistan");
		country.add("Belarus");
		country.add("Austria");
		country.add("Papua New Guinea");
		country.add("Serbia");
		country.add("Israel");
		country.add("Switzerland");
		country.add("Togo");
		country.add("Sierra Leone");
		country.add("Laos");
		country.add("Paraguay");
		country.add("Bulgaria");
		country.add("Libya");
		country.add("Lebanon");
		country.add("Kyrgyzstan");
		country.add("El Salvador");
		country.add("Turkmenistan");
		country.add("Singapore");
		country.add("Denmark");
		country.add("Finland");
		country.add("Congo");
		country.add("Slovakia");
		country.add("Norway");
		country.add("Oman");
		country.add("State of Palestine");
		country.add("Costa Rica");
		country.add("Liberia");
		country.add("Ireland");
		country.add("Central African Republic");
		country.add("New Zealand");
		country.add("Mauritania");
		country.add("Panama");
		country.add("Kuwait");
		country.add("Croatia");
		country.add("Moldova");
		country.add("Georgia");
		country.add("Eritrea");
		country.add("Uruguay");
		country.add("Bosnia and Herzegovina");
		country.add("Mongolia");
		country.add("Armenia");
		country.add("Jamaica");
		country.add("Qatar");
		country.add("Albania");
		country.add("Lithuania");
		country.add("Namibia");
		country.add("Gambia");
		country.add("Botswana");
		country.add("Gabon");
		country.add("Lesotho");
		country.add("North Macedonia");
		country.add("Slovenia");
		country.add("Guinea-Bissau");
		country.add("Latvia");
		country.add("Bahrain");
		country.add("Equatorial Guinea");
		country.add("Trinidad and Tobago");
		country.add("Estonia");
		country.add("Timor-Leste");
		country.add("Mauritius");
		country.add("Cyprus");
		country.add("Eswatini");
		country.add("Djibouti");
		country.add("Fiji");
		country.add("Comoros");
		country.add("Guyana");
		country.add("Bhutan");
		country.add("Solomon Islands");
		country.add("Montenegro");
		country.add("Luxembourg");
		country.add("Suriname");
		country.add("Cabo Verde");
		country.add("Micronesia");
		country.add("Maldives");
		country.add("Malta");
		country.add("Brunei");
		country.add("Belize");
		country.add("Bahamas");
		country.add("Iceland");
		country.add("Vanuatu");
		country.add("Barbados");
		country.add("Sao Tome & Principe");
		country.add("Samoa");
		country.add("Saint Lucia");
		country.add("Kiribati");
		country.add("Grenada");
		country.add("St. Vincent & Grenadines");
		country.add("Tonga");
		country.add("Seychelles");
		country.add("Antigua and Barbuda");
		country.add("Andorra");
		country.add("Dominica");
		country.add("Marshall Islands");
		country.add("Saint Kitts & Nevis");
		country.add("Monaco");
		country.add("Liechtenstein");
		country.add("San Marino");
		country.add("Palau");
		country.add("Tuvalu");
		country.add("Nauru");
		country.add("Holy See");

		Predicate<String> predicate = (string) -> {
			return string.endsWith("a");
		};

		List<String> result = country.stream().filter(predicate).collect(Collectors.toList());

		System.out.println(result);

		System.out.println("*****************************country name end with a *******************************");
		Comparator<String> desc = (a1, a2) -> {
			return a2.compareTo(a1);
		};

		Collections.sort(result, desc);
		for (String string : result) {
			System.out.println(string);
		}

		List<String> primeMinisterName = new LinkedList<String>();
		primeMinisterName.add("Jawaharlal Nehru");
		primeMinisterName.add("Gulzarilal Nanda");
		primeMinisterName.add("Lal Bahadur Shastri");
		primeMinisterName.add("Gulzarilal Nanda");
		primeMinisterName.add("Indira Gandhi");
		primeMinisterName.add("Morarji Desai");
		primeMinisterName.add("Charan Singh");
		primeMinisterName.add("Indira Gandhi");
		primeMinisterName.add("Rajiv Gandhi");
		primeMinisterName.add("Vishwanath Pratap Singh");
		primeMinisterName.add("Chandra Shekhar");
		primeMinisterName.add("P. V. Narasimha Rao");
		primeMinisterName.add("Atal Bihari Vajpayee");
		primeMinisterName.add("H. D. Deve Gowda");
		primeMinisterName.add("Inder Kumar Gujral");
		primeMinisterName.add("Manmohan Singh");
		primeMinisterName.add("Narendra Modi");

		Predicate<String> predicate1 = (string) -> {
			return string.startsWith("N");
		};

		List<String> result1 = primeMinisterName.stream().filter(predicate1).collect(Collectors.toList());

		System.out.println(result1);

		System.out.println(
				"*****************************prime minister name start with n **********************************");
		Comparator<String> Desc1 = (a1, a2) -> {
			return a2.compareTo(a1);
		};

		Collections.sort(result1, Desc1);
		for (String temp1 : result1) {
			System.out.println(temp1);
		}

		List<String> actor = new LinkedList<String>();
		actor.add("Amitabh Bachchan");
		actor.add("Shah Rukh Khan");
		actor.add("Aamir Khan");
		actor.add("Salman Khan");
		actor.add("Amrish Puri");
		actor.add("Ranbir Kapoor");
		actor.add("Sanjay Dutt");
		actor.add("Farhan Akhtar");
		actor.add("Irrfan Khan");
		actor.add("Ajay Devgn");
		actor.add("Nana Patekar");
		actor.add("Boman Irani");
		actor.add("Anupam Kher");
		actor.add("Akshay Kumar");
		actor.add("Hrithik Roshan");
		actor.add("Abhay Deol");
		actor.add("Manoj Bajpayee");
		actor.add("Anil Kapoor");
		actor.add("Saif Ali Khan");
		actor.add("Om Puri");
		actor.add("Rajpal Naurang Yadav");
		actor.add("Paresh Rawal");
		actor.add("Randeep Hooda");
		actor.add("Johny Lever");
		actor.add("Emraan Hashmi");
		actor.add("Sunny Deol");
		actor.add("John Abraham");
		actor.add("Imran Khan");
		actor.add("Govinda");

		Predicate<String> predicate2 = (string) -> {
			return string.contains("ma");
		};

		List<String> result2 = actor.stream().filter(predicate2).collect(Collectors.toList());
		for (String temp2 : result2) {
			System.out.println(temp2);

		}

		System.out.println(result2);

		System.out.println("*****************************actor name contains ma *************************************");
		Comparator<String> desc2 = (a1, a2) -> {
			return a2.compareTo(a1);
		};

		Collections.sort(result2, desc2);
		for (String temp2 : result2) {
			System.out.println(temp2);
		}
		List<String> player = new LinkedList<String>();
		player.add("Virat Kohli");
		player.add("Glenn Maxwell");
		player.add("Mohammed Siraj");
		player.add("Harshal Patel");
		player.add("du Plessis");
		player.add("Wanindu Hasaranga");
		player.add("Dinesh Karthik");
		player.add("Josh Hazlewood");
		player.add("Shahbaz Ahmad");
		player.add("Anuj Rawat");
		player.add("Akash Deep");
		player.add("Mahipal Lomror");
		player.add("Finn Allen");
		player.add("Sherfane Rutherford");
		player.add("Jason Behrendorff");
		player.add("Suyash Prabhudessai");
		player.add("Chama Milind");
		player.add("Aneeshwar Gautam");
		player.add("Karn Sharma");
		player.add("Siddharth Kaul");
		player.add("Rajat Patidar");
		player.add("David Willey");

		/*
		 * Predicate<String> predicate3 = (string) -> { return };
		 */

		List<String> result3 = player.stream().filter(s -> !s.startsWith("S")).collect(Collectors.toList());

		System.out.println(result3);

		System.out.println("******************************************************************");
		Comparator<String> Desc3 = (p1, p2) -> {
			return p2.compareTo(p1);
		};

		Collections.sort(result1, Desc3);
		for (String temp3 : result3) {
			System.out.println(temp3);
		}

		List<String> award = new LinkedList<String>();
		award.add("Guru Kelu Charan Mohapatra");
		award.add("Shri Manoj Das");
		award.add("Ms. Tulasi Munda");
		award.add("Shri Gopal Chhotray");
		award.add("Dr. Sitakanta Mohapatra");
		award.add("Prof Gopal Chandra Mitra");
		award.add("Shri Maguni Das");
		award.add("Shri Manoranjan Das");
		award.add("Shri Dillip Tirkey");
		award.add("Shri Nalini Ranjan Mohanty");
		award.add("Smt Kumkum Mohanty");
		award.add("Chaturbhua meher");
		award.add("Ms. Gladys June Stains");
		award.add("Shri Ramakanta Rath");
		award.add("Dr. Smt Ilena Citaristi");
		award.add("Guru shyama charan pati");
		award.add("Dr. Ghansyam Mishra");
		award.add("Dr. Prativa Ray");
		award.add("Shri Rabinarayan Bastia");
		award.add("Shri Gangadhar Pradhan");
		award.add("Dr.Srinivas Udgata");
		award.add("Smt Jayanta Mahapatra");
		award.add("Pandit Raghunath Panigrahi");
		award.add("Prof Dr. Herman Kulke");
		award.add("Shri Ignace Tirkey");
		award.add("Guru Mayadhar Rout");
		award.add("Dr. Sitakanta Mahapatra");
		award.add("Dr. Minati Mishra");
		award.add("Sri Raghunath Mohapatra");
		award.add("Sri Kailash Chandra Meher");
		award.add("Dr. Taraprasad Dash");
		award.add("Dr. Sudarshan Pattnaik");

		/*
		 * Predicate<String> predicate4 = (string) -> { return string.("S"); };
		 */

		List<String> result4 = award.stream().filter(s -> !s.startsWith("S")).collect(Collectors.toList());

		System.out.println(result1);

		System.out.println("******************************************************************");
		Comparator<String> Desc4 = (a1, a2) -> {
			return a2.compareTo(a1);
		};

		Collections.sort(result4, Desc4);
		for (String temp4 : result4) {
			System.out.println(temp4);
		}

		List<Integer> age = new ArrayList<Integer>();
		age.add(23);
		age.add(25);
		age.add(22);
		age.add(22);
		age.add(22);
		age.add(24);
		age.add(25);
		age.add(23);
		age.add(22);
		age.add(25);
		age.add(22);
		age.add(25);
		age.add(24);
		age.add(26);
		age.add(25);
		age.add(25);
		age.add(24);
		age.add(23);
		age.add(23);
		age.add(28);
		age.add(25);
		age.add(23);
		age.add(24);

		System.out.println("~~~~~~~Age greater than 20~~~~~~~~~");

		List<Integer> temp6 = age.stream().filter(i -> i > 20).collect(Collectors.toList());
		Comparator<Integer> comp6 = (a1, a2) -> {
			return a2.compareTo(a1);
		};
		Collections.sort(temp6, comp6);
		for (Integer integer : temp6) {
			System.out.println(integer);
		}

		System.out.println("~~~~~~Age greater than 22 and less than 30~~~~~~~~");

		List<Integer> temp7 = age.stream().filter(i -> i > 22 && i < 30).collect(Collectors.toList());
		Comparator<Integer> comp7 = (a1, a2) -> {
			return a2.compareTo(a1);
		};
		Collections.sort(temp7, comp7);
		for (Integer integer : temp7) {
			System.out.println(integer);
		}

	}
}
