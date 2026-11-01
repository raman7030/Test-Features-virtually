package p067l;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜ֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 78OY */
/* JADX INFO: loaded from: classes3.dex */
public final class C8474 implements InterfaceC20664 {

    /* JADX INFO: renamed from: ۧ */
    public static final ArrayList f22738 = new ArrayList(50);

    /* JADX INFO: renamed from: ֫ */
    public final Handler f22739;

    public C8474(Handler handler) {
        this.f22739 = handler;
    }

    @Override // p067l.InterfaceC20664
    /* JADX INFO: renamed from: ܽ */
    public final Looper mo19711() {
        return this.f22739.getLooper();
    }

    @Override // p067l.InterfaceC20664
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo19705() {
        return this.f22739.hasMessages(1);
    }

    @Override // p067l.InterfaceC20664
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19993 mo19701(int i) {
        C24567 c24567M19700 = m19700();
        c24567M19700.m54165(this.f22739.obtainMessage(i));
        return c24567M19700;
    }

    @Override // p067l.InterfaceC20664
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19993 mo19704(int i, Object obj) {
        C24567 c24567M19700 = m19700();
        c24567M19700.m54165(this.f22739.obtainMessage(i, obj));
        return c24567M19700;
    }

    @Override // p067l.InterfaceC20664
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19993 mo19702(int i, int i2, int i3) {
        C24567 c24567M19700 = m19700();
        c24567M19700.m54165(this.f22739.obtainMessage(i, i2, i3));
        return c24567M19700;
    }

    @Override // p067l.InterfaceC20664
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19993 mo19703(int i, int i2, Object obj) {
        C24567 c24567M19700 = m19700();
        c24567M19700.m54165(this.f22739.obtainMessage(i, 0, i2, obj));
        return c24567M19700;
    }

    @Override // p067l.InterfaceC20664
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo19708(InterfaceC19993 interfaceC19993) {
        return ((C24567) interfaceC19993).m54166(this.f22739);
    }

    @Override // p067l.InterfaceC20664
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo19710(int i) {
        return this.f22739.sendEmptyMessage(i);
    }

    @Override // p067l.InterfaceC20664
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo19706(long j) {
        return this.f22739.sendEmptyMessageAtTime(2, j);
    }

    @Override // p067l.InterfaceC20664
    /* JADX INFO: renamed from: ܽ */
    public final void mo19712(int i) {
        C23877.m52957(i != 0);
        this.f22739.removeMessages(i);
    }

    @Override // p067l.InterfaceC20664
    /* JADX INFO: renamed from: ۧ */
    public final void mo19709() {
        this.f22739.removeCallbacksAndMessages(null);
    }

    @Override // p067l.InterfaceC20664
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo19707(Runnable runnable) {
        return this.f22739.post(runnable);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C24567 m19700() {
        C24567 c24567;
        ArrayList arrayList = f22738;
        synchronized (arrayList) {
            if (arrayList.isEmpty()) {
                c24567 = new C24567(0);
            } else {
                c24567 = (C24567) arrayList.remove(arrayList.size() - 1);
            }
        }
        return c24567;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m19699(C24567 c24567) {
        ArrayList arrayList = f22738;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(c24567);
            }
        }
    }
}
