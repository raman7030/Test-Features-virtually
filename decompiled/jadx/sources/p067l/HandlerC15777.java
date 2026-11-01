package p067l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import bin.p000mt.plus.R;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ܰ᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1TZ */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC15777 extends Handler {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f45672;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C19071 f45673;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC15777(C19071 c19071, Looper looper) {
        super(looper);
        this.f45673 = c19071;
        this.f45672 = new byte[4096];
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String strM11876;
        int i = message.what;
        C19071 c19071 = this.f45673;
        if (i == 1 && c19071.m43344()) {
            C13567 c13567 = c19071.f56909;
            byte[] bArr = this.f45672;
            int iM30886 = c13567.m30886(bArr, false);
            if (iM30886 > 0) {
                c19071.f56902.m43498(iM30886, bArr);
                C19071.m43333(c19071);
                return;
            }
            return;
        }
        if (message.what == 4) {
            int iIntValue = ((Integer) message.obj).intValue();
            C19071.m43327(c19071);
            c19071.f56906.getClass();
            if (iIntValue > 0) {
                strM11876 = C19768.m44906(iIntValue, "(error ", ") ");
            } else {
                strM11876 = iIntValue < 0 ? C5410.m11876(-iIntValue, ") ", new StringBuilder("(signal ")) : "";
            }
            byte[] bytes = "\r\n".concat(C7050.m16203(R.string.MT_Protector, strM11876)).getBytes(StandardCharsets.UTF_8);
            c19071.f56902.m43498(bytes.length, bytes);
            C19071.m43333(c19071);
        }
    }
}
