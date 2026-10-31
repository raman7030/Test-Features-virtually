package l;

/* JADX INFO: renamed from: l.ۧᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes4.dex */
public final class C11185 extends AbstractC15252 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16828 f33574;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f33575;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11185(AbstractActivityC3346 abstractActivityC3346, C16828 c16828, Runnable runnable) {
        super(abstractActivityC3346);
        this.f33574 = c16828;
        this.f33575 = runnable;
    }

    @Override // l.AbstractC15252
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo4060() {
        boolean z = false;
        String string = m36254(0).getText().toString();
        String string2 = m36254(1).getText().toString();
        AbstractC3577 abstractC3577 = m36261() >= 3 ? (AbstractC3577) m36254(2).getTag() : null;
        if (string2.length() > 1 && C3016.m9240(string2, "/", false)) {
            string2 = string2.substring(0, string2.length() - 1);
            C11233.m27803(string2, "substring(...)");
        }
        int length = string.length();
        C16828 c16828 = this.f33574;
        if (length > 0 && !string.equals(c16828.m39592())) {
            c16828.m39591(string);
            z = true;
        }
        if (string2.length() > 0 && !string2.equals(c16828.m39588())) {
            c16828.m39594(string2);
            z = true;
        }
        if (abstractC3577 != null) {
            C17534 c17534M39598 = c16828.m39598();
            C11233.m27799(c17534M39598);
            c16828.m39583(c17534M39598.m40973(abstractC3577));
            z = true;
        }
        if (z) {
            C9068.m23426();
            this.f33575.run();
        }
        return true;
    }
}
