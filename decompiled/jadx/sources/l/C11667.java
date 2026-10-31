package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۨۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 497P */
/* JADX INFO: loaded from: classes4.dex */
public final class C11667 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f34772;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC13262 f34773;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC8139 f34774;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f34775;

    public C11667(AbstractC13262 abstractC13262, EnumC8139 enumC8139, String str, boolean z) {
        this.f34773 = abstractC13262;
        this.f34774 = enumC8139;
        this.f34775 = str;
        this.f34772 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11667)) {
            return false;
        }
        C11667 c11667 = (C11667) obj;
        return this.f34772 == c11667.f34772 && C11003.equals(this.f34773, c11667.f34773) && C11003.equals(this.f34774, c11667.f34774) && C11003.equals(this.f34775, c11667.f34775);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f34775) + ((C11003.hashCode(this.f34774) + ((C11003.hashCode(this.f34773) + ((this.f34772 ? 1231 : 1237) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f34773, this.f34774, this.f34775, Boolean.valueOf(this.f34772)};
        String[] strArrSplit = "key;schemes;v1Filename;keepV1SignatureData".length() == 0 ? new String[0] : "key;schemes;v1Filename;keepV1SignatureData".split(l.b);
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

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EnumC8139 m28555() {
        return this.f34774;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m28556() {
        return this.f34772;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC13262 m28557() {
        return this.f34773;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m28558() {
        return this.f34775;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m28554() {
        C10130 c10130 = new C10130();
        c10130.m25434(this.f34773.m32194());
        c10130.writeByte(this.f34774.ordinal());
        c10130.m25432(this.f34775);
        c10130.m25425(this.f34772);
        return c10130.m25444();
    }
}
