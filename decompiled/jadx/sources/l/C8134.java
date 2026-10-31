package l;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.۠ۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8T9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8134 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f25105;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15894 f25106;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f25107;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21590(Handler handler, InterfaceC15188 interfaceC15188) {
        handler.getClass();
        C1078 c1078 = new C1078();
        c1078.f3942 = handler;
        c1078.f3943 = interfaceC15188;
        this.f25105.add(c1078);
    }

    public C8134() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public C8134(CopyOnWriteArrayList copyOnWriteArrayList, int i, C15894 c15894) {
        this.f25105 = copyOnWriteArrayList;
        this.f25107 = i;
        this.f25106 = c15894;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8134 m21589(int i, C15894 c15894) {
        return new C8134(this.f25105, i, c15894);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21594(InterfaceC15188 interfaceC15188) {
        CopyOnWriteArrayList<C1078> copyOnWriteArrayList = this.f25105;
        for (C1078 c1078 : copyOnWriteArrayList) {
            if (c1078.f3943 == interfaceC15188) {
                copyOnWriteArrayList.remove(c1078);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21592(C10957 c10957, int i, int i2, C8353 c8353, int i3, Object obj, long j, long j2, int i4) {
        m21595(new C5312(this, c10957, new C6723(i, i2, c8353, i3, obj, C3603.m11037(j), C3603.m11037(j2)), i4));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m21596(C10957 c10957, int i, int i2, C8353 c8353, int i3, Object obj, long j, long j2) {
        m21595(new C0372(this, c10957, new C6723(i, i2, c8353, i3, obj, C3603.m11037(j), C3603.m11037(j2))));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21591(C10957 c10957, int i, int i2, C8353 c8353, int i3, Object obj, long j, long j2) {
        m21595(new C19424(this, c10957, new C6723(i, i2, c8353, i3, obj, C3603.m11037(j), C3603.m11037(j2))));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21593(C10957 c10957, int i, int i2, C8353 c8353, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        m21595(new C18718(this, c10957, new C6723(i, i2, c8353, i3, obj, C3603.m11037(j), C3603.m11037(j2)), iOException, z));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21595(InterfaceC23483 interfaceC23483) {
        for (C1078 c1078 : this.f25105) {
            C3603.m11023(c1078.f3942, new RunnableC3239(2, interfaceC23483, c1078.f3943));
        }
    }
}
