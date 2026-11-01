package p067l;

import android.graphics.Typeface;
import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ᩴۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes5.dex */
public final class C20182 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f62452;

    /* JADX INFO: renamed from: ۖ */
    public final boolean f62453;

    /* JADX INFO: renamed from: ۜ */
    public final float f62454;

    /* JADX INFO: renamed from: ۡ */
    public final boolean f62455;

    /* JADX INFO: renamed from: ۢ */
    public final Object f62456;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f62457;

    /* JADX INFO: renamed from: ܳ */
    public final float f62458;

    /* JADX INFO: renamed from: ܺ */
    public final int f62459;

    /* JADX INFO: renamed from: ܽ */
    public final Object f62460;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f62461;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f62462;

    /* JADX INFO: renamed from: ᩷ */
    public final int f62463;

    /* JADX INFO: renamed from: ᩻ */
    public final float f62464;

    public C20182(Typeface typeface, float f, float f2, float f3, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2, C16689 c16689) {
        this.f62456 = typeface;
        this.f62464 = f;
        this.f62458 = f2;
        this.f62454 = f3;
        this.f62463 = i;
        this.f62452 = z;
        this.f62455 = z2;
        this.f62462 = z3;
        this.f62461 = z4;
        this.f62457 = z5;
        this.f62453 = z6;
        this.f62459 = i2;
        this.f62460 = c16689;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20182)) {
            return false;
        }
        C20182 c20182 = (C20182) obj;
        return this.f62452 == c20182.f62452 && this.f62455 == c20182.f62455 && this.f62462 == c20182.f62462 && this.f62461 == c20182.f62461 && this.f62457 == c20182.f62457 && this.f62453 == c20182.f62453 && this.f62463 == c20182.f62463 && this.f62459 == c20182.f62459 && this.f62464 == c20182.f62464 && this.f62458 == c20182.f62458 && this.f62454 == c20182.f62454 && C12826.equals(this.f62456, c20182.f62456) && C12826.equals(this.f62460, c20182.f62460);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f62460) + ((C12826.hashCode(this.f62456) + ((Float.floatToIntBits(this.f62454) + ((Float.floatToIntBits(this.f62458) + ((Float.floatToIntBits(this.f62464) + ((((((((((((((((this.f62452 ? 1231 : 1237) * 31) + (this.f62455 ? 1231 : 1237)) * 31) + (this.f62462 ? 1231 : 1237)) * 31) + (this.f62461 ? 1231 : 1237)) * 31) + (this.f62457 ? 1231 : 1237)) * 31) + (this.f62453 ? 1231 : 1237)) * 31) + this.f62463) * 31) + this.f62459) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f62456, Float.valueOf(this.f62464), Float.valueOf(this.f62458), Float.valueOf(this.f62454), Integer.valueOf(this.f62463), Boolean.valueOf(this.f62452), Boolean.valueOf(this.f62455), Boolean.valueOf(this.f62462), Boolean.valueOf(this.f62461), Boolean.valueOf(this.f62457), Boolean.valueOf(this.f62453), Integer.valueOf(this.f62459), this.f62460};
        String[] strArrSplit = "typeface;size;scale;skew;tabSize;ascii;unicode;lineNumbers;lineNumbersLeft;fixedNumbers;wrapArrows;wrap;language".length() == 0 ? new String[0] : "typeface;size;scale;skew;tabSize;ascii;unicode;lineNumbers;lineNumbersLeft;fixedNumbers;wrapArrows;wrap;language".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C20182.class, sb, "[");
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
