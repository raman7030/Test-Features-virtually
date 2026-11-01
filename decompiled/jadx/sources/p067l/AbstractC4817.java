package p067l;

import java.util.Arrays;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۖܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4817 extends AbstractC20911 implements Iterable, InterfaceC6477 {

    /* JADX INFO: renamed from: e */
    public Object f10942e;

    /* JADX INFO: renamed from: f */
    public Object[] f10943f;

    public abstract Object newArray(int i);

    /* JADX INFO: renamed from: p */
    public abstract void mo10209p(Object obj, int i, int i2, Object obj2);

    /* JADX INFO: renamed from: q */
    public abstract int mo10210q(Object obj);

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public abstract InterfaceC16847 spliterator();

    /* JADX INFO: renamed from: t */
    public abstract Object[] mo10213t();

    public AbstractC4817(int i) {
        super(i);
        this.f10942e = newArray(1 << this.f65668a);
    }

    public AbstractC4817() {
        this.f10942e = newArray(16);
    }

    /* JADX INFO: renamed from: s */
    public final void m10212s(long j) {
        long jMo10210q;
        int i = this.f65670c;
        if (i == 0) {
            jMo10210q = mo10210q(this.f10942e);
        } else {
            jMo10210q = ((long) mo10210q(this.f10943f[i])) + this.f65671d[i];
        }
        if (j > jMo10210q) {
            if (this.f10943f == null) {
                Object[] objArrMo10213t = mo10213t();
                this.f10943f = objArrMo10213t;
                this.f65671d = new long[8];
                objArrMo10213t[0] = this.f10942e;
            }
            int i2 = this.f65670c + 1;
            while (j > jMo10210q) {
                Object[] objArr = this.f10943f;
                if (i2 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f10943f = Arrays.copyOf(objArr, length);
                    this.f65671d = Arrays.copyOf(this.f65671d, length);
                }
                int iMin = this.f65668a;
                if (i2 != 0 && i2 != 1) {
                    iMin = Math.min((iMin + i2) - 1, 30);
                }
                int i3 = 1 << iMin;
                this.f10943f[i2] = newArray(i3);
                long[] jArr = this.f65671d;
                int i4 = i2 - 1;
                jArr[i2] = jArr[i4] + ((long) mo10210q(this.f10943f[i4]));
                jMo10210q += (long) i3;
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final int m10211r(long j) {
        if (this.f65670c == 0) {
            if (j < this.f65669b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        for (int i = 0; i <= this.f65670c; i++) {
            if (j < this.f65671d[i] + ((long) mo10210q(this.f10943f[i]))) {
                return i;
            }
        }
        throw new IndexOutOfBoundsException(Long.toString(j));
    }

    /* JADX INFO: renamed from: e */
    public void mo4232e(int i, Object obj) {
        long j = i;
        long jCount = count() + j;
        if (jCount > mo10210q(obj) || jCount < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f65670c == 0) {
            System.arraycopy(this.f10942e, 0, obj, i, this.f65669b);
            return;
        }
        for (int i2 = 0; i2 < this.f65670c; i2++) {
            Object obj2 = this.f10943f[i2];
            System.arraycopy(obj2, 0, obj, i, mo10210q(obj2));
            i += mo10210q(this.f10943f[i2]);
        }
        int i3 = this.f65669b;
        if (i3 > 0) {
            System.arraycopy(this.f10942e, 0, obj, i, i3);
        }
    }

    /* JADX INFO: renamed from: b */
    public Object mo4230b() {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objNewArray = newArray((int) jCount);
        mo4232e(0, objNewArray);
        return objNewArray;
    }

    /* JADX INFO: renamed from: u */
    public final void m10214u() {
        long jMo10210q;
        if (this.f65669b == mo10210q(this.f10942e)) {
            if (this.f10943f == null) {
                Object[] objArrMo10213t = mo10213t();
                this.f10943f = objArrMo10213t;
                this.f65671d = new long[8];
                objArrMo10213t[0] = this.f10942e;
            }
            int i = this.f65670c;
            int i2 = i + 1;
            Object[] objArr = this.f10943f;
            if (i2 >= objArr.length || objArr[i2] == null) {
                if (i == 0) {
                    jMo10210q = mo10210q(this.f10942e);
                } else {
                    jMo10210q = ((long) mo10210q(objArr[i])) + this.f65671d[i];
                }
                m10212s(jMo10210q + 1);
            }
            this.f65669b = 0;
            int i3 = this.f65670c + 1;
            this.f65670c = i3;
            this.f10942e = this.f10943f[i3];
        }
    }

    @Override // p067l.AbstractC20911
    public final void clear() {
        Object[] objArr = this.f10943f;
        if (objArr != null) {
            this.f10942e = objArr[0];
            this.f10943f = null;
            this.f65671d = null;
        }
        this.f65669b = 0;
        this.f65670c = 0;
    }

    /* JADX INFO: renamed from: g */
    public void mo4234g(Object obj) {
        for (int i = 0; i < this.f65670c; i++) {
            Object obj2 = this.f10943f[i];
            mo10209p(obj2, 0, mo10210q(obj2), obj);
        }
        mo10209p(this.f10942e, 0, this.f65669b, obj);
    }
}
