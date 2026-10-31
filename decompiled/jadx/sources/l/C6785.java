package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۜ۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 866M */
/* JADX INFO: loaded from: classes2.dex */
public class C6785 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object[] f21059;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C23718 f21060;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f21061;

    public C6785() {
        this(4);
    }

    public C6785(int i) {
        this.f21059 = new Object[i * 2];
        this.f21061 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C6785 mo18428(Object obj, Object obj2) {
        int i = (this.f21061 + 1) * 2;
        Object[] objArr = this.f21059;
        if (i > objArr.length) {
            this.f21059 = Arrays.copyOf(objArr, AbstractC11437.m28253(objArr.length, i));
        }
        C22061.m49621(obj, obj2);
        Object[] objArr2 = this.f21059;
        int i2 = this.f21061;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.f21061 = i2 + 1;
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC9608 m18427(boolean z) {
        C23718 c23718;
        C23718 c23719;
        if (z && (c23719 = this.f21060) != null) {
            throw c23719.m52291();
        }
        C6580 c6580M18091 = C6580.m18091(this.f21061, this.f21059, this);
        if (!z || (c23718 = this.f21060) == null) {
            return c6580M18091;
        }
        throw c23718.m52291();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC9608 mo18429() {
        return m18427(true);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC9608 mo18430() {
        return m18427(true);
    }
}
