package p067l;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: renamed from: l.᩷۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 866M */
/* JADX INFO: loaded from: classes4.dex */
public class C22229 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final Object[] f70284;

    /* JADX INFO: renamed from: ᩹ */
    public final Object[] f70285;

    public C22229(AbstractC11500 abstractC11500) {
        Object[] objArr = new Object[abstractC11500.size()];
        Object[] objArr2 = new Object[abstractC11500.size()];
        AbstractC21520 it = abstractC11500.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        this.f70284 = objArr;
        this.f70285 = objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object readResolve() {
        Object[] objArr = this.f70284;
        boolean z = objArr instanceof AbstractC8146;
        Object[] objArr2 = this.f70285;
        if (z) {
            AbstractC8146 abstractC8146 = (AbstractC8146) objArr;
            C8817 c8817Mo31633 = mo31633(abstractC8146.size());
            AbstractC21520 it = abstractC8146.iterator();
            AbstractC21520 it2 = ((AbstractC23966) objArr2).iterator();
            while (it.hasNext()) {
                c8817Mo31633.mo20376(it.next(), it2.next());
            }
            return c8817Mo31633.mo20378();
        }
        C8817 c8817Mo31634 = mo31633(objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            c8817Mo31634.mo20376(objArr[i], objArr2[i]);
        }
        return c8817Mo31634.mo20378();
    }

    /* JADX INFO: renamed from: ֫ */
    public C8817 mo31633(int i) {
        return new C8817(i);
    }
}
