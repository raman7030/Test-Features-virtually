package l;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T20C */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0525 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f2183 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC2123 f2184;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f2185;

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo1201();

    public AbstractC0525(boolean z) {
        this.f2185 = z;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m2242() {
        return this.f2185;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2240(boolean z) {
        this.f2185 = z;
        InterfaceC2123 interfaceC2123 = this.f2184;
        if (interfaceC2123 != null) {
            interfaceC2123.mo4049();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC2123 m2237() {
        return this.f2184;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2238(InterfaceC2123 interfaceC2123) {
        this.f2184 = interfaceC2123;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m2243() {
        Iterator it = this.f2183.iterator();
        while (it.hasNext()) {
            ((InterfaceC4595) it.next()).cancel();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2239(InterfaceC4595 interfaceC4595) {
        this.f2183.add(interfaceC4595);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m2241(InterfaceC4595 interfaceC4595) {
        this.f2183.remove(interfaceC4595);
    }
}
