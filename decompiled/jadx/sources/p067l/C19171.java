package p067l;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.C0684bo;
import com.umeng.analytics.pro.C0698cb;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import moe.shizuku.server.IShizukuService;
import net.engio.mbassy.listener.MessageHandler;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;
import org.bouncycastle.util.encoders.Base32Encoder;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ܿ᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8VY */
/* JADX INFO: loaded from: classes5.dex */
public final class C19171 extends AbstractC17368 {

    /* JADX INFO: renamed from: ֡ᩳ */
    public static boolean f57275;

    /* JADX INFO: renamed from: ᩴᩳ */
    public static final int[] f57276 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: ᩵ᩳ */
    public static boolean f57277;

    /* JADX INFO: renamed from: ֡ܽ */
    public final PriorityQueue f57278;

    /* JADX INFO: renamed from: ֨ܽ */
    public int f57279;

    /* JADX INFO: renamed from: ֫ᩳ */
    public int f57280;

    /* JADX INFO: renamed from: ۖܽ */
    public final Context f57281;

    /* JADX INFO: renamed from: ۖᩳ */
    public final C21854 f57282;

    /* JADX INFO: renamed from: ۗܽ */
    public long f57283;

    /* JADX INFO: renamed from: ۘܽ */
    public C8454 f57284;

    /* JADX INFO: renamed from: ۘᩳ */
    public InterfaceC8640 f57285;

    /* JADX INFO: renamed from: ۙܽ */
    public boolean f57286;

    /* JADX INFO: renamed from: ۚܽ */
    public long f57287;

    /* JADX INFO: renamed from: ۛܽ */
    public C18532 f57288;

    /* JADX INFO: renamed from: ۜܽ */
    public boolean f57289;

    /* JADX INFO: renamed from: ۜᩳ */
    public int f57290;

    /* JADX INFO: renamed from: ۟ܽ */
    public C25206 f57291;

    /* JADX INFO: renamed from: ۠ܽ */
    public final boolean f57292;

    /* JADX INFO: renamed from: ۡܽ */
    public int f57293;

    /* JADX INFO: renamed from: ۡᩳ */
    public int f57294;

    /* JADX INFO: renamed from: ۢܽ */
    public boolean f57295;

    /* JADX INFO: renamed from: ۢᩳ */
    public List f57296;

    /* JADX INFO: renamed from: ۤܽ */
    public int f57297;

    /* JADX INFO: renamed from: ۧᩳ */
    public C8454 f57298;

    /* JADX INFO: renamed from: ۨܽ */
    public final boolean f57299;

    /* JADX INFO: renamed from: ۫ܽ */
    public final long f57300;

    /* JADX INFO: renamed from: ۬ܽ */
    public final int f57301;

    /* JADX INFO: renamed from: ܰܽ */
    public long f57302;

    /* JADX INFO: renamed from: ܳܽ */
    public int f57303;

    /* JADX INFO: renamed from: ܳᩳ */
    public long f57304;

    /* JADX INFO: renamed from: ܶܽ */
    public final C12664 f57305;

    /* JADX INFO: renamed from: ܺܽ */
    public int f57306;

    /* JADX INFO: renamed from: ܺᩳ */
    public final C7101 f57307;

    /* JADX INFO: renamed from: ܽᩳ */
    public int f57308;

    /* JADX INFO: renamed from: ܿᩳ */
    public long f57309;

    /* JADX INFO: renamed from: ᩳᩳ */
    public C22220 f57310;

    /* JADX INFO: renamed from: ᩴܽ */
    public final boolean f57311;

    /* JADX INFO: renamed from: ᩵ܽ */
    public Surface f57312;

    /* JADX INFO: renamed from: ᩶ܽ */
    public boolean f57313;

    /* JADX INFO: renamed from: ᩷ܽ */
    public C18500 f57314;

    /* JADX INFO: renamed from: ᩷ᩳ */
    public C19842 f57315;

    /* JADX INFO: renamed from: ᩸ܽ */
    public InterfaceC23865 f57316;

    /* JADX INFO: renamed from: ᩹ܽ */
    public boolean f57317;

    /* JADX INFO: renamed from: ᩺ܽ */
    public boolean f57318;

    /* JADX INFO: renamed from: ᩻ܽ */
    public int f57319;

    /* JADX INFO: renamed from: ᩻ᩳ */
    public boolean f57320;

