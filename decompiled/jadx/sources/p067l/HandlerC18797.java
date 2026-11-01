package p067l;

import android.media.MediaScannerConnection;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.ܿۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AN5 */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC18797 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String[] strArr;
        synchronized (C16114.class) {
            strArr = (String[]) C16114.f47426.toArray(new String[0]);
            C16114.f47426.clear();
        }
        if (strArr.length > 0) {
            MediaScannerConnection.scanFile(C7050.m16232(), strArr, null, null);
        }
    }
}
