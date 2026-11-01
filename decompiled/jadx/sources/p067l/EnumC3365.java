package p067l;

/* JADX INFO: renamed from: l.֨ۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC3365 {
    NORMAL("var.might.already.be.assigned", false),
    SPECULATIVE_LOOP("var.might.be.assigned.in.loop", true);


    /* JADX INFO: renamed from: ᩸ */
    public final String f6650;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f6651;

    EnumC3365(String str, boolean z) {
        this.f6650 = str;
        this.f6651 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m5888() {
        return this.f6651;
    }
}
