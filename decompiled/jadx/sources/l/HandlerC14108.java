package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import bin.mt.plus.R;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ܰ᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1TZ */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC14108 extends Handler {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f42586;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17574 f42587;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC14108(C17574 c17574, Looper looper) {
        super(looper);
        this.f42587 = c17574;
        this.f42586 = new byte[4096];
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String strM9831;
        int i = message.what;
        C17574 c17574 = this.f42587;
        if (i == 1 && c17574.m41098()) {
            C11783 c11783 = c17574.f53719;
            byte[] bArr = this.f42586;
            int iM28838 = c11783.m28838(bArr, false);
            if (iM28838 > 0) {
                c17574.f53712.m41252(iM28838, bArr);
                C17574.m41087(c17574);
                return;
            }
            return;
        }
        if (message.what == 4) {
            int iIntValue = ((Integer) message.obj).intValue();
            C17574.m41081(c17574);
            c17574.f53716.getClass();
            if (iIntValue > 0) {
                strM9831 = C18307.m42645(iIntValue, "(error ", ") ");
            } else {
                strM9831 = iIntValue < 0 ? C3200.m9831(-iIntValue, ") ", new StringBuilder("(signal ")) : "";
            }
            byte[] bytes = "\r\n".concat(C4925.m14306(R.string.MT_Protector, strM9831)).getBytes(StandardCharsets.UTF_8);
            c17574.f53712.m41252(bytes.length, bytes);
            C17574.m41087(c17574);
        }
    }
}
