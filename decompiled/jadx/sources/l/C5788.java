package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y1UK */
/* JADX INFO: loaded from: classes3.dex */
public final class C5788 extends AbstractC2821 implements InterfaceC8898 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22016[] f17817;

    public C5788(C22016... c22016Arr) {
        super(2);
        this.f17817 = c22016Arr;
    }

    @Override // l.AbstractC2821, l.InterfaceC8898
    /* JADX INFO: renamed from: ֫ */
    public final void mo1225(C2966 c2966) {
        mo8718(c2966);
        String strM9074 = c2966.m9074();
        if (strM9074 != null) {
            AbstractC19900 abstractC19900M16258 = m16258(C9523.m24408(strM9074));
            if (abstractC19900M16258 instanceof C2966) {
                c2966.m9075((C2966) abstractC19900M16258);
            }
        }
    }

    @Override // l.AbstractC2821
    /* JADX INFO: renamed from: ۧ */
    public final void mo8718(C2966 c2966) {
        AbstractC19900 abstractC19900M16258;
        if (c2966.m45789() != null && (abstractC19900M16258 = m16258(c2966.m45789())) != null) {
            c2966.m45793(abstractC19900M16258);
            abstractC19900M16258.m45784(c2966);
        }
        Iterator<E> it = c2966.m45798().iterator();
        while (it.hasNext()) {
            AbstractC19900 abstractC19900M16259 = m16258((String) it.next());
            if (abstractC19900M16259 != null) {
                c2966.m45787(abstractC19900M16259);
                abstractC19900M16259.m45784(c2966);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private AbstractC19900 m16258(String str) {
        for (C22016 c22016 : this.f17817) {
            AbstractC19900 abstractC19900M49539 = c22016.m49539(str);
            if (abstractC19900M49539 != null) {
                return abstractC19900M49539;
            }
        }
        return null;
    }
}
