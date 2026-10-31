package l;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: renamed from: l.۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes3.dex */
public final class C12045 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f36032 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19101 f36033;

    static {
        Log.isLoggable("MediaBrowserCompat", 3);
    }

    public C12045(Context context, ComponentName componentName, C2167 c2167) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f36033 = new C4989(context, componentName, c2167);
        } else if (i >= 23) {
            this.f36033 = new C0049(context, componentName, c2167);
        } else {
            this.f36033 = new C19101(context, componentName, c2167);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29415() {
        this.f36033.f60163.connect();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14472 m29417() {
        return this.f36033.m44021();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m29416() {
        Messenger messenger;
        C19101 c19101 = this.f36033;
        C21923 c21923 = c19101.f60170;
        if (c21923 != null && (messenger = c19101.f60165) != null) {
            try {
                c21923.m49346(messenger);
            } catch (RemoteException unused) {
            }
        }
        c19101.f60163.disconnect();
    }
}
