package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.֨֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes3.dex */
public final class C0758 extends C3581 {

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f2813;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public int f2814;

    public C0758(AbstractC10370 abstractC10370, AbstractC4308 abstractC4308, int i, AbstractC5698 abstractC5698) {
        super(9L, abstractC10370, abstractC4308, abstractC5698);
        this.f2813 = Integer.MIN_VALUE;
        this.f2814 = i;
    }

    @Override // l.C3581, l.AbstractC5698
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo2899(InterfaceC9932 interfaceC9932, Locale locale) {
        return interfaceC9932.mo4019(this, (Object) locale);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m2898(EnumC18550 enumC18550) {
        if (this.f2813 != Integer.MIN_VALUE && !enumC18550.m43093()) {
            return this.f2813;
        }
        int iM14475 = EnumC4992.m14475(enumC18550, this.f2814);
        this.f2813 = iM14475;
        return iM14475;
    }
}
