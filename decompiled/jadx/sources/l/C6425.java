package l;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜ֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 78OY */
/* JADX INFO: loaded from: classes3.dex */
public final class C6425 implements InterfaceC19251 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f19866 = new ArrayList(50);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Handler f19867;

    public C6425(Handler handler) {
        this.f19867 = handler;
    }

    @Override // l.InterfaceC19251
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Looper mo17764() {
        return this.f19867.getLooper();
    }

    @Override // l.InterfaceC19251
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo17758() {
        return this.f19867.hasMessages(1);
    }

    @Override // l.InterfaceC19251
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18545 mo17754(int i) {
        C23358 c23358M17753 = m17753();
        c23358M17753.m51767(this.f19867.obtainMessage(i));
        return c23358M17753;
    }

    @Override // l.InterfaceC19251
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18545 mo17757(int i, Object obj) {
        C23358 c23358M17753 = m17753();
        c23358M17753.m51767(this.f19867.obtainMessage(i, obj));
        return c23358M17753;
    }

    @Override // l.InterfaceC19251
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18545 mo17755(int i, int i2, int i3) {
        C23358 c23358M17753 = m17753();
        c23358M17753.m51767(this.f19867.obtainMessage(i, i2, i3));
        return c23358M17753;
    }

    @Override // l.InterfaceC19251
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18545 mo17756(int i, int i2, Object obj) {
        C23358 c23358M17753 = m17753();
        c23358M17753.m51767(this.f19867.obtainMessage(i, 0, i2, obj));
        return c23358M17753;
    }

    @Override // l.InterfaceC19251
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo17761(InterfaceC18545 interfaceC18545) {
        return ((C23358) interfaceC18545).m51768(this.f19867);
    }

    @Override // l.InterfaceC19251
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo17763(int i) {
        return this.f19867.sendEmptyMessage(i);
    }

    @Override // l.InterfaceC19251
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo17759(long j) {
        return this.f19867.sendEmptyMessageAtTime(2, j);
    }

    @Override // l.InterfaceC19251
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo17765(int i) {
        C22632.m50631(i != 0);
        this.f19867.removeMessages(i);
    }

    @Override // l.InterfaceC19251
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo17762() {
        this.f19867.removeCallbacksAndMessages(null);
    }

    @Override // l.InterfaceC19251
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo17760(Runnable runnable) {
        return this.f19867.post(runnable);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C23358 m17753() {
        C23358 c23358;
        ArrayList arrayList = f19866;
        synchronized (arrayList) {
            if (arrayList.isEmpty()) {
                c23358 = new C23358(0);
            } else {
                c23358 = (C23358) arrayList.remove(arrayList.size() - 1);
            }
        }
        return c23358;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17752(C23358 c23358) {
        ArrayList arrayList = f19866;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(c23358);
            }
        }
    }
}
