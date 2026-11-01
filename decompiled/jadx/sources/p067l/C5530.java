package p067l;

/* JADX INFO: renamed from: l.ۗܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 37T7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5530 extends AbstractC3726 {
    @Override // p067l.AbstractC3726
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ long mo7175(Object obj) {
        return 0L;
    }

    @Override // p067l.AbstractC3726
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ void mo7178(long j, Object obj) {
    }

    @Override // p067l.AbstractC3726
    /* JADX INFO: renamed from: ۧ */
    public final String mo7179(Object obj) {
        C3659 c3659 = (C3659) obj;
        String strM6979 = c3659.m6979();
        return (strM6979.endsWith("/") || !c3659.m7006()) ? strM6979 : strM6979.concat("/");
    }

    @Override // p067l.AbstractC3726
    /* JADX INFO: renamed from: ۧ */
    public final void mo7181(long j, Object obj) {
        ((C3659) obj).m6989(j);
    }

    @Override // p067l.AbstractC3726
    /* JADX INFO: renamed from: ܽ */
    public final long mo7182(Object obj) {
        return ((C3659) obj).m7003();
    }

    @Override // p067l.AbstractC3726
    /* JADX INFO: renamed from: ܽ */
    public final void mo7184(long j, Object obj) {
        C3659 c3659 = (C3659) obj;
        c3659.getClass();
        c3659.m6975(C6673.fromMillis(j));
    }

    @Override // p067l.AbstractC3726
    /* JADX INFO: renamed from: ᩳ */
    public final long mo7185(Object obj) {
        return ((C3659) obj).m6996().getTime();
    }

    @Override // p067l.AbstractC3726
    /* JADX INFO: renamed from: ܽ */
    public final Object mo7183(String str) {
        return new C3659(str);
    }
}
