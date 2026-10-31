package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩻᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H4VC */
/* JADX INFO: loaded from: classes.dex */
public final class C23918 extends AbstractC5574 {
    public C23918(AbstractC8396[] abstractC8396Arr) {
        super(EnumC1340.PHI, abstractC8396Arr);
    }

    @Override // l.AbstractC5574, l.AbstractC8396
    public final AbstractC8396 clone() {
        return new C23918(m15836());
    }

    @Override // l.AbstractC8396
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8396 mo6718(C1403 c1403) {
        return new C23918(m15837(c1403));
    }

    @Override // l.AbstractC8396
    /* JADX INFO: renamed from: ܳ */
    public final String mo6719() {
        StringBuilder sb = new StringBuilder("φ(");
        boolean z = true;
        for (AbstractC8396 abstractC8396 : this.f17269) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(abstractC8396);
        }
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }
}
