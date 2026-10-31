package l;

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
import com.alipay.sdk.m.y.q;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
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
public final class C17679 extends AbstractC15783 {

    /* JADX INFO: renamed from: ֡ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean f54082;

    /* JADX INFO: renamed from: ᩴᩳ, reason: not valid java name and contains not printable characters */
    public static final int[] f54083 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: ᩵ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean f54084;

    /* JADX INFO: renamed from: ֡ܽ, reason: not valid java name and contains not printable characters */
    public final PriorityQueue f54085;

    /* JADX INFO: renamed from: ֨ܽ, reason: not valid java name and contains not printable characters */
    public int f54086;

    /* JADX INFO: renamed from: ֫ᩳ, reason: not valid java name and contains not printable characters */
    public int f54087;

    /* JADX INFO: renamed from: ۖܽ, reason: not valid java name and contains not printable characters */
    public final Context f54088;

    /* JADX INFO: renamed from: ۖᩳ, reason: not valid java name and contains not printable characters */
    public final C20502 f54089;

    /* JADX INFO: renamed from: ۗܽ, reason: not valid java name and contains not printable characters */
    public long f54090;

    /* JADX INFO: renamed from: ۘܽ, reason: not valid java name and contains not printable characters */
    public C6404 f54091;

    /* JADX INFO: renamed from: ۘᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC6599 f54092;

    /* JADX INFO: renamed from: ۙܽ, reason: not valid java name and contains not printable characters */
    public boolean f54093;

    /* JADX INFO: renamed from: ۚܽ, reason: not valid java name and contains not printable characters */
    public long f54094;

    /* JADX INFO: renamed from: ۛܽ, reason: not valid java name and contains not printable characters */
    public C17008 f54095;

    /* JADX INFO: renamed from: ۜܽ, reason: not valid java name and contains not printable characters */
    public boolean f54096;

    /* JADX INFO: renamed from: ۜᩳ, reason: not valid java name and contains not printable characters */
    public int f54097;

    /* JADX INFO: renamed from: ۟ܽ, reason: not valid java name and contains not printable characters */
    public C24029 f54098;

    /* JADX INFO: renamed from: ۠ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f54099;

    /* JADX INFO: renamed from: ۡܽ, reason: not valid java name and contains not printable characters */
    public int f54100;

    /* JADX INFO: renamed from: ۡᩳ, reason: not valid java name and contains not printable characters */
    public int f54101;

    /* JADX INFO: renamed from: ۢܽ, reason: not valid java name and contains not printable characters */
    public boolean f54102;

    /* JADX INFO: renamed from: ۢᩳ, reason: not valid java name and contains not printable characters */
    public List f54103;

    /* JADX INFO: renamed from: ۤܽ, reason: not valid java name and contains not printable characters */
    public int f54104;

    /* JADX INFO: renamed from: ۧᩳ, reason: not valid java name and contains not printable characters */
    public C6404 f54105;

    /* JADX INFO: renamed from: ۨܽ, reason: not valid java name and contains not printable characters */
    public final boolean f54106;

    /* JADX INFO: renamed from: ۫ܽ, reason: not valid java name and contains not printable characters */
    public final long f54107;

    /* JADX INFO: renamed from: ۬ܽ, reason: not valid java name and contains not printable characters */
    public final int f54108;

    /* JADX INFO: renamed from: ܰܽ, reason: not valid java name and contains not printable characters */
    public long f54109;

    /* JADX INFO: renamed from: ܳܽ, reason: not valid java name and contains not printable characters */
    public int f54110;

    /* JADX INFO: renamed from: ܳᩳ, reason: not valid java name and contains not printable characters */
    public long f54111;

    /* JADX INFO: renamed from: ܶܽ, reason: not valid java name and contains not printable characters */
    public final C10833 f54112;

    /* JADX INFO: renamed from: ܺܽ, reason: not valid java name and contains not printable characters */
    public int f54113;

    /* JADX INFO: renamed from: ܺᩳ, reason: not valid java name and contains not printable characters */
    public final C4979 f54114;

    /* JADX INFO: renamed from: ܽᩳ, reason: not valid java name and contains not printable characters */
    public int f54115;

    /* JADX INFO: renamed from: ܿᩳ, reason: not valid java name and contains not printable characters */
    public long f54116;

    /* JADX INFO: renamed from: ᩳᩳ, reason: not valid java name and contains not printable characters */
    public C20888 f54117;

    /* JADX INFO: renamed from: ᩴܽ, reason: not valid java name and contains not printable characters */
    public final boolean f54118;

    /* JADX INFO: renamed from: ᩵ܽ, reason: not valid java name and contains not printable characters */
    public Surface f54119;

    /* JADX INFO: renamed from: ᩶ܽ, reason: not valid java name and contains not printable characters */
    public boolean f54120;

    /* JADX INFO: renamed from: ᩷ܽ, reason: not valid java name and contains not printable characters */
    public C16973 f54121;

    /* JADX INFO: renamed from: ᩷ᩳ, reason: not valid java name and contains not printable characters */
    public C18385 f54122;

    /* JADX INFO: renamed from: ᩸ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC22618 f54123;

    /* JADX INFO: renamed from: ᩹ܽ, reason: not valid java name and contains not printable characters */
    public boolean f54124;

    /* JADX INFO: renamed from: ᩺ܽ, reason: not valid java name and contains not printable characters */
    public boolean f54125;

