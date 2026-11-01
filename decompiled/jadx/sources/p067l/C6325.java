package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۘ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 962J */
/* JADX INFO: loaded from: classes3.dex */
public final class C6325 extends AbstractC21078 {

    /* JADX INFO: renamed from: ۬ */
    public String f16390;

    public C6325(EnumC3642 enumC3642, AbstractC10348 abstractC10348, String str) {
        super(enumC3642, abstractC10348);
        this.f16390 = str;
    }

    @Override // p067l.AbstractC21078, p067l.AbstractC10348
    public final AbstractC10348 clone() {
        AbstractC10348 abstractC10348 = this.f66218;
        abstractC10348.getClass();
        return new C6325(this.f28658, abstractC10348.clone(), this.f16390);
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10348 mo8844(C3702 c3702) {
        return new C6325(this.f28658, this.f66218.mo8844(c3702), this.f16390);
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ܳ */
    public final String mo8845() {
        int i = C4984.f11352[this.f28658.ordinal()];
        if (i == 1) {
            return this.f66218 + ".length";
        }
        if (i == 2) {
            return "(-" + this.f66218 + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        if (i == 3) {
            return "(!" + this.f66218 + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        return toString();
    }
}
