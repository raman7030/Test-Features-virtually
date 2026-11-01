package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: renamed from: l.ܶ֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: T8NO */
/* JADX INFO: loaded from: classes4.dex */
public final class C16500 implements InterfaceC2418 {

    /* JADX INFO: renamed from: ۘ */
    public ShortBuffer f48468;

    /* JADX INFO: renamed from: ۜ */
    public long f48469;

    /* JADX INFO: renamed from: ۡ */
    public int f48470;

    /* JADX INFO: renamed from: ۢ */
    public C19854 f48471;

    /* JADX INFO: renamed from: ۧ */
    public ByteBuffer f48472;

    /* JADX INFO: renamed from: ܳ */
    public C19854 f48473;

    /* JADX INFO: renamed from: ܺ */
    public boolean f48474;

    /* JADX INFO: renamed from: ܽ */
    public C19854 f48475;

    /* JADX INFO: renamed from: ܿ */
    public boolean f48476;

    /* JADX INFO: renamed from: ᩳ */
    public long f48477;

    /* JADX INFO: renamed from: ᩴ */
    public C9795 f48478;

    /* JADX INFO: renamed from: ᩷ */
    public C19854 f48480;

    /* JADX INFO: renamed from: ᩻ */
    public ByteBuffer f48481;

    /* JADX INFO: renamed from: ᩵ */
    public float f48479 = 1.0f;

    /* JADX INFO: renamed from: ۖ */
    public float f48467 = 1.0f;

    public C16500() {
        C19854 c19854 = C19854.f60350;
        this.f48480 = c19854;
        this.f48471 = c19854;
        this.f48475 = c19854;
        this.f48473 = c19854;
        ByteBuffer byteBuffer = InterfaceC2418.f3706;
        this.f48472 = byteBuffer;
        this.f48468 = byteBuffer.asShortBuffer();
        this.f48481 = byteBuffer;
        this.f48470 = -1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m37427(float f) {
        C23877.m52957(f > 0.0f);
        if (this.f48479 != f) {
            this.f48479 = f;
            this.f48474 = true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37426(float f) {
        C23877.m52957(f > 0.0f);
        if (this.f48467 != f) {
            this.f48467 = f;
            this.f48474 = true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m37425(long j) {
        if (this.f48469 >= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            long j2 = this.f48477;
            C9795 c9795 = this.f48478;
            c9795.getClass();
            long jM22856 = j2 - ((long) c9795.m22856());
            int i = this.f48473.f60354;
            int i2 = this.f48475.f60354;
            return i == i2 ? C5792.m12993(j, jM22856, this.f48469, RoundingMode.DOWN) : C5792.m12993(j, jM22856 * ((long) i), this.f48469 * ((long) i2), RoundingMode.DOWN);
        }
        return (long) (((double) this.f48479) * j);
    }

    @Override // p067l.InterfaceC2418
    /* JADX INFO: renamed from: ֫ */
    public final C19854 mo3356(C19854 c19854) throws C20525 {
        if (c19854.f60353 != 2) {
            throw new C20525(c19854);
        }
        int i = this.f48470;
        if (i == -1) {
            i = c19854.f60354;
        }
        this.f48480 = c19854;
        C19854 c19855 = new C19854(i, c19854.f60352, 2);
        this.f48471 = c19855;
        this.f48474 = true;
        return c19855;
    }

    @Override // p067l.InterfaceC2418
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo3359() {
        if (this.f48471.f60354 != -1) {
            return Math.abs(this.f48479 - 1.0f) >= 1.0E-4f || Math.abs(this.f48467 - 1.0f) >= 1.0E-4f || this.f48471.f60354 != this.f48480.f60354;
        }
        return false;
    }

    @Override // p067l.InterfaceC2418
    /* JADX INFO: renamed from: ֫ */
    public final void mo3357(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C9795 c9795 = this.f48478;
            c9795.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f48477 += (long) iRemaining;
            c9795.m22855(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // p067l.InterfaceC2418
    /* JADX INFO: renamed from: ܿ */
    public final void mo3360() {
        C9795 c9795 = this.f48478;
        if (c9795 != null) {
            c9795.m22857();
        }
        this.f48476 = true;
    }

    @Override // p067l.InterfaceC2418
    /* JADX INFO: renamed from: ᩳ */
    public final ByteBuffer mo3361() {
        int iM22854;
        C9795 c9795 = this.f48478;
        if (c9795 != null && (iM22854 = c9795.m22854()) > 0) {
            if (this.f48472.capacity() < iM22854) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iM22854).order(ByteOrder.nativeOrder());
                this.f48472 = byteBufferOrder;
                this.f48468 = byteBufferOrder.asShortBuffer();
            } else {
                this.f48472.clear();
                this.f48468.clear();
            }
            c9795.m22853(this.f48468);
            this.f48469 += (long) iM22854;
            this.f48472.limit(iM22854);
            this.f48481 = this.f48472;
        }
        ByteBuffer byteBuffer = this.f48481;
        this.f48481 = InterfaceC2418.f3706;
        return byteBuffer;
    }

    @Override // p067l.InterfaceC2418
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo3358() {
        if (!this.f48476) {
            return false;
        }
        C9795 c9795 = this.f48478;
        return c9795 == null || c9795.m22854() == 0;
    }

    @Override // p067l.InterfaceC2418
    public final void flush() {
        if (mo3359()) {
            C19854 c19854 = this.f48480;
            this.f48475 = c19854;
            C19854 c19855 = this.f48471;
            this.f48473 = c19855;
            if (this.f48474) {
                this.f48478 = new C9795(this.f48479, c19854.f60354, this.f48467, c19854.f60352, c19855.f60354);
            } else {
                C9795 c9795 = this.f48478;
                if (c9795 != null) {
                    c9795.m22852();
                }
            }
        }
        this.f48481 = InterfaceC2418.f3706;
        this.f48477 = 0L;
        this.f48469 = 0L;
        this.f48476 = false;
    }

    @Override // p067l.InterfaceC2418
    public final void reset() {
        this.f48479 = 1.0f;
        this.f48467 = 1.0f;
        C19854 c19854 = C19854.f60350;
        this.f48480 = c19854;
        this.f48471 = c19854;
        this.f48475 = c19854;
        this.f48473 = c19854;
        ByteBuffer byteBuffer = InterfaceC2418.f3706;
        this.f48472 = byteBuffer;
        this.f48468 = byteBuffer.asShortBuffer();
        this.f48481 = byteBuffer;
        this.f48470 = -1;
        this.f48474 = false;
        this.f48478 = null;
        this.f48477 = 0L;
        this.f48469 = 0L;
        this.f48476 = false;
    }
}
