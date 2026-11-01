package p067l;

/* JADX INFO: renamed from: l.᩻ܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07T5 */
/* JADX INFO: loaded from: classes.dex */
public final class C24925 extends AbstractC3726 {
    @Override // p067l.AbstractC3726
    /* JADX INFO: renamed from: ֫ */
    public final long mo7175(Object obj) {
        C5738 c5738 = (C5738) obj;
        if (c5738.m12771()) {
            return 0L;
        }
        return c5738.m12774();
    }

    @Override // p067l.AbstractC3726
    /* JADX INFO: renamed from: ֫ */
    public final void mo7178(long j, Object obj) {
        ((C5738) obj).m12751(j);
    }

    @Override // p067l.AbstractC3726
    /* JADX INFO: renamed from: ۧ */
    public final String mo7179(Object obj) {
        return ((C5738) obj).getName();
    }

    @Override // p067l.AbstractC3726
    /* JADX INFO: renamed from: ۧ */
    public final void mo7181(long j, Object obj) {
        ((C5738) obj).m12786(j);
    }

    @Override // p067l.AbstractC3726
    /* JADX INFO: renamed from: ܽ */
    public final long mo7182(Object obj) {
        return ((C5738) obj).getSize();
    }

    @Override // p067l.AbstractC3726
    /* JADX INFO: renamed from: ܽ */
    public final void mo7184(long j, Object obj) {
        ((C5738) obj).setTime(j);
    }

    @Override // p067l.AbstractC3726
    /* JADX INFO: renamed from: ᩳ */
    public final long mo7185(Object obj) {
        return ((C5738) obj).getTime();
    }

    @Override // p067l.AbstractC3726
    /* JADX INFO: renamed from: ܽ */
    public final Object mo7183(String str) {
        return new C5738(str);
    }
}
