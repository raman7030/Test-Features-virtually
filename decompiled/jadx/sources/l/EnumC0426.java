package l;

import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.֡۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9I7 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0426 {
    PRIMITIVE(0),
    CONSTRUCTED(32);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f1904;

    EnumC0426(int i) {
        this.f1904 = i;
    }

    public int getValue() {
        return this.f1904;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC0426 m1966(byte b) {
        if ((b & UTF8.S_CS3) == 0) {
            return PRIMITIVE;
        }
        return CONSTRUCTED;
    }
}
