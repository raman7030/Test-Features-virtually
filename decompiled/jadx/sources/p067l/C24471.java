package p067l;

/* JADX INFO: renamed from: l.᩺᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes.dex */
public class C24471 extends AbstractC7708 {
    @Override // p067l.AbstractC7708
    /* JADX INFO: renamed from: ֫ */
    public final String mo17843() {
        return "nth-of-type";
    }

    @Override // p067l.AbstractC7708
    /* JADX INFO: renamed from: ֫ */
    public final int mo17842(C21199 c21199) {
        int i = 0;
        if (c21199.mo30143() == null) {
            return 0;
        }
        for (C21199 c211910 : c21199.mo30143().m47890()) {
            if (c211910.m47882().equals(c21199.m47882())) {
                i++;
            }
            if (c211910 == c21199) {
                break;
            }
        }
        return i;
    }
}
