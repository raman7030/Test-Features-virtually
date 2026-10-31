package l;

import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩻ۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X9Q3 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC23672 {
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


    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f76697;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f76698;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final char f76699;

    EnumC23672(char c, String str, int i) {
        this.f76699 = c;
        this.f76697 = str;
        this.f76698 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC23672 m52219(char c) {
        for (EnumC23672 enumC23672 : values()) {
            if (enumC23672.f76699 == c) {
                return enumC23672;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m52221() {
        return this.f76698;
    }
}
