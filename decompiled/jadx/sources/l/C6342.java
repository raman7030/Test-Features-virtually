package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۛ᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5DO */
/* JADX INFO: loaded from: classes3.dex */
public final class C6342 extends AbstractC19686 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f19648;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f19649;

    public C6342(AbstractC8396 abstractC8396, String str, String str2) {
        super(EnumC1340.CAST, abstractC8396);
        this.f19649 = str;
        this.f19648 = str2;
    }

    @Override // l.AbstractC19686, l.AbstractC8396
    public final AbstractC8396 clone() {
        AbstractC8396 abstractC8396 = this.f63597;
        abstractC8396.getClass();
        return new C6342(abstractC8396.clone(), this.f19649, this.f19648);
    }

    @Override // l.AbstractC8396
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8396 mo6718(C1403 c1403) {
        return new C6342(this.f63597.mo6718(c1403), this.f19649, this.f19648);
    }

    @Override // l.AbstractC8396
    /* JADX INFO: renamed from: ܳ */
    public final String mo6719() {
        return "((" + C0459.m2045(this.f19648) + MotionUtils.EASING_TYPE_FORMAT_END + this.f63597 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
