package l;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.ܶۛ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 38V0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15036 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f45820;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15894 f45821;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f45822;

    public C15036() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public C15036(CopyOnWriteArrayList copyOnWriteArrayList, int i, C15894 c15894) {
        this.f45820 = copyOnWriteArrayList;
        this.f45822 = i;
        this.f45821 = c15894;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15036 m35560(int i, C15894 c15894) {
        return new C15036(this.f45820, i, c15894);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35565(InterfaceC21388 interfaceC21388) {
        CopyOnWriteArrayList<C7982> copyOnWriteArrayList = this.f45820;
        for (C7982 c7982 : copyOnWriteArrayList) {
            if (c7982.f24653 == interfaceC21388) {
                copyOnWriteArrayList.remove(c7982);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35563(Handler handler, InterfaceC21388 interfaceC21388) {
        handler.getClass();
        C7982 c7982 = new C7982();
        c7982.f24652 = handler;
        c7982.f24653 = interfaceC21388;
        this.f45820.add(c7982);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l.᩸ۛ֫] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35562(final int i) {
        for (C7982 c7982 : this.f45820) {
            final ?? r2 = c7982.f24653;
            C3603.m11023(c7982.f24652, new Runnable() { // from class: l.ۚۛ֫
                /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l.᩸ۛ֫] */
                @Override // java.lang.Runnable
                public final void run() {
                    C15036 c15036 = this.f16127;
                    r2.mo21129(c15036.f45822, c15036.f45821, i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35561() {
        for (C7982 c7982 : this.f45820) {
            C3603.m11023(c7982.f24652, new RunnableC3239(1, this, c7982.f24653));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l.᩸ۛ֫] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35564(final Exception exc) {
        for (C7982 c7982 : this.f45820) {
            final ?? r2 = c7982.f24653;
            C3603.m11023(c7982.f24652, new Runnable() { // from class: l.֨ۛ֫
                /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l.᩸ۛ֫] */
                @Override // java.lang.Runnable
                public final void run() {
                    C15036 c15036 = this.f3554;
                    r2.mo21130(c15036.f45822, c15036.f45821, exc);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m35566() {
        for (C7982 c7982 : this.f45820) {
            C3603.m11023(c7982.f24652, new RunnableC12103(1, this, c7982.f24653));
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m35567() {
        for (C7982 c7982 : this.f45820) {
            C3603.m11023(c7982.f24652, new RunnableC9960(2, this, c7982.f24653));
        }
    }
}
