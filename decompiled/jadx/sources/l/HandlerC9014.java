package l;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۡܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC9014 extends Handler {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public WeakReference f27372;

    public HandlerC9014(DialogInterfaceC19598 dialogInterfaceC19598) {
        this.f27372 = new WeakReference(dialogInterfaceC19598);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == -3 || i == -2 || i == -1) {
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f27372.get(), message.what);
        } else {
            if (i != 1) {
                return;
            }
            ((DialogInterface) message.obj).dismiss();
        }
    }
}
