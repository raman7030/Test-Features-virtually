package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۨۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 497P */
/* JADX INFO: loaded from: classes4.dex */
public final class C13457 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f37771;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC14973 f37772;

    /* JADX INFO: renamed from: ܽ */
    public final EnumC10104 f37773;

    /* JADX INFO: renamed from: ᩳ */
    public final String f37774;

    public C13457(AbstractC14973 abstractC14973, EnumC10104 enumC10104, String str, boolean z) {
        this.f37772 = abstractC14973;
        this.f37773 = enumC10104;
        this.f37774 = str;
        this.f37771 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13457)) {
            return false;
        }
        C13457 c13457 = (C13457) obj;
        return this.f37771 == c13457.f37771 && C12826.equals(this.f37772, c13457.f37772) && C12826.equals(this.f37773, c13457.f37773) && C12826.equals(this.f37774, c13457.f37774);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f37774) + ((C12826.hashCode(this.f37773) + ((C12826.hashCode(this.f37772) + ((this.f37771 ? 1231 : 1237) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f37772, this.f37773, this.f37774, Boolean.valueOf(this.f37771)};
        String[] strArrSplit = "key;schemes;v1Filename;keepV1SignatureData".length() == 0 ? new String[0] : "key;schemes;v1Filename;keepV1SignatureData".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder("ApkSignerOptions[");
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

    /* JADX INFO: renamed from: ܳ */
    public final EnumC10104 m30603() {
        return this.f37773;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m30604() {
        return this.f37771;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC14973 m30605() {
        return this.f37772;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m30606() {
        return this.f37774;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m30602() {
        C11996 c11996 = new C11996();
        c11996.m27454(this.f37772.m34293());
        c11996.writeByte(this.f37773.ordinal());
        c11996.m27452(this.f37774);
        c11996.m27445(this.f37771);
        return c11996.m27464();
    }
}
