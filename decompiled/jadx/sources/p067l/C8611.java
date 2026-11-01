package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8611 implements Iterable {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ int f23144;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ boolean f23145;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Iterator f23146;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C9952 f23147;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractC12674 f23148;

    public C8611(C9952 c9952, AbstractC12674 abstractC12674, int i, Iterator it, boolean z) {
        this.f23147 = c9952;
        this.f23148 = abstractC12674;
        this.f23144 = i;
        this.f23146 = it;
        this.f23145 = z;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC15529 interfaceC15529Mo7902 = this.f23148.mo7902();
        C9952 c9952 = this.f23147;
        return new C24704(this, c9952.f27561, c9952.f27557, AbstractC17366.m39361(c9952.f27561, this.f23144), interfaceC15529Mo7902);
    }
}
