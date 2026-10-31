package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֨ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes2.dex */
public final class C1079 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3902[] f3944;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f3945;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f3946;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18883 f3947;

    public C1079(int i, InterfaceC18883 interfaceC18883, int i2, C3902[] c3902Arr) {
        this.f3945 = i;
        this.f3947 = interfaceC18883;
        this.f3946 = i2;
        this.f3944 = c3902Arr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1079)) {
            return false;
        }
        C1079 c1079 = (C1079) obj;
        return this.f3945 == c1079.f3945 && this.f3946 == c1079.f3946 && C11003.equals(this.f3947, c1079.f3947) && C11003.equals(this.f3944, c1079.f3944);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f3944) + ((C11003.hashCode(this.f3947) + C4153.m12551(this.f3945, 31, this.f3946, 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f3945), this.f3947, Integer.valueOf(this.f3946), this.f3944};
        String[] strArrSplit = "index;source;occurrenceBytes;backings".length() == 0 ? new String[0] : "index;source;occurrenceBytes;backings".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C1079.class, sb, "[");
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
    public final C3902[] m3661() {
        return this.f3944;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18883 m3662() {
        return this.f3947;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m3663() {
        return this.f3945;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m3664() {
        return this.f3946;
    }
}
