package com.realbeauty.allie.domain;

import java.util.*;

public class TreatmentFactory {

	private static final List<Treatment> WAX_TREATMENTS = new ArrayList<Treatment>();
	static {
		WAX_TREATMENTS.add(new Wax("Full leg wax", Time._45, Price._25));
		WAX_TREATMENTS.add(new Wax("Half leg wax", Time._45, Price._20));
		WAX_TREATMENTS.add(new Wax("Full arm wax", Time._45, Price._15));
		WAX_TREATMENTS.add(new Wax("Underarm wax", Time._45, Price._10));
		WAX_TREATMENTS.add(new Wax("Bikini sides", Time._45, Price._15));
		WAX_TREATMENTS.add(new Wax("Bikini T-string", Time._45, Price._20));
		WAX_TREATMENTS.add(new Wax("Back/Chest wax", Time._45, Price._20));
		WAX_TREATMENTS.add(new Wax("Lip/Chin wax", Time._45, Price._8));
		WAX_TREATMENTS.add(new Wax("Eyebrow wax", Time._45, Price._8));
	}

	/**
	 * Note: Eye treats / eyelast perm require a 24hour patch test before the first treatment
	 * If you have had a tint before but not with me you must still have a patch test
	 */
	private static final List<Treatment> EYE_TREATMENTS = new ArrayList<Treatment>();
	static {
		EYE_TREATMENTS.add(new Eye("Eyelash tint", Time._30, Price._12));
		EYE_TREATMENTS.add(new Eye("Eyebrow tint", Time._15, Price._10));
		EYE_TREATMENTS.add(new Eye("Eyelash perm", Time._60, Price._40));
		EYE_TREATMENTS.add(new Eye("Eye treats combo", Time._45, Price._25));
	}
	private static final List<Treatment> MASSAGE_TREATMENTS = new ArrayList<Treatment>();
	static {
		MASSAGE_TREATMENTS.add(new Massage("Full body massage", Time._60, Price._50));
		MASSAGE_TREATMENTS.add(new Massage("Face, neck & shoulder", Time._30, Price._20));
		MASSAGE_TREATMENTS.add(new Massage("Back, neck & shoulder", Time._30, Price._30));
		MASSAGE_TREATMENTS.add(new Massage("Indian head massage", Time._45, Price._40));
	}

	/**
	 * Note: Book a party of 5 or more and each client receives 20% off of their tanning treatment
	 */
	private static final List<Treatment> TANNING_TREATMENTS = new ArrayList<Treatment>();
	static {
		TANNING_TREATMENTS.add(new Tan("Sienna x spray tan", Time._30, Price._20));
	}

	/**
	 * Note: Save £5 when you have a re-application treatment with your removal
	 */
	private static final List<Treatment> GELISH_NAIL_TREATMENTS = new ArrayList<Treatment>();
	static {
		GELISH_NAIL_TREATMENTS.add(new Nail("Gelish manicure", Time._60, Price._32));
		GELISH_NAIL_TREATMENTS.add(new Nail("Gelish pedicure", Time._75, Price._37));
		GELISH_NAIL_TREATMENTS.add(new Nail("File & Gelish fingers", Time._30, Price._22));
		GELISH_NAIL_TREATMENTS.add(new Nail("File & Gelish toes", Time._30, Price._27));
		GELISH_NAIL_TREATMENTS.add(new Nail("Gelish removal", Time._30, Price._12));
	}
	private static final List<Treatment> NAIL_TREATMENTS = new ArrayList<Treatment>();
	static {
		NAIL_TREATMENTS.add(new Nail("Indulgent manicure", Time._60, Price._32));
		NAIL_TREATMENTS.add(new Nail("Manicure", Time._45, Price._25));
		NAIL_TREATMENTS.add(new Nail("Indulgent Pedicure", Time._75, Price._37));
		NAIL_TREATMENTS.add(new Nail("Pedicure", Time._60, Price._30));
		NAIL_TREATMENTS.add(new Nail("File & Polish fingers", Time._30, Price._15));
		NAIL_TREATMENTS.add(new Nail("File & Polish toes", Time._30, Price._20));
	}

