package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۡܺܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: M97E */
/* JADX INFO: loaded from: classes3.dex */
public final class C8987 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f27307;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC9693 f27308;

    public C8987(int i, AbstractC9693 abstractC9693) {
        this.f27307 = i;
        this.f27308 = abstractC9693;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8987)) {
            return false;
        }
        C8987 c8987 = (C8987) obj;
        return this.f27307 == c8987.f27307 && C11003.equals(this.f27308, c8987.f27308);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f27308) + (this.f27307 * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f27307), this.f27308};
        String[] strArrSplit = "group;syntaxItem".length() == 0 ? new String[0] : "group;syntaxItem".split(l.b);
        StringBuilder sb = new StringBuilder("SyntaxItemMark[");
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
    public final int m23222() {
        return this.f27307;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC9693 m23224() {
        return this.f27308;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8987 m23223(AbstractC9693 abstractC9693) {
        return new C8987(this.f27307, this.f27308.mo1512(abstractC9693));
    }
}
