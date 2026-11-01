package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8II */
/* JADX INFO: loaded from: classes4.dex */
public final class C15403 extends AbstractC16269 {

    /* JADX INFO: renamed from: ۧ */
    public final String f44007;

    /* JADX INFO: renamed from: ܳ */
    public final int f44008;

    /* JADX INFO: renamed from: ܽ */
    public final long f44009;

    /* JADX INFO: renamed from: ܿ */
    public final long f44010;

    /* JADX INFO: renamed from: ᩳ */
    public final int f44011;

    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC16269[] f44012;

    public C15403(String str, int i, int i2, long j, long j2, AbstractC16269[] abstractC16269Arr) {
        super("CHAP");
        this.f44007 = str;
        this.f44008 = i;
        this.f44011 = i2;
        this.f44010 = j;
        this.f44009 = j2;
        this.f44012 = abstractC16269Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15403.class == obj.getClass()) {
            C15403 c15403 = (C15403) obj;
            if (this.f44008 == c15403.f44008 && this.f44011 == c15403.f44011 && this.f44010 == c15403.f44010 && this.f44009 == c15403.f44009 && C12826.equals(this.f44007, c15403.f44007) && Arrays.equals(this.f44012, c15403.f44012)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((this.f44008 + 527) * 31) + this.f44011) * 31) + ((int) this.f44010)) * 31) + ((int) this.f44009)) * 31;
        String str = this.f44007;
        return i + (str != null ? str.hashCode() : 0);
    }
}