	/**
	 * Makeup is a passion of mine. Anybody can do it with a little guidance and knowledge behind them and a lesson is the perfect way to learn all my little tricks of the trade!
	 */
	private static final List<Treatment> MAKEUP_TREATMENTS = new ArrayList<Treatment>();
	static {
		MAKEUP_TREATMENTS.add(new Makeup("Daytime", Time._30, Price._25));
		MAKEUP_TREATMENTS.add(new Makeup("Evening", Time._45, Price._30));
		MAKEUP_TREATMENTS.add(new Makeup("Bridal with trial", Time._60, Price._50));
		MAKEUP_TREATMENTS.add(new Makeup("Makeup lesson", Time._75, Price._45));
	}

	/**
	 * 
	 * dermalogica Skin Treatments:
	 * 
	 * Each skin treatment will contain information and relaxation rolling in to one.
	 * A thorough cleanse including steam will prepare the skin for a stimulating and indulgent massage
	 * followed with producted suited to you, giving blanace to the skin with a fantastic glow.
	 * 
	 */
	private static final List<Treatment> SKIN_TREATMENTS = new ArrayList<Treatment>();
	static {
		SKIN_TREATMENTS
				.add(new Skin(
						"The dermalogica",
						Time._60,
						Price._40,
						"Perfect for beginners / clients new to skin treatments. It will treat all concerns that a normal skin has from a few blemishes to areas of redness and a touch of anti ageing."));
		SKIN_TREATMENTS
				.add(new Skin(
						"Age Smart multivitamin",
						Time._60,
						Price._45,
						"Designed for skin damaged from the sun, age and a little neglect over the years! Vitamins and lots of moisture will help to restore the elasticity and boost collagen."));
		SKIN_TREATMENTS
				.add(new Skin(
						"UltraCalming",
						Time._60,
						Price._45,
						"All skins can feel irritated at times but this skin treatment works deep into the layers of the skin to calm and sooth very aggravated skin leaving it cool and stronger against harmful irritants."));
		SKIN_TREATMENTS
				.add(new Skin(
						"MediBac Clearing",
						Time._60,
						Price._45,
						"Suited to very acne prone and congested skin. Some spot prone skin can be dry or red at times and this skin treatment will help with all these areas."));
		SKIN_TREATMENTS
				.add(new Skin(
						"Real Beauty's Signature",
						Time._90,
						Price._65,
						"Pure luxury, indulgence and total chill out in one treatment! If you love massage and care about your skin this is for you. With all the goodness of one of the above skin treatments, you will get a full back, neck and shoulder massage as well as your hands, feet and scalp."));
		SKIN_TREATMENTS.add(new Skin("MicroZone", Time._30, Price._25, "The quick fix! Allows plenty of time for the essentials in just 30 mins."));
	}

	public static final Map<String, List<Treatment>> ALL_TREATMENTS = new HashMap<String, List<Treatment>>();
	static {
		ALL_TREATMENTS.put("Waxing", WAX_TREATMENTS);
		ALL_TREATMENTS.put("Eye Treats", EYE_TREATMENTS);
		ALL_TREATMENTS.put("Massage", MASSAGE_TREATMENTS);
		ALL_TREATMENTS.put("Tanning", TANNING_TREATMENTS);
		ALL_TREATMENTS.put("Gelish Nails", GELISH_NAIL_TREATMENTS);
		ALL_TREATMENTS.put("Nails", NAIL_TREATMENTS);
		ALL_TREATMENTS.put("Makeup Style", MAKEUP_TREATMENTS);
		ALL_TREATMENTS.put("Demalogica Skin Treatments", SKIN_TREATMENTS);
	}

	public static final List<String> TITLES = new ArrayList<String>();
	static {
		TITLES.add("Waxing");
		TITLES.add("Eye Treats");
		TITLES.add("Massage");
		TITLES.add("Tanning");
		TITLES.add("Gelish Nails");
		TITLES.add("Nails");
		TITLES.add("Makeup Style");
		TITLES.add("Demalogica Skin");
	}
	public static final List<List<Treatment>> TREATMENTS = new ArrayList<List<Treatment>>();
	static {
		TREATMENTS.add(WAX_TREATMENTS);
		TREATMENTS.add(EYE_TREATMENTS);
		TREATMENTS.add(MASSAGE_TREATMENTS);
		TREATMENTS.add(TANNING_TREATMENTS);
		TREATMENTS.add(GELISH_NAIL_TREATMENTS);
		TREATMENTS.add(NAIL_TREATMENTS);
		TREATMENTS.add(MAKEUP_TREATMENTS);
		TREATMENTS.add(SKIN_TREATMENTS);
	}
}
