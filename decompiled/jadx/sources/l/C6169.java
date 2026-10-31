package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۛܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 986Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C6169 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f18959;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f18960;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f18961;

    public C6169(String str, String str2, String str3) {
        this.f18960 = str;
        this.f18961 = str2;
        this.f18959 = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6169)) {
            return false;
        }
        C6169 c6169 = (C6169) obj;
        return C11003.equals(this.f18960, c6169.f18960) && C11003.equals(this.f18961, c6169.f18961) && C11003.equals(this.f18959, c6169.f18959);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f18959) + C20361.m46680(C11003.hashCode(this.f18960) * 31, 31, this.f18961);
    }

    public final String toString() {
        Object[] objArr = {this.f18960, this.f18961, this.f18959};
        String[] strArrSplit = "name;region;endpoint".length() == 0 ? new String[0] : "name;region;endpoint".split(l.b);
        StringBuilder sb = new StringBuilder("BucketInfo[");
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
    public final String m17074() {
        return this.f18959;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m17075() {
        return this.f18960;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m17076() {
        return this.f18961;
    }
}
