package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܳ֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4H6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14218 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f42888;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20445 f42889;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC23391 f42890;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C9281 f42891;

    public /* synthetic */ C14218(InterfaceC20445 interfaceC20445, int i, C9281 c9281, EnumC23391 enumC23391, int i2) {
        this(interfaceC20445, i, c9281, enumC23391);
    }

    public C14218(InterfaceC20445 interfaceC20445, int i, C9281 c9281, EnumC23391 enumC23391) {
        this.f42889 = interfaceC20445;
        this.f42888 = i;
        this.f42891 = c9281;
        this.f42890 = enumC23391;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14218)) {
            return false;
        }
        C14218 c14218 = (C14218) obj;
        return this.f42888 == c14218.f42888 && C11003.equals(this.f42889, c14218.f42889) && C11003.equals(this.f42891, c14218.f42891) && C11003.equals(this.f42890, c14218.f42890);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f42890) + ((C11003.hashCode(this.f42891) + ((C11003.hashCode(this.f42889) + (this.f42888 * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f42889, Integer.valueOf(this.f42888), this.f42891, this.f42890};
        String[] strArrSplit = "owner;modifyCount;store;state".length() == 0 ? new String[0] : "owner;modifyCount;store;state".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C14218.class, sb, "[");
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
    public static C14218 m33878(InterfaceC20445 interfaceC20445, int i, int i2) {
        return new C14218(interfaceC20445, i, new C20570().m47130(i2), EnumC23391.IDLE);
    }
}
