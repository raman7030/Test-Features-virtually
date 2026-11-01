package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۛ᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5DO */
/* JADX INFO: loaded from: classes3.dex */
public final class C8396 extends AbstractC21078 {

    /* JADX INFO: renamed from: ۫ */
    public String f22520;

    /* JADX INFO: renamed from: ۬ */
    public String f22521;

    public C8396(AbstractC10348 abstractC10348, String str, String str2) {
        super(EnumC3642.CAST, abstractC10348);
        this.f22521 = str;
        this.f22520 = str2;
    }

    @Override // p067l.AbstractC21078, p067l.AbstractC10348
    public final AbstractC10348 clone() {
        AbstractC10348 abstractC10348 = this.f66218;
        abstractC10348.getClass();
        return new C8396(abstractC10348.clone(), this.f22521, this.f22520);
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10348 mo8844(C3702 c3702) {
        return new C8396(this.f66218.mo8844(c3702), this.f22521, this.f22520);
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ܳ */
    public final String mo8845() {
        return "((" + C2805.m4425(this.f22520) + MotionUtils.EASING_TYPE_FORMAT_END + this.f66218 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
