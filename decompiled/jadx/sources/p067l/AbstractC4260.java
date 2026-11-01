package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.֫ᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7MN */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4260 extends AbstractC9584 {

    /* JADX INFO: renamed from: ۡ */
    public volatile boolean f9446;

    /* JADX INFO: renamed from: ۢ */
    public byte[] f9447;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo8652(int i, byte[] bArr);

    public AbstractC4260(InterfaceC22753 interfaceC22753, C5318 c5318, C10307 c10307, int i, Object obj, byte[] bArr) {
        super(interfaceC22753, c5318, 3, c10307, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f9447 = bArr == null ? C5792.f14227 : bArr;
    }

    /* JADX INFO: renamed from: ܳ */
    public final byte[] m8654() {
        return this.f9447;
    }

    @Override // p067l.InterfaceC24947
    /* JADX INFO: renamed from: ۧ */
    public final void mo8653() {
        this.f9446 = true;
    }

    @Override // p067l.InterfaceC24947
    /* JADX INFO: renamed from: ֫ */
    public final void mo8651() {
        try {
            this.f26376.mo4020(this.f26378);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.f9446) {
                byte[] bArr = this.f9447;
                if (bArr.length < i2 + 16384) {
                    this.f9447 = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.f26376.read(this.f9447, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.f9446) {
                mo8652(i2, this.f9447);
            }
        } finally {
            C10685.m24613(this.f26376);
        }
    }
}
