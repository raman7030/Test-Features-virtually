package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܽ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5C6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18394 extends AbstractC15101 {

    /* JADX INFO: renamed from: ۫ */
    public C12891 f54921;

    /* JADX INFO: renamed from: ۬ */
    public C9342 f54922;

    public C18394(EnumC3642 enumC3642, AbstractC10348[] abstractC10348Arr, C12891 c12891, C9342 c9342) {
        super(enumC3642, abstractC10348Arr);
        this.f54921 = c12891;
        this.f54922 = c9342;
    }

    @Override // p067l.AbstractC15101
    /* JADX INFO: renamed from: ᩷ */
    public final C12891 mo8846() {
        return this.f54921;
    }

    @Override // p067l.AbstractC7666, p067l.AbstractC10348
    public final AbstractC10348 clone() {
        return new C18394(this.f28658, m17751(), this.f54921, this.f54922);
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10348 mo8844(C3702 c3702) {
        return new C18394(this.f28658, m17752(c3702), this.f54921, this.f54922);
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ܳ */
    public final String mo8845() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20109[0]);
        sb.append('.');
        sb.append(this.f54922.m21673());
        String[] strArrM29530 = this.f54921.m29530();
        sb.append('(');
        int i = 1;
        boolean z = true;
        int i2 = 0;
        while (i < this.f20109.length) {
            if (z) {
                z = false;
            } else {
                sb.append(',');
            }
            sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
            sb.append(C2805.m4425(strArrM29530[i2]));
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            sb.append(this.f20109[i]);
            i++;
            i2++;
        }
        sb.append(')');
        return sb.toString();
    }
}
