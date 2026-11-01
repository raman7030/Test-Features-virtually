package p067l;

import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩻ۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X9Q3 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC24866 {
    Array('[', Name.REFER, 1),
    Boolean('Z', ClassTransform.BOOLEAN, 1),
    Byte('B', ClassTransform.BYTE, 1),
    Char('C', ClassTransform.CHARACTER, 1),
    Double('D', ClassTransform.DOUBLE, 2),
    Float('F', ClassTransform.FLOAT, 1),
    Int('I', ClassTransform.INTEGER, 1),
    LReference('L', Name.REFER, 1),
    Long('J', ClassTransform.LONG, 2),
    QReference('Q', Name.REFER, 1),
    Short('S', ClassTransform.SHORT, 1);


    /* JADX INFO: renamed from: ᩶ */
    public final String f79447;

    /* JADX INFO: renamed from: ᩸ */
    public final int f79448;

    /* JADX INFO: renamed from: ᩹ */
    public final char f79449;

    EnumC24866(char c, String str, int i) {
        this.f79449 = c;
        this.f79447 = str;
        this.f79448 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC24866 m54622(char c) {
        for (EnumC24866 enumC24866 : values()) {
            if (enumC24866.f79449 == c) {
                return enumC24866;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public int m54624() {
        return this.f79448;
    }
}
