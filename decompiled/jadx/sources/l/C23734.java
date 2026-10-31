package l;

/* JADX INFO: renamed from: l.᩻ܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07T5 */
/* JADX INFO: loaded from: classes.dex */
public final class C23734 extends AbstractC1428 {
    @Override // l.AbstractC1428
    /* JADX INFO: renamed from: ֫ */
    public final long mo4932(Object obj) {
        C3545 c3545 = (C3545) obj;
        if (c3545.m10790()) {
            return 0L;
        }
        return c3545.m10793();
    }

    @Override // l.AbstractC1428
    /* JADX INFO: renamed from: ֫ */
    public final void mo4935(long j, Object obj) {
        ((C3545) obj).m10770(j);
    }

    @Override // l.AbstractC1428
    /* JADX INFO: renamed from: ۧ */
    public final String mo4936(Object obj) {
        return ((C3545) obj).getName();
    }

    @Override // l.AbstractC1428
    /* JADX INFO: renamed from: ۧ */
    public final void mo4938(long j, Object obj) {
        ((C3545) obj).m10805(j);
    }

    @Override // l.AbstractC1428
    /* JADX INFO: renamed from: ܽ */
    public final long mo4939(Object obj) {
        return ((C3545) obj).getSize();
    }

    @Override // l.AbstractC1428
    /* JADX INFO: renamed from: ܽ */
    public final void mo4941(long j, Object obj) {
        ((C3545) obj).setTime(j);
    }

    @Override // l.AbstractC1428
    /* JADX INFO: renamed from: ᩳ */
    public final long mo4942(Object obj) {
        return ((C3545) obj).getTime();
    }

    @Override // l.AbstractC1428
    /* JADX INFO: renamed from: ܽ */
    public final Object mo4940(String str) {
        return new C3545(str);
    }
}
