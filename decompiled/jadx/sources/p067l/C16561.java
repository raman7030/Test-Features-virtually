package p067l;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ܶۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes4.dex */
public final class C16561 extends AbstractC3150 {

    /* JADX INFO: renamed from: ۗ */
    public C2479[] f48636;

    /* JADX INFO: renamed from: ۙ */
    public int f48637;

    /* JADX INFO: renamed from: ۛ */
    public C6205 f48638;

    /* JADX INFO: renamed from: ۤ */
    public final int f48639;

    /* JADX INFO: renamed from: ۫ */
    public final String f48640;

    /* JADX INFO: renamed from: ۬ */
    public final C7174 f48641;

    /* JADX INFO: renamed from: ᩶ */
    public C19244 f48642;

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ int m37537(C16561 c16561) {
        int i = c16561.f48637;
        c16561.f48637 = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: ֡ */
    public final int m37539() {
        return this.f48639;
    }

    @Override // p067l.AbstractC3150
    public final String getName() {
        return this.f48638.getName();
    }

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ۧ */
    public final C7174 mo3535() {
        return this.f48641;
    }

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ܿ */
    public final String mo3542() {
        return this.f48640;
    }

    /* JADX INFO: renamed from: ܺ */
    public final C19244 m37541() {
        return this.f48642;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final int m37542() {
        return this.f48637;
    }

    public final List getFields() {
        return C21562.unmodifiableList(Arrays.asList(this.f48636));
    }

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC24548 mo3533() {
        return this.f48638;
    }

    /* JADX INFO: renamed from: ۚ */
    public final boolean m37540() {
        C2479[] c2479Arr = this.f48636;
        return c2479Arr.length == 1 && c2479Arr[0].f3893;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m37538(C16561 c16561) {
        c16561.m5384(c16561.f48638.m14059().m4567());
    }

    public C16561(C6205 c6205, C7174 c7174, C19244 c19244, int i) {
        super(0);
        this.f5767 = c19244;
        this.f48638 = c6205;
        this.f48640 = C23268.m51807(c7174, c19244, c6205.getName());
        this.f48641 = c7174;
        this.f48639 = i;
        this.f48642 = c19244;
        this.f48637 = 0;
    }
}
