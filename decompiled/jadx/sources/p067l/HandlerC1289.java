package p067l;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۡܿ */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC1289 extends Handler {

    /* JADX INFO: renamed from: ֫ */
    public WeakReference f30308;

    public HandlerC1289(DialogInterfaceC1814 dialogInterfaceC1814) {
        this.f30308 = new WeakReference(dialogInterfaceC1814);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == -3 || i == -2 || i == -1) {
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f30308.get(), message.what);
        } else {
            if (i != 1) {
                return;
            }
            ((DialogInterface) message.obj).dismiss();
        }
    }
}
