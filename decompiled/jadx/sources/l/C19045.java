package l;

/* JADX INFO: renamed from: l.ᩴ᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BJO */
/* JADX INFO: loaded from: classes5.dex */
public final class C19045 extends AbstractC21867 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6134 f59982;

    public C19045(AbstractC21162 abstractC21162) {
        this.f70032 = abstractC21162;
        this.f59982 = new C6134(abstractC21162);
    }

    @Override // l.AbstractC21162
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2753(C19814 c19814, C19814 c19815) {
        for (int i = 0; i < c19815.mo10981(); i++) {
            AbstractC11347 abstractC11347M28087 = c19815.m28087(i);
            if ((abstractC11347M28087 instanceof C19814) && this.f59982.m17056(c19815, (C19814) abstractC11347M28087) != null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format(":has(%s)", this.f70032);
    }
}
