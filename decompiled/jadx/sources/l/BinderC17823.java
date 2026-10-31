package l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import java.util.HashSet;
import java.util.Iterator;
import moe.shizuku.server.IShizukuServiceConnection;

/* JADX INFO: renamed from: l.ᩳۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M98V */
/* JADX INFO: loaded from: classes5.dex */
public final class BinderC17823 extends IShizukuServiceConnection.Stub {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Handler f54467 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ComponentName f54469;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashSet f54468 = new HashSet();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f54470 = false;

    public BinderC17823(C11928 c11928) {
        this.f54469 = c11928.f35659;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41765(ServiceConnection serviceConnection) {
        if (serviceConnection != null) {
            this.f54468.add(serviceConnection);
        }
    }

    @Override // moe.shizuku.server.IShizukuServiceConnection
    public final void connected(final IBinder iBinder) {
        f54467.post(new Runnable() { // from class: l.֫ۙ۠
            @Override // java.lang.Runnable
            public final void run() {
                BinderC17823.m41764(this.f5645, iBinder);
            }
        });
        try {
            iBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: l.ۧۙ۠
                @Override // android.os.IBinder.DeathRecipient
                public final void binderDied() {
                    this.f32417.died();
                }
            }, 0);
        } catch (RemoteException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41764(BinderC17823 binderC17823, IBinder iBinder) {
        Iterator it = binderC17823.f54468.iterator();
        while (it.hasNext()) {
            ((ServiceConnection) it.next()).onServiceConnected(binderC17823.f54469, iBinder);
        }
    }

    @Override // moe.shizuku.server.IShizukuServiceConnection
    public final void died() {
        if (this.f54470) {
            return;
        }
        this.f54470 = true;
        f54467.post(new Runnable() { // from class: l.ܽۙ۠
            @Override // java.lang.Runnable
            public final void run() {
                BinderC17823.m41763(this.f50487);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41763(BinderC17823 binderC17823) {
        HashSet hashSet = binderC17823.f54468;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((ServiceConnection) it.next()).onServiceDisconnected(binderC17823.f54469);
        }
        hashSet.clear();
        C17117.m40146(binderC17823);
    }
}
