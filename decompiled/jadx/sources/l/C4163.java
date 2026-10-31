package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۘ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 962J */
/* JADX INFO: loaded from: classes3.dex */
public final class C4163 extends AbstractC19686 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f13577;

    public C4163(EnumC1340 enumC1340, AbstractC8396 abstractC8396, String str) {
        super(enumC1340, abstractC8396);
        this.f13577 = str;
    }

    @Override // l.AbstractC19686, l.AbstractC8396
    public final AbstractC8396 clone() {
        AbstractC8396 abstractC8396 = this.f63597;
        abstractC8396.getClass();
        return new C4163(this.f25745, abstractC8396.clone(), this.f13577);
    }

    @Override // l.AbstractC8396
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8396 mo6718(C1403 c1403) {
        return new C4163(this.f25745, this.f63597.mo6718(c1403), this.f13577);
    }

    @Override // l.AbstractC8396
    /* JADX INFO: renamed from: ܳ */
    public final String mo6719() {
        int i = C2752.f8558[this.f25745.ordinal()];
        if (i == 1) {
            return this.f63597 + ".length";
        }
        if (i == 2) {
            return "(-" + this.f63597 + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        if (i == 3) {
            return "(!" + this.f63597 + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        return toString();
    }
}
