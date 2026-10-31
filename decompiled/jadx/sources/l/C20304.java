package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶ܿ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: P5BM */
/* JADX INFO: loaded from: classes4.dex */
public final class C20304 implements Iterator {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Object f65562;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C9015 f65563;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C18893 f65564;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Object f65565;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f65566;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C18893 f65567;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C18893 f65568;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f65566) {
            return this.f65562 != null;
        }
        C9015 c9015 = this.f65563;
        if (c9015 != null && c9015.size() > 0) {
            return true;
        }
        Object obj = this.f65565;
        if (obj == null) {
            return false;
        }
        if (((InterfaceC22420) obj).getChildCount() > 0) {
            return true;
        }
        Object obj2 = this.f65565;
        return (obj2 == null ? null : ((InterfaceC22420) obj2).getParent()) != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C18893 c18893 = this.f65568;
        C9015 c9015 = this.f65563;
        if (this.f65566) {
            this.f65566 = false;
            Object obj = this.f65565;
            if ((obj != null ? ((InterfaceC22420) obj).getChildCount() : 0) == 0) {
                c9015.m23261(c18893);
                return this.f65565;
            }
            return this.f65565;
        }
        if (c9015 != null && c9015.size() > 0) {
            return c9015.mo23262();
        }
        Object obj2 = this.f65565;
        if (obj2 == null) {
            return c18893;
        }
        if (((InterfaceC22420) obj2).getChildCount() > 0) {
            Object obj3 = this.f65565;
            InterfaceC22420 interfaceC22420Mo8350 = obj3 != null ? ((InterfaceC22420) obj3).mo8350(0) : null;
            this.f65565 = interfaceC22420Mo8350;
            c9015.m23261(interfaceC22420Mo8350);
            return this.f65567;
        }
        Object obj4 = this.f65565;
        InterfaceC22420 parent = obj4 == null ? null : ((InterfaceC22420) obj4).getParent();
        while (parent != null) {
            Object obj5 = this.f65565;
            if ((obj5 == null ? 0 : ((InterfaceC22420) obj5).mo8352()) + 1 < parent.getChildCount()) {
                break;
            }
            c9015.m23261(this.f65564);
            this.f65565 = parent;
            parent = parent.getParent();
        }
        if (parent == null) {
            this.f65565 = null;
            c9015.m23261(c18893);
            return c9015.mo23262();
        }
        Object obj6 = this.f65565;
        InterfaceC22420 interfaceC22420Mo8351 = parent.mo8350((obj6 != null ? ((InterfaceC22420) obj6).mo8352() : 0) + 1);
        this.f65565 = interfaceC22420Mo8351;
        c9015.m23261(interfaceC22420Mo8351);
        return c9015.mo23262();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
