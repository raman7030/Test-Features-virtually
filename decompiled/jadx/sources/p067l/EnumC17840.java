package p067l;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.agreement.srp.SRP6StandardGroups;

/* JADX INFO: renamed from: l.ܽ֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M4ER */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC17840 {
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


    /* JADX INFO: renamed from: ۜ֫ */
    public static final EnumC17840 f53220;

    /* JADX INFO: renamed from: ᩶ */
    public static final EnumC17840 f53233;

    /* JADX INFO: renamed from: ᩻֫ */
    public static final EnumC17840 f53237;

    /* JADX INFO: renamed from: ᩸ */
    public final String f53238;

    /* JADX INFO: renamed from: ᩷֫ */
    public static final C6468 f53234 = new C6468();

    /* JADX INFO: renamed from: ۢ֫ */
    public static final Map f53222 = new HashMap();

    static {
        for (EnumC17840 enumC17840 : values()) {
            f53222.put(enumC17840.f53238, enumC17840);
        }
        Map map = f53222;
        map.put("1.5", JDK5);
        map.put("1.6", JDK6);
        EnumC17840 enumC17841 = JDK7;
        map.put("1.7", enumC17841);
        map.put("1.8", JDK8);
        map.put("1.9", JDK9);
        map.put("1.10", JDK10);
        f53220 = enumC17841;
        EnumC17840 enumC17842 = values()[values().length - 1];
        f53237 = enumC17842;
        f53233 = enumC17842;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC17840 m40515(C5127 c5127) {
        C6468 c6468 = f53234;
        EnumC17840 enumC17840M40514 = (EnumC17840) c5127.m10905(c6468);
        if (enumC17840M40514 == null) {
            String strM30873 = C13565.m30871(c5127).m30873(EnumC2483.f3904);
            if (strM30873 != null) {
                enumC17840M40514 = m40514(strM30873);
            }
            if (enumC17840M40514 == null) {
                enumC17840M40514 = f53233;
            }
            c5127.m10908(c6468, enumC17840M40514);
        }
        return enumC17840M40514;
    }

    EnumC17840(String str) {
        this.f53238 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC17840 m40514(String str) {
        return (EnumC17840) f53222.get(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m40518() {
        return compareTo(f53220) >= 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public EnumC12720 m40519() {
        switch (ordinal()) {
            case 2:
                return EnumC12720.JDK1_4;
            case 3:
                return EnumC12720.JDK1_5;
            case 4:
                return EnumC12720.JDK1_6;
            case 5:
                return EnumC12720.JDK1_7;
            case 6:
                return EnumC12720.JDK1_8;
            case 7:
                return EnumC12720.JDK1_9;
            case 8:
                return EnumC12720.JDK1_10;
            case 9:
                return EnumC12720.JDK1_11;
            case 10:
                return EnumC12720.JDK1_12;
            case 11:
                return EnumC12720.JDK1_13;
            case 12:
                return EnumC12720.JDK1_14;
            case 13:
                return EnumC12720.JDK1_15;
            case 14:
                return EnumC12720.JDK1_16;
            case 15:
                return EnumC12720.JDK1_17;
            default:
                return EnumC12720.JDK1_1;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC5698 m40513(EnumC17840 enumC17840) {
        switch (enumC17840) {
            case JDK1_2:
                return EnumC5698.RELEASE_2;
            case JDK1_3:
                return EnumC5698.RELEASE_3;
            case JDK1_4:
                return EnumC5698.RELEASE_4;
            case JDK5:
                return EnumC5698.RELEASE_5;
            case JDK6:
                return EnumC5698.RELEASE_6;
            case JDK7:
                return EnumC5698.RELEASE_7;
            case JDK8:
                return EnumC5698.RELEASE_8;
            case JDK9:
                return EnumC5698.RELEASE_9;
            case JDK10:
                return EnumC5698.RELEASE_10;
            case JDK11:
                return EnumC5698.RELEASE_11;
            case JDK12:
                return EnumC5698.RELEASE_12;
            case JDK13:
                return EnumC5698.RELEASE_13;
            case JDK14:
                return EnumC5698.RELEASE_14;
            case JDK15:
                return EnumC5698.RELEASE_15;
            case JDK16:
                return EnumC5698.RELEASE_16;
            case JDK17:
                return EnumC5698.RELEASE_17;
            default:
                return null;
        }
    }
}
