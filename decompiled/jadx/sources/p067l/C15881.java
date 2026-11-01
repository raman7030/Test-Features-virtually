package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܳ֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4H6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15881 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f45978;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC21800 f45979;

    /* JADX INFO: renamed from: ܽ */
    public final EnumC24599 f45980;

    /* JADX INFO: renamed from: ᩳ */
    public final C11189 f45981;

    public /* synthetic */ C15881(InterfaceC21800 interfaceC21800, int i, C11189 c11189, EnumC24599 enumC24599, int i2) {
        this(interfaceC21800, i, c11189, enumC24599);
    }

    public C15881(InterfaceC21800 interfaceC21800, int i, C11189 c11189, EnumC24599 enumC24599) {
        this.f45979 = interfaceC21800;
        this.f45978 = i;
        this.f45981 = c11189;
        this.f45980 = enumC24599;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15881)) {
            return false;
        }
        C15881 c15881 = (C15881) obj;
        return this.f45978 == c15881.f45978 && C12826.equals(this.f45979, c15881.f45979) && C12826.equals(this.f45981, c15881.f45981) && C12826.equals(this.f45980, c15881.f45980);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f45980) + ((C12826.hashCode(this.f45981) + ((C12826.hashCode(this.f45979) + (this.f45978 * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f45979, Integer.valueOf(this.f45978), this.f45981, this.f45980};
        String[] strArrSplit = "owner;modifyCount;store;state".length() == 0 ? new String[0] : "owner;modifyCount;store;state".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C15881.class, sb, "[");
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
    public static C15881 m36010(InterfaceC21800 interfaceC21800, int i, int i2) {
        return new C15881(interfaceC21800, i, new C21918().m49454(i2), EnumC24599.IDLE);
    }
}
