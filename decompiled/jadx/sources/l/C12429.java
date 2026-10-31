package l;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5608 */
/* JADX INFO: loaded from: classes4.dex */
public class C12429 extends AbstractC5792 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Object[] f37422;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f37423;

    public C12429() {
        super(4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12429 mo30597(Object... objArr) {
        if (this.f37422 != null) {
            for (Object obj : objArr) {
                mo6130(obj);
            }
            return this;
        }
        m16261(objArr.length, objArr);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12429 mo30596(C12429 c12429) {
        if (this.f37422 != null) {
            for (int i = 0; i < c12429.f17820; i++) {
                Object obj = c12429.f17818[i];
                C11003.requireNonNull(obj);
                mo6130(obj);
            }
            return this;
        }
        m16261(c12429.f17820, c12429.f17818);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC6079 mo30595() {
        AbstractC6079 abstractC6079M16993;
        int i = this.f17820;
        if (i == 0) {
            int i2 = AbstractC6079.f18650;
            return C20692.f66656;
        }
        if (i == 1) {
            Object obj = this.f17818[0];
            C11003.requireNonNull(obj);
            int i3 = AbstractC6079.f18650;
            return new C21397(obj);
        }
        if (this.f37422 == null || AbstractC6079.m16986(i) != this.f37422.length) {
            abstractC6079M16993 = AbstractC6079.m16993(this.f17820, this.f17818);
            this.f17820 = abstractC6079M16993.size();
        } else {
            int i4 = this.f17820;
            Object[] objArrCopyOf = this.f17818;
            int length = objArrCopyOf.length;
            if (i4 < (length >> 1) + (length >> 2)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            }
            int i5 = this.f37423;
            Object[] objArr = this.f37422;
            abstractC6079M16993 = new C20692(i5, objArr.length - 1, this.f17820, objArrCopyOf, objArr);
        }
        this.f17819 = true;
        this.f37422 = null;
        return abstractC6079M16993;
    }

    @Override // l.AbstractC5792
    /* JADX INFO: renamed from: ֫ */
    public C12429 mo16260(Iterable iterable) {
        iterable.getClass();
        if (this.f37422 != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                mo6130(it.next());
            }
            return this;
        }
        mo16260(iterable);
        return this;
    }

    @Override // l.AbstractC11437
    /* JADX INFO: renamed from: ֫ */
    public C12429 mo6130(Object obj) {
        obj.getClass();
        if (this.f37422 != null) {
            int iM16986 = AbstractC6079.m16986(this.f17820);
            Object[] objArr = this.f37422;
            if (iM16986 <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iM9079 = C2970.m9079(iHashCode);
                while (true) {
                    int i = iM9079 & length;
                    Object[] objArr2 = this.f37422;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.f37423 += iHashCode;
                        m16262(obj);
                        return this;
                    }
                    if (obj2.equals(obj)) {
                        return this;
                    }
                    iM9079 = i + 1;
                }
            }
        }
        this.f37422 = null;
        m16262(obj);
        return this;
    }
}
