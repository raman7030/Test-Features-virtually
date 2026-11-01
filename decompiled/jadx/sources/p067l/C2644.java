package p067l;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.֡۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 052E */
/* JADX INFO: loaded from: classes2.dex */
public final class C2644 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final String f4421;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f4422;

    /* JADX INFO: renamed from: ܽ */
    public final String f4423;

    /* JADX INFO: renamed from: ᩳ */
    public final String f4424;

    public /* synthetic */ C2644(int i, String str, String str2, String str3, boolean z) {
        this(str, str2, str3, z);
    }

    public C2644(String str, String str2, String str3, boolean z) {
        this.f4421 = str;
        this.f4424 = str2;
        this.f4423 = str3;
        this.f4422 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2644)) {
            return false;
        }
        C2644 c2644 = (C2644) obj;
        return this.f4422 == c2644.f4422 && C12826.equals(this.f4421, c2644.f4421) && C12826.equals(this.f4424, c2644.f4424) && C12826.equals(this.f4423, c2644.f4423);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f4423) + C21720.m49003(C21720.m49003((this.f4422 ? 1231 : 1237) * 31, 31, this.f4421), 31, this.f4424);
    }

    public final String toString() {
        Object[] objArr = {this.f4421, this.f4424, this.f4423, Boolean.valueOf(this.f4422)};
        String[] strArrSplit = "pattern;search;replace;regex".length() == 0 ? new String[0] : "pattern;search;replace;regex".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C2644.class, sb, "[");
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
    public static C2644 m4040(C14677 c14677) {
        return new C2644(c14677.m33593(), c14677.m33593(), c14677.m33593(), c14677.readByte() != 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4045(C11996 c11996) {
        c11996.m27459(this.f4421);
        c11996.m27459(this.f4424);
        c11996.m27459(this.f4423);
        c11996.writeByte(this.f4422 ? 1 : 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final SpannableStringBuilder m4044() {
        String str = this.f4421;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.replace('\n', ' '));
        String str2 = this.f4424;
        if (!str2.isEmpty()) {
            spannableStringBuilder.append((CharSequence) " [").append((CharSequence) str2.replace('\n', ' ')).append((CharSequence) "] > [").append((CharSequence) this.f4423.replace('\n', ' ')).append((CharSequence) "]");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C23223.f72980), str.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), str.length(), spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }
}
