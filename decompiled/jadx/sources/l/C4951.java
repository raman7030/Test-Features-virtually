package l;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙ᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U7MS */
/* JADX INFO: loaded from: classes3.dex */
public final class C4951 extends AbstractC10596 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f15593;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f15594;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f15595;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean f15596;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C20474 f15597;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f15598;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final long f15599;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long f15600;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f15601;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f15602;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final long f15603;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f15604;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f15605;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f15606;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C19643 f15607;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AbstractC9608 f15608;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f15609;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f15610;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f15611;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f15612;

    @Override // l.AbstractC10596
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo14390(List list) {
        return this;
    }

    public C4951(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, C19643 c19643, List list2, List list3, C20474 c20474, Map map, List list4) {
        super(str, list, z3);
        this.f15595 = i;
        this.f15599 = j2;
        this.f15596 = z;
        this.f15602 = z2;
        this.f15606 = i2;
        this.f15600 = j3;
        this.f15611 = i3;
        this.f15603 = j4;
        this.f15604 = j5;
        this.f15612 = z4;
        this.f15609 = z5;
        this.f15607 = c19643;
        this.f15593 = AbstractC14545.copyOf((Collection) list2);
        this.f15610 = AbstractC14545.copyOf((Collection) list3);
        this.f15608 = AbstractC9608.copyOf(map);
        this.f15601 = AbstractC14545.copyOf((Collection) list4);
        if (!list3.isEmpty()) {
            C8479 c8479 = (C8479) C8882.m22955(list3);
            this.f15605 = c8479.f73016 + c8479.f73013;
        } else if (!list2.isEmpty()) {
            C21885 c21885 = (C21885) C8882.m22955(list2);
            this.f15605 = c21885.f73016 + c21885.f73013;
        } else {
            this.f15605 = 0L;
        }
        long jMax = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            if (j >= 0) {
                jMax = Math.min(this.f15605, j);
            } else {
                jMax = Math.max(0L, this.f15605 + j);
            }
        }
        this.f15594 = jMax;
        this.f15598 = j >= 0;
        this.f15597 = c20474;
    }
}
