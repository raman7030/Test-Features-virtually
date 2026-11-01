package p067l;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import moe.shizuku.api.BinderContainer;

/* JADX INFO: renamed from: l.۟᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H9RK */
/* JADX INFO: loaded from: classes3.dex */
public class C9681 extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.multiprocess) {
            throw new IllegalStateException("android:multiprocess must be false");
        }
        if (!providerInfo.exported) {
            throw new IllegalStateException("android:exported must be true");
        }
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        if (C24671.m54309()) {
            return true;
        }
        C24671.m54308(getContext().getPackageName());
        return true;
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        BinderContainer binderContainer;
        IBinder iBinder;
        if (C24671.m54309()) {
            return new Bundle();
        }
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(BinderContainer.class.getClassLoader());
        Bundle bundle2 = new Bundle();
        str.getClass();
        if (str.equals("sendBinder")) {
            if (!C24433.m53925() && (binderContainer = (BinderContainer) bundle.getParcelable("moe.shizuku.privileged.api.intent.extra.BINDER")) != null && (iBinder = binderContainer.binder) != null) {
                C24433.m53921(iBinder, getContext().getPackageName());
            }
        } else if (str.equals("getBinder")) {
            IBinder iBinderM53919 = C24433.m53919();
            if (iBinderM53919 == null || !iBinderM53919.pingBinder()) {
                return null;
            }
            bundle2.putParcelable("moe.shizuku.privileged.api.intent.extra.BINDER", new BinderContainer(iBinderM53919));
            return bundle2;
        }
        return bundle2;
    }
}
