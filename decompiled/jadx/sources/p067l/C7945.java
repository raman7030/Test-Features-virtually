package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛۛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7EP */
/* JADX INFO: loaded from: classes2.dex */
public final class C7945 implements Iterable {

    /* JADX INFO: renamed from: ᩸ */
    public ArrayList f20859;

    public C7945(int i) {
        this.f20859 = new ArrayList(i);
    }

    public C7945() {
        this(12);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f20859.iterator();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18356(InterfaceC4079 interfaceC4079) {
        this.f20859.add(interfaceC4079);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18189 m18354(C18792 c18792) {
        return C7480.stream(this.f20859).filter(c18792).findFirst();
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m18357() {
        Iterator it = this.f20859.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((InterfaceC4079) it.next()).getLength();
        }
        return length + 2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18355(InterfaceC2756 interfaceC2756) throws IOException {
        C8121 c8121 = (C8121) interfaceC2756;
        c8121.m18818(this.f20859.size());
        m18358(c8121);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m18358(InterfaceC2756 interfaceC2756) {
        Iterator it = this.f20859.iterator();
        while (it.hasNext()) {
            ((InterfaceC4079) it.next()).mo5157(interfaceC2756);
        }
    }
}
