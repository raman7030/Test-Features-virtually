package p067l;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;

/* JADX INFO: renamed from: l.ۜۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: EB0J */
/* JADX INFO: loaded from: classes2.dex */
public class C8738 extends ContentProvider {
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            if (context.getApplicationContext() == null) {
                return true;
            }
            C24831 c24831M54533 = C24831.m54533(context);
            Context context2 = c24831M54533.f79322;
            try {
                try {
                    Trace.beginSection("Startup");
                    c24831M54533.m54535(context2.getPackageManager().getProviderInfo(new ComponentName(context2.getPackageName(), C8738.class.getName()), 128).metaData);
                    Trace.endSection();
                    return true;
                } catch (PackageManager.NameNotFoundException e) {
                    throw new C11421(e);
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        throw new C11421("Context cannot be null");
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
