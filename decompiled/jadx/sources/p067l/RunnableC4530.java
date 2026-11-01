package p067l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4530 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ int f10151;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ String f10152;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f10153;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C2517 f10154;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C3188 f10155;

    public RunnableC4530(int i, int i2, Bundle bundle, C2517 c2517, C3188 c3188, String str) {
        this.f10154 = c2517;
        this.f10155 = c3188;
        this.f10151 = i;
        this.f10152 = str;
        this.f10153 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11868 c11868;
        C3188 c3188 = this.f10155;
        IBinder binder = c3188.f6126.getBinder();
        C2517 c2517 = this.f10154;
        c2517.f4113.f48755.remove(binder);
        AbstractServiceC16599 abstractServiceC16599 = c2517.f4113;
        Iterator it = abstractServiceC16599.f48753.iterator();
        while (true) {
            c11868 = null;
            if (!it.hasNext()) {
                break;
            }
            C11868 c11869 = (C11868) it.next();
            if (c11869.f33075 == this.f10151) {
                c11868 = (TextUtils.isEmpty(this.f10152) || this.f10153 <= 0) ? new C11868(abstractServiceC16599, c11869.f33076, c11869.f33074, c11869.f33075, c3188) : null;
                it.remove();
                break;
            }
        }
        if (c11868 == null) {
            c11868 = new C11868(abstractServiceC16599, this.f10152, this.f10153, this.f10151, c3188);
        }
        abstractServiceC16599.f48755.put(binder, c11868);
        try {
            binder.linkToDeath(c11868, 0);
        } catch (RemoteException unused) {
        }
    }
}
