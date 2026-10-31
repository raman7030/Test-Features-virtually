package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۤ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBIH */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9936 extends AbstractC11347 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object f30009;

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ܳ */
    public AbstractC11347 mo10980() {
        return this;
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo25051(String str) {
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ᩳ */
    public int mo10981() {
        return 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m25042() {
        Object obj = this.f30009;
        if (obj instanceof C15578) {
            return;
        }
        C15578 c15578 = new C15578();
        this.f30009 = c15578;
        if (obj != null) {
            c15578.put(mo2915(), (String) obj);
        }
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ֫ */
    public AbstractC11347 mo20901(String str, String str2) {
        if (!(this.f30009 instanceof C15578) && str.equals("#doctype")) {
            this.f30009 = str2;
            return this;
        }
        m25042();
        super.mo20901(str, str2);
        return this;
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String mo25048(String str) {
        if (this.f30009 instanceof C15578) {
            return super.mo25048(str);
        }
        return mo2915().equals(str) ? (String) this.f30009 : "";
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo25054() {
        return this.f30009 instanceof C15578;
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15578 mo25045() {
        m25042();
        return (C15578) this.f30009;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String m25046() {
        return m25053();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String m25053() {
        return mo25048(mo2915());
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String m25049() {
        return m25053();
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean mo25052(String str) {
        m25042();
        return super.mo25052(str);
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String mo25043(String str) {
        m25042();
        return super.mo25043(str);
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String mo25050() {
        return m28094() ? this.f33969.mo25050() : "";
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List mo25047() {
        return AbstractC11347.f33968;
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC11347 mo25044(AbstractC11347 abstractC11347) {
        AbstractC9936 abstractC9936 = (AbstractC9936) super.mo25044(abstractC11347);
        Object obj = this.f30009;
        if (obj instanceof C15578) {
            abstractC9936.f30009 = ((C15578) obj).clone();
        }
        return abstractC9936;
    }
}
