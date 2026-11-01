package p067l;

import java.io.Closeable;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫᩵ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6S3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4305 implements InterfaceC18588 {

    /* JADX INFO: renamed from: ᩶ */
    public final HashSet f9576 = new HashSet();

    /* JADX INFO: renamed from: ᩸ */
    public volatile boolean f9577;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f9578;

    public final synchronized void cancel() {
        this.f9577 = true;
        Iterator it = this.f9576.iterator();
        while (it.hasNext()) {
            ((C9649) it.next()).m22440();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m8752() {
        if (this.f9577) {
            throw new IllegalStateException("Canceled input cannot be handed off");
        }
        this.f9578 = true;
        this.f9576.clear();
    }

    /* JADX INFO: renamed from: ܿ */
    public final synchronized boolean m8753() {
        return this.f9576.isEmpty();
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        return this.f9577;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m8751(C4305 c4305, C9649 c9649) {
        synchronized (c4305) {
            c4305.f9576.remove(c9649);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Closeable m8750(Closeable closeable, InterfaceC18588 interfaceC18588) {
        if (!(interfaceC18588 instanceof C4305)) {
            return closeable;
        }
        C4305 c4305 = (C4305) interfaceC18588;
        C9649 c9649 = new C9649(c4305, closeable);
        synchronized (c4305) {
            if (c4305.f9578) {
                return c9649;
            }
            c4305.f9576.add(c9649);
            if (c4305.f9577) {
                c9649.m22440();
            }
            return c9649;
        }
    }
}
