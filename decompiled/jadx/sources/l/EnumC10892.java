package l;

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
public final class EnumC10892 {
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


    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC10892 f32734;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC10892 f32739 = new EnumC10892("7", 51, 0);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f32755;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f32756;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f32757;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public static final C4314 f32733 = new C4314();

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC10892 f32740 = values()[values().length - 1];

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public static final Map f32748 = new HashMap();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public char m27204() {
        return '$';
    }

    public static EnumC10892 valueOf(String str) {
        return (EnumC10892) Enum.valueOf(EnumC10892.class, str);
    }

    public static EnumC10892[] values() {
        return (EnumC10892[]) f32735.clone();
    }

    static {
        for (EnumC10892 enumC10892 : values()) {
            f32748.put(enumC10892.f32755, enumC10892);
        }
        Map map = f32748;
        map.put("1.5", JDK1_5);
        map.put("1.6", JDK1_6);
        map.put("1.7", JDK1_7);
        map.put("1.8", JDK1_8);
        map.put("1.9", JDK1_9);
        map.put("1.10", JDK1_10);
        f32734 = values()[values().length - 1];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC10892 m27201(C2903 c2903) {
        C4314 c4314 = f32733;
        EnumC10892 enumC10892M27200 = (EnumC10892) c2903.m8838(c4314);
        if (enumC10892M27200 == null) {
            String strM28825 = C11781.m28823(c2903).m28825(EnumC0121.f1205);
            if (strM28825 != null) {
                enumC10892M27200 = m27200(strM28825);
            }
            if (enumC10892M27200 == null) {
                enumC10892M27200 = f32734;
            }
            c2903.m8841(c4314, enumC10892M27200);
        }
        return enumC10892M27200;
    }

    public EnumC10892(String str, int i, int i2) {
        super(str, i);
        this.f32755 = str;
        this.f32756 = i;
        this.f32757 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC10892 m27200(String str) {
        return (EnumC10892) f32748.get(str);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean m27205() {
        return compareTo(f32739) >= 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m27207() {
        return compareTo(JDK1_8) >= 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean m27211() {
        return compareTo(JDK1_9) >= 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String m27208() {
        return Integer.toString((ordinal() - JDK1_1.ordinal()) + 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m27203() {
        return compareTo(JDK1_11) >= 0;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean m27209() {
        return compareTo(JDK1_11) >= 0;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean m27202() {
        return compareTo(JDK1_15) >= 0;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean m27206() {
        return compareTo(JDK1_11) >= 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean m27212() {
        return compareTo(JDK1_15) >= 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean m27210() {
        return compareTo(JDK1_17) >= 0;
    }
}
