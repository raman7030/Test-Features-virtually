package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8U5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19487 implements InterfaceC11441, InterfaceC22170 {

    /* JADX INFO: renamed from: ۗ */
    public InterfaceC6076 f59370;

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC11441 f59371;

    /* JADX INFO: renamed from: ۤ */
    public final long f59372;

    /* JADX INFO: renamed from: ۫ */
    public long f59373 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۬ */
    public boolean f59374;

    /* JADX INFO: renamed from: ᩶ */
    public final C17474 f59375;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC23016 f59376;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC22170 f59377;

    @Override // p067l.InterfaceC20985
    /* JADX INFO: renamed from: ֫ */
    public final void mo13095(InterfaceC2878 interfaceC2878) {
        InterfaceC22170 interfaceC22170 = this.f59377;
        String str = C5792.f14228;
        interfaceC22170.mo13095((InterfaceC2878) this);
    }

    public C19487(C17474 c17474, InterfaceC23016 interfaceC23016, long j) {
        this.f59375 = c17474;
        this.f59376 = interfaceC23016;
        this.f59372 = j;
    }

    /* JADX INFO: renamed from: ܳ */
    public final long m44313() {
        return this.f59372;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m44314(long j) {
        this.f59373 = j;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final long m44315() {
        return this.f59373;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44311(InterfaceC6076 interfaceC6076) {
        C23877.m52960(this.f59370 == null);
        this.f59370 = interfaceC6076;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m44316() {
        if (this.f59371 != null) {
            InterfaceC6076 interfaceC6076 = this.f59370;
            interfaceC6076.getClass();
            interfaceC6076.mo11866(this.f59371);
        }
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final void mo13097(InterfaceC22170 interfaceC22170, long j) {
        this.f59377 = interfaceC22170;
        InterfaceC11441 interfaceC11441 = this.f59371;
        if (interfaceC11441 != null) {
            long j2 = this.f59373;
            if (j2 == -9223372036854775807L) {
                j2 = this.f59372;
            }
            interfaceC11441.mo13097(this, j2);
        }
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ܿ */
    public final void mo13100() throws IOException {
        try {
            InterfaceC11441 interfaceC11441 = this.f59371;
            if (interfaceC11441 != null) {
                interfaceC11441.mo13100();
                return;
            }
            InterfaceC6076 interfaceC6076 = this.f59370;
            if (interfaceC6076 != null) {
                interfaceC6076.mo11868();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ᩻ */
    public final C8243 mo13102() {
        InterfaceC11441 interfaceC11441 = this.f59371;
        String str = C5792.f14228;
        return interfaceC11441.mo13102();
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final long mo13092(InterfaceC11617[] interfaceC11617Arr, boolean[] zArr, InterfaceC20314[] interfaceC20314Arr, boolean[] zArr2, long j) {
        long j2 = this.f59373;
        long j3 = (j2 == -9223372036854775807L || j != this.f59372) ? j : j2;
        this.f59373 = -9223372036854775807L;
        InterfaceC11441 interfaceC11441 = this.f59371;
        String str = C5792.f14228;
        return interfaceC11441.mo13092(interfaceC11617Arr, zArr, interfaceC20314Arr, zArr2, j3);
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final void mo13093(long j, boolean z) {
        InterfaceC11441 interfaceC11441 = this.f59371;
        String str = C5792.f14228;
        interfaceC11441.mo13093(j, z);
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ܽ */
    public final long mo13098() {
        InterfaceC11441 interfaceC11441 = this.f59371;
        String str = C5792.f14228;
        return interfaceC11441.mo13098();
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۜ */
    public final long mo4633() {
        InterfaceC11441 interfaceC11441 = this.f59371;
        String str = C5792.f14228;
        return interfaceC11441.mo4633();
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final long mo13090(long j) {
        InterfaceC11441 interfaceC11441 = this.f59371;
        String str = C5792.f14228;
        return interfaceC11441.mo13090(j);
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final long mo13091(long j, C11491 c11491) {
        InterfaceC11441 interfaceC11441 = this.f59371;
        String str = C5792.f14228;
        return interfaceC11441.mo13091(j, c11491);
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۧ */
    public final long mo4634() {
        InterfaceC11441 interfaceC11441 = this.f59371;
        String str = C5792.f14228;
        return interfaceC11441.mo4634();
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۧ */
    public final void mo4635(long j) {
        InterfaceC11441 interfaceC11441 = this.f59371;
        String str = C5792.f14228;
        interfaceC11441.mo4635(j);
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4632(C13268 c13268) {
        InterfaceC11441 interfaceC11441 = this.f59371;
        return interfaceC11441 != null && interfaceC11441.mo4632(c13268);
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4631() {
        InterfaceC11441 interfaceC11441 = this.f59371;
        return interfaceC11441 != null && interfaceC11441.mo4631();
    }

    @Override // p067l.InterfaceC22170
    /* JADX INFO: renamed from: ֫ */
    public final void mo13096(InterfaceC11441 interfaceC11441) {
        InterfaceC22170 interfaceC22170 = this.f59377;
        String str = C5792.f14228;
        interfaceC22170.mo13096((InterfaceC11441) this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44312(C17474 c17474) {
        long j = this.f59373;
        if (j == -9223372036854775807L) {
            j = this.f59372;
        }
        InterfaceC6076 interfaceC6076 = this.f59370;
        interfaceC6076.getClass();
        InterfaceC11441 interfaceC11441Mo11861 = interfaceC6076.mo11861(c17474, this.f59376, j);
        this.f59371 = interfaceC11441Mo11861;
        if (this.f59377 != null) {
            interfaceC11441Mo11861.mo13097(this, j);
        }
    }
}
