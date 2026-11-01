package p067l;

/* JADX INFO: renamed from: l.ܳ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57R8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16036 extends AbstractC5979 implements InterfaceC14025 {

    /* JADX INFO: renamed from: ܰ */
    public static final /* synthetic */ int f46417 = 0;

    /* JADX INFO: renamed from: ۛ */
    public int f46418;

    /* JADX INFO: renamed from: ۤ */
    public final String f46419;

    /* JADX INFO: renamed from: ۨ */
    public final C18189 f46420;

    /* JADX INFO: renamed from: ۫ */
    public final EnumC24754 f46421;

    /* JADX INFO: renamed from: ۬ */
    public boolean f46422;

    /* JADX INFO: renamed from: ᩺ */
    public final AbstractC10002 f46423;

    public C16036(EnumC24754 enumC24754, String str, AbstractC10002 abstractC10002, C18189 c18189) {
        this.f46421 = enumC24754;
        this.f46419 = str;
        this.f46423 = abstractC10002;
        this.f46420 = c18189;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16036 m36480(EnumC24754 enumC24754, AbstractC10002 abstractC10002) {
        return new C16036(enumC24754, "", abstractC10002, C18189.empty());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16036 m36479(EnumC24754 enumC24754, String str, AbstractC10002 abstractC10002, C18189 c18189) {
        return new C16036(enumC24754, str, abstractC10002, c18189);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m36484() {
        return this.f46423.mo5745();
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m36483() {
        return this.f46421 == EnumC24754.FORCED;
    }

    @Override // p067l.InterfaceC14025
    /* JADX INFO: renamed from: ֫ */
    public final void mo9793(C20061 c20061) {
        c20061.m45425(this);
    }

    @Override // p067l.AbstractC5979
    /* JADX INFO: renamed from: ܽ */
    public final int mo9799() {
        if (m36483()) {
            return 1000;
        }
        return this.f46419.length();
    }

    @Override // p067l.AbstractC5979
    /* JADX INFO: renamed from: ֫ */
    public final String mo9791() {
        return this.f46419;
    }

    @Override // p067l.AbstractC5979
    /* JADX INFO: renamed from: ۧ */
    public final C15444 mo9797() {
        return AbstractC5979.f14789;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11344 m36482(C11344 c11344, int i, boolean z) {
        C18189 c18189 = this.f46420;
        if (c18189.isPresent()) {
            C9331 c9331 = (C9331) c18189.get();
            c9331.getClass();
            c9331.f25406 = C18189.m41402of(Boolean.valueOf(z));
        }
        if (z) {
            this.f46422 = true;
            int iMax = Math.max(i + this.f46423.mo5745(), 0);
            this.f46418 = iMax;
            return c11344.m26282(iMax);
        }
        this.f46422 = false;
        this.f46418 = -1;
        return c11344.m26282(this.f46419.length() + c11344.f31579);
    }

    @Override // p067l.AbstractC5979
    /* JADX INFO: renamed from: ֫ */
    public final C11344 mo9792(InterfaceC12685 interfaceC12685, C11344 c11344) {
        throw new UnsupportedOperationException("Did you mean computeBreaks(State, int, boolean)?");
    }

    @Override // p067l.AbstractC5979
    /* JADX INFO: renamed from: ֫ */
    public final void mo9794(C20151 c20151) {
        if (this.f46422) {
            c20151.m45595(AbstractC5979.f14789, "\n");
            c20151.m45599(this.f46418);
        } else {
            c20151.m45595(m13404(), this.f46419);
        }
    }

    public final String toString() {
        C10888 c10888M40057 = C17592.m40057(this);
        c10888M40057.m25084(this.f46421, "fillMode");
        c10888M40057.m25084((Object) this.f46419, "flat");
        c10888M40057.m25084(this.f46423, "plusIndent");
        c10888M40057.m25084(this.f46420, "optTag");
        return c10888M40057.toString();
    }
}
