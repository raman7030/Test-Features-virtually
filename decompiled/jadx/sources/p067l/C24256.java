package p067l;

/* JADX INFO: renamed from: l.᩺ܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes.dex */
public final class C24256 extends AbstractC18046 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C4636 f76855;

    public C24256(C4636 c4636) {
        this.f76855 = c4636;
    }

    @Override // p067l.AbstractC18046
    public final void onPageSelected(int i) {
        C4636 c4636 = this.f76855;
        c4636.clearFocus();
        if (c4636.hasFocus()) {
            c4636.f10398.requestFocus(2);
        }
    }
}
