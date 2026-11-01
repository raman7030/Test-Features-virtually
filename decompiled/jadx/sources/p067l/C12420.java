package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۤ᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 451O */
/* JADX INFO: loaded from: classes4.dex */
public final class C12420 extends AbstractC2971 {

    /* JADX INFO: renamed from: ۫ */
    public String f34716;

    public C12420(EnumC3642 enumC3642, AbstractC10348 abstractC10348, AbstractC10348 abstractC10349, String str) {
        super(enumC3642, abstractC10348, abstractC10349);
        this.f34716 = str;
    }

    @Override // p067l.AbstractC2971, p067l.AbstractC10348
    public final AbstractC10348 clone() {
        AbstractC10348 abstractC10348 = this.f5200;
        abstractC10348.getClass();
        AbstractC10348 abstractC10348Clone = abstractC10348.clone();
        AbstractC10348 abstractC10349 = this.f5201;
        abstractC10349.getClass();
        return new C12420(this.f28658, abstractC10348Clone, abstractC10349.clone(), this.f34716);
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10348 mo8844(C3702 c3702) {
        return new C12420(this.f28658, this.f5200.mo8844(c3702), this.f5201.mo8844(c3702), this.f34716);
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ܳ */
    public final String mo8845() {
        return MotionUtils.EASING_TYPE_FORMAT_START + this.f5200 + " " + this.f28658 + " " + this.f5201 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
