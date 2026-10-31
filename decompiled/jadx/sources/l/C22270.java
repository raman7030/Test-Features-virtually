package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩹ۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes.dex */
public final class C22270 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC3179 f72248;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7785 f72249;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f72250;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f72251;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f72252;

    public C22270(AbstractC3179 abstractC3179, InterfaceC7785 interfaceC7785, int i, int i2, int i3) {
        this.f72248 = abstractC3179;
        this.f72249 = interfaceC7785;
        this.f72250 = i;
        this.f72252 = i2;
        this.f72251 = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22270)) {
            return false;
        }
        C22270 c22270 = (C22270) obj;
        return this.f72250 == c22270.f72250 && this.f72252 == c22270.f72252 && this.f72251 == c22270.f72251 && C11003.equals(this.f72248, c22270.f72248) && C11003.equals(this.f72249, c22270.f72249);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f72249) + ((C11003.hashCode(this.f72248) + (((((this.f72250 * 31) + this.f72252) * 31) + this.f72251) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f72248, this.f72249, Integer.valueOf(this.f72250), Integer.valueOf(this.f72252), Integer.valueOf(this.f72251)};
        String[] strArrSplit = "layout;owner;version;x;y".length() == 0 ? new String[0] : "layout;owner;version;x;y".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C22270.class, sb, "[");
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
}
