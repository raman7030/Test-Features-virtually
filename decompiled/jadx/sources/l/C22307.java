package l;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: renamed from: l.᩹۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5XH */
/* JADX INFO: loaded from: classes.dex */
public final class C22307 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC9608 f72320;

    public C22307(AbstractC9608 abstractC9608) {
        this.f72320 = abstractC9608;
    }

    public Object readResolve() {
        AbstractC9608 abstractC9608 = this.f72320;
        if (abstractC9608.isEmpty()) {
            return C20191.m46426();
        }
        C21602 c21602 = new C21602();
        AbstractC20151 it = abstractC9608.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c21602.m48780((C13758) entry.getKey(), entry.getValue());
        }
        return c21602.m48779();
    }
}
