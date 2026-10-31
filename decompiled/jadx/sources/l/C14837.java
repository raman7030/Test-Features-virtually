package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳ᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: D3VQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C14837 extends AbstractC1349 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Iterator f45254;

    public C14837(C24010 c24010) {
        this.f45254 = C24010.f77811.m10162(c24010.f77812).iterator();
    }

    @Override // l.AbstractC1349
    /* JADX INFO: renamed from: ֫ */
    public final Object mo1890() {
        Iterator it = this.f45254;
        if (it.hasNext()) {
            String str = (String) it.next();
            if (it.hasNext() || !str.isEmpty()) {
                return str;
            }
        }
        m4715();
        return null;
    }
}
