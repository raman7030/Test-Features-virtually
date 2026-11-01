package p067l;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙ᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U7MS */
/* JADX INFO: loaded from: classes3.dex */
public final class C7074 extends AbstractC12439 {

    /* JADX INFO: renamed from: ֡ */
    public final AbstractC16192 f18427;

    /* JADX INFO: renamed from: ֨ */
    public final long f18428;

    /* JADX INFO: renamed from: ۖ */
    public final int f18429;

    /* JADX INFO: renamed from: ۘ */
    public final boolean f18430;

    /* JADX INFO: renamed from: ۚ */
    public final C21827 f18431;

    /* JADX INFO: renamed from: ۜ */
    public final boolean f18432;

    /* JADX INFO: renamed from: ۠ */
    public final long f18433;

    /* JADX INFO: renamed from: ۡ */
    public final long f18434;

    /* JADX INFO: renamed from: ۢ */
    public final AbstractC16192 f18435;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f18436;

    /* JADX INFO: renamed from: ܶ */
    public final long f18437;

    /* JADX INFO: renamed from: ܺ */
    public final long f18438;

    /* JADX INFO: renamed from: ܿ */
    public final long f18439;

    /* JADX INFO: renamed from: ᩳ */
    public final int f18440;

    /* JADX INFO: renamed from: ᩴ */
    public final C21037 f18441;

    /* JADX INFO: renamed from: ᩵ */
    public final AbstractC11500 f18442;

    /* JADX INFO: renamed from: ᩷ */
    public final boolean f18443;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC16192 f18444;

    /* JADX INFO: renamed from: ᩹ */
    public final int f18445;

    /* JADX INFO: renamed from: ᩻ */
    public final boolean f18446;

    @Override // p067l.AbstractC12439
    /* JADX INFO: renamed from: ֫ */
    public final Object mo16293(List list) {
        return this;
    }

    public C7074(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, C21037 c21037, List list2, List list3, C21827 c21827, Map map, List list4) {
        super(str, list, z3);
        this.f18429 = i;
        this.f18433 = j2;
        this.f18430 = z;
        this.f18436 = z2;
        this.f18440 = i2;
        this.f18434 = j3;
        this.f18445 = i3;
        this.f18437 = j4;
        this.f18438 = j5;
        this.f18446 = z4;
        this.f18443 = z5;
        this.f18441 = c21037;
        this.f18427 = AbstractC16192.copyOf((Collection) list2);
        this.f18444 = AbstractC16192.copyOf((Collection) list3);
        this.f18442 = AbstractC11500.copyOf(map);
        this.f18435 = AbstractC16192.copyOf((Collection) list4);
        if (!list3.isEmpty()) {
            C10427 c10427 = (C10427) C10810.m24926(list3);
            this.f18439 = c10427.f75743 + c10427.f75740;
        } else if (!list2.isEmpty()) {
            C23168 c23168 = (C23168) C10810.m24926(list2);
            this.f18439 = c23168.f75743 + c23168.f75740;
        } else {
            this.f18439 = 0L;
        }
        long jMax = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            if (j >= 0) {
                jMax = Math.min(this.f18439, j);
            } else {
                jMax = Math.max(0L, this.f18439 + j);
            }
        }
        this.f18428 = jMax;
        this.f18432 = j >= 0;
        this.f18431 = c21827;
    }
}
