package p067l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܿܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: BBB6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18954 extends AbstractC2860 {

    /* JADX INFO: renamed from: ᩹ */
    public static final C18954 f56499 = new C18954(0);

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ᩻ */
    public final String mo10336() {
        return ClassTransform.BYTE;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18954 m43081(int i) {
        byte b = (byte) i;
        if (b == i) {
            return new C18954(b);
        }
        throw new IllegalArgumentException(C20778.m46922(i, "bogus byte value: "));
    }

    public final String toString() {
        int iMo4598 = mo4598();
        return "byte{0x" + C16351.m37152(iMo4598) + " / " + iMo4598 + '}';
    }

    @Override // p067l.InterfaceC3830
    public final C9566 getType() {
        return C9566.f26335;
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        return Integer.toString(mo4598());
    }
}
