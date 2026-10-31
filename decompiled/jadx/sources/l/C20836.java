package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩷ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes5.dex */
public final class C20836 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f67445;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f67446;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C4607 f67447;

    public C20836(long j, boolean z, C4607 c4607) {
        this.f67446 = j;
        this.f67445 = z;
        this.f67447 = c4607;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20836)) {
            return false;
        }
        C20836 c20836 = (C20836) obj;
        return this.f67445 == c20836.f67445 && this.f67446 == c20836.f67446 && C11003.equals(this.f67447, c20836.f67447);
    }

    public final int hashCode() {
        int i = this.f67445 ? 1231 : 1237;
        long j = this.f67446;
        return C11003.hashCode(this.f67447) + (((i * 31) + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f67446), Boolean.valueOf(this.f67445), this.f67447};
        String[] strArrSplit = "generation;changed;historyUiState".length() == 0 ? new String[0] : "generation;changed;historyUiState".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C20836.class, sb, "[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m47649() {
        return this.f67445;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m47650() {
        return this.f67446;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C4607 m47651() {
        return this.f67447;
    }
}
