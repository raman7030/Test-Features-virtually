package l;

/* JADX INFO: renamed from: l.ۧۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: WBJU */
/* JADX INFO: loaded from: classes4.dex */
public class C10787 extends AbstractC9936 {
    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ۧ */
    public void mo7190(Appendable appendable, int i, C0056 c0056) {
    }

    @Override // l.AbstractC9936, l.AbstractC11347
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC11347 mo10980() {
        return this;
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ܺ */
    public String mo2915() {
        return "#text";
    }

    @Override // l.AbstractC9936, l.AbstractC11347
    /* JADX INFO: renamed from: ᩳ */
    public final /* bridge */ /* synthetic */ int mo10981() {
        return 0;
    }

    public C10787(String str) {
        this.f30009 = str;
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ֫ */
    public void mo7189(Appendable appendable, int i, C0056 c0056) {
        boolean z;
        boolean z2;
        boolean zM979 = c0056.m979();
        AbstractC11347 abstractC11347 = this.f33969;
        C19814 c19814 = abstractC11347 instanceof C19814 ? (C19814) abstractC11347 : null;
        boolean z3 = zM979 && !C19814.m45561(abstractC11347);
        if (z3) {
            boolean z4 = (this.f33970 == 0 && c19814 != null && c19814.m45571().m38365()) || (this.f33969 instanceof C0762);
            boolean z5 = m28093() == null && c19814 != null && c19814.m45571().m38365();
            AbstractC11347 abstractC11347M28093 = m28093();
            if ((((abstractC11347M28093 instanceof C19814) && ((C19814) abstractC11347M28093).m45564(c0056)) || ((abstractC11347M28093 instanceof C10787) && C20519.m47004(((C10787) abstractC11347M28093).m25053()))) && C20519.m47004(m25053())) {
                return;
            }
            if (this.f33970 == 0 && c19814 != null && c19814.m45571().m38359() && !C20519.m47004(m25053())) {
                AbstractC11347.m28084(appendable, i, c0056);
            }
            z = z4;
            z2 = z5;
        } else {
            z = false;
            z2 = false;
        }
        C12757.m31059(appendable, m25053(), c0056, false, z3, z, z2);
    }

    @Override // l.AbstractC11347
    public final String toString() {
        return mo2910();
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: clone */
    public C10787 mo2918clone() {
        return (C10787) super.mo2918clone();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m26987(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }
}
