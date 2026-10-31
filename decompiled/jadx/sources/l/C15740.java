package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15740 implements Iterable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f48564;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f48565;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f48566;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7980 f48567;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC10844 f48568;

    public C15740(C7980 c7980, AbstractC10844 abstractC10844, int i, Iterator it, boolean z) {
        this.f48567 = c7980;
        this.f48568 = abstractC10844;
        this.f48565 = i;
        this.f48566 = it;
        this.f48564 = z;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        AbstractC10844 abstractC10844 = this.f48568;
        return new C8686(this, this.f48567.f24648, this.f48565, abstractC10844.mo5673(), abstractC10844.mo5674());
    }
}
