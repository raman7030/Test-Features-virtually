package p067l;

/* JADX INFO: renamed from: l.ۧᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes4.dex */
public final class C12999 extends AbstractC16864 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C18362 f36574;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ Runnable f36575;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12999(AbstractActivityC5549 abstractActivityC5549, C18362 c18362, Runnable runnable) {
        super(abstractActivityC5549);
        this.f36574 = c18362;
        this.f36575 = runnable;
    }

    @Override // p067l.AbstractC16864
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo6304() {
        boolean z = false;
        String string = m38415(0).getText().toString();
        String string2 = m38415(1).getText().toString();
        AbstractC5769 abstractC5769 = m38422() >= 3 ? (AbstractC5769) m38415(2).getTag() : null;
        if (string2.length() > 1 && C5235.m11298(string2, "/", false)) {
            string2 = string2.substring(0, string2.length() - 1);
            C13045.m29865(string2, "substring(...)");
        }
        int length = string.length();
        C18362 c18362 = this.f36574;
        if (length > 0 && !string.equals(c18362.m41828())) {
            c18362.m41827(string);
            z = true;
        }
        if (string2.length() > 0 && !string2.equals(c18362.m41824())) {
            c18362.m41830(string2);
            z = true;
        }
        if (abstractC5769 != null) {
            C19033 c19033M41834 = c18362.m41834();
            C13045.m29861(c19033M41834);
            c18362.m41819(c19033M41834.m43233(abstractC5769));
            z = true;
        }
        if (z) {
            C10987.m25372();
            this.f36575.run();
        }
        return true;
    }
}
