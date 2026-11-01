package p067l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܽᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: R16R */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC18345 extends Handler {

    /* JADX INFO: renamed from: ֫ */
    public final WeakReference f54791;

    public HandlerC18345(PopupWindow popupWindow) {
        super(Looper.getMainLooper());
        this.f54791 = new WeakReference(popupWindow);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        PopupWindow popupWindow = (PopupWindow) this.f54791.get();
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }
}
