package p067l;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨ۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8ZW */
/* JADX INFO: loaded from: classes3.dex */
public final class C13504 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f37975;

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f37976 = new HashMap(2);

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4406 m30662() {
        if (!this.f37975) {
            this.f37975 = true;
            HashMap map = this.f37976;
            if (map.size() <= 0) {
                return new C15514(2);
            }
            return new C24232(C21562.unmodifiableMap(map));
        }
        throw new IllegalStateException("Builder has been already built");
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m30664(AbstractC9480 abstractC9480) {
        if (!this.f37975) {
            Iterator it = abstractC9480.mo8183().iterator();
            while (it.hasNext()) {
                this.f37976.put((String) it.next(), abstractC9480);
            }
            return;
        }
        throw new IllegalStateException("Builder has been already built");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30663(AbstractC9480 abstractC9480) {
        for (String str : abstractC9480.mo8183()) {
            HashMap map = this.f37976;
            if (!map.containsKey(str)) {
                map.put(str, abstractC9480);
            }
        }
    }
}
