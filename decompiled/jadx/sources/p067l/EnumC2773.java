package p067l;

import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.֡۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9I7 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC2773 {
    PRIMITIVE(0),
    CONSTRUCTED(32);


    /* JADX INFO: renamed from: ᩸ */
    public int f4680;

    EnumC2773(int i) {
        this.f4680 = i;
    }

    public int getValue() {
        return this.f4680;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC2773 m4342(byte b) {
        if ((b & UTF8.S_CS3) == 0) {
            return PRIMITIVE;
        }
        return CONSTRUCTED;
    }
}
