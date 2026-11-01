package p067l;

/* JADX INFO: renamed from: l.᩵ۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: V702 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20794 implements InterfaceC8367 {

    /* JADX INFO: renamed from: ֫ */
    public int f65352;

    /* JADX INFO: renamed from: ۧ */
    public int f65353;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C5370 f65354;

    /* JADX INFO: renamed from: ܽ */
    public int f65355 = -1;

    /* JADX INFO: renamed from: ܿ */
    public C21307[] f65356;

    /* JADX INFO: renamed from: ᩳ */
    public int[] f65357;

    public C20794(C5370 c5370) {
        this.f65354 = c5370;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ۧ */
    public final int mo13591() {
        return this.f65355 < 0 ? this.f65354.f12727 : this.f65353;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ۬ */
    public final int mo13595(int i) {
        return this.f65354.f12714[i].f6598.f67702;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ֡ */
    public final int mo13575(int i) {
        return this.f65354.f12714[i].f6584;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ᩵ */
    public final int mo13607(int i) {
        return this.f65354.f12714[i].f6598.f67707;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ۧ */
    public final int mo13592(int i) {
        return this.f65354.f12714[i].f6604;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ܳ */
    public final int mo13596(int i) {
        C5370 c5370 = this.f65354;
        return m46941(c5370.f12714[i], c5370.f12714[i].f6580);
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ֫ */
    public final int mo13578(int i) {
        C5370 c5370 = this.f65354;
        return m46941(c5370.f12714[i], c5370.f12714[i].f6570);
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ᩹ */
    public final int mo13611(int i) {
        C5370 c5370 = this.f65354;
        return m46941(c5370.f12714[i], c5370.f12714[i].f6574);
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ᩳ */
    public final int mo13604(int i) {
        C5370 c5370 = this.f65354;
        return m46941(c5370.f12714[i], c5370.f12714[i].f6606);
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ᩷ */
    public final int mo13609(int i) {
        C5370 c5370 = this.f65354;
        return m46941(c5370.f12714[i], c5370.f12714[i].f6572);
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ۫ */
    public final int mo13594(int i) {
        int i2 = this.f65355;
        if (i2 >= 0 && i == this.f65353 - 1) {
            return i2;
        }
        C5370 c5370 = this.f65354;
        long j = c5370.f12714[i].f6594;
        if (j < 0) {
            return (int) j;
        }
        long j2 = ((long) c5370.f12714[i].f6576) + ((long) ((int) j));
        int i3 = (int) j2;
        if (j2 == i3) {
            return i3;
        }
        throw new ArithmeticException();
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ۠ */
    public final int mo13587(int i) {
        return this.f65354.f12714[i].f6626;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ᩻ */
    public final int mo13612(int i) {
        return this.f65354.f12714[i].f6579;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ۙ */
    public final int mo13584(int i) {
        return this.f65354.f12714[i].f6614;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ᩶ */
    public final int mo13608(int i) {
        return this.f65354.f12714[i].f6616;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ܽ */
    public final long mo13601(int i) {
        return this.f65354.f12714[i].f6565;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ܿ */
    public final int mo13602(int i) {
        return this.f65355 >= 0 ? this.f65357[i] : this.f65354.f12714[i].f6619;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ۚ */
    public final C21307 mo13585(int i) {
        return this.f65355 >= 0 ? this.f65356[i] : this.f65354.f12714[i].f6587;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ۤ */
    public final int mo13590(int i) {
        return this.f65354.f12714[i].f6588.f49418;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ܶ */
    public final int mo13598(int i) {
        C16768 c16768 = this.f65354.f12714[i].f6588;
        long j = ((long) c16768.f49418) + ((long) c16768.f49417);
        int i2 = (int) j;
        if (j == i2) {
            return i2;
        }
        throw new ArithmeticException();
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ۖ */
    public final int mo13581(int i) {
        if (!m46942(i)) {
            return -1;
        }
        C5370 c5370 = this.f65354;
        return m46941(c5370.f12714[i], c5370.f12714[i].f6602);
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ᩸ */
    public final int mo13610(int i) {
        if (!m46942(i)) {
            return -1;
        }
        C5370 c5370 = this.f65354;
        return m46941(c5370.f12714[i], c5370.f12714[i].f6599);
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ֨ */
    public final int mo13576(int i) {
        if (!m46942(i)) {
            return -1;
        }
        C5370 c5370 = this.f65354;
        return m46941(c5370.f12714[i], c5370.f12714[i].f6625);
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ۘ */
    public final int mo13583(int i) {
        return this.f65354.f12714[i].f6593;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ۜ */
    public final int mo13586(int i) {
        return this.f65354.f12714[i].f6597;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ۢ */
    public final int mo13589(int i) {
        int i2 = this.f65355;
        if (i2 >= 0 && i == this.f65353 - 1) {
            return i2;
        }
        C3358 c3358 = this.f65354.f12714[i];
        C16768 c16768 = c3358.f6569;
        if (c16768 == null) {
            return -1;
        }
        long j = ((long) c16768.f49418) + ((long) c3358.f6595);
        int i3 = (int) j;
        if (j == i3) {
            return i3;
        }
        throw new ArithmeticException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ۗ */
    public final int mo13582(int i) {
        C3358 c3358 = this.f65354.f12714[i];
        boolean z = c3358.f6566;
        ?? r0 = z;
        if (c3358.f6573) {
            r0 = (z ? 1 : 0) | 2;
        }
        ?? r1 = r0;
        if (c3358.f6563) {
            r1 = (r0 == true ? 1 : 0) | 4;
        }
        if (c3358.f6604 == 15) {
            return c3358.f6615 ? r1 | 24 : r1 | 8;
        }
        return r1;
    }

    /* JADX INFO: renamed from: ۛ */
    private boolean m46942(int i) {
        C3358 c3358 = this.f65354.f12714[i];
        AbstractC21639 abstractC21639 = c3358.f6586;
        if (!(abstractC21639 instanceof C12251) || ((C12251) abstractC21639).f34250 == null) {
            return false;
        }
        int i2 = c3358.f6604;
        return (i2 == 12 || i2 == 13 || i2 == 15) && c3358.f6566;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ֫ */
    public final int mo13577() {
        C5370 c5370 = this.f65354;
        if (c5370.f12673 == null) {
            return 1;
        }
        return c5370.f12714[0].f6561;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ܽ */
    public final int mo13600() {
        if (this.f65355 >= 0) {
            return this.f65352;
        }
        C5370 c5370 = this.f65354;
        if (c5370.f12673 == null) {
            return 0;
        }
        return c5370.f12673.m36631() - c5370.f12714[0].f6561;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ۡ */
    public final int mo13588(int i) {
        C5370 c5370 = this.f65354;
        if (c5370.f12673 == null) {
            return 0;
        }
        return c5370.f12714[i].f6561 - c5370.f12714[0].f6561;
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ᩴ */
    public final int mo13606(int i) {
        return m46943(this.f65354.f12714[i].f6575);
    }

    @Override // p067l.InterfaceC8367
    /* JADX INFO: renamed from: ܺ */
    public final int mo13599(int i) {
        C3358 c3358 = this.f65354.f12714[i];
        AbstractC21639 abstractC21639 = c3358.f6586;
        if (!(abstractC21639 instanceof C12251) || ((C12251) abstractC21639).f34250 == null) {
            return -1;
        }
        int i2 = c3358.f6604;
        if (i2 == 12 || i2 == 13 || i2 == 15) {
            return m46943(c3358.f6603);
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۨ */
    private int m46943(int i) {
        C5370 c5370 = this.f65354;
        if (c5370.f12673 == null || i == 0) {
            return -1;
        }
        int i2 = i - c5370.f12714[0].f6561;
        if (i2 >= 0) {
            return i2;
        }
        throw new C10064(EnumC2687.INVALID_RESULT);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m46941(C3358 c3358, int i) {
        if (i < 0) {
            return i;
        }
        long j = ((long) c3358.f6576) + ((long) i);
        int i2 = (int) j;
        if (j == i2) {
            return i2;
        }
        throw new ArithmeticException();
    }
}
