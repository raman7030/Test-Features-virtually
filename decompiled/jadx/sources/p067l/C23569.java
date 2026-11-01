package p067l;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: renamed from: l.᩹۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5XH */
/* JADX INFO: loaded from: classes.dex */
public final class C23569 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC11500 f75047;

    public C23569(AbstractC11500 abstractC11500) {
        this.f75047 = abstractC11500;
    }

    public Object readResolve() {
        AbstractC11500 abstractC11500 = this.f75047;
        if (abstractC11500.isEmpty()) {
            return C21558.m48745();
        }
        C22899 c22899 = new C22899();
        AbstractC21520 it = abstractC11500.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c22899.m51127((C15444) entry.getKey(), entry.getValue());
        }
        return c22899.m51126();
    }
}
