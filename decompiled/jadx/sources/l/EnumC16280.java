package l;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.agreement.srp.SRP6StandardGroups;

/* JADX INFO: renamed from: l.ܽ֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M4ER */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC16280 {
    JDK1_2("1.2"),
    JDK1_3("1.3"),
    JDK1_4("1.4"),
    JDK5("5"),
    JDK6("6"),
    JDK7("7"),
    JDK8("8"),
    JDK9("9"),
    JDK10("10"),
    JDK11("11"),
    JDK12("12"),
    JDK13(SRP6StandardGroups.rfc5054_8192_g),
    JDK14("14"),
    JDK15("15"),
    JDK16("16"),
    JDK17("17");


    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC16280 f50053;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC16280 f50066;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final EnumC16280 f50070;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f50071;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public static final C4314 f50067 = new C4314();

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static final Map f50055 = new HashMap();

    static {
        for (EnumC16280 enumC16280 : values()) {
            f50055.put(enumC16280.f50071, enumC16280);
        }
        Map map = f50055;
        map.put("1.5", JDK5);
        map.put("1.6", JDK6);
        EnumC16280 enumC16281 = JDK7;
        map.put("1.7", enumC16281);
        map.put("1.8", JDK8);
        map.put("1.9", JDK9);
        map.put("1.10", JDK10);
        f50053 = enumC16281;
        EnumC16280 enumC16282 = values()[values().length - 1];
        f50070 = enumC16282;
        f50066 = enumC16282;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC16280 m38301(C2903 c2903) {
        C4314 c4314 = f50067;
        EnumC16280 enumC16280M38300 = (EnumC16280) c2903.m8838(c4314);
        if (enumC16280M38300 == null) {
            String strM28825 = C11781.m28823(c2903).m28825(EnumC0121.f1128);
            if (strM28825 != null) {
                enumC16280M38300 = m38300(strM28825);
            }
            if (enumC16280M38300 == null) {
                enumC16280M38300 = f50066;
            }
            c2903.m8841(c4314, enumC16280M38300);
        }
        return enumC16280M38300;
    }

    EnumC16280(String str) {
        this.f50071 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC16280 m38300(String str) {
        return (EnumC16280) f50055.get(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m38304() {
        return compareTo(f50053) >= 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public EnumC10892 m38305() {
        switch (ordinal()) {
            case 2:
                return EnumC10892.JDK1_4;
            case 3:
                return EnumC10892.JDK1_5;
            case 4:
                return EnumC10892.JDK1_6;
            case 5:
                return EnumC10892.JDK1_7;
            case 6:
                return EnumC10892.JDK1_8;
            case 7:
                return EnumC10892.JDK1_9;
            case 8:
                return EnumC10892.JDK1_10;
            case 9:
                return EnumC10892.JDK1_11;
            case 10:
                return EnumC10892.JDK1_12;
            case 11:
                return EnumC10892.JDK1_13;
            case 12:
                return EnumC10892.JDK1_14;
            case 13:
                return EnumC10892.JDK1_15;
            case 14:
                return EnumC10892.JDK1_16;
            case 15:
                return EnumC10892.JDK1_17;
            default:
                return EnumC10892.JDK1_1;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC3503 m38299(EnumC16280 enumC16280) {
        switch (enumC16280) {
            case JDK1_2:
                return EnumC3503.RELEASE_2;
            case JDK1_3:
                return EnumC3503.RELEASE_3;
            case JDK1_4:
                return EnumC3503.RELEASE_4;
            case JDK5:
                return EnumC3503.RELEASE_5;
            case JDK6:
                return EnumC3503.RELEASE_6;
            case JDK7:
                return EnumC3503.RELEASE_7;
            case JDK8:
                return EnumC3503.RELEASE_8;
            case JDK9:
                return EnumC3503.RELEASE_9;
            case JDK10:
                return EnumC3503.RELEASE_10;
            case JDK11:
                return EnumC3503.RELEASE_11;
            case JDK12:
                return EnumC3503.RELEASE_12;
            case JDK13:
                return EnumC3503.RELEASE_13;
            case JDK14:
                return EnumC3503.RELEASE_14;
            case JDK15:
                return EnumC3503.RELEASE_15;
            case JDK16:
                return EnumC3503.RELEASE_16;
            case JDK17:
                return EnumC3503.RELEASE_17;
            default:
                return null;
        }
    }
}
