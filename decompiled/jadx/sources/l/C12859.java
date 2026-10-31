package l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.۬ۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes3.dex */
public final class C12859 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Iterator f38622;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Map.Entry f38623;

    public C12859(AbstractC12154 abstractC12154) {
        Iterator itM44319 = abstractC12154.f36261.m44319();
        this.f38622 = itM44319;
        if (itM44319.hasNext()) {
            this.f38623 = (Map.Entry) itM44319.next();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31295(int i, AbstractC14766 abstractC14766) {
        while (true) {
            Map.Entry entry = this.f38623;
            if (entry == null || ((C0117) entry.getKey()).getNumber() >= i) {
                return;
            }
            C19210.m44297((C0117) this.f38623.getKey(), this.f38623.getValue(), abstractC14766);
            Iterator it = this.f38622;
            if (it.hasNext()) {
                this.f38623 = (Map.Entry) it.next();
            } else {
                this.f38623 = null;
            }
        }
    }
}
