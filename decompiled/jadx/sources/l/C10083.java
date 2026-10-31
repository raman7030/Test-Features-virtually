package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۤۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M3ZI */
/* JADX INFO: loaded from: classes3.dex */
public final class C10083 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f30370;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f30371;

    public C10083(AbstractC4308 abstractC4308, boolean z) {
        this.f30370 = abstractC4308;
        this.f30371 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10083)) {
            return false;
        }
        C10083 c10083 = (C10083) obj;
        return this.f30371 == c10083.f30371 && C11003.equals(this.f30370, c10083.f30370);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f30370) + ((this.f30371 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f30370, Boolean.valueOf(this.f30371)};
        String[] strArrSplit = "type;unconditional".length() == 0 ? new String[0] : "type;unconditional".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C10083.class, sb, "[");
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
    public final AbstractC4308 m25340() {
        return this.f30370;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m25341() {
        return this.f30371;
    }
}
