package p067l;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.ۤ۫ */
/* JADX INFO: compiled from: SB10 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1352 implements InterfaceC1002 {

    /* JADX INFO: renamed from: ֫ */
    public final ContentProviderClient f33917;

    public C1352(Context context, Uri uri) {
        this.f33917 = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override // p067l.InterfaceC1002
    /* JADX INFO: renamed from: ֫ */
    public final Cursor mo11943(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = this.f33917;
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
    @Override // p067l.InterfaceC1002
    public final void close() throws Exception {
        ContentProviderClient contentProviderClient = this.f33917;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                C1457.m32630((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }
}
