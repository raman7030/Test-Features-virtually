package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۜ۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 866M */
/* JADX INFO: loaded from: classes2.dex */
public class C8817 {

    /* JADX INFO: renamed from: ֫ */
    public Object[] f23933;

    /* JADX INFO: renamed from: ۧ */
    public C24910 f23934;

    /* JADX INFO: renamed from: ܽ */
    public int f23935;

    public C8817() {
        this(4);
    }

    public C8817(int i) {
        this.f23933 = new Object[i * 2];
        this.f23935 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public C8817 mo20376(Object obj, Object obj2) {
        int i = (this.f23935 + 1) * 2;
        Object[] objArr = this.f23933;
        if (i > objArr.length) {
            this.f23933 = Arrays.copyOf(objArr, AbstractC13238.m30297(objArr.length, i));
        }
        C23335.m51957(obj, obj2);
        Object[] objArr2 = this.f23933;
        int i2 = this.f23935;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.f23935 = i2 + 1;
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC11500 m20375(boolean z) {
        C24910 c24910;
        C24910 c24911;
        if (z && (c24911 = this.f23934) != null) {
            throw c24911.m54694();
        }
        C8622 c8622M20042 = C8622.m20042(this.f23935, this.f23933, this);
        if (!z || (c24910 = this.f23934) == null) {
            return c8622M20042;
        }
        throw c24910.m54694();
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC11500 mo20377() {
        return m20375(true);
    }

    /* JADX INFO: renamed from: ۧ */
    public AbstractC11500 mo20378() {
        return m20375(true);
    }
}
