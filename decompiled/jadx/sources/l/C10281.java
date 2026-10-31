package l;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.ۤ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: SB10 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10281 implements InterfaceC3225 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ContentProviderClient f30954;

    public C10281(Context context, Uri uri) {
        this.f30954 = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override // l.InterfaceC3225
    /* JADX INFO: renamed from: ֫ */
    public final Cursor mo9895(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = this.f30954;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC3225
    public final void close() throws Exception {
        ContentProviderClient contentProviderClient = this.f30954;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                C12397.m30566((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }
}
