package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8II */
/* JADX INFO: loaded from: classes4.dex */
public final class C13715 extends AbstractC14626 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f40926;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f40927;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f40928;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f40929;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f40930;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC14626[] f40931;

    public C13715(String str, int i, int i2, long j, long j2, AbstractC14626[] abstractC14626Arr) {
        super("CHAP");
        this.f40926 = str;
        this.f40927 = i;
        this.f40930 = i2;
        this.f40929 = j;
        this.f40928 = j2;
        this.f40931 = abstractC14626Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C13715.class == obj.getClass()) {
            C13715 c13715 = (C13715) obj;
            if (this.f40927 == c13715.f40927 && this.f40930 == c13715.f40930 && this.f40929 == c13715.f40929 && this.f40928 == c13715.f40928 && C11003.equals(this.f40926, c13715.f40926) && Arrays.equals(this.f40931, c13715.f40931)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((this.f40927 + 527) * 31) + this.f40930) * 31) + ((int) this.f40929)) * 31) + ((int) this.f40928)) * 31;
        String str = this.f40926;
        return i + (str != null ? str.hashCode() : 0);
    }
}
