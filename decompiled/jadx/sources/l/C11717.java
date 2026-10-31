package l;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨ۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8ZW */
/* JADX INFO: loaded from: classes3.dex */
public final class C11717 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f34975;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f34976 = new HashMap(2);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC2143 m28614() {
        if (!this.f34975) {
            this.f34975 = true;
            HashMap map = this.f34976;
            if (map.size() <= 0) {
                return new C13832(2);
            }
            return new C23005(C20195.unmodifiableMap(map));
        }
        throw new IllegalStateException("Builder has been already built");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28616(AbstractC7483 abstractC7483) {
        if (!this.f34975) {
            Iterator it = abstractC7483.mo5986().iterator();
            while (it.hasNext()) {
                this.f34976.put((String) it.next(), abstractC7483);
            }
            return;
        }
        throw new IllegalStateException("Builder has been already built");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28615(AbstractC7483 abstractC7483) {
        for (String str : abstractC7483.mo5986()) {
            HashMap map = this.f34976;
            if (!map.containsKey(str)) {
                map.put(str, abstractC7483);
            }
        }
    }
}
