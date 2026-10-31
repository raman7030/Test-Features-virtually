package l;

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
public final class C4578 extends AbstractC15783 implements InterfaceC22757 {

    /* JADX INFO: renamed from: ֡ܽ, reason: not valid java name and contains not printable characters */
    public C8353 f14602;

    /* JADX INFO: renamed from: ֨ܽ, reason: not valid java name and contains not printable characters */
    public final C11735 f14603;

    /* JADX INFO: renamed from: ۖܽ, reason: not valid java name and contains not printable characters */
    public long f14604;

    /* JADX INFO: renamed from: ۘܽ, reason: not valid java name and contains not printable characters */
    public C8353 f14605;

    /* JADX INFO: renamed from: ۚܽ, reason: not valid java name and contains not printable characters */
    public boolean f14606;

    /* JADX INFO: renamed from: ۜܽ, reason: not valid java name and contains not printable characters */
    public boolean f14607;

    /* JADX INFO: renamed from: ۠ܽ, reason: not valid java name and contains not printable characters */
    public long f14608;

    /* JADX INFO: renamed from: ۡܽ, reason: not valid java name and contains not printable characters */
    public boolean f14609;

    /* JADX INFO: renamed from: ۢܽ, reason: not valid java name and contains not printable characters */
    public boolean f14610;

    /* JADX INFO: renamed from: ܳܽ, reason: not valid java name and contains not printable characters */
    public boolean f14611;

    /* JADX INFO: renamed from: ܶܽ, reason: not valid java name and contains not printable characters */
    public int f14612;

    /* JADX INFO: renamed from: ܺܽ, reason: not valid java name and contains not printable characters */
    public final Context f14613;

    /* JADX INFO: renamed from: ᩴܽ, reason: not valid java name and contains not printable characters */
    public final C0405 f14614;

    /* JADX INFO: renamed from: ᩵ܽ, reason: not valid java name and contains not printable characters */
    public boolean f14615;

    /* JADX INFO: renamed from: ᩷ܽ, reason: not valid java name and contains not printable characters */
    public int f14616;

    /* JADX INFO: renamed from: ᩻ܽ, reason: not valid java name and contains not printable characters */
    public final C8106 f14617;

