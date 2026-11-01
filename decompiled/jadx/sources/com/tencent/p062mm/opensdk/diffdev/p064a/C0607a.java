package com.tencent.p062mm.opensdk.diffdev.p064a;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.tencent.p062mm.opensdk.diffdev.IDiffDevOAuth;
import com.tencent.p062mm.opensdk.diffdev.OAuthListener;
import com.tencent.p062mm.opensdk.utils.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0607a implements IDiffDevOAuth {

    /* JADX INFO: renamed from: d */
    public AsyncTaskC0610d f2095d;
    public Handler handler = null;

    /* JADX INFO: renamed from: c */
    public List f2094c = new ArrayList();

    /* JADX INFO: renamed from: e */
    public OAuthListener f2096e = new C0608b(this);

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ AsyncTaskC0610d m2010c(C0607a c0607a) {
        c0607a.f2095d = null;
        return null;
    }

    @Override // com.tencent.p062mm.opensdk.diffdev.IDiffDevOAuth
    public final void addListener(OAuthListener oAuthListener) {
        if (this.f2094c.contains(oAuthListener)) {
            return;
        }
        this.f2094c.add(oAuthListener);
    }

    @Override // com.tencent.p062mm.opensdk.diffdev.IDiffDevOAuth
    public final boolean auth(String str, String str2, String str3, String str4, String str5, OAuthListener oAuthListener) {
        Log.m2022i("MicroMsg.SDK.DiffDevOAuth", "start auth, appId = ".concat(String.valueOf(str)));
        if (str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            Log.m2020d("MicroMsg.SDK.DiffDevOAuth", "auth fail, invalid argument, appId = " + str + ", scope = " + str2);
            return false;
        }
        if (this.handler == null) {
            this.handler = new Handler(Looper.getMainLooper());
        }
        addListener(oAuthListener);
        if (this.f2095d != null) {
            Log.m2020d("MicroMsg.SDK.DiffDevOAuth", "auth, already running, no need to start auth again");
            return true;
        }
        AsyncTaskC0610d asyncTaskC0610d = new AsyncTaskC0610d(str, str2, str3, str4, str5, this.f2096e);
        this.f2095d = asyncTaskC0610d;
        asyncTaskC0610d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return true;
    }

    @Override // com.tencent.p062mm.opensdk.diffdev.IDiffDevOAuth
    public final void detach() {
        Log.m2022i("MicroMsg.SDK.DiffDevOAuth", "detach");
        this.f2094c.clear();
        stopAuth();
    }

    @Override // com.tencent.p062mm.opensdk.diffdev.IDiffDevOAuth
    public final void removeAllListeners() {
        this.f2094c.clear();
    }

    @Override // com.tencent.p062mm.opensdk.diffdev.IDiffDevOAuth
    public final void removeListener(OAuthListener oAuthListener) {
        this.f2094c.remove(oAuthListener);
    }

    @Override // com.tencent.p062mm.opensdk.diffdev.IDiffDevOAuth
    public final boolean stopAuth() {
        boolean zM2011a;
        Log.m2022i("MicroMsg.SDK.DiffDevOAuth", "stopAuth");
        try {
            AsyncTaskC0610d asyncTaskC0610d = this.f2095d;
            zM2011a = asyncTaskC0610d == null ? true : asyncTaskC0610d.m2011a();
        } catch (Exception e) {
            Log.m2024w("MicroMsg.SDK.DiffDevOAuth", "stopAuth fail, ex = " + e.getMessage());
            zM2011a = false;
        }
        this.f2095d = null;
        return zM2011a;
    }
}
