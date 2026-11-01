package p067l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۗܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: QBI7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5543 extends AbstractC2860 {

    /* JADX INFO: renamed from: ᩹ */
    public static final C5543 f13368 = new C5543(0);

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ᩻ */
    public final String mo10336() {
        return ClassTransform.SHORT;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5543 m12238(int i) {
        short s = (short) i;
        if (s == i) {
            return new C5543(s);
        }
        throw new IllegalArgumentException(C20778.m46922(i, "bogus short value: "));
    }

    public final String toString() {
        int iMo4598 = mo4598();
        return "short{0x" + C16351.m37153(iMo4598) + " / " + iMo4598 + '}';
    }

    @Override // p067l.InterfaceC3830
    public final C9566 getType() {
        return C9566.f26305;
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        return Integer.toString(mo4598());
    }
}
