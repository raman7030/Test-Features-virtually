package l;

/* JADX INFO: renamed from: l.ۗܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 37T7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3326 extends AbstractC1428 {
    @Override // l.AbstractC1428
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ long mo4932(Object obj) {
        return 0L;
    }

    @Override // l.AbstractC1428
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ void mo4935(long j, Object obj) {
    }

    @Override // l.AbstractC1428
    /* JADX INFO: renamed from: ۧ */
    public final String mo4936(Object obj) {
        C1358 c1358 = (C1358) obj;
        String strM4741 = c1358.m4741();
        return (strM4741.endsWith("/") || !c1358.m4768()) ? strM4741 : strM4741.concat("/");
    }

    @Override // l.AbstractC1428
    /* JADX INFO: renamed from: ۧ */
    public final void mo4938(long j, Object obj) {
        ((C1358) obj).m4751(j);
    }

    @Override // l.AbstractC1428
    /* JADX INFO: renamed from: ܽ */
    public final long mo4939(Object obj) {
        return ((C1358) obj).m4765();
    }

    @Override // l.AbstractC1428
    /* JADX INFO: renamed from: ܽ */
    public final void mo4941(long j, Object obj) {
        C1358 c1358 = (C1358) obj;
        c1358.getClass();
        c1358.m4737(C4529.fromMillis(j));
    }

    @Override // l.AbstractC1428
    /* JADX INFO: renamed from: ᩳ */
    public final long mo4942(Object obj) {
        return ((C1358) obj).m4758().getTime();
    }

    @Override // l.AbstractC1428
    /* JADX INFO: renamed from: ܽ */
    public final Object mo4940(String str) {
        return new C1358(str);
    }
}
