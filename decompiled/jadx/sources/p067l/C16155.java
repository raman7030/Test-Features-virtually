package p067l;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ܳۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes3.dex */
public final class C16155 {

    /* JADX INFO: renamed from: ֫ */
    public final AtomicBoolean f47576 = new AtomicBoolean();

    /* JADX INFO: renamed from: ۧ */
    public final View f47577;

    public C16155(View view) {
        this.f47577 = view;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m36760(DialogInterfaceC2564 dialogInterfaceC2564) {
        if (!this.f47576.compareAndSet(false, true)) {
            return false;
        }
        C10792.m24864(dialogInterfaceC2564, this.f47577, true);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m36759(DialogInterfaceC2564 dialogInterfaceC2564) {
        if (!this.f47576.compareAndSet(true, false)) {
            return false;
        }
        if (dialogInterfaceC2564.m3855()) {
            C10792.m24864(dialogInterfaceC2564, this.f47577, false);
        }
        return true;
    }
}
