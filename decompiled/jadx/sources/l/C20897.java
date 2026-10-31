package l;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: renamed from: l.᩷۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 866M */
/* JADX INFO: loaded from: classes4.dex */
public class C20897 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object[] f67599;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Object[] f67600;

    public C20897(AbstractC9608 abstractC9608) {
        Object[] objArr = new Object[abstractC9608.size()];
        Object[] objArr2 = new Object[abstractC9608.size()];
        AbstractC20151 it = abstractC9608.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        this.f67599 = objArr;
        this.f67600 = objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object readResolve() {
        Object[] objArr = this.f67599;
        boolean z = objArr instanceof AbstractC6079;
        Object[] objArr2 = this.f67600;
        if (z) {
            AbstractC6079 abstractC6079 = (AbstractC6079) objArr;
            C6785 c6785Mo29568 = mo29568(abstractC6079.size());
            AbstractC20151 it = abstractC6079.iterator();
            AbstractC20151 it2 = ((AbstractC22725) objArr2).iterator();
            while (it.hasNext()) {
                c6785Mo29568.mo18428(it.next(), it2.next());
            }
            return c6785Mo29568.mo18430();
        }
        C6785 c6785Mo29569 = mo29568(objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            c6785Mo29569.mo18428(objArr[i], objArr2[i]);
        }
        return c6785Mo29569.mo18430();
    }

    /* JADX INFO: renamed from: ֫ */
    public C6785 mo29568(int i) {
        return new C6785(i);
    }
}
