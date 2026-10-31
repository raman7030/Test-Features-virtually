package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G9LE */
/* JADX INFO: loaded from: classes4.dex */
public final class C18871 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Executor f59488;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f59489 = new Object();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f59490 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f59491;

    public C18871(Executor executor, C3184 c3184) {
        this.f59488 = executor;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m43578() {
        boolean z;
        synchronized (this.f59489) {
            z = this.f59491;
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43577() {
        synchronized (this.f59489) {
            this.f59491 = true;
            Iterator it = this.f59490.iterator();
            while (it.hasNext()) {
                ((InterfaceC2123) it.next()).mo4049();
            }
            this.f59490.clear();
            C8058 c8058 = C8058.f24861;
        }
    }
}
