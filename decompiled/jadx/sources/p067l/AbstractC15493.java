package p067l;

import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import com.alipay.sdk.app.OpenAuthTask;

/* JADX INFO: renamed from: l.ܰ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L8FI */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15493 extends AbstractC7054 implements InterfaceC23996 {

    /* JADX INFO: renamed from: ֡֫ */
    public final C2753 f44241;

    /* JADX INFO: renamed from: ֨֫ */
    public final C23128 f44242;

    /* JADX INFO: renamed from: ۖ֫ */
    public boolean f44243;

    /* JADX INFO: renamed from: ۗ֫ */
    public long f44244;

    /* JADX INFO: renamed from: ۘ֫ */
    public int f44245;

    /* JADX INFO: renamed from: ۙ֫ */
    public long f44246;

    /* JADX INFO: renamed from: ۚ֫ */
    public boolean f44247;

    /* JADX INFO: renamed from: ۛ֫ */
    public long f44248;

    /* JADX INFO: renamed from: ۜ֫ */
    public boolean f44249;

    /* JADX INFO: renamed from: ۠֫ */
    public boolean f44250;

    /* JADX INFO: renamed from: ۡ֫ */
    public C5713 f44251;

    /* JADX INFO: renamed from: ۢ֫ */
    public InterfaceC3681 f44252;

    /* JADX INFO: renamed from: ۤ֫ */
    public boolean f44253;

    /* JADX INFO: renamed from: ۨ֫ */
    public int f44254;

    /* JADX INFO: renamed from: ۫֫ */
    public SimpleDecoderOutputBuffer f44255;

    /* JADX INFO: renamed from: ۬֫ */
    public long f44256;

    /* JADX INFO: renamed from: ܰ֫ */
    public InterfaceC2577 f44257;

    /* JADX INFO: renamed from: ܳ֫ */
    public boolean f44258;

    /* JADX INFO: renamed from: ܶ֫ */
    public C23128 f44259;

    /* JADX INFO: renamed from: ܺ֫ */
    public InterfaceC2577 f44260;

    /* JADX INFO: renamed from: ᩴ֫ */
    public int f44261;

    /* JADX INFO: renamed from: ᩵֫ */
    public int f44262;

    /* JADX INFO: renamed from: ᩶֫ */
    public boolean f44263;

    /* JADX INFO: renamed from: ᩷֫ */
    public long f44264;

    /* JADX INFO: renamed from: ᩸֫ */
    public C10307 f44265;

    /* JADX INFO: renamed from: ᩹֫ */
    public boolean f44266;

    /* JADX INFO: renamed from: ᩺֫ */
    public final long[] f44267;

    /* JADX INFO: renamed from: ᩻֫ */
    public final InterfaceC6777 f44268;

    /* JADX INFO: renamed from: ֫ */
    public abstract C10307 mo19507(InterfaceC3681 interfaceC3681);

    @Override // p067l.AbstractC7054, p067l.InterfaceC4114
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC23996 mo8292() {
        return this;
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract InterfaceC3681 mo19508(C10307 c10307);

    /* JADX INFO: renamed from: ܿ */
    public abstract int mo19509(C10307 c10307);

    public AbstractC15493(Handler handler, InterfaceC7448 interfaceC7448, InterfaceC6777 interfaceC6777) {
        super(1);
        this.f44241 = new C2753(handler, interfaceC7448);
        this.f44268 = interfaceC6777;
        interfaceC6777.mo15466(new C24211(this));
        this.f44242 = new C23128(0, 0);
        this.f44245 = 0;
        this.f44249 = true;
        m35252(-9223372036854775807L);
        this.f44267 = new long[10];
        this.f44246 = -9223372036854775807L;
        this.f44244 = -9223372036854775807L;
        this.f44256 = -9223372036854775807L;
    }

    @Override // p067l.AbstractC7054, p067l.InterfaceC4114
    /* JADX INFO: renamed from: ۧ */
    public final long mo8295(long j, long j2) {
        boolean z = this.f44256 != -9223372036854775807L;
        if (!this.f44263) {
            if (z || this.f44253) {
                return 1000000L;
            }
        } else {
            InterfaceC6777 interfaceC6777 = this.f44268;
            long jMo15478 = interfaceC6777.mo15478();
            if (z && jMo15478 != -9223372036854775807L) {
                return Math.max(10000L, ((long) ((Math.min(jMo15478, this.f44256 - j) / (interfaceC6777.mo15476() != null ? interfaceC6777.mo15476().f11305 : 1.0f)) / 2.0f)) - (C5792.m12990(m16259().mo35966()) - j2));
            }
        }
        return 10000L;
    }

    @Override // p067l.InterfaceC19537
    /* JADX INFO: renamed from: ֫ */
    public final int mo18494(C10307 c10307) {
        if (!C11669.m26825(c10307.f28528)) {
            return C12832.m29410(0, 0, 0, 0);
        }
        int iMo19509 = mo19509(c10307);
        return iMo19509 <= 2 ? C12832.m29410(iMo19509, 0, 0, 0) : iMo19509 | 168;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m35259(C10307 c10307) {
        return this.f44268.mo15470(c10307);
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m35258(C10307 c10307) {
        return this.f44268.mo15473(c10307);
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ֫ */
    public final void mo8286(long j, long j2) throws C19735 {
        if (this.f44253) {
            try {
                this.f44268.mo15471();
                this.f44256 = this.f44244;
                return;
            } catch (C21530 e) {
                throw m16254(e, e.f67925, e.f67923, 5002);
            }
        }
        if (this.f44265 == null) {
            C5221 c5221M16267 = m16267();
            this.f44242.mo7();
            int iM16252 = m16252(c5221M16267, this.f44242, 2);
            if (iM16252 != -5) {
                if (iM16252 == -4) {
                    C23877.m52960(this.f44242.m14573());
                    this.f44266 = true;
                    try {
                        this.f44253 = true;
                        this.f44268.mo15471();
                        this.f44256 = this.f44244;
                        return;
                    } catch (C21530 e2) {
                        throw m16253(e2, (C10307) null, 5002);
                    }
                }
                return;
            }
            m35248(c5221M16267);
        }
        m35256();
        if (this.f44252 != null) {
            try {
                Trace.beginSection("drainAndFeed");
                while (m35250()) {
                }
                while (m35254()) {
                }
                Trace.endSection();
                synchronized (this.f44251) {
                }
            } catch (C10130 e3) {
                throw m16253(e3, e3.f28079, 5001);
            } catch (C10387 e4) {
                C21334.m48348("Audio codec error", e4);
                this.f44241.m4305(e4);
                throw m16253(e4, this.f44265, 4003);
            } catch (C16834 e5) {
                throw m16254(e5, e5.f49833, e5.f49831, 5001);
            } catch (C21530 e6) {
                throw m16254(e6, e6.f67925, e6.f67923, 5002);
            }
        }
    }

    /* JADX INFO: renamed from: ֫֫ */
    public final void m35257() {
        this.f44258 = true;
    }

    /* JADX INFO: renamed from: ۧ֫ */
    private boolean m35250() throws C19735 {
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = this.f44255;
        InterfaceC6777 interfaceC6777 = this.f44268;
        if (simpleDecoderOutputBuffer == null) {
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer2 = (SimpleDecoderOutputBuffer) this.f44252.mo7101();
            this.f44255 = simpleDecoderOutputBuffer2;
            if (simpleDecoderOutputBuffer2 == null) {
                return false;
            }
            int i = simpleDecoderOutputBuffer2.f68602;
            if (i > 0) {
                this.f44251.f13980 += i;
                interfaceC6777.mo15479();
            }
            if (this.f44255.m14572()) {
                interfaceC6777.mo15479();
                if (this.f44254 != 0) {
                    long[] jArr = this.f44267;
                    m35252(jArr[0]);
                    int i2 = this.f44254 - 1;
                    this.f44254 = i2;
                    System.arraycopy(jArr, 1, jArr, 0, i2);
                }
            }
        }
        if (this.f44255.m14573()) {
            if (this.f44245 == 2) {
                m35255();
                m35256();
                this.f44249 = true;
                return false;
            }
            this.f44255.mo8();
            this.f44255 = null;
            try {
                this.f44253 = true;
                interfaceC6777.mo15471();
                this.f44256 = this.f44244;
                return false;
            } catch (C21530 e) {
                throw m16254(e, e.f67925, e.f67923, 5002);
            }
        }
        this.f44256 = -9223372036854775807L;
        if (this.f44249) {
            C3601 c3601M23918 = mo19507(this.f44252).m23918();
            c3601M23918.m6709(this.f44261);
            c3601M23918.m6690(this.f44262);
            c3601M23918.m6681(this.f44265.f28526);
            c3601M23918.m6676(this.f44265.f28524);
            c3601M23918.m6701(this.f44265.f28535);
            c3601M23918.m6705(this.f44265.f28549);
            c3601M23918.m6695(this.f44265.f28545);
            c3601M23918.m6703(this.f44265.f28517);
            c3601M23918.m6698(this.f44265.f28542);
            c3601M23918.m6686(this.f44265.f28522);
            interfaceC6777.mo15461(c3601M23918.m6672(), null);
            this.f44249 = false;
        }
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer3 = this.f44255;
        if (interfaceC6777.mo15469(1, simpleDecoderOutputBuffer3.f68601, simpleDecoderOutputBuffer3.f0)) {
            this.f44251.f13978++;
            this.f44255.mo8();
            this.f44255 = null;
            return true;
        }
        this.f44256 = this.f44255.f68601;
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m35252(long j) {
        this.f44248 = j;
        if (j != -9223372036854775807L) {
            this.f44268.getClass();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x0074  */
    /* JADX WARN: Code duplicated, block: B:36:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b5  */
    /* JADX INFO: renamed from: ܽ֫ */
    private boolean m35254() throws C19735 {
        C5221 c5221M16267;
        int iM16252;
        InterfaceC3681 interfaceC3681 = this.f44252;
        if (interfaceC3681 != null && this.f44245 != 2 && !this.f44266) {
            if (this.f44259 == null) {
                C23128 c23128 = (C23128) interfaceC3681.mo7103();
                this.f44259 = c23128;
                if (c23128 != null) {
                    if (this.f44245 == 1) {
                        this.f44259.m14569(4);
                        this.f44252.mo7100(this.f44259);
                        this.f44259 = null;
                        this.f44245 = 2;
                        return false;
                    }
                    c5221M16267 = m16267();
                    iM16252 = m16252(c5221M16267, this.f44259, 0);
                    if (iM16252 != -5) {
                        m35248(c5221M16267);
                        return true;
                    }
                    if (iM16252 != -4) {
                        if (this.f44259.m14573()) {
                            this.f44266 = true;
                            this.f44244 = this.f44246;
                            this.f44252.mo7100(this.f44259);
                            this.f44259 = null;
                            return false;
                        }
                        if (!this.f44247) {
                            this.f44247 = true;
                            this.f44259.m14567(134217728);
                        }
                        this.f44246 = this.f44259.f72706;
                        if (!mo8302() || this.f44259.m14565()) {
                            this.f44244 = this.f44246;
                        }
                        this.f44259.m51580();
                        C23128 c23129 = this.f44259;
                        c23129.f72703 = this.f44265;
                        this.f44252.mo7100(c23129);
                        this.f44243 = true;
                        this.f44251.f13988++;
                        this.f44259 = null;
                        return true;
                    }
                    if (iM16252 == -3) {
                        if (mo8302()) {
                            this.f44244 = this.f44246;
                            return false;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } else {
                if (this.f44245 == 1) {
                    this.f44259.m14569(4);
                    this.f44252.mo7100(this.f44259);
                    this.f44259 = null;
                    this.f44245 = 2;
                    return false;
                }
                c5221M16267 = m16267();
                iM16252 = m16252(c5221M16267, this.f44259, 0);
                if (iM16252 != -5) {
                    m35248(c5221M16267);
                    return true;
                }
                if (iM16252 != -4) {
                    if (this.f44259.m14573()) {
                        this.f44266 = true;
                        this.f44244 = this.f44246;
                        this.f44252.mo7100(this.f44259);
                        this.f44259 = null;
                        return false;
                    }
                    if (!this.f44247) {
                        this.f44247 = true;
                        this.f44259.m14567(134217728);
                    }
                    this.f44246 = this.f44259.f72706;
                    if (!mo8302()) {
                        this.f44244 = this.f44246;
                    } else {
                        this.f44244 = this.f44246;
                    }
                    this.f44259.m51580();
                    C23128 c231210 = this.f44259;
                    c231210.f72703 = this.f44265;
                    this.f44252.mo7100(c231210);
                    this.f44243 = true;
                    this.f44251.f13988++;
                    this.f44259 = null;
                    return true;
                }
                if (iM16252 == -3) {
                    if (mo8302()) {
                        this.f44244 = this.f44246;
                        return false;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        return false;
    }

    @Override // p067l.AbstractC7054, p067l.InterfaceC4114
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8296() {
        return this.f44253 && this.f44268.mo15474();
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo8299() {
        if (this.f44268.mo15468()) {
            return true;
        }
        if (this.f44265 != null) {
            return m16262() || this.f44255 != null;
        }
        return false;
    }

    @Override // p067l.InterfaceC23996
    /* JADX INFO: renamed from: ᩴ */
    public final long mo15359() {
        if (getState() == 2) {
            m35251();
        }
        return this.f44264;
    }

    @Override // p067l.InterfaceC23996
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo15351() {
        boolean z = this.f44250;
        this.f44250 = false;
        return z;
    }

    @Override // p067l.InterfaceC23996
    /* JADX INFO: renamed from: ֫ */
    public final void mo15343(C4963 c4963) {
        this.f44268.mo15460(c4963);
    }

    @Override // p067l.InterfaceC23996
    /* JADX INFO: renamed from: ܽ */
    public final C4963 mo15356() {
        return this.f44268.mo15476();
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ֫ */
    public final void mo15345(boolean z, boolean z2) {
        C5713 c5713 = new C5713();
        this.f44251 = c5713;
        this.f44241.m4314(c5713);
        boolean z3 = m16264().f56352;
        InterfaceC6777 interfaceC6777 = this.f44268;
        if (z3) {
            interfaceC6777.mo15472();
        } else {
            interfaceC6777.mo15475();
        }
        interfaceC6777.mo15462(m16266());
        interfaceC6777.mo15463(m16259());
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ֫ */
    public final void mo15339(long j, boolean z) throws C19735 {
        this.f44268.flush();
        this.f44264 = j;
        this.f44256 = -9223372036854775807L;
        this.f44250 = false;
        this.f44258 = true;
        this.f44266 = false;
        this.f44253 = false;
        if (this.f44252 != null) {
            if (this.f44245 != 0) {
                m35255();
                m35256();
                return;
            }
            this.f44259 = null;
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = this.f44255;
            if (simpleDecoderOutputBuffer != null) {
                simpleDecoderOutputBuffer.mo8();
                this.f44255 = null;
            }
            InterfaceC3681 interfaceC3681 = this.f44252;
            interfaceC3681.getClass();
            interfaceC3681.flush();
            interfaceC3681.mo7102(m16268());
            this.f44243 = false;
        }
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ܰ */
    public final void mo15354() {
        this.f44268.mo15477();
        this.f44263 = true;
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ۟ */
    public final void mo15350() {
        m35251();
        this.f44268.pause();
        this.f44263 = false;
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ۤ */
    public final void mo15352() {
        C2753 c2753 = this.f44241;
        this.f44265 = null;
        this.f44249 = true;
        m35252(-9223372036854775807L);
        this.f44250 = false;
        this.f44256 = -9223372036854775807L;
        try {
            C20013.m45384(this.f44257, (InterfaceC2577) null);
            this.f44257 = null;
            m35255();
            this.f44268.reset();
        } finally {
            c2753.m4309(this.f44251);
        }
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ֫ */
    public final void mo16256(C10307[] c10307Arr, long j, long j2, C17474 c17474) {
        this.f44247 = false;
        if (this.f44248 == -9223372036854775807L) {
            m35252(j2);
            return;
        }
        int i = this.f44254;
        long[] jArr = this.f44267;
        if (i == jArr.length) {
            C21334.m48351("Too many stream changes, so dropping offset: " + jArr[this.f44254 - 1]);
        } else {
            this.f44254 = i + 1;
        }
        jArr[this.f44254 - 1] = j2;
    }

    @Override // p067l.AbstractC7054, p067l.InterfaceC7864
    /* JADX INFO: renamed from: ֫ */
    public final void mo15338(int i, Object obj) {
        InterfaceC6777 interfaceC6777 = this.f44268;
        if (i == 2) {
            interfaceC6777.mo15457(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            interfaceC6777.mo15465((C19695) obj);
            return;
        }
        if (i == 6) {
            interfaceC6777.mo15464((C19024) obj);
            return;
        }
        if (i == 12) {
            if (Build.VERSION.SDK_INT >= 23) {
                C13483.m30636(interfaceC6777, obj);
            }
        } else if (i == 9) {
            interfaceC6777.mo15467(((Boolean) obj).booleanValue());
        } else {
            if (i != 10) {
                return;
            }
            interfaceC6777.mo15458(((Integer) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: ᩳ֫ */
    private void m35256() throws C19735 {
        if (this.f44252 != null) {
            return;
        }
        InterfaceC2577 interfaceC2577 = this.f44257;
        C20013.m45384(this.f44260, interfaceC2577);
        this.f44260 = interfaceC2577;
        if (interfaceC2577 != null && interfaceC2577.mo3887() == null && this.f44260.getError() == null) {
            return;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Trace.beginSection("createAudioDecoder");
            InterfaceC3681 interfaceC3681Mo19508 = mo19508(this.f44265);
            this.f44252 = interfaceC3681Mo19508;
            ((AbstractC5693) interfaceC3681Mo19508).mo7102(m16268());
            Trace.endSection();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f44241.m4307(this.f44252.getName(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.f44251.f13977++;
        } catch (OutOfMemoryError e) {
            throw m16253(e, this.f44265, OpenAuthTask.NOT_INSTALLED);
        } catch (C10387 e2) {
            C21334.m48348("Audio codec error", e2);
            this.f44241.m4305(e2);
            throw m16253(e2, this.f44265, OpenAuthTask.NOT_INSTALLED);
        }
    }

    /* JADX INFO: renamed from: ܿ֫ */
    private void m35255() {
        this.f44259 = null;
        this.f44255 = null;
        this.f44245 = 0;
        this.f44243 = false;
        this.f44246 = -9223372036854775807L;
        this.f44244 = -9223372036854775807L;
        InterfaceC3681 interfaceC3681 = this.f44252;
        if (interfaceC3681 != null) {
            this.f44251.f13981++;
            interfaceC3681.mo12();
            this.f44241.m4306(this.f44252.getName());
            this.f44252 = null;
        }
        C20013.m45384(this.f44260, (InterfaceC2577) null);
        this.f44260 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m35248(C5221 c5221) throws C19735 {
        C15100 c15100;
        C10307 c10307 = c5221.f12253;
        c10307.getClass();
        InterfaceC2577 interfaceC2577 = c5221.f12252;
        C20013.m45384(this.f44257, interfaceC2577);
        this.f44257 = interfaceC2577;
        C10307 c10308 = this.f44265;
        this.f44265 = c10307;
        this.f44261 = c10307.f28543;
        this.f44262 = c10307.f28544;
        InterfaceC3681 interfaceC3681 = this.f44252;
        C2753 c2753 = this.f44241;
        if (interfaceC3681 == null) {
            m35256();
            c2753.m4310(this.f44265, (C15100) null);
            return;
        }
        if (interfaceC2577 == this.f44260) {
            c15100 = new C15100(interfaceC3681.getName(), c10308, c10307, 0, 1);
        } else {
            c15100 = new C15100(interfaceC3681.getName(), c10308, c10307, 0, 128);
        }
        if (c15100.f43118 == 0) {
            if (this.f44243) {
                this.f44245 = 1;
            } else {
                m35255();
                m35256();
                this.f44249 = true;
            }
        }
        c2753.m4310(this.f44265, c15100);
    }

    /* JADX INFO: renamed from: ܳ֫ */
    private void m35251() {
        mo8296();
        long jMo15480 = this.f44268.mo15480();
        if (jMo15480 != Long.MIN_VALUE) {
            if (!this.f44258) {
                jMo15480 = Math.max(this.f44264, jMo15480);
            }
            this.f44264 = jMo15480;
            this.f44258 = false;
        }
    }
}
