package p067l;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.agreement.srp.SRP6StandardGroups;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v6 l.ۧۡ۠, still in use, count: 1, list:
  (r0v6 l.ۧۡ۠) from 0x0121: SPUT (r0v6 l.ۧۡ۠) (LINE:104) l.ۧۡ۠.ۡ֫ l.ۧۡ۠
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.ۧۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: F45A */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC12720 {
    JDK1_1("1.1", 45, 3),
    JDK1_2("1.2", 46, 0),
    JDK1_3("1.3", 47, 0),
    JDK1_4("1.4", 48, 0),
    JDK1_5("5", 49, 0),
    JDK1_6("6", 50, 0),
    JDK1_7("7", 51, 0),
    JDK1_8("8", 52, 0),
    JDK1_9("9", 53, 0),
    JDK1_10("10", 54, 0),
    JDK1_11("11", 55, 0),
    JDK1_12("12", 56, 0),
    JDK1_13(SRP6StandardGroups.rfc5054_8192_g, 57, 0),
    JDK1_14("14", 58, 0),
    JDK1_15("15", 59, 0),
    JDK1_16("16", 60, 0),
    JDK1_17("17", 61, 0);


    /* JADX INFO: renamed from: ۗ */
    public static final EnumC12720 f35712;

    /* JADX INFO: renamed from: ۡ֫ */
    public static final EnumC12720 f35717 = new EnumC12720("7", 51, 0);

    /* JADX INFO: renamed from: ᩶ */
    public final String f35733;

    /* JADX INFO: renamed from: ᩸ */
    public final int f35734;

    /* JADX INFO: renamed from: ᩹ */
    public final int f35735;

    /* JADX INFO: renamed from: ۖ֫ */
    public static final C6468 f35711 = new C6468();

    /* JADX INFO: renamed from: ۢ֫ */
    public static final EnumC12720 f35718 = values()[values().length - 1];

    /* JADX INFO: renamed from: ܺ֫ */
    public static final Map f35726 = new HashMap();

    /* JADX INFO: renamed from: ۚ */
    public char m29249() {
        return '$';
    }

    public static EnumC12720 valueOf(String str) {
        return (EnumC12720) Enum.valueOf(EnumC12720.class, str);
    }

    public static EnumC12720[] values() {
        return (EnumC12720[]) f35713.clone();
    }

    static {
        for (EnumC12720 enumC12720 : values()) {
            f35726.put(enumC12720.f35733, enumC12720);
        }
        Map map = f35726;
        map.put("1.5", JDK1_5);
        map.put("1.6", JDK1_6);
        map.put("1.7", JDK1_7);
        map.put("1.8", JDK1_8);
        map.put("1.9", JDK1_9);
        map.put("1.10", JDK1_10);
        f35712 = values()[values().length - 1];
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC12720 m29246(C5127 c5127) {
        C6468 c6468 = f35711;
        EnumC12720 enumC12720M29245 = (EnumC12720) c5127.m10905(c6468);
        if (enumC12720M29245 == null) {
            String strM30873 = C13565.m30871(c5127).m30873(EnumC2483.f3981);
            if (strM30873 != null) {
                enumC12720M29245 = m29245(strM30873);
            }
            if (enumC12720M29245 == null) {
                enumC12720M29245 = f35712;
            }
            c5127.m10908(c6468, enumC12720M29245);
        }
        return enumC12720M29245;
    }

    public EnumC12720(String str, int i, int i2) {
        super(str, i);
        this.f35733 = str;
        this.f35734 = i;
        this.f35735 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC12720 m29245(String str) {
        return (EnumC12720) f35726.get(str);
    }

    /* JADX INFO: renamed from: ۡ */
    public boolean m29250() {
        return compareTo(f35717) >= 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean m29252() {
        return compareTo(JDK1_8) >= 0;
    }

    /* JADX INFO: renamed from: ᩷ */
    public boolean m29256() {
        return compareTo(JDK1_9) >= 0;
    }

    /* JADX INFO: renamed from: ܺ */
    public String m29253() {
        return Integer.toString((ordinal() - JDK1_1.ordinal()) + 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m29248() {
        return compareTo(JDK1_11) >= 0;
    }

    /* JADX INFO: renamed from: ܿ */
    public boolean m29254() {
        return compareTo(JDK1_11) >= 0;
    }

    /* JADX INFO: renamed from: ֡ */
    public boolean m29247() {
        return compareTo(JDK1_15) >= 0;
    }

    /* JADX INFO: renamed from: ۢ */
    public boolean m29251() {
        return compareTo(JDK1_11) >= 0;
    }

    /* JADX INFO: renamed from: ᩻ */
    public boolean m29257() {
        return compareTo(JDK1_15) >= 0;
    }

    /* JADX INFO: renamed from: ᩴ */
    public boolean m29255() {
        return compareTo(JDK1_17) >= 0;
    }
}
