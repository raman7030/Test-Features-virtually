package p067l;

import android.hardware.display.DisplayManager;
import android.os.Handler;

/* JADX INFO: renamed from: l.۫᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68R4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14477 implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: ֫ */
    public final DisplayManager f41349;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C8442 f41350;

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    public C14477(C8442 c8442, DisplayManager displayManager) {
        this.f41350 = c8442;
        this.f41349 = displayManager;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m33112() {
        this.f41349.unregisterDisplayListener(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            C8442.m19655(this.f41350, this.f41349.getDisplay(0));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33111() {
        Handler handlerM12995 = C5792.m12995((Handler.Callback) null);
        DisplayManager displayManager = this.f41349;
        displayManager.registerDisplayListener(this, handlerM12995);
        C8442.m19655(this.f41350, displayManager.getDisplay(0));
    }
}
