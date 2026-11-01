package p067l;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.ܶۛ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 38V0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16658 {

    /* JADX INFO: renamed from: ֫ */
    public final CopyOnWriteArrayList f48936;

    /* JADX INFO: renamed from: ۧ */
    public final C17474 f48937;

    /* JADX INFO: renamed from: ܽ */
    public final int f48938;

    public C16658() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public C16658(CopyOnWriteArrayList copyOnWriteArrayList, int i, C17474 c17474) {
        this.f48936 = copyOnWriteArrayList;
        this.f48938 = i;
        this.f48937 = c17474;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16658 m37717(int i, C17474 c17474) {
        return new C16658(this.f48936, i, c17474);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37722(InterfaceC22695 interfaceC22695) {
        CopyOnWriteArrayList<C9954> copyOnWriteArrayList = this.f48936;
        for (C9954 c9954 : copyOnWriteArrayList) {
            if (c9954.f27566 == interfaceC22695) {
                copyOnWriteArrayList.remove(c9954);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37720(Handler handler, InterfaceC22695 interfaceC22695) {
        handler.getClass();
        C9954 c9954 = new C9954();
        c9954.f27565 = handler;
        c9954.f27566 = interfaceC22695;
        this.f48936.add(c9954);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l.᩸ۛ֫] */
    /* JADX INFO: renamed from: ֫ */
    public final void m37719(final int i) {
        for (C9954 c9954 : this.f48936) {
            final ?? r2 = c9954.f27566;
            C5792.m12999(c9954.f27565, new Runnable() { // from class: l.ۚۛ֫
                /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l.᩸ۛ֫] */
                @Override // java.lang.Runnable
                public final void run() {
                    C16658 c16658 = this.f18966;
                    r2.mo23094(c16658.f48938, c16658.f48937, i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37718() {
        for (C9954 c9954 : this.f48936) {
            C5792.m12999(c9954.f27565, new RunnableC5447(1, this, c9954.f27566));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l.᩸ۛ֫] */
    /* JADX INFO: renamed from: ֫ */
    public final void m37721(final Exception exc) {
        for (C9954 c9954 : this.f48936) {
            final ?? r2 = c9954.f27566;
            C5792.m12999(c9954.f27565, new Runnable() { // from class: l.֨ۛ֫
                /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l.᩸ۛ֫] */
                @Override // java.lang.Runnable
                public final void run() {
                    C16658 c16658 = this.f6329;
                    r2.mo23095(c16658.f48938, c16658.f48937, exc);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m37723() {
        for (C9954 c9954 : this.f48936) {
            C5792.m12999(c9954.f27565, new RunnableC13871(1, this, c9954.f27566));
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m37724() {
        for (C9954 c9954 : this.f48936) {
            C5792.m12999(c9954.f27565, new RunnableC11834(2, this, c9954.f27566));
        }
    }
}
