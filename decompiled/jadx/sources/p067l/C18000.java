package p067l;

import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: renamed from: l.ܽۛ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 08RN */
/* JADX INFO: loaded from: classes4.dex */
public final class C18000 {

    /* JADX INFO: renamed from: ᩳ */
    public boolean f53761;

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f53757 = new HashMap();

    /* JADX INFO: renamed from: ۜ */
    public UUID f53756 = C25059.f79955;

    /* JADX INFO: renamed from: ֫ */
    public C20780 f53755 = C19499.f59397;

    /* JADX INFO: renamed from: ᩻ */
    public int[] f53762 = new int[0];

    /* JADX INFO: renamed from: ܿ */
    public boolean f53760 = true;

    /* JADX INFO: renamed from: ܽ */
    public C24356 f53759 = new C24356();

    /* JADX INFO: renamed from: ܳ */
    public long f53758 = 300000;

    /* JADX INFO: renamed from: ֫ */
    public final void m40979(UUID uuid) {
        uuid.getClass();
        this.f53756 = uuid;
        this.f53755 = C19499.f59397;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40980(boolean z) {
        this.f53761 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40981(int... iArr) {
        for (int i : iArr) {
            boolean z = true;
            if (i != 2 && i != 1) {
                z = false;
            }
            C23877.m52957(z);
        }
        this.f53762 = (int[]) iArr.clone();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m40982(boolean z) {
        this.f53760 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4590 m40978(C18828 c18828) {
        return new C4590(this.f53756, this.f53755, c18828, this.f53757, this.f53761, this.f53762, this.f53760, this.f53759, this.f53758);
    }
}
