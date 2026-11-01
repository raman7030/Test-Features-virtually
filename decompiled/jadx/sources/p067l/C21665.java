package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶ܿ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: P5BM */
/* JADX INFO: loaded from: classes4.dex */
public final class C21665 implements Iterator {

    /* JADX INFO: renamed from: ۗ */
    public Object f68237;

    /* JADX INFO: renamed from: ۙ */
    public C10936 f68238;

    /* JADX INFO: renamed from: ۫ */
    public C20324 f68239;

    /* JADX INFO: renamed from: ۬ */
    public Object f68240;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f68241;

    /* JADX INFO: renamed from: ᩸ */
    public C20324 f68242;

    /* JADX INFO: renamed from: ᩹ */
    public C20324 f68243;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f68241) {
            return this.f68237 != null;
        }
        C10936 c10936 = this.f68238;
        if (c10936 != null && c10936.size() > 0) {
            return true;
        }
        Object obj = this.f68240;
        if (obj == null) {
            return false;
        }
        if (((InterfaceC23676) obj).getChildCount() > 0) {
            return true;
        }
        Object obj2 = this.f68240;
        return (obj2 == null ? null : ((InterfaceC23676) obj2).getParent()) != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C20324 c20324 = this.f68243;
        C10936 c10936 = this.f68238;
        if (this.f68241) {
            this.f68241 = false;
            Object obj = this.f68240;
            if ((obj != null ? ((InterfaceC23676) obj).getChildCount() : 0) == 0) {
                c10936.m25205(c20324);
                return this.f68240;
            }
            return this.f68240;
        }
        if (c10936 != null && c10936.size() > 0) {
            return c10936.mo25206();
        }
        Object obj2 = this.f68240;
        if (obj2 == null) {
            return c20324;
        }
        if (((InterfaceC23676) obj2).getChildCount() > 0) {
            Object obj3 = this.f68240;
            InterfaceC23676 interfaceC23676Mo10396 = obj3 != null ? ((InterfaceC23676) obj3).mo10396(0) : null;
            this.f68240 = interfaceC23676Mo10396;
            c10936.m25205(interfaceC23676Mo10396);
            return this.f68242;
        }
        Object obj4 = this.f68240;
        InterfaceC23676 parent = obj4 == null ? null : ((InterfaceC23676) obj4).getParent();
        while (parent != null) {
            Object obj5 = this.f68240;
            if ((obj5 == null ? 0 : ((InterfaceC23676) obj5).mo10398()) + 1 < parent.getChildCount()) {
                break;
            }
            c10936.m25205(this.f68239);
            this.f68240 = parent;
            parent = parent.getParent();
        }
        if (parent == null) {
            this.f68240 = null;
            c10936.m25205(c20324);
            return c10936.mo25206();
        }
        Object obj6 = this.f68240;
        InterfaceC23676 interfaceC23676Mo10397 = parent.mo10396((obj6 != null ? ((InterfaceC23676) obj6).mo10398() : 0) + 1);
        this.f68240 = interfaceC23676Mo10397;
        c10936.m25205(interfaceC23676Mo10397);
        return c10936.mo25206();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
