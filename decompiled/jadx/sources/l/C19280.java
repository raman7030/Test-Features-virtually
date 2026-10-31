package l;

import android.util.Pair;
import net.sf.sevenzipjbinding.ISequentialOutStream;

/* JADX INFO: renamed from: l.᩵ۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B6V */
/* JADX INFO: loaded from: classes5.dex */
public final class C19280 extends AbstractC11335 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C10211 f60659;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f60660;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4488 f60661;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0228 f60662;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C4007 f60663;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19280(C0228 c0228, C5168 c5168, C22933 c22933, C4488 c4488) {
        super(c5168, c22933);
        this.f60662 = c0228;
        this.f60661 = c4488;
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14155(int i) {
        Pair pair = (Pair) this.f60661.get(i);
        C11003.requireNonNull(pair);
        C10211 c10211 = (C10211) pair.first;
        this.f60659 = c10211;
        this.f60663 = (C4007) pair.second;
        this.f60660 = this.f60662.f1496.m36526(c10211.m25628());
        C4925.m14315(new Runnable() { // from class: l.ᩴۛܳ
            @Override // java.lang.Runnable
            public final void run() {
                C19280 c19280 = this.f57627;
                c19280.f33912.m51040(c19280.f60659.m25626());
            }
        });
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ܳ */
    public final ISequentialOutStream mo14153() {
        return new C19783(this.f60660);
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ᩹ */
    public final void mo14156() {
        this.f60659.m25620(this.f60660);
        C0228 c0228 = this.f60662;
        c0228.f1490.add(new C5977(this.f60660, this.f60659.m25626(), this.f60663.m12082()));
        c0228.f1495.add(this.f60663.m12082());
    }
}
