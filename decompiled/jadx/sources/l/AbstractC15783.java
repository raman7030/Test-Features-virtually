package l;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import com.alipay.sdk.app.OpenAuthTask;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.cb;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ܺ۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: W8Q2 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15783 extends AbstractC4930 {

    /* JADX INFO: renamed from: ܿܽ, reason: not valid java name and contains not printable characters */
    public static final byte[] f48634 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, UTF8.S_CS3, 0, 0, 1, 101, -120, -124, cb.k, -50, KeyFactorySpi.Ed448_type, 24, -96, 0, 47, -65, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, 49, -61, 39, 93, 120};

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public int f48635;

    /* JADX INFO: renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public MediaCrypto f48636;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public InterfaceC0220 f48637;

    /* JADX INFO: renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public final C21843 f48638;

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public boolean f48639;

    /* JADX INFO: renamed from: ֫ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC0220 f48640;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public boolean f48641;

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public long f48642;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public boolean f48643;

    /* JADX INFO: renamed from: ۗۧ, reason: not valid java name and contains not printable characters */
    public C8729 f48644;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC10846 f48645;

    /* JADX INFO: renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public long f48646;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public boolean f48647;

    /* JADX INFO: renamed from: ۙۧ, reason: not valid java name and contains not printable characters */
    public boolean f48648;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public int f48649;

    /* JADX INFO: renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public boolean f48650;

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public MediaFormat f48651;

    /* JADX INFO: renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    public C20724 f48652;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final C21843 f48653;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public boolean f48654;

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public int f48655;

    /* JADX INFO: renamed from: ۟ۧ, reason: not valid java name and contains not printable characters */
    public long f48656;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public boolean f48657;

    /* JADX INFO: renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public final C3167 f48658;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public boolean f48659;

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public long f48660;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public boolean f48661;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public boolean f48662;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public float f48663;

    /* JADX INFO: renamed from: ۤۧ, reason: not valid java name and contains not printable characters */
    public C18273 f48664;

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public float f48665;

    /* JADX INFO: renamed from: ۧܽ, reason: not valid java name and contains not printable characters */
    public float f48666;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public boolean f48667;

    /* JADX INFO: renamed from: ۨۧ, reason: not valid java name and contains not printable characters */
    public long f48668;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public boolean f48669;

    /* JADX INFO: renamed from: ۫ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f48670;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public boolean f48671;

    /* JADX INFO: renamed from: ۬ۧ, reason: not valid java name and contains not printable characters */
    public boolean f48672;

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public boolean f48673;

    /* JADX INFO: renamed from: ܰۧ, reason: not valid java name and contains not printable characters */
    public boolean f48674;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final float f48675;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public C8353 f48676;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public long f48677;

    /* JADX INFO: renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f48678;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final C21843 f48679;

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public long f48680;

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public C3519 f48681;

    /* JADX INFO: renamed from: ܽܽ, reason: not valid java name and contains not printable characters */
    public boolean f48682;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public boolean f48683;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public final boolean f48684;

    /* JADX INFO: renamed from: ᩳܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC7194 f48685;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f48686;

    /* JADX INFO: renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public long f48687;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC13850 f48688;

    /* JADX INFO: renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2379 f48689;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public boolean f48690;

    /* JADX INFO: renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public int f48691;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final C13145 f48692;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public boolean f48693;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public C17195 f48694;

    /* JADX INFO: renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public final MediaCodec.BufferInfo f48695;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public C8353 f48696;

    /* JADX INFO: renamed from: ᩹ۧ, reason: not valid java name and contains not printable characters */
    public C8353 f48697;

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public boolean f48698;

    /* JADX INFO: renamed from: ᩺ۧ, reason: not valid java name and contains not printable characters */
    public boolean f48699;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public ArrayDeque f48700;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public int f48701;

    /* JADX INFO: renamed from: ֫ */
    public abstract float mo13444(float f, C8353 c8353, C8353[] c8353Arr);

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo13445(InterfaceC2379 interfaceC2379, C8353 c8353);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int mo37213(C21843 c21843) {
        return 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract ArrayList mo13446(InterfaceC2379 interfaceC2379, C8353 c8353, boolean z);

    /* JADX INFO: renamed from: ֫ */
    public abstract C13396 mo13448(C17195 c17195, C8353 c8353, C8353 c8354);

    /* JADX INFO: renamed from: ֫ */
    public abstract C23023 mo13449(C17195 c17195, C8353 c8353, MediaCrypto mediaCrypto, float f);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo13452(Exception exc);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo13453(String str);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo13454(String str, long j, long j2);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo13456(C8353 c8353, MediaFormat mediaFormat);

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo13458(long j, long j2, InterfaceC10846 interfaceC10846, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C8353 c8353);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo37216(C17195 c17195) {
        return true;
    }

    /* JADX INFO: renamed from: ۚ֫ */
    public abstract void mo13460();

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo13465(C21843 c21843);

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean mo37226() {
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo13469(long j) {
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void mo37229(C21843 c21843) {
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean mo37230(C8353 c8353) {
        return true;
    }

    /* JADX INFO: renamed from: ᩳ */
    public boolean mo13470(C8353 c8353) {
        return false;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean mo37235(C21843 c21843) {
        return false;
    }

    @Override // l.AbstractC4930, l.InterfaceC18065
    /* JADX INFO: renamed from: ᩵ */
    public final int mo14368() {
        return 8;
    }

    /* JADX INFO: renamed from: ᩵֫ */
    public abstract void mo13472();

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public boolean mo37240() {
        return true;
    }

    public AbstractC15783(int i, InterfaceC13850 interfaceC13850, InterfaceC2379 interfaceC2379, boolean z, float f) {
        super(i);
        this.f48688 = interfaceC13850;
        interfaceC2379.getClass();
        this.f48689 = interfaceC2379;
        this.f48684 = z;
        this.f48675 = f;
        this.f48638 = new C21843(0, 0);
        this.f48653 = new C21843(0, 0);
        this.f48679 = new C21843(2, 0);
        C13145 c13145 = new C13145();
        this.f48692 = c13145;
        this.f48695 = new MediaCodec.BufferInfo();
        this.f48665 = 1.0f;
        this.f48666 = 1.0f;
        this.f48668 = -9223372036854775807L;
        this.f48670 = new ArrayDeque();
        this.f48644 = C8729.f26571;
        c13145.m49228(0);
        c13145.f69995.order(ByteOrder.nativeOrder());
        this.f48658 = new C3167();
        this.f48663 = -1.0f;
        this.f48686 = 0;
        this.f48655 = 0;
        this.f48701 = -1;
        this.f48691 = -1;
        this.f48677 = -9223372036854775807L;
        this.f48680 = -9223372036854775807L;
        this.f48642 = -9223372036854775807L;
        this.f48687 = -9223372036854775807L;
        this.f48646 = -9223372036854775807L;
        this.f48649 = 0;
        this.f48635 = 0;
        this.f48681 = new C3519();
        this.f48656 = -9223372036854775807L;
        this.f48660 = -9223372036854775807L;
    }

    @Override // l.InterfaceC18065
    /* JADX INFO: renamed from: ֫ */
    public final int mo16568(C8353 c8353) throws C18273 {
        try {
            return mo13445(this.f48689, c8353);
        } catch (C5201 e) {
            throw m14356(e, c8353, 4002);
        }
    }

    @Override // l.AbstractC4930, l.InterfaceC1837
    /* JADX INFO: renamed from: ۧ */
    public final long mo6097(long j, long j2) {
        return mo13467(j, j2);
    }

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final void m37217() {
        this.f48683 = true;
    }

    /* JADX INFO: renamed from: ܽ */
    public long mo13467(long j, long j2) {
        return super.mo6097(j, j2);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c0 A[Catch: ᩷۟֫ -> 0x00ef, TryCatch #0 {᩷۟֫ -> 0x00ef, blocks: (B:49:0x00bc, B:51:0x00c0, B:53:0x00c7, B:55:0x00cf, B:58:0x00db), top: B:69:0x00bc }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final void m37237() throws C18273 {
        C8353 c8353;
        InterfaceC0220 interfaceC0220;
        InterfaceC0220 interfaceC0221;
        if (this.f48645 != null || this.f48659 || (c8353 = this.f48676) == null) {
            return;
        }
        String str = c8353.f25614;
        boolean z = false;
        if (!m37224(c8353)) {
            m37197(this.f48640);
            if (this.f48637 == null) {
                try {
                    interfaceC0220 = this.f48637;
                    if (interfaceC0220 != null && (interfaceC0220.getState() == 3 || this.f48637.getState() == 4)) {
                        interfaceC0221 = this.f48637;
                        C22632.m50632(str);
                        if (interfaceC0221.mo1471(str)) {
                            z = true;
                        }
                    }
                    m37196(this.f48636, z);
                } catch (C20724 e) {
                    throw m14356(e, c8353, OpenAuthTask.NOT_INSTALLED);
                }
            } else {
                C22632.m50634(this.f48636 == null);
                InterfaceC0220 interfaceC0222 = this.f48637;
                InterfaceC19021 interfaceC19021Mo1474 = interfaceC0222.mo1474();
                if (!C1797.f6195 || !(interfaceC19021Mo1474 instanceof C1797)) {
                    if (interfaceC19021Mo1474 == null) {
                        if (interfaceC0222.getError() != null) {
                        }
                    } else if (interfaceC19021Mo1474 instanceof C1797) {
                        C1797 c1797 = (C1797) interfaceC19021Mo1474;
                        try {
                            this.f48636 = new MediaCrypto(c1797.f6197, c1797.f6196);
                        } catch (MediaCryptoException e2) {
                            throw m14356(e2, this.f48676, 6006);
                        }
                    }
                    interfaceC0220 = this.f48637;
                    if (interfaceC0220 != null) {
                        interfaceC0221 = this.f48637;
                        C22632.m50632(str);
                        if (interfaceC0221.mo1471(str)) {
                            z = true;
                        }
                    }
                    m37196(this.f48636, z);
                } else {
                    int state = interfaceC0222.getState();
                    if (state == 1) {
                        C19272 error = interfaceC0222.getError();
                        error.getClass();
                        throw m14356(error, this.f48676, error.f60648);
                    }
                    if (state == 4) {
                        if (interfaceC19021Mo1474 == null) {
                            if (interfaceC0222.getError() != null) {
                            }
                        } else if (interfaceC19021Mo1474 instanceof C1797) {
                            C1797 c1798 = (C1797) interfaceC19021Mo1474;
                            this.f48636 = new MediaCrypto(c1798.f6197, c1798.f6196);
                        }
                        interfaceC0220 = this.f48637;
                        if (interfaceC0220 != null) {
                            interfaceC0221 = this.f48637;
                            C22632.m50632(str);
                            if (interfaceC0221.mo1471(str)) {
                                z = true;
                            }
                        }
                        m37196(this.f48636, z);
                    }
                }
            }
            MediaCrypto mediaCrypto = this.f48636;
            if (mediaCrypto == null || this.f48645 != null) {
                return;
            }
            mediaCrypto.release();
            this.f48636 = null;
            return;
        }
        this.f48659 = false;
        this.f48680 = -9223372036854775807L;
        this.f48642 = -9223372036854775807L;
        this.f48687 = -9223372036854775807L;
        this.f48661 = false;
        C13145 c13145 = this.f48692;
        c13145.mo7();
        this.f48679.mo7();
        this.f48641 = false;
        this.f48658.m9720();
        if (!"audio/mp4a-latm".equals(str) && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
            c13145.m31874(1);
        } else {
            c13145.m31874(32);
        }
        this.f48659 = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m37224(C8353 c8353) {
        return this.f48640 == null && mo13470(c8353);
    }

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final boolean m37219() {
        return this.f48659;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37215(C18273 c18273) {
        this.f48664 = c18273;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m37232(long j) {
        C8353 c8353 = (C8353) this.f48644.f26572.m47028(j);
        if (c8353 == null && this.f48650 && this.f48651 != null) {
            c8353 = (C8353) this.f48644.f26572.m47027();
        }
        if (c8353 != null) {
            this.f48697 = c8353;
        } else if (!this.f48667 || this.f48697 == null) {
            return;
        }
        C8353 c8354 = this.f48697;
        c8354.getClass();
        mo13456(c8354, this.f48651);
        this.f48667 = false;
        this.f48650 = false;
    }

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC10846 m37231() {
        return this.f48645;
    }

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final C8353 m37233() {
        return this.f48696;
    }

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final MediaFormat m37242() {
        return this.f48651;
    }

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final C17195 m37236() {
        return this.f48694;
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ֫ */
    public void mo13457(boolean z, boolean z2) {
        this.f48681 = new C3519();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r7 >= r5) goto L16;
     */
    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo14359(C8353[] c8353Arr, long j, long j2, C15894 c15894) {
        if (this.f48644.f26575 == -9223372036854775807L) {
            m37198(new C8729(-9223372036854775807L, j, j2));
            if (this.f48683) {
                mo13472();
                return;
            }
            return;
        }
        ArrayDeque arrayDeque = this.f48670;
        if (arrayDeque.isEmpty()) {
            long j3 = this.f48680;
            if (j3 != -9223372036854775807L) {
                long j4 = this.f48687;
                if (j4 != -9223372036854775807L) {
                }
            }
            m37198(new C8729(-9223372036854775807L, j, j2));
            if (this.f48644.f26575 != -9223372036854775807L) {
                mo13472();
                return;
            }
            return;
        }
        arrayDeque.add(new C8729(this.f48680, j, j2));
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ֫ */
    public void mo13451(long j, boolean z) throws C18273 {
        this.f48654 = false;
        this.f48648 = false;
        this.f48672 = false;
        if (!this.f48659) {
            m37225();
        } else {
            this.f48680 = -9223372036854775807L;
            this.f48642 = -9223372036854775807L;
            this.f48687 = -9223372036854775807L;
            this.f48661 = false;
            this.f48692.mo7();
            this.f48679.mo7();
            this.f48641 = false;
            this.f48658.m9720();
        }
        if (this.f48644.f26572.m47029() > 0) {
            this.f48682 = true;
        }
        this.f48644.f26572.m47025();
        this.f48670.clear();
    }

    @Override // l.AbstractC4930, l.InterfaceC1837
    /* JADX INFO: renamed from: ֫ */
    public void mo6085(float f, float f2) throws C18273 {
        this.f48665 = f;
        this.f48666 = f2;
        m37209(this.f48696);
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ۤ */
    public void mo13464() {
        this.f48676 = null;
        m37198(C8729.f26571);
        this.f48670.clear();
        if (!this.f48659) {
            m37205();
            return;
        }
        this.f48659 = false;
        this.f48680 = -9223372036854775807L;
        this.f48642 = -9223372036854775807L;
        this.f48687 = -9223372036854775807L;
        this.f48661 = false;
        this.f48692.mo7();
        this.f48679.mo7();
        this.f48641 = false;
        this.f48658.m9720();
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ᩺ */
    public void mo13473() {
        try {
            this.f48659 = false;
            this.f48680 = -9223372036854775807L;
            this.f48642 = -9223372036854775807L;
            this.f48687 = -9223372036854775807L;
            this.f48661 = false;
            this.f48692.mo7();
            this.f48679.mo7();
            this.f48641 = false;
            this.f48658.m9720();
            m37211();
        } finally {
            C18566.m43106(this.f48640, (InterfaceC0220) null);
            this.f48640 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final void m37211() {
        try {
            InterfaceC10846 interfaceC10846 = this.f48645;
            if (interfaceC10846 != null) {
                interfaceC10846.mo9417();
                this.f48681.f11175++;
                C17195 c17195 = this.f48694;
                c17195.getClass();
                mo13453(c17195.f52721);
            }
            this.f48645 = null;
            try {
                MediaCrypto mediaCrypto = this.f48636;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f48636 = null;
                m37197((InterfaceC0220) null);
                m37221();
            }
        } catch (Throwable th) {
            this.f48645 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f48636;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.f48636 = null;
                m37197((InterfaceC0220) null);
                m37221();
            }
        }
    }

    @Override // l.AbstractC4930, l.InterfaceC5783
    /* JADX INFO: renamed from: ֫ */
    public void mo13450(int i, Object obj) {
        if (i == 11) {
            InterfaceC7194 interfaceC7194 = (InterfaceC7194) obj;
            interfaceC7194.getClass();
            this.f48685 = interfaceC7194;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00a2 A[Catch: IllegalStateException -> 0x00a4, CryptoException -> 0x00ec, DONT_GENERATE, TRY_LEAVE, TryCatch #2 {CryptoException -> 0x00ec, IllegalStateException -> 0x00a4, blocks: (B:8:0x000f, B:10:0x0013, B:12:0x0017, B:14:0x001b, B:17:0x0023, B:19:0x002a, B:20:0x002f, B:23:0x0036, B:50:0x009e, B:51:0x00a1, B:52:0x00a2, B:24:0x003a, B:26:0x003e, B:27:0x004b, B:29:0x0056, B:31:0x005c, B:38:0x0070, B:40:0x0076, B:42:0x007c, B:49:0x0090), top: B:81:0x000f }] */
    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ֫ */
    public void mo6088(long j, long j2) throws C18273 {
        boolean z = false;
        if (this.f48672) {
            this.f48672 = false;
            m37204();
        }
        C18273 c18273 = this.f48664;
        if (c18273 != null) {
            this.f48664 = null;
            throw c18273;
        }
        try {
            if (this.f48648) {
                mo13460();
                return;
            }
            if (this.f48676 != null || m37200(2)) {
                m37237();
                if (!this.f48659) {
                    if (this.f48645 != null) {
                        long jMo33834 = m14362().mo33834();
                        Trace.beginSection("drainAndFeed");
                        while (m37208(j, j2)) {
                            long j3 = this.f48668;
                            if (!(j3 == -9223372036854775807L || m14362().mo33834() - jMo33834 < j3)) {
                                break;
                            }
                        }
                        while (m37201()) {
                            long j4 = this.f48668;
                            if (!(j4 == -9223372036854775807L || m14362().mo33834() - jMo33834 < j4)) {
                                break;
                            }
                        }
                    } else {
                        this.f48681.f11181 += m14363(j);
                        m37200(1);
                    }
                    synchronized (this.f48681) {
                    }
                }
                Trace.beginSection("bypassRender");
                while (m37210(j, j2)) {
                }
                Trace.endSection();
                synchronized (this.f48681) {
                }
            }
        } catch (MediaCodec.CryptoException e) {
            throw m14356(e, this.f48676, C3603.m11053(e.getErrorCode()));
        } catch (IllegalStateException e2) {
            boolean z2 = e2 instanceof MediaCodec.CodecException;
            if (!z2) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e2;
                }
            }
            mo13452(e2);
            if (z2 && ((MediaCodec.CodecException) e2).isRecoverable()) {
                z = true;
            }
            if (z) {
                m37211();
            }
            C17901 c17901Mo37214 = mo37214(e2, this.f48694);
            throw m14357(c17901Mo37214, this.f48676, z, c17901Mo37214.f54669 == 1101 ? 4006 : 4003);
        }
    }

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final void m37225() throws C18273 {
        if (m37205()) {
            m37237();
        }
    }

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    private boolean m37205() {
        if (this.f48645 != null) {
            if (mo37241()) {
                m37211();
                return true;
            }
            if (mo37240()) {
                m37206();
                return false;
            }
            if (this.f48660 != -9223372036854775807L) {
                long jM14371 = m14371();
                long j = this.f48660;
                if (jM14371 <= j && this.f48687 < j) {
                    this.f48674 = true;
                    this.f48660 = -9223372036854775807L;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public boolean mo37241() {
        int i = this.f48635;
        if (i == 3 || ((this.f48669 && !this.f48657) || (this.f48647 && this.f48673))) {
            return true;
        }
        if (i == 2) {
            int i2 = Build.VERSION.SDK_INT;
            C22632.m50634(i2 >= 23);
            if (i2 >= 23) {
                try {
                    m37203();
                    return false;
                } catch (C18273 e) {
                    C19956.m46036("Failed to update the DRM session, releasing the codec instead.", e);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final boolean m37218() {
        return this.f48674;
    }

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    private void m37206() {
        try {
            InterfaceC10846 interfaceC10846 = this.f48645;
            C22632.m50632(interfaceC10846);
            interfaceC10846.flush();
        } finally {
            mo37212();
        }
    }

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public final void m37221() {
        mo37212();
        this.f48664 = null;
        this.f48700 = null;
        this.f48694 = null;
        this.f48696 = null;
        this.f48651 = null;
        this.f48667 = false;
        this.f48657 = false;
        this.f48663 = -1.0f;
        this.f48686 = 0;
        this.f48669 = false;
        this.f48647 = false;
        this.f48643 = false;
        this.f48671 = false;
        this.f48639 = false;
        this.f48655 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17901 mo37214(IllegalStateException illegalStateException, C17195 c17195) {
        return new C17901(illegalStateException, c17195);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m37200(int i) throws C18273 {
        C3002 c3002M14370 = m14370();
        C21843 c21843 = this.f48638;
        c21843.mo7();
        int iM14355 = m14355(c3002M14370, c21843, i | 4);
        if (iM14355 == -5) {
            mo13447(c3002M14370);
            return true;
        }
        if (iM14355 != -4 || !c21843.m12697()) {
            return false;
        }
        this.f48654 = true;
        m37204();
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37196(MediaCrypto mediaCrypto, boolean z) throws C20724 {
        C8353 c8353 = this.f48676;
        c8353.getClass();
        if (this.f48700 == null) {
            try {
                List listM37194 = m37194(z);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.f48700 = arrayDeque;
                if (this.f48684) {
                    arrayDeque.addAll(listM37194);
                } else {
                    ArrayList arrayList = (ArrayList) listM37194;
                    if (!arrayList.isEmpty()) {
                        this.f48700.add((C17195) arrayList.get(0));
                    }
                }
                this.f48652 = null;
            } catch (C5201 e) {
                throw new C20724(c8353, e, z, -49998);
            }
        }
        if (this.f48700.isEmpty()) {
            throw new C20724(c8353, (C5201) null, z, -49999);
        }
        ArrayDeque arrayDeque2 = this.f48700;
        arrayDeque2.getClass();
        while (this.f48645 == null) {
            C17195 c17195 = (C17195) arrayDeque2.peekFirst();
            c17195.getClass();
            if (!mo37230(c8353) || !mo37216(c17195)) {
                return;
            }
            try {
                m37199(c17195, mediaCrypto);
            } catch (Exception e2) {
                C19956.m46036("Failed to initialize decoder: " + c17195, e2);
                arrayDeque2.removeFirst();
                C20724 c20724 = new C20724(c8353, e2, z, c17195);
                mo13452(c20724);
                if (this.f48652 == null) {
                    this.f48652 = c20724;
                } else {
                    this.f48652 = C20724.m47330(this.f48652);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.f48652;
                }
            }
        }
        this.f48700 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private List m37194(boolean z) {
        C8353 c8353 = this.f48676;
        c8353.getClass();
        InterfaceC2379 interfaceC2379 = this.f48689;
        ArrayList arrayListMo13446 = mo13446(interfaceC2379, c8353, z);
        if (!arrayListMo13446.isEmpty() || !z) {
            return arrayListMo13446;
        }
        ArrayList arrayListMo13447 = mo13446(interfaceC2379, c8353, false);
        if (!arrayListMo13447.isEmpty()) {
            C19956.m46037("Drm session requires secure decoder for " + c8353.f25614 + ", but no secure decoder available. Trying to proceed with " + arrayListMo13447 + ".");
        }
        return arrayListMo13447;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:45:0x0101  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37199(C17195 c17195, MediaCrypto mediaCrypto) {
        int i;
        this.f48694 = c17195;
        C8353 c8353 = this.f48676;
        c8353.getClass();
        String str = c17195.f52721;
        int i2 = Build.VERSION.SDK_INT;
        float fMo13444 = i2 < 23 ? -1.0f : mo13444(this.f48666, c8353, m14361());
        float f = fMo13444 > this.f48675 ? fMo13444 : -1.0f;
        long jMo33834 = m14362().mo33834();
        C23023 c23023Mo13449 = mo13449(c17195, c8353, mediaCrypto, f);
        if (i2 >= 31) {
            C6612.m18120(c23023Mo13449, m14369());
        }
        try {
            Trace.beginSection("createCodec:" + str);
            InterfaceC10846 interfaceC10846Mo13243 = this.f48688.mo13243(c23023Mo13449);
            this.f48645 = interfaceC10846Mo13243;
            interfaceC10846Mo13243.mo9425(new C9435(this));
            Trace.endSection();
            long jMo33835 = m14362().mo33834();
            if (!c17195.m40454(c8353)) {
                String strM21947 = C8353.m21947(c8353);
                Locale locale = Locale.US;
                C19956.m46037("Format exceeds selected codec's capabilities [" + strM21947 + ", " + str + "]");
            }
            this.f48663 = f;
            this.f48696 = c8353;
            if (i2 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str2 = Build.MODEL;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i = 2;
                } else if (i2 < 24) {
                    i = 0;
                } else {
                    i = 0;
                }
            } else if (i2 < 24 || !("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                i = 0;
            } else {
                String str3 = Build.DEVICE;
                if ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) {
                    i = 1;
                } else {
                    i = 0;
                }
            }
            this.f48686 = i;
            this.f48669 = i2 == 29 && "c2.android.aac.decoder".equals(str);
            this.f48647 = i2 <= 23 && "OMX.google.vorbis.decoder".equals(str);
            this.f48643 = i2 == 21 && "OMX.google.aac.decoder".equals(str);
            String str4 = c17195.f52721;
            this.f48671 = (i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str4)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str4) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str4) || "OMX.bcm.vdec.avc.tunnel".equals(str4) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str4) || "OMX.bcm.vdec.hevc.tunnel".equals(str4) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str4))) || (("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && c17195.f52725) || mo37226());
            this.f48645.getClass();
            if (getState() == 2) {
                this.f48677 = m14362().mo33834() + 1000;
            }
            this.f48681.f11171++;
            mo13454(str, jMo33835, jMo33835 - jMo33834);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public void mo37212() {
        this.f48701 = -1;
        this.f48653.f69995 = null;
        this.f48691 = -1;
        this.f48678 = null;
        this.f48680 = -9223372036854775807L;
        this.f48642 = -9223372036854775807L;
        this.f48687 = -9223372036854775807L;
        this.f48677 = -9223372036854775807L;
        this.f48673 = false;
        this.f48646 = -9223372036854775807L;
        this.f48698 = false;
        this.f48690 = false;
        this.f48699 = false;
        this.f48693 = false;
        this.f48662 = false;
        this.f48649 = 0;
        this.f48635 = 0;
        this.f48655 = this.f48639 ? 1 : 0;
        this.f48674 = false;
        this.f48656 = -9223372036854775807L;
        this.f48660 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37197(InterfaceC0220 interfaceC0220) {
        C18566.m43106(this.f48637, interfaceC0220);
        this.f48637 = interfaceC0220;
    }

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    private boolean m37201() throws C18273 {
        InterfaceC10846 interfaceC10846 = this.f48645;
        if (interfaceC10846 == null || this.f48649 == 2 || this.f48654) {
            return false;
        }
        int i = this.f48701;
        C21843 c21843 = this.f48653;
        if (i < 0) {
            int iMo9430 = interfaceC10846.mo9430();
            this.f48701 = iMo9430;
            if (iMo9430 < 0) {
                return false;
            }
            c21843.f69995 = interfaceC10846.mo9427(iMo9430);
            c21843.mo7();
        }
        if (this.f48649 == 1) {
            if (!this.f48671) {
                this.f48673 = true;
                interfaceC10846.mo9419(this.f48701, 0, 4, 0L);
                this.f48701 = -1;
                c21843.f69995 = null;
            }
            this.f48649 = 2;
            return false;
        }
        if (this.f48690) {
            this.f48690 = false;
            ByteBuffer byteBuffer = c21843.f69995;
            byteBuffer.getClass();
            byteBuffer.put(f48634);
            interfaceC10846.mo9419(this.f48701, 38, 0, 0L);
            this.f48701 = -1;
            c21843.f69995 = null;
            this.f48698 = true;
            return true;
        }
        if (this.f48655 == 1) {
            int i2 = 0;
            while (true) {
                C8353 c8353 = this.f48696;
                c8353.getClass();
                if (i2 >= c8353.f25634.size()) {
                    break;
                }
                byte[] bArr = (byte[]) this.f48696.f25634.get(i2);
                ByteBuffer byteBuffer2 = c21843.f69995;
                byteBuffer2.getClass();
                byteBuffer2.put(bArr);
                i2++;
            }
            this.f48655 = 2;
        }
        ByteBuffer byteBuffer3 = c21843.f69995;
        byteBuffer3.getClass();
        int iPosition = byteBuffer3.position();
        C3002 c3002M14370 = m14370();
        try {
            int iM14355 = m14355(c3002M14370, c21843, 0);
            if (iM14355 == -3) {
                if (!mo6104()) {
                    return false;
                }
                this.f48642 = this.f48680;
                return false;
            }
            if (iM14355 == -5) {
                if (this.f48655 == 2) {
                    c21843.mo7();
                    this.f48655 = 1;
                }
                mo13447(c3002M14370);
                return true;
            }
            if (c21843.m12697()) {
                this.f48642 = this.f48680;
                if (this.f48655 == 2) {
                    c21843.mo7();
                    this.f48655 = 1;
                }
                this.f48654 = true;
                if (!this.f48698) {
                    m37204();
                    return false;
                }
                if (this.f48671) {
                    return false;
                }
                this.f48673 = true;
                interfaceC10846.mo9419(this.f48701, 0, 4, 0L);
                this.f48701 = -1;
                c21843.f69995 = null;
                return false;
            }
            if (!this.f48698 && !c21843.m12690()) {
                c21843.mo7();
                if (this.f48655 == 2) {
                    this.f48655 = 1;
                    return true;
                }
            } else if (!mo37235(c21843)) {
                boolean zM49227 = c21843.m49227();
                if (zM49227) {
                    c21843.f70000.m15919(iPosition);
                }
                long j = c21843.f69997;
                if (this.f48682) {
                    ArrayDeque arrayDeque = this.f48670;
                    if (arrayDeque.isEmpty()) {
                        C20537 c20537 = this.f48644.f26572;
                        C8353 c8354 = this.f48676;
                        c8354.getClass();
                        c20537.m47026(j, c8354);
                    } else {
                        C20537 c20538 = ((C8729) arrayDeque.peekLast()).f26572;
                        C8353 c8355 = this.f48676;
                        c8355.getClass();
                        c20538.m47026(j, c8355);
                    }
                    this.f48682 = false;
                }
                this.f48680 = Math.max(this.f48680, j);
                if (mo6104() || c21843.m12689()) {
                    this.f48642 = this.f48680;
                }
                c21843.m49229();
                if (c21843.m12694()) {
                    mo13465(c21843);
                }
                mo37229(c21843);
                int iMo37213 = mo37213(c21843);
                if ((Build.VERSION.SDK_INT < 34 || (iMo37213 & 32) == 0) && !m14367().f53168) {
                    this.f48660 = Math.max(this.f48660, c21843.f69997);
                }
                if (zM49227) {
                    interfaceC10846.mo9421(this.f48701, c21843.f70000, j, iMo37213);
                } else {
                    int i3 = this.f48701;
                    ByteBuffer byteBuffer4 = c21843.f69995;
                    byteBuffer4.getClass();
                    interfaceC10846.mo9419(i3, byteBuffer4.limit(), iMo37213, j);
                }
                this.f48701 = -1;
                c21843.f69995 = null;
                this.f48698 = true;
                this.f48655 = 0;
                this.f48681.f11182++;
                return true;
            }
            return true;
        } catch (C15491 e) {
            mo13452(e);
            m37200(0);
            m37206();
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x014e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0168  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00da, code lost:
    
        if (r3.mo1471(r2) != false) goto L129;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C13396 mo13447(C3002 c3002) throws C18273 {
        int i;
        InterfaceC19021 interfaceC19021Mo1474;
        InterfaceC19021 interfaceC19021Mo1475;
        boolean z = true;
        this.f48682 = true;
        C8353 c8353M4440 = c3002.f9455;
        c8353M4440.getClass();
        String str = c8353M4440.f25614;
        if (str == null) {
            throw m14356(new IllegalArgumentException("Sample MIME type is null."), c8353M4440, 4005);
        }
        if ((str.equals("video/av01") || str.equals("video/x-vnd.on2.vp9")) && !c8353M4440.f25634.isEmpty()) {
            C1297 c1297M21948 = c8353M4440.m21948();
            c1297M21948.m4446((List) null);
            c8353M4440 = c1297M21948.m4440();
        }
        C8353 c8353 = c8353M4440;
        InterfaceC0220 interfaceC0220 = c3002.f9454;
        C18566.m43106(this.f48640, interfaceC0220);
        this.f48640 = interfaceC0220;
        this.f48676 = c8353;
        if (this.f48659) {
            this.f48661 = true;
            return null;
        }
        InterfaceC10846 interfaceC10846 = this.f48645;
        if (interfaceC10846 == null) {
            this.f48700 = null;
            m37237();
            return null;
        }
        C17195 c17195 = this.f48694;
        c17195.getClass();
        C8353 c8354 = this.f48696;
        c8354.getClass();
        InterfaceC0220 interfaceC0221 = this.f48637;
        InterfaceC0220 interfaceC0222 = this.f48640;
        if (interfaceC0221 != interfaceC0222) {
            if (interfaceC0222 != null && interfaceC0221 != null && (interfaceC19021Mo1474 = interfaceC0222.mo1474()) != null && (interfaceC19021Mo1475 = interfaceC0221.mo1474()) != null && interfaceC19021Mo1474.getClass().equals(interfaceC19021Mo1475.getClass())) {
                if (interfaceC19021Mo1474 instanceof C1797) {
                    if (interfaceC0222.mo1469().equals(interfaceC0221.mo1469()) && Build.VERSION.SDK_INT >= 23) {
                        UUID uuid = C23875.f77202;
                        if (!uuid.equals(interfaceC0221.mo1469()) && !uuid.equals(interfaceC0222.mo1469())) {
                            if (!c17195.f52725) {
                                if (interfaceC0222.getState() != 2) {
                                    if (interfaceC0222.getState() == 3 || interfaceC0222.getState() == 4) {
                                        String str2 = c8353.f25614;
                                        str2.getClass();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (this.f48698) {
                this.f48649 = 1;
                this.f48635 = 3;
            } else {
                m37211();
                m37237();
            }
            return new C13396(c17195.f52721, c8354, c8353, 0, 128);
        }
        boolean z2 = this.f48640 != this.f48637;
        C22632.m50634(!z2 || Build.VERSION.SDK_INT >= 23);
        C13396 c13396Mo13448 = mo13448(c17195, c8354, c8353);
        int i2 = c13396Mo13448.f40048;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException();
                    }
                    if (m37209(c8353)) {
                        this.f48696 = c8353;
                        if (z2 && !m37202()) {
                            i = 2;
                        }
                    } else {
                        i = 16;
                    }
                } else if (m37209(c8353)) {
                    this.f48639 = true;
                    this.f48655 = 1;
                    int i3 = this.f48686;
                    if (i3 != 2 && (i3 != 1 || c8353.f25633 != c8354.f25633 || c8353.f25609 != c8354.f25609)) {
                        z = false;
                    }
                    this.f48690 = z;
                    this.f48696 = c8353;
                    if (z2 && !m37202()) {
                        i = 2;
                    }
                } else {
                    i = 16;
                }
            } else if (m37209(c8353)) {
                this.f48696 = c8353;
                if (z2) {
                    if (!m37202()) {
                        i = 2;
                    }
                } else if (this.f48698) {
                    this.f48649 = 1;
                    if (this.f48647) {
                        this.f48635 = 3;
                        i = 2;
                    } else {
                        this.f48635 = 1;
                    }
                }
            } else {
                i = 16;
            }
            return (i2 != 0 || (this.f48645 == interfaceC10846 && this.f48635 != 3)) ? c13396Mo13448 : new C13396(c17195.f52721, c8354, c8353, 0, i);
        }
        if (this.f48698) {
            this.f48649 = 1;
            this.f48635 = 3;
        } else {
            m37211();
            m37237();
        }
        i = 0;
        if (i2 != 0) {
        }
    }

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final long m37220() {
        return this.f48642;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void mo37234(long j) {
        this.f48687 = j;
        while (true) {
            ArrayDeque arrayDeque = this.f48670;
            if (arrayDeque.isEmpty() || j < ((C8729) arrayDeque.peek()).f26573) {
                return;
            }
            C8729 c8729 = (C8729) arrayDeque.poll();
            c8729.getClass();
            m37198(c8729);
            mo13472();
        }
    }

    @Override // l.AbstractC4930, l.InterfaceC1837
    /* JADX INFO: renamed from: ۧ */
    public boolean mo6098() {
        return this.f48648;
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ܿ */
    public boolean mo6101() {
        if (this.f48676 == null) {
            return false;
        }
        if (m14365() || this.f48691 >= 0) {
            return true;
        }
        return this.f48677 != -9223372036854775807L && m14362().mo33834() < this.f48677;
    }

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final float m37222() {
        return this.f48665;
    }

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC7194 m37228() {
        return this.f48685;
    }

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public final void m37238() throws C18273 {
        m37209(this.f48696);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m37209(C8353 c8353) throws C18273 {
        if (Build.VERSION.SDK_INT >= 23 && this.f48645 != null && this.f48635 != 3 && getState() != 0) {
            float f = this.f48666;
            c8353.getClass();
            float fMo13444 = mo13444(f, c8353, m14361());
            float f2 = this.f48663;
            if (f2 != fMo13444) {
                if (fMo13444 == -1.0f) {
                    if (this.f48698) {
                        this.f48649 = 1;
                        this.f48635 = 3;
                        return false;
                    }
                    m37211();
                    m37237();
                    return false;
                }
                if (f2 != -1.0f || fMo13444 > this.f48675) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fMo13444);
                    InterfaceC10846 interfaceC10846 = this.f48645;
                    interfaceC10846.getClass();
                    interfaceC10846.mo9422(bundle);
                    this.f48663 = fMo13444;
                }
            }
        }
        return true;
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    private boolean m37202() throws C18273 {
        if (this.f48698) {
            this.f48649 = 1;
            if (this.f48647) {
                this.f48635 = 3;
                return false;
            }
            this.f48635 = 2;
            return true;
        }
        m37203();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:84:0x0143  */
    /* JADX WARN: Code duplicated, block: B:86:0x0171  */
    /* JADX WARN: Code duplicated, block: B:88:0x017f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0181  */
    /* JADX WARN: Code duplicated, block: B:98:0x019e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:99:0x019f  */
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m37208(long j, long j2) throws C18273 {
        boolean z;
        long j3;
        boolean z2;
        boolean z3;
        boolean z4;
        MediaCodec.BufferInfo bufferInfo;
        boolean zMo13458;
        boolean z5;
        boolean z6;
        long j4;
        int iMo9416;
        InterfaceC10846 interfaceC10846 = this.f48645;
        interfaceC10846.getClass();
        int i = this.f48691;
        MediaCodec.BufferInfo bufferInfo2 = this.f48695;
        if (i >= 0) {
            if (bufferInfo2.presentationTimeUs < m14371()) {
                z = true;
            } else {
                z = false;
            }
            this.f48693 = z;
            j3 = this.f48642;
            if (j3 != -9223372036854775807L) {
                z2 = false;
            } else {
                z2 = false;
            }
            this.f48662 = z2;
            if (this.f48674) {
                j4 = this.f48656;
                if (j4 != -9223372036854775807L) {
                    this.f48656 = bufferInfo2.presentationTimeUs;
                    this.f48693 = true;
                    this.f48662 = false;
                } else {
                    this.f48656 = bufferInfo2.presentationTimeUs;
                    this.f48693 = true;
                    this.f48662 = false;
                }
            }
            if (this.f48643) {
                z3 = false;
                z4 = true;
                ByteBuffer byteBuffer = this.f48678;
                int i2 = this.f48691;
                int i3 = bufferInfo2.flags;
                long j5 = bufferInfo2.presentationTimeUs;
                boolean z7 = this.f48693;
                boolean z8 = this.f48662;
                C8353 c8353 = this.f48697;
                c8353.getClass();
                bufferInfo = bufferInfo2;
                zMo13458 = mo13458(j, j2, interfaceC10846, byteBuffer, i2, i3, 1, j5, z7, z8, c8353);
            } else {
                z3 = false;
                z4 = true;
                ByteBuffer byteBuffer2 = this.f48678;
                int i4 = this.f48691;
                int i5 = bufferInfo2.flags;
                long j6 = bufferInfo2.presentationTimeUs;
                boolean z9 = this.f48693;
                boolean z10 = this.f48662;
                C8353 c8354 = this.f48697;
                c8354.getClass();
                bufferInfo = bufferInfo2;
                zMo13458 = mo13458(j, j2, interfaceC10846, byteBuffer2, i4, i5, 1, j6, z9, z10, c8354);
            }
            if (zMo13458) {
                mo37234(bufferInfo.presentationTimeUs);
                if ((bufferInfo.flags & 4) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5) {
                    this.f48646 = m14362().mo33831();
                }
                this.f48691 = -1;
                this.f48678 = null;
                if (!z5) {
                    return z4;
                }
                m37204();
            }
            return z3;
        }
        if (this.f48643 && this.f48673) {
            try {
                iMo9416 = interfaceC10846.mo9416(bufferInfo2);
            } catch (IllegalStateException unused) {
                m37204();
                if (this.f48648) {
                    m37211();
                }
            }
        } else {
            iMo9416 = interfaceC10846.mo9416(bufferInfo2);
        }
        if (iMo9416 >= 0) {
            if (this.f48699) {
                this.f48699 = false;
                interfaceC10846.mo9429(iMo9416);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                m37204();
                return false;
            }
            this.f48691 = iMo9416;
            ByteBuffer byteBufferMo9431 = interfaceC10846.mo9431(iMo9416);
            this.f48678 = byteBufferMo9431;
            if (byteBufferMo9431 != null) {
                byteBufferMo9431.position(bufferInfo2.offset);
                this.f48678.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            m37232(bufferInfo2.presentationTimeUs);
            if (bufferInfo2.presentationTimeUs < m14371()) {
                z = true;
            } else {
                z = false;
            }
            this.f48693 = z;
            j3 = this.f48642;
            if (j3 != -9223372036854775807L || j3 > bufferInfo2.presentationTimeUs) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f48662 = z2;
            if (this.f48674) {
                j4 = this.f48656;
                if (j4 != -9223372036854775807L || bufferInfo2.presentationTimeUs > j4) {
                    this.f48656 = bufferInfo2.presentationTimeUs;
                    this.f48693 = true;
                    this.f48662 = false;
                } else {
                    this.f48674 = false;
                    this.f48656 = -9223372036854775807L;
                }
            }
            if (this.f48643 || !this.f48673) {
                z3 = false;
                z4 = true;
                ByteBuffer byteBuffer3 = this.f48678;
                int i6 = this.f48691;
                int i7 = bufferInfo2.flags;
                long j7 = bufferInfo2.presentationTimeUs;
                boolean z11 = this.f48693;
                boolean z12 = this.f48662;
                C8353 c8355 = this.f48697;
                c8355.getClass();
                bufferInfo = bufferInfo2;
                zMo13458 = mo13458(j, j2, interfaceC10846, byteBuffer3, i6, i7, 1, j7, z11, z12, c8355);
            } else {
                try {
                    ByteBuffer byteBuffer4 = this.f48678;
                    int i8 = this.f48691;
                    int i9 = bufferInfo2.flags;
                    long j8 = bufferInfo2.presentationTimeUs;
                    boolean z13 = this.f48693;
                    boolean z14 = this.f48662;
                    C8353 c8356 = this.f48697;
                    c8356.getClass();
                    z4 = true;
                    zMo13458 = mo13458(j, j2, interfaceC10846, byteBuffer4, i8, i9, 1, j8, z13, z14, c8356);
                    bufferInfo = bufferInfo2;
                    z3 = false;
                } catch (IllegalStateException unused2) {
                    z6 = false;
                    m37204();
                    if (this.f48648) {
                        m37211();
                    }
                }
            }
            if (zMo13458) {
                mo37234(bufferInfo.presentationTimeUs);
                if ((bufferInfo.flags & 4) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5 && this.f48673 && this.f48662) {
                    this.f48646 = m14362().mo33831();
                }
                this.f48691 = -1;
                this.f48678 = null;
                if (!z5) {
                    return z4;
                }
                m37204();
            }
            return z3;
        }
        if (iMo9416 == -2) {
            this.f48657 = true;
            InterfaceC10846 interfaceC10847 = this.f48645;
            interfaceC10847.getClass();
            MediaFormat mediaFormatMo9426 = interfaceC10847.mo9426();
            if (this.f48686 != 0 && mediaFormatMo9426.getInteger("width") == 32 && mediaFormatMo9426.getInteger("height") == 32) {
                this.f48699 = true;
                return true;
            }
            this.f48651 = mediaFormatMo9426;
            this.f48667 = true;
            return true;
        }
        if (this.f48671 && (this.f48654 || this.f48649 == 2)) {
            m37204();
        }
        long j9 = this.f48646;
        if (j9 != -9223372036854775807L && j9 + 100 < m14362().mo33831()) {
            m37204();
            return false;
        }
        z6 = false;
        return z6;
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    private void m37204() throws C18273 {
        int i = this.f48635;
        if (i == 1) {
            m37206();
            return;
        }
        if (i == 2) {
            m37206();
            m37203();
        } else if (i != 3) {
            this.f48648 = true;
            mo13460();
        } else {
            m37211();
            m37237();
        }
    }

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public final void m37227() {
        this.f48672 = true;
    }

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final long m37239() {
        return this.f48644.f26575;
    }

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final long m37223() {
        return this.f48644.f26574;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37198(C8729 c8729) {
        this.f48644 = c8729;
        long j = c8729.f26575;
        if (j != -9223372036854775807L) {
            this.f48650 = true;
            mo13469(j);
        }
    }

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    private void m37203() throws C18273 {
        InterfaceC0220 interfaceC0220 = this.f48640;
        interfaceC0220.getClass();
        InterfaceC19021 interfaceC19021Mo1474 = interfaceC0220.mo1474();
        if (interfaceC19021Mo1474 instanceof C1797) {
            try {
                MediaCrypto mediaCrypto = this.f48636;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((C1797) interfaceC19021Mo1474).f6196);
            } catch (MediaCryptoException e) {
                throw m14356(e, this.f48676, 6006);
            }
        }
        m37197(this.f48640);
        this.f48649 = 0;
        this.f48635 = 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[EDGE_INSN: B:34:0x00cd->B:72:0x01a8 BREAK  A[LOOP:0: B:26:0x00b7->B:87:?]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:47:0x0109  */
    /* JADX WARN: Code duplicated, block: B:59:0x0167  */
    /* JADX WARN: Code duplicated, block: B:62:0x017a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0188  */
    /* JADX WARN: Code duplicated, block: B:68:0x019c  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:? A[LOOP:0: B:26:0x00b7->B:87:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m37210(long j, long j2) throws C18273 {
        C13145 c13145;
        C13145 c13146;
        C3002 c3002M14370;
        int iM14355;
        C8353 c8353;
        long jM14371;
        C8353 c8354;
        C22632.m50634(!this.f48648);
        C13145 c13147 = this.f48692;
        if (c13147.m31873()) {
            ByteBuffer byteBuffer = c13147.f69995;
            int i = this.f48691;
            int iM31870 = c13147.m31870();
            long j3 = c13147.f69997;
            boolean zM37207 = m37207(m14371(), c13147.m31872());
            boolean zM12697 = c13147.m12697();
            C8353 c8355 = this.f48697;
            c8355.getClass();
            c13145 = c13147;
            if (mo13458(j, j2, null, byteBuffer, i, 0, iM31870, j3, zM37207, zM12697, c8355)) {
                mo37234(c13145.m31872());
                c13145.mo7();
            }
            return false;
        }
        c13145 = c13147;
        if (this.f48654) {
            this.f48648 = true;
            return false;
        }
        boolean z = this.f48641;
        C21843 c21843 = this.f48679;
        if (z) {
            c13146 = c13145;
            C22632.m50634(c13146.m31871(c21843));
            this.f48641 = false;
        } else {
            c13146 = c13145;
        }
        boolean z2 = this.f48661;
        C3167 c3167 = this.f48658;
        if (z2) {
            if (c13146.m31873()) {
                return true;
            }
            this.f48659 = false;
            this.f48680 = -9223372036854775807L;
            this.f48642 = -9223372036854775807L;
            this.f48687 = -9223372036854775807L;
            this.f48661 = false;
            c13146.mo7();
            c21843.mo7();
            this.f48641 = false;
            c3167.m9720();
            this.f48661 = false;
            m37237();
            if (this.f48659) {
                C22632.m50634(!this.f48654);
                c3002M14370 = m14370();
                c21843.mo7();
                while (true) {
                    c21843.mo7();
                    iM14355 = m14355(c3002M14370, c21843, 0);
                    if (iM14355 != -5) {
                        mo13447(c3002M14370);
                        break;
                    }
                    if (iM14355 != -4) {
                        if (c21843.m12697()) {
                            this.f48654 = true;
                            this.f48642 = this.f48680;
                            break;
                        }
                        this.f48680 = Math.max(this.f48680, c21843.f69997);
                        if (!mo6104()) {
                            this.f48642 = this.f48680;
                        } else {
                            this.f48642 = this.f48680;
                        }
                        if (this.f48682) {
                            c8354 = this.f48676;
                            c8354.getClass();
                            this.f48697 = c8354;
                            if (C11003.equals(c8354.f25614, "audio/opus")) {
                                byte[] bArr = (byte[]) this.f48697.f25634.get(0);
                                int i2 = (bArr[10] & 255) | ((bArr[11] & 255) << 8);
                                C1297 c1297M21948 = this.f48697.m21948();
                                c1297M21948.m4477(i2);
                                this.f48697 = c1297M21948.m4440();
                            }
                            mo13456(this.f48697, (MediaFormat) null);
                            this.f48682 = false;
                        }
                        c21843.m49229();
                        c8353 = this.f48697;
                        if (c8353 != null) {
                            if (c21843.m12694()) {
                                c21843.f69994 = this.f48697;
                                mo13465(c21843);
                            }
                            if (C3939.m11990(m14371(), c21843.f69997)) {
                                c3167.m9721(c21843, this.f48697.f25634);
                            }
                        }
                        if (!c13146.m31873()) {
                            if (!c13146.m31871(c21843)) {
                            }
                        } else {
                            jM14371 = m14371();
                            if (m37207(jM14371, c13146.m31872()) == m37207(jM14371, c21843.f69997)) {
                                if (!c13146.m31871(c21843)) {
                                }
                            }
                        }
                        this.f48641 = true;
                        break;
                    }
                    if (iM14355 == -3) {
                        if (mo6104()) {
                            break;
                        }
                        this.f48642 = this.f48680;
                        break;
                    }
                    throw new IllegalStateException();
                }
                if (c13146.m31873()) {
                    c13146.m49229();
                }
                return !c13146.m31873() ? true : true;
            }
        } else {
            C22632.m50634(!this.f48654);
            c3002M14370 = m14370();
            c21843.mo7();
            while (true) {
                c21843.mo7();
                iM14355 = m14355(c3002M14370, c21843, 0);
                if (iM14355 != -5) {
                    mo13447(c3002M14370);
                    break;
                }
                if (iM14355 != -4) {
                    if (c21843.m12697()) {
                        this.f48654 = true;
                        this.f48642 = this.f48680;
                        break;
                    }
                    this.f48680 = Math.max(this.f48680, c21843.f69997);
                    if (!mo6104() || this.f48653.m12689()) {
                        this.f48642 = this.f48680;
                    }
                    if (this.f48682) {
                        c8354 = this.f48676;
                        c8354.getClass();
                        this.f48697 = c8354;
                        if (C11003.equals(c8354.f25614, "audio/opus") && !this.f48697.f25634.isEmpty()) {
                            byte[] bArr2 = (byte[]) this.f48697.f25634.get(0);
                            int i3 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                            C1297 c1297M21949 = this.f48697.m21948();
                            c1297M21949.m4477(i3);
                            this.f48697 = c1297M21949.m4440();
                        }
                        mo13456(this.f48697, (MediaFormat) null);
                        this.f48682 = false;
                    }
                    c21843.m49229();
                    c8353 = this.f48697;
                    if (c8353 != null && C11003.equals(c8353.f25614, "audio/opus")) {
                        if (c21843.m12694()) {
                            c21843.f69994 = this.f48697;
                            mo13465(c21843);
                        }
                        if (C3939.m11990(m14371(), c21843.f69997)) {
                            c3167.m9721(c21843, this.f48697.f25634);
                        }
                    }
                    if (!c13146.m31873()) {
                        if (!c13146.m31871(c21843)) {
                        }
                    } else {
                        jM14371 = m14371();
                        if (m37207(jM14371, c13146.m31872()) == m37207(jM14371, c21843.f69997)) {
                            if (!c13146.m31871(c21843)) {
                            }
                        }
                    }
                    this.f48641 = true;
                    break;
                }
                if (iM14355 == -3) {
                    if (mo6104()) {
                        break;
                    }
                    this.f48642 = this.f48680;
                    break;
                }
                throw new IllegalStateException();
            }
            if (c13146.m31873()) {
                c13146.m49229();
            }
            if (!c13146.m31873() || this.f48654 || this.f48661) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m37207(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        C8353 c8353 = this.f48697;
        return (c8353 != null && C11003.equals(c8353.f25614, "audio/opus") && C3939.m11990(j, j2)) ? false : true;
    }
}
