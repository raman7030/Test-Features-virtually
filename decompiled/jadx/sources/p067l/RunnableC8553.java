package p067l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: renamed from: l.ۜۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC8553 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ int f22972;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ String f22973;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f22974;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C2517 f22975;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C3188 f22976;

    public RunnableC8553(int i, int i2, Bundle bundle, C2517 c2517, C3188 c3188, String str) {
        this.f22975 = c2517;
        this.f22976 = c3188;
        this.f22973 = str;
        this.f22974 = i;
        this.f22972 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3188 c3188 = this.f22976;
        IBinder binder = c3188.f6126.getBinder();
        C2517 c2517 = this.f22975;
        c2517.f4113.f48755.remove(binder);
        AbstractServiceC16599 abstractServiceC16599 = c2517.f4113;
        C11868 c11868 = new C11868(abstractServiceC16599, this.f22973, this.f22974, this.f22972, c3188);
        if (abstractServiceC16599.m37612() == null) {
            try {
                c3188.m5487();
            } catch (RemoteException unused) {
            }
        } else {
            try {
                abstractServiceC16599.f48755.put(binder, c11868);
                binder.linkToDeath(c11868, 0);
            } catch (RemoteException unused2) {
                abstractServiceC16599.f48755.remove(binder);
            }
        }
    }
}