    /* JADX INFO: renamed from: ᩻ܽ, reason: not valid java name and contains not printable characters */
    public int f54126;

    /* JADX INFO: renamed from: ᩻ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f54127;

    @Override // l.InterfaceC1837, l.InterfaceC18065
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41413(InterfaceC10846 interfaceC10846, int i) {
        Trace.beginSection("skipVideoBuffer");
        interfaceC10846.mo9429(i);
        Trace.endSection();
        this.f48681.f11174++;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41414(InterfaceC10846 interfaceC10846, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        interfaceC10846.mo9420(i, j);
        Trace.endSection();
        this.f48681.f11172++;
        this.f54100 = 0;
        if (this.f54092 == null) {
            C6404 c6404 = this.f54091;
            boolean zEquals = c6404.equals(C6404.f19812);
            C10833 c10833 = this.f54112;
            if (!zEquals && !c6404.equals(this.f54105)) {
                this.f54105 = c6404;
                c10833.m27090(c6404);
            }
            if (!this.f54114.m14448() || (surface = this.f54119) == null) {
                return;
            }
            c10833.m27086(surface);
            this.f54120 = true;
        }
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo13458(long j, long j2, InterfaceC10846 interfaceC10846, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C8353 c8353) {
        interfaceC10846.getClass();
        long jM37239 = j3 - m37239();
        int i4 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.f54085;
            Long l2 = (Long) priorityQueue.peek();
            if (l2 == null || l2.longValue() >= j3) {
                break;
            }
            i4++;
            priorityQueue.poll();
        }
        m41412(i4, 0);
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 != null) {
            if (z && !z2) {
                m41413(interfaceC10846, i);
                return true;
            }
            return interfaceC6599.mo8760(j3, new C7529(this, interfaceC10846, i, jM37239));
        }
        int iM14438 = this.f54114.m14438(j3, j, j2, m37223(), z, z2, this.f54089);
        C20502 c20502 = this.f54089;
        if (iM14438 == 0) {
            long jMo33835 = m14362().mo33835();
            InterfaceC22618 interfaceC22618 = this.f54123;
            if (interfaceC22618 != null) {
                interfaceC22618.mo24148(jM37239, jMo33835, c8353, m37242());
            }
            m41414(interfaceC10846, i, jMo33835);
            m41418(c20502.m46974());
            return true;
        }
        if (iM14438 == 1) {
            long jM46975 = c20502.m46975();
            long jM46974 = c20502.m46974();
            if (jM46975 == this.f54090) {
                m41413(interfaceC10846, i);
                jM46975 = jM46975;
            } else {
                InterfaceC22618 interfaceC22619 = this.f54123;
                if (interfaceC22619 != null) {
                    interfaceC22619.mo24148(jM37239, jM46975, c8353, m37242());
                }
                m41414(interfaceC10846, i, jM46975);
            }
            m41418(jM46974);
            this.f54090 = jM46975;
            return true;
        }
        if (iM14438 == 2) {
            Trace.beginSection("dropVideoBuffer");
            interfaceC10846.mo9429(i);
            Trace.endSection();
            m41412(0, 1);
            m41418(c20502.m46974());
            return true;
        }
        if (iM14438 == 3) {
            m41413(interfaceC10846, i);
            m41418(c20502.m46974());
            return true;
        }
        if (iM14438 == 4 || iM14438 == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(iM14438));
    }

    public C17679(C11330 c11330) {
        super(2, c11330.f33906, InterfaceC2379.f7585, false, 30.0f);
        Context applicationContext = c11330.f33908.getApplicationContext();
        this.f54088 = applicationContext;
        this.f54108 = c11330.f33909;
        this.f54092 = null;
        this.f54112 = new C10833(c11330.f33907, c11330.f33905);
        this.f54106 = this.f54092 == null;
        this.f54114 = new C4979(applicationContext, this, c11330.f33903);
        this.f54089 = new C20502();
        this.f54118 = "NVIDIA".equals(Build.MANUFACTURER);
        this.f54095 = C17008.f52163;
        this.f54115 = 1;
        this.f54126 = 0;
        this.f54091 = C6404.f19812;
        this.f54097 = 0;
        this.f54105 = null;
        this.f54087 = -1000;
        this.f54116 = -9223372036854775807L;
        this.f54109 = -9223372036854775807L;
        this.f54085 = new PriorityQueue();
        this.f54107 = -9223372036854775807L;
        this.f54099 = false;
        this.f54117 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m41415(long j, long j2, boolean z, boolean z2) throws C18273 {
        int iM14363;
        if (this.f54092 != null && this.f54106) {
            j2 -= -this.f54116;
        }
        if (j >= -500000 || z || (iM14363 = m14363(j2)) == 0) {
            return false;
        }
        PriorityQueue priorityQueue = this.f54085;
        if (z2) {
            C3519 c3519 = this.f48681;
            int i = c3519.f11181 + iM14363;
            c3519.f11181 = i;
            c3519.f11174 += this.f54110;
            c3519.f11181 = priorityQueue.size() + i;
        } else {
            this.f48681.f11179++;
            m41412(priorityQueue.size() + iM14363, this.f54110);
        }
        m37225();
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 != null) {
            interfaceC6599.mo8766(false);
        }
        return true;
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ֫ */
    public final int mo13445(InterfaceC2379 interfaceC2379, C8353 c8353) {
        boolean z;
        int i = 0;
        if (!C9786.m24801(c8353.f25614)) {
            return C11010.m27348(0, 0, 0, 0);
        }
        boolean z2 = c8353.f25602 != null;
        Context context = this.f54088;
        List listM41399 = m41399(context, interfaceC2379, c8353, z2, false);
        if (z2 && listM41399.isEmpty()) {
            listM41399 = m41399(context, interfaceC2379, c8353, false, false);
        }
        if (listM41399.isEmpty()) {
            return C11010.m27348(1, 0, 0, 0);
        }
        int i2 = c8353.f25632;
        if (i2 != 0 && i2 != 2) {
            return C11010.m27348(2, 0, 0, 0);
        }
        C17195 c17195 = (C17195) listM41399.get(0);
        boolean zM40454 = c17195.m40454(c8353);
        if (!zM40454) {
            int i3 = 1;
            while (true) {
                if (i3 >= listM41399.size()) {
                    z = true;
                    break;
                }
                C17195 c17196 = (C17195) listM41399.get(i3);
                if (c17196.m40454(c8353)) {
                    z = false;
                    zM40454 = true;
                    c17195 = c17196;
                    break;
                }
                i3++;
            }
        } else {
            z = true;
            break;
        }
        int i4 = zM40454 ? 4 : 3;
        int i5 = c17195.m40455(c8353) ? 16 : 8;
        int i6 = c17195.f52727 ? 64 : 0;
        int i7 = z ? 128 : 0;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(c8353.f25614) && !C2157.m7115(context)) {
            i7 = 256;
        }
        if (zM40454) {
            List listM413910 = m41399(context, interfaceC2379, c8353, z2, true);
            if (!listM413910.isEmpty()) {
                C17195 c17197 = (C17195) C22134.m49729(listM413910, c8353).get(0);
                if (c17197.m40454(c8353) && c17197.m40455(c8353)) {
                    i = 32;
                }
            }
        }
        return i4 | i5 | i | i6 | i7;
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo13446(InterfaceC2379 interfaceC2379, C8353 c8353, boolean z) {
        return C22134.m49729(m41399(this.f54088, interfaceC2379, c8353, z, this.f54127), c8353);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m41399(Context context, InterfaceC2379 interfaceC2379, C8353 c8353, boolean z, boolean z2) {
        List listMo7690;
        String str = c8353.f25614;
        if (str == null) {
            return AbstractC14545.of();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !C2157.m7115(context)) {
            String strM49728 = C22134.m49728(c8353);
            if (strM49728 == null) {
                listMo7690 = AbstractC14545.of();
            } else {
                listMo7690 = interfaceC2379.mo7690(strM49728, z, z2);
            }
            if (!listMo7690.isEmpty()) {
                return listMo7690;
            }
        }
        return C22134.m49732(interfaceC2379, c8353, z, z2);
    }

    @Override // l.AbstractC15783, l.AbstractC4930
    /* JADX INFO: renamed from: ֫ */
    public final void mo13457(boolean z, boolean z2) {
        super.mo13457(z, z2);
        boolean z3 = m14367().f53168;
        C22632.m50634((z3 && this.f54097 == 0) ? false : true);
        if (this.f54127 != z3) {
            this.f54127 = z3;
            m37211();
        }
        this.f54112.m27093(this.f48681);
        boolean z4 = this.f54124;
        C4979 c4979 = this.f54114;
        if (!z4) {
            if (this.f54103 != null && this.f54092 == null) {
                C21208 c21208 = new C21208(this.f54088, c4979);
                c21208.m48154();
                c21208.m48153(m14362());
                C1451 c1451M48152 = c21208.m48152();
                c1451M48152.m4991();
                this.f54092 = c1451M48152.m4987();
            }
            this.f54124 = true;
        }
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 == null) {
            c4979.m14443(m14362());
            c4979.m14441(!z2 ? 1 : 0);
            return;
        }
        interfaceC6599.mo8758(new C13878(this), C12449.m30605());
        InterfaceC22618 interfaceC22618 = this.f54123;
        if (interfaceC22618 != null) {
            this.f54092.mo8759(interfaceC22618);
        }
        if (this.f54119 != null && !this.f54095.equals(C17008.f52163)) {
            this.f54092.mo8754(this.f54119, this.f54095);
        }
        this.f54092.mo8751(this.f54126);
        this.f54092.mo8750(m37222());
        List list = this.f54103;
        if (list != null) {
            this.f54092.mo8755(list);
        }
        this.f54104 = !z2 ? 1 : 0;
        m37217();
    }

