package l;

import android.content.Intent;
import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩸֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4GI */
/* JADX INFO: loaded from: classes5.dex */
public final class C21252 extends AbstractViewOnClickListenerC11726 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12079 f68478;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f68479;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21252(C12079 c12079, AbstractActivityC3346 abstractActivityC3346, AtomicBoolean atomicBoolean) {
        super(abstractActivityC3346, R.string.MT_Protector);
        this.f68478 = c12079;
        this.f68479 = atomicBoolean;
    }

    @Override // l.AbstractViewOnClickListenerC11726
    /* JADX INFO: renamed from: ܿ */
    public final void mo16437() {
        String strM28623 = m28623();
        if (strM28623.isEmpty()) {
            C21374.m48462(R.string.MT_Protector, 0).m48468();
            return;
        }
        synchronized (this.f68478) {
            if (!this.f68479.compareAndSet(false, true)) {
                m28620();
                return;
            }
            this.f68478.f36117.mo15503(strM28623);
            m28620();
            this.f68478.notify();
        }
    }

    @Override // l.AbstractViewOnClickListenerC11726
    /* JADX INFO: renamed from: ܽ */
    public final void mo16436() {
        this.f68478.f36118 = true;
        synchronized (this.f68478) {
            if (this.f68479.compareAndSet(false, true)) {
                this.f68478.notify();
            }
        }
    }

    @Override // l.AbstractViewOnClickListenerC11726
    /* JADX INFO: renamed from: ᩳ */
    public final void mo28626() {
        C12079 c12079 = this.f68478;
        c12079.f36116.startActivity(new Intent(c12079.f36116, (Class<?>) ActivityC3339.class));
    }
}
