package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.֨ۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z72R */
/* JADX INFO: loaded from: classes3.dex */
public class C3237 extends AbstractC8202 implements InterfaceC5642 {

    /* JADX INFO: renamed from: ۖ֫ */
    public volatile String f6274;

    /* JADX INFO: renamed from: ۘ֫ */
    public volatile long f6275;

    /* JADX INFO: renamed from: ܺ֫ */
    public final AtomicBoolean f6276 = new AtomicBoolean();

    /* JADX INFO: renamed from: ᩵֫ */
    public static final Semaphore f6273 = new Semaphore(1, true);

    /* JADX INFO: renamed from: ᩴ֫ */
    public static final C4050 f6272 = ConcurrentMapC12768.newKeySet();

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5589(AbstractActivityC5549 abstractActivityC5549, C18736 c18736, boolean z) {
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79710;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        String str = this.f6274;
        return str == null ? m13492("archiveName") : str;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        m13472(R.string.MT_Protector);
        m13491(R.string.MT_Protector);
        mo13474(0);
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() {
        C18736 c18736M42767;
        String strM16224;
        try {
            if (m13479().containsKey("sourceTempLease")) {
                this.f6275 = m13463("sourceTempLease");
            }
            AbstractC15599 abstractC15599M13462 = m13462();
            String strM42097 = C18521.m42097(abstractC15599M13462);
            C4050 c4050 = f6272;
            if (!c4050.add(strM42097)) {
                String strM16225 = C7050.m16224(R.string.MT_Protector);
                this.f6274 = strM16225;
                C18736 c18736M42765 = C18736.m42765(strM16225);
                m5588();
                return c18736M42765;
            }
            try {
                Semaphore semaphore = f6273;
                boolean zTryAcquire = semaphore.tryAcquire();
                if (!zTryAcquire) {
                    String strM16226 = C7050.m16224(R.string.MT_Protector);
                    this.f6274 = strM16226;
                    C18736 c18736M42766 = C18736.m42765(strM16226);
                    if (zTryAcquire) {
                        semaphore.release();
                    }
                    c4050.remove(strM42097);
                    m5588();
                    return c18736M42766;
                }
                try {
                    C3769 c3769M42094 = C18521.m42094(abstractC15599M13462);
                    C8324 c8324M42082 = C18521.m42082(abstractC15599M13462, this);
                    if (c8324M42082.m19214() != EnumC12487.CANCELED && !m5590()) {
                        if (!c3769M42094.m7345(abstractC15599M13462)) {
                            String strM16227 = C7050.m16224(R.string.MT_Protector);
                            this.f6274 = strM16227;
                            C18736 c18736M42768 = C18736.m42765(strM16227);
                            if (zTryAcquire) {
                                semaphore.release();
                            }
                            c4050.remove(strM42097);
                            m5588();
                            return c18736M42768;
                        }
                        int i = C7261.f18928[c8324M42082.m19214().ordinal()];
                        if (i == 1) {
                            c18736M42767 = C18736.m42767();
                        } else if (i != 2) {
                            if (i == 3) {
                                strM16224 = c8324M42082.m19212() == null ? C7050.m16224(R.string.MT_Protector) : C7050.m16203(R.string.MT_Protector, c8324M42082.m19212());
                                this.f6274 = strM16224;
                            } else if (i == 4) {
                                strM16224 = C7050.m16224(R.string.MT_Protector);
                                this.f6274 = strM16224;
                            } else {
                                if (i != 5) {
                                    throw new IncompatibleClassChangeError();
                                }
                                Exception iOException = c8324M42082.m19213() == null ? new IOException("Archive test failed") : c8324M42082.m19213();
                                this.f6274 = iOException.getMessage();
                                c18736M42767 = C18736.m42764(iOException);
                            }
                            c18736M42767 = C18736.m42765(strM16224);
                        } else {
                            c18736M42767 = C18736.m42768();
                        }
                        if (zTryAcquire) {
                            semaphore.release();
                        }
                        c4050.remove(strM42097);
                        m5588();
                        return c18736M42767;
                    }
                    C18736 c18736M42769 = C18736.m42768();
                    if (zTryAcquire) {
                        semaphore.release();
                    }
                    c4050.remove(strM42097);
                    m5588();
                    return c18736M42769;
                } catch (IOException unused) {
                    String strM16228 = C7050.m16224(R.string.MT_Protector);
                    this.f6274 = strM16228;
                    C18736 c18736M427610 = C18736.m42765(strM16228);
                    if (zTryAcquire) {
                        f6273.release();
                    }
                    f6272.remove(strM42097);
                    m5588();
                    return c18736M427610;
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    f6273.release();
                }
                f6272.remove(strM42097);
                throw th;
            }
        } catch (Throwable th2) {
            m5588();
            throw th2;
        }
    }

    @Override // p067l.AbstractC5996
    public final void cancel() {
        this.f6276.set(true);
        super.cancel();
    }

    /* JADX INFO: renamed from: ۫֫ */
    public final boolean m5590() {
        return this.f6276.get() || mo3924();
    }

    /* JADX INFO: renamed from: ۤ֫ */
    private void m5588() {
        long j = this.f6275;
        if (j != 0) {
            this.f6275 = 0L;
            AbstractC18422.m41967(j);
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        m5588();
        if (c18736.m42773()) {
            C22682.m50793(R.string.MT_Protector);
        }
    }
}
