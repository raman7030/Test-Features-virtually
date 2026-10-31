package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛۛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7EP */
/* JADX INFO: loaded from: classes2.dex */
public final class C5868 implements Iterable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f18006;

    public C5868(int i) {
        this.f18006 = new ArrayList(i);
    }

    public C5868() {
        this(12);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f18006.iterator();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16430(InterfaceC1800 interfaceC1800) {
        this.f18006.add(interfaceC1800);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16646 m16428(C17281 c17281) {
        return C5378.stream(this.f18006).filter(c17281).findFirst();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m16431() {
        Iterator it = this.f18006.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((InterfaceC1800) it.next()).getLength();
        }
        return length + 2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16429(InterfaceC0408 interfaceC0408) throws IOException {
        C6053 c6053 = (C6053) interfaceC0408;
        c6053.m16889(this.f18006.size());
        m16432(c6053);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m16432(InterfaceC0408 interfaceC0408) {
        Iterator it = this.f18006.iterator();
        while (it.hasNext()) {
            ((InterfaceC1800) it.next()).mo2828(interfaceC0408);
        }
    }
}
