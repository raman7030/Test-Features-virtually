package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۛ᩵᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R9JP */
/* JADX INFO: loaded from: classes3.dex */
public final class C6274 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC11919 f19417;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12066 f19418;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC7685 f19419;

    public C6274(C12066 c12066, EnumC7685 enumC7685, EnumC11919 enumC11919) {
        this.f19418 = c12066;
        this.f19419 = enumC7685;
        this.f19417 = enumC11919;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6274)) {
            return false;
        }
        C6274 c6274 = (C6274) obj;
        return C11003.equals(this.f19418, c6274.f19418) && C11003.equals(this.f19419, c6274.f19419) && C11003.equals(this.f19417, c6274.f19417);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f19417) + ((C11003.hashCode(this.f19419) + (C11003.hashCode(this.f19418) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f19418, this.f19419, this.f19417};
        String[] strArrSplit = "key;signingMode;dialectMode".length() == 0 ? new String[0] : "key;signingMode;dialectMode".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C6274.class, sb, "[");
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
    public final EnumC11919 m17284() {
        return this.f19417;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12066 m17285() {
        return this.f19418;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC7685 m17286() {
        return this.f19419;
    }
}
