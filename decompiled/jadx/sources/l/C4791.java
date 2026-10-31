package l;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.ۙܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38N3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4791 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f15188 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13976(InterfaceC3380 interfaceC3380) {
        CopyOnWriteArrayList<C20314> copyOnWriteArrayList = this.f15188;
        for (C20314 c20314 : copyOnWriteArrayList) {
            if (c20314.f65606 == interfaceC3380) {
                c20314.m46595();
                copyOnWriteArrayList.remove(c20314);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13974(final long j, final int i, final long j2) {
        for (final C20314 c20314 : this.f15188) {
            if (!c20314.f65607) {
                c20314.f65605.post(new Runnable() { // from class: l.᩹ܿۧ
                    @Override // java.lang.Runnable
                    public final void run() {
                        c20314.f65606.mo10312(j, i, j2);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13975(Handler handler, InterfaceC3380 interfaceC3380) {
        interfaceC3380.getClass();
        m13976(interfaceC3380);
        this.f15188.add(new C20314(handler, interfaceC3380));
    }
}
