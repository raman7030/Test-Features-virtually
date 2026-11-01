package p067l;

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
import com.umeng.analytics.pro.C0698cb;
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
public abstract class AbstractC17368 extends AbstractC7054 {

    /* JADX INFO: renamed from: ܿܽ */
    public static final byte[] f51773 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, UTF8.S_CS3, 0, 0, 1, 101, -120, -124, C0698cb.f2569k, -50, KeyFactorySpi.Ed448_type, 24, -96, 0, 47, -65, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, 49, -61, 39, 93, 120};

    /* JADX INFO: renamed from: ֡֫ */
    public int f51774;

    /* JADX INFO: renamed from: ֡ۧ */
    public MediaCrypto f51775;

    /* JADX INFO: renamed from: ֨֫ */
    public InterfaceC2577 f51776;

    /* JADX INFO: renamed from: ֨ۧ */
    public final C23128 f51777;

    /* JADX INFO: renamed from: ֫ۧ */
    public boolean f51778;

    /* JADX INFO: renamed from: ֫ܽ */
    public InterfaceC2577 f51779;

    /* JADX INFO: renamed from: ۖ֫ */
    public boolean f51780;

    /* JADX INFO: renamed from: ۖۧ */
    public long f51781;

    /* JADX INFO: renamed from: ۗ֫ */
    public boolean f51782;

    /* JADX INFO: renamed from: ۗۧ */
    public C10664 f51783;

    /* JADX INFO: renamed from: ۘ֫ */
    public InterfaceC12676 f51784;

    /* JADX INFO: renamed from: ۘۧ */
    public long f51785;

    /* JADX INFO: renamed from: ۙ֫ */
    public boolean f51786;

    /* JADX INFO: renamed from: ۙۧ */
    public boolean f51787;

    /* JADX INFO: renamed from: ۚ֫ */
    public int f51788;

    /* JADX INFO: renamed from: ۚۧ */
    public boolean f51789;

    /* JADX INFO: renamed from: ۛ֫ */
    public MediaFormat f51790;

    /* JADX INFO: renamed from: ۛۧ */
    public C22064 f51791;

    /* JADX INFO: renamed from: ۜ֫ */
    public final C23128 f51792;

    /* JADX INFO: renamed from: ۜۧ */
    public boolean f51793;

    /* JADX INFO: renamed from: ۟֫ */
    public int f51794;

    /* JADX INFO: renamed from: ۟ۧ */
    public long f51795;

    /* JADX INFO: renamed from: ۠֫ */
    public boolean f51796;

    /* JADX INFO: renamed from: ۠ۧ */
    public final C5378 f51797;

    /* JADX INFO: renamed from: ۡ֫ */
    public boolean f51798;

    /* JADX INFO: renamed from: ۡۧ */
    public long f51799;

    /* JADX INFO: renamed from: ۢ֫ */
    public boolean f51800;

    /* JADX INFO: renamed from: ۢۧ */
    public boolean f51801;

    /* JADX INFO: renamed from: ۤ֫ */
    public float f51802;

    /* JADX INFO: renamed from: ۤۧ */
    public C19735 f51803;

    /* JADX INFO: renamed from: ۧۧ */
    public float f51804;

    /* JADX INFO: renamed from: ۧܽ */
    public float f51805;

    /* JADX INFO: renamed from: ۨ֫ */
    public boolean f51806;

    /* JADX INFO: renamed from: ۨۧ */
    public long f51807;

    /* JADX INFO: renamed from: ۫֫ */
    public boolean f51808;

    /* JADX INFO: renamed from: ۫ۧ */
    public final ArrayDeque f51809;

    /* JADX INFO: renamed from: ۬֫ */
    public boolean f51810;

    /* JADX INFO: renamed from: ۬ۧ */
    public boolean f51811;

    /* JADX INFO: renamed from: ܰ֫ */
    public boolean f51812;

    /* JADX INFO: renamed from: ܰۧ */
    public boolean f51813;

    /* JADX INFO: renamed from: ܳ֫ */
    public final float f51814;

    /* JADX INFO: renamed from: ܳۧ */
    public C10307 f51815;

    /* JADX INFO: renamed from: ܶ֫ */
    public long f51816;

    /* JADX INFO: renamed from: ܶۧ */
    public ByteBuffer f51817;

    /* JADX INFO: renamed from: ܺ֫ */
    public final C23128 f51818;

    /* JADX INFO: renamed from: ܺۧ */
    public long f51819;

    /* JADX INFO: renamed from: ܽۧ */
    public C5713 f51820;

    /* JADX INFO: renamed from: ܽܽ */
    public boolean f51821;

    /* JADX INFO: renamed from: ܿۧ */
    public boolean f51822;

    /* JADX INFO: renamed from: ᩳۧ */
    public final boolean f51823;

    /* JADX INFO: renamed from: ᩳܽ */
    public InterfaceC9205 f51824;

    /* JADX INFO: renamed from: ᩴ֫ */
    public int f51825;

    /* JADX INFO: renamed from: ᩴۧ */
    public long f51826;

    /* JADX INFO: renamed from: ᩵֫ */
    public final InterfaceC15531 f51827;

    /* JADX INFO: renamed from: ᩵ۧ */
    public final InterfaceC4629 f51828;

    /* JADX INFO: renamed from: ᩶֫ */
    public boolean f51829;

    /* JADX INFO: renamed from: ᩶ۧ */
    public int f51830;

    /* JADX INFO: renamed from: ᩷֫ */
    public final C14861 f51831;

    /* JADX INFO: renamed from: ᩷ۧ */
    public boolean f51832;

    /* JADX INFO: renamed from: ᩸֫ */
    public C18710 f51833;

    /* JADX INFO: renamed from: ᩸ۧ */
    public final MediaCodec.BufferInfo f51834;

    /* JADX INFO: renamed from: ᩹֫ */
    public C10307 f51835;

    /* JADX INFO: renamed from: ᩹ۧ */
    public C10307 f51836;

    /* JADX INFO: renamed from: ᩺֫ */
    public boolean f51837;

    /* JADX INFO: renamed from: ᩺ۧ */
    public boolean f51838;

    /* JADX INFO: renamed from: ᩻֫ */
    public ArrayDeque f51839;

    /* JADX INFO: renamed from: ᩻ۧ */
    public int f51840;

    /* JADX INFO: renamed from: ֫ */
    public abstract float mo15332(float f, C10307 c10307, C10307[] c10307Arr);

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo15333(InterfaceC4629 interfaceC4629, C10307 c10307);

    /* JADX INFO: renamed from: ֫ */
    public int mo39383(C23128 c23128) {
        return 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract ArrayList mo15334(InterfaceC4629 interfaceC4629, C10307 c10307, boolean z);

    /* JADX INFO: renamed from: ֫ */
    public abstract C15100 mo15336(C18710 c18710, C10307 c10307, C10307 c10308);

    /* JADX INFO: renamed from: ֫ */
    public abstract C24249 mo15337(C18710 c18710, C10307 c10307, MediaCrypto mediaCrypto, float f);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo15340(Exception exc);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo15341(String str);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo15342(String str, long j, long j2);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo15344(C10307 c10307, MediaFormat mediaFormat);

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo15346(long j, long j2, InterfaceC12676 interfaceC12676, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C10307 c10307);

    /* JADX INFO: renamed from: ֫ */
    public boolean mo39386(C18710 c18710) {
        return true;
    }

    /* JADX INFO: renamed from: ۚ֫ */
    public abstract void mo15348();

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo15353(C23128 c23128);

    /* JADX INFO: renamed from: ܳ֫ */
    public boolean mo39396() {
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo15357(long j) {
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo39399(C23128 c23128) {
    }

    /* JADX INFO: renamed from: ܽ */
    public boolean mo39400(C10307 c10307) {
        return true;
    }

    /* JADX INFO: renamed from: ᩳ */
    public boolean mo15358(C10307 c10307) {
        return false;
    }

    /* JADX INFO: renamed from: ᩳ */
    public boolean mo39405(C23128 c23128) {
        return false;
    }

    @Override // p067l.AbstractC7054, p067l.InterfaceC19537
    /* JADX INFO: renamed from: ᩵ */
    public final int mo16265() {
        return 8;
    }

    /* JADX INFO: renamed from: ᩵֫ */
    public abstract void mo15360();

    /* JADX INFO: renamed from: ᩸֫ */
    public boolean mo39410() {
        return true;
    }

    public AbstractC17368(int i, InterfaceC15531 interfaceC15531, InterfaceC4629 interfaceC4629, boolean z, float f) {
        super(i);
        this.f51827 = interfaceC15531;
        interfaceC4629.getClass();
        this.f51828 = interfaceC4629;
        this.f51823 = z;
        this.f51814 = f;
        this.f51777 = new C23128(0, 0);
        this.f51792 = new C23128(0, 0);
        this.f51818 = new C23128(2, 0);
        C14861 c14861 = new C14861();
        this.f51831 = c14861;
        this.f51834 = new MediaCodec.BufferInfo();
        this.f51804 = 1.0f;
        this.f51805 = 1.0f;
        this.f51807 = -9223372036854775807L;
        this.f51809 = new ArrayDeque();
        this.f51783 = C10664.f29496;
        c14861.m51579(0);
        c14861.f72704.order(ByteOrder.nativeOrder());
        this.f51797 = new C5378();
        this.f51802 = -1.0f;
        this.f51825 = 0;
        this.f51794 = 0;
        this.f51840 = -1;
        this.f51830 = -1;
        this.f51816 = -9223372036854775807L;
        this.f51819 = -9223372036854775807L;
        this.f51781 = -9223372036854775807L;
        this.f51826 = -9223372036854775807L;
        this.f51785 = -9223372036854775807L;
        this.f51788 = 0;
        this.f51774 = 0;
        this.f51820 = new C5713();
        this.f51795 = -9223372036854775807L;
        this.f51799 = -9223372036854775807L;
    }

    @Override // p067l.InterfaceC19537
    /* JADX INFO: renamed from: ֫ */
    public final int mo18494(C10307 c10307) throws C19735 {
        try {
            return mo15333(this.f51828, c10307);
        } catch (C7311 e) {
            throw m16253(e, c10307, 4002);
        }
    }

    @Override // p067l.AbstractC7054, p067l.InterfaceC4114
    /* JADX INFO: renamed from: ۧ */
    public final long mo8295(long j, long j2) {
        return mo15355(j, j2);
    }

    /* JADX INFO: renamed from: ֫֫ */
    public final void m39387() {
        this.f51822 = true;
    }

    /* JADX INFO: renamed from: ܽ */
    public long mo15355(long j, long j2) {
        return super.mo8295(j, j2);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c0 A[Catch: ᩷۟֫ -> 0x00ef, TryCatch #0 {᩷۟֫ -> 0x00ef, blocks: (B:49:0x00bc, B:51:0x00c0, B:53:0x00c7, B:55:0x00cf, B:58:0x00db), top: B:69:0x00bc }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX INFO: renamed from: ᩴ֫ */
    public final void m39407() throws C19735 {
        C10307 c10307;
        InterfaceC2577 interfaceC2577;
        InterfaceC2577 interfaceC2578;
        if (this.f51784 != null || this.f51798 || (c10307 = this.f51815) == null) {
            return;
        }
        String str = c10307.f28528;
        boolean z = false;
        if (!m39394(c10307)) {
            m39367(this.f51779);
            if (this.f51776 == null) {
                try {
                    interfaceC2577 = this.f51776;
                    if (interfaceC2577 != null && (interfaceC2577.getState() == 3 || this.f51776.getState() == 4)) {
                        interfaceC2578 = this.f51776;
                        C23877.m52958(str);
                        if (interfaceC2578.mo3884(str)) {
                            z = true;
                        }
                    }
                    m39366(this.f51775, z);
                } catch (C22064 e) {
                    throw m16253(e, c10307, OpenAuthTask.NOT_INSTALLED);
                }
            } else {
                C23877.m52960(this.f51775 == null);
                InterfaceC2577 interfaceC2579 = this.f51776;
                InterfaceC20446 interfaceC20446Mo3887 = interfaceC2579.mo3887();
                if (!C4076.f8974 || !(interfaceC20446Mo3887 instanceof C4076)) {
                    if (interfaceC20446Mo3887 == null) {
                        if (interfaceC2579.getError() != null) {
                        }
                    } else if (interfaceC20446Mo3887 instanceof C4076) {
                        C4076 c4076 = (C4076) interfaceC20446Mo3887;
                        try {
                            this.f51775 = new MediaCrypto(c4076.f8976, c4076.f8975);
                        } catch (MediaCryptoException e2) {
                            throw m16253(e2, this.f51815, 6006);
                        }
                    }
                    interfaceC2577 = this.f51776;
                    if (interfaceC2577 != null) {
                        interfaceC2578 = this.f51776;
                        C23877.m52958(str);
                        if (interfaceC2578.mo3884(str)) {
                            z = true;
                        }
                    }
                    m39366(this.f51775, z);
                } else {
                    int state = interfaceC2579.getState();
                    if (state == 1) {
                        C20684 error = interfaceC2579.getError();
                        error.getClass();
                        throw m16253(error, this.f51815, error.f63878);
                    }
                    if (state == 4) {
                        if (interfaceC20446Mo3887 == null) {
                            if (interfaceC2579.getError() != null) {
                            }
                        } else if (interfaceC20446Mo3887 instanceof C4076) {
                            C4076 c4077 = (C4076) interfaceC20446Mo3887;
                            this.f51775 = new MediaCrypto(c4077.f8976, c4077.f8975);
                        }
                        interfaceC2577 = this.f51776;
                        if (interfaceC2577 != null) {
                            interfaceC2578 = this.f51776;
                            C23877.m52958(str);
                            if (interfaceC2578.mo3884(str)) {
                                z = true;
                            }
                        }
                        m39366(this.f51775, z);
                    }
                }
            }
            MediaCrypto mediaCrypto = this.f51775;
            if (mediaCrypto == null || this.f51784 != null) {
                return;
            }
            mediaCrypto.release();
            this.f51775 = null;
            return;
        }
        this.f51798 = false;
        this.f51819 = -9223372036854775807L;
        this.f51781 = -9223372036854775807L;
        this.f51826 = -9223372036854775807L;
        this.f51800 = false;
        C14861 c14861 = this.f51831;
        c14861.mo7();
        this.f51818.mo7();
        this.f51780 = false;
        this.f51797.m11764();
        if (!"audio/mp4a-latm".equals(str) && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
            c14861.m33967(1);
        } else {
            c14861.m33967(32);
        }
        this.f51798 = true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m39394(C10307 c10307) {
        return this.f51779 == null && mo15358(c10307);
    }

    /* JADX INFO: renamed from: ۘ֫ */
    public final boolean m39389() {
        return this.f51798;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39385(C19735 c19735) {
        this.f51803 = c19735;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m39402(long j) {
        C10307 c10307 = (C10307) this.f51783.f29497.m49351(j);
        if (c10307 == null && this.f51789 && this.f51790 != null) {
            c10307 = (C10307) this.f51783.f29497.m49350();
        }
        if (c10307 != null) {
            this.f51836 = c10307;
        } else if (!this.f51806 || this.f51836 == null) {
            return;
        }
        C10307 c10308 = this.f51836;
        c10308.getClass();
        mo15344(c10308, this.f51790);
        this.f51806 = false;
        this.f51789 = false;
    }

    /* JADX INFO: renamed from: ܽ֫ */
    public final InterfaceC12676 m39401() {
        return this.f51784;
    }

    /* JADX INFO: renamed from: ܿ֫ */
    public final C10307 m39403() {
        return this.f51835;
    }

    /* JADX INFO: renamed from: ᩻֫ */
    public final MediaFormat m39412() {
        return this.f51790;
    }

    /* JADX INFO: renamed from: ᩳ֫ */
    public final C18710 m39406() {
        return this.f51833;
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ֫ */
    public void mo15345(boolean z, boolean z2) {
        this.f51820 = new C5713();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r7 >= r5) goto L16;
     */
    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16256(C10307[] c10307Arr, long j, long j2, C17474 c17474) {
        if (this.f51783.f29500 == -9223372036854775807L) {
            m39368(new C10664(-9223372036854775807L, j, j2));
            if (this.f51822) {
                mo15360();
                return;
            }
            return;
        }
        ArrayDeque arrayDeque = this.f51809;
        if (arrayDeque.isEmpty()) {
            long j3 = this.f51819;
            if (j3 != -9223372036854775807L) {
                long j4 = this.f51826;
                if (j4 != -9223372036854775807L) {
                }
            }
            m39368(new C10664(-9223372036854775807L, j, j2));
            if (this.f51783.f29500 != -9223372036854775807L) {
                mo15360();
                return;
            }
            return;
        }
        arrayDeque.add(new C10664(this.f51819, j, j2));
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ֫ */
    public void mo15339(long j, boolean z) throws C19735 {
        this.f51793 = false;
        this.f51787 = false;
        this.f51811 = false;
        if (!this.f51798) {
            m39395();
        } else {
            this.f51819 = -9223372036854775807L;
            this.f51781 = -9223372036854775807L;
            this.f51826 = -9223372036854775807L;
            this.f51800 = false;
            this.f51831.mo7();
            this.f51818.mo7();
            this.f51780 = false;
            this.f51797.m11764();
        }
        if (this.f51783.f29497.m49352() > 0) {
            this.f51821 = true;
        }
        this.f51783.f29497.m49348();
        this.f51809.clear();
    }

    @Override // p067l.AbstractC7054, p067l.InterfaceC4114
    /* JADX INFO: renamed from: ֫ */
    public void mo8283(float f, float f2) throws C19735 {
        this.f51804 = f;
        this.f51805 = f2;
        m39379(this.f51835);
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ۤ */
    public void mo15352() {
        this.f51815 = null;
        m39368(C10664.f29496);
        this.f51809.clear();
        if (!this.f51798) {
            m39375();
            return;
        }
        this.f51798 = false;
        this.f51819 = -9223372036854775807L;
        this.f51781 = -9223372036854775807L;
        this.f51826 = -9223372036854775807L;
        this.f51800 = false;
        this.f51831.mo7();
        this.f51818.mo7();
        this.f51780 = false;
        this.f51797.m11764();
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ᩺ */
    public void mo15361() {
        try {
            this.f51798 = false;
            this.f51819 = -9223372036854775807L;
            this.f51781 = -9223372036854775807L;
            this.f51826 = -9223372036854775807L;
            this.f51800 = false;
            this.f51831.mo7();
            this.f51818.mo7();
            this.f51780 = false;
            this.f51797.m11764();
            m39381();
        } finally {
            C20013.m45384(this.f51779, (InterfaceC2577) null);
            this.f51779 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֡֫ */
    public final void m39381() {
        try {
            InterfaceC12676 interfaceC12676 = this.f51784;
            if (interfaceC12676 != null) {
                interfaceC12676.mo11460();
                this.f51820.f13981++;
                C18710 c18710 = this.f51833;
                c18710.getClass();
                mo15341(c18710.f55902);
            }
            this.f51784 = null;
            try {
                MediaCrypto mediaCrypto = this.f51775;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f51775 = null;
                m39367((InterfaceC2577) null);
                m39391();
            }
        } catch (Throwable th) {
            this.f51784 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f51775;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.f51775 = null;
                m39367((InterfaceC2577) null);
                m39391();
            }
        }
    }

    @Override // p067l.AbstractC7054, p067l.InterfaceC7864
    /* JADX INFO: renamed from: ֫ */
    public void mo15338(int i, Object obj) {
        if (i == 11) {
            InterfaceC9205 interfaceC9205 = (InterfaceC9205) obj;
            interfaceC9205.getClass();
            this.f51824 = interfaceC9205;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00a2 A[Catch: IllegalStateException -> 0x00a4, CryptoException -> 0x00ec, DONT_GENERATE, TRY_LEAVE, TryCatch #2 {CryptoException -> 0x00ec, IllegalStateException -> 0x00a4, blocks: (B:8:0x000f, B:10:0x0013, B:12:0x0017, B:14:0x001b, B:17:0x0023, B:19:0x002a, B:20:0x002f, B:23:0x0036, B:50:0x009e, B:51:0x00a1, B:52:0x00a2, B:24:0x003a, B:26:0x003e, B:27:0x004b, B:29:0x0056, B:31:0x005c, B:38:0x0070, B:40:0x0076, B:42:0x007c, B:49:0x0090), top: B:81:0x000f }] */
    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ֫ */
    public void mo8286(long j, long j2) throws C19735 {
        boolean z = false;
        if (this.f51811) {
            this.f51811 = false;
            m39374();
        }
        C19735 c19735 = this.f51803;
        if (c19735 != null) {
            this.f51803 = null;
            throw c19735;
        }
        try {
            if (this.f51787) {
                mo15348();
                return;
            }
            if (this.f51815 != null || m39370(2)) {
                m39407();
                if (!this.f51798) {
                    if (this.f51784 != null) {
                        long jMo35966 = m16259().mo35966();
                        Trace.beginSection("drainAndFeed");
                        while (m39378(j, j2)) {
                            long j3 = this.f51807;
                            if (!(j3 == -9223372036854775807L || m16259().mo35966() - jMo35966 < j3)) {
                                break;
                            }
                        }
                        while (m39371()) {
                            long j4 = this.f51807;
                            if (!(j4 == -9223372036854775807L || m16259().mo35966() - jMo35966 < j4)) {
                                break;
                            }
                        }
                    } else {
                        this.f51820.f13987 += m16260(j);
                        m39370(1);
                    }
                    synchronized (this.f51820) {
                    }
                }
                Trace.beginSection("bypassRender");
                while (m39380(j, j2)) {
                }
                Trace.endSection();
                synchronized (this.f51820) {
                }
            }
        } catch (MediaCodec.CryptoException e) {
            throw m16253(e, this.f51815, C5792.m13029(e.getErrorCode()));
        } catch (IllegalStateException e2) {
            boolean z2 = e2 instanceof MediaCodec.CodecException;
            if (!z2) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e2;
                }
            }
            mo15340(e2);
            if (z2 && ((MediaCodec.CodecException) e2).isRecoverable()) {
                z = true;
            }
            if (z) {
                m39381();
            }
            C19381 c19381Mo39384 = mo39384(e2, this.f51833);
            throw m16254(c19381Mo39384, this.f51815, z, c19381Mo39384.f57866 == 1101 ? 4006 : 4003);
        }
    }

    /* JADX INFO: renamed from: ۧ֫ */
    public final void m39395() throws C19735 {
        if (m39375()) {
            m39407();
        }
    }

    /* JADX INFO: renamed from: ۫֫ */
    private boolean m39375() {
        if (this.f51784 != null) {
            if (mo39411()) {
                m39381();
                return true;
            }
            if (mo39410()) {
                m39376();
                return false;
            }
            if (this.f51799 != -9223372036854775807L) {
                long jM16268 = m16268();
                long j = this.f51799;
                if (jM16268 <= j && this.f51826 < j) {
                    this.f51813 = true;
                    this.f51799 = -9223372036854775807L;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩹֫ */
    public boolean mo39411() {
        int i = this.f51774;
        if (i == 3 || ((this.f51808 && !this.f51796) || (this.f51786 && this.f51812))) {
            return true;
        }
        if (i == 2) {
            int i2 = Build.VERSION.SDK_INT;
            C23877.m52960(i2 >= 23);
            if (i2 >= 23) {
                try {
                    m39373();
                    return false;
                } catch (C19735 e) {
                    C21334.m48350("Failed to update the DRM session, releasing the codec instead.", e);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۖ֫ */
    public final boolean m39388() {
        return this.f51813;
    }

    /* JADX INFO: renamed from: ۬֫ */
    private void m39376() {
        try {
            InterfaceC12676 interfaceC12676 = this.f51784;
            C23877.m52958(interfaceC12676);
            interfaceC12676.flush();
        } finally {
            mo39382();
        }
    }

    /* JADX INFO: renamed from: ۠֫ */
    public final void m39391() {
        mo39382();
        this.f51803 = null;
        this.f51839 = null;
        this.f51833 = null;
        this.f51835 = null;
        this.f51790 = null;
        this.f51806 = false;
        this.f51796 = false;
        this.f51802 = -1.0f;
        this.f51825 = 0;
        this.f51808 = false;
        this.f51786 = false;
        this.f51782 = false;
        this.f51810 = false;
        this.f51778 = false;
        this.f51794 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public C19381 mo39384(IllegalStateException illegalStateException, C18710 c18710) {
        return new C19381(illegalStateException, c18710);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m39370(int i) throws C19735 {
        C5221 c5221M16267 = m16267();
        C23128 c23128 = this.f51777;
        c23128.mo7();
        int iM16252 = m16252(c5221M16267, c23128, i | 4);
        if (iM16252 == -5) {
            mo15335(c5221M16267);
            return true;
        }
        if (iM16252 != -4 || !c23128.m14573()) {
            return false;
        }
        this.f51793 = true;
        m39374();
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m39366(MediaCrypto mediaCrypto, boolean z) throws C22064 {
        C10307 c10307 = this.f51815;
        c10307.getClass();
        if (this.f51839 == null) {
            try {
                List listM39364 = m39364(z);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.f51839 = arrayDeque;
                if (this.f51823) {
                    arrayDeque.addAll(listM39364);
                } else {
                    ArrayList arrayList = (ArrayList) listM39364;
                    if (!arrayList.isEmpty()) {
                        this.f51839.add((C18710) arrayList.get(0));
                    }
                }
                this.f51791 = null;
            } catch (C7311 e) {
                throw new C22064(c10307, e, z, -49998);
            }
        }
        if (this.f51839.isEmpty()) {
            throw new C22064(c10307, (C7311) null, z, -49999);
        }
        ArrayDeque arrayDeque2 = this.f51839;
        arrayDeque2.getClass();
        while (this.f51784 == null) {
            C18710 c18710 = (C18710) arrayDeque2.peekFirst();
            c18710.getClass();
            if (!mo39400(c10307) || !mo39386(c18710)) {
                return;
            }
            try {
                m39369(c18710, mediaCrypto);
            } catch (Exception e2) {
                C21334.m48350("Failed to initialize decoder: " + c18710, e2);
                arrayDeque2.removeFirst();
                C22064 c22064 = new C22064(c10307, e2, z, c18710);
                mo15340(c22064);
                if (this.f51791 == null) {
                    this.f51791 = c22064;
                } else {
                    this.f51791 = C22064.m49657(this.f51791);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.f51791;
                }
            }
        }
        this.f51839 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    private List m39364(boolean z) {
        C10307 c10307 = this.f51815;
        c10307.getClass();
        InterfaceC4629 interfaceC4629 = this.f51828;
        ArrayList arrayListMo15334 = mo15334(interfaceC4629, c10307, z);
        if (!arrayListMo15334.isEmpty() || !z) {
            return arrayListMo15334;
        }
        ArrayList arrayListMo15335 = mo15334(interfaceC4629, c10307, false);
        if (!arrayListMo15335.isEmpty()) {
            C21334.m48351("Drm session requires secure decoder for " + c10307.f28528 + ", but no secure decoder available. Trying to proceed with " + arrayListMo15335 + ".");
        }
        return arrayListMo15335;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:45:0x0101  */
    /* JADX INFO: renamed from: ֫ */
    private void m39369(C18710 c18710, MediaCrypto mediaCrypto) {
        int i;
        this.f51833 = c18710;
        C10307 c10307 = this.f51815;
        c10307.getClass();
        String str = c18710.f55902;
        int i2 = Build.VERSION.SDK_INT;
        float fMo15332 = i2 < 23 ? -1.0f : mo15332(this.f51805, c10307, m16258());
        float f = fMo15332 > this.f51814 ? fMo15332 : -1.0f;
        long jMo35966 = m16259().mo35966();
        C24249 c24249Mo15337 = mo15337(c18710, c10307, mediaCrypto, f);
        if (i2 >= 31) {
            C8652.m20072(c24249Mo15337, m16266());
        }
        try {
            Trace.beginSection("createCodec:" + str);
            InterfaceC12676 interfaceC12676Mo15126 = this.f51827.mo15126(c24249Mo15337);
            this.f51784 = interfaceC12676Mo15126;
            interfaceC12676Mo15126.mo11468(new C11335(this));
            Trace.endSection();
            long jMo35967 = m16259().mo35966();
            if (!c18710.m42700(c10307)) {
                String strM23917 = C10307.m23917(c10307);
                Locale locale = Locale.US;
                C21334.m48351("Format exceeds selected codec's capabilities [" + strM23917 + ", " + str + "]");
            }
            this.f51802 = f;
            this.f51835 = c10307;
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
            this.f51825 = i;
            this.f51808 = i2 == 29 && "c2.android.aac.decoder".equals(str);
            this.f51786 = i2 <= 23 && "OMX.google.vorbis.decoder".equals(str);
            this.f51782 = i2 == 21 && "OMX.google.aac.decoder".equals(str);
            String str4 = c18710.f55902;
            this.f51810 = (i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str4)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str4) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str4) || "OMX.bcm.vdec.avc.tunnel".equals(str4) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str4) || "OMX.bcm.vdec.hevc.tunnel".equals(str4) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str4))) || (("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && c18710.f55906) || mo39396());
            this.f51784.getClass();
            if (getState() == 2) {
                this.f51816 = m16259().mo35966() + 1000;
            }
            this.f51820.f13977++;
            mo15342(str, jMo35967, jMo35967 - jMo35966);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֨֫ */
    public void mo39382() {
        this.f51840 = -1;
        this.f51792.f72704 = null;
        this.f51830 = -1;
        this.f51817 = null;
        this.f51819 = -9223372036854775807L;
        this.f51781 = -9223372036854775807L;
        this.f51826 = -9223372036854775807L;
        this.f51816 = -9223372036854775807L;
        this.f51812 = false;
        this.f51785 = -9223372036854775807L;
        this.f51837 = false;
        this.f51829 = false;
        this.f51838 = false;
        this.f51832 = false;
        this.f51801 = false;
        this.f51788 = 0;
        this.f51774 = 0;
        this.f51794 = this.f51778 ? 1 : 0;
        this.f51813 = false;
        this.f51795 = -9223372036854775807L;
        this.f51799 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m39367(InterfaceC2577 interfaceC2577) {
        C20013.m45384(this.f51776, interfaceC2577);
        this.f51776 = interfaceC2577;
    }

    /* JADX INFO: renamed from: ۗ֫ */
    private boolean m39371() throws C19735 {
        InterfaceC12676 interfaceC12676 = this.f51784;
        if (interfaceC12676 == null || this.f51788 == 2 || this.f51793) {
            return false;
        }
        int i = this.f51840;
        C23128 c23128 = this.f51792;
        if (i < 0) {
            int iMo11473 = interfaceC12676.mo11473();
            this.f51840 = iMo11473;
            if (iMo11473 < 0) {
                return false;
            }
            c23128.f72704 = interfaceC12676.mo11470(iMo11473);
            c23128.mo7();
        }
        if (this.f51788 == 1) {
            if (!this.f51810) {
                this.f51812 = true;
                interfaceC12676.mo11462(this.f51840, 0, 4, 0L);
                this.f51840 = -1;
                c23128.f72704 = null;
            }
            this.f51788 = 2;
            return false;
        }
        if (this.f51829) {
            this.f51829 = false;
            ByteBuffer byteBuffer = c23128.f72704;
            byteBuffer.getClass();
            byteBuffer.put(f51773);
            interfaceC12676.mo11462(this.f51840, 38, 0, 0L);
            this.f51840 = -1;
            c23128.f72704 = null;
            this.f51837 = true;
            return true;
        }
        if (this.f51794 == 1) {
            int i2 = 0;
            while (true) {
                C10307 c10307 = this.f51835;
                c10307.getClass();
                if (i2 >= c10307.f28548.size()) {
                    break;
                }
                byte[] bArr = (byte[]) this.f51835.f28548.get(i2);
                ByteBuffer byteBuffer2 = c23128.f72704;
                byteBuffer2.getClass();
                byteBuffer2.put(bArr);
                i2++;
            }
            this.f51794 = 2;
        }
        ByteBuffer byteBuffer3 = c23128.f72704;
        byteBuffer3.getClass();
        int iPosition = byteBuffer3.position();
        C5221 c5221M16267 = m16267();
        try {
            int iM16252 = m16252(c5221M16267, c23128, 0);
            if (iM16252 == -3) {
                if (!mo8302()) {
                    return false;
                }
                this.f51781 = this.f51819;
                return false;
            }
            if (iM16252 == -5) {
                if (this.f51794 == 2) {
                    c23128.mo7();
                    this.f51794 = 1;
                }
                mo15335(c5221M16267);
                return true;
            }
            if (c23128.m14573()) {
                this.f51781 = this.f51819;
                if (this.f51794 == 2) {
                    c23128.mo7();
                    this.f51794 = 1;
                }
                this.f51793 = true;
                if (!this.f51837) {
                    m39374();
                    return false;
                }
                if (this.f51810) {
                    return false;
                }
                this.f51812 = true;
                interfaceC12676.mo11462(this.f51840, 0, 4, 0L);
                this.f51840 = -1;
                c23128.f72704 = null;
                return false;
            }
            if (!this.f51837 && !c23128.m14566()) {
                c23128.mo7();
                if (this.f51794 == 2) {
                    this.f51794 = 1;
                    return true;
                }
            } else if (!mo39405(c23128)) {
                boolean zM51578 = c23128.m51578();
                if (zM51578) {
                    c23128.f72709.m17840(iPosition);
                }
                long j = c23128.f72706;
                if (this.f51821) {
                    ArrayDeque arrayDeque = this.f51809;
                    if (arrayDeque.isEmpty()) {
                        C21886 c21886 = this.f51783.f29497;
                        C10307 c10308 = this.f51815;
                        c10308.getClass();
                        c21886.m49349(j, c10308);
                    } else {
                        C21886 c21887 = ((C10664) arrayDeque.peekLast()).f29497;
                        C10307 c10309 = this.f51815;
                        c10309.getClass();
                        c21887.m49349(j, c10309);
                    }
                    this.f51821 = false;
                }
                this.f51819 = Math.max(this.f51819, j);
                if (mo8302() || c23128.m14565()) {
                    this.f51781 = this.f51819;
                }
                c23128.m51580();
                if (c23128.m14570()) {
                    mo15353(c23128);
                }
                mo39399(c23128);
                int iMo39383 = mo39383(c23128);
                if ((Build.VERSION.SDK_INT < 34 || (iMo39383 & 32) == 0) && !m16264().f56352) {
                    this.f51799 = Math.max(this.f51799, c23128.f72706);
                }
                if (zM51578) {
                    interfaceC12676.mo11464(this.f51840, c23128.f72709, j, iMo39383);
                } else {
                    int i3 = this.f51840;
                    ByteBuffer byteBuffer4 = c23128.f72704;
                    byteBuffer4.getClass();
                    interfaceC12676.mo11462(i3, byteBuffer4.limit(), iMo39383, j);
                }
                this.f51840 = -1;
                c23128.f72704 = null;
                this.f51837 = true;
                this.f51794 = 0;
                this.f51820.f13988++;
                return true;
            }
            return true;
        } catch (C17091 e) {
            mo15340(e);
            m39370(0);
            m39376();
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x014e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0168  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00da, code lost:
    
        if (r3.mo3884(r2) != false) goto L129;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C15100 mo15335(C5221 c5221) throws C19735 {
        int i;
        InterfaceC20446 interfaceC20446Mo3887;
        InterfaceC20446 interfaceC20446Mo3888;
        boolean z = true;
        this.f51821 = true;
        C10307 c10307M6672 = c5221.f12253;
        c10307M6672.getClass();
        String str = c10307M6672.f28528;
        if (str == null) {
            throw m16253(new IllegalArgumentException("Sample MIME type is null."), c10307M6672, 4005);
        }
        if ((str.equals("video/av01") || str.equals("video/x-vnd.on2.vp9")) && !c10307M6672.f28548.isEmpty()) {
            C3601 c3601M23918 = c10307M6672.m23918();
            c3601M23918.m6678((List) null);
            c10307M6672 = c3601M23918.m6672();
        }
        C10307 c10307 = c10307M6672;
        InterfaceC2577 interfaceC2577 = c5221.f12252;
        C20013.m45384(this.f51779, interfaceC2577);
        this.f51779 = interfaceC2577;
        this.f51815 = c10307;
        if (this.f51798) {
            this.f51800 = true;
            return null;
        }
        InterfaceC12676 interfaceC12676 = this.f51784;
        if (interfaceC12676 == null) {
            this.f51839 = null;
            m39407();
            return null;
        }
        C18710 c18710 = this.f51833;
        c18710.getClass();
        C10307 c10308 = this.f51835;
        c10308.getClass();
        InterfaceC2577 interfaceC2578 = this.f51776;
        InterfaceC2577 interfaceC2579 = this.f51779;
        if (interfaceC2578 != interfaceC2579) {
            if (interfaceC2579 != null && interfaceC2578 != null && (interfaceC20446Mo3887 = interfaceC2579.mo3887()) != null && (interfaceC20446Mo3888 = interfaceC2578.mo3887()) != null && interfaceC20446Mo3887.getClass().equals(interfaceC20446Mo3888.getClass())) {
                if (interfaceC20446Mo3887 instanceof C4076) {
                    if (interfaceC2579.mo3882().equals(interfaceC2578.mo3882()) && Build.VERSION.SDK_INT >= 23) {
                        UUID uuid = C25059.f79954;
                        if (!uuid.equals(interfaceC2578.mo3882()) && !uuid.equals(interfaceC2579.mo3882())) {
                            if (!c18710.f55906) {
                                if (interfaceC2579.getState() != 2) {
                                    if (interfaceC2579.getState() == 3 || interfaceC2579.getState() == 4) {
                                        String str2 = c10307.f28528;
                                        str2.getClass();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (this.f51837) {
                this.f51788 = 1;
                this.f51774 = 3;
            } else {
                m39381();
                m39407();
            }
            return new C15100(c18710.f55902, c10308, c10307, 0, 128);
        }
        boolean z2 = this.f51779 != this.f51776;
        C23877.m52960(!z2 || Build.VERSION.SDK_INT >= 23);
        C15100 c15100Mo15336 = mo15336(c18710, c10308, c10307);
        int i2 = c15100Mo15336.f43118;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException();
                    }
                    if (m39379(c10307)) {
                        this.f51835 = c10307;
                        if (z2 && !m39372()) {
                            i = 2;
                        }
                    } else {
                        i = 16;
                    }
                } else if (m39379(c10307)) {
                    this.f51778 = true;
                    this.f51794 = 1;
                    int i3 = this.f51825;
                    if (i3 != 2 && (i3 != 1 || c10307.f28547 != c10308.f28547 || c10307.f28523 != c10308.f28523)) {
                        z = false;
                    }
                    this.f51829 = z;
                    this.f51835 = c10307;
                    if (z2 && !m39372()) {
                        i = 2;
                    }
                } else {
                    i = 16;
                }
            } else if (m39379(c10307)) {
                this.f51835 = c10307;
                if (z2) {
                    if (!m39372()) {
                        i = 2;
                    }
                } else if (this.f51837) {
                    this.f51788 = 1;
                    if (this.f51786) {
                        this.f51774 = 3;
                        i = 2;
                    } else {
                        this.f51774 = 1;
                    }
                }
            } else {
                i = 16;
            }
            return (i2 != 0 || (this.f51784 == interfaceC12676 && this.f51774 != 3)) ? c15100Mo15336 : new C15100(c18710.f55902, c10308, c10307, 0, i);
        }
        if (this.f51837) {
            this.f51788 = 1;
            this.f51774 = 3;
        } else {
            m39381();
            m39407();
        }
        i = 0;
        if (i2 != 0) {
        }
    }

    /* JADX INFO: renamed from: ۜ֫ */
    public final long m39390() {
        return this.f51781;
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo39404(long j) {
        this.f51826 = j;
        while (true) {
            ArrayDeque arrayDeque = this.f51809;
            if (arrayDeque.isEmpty() || j < ((C10664) arrayDeque.peek()).f29498) {
                return;
            }
            C10664 c10664 = (C10664) arrayDeque.poll();
            c10664.getClass();
            m39368(c10664);
            mo15360();
        }
    }

    @Override // p067l.AbstractC7054, p067l.InterfaceC4114
    /* JADX INFO: renamed from: ۧ */
    public boolean mo8296() {
        return this.f51787;
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ܿ */
    public boolean mo8299() {
        if (this.f51815 == null) {
            return false;
        }
        if (m16262() || this.f51830 >= 0) {
            return true;
        }
        return this.f51816 != -9223372036854775807L && m16259().mo35966() < this.f51816;
    }

    /* JADX INFO: renamed from: ۡ֫ */
    public final float m39392() {
        return this.f51804;
    }

    /* JADX INFO: renamed from: ܺ֫ */
    public final InterfaceC9205 m39398() {
        return this.f51824;
    }

    /* JADX INFO: renamed from: ᩶֫ */
    public final void m39408() throws C19735 {
        m39379(this.f51835);
    }

    /* JADX INFO: renamed from: ܿ */
    private boolean m39379(C10307 c10307) throws C19735 {
        if (Build.VERSION.SDK_INT >= 23 && this.f51784 != null && this.f51774 != 3 && getState() != 0) {
            float f = this.f51805;
            c10307.getClass();
            float fMo15332 = mo15332(f, c10307, m16258());
            float f2 = this.f51802;
            if (f2 != fMo15332) {
                if (fMo15332 == -1.0f) {
                    if (this.f51837) {
                        this.f51788 = 1;
                        this.f51774 = 3;
                        return false;
                    }
                    m39381();
                    m39407();
                    return false;
                }
                if (f2 != -1.0f || fMo15332 > this.f51814) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fMo15332);
                    InterfaceC12676 interfaceC12676 = this.f51784;
                    interfaceC12676.getClass();
                    interfaceC12676.mo11465(bundle);
                    this.f51802 = fMo15332;
                }
            }
        }
        return true;
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: ۙ֫ */
    private boolean m39372() throws C19735 {
        if (this.f51837) {
            this.f51788 = 1;
            if (this.f51786) {
                this.f51774 = 3;
                return false;
            }
            this.f51774 = 2;
            return true;
        }
        m39373();
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
    /* JADX INFO: renamed from: ܿ */
    private boolean m39378(long j, long j2) throws C19735 {
        boolean z;
        long j3;
        boolean z2;
        boolean z3;
        boolean z4;
        MediaCodec.BufferInfo bufferInfo;
        boolean zMo15346;
        boolean z5;
        boolean z6;
        long j4;
        int iMo11459;
        InterfaceC12676 interfaceC12676 = this.f51784;
        interfaceC12676.getClass();
        int i = this.f51830;
        MediaCodec.BufferInfo bufferInfo2 = this.f51834;
        if (i >= 0) {
            if (bufferInfo2.presentationTimeUs < m16268()) {
                z = true;
            } else {
                z = false;
            }
            this.f51832 = z;
            j3 = this.f51781;
            if (j3 != -9223372036854775807L) {
                z2 = false;
            } else {
                z2 = false;
            }
            this.f51801 = z2;
            if (this.f51813) {
                j4 = this.f51795;
                if (j4 != -9223372036854775807L) {
                    this.f51795 = bufferInfo2.presentationTimeUs;
                    this.f51832 = true;
                    this.f51801 = false;
                } else {
                    this.f51795 = bufferInfo2.presentationTimeUs;
                    this.f51832 = true;
                    this.f51801 = false;
                }
            }
            if (this.f51782) {
                z3 = false;
                z4 = true;
                ByteBuffer byteBuffer = this.f51817;
                int i2 = this.f51830;
                int i3 = bufferInfo2.flags;
                long j5 = bufferInfo2.presentationTimeUs;
                boolean z7 = this.f51832;
                boolean z8 = this.f51801;
                C10307 c10307 = this.f51836;
                c10307.getClass();
                bufferInfo = bufferInfo2;
                zMo15346 = mo15346(j, j2, interfaceC12676, byteBuffer, i2, i3, 1, j5, z7, z8, c10307);
            } else {
                z3 = false;
                z4 = true;
                ByteBuffer byteBuffer2 = this.f51817;
                int i4 = this.f51830;
                int i5 = bufferInfo2.flags;
                long j6 = bufferInfo2.presentationTimeUs;
                boolean z9 = this.f51832;
                boolean z10 = this.f51801;
                C10307 c10308 = this.f51836;
                c10308.getClass();
                bufferInfo = bufferInfo2;
                zMo15346 = mo15346(j, j2, interfaceC12676, byteBuffer2, i4, i5, 1, j6, z9, z10, c10308);
            }
            if (zMo15346) {
                mo39404(bufferInfo.presentationTimeUs);
                if ((bufferInfo.flags & 4) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5) {
                    this.f51785 = m16259().mo35963();
                }
                this.f51830 = -1;
                this.f51817 = null;
                if (!z5) {
                    return z4;
                }
                m39374();
            }
            return z3;
        }
        if (this.f51782 && this.f51812) {
            try {
                iMo11459 = interfaceC12676.mo11459(bufferInfo2);
            } catch (IllegalStateException unused) {
                m39374();
                if (this.f51787) {
                    m39381();
                }
            }
        } else {
            iMo11459 = interfaceC12676.mo11459(bufferInfo2);
        }
        if (iMo11459 >= 0) {
            if (this.f51838) {
                this.f51838 = false;
                interfaceC12676.mo11472(iMo11459);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                m39374();
                return false;
            }
            this.f51830 = iMo11459;
            ByteBuffer byteBufferMo11474 = interfaceC12676.mo11474(iMo11459);
            this.f51817 = byteBufferMo11474;
            if (byteBufferMo11474 != null) {
                byteBufferMo11474.position(bufferInfo2.offset);
                this.f51817.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            m39402(bufferInfo2.presentationTimeUs);
            if (bufferInfo2.presentationTimeUs < m16268()) {
                z = true;
            } else {
                z = false;
            }
            this.f51832 = z;
            j3 = this.f51781;
            if (j3 != -9223372036854775807L || j3 > bufferInfo2.presentationTimeUs) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f51801 = z2;
            if (this.f51813) {
                j4 = this.f51795;
                if (j4 != -9223372036854775807L || bufferInfo2.presentationTimeUs > j4) {
                    this.f51795 = bufferInfo2.presentationTimeUs;
                    this.f51832 = true;
                    this.f51801 = false;
                } else {
                    this.f51813 = false;
                    this.f51795 = -9223372036854775807L;
                }
            }
            if (this.f51782 || !this.f51812) {
                z3 = false;
                z4 = true;
                ByteBuffer byteBuffer3 = this.f51817;
                int i6 = this.f51830;
                int i7 = bufferInfo2.flags;
                long j7 = bufferInfo2.presentationTimeUs;
                boolean z11 = this.f51832;
                boolean z12 = this.f51801;
                C10307 c10309 = this.f51836;
                c10309.getClass();
                bufferInfo = bufferInfo2;
                zMo15346 = mo15346(j, j2, interfaceC12676, byteBuffer3, i6, i7, 1, j7, z11, z12, c10309);
            } else {
                try {
                    ByteBuffer byteBuffer4 = this.f51817;
                    int i8 = this.f51830;
                    int i9 = bufferInfo2.flags;
                    long j8 = bufferInfo2.presentationTimeUs;
                    boolean z13 = this.f51832;
                    boolean z14 = this.f51801;
                    C10307 c103010 = this.f51836;
                    c103010.getClass();
                    z4 = true;
                    zMo15346 = mo15346(j, j2, interfaceC12676, byteBuffer4, i8, i9, 1, j8, z13, z14, c103010);
                    bufferInfo = bufferInfo2;
                    z3 = false;
                } catch (IllegalStateException unused2) {
                    z6 = false;
                    m39374();
                    if (this.f51787) {
                        m39381();
                    }
                }
            }
            if (zMo15346) {
                mo39404(bufferInfo.presentationTimeUs);
                if ((bufferInfo.flags & 4) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5 && this.f51812 && this.f51801) {
                    this.f51785 = m16259().mo35963();
                }
                this.f51830 = -1;
                this.f51817 = null;
                if (!z5) {
                    return z4;
                }
                m39374();
            }
            return z3;
        }
        if (iMo11459 == -2) {
            this.f51796 = true;
            InterfaceC12676 interfaceC12677 = this.f51784;
            interfaceC12677.getClass();
            MediaFormat mediaFormatMo11469 = interfaceC12677.mo11469();
            if (this.f51825 != 0 && mediaFormatMo11469.getInteger("width") == 32 && mediaFormatMo11469.getInteger("height") == 32) {
                this.f51838 = true;
                return true;
            }
            this.f51790 = mediaFormatMo11469;
            this.f51806 = true;
            return true;
        }
        if (this.f51810 && (this.f51793 || this.f51788 == 2)) {
            m39374();
        }
        long j9 = this.f51785;
        if (j9 != -9223372036854775807L && j9 + 100 < m16259().mo35963()) {
            m39374();
            return false;
        }
        z6 = false;
        return z6;
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: ۤ֫ */
    private void m39374() throws C19735 {
        int i = this.f51774;
        if (i == 1) {
            m39376();
            return;
        }
        if (i == 2) {
            m39376();
            m39373();
        } else if (i != 3) {
            this.f51787 = true;
            mo15348();
        } else {
            m39381();
            m39407();
        }
    }

    /* JADX INFO: renamed from: ܶ֫ */
    public final void m39397() {
        this.f51811 = true;
    }

    /* JADX INFO: renamed from: ᩷֫ */
    public final long m39409() {
        return this.f51783.f29500;
    }

    /* JADX INFO: renamed from: ۢ֫ */
    public final long m39393() {
        return this.f51783.f29499;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m39368(C10664 c10664) {
        this.f51783 = c10664;
        long j = c10664.f29500;
        if (j != -9223372036854775807L) {
            this.f51789 = true;
            mo15357(j);
        }
    }

    /* JADX INFO: renamed from: ۛ֫ */
    private void m39373() throws C19735 {
        InterfaceC2577 interfaceC2577 = this.f51779;
        interfaceC2577.getClass();
        InterfaceC20446 interfaceC20446Mo3887 = interfaceC2577.mo3887();
        if (interfaceC20446Mo3887 instanceof C4076) {
            try {
                MediaCrypto mediaCrypto = this.f51775;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((C4076) interfaceC20446Mo3887).f8975);
            } catch (MediaCryptoException e) {
                throw m16253(e, this.f51815, 6006);
            }
        }
        m39367(this.f51779);
        this.f51788 = 0;
        this.f51774 = 0;
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
    /* JADX INFO: renamed from: ᩳ */
    private boolean m39380(long j, long j2) throws C19735 {
        C14861 c14861;
        C14861 c14862;
        C5221 c5221M16267;
        int iM16252;
        C10307 c10307;
        long jM16268;
        C10307 c10308;
        C23877.m52960(!this.f51787);
        C14861 c14863 = this.f51831;
        if (c14863.m33966()) {
            ByteBuffer byteBuffer = c14863.f72704;
            int i = this.f51830;
            int iM33963 = c14863.m33963();
            long j3 = c14863.f72706;
            boolean zM39377 = m39377(m16268(), c14863.m33965());
            boolean zM14573 = c14863.m14573();
            C10307 c10309 = this.f51836;
            c10309.getClass();
            c14861 = c14863;
            if (mo15346(j, j2, null, byteBuffer, i, 0, iM33963, j3, zM39377, zM14573, c10309)) {
                mo39404(c14861.m33965());
                c14861.mo7();
            }
            return false;
        }
        c14861 = c14863;
        if (this.f51793) {
            this.f51787 = true;
            return false;
        }
        boolean z = this.f51780;
        C23128 c23128 = this.f51818;
        if (z) {
            c14862 = c14861;
            C23877.m52960(c14862.m33964(c23128));
            this.f51780 = false;
        } else {
            c14862 = c14861;
        }
        boolean z2 = this.f51800;
        C5378 c5378 = this.f51797;
        if (z2) {
            if (c14862.m33966()) {
                return true;
            }
            this.f51798 = false;
            this.f51819 = -9223372036854775807L;
            this.f51781 = -9223372036854775807L;
            this.f51826 = -9223372036854775807L;
            this.f51800 = false;
            c14862.mo7();
            c23128.mo7();
            this.f51780 = false;
            c5378.m11764();
            this.f51800 = false;
            m39407();
            if (this.f51798) {
                C23877.m52960(!this.f51793);
                c5221M16267 = m16267();
                c23128.mo7();
                while (true) {
                    c23128.mo7();
                    iM16252 = m16252(c5221M16267, c23128, 0);
                    if (iM16252 != -5) {
                        mo15335(c5221M16267);
                        break;
                    }
                    if (iM16252 != -4) {
                        if (c23128.m14573()) {
                            this.f51793 = true;
                            this.f51781 = this.f51819;
                            break;
                        }
                        this.f51819 = Math.max(this.f51819, c23128.f72706);
                        if (!mo8302()) {
                            this.f51781 = this.f51819;
                        } else {
                            this.f51781 = this.f51819;
                        }
                        if (this.f51821) {
                            c10308 = this.f51815;
                            c10308.getClass();
                            this.f51836 = c10308;
                            if (C12826.equals(c10308.f28528, "audio/opus")) {
                                byte[] bArr = (byte[]) this.f51836.f28548.get(0);
                                int i2 = (bArr[10] & 255) | ((bArr[11] & 255) << 8);
                                C3601 c3601M23918 = this.f51836.m23918();
                                c3601M23918.m6709(i2);
                                this.f51836 = c3601M23918.m6672();
                            }
                            mo15344(this.f51836, (MediaFormat) null);
                            this.f51821 = false;
                        }
                        c23128.m51580();
                        c10307 = this.f51836;
                        if (c10307 != null) {
                            if (c23128.m14570()) {
                                c23128.f72703 = this.f51836;
                                mo15353(c23128);
                            }
                            if (C6112.m13910(m16268(), c23128.f72706)) {
                                c5378.m11765(c23128, this.f51836.f28548);
                            }
                        }
                        if (!c14862.m33966()) {
                            if (!c14862.m33964(c23128)) {
                            }
                        } else {
                            jM16268 = m16268();
                            if (m39377(jM16268, c14862.m33965()) == m39377(jM16268, c23128.f72706)) {
                                if (!c14862.m33964(c23128)) {
                                }
                            }
                        }
                        this.f51780 = true;
                        break;
                    }
                    if (iM16252 == -3) {
                        if (mo8302()) {
                            break;
                        }
                        this.f51781 = this.f51819;
                        break;
                    }
                    throw new IllegalStateException();
                }
                if (c14862.m33966()) {
                    c14862.m51580();
                }
                return !c14862.m33966() ? true : true;
            }
        } else {
            C23877.m52960(!this.f51793);
            c5221M16267 = m16267();
            c23128.mo7();
            while (true) {
                c23128.mo7();
                iM16252 = m16252(c5221M16267, c23128, 0);
                if (iM16252 != -5) {
                    mo15335(c5221M16267);
                    break;
                }
                if (iM16252 != -4) {
                    if (c23128.m14573()) {
                        this.f51793 = true;
                        this.f51781 = this.f51819;
                        break;
                    }
                    this.f51819 = Math.max(this.f51819, c23128.f72706);
                    if (!mo8302() || this.f51792.m14565()) {
                        this.f51781 = this.f51819;
                    }
                    if (this.f51821) {
                        c10308 = this.f51815;
                        c10308.getClass();
                        this.f51836 = c10308;
                        if (C12826.equals(c10308.f28528, "audio/opus") && !this.f51836.f28548.isEmpty()) {
                            byte[] bArr2 = (byte[]) this.f51836.f28548.get(0);
                            int i3 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                            C3601 c3601M23919 = this.f51836.m23918();
                            c3601M23919.m6709(i3);
                            this.f51836 = c3601M23919.m6672();
                        }
                        mo15344(this.f51836, (MediaFormat) null);
                        this.f51821 = false;
                    }
                    c23128.m51580();
                    c10307 = this.f51836;
                    if (c10307 != null && C12826.equals(c10307.f28528, "audio/opus")) {
                        if (c23128.m14570()) {
                            c23128.f72703 = this.f51836;
                            mo15353(c23128);
                        }
                        if (C6112.m13910(m16268(), c23128.f72706)) {
                            c5378.m11765(c23128, this.f51836.f28548);
                        }
                    }
                    if (!c14862.m33966()) {
                        if (!c14862.m33964(c23128)) {
                        }
                    } else {
                        jM16268 = m16268();
                        if (m39377(jM16268, c14862.m33965()) == m39377(jM16268, c23128.f72706)) {
                            if (!c14862.m33964(c23128)) {
                            }
                        }
                    }
                    this.f51780 = true;
                    break;
                }
                if (iM16252 == -3) {
                    if (mo8302()) {
                        break;
                    }
                    this.f51781 = this.f51819;
                    break;
                }
                throw new IllegalStateException();
            }
            if (c14862.m33966()) {
                c14862.m51580();
            }
            if (!c14862.m33966() || this.f51793 || this.f51800) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ */
    private boolean m39377(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        C10307 c10307 = this.f51836;
        return (c10307 != null && C12826.equals(c10307.f28528, "audio/opus") && C6112.m13910(j, j2)) ? false : true;
    }
}
