package p067l;

import android.content.Context;
import android.content.ContextWrapper;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import com.google.android.material.internal.ManufacturerUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import net.engio.mbassy.listener.MessageHandler;

/* JADX INFO: renamed from: l.ۙۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P8OZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6719 extends AbstractC17368 implements InterfaceC23996 {

    /* JADX INFO: renamed from: ֡ܽ */
    public C10307 f17431;

    /* JADX INFO: renamed from: ֨ܽ */
    public final C13521 f17432;

    /* JADX INFO: renamed from: ۖܽ */
    public long f17433;

    /* JADX INFO: renamed from: ۘܽ */
    public C10307 f17434;

    /* JADX INFO: renamed from: ۚܽ */
    public boolean f17435;

    /* JADX INFO: renamed from: ۜܽ */
    public boolean f17436;

    /* JADX INFO: renamed from: ۠ܽ */
    public long f17437;

    /* JADX INFO: renamed from: ۡܽ */
    public boolean f17438;

    /* JADX INFO: renamed from: ۢܽ */
    public boolean f17439;

    /* JADX INFO: renamed from: ܳܽ */
    public boolean f17440;

    /* JADX INFO: renamed from: ܶܽ */
    public int f17441;

    /* JADX INFO: renamed from: ܺܽ */
    public final Context f17442;

    /* JADX INFO: renamed from: ᩴܽ */
    public final C2753 f17443;

    /* JADX INFO: renamed from: ᩵ܽ */
    public boolean f17444;

    /* JADX INFO: renamed from: ᩷ܽ */
    public int f17445;

    /* JADX INFO: renamed from: ᩻ܽ */
    public final C10072 f17446;

    @Override // p067l.InterfaceC4114, p067l.InterfaceC19537
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // p067l.AbstractC7054, p067l.InterfaceC4114
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC23996 mo8292() {
        return this;
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo15346(long j, long j2, InterfaceC12676 interfaceC12676, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C10307 c10307) throws C19735 {
        byteBuffer.getClass();
        this.f17437 = -9223372036854775807L;
        if (this.f17434 != null && (i2 & 2) != 0) {
            interfaceC12676.getClass();
            interfaceC12676.mo11472(i);
            return true;
        }
        C10072 c10072 = this.f17446;
        if (z) {
            if (interfaceC12676 != null) {
                interfaceC12676.mo11472(i);
            }
            this.f51820.f13980 += i3;
            c10072.mo15479();
            return true;
        }
        try {
            if (c10072.mo15469(i3, j3, byteBuffer)) {
                if (interfaceC12676 != null) {
                    interfaceC12676.mo11472(i);
                }
                this.f51820.f13978 += i3;
                return true;
            }
            this.f17437 = j3;
            return false;
        } catch (C16834 e) {
            throw m16254(e, this.f17431, e.f49831, (!m39389() || m16264().f56351 == 0) ? 5001 : 5004);
        } catch (C21530 e2) {
            throw m16254(e2, c10307, e2.f67923, (!m39389() || m16264().f56351 == 0) ? 5002 : 5003);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:47:0x009d  */
    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ֫ */
    public final int mo15333(InterfaceC4629 interfaceC4629, C10307 c10307) {
        int iM15329;
        List listM52070;
        boolean z;
        int iM29410 = C12832.m29410(1, 0, 0, 0);
        String str = c10307.f28528;
        String str2 = c10307.f28528;
        if (!C11669.m26825(str)) {
            return C12832.m29410(0, 0, 0, 0);
        }
        int i = c10307.f28546;
        boolean z2 = i != 0;
        boolean z3 = i == 0 || i == 2;
        int i2 = 8;
        C10072 c10072 = this.f17446;
        if (z3) {
            if (z2) {
                List listM52069 = C23404.m52069("audio/raw", false, false);
                if ((listM52069.isEmpty() ? null : (C18710) listM52069.get(0)) == null) {
                    iM15329 = 0;
                }
            }
            iM15329 = m15329(c10307);
            if (c10072.mo15470(c10307)) {
                return C12832.m29410(4, 8, 32, iM15329);
            }
        } else {
            iM15329 = 0;
        }
        if ((!"audio/raw".equals(str2) || c10072.mo15470(c10307)) && c10072.mo15470(C5792.m13025(2, c10307.f28539, c10307.f28538))) {
            if (str2 == null) {
                listM52070 = AbstractC16192.m36872of();
            } else if (c10072.mo15470(c10307)) {
                List listM520610 = C23404.m52069("audio/raw", false, false);
                C18710 c18710 = listM520610.isEmpty() ? null : (C18710) listM520610.get(0);
                if (c18710 != null) {
                    listM52070 = AbstractC16192.m36873of((Object) c18710);
                } else {
                    listM52070 = C23404.m52070(interfaceC4629, c10307, false, false);
                }
            } else {
                listM52070 = C23404.m52070(interfaceC4629, c10307, false, false);
            }
            if (!((AbstractCollection) listM52070).isEmpty()) {
                if (!z3) {
                    return C12832.m29410(2, 0, 0, 0);
                }
                C18710 c18711 = (C18710) listM52070.get(0);
                boolean zM42700 = c18711.m42700(c10307);
                if (!zM42700) {
                    int i3 = 1;
                    while (true) {
                        if (i3 >= listM52070.size()) {
                            z = true;
                            break;
                        }
                        C18710 c18712 = (C18710) listM52070.get(i3);
                        if (c18712.m42700(c10307)) {
                            zM42700 = true;
                            c18711 = c18712;
                            z = false;
                            break;
                        }
                        i3++;
                    }
                } else {
                    z = true;
                    break;
                }
                int i4 = zM42700 ? 4 : 3;
                if (zM42700 && c18711.m42701(c10307)) {
                    i2 = 16;
                }
                return (c18711.f55908 ? 64 : 0) | i4 | i2 | 32 | (z ? 128 : 0) | iM15329;
            }
        }
        return iM29410;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6719(ContextWrapper contextWrapper, InterfaceC15531 interfaceC15531, Handler handler, InterfaceC7448 interfaceC7448, C10072 c10072) {
        super(1, interfaceC15531, InterfaceC4629.f10376, false, 44100.0f);
        C13521 c13521 = Build.VERSION.SDK_INT >= 35 ? new C13521() : null;
        this.f17442 = contextWrapper.getApplicationContext();
        this.f17446 = c10072;
        this.f17432 = c13521;
        this.f17441 = -1000;
        this.f17443 = new C2753(handler, interfaceC7448);
        this.f17437 = -9223372036854775807L;
        c10072.mo15466(new C21472(this));
    }

    /* JADX INFO: renamed from: ܿ */
    private int m15329(C10307 c10307) {
        C17505 c17505M23535 = this.f17446.m23535(c10307);
        if (!c17505M23535.f52340) {
            return 0;
        }
        int i = c17505M23535.f52341 ? 1536 : 512;
        return c17505M23535.f52342 ? i | 2048 : i;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo15334(InterfaceC4629 interfaceC4629, C10307 c10307, boolean z) {
        List listM52070;
        if (c10307.f28528 == null) {
            listM52070 = AbstractC16192.m36872of();
        } else if (this.f17446.mo15470(c10307)) {
            List listM52069 = C23404.m52069("audio/raw", false, false);
            C18710 c18710 = listM52069.isEmpty() ? null : (C18710) listM52069.get(0);
            if (c18710 != null) {
                listM52070 = AbstractC16192.m36873of((Object) c18710);
            } else {
                listM52070 = C23404.m52070(interfaceC4629, c10307, z, false);
            }
        } else {
            listM52070 = C23404.m52070(interfaceC4629, c10307, z, false);
        }
        return C23404.m52067(listM52070, c10307);
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo15358(C10307 c10307) {
        if (m16264().f56351 != 0) {
            int iM15329 = m15329(c10307);
            if ((iM15329 & 512) != 0) {
                if (m16264().f56351 == 2 || (iM15329 & 1024) != 0) {
                    return true;
                }
                if (c10307.f28543 == 0 && c10307.f28544 == 0) {
                    return true;
                }
            }
        }
        return this.f17446.mo15470(c10307);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ֫ */
    public final C24249 mo15337(C18710 c18710, C10307 c10307, MediaCrypto mediaCrypto, float f) {
        boolean z;
        C10307[] c10307ArrM16258 = m16258();
        int iM15323 = m15323(c18710, c10307);
        String str = c18710.f55902;
        if (c10307ArrM16258.length != 1) {
            for (C10307 c10308 : c10307ArrM16258) {
                if (c18710.m42697(c10307, c10308).f43118 != 0) {
                    iM15323 = Math.max(iM15323, m15323(c18710, c10308));
                }
            }
        }
        this.f17445 = iM15323;
        int i = Build.VERSION.SDK_INT;
        if (i < 24 && "OMX.SEC.aac.dec".equals(str) && ManufacturerUtils.SAMSUNG.equals(Build.MANUFACTURER)) {
            String str2 = Build.DEVICE;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.f17439 = z;
        this.f17438 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str3 = c18710.f55907;
        int i2 = this.f17445;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        int i3 = c10307.f28539;
        String str4 = c10307.f28528;
        mediaFormat.setInteger("channel-count", i3);
        int i4 = c10307.f28538;
        mediaFormat.setInteger("sample-rate", i4);
        C14627.m33424(mediaFormat, c10307.f28548);
        C14627.m33423(mediaFormat, "max-input-size", i2);
        if (i >= 23) {
            mediaFormat.setInteger(MessageHandler.Properties.Priority, 0);
            if (f != -1.0f) {
                if (i != 23) {
                    mediaFormat.setFloat("operating-rate", f);
                } else {
                    String str5 = Build.MODEL;
                    if (!"ZTE B2017G".equals(str5) && !"AXON 7 mini".equals(str5)) {
                        mediaFormat.setFloat("operating-rate", f);
                    }
                }
            }
        }
        if ("audio/ac4".equals(str4)) {
            Pair pairM44014 = C19322.m44014(c10307);
            if (pairM44014 != null) {
                C14627.m33423(mediaFormat, "profile", ((Integer) pairM44014.first).intValue());
                C14627.m33423(mediaFormat, "level", ((Integer) pairM44014.second).intValue());
            }
            if (i <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (i >= 24) {
            if (this.f17446.mo15473(C5792.m13025(4, c10307.f28539, i4)) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        if (i >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f17441));
        }
        this.f17434 = (!"audio/raw".equals(c18710.f55903) || "audio/raw".equals(str4)) ? null : c10307;
        return C24249.m53554(c18710, mediaFormat, c10307, mediaCrypto, this.f17432);
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ֫ */
    public final C15100 mo15336(C18710 c18710, C10307 c10307, C10307 c10308) {
        C15100 c15100M42697 = c18710.m42697(c10307, c10308);
        int i = c15100M42697.f43116;
        if (m39394(c10308)) {
            i |= 32768;
        }
        if (m15323(c18710, c10308) > this.f17445) {
            i |= 64;
        }
        int i2 = i;
        return new C15100(c18710.f55902, c10307, c10308, i2 != 0 ? 0 : c15100M42697.f43118, i2);
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ܽ */
    public final long mo15355(long j, long j2) {
        boolean z = this.f17437 != -9223372036854775807L;
        if (!this.f17435) {
            if (z || super.mo8296()) {
                return 1000000L;
            }
        } else {
            C10072 c10072 = this.f17446;
            long jMo15478 = c10072.mo15478();
            if (z && jMo15478 != -9223372036854775807L) {
                return Math.max(10000L, ((long) ((Math.min(jMo15478, this.f17437 - j) / (c10072.mo15476() != null ? c10072.mo15476().f11305 : 1.0f)) / 2.0f)) - (C5792.m12990(m16259().mo35966()) - j2));
            }
        }
        return 10000L;
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ֫ */
    public final float mo15332(float f, C10307 c10307, C10307[] c10307Arr) {
        int iMax = -1;
        for (C10307 c10308 : c10307Arr) {
            int i = c10308.f28538;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ֫ */
    public final void mo15342(String str, long j, long j2) {
        this.f17443.m4307(str, j, j2);
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ֫ */
    public final void mo15341(String str) {
        this.f17443.m4306(str);
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ֫ */
    public final void mo15340(Exception exc) {
        C21334.m48348("Audio codec error", exc);
        this.f17443.m4305(exc);
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ֫ */
    public final C15100 mo15335(C5221 c5221) throws C19735 {
        C10307 c10307 = c5221.f12253;
        c10307.getClass();
        this.f17431 = c10307;
        C15100 c15100Mo15335 = super.mo15335(c5221);
        this.f17443.m4310(c10307, c15100Mo15335);
        return c15100Mo15335;
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ֫ */
    public final void mo15344(C10307 c10307, MediaFormat mediaFormat) throws C19735 {
        int iM12979;
        C10307 c10308 = this.f17434;
        int[] iArr = null;
        if (c10308 != null) {
            c10307 = c10308;
        } else if (m39401() != null) {
            mediaFormat.getClass();
            String str = c10307.f28528;
            int i = c10307.f28539;
            if ("audio/raw".equals(str)) {
                iM12979 = c10307.f28519;
            } else if (Build.VERSION.SDK_INT >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                iM12979 = mediaFormat.getInteger("pcm-encoding");
            } else {
                iM12979 = mediaFormat.containsKey("v-bits-per-sample") ? C5792.m12979(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            }
            C3601 c3601 = new C3601();
            c3601.m6697("audio/raw");
            c3601.m6707(iM12979);
            c3601.m6709(c10307.f28543);
            c3601.m6690(c10307.f28544);
            c3601.m6681(c10307.f28526);
            c3601.m6676(c10307.f28524);
            c3601.m6701(c10307.f28535);
            c3601.m6705(c10307.f28549);
            c3601.m6695(c10307.f28545);
            c3601.m6703(c10307.f28517);
            c3601.m6698(c10307.f28542);
            c3601.m6686(c10307.f28522);
            c3601.m6704(mediaFormat.getInteger("channel-count"));
            c3601.m6688(mediaFormat.getInteger("sample-rate"));
            c10307 = c3601.m6672();
            int i2 = c10307.f28539;
            if (this.f17439 && i2 == 6 && i < 6) {
                iArr = new int[i];
                for (int i3 = 0; i3 < i; i3++) {
                    iArr[i3] = i3;
                }
            } else if (this.f17438) {
                if (i2 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i2 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i2 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i2 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i2 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
        }
        try {
            int i4 = Build.VERSION.SDK_INT;
            C10072 c10072 = this.f17446;
            if (i4 >= 29) {
                if (m39389() && m16264().f56351 != 0) {
                    c10072.m23534(m16264().f56351);
                } else {
                    c10072.m23534(0);
                }
            }
            c10072.mo15461(c10307, iArr);
        } catch (C10130 e) {
            throw m16253(e, e.f28079, 5001);
        }
    }

    /* JADX INFO: renamed from: ۙ֫ */
    public final void m15347() {
        this.f17440 = true;
    }

    @Override // p067l.AbstractC17368, p067l.AbstractC7054
    /* JADX INFO: renamed from: ֫ */
    public final void mo15345(boolean z, boolean z2) {
        super.mo15345(z, z2);
        this.f17443.m4314(this.f51820);
        boolean z3 = m16264().f56352;
        C10072 c10072 = this.f17446;
        if (z3) {
            c10072.mo15472();
        } else {
            c10072.mo15475();
        }
        c10072.mo15462(m16266());
        c10072.mo15463(m16259());
    }

    @Override // p067l.AbstractC17368, p067l.AbstractC7054
    /* JADX INFO: renamed from: ֫ */
    public final void mo15339(long j, boolean z) throws C19735 {
        super.mo15339(j, z);
        this.f17446.flush();
        this.f17433 = j;
        this.f17437 = -9223372036854775807L;
        this.f17444 = false;
        this.f17440 = true;
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ܰ */
    public final void mo15354() {
        this.f17446.mo15477();
        this.f17435 = true;
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ۟ */
    public final void mo15350() {
        m15325();
        this.f17435 = false;
        this.f17446.pause();
    }

    @Override // p067l.AbstractC17368, p067l.AbstractC7054
    /* JADX INFO: renamed from: ۤ */
    public final void mo15352() {
        C2753 c2753 = this.f17443;
        this.f17436 = true;
        this.f17431 = null;
        this.f17437 = -9223372036854775807L;
        try {
            this.f17446.flush();
            try {
                super.mo15352();
            } finally {
                c2753.m4309(this.f51820);
            }
        } catch (Throwable th) {
            try {
                super.mo15352();
                throw th;
            } finally {
                c2753.m4309(this.f51820);
            }
        }
    }

    @Override // p067l.AbstractC17368, p067l.AbstractC7054
    /* JADX INFO: renamed from: ᩺ */
    public final void mo15361() {
        C10072 c10072 = this.f17446;
        this.f17444 = false;
        this.f17437 = -9223372036854775807L;
        try {
            super.mo15361();
        } finally {
            if (this.f17436) {
                this.f17436 = false;
                c10072.reset();
            }
        }
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ۛ */
    public final void mo15349() {
        C13521 c13521;
        this.f17446.m23533();
        if (Build.VERSION.SDK_INT < 35 || (c13521 = this.f17432) == null) {
            return;
        }
        c13521.m30683();
    }

    @Override // p067l.AbstractC17368, p067l.AbstractC7054, p067l.InterfaceC4114
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8296() {
        return super.mo8296() && this.f17446.mo15474();
    }

    @Override // p067l.AbstractC17368, p067l.InterfaceC4114
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo8299() {
        return this.f17446.mo15468() || super.mo8299();
    }

    @Override // p067l.InterfaceC23996
    /* JADX INFO: renamed from: ᩴ */
    public final long mo15359() {
        if (getState() == 2) {
            m15325();
        }
        return this.f17433;
    }

    @Override // p067l.InterfaceC23996
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo15351() {
        boolean z = this.f17444;
        this.f17444 = false;
        return z;
    }

    @Override // p067l.InterfaceC23996
    /* JADX INFO: renamed from: ֫ */
    public final void mo15343(C4963 c4963) {
        this.f17446.mo15460(c4963);
    }

    @Override // p067l.InterfaceC23996
    /* JADX INFO: renamed from: ܽ */
    public final C4963 mo15356() {
        return this.f17446.mo15476();
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ᩵֫ */
    public final void mo15360() {
        this.f17446.mo15479();
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ۚ֫ */
    public final void mo15348() throws C19735 {
        try {
            this.f17446.mo15471();
            if (m39390() != -9223372036854775807L) {
                this.f17437 = m39390();
            }
        } catch (C21530 e) {
            throw m16254(e, e.f67925, e.f67923, m39389() ? 5003 : 5002);
        }
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ܽ */
    public final void mo15357(long j) {
        this.f17446.getClass();
    }

    @Override // p067l.AbstractC17368, p067l.AbstractC7054, p067l.InterfaceC7864
    /* JADX INFO: renamed from: ֫ */
    public final void mo15338(int i, Object obj) {
        C13521 c13521;
        C10072 c10072 = this.f17446;
        if (i == 2) {
            obj.getClass();
            c10072.mo15457(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            C19695 c19695 = (C19695) obj;
            c19695.getClass();
            c10072.mo15465(c19695);
            return;
        }
        if (i == 6) {
            C19024 c19024 = (C19024) obj;
            c19024.getClass();
            c10072.mo15464(c19024);
            return;
        }
        if (i == 12) {
            if (Build.VERSION.SDK_INT >= 23) {
                C23483.m52216(c10072, obj);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.f17441 = ((Integer) obj).intValue();
            InterfaceC12676 interfaceC12676M39401 = m39401();
            if (interfaceC12676M39401 != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f17441));
                interfaceC12676M39401.mo11465(bundle);
                return;
            }
            return;
        }
        if (i == 9) {
            obj.getClass();
            c10072.mo15467(((Boolean) obj).booleanValue());
        } else {
            if (i != 10) {
                super.mo15338(i, obj);
                return;
            }
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            c10072.mo15458(iIntValue);
            if (Build.VERSION.SDK_INT < 35 || (c13521 = this.f17432) == null) {
                return;
            }
            c13521.m30684(iIntValue);
        }
    }

    @Override // p067l.AbstractC17368
    /* JADX INFO: renamed from: ۧ */
    public final void mo15353(C23128 c23128) {
        C10307 c10307;
        if (Build.VERSION.SDK_INT < 29 || (c10307 = c23128.f72703) == null || !C12826.equals(c10307.f28528, "audio/opus") || !m39389()) {
            return;
        }
        ByteBuffer byteBuffer = c23128.f72707;
        byteBuffer.getClass();
        C10307 c10308 = c23128.f72703;
        c10308.getClass();
        int i = c10308.f28543;
        if (byteBuffer.remaining() == 8) {
            this.f17446.m23531(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int m15323(C18710 c18710, C10307 c10307) {
        int i;
        if (!"OMX.google.raw.decoder".equals(c18710.f55902) || (i = Build.VERSION.SDK_INT) >= 24 || (i == 23 && C5792.m13026(this.f17442))) {
            return c10307.f28515;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۗ֫ */
    private void m15325() {
        mo8296();
        long jMo15480 = this.f17446.mo15480();
        if (jMo15480 != Long.MIN_VALUE) {
            if (!this.f17440) {
                jMo15480 = Math.max(this.f17433, jMo15480);
            }
            this.f17433 = jMo15480;
            this.f17440 = false;
        }
    }
}
