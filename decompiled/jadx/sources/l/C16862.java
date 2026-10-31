package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܽ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5C6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16862 extends AbstractC13397 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C11072 f51741;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C7338 f51742;

    public C16862(EnumC1340 enumC1340, AbstractC8396[] abstractC8396Arr, C11072 c11072, C7338 c7338) {
        super(enumC1340, abstractC8396Arr);
        this.f51741 = c11072;
        this.f51742 = c7338;
    }

    @Override // l.AbstractC13397
    /* JADX INFO: renamed from: ᩷ */
    public final C11072 mo6720() {
        return this.f51741;
    }

    @Override // l.AbstractC5574, l.AbstractC8396
    public final AbstractC8396 clone() {
        return new C16862(this.f25745, m15836(), this.f51741, this.f51742);
    }

    @Override // l.AbstractC8396
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8396 mo6718(C1403 c1403) {
        return new C16862(this.f25745, m15837(c1403), this.f51741, this.f51742);
    }

    @Override // l.AbstractC8396
    /* JADX INFO: renamed from: ܳ */
    public final String mo6719() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17269[0]);
        sb.append('.');
        sb.append(this.f51742.m19700());
        String[] strArrM27468 = this.f51741.m27468();
        sb.append('(');
        int i = 1;
        boolean z = true;
        int i2 = 0;
        while (i < this.f17269.length) {
            if (z) {
                z = false;
            } else {
                sb.append(',');
            }
            sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
            sb.append(C0459.m2045(strArrM27468[i2]));
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            sb.append(this.f17269[i]);
            i++;
            i2++;
        }
        sb.append(')');
        return sb.toString();
    }
}
