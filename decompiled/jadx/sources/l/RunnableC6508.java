package l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: renamed from: l.ۜۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC6508 implements Runnable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f20094;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f20095;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f20096;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0157 f20097;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0863 f20098;

    public RunnableC6508(int i, int i2, Bundle bundle, C0157 c0157, C0863 c0863, String str) {
        this.f20097 = c0157;
        this.f20098 = c0863;
        this.f20095 = str;
        this.f20096 = i;
        this.f20094 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0863 c0863 = this.f20098;
        IBinder binder = c0863.f3353.getBinder();
        C0157 c0157 = this.f20097;
        c0157.f1338.f45642.remove(binder);
        AbstractServiceC14974 abstractServiceC14974 = c0157.f1338;
        C9996 c9996 = new C9996(abstractServiceC14974, this.f20095, this.f20096, this.f20094, c0863);
        if (abstractServiceC14974.m35456() == null) {
            try {
                c0863.m3173();
            } catch (RemoteException unused) {
            }
        } else {
            try {
                abstractServiceC14974.f45642.put(binder, c9996);
                binder.linkToDeath(c9996, 0);
            } catch (RemoteException unused2) {
                abstractServiceC14974.f45642.remove(binder);
            }
        }
    }
}
