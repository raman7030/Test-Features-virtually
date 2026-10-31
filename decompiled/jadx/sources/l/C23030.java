package l;

/* JADX INFO: renamed from: l.᩺ܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes.dex */
public final class C23030 extends AbstractC16496 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2386 f74116;

    public C23030(C2386 c2386) {
        this.f74116 = c2386;
    }

    @Override // l.AbstractC16496
    public final void onPageSelected(int i) {
        C2386 c2386 = this.f74116;
        c2386.clearFocus();
        if (c2386.hasFocus()) {
            c2386.f7607.requestFocus(2);
        }
    }
}
