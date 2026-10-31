package l;

import bin.mt.json.JSON;
import com.alipay.sdk.m.y.l;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.᩵ܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6V4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19563 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f63233;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f63234;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f63235;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f63236;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f63237;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f63238;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f63239;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f63240;

    public C19563(boolean z, int i, int i2, int i3, int i4, boolean z2, String str, String str2) {
        this.f63239 = str;
        this.f63240 = str2;
        this.f63234 = z;
        this.f63233 = z2;
        this.f63237 = i;
        this.f63235 = i2;
        this.f63238 = i3;
        this.f63236 = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19563)) {
            return false;
        }
        C19563 c19563 = (C19563) obj;
        return this.f63234 == c19563.f63234 && this.f63233 == c19563.f63233 && this.f63237 == c19563.f63237 && this.f63235 == c19563.f63235 && this.f63238 == c19563.f63238 && this.f63236 == c19563.f63236 && C11003.equals(this.f63239, c19563.f63239) && C11003.equals(this.f63240, c19563.f63240);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f63240) + C20361.m46680((((((((((((this.f63234 ? 1231 : 1237) * 31) + (this.f63233 ? 1231 : 1237)) * 31) + this.f63237) * 31) + this.f63235) * 31) + this.f63238) * 31) + this.f63236) * 31, 31, this.f63239);
    }

    public final String toString() {
        Object[] objArr = {this.f63239, this.f63240, Boolean.valueOf(this.f63234), Boolean.valueOf(this.f63233), Integer.valueOf(this.f63237), Integer.valueOf(this.f63235), Integer.valueOf(this.f63238), Integer.valueOf(this.f63236)};
        String[] strArrSplit = "encoding;pattern;regex;caseSensitive;contextBefore;contextAfter;limit;maxChars".length() == 0 ? new String[0] : "encoding;pattern;regex;caseSensitive;contextBefore;contextAfter;limit;maxChars".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C19563.class, sb, "[");
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
    public final int m44991() {
        return this.f63235;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m44993() {
        return this.f63236;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m44994() {
        return this.f63237;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m44995() {
        return this.f63238;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m44996() {
        return this.f63240;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m44992(String str) {
        return C14460.m34531(C14460.m34534().digest(JSON.object().add("encoding", str).add("pattern", this.f63240).add("regex", this.f63234).add("case", this.f63233).add("before", this.f63237).add("after", this.f63235).add("limit", this.f63238).add("chars", this.f63236).toString().getBytes(StandardCharsets.UTF_8)));
    }
}
