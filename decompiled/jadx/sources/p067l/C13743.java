package p067l;

/* JADX INFO: renamed from: l.ۨ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes4.dex */
public class C13743 extends AbstractC7708 {
    @Override // p067l.AbstractC7708
    /* JADX INFO: renamed from: ֫ */
    public final String mo17843() {
        return "nth-last-of-type";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.AbstractC7708
    /* JADX INFO: renamed from: ֫ */
    public final int mo17842(C21199 c21199) {
        int i = 0;
        if (c21199.mo30143() == null) {
            return 0;
        }
        C4355 c4355M47890 = c21199.mo30143().m47890();
        for (int iM47880 = c21199.m47880(); iM47880 < c4355M47890.size(); iM47880++) {
            if (((C21199) c4355M47890.get(iM47880)).m47882().equals(c21199.m47882())) {
                i++;
            }
        }
        return i;
    }
}
