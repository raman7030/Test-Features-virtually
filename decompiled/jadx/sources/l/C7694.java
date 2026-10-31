package l;

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
public class C7694 extends ContentProvider {
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
        if (C23467.m51907()) {
            return true;
        }
        C23467.m51906(getContext().getPackageName());
        return true;
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        BinderContainer binderContainer;
        IBinder iBinder;
        if (C23467.m51907()) {
            return new Bundle();
        }
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(BinderContainer.class.getClassLoader());
        Bundle bundle2 = new Bundle();
        str.getClass();
        if (str.equals("sendBinder")) {
            if (!C23216.m51528() && (binderContainer = (BinderContainer) bundle.getParcelable("moe.shizuku.privileged.api.intent.extra.BINDER")) != null && (iBinder = binderContainer.binder) != null) {
                C23216.m51524(iBinder, getContext().getPackageName());
            }
        } else if (str.equals("getBinder")) {
            IBinder iBinderM51522 = C23216.m51522();
            if (iBinderM51522 == null || !iBinderM51522.pingBinder()) {
                return null;
            }
            bundle2.putParcelable("moe.shizuku.privileged.api.intent.extra.BINDER", new BinderContainer(iBinderM51522));
            return bundle2;
        }
        return bundle2;
    }
}
