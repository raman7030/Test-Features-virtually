package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܺ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U655 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16156 extends AbstractC19686 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f49779;

    public C16156(EnumC1340 enumC1340, AbstractC8396 abstractC8396, String str) {
        super(enumC1340, abstractC8396);
        this.f49779 = str;
    }

    @Override // l.AbstractC19686, l.AbstractC8396
    public final AbstractC8396 clone() {
        AbstractC8396 abstractC8396 = this.f63597;
        abstractC8396.getClass();
        return new C16156(this.f25745, abstractC8396.clone(), this.f49779);
    }

    @Override // l.AbstractC8396
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8396 mo6718(C1403 c1403) {
        return new C16156(this.f25745, this.f63597.mo6718(c1403), this.f49779);
    }

    @Override // l.AbstractC8396
    /* JADX INFO: renamed from: ܳ */
    public final String mo6719() {
        int i = C9102.f27579[this.f25745.ordinal()];
        String str = this.f49779;
        int i2 = 1;
        if (i == 1) {
            return "((" + C0459.m2045(str) + MotionUtils.EASING_TYPE_FORMAT_END + this.f63597 + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        if (i == 2) {
            return MotionUtils.EASING_TYPE_FORMAT_START + this.f63597 + " instanceof " + C0459.m2045(str) + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        if (i != 3) {
            return "UNKNOW";
        }
        if (str.charAt(0) == '[') {
            while (str.charAt(i2) == '[') {
                i2++;
            }
            StringBuilder sb = new StringBuilder("new ");
            sb.append(C0459.m2045(str.substring(i2)));
            sb.append("[");
            sb.append(this.f63597);
            sb.append("]");
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append("[]");
            }
            return sb.toString();
        }
        return "new " + C0459.m2045(str) + "[" + this.f63597 + "]";
    }
}
