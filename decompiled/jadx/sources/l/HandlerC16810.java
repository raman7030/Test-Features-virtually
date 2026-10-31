package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܽᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: R16R */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC16810 extends Handler {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final WeakReference f51609;

    public HandlerC16810(PopupWindow popupWindow) {
        super(Looper.getMainLooper());
        this.f51609 = new WeakReference(popupWindow);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        PopupWindow popupWindow = (PopupWindow) this.f51609.get();
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }
}
