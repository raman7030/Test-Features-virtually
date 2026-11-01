package p067l;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;

/* JADX INFO: renamed from: l.۬۫ */
/* JADX INFO: compiled from: SB10 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1492 implements InterfaceC1002 {

    /* JADX INFO: renamed from: ֫ */
    public final ContentProviderClient f42282;

    public C1492(Context context, Uri uri) {
        this.f42282 = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override // p067l.InterfaceC1002
    /* JADX INFO: renamed from: ֫ */
    public final Cursor mo11943(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = this.f42282;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // p067l.InterfaceC1002
    public final void close() {
        ContentProviderClient contentProviderClient = this.f42282;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }
}
