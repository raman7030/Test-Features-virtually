package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۜ۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6TJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8820 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final long f23942;

    /* JADX INFO: renamed from: ۧ */
    public final String f23943;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f23944;

    /* JADX INFO: renamed from: ᩳ */
    public final String f23945;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8820)) {
            return false;
        }
        C8820 c8820 = (C8820) obj;
        return this.f23944 == c8820.f23944 && this.f23942 == c8820.f23942 && C12826.equals(this.f23943, c8820.f23943) && C12826.equals(this.f23945, c8820.f23945);
    }

    public final int hashCode() {
        int i = this.f23944 ? 1231 : 1237;
        long j = this.f23942;
        return C12826.hashCode(this.f23945) + C21720.m49003(((i * 31) + ((int) (j ^ (j >>> 32)))) * 31, 31, this.f23943);
    }

    public final String toString() {
        Object[] objArr = {this.f23943, this.f23945, Long.valueOf(this.f23942), Boolean.valueOf(this.f23944)};
        String[] strArrSplit = "key;version;byteLength;reopenable".length() == 0 ? new String[0] : "key;version;byteLength;reopenable".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C8820.class, sb, "[");
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

    /* JADX INFO: renamed from: ֫ */
    public final long m20379() {
        return this.f23942;
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m20380() {
        return this.f23945;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m20381() {
        return this.f23943;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m20382() {
        return this.f23944;
    }

    public C8820(String str, String str2, long j, boolean z) {
        C12826.requireNonNull(str);
        C12826.requireNonNull(str2);
        if (!str.isEmpty() && str.length() <= 1024 && str2.length() <= 512 && j >= -1 && (!z || !str2.isEmpty())) {
            this.f23943 = str;
            this.f23945 = str2;
            this.f23942 = j;
            this.f23944 = z;
            return;
        }
        throw new IllegalArgumentException("Invalid text source identity");
    }
}
