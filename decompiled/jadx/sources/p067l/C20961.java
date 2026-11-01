package p067l;

import bin.p000mt.json.JSON;
import com.alipay.sdk.p010m.p058y.C0249l;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.᩵ܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6V4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20961 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f65852;

    /* JADX INFO: renamed from: ۜ */
    public final boolean f65853;

    /* JADX INFO: renamed from: ۧ */
    public final int f65854;

    /* JADX INFO: renamed from: ܳ */
    public final int f65855;

    /* JADX INFO: renamed from: ܽ */
    public final int f65856;

    /* JADX INFO: renamed from: ܿ */
    public final int f65857;

    /* JADX INFO: renamed from: ᩳ */
    public final String f65858;

    /* JADX INFO: renamed from: ᩻ */
    public final String f65859;

    public C20961(boolean z, int i, int i2, int i3, int i4, boolean z2, String str, String str2) {
        this.f65858 = str;
        this.f65859 = str2;
        this.f65853 = z;
        this.f65852 = z2;
        this.f65856 = i;
        this.f65854 = i2;
        this.f65857 = i3;
        this.f65855 = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20961)) {
            return false;
        }
        C20961 c20961 = (C20961) obj;
        return this.f65853 == c20961.f65853 && this.f65852 == c20961.f65852 && this.f65856 == c20961.f65856 && this.f65854 == c20961.f65854 && this.f65857 == c20961.f65857 && this.f65855 == c20961.f65855 && C12826.equals(this.f65858, c20961.f65858) && C12826.equals(this.f65859, c20961.f65859);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f65859) + C21720.m49003((((((((((((this.f65853 ? 1231 : 1237) * 31) + (this.f65852 ? 1231 : 1237)) * 31) + this.f65856) * 31) + this.f65854) * 31) + this.f65857) * 31) + this.f65855) * 31, 31, this.f65858);
    }

    public final String toString() {
        Object[] objArr = {this.f65858, this.f65859, Boolean.valueOf(this.f65853), Boolean.valueOf(this.f65852), Integer.valueOf(this.f65856), Integer.valueOf(this.f65854), Integer.valueOf(this.f65857), Integer.valueOf(this.f65855)};
        String[] strArrSplit = "encoding;pattern;regex;caseSensitive;contextBefore;contextAfter;limit;maxChars".length() == 0 ? new String[0] : "encoding;pattern;regex;caseSensitive;contextBefore;contextAfter;limit;maxChars".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C20961.class, sb, "[");
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
    public final int m47286() {
        return this.f65854;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m47288() {
        return this.f65855;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m47289() {
        return this.f65856;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m47290() {
        return this.f65857;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m47291() {
        return this.f65859;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m47287(String str) {
        return C16111.m36665(C16111.m36668().digest(JSON.object().add("encoding", str).add("pattern", this.f65859).add("regex", this.f65853).add("case", this.f65852).add("before", this.f65856).add("after", this.f65854).add("limit", this.f65857).add("chars", this.f65855).toString().getBytes(StandardCharsets.UTF_8)));
    }
}
