package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳ᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: D3VQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C16470 extends AbstractC3651 {

    /* JADX INFO: renamed from: ᩶ */
    public final Iterator f48370;

    public C16470(C25188 c25188) {
        this.f48370 = C25188.f80563.m12198(c25188.f80564).iterator();
    }

    @Override // p067l.AbstractC3651
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4282() {
        Iterator it = this.f48370;
        if (it.hasNext()) {
            String str = (String) it.next();
            if (it.hasNext() || !str.isEmpty()) {
                return str;
            }
        }
        m6947();
        return null;
    }
}