    @Override // p067l.InterfaceC4114, p067l.InterfaceC19537
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43659(InterfaceC12676 interfaceC12676, int i) {
        Trace.beginSection("skipVideoBuffer");
        interfaceC12676.mo11472(i);
        Trace.endSection();
        this.f51820.f13980++;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43660(InterfaceC12676 interfaceC12676, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        interfaceC12676.mo11463(i, j);
        Trace.endSection();
        this.f51820.f13978++;
        this.f57293 = 0;
        if (this.f57285 == null) {
            C8454 c8454 = this.f57284;
            boolean zEquals = c8454.equals(C8454.f22684);
            C12664 c12664 = this.f57305;
            if (!zEquals && !c8454.equals(this.f57298)) {
                this.f57298 = c8454;
                c12664.m29135(c8454);
            }
            if (!this.f57307.m16352() || (surface = this.f57312) == null) {
                return;
            }
            c12664.m29131(surface);
            this.f57313 = true;
        }
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo15346(long j, long j2, InterfaceC12676 interfaceC12676, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C10307 c10307) {
        interfaceC12676.getClass();
        long jM39409 = j3 - m39409();
        int i4 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.f57278;
            Long l2 = (Long) priorityQueue.peek();
            if (l2 == null || l2.longValue() >= j3) {
                break;
            }
            i4++;
            priorityQueue.poll();
        }
        m43658(i4, 0);
        InterfaceC8640 interfaceC8640 = this.f57285;
        if (interfaceC8640 != null) {
            if (z && !z2) {
                m43659(interfaceC12676, i);
                return true;
            }
            return interfaceC8640.mo10827(j3, new C9524(this, interfaceC12676, i, jM39409));
        }
        int iM16342 = this.f57307.m16342(j3, j, j2, m39393(), z, z2, this.f57282);
        C21854 c21854 = this.f57282;
        if (iM16342 == 0) {
            long jMo35967 = m16259().mo35967();
            InterfaceC23865 interfaceC23865 = this.f57316;
            if (interfaceC23865 != null) {
                interfaceC23865.mo26158(jM39409, jMo35967, c10307, m39412());
            }
            m43660(interfaceC12676, i, jMo35967);
            m43664(c21854.m49297());
            return true;
        }
        if (iM16342 == 1) {
            long jM49298 = c21854.m49298();
            long jM49297 = c21854.m49297();
            if (jM49298 == this.f57283) {
                m43659(interfaceC12676, i);
                jM49298 = jM49298;
            } else {
                InterfaceC23865 interfaceC23866 = this.f57316;
                if (interfaceC23866 != null) {
                    interfaceC23866.mo26158(jM39409, jM49298, c10307, m39412());
                }
                m43660(interfaceC12676, i, jM49298);
            }
            m43664(jM49297);
            this.f57283 = jM49298;
            return true;
        }
        if (iM16342 == 2) {
            Trace.beginSection("dropVideoBuffer");
            interfaceC12676.mo11472(i);
            Trace.endSection();
            m43658(0, 1);
            m43664(c21854.m49297());
            return true;
        }
        if (iM16342 == 3) {
            m43659(interfaceC12676, i);
            m43664(c21854.m49297());
            return true;
        }
        if (iM16342 == 4 || iM16342 == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(iM16342));
    }

    public C19171(C13137 c13137) {
        super(2, c13137.f36905, InterfaceC4629.f10376, false, 30.0f);
        Context applicationContext = c13137.f36907.getApplicationContext();
        this.f57281 = applicationContext;
        this.f57301 = c13137.f36908;
        this.f57285 = null;
        this.f57305 = new C12664(c13137.f36906, c13137.f36904);
        this.f57299 = this.f57285 == null;
        this.f57307 = new C7101(applicationContext, this, c13137.f36902);
        this.f57282 = new C21854();
        this.f57311 = "NVIDIA".equals(Build.MANUFACTURER);
        this.f57288 = C18532.f55343;
        this.f57308 = 1;
        this.f57319 = 0;
        this.f57284 = C8454.f22684;
        this.f57290 = 0;
        this.f57298 = null;
        this.f57280 = -1000;
        this.f57309 = -9223372036854775807L;
        this.f57302 = -9223372036854775807L;
        this.f57278 = new PriorityQueue();
        this.f57300 = -9223372036854775807L;
        this.f57292 = false;
        this.f57310 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m43661(long j, long j2, boolean z, boolean z2) throws C19735 {
        int iM16260;
        if (this.f57285 != null && this.f57299) {
            j2 -= -this.f57309;
        }
        if (j >= -500000 || z || (iM16260 = m16260(j2)) == 0) {
            return false;
        }
        PriorityQueue priorityQueue = this.f57278;
        if (z2) {
            C5713 c5713 = this.f51820;
            int i = c5713.f13987 + iM16260;
            c5713.f13987 = i;
            c5713.f13980 += this.f57303;
            c5713.f13987 = priorityQueue.size() + i;
        } else {
            this.f51820.f13985++;
            m43658(priorityQueue.size() + iM16260, this.f57303);
        }
        m39395();
        InterfaceC8640 interfaceC8640 = this.f57285;
        if (interfaceC8640 != null) {
            interfaceC8640.mo10833(false);
        }
        return true;
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ֫ */
    public final int mo15333(InterfaceC4629 interfaceC4629, C10307 c10307) {
        boolean z;
        int i = 0;
        if (!C11669.m26816(c10307.f28528)) {
            return C12832.m29410(0, 0, 0, 0);
        }
        boolean z2 = c10307.f28516 != null;
        Context context = this.f57281;
        List listM43645 = m43645(context, interfaceC4629, c10307, z2, false);
        if (z2 && listM43645.isEmpty()) {
            listM43645 = m43645(context, interfaceC4629, c10307, false, false);
        }
        if (listM43645.isEmpty()) {
            return C12832.m29410(1, 0, 0, 0);
        }
        int i2 = c10307.f28546;
        if (i2 != 0 && i2 != 2) {
            return C12832.m29410(2, 0, 0, 0);
        }
        C18710 c18710 = (C18710) listM43645.get(0);
        boolean zM42700 = c18710.m42700(c10307);
        if (!zM42700) {
            int i3 = 1;
            while (true) {
                if (i3 >= listM43645.size()) {
                    z = true;
                    break;
                }
                C18710 c18711 = (C18710) listM43645.get(i3);
                if (c18711.m42700(c10307)) {
                    z = false;
                    zM42700 = true;
                    c18710 = c18711;
                    break;
                }
                i3++;
            }
        } else {
            z = true;
            break;
        }
        int i4 = zM42700 ? 4 : 3;
        int i5 = c18710.m42701(c10307) ? 16 : 8;
        int i6 = c18710.f55908 ? 64 : 0;
        int i7 = z ? 128 : 0;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(c10307.f28528) && !C4419.m9210(context)) {
            i7 = 256;
        }
        if (zM42700) {
            List listM43646 = m43645(context, interfaceC4629, c10307, z2, true);
            if (!listM43646.isEmpty()) {
                C18710 c18712 = (C18710) C23404.m52067(listM43646, c10307).get(0);
                if (c18712.m42700(c10307) && c18712.m42701(c10307)) {
                    i = 32;
                }
            }
        }
        return i4 | i5 | i | i6 | i7;
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo15334(InterfaceC4629 interfaceC4629, C10307 c10307, boolean z) {
        return C23404.m52067(m43645(this.f57281, interfaceC4629, c10307, z, this.f57320), c10307);
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m43645(Context context, InterfaceC4629 interfaceC4629, C10307 c10307, boolean z, boolean z2) {
        List listMo9751;
        String str = c10307.f28528;
        if (str == null) {
            return AbstractC16192.m36872of();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !C4419.m9210(context)) {
            String strM52066 = C23404.m52066(c10307);
            if (strM52066 == null) {
                listMo9751 = AbstractC16192.m36872of();
            } else {
                listMo9751 = interfaceC4629.mo9751(strM52066, z, z2);
            }
            if (!listMo9751.isEmpty()) {
                return listMo9751;
            }
        }
        return C23404.m52070(interfaceC4629, c10307, z, z2);
    }

    @Override // p067l.AbstractC17368, p067l.AbstractC7054
    /* JADX INFO: renamed from: ֫ */
    public final void mo15345(boolean z, boolean z2) {
        super.mo15345(z, z2);
        boolean z3 = m16264().f56352;
        C23877.m52960((z3 && this.f57290 == 0) ? false : true);
        if (this.f57320 != z3) {
            this.f57320 = z3;
            m39381();
        }
        this.f57305.m29138(this.f51820);
        boolean z4 = this.f57317;
        C7101 c7101 = this.f57307;
        if (!z4) {
            if (this.f57296 != null && this.f57285 == null) {
                C22525 c22525 = new C22525(this.f57281, c7101);
                c22525.m50485();
                c22525.m50484(m16259());
                C3748 c3748M50483 = c22525.m50483();
                c3748M50483.m7234();
                this.f57285 = c3748M50483.m7230();
            }
            this.f57317 = true;
        }
        InterfaceC8640 interfaceC8640 = this.f57285;
        if (interfaceC8640 == null) {
            c7101.m16347(m16259());
            c7101.m16345(!z2 ? 1 : 0);
            return;
        }
        interfaceC8640.mo10825(new C15558(this), C14200.m32670());
        InterfaceC23865 interfaceC23865 = this.f57316;
        if (interfaceC23865 != null) {
            this.f57285.mo10826(interfaceC23865);
        }
        if (this.f57312 != null && !this.f57288.equals(C18532.f55343)) {
            this.f57285.mo10821(this.f57312, this.f57288);
        }
        this.f57285.mo10818(this.f57319);
        this.f57285.mo10817(m39392());
        List list = this.f57296;
        if (list != null) {
            this.f57285.mo10822(list);
        }
        this.f57297 = !z2 ? 1 : 0;
        m39387();
    }

    @Override // p067l.AbstractC7054, p067l.InterfaceC4114
    /* JADX INFO: renamed from: ۜ */
    public final void mo8293() {
        InterfaceC8640 interfaceC8640 = this.f57285;
        if (interfaceC8640 != null) {
            int i = this.f57297;
            if (i == 0 || i == 1) {
                this.f57297 = 0;
                return;
            } else {
                interfaceC8640.mo10830();
                return;
            }
        }
        this.f57307.m16343();
    }

    @Override // p067l.AbstractC17368, p067l.AbstractC7054
    /* JADX INFO: renamed from: ֫ */
    public final void mo16256(C10307[] c10307Arr, long j, long j2, C17474 c17474) {
        super.mo16256(c10307Arr, j, j2, c17474);
        AbstractC6974 abstractC6974M16263 = m16263();
        if (!abstractC6974M16263.m15990()) {
            c17474.getClass();
            this.f57302 = abstractC6974M16263.mo15985(c17474.f52252, new C23738()).f75527;
        } else {
            this.f57302 = -9223372036854775807L;
        }
    }

    @Override // p067l.AbstractC17368, p067l.AbstractC7054
    /* JADX INFO: renamed from: ֫ */
    public final void mo15339(long j, boolean z) throws C19735 {
        InterfaceC8640 interfaceC8640 = this.f57285;
        if (interfaceC8640 != null && !z) {
            interfaceC8640.mo10833(true);
        }
        super.mo15339(j, z);
        InterfaceC8640 interfaceC8641 = this.f57285;
        C7101 c7101 = this.f57307;
        if (interfaceC8641 == null) {
            c7101.m16354();
        }
        if (z) {
            InterfaceC8640 interfaceC8642 = this.f57285;
            if (interfaceC8642 != null) {
                interfaceC8642.mo10837(false);
            } else {
                c7101.m16351(false);
            }
        }
        m43648();
        this.f57293 = 0;
    }

    @Override // p067l.AbstractC17368, p067l.AbstractC7054, p067l.InterfaceC4114
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8296() {
        if (!super.mo8296()) {
            return false;
        }
        InterfaceC8640 interfaceC8640 = this.f57285;
        return interfaceC8640 == null || interfaceC8640.mo10834();
    }

    @Override // p067l.AbstractC17368, p067l.InterfaceC4114
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo8299() {
        boolean zMo8299 = super.mo8299();
        InterfaceC8640 interfaceC8640 = this.f57285;
        if (interfaceC8640 != null) {
            return interfaceC8640.mo10829(zMo8299);
        }
        if (zMo8299 && (m39401() == null || this.f57320)) {
            return true;
        }
        return this.f57307.m16348(zMo8299);
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ܰ */
    public final void mo15354() {
        this.f57279 = 0;
        this.f57287 = m16259().mo35966();
        this.f57304 = 0L;
        this.f57294 = 0;
        InterfaceC8640 interfaceC8640 = this.f57285;
        if (interfaceC8640 != null) {
            interfaceC8640.mo10832();
        } else {
            this.f57307.m16353();
        }
    }

    @Override // p067l.AbstractC17368, p067l.AbstractC7054
    /* JADX INFO: renamed from: ۤ */
    public final void mo15352() {
        C12664 c12664 = this.f57305;
        this.f57298 = null;
        this.f57302 = -9223372036854775807L;
        m43648();
        this.f57313 = false;
        this.f57315 = null;
        this.f57286 = true;
        try {
            super.mo15352();
        } finally {
            c12664.m29134(this.f51820);
            c12664.m29135(C8454.f22684);
        }
    }

    @Override // p067l.AbstractC17368, p067l.AbstractC7054
    /* JADX INFO: renamed from: ᩺ */
    public final void mo15361() {
        try {
            super.mo15361();
        } finally {
            this.f57317 = false;
            this.f57309 = -9223372036854775807L;
            C25206 c25206 = this.f57291;
            if (c25206 != null) {
                c25206.release();
                this.f57291 = null;
            }
        }
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ۛ */
    public final void mo15349() {
        InterfaceC8640 interfaceC8640 = this.f57285;
        if (interfaceC8640 == null || !this.f57299) {
            return;
        }
        interfaceC8640.mo10816();
    }

    @Override // p067l.AbstractC17368, p067l.AbstractC7054, p067l.InterfaceC7864
    /* JADX INFO: renamed from: ֫ */
    public final void mo15338(int i, Object obj) throws C19735 {
        if (i == 1) {
            m43646(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            InterfaceC23865 interfaceC23865 = (InterfaceC23865) obj;
            this.f57316 = interfaceC23865;
            InterfaceC8640 interfaceC8640 = this.f57285;
            if (interfaceC8640 != null) {
                interfaceC8640.mo10826(interfaceC23865);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f57290 != iIntValue) {
                this.f57290 = iIntValue;
                if (this.f57320) {
                    m39381();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            this.f57308 = ((Integer) obj).intValue();
            InterfaceC12676 interfaceC12676M39401 = m39401();
            if (interfaceC12676M39401 != null) {
                interfaceC12676M39401.mo11461(this.f57308);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.f57319 = iIntValue2;
            InterfaceC8640 interfaceC8641 = this.f57285;
            if (interfaceC8641 != null) {
                interfaceC8641.mo10818(iIntValue2);
                return;
            } else {
                this.f57307.m16350(iIntValue2);
                return;
            }
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(InterfaceC18512.f55296)) {
                InterfaceC8640 interfaceC8642 = this.f57285;
                if (interfaceC8642 == null || !interfaceC8642.isInitialized()) {
                    return;
                }
                this.f57285.mo10839();
                return;
            }
            this.f57296 = list;
            InterfaceC8640 interfaceC8643 = this.f57285;
            if (interfaceC8643 != null) {
                interfaceC8643.mo10822(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            C18532 c18532 = (C18532) obj;
            if (c18532.m42135() == 0 || c18532.m42134() == 0) {
                return;
            }
            this.f57288 = c18532;
            InterfaceC8640 interfaceC8644 = this.f57285;
            if (interfaceC8644 != null) {
                Surface surface = this.f57312;
                C23877.m52958(surface);
                interfaceC8644.mo10821(surface, c18532);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.f57280 = ((Integer) obj).intValue();
                InterfaceC12676 interfaceC12676M39402 = m39401();
                if (interfaceC12676M39402 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.f57280));
                    interfaceC12676M39402.mo11465(bundle);
                }
                break;
            case 17:
                Surface surface2 = this.f57312;
                m43646((Object) null);
                obj.getClass();
                ((C19171) obj).mo15338(1, surface2);
                break;
            case 18:
                C22220 c22220 = this.f57310;
                boolean z = c22220 != null && c22220.f70276;
                C22220 c22221 = (C22220) obj;
                this.f57310 = c22221;
                if (z != (c22221 != null && c22221.f70276)) {
                    m39408();
                }
                break;
            default:
                super.mo15338(i, obj);
                break;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m43646(Object obj) throws C19735 {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.f57312;
        C12664 c12664 = this.f57305;
        if (surface2 == surface) {
            if (surface != null) {
                C8454 c8454 = this.f57298;
                if (c8454 != null) {
                    c12664.m29135(c8454);
                }
                Surface surface3 = this.f57312;
                if (surface3 == null || !this.f57313) {
                    return;
                }
                c12664.m29131(surface3);
                return;
            }
            return;
        }
        this.f57312 = surface;
        InterfaceC8640 interfaceC8640 = this.f57285;
        C7101 c7101 = this.f57307;
        if (interfaceC8640 == null) {
            c7101.m16346(surface);
        }
        this.f57313 = false;
        int state = getState();
        InterfaceC12676 interfaceC12676M39401 = m39401();
        if (interfaceC12676M39401 != null && this.f57285 == null) {
            C18710 c18710M39406 = m39406();
            c18710M39406.getClass();
            boolean zM43657 = m43657(c18710M39406);
            int i = Build.VERSION.SDK_INT;
            if (i >= 23 && zM43657 && !this.f57295) {
                Surface surfaceM43652 = m43652(c18710M39406);
                if (i >= 23 && surfaceM43652 != null) {
                    interfaceC12676M39401.mo11466(surfaceM43652);
                } else {
                    if (i < 35) {
                        throw new IllegalStateException();
                    }
                    interfaceC12676M39401.mo11471();
                }
            } else {
                m39381();
                m39407();
            }
        }
        if (surface == null) {
            this.f57298 = null;
            InterfaceC8640 interfaceC8641 = this.f57285;
            if (interfaceC8641 != null) {
                interfaceC8641.mo10831();
            }
        } else {
            C8454 c8455 = this.f57298;
            if (c8455 != null) {
                c12664.m29135(c8455);
            }
        }
        if (state == 2) {
            InterfaceC8640 interfaceC8642 = this.f57285;
            if (interfaceC8642 != null) {
                interfaceC8642.mo10837(true);
            } else {
                c7101.m16351(true);
            }
        }
        m43648();
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo39386(C18710 c18710) {
        return m43657(c18710);
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ܳ֫ */
    public final boolean mo39396() {
        return this.f57320 && Build.VERSION.SDK_INT < 23;
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ֫ */
    public final C24249 mo15337(C18710 c18710, C10307 c10307, MediaCrypto mediaCrypto, float f) {
        C22378 c22378;
        int i;
        C18500 c18500;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        boolean z;
        int iM43643;
        String str = c18710.f55907;
        C10307[] c10307ArrM16258 = m16258();
        int i2 = c10307.f28547;
        float f2 = c10307.f28510;
        C22378 c22379 = c10307.f28551;
        int i3 = c10307.f28523;
        int iM43649 = m43649(c18710, c10307);
        if (c10307ArrM16258.length == 1) {
            if (iM43649 != -1 && (iM43643 = m43643(c18710, c10307)) != -1) {
                iM43649 = Math.min((int) (iM43649 * 1.5f), iM43643);
            }
            c18500 = new C18500(i2, i3, iM43649);
            c22378 = c22379;
            i = i3;
        } else {
            int length = c10307ArrM16258.length;
            int i4 = 0;
            boolean z2 = false;
            int iMax = i2;
            int iMax2 = i3;
            while (i4 < length) {
                int i5 = length;
                C10307 c10307M6672 = c10307ArrM16258[i4];
                C10307[] c10307Arr = c10307ArrM16258;
                if (c22379 != null && c10307M6672.f28551 == null) {
                    C3601 c3601M23918 = c10307M6672.m23918();
                    c3601M23918.m6680(c22379);
                    c10307M6672 = c3601M23918.m6672();
                }
                C15100 c15100M42697 = c18710.m42697(c10307, c10307M6672);
                int i6 = c10307M6672.f28523;
                if (c15100M42697.f43118 != 0) {
                    int i7 = c10307M6672.f28547;
                    boolean z3 = i7 == -1 || i6 == -1;
                    iMax = Math.max(iMax, i7);
                    iMax2 = Math.max(iMax2, i6);
                    iM43649 = Math.max(iM43649, m43649(c18710, c10307M6672));
                    z2 = z3 | z2;
                }
                i4++;
                length = i5;
                c10307ArrM16258 = c10307Arr;
                c22379 = c22379;
            }
            c22378 = c22379;
            if (z2) {
                C21334.m48351("Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z4 = i3 > i2;
                int i8 = z4 ? i3 : i2;
                int i9 = z4 ? i2 : i3;
                float f3 = i9 / i8;
                int i10 = 0;
                while (true) {
                    if (i10 < 9) {
                        int i11 = f57276[i10];
                        i = i3;
                        int i12 = (int) (i11 * f3);
                        if (i11 > i8 && i12 > i9) {
                            if (z4) {
                                i11 = i12;
                            }
                            if (z4) {
                                i12 = i11;
                            }
                            boolean z5 = z4;
                            MediaCodecInfo.CodecCapabilities codecCapabilities = c18710.f55904;
                            if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                point = null;
                            } else {
                                int widthAlignment = videoCapabilities.getWidthAlignment();
                                int heightAlignment = videoCapabilities.getHeightAlignment();
                                point = new Point(C5792.m12975(i11, widthAlignment) * widthAlignment, C5792.m12975(i12, heightAlignment) * heightAlignment);
                            }
                            if (point != null && c18710.m42698(point.x, point.y, f2)) {
                                break;
                            }
                            i10++;
                            i3 = i;
                            z4 = z5;
                            i8 = i8;
                            i9 = i9;
                        }
                    } else {
                        i = i3;
                    }
                    point = null;
                    break;
                }
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    C3601 c3601M23919 = c10307.m23918();
                    c3601M23919.m6685(iMax);
                    c3601M23919.m6689(iMax2);
                    iM43649 = Math.max(iM43649, m43643(c18710, c3601M23919.m6672()));
                    C21334.m48351("Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            } else {
                i = i3;
            }
            c18500 = new C18500(iMax, iMax2, iM43649);
        }
        this.f57314 = c18500;
        int i13 = this.f57320 ? this.f57290 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i2);
        mediaFormat.setInteger("height", i);
        C14627.m33424(mediaFormat, c10307.f28548);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        C14627.m33423(mediaFormat, "rotation-degrees", c10307.f28513);
        C14627.m33425(mediaFormat, c22378);
        if ("video/dolby-vision".equals(c10307.f28528)) {
            int i14 = C23404.f74551;
            Pair pairM44014 = C19322.m44014(c10307);
            if (pairM44014 != null) {
                C14627.m33423(mediaFormat, "profile", ((Integer) pairM44014.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", c18500.f55264);
        mediaFormat.setInteger("max-height", c18500.f55262);
        C14627.m33423(mediaFormat, "max-input-size", c18500.f55263);
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 23) {
            mediaFormat.setInteger(MessageHandler.Properties.Priority, 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.f57311) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i13 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i13);
        }
        if (i15 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f57280));
        }
        Surface surfaceM43652 = m43652(c18710);
        if (this.f57285 != null && !C5792.m13019(this.f57281)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return C24249.m53555(c18710, mediaFormat, c10307, surfaceM43652, mediaCrypto);
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ֫ */
    public final C15100 mo15336(C18710 c18710, C10307 c10307, C10307 c10308) {
        C15100 c15100M42697 = c18710.m42697(c10307, c10308);
        int i = c15100M42697.f43116;
        C18500 c18500 = this.f57314;
        c18500.getClass();
        if (c10308.f28547 > c18500.f55264 || c10308.f28523 > c18500.f55262) {
            i |= 256;
        }
        if (m43649(c18710, c10308) > c18500.f55263) {
            i |= 64;
        }
        int i2 = i;
        return new C15100(c18710.f55902, c10307, c10308, i2 != 0 ? 0 : c15100M42697.f43118, i2);
    }

    @Override // p067l.AbstractC17368, p067l.InterfaceC4114
    /* JADX INFO: renamed from: ֫ */
    public final void mo8286(long j, long j2) throws C19735 {
        InterfaceC8640 interfaceC8640 = this.f57285;
        if (interfaceC8640 != null) {
            try {
                interfaceC8640.mo10820(j, j2);
            } catch (C24733 e) {
                throw m16253(e, e.f78300, 7001);
            }
        }
        super.mo8286(j, j2);
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ֨֫ */
    public final void mo39382() {
        super.mo39382();
        this.f57278.clear();
        this.f57303 = 0;
        this.f57306 = 0;
        this.f57286 = false;
    }

    @Override // p067l.AbstractC17368, p067l.AbstractC7054, p067l.InterfaceC4114
    /* JADX INFO: renamed from: ֫ */
    public final void mo8283(float f, float f2) throws C19735 {
        super.mo8283(f, f2);
        InterfaceC8640 interfaceC8640 = this.f57285;
        if (interfaceC8640 != null) {
            interfaceC8640.mo10817(f);
        } else {
            this.f57307.m16349(f);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX INFO: renamed from: ֫ */
    public static int m43643(C18710 c18710, C10307 c10307) {
        int i = c10307.f28547;
        int i2 = c10307.f28523;
        if (i != -1 && i2 != -1) {
            String str = c10307.f28528;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                int i3 = C23404.f74551;
                Pair pairM44014 = C19322.m44014(c10307);
                if (pairM44014 == null) {
                    str = "video/hevc";
                } else {
                    int iIntValue = ((Integer) pairM44014.first).intValue();
                    if (iIntValue == 512 || iIntValue == 1 || iIntValue == 2) {
                        str = "video/avc";
                    } else if (iIntValue == 1024) {
                        str = "video/av01";
                    } else {
                        str = "video/hevc";
                    }
                }
            }
            switch (str) {
                case "video/3gpp":
                case "video/av01":
                case "video/mp4v-es":
                case "video/x-vnd.on2.vp8":
                    return ((i * i2) * 3) / 4;
                case "video/hevc":
                    return Math.max(2097152, ((i * i2) * 3) / 4);
                case "video/avc":
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !c18710.f55906)))) {
                        return ((C5792.m12975(i2, 16) * C5792.m12975(i, 16)) * 768) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    return ((i * i2) * 3) / 8;
            }
        }
        return -1;
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ֫ */
    public final float mo15332(float f, C10307 c10307, C10307[] c10307Arr) {
        C18710 c18710M39406;
        float fMax = -1.0f;
        for (C10307 c10308 : c10307Arr) {
            float f2 = c10308.f28510;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        float f3 = fMax == -1.0f ? -1.0f : f * fMax;
        if (this.f57310 == null || (c18710M39406 = m39406()) == null) {
            return f3;
        }
        float fM42696 = c18710M39406.m42696(c10307.f28547, c10307.f28523);
        return f3 != -1.0f ? Math.max(f3, fM42696) : fM42696;
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo39400(C10307 c10307) throws C19735 {
        InterfaceC8640 interfaceC8640 = this.f57285;
        if (interfaceC8640 == null || interfaceC8640.isInitialized()) {
            return true;
        }
        try {
            return this.f57285.mo10828(c10307);
        } catch (C24733 e) {
            throw m16253(e, c10307, 7000);
        }
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ֫ */
    public final void mo15342(String str, long j, long j2) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        this.f57305.m29133(str, j, j2);
        this.f57295 = m43651(str);
        C18710 c18710M39406 = m39406();
        c18710M39406.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(c18710M39406.f55903)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = c18710M39406.f55904;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z = true;
                    break;
                }
            }
        }
        this.f57289 = z;
        m43648();
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ֫ */
    public final void mo15341(String str) {
        this.f57305.m29132(str);
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ֫ */
    public final void mo15340(Exception exc) {
        C21334.m48348("Video codec error", exc);
        this.f57305.m29130(exc);
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ᩹֫ */
    public final boolean mo39411() {
        C18710 c18710M39406 = m39406();
        if (this.f57285 != null && c18710M39406 != null) {
            String str = c18710M39406.f55902;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.mo39411();
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ᩸֫ */
    public final boolean mo39410() {
        C10307 c10307M39403 = m39403();
        C22220 c22220 = this.f57310;
        if (c22220 == null || !c22220.f70272 || this.f57286 || this.f57320) {
            return true;
        }
        return (c10307M39403 != null && c10307M39403.f28531 > 0) || m39388() || m39390() != -9223372036854775807L;
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ֫ */
    public final C15100 mo15335(C5221 c5221) throws C19735 {
        C15100 c15100Mo15335 = super.mo15335(c5221);
        C10307 c10307 = c5221.f12253;
        c10307.getClass();
        this.f57305.m29136(c10307, c15100Mo15335);
        return c15100Mo15335;
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ܽ */
    public final void mo39399(C23128 c23128) {
        this.f57306 = 0;
        int iMo39383 = mo39383(c23128);
        int i = Build.VERSION.SDK_INT;
        if ((i < 34 || (iMo39383 & 32) == 0) && !this.f57320) {
            this.f57303++;
        }
        if (i >= 23 || !this.f57320) {
            return;
        }
        m43663(c23128.f72706);
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ֫ */
    public final int mo39383(C23128 c23128) {
        C22220 c22220;
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.f57292 || (((c22220 = this.f57310) != null && c22220.f70275) || this.f57320)) && c23128.f72706 < m16268() && !m43655(c23128)) ? 32 : 0;
        }
        return 0;
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo39405(C23128 c23128) {
        boolean z = false;
        if (!m43655(c23128)) {
            boolean z2 = c23128.f72706 < m16268();
            if (z2 && !c23128.m14570()) {
                if (c23128.m14568()) {
                    c23128.mo7();
                    z = true;
                }
                if (z) {
                    if (z2) {
                        this.f51820.f13987++;
                        return z;
                    }
                    this.f57278.add(Long.valueOf(c23128.f72706));
                    this.f57306++;
                }
                return z;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܿ */
    private boolean m43655(C23128 c23128) {
        if (mo8302() || c23128.m14565() || this.f57302 == -9223372036854775807L) {
            return true;
        }
        return this.f57302 - (c23128.f72706 - m39409()) <= 100000;
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ֫ */
    public final void mo15344(C10307 c10307, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        int i;
        int i2;
        InterfaceC12676 interfaceC12676M39401 = m39401();
        if (interfaceC12676M39401 != null) {
            interfaceC12676M39401.mo11461(this.f57308);
        }
        if (!this.f57320) {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            if (z) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            int i3 = integer;
            i = integer2;
            i2 = i3;
        } else {
            i2 = c10307.f28547;
            i = c10307.f28523;
        }
        float f = c10307.f28550;
        int i4 = c10307.f28513;
        if (i4 == 90 || i4 == 270) {
            f = 1.0f / f;
            int i5 = i;
            i = i2;
            i2 = i5;
        }
        this.f57284 = new C8454(i2, i, f);
        InterfaceC8640 interfaceC8640 = this.f57285;
        if (interfaceC8640 != null && this.f57318) {
            C3601 c3601M23918 = c10307.m23918();
            c3601M23918.m6685(i2);
            c3601M23918.m6689(i);
            c3601M23918.m6692(f);
            C10307 c10307M6672 = c3601M23918.m6672();
            int i6 = this.f57297;
            List listM36872of = this.f57296;
            if (listM36872of == null) {
                listM36872of = AbstractC16192.m36872of();
            }
            interfaceC8640.mo10824(c10307M6672, m39393(), i6, listM36872of);
            this.f57297 = 2;
        } else {
            this.f57307.m16344(c10307.f28510);
        }
        this.f57318 = false;
    }

    @Override // p067l.AbstractC17368
    @TargetApi(29)
    /* JADX INFO: renamed from: ۧ */
    public final void mo15353(C23128 c23128) {
        if (this.f57289) {
            ByteBuffer byteBuffer = c23128.f72707;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        InterfaceC12676 interfaceC12676M39401 = m39401();
                        interfaceC12676M39401.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        interfaceC12676M39401.mo11465(bundle);
                    }
                }
            }
        }
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ۚ֫ */
    public final void mo15348() {
        InterfaceC8640 interfaceC8640 = this.f57285;
        if (interfaceC8640 != null) {
            interfaceC8640.mo10841();
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m43663(long j) {
        Surface surface;
        m39402(j);
        C8454 c8454 = this.f57284;
        boolean zEquals = c8454.equals(C8454.f22684);
        C12664 c12664 = this.f57305;
        if (!zEquals && !c8454.equals(this.f57298)) {
            this.f57298 = c8454;
            c12664.m29135(c8454);
        }
        this.f51820.f13978++;
        if (this.f57307.m16352() && (surface = this.f57312) != null) {
            c12664.m29131(surface);
            this.f57313 = true;
        }
        mo39404(j);
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m43653(C19171 c19171) {
        c19171.m39397();
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ᩳ */
    public final void mo39404(long j) {
        super.mo39404(j);
        if (this.f57320) {
            return;
        }
        this.f57303--;
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ᩵֫ */
    public final void mo15360() {
        InterfaceC8640 interfaceC8640 = this.f57285;
        if (interfaceC8640 != null) {
            interfaceC8640.mo10841();
            if (this.f57309 == -9223372036854775807L) {
                this.f57309 = m39393();
            }
            this.f57285.mo10819(-this.f57309);
        } else {
            this.f57307.m16345(2);
        }
        this.f57318 = true;
        m43648();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43658(int i, int i2) {
        int i3;
        C5713 c5713 = this.f51820;
        c5713.f13986 += i;
        int i4 = i + i2;
        c5713.f13984 += i4;
        this.f57279 += i4;
        int i5 = this.f57293 + i4;
        this.f57293 = i5;
        c5713.f13982 = Math.max(i5, c5713.f13982);
        int i6 = this.f57301;
        if (i6 <= 0 || (i3 = this.f57279) < i6 || i3 <= 0) {
            return;
        }
        long jMo35966 = m16259().mo35966();
        this.f57305.m29129(this.f57279, jMo35966 - this.f57287);
        this.f57279 = 0;
        this.f57287 = jMo35966;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m43664(long j) {
        C5713 c5713 = this.f51820;
        c5713.f13979 += j;
        c5713.f13983++;
        this.f57304 += j;
        this.f57294++;
    }

    /* JADX INFO: renamed from: ᩳ */
    private boolean m43657(C18710 c18710) {
        if (this.f57285 != null) {
            return true;
        }
        Surface surface = this.f57312;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && c18710.f55909) || m43662(c18710);
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    private Surface m43652(C18710 c18710) {
        boolean z = c18710.f55906;
        InterfaceC8640 interfaceC8640 = this.f57285;
        if (interfaceC8640 != null) {
            return interfaceC8640.mo10838();
        }
        Surface surface = this.f57312;
        if (surface != null) {
            return surface;
        }
        if (Build.VERSION.SDK_INT >= 35 && c18710.f55909) {
            return null;
        }
        C23877.m52960(m43662(c18710));
        C25206 c25206 = this.f57291;
        if (c25206 != null && c25206.f80608 != z && c25206 != null) {
            c25206.release();
            this.f57291 = null;
        }
        if (this.f57291 == null) {
            this.f57291 = C25206.m55277(this.f57281, z);
        }
        return this.f57291;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m43662(C18710 c18710) {
        if (Build.VERSION.SDK_INT < 23 || this.f57320 || m43651(c18710.f55902)) {
            return false;
        }
        return !c18710.f55906 || C25206.m55278(this.f57281);
    }

    /* JADX INFO: renamed from: ۙ֫ */
    private void m43648() {
        int i;
        InterfaceC12676 interfaceC12676M39401;
        if (!this.f57320 || (i = Build.VERSION.SDK_INT) < 23 || (interfaceC12676M39401 = m39401()) == null) {
            return;
        }
        this.f57315 = new C19842(this, interfaceC12676M39401);
        if (i >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            interfaceC12676M39401.mo11465(bundle);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m43650(C19171 c19171) {
        c19171.f57305.m29131(c19171.f57312);
        c19171.f57313 = true;
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ۟ */
    public final void mo15350() {
        int i = this.f57279;
        C12664 c12664 = this.f57305;
        if (i > 0) {
            long jMo35966 = m16259().mo35966();
            c12664.m29129(this.f57279, jMo35966 - this.f57287);
            this.f57279 = 0;
            this.f57287 = jMo35966;
        }
        int i2 = this.f57294;
        if (i2 != 0) {
            c12664.m29137(i2, this.f57304);
            this.f57304 = 0L;
            this.f57294 = 0;
        }
        InterfaceC8640 interfaceC8640 = this.f57285;
        if (interfaceC8640 != null) {
            interfaceC8640.mo10840();
        } else {
            this.f57307.m16355();
        }
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ֫ */
    public final C19381 mo39384(IllegalStateException illegalStateException, C18710 c18710) {
        Surface surface = this.f57312;
        C24276 c24276 = new C24276(illegalStateException, c18710);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return c24276;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m43649(C18710 c18710, C10307 c10307) {
        int i = c10307.f28515;
        List list = c10307.f28548;
        if (i != -1) {
            int size = list.size();
            int length = 0;
            for (int i2 = 0; i2 < size; i2++) {
                length += ((byte[]) list.get(i2)).length;
            }
            return c10307.f28515 + length;
        }
        return m43643(c18710, c10307);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:0x011d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0127  */
    /* JADX WARN: Code duplicated, block: B:106:0x012b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0135  */
    /* JADX WARN: Code duplicated, block: B:110:0x0139  */
    /* JADX WARN: Code duplicated, block: B:113:0x0143  */
    /* JADX WARN: Code duplicated, block: B:114:0x0147  */
    /* JADX WARN: Code duplicated, block: B:117:0x0151  */
    /* JADX WARN: Code duplicated, block: B:118:0x0155  */
    /* JADX WARN: Code duplicated, block: B:121:0x015f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0163  */
    /* JADX WARN: Code duplicated, block: B:125:0x016d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0171  */
    /* JADX WARN: Code duplicated, block: B:129:0x017b  */
    /* JADX WARN: Code duplicated, block: B:130:0x017f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0189  */
    /* JADX WARN: Code duplicated, block: B:134:0x018d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0197  */
    /* JADX WARN: Code duplicated, block: B:138:0x019b  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:153:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:157:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:161:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:162:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:166:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:169:0x0207  */
    /* JADX WARN: Code duplicated, block: B:170:0x020b  */
    /* JADX WARN: Code duplicated, block: B:173:0x0215  */
    /* JADX WARN: Code duplicated, block: B:174:0x0219  */
    /* JADX WARN: Code duplicated, block: B:177:0x0223  */
    /* JADX WARN: Code duplicated, block: B:178:0x0227  */
    /* JADX WARN: Code duplicated, block: B:181:0x0231  */
    /* JADX WARN: Code duplicated, block: B:182:0x0235  */
    /* JADX WARN: Code duplicated, block: B:185:0x023f  */
    /* JADX WARN: Code duplicated, block: B:186:0x0243  */
    /* JADX WARN: Code duplicated, block: B:189:0x024d  */
    /* JADX WARN: Code duplicated, block: B:190:0x0251  */
    /* JADX WARN: Code duplicated, block: B:193:0x025b  */
    /* JADX WARN: Code duplicated, block: B:194:0x025f  */
    /* JADX WARN: Code duplicated, block: B:197:0x0269  */
    /* JADX WARN: Code duplicated, block: B:198:0x026d  */
    /* JADX WARN: Code duplicated, block: B:201:0x0277  */
    /* JADX WARN: Code duplicated, block: B:202:0x027b  */
    /* JADX WARN: Code duplicated, block: B:205:0x0285  */
    /* JADX WARN: Code duplicated, block: B:206:0x0289  */
    /* JADX WARN: Code duplicated, block: B:209:0x0293  */
    /* JADX WARN: Code duplicated, block: B:210:0x0297  */
    /* JADX WARN: Code duplicated, block: B:213:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:214:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:217:0x02af  */
    /* JADX WARN: Code duplicated, block: B:218:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:221:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:222:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:225:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:226:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:229:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:230:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:233:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:234:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:237:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:238:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:241:0x0303  */
    /* JADX WARN: Code duplicated, block: B:242:0x0307  */
    /* JADX WARN: Code duplicated, block: B:245:0x0311  */
    /* JADX WARN: Code duplicated, block: B:246:0x0315  */
    /* JADX WARN: Code duplicated, block: B:249:0x031f  */
    /* JADX WARN: Code duplicated, block: B:250:0x0323  */
    /* JADX WARN: Code duplicated, block: B:253:0x032d  */
    /* JADX WARN: Code duplicated, block: B:254:0x0331  */
    /* JADX WARN: Code duplicated, block: B:257:0x033b  */
    /* JADX WARN: Code duplicated, block: B:258:0x033f  */
    /* JADX WARN: Code duplicated, block: B:261:0x0349  */
    /* JADX WARN: Code duplicated, block: B:262:0x034d  */
    /* JADX WARN: Code duplicated, block: B:265:0x0357  */
    /* JADX WARN: Code duplicated, block: B:266:0x035b  */
    /* JADX WARN: Code duplicated, block: B:269:0x0365  */
    /* JADX WARN: Code duplicated, block: B:270:0x0369  */
    /* JADX WARN: Code duplicated, block: B:273:0x0373  */
    /* JADX WARN: Code duplicated, block: B:274:0x0377  */
    /* JADX WARN: Code duplicated, block: B:277:0x0381  */
    /* JADX WARN: Code duplicated, block: B:278:0x0385  */
    /* JADX WARN: Code duplicated, block: B:281:0x038f  */
    /* JADX WARN: Code duplicated, block: B:282:0x0393  */
    /* JADX WARN: Code duplicated, block: B:285:0x039d  */
    /* JADX WARN: Code duplicated, block: B:286:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:289:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:290:0x03af  */
    /* JADX WARN: Code duplicated, block: B:293:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:294:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:297:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:298:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:301:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:302:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:305:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:306:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:309:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:310:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:313:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:314:0x0403  */
    /* JADX WARN: Code duplicated, block: B:317:0x040d  */
    /* JADX WARN: Code duplicated, block: B:318:0x0411  */
    /* JADX WARN: Code duplicated, block: B:321:0x041b  */
    /* JADX WARN: Code duplicated, block: B:322:0x041f  */
    /* JADX WARN: Code duplicated, block: B:325:0x0429  */
    /* JADX WARN: Code duplicated, block: B:326:0x042d  */
    /* JADX WARN: Code duplicated, block: B:329:0x0437  */
    /* JADX WARN: Code duplicated, block: B:330:0x043b  */
    /* JADX WARN: Code duplicated, block: B:333:0x0445  */
    /* JADX WARN: Code duplicated, block: B:334:0x0449  */
    /* JADX WARN: Code duplicated, block: B:337:0x0453  */
    /* JADX WARN: Code duplicated, block: B:338:0x0457  */
    /* JADX WARN: Code duplicated, block: B:341:0x0461  */
    /* JADX WARN: Code duplicated, block: B:342:0x0465  */
    /* JADX WARN: Code duplicated, block: B:345:0x046f  */
    /* JADX WARN: Code duplicated, block: B:346:0x0473  */
    /* JADX WARN: Code duplicated, block: B:349:0x047d  */
    /* JADX WARN: Code duplicated, block: B:350:0x0481  */
    /* JADX WARN: Code duplicated, block: B:353:0x048b  */
    /* JADX WARN: Code duplicated, block: B:354:0x048f  */
    /* JADX WARN: Code duplicated, block: B:357:0x0499  */
    /* JADX WARN: Code duplicated, block: B:358:0x049d  */
    /* JADX WARN: Code duplicated, block: B:361:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:362:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:365:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:366:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:369:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:370:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:373:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:374:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:377:0x04df  */
    /* JADX WARN: Code duplicated, block: B:378:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:381:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:382:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:385:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:386:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:389:0x0509  */
    /* JADX WARN: Code duplicated, block: B:390:0x050d  */
    /* JADX WARN: Code duplicated, block: B:393:0x0517  */
    /* JADX WARN: Code duplicated, block: B:394:0x051b  */
    /* JADX WARN: Code duplicated, block: B:397:0x0525  */
    /* JADX WARN: Code duplicated, block: B:398:0x0529  */
    /* JADX WARN: Code duplicated, block: B:401:0x0533  */
    /* JADX WARN: Code duplicated, block: B:402:0x0537  */
    /* JADX WARN: Code duplicated, block: B:405:0x0541  */
    /* JADX WARN: Code duplicated, block: B:406:0x0545  */
    /* JADX WARN: Code duplicated, block: B:409:0x054f  */
    /* JADX WARN: Code duplicated, block: B:410:0x0553  */
    /* JADX WARN: Code duplicated, block: B:413:0x055d  */
    /* JADX WARN: Code duplicated, block: B:414:0x0561  */
    /* JADX WARN: Code duplicated, block: B:417:0x056b  */
    /* JADX WARN: Code duplicated, block: B:418:0x056f  */
    /* JADX WARN: Code duplicated, block: B:421:0x0579  */
    /* JADX WARN: Code duplicated, block: B:422:0x057d  */
    /* JADX WARN: Code duplicated, block: B:425:0x0587  */
    /* JADX WARN: Code duplicated, block: B:426:0x058b  */
    /* JADX WARN: Code duplicated, block: B:429:0x0595  */
    /* JADX WARN: Code duplicated, block: B:430:0x0599  */
    /* JADX WARN: Code duplicated, block: B:433:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:434:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:437:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:438:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:441:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:442:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:445:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:446:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:449:0x05db  */
    /* JADX WARN: Code duplicated, block: B:450:0x05df  */
    /* JADX WARN: Code duplicated, block: B:453:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:454:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:457:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:458:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:461:0x0605  */
    /* JADX WARN: Code duplicated, block: B:462:0x0609  */
    /* JADX WARN: Code duplicated, block: B:465:0x0613  */
    /* JADX WARN: Code duplicated, block: B:466:0x0617  */
    /* JADX WARN: Code duplicated, block: B:469:0x0621  */
    /* JADX WARN: Code duplicated, block: B:470:0x0625  */
    /* JADX WARN: Code duplicated, block: B:473:0x062f  */
    /* JADX WARN: Code duplicated, block: B:474:0x0633  */
    /* JADX WARN: Code duplicated, block: B:477:0x063d  */
    /* JADX WARN: Code duplicated, block: B:478:0x0641  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:481:0x064b  */
    /* JADX WARN: Code duplicated, block: B:482:0x064f  */
    /* JADX WARN: Code duplicated, block: B:485:0x0659  */
    /* JADX WARN: Code duplicated, block: B:486:0x065d  */
    /* JADX WARN: Code duplicated, block: B:489:0x0667  */
    /* JADX WARN: Code duplicated, block: B:490:0x066b  */
    /* JADX WARN: Code duplicated, block: B:493:0x0675  */
    /* JADX WARN: Code duplicated, block: B:494:0x0679  */
    /* JADX WARN: Code duplicated, block: B:497:0x0683  */
    /* JADX WARN: Code duplicated, block: B:498:0x0687  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:501:0x0691  */
    /* JADX WARN: Code duplicated, block: B:502:0x0695  */
    /* JADX WARN: Code duplicated, block: B:505:0x069f  */
    /* JADX WARN: Code duplicated, block: B:506:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:509:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:510:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:513:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:514:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:517:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:518:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:521:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:522:0x06db  */
    /* JADX WARN: Code duplicated, block: B:525:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:526:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:529:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:530:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:533:0x0701  */
    /* JADX WARN: Code duplicated, block: B:534:0x0705  */
    /* JADX WARN: Code duplicated, block: B:537:0x070f  */
    /* JADX WARN: Code duplicated, block: B:538:0x0713  */
    /* JADX WARN: Code duplicated, block: B:541:0x071d  */
    /* JADX WARN: Code duplicated, block: B:542:0x0721  */
    /* JADX WARN: Code duplicated, block: B:545:0x072b  */
    /* JADX WARN: Code duplicated, block: B:546:0x072f  */
    /* JADX WARN: Code duplicated, block: B:549:0x0739  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093 A[Catch: all -> 0x08bf, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000e, B:9:0x0012, B:11:0x0019, B:667:0x08b7, B:51:0x0087, B:54:0x0093, B:98:0x010f, B:668:0x08bb), top: B:674:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:552:0x0743  */
    /* JADX WARN: Code duplicated, block: B:553:0x0747  */
    /* JADX WARN: Code duplicated, block: B:556:0x0751  */
    /* JADX WARN: Code duplicated, block: B:557:0x0755  */
    /* JADX WARN: Code duplicated, block: B:560:0x075f  */
    /* JADX WARN: Code duplicated, block: B:561:0x0763  */
    /* JADX WARN: Code duplicated, block: B:564:0x076d  */
    /* JADX WARN: Code duplicated, block: B:565:0x0771  */
    /* JADX WARN: Code duplicated, block: B:568:0x077b  */
    /* JADX WARN: Code duplicated, block: B:569:0x077f  */
    /* JADX WARN: Code duplicated, block: B:572:0x0789  */
    /* JADX WARN: Code duplicated, block: B:573:0x078d  */
    /* JADX WARN: Code duplicated, block: B:576:0x0797  */
    /* JADX WARN: Code duplicated, block: B:577:0x079b  */
    /* JADX WARN: Code duplicated, block: B:580:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:581:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:584:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:585:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:588:0x07c1  */
    /* JADX WARN: Code duplicated, block: B:589:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:592:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:593:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:596:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:597:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:600:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:601:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:604:0x07f9  */
    /* JADX WARN: Code duplicated, block: B:605:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:608:0x0807  */
    /* JADX WARN: Code duplicated, block: B:609:0x080b  */
    /* JADX WARN: Code duplicated, block: B:612:0x0815  */
    /* JADX WARN: Code duplicated, block: B:613:0x0819  */
    /* JADX WARN: Code duplicated, block: B:616:0x0823  */
    /* JADX WARN: Code duplicated, block: B:617:0x0827  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:620:0x0831  */
    /* JADX WARN: Code duplicated, block: B:621:0x0835  */
    /* JADX WARN: Code duplicated, block: B:624:0x083f  */
    /* JADX WARN: Code duplicated, block: B:625:0x0843  */
    /* JADX WARN: Code duplicated, block: B:628:0x084d  */
    /* JADX WARN: Code duplicated, block: B:629:0x0851  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:632:0x085a  */
    /* JADX WARN: Code duplicated, block: B:633:0x085c  */
    /* JADX WARN: Code duplicated, block: B:636:0x0865  */
    /* JADX WARN: Code duplicated, block: B:637:0x0867  */
    /* JADX WARN: Code duplicated, block: B:640:0x0870  */
    /* JADX WARN: Code duplicated, block: B:641:0x0872  */
    /* JADX WARN: Code duplicated, block: B:644:0x087b  */
    /* JADX WARN: Code duplicated, block: B:645:0x087d  */
    /* JADX WARN: Code duplicated, block: B:648:0x0886  */
    /* JADX WARN: Code duplicated, block: B:649:0x0888  */
    /* JADX WARN: Code duplicated, block: B:652:0x0891  */
    /* JADX WARN: Code duplicated, block: B:653:0x0893  */
    /* JADX WARN: Code duplicated, block: B:656:0x089c  */
    /* JADX WARN: Code duplicated, block: B:657:0x089e  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:660:0x08a7  */
    /* JADX WARN: Code duplicated, block: B:661:0x08a9  */
    /* JADX WARN: Code duplicated, block: B:663:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:666:0x08b6 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x0105  */
    /* JADX WARN: Code duplicated, block: B:94:0x0107  */
    /* JADX WARN: Code duplicated, block: B:96:0x010b  */
    /* JADX WARN: Code duplicated, block: B:98:0x010f A[Catch: all -> 0x08bf, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000e, B:9:0x0012, B:11:0x0019, B:667:0x08b7, B:51:0x0087, B:54:0x0093, B:98:0x010f, B:668:0x08bb), top: B:674:0x000e }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۧ */
    public static boolean m43651(String str) {
        String str2;
        byte b;
        String str3;
        byte b2;
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C19171.class) {
            if (!f57275) {
                int i = Build.VERSION.SDK_INT;
                byte b3 = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                if (i <= 28) {
                    String str4 = Build.DEVICE;
                    str4.getClass();
                    switch (str4.hashCode()) {
                        case -1339091551:
                            if (!str4.equals("dangal")) {
                                b2 = -1;
                            } else {
                                b2 = 0;
                            }
                            break;
                        case -1220081023:
                            if (!str4.equals("dangalFHD")) {
                                b2 = -1;
                            } else {
                                b2 = 1;
                            }
                            break;
                        case -1220066608:
                            if (!str4.equals("dangalUHD")) {
                                b2 = -1;
                            } else {
                                b2 = 2;
                            }
                            break;
                        case -1012436106:
                            if (!str4.equals("oneday")) {
                                b2 = -1;
                            } else {
                                b2 = 3;
                            }
                            break;
                        case -760312546:
                            if (!str4.equals("aquaman")) {
                                b2 = -1;
                            } else {
                                b2 = 4;
                            }
                            break;
                        case -64886864:
                            if (!str4.equals("magnolia")) {
                                b2 = -1;
                            } else {
                                b2 = 5;
                            }
                            break;
                        case 3415681:
                            if (!str4.equals("once")) {
                                b2 = -1;
                            } else {
                                b2 = 6;
                            }
                            break;
                        case 825323514:
                            if (!str4.equals("machuca")) {
                                b2 = -1;
                            } else {
                                b2 = 7;
                            }
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        default:
                            if (i <= 27 || !"HWEML".equals(Build.DEVICE)) {
                                str2 = Build.MODEL;
                                str2.getClass();
                                switch (str2.hashCode()) {
                                    case -349662828:
                                        if (!str2.equals("AFTJMST12")) {
                                            b = 0;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case -321033677:
                                        if (!str2.equals("AFTKMST12")) {
                                            b = 1;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 2006354:
                                        if (!str2.equals("AFTA")) {
                                            b = 2;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 2006367:
                                        if (!str2.equals("AFTN")) {
                                            b = 3;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 2006371:
                                        if (!str2.equals("AFTR")) {
                                            b = 4;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 1785421873:
                                        if (!str2.equals("AFTEU011")) {
                                            b = 5;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 1785421876:
                                        if (!str2.equals("AFTEU014")) {
                                            b = 6;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 1798172390:
                                        if (!str2.equals("AFTSO001")) {
                                            b = 7;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 2119412532:
                                        if (!str2.equals("AFTEUFF014")) {
                                            b = 8;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    default:
                                        b = -1;
                                        break;
                                }
                                switch (b) {
                                    default:
                                        if (i <= 26) {
                                            str3 = Build.DEVICE;
                                            str3.getClass();
                                            switch (str3.hashCode()) {
                                                case -2144781245:
                                                    if (!str3.equals("GIONEE_SWW1609")) {
                                                        b3 = 0;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -2144781185:
                                                    if (!str3.equals("GIONEE_SWW1627")) {
                                                        b3 = 1;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -2144781160:
                                                    if (!str3.equals("GIONEE_SWW1631")) {
                                                        b3 = 2;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -2097309513:
                                                    if (!str3.equals("K50a40")) {
                                                        b3 = 3;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -2022874474:
                                                    if (!str3.equals("CP8676_I02")) {
                                                        b3 = 4;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1978993182:
                                                    if (!str3.equals("NX541J")) {
                                                        b3 = 5;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1978990237:
                                                    if (!str3.equals("NX573J")) {
                                                        b3 = 6;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1936688988:
                                                    if (!str3.equals("PGN528")) {
                                                        b3 = 7;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1936688066:
                                                    if (!str3.equals("PGN610")) {
                                                        b3 = 8;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1936688065:
                                                    if (!str3.equals("PGN611")) {
                                                        b3 = 9;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1931988508:
                                                    if (!str3.equals("AquaPowerM")) {
                                                        b3 = 10;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1885099851:
                                                    if (!str3.equals("RAIJIN")) {
                                                        b3 = 11;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1696512866:
                                                    if (!str3.equals("XT1663")) {
                                                        b3 = 12;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1680025915:
                                                    if (!str3.equals("ComioS1")) {
                                                        b3 = C0698cb.f2569k;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1615810839:
                                                    if (!str3.equals("Phantom6")) {
                                                        b3 = C0698cb.f2570l;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1600724499:
                                                    if (!str3.equals("pacificrim")) {
                                                        b3 = 15;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1554255044:
                                                    if (!str3.equals("vernee_M5")) {
                                                        b3 = 16;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1481772737:
                                                    if (!str3.equals("panell_dl")) {
                                                        b3 = 17;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1481772730:
                                                    if (!str3.equals("panell_ds")) {
                                                        b3 = 18;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1481772729:
                                                    if (!str3.equals("panell_dt")) {
                                                        b3 = 19;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1320080169:
                                                    if (!str3.equals("GiONEE_GBL7319")) {
                                                        b3 = 20;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1217592143:
                                                    if (!str3.equals("BRAVIA_ATV2")) {
                                                        b3 = 21;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1180384755:
                                                    if (!str3.equals("iris60")) {
                                                        b3 = 22;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1139198265:
                                                    if (!str3.equals("Slate_Pro")) {
                                                        b3 = 23;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1052835013:
                                                    if (!str3.equals("namath")) {
                                                        b3 = 24;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -993250464:
                                                    if (!str3.equals("A10-70F")) {
                                                        b3 = 25;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -993250458:
                                                    if (!str3.equals("A10-70L")) {
                                                        b3 = 26;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -965403638:
                                                    if (!str3.equals("s905x018")) {
                                                        b3 = 27;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -958336948:
                                                    if (!str3.equals("ELUGA_Ray_X")) {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -879245230:
                                                    if (!str3.equals("tcl_eu")) {
                                                        b3 = 29;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -842500323:
                                                    if (!str3.equals("nicklaus_f")) {
                                                        b3 = 30;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -821392978:
                                                    if (!str3.equals("A7000-a")) {
                                                        b3 = C0684bo.f2505j;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -797483286:
                                                    if (!str3.equals("SVP-DTV15")) {
                                                        b3 = UTF8.S_CS3;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -794946968:
                                                    if (!str3.equals("watson")) {
                                                        b3 = PublicSuffixDatabase.EXCEPTION_MARKER;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -788334647:
                                                    if (!str3.equals("whyred")) {
                                                        b3 = 34;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -782144577:
                                                    if (!str3.equals("OnePlus5T")) {
                                                        b3 = 35;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -575125681:
                                                    if (!str3.equals("GiONEE_CBL7513")) {
                                                        b3 = 36;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -521118391:
                                                    if (!str3.equals("GIONEE_GBL7360")) {
                                                        b3 = 37;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -430914369:
                                                    if (!str3.equals("Pixi4-7_3G")) {
                                                        b3 = 38;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -290434366:
                                                    if (!str3.equals("taido_row")) {
                                                        b3 = 39;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -282781963:
                                                    if (!str3.equals("BLACK-1X")) {
                                                        b3 = 40;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -277133239:
                                                    if (!str3.equals("Z12_PRO")) {
                                                        b3 = 41;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -173639913:
                                                    if (!str3.equals("ELUGA_A3_Pro")) {
                                                        b3 = 42;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -56598463:
                                                    if (!str3.equals("woods_fn")) {
                                                        b3 = 43;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2126:
                                                    if (!str3.equals("C1")) {
                                                        b3 = 44;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2564:
                                                    if (!str3.equals("Q5")) {
                                                        b3 = 45;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2715:
                                                    if (!str3.equals("V1")) {
                                                        b3 = 46;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2719:
                                                    if (!str3.equals("V5")) {
                                                        b3 = 47;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 3091:
                                                    if (!str3.equals("b5")) {
                                                        b3 = UTF8.S_P3A;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 3483:
                                                    if (!str3.equals("mh")) {
                                                        b3 = 49;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 73405:
                                                    if (!str3.equals("JGZ")) {
                                                        b3 = 50;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 75537:
                                                    if (!str3.equals("M04")) {
                                                        b3 = 51;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 75739:
                                                    if (!str3.equals("M5c")) {
                                                        b3 = 52;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 76779:
                                                    if (!str3.equals("MX6")) {
                                                        b3 = 53;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 78669:
                                                    if (!str3.equals("P85")) {
                                                        b3 = 54;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 79305:
                                                    if (!str3.equals("PLE")) {
                                                        b3 = 55;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 80618:
                                                    if (!str3.equals("QX1")) {
                                                        b3 = 56;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 88274:
                                                    if (!str3.equals("Z80")) {
                                                        b3 = 57;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 98846:
                                                    if (!str3.equals("cv1")) {
                                                        b3 = 58;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 98848:
                                                    if (!str3.equals("cv3")) {
                                                        b3 = 59;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 99329:
                                                    if (!str3.equals("deb")) {
                                                        b3 = 60;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 101481:
                                                    if (!str3.equals("flo")) {
                                                        b3 = Base32Encoder.DEFAULT_PADDING;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1513190:
                                                    if (!str3.equals("1601")) {
                                                        b3 = 62;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1514184:
                                                    if (!str3.equals("1713")) {
                                                        b3 = 63;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1514185:
                                                    if (!str3.equals("1714")) {
                                                        b3 = 64;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2133089:
                                                    if (!str3.equals("F01H")) {
                                                        b3 = 65;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2133091:
                                                    if (!str3.equals("F01J")) {
                                                        b3 = 66;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2133120:
                                                    if (!str3.equals("F02H")) {
                                                        b3 = 67;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2133151:
                                                    if (!str3.equals("F03H")) {
                                                        b3 = 68;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2133182:
                                                    if (!str3.equals("F04H")) {
                                                        b3 = 69;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2133184:
                                                    if (!str3.equals("F04J")) {
                                                        b3 = 70;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2436959:
                                                    if (!str3.equals("P681")) {
                                                        b3 = 71;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2463773:
                                                    if (!str3.equals("Q350")) {
                                                        b3 = 72;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2464648:
                                                    if (!str3.equals("Q427")) {
                                                        b3 = 73;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2689555:
                                                    if (!str3.equals("XE2X")) {
                                                        b3 = 74;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 3154429:
                                                    if (!str3.equals("fugu")) {
                                                        b3 = 75;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 3284551:
                                                    if (!str3.equals("kate")) {
                                                        b3 = 76;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 3351335:
                                                    if (!str3.equals("mido")) {
                                                        b3 = 77;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 3386211:
                                                    if (!str3.equals("p212")) {
                                                        b3 = 78;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 41325051:
                                                    if (!str3.equals("MEIZU_M5")) {
                                                        b3 = 79;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 51349633:
                                                    if (!str3.equals("601LV")) {
                                                        b3 = UTF8.S_P4A;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 51350594:
                                                    if (!str3.equals("602LV")) {
                                                        b3 = 81;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 55178625:
                                                    if (!str3.equals("Aura_Note_2")) {
                                                        b3 = 82;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 61542055:
                                                    if (!str3.equals("A1601")) {
                                                        b3 = 83;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 65355429:
                                                    if (!str3.equals("E5643")) {
                                                        b3 = 84;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 66214468:
                                                    if (!str3.equals("F3111")) {
                                                        b3 = 85;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 66214470:
                                                    if (!str3.equals("F3113")) {
                                                        b3 = 86;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 66214473:
                                                    if (!str3.equals("F3116")) {
                                                        b3 = 87;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 66215429:
                                                    if (!str3.equals("F3211")) {
                                                        b3 = 88;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 66215431:
                                                    if (!str3.equals("F3213")) {
                                                        b3 = 89;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 66215433:
                                                    if (!str3.equals("F3215")) {
                                                        b3 = 90;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 66216390:
                                                    if (!str3.equals("F3311")) {
                                                        b3 = 91;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 76402249:
                                                    if (!str3.equals("PRO7S")) {
                                                        b3 = 92;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 76404105:
                                                    if (!str3.equals("Q4260")) {
                                                        b3 = 93;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 76404911:
                                                    if (!str3.equals("Q4310")) {
                                                        b3 = 94;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 80963634:
                                                    if (!str3.equals("V23GB")) {
                                                        b3 = 95;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 82882791:
                                                    if (!str3.equals("X3_HK")) {
                                                        b3 = UTF8.S_P4B;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 98715550:
                                                    if (!str3.equals("i9031")) {
                                                        b3 = 97;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 101370885:
                                                    if (!str3.equals("l5460")) {
                                                        b3 = 98;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 102844228:
                                                    if (!str3.equals("le_x6")) {
                                                        b3 = 99;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 165221241:
                                                    if (!str3.equals("A2016a40")) {
                                                        b3 = 100;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 182191441:
                                                    if (!str3.equals("CPY83_I00")) {
                                                        b3 = 101;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 245388979:
                                                    if (!str3.equals("marino_f")) {
                                                        b3 = 102;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 287431619:
                                                    if (!str3.equals("griffin")) {
                                                        b3 = 103;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 307593612:
                                                    if (!str3.equals("A7010a48")) {
                                                        b3 = 104;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 308517133:
                                                    if (!str3.equals("A7020a48")) {
                                                        b3 = 105;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 316215098:
                                                    if (!str3.equals("TB3-730F")) {
                                                        b3 = 106;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 316215116:
                                                    if (!str3.equals("TB3-730X")) {
                                                        b3 = 107;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 316246811:
                                                    if (!str3.equals("TB3-850F")) {
                                                        b3 = 108;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 316246818:
                                                    if (!str3.equals("TB3-850M")) {
                                                        b3 = 109;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 407160593:
                                                    if (!str3.equals("Pixi5-10_4G")) {
                                                        b3 = KeyFactorySpi.x25519_type;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 507412548:
                                                    if (!str3.equals("QM16XE_U")) {
                                                        b3 = KeyFactorySpi.x448_type;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 793982701:
                                                    if (!str3.equals("GIONEE_WBL5708")) {
                                                        b3 = KeyFactorySpi.Ed25519_type;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 794038622:
                                                    if (!str3.equals("GIONEE_WBL7365")) {
                                                        b3 = KeyFactorySpi.Ed448_type;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 794040393:
                                                    if (!str3.equals("GIONEE_WBL7519")) {
                                                        b3 = 114;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 835649806:
                                                    if (!str3.equals("manning")) {
                                                        b3 = 115;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 917340916:
                                                    if (!str3.equals("A7000plus")) {
                                                        b3 = 116;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 958008161:
                                                    if (!str3.equals("j2xlteins")) {
                                                        b3 = 117;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1060579533:
                                                    if (!str3.equals("panell_d")) {
                                                        b3 = 118;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1150207623:
                                                    if (!str3.equals("LS-5017")) {
                                                        b3 = 119;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1176899427:
                                                    if (!str3.equals("itel_S41")) {
                                                        b3 = 120;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1280332038:
                                                    if (!str3.equals("hwALE-H")) {
                                                        b3 = 121;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1306947716:
                                                    if (!str3.equals("EverStar_S")) {
                                                        b3 = 122;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1349174697:
                                                    if (!str3.equals("htc_e56ml_dtul")) {
                                                        b3 = 123;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1522194893:
                                                    if (!str3.equals("woods_f")) {
                                                        b3 = 124;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1691543273:
                                                    if (!str3.equals("CPH1609")) {
                                                        b3 = 125;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1691544261:
                                                    if (!str3.equals("CPH1715")) {
                                                        b3 = 126;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1709443163:
                                                    if (!str3.equals("iball8735_9806")) {
                                                        b3 = ColorResourcesTableCreator.APPLICATION_PACKAGE_ID;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1865889110:
                                                    if (!str3.equals("santoni")) {
                                                        b3 = GCMSIVBlockCipher.MASK;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1906253259:
                                                    if (!str3.equals("PB2-670M")) {
                                                        b3 = 129;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 1977196784:
                                                    if (!str3.equals("Infinix-X572")) {
                                                        b3 = C0684bo.f2503h;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2006372676:
                                                    if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                        b3 = 131;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2019281702:
                                                    if (!str3.equals("DM-01K")) {
                                                        b3 = 132;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2029784656:
                                                    if (!str3.equals("HWBLN-H")) {
                                                        b3 = 133;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2030379515:
                                                    if (!str3.equals("HWCAM-H")) {
                                                        b3 = 134;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2033393791:
                                                    if (!str3.equals("ASUS_X00AD_2")) {
                                                        b3 = 135;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2047190025:
                                                    if (!str3.equals("ELUGA_Note")) {
                                                        b3 = 136;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2047252157:
                                                    if (!str3.equals("ELUGA_Prim")) {
                                                        b3 = 137;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2048319463:
                                                    if (!str3.equals("HWVNS-H")) {
                                                        b3 = 138;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 2048855701:
                                                    if (!str3.equals("HWWAS-H")) {
                                                        b3 = 139;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b3 = -1;
                                                    break;
                                            }
                                            switch (b3) {
                                                default:
                                                    if (str2.equals("JSN-L21")) {
                                                    }
                                                case 0:
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                case 10:
                                                case 11:
                                                case 12:
                                                case 13:
                                                case 14:
                                                case 15:
                                                case 16:
                                                case 17:
                                                case 18:
                                                case 19:
                                                case 20:
                                                case 21:
                                                case 22:
                                                case 23:
                                                case 24:
                                                case 25:
                                                case 26:
                                                case 27:
                                                case 28:
                                                case 29:
                                                case 30:
                                                case 31:
                                                case 32:
                                                case 33:
                                                case 34:
                                                case 35:
                                                case 36:
                                                case 37:
                                                case 38:
                                                case 39:
                                                case 40:
                                                case 41:
                                                case 42:
                                                case 43:
                                                case 44:
                                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                case 46:
                                                case 47:
                                                case 48:
                                                case 49:
                                                case 50:
                                                case 51:
                                                case 52:
                                                case 53:
                                                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                                case 56:
                                                case 57:
                                                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                                case 60:
                                                case 61:
                                                case 62:
                                                case 63:
                                                case 64:
                                                case 65:
                                                case 66:
                                                case 67:
                                                case 68:
                                                case 69:
                                                case 70:
                                                case 71:
                                                case 72:
                                                case 73:
                                                case 74:
                                                case 75:
                                                case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                                                case 77:
                                                case 78:
                                                case 79:
                                                case 80:
                                                case 81:
                                                case 82:
                                                case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                                case 84:
                                                case 85:
                                                case HRSS1373Polynomial.f81792K /* 86 */:
                                                case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                                                case 88:
                                                case 89:
                                                case 90:
                                                case 91:
                                                case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                                case 93:
                                                case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                                case 95:
                                                case 96:
                                                case 97:
                                                case 98:
                                                case C0254q.f1216f /* 99 */:
                                                case 100:
                                                case 101:
                                                case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                                case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                                case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                                                case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                                                case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                                                case 108:
                                                case 109:
                                                case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                                case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                                case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                                                case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                                                case 114:
                                                case 115:
                                                case 116:
                                                case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                                case 118:
                                                case 119:
                                                case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                                                case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                                                case 122:
                                                case 123:
                                                case 124:
                                                case C0254q.f1218h /* 125 */:
                                                case 126:
                                                case 127:
                                                case 128:
                                                case 129:
                                                case 130:
                                                case 131:
                                                case 132:
                                                case 133:
                                                case 134:
                                                case 135:
                                                case 136:
                                                case 137:
                                                case 138:
                                                case 139:
                                                    z = true;
                                                    break;
                                            }
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                        z = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            z = true;
                            break;
                    }
                } else if (i <= 27) {
                    str2 = Build.MODEL;
                    str2.getClass();
                    switch (str2.hashCode()) {
                        case -349662828:
                            if (!str2.equals("AFTJMST12")) {
                                b = -1;
                            } else {
                                b = 0;
                            }
                            break;
                        case -321033677:
                            if (!str2.equals("AFTKMST12")) {
                                b = -1;
                            } else {
                                b = 1;
                            }
                            break;
                        case 2006354:
                            if (!str2.equals("AFTA")) {
                                b = -1;
                            } else {
                                b = 2;
                            }
                            break;
                        case 2006367:
                            if (!str2.equals("AFTN")) {
                                b = -1;
                            } else {
                                b = 3;
                            }
                            break;
                        case 2006371:
                            if (!str2.equals("AFTR")) {
                                b = -1;
                            } else {
                                b = 4;
                            }
                            break;
                        case 1785421873:
                            if (!str2.equals("AFTEU011")) {
                                b = -1;
                            } else {
                                b = 5;
                            }
                            break;
                        case 1785421876:
                            if (!str2.equals("AFTEU014")) {
                                b = -1;
                            } else {
                                b = 6;
                            }
                            break;
                        case 1798172390:
                            if (!str2.equals("AFTSO001")) {
                                b = -1;
                            } else {
                                b = 7;
                            }
                            break;
                        case 2119412532:
                            if (!str2.equals("AFTEUFF014")) {
                                b = -1;
                            } else {
                                b = 8;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        default:
                            if (i <= 26) {
                                str3 = Build.DEVICE;
                                str3.getClass();
                                switch (str3.hashCode()) {
                                    case -2144781245:
                                        if (!str3.equals("GIONEE_SWW1609")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 0;
                                        }
                                        break;
                                    case -2144781185:
                                        if (!str3.equals("GIONEE_SWW1627")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 1;
                                        }
                                        break;
                                    case -2144781160:
                                        if (!str3.equals("GIONEE_SWW1631")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 2;
                                        }
                                        break;
                                    case -2097309513:
                                        if (!str3.equals("K50a40")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 3;
                                        }
                                        break;
                                    case -2022874474:
                                        if (!str3.equals("CP8676_I02")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 4;
                                        }
                                        break;
                                    case -1978993182:
                                        if (!str3.equals("NX541J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 5;
                                        }
                                        break;
                                    case -1978990237:
                                        if (!str3.equals("NX573J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 6;
                                        }
                                        break;
                                    case -1936688988:
                                        if (!str3.equals("PGN528")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 7;
                                        }
                                        break;
                                    case -1936688066:
                                        if (!str3.equals("PGN610")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 8;
                                        }
                                        break;
                                    case -1936688065:
                                        if (!str3.equals("PGN611")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 9;
                                        }
                                        break;
                                    case -1931988508:
                                        if (!str3.equals("AquaPowerM")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 10;
                                        }
                                        break;
                                    case -1885099851:
                                        if (!str3.equals("RAIJIN")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 11;
                                        }
                                        break;
                                    case -1696512866:
                                        if (!str3.equals("XT1663")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 12;
                                        }
                                        break;
                                    case -1680025915:
                                        if (!str3.equals("ComioS1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = C0698cb.f2569k;
                                        }
                                        break;
                                    case -1615810839:
                                        if (!str3.equals("Phantom6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = C0698cb.f2570l;
                                        }
                                        break;
                                    case -1600724499:
                                        if (!str3.equals("pacificrim")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 15;
                                        }
                                        break;
                                    case -1554255044:
                                        if (!str3.equals("vernee_M5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 16;
                                        }
                                        break;
                                    case -1481772737:
                                        if (!str3.equals("panell_dl")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 17;
                                        }
                                        break;
                                    case -1481772730:
                                        if (!str3.equals("panell_ds")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 18;
                                        }
                                        break;
                                    case -1481772729:
                                        if (!str3.equals("panell_dt")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 19;
                                        }
                                        break;
                                    case -1320080169:
                                        if (!str3.equals("GiONEE_GBL7319")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 20;
                                        }
                                        break;
                                    case -1217592143:
                                        if (!str3.equals("BRAVIA_ATV2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 21;
                                        }
                                        break;
                                    case -1180384755:
                                        if (!str3.equals("iris60")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 22;
                                        }
                                        break;
                                    case -1139198265:
                                        if (!str3.equals("Slate_Pro")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 23;
                                        }
                                        break;
                                    case -1052835013:
                                        if (!str3.equals("namath")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 24;
                                        }
                                        break;
                                    case -993250464:
                                        if (!str3.equals("A10-70F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 25;
                                        }
                                        break;
                                    case -993250458:
                                        if (!str3.equals("A10-70L")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 26;
                                        }
                                        break;
                                    case -965403638:
                                        if (!str3.equals("s905x018")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 27;
                                        }
                                        break;
                                    case -958336948:
                                        if (!str3.equals("ELUGA_Ray_X")) {
                                            b3 = -1;
                                        }
                                        break;
                                    case -879245230:
                                        if (!str3.equals("tcl_eu")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 29;
                                        }
                                        break;
                                    case -842500323:
                                        if (!str3.equals("nicklaus_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 30;
                                        }
                                        break;
                                    case -821392978:
                                        if (!str3.equals("A7000-a")) {
                                            b3 = -1;
                                        } else {
                                            b3 = C0684bo.f2505j;
                                        }
                                        break;
                                    case -797483286:
                                        if (!str3.equals("SVP-DTV15")) {
                                            b3 = -1;
                                        } else {
                                            b3 = UTF8.S_CS3;
                                        }
                                        break;
                                    case -794946968:
                                        if (!str3.equals("watson")) {
                                            b3 = -1;
                                        } else {
                                            b3 = PublicSuffixDatabase.EXCEPTION_MARKER;
                                        }
                                        break;
                                    case -788334647:
                                        if (!str3.equals("whyred")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 34;
                                        }
                                        break;
                                    case -782144577:
                                        if (!str3.equals("OnePlus5T")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 35;
                                        }
                                        break;
                                    case -575125681:
                                        if (!str3.equals("GiONEE_CBL7513")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 36;
                                        }
                                        break;
                                    case -521118391:
                                        if (!str3.equals("GIONEE_GBL7360")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 37;
                                        }
                                        break;
                                    case -430914369:
                                        if (!str3.equals("Pixi4-7_3G")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 38;
                                        }
                                        break;
                                    case -290434366:
                                        if (!str3.equals("taido_row")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 39;
                                        }
                                        break;
                                    case -282781963:
                                        if (!str3.equals("BLACK-1X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 40;
                                        }
                                        break;
                                    case -277133239:
                                        if (!str3.equals("Z12_PRO")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 41;
                                        }
                                        break;
                                    case -173639913:
                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 42;
                                        }
                                        break;
                                    case -56598463:
                                        if (!str3.equals("woods_fn")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 43;
                                        }
                                        break;
                                    case 2126:
                                        if (!str3.equals("C1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 44;
                                        }
                                        break;
                                    case 2564:
                                        if (!str3.equals("Q5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 45;
                                        }
                                        break;
                                    case 2715:
                                        if (!str3.equals("V1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 46;
                                        }
                                        break;
                                    case 2719:
                                        if (!str3.equals("V5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 47;
                                        }
                                        break;
                                    case 3091:
                                        if (!str3.equals("b5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = UTF8.S_P3A;
                                        }
                                        break;
                                    case 3483:
                                        if (!str3.equals("mh")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 49;
                                        }
                                        break;
                                    case 73405:
                                        if (!str3.equals("JGZ")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 50;
                                        }
                                        break;
                                    case 75537:
                                        if (!str3.equals("M04")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 51;
                                        }
                                        break;
                                    case 75739:
                                        if (!str3.equals("M5c")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 52;
                                        }
                                        break;
                                    case 76779:
                                        if (!str3.equals("MX6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 53;
                                        }
                                        break;
                                    case 78669:
                                        if (!str3.equals("P85")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 54;
                                        }
                                        break;
                                    case 79305:
                                        if (!str3.equals("PLE")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 55;
                                        }
                                        break;
                                    case 80618:
                                        if (!str3.equals("QX1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 56;
                                        }
                                        break;
                                    case 88274:
                                        if (!str3.equals("Z80")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 57;
                                        }
                                        break;
                                    case 98846:
                                        if (!str3.equals("cv1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 58;
                                        }
                                        break;
                                    case 98848:
                                        if (!str3.equals("cv3")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 59;
                                        }
                                        break;
                                    case 99329:
                                        if (!str3.equals("deb")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 60;
                                        }
                                        break;
                                    case 101481:
                                        if (!str3.equals("flo")) {
                                            b3 = -1;
                                        } else {
                                            b3 = Base32Encoder.DEFAULT_PADDING;
                                        }
                                        break;
                                    case 1513190:
                                        if (!str3.equals("1601")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 62;
                                        }
                                        break;
                                    case 1514184:
                                        if (!str3.equals("1713")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 63;
                                        }
                                        break;
                                    case 1514185:
                                        if (!str3.equals("1714")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 64;
                                        }
                                        break;
                                    case 2133089:
                                        if (!str3.equals("F01H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 65;
                                        }
                                        break;
                                    case 2133091:
                                        if (!str3.equals("F01J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 66;
                                        }
                                        break;
                                    case 2133120:
                                        if (!str3.equals("F02H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 67;
                                        }
                                        break;
                                    case 2133151:
                                        if (!str3.equals("F03H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 68;
                                        }
                                        break;
                                    case 2133182:
                                        if (!str3.equals("F04H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 69;
                                        }
                                        break;
                                    case 2133184:
                                        if (!str3.equals("F04J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 70;
                                        }
                                        break;
                                    case 2436959:
                                        if (!str3.equals("P681")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 71;
                                        }
                                        break;
                                    case 2463773:
                                        if (!str3.equals("Q350")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 72;
                                        }
                                        break;
                                    case 2464648:
                                        if (!str3.equals("Q427")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 73;
                                        }
                                        break;
                                    case 2689555:
                                        if (!str3.equals("XE2X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 74;
                                        }
                                        break;
                                    case 3154429:
                                        if (!str3.equals("fugu")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 75;
                                        }
                                        break;
                                    case 3284551:
                                        if (!str3.equals("kate")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 76;
                                        }
                                        break;
                                    case 3351335:
                                        if (!str3.equals("mido")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 77;
                                        }
                                        break;
                                    case 3386211:
                                        if (!str3.equals("p212")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 78;
                                        }
                                        break;
                                    case 41325051:
                                        if (!str3.equals("MEIZU_M5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 79;
                                        }
                                        break;
                                    case 51349633:
                                        if (!str3.equals("601LV")) {
                                            b3 = -1;
                                        } else {
                                            b3 = UTF8.S_P4A;
                                        }
                                        break;
                                    case 51350594:
                                        if (!str3.equals("602LV")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 81;
                                        }
                                        break;
                                    case 55178625:
                                        if (!str3.equals("Aura_Note_2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 82;
                                        }
                                        break;
                                    case 61542055:
                                        if (!str3.equals("A1601")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 83;
                                        }
                                        break;
                                    case 65355429:
                                        if (!str3.equals("E5643")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 84;
                                        }
                                        break;
                                    case 66214468:
                                        if (!str3.equals("F3111")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 85;
                                        }
                                        break;
                                    case 66214470:
                                        if (!str3.equals("F3113")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 86;
                                        }
                                        break;
                                    case 66214473:
                                        if (!str3.equals("F3116")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 87;
                                        }
                                        break;
                                    case 66215429:
                                        if (!str3.equals("F3211")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 88;
                                        }
                                        break;
                                    case 66215431:
                                        if (!str3.equals("F3213")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 89;
                                        }
                                        break;
                                    case 66215433:
                                        if (!str3.equals("F3215")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 90;
                                        }
                                        break;
                                    case 66216390:
                                        if (!str3.equals("F3311")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 91;
                                        }
                                        break;
                                    case 76402249:
                                        if (!str3.equals("PRO7S")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 92;
                                        }
                                        break;
                                    case 76404105:
                                        if (!str3.equals("Q4260")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 93;
                                        }
                                        break;
                                    case 76404911:
                                        if (!str3.equals("Q4310")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 94;
                                        }
                                        break;
                                    case 80963634:
                                        if (!str3.equals("V23GB")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 95;
                                        }
                                        break;
                                    case 82882791:
                                        if (!str3.equals("X3_HK")) {
                                            b3 = -1;
                                        } else {
                                            b3 = UTF8.S_P4B;
                                        }
                                        break;
                                    case 98715550:
                                        if (!str3.equals("i9031")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 97;
                                        }
                                        break;
                                    case 101370885:
                                        if (!str3.equals("l5460")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 98;
                                        }
                                        break;
                                    case 102844228:
                                        if (!str3.equals("le_x6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 99;
                                        }
                                        break;
                                    case 165221241:
                                        if (!str3.equals("A2016a40")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 100;
                                        }
                                        break;
                                    case 182191441:
                                        if (!str3.equals("CPY83_I00")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 101;
                                        }
                                        break;
                                    case 245388979:
                                        if (!str3.equals("marino_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 102;
                                        }
                                        break;
                                    case 287431619:
                                        if (!str3.equals("griffin")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 103;
                                        }
                                        break;
                                    case 307593612:
                                        if (!str3.equals("A7010a48")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 104;
                                        }
                                        break;
                                    case 308517133:
                                        if (!str3.equals("A7020a48")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 105;
                                        }
                                        break;
                                    case 316215098:
                                        if (!str3.equals("TB3-730F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 106;
                                        }
                                        break;
                                    case 316215116:
                                        if (!str3.equals("TB3-730X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 107;
                                        }
                                        break;
                                    case 316246811:
                                        if (!str3.equals("TB3-850F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 108;
                                        }
                                        break;
                                    case 316246818:
                                        if (!str3.equals("TB3-850M")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 109;
                                        }
                                        break;
                                    case 407160593:
                                        if (!str3.equals("Pixi5-10_4G")) {
                                            b3 = -1;
                                        } else {
                                            b3 = KeyFactorySpi.x25519_type;
                                        }
                                        break;
                                    case 507412548:
                                        if (!str3.equals("QM16XE_U")) {
                                            b3 = -1;
                                        } else {
                                            b3 = KeyFactorySpi.x448_type;
                                        }
                                        break;
                                    case 793982701:
                                        if (!str3.equals("GIONEE_WBL5708")) {
                                            b3 = -1;
                                        } else {
                                            b3 = KeyFactorySpi.Ed25519_type;
                                        }
                                        break;
                                    case 794038622:
                                        if (!str3.equals("GIONEE_WBL7365")) {
                                            b3 = -1;
                                        } else {
                                            b3 = KeyFactorySpi.Ed448_type;
                                        }
                                        break;
                                    case 794040393:
                                        if (!str3.equals("GIONEE_WBL7519")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 114;
                                        }
                                        break;
                                    case 835649806:
                                        if (!str3.equals("manning")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 115;
                                        }
                                        break;
                                    case 917340916:
                                        if (!str3.equals("A7000plus")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 116;
                                        }
                                        break;
                                    case 958008161:
                                        if (!str3.equals("j2xlteins")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 117;
                                        }
                                        break;
                                    case 1060579533:
                                        if (!str3.equals("panell_d")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 118;
                                        }
                                        break;
                                    case 1150207623:
                                        if (!str3.equals("LS-5017")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 119;
                                        }
                                        break;
                                    case 1176899427:
                                        if (!str3.equals("itel_S41")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 120;
                                        }
                                        break;
                                    case 1280332038:
                                        if (!str3.equals("hwALE-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 121;
                                        }
                                        break;
                                    case 1306947716:
                                        if (!str3.equals("EverStar_S")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 122;
                                        }
                                        break;
                                    case 1349174697:
                                        if (!str3.equals("htc_e56ml_dtul")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 123;
                                        }
                                        break;
                                    case 1522194893:
                                        if (!str3.equals("woods_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 124;
                                        }
                                        break;
                                    case 1691543273:
                                        if (!str3.equals("CPH1609")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 125;
                                        }
                                        break;
                                    case 1691544261:
                                        if (!str3.equals("CPH1715")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 126;
                                        }
                                        break;
                                    case 1709443163:
                                        if (!str3.equals("iball8735_9806")) {
                                            b3 = -1;
                                        } else {
                                            b3 = ColorResourcesTableCreator.APPLICATION_PACKAGE_ID;
                                        }
                                        break;
                                    case 1865889110:
                                        if (!str3.equals("santoni")) {
                                            b3 = -1;
                                        } else {
                                            b3 = GCMSIVBlockCipher.MASK;
                                        }
                                        break;
                                    case 1906253259:
                                        if (!str3.equals("PB2-670M")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 129;
                                        }
                                        break;
                                    case 1977196784:
                                        if (!str3.equals("Infinix-X572")) {
                                            b3 = -1;
                                        } else {
                                            b3 = C0684bo.f2503h;
                                        }
                                        break;
                                    case 2006372676:
                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 131;
                                        }
                                        break;
                                    case 2019281702:
                                        if (!str3.equals("DM-01K")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 132;
                                        }
                                        break;
                                    case 2029784656:
                                        if (!str3.equals("HWBLN-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 133;
                                        }
                                        break;
                                    case 2030379515:
                                        if (!str3.equals("HWCAM-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 134;
                                        }
                                        break;
                                    case 2033393791:
                                        if (!str3.equals("ASUS_X00AD_2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 135;
                                        }
                                        break;
                                    case 2047190025:
                                        if (!str3.equals("ELUGA_Note")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 136;
                                        }
                                        break;
                                    case 2047252157:
                                        if (!str3.equals("ELUGA_Prim")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 137;
                                        }
                                        break;
                                    case 2048319463:
                                        if (!str3.equals("HWVNS-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 138;
                                        }
                                        break;
                                    case 2048855701:
                                        if (!str3.equals("HWWAS-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 139;
                                        }
                                        break;
                                    default:
                                        b3 = -1;
                                        break;
                                }
                                switch (b3) {
                                    default:
                                        if (str2.equals("JSN-L21")) {
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                    case 56:
                                    case 57:
                                    case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                    case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                    case 60:
                                    case 61:
                                    case 62:
                                    case 63:
                                    case 64:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case 68:
                                    case 69:
                                    case 70:
                                    case 71:
                                    case 72:
                                    case 73:
                                    case 74:
                                    case 75:
                                    case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                                    case 77:
                                    case 78:
                                    case 79:
                                    case 80:
                                    case 81:
                                    case 82:
                                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                    case 84:
                                    case 85:
                                    case HRSS1373Polynomial.f81792K /* 86 */:
                                    case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                                    case 88:
                                    case 89:
                                    case 90:
                                    case 91:
                                    case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                    case 93:
                                    case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                    case 95:
                                    case 96:
                                    case 97:
                                    case 98:
                                    case C0254q.f1216f /* 99 */:
                                    case 100:
                                    case 101:
                                    case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                    case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                    case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                    case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                                    case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                                    case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                                    case 108:
                                    case 109:
                                    case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                    case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                    case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                                    case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                                    case 114:
                                    case 115:
                                    case 116:
                                    case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                    case 118:
                                    case 119:
                                    case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                                    case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                                    case 122:
                                    case 123:
                                    case 124:
                                    case C0254q.f1218h /* 125 */:
                                    case 126:
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case 137:
                                    case 138:
                                    case 139:
                                        z = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            z = true;
                            break;
                    }
                } else {
                    str2 = Build.MODEL;
                    str2.getClass();
                    switch (str2.hashCode()) {
                        case -349662828:
                            if (!str2.equals("AFTJMST12")) {
                                b = 0;
                            } else {
                                b = -1;
                            }
                            break;
                        case -321033677:
                            if (!str2.equals("AFTKMST12")) {
                                b = 1;
                            } else {
                                b = -1;
                            }
                            break;
                        case 2006354:
                            if (!str2.equals("AFTA")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                            break;
                        case 2006367:
                            if (!str2.equals("AFTN")) {
                                b = 3;
                            } else {
                                b = -1;
                            }
                            break;
                        case 2006371:
                            if (!str2.equals("AFTR")) {
                                b = 4;
                            } else {
                                b = -1;
                            }
                            break;
                        case 1785421873:
                            if (!str2.equals("AFTEU011")) {
                                b = 5;
                            } else {
                                b = -1;
                            }
                            break;
                        case 1785421876:
                            if (!str2.equals("AFTEU014")) {
                                b = 6;
                            } else {
                                b = -1;
                            }
                            break;
                        case 1798172390:
                            if (!str2.equals("AFTSO001")) {
                                b = 7;
                            } else {
                                b = -1;
                            }
                            break;
                        case 2119412532:
                            if (!str2.equals("AFTEUFF014")) {
                                b = 8;
                            } else {
                                b = -1;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        default:
                            if (i <= 26) {
                                str3 = Build.DEVICE;
                                str3.getClass();
                                switch (str3.hashCode()) {
                                    case -2144781245:
                                        if (!str3.equals("GIONEE_SWW1609")) {
                                            b3 = 0;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -2144781185:
                                        if (!str3.equals("GIONEE_SWW1627")) {
                                            b3 = 1;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -2144781160:
                                        if (!str3.equals("GIONEE_SWW1631")) {
                                            b3 = 2;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -2097309513:
                                        if (!str3.equals("K50a40")) {
                                            b3 = 3;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -2022874474:
                                        if (!str3.equals("CP8676_I02")) {
                                            b3 = 4;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1978993182:
                                        if (!str3.equals("NX541J")) {
                                            b3 = 5;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1978990237:
                                        if (!str3.equals("NX573J")) {
                                            b3 = 6;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1936688988:
                                        if (!str3.equals("PGN528")) {
                                            b3 = 7;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1936688066:
                                        if (!str3.equals("PGN610")) {
                                            b3 = 8;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1936688065:
                                        if (!str3.equals("PGN611")) {
                                            b3 = 9;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1931988508:
                                        if (!str3.equals("AquaPowerM")) {
                                            b3 = 10;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1885099851:
                                        if (!str3.equals("RAIJIN")) {
                                            b3 = 11;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1696512866:
                                        if (!str3.equals("XT1663")) {
                                            b3 = 12;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1680025915:
                                        if (!str3.equals("ComioS1")) {
                                            b3 = C0698cb.f2569k;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1615810839:
                                        if (!str3.equals("Phantom6")) {
                                            b3 = C0698cb.f2570l;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1600724499:
                                        if (!str3.equals("pacificrim")) {
                                            b3 = 15;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1554255044:
                                        if (!str3.equals("vernee_M5")) {
                                            b3 = 16;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1481772737:
                                        if (!str3.equals("panell_dl")) {
                                            b3 = 17;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1481772730:
                                        if (!str3.equals("panell_ds")) {
                                            b3 = 18;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1481772729:
                                        if (!str3.equals("panell_dt")) {
                                            b3 = 19;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1320080169:
                                        if (!str3.equals("GiONEE_GBL7319")) {
                                            b3 = 20;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1217592143:
                                        if (!str3.equals("BRAVIA_ATV2")) {
                                            b3 = 21;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1180384755:
                                        if (!str3.equals("iris60")) {
                                            b3 = 22;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1139198265:
                                        if (!str3.equals("Slate_Pro")) {
                                            b3 = 23;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1052835013:
                                        if (!str3.equals("namath")) {
                                            b3 = 24;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -993250464:
                                        if (!str3.equals("A10-70F")) {
                                            b3 = 25;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -993250458:
                                        if (!str3.equals("A10-70L")) {
                                            b3 = 26;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -965403638:
                                        if (!str3.equals("s905x018")) {
                                            b3 = 27;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -958336948:
                                        if (!str3.equals("ELUGA_Ray_X")) {
                                            b3 = -1;
                                        }
                                        break;
                                    case -879245230:
                                        if (!str3.equals("tcl_eu")) {
                                            b3 = 29;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -842500323:
                                        if (!str3.equals("nicklaus_f")) {
                                            b3 = 30;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -821392978:
                                        if (!str3.equals("A7000-a")) {
                                            b3 = C0684bo.f2505j;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -797483286:
                                        if (!str3.equals("SVP-DTV15")) {
                                            b3 = UTF8.S_CS3;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -794946968:
                                        if (!str3.equals("watson")) {
                                            b3 = PublicSuffixDatabase.EXCEPTION_MARKER;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -788334647:
                                        if (!str3.equals("whyred")) {
                                            b3 = 34;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -782144577:
                                        if (!str3.equals("OnePlus5T")) {
                                            b3 = 35;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -575125681:
                                        if (!str3.equals("GiONEE_CBL7513")) {
                                            b3 = 36;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -521118391:
                                        if (!str3.equals("GIONEE_GBL7360")) {
                                            b3 = 37;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -430914369:
                                        if (!str3.equals("Pixi4-7_3G")) {
                                            b3 = 38;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -290434366:
                                        if (!str3.equals("taido_row")) {
                                            b3 = 39;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -282781963:
                                        if (!str3.equals("BLACK-1X")) {
                                            b3 = 40;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -277133239:
                                        if (!str3.equals("Z12_PRO")) {
                                            b3 = 41;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -173639913:
                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                            b3 = 42;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -56598463:
                                        if (!str3.equals("woods_fn")) {
                                            b3 = 43;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2126:
                                        if (!str3.equals("C1")) {
                                            b3 = 44;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2564:
                                        if (!str3.equals("Q5")) {
                                            b3 = 45;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2715:
                                        if (!str3.equals("V1")) {
                                            b3 = 46;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2719:
                                        if (!str3.equals("V5")) {
                                            b3 = 47;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 3091:
                                        if (!str3.equals("b5")) {
                                            b3 = UTF8.S_P3A;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 3483:
                                        if (!str3.equals("mh")) {
                                            b3 = 49;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 73405:
                                        if (!str3.equals("JGZ")) {
                                            b3 = 50;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 75537:
                                        if (!str3.equals("M04")) {
                                            b3 = 51;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 75739:
                                        if (!str3.equals("M5c")) {
                                            b3 = 52;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 76779:
                                        if (!str3.equals("MX6")) {
                                            b3 = 53;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 78669:
                                        if (!str3.equals("P85")) {
                                            b3 = 54;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 79305:
                                        if (!str3.equals("PLE")) {
                                            b3 = 55;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 80618:
                                        if (!str3.equals("QX1")) {
                                            b3 = 56;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 88274:
                                        if (!str3.equals("Z80")) {
                                            b3 = 57;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 98846:
                                        if (!str3.equals("cv1")) {
                                            b3 = 58;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 98848:
                                        if (!str3.equals("cv3")) {
                                            b3 = 59;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 99329:
                                        if (!str3.equals("deb")) {
                                            b3 = 60;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 101481:
                                        if (!str3.equals("flo")) {
                                            b3 = Base32Encoder.DEFAULT_PADDING;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1513190:
                                        if (!str3.equals("1601")) {
                                            b3 = 62;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1514184:
                                        if (!str3.equals("1713")) {
                                            b3 = 63;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1514185:
                                        if (!str3.equals("1714")) {
                                            b3 = 64;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2133089:
                                        if (!str3.equals("F01H")) {
                                            b3 = 65;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2133091:
                                        if (!str3.equals("F01J")) {
                                            b3 = 66;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2133120:
                                        if (!str3.equals("F02H")) {
                                            b3 = 67;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2133151:
                                        if (!str3.equals("F03H")) {
                                            b3 = 68;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2133182:
                                        if (!str3.equals("F04H")) {
                                            b3 = 69;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2133184:
                                        if (!str3.equals("F04J")) {
                                            b3 = 70;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2436959:
                                        if (!str3.equals("P681")) {
                                            b3 = 71;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2463773:
                                        if (!str3.equals("Q350")) {
                                            b3 = 72;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2464648:
                                        if (!str3.equals("Q427")) {
                                            b3 = 73;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2689555:
                                        if (!str3.equals("XE2X")) {
                                            b3 = 74;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 3154429:
                                        if (!str3.equals("fugu")) {
                                            b3 = 75;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 3284551:
                                        if (!str3.equals("kate")) {
                                            b3 = 76;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 3351335:
                                        if (!str3.equals("mido")) {
                                            b3 = 77;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 3386211:
                                        if (!str3.equals("p212")) {
                                            b3 = 78;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 41325051:
                                        if (!str3.equals("MEIZU_M5")) {
                                            b3 = 79;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 51349633:
                                        if (!str3.equals("601LV")) {
                                            b3 = UTF8.S_P4A;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 51350594:
                                        if (!str3.equals("602LV")) {
                                            b3 = 81;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 55178625:
                                        if (!str3.equals("Aura_Note_2")) {
                                            b3 = 82;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 61542055:
                                        if (!str3.equals("A1601")) {
                                            b3 = 83;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 65355429:
                                        if (!str3.equals("E5643")) {
                                            b3 = 84;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 66214468:
                                        if (!str3.equals("F3111")) {
                                            b3 = 85;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 66214470:
                                        if (!str3.equals("F3113")) {
                                            b3 = 86;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 66214473:
                                        if (!str3.equals("F3116")) {
                                            b3 = 87;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 66215429:
                                        if (!str3.equals("F3211")) {
                                            b3 = 88;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 66215431:
                                        if (!str3.equals("F3213")) {
                                            b3 = 89;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 66215433:
                                        if (!str3.equals("F3215")) {
                                            b3 = 90;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 66216390:
                                        if (!str3.equals("F3311")) {
                                            b3 = 91;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 76402249:
                                        if (!str3.equals("PRO7S")) {
                                            b3 = 92;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 76404105:
                                        if (!str3.equals("Q4260")) {
                                            b3 = 93;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 76404911:
                                        if (!str3.equals("Q4310")) {
                                            b3 = 94;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 80963634:
                                        if (!str3.equals("V23GB")) {
                                            b3 = 95;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 82882791:
                                        if (!str3.equals("X3_HK")) {
                                            b3 = UTF8.S_P4B;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 98715550:
                                        if (!str3.equals("i9031")) {
                                            b3 = 97;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 101370885:
                                        if (!str3.equals("l5460")) {
                                            b3 = 98;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 102844228:
                                        if (!str3.equals("le_x6")) {
                                            b3 = 99;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 165221241:
                                        if (!str3.equals("A2016a40")) {
                                            b3 = 100;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 182191441:
                                        if (!str3.equals("CPY83_I00")) {
                                            b3 = 101;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 245388979:
                                        if (!str3.equals("marino_f")) {
                                            b3 = 102;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 287431619:
                                        if (!str3.equals("griffin")) {
                                            b3 = 103;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 307593612:
                                        if (!str3.equals("A7010a48")) {
                                            b3 = 104;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 308517133:
                                        if (!str3.equals("A7020a48")) {
                                            b3 = 105;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 316215098:
                                        if (!str3.equals("TB3-730F")) {
                                            b3 = 106;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 316215116:
                                        if (!str3.equals("TB3-730X")) {
                                            b3 = 107;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 316246811:
                                        if (!str3.equals("TB3-850F")) {
                                            b3 = 108;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 316246818:
                                        if (!str3.equals("TB3-850M")) {
                                            b3 = 109;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 407160593:
                                        if (!str3.equals("Pixi5-10_4G")) {
                                            b3 = KeyFactorySpi.x25519_type;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 507412548:
                                        if (!str3.equals("QM16XE_U")) {
                                            b3 = KeyFactorySpi.x448_type;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 793982701:
                                        if (!str3.equals("GIONEE_WBL5708")) {
                                            b3 = KeyFactorySpi.Ed25519_type;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 794038622:
                                        if (!str3.equals("GIONEE_WBL7365")) {
                                            b3 = KeyFactorySpi.Ed448_type;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 794040393:
                                        if (!str3.equals("GIONEE_WBL7519")) {
                                            b3 = 114;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 835649806:
                                        if (!str3.equals("manning")) {
                                            b3 = 115;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 917340916:
                                        if (!str3.equals("A7000plus")) {
                                            b3 = 116;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 958008161:
                                        if (!str3.equals("j2xlteins")) {
                                            b3 = 117;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1060579533:
                                        if (!str3.equals("panell_d")) {
                                            b3 = 118;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1150207623:
                                        if (!str3.equals("LS-5017")) {
                                            b3 = 119;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1176899427:
                                        if (!str3.equals("itel_S41")) {
                                            b3 = 120;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1280332038:
                                        if (!str3.equals("hwALE-H")) {
                                            b3 = 121;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1306947716:
                                        if (!str3.equals("EverStar_S")) {
                                            b3 = 122;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1349174697:
                                        if (!str3.equals("htc_e56ml_dtul")) {
                                            b3 = 123;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1522194893:
                                        if (!str3.equals("woods_f")) {
                                            b3 = 124;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1691543273:
                                        if (!str3.equals("CPH1609")) {
                                            b3 = 125;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1691544261:
                                        if (!str3.equals("CPH1715")) {
                                            b3 = 126;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1709443163:
                                        if (!str3.equals("iball8735_9806")) {
                                            b3 = ColorResourcesTableCreator.APPLICATION_PACKAGE_ID;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1865889110:
                                        if (!str3.equals("santoni")) {
                                            b3 = GCMSIVBlockCipher.MASK;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1906253259:
                                        if (!str3.equals("PB2-670M")) {
                                            b3 = 129;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 1977196784:
                                        if (!str3.equals("Infinix-X572")) {
                                            b3 = C0684bo.f2503h;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2006372676:
                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                            b3 = 131;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2019281702:
                                        if (!str3.equals("DM-01K")) {
                                            b3 = 132;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2029784656:
                                        if (!str3.equals("HWBLN-H")) {
                                            b3 = 133;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2030379515:
                                        if (!str3.equals("HWCAM-H")) {
                                            b3 = 134;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2033393791:
                                        if (!str3.equals("ASUS_X00AD_2")) {
                                            b3 = 135;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2047190025:
                                        if (!str3.equals("ELUGA_Note")) {
                                            b3 = 136;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2047252157:
                                        if (!str3.equals("ELUGA_Prim")) {
                                            b3 = 137;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2048319463:
                                        if (!str3.equals("HWVNS-H")) {
                                            b3 = 138;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case 2048855701:
                                        if (!str3.equals("HWWAS-H")) {
                                            b3 = 139;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    default:
                                        b3 = -1;
                                        break;
                                }
                                switch (b3) {
                                    default:
                                        if (str2.equals("JSN-L21")) {
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                    case 56:
                                    case 57:
                                    case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                    case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                    case 60:
                                    case 61:
                                    case 62:
                                    case 63:
                                    case 64:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case 68:
                                    case 69:
                                    case 70:
                                    case 71:
                                    case 72:
                                    case 73:
                                    case 74:
                                    case 75:
                                    case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                                    case 77:
                                    case 78:
                                    case 79:
                                    case 80:
                                    case 81:
                                    case 82:
                                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                    case 84:
                                    case 85:
                                    case HRSS1373Polynomial.f81792K /* 86 */:
                                    case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                                    case 88:
                                    case 89:
                                    case 90:
                                    case 91:
                                    case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                    case 93:
                                    case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                    case 95:
                                    case 96:
                                    case 97:
                                    case 98:
                                    case C0254q.f1216f /* 99 */:
                                    case 100:
                                    case 101:
                                    case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                    case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                    case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                    case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                                    case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                                    case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                                    case 108:
                                    case 109:
                                    case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                    case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                    case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                                    case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                                    case 114:
                                    case 115:
                                    case 116:
                                    case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                    case 118:
                                    case 119:
                                    case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                                    case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                                    case 122:
                                    case 123:
                                    case 124:
                                    case C0254q.f1218h /* 125 */:
                                    case 126:
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case 137:
                                    case 138:
                                    case 139:
                                        z = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            z = true;
                            break;
                    }
                }
                f57277 = z;
                f57275 = true;
            }
        }
        return f57277;
    }
}
