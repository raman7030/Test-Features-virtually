package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܺ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U655 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17723 extends AbstractC21078 {

    /* JADX INFO: renamed from: ۬ */
    public String f52945;

    public C17723(EnumC3642 enumC3642, AbstractC10348 abstractC10348, String str) {
        super(enumC3642, abstractC10348);
        this.f52945 = str;
    }

    @Override // p067l.AbstractC21078, p067l.AbstractC10348
    public final AbstractC10348 clone() {
        AbstractC10348 abstractC10348 = this.f66218;
        abstractC10348.getClass();
        return new C17723(this.f28658, abstractC10348.clone(), this.f52945);
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10348 mo8844(C3702 c3702) {
        return new C17723(this.f28658, this.f66218.mo8844(c3702), this.f52945);
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ܳ */
    public final String mo8845() {
        int i = C11019.f30516[this.f28658.ordinal()];
        String str = this.f52945;
        int i2 = 1;
        if (i == 1) {
            return "((" + C2805.m4425(str) + MotionUtils.EASING_TYPE_FORMAT_END + this.f66218 + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        if (i == 2) {
            return MotionUtils.EASING_TYPE_FORMAT_START + this.f66218 + " instanceof " + C2805.m4425(str) + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        if (i != 3) {
            return "UNKNOW";
        }
        if (str.charAt(0) == '[') {
            while (str.charAt(i2) == '[') {
                i2++;
            }
            StringBuilder sb = new StringBuilder("new ");
            sb.append(C2805.m4425(str.substring(i2)));
            sb.append("[");
            sb.append(this.f66218);
            sb.append("]");
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append("[]");
            }
            return sb.toString();
        }
        return "new " + C2805.m4425(str) + "[" + this.f66218 + "]";
    }
}
