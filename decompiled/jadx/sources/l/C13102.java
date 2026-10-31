package l;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;

/* JADX INFO: renamed from: l.۬۫, reason: contains not printable characters */
/* JADX INFO: compiled from: SB10 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13102 implements InterfaceC3225 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ContentProviderClient f39230;

    public C13102(Context context, Uri uri) {
        this.f39230 = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override // l.InterfaceC3225
    /* JADX INFO: renamed from: ֫ */
    public final Cursor mo9895(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = this.f39230;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // l.InterfaceC3225
    public final void close() {
        ContentProviderClient contentProviderClient = this.f39230;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }
}
