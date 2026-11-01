package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩻᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H4VC */
/* JADX INFO: loaded from: classes.dex */
public final class C25100 extends AbstractC7666 {
    public C25100(AbstractC10348[] abstractC10348Arr) {
        super(EnumC3642.PHI, abstractC10348Arr);
    }

    @Override // p067l.AbstractC7666, p067l.AbstractC10348
    public final AbstractC10348 clone() {
        return new C25100(m17751());
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10348 mo8844(C3702 c3702) {
        return new C25100(m17752(c3702));
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ܳ */
    public final String mo8845() {
        StringBuilder sb = new StringBuilder("φ(");
        boolean z = true;
        for (AbstractC10348 abstractC10348 : this.f20109) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(abstractC10348);
        }
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }
}
