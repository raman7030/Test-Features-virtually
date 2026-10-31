package l;

import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: E50U */
/* JADX INFO: loaded from: classes5.dex */
public final class C19289 implements InterfaceC2231 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnKeyListenerC5177 f60695;

    public C19289(ViewOnKeyListenerC5177 viewOnKeyListenerC5177) {
        this.f60695 = viewOnKeyListenerC5177;
    }

    @Override // l.InterfaceC2231
    /* JADX INFO: renamed from: ֫ */
    public final void mo1114(C3060 c3060, MenuItem menuItem) {
        this.f60695.f16191.removeCallbacksAndMessages(c3060);
    }

    @Override // l.InterfaceC2231
    /* JADX INFO: renamed from: ֫ */
    public final void mo1115(C3060 c3060, C5882 c5882) {
        ViewOnKeyListenerC5177 viewOnKeyListenerC5177 = this.f60695;
        Handler handler = viewOnKeyListenerC5177.f16191;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC5177.f16188;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (c3060 == ((C0237) arrayList.get(i)).f1508) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new RunnableC18583(this, i2 < arrayList.size() ? (C0237) arrayList.get(i2) : null, c5882, c3060), c3060, SystemClock.uptimeMillis() + 200);
    }
}
