package p067l;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.ۙܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38N3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6922 {

    /* JADX INFO: renamed from: ֫ */
    public final CopyOnWriteArrayList f18020 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final void m15856(InterfaceC5581 interfaceC5581) {
        CopyOnWriteArrayList<C21675> copyOnWriteArrayList = this.f18020;
        for (C21675 c21675 : copyOnWriteArrayList) {
            if (c21675.f68281 == interfaceC5581) {
                c21675.m48918();
                copyOnWriteArrayList.remove(c21675);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15854(final long j, final int i, final long j2) {
        for (final C21675 c21675 : this.f18020) {
            if (!c21675.f68282) {
                c21675.f68280.post(new Runnable() { // from class: l.᩹ܿۧ
                    @Override // java.lang.Runnable
                    public final void run() {
                        c21675.f68281.mo12350(j, i, j2);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15855(Handler handler, InterfaceC5581 interfaceC5581) {
        interfaceC5581.getClass();
        m15856(interfaceC5581);
        this.f18020.add(new C21675(handler, interfaceC5581));
    }
}
