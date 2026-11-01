package p067l;

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
public final class BinderC19307 extends IShizukuServiceConnection.Stub {

    /* JADX INFO: renamed from: ۜ */
    public static final Handler f57663 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ܿ */
    public final ComponentName f57665;

    /* JADX INFO: renamed from: ܳ */
    public final HashSet f57664 = new HashSet();

    /* JADX INFO: renamed from: ᩻ */
    public boolean f57666 = false;

    public BinderC19307(C13705 c13705) {
        this.f57665 = c13705.f38668;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44011(ServiceConnection serviceConnection) {
        if (serviceConnection != null) {
            this.f57664.add(serviceConnection);
        }
    }

    @Override // moe.shizuku.server.IShizukuServiceConnection
    public final void connected(final IBinder iBinder) {
        f57663.post(new Runnable() { // from class: l.֫ۙ۠
            @Override // java.lang.Runnable
            public final void run() {
                BinderC19307.m44010(this.f8424, iBinder);
            }
        });
        try {
            iBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: l.ۧۙ۠
                @Override // android.os.IBinder.DeathRecipient
                public final void binderDied() {
                    this.f35392.died();
                }
            }, 0);
        } catch (RemoteException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m44010(BinderC19307 binderC19307, IBinder iBinder) {
        Iterator it = binderC19307.f57664.iterator();
        while (it.hasNext()) {
            ((ServiceConnection) it.next()).onServiceConnected(binderC19307.f57665, iBinder);
        }
    }

    @Override // moe.shizuku.server.IShizukuServiceConnection
    public final void died() {
        if (this.f57666) {
            return;
        }
        this.f57666 = true;
        f57663.post(new Runnable() { // from class: l.ܽۙ۠
            @Override // java.lang.Runnable
            public final void run() {
                BinderC19307.m44009(this.f53659);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m44009(BinderC19307 binderC19307) {
        HashSet hashSet = binderC19307.f57664;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((ServiceConnection) it.next()).onServiceDisconnected(binderC19307.f57665);
        }
        hashSet.clear();
        C18636.m42391(binderC19307);
    }
}
