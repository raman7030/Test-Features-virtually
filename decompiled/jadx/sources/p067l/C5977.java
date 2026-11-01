package p067l;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;

/* JADX INFO: renamed from: l.ۘ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R71Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C5977 extends ContentProvider {

    /* JADX INFO: renamed from: ᩸ */
    public DropDataContentProviderBoundaryInterface f14785;

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        return m13401().openFile(this, uri);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return m13401().query(uri, strArr, str, strArr2, str2);
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return m13401().getType(uri);
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Insert method is not supported.");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("delete method is not supported.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("update method is not supported.");
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        return m13401().call(str, str2, bundle);
    }

    /* JADX INFO: renamed from: ֫ */
    private DropDataContentProviderBoundaryInterface m13401() {
        if (this.f14785 == null) {
            DropDataContentProviderBoundaryInterface dropDataProvider = C4482.m9489().getDropDataProvider();
            this.f14785 = dropDataProvider;
            dropDataProvider.onCreate();
        }
        return this.f14785;
    }
}