    @Override // l.AbstractC4930, l.InterfaceC1837
    /* JADX INFO: renamed from: ۜ */
    public final void mo6095() {
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 != null) {
            int i = this.f54104;
            if (i == 0 || i == 1) {
                this.f54104 = 0;
                return;
            } else {
                interfaceC6599.mo8763();
                return;
            }
        }
        this.f54114.m14439();
    }

    @Override // l.AbstractC15783, l.AbstractC4930
    /* JADX INFO: renamed from: ֫ */
    public final void mo14359(C8353[] c8353Arr, long j, long j2, C15894 c15894) {
        super.mo14359(c8353Arr, j, j2, c15894);
        AbstractC4846 abstractC4846M14366 = m14366();
        if (!abstractC4846M14366.m14110()) {
            c15894.getClass();
            this.f54109 = abstractC4846M14366.mo14105(c15894.f49112, new C22485()).f72801;
        } else {
            this.f54109 = -9223372036854775807L;
        }
    }

    @Override // l.AbstractC15783, l.AbstractC4930
    /* JADX INFO: renamed from: ֫ */
    public final void mo13451(long j, boolean z) throws C18273 {
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 != null && !z) {
            interfaceC6599.mo8766(true);
        }
        super.mo13451(j, z);
        InterfaceC6599 interfaceC65910 = this.f54092;
        C4979 c4979 = this.f54114;
        if (interfaceC65910 == null) {
            c4979.m14450();
        }
        if (z) {
            InterfaceC6599 interfaceC65911 = this.f54092;
            if (interfaceC65911 != null) {
                interfaceC65911.mo8770(false);
            } else {
                c4979.m14447(false);
            }
        }
        m41402();
        this.f54100 = 0;
    }

    @Override // l.AbstractC15783, l.AbstractC4930, l.InterfaceC1837
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6098() {
        if (!super.mo6098()) {
            return false;
        }
        InterfaceC6599 interfaceC6599 = this.f54092;
        return interfaceC6599 == null || interfaceC6599.mo8767();
    }

    @Override // l.AbstractC15783, l.InterfaceC1837
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6101() {
        boolean zMo6101 = super.mo6101();
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 != null) {
            return interfaceC6599.mo8762(zMo6101);
        }
        if (zMo6101 && (m37231() == null || this.f54127)) {
            return true;
        }
        return this.f54114.m14444(zMo6101);
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ܰ */
    public final void mo13466() {
        this.f54086 = 0;
        this.f54094 = m14362().mo33834();
        this.f54111 = 0L;
        this.f54101 = 0;
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 != null) {
            interfaceC6599.mo8765();
        } else {
            this.f54114.m14449();
        }
    }

    @Override // l.AbstractC15783, l.AbstractC4930
    /* JADX INFO: renamed from: ۤ */
    public final void mo13464() {
        C10833 c10833 = this.f54112;
        this.f54105 = null;
        this.f54109 = -9223372036854775807L;
        m41402();
        this.f54120 = false;
        this.f54122 = null;
        this.f54093 = true;
        try {
            super.mo13464();
        } finally {
            c10833.m27089(this.f48681);
            c10833.m27090(C6404.f19812);
        }
    }

    @Override // l.AbstractC15783, l.AbstractC4930
    /* JADX INFO: renamed from: ᩺ */
    public final void mo13473() {
        try {
            super.mo13473();
        } finally {
            this.f54124 = false;
            this.f54116 = -9223372036854775807L;
            C24029 c24029 = this.f54098;
            if (c24029 != null) {
                c24029.release();
                this.f54098 = null;
            }
        }
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ۛ */
    public final void mo13461() {
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 == null || !this.f54106) {
            return;
        }
        interfaceC6599.mo8749();
    }

    @Override // l.AbstractC15783, l.AbstractC4930, l.InterfaceC5783
    /* JADX INFO: renamed from: ֫ */
    public final void mo13450(int i, Object obj) throws C18273 {
        if (i == 1) {
            m41400(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            InterfaceC22618 interfaceC22618 = (InterfaceC22618) obj;
            this.f54123 = interfaceC22618;
            InterfaceC6599 interfaceC6599 = this.f54092;
            if (interfaceC6599 != null) {
                interfaceC6599.mo8759(interfaceC22618);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f54097 != iIntValue) {
                this.f54097 = iIntValue;
                if (this.f54127) {
                    m37211();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            this.f54115 = ((Integer) obj).intValue();
            InterfaceC10846 interfaceC10846M37231 = m37231();
            if (interfaceC10846M37231 != null) {
                interfaceC10846M37231.mo9418(this.f54115);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.f54126 = iIntValue2;
            InterfaceC6599 interfaceC65910 = this.f54092;
            if (interfaceC65910 != null) {
                interfaceC65910.mo8751(iIntValue2);
                return;
            } else {
                this.f54114.m14446(iIntValue2);
                return;
            }
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(InterfaceC16987.f52116)) {
                InterfaceC6599 interfaceC65911 = this.f54092;
                if (interfaceC65911 == null || !interfaceC65911.isInitialized()) {
                    return;
                }
                this.f54092.mo8772();
                return;
            }
            this.f54103 = list;
            InterfaceC6599 interfaceC65912 = this.f54092;
            if (interfaceC65912 != null) {
                interfaceC65912.mo8755(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            C17008 c17008 = (C17008) obj;
            if (c17008.m39892() == 0 || c17008.m39891() == 0) {
                return;
            }
            this.f54095 = c17008;
            InterfaceC6599 interfaceC65913 = this.f54092;
            if (interfaceC65913 != null) {
                Surface surface = this.f54119;
                C22632.m50632(surface);
                interfaceC65913.mo8754(surface, c17008);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.f54087 = ((Integer) obj).intValue();
                InterfaceC10846 interfaceC10846M37232 = m37231();
                if (interfaceC10846M37232 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.f54087));
                    interfaceC10846M37232.mo9422(bundle);
                }
                break;
            case 17:
                Surface surface2 = this.f54119;
                m41400((Object) null);
                obj.getClass();
                ((C17679) obj).mo13450(1, surface2);
                break;
            case 18:
                C20888 c20888 = this.f54117;
                boolean z = c20888 != null && c20888.f67590;
                C20888 c20889 = (C20888) obj;
                this.f54117 = c20889;
                if (z != (c20889 != null && c20889.f67590)) {
                    m37238();
                }
                break;
            default:
                super.mo13450(i, obj);
                break;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m41400(Object obj) throws C18273 {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.f54119;
        C10833 c10833 = this.f54112;
        if (surface2 == surface) {
            if (surface != null) {
                C6404 c6404 = this.f54105;
                if (c6404 != null) {
                    c10833.m27090(c6404);
                }
                Surface surface3 = this.f54119;
                if (surface3 == null || !this.f54120) {
                    return;
                }
                c10833.m27086(surface3);
                return;
            }
            return;
        }
        this.f54119 = surface;
        InterfaceC6599 interfaceC6599 = this.f54092;
        C4979 c4979 = this.f54114;
        if (interfaceC6599 == null) {
            c4979.m14442(surface);
        }
        this.f54120 = false;
        int state = getState();
        InterfaceC10846 interfaceC10846M37231 = m37231();
        if (interfaceC10846M37231 != null && this.f54092 == null) {
            C17195 c17195M37236 = m37236();
            c17195M37236.getClass();
            boolean zM41411 = m41411(c17195M37236);
            int i = Build.VERSION.SDK_INT;
            if (i >= 23 && zM41411 && !this.f54102) {
                Surface surfaceM41406 = m41406(c17195M37236);
                if (i >= 23 && surfaceM41406 != null) {
                    interfaceC10846M37231.mo9423(surfaceM41406);
                } else {
                    if (i < 35) {
                        throw new IllegalStateException();
                    }
                    interfaceC10846M37231.mo9428();
                }
            } else {
                m37211();
                m37237();
            }
        }
        if (surface == null) {
            this.f54105 = null;
            InterfaceC6599 interfaceC65910 = this.f54092;
            if (interfaceC65910 != null) {
                interfaceC65910.mo8764();
            }
        } else {
            C6404 c6405 = this.f54105;
            if (c6405 != null) {
                c10833.m27090(c6405);
            }
        }
        if (state == 2) {
            InterfaceC6599 interfaceC65911 = this.f54092;
            if (interfaceC65911 != null) {
                interfaceC65911.mo8770(true);
            } else {
                c4979.m14447(true);
            }
        }
        m41402();
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo37216(C17195 c17195) {
        return m41411(c17195);
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ܳ֫ */
    public final boolean mo37226() {
        return this.f54127 && Build.VERSION.SDK_INT < 23;
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ֫ */
    public final C23023 mo13449(C17195 c17195, C8353 c8353, MediaCrypto mediaCrypto, float f) {
        C21054 c21054;
        int i;
        C16973 c16973;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        boolean z;
        int iM41397;
        String str = c17195.f52726;
        C8353[] c8353ArrM14361 = m14361();
        int i2 = c8353.f25633;
        float f2 = c8353.f25596;
        C21054 c21055 = c8353.f25637;
        int i3 = c8353.f25609;
        int iM41403 = m41403(c17195, c8353);
        if (c8353ArrM14361.length == 1) {
            if (iM41403 != -1 && (iM41397 = m41397(c17195, c8353)) != -1) {
                iM41403 = Math.min((int) (iM41403 * 1.5f), iM41397);
            }
            c16973 = new C16973(i2, i3, iM41403);
            c21054 = c21055;
            i = i3;
        } else {
            int length = c8353ArrM14361.length;
            int i4 = 0;
            boolean z2 = false;
            int iMax = i2;
            int iMax2 = i3;
            while (i4 < length) {
                int i5 = length;
                C8353 c8353M4440 = c8353ArrM14361[i4];
                C8353[] c8353Arr = c8353ArrM14361;
                if (c21055 != null && c8353M4440.f25637 == null) {
                    C1297 c1297M21948 = c8353M4440.m21948();
                    c1297M21948.m4448(c21055);
                    c8353M4440 = c1297M21948.m4440();
                }
                C13396 c13396M40451 = c17195.m40451(c8353, c8353M4440);
                int i6 = c8353M4440.f25609;
                if (c13396M40451.f40048 != 0) {
                    int i7 = c8353M4440.f25633;
                    boolean z3 = i7 == -1 || i6 == -1;
                    iMax = Math.max(iMax, i7);
                    iMax2 = Math.max(iMax2, i6);
                    iM41403 = Math.max(iM41403, m41403(c17195, c8353M4440));
                    z2 = z3 | z2;
                }
                i4++;
                length = i5;
                c8353ArrM14361 = c8353Arr;
                c21055 = c21055;
            }
            c21054 = c21055;
            if (z2) {
                C19956.m46037("Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z4 = i3 > i2;
                int i8 = z4 ? i3 : i2;
                int i9 = z4 ? i2 : i3;
                float f3 = i9 / i8;
                int i10 = 0;
                while (true) {
                    if (i10 < 9) {
                        int i11 = f54083[i10];
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
                            MediaCodecInfo.CodecCapabilities codecCapabilities = c17195.f52723;
                            if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                point = null;
                            } else {
                                int widthAlignment = videoCapabilities.getWidthAlignment();
                                int heightAlignment = videoCapabilities.getHeightAlignment();
                                point = new Point(C3603.m10999(i11, widthAlignment) * widthAlignment, C3603.m10999(i12, heightAlignment) * heightAlignment);
                            }
                            if (point != null && c17195.m40452(point.x, point.y, f2)) {
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
                    C1297 c1297M21949 = c8353.m21948();
                    c1297M21949.m4453(iMax);
                    c1297M21949.m4457(iMax2);
                    iM41403 = Math.max(iM41403, m41397(c17195, c1297M21949.m4440()));
                    C19956.m46037("Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            } else {
                i = i3;
            }
            c16973 = new C16973(iMax, iMax2, iM41403);
        }
        this.f54121 = c16973;
        int i13 = this.f54127 ? this.f54097 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i2);
        mediaFormat.setInteger("height", i);
        C12899.m31338(mediaFormat, c8353.f25634);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        C12899.m31337(mediaFormat, "rotation-degrees", c8353.f25599);
        C12899.m31339(mediaFormat, c21054);
        if ("video/dolby-vision".equals(c8353.f25614)) {
            int i14 = C22134.f71829;
            Pair pairM41768 = C17839.m41768(c8353);
            if (pairM41768 != null) {
                C12899.m31337(mediaFormat, "profile", ((Integer) pairM41768.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", c16973.f52084);
        mediaFormat.setInteger("max-height", c16973.f52082);
        C12899.m31337(mediaFormat, "max-input-size", c16973.f52083);
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 23) {
            mediaFormat.setInteger(MessageHandler.Properties.Priority, 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.f54118) {
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
            mediaFormat.setInteger("importance", Math.max(0, -this.f54087));
        }
        Surface surfaceM41406 = m41406(c17195);
        if (this.f54092 != null && !C3603.m11043(this.f54088)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return C23023.m51162(c17195, mediaFormat, c8353, surfaceM41406, mediaCrypto);
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ֫ */
    public final C13396 mo13448(C17195 c17195, C8353 c8353, C8353 c8354) {
        C13396 c13396M40451 = c17195.m40451(c8353, c8354);
        int i = c13396M40451.f40046;
        C16973 c16973 = this.f54121;
        c16973.getClass();
        if (c8354.f25633 > c16973.f52084 || c8354.f25609 > c16973.f52082) {
            i |= 256;
        }
        if (m41403(c17195, c8354) > c16973.f52083) {
            i |= 64;
        }
        int i2 = i;
        return new C13396(c17195.f52721, c8353, c8354, i2 != 0 ? 0 : c13396M40451.f40048, i2);
    }

    @Override // l.AbstractC15783, l.InterfaceC1837
    /* JADX INFO: renamed from: ֫ */
    public final void mo6088(long j, long j2) throws C18273 {
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 != null) {
            try {
                interfaceC6599.mo8753(j, j2);
            } catch (C23532 e) {
                throw m14356(e, e.f75554, 7001);
            }
        }
        super.mo6088(j, j2);
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ֨֫ */
    public final void mo37212() {
        super.mo37212();
        this.f54085.clear();
        this.f54110 = 0;
        this.f54113 = 0;
        this.f54093 = false;
    }

    @Override // l.AbstractC15783, l.AbstractC4930, l.InterfaceC1837
    /* JADX INFO: renamed from: ֫ */
    public final void mo6085(float f, float f2) throws C18273 {
        super.mo6085(f, f2);
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 != null) {
            interfaceC6599.mo8750(f);
        } else {
            this.f54114.m14445(f);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m41397(C17195 c17195, C8353 c8353) {
        int i = c8353.f25633;
        int i2 = c8353.f25609;
        if (i != -1 && i2 != -1) {
            String str = c8353.f25614;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                int i3 = C22134.f71829;
                Pair pairM41768 = C17839.m41768(c8353);
                if (pairM41768 == null) {
                    str = "video/hevc";
                } else {
                    int iIntValue = ((Integer) pairM41768.first).intValue();
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
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !c17195.f52725)))) {
                        return ((C3603.m10999(i2, 16) * C3603.m10999(i, 16)) * 768) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    return ((i * i2) * 3) / 8;
            }
        }
        return -1;
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ֫ */
    public final float mo13444(float f, C8353 c8353, C8353[] c8353Arr) {
        C17195 c17195M37236;
        float fMax = -1.0f;
        for (C8353 c8354 : c8353Arr) {
            float f2 = c8354.f25596;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        float f3 = fMax == -1.0f ? -1.0f : f * fMax;
        if (this.f54117 == null || (c17195M37236 = m37236()) == null) {
            return f3;
        }
        float fM40450 = c17195M37236.m40450(c8353.f25633, c8353.f25609);
        return f3 != -1.0f ? Math.max(f3, fM40450) : fM40450;
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo37230(C8353 c8353) throws C18273 {
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 == null || interfaceC6599.isInitialized()) {
            return true;
        }
        try {
            return this.f54092.mo8761(c8353);
        } catch (C23532 e) {
            throw m14356(e, c8353, 7000);
        }
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ֫ */
    public final void mo13454(String str, long j, long j2) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        this.f54112.m27088(str, j, j2);
        this.f54102 = m41405(str);
        C17195 c17195M37236 = m37236();
        c17195M37236.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(c17195M37236.f52722)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = c17195M37236.f52723;
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
        this.f54096 = z;
        m41402();
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ֫ */
    public final void mo13453(String str) {
        this.f54112.m27087(str);
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ֫ */
    public final void mo13452(Exception exc) {
        C19956.m46034("Video codec error", exc);
        this.f54112.m27085(exc);
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ᩹֫ */
    public final boolean mo37241() {
        C17195 c17195M37236 = m37236();
        if (this.f54092 != null && c17195M37236 != null) {
            String str = c17195M37236.f52721;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.mo37241();
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ᩸֫ */
    public final boolean mo37240() {
        C8353 c8353M37233 = m37233();
        C20888 c20888 = this.f54117;
        if (c20888 == null || !c20888.f67586 || this.f54093 || this.f54127) {
            return true;
        }
        return (c8353M37233 != null && c8353M37233.f25617 > 0) || m37218() || m37220() != -9223372036854775807L;
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ֫ */
    public final C13396 mo13447(C3002 c3002) throws C18273 {
        C13396 c13396Mo13447 = super.mo13447(c3002);
        C8353 c8353 = c3002.f9455;
        c8353.getClass();
        this.f54112.m27091(c8353, c13396Mo13447);
        return c13396Mo13447;
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ܽ */
    public final void mo37229(C21843 c21843) {
        this.f54113 = 0;
        int iMo37213 = mo37213(c21843);
        int i = Build.VERSION.SDK_INT;
        if ((i < 34 || (iMo37213 & 32) == 0) && !this.f54127) {
            this.f54110++;
        }
        if (i >= 23 || !this.f54127) {
            return;
        }
        m41417(c21843.f69997);
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ֫ */
    public final int mo37213(C21843 c21843) {
        C20888 c20888;
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.f54099 || (((c20888 = this.f54117) != null && c20888.f67589) || this.f54127)) && c21843.f69997 < m14371() && !m41409(c21843)) ? 32 : 0;
        }
        return 0;
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo37235(C21843 c21843) {
        boolean z = false;
        if (!m41409(c21843)) {
            boolean z2 = c21843.f69997 < m14371();
            if (z2 && !c21843.m12694()) {
                if (c21843.m12692()) {
                    c21843.mo7();
                    z = true;
                }
                if (z) {
                    if (z2) {
                        this.f48681.f11181++;
                        return z;
                    }
                    this.f54085.add(Long.valueOf(c21843.f69997));
                    this.f54113++;
                }
                return z;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m41409(C21843 c21843) {
        if (mo6104() || c21843.m12689() || this.f54109 == -9223372036854775807L) {
            return true;
        }
        return this.f54109 - (c21843.f69997 - m37239()) <= 100000;
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ֫ */
    public final void mo13456(C8353 c8353, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        int i;
        int i2;
        InterfaceC10846 interfaceC10846M37231 = m37231();
        if (interfaceC10846M37231 != null) {
            interfaceC10846M37231.mo9418(this.f54115);
        }
        if (!this.f54127) {
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
            i2 = c8353.f25633;
            i = c8353.f25609;
        }
        float f = c8353.f25636;
        int i4 = c8353.f25599;
        if (i4 == 90 || i4 == 270) {
            f = 1.0f / f;
            int i5 = i;
            i = i2;
            i2 = i5;
        }
        this.f54091 = new C6404(i2, i, f);
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 != null && this.f54125) {
            C1297 c1297M21948 = c8353.m21948();
            c1297M21948.m4453(i2);
            c1297M21948.m4457(i);
            c1297M21948.m4460(f);
            C8353 c8353M4440 = c1297M21948.m4440();
            int i6 = this.f54104;
            List listOf = this.f54103;
            if (listOf == null) {
                listOf = AbstractC14545.of();
            }
            interfaceC6599.mo8757(c8353M4440, m37223(), i6, listOf);
            this.f54104 = 2;
        } else {
            this.f54114.m14440(c8353.f25596);
        }
        this.f54125 = false;
    }

    @Override // l.AbstractC15783
    @TargetApi(29)
    /* JADX INFO: renamed from: ۧ */
    public final void mo13465(C21843 c21843) {
        if (this.f54096) {
            ByteBuffer byteBuffer = c21843.f69998;
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
                        InterfaceC10846 interfaceC10846M37231 = m37231();
                        interfaceC10846M37231.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        interfaceC10846M37231.mo9422(bundle);
                    }
                }
            }
        }
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ۚ֫ */
    public final void mo13460() {
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 != null) {
            interfaceC6599.mo8774();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m41417(long j) {
        Surface surface;
        m37232(j);
        C6404 c6404 = this.f54091;
        boolean zEquals = c6404.equals(C6404.f19812);
        C10833 c10833 = this.f54112;
        if (!zEquals && !c6404.equals(this.f54105)) {
            this.f54105 = c6404;
            c10833.m27090(c6404);
        }
        this.f48681.f11172++;
        if (this.f54114.m14448() && (surface = this.f54119) != null) {
            c10833.m27086(surface);
            this.f54120 = true;
        }
        mo37234(j);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m41407(C17679 c17679) {
        c17679.m37227();
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ᩳ */
    public final void mo37234(long j) {
        super.mo37234(j);
        if (this.f54127) {
            return;
        }
        this.f54110--;
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ᩵֫ */
    public final void mo13472() {
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 != null) {
            interfaceC6599.mo8774();
            if (this.f54116 == -9223372036854775807L) {
                this.f54116 = m37223();
            }
            this.f54092.mo8752(-this.f54116);
        } else {
            this.f54114.m14441(2);
        }
        this.f54125 = true;
        m41402();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41412(int i, int i2) {
        int i3;
        C3519 c3519 = this.f48681;
        c3519.f11180 += i;
        int i4 = i + i2;
        c3519.f11178 += i4;
        this.f54086 += i4;
        int i5 = this.f54100 + i4;
        this.f54100 = i5;
        c3519.f11176 = Math.max(i5, c3519.f11176);
        int i6 = this.f54108;
        if (i6 <= 0 || (i3 = this.f54086) < i6 || i3 <= 0) {
            return;
        }
        long jMo33834 = m14362().mo33834();
        this.f54112.m27084(this.f54086, jMo33834 - this.f54094);
        this.f54086 = 0;
        this.f54094 = jMo33834;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m41418(long j) {
        C3519 c3519 = this.f48681;
        c3519.f11173 += j;
        c3519.f11177++;
        this.f54111 += j;
        this.f54101++;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m41411(C17195 c17195) {
        if (this.f54092 != null) {
            return true;
        }
        Surface surface = this.f54119;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && c17195.f52728) || m41416(c17195);
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private Surface m41406(C17195 c17195) {
        boolean z = c17195.f52725;
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 != null) {
            return interfaceC6599.mo8771();
        }
        Surface surface = this.f54119;
        if (surface != null) {
            return surface;
        }
        if (Build.VERSION.SDK_INT >= 35 && c17195.f52728) {
            return null;
        }
        C22632.m50634(m41416(c17195));
        C24029 c24029 = this.f54098;
        if (c24029 != null && c24029.f77856 != z && c24029 != null) {
            c24029.release();
            this.f54098 = null;
        }
        if (this.f54098 == null) {
            this.f54098 = C24029.m52871(this.f54088, z);
        }
        return this.f54098;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m41416(C17195 c17195) {
        if (Build.VERSION.SDK_INT < 23 || this.f54127 || m41405(c17195.f52721)) {
            return false;
        }
        return !c17195.f52725 || C24029.m52872(this.f54088);
    }

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    private void m41402() {
        int i;
        InterfaceC10846 interfaceC10846M37231;
        if (!this.f54127 || (i = Build.VERSION.SDK_INT) < 23 || (interfaceC10846M37231 = m37231()) == null) {
            return;
        }
        this.f54122 = new C18385(this, interfaceC10846M37231);
        if (i >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            interfaceC10846M37231.mo9422(bundle);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m41404(C17679 c17679) {
        c17679.f54112.m27086(c17679.f54119);
        c17679.f54120 = true;
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ۟ */
    public final void mo13462() {
        int i = this.f54086;
        C10833 c10833 = this.f54112;
        if (i > 0) {
            long jMo33834 = m14362().mo33834();
            c10833.m27084(this.f54086, jMo33834 - this.f54094);
            this.f54086 = 0;
            this.f54094 = jMo33834;
        }
        int i2 = this.f54101;
        if (i2 != 0) {
            c10833.m27092(i2, this.f54111);
            this.f54111 = 0L;
            this.f54101 = 0;
        }
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 != null) {
            interfaceC6599.mo8773();
        } else {
            this.f54114.m14451();
        }
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ֫ */
    public final C17901 mo37214(IllegalStateException illegalStateException, C17195 c17195) {
        Surface surface = this.f54119;
        C23051 c23051 = new C23051(illegalStateException, c17195);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return c23051;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m41403(C17195 c17195, C8353 c8353) {
        int i = c8353.f25601;
        List list = c8353.f25634;
        if (i != -1) {
            int size = list.size();
            int length = 0;
            for (int i2 = 0; i2 < size; i2++) {
                length += ((byte[]) list.get(i2)).length;
            }
            return c8353.f25601 + length;
        }
        return m41397(c17195, c8353);
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
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m41405(String str) {
        String str2;
        byte b;
        String str3;
        byte b2;
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C17679.class) {
            if (!f54082) {
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
                                                        b3 = cb.k;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1615810839:
                                                    if (!str3.equals("Phantom6")) {
                                                        b3 = cb.f77931l;
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
                                                        b3 = bo.j;
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
                                                        b3 = bo.h;
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
                                                case HRSS1373Polynomial.K /* 86 */:
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
                                                case q.f /* 99 */:
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
                                                case q.h /* 125 */:
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
                                            b3 = cb.k;
                                        }
                                        break;
                                    case -1615810839:
                                        if (!str3.equals("Phantom6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = cb.f77931l;
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
                                            b3 = bo.j;
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
                                            b3 = bo.h;
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
                                    case HRSS1373Polynomial.K /* 86 */:
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
                                    case q.f /* 99 */:
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
                                    case q.h /* 125 */:
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
                                            b3 = cb.k;
                                        } else {
                                            b3 = -1;
                                        }
                                        break;
                                    case -1615810839:
                                        if (!str3.equals("Phantom6")) {
                                            b3 = cb.f77931l;
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
                                            b3 = bo.j;
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
                                            b3 = bo.h;
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
                                    case HRSS1373Polynomial.K /* 86 */:
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
                                    case q.f /* 99 */:
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
                                    case q.h /* 125 */:
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
                f54084 = z;
                f54082 = true;
            }
        }
        return f54084;
    }
}
