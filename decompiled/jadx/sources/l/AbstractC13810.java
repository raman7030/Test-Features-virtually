package l;

import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import com.alipay.sdk.app.OpenAuthTask;

/* JADX INFO: renamed from: l.ܰ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L8FI */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13810 extends AbstractC4930 implements InterfaceC22757 {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final C0405 f41163;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public final C21843 f41164;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public boolean f41165;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public long f41166;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public int f41167;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public long f41168;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public boolean f41169;

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public long f41170;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public boolean f41171;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public boolean f41172;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public C3519 f41173;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC1381 f41174;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public boolean f41175;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public int f41176;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public SimpleDecoderOutputBuffer f41177;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public long f41178;

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC0220 f41179;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean f41180;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public C21843 f41181;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC0220 f41182;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f41183;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public int f41184;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public boolean f41185;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public long f41186;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public C8353 f41187;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public boolean f41188;

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public final long[] f41189;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4639 f41190;

    /* JADX INFO: renamed from: ֫ */
    public abstract C8353 mo17567(InterfaceC1381 interfaceC1381);

    @Override // l.AbstractC4930, l.InterfaceC1837
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC22757 mo6094() {
        return this;
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract InterfaceC1381 mo17568(C8353 c8353);

    /* JADX INFO: renamed from: ܿ */
    public abstract int mo17569(C8353 c8353);

    public AbstractC13810(Handler handler, InterfaceC5345 interfaceC5345, InterfaceC4639 interfaceC4639) {
        super(1);
        this.f41163 = new C0405(handler, interfaceC5345);
        this.f41190 = interfaceC4639;
        interfaceC4639.mo13591(new C22983(this));
        this.f41164 = new C21843(0, 0);
        this.f41167 = 0;
        this.f41171 = true;
        m33135(-9223372036854775807L);
        this.f41189 = new long[10];
        this.f41168 = -9223372036854775807L;
        this.f41166 = -9223372036854775807L;
        this.f41178 = -9223372036854775807L;
    }

    @Override // l.AbstractC4930, l.InterfaceC1837
    /* JADX INFO: renamed from: ۧ */
    public final long mo6097(long j, long j2) {
        boolean z = this.f41178 != -9223372036854775807L;
        if (!this.f41185) {
            if (z || this.f41175) {
                return 1000000L;
            }
        } else {
            InterfaceC4639 interfaceC4639 = this.f41190;
            long jMo13603 = interfaceC4639.mo13603();
            if (z && jMo13603 != -9223372036854775807L) {
                return Math.max(10000L, ((long) ((Math.min(jMo13603, this.f41178 - j) / (interfaceC4639.mo13601() != null ? interfaceC4639.mo13601().f8510 : 1.0f)) / 2.0f)) - (C3603.m11014(m14362().mo33834()) - j2));
            }
        }
        return 10000L;
    }

    @Override // l.InterfaceC18065
    /* JADX INFO: renamed from: ֫ */
    public final int mo16568(C8353 c8353) {
        if (!C9786.m24810(c8353.f25614)) {
            return C11010.m27348(0, 0, 0, 0);
        }
        int iMo17569 = mo17569(c8353);
        return iMo17569 <= 2 ? C11010.m27348(iMo17569, 0, 0, 0) : iMo17569 | 168;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m33142(C8353 c8353) {
        return this.f41190.mo13595(c8353);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m33141(C8353 c8353) {
        return this.f41190.mo13598(c8353);
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ֫ */
    public final void mo6088(long j, long j2) throws C18273 {
        if (this.f41175) {
            try {
                this.f41190.mo13596();
                this.f41178 = this.f41166;
                return;
            } catch (C20162 e) {
                throw m14357(e, e.f65282, e.f65280, 5002);
            }
        }
        if (this.f41187 == null) {
            C3002 c3002M14370 = m14370();
            this.f41164.mo7();
            int iM14355 = m14355(c3002M14370, this.f41164, 2);
            if (iM14355 != -5) {
                if (iM14355 == -4) {
                    C22632.m50634(this.f41164.m12697());
                    this.f41188 = true;
                    try {
                        this.f41175 = true;
                        this.f41190.mo13596();
                        this.f41178 = this.f41166;
                        return;
                    } catch (C20162 e2) {
                        throw m14356(e2, (C8353) null, 5002);
                    }
                }
                return;
            }
            m33131(c3002M14370);
        }
        m33139();
        if (this.f41174 != null) {
            try {
                Trace.beginSection("drainAndFeed");
                while (m33133()) {
                }
                while (m33137()) {
                }
                Trace.endSection();
                synchronized (this.f41173) {
                }
            } catch (C8167 e3) {
                throw m14356(e3, e3.f25168, 5001);
            } catch (C8437 e4) {
                C19956.m46034("Audio codec error", e4);
                this.f41163.m1913(e4);
                throw m14356(e4, this.f41187, 4003);
            } catch (C15221 e5) {
                throw m14357(e5, e5.f46709, e5.f46707, 5001);
            } catch (C20162 e6) {
                throw m14357(e6, e6.f65282, e6.f65280, 5002);
            }
        }
    }

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final void m33140() {
        this.f41180 = true;
    }

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    private boolean m33133() throws C18273 {
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = this.f41177;
        InterfaceC4639 interfaceC4639 = this.f41190;
        if (simpleDecoderOutputBuffer == null) {
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer2 = (SimpleDecoderOutputBuffer) this.f41174.mo4863();
            this.f41177 = simpleDecoderOutputBuffer2;
            if (simpleDecoderOutputBuffer2 == null) {
                return false;
            }
            int i = simpleDecoderOutputBuffer2.f65927;
            if (i > 0) {
                this.f41173.f11174 += i;
                interfaceC4639.mo13604();
            }
            if (this.f41177.m12696()) {
                interfaceC4639.mo13604();
                if (this.f41176 != 0) {
                    long[] jArr = this.f41189;
                    m33135(jArr[0]);
                    int i2 = this.f41176 - 1;
                    this.f41176 = i2;
                    System.arraycopy(jArr, 1, jArr, 0, i2);
                }
            }
        }
        if (this.f41177.m12697()) {
            if (this.f41167 == 2) {
                m33138();
                m33139();
                this.f41171 = true;
                return false;
            }
            this.f41177.mo8();
            this.f41177 = null;
            try {
                this.f41175 = true;
                interfaceC4639.mo13596();
                this.f41178 = this.f41166;
                return false;
            } catch (C20162 e) {
                throw m14357(e, e.f65282, e.f65280, 5002);
            }
        }
        this.f41178 = -9223372036854775807L;
        if (this.f41171) {
            C1297 c1297M21948 = mo17567(this.f41174).m21948();
            c1297M21948.m4477(this.f41183);
            c1297M21948.m4458(this.f41184);
            c1297M21948.m4449(this.f41187.f25612);
            c1297M21948.m4444(this.f41187.f25610);
            c1297M21948.m4469(this.f41187.f25621);
            c1297M21948.m4473(this.f41187.f25635);
            c1297M21948.m4463(this.f41187.f25631);
            c1297M21948.m4471(this.f41187.f25603);
            c1297M21948.m4466(this.f41187.f25628);
            c1297M21948.m4454(this.f41187.f25608);
            interfaceC4639.mo13586(c1297M21948.m4440(), null);
            this.f41171 = false;
        }
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer3 = this.f41177;
        if (interfaceC4639.mo13594(1, simpleDecoderOutputBuffer3.f65926, simpleDecoderOutputBuffer3.f0)) {
            this.f41173.f11172++;
            this.f41177.mo8();
            this.f41177 = null;
            return true;
        }
        this.f41178 = this.f41177.f65926;
        return false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m33135(long j) {
        this.f41170 = j;
        if (j != -9223372036854775807L) {
            this.f41190.getClass();
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
    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    private boolean m33137() throws C18273 {
        C3002 c3002M14370;
        int iM14355;
        InterfaceC1381 interfaceC1381 = this.f41174;
        if (interfaceC1381 != null && this.f41167 != 2 && !this.f41188) {
            if (this.f41181 == null) {
                C21843 c21843 = (C21843) interfaceC1381.mo4865();
                this.f41181 = c21843;
                if (c21843 != null) {
                    if (this.f41167 == 1) {
                        this.f41181.m12693(4);
                        this.f41174.mo4862(this.f41181);
                        this.f41181 = null;
                        this.f41167 = 2;
                        return false;
                    }
                    c3002M14370 = m14370();
                    iM14355 = m14355(c3002M14370, this.f41181, 0);
                    if (iM14355 != -5) {
                        m33131(c3002M14370);
                        return true;
                    }
                    if (iM14355 != -4) {
                        if (this.f41181.m12697()) {
                            this.f41188 = true;
                            this.f41166 = this.f41168;
                            this.f41174.mo4862(this.f41181);
                            this.f41181 = null;
                            return false;
                        }
                        if (!this.f41169) {
                            this.f41169 = true;
                            this.f41181.m12691(134217728);
                        }
                        this.f41168 = this.f41181.f69997;
                        if (!mo6104() || this.f41181.m12689()) {
                            this.f41166 = this.f41168;
                        }
                        this.f41181.m49229();
                        C21843 c21844 = this.f41181;
                        c21844.f69994 = this.f41187;
                        this.f41174.mo4862(c21844);
                        this.f41165 = true;
                        this.f41173.f11182++;
                        this.f41181 = null;
                        return true;
                    }
                    if (iM14355 == -3) {
                        if (mo6104()) {
                            this.f41166 = this.f41168;
                            return false;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } else {
                if (this.f41167 == 1) {
                    this.f41181.m12693(4);
                    this.f41174.mo4862(this.f41181);
                    this.f41181 = null;
                    this.f41167 = 2;
                    return false;
                }
                c3002M14370 = m14370();
                iM14355 = m14355(c3002M14370, this.f41181, 0);
                if (iM14355 != -5) {
                    m33131(c3002M14370);
                    return true;
                }
                if (iM14355 != -4) {
                    if (this.f41181.m12697()) {
                        this.f41188 = true;
                        this.f41166 = this.f41168;
                        this.f41174.mo4862(this.f41181);
                        this.f41181 = null;
                        return false;
                    }
                    if (!this.f41169) {
                        this.f41169 = true;
                        this.f41181.m12691(134217728);
                    }
                    this.f41168 = this.f41181.f69997;
                    if (!mo6104()) {
                        this.f41166 = this.f41168;
                    } else {
                        this.f41166 = this.f41168;
                    }
                    this.f41181.m49229();
                    C21843 c21845 = this.f41181;
                    c21845.f69994 = this.f41187;
                    this.f41174.mo4862(c21845);
                    this.f41165 = true;
                    this.f41173.f11182++;
                    this.f41181 = null;
                    return true;
                }
                if (iM14355 == -3) {
                    if (mo6104()) {
                        this.f41166 = this.f41168;
                        return false;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        return false;
    }

    @Override // l.AbstractC4930, l.InterfaceC1837
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6098() {
        return this.f41175 && this.f41190.mo13599();
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6101() {
        if (this.f41190.mo13593()) {
            return true;
        }
        if (this.f41187 != null) {
            return m14365() || this.f41177 != null;
        }
        return false;
    }

    @Override // l.InterfaceC22757
    /* JADX INFO: renamed from: ᩴ */
    public final long mo13471() {
        if (getState() == 2) {
            m33134();
        }
        return this.f41186;
    }

    @Override // l.InterfaceC22757
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo13463() {
        boolean z = this.f41172;
        this.f41172 = false;
        return z;
    }

    @Override // l.InterfaceC22757
    /* JADX INFO: renamed from: ֫ */
    public final void mo13455(C2730 c2730) {
        this.f41190.mo13585(c2730);
    }

    @Override // l.InterfaceC22757
    /* JADX INFO: renamed from: ܽ */
    public final C2730 mo13468() {
        return this.f41190.mo13601();
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ֫ */
    public final void mo13457(boolean z, boolean z2) {
        C3519 c3519 = new C3519();
        this.f41173 = c3519;
        this.f41163.m1922(c3519);
        boolean z3 = m14367().f53168;
        InterfaceC4639 interfaceC4639 = this.f41190;
        if (z3) {
            interfaceC4639.mo13597();
        } else {
            interfaceC4639.mo13600();
        }
        interfaceC4639.mo13587(m14369());
        interfaceC4639.mo13588(m14362());
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ֫ */
    public final void mo13451(long j, boolean z) throws C18273 {
        this.f41190.flush();
        this.f41186 = j;
        this.f41178 = -9223372036854775807L;
        this.f41172 = false;
        this.f41180 = true;
        this.f41188 = false;
        this.f41175 = false;
        if (this.f41174 != null) {
            if (this.f41167 != 0) {
                m33138();
                m33139();
                return;
            }
            this.f41181 = null;
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = this.f41177;
            if (simpleDecoderOutputBuffer != null) {
                simpleDecoderOutputBuffer.mo8();
                this.f41177 = null;
            }
            InterfaceC1381 interfaceC1381 = this.f41174;
            interfaceC1381.getClass();
            interfaceC1381.flush();
            interfaceC1381.mo4864(m14371());
            this.f41165 = false;
        }
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ܰ */
    public final void mo13466() {
        this.f41190.mo13602();
        this.f41185 = true;
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ۟ */
    public final void mo13462() {
        m33134();
        this.f41190.pause();
        this.f41185 = false;
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ۤ */
    public final void mo13464() {
        C0405 c0405 = this.f41163;
        this.f41187 = null;
        this.f41171 = true;
        m33135(-9223372036854775807L);
        this.f41172 = false;
        this.f41178 = -9223372036854775807L;
        try {
            C18566.m43106(this.f41179, (InterfaceC0220) null);
            this.f41179 = null;
            m33138();
            this.f41190.reset();
        } finally {
            c0405.m1917(this.f41173);
        }
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ֫ */
    public final void mo14359(C8353[] c8353Arr, long j, long j2, C15894 c15894) {
        this.f41169 = false;
        if (this.f41170 == -9223372036854775807L) {
            m33135(j2);
            return;
        }
        int i = this.f41176;
        long[] jArr = this.f41189;
        if (i == jArr.length) {
            C19956.m46037("Too many stream changes, so dropping offset: " + jArr[this.f41176 - 1]);
        } else {
            this.f41176 = i + 1;
        }
        jArr[this.f41176 - 1] = j2;
    }

    @Override // l.AbstractC4930, l.InterfaceC5783
    /* JADX INFO: renamed from: ֫ */
    public final void mo13450(int i, Object obj) {
        InterfaceC4639 interfaceC4639 = this.f41190;
        if (i == 2) {
            interfaceC4639.mo13582(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            interfaceC4639.mo13590((C18231) obj);
            return;
        }
        if (i == 6) {
            interfaceC4639.mo13589((C17525) obj);
            return;
        }
        if (i == 12) {
            if (Build.VERSION.SDK_INT >= 23) {
                C11695.m28588(interfaceC4639, obj);
            }
        } else if (i == 9) {
            interfaceC4639.mo13592(((Boolean) obj).booleanValue());
        } else {
            if (i != 10) {
                return;
            }
            interfaceC4639.mo13583(((Integer) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    private void m33139() throws C18273 {
        if (this.f41174 != null) {
            return;
        }
        InterfaceC0220 interfaceC0220 = this.f41179;
        C18566.m43106(this.f41182, interfaceC0220);
        this.f41182 = interfaceC0220;
        if (interfaceC0220 != null && interfaceC0220.mo1474() == null && this.f41182.getError() == null) {
            return;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Trace.beginSection("createAudioDecoder");
            InterfaceC1381 interfaceC1381Mo17568 = mo17568(this.f41187);
            this.f41174 = interfaceC1381Mo17568;
            ((AbstractC3498) interfaceC1381Mo17568).mo4864(m14371());
            Trace.endSection();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f41163.m1915(this.f41174.getName(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.f41173.f11171++;
        } catch (OutOfMemoryError e) {
            throw m14356(e, this.f41187, OpenAuthTask.NOT_INSTALLED);
        } catch (C8437 e2) {
            C19956.m46034("Audio codec error", e2);
            this.f41163.m1913(e2);
            throw m14356(e2, this.f41187, OpenAuthTask.NOT_INSTALLED);
        }
    }

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    private void m33138() {
        this.f41181 = null;
        this.f41177 = null;
        this.f41167 = 0;
        this.f41165 = false;
        this.f41168 = -9223372036854775807L;
        this.f41166 = -9223372036854775807L;
        InterfaceC1381 interfaceC1381 = this.f41174;
        if (interfaceC1381 != null) {
            this.f41173.f11175++;
            interfaceC1381.mo12();
            this.f41163.m1914(this.f41174.getName());
            this.f41174 = null;
        }
        C18566.m43106(this.f41182, (InterfaceC0220) null);
        this.f41182 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m33131(C3002 c3002) throws C18273 {
        C13396 c13396;
        C8353 c8353 = c3002.f9455;
        c8353.getClass();
        InterfaceC0220 interfaceC0220 = c3002.f9454;
        C18566.m43106(this.f41179, interfaceC0220);
        this.f41179 = interfaceC0220;
        C8353 c8354 = this.f41187;
        this.f41187 = c8353;
        this.f41183 = c8353.f25629;
        this.f41184 = c8353.f25630;
        InterfaceC1381 interfaceC1381 = this.f41174;
        C0405 c0405 = this.f41163;
        if (interfaceC1381 == null) {
            m33139();
            c0405.m1918(this.f41187, (C13396) null);
            return;
        }
        if (interfaceC0220 == this.f41182) {
            c13396 = new C13396(interfaceC1381.getName(), c8354, c8353, 0, 1);
        } else {
            c13396 = new C13396(interfaceC1381.getName(), c8354, c8353, 0, 128);
        }
        if (c13396.f40048 == 0) {
            if (this.f41165) {
                this.f41167 = 1;
            } else {
                m33138();
                m33139();
                this.f41171 = true;
            }
        }
        c0405.m1918(this.f41187, c13396);
    }

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    private void m33134() {
        mo6098();
        long jMo13605 = this.f41190.mo13605();
        if (jMo13605 != Long.MIN_VALUE) {
            if (!this.f41180) {
                jMo13605 = Math.max(this.f41186, jMo13605);
            }
            this.f41186 = jMo13605;
            this.f41180 = false;
        }
    }
}