    @Override // l.InterfaceC1837, l.InterfaceC18065
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // l.AbstractC4930, l.InterfaceC1837
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC22757 mo6094() {
        return this;
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo13458(long j, long j2, InterfaceC10846 interfaceC10846, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C8353 c8353) throws C18273 {
        byteBuffer.getClass();
        this.f14608 = -9223372036854775807L;
        if (this.f14605 != null && (i2 & 2) != 0) {
            interfaceC10846.getClass();
            interfaceC10846.mo9429(i);
            return true;
        }
        C8106 c8106 = this.f14617;
        if (z) {
            if (interfaceC10846 != null) {
                interfaceC10846.mo9429(i);
            }
            this.f48681.f11174 += i3;
            c8106.mo13604();
            return true;
        }
        try {
            if (c8106.mo13594(i3, j3, byteBuffer)) {
                if (interfaceC10846 != null) {
                    interfaceC10846.mo9429(i);
                }
                this.f48681.f11172 += i3;
                return true;
            }
            this.f14608 = j3;
            return false;
        } catch (C15221 e) {
            throw m14357(e, this.f14602, e.f46707, (!m37219() || m14367().f53167 == 0) ? 5001 : 5004);
        } catch (C20162 e2) {
            throw m14357(e2, c8353, e2.f65280, (!m37219() || m14367().f53167 == 0) ? 5002 : 5003);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:47:0x009d  */
    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo13445(InterfaceC2379 interfaceC2379, C8353 c8353) {
        int iM13441;
        List listM49732;
        boolean z;
        int iM27348 = C11010.m27348(1, 0, 0, 0);
        String str = c8353.f25614;
        String str2 = c8353.f25614;
        if (!C9786.m24810(str)) {
            return C11010.m27348(0, 0, 0, 0);
        }
        int i = c8353.f25632;
        boolean z2 = i != 0;
        boolean z3 = i == 0 || i == 2;
        int i2 = 8;
        C8106 c8106 = this.f14617;
        if (z3) {
            if (z2) {
                List listM49731 = C22134.m49731("audio/raw", false, false);
                if ((listM49731.isEmpty() ? null : (C17195) listM49731.get(0)) == null) {
                    iM13441 = 0;
                }
            }
            iM13441 = m13441(c8353);
            if (c8106.mo13595(c8353)) {
                return C11010.m27348(4, 8, 32, iM13441);
            }
        } else {
            iM13441 = 0;
        }
        if ((!"audio/raw".equals(str2) || c8106.mo13595(c8353)) && c8106.mo13595(C3603.m11049(2, c8353.f25625, c8353.f25624))) {
            if (str2 == null) {
                listM49732 = AbstractC14545.of();
            } else if (c8106.mo13595(c8353)) {
                List listM49733 = C22134.m49731("audio/raw", false, false);
                C17195 c17195 = listM49733.isEmpty() ? null : (C17195) listM49733.get(0);
                if (c17195 != null) {
                    listM49732 = AbstractC14545.of((Object) c17195);
                } else {
                    listM49732 = C22134.m49732(interfaceC2379, c8353, false, false);
                }
            } else {
                listM49732 = C22134.m49732(interfaceC2379, c8353, false, false);
            }
            if (!((AbstractCollection) listM49732).isEmpty()) {
                if (!z3) {
                    return C11010.m27348(2, 0, 0, 0);
                }
                C17195 c17196 = (C17195) listM49732.get(0);
                boolean zM40454 = c17196.m40454(c8353);
                if (!zM40454) {
                    int i3 = 1;
                    while (true) {
                        if (i3 >= listM49732.size()) {
                            z = true;
                            break;
                        }
                        C17195 c17197 = (C17195) listM49732.get(i3);
                        if (c17197.m40454(c8353)) {
                            zM40454 = true;
                            c17196 = c17197;
                            z = false;
                            break;
                        }
                        i3++;
                    }
                } else {
                    z = true;
                    break;
                }
                int i4 = zM40454 ? 4 : 3;
                if (zM40454 && c17196.m40455(c8353)) {
                    i2 = 16;
                }
                return (c17196.f52727 ? 64 : 0) | i4 | i2 | 32 | (z ? 128 : 0) | iM13441;
            }
        }
        return iM27348;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4578(ContextWrapper contextWrapper, InterfaceC13850 interfaceC13850, Handler handler, InterfaceC5345 interfaceC5345, C8106 c8106) {
        super(1, interfaceC13850, InterfaceC2379.f7585, false, 44100.0f);
        C11735 c11735 = Build.VERSION.SDK_INT >= 35 ? new C11735() : null;
        this.f14613 = contextWrapper.getApplicationContext();
        this.f14617 = c8106;
        this.f14603 = c11735;
        this.f14612 = -1000;
        this.f14614 = new C0405(handler, interfaceC5345);
        this.f14608 = -9223372036854775807L;
        c8106.mo13591(new C20101(this));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private int m13441(C8353 c8353) {
        C15927 c15927M21567 = this.f14617.m21567(c8353);
        if (!c15927M21567.f49193) {
            return 0;
        }
        int i = c15927M21567.f49194 ? 1536 : 512;
        return c15927M21567.f49195 ? i | 2048 : i;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList mo13446(InterfaceC2379 interfaceC2379, C8353 c8353, boolean z) {
        List listM49732;
        if (c8353.f25614 == null) {
            listM49732 = AbstractC14545.of();
        } else if (this.f14617.mo13595(c8353)) {
            List listM49731 = C22134.m49731("audio/raw", false, false);
            C17195 c17195 = listM49731.isEmpty() ? null : (C17195) listM49731.get(0);
            if (c17195 != null) {
                listM49732 = AbstractC14545.of((Object) c17195);
            } else {
                listM49732 = C22134.m49732(interfaceC2379, c8353, z, false);
            }
        } else {
            listM49732 = C22134.m49732(interfaceC2379, c8353, z, false);
        }
        return C22134.m49729(listM49732, c8353);
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean mo13470(C8353 c8353) {
        if (m14367().f53167 != 0) {
            int iM13441 = m13441(c8353);
            if ((iM13441 & 512) != 0) {
                if (m14367().f53167 == 2 || (iM13441 & 1024) != 0) {
                    return true;
                }
                if (c8353.f25629 == 0 && c8353.f25630 == 0) {
                    return true;
                }
            }
        }
        return this.f14617.mo13595(c8353);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23023 mo13449(C17195 c17195, C8353 c8353, MediaCrypto mediaCrypto, float f) {
        boolean z;
        C8353[] c8353ArrM14361 = m14361();
        int iM13435 = m13435(c17195, c8353);
        String str = c17195.f52721;
        if (c8353ArrM14361.length != 1) {
            for (C8353 c8354 : c8353ArrM14361) {
                if (c17195.m40451(c8353, c8354).f40048 != 0) {
                    iM13435 = Math.max(iM13435, m13435(c17195, c8354));
                }
            }
        }
        this.f14616 = iM13435;
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
        this.f14610 = z;
        this.f14609 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str3 = c17195.f52726;
        int i2 = this.f14616;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        int i3 = c8353.f25625;
        String str4 = c8353.f25614;
        mediaFormat.setInteger("channel-count", i3);
        int i4 = c8353.f25624;
        mediaFormat.setInteger("sample-rate", i4);
        C12899.m31338(mediaFormat, c8353.f25634);
        C12899.m31337(mediaFormat, "max-input-size", i2);
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
            Pair pairM41768 = C17839.m41768(c8353);
            if (pairM41768 != null) {
                C12899.m31337(mediaFormat, "profile", ((Integer) pairM41768.first).intValue());
                C12899.m31337(mediaFormat, "level", ((Integer) pairM41768.second).intValue());
            }
            if (i <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (i >= 24) {
            if (this.f14617.mo13598(C3603.m11049(4, c8353.f25625, i4)) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        if (i >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f14612));
        }
        this.f14605 = (!"audio/raw".equals(c17195.f52722) || "audio/raw".equals(str4)) ? null : c8353;
        return C23023.m51161(c17195, mediaFormat, c8353, mediaCrypto, this.f14603);
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13396 mo13448(C17195 c17195, C8353 c8353, C8353 c8354) {
        C13396 c13396M40451 = c17195.m40451(c8353, c8354);
        int i = c13396M40451.f40046;
        if (m37224(c8354)) {
            i |= 32768;
        }
        if (m13435(c17195, c8354) > this.f14616) {
            i |= 64;
        }
        int i2 = i;
        return new C13396(c17195.f52721, c8353, c8354, i2 != 0 ? 0 : c13396M40451.f40048, i2);
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long mo13467(long j, long j2) {
        boolean z = this.f14608 != -9223372036854775807L;
        if (!this.f14606) {
            if (z || super.mo6098()) {
                return 1000000L;
            }
        } else {
            C8106 c8106 = this.f14617;
            long jMo13603 = c8106.mo13603();
            if (z && jMo13603 != -9223372036854775807L) {
                return Math.max(10000L, ((long) ((Math.min(jMo13603, this.f14608 - j) / (c8106.mo13601() != null ? c8106.mo13601().f8510 : 1.0f)) / 2.0f)) - (C3603.m11014(m14362().mo33834()) - j2));
            }
        }
        return 10000L;
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float mo13444(float f, C8353 c8353, C8353[] c8353Arr) {
        int iMax = -1;
        for (C8353 c8354 : c8353Arr) {
            int i = c8354.f25624;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo13454(String str, long j, long j2) {
        this.f14614.m1915(str, j, j2);
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo13453(String str) {
        this.f14614.m1914(str);
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo13452(Exception exc) {
        C19956.m46034("Audio codec error", exc);
        this.f14614.m1913(exc);
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13396 mo13447(C3002 c3002) throws C18273 {
        C8353 c8353 = c3002.f9455;
        c8353.getClass();
        this.f14602 = c8353;
        C13396 c13396Mo13447 = super.mo13447(c3002);
        this.f14614.m1918(c8353, c13396Mo13447);
        return c13396Mo13447;
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo13456(C8353 c8353, MediaFormat mediaFormat) throws C18273 {
        int iM11003;
        C8353 c8354 = this.f14605;
        int[] iArr = null;
        if (c8354 != null) {
            c8353 = c8354;
        } else if (m37231() != null) {
            mediaFormat.getClass();
            String str = c8353.f25614;
            int i = c8353.f25625;
            if ("audio/raw".equals(str)) {
                iM11003 = c8353.f25605;
            } else if (Build.VERSION.SDK_INT >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                iM11003 = mediaFormat.getInteger("pcm-encoding");
            } else {
                iM11003 = mediaFormat.containsKey("v-bits-per-sample") ? C3603.m11003(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            }
            C1297 c1297 = new C1297();
            c1297.m4465("audio/raw");
            c1297.m4475(iM11003);
            c1297.m4477(c8353.f25629);
            c1297.m4458(c8353.f25630);
            c1297.m4449(c8353.f25612);
            c1297.m4444(c8353.f25610);
            c1297.m4469(c8353.f25621);
            c1297.m4473(c8353.f25635);
            c1297.m4463(c8353.f25631);
            c1297.m4471(c8353.f25603);
            c1297.m4466(c8353.f25628);
            c1297.m4454(c8353.f25608);
            c1297.m4472(mediaFormat.getInteger("channel-count"));
            c1297.m4456(mediaFormat.getInteger("sample-rate"));
            c8353 = c1297.m4440();
            int i2 = c8353.f25625;
            if (this.f14610 && i2 == 6 && i < 6) {
                iArr = new int[i];
                for (int i3 = 0; i3 < i; i3++) {
                    iArr[i3] = i3;
                }
            } else if (this.f14609) {
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
            C8106 c8106 = this.f14617;
            if (i4 >= 29) {
                if (m37219() && m14367().f53167 != 0) {
                    c8106.m21566(m14367().f53167);
                } else {
                    c8106.m21566(0);
                }
            }
            c8106.mo13586(c8353, iArr);
        } catch (C8167 e) {
            throw m14356(e, e.f25168, 5001);
        }
    }

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public final void m13459() {
        this.f14611 = true;
    }

    @Override // l.AbstractC15783, l.AbstractC4930
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo13457(boolean z, boolean z2) {
        super.mo13457(z, z2);
        this.f14614.m1922(this.f48681);
        boolean z3 = m14367().f53168;
        C8106 c8106 = this.f14617;
        if (z3) {
            c8106.mo13597();
        } else {
            c8106.mo13600();
        }
        c8106.mo13587(m14369());
        c8106.mo13588(m14362());
    }

    @Override // l.AbstractC15783, l.AbstractC4930
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo13451(long j, boolean z) throws C18273 {
        super.mo13451(j, z);
        this.f14617.flush();
        this.f14604 = j;
        this.f14608 = -9223372036854775807L;
        this.f14615 = false;
        this.f14611 = true;
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo13466() {
        this.f14617.mo13602();
        this.f14606 = true;
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void mo13462() {
        m13437();
        this.f14606 = false;
        this.f14617.pause();
    }

    @Override // l.AbstractC15783, l.AbstractC4930
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo13464() {
        C0405 c0405 = this.f14614;
        this.f14607 = true;
        this.f14602 = null;
        this.f14608 = -9223372036854775807L;
        try {
            this.f14617.flush();
            try {
                super.mo13464();
            } finally {
                c0405.m1917(this.f48681);
            }
        } catch (Throwable th) {
            try {
                super.mo13464();
                throw th;
            } finally {
                c0405.m1917(this.f48681);
            }
        }
    }

    @Override // l.AbstractC15783, l.AbstractC4930
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void mo13473() {
        C8106 c8106 = this.f14617;
        this.f14615 = false;
        this.f14608 = -9223372036854775807L;
        try {
            super.mo13473();
        } finally {
            if (this.f14607) {
                this.f14607 = false;
                c8106.reset();
            }
        }
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void mo13461() {
        C11735 c11735;
        this.f14617.m21565();
        if (Build.VERSION.SDK_INT < 35 || (c11735 = this.f14603) == null) {
            return;
        }
        c11735.m28635();
    }

    @Override // l.AbstractC15783, l.AbstractC4930, l.InterfaceC1837
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6098() {
        return super.mo6098() && this.f14617.mo13599();
    }

    @Override // l.AbstractC15783, l.InterfaceC1837
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6101() {
        return this.f14617.mo13593() || super.mo6101();
    }

    @Override // l.InterfaceC22757
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long mo13471() {
        if (getState() == 2) {
            m13437();
        }
        return this.f14604;
    }

    @Override // l.InterfaceC22757
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean mo13463() {
        boolean z = this.f14615;
        this.f14615 = false;
        return z;
    }

    @Override // l.InterfaceC22757
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo13455(C2730 c2730) {
        this.f14617.mo13585(c2730);
    }

    @Override // l.InterfaceC22757
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2730 mo13468() {
        return this.f14617.mo13601();
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final void mo13472() {
        this.f14617.mo13604();
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final void mo13460() throws C18273 {
        try {
            this.f14617.mo13596();
            if (m37220() != -9223372036854775807L) {
                this.f14608 = m37220();
            }
        } catch (C20162 e) {
            throw m14357(e, e.f65282, e.f65280, m37219() ? 5003 : 5002);
        }
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo13469(long j) {
        this.f14617.getClass();
    }

    @Override // l.AbstractC15783, l.AbstractC4930, l.InterfaceC5783
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo13450(int i, Object obj) {
        C11735 c11735;
        C8106 c8106 = this.f14617;
        if (i == 2) {
            obj.getClass();
            c8106.mo13582(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            C18231 c18231 = (C18231) obj;
            c18231.getClass();
            c8106.mo13590(c18231);
            return;
        }
        if (i == 6) {
            C17525 c17525 = (C17525) obj;
            c17525.getClass();
            c8106.mo13589(c17525);
            return;
        }
        if (i == 12) {
            if (Build.VERSION.SDK_INT >= 23) {
                C22217.m49889(c8106, obj);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.f14612 = ((Integer) obj).intValue();
            InterfaceC10846 interfaceC10846M37231 = m37231();
            if (interfaceC10846M37231 != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f14612));
                interfaceC10846M37231.mo9422(bundle);
                return;
            }
            return;
        }
        if (i == 9) {
            obj.getClass();
            c8106.mo13592(((Boolean) obj).booleanValue());
        } else {
            if (i != 10) {
                super.mo13450(i, obj);
                return;
            }
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            c8106.mo13583(iIntValue);
            if (Build.VERSION.SDK_INT < 35 || (c11735 = this.f14603) == null) {
                return;
            }
            c11735.m28636(iIntValue);
        }
    }

    @Override // l.AbstractC15783
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo13465(C21843 c21843) {
        C8353 c8353;
        if (Build.VERSION.SDK_INT < 29 || (c8353 = c21843.f69994) == null || !C11003.equals(c8353.f25614, "audio/opus") || !m37219()) {
            return;
        }
        ByteBuffer byteBuffer = c21843.f69998;
        byteBuffer.getClass();
        C8353 c8354 = c21843.f69994;
        c8354.getClass();
        int i = c8354.f25629;
        if (byteBuffer.remaining() == 8) {
            this.f14617.m21563(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m13435(C17195 c17195, C8353 c8353) {
        int i;
        if (!"OMX.google.raw.decoder".equals(c17195.f52721) || (i = Build.VERSION.SDK_INT) >= 24 || (i == 23 && C3603.m11050(this.f14613))) {
            return c8353.f25601;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    private void m13437() {
        mo6098();
        long jMo13605 = this.f14617.mo13605();
        if (jMo13605 != Long.MIN_VALUE) {
            if (!this.f14611) {
                jMo13605 = Math.max(this.f14604, jMo13605);
            }
            this.f14604 = jMo13605;
            this.f14611 = false;
        }
    }
}
