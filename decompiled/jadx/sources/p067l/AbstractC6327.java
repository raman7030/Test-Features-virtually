package p067l;

/* JADX INFO: renamed from: l.ۘ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5TF */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6327 {

    /* JADX INFO: renamed from: ֫ */
    public final int f16398;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC6327 f16399;

    public AbstractC6327(int i, AbstractC6327 abstractC6327) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException(C20778.m46922(i, "Unsupported api "));
        }
        if (i == 17432576) {
            C11692.m26858(this);
        }
        this.f16398 = i;
        this.f16399 = abstractC6327;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC15773 mo7677(String str, boolean z) {
        AbstractC6327 abstractC6327 = this.f16399;
        if (abstractC6327 != null) {
            return abstractC6327.mo7677(str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC15773 mo7676(int i, C24431 c24431, String str, boolean z) {
        if (this.f16398 < 327680) {
            throw new UnsupportedOperationException("This feature requires ASM5");
        }
        AbstractC6327 abstractC6327 = this.f16399;
        if (abstractC6327 != null) {
            return abstractC6327.mo7676(i, c24431, str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo14474(C18396 c18396) {
        AbstractC6327 abstractC6327 = this.f16399;
        if (abstractC6327 != null) {
            abstractC6327.mo14474(c18396);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo14473() {
        AbstractC6327 abstractC6327 = this.f16399;
        if (abstractC6327 != null) {
            abstractC6327.mo14473();
        }
    }
}
