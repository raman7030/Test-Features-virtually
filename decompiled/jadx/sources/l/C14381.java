package l;

/* JADX INFO: renamed from: l.ܳ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57R8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14381 extends AbstractC3799 implements InterfaceC12265 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f43326 = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f43327;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f43328;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C16646 f43329;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final EnumC23554 f43330;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f43331;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AbstractC8032 f43332;

    public C14381(EnumC23554 enumC23554, String str, AbstractC8032 abstractC8032, C16646 c16646) {
        this.f43330 = enumC23554;
        this.f43328 = str;
        this.f43332 = abstractC8032;
        this.f43329 = c16646;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14381 m34346(EnumC23554 enumC23554, AbstractC8032 abstractC8032) {
        return new C14381(enumC23554, "", abstractC8032, C16646.empty());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14381 m34345(EnumC23554 enumC23554, String str, AbstractC8032 abstractC8032, C16646 c16646) {
        return new C14381(enumC23554, str, abstractC8032, c16646);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m34350() {
        return this.f43332.mo3442();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m34349() {
        return this.f43330 == EnumC23554.FORCED;
    }

    @Override // l.InterfaceC12265
    /* JADX INFO: renamed from: ֫ */
    public final void mo7732(C18616 c18616) {
        c18616.m43160(this);
    }

    @Override // l.AbstractC3799
    /* JADX INFO: renamed from: ܽ */
    public final int mo7738() {
        if (m34349()) {
            return 1000;
        }
        return this.f43328.length();
    }

    @Override // l.AbstractC3799
    /* JADX INFO: renamed from: ֫ */
    public final String mo7730() {
        return this.f43328;
    }

    @Override // l.AbstractC3799
    /* JADX INFO: renamed from: ۧ */
    public final C13758 mo7736() {
        return AbstractC3799.f11983;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9444 m34348(C9444 c9444, int i, boolean z) {
        C16646 c16646 = this.f43329;
        if (c16646.isPresent()) {
            C7326 c7326 = (C7326) c16646.get();
            c7326.getClass();
            c7326.f22515 = C16646.of(Boolean.valueOf(z));
        }
        if (z) {
            this.f43331 = true;
            int iMax = Math.max(i + this.f43332.mo3442(), 0);
            this.f43327 = iMax;
            return c9444.m24272(iMax);
        }
        this.f43331 = false;
        this.f43327 = -1;
        return c9444.m24272(this.f43328.length() + c9444.f28632);
    }

    @Override // l.AbstractC3799
    /* JADX INFO: renamed from: ֫ */
    public final C9444 mo7731(InterfaceC10855 interfaceC10855, C9444 c9444) {
        throw new UnsupportedOperationException("Did you mean computeBreaks(State, int, boolean)?");
    }

    @Override // l.AbstractC3799
    /* JADX INFO: renamed from: ֫ */
    public final void mo7733(C18711 c18711) {
        if (this.f43331) {
            c18711.m43328(AbstractC3799.f11983, "\n");
            c18711.m43332(this.f43327);
        } else {
            c18711.m43328(m11468(), this.f43328);
        }
    }

    public final String toString() {
        C8964 c8964M37871 = C16018.m37871(this);
        c8964M37871.m23110(this.f43330, "fillMode");
        c8964M37871.m23110((Object) this.f43328, "flat");
        c8964M37871.m23110(this.f43332, "plusIndent");
        c8964M37871.m23110(this.f43329, "optTag");
        return c8964M37871.toString();
    }
}
