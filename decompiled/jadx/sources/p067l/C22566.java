package p067l;

import android.content.Intent;
import bin.p000mt.plus.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩸֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4GI */
/* JADX INFO: loaded from: classes5.dex */
public final class C22566 extends AbstractViewOnClickListenerC13513 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C13848 f71160;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ AtomicBoolean f71161;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22566(C13848 c13848, AbstractActivityC5549 abstractActivityC5549, AtomicBoolean atomicBoolean) {
        super(abstractActivityC5549, R.string.MT_Protector);
        this.f71160 = c13848;
        this.f71161 = atomicBoolean;
    }

    @Override // p067l.AbstractViewOnClickListenerC13513
    /* JADX INFO: renamed from: ܿ */
    public final void mo18363() {
        String strM30671 = m30671();
        if (strM30671.isEmpty()) {
            C22682.m50798(R.string.MT_Protector, 0).m50804();
            return;
        }
        synchronized (this.f71160) {
            if (!this.f71161.compareAndSet(false, true)) {
                m30668();
                return;
            }
            this.f71160.f39128.mo17414(strM30671);
            m30668();
            this.f71160.notify();
        }
    }

    @Override // p067l.AbstractViewOnClickListenerC13513
    /* JADX INFO: renamed from: ܽ */
    public final void mo18362() {
        this.f71160.f39129 = true;
        synchronized (this.f71160) {
            if (this.f71161.compareAndSet(false, true)) {
                this.f71160.notify();
            }
        }
    }

    @Override // p067l.AbstractViewOnClickListenerC13513
    /* JADX INFO: renamed from: ᩳ */
    public final void mo30674() {
        C13848 c13848 = this.f71160;
        c13848.f39127.startActivity(new Intent(c13848.f39127, (Class<?>) ActivityC5542.class));
    }
}
