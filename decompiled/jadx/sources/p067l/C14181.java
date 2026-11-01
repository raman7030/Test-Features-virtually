package p067l;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5608 */
/* JADX INFO: loaded from: classes4.dex */
public class C14181 extends AbstractC7873 {

    /* JADX INFO: renamed from: ܿ */
    public Object[] f40439;

    /* JADX INFO: renamed from: ᩳ */
    public int f40440;

    public C14181() {
        super(4);
    }

    /* JADX INFO: renamed from: ֫ */
    public C14181 mo32662(Object... objArr) {
        if (this.f40439 != null) {
            for (Object obj : objArr) {
                mo8328(obj);
            }
            return this;
        }
        m18181(objArr.length, objArr);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public C14181 mo32661(C14181 c14181) {
        if (this.f40439 != null) {
            for (int i = 0; i < c14181.f20666; i++) {
                Object obj = c14181.f20664[i];
                C12826.requireNonNull(obj);
                mo8328(obj);
            }
            return this;
        }
        m18181(c14181.f20666, c14181.f20664);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC8146 mo32660() {
        AbstractC8146 abstractC8146M18924;
        int i = this.f20666;
        if (i == 0) {
            int i2 = AbstractC8146.f21506;
            return C22034.f69338;
        }
        if (i == 1) {
            Object obj = this.f20664[0];
            C12826.requireNonNull(obj);
            int i3 = AbstractC8146.f21506;
            return new C22704(obj);
        }
        if (this.f40439 == null || AbstractC8146.m18917(i) != this.f40439.length) {
            abstractC8146M18924 = AbstractC8146.m18924(this.f20666, this.f20664);
            this.f20666 = abstractC8146M18924.size();
        } else {
            int i4 = this.f20666;
            Object[] objArrCopyOf = this.f20664;
            int length = objArrCopyOf.length;
            if (i4 < (length >> 1) + (length >> 2)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            }
            int i5 = this.f40440;
            Object[] objArr = this.f40439;
            abstractC8146M18924 = new C22034(i5, objArr.length - 1, this.f20666, objArrCopyOf, objArr);
        }
        this.f20665 = true;
        this.f40439 = null;
        return abstractC8146M18924;
    }

    @Override // p067l.AbstractC7873
    /* JADX INFO: renamed from: ֫ */
    public C14181 mo18180(Iterable iterable) {
        iterable.getClass();
        if (this.f40439 != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                mo8328(it.next());
            }
            return this;
        }
        mo18180(iterable);
        return this;
    }

    @Override // p067l.AbstractC13238
    /* JADX INFO: renamed from: ֫ */
    public C14181 mo8328(Object obj) {
        obj.getClass();
        if (this.f40439 != null) {
            int iM18917 = AbstractC8146.m18917(this.f20666);
            Object[] objArr = this.f40439;
            if (iM18917 <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iM11131 = C5191.m11131(iHashCode);
                while (true) {
                    int i = iM11131 & length;
                    Object[] objArr2 = this.f40439;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.f40440 += iHashCode;
                        m18182(obj);
                        return this;
                    }
                    if (obj2.equals(obj)) {
                        return this;
                    }
                    iM11131 = i + 1;
                }
            }
        }
        this.f40439 = null;
        m18182(obj);
        return this;
    }
}
