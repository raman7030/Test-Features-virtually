package p067l;

/* JADX INFO: renamed from: l.᩸ۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes5.dex */
public final class C22598 extends AbstractC3150 {

    /* JADX INFO: renamed from: ۗ */
    public C9856[] f71330;

    /* JADX INFO: renamed from: ۙ */
    public final String f71331;

    /* JADX INFO: renamed from: ۬ */
    public C10228 f71332;

    /* JADX INFO: renamed from: ᩶ */
    public final C7174 f71333;

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC24548 mo3533() {
        return this.f71332;
    }

    @Override // p067l.AbstractC3150
    public final String getName() {
        return this.f71332.getName();
    }

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ܿ */
    public final String mo3542() {
        return this.f71331;
    }

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ۧ */
    public final C7174 mo3535() {
        return this.f71333;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22598(C10228 c10228, C7174 c7174) {
        super(0);
        this.f5767 = c7174;
        this.f71332 = c10228;
        this.f71331 = C23268.m51807(c7174, null, c10228.getName());
        this.f71333 = c7174;
        this.f71330 = new C9856[c10228.m23845()];
        for (int i = 0; i < c10228.m23845(); i++) {
            this.f71330[i] = new C9856(c10228.m23844(i), c7174, this);
        }
        c7174.f18731.m54247(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50643(C22598 c22598) {
        c22598.m5384(c22598.f71332.m23847().m52593());
        for (C9856 c9856 : c22598.f71330) {
            C9856.m23126(c9856);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m50644(C22598 c22598) {
        for (C9856 c9856 : c22598.f71330) {
            C9856.m23127(c9856);
        }
    }
}
