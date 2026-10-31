package l;

import android.hardware.display.DisplayManager;
import android.os.Handler;

/* JADX INFO: renamed from: l.۫᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68R4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12740 implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final DisplayManager f38309;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6390 f38310;

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    public C12740(C6390 c6390, DisplayManager displayManager) {
        this.f38310 = c6390;
        this.f38309 = displayManager;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m31028() {
        this.f38309.unregisterDisplayListener(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            C6390.m17708(this.f38310, this.f38309.getDisplay(0));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31027() {
        Handler handlerM11019 = C3603.m11019((Handler.Callback) null);
        DisplayManager displayManager = this.f38309;
        displayManager.registerDisplayListener(this, handlerM11019);
        C6390.m17708(this.f38310, displayManager.getDisplay(0));
    }
}
