package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3747 implements Iterable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f11831;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f11832;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f11833;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7980 f11834;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC13848 f11835;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC13848 f11836;

    public C3747(C7980 c7980, AbstractC10844 abstractC10844, int i, Iterator it, boolean z) {
        this.f11834 = c7980;
        this.f11831 = i;
        this.f11832 = it;
        this.f11833 = z;
        this.f11835 = abstractC10844.mo5673();
        this.f11836 = abstractC10844.mo5674();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2336(this, this.f11834.f24648, this.f11831);
    }
}
