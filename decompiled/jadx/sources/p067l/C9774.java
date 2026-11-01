package p067l;

/* JADX INFO: renamed from: l.۟᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M1RW */
/* JADX INFO: loaded from: classes4.dex */
public final class C9774 extends AbstractC24526 {

    /* JADX INFO: renamed from: ֫ */
    public final C12655 f27002;

    /* JADX INFO: renamed from: ۧ */
    public final byte[] f27003;

    public C9774(C12655 c12655) {
        byte[] bArr = new byte[1];
        this.f27003 = bArr;
        if (c12655.m29111() == 0) {
            bArr[0] = 0;
        } else {
            bArr[0] = (byte) (AbstractC5002.m10611(Math.max(c12655.m29112(), 4096) - 1) - 23);
        }
        this.f27002 = (C12655) c12655.clone();
    }

    /* JADX INFO: renamed from: ܿ */
    public final byte[] m22803() {
        return this.f27003;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8433 m22802(AbstractC8433 abstractC8433, C6422 c6422) {
        return this.f27002.m29108(abstractC8433, c6422);
    }
}
