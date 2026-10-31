package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9392 implements Iterable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f28520;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f28521;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f28522;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7980 f28523;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC10844 f28524;

    public C9392(C7980 c7980, AbstractC10844 abstractC10844, int i, Iterator it, boolean z) {
        this.f28523 = c7980;
        this.f28524 = abstractC10844;
        this.f28522 = i;
        this.f28521 = it;
        this.f28520 = z;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C20681(this, this.f28523.f24648, this.f28522, this.f28524.mo5672());
    }
}
