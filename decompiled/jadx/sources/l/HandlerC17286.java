package l;

import android.media.MediaScannerConnection;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.ܿۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AN5 */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC17286 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String[] strArr;
        synchronized (C14463.class) {
            strArr = (String[]) C14463.f44332.toArray(new String[0]);
            C14463.f44332.clear();
        }
        if (strArr.length > 0) {
            MediaScannerConnection.scanFile(C4925.m14335(), strArr, null, null);
        }
    }
}
