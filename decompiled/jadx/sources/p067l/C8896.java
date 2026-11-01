package p067l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۜܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6BDA */
/* JADX INFO: loaded from: classes3.dex */
public final class C8896 extends AbstractC2860 {

    /* JADX INFO: renamed from: ᩹ */
    public static final C8896 f24110 = new C8896(0);

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ᩻ */
    public final String mo10336() {
        return ClassTransform.CHARACTER;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8896 m20501(int i) {
        char c = (char) i;
        if (c == i) {
            return new C8896(c);
        }
        throw new IllegalArgumentException(C20778.m46922(i, "bogus char value: "));
    }

    public final String toString() {
        int iMo4598 = mo4598();
        return "char{0x" + C16351.m37153(iMo4598) + " / " + iMo4598 + '}';
    }

    @Override // p067l.InterfaceC3830
    public final C9566 getType() {
        return C9566.f26301;
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        return Integer.toString(mo4598());
    }
}
