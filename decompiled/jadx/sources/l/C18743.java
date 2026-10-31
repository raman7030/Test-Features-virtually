package l;

import android.graphics.Typeface;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ᩴۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes5.dex */
public final class C18743 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f59230;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f59231;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final float f59232;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f59233;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Object f59234;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f59235;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float f59236;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f59237;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f59238;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f59239;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f59240;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f59241;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final float f59242;

    public C18743(Typeface typeface, float f, float f2, float f3, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2, C15068 c15068) {
        this.f59234 = typeface;
        this.f59242 = f;
        this.f59236 = f2;
        this.f59232 = f3;
        this.f59241 = i;
        this.f59230 = z;
        this.f59233 = z2;
        this.f59240 = z3;
        this.f59239 = z4;
        this.f59235 = z5;
        this.f59231 = z6;
        this.f59237 = i2;
        this.f59238 = c15068;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18743)) {
            return false;
        }
        C18743 c18743 = (C18743) obj;
        return this.f59230 == c18743.f59230 && this.f59233 == c18743.f59233 && this.f59240 == c18743.f59240 && this.f59239 == c18743.f59239 && this.f59235 == c18743.f59235 && this.f59231 == c18743.f59231 && this.f59241 == c18743.f59241 && this.f59237 == c18743.f59237 && this.f59242 == c18743.f59242 && this.f59236 == c18743.f59236 && this.f59232 == c18743.f59232 && C11003.equals(this.f59234, c18743.f59234) && C11003.equals(this.f59238, c18743.f59238);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f59238) + ((C11003.hashCode(this.f59234) + ((Float.floatToIntBits(this.f59232) + ((Float.floatToIntBits(this.f59236) + ((Float.floatToIntBits(this.f59242) + ((((((((((((((((this.f59230 ? 1231 : 1237) * 31) + (this.f59233 ? 1231 : 1237)) * 31) + (this.f59240 ? 1231 : 1237)) * 31) + (this.f59239 ? 1231 : 1237)) * 31) + (this.f59235 ? 1231 : 1237)) * 31) + (this.f59231 ? 1231 : 1237)) * 31) + this.f59241) * 31) + this.f59237) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f59234, Float.valueOf(this.f59242), Float.valueOf(this.f59236), Float.valueOf(this.f59232), Integer.valueOf(this.f59241), Boolean.valueOf(this.f59230), Boolean.valueOf(this.f59233), Boolean.valueOf(this.f59240), Boolean.valueOf(this.f59239), Boolean.valueOf(this.f59235), Boolean.valueOf(this.f59231), Integer.valueOf(this.f59237), this.f59238};
        String[] strArrSplit = "typeface;size;scale;skew;tabSize;ascii;unicode;lineNumbers;lineNumbersLeft;fixedNumbers;wrapArrows;wrap;language".length() == 0 ? new String[0] : "typeface;size;scale;skew;tabSize;ascii;unicode;lineNumbers;lineNumbersLeft;fixedNumbers;wrapArrows;wrap;language".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C18743.class, sb, "[");
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
