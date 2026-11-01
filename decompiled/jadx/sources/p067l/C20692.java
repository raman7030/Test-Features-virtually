package p067l;

import android.util.Pair;
import net.p069sf.sevenzipjbinding.ISequentialOutStream;

/* JADX INFO: renamed from: l.᩵ۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B6V */
/* JADX INFO: loaded from: classes5.dex */
public final class C20692 extends AbstractC13142 {

    /* JADX INFO: renamed from: ۗ */
    public C12073 f63889;

    /* JADX INFO: renamed from: ۙ */
    public AbstractC17043 f63890;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C6634 f63891;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C2585 f63892;

    /* JADX INFO: renamed from: ᩶ */
    public C6177 f63893;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20692(C2585 c2585, C7280 c7280, C24164 c24164, C6634 c6634) {
        super(c7280, c24164);
        this.f63892 = c2585;
        this.f63891 = c6634;
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ᩷ */
    public final void mo16036(int i) {
        Pair pair = (Pair) this.f63891.get(i);
        C12826.requireNonNull(pair);
        C12073 c12073 = (C12073) pair.first;
        this.f63889 = c12073;
        this.f63893 = (C6177) pair.second;
        this.f63890 = this.f63892.f4275.m38684(c12073.m27650());
        C7050.m16212(new Runnable() { // from class: l.ᩴۛܳ
            @Override // java.lang.Runnable
            public final void run() {
                C20692 c20692 = this.f60850;
                c20692.f36911.m53431(c20692.f63889.m27648());
            }
        });
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ܳ */
    public final ISequentialOutStream mo16034() {
        return new C21171(this.f63890);
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ᩹ */
    public final void mo16037() {
        this.f63889.m27642(this.f63890);
        C2585 c2585 = this.f63892;
        c2585.f4269.add(new C8049(this.f63890, this.f63889.m27648(), this.f63893.m14002()));
        c2585.f4274.add(this.f63893.m14002());
    }
}
