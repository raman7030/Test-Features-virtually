package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩶ܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1YZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20277 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f65522;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f65523;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC7479 f65524;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C10399 f65525;

    public C20277(AbstractC7479 abstractC7479, int i, int i2, C10399 c10399) {
        this.f65524 = abstractC7479;
        this.f65523 = i;
        this.f65522 = i2;
        this.f65525 = c10399;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20277)) {
            return false;
        }
        C20277 c20277 = (C20277) obj;
        return this.f65523 == c20277.f65523 && this.f65522 == c20277.f65522 && C11003.equals(this.f65524, c20277.f65524) && C11003.equals(this.f65525, c20277.f65525);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f65525) + ((C11003.hashCode(this.f65524) + C4153.m12551(this.f65523, 31, this.f65522, 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f65524, Integer.valueOf(this.f65523), Integer.valueOf(this.f65522), this.f65525};
        String[] strArrSplit = "instruction;index;data;intMatcher".length() == 0 ? new String[0] : "instruction;index;data;intMatcher".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C20277.class, sb, "[");
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
