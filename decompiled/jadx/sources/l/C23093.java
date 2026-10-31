package l;

import android.util.Pair;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.util.encoders.UTF8;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.᩺ܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8R9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23093 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C19643 f74247;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f74249;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f74258;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f74261;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C18677 f74266;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f74273;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f74276;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f74277;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f74279;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f74280;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public byte[] f74281;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f74282;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public C0331 f74289;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public byte[] f74290;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public int f74291;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f74296;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f74297;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte[] f74298;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public int f74250 = -1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f74295 = -1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f74271 = -1;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f74288 = -1;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f74253 = -1;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f74256 = 0;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public int f74269 = -1;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public float f74294 = 0.0f;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public float f74299 = 0.0f;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public float f74263 = 0.0f;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public byte[] f74278 = null;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public int f74257 = -1;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f74265 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f74293 = -1;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f74268 = -1;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f74262 = -1;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f74255 = 1000;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f74275 = 200;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public float f74287 = -1.0f;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public float f74285 = -1.0f;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public float f74272 = -1.0f;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public float f74283 = -1.0f;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f74264 = -1.0f;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public float f74252 = -1.0f;

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public float f74248 = -1.0f;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public float f74260 = -1.0f;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f74274 = -1.0f;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f74270 = -1.0f;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f74286 = 1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f74251 = -1;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public int f74267 = 8000;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f74284 = 0;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public long f74254 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f74259 = true;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f74292 = "eng";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:141:0x01db  */
    /* JADX WARN: Code duplicated, block: B:288:0x0565  */
    /* JADX WARN: Code duplicated, block: B:293:0x057c  */
    /* JADX WARN: Code duplicated, block: B:294:0x057e  */
    /* JADX WARN: Code duplicated, block: B:297:0x058b  */
    /* JADX WARN: Code duplicated, block: B:298:0x059b  */
    /* JADX WARN: Code duplicated, block: B:300:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:302:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:304:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:307:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:309:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:312:0x05be  */
    /* JADX WARN: Code duplicated, block: B:315:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:318:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:320:0x05da  */
    /* JADX WARN: Code duplicated, block: B:343:0x06be  */
    /* JADX WARN: Code duplicated, block: B:346:0x06db  */
    /* JADX WARN: Code duplicated, block: B:349:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:355:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:356:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:358:0x0705  */
    /* JADX WARN: Code duplicated, block: B:359:0x0708  */
    /* JADX WARN: Code duplicated, block: B:361:0x0712  */
    /* JADX WARN: Code duplicated, block: B:367:0x072a  */
    /* JADX WARN: Code duplicated, block: B:369:0x074b  */
    /* JADX WARN: Code duplicated, block: B:371:0x0751  */
    /* JADX WARN: Code duplicated, block: B:387:0x077c  */
    /* JADX WARN: Code duplicated, block: B:392:0x0796  */
    /* JADX WARN: Code duplicated, block: B:393:0x0799  */
    @EnsuresNonNull({"this.output"})
    @RequiresNonNull({"codecId"})
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51253(InterfaceC21830 interfaceC21830, int i) throws C9080 {
        byte b;
        List listSingletonList;
        int i2;
        String str;
        List list;
        int i3;
        String str2;
        int i4;
        String str3;
        List list2;
        Pair pair;
        String str4;
        String str5;
        String str6;
        String str7;
        int iM11003;
        List list3;
        List list4;
        List listOf;
        List listOf2;
        int i5;
        C1297 c1297;
        int i6;
        int i7;
        int i8;
        float f;
        int iIntValue;
        int i9;
        int i10;
        int i11;
        String str8;
        C19126 c19126M44156;
        List list5;
        String str9 = this.f74277;
        str9.getClass();
        switch (str9) {
            case "V_MPEG4/ISO/AP":
                b = 0;
                break;
            case "V_MPEG4/ISO/SP":
                b = 1;
                break;
            case "A_MS/ACM":
                b = 2;
                break;
            case "A_TRUEHD":
                b = 3;
                break;
            case "A_VORBIS":
                b = 4;
                break;
            case "A_MPEG/L2":
                b = 5;
                break;
            case "A_MPEG/L3":
                b = 6;
                break;
            case "V_MS/VFW/FOURCC":
                b = 7;
                break;
            case "S_DVBSUB":
                b = 8;
                break;
            case "V_MPEG4/ISO/ASP":
                b = 9;
                break;
            case "V_MPEG4/ISO/AVC":
                b = 10;
                break;
            case "S_VOBSUB":
                b = 11;
                break;
            case "A_DTS/LOSSLESS":
                b = 12;
                break;
            case "A_AAC":
                b = cb.k;
                break;
            case "A_AC3":
                b = cb.f77931l;
                break;
            case "A_DTS":
                b = 15;
                break;
            case "V_AV1":
                b = 16;
                break;
            case "V_VP8":
                b = 17;
                break;
            case "V_VP9":
                b = 18;
                break;
            case "S_HDMV/PGS":
                b = 19;
                break;
            case "V_THEORA":
                b = 20;
                break;
            case "A_DTS/EXPRESS":
                b = 21;
                break;
            case "A_PCM/FLOAT/IEEE":
                b = 22;
                break;
            case "A_PCM/INT/BIG":
                b = 23;
                break;
            case "A_PCM/INT/LIT":
                b = 24;
                break;
            case "S_TEXT/ASS":
                b = 25;
                break;
            case "S_TEXT/SSA":
                b = 26;
                break;
            case "V_MPEGH/ISO/HEVC":
                b = 27;
                break;
            case "S_TEXT/WEBVTT":
                b = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                break;
            case "S_TEXT/UTF8":
                b = 29;
                break;
            case "V_MPEG2":
                b = 30;
                break;
            case "A_EAC3":
                b = bo.j;
                break;
            case "A_FLAC":
                b = UTF8.S_CS3;
                break;
            case "A_OPUS":
                b = PublicSuffixDatabase.EXCEPTION_MARKER;
                break;
            default:
                b = -1;
                break;
        }
        String str10 = "video/x-unknown";
        String str11 = "audio/raw";
        String str12 = "audio/x-unknown";
        C21054 c21054M18751 = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        byte[] bArr = null;
        switch (b) {
            case 0:
            case 1:
            case 9:
                byte[] bArr2 = this.f74298;
                str12 = "video/mp4v-es";
                listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                i2 = -1;
                str = null;
                str11 = str12;
                list5 = listSingletonList;
                i3 = -1;
                list = list5;
                if (this.f74290 != null && (c19126M44156 = C19126.m44156(new C17714(this.f74290))) != null) {
                    str = c19126M44156.f60276;
                    str11 = "video/dolby-vision";
                }
                boolean z = this.f74259;
                if (this.f74249) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i12 = (z ? 1 : 0) | i5;
                c1297 = new C1297();
                if (C9786.m24810(str11)) {
                    c1297.m4472(this.f74286);
                    c1297.m4456(this.f74267);
                    c1297.m4475(i3);
                    i6 = 1;
                } else if (C9786.m24801(str11)) {
                    if (this.f74256 == 0) {
                        i10 = this.f74288;
                        i7 = -1;
                        if (i10 == -1) {
                            i10 = this.f74250;
                        }
                        this.f74288 = i10;
                        i11 = this.f74253;
                        if (i11 == -1) {
                            i11 = this.f74295;
                        }
                        this.f74253 = i11;
                    } else {
                        i7 = -1;
                    }
                    i8 = this.f74288;
                    if (i8 != i7 || (i9 = this.f74253) == i7) {
                        f = -1.0f;
                    } else {
                        f = (this.f74295 * i8) / (this.f74250 * i9);
                    }
                    if (this.f74265) {
                        if (this.f74287 != -1.0f && this.f74285 != -1.0f && this.f74272 != -1.0f && this.f74283 != -1.0f && this.f74264 != -1.0f && this.f74252 != -1.0f && this.f74248 != -1.0f && this.f74260 != -1.0f && this.f74274 != -1.0f && this.f74270 != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder.put((byte) 0);
                            byteBufferOrder.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) (this.f74274 + 0.5f));
                            byteBufferOrder.putShort((short) (this.f74270 + 0.5f));
                            byteBufferOrder.putShort((short) this.f74255);
                            byteBufferOrder.putShort((short) this.f74275);
                        }
                        C6942 c6942 = new C6942();
                        c6942.m18755(this.f74293);
                        c6942.m18754(this.f74262);
                        c6942.m18757(this.f74268);
                        c6942.m18753(bArr);
                        c6942.m18756(this.f74271);
                        c6942.m18752(this.f74271);
                        c21054M18751 = c6942.m18751();
                    }
                    if (this.f74273 == null && C13920.f41500.containsKey(this.f74273)) {
                        iIntValue = ((Integer) C13920.f41500.get(this.f74273)).intValue();
                    } else {
                        iIntValue = -1;
                    }
                    if (this.f74269 == 0 && Float.compare(this.f74294, 0.0f) == 0 && Float.compare(this.f74299, 0.0f) == 0) {
                        if (Float.compare(this.f74263, 0.0f) == 0) {
                            iIntValue = 0;
                        } else if (Float.compare(this.f74263, 90.0f) == 0) {
                            iIntValue = 90;
                        } else if (Float.compare(this.f74263, -180.0f) != 0 || Float.compare(this.f74263, 180.0f) == 0) {
                            iIntValue = 180;
                        } else if (Float.compare(this.f74263, -90.0f) == 0) {
                            iIntValue = BottomAppBarTopEdgeTreatment.ANGLE_UP;
                        }
                    }
                    c1297.m4453(this.f74250);
                    c1297.m4457(this.f74295);
                    c1297.m4460(f);
                    c1297.m4439(iIntValue);
                    c1297.m4450(this.f74278);
                    c1297.m4478(this.f74257);
                    c1297.m4448(c21054M18751);
                    i6 = 2;
                } else {
                    if ("application/x-subrip".equals(str11) && !"text/x-ssa".equals(str11) && !"text/vtt".equals(str11) && !"application/vobsub".equals(str11) && !"application/pgs".equals(str11) && !"application/dvbsubs".equals(str11)) {
                        throw C9080.m23440("Unexpected MIME type.", (Throwable) null);
                    }
                    i6 = 3;
                }
                if (this.f74273 != null && !C13920.f41500.containsKey(this.f74273)) {
                    c1297.m4473(this.f74273);
                }
                c1297.m4467(i);
                if (this.f74296) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c1297.m4462(str8);
                c1297.m4465(str11);
                c1297.m4451(i2);
                c1297.m4471(this.f74292);
                c1297.m4466(i12);
                c1297.m4446(list);
                c1297.m4445(str);
                c1297.m4447(this.f74247);
                C8353 c8353M4440 = c1297.m4440();
                InterfaceC19383 interfaceC19383Mo3429 = interfaceC21830.mo3429(this.f74297, i6);
                this.f74276 = interfaceC19383Mo3429;
                interfaceC19383Mo3429.mo8456(c8353M4440);
                return;
            case 2:
                C17714 c17714 = new C17714(m51252(this.f74277));
                try {
                    int iM41465 = c17714.m41465();
                    if (iM41465 != 1) {
                        if (iM41465 == 65534) {
                            c17714.m41484(24);
                            if (c17714.m41487() != C13920.f41498.getMostSignificantBits() || c17714.m41487() != C13920.f41498.getLeastSignificantBits()) {
                            }
                            listSingletonList = null;
                            i2 = -1;
                            str = null;
                            str11 = str12;
                            list5 = listSingletonList;
                            i3 = -1;
                            list = list5;
                            if (this.f74290 != null) {
                                str = c19126M44156.f60276;
                                str11 = "video/dolby-vision";
                            }
                            boolean z2 = this.f74259;
                            if (this.f74249) {
                                i5 = 2;
                            } else {
                                i5 = 0;
                            }
                            int i13 = (z2 ? 1 : 0) | i5;
                            c1297 = new C1297();
                            if (C9786.m24810(str11)) {
                                c1297.m4472(this.f74286);
                                c1297.m4456(this.f74267);
                                c1297.m4475(i3);
                                i6 = 1;
                            } else {
                                if (C9786.m24801(str11)) {
                                    if (this.f74256 == 0) {
                                        i10 = this.f74288;
                                        i7 = -1;
                                        if (i10 == -1) {
                                            i10 = this.f74250;
                                        }
                                        this.f74288 = i10;
                                        i11 = this.f74253;
                                        if (i11 == -1) {
                                            i11 = this.f74295;
                                        }
                                        this.f74253 = i11;
                                    } else {
                                        i7 = -1;
                                    }
                                    i8 = this.f74288;
                                    if (i8 != i7) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (this.f74265) {
                                        if (this.f74287 != -1.0f) {
                                            bArr = new byte[25];
                                            ByteBuffer byteBufferOrder2 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                            byteBufferOrder2.put((byte) 0);
                                            byteBufferOrder2.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) (this.f74274 + 0.5f));
                                            byteBufferOrder2.putShort((short) (this.f74270 + 0.5f));
                                            byteBufferOrder2.putShort((short) this.f74255);
                                            byteBufferOrder2.putShort((short) this.f74275);
                                        }
                                        C6942 c6943 = new C6942();
                                        c6943.m18755(this.f74293);
                                        c6943.m18754(this.f74262);
                                        c6943.m18757(this.f74268);
                                        c6943.m18753(bArr);
                                        c6943.m18756(this.f74271);
                                        c6943.m18752(this.f74271);
                                        c21054M18751 = c6943.m18751();
                                    }
                                    if (this.f74273 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (this.f74269 == 0) {
                                        if (Float.compare(this.f74263, 0.0f) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    c1297.m4453(this.f74250);
                                    c1297.m4457(this.f74295);
                                    c1297.m4460(f);
                                    c1297.m4439(iIntValue);
                                    c1297.m4450(this.f74278);
                                    c1297.m4478(this.f74257);
                                    c1297.m4448(c21054M18751);
                                    i6 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str11)) {
                                    }
                                    i6 = 3;
                                }
                                break;
                            }
                            if (this.f74273 != null) {
                                c1297.m4473(this.f74273);
                            }
                            c1297.m4467(i);
                            if (this.f74296) {
                                str8 = "video/webm";
                            } else {
                                str8 = "video/x-matroska";
                            }
                            c1297.m4462(str8);
                            c1297.m4465(str11);
                            c1297.m4451(i2);
                            c1297.m4471(this.f74292);
                            c1297.m4466(i13);
                            c1297.m4446(list);
                            c1297.m4445(str);
                            c1297.m4447(this.f74247);
                            C8353 c8353M4441 = c1297.m4440();
                            InterfaceC19383 interfaceC19383Mo34210 = interfaceC21830.mo3429(this.f74297, i6);
                            this.f74276 = interfaceC19383Mo34210;
                            interfaceC19383Mo34210.mo8456(c8353M4441);
                            return;
                        }
                        C19956.m46037("Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                        listSingletonList = null;
                        i2 = -1;
                        str = null;
                        str11 = str12;
                        list5 = listSingletonList;
                        i3 = -1;
                        list = list5;
                        if (this.f74290 != null) {
                            str = c19126M44156.f60276;
                            str11 = "video/dolby-vision";
                        }
                        boolean z3 = this.f74259;
                        if (this.f74249) {
                            i5 = 2;
                        } else {
                            i5 = 0;
                        }
                        int i14 = (z3 ? 1 : 0) | i5;
                        c1297 = new C1297();
                        if (C9786.m24810(str11)) {
                            c1297.m4472(this.f74286);
                            c1297.m4456(this.f74267);
                            c1297.m4475(i3);
                            i6 = 1;
                        } else {
                            if (C9786.m24801(str11)) {
                                if (this.f74256 == 0) {
                                    i10 = this.f74288;
                                    i7 = -1;
                                    if (i10 == -1) {
                                        i10 = this.f74250;
                                    }
                                    this.f74288 = i10;
                                    i11 = this.f74253;
                                    if (i11 == -1) {
                                        i11 = this.f74295;
                                    }
                                    this.f74253 = i11;
                                } else {
                                    i7 = -1;
                                }
                                i8 = this.f74288;
                                if (i8 != i7) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (this.f74265) {
                                    if (this.f74287 != -1.0f) {
                                        bArr = new byte[25];
                                        ByteBuffer byteBufferOrder3 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                        byteBufferOrder3.put((byte) 0);
                                        byteBufferOrder3.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) (this.f74274 + 0.5f));
                                        byteBufferOrder3.putShort((short) (this.f74270 + 0.5f));
                                        byteBufferOrder3.putShort((short) this.f74255);
                                        byteBufferOrder3.putShort((short) this.f74275);
                                    }
                                    C6942 c6944 = new C6942();
                                    c6944.m18755(this.f74293);
                                    c6944.m18754(this.f74262);
                                    c6944.m18757(this.f74268);
                                    c6944.m18753(bArr);
                                    c6944.m18756(this.f74271);
                                    c6944.m18752(this.f74271);
                                    c21054M18751 = c6944.m18751();
                                }
                                if (this.f74273 == null) {
                                    iIntValue = -1;
                                } else {
                                    iIntValue = -1;
                                }
                                if (this.f74269 == 0) {
                                    if (Float.compare(this.f74263, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                c1297.m4453(this.f74250);
                                c1297.m4457(this.f74295);
                                c1297.m4460(f);
                                c1297.m4439(iIntValue);
                                c1297.m4450(this.f74278);
                                c1297.m4478(this.f74257);
                                c1297.m4448(c21054M18751);
                                i6 = 2;
                            } else {
                                if ("application/x-subrip".equals(str11)) {
                                }
                                i6 = 3;
                            }
                            break;
                        }
                        if (this.f74273 != null) {
                            c1297.m4473(this.f74273);
                        }
                        c1297.m4467(i);
                        if (this.f74296) {
                            str8 = "video/webm";
                        } else {
                            str8 = "video/x-matroska";
                        }
                        c1297.m4462(str8);
                        c1297.m4465(str11);
                        c1297.m4451(i2);
                        c1297.m4471(this.f74292);
                        c1297.m4466(i14);
                        c1297.m4446(list);
                        c1297.m4445(str);
                        c1297.m4447(this.f74247);
                        C8353 c8353M4442 = c1297.m4440();
                        InterfaceC19383 interfaceC19383Mo34211 = interfaceC21830.mo3429(this.f74297, i6);
                        this.f74276 = interfaceC19383Mo34211;
                        interfaceC19383Mo34211.mo8456(c8353M4442);
                        return;
                    }
                    int i15 = this.f74251;
                    String str13 = C3603.f11424;
                    int iM11004 = C3603.m11003(i15, ByteOrder.LITTLE_ENDIAN);
                    if (iM11004 == 0) {
                        C19956.m46037("Unsupported PCM bit depth: " + this.f74251 + ". Setting mimeType to audio/x-unknown");
                        listSingletonList = null;
                        i2 = -1;
                        str = null;
                        str11 = str12;
                        list5 = listSingletonList;
                        i3 = -1;
                        list = list5;
                    } else {
                        list = null;
                        str = null;
                        i3 = iM11004;
                        i2 = -1;
                    }
                    if (this.f74290 != null) {
                        str = c19126M44156.f60276;
                        str11 = "video/dolby-vision";
                    }
                    boolean z4 = this.f74259;
                    if (this.f74249) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    int i16 = (z4 ? 1 : 0) | i5;
                    c1297 = new C1297();
                    if (C9786.m24810(str11)) {
                        c1297.m4472(this.f74286);
                        c1297.m4456(this.f74267);
                        c1297.m4475(i3);
                        i6 = 1;
                    } else {
                        if (C9786.m24801(str11)) {
                            if (this.f74256 == 0) {
                                i10 = this.f74288;
                                i7 = -1;
                                if (i10 == -1) {
                                    i10 = this.f74250;
                                }
                                this.f74288 = i10;
                                i11 = this.f74253;
                                if (i11 == -1) {
                                    i11 = this.f74295;
                                }
                                this.f74253 = i11;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.f74288;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f74265) {
                                if (this.f74287 != -1.0f) {
                                    bArr = new byte[25];
                                    ByteBuffer byteBufferOrder4 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                    byteBufferOrder4.put((byte) 0);
                                    byteBufferOrder4.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) (this.f74274 + 0.5f));
                                    byteBufferOrder4.putShort((short) (this.f74270 + 0.5f));
                                    byteBufferOrder4.putShort((short) this.f74255);
                                    byteBufferOrder4.putShort((short) this.f74275);
                                }
                                C6942 c6945 = new C6942();
                                c6945.m18755(this.f74293);
                                c6945.m18754(this.f74262);
                                c6945.m18757(this.f74268);
                                c6945.m18753(bArr);
                                c6945.m18756(this.f74271);
                                c6945.m18752(this.f74271);
                                c21054M18751 = c6945.m18751();
                            }
                            if (this.f74273 == null) {
                                iIntValue = -1;
                            } else {
                                iIntValue = -1;
                            }
                            if (this.f74269 == 0) {
                                if (Float.compare(this.f74263, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            c1297.m4453(this.f74250);
                            c1297.m4457(this.f74295);
                            c1297.m4460(f);
                            c1297.m4439(iIntValue);
                            c1297.m4450(this.f74278);
                            c1297.m4478(this.f74257);
                            c1297.m4448(c21054M18751);
                            i6 = 2;
                        } else {
                            if ("application/x-subrip".equals(str11)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.f74273 != null) {
                        c1297.m4473(this.f74273);
                    }
                    c1297.m4467(i);
                    if (this.f74296) {
                        str8 = "video/webm";
                    } else {
                        str8 = "video/x-matroska";
                    }
                    c1297.m4462(str8);
                    c1297.m4465(str11);
                    c1297.m4451(i2);
                    c1297.m4471(this.f74292);
                    c1297.m4466(i16);
                    c1297.m4446(list);
                    c1297.m4445(str);
                    c1297.m4447(this.f74247);
                    C8353 c8353M4443 = c1297.m4440();
                    InterfaceC19383 interfaceC19383Mo34212 = interfaceC21830.mo3429(this.f74297, i6);
                    this.f74276 = interfaceC19383Mo34212;
                    interfaceC19383Mo34212.mo8456(c8353M4443);
                    return;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw C9080.m23440("Error parsing MS/ACM codec private", (Throwable) null);
                }
            case 3:
                this.f74289 = new C0331();
                str12 = "audio/true-hd";
                list4 = null;
                str7 = null;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f74290 != null) {
                    str = c19126M44156.f60276;
                    str11 = "video/dolby-vision";
                }
                boolean z5 = this.f74259;
                if (this.f74249) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i17 = (z5 ? 1 : 0) | i5;
                c1297 = new C1297();
                if (C9786.m24810(str11)) {
                    c1297.m4472(this.f74286);
                    c1297.m4456(this.f74267);
                    c1297.m4475(i3);
                    i6 = 1;
                } else {
                    if (C9786.m24801(str11)) {
                        if (this.f74256 == 0) {
                            i10 = this.f74288;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f74250;
                            }
                            this.f74288 = i10;
                            i11 = this.f74253;
                            if (i11 == -1) {
                                i11 = this.f74295;
                            }
                            this.f74253 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f74288;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f74265) {
                            if (this.f74287 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder5 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder5.put((byte) 0);
                                byteBufferOrder5.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) (this.f74274 + 0.5f));
                                byteBufferOrder5.putShort((short) (this.f74270 + 0.5f));
                                byteBufferOrder5.putShort((short) this.f74255);
                                byteBufferOrder5.putShort((short) this.f74275);
                            }
                            C6942 c6946 = new C6942();
                            c6946.m18755(this.f74293);
                            c6946.m18754(this.f74262);
                            c6946.m18757(this.f74268);
                            c6946.m18753(bArr);
                            c6946.m18756(this.f74271);
                            c6946.m18752(this.f74271);
                            c21054M18751 = c6946.m18751();
                        }
                        if (this.f74273 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f74269 == 0) {
                            if (Float.compare(this.f74263, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c1297.m4453(this.f74250);
                        c1297.m4457(this.f74295);
                        c1297.m4460(f);
                        c1297.m4439(iIntValue);
                        c1297.m4450(this.f74278);
                        c1297.m4478(this.f74257);
                        c1297.m4448(c21054M18751);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f74273 != null) {
                    c1297.m4473(this.f74273);
                }
                c1297.m4467(i);
                if (this.f74296) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c1297.m4462(str8);
                c1297.m4465(str11);
                c1297.m4451(i2);
                c1297.m4471(this.f74292);
                c1297.m4466(i17);
                c1297.m4446(list);
                c1297.m4445(str);
                c1297.m4447(this.f74247);
                C8353 c8353M4444 = c1297.m4440();
                InterfaceC19383 interfaceC19383Mo34213 = interfaceC21830.mo3429(this.f74297, i6);
                this.f74276 = interfaceC19383Mo34213;
                interfaceC19383Mo34213.mo8456(c8353M4444);
                return;
            case 4:
                byte[] bArrM51252 = m51252(this.f74277);
                try {
                    if (bArrM51252[0] != 2) {
                        throw C9080.m23440("Error parsing vorbis codec private", (Throwable) null);
                    }
                    int i18 = 1;
                    int i19 = 0;
                    while (true) {
                        int i20 = bArrM51252[i18] & 255;
                        if (i20 == 255) {
                            i19 += 255;
                            i18++;
                        } else {
                            int i21 = i18 + 1;
                            int i22 = i19 + i20;
                            int i23 = 0;
                            while (true) {
                                int i24 = bArrM51252[i21] & 255;
                                if (i24 != 255) {
                                    int i25 = i21 + 1;
                                    int i26 = i23 + i24;
                                    if (bArrM51252[i25] != 1) {
                                        throw C9080.m23440("Error parsing vorbis codec private", (Throwable) null);
                                    }
                                    byte[] bArr3 = new byte[i22];
                                    System.arraycopy(bArrM51252, i25, bArr3, 0, i22);
                                    int i27 = i25 + i22;
                                    if (bArrM51252[i27] != 3) {
                                        throw C9080.m23440("Error parsing vorbis codec private", (Throwable) null);
                                    }
                                    int i28 = i27 + i26;
                                    if (bArrM51252[i28] != 5) {
                                        throw C9080.m23440("Error parsing vorbis codec private", (Throwable) null);
                                    }
                                    byte[] bArr4 = new byte[bArrM51252.length - i28];
                                    System.arraycopy(bArrM51252, i28, bArr4, 0, bArrM51252.length - i28);
                                    ArrayList arrayList = new ArrayList(2);
                                    arrayList.add(bArr3);
                                    arrayList.add(bArr4);
                                    str2 = "audio/vorbis";
                                    str = null;
                                    i4 = 8192;
                                    list2 = arrayList;
                                    str11 = str2;
                                    i2 = i4;
                                    list5 = list2;
                                    i3 = -1;
                                    list = list5;
                                    if (this.f74290 != null) {
                                        str = c19126M44156.f60276;
                                        str11 = "video/dolby-vision";
                                    }
                                    boolean z6 = this.f74259;
                                    if (this.f74249) {
                                        i5 = 2;
                                    } else {
                                        i5 = 0;
                                    }
                                    int i110 = (z6 ? 1 : 0) | i5;
                                    c1297 = new C1297();
                                    if (C9786.m24810(str11)) {
                                        c1297.m4472(this.f74286);
                                        c1297.m4456(this.f74267);
                                        c1297.m4475(i3);
                                        i6 = 1;
                                    } else {
                                        if (C9786.m24801(str11)) {
                                            if (this.f74256 == 0) {
                                                i10 = this.f74288;
                                                i7 = -1;
                                                if (i10 == -1) {
                                                    i10 = this.f74250;
                                                }
                                                this.f74288 = i10;
                                                i11 = this.f74253;
                                                if (i11 == -1) {
                                                    i11 = this.f74295;
                                                }
                                                this.f74253 = i11;
                                            } else {
                                                i7 = -1;
                                            }
                                            i8 = this.f74288;
                                            if (i8 != i7) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (this.f74265) {
                                                if (this.f74287 != -1.0f) {
                                                    bArr = new byte[25];
                                                    ByteBuffer byteBufferOrder6 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                                    byteBufferOrder6.put((byte) 0);
                                                    byteBufferOrder6.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) (this.f74274 + 0.5f));
                                                    byteBufferOrder6.putShort((short) (this.f74270 + 0.5f));
                                                    byteBufferOrder6.putShort((short) this.f74255);
                                                    byteBufferOrder6.putShort((short) this.f74275);
                                                }
                                                C6942 c6947 = new C6942();
                                                c6947.m18755(this.f74293);
                                                c6947.m18754(this.f74262);
                                                c6947.m18757(this.f74268);
                                                c6947.m18753(bArr);
                                                c6947.m18756(this.f74271);
                                                c6947.m18752(this.f74271);
                                                c21054M18751 = c6947.m18751();
                                            }
                                            if (this.f74273 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (this.f74269 == 0) {
                                                if (Float.compare(this.f74263, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            c1297.m4453(this.f74250);
                                            c1297.m4457(this.f74295);
                                            c1297.m4460(f);
                                            c1297.m4439(iIntValue);
                                            c1297.m4450(this.f74278);
                                            c1297.m4478(this.f74257);
                                            c1297.m4448(c21054M18751);
                                            i6 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                            }
                                            i6 = 3;
                                        }
                                        break;
                                    }
                                    if (this.f74273 != null) {
                                        c1297.m4473(this.f74273);
                                    }
                                    c1297.m4467(i);
                                    if (this.f74296) {
                                        str8 = "video/webm";
                                    } else {
                                        str8 = "video/x-matroska";
                                    }
                                    c1297.m4462(str8);
                                    c1297.m4465(str11);
                                    c1297.m4451(i2);
                                    c1297.m4471(this.f74292);
                                    c1297.m4466(i110);
                                    c1297.m4446(list);
                                    c1297.m4445(str);
                                    c1297.m4447(this.f74247);
                                    C8353 c8353M4445 = c1297.m4440();
                                    InterfaceC19383 interfaceC19383Mo34214 = interfaceC21830.mo3429(this.f74297, i6);
                                    this.f74276 = interfaceC19383Mo34214;
                                    interfaceC19383Mo34214.mo8456(c8353M4445);
                                    return;
                                }
                                i23 += 255;
                                i21++;
                            }
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException unused2) {
                    throw C9080.m23440("Error parsing vorbis codec private", (Throwable) null);
                }
                break;
            case 5:
                str3 = "audio/mpeg-L2";
                str2 = str3;
                list2 = null;
                str = null;
                i4 = 4096;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f74290 != null) {
                    str = c19126M44156.f60276;
                    str11 = "video/dolby-vision";
                }
                boolean z7 = this.f74259;
                if (this.f74249) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i111 = (z7 ? 1 : 0) | i5;
                c1297 = new C1297();
                if (C9786.m24810(str11)) {
                    c1297.m4472(this.f74286);
                    c1297.m4456(this.f74267);
                    c1297.m4475(i3);
                    i6 = 1;
                } else {
                    if (C9786.m24801(str11)) {
                        if (this.f74256 == 0) {
                            i10 = this.f74288;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f74250;
                            }
                            this.f74288 = i10;
                            i11 = this.f74253;
                            if (i11 == -1) {
                                i11 = this.f74295;
                            }
                            this.f74253 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f74288;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f74265) {
                            if (this.f74287 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder7 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder7.put((byte) 0);
                                byteBufferOrder7.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) (this.f74274 + 0.5f));
                                byteBufferOrder7.putShort((short) (this.f74270 + 0.5f));
                                byteBufferOrder7.putShort((short) this.f74255);
                                byteBufferOrder7.putShort((short) this.f74275);
                            }
                            C6942 c6948 = new C6942();
                            c6948.m18755(this.f74293);
                            c6948.m18754(this.f74262);
                            c6948.m18757(this.f74268);
                            c6948.m18753(bArr);
                            c6948.m18756(this.f74271);
                            c6948.m18752(this.f74271);
                            c21054M18751 = c6948.m18751();
                        }
                        if (this.f74273 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f74269 == 0) {
                            if (Float.compare(this.f74263, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c1297.m4453(this.f74250);
                        c1297.m4457(this.f74295);
                        c1297.m4460(f);
                        c1297.m4439(iIntValue);
                        c1297.m4450(this.f74278);
                        c1297.m4478(this.f74257);
                        c1297.m4448(c21054M18751);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f74273 != null) {
                    c1297.m4473(this.f74273);
                }
                c1297.m4467(i);
                if (this.f74296) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c1297.m4462(str8);
                c1297.m4465(str11);
                c1297.m4451(i2);
                c1297.m4471(this.f74292);
                c1297.m4466(i111);
                c1297.m4446(list);
                c1297.m4445(str);
                c1297.m4447(this.f74247);
                C8353 c8353M4446 = c1297.m4440();
                InterfaceC19383 interfaceC19383Mo34215 = interfaceC21830.mo3429(this.f74297, i6);
                this.f74276 = interfaceC19383Mo34215;
                interfaceC19383Mo34215.mo8456(c8353M4446);
                return;
            case 6:
                str3 = "audio/mpeg";
                str2 = str3;
                list2 = null;
                str = null;
                i4 = 4096;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f74290 != null) {
                    str = c19126M44156.f60276;
                    str11 = "video/dolby-vision";
                }
                boolean z8 = this.f74259;
                if (this.f74249) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i112 = (z8 ? 1 : 0) | i5;
                c1297 = new C1297();
                if (C9786.m24810(str11)) {
                    c1297.m4472(this.f74286);
                    c1297.m4456(this.f74267);
                    c1297.m4475(i3);
                    i6 = 1;
                } else {
                    if (C9786.m24801(str11)) {
                        if (this.f74256 == 0) {
                            i10 = this.f74288;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f74250;
                            }
                            this.f74288 = i10;
                            i11 = this.f74253;
                            if (i11 == -1) {
                                i11 = this.f74295;
                            }
                            this.f74253 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f74288;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f74265) {
                            if (this.f74287 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder8 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder8.put((byte) 0);
                                byteBufferOrder8.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) (this.f74274 + 0.5f));
                                byteBufferOrder8.putShort((short) (this.f74270 + 0.5f));
                                byteBufferOrder8.putShort((short) this.f74255);
                                byteBufferOrder8.putShort((short) this.f74275);
                            }
                            C6942 c6949 = new C6942();
                            c6949.m18755(this.f74293);
                            c6949.m18754(this.f74262);
                            c6949.m18757(this.f74268);
                            c6949.m18753(bArr);
                            c6949.m18756(this.f74271);
                            c6949.m18752(this.f74271);
                            c21054M18751 = c6949.m18751();
                        }
                        if (this.f74273 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f74269 == 0) {
                            if (Float.compare(this.f74263, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c1297.m4453(this.f74250);
                        c1297.m4457(this.f74295);
                        c1297.m4460(f);
                        c1297.m4439(iIntValue);
                        c1297.m4450(this.f74278);
                        c1297.m4478(this.f74257);
                        c1297.m4448(c21054M18751);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f74273 != null) {
                    c1297.m4473(this.f74273);
                }
                c1297.m4467(i);
                if (this.f74296) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c1297.m4462(str8);
                c1297.m4465(str11);
                c1297.m4451(i2);
                c1297.m4471(this.f74292);
                c1297.m4466(i112);
                c1297.m4446(list);
                c1297.m4445(str);
                c1297.m4447(this.f74247);
                C8353 c8353M4447 = c1297.m4440();
                InterfaceC19383 interfaceC19383Mo34216 = interfaceC21830.mo3429(this.f74297, i6);
                this.f74276 = interfaceC19383Mo34216;
                interfaceC19383Mo34216.mo8456(c8353M4447);
                return;
            case 7:
                C17714 c17715 = new C17714(m51252(this.f74277));
                try {
                    c17715.m41478(16);
                    long jM41480 = c17715.m41480();
                    if (jM41480 == 1482049860) {
                        pair = new Pair("video/divx", null);
                    } else if (jM41480 == 859189832) {
                        pair = new Pair("video/3gpp", null);
                    } else if (jM41480 == 826496599) {
                        int iM41485 = c17715.m41485() + 20;
                        byte[] bArrM41482 = c17715.m41482();
                        while (true) {
                            if (iM41485 < bArrM41482.length - 4) {
                                if (bArrM41482[iM41485] == 0 && bArrM41482[iM41485 + 1] == 0 && bArrM41482[iM41485 + 2] == 1 && bArrM41482[iM41485 + 3] == 15) {
                                    pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrM41482, iM41485, bArrM41482.length)));
                                } else {
                                    iM41485++;
                                }
                            } else {
                                throw C9080.m23440("Failed to find FourCC VC1 initialization data", (Throwable) null);
                            }
                        }
                    } else {
                        C19956.m46037("Unknown FourCC. Setting mimeType to video/x-unknown");
                        pair = new Pair("video/x-unknown", null);
                    }
                    str4 = (String) pair.first;
                    listOf2 = (List) pair.second;
                    str12 = str4;
                    listOf = listOf2;
                    str7 = null;
                    list4 = listOf;
                    str = str7;
                    str2 = str12;
                    i4 = -1;
                    list2 = list4;
                    str11 = str2;
                    i2 = i4;
                    list5 = list2;
                    i3 = -1;
                    list = list5;
                    if (this.f74290 != null) {
                        str = c19126M44156.f60276;
                        str11 = "video/dolby-vision";
                    }
                    boolean z9 = this.f74259;
                    if (this.f74249) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    int i113 = (z9 ? 1 : 0) | i5;
                    c1297 = new C1297();
                    if (C9786.m24810(str11)) {
                        c1297.m4472(this.f74286);
                        c1297.m4456(this.f74267);
                        c1297.m4475(i3);
                        i6 = 1;
                    } else {
                        if (C9786.m24801(str11)) {
                            if (this.f74256 == 0) {
                                i10 = this.f74288;
                                i7 = -1;
                                if (i10 == -1) {
                                    i10 = this.f74250;
                                }
                                this.f74288 = i10;
                                i11 = this.f74253;
                                if (i11 == -1) {
                                    i11 = this.f74295;
                                }
                                this.f74253 = i11;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.f74288;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f74265) {
                                if (this.f74287 != -1.0f) {
                                    bArr = new byte[25];
                                    ByteBuffer byteBufferOrder9 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                    byteBufferOrder9.put((byte) 0);
                                    byteBufferOrder9.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) (this.f74274 + 0.5f));
                                    byteBufferOrder9.putShort((short) (this.f74270 + 0.5f));
                                    byteBufferOrder9.putShort((short) this.f74255);
                                    byteBufferOrder9.putShort((short) this.f74275);
                                }
                                C6942 c69410 = new C6942();
                                c69410.m18755(this.f74293);
                                c69410.m18754(this.f74262);
                                c69410.m18757(this.f74268);
                                c69410.m18753(bArr);
                                c69410.m18756(this.f74271);
                                c69410.m18752(this.f74271);
                                c21054M18751 = c69410.m18751();
                            }
                            if (this.f74273 == null) {
                                iIntValue = -1;
                            } else {
                                iIntValue = -1;
                            }
                            if (this.f74269 == 0) {
                                if (Float.compare(this.f74263, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            c1297.m4453(this.f74250);
                            c1297.m4457(this.f74295);
                            c1297.m4460(f);
                            c1297.m4439(iIntValue);
                            c1297.m4450(this.f74278);
                            c1297.m4478(this.f74257);
                            c1297.m4448(c21054M18751);
                            i6 = 2;
                        } else {
                            if ("application/x-subrip".equals(str11)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.f74273 != null) {
                        c1297.m4473(this.f74273);
                    }
                    c1297.m4467(i);
                    if (this.f74296) {
                        str8 = "video/webm";
                    } else {
                        str8 = "video/x-matroska";
                    }
                    c1297.m4462(str8);
                    c1297.m4465(str11);
                    c1297.m4451(i2);
                    c1297.m4471(this.f74292);
                    c1297.m4466(i113);
                    c1297.m4446(list);
                    c1297.m4445(str);
                    c1297.m4447(this.f74247);
                    C8353 c8353M4448 = c1297.m4440();
                    InterfaceC19383 interfaceC19383Mo34217 = interfaceC21830.mo3429(this.f74297, i6);
                    this.f74276 = interfaceC19383Mo34217;
                    interfaceC19383Mo34217.mo8456(c8353M4448);
                    return;
                } catch (ArrayIndexOutOfBoundsException unused3) {
                    throw C9080.m23440("Error parsing FourCC private data", (Throwable) null);
                }
            case 8:
                byte[] bArr5 = new byte[4];
                System.arraycopy(m51252(this.f74277), 0, bArr5, 0, 4);
                str12 = "application/dvbsubs";
                listOf = AbstractC14545.of((Object) bArr5);
                str7 = null;
                list4 = listOf;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f74290 != null) {
                    str = c19126M44156.f60276;
                    str11 = "video/dolby-vision";
                }
                boolean z10 = this.f74259;
                if (this.f74249) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i114 = (z10 ? 1 : 0) | i5;
                c1297 = new C1297();
                if (C9786.m24810(str11)) {
                    c1297.m4472(this.f74286);
                    c1297.m4456(this.f74267);
                    c1297.m4475(i3);
                    i6 = 1;
                } else {
                    if (C9786.m24801(str11)) {
                        if (this.f74256 == 0) {
                            i10 = this.f74288;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f74250;
                            }
                            this.f74288 = i10;
                            i11 = this.f74253;
                            if (i11 == -1) {
                                i11 = this.f74295;
                            }
                            this.f74253 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f74288;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f74265) {
                            if (this.f74287 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder10 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder10.put((byte) 0);
                                byteBufferOrder10.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) (this.f74274 + 0.5f));
                                byteBufferOrder10.putShort((short) (this.f74270 + 0.5f));
                                byteBufferOrder10.putShort((short) this.f74255);
                                byteBufferOrder10.putShort((short) this.f74275);
                            }
                            C6942 c69411 = new C6942();
                            c69411.m18755(this.f74293);
                            c69411.m18754(this.f74262);
                            c69411.m18757(this.f74268);
                            c69411.m18753(bArr);
                            c69411.m18756(this.f74271);
                            c69411.m18752(this.f74271);
                            c21054M18751 = c69411.m18751();
                        }
                        if (this.f74273 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f74269 == 0) {
                            if (Float.compare(this.f74263, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c1297.m4453(this.f74250);
                        c1297.m4457(this.f74295);
                        c1297.m4460(f);
                        c1297.m4439(iIntValue);
                        c1297.m4450(this.f74278);
                        c1297.m4478(this.f74257);
                        c1297.m4448(c21054M18751);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f74273 != null) {
                    c1297.m4473(this.f74273);
                }
                c1297.m4467(i);
                if (this.f74296) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c1297.m4462(str8);
                c1297.m4465(str11);
                c1297.m4451(i2);
                c1297.m4471(this.f74292);
                c1297.m4466(i114);
                c1297.m4446(list);
                c1297.m4445(str);
                c1297.m4447(this.f74247);
                C8353 c8353M4449 = c1297.m4440();
                InterfaceC19383 interfaceC19383Mo34218 = interfaceC21830.mo3429(this.f74297, i6);
                this.f74276 = interfaceC19383Mo34218;
                interfaceC19383Mo34218.mo8456(c8353M4449);
                return;
            case 10:
                C7304 c7304M19582 = C7304.m19582(new C17714(m51252(this.f74277)));
                ArrayList arrayList2 = c7304M19582.f22415;
                this.f74261 = c7304M19582.f22417;
                str5 = c7304M19582.f22421;
                str6 = "video/avc";
                list3 = arrayList2;
                str12 = str6;
                List list6 = list3;
                str7 = str5;
                list4 = list6;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f74290 != null) {
                    str = c19126M44156.f60276;
                    str11 = "video/dolby-vision";
                }
                boolean z11 = this.f74259;
                if (this.f74249) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i115 = (z11 ? 1 : 0) | i5;
                c1297 = new C1297();
                if (C9786.m24810(str11)) {
                    c1297.m4472(this.f74286);
                    c1297.m4456(this.f74267);
                    c1297.m4475(i3);
                    i6 = 1;
                } else {
                    if (C9786.m24801(str11)) {
                        if (this.f74256 == 0) {
                            i10 = this.f74288;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f74250;
                            }
                            this.f74288 = i10;
                            i11 = this.f74253;
                            if (i11 == -1) {
                                i11 = this.f74295;
                            }
                            this.f74253 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f74288;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f74265) {
                            if (this.f74287 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder11 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder11.put((byte) 0);
                                byteBufferOrder11.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) (this.f74274 + 0.5f));
                                byteBufferOrder11.putShort((short) (this.f74270 + 0.5f));
                                byteBufferOrder11.putShort((short) this.f74255);
                                byteBufferOrder11.putShort((short) this.f74275);
                            }
                            C6942 c69412 = new C6942();
                            c69412.m18755(this.f74293);
                            c69412.m18754(this.f74262);
                            c69412.m18757(this.f74268);
                            c69412.m18753(bArr);
                            c69412.m18756(this.f74271);
                            c69412.m18752(this.f74271);
                            c21054M18751 = c69412.m18751();
                        }
                        if (this.f74273 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f74269 == 0) {
                            if (Float.compare(this.f74263, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c1297.m4453(this.f74250);
                        c1297.m4457(this.f74295);
                        c1297.m4460(f);
                        c1297.m4439(iIntValue);
                        c1297.m4450(this.f74278);
                        c1297.m4478(this.f74257);
                        c1297.m4448(c21054M18751);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f74273 != null) {
                    c1297.m4473(this.f74273);
                }
                c1297.m4467(i);
                if (this.f74296) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c1297.m4462(str8);
                c1297.m4465(str11);
                c1297.m4451(i2);
                c1297.m4471(this.f74292);
                c1297.m4466(i115);
                c1297.m4446(list);
                c1297.m4445(str);
                c1297.m4447(this.f74247);
                C8353 c8353M44410 = c1297.m4440();
                InterfaceC19383 interfaceC19383Mo34219 = interfaceC21830.mo3429(this.f74297, i6);
                this.f74276 = interfaceC19383Mo34219;
                interfaceC19383Mo34219.mo8456(c8353M44410);
                return;
            case 11:
                str12 = "application/vobsub";
                listOf = AbstractC14545.of((Object) m51252(this.f74277));
                str7 = null;
                list4 = listOf;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f74290 != null) {
                    str = c19126M44156.f60276;
                    str11 = "video/dolby-vision";
                }
                boolean z12 = this.f74259;
                if (this.f74249) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i116 = (z12 ? 1 : 0) | i5;
                c1297 = new C1297();
                if (C9786.m24810(str11)) {
                    c1297.m4472(this.f74286);
                    c1297.m4456(this.f74267);
                    c1297.m4475(i3);
                    i6 = 1;
                } else {
                    if (C9786.m24801(str11)) {
                        if (this.f74256 == 0) {
                            i10 = this.f74288;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f74250;
                            }
                            this.f74288 = i10;
                            i11 = this.f74253;
                            if (i11 == -1) {
                                i11 = this.f74295;
                            }
                            this.f74253 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f74288;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f74265) {
                            if (this.f74287 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder12 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder12.put((byte) 0);
                                byteBufferOrder12.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) (this.f74274 + 0.5f));
                                byteBufferOrder12.putShort((short) (this.f74270 + 0.5f));
                                byteBufferOrder12.putShort((short) this.f74255);
                                byteBufferOrder12.putShort((short) this.f74275);
                            }
                            C6942 c69413 = new C6942();
                            c69413.m18755(this.f74293);
                            c69413.m18754(this.f74262);
                            c69413.m18757(this.f74268);
                            c69413.m18753(bArr);
                            c69413.m18756(this.f74271);
                            c69413.m18752(this.f74271);
                            c21054M18751 = c69413.m18751();
                        }
                        if (this.f74273 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f74269 == 0) {
                            if (Float.compare(this.f74263, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c1297.m4453(this.f74250);
                        c1297.m4457(this.f74295);
                        c1297.m4460(f);
                        c1297.m4439(iIntValue);
                        c1297.m4450(this.f74278);
                        c1297.m4478(this.f74257);
                        c1297.m4448(c21054M18751);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f74273 != null) {
                    c1297.m4473(this.f74273);
                }
                c1297.m4467(i);
                if (this.f74296) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c1297.m4462(str8);
                c1297.m4465(str11);
                c1297.m4451(i2);
                c1297.m4471(this.f74292);
                c1297.m4466(i116);
                c1297.m4446(list);
                c1297.m4445(str);
                c1297.m4447(this.f74247);
                C8353 c8353M44411 = c1297.m4440();
                InterfaceC19383 interfaceC19383Mo342110 = interfaceC21830.mo3429(this.f74297, i6);
                this.f74276 = interfaceC19383Mo342110;
                interfaceC19383Mo342110.mo8456(c8353M44411);
                return;
            case 12:
                str10 = "audio/vnd.dts.hd";
                str12 = str10;
                list4 = null;
                str7 = null;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f74290 != null) {
                    str = c19126M44156.f60276;
                    str11 = "video/dolby-vision";
                }
                boolean z13 = this.f74259;
                if (this.f74249) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i117 = (z13 ? 1 : 0) | i5;
                c1297 = new C1297();
                if (C9786.m24810(str11)) {
                    c1297.m4472(this.f74286);
                    c1297.m4456(this.f74267);
                    c1297.m4475(i3);
                    i6 = 1;
                } else {
                    if (C9786.m24801(str11)) {
                        if (this.f74256 == 0) {
                            i10 = this.f74288;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f74250;
                            }
                            this.f74288 = i10;
                            i11 = this.f74253;
                            if (i11 == -1) {
                                i11 = this.f74295;
                            }
                            this.f74253 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f74288;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f74265) {
                            if (this.f74287 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder13 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder13.put((byte) 0);
                                byteBufferOrder13.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) (this.f74274 + 0.5f));
                                byteBufferOrder13.putShort((short) (this.f74270 + 0.5f));
                                byteBufferOrder13.putShort((short) this.f74255);
                                byteBufferOrder13.putShort((short) this.f74275);
                            }
                            C6942 c69414 = new C6942();
                            c69414.m18755(this.f74293);
                            c69414.m18754(this.f74262);
                            c69414.m18757(this.f74268);
                            c69414.m18753(bArr);
                            c69414.m18756(this.f74271);
                            c69414.m18752(this.f74271);
                            c21054M18751 = c69414.m18751();
                        }
                        if (this.f74273 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f74269 == 0) {
                            if (Float.compare(this.f74263, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c1297.m4453(this.f74250);
                        c1297.m4457(this.f74295);
                        c1297.m4460(f);
                        c1297.m4439(iIntValue);
                        c1297.m4450(this.f74278);
                        c1297.m4478(this.f74257);
                        c1297.m4448(c21054M18751);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f74273 != null) {
                    c1297.m4473(this.f74273);
                }
                c1297.m4467(i);
                if (this.f74296) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c1297.m4462(str8);
                c1297.m4465(str11);
                c1297.m4451(i2);
                c1297.m4471(this.f74292);
                c1297.m4466(i117);
                c1297.m4446(list);
                c1297.m4445(str);
                c1297.m4447(this.f74247);
                C8353 c8353M44412 = c1297.m4440();
                InterfaceC19383 interfaceC19383Mo342111 = interfaceC21830.mo3429(this.f74297, i6);
                this.f74276 = interfaceC19383Mo342111;
                interfaceC19383Mo342111.mo8456(c8353M44412);
                return;
            case 13:
                List listSingletonList2 = Collections.singletonList(m51252(this.f74277));
                byte[] bArr6 = this.f74298;
                C12948 c12948M29741 = C12243.m29741(new C16302(bArr6, bArr6.length), false);
                this.f74267 = c12948M29741.f38846;
                this.f74286 = c12948M29741.f38844;
                str7 = c12948M29741.f38845;
                str12 = "audio/mp4a-latm";
                list4 = listSingletonList2;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f74290 != null) {
                    str = c19126M44156.f60276;
                    str11 = "video/dolby-vision";
                }
                boolean z14 = this.f74259;
                if (this.f74249) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i118 = (z14 ? 1 : 0) | i5;
                c1297 = new C1297();
                if (C9786.m24810(str11)) {
                    c1297.m4472(this.f74286);
                    c1297.m4456(this.f74267);
                    c1297.m4475(i3);
                    i6 = 1;
                } else {
                    if (C9786.m24801(str11)) {
                        if (this.f74256 == 0) {
                            i10 = this.f74288;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f74250;
                            }
                            this.f74288 = i10;
                            i11 = this.f74253;
                            if (i11 == -1) {
                                i11 = this.f74295;
                            }
                            this.f74253 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f74288;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f74265) {
                            if (this.f74287 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder14 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder14.put((byte) 0);
                                byteBufferOrder14.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) (this.f74274 + 0.5f));
                                byteBufferOrder14.putShort((short) (this.f74270 + 0.5f));
                                byteBufferOrder14.putShort((short) this.f74255);
                                byteBufferOrder14.putShort((short) this.f74275);
                            }
                            C6942 c69415 = new C6942();
                            c69415.m18755(this.f74293);
                            c69415.m18754(this.f74262);
                            c69415.m18757(this.f74268);
                            c69415.m18753(bArr);
                            c69415.m18756(this.f74271);
                            c69415.m18752(this.f74271);
                            c21054M18751 = c69415.m18751();
                        }
                        if (this.f74273 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f74269 == 0) {
                            if (Float.compare(this.f74263, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c1297.m4453(this.f74250);
                        c1297.m4457(this.f74295);
                        c1297.m4460(f);
                        c1297.m4439(iIntValue);
                        c1297.m4450(this.f74278);
                        c1297.m4478(this.f74257);
                        c1297.m4448(c21054M18751);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f74273 != null) {
                    c1297.m4473(this.f74273);
                }
                c1297.m4467(i);
                if (this.f74296) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c1297.m4462(str8);
                c1297.m4465(str11);
                c1297.m4451(i2);
                c1297.m4471(this.f74292);
                c1297.m4466(i118);
                c1297.m4446(list);
                c1297.m4445(str);
                c1297.m4447(this.f74247);
                C8353 c8353M44413 = c1297.m4440();
                InterfaceC19383 interfaceC19383Mo342112 = interfaceC21830.mo3429(this.f74297, i6);
                this.f74276 = interfaceC19383Mo342112;
                interfaceC19383Mo342112.mo8456(c8353M44413);
                return;
            case 14:
                str10 = "audio/ac3";
                str12 = str10;
                list4 = null;
                str7 = null;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f74290 != null) {
                    str = c19126M44156.f60276;
                    str11 = "video/dolby-vision";
                }
                boolean z15 = this.f74259;
                if (this.f74249) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i119 = (z15 ? 1 : 0) | i5;
                c1297 = new C1297();
                if (C9786.m24810(str11)) {
                    c1297.m4472(this.f74286);
                    c1297.m4456(this.f74267);
                    c1297.m4475(i3);
                    i6 = 1;
                } else {
                    if (C9786.m24801(str11)) {
                        if (this.f74256 == 0) {
                            i10 = this.f74288;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f74250;
                            }
                            this.f74288 = i10;
                            i11 = this.f74253;
                            if (i11 == -1) {
                                i11 = this.f74295;
                            }
                            this.f74253 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f74288;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f74265) {
                            if (this.f74287 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder15 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder15.put((byte) 0);
                                byteBufferOrder15.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) (this.f74274 + 0.5f));
                                byteBufferOrder15.putShort((short) (this.f74270 + 0.5f));
                                byteBufferOrder15.putShort((short) this.f74255);
                                byteBufferOrder15.putShort((short) this.f74275);
                            }
                            C6942 c69416 = new C6942();
                            c69416.m18755(this.f74293);
                            c69416.m18754(this.f74262);
                            c69416.m18757(this.f74268);
                            c69416.m18753(bArr);
                            c69416.m18756(this.f74271);
                            c69416.m18752(this.f74271);
                            c21054M18751 = c69416.m18751();
                        }
                        if (this.f74273 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f74269 == 0) {
                            if (Float.compare(this.f74263, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c1297.m4453(this.f74250);
                        c1297.m4457(this.f74295);
                        c1297.m4460(f);
                        c1297.m4439(iIntValue);
                        c1297.m4450(this.f74278);
                        c1297.m4478(this.f74257);
                        c1297.m4448(c21054M18751);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f74273 != null) {
                    c1297.m4473(this.f74273);
                }
                c1297.m4467(i);
                if (this.f74296) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c1297.m4462(str8);
                c1297.m4465(str11);
                c1297.m4451(i2);
                c1297.m4471(this.f74292);
                c1297.m4466(i119);
                c1297.m4446(list);
                c1297.m4445(str);
                c1297.m4447(this.f74247);
                C8353 c8353M44414 = c1297.m4440();
                InterfaceC19383 interfaceC19383Mo342113 = interfaceC21830.mo3429(this.f74297, i6);
                this.f74276 = interfaceC19383Mo342113;
                interfaceC19383Mo342113.mo8456(c8353M44414);
                return;
            case 15:
            case 21:
                str10 = "audio/vnd.dts";
                str12 = str10;
                list4 = null;
                str7 = null;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f74290 != null) {
                    str = c19126M44156.f60276;
                    str11 = "video/dolby-vision";
                }
                boolean z16 = this.f74259;
                if (this.f74249) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1110 = (z16 ? 1 : 0) | i5;
                c1297 = new C1297();
                if (C9786.m24810(str11)) {
                    c1297.m4472(this.f74286);
                    c1297.m4456(this.f74267);
                    c1297.m4475(i3);
                    i6 = 1;
                } else {
                    if (C9786.m24801(str11)) {
                        if (this.f74256 == 0) {
                            i10 = this.f74288;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f74250;
                            }
                            this.f74288 = i10;
                            i11 = this.f74253;
                            if (i11 == -1) {
                                i11 = this.f74295;
                            }
                            this.f74253 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f74288;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f74265) {
                            if (this.f74287 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder16 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder16.put((byte) 0);
                                byteBufferOrder16.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) (this.f74274 + 0.5f));
                                byteBufferOrder16.putShort((short) (this.f74270 + 0.5f));
                                byteBufferOrder16.putShort((short) this.f74255);
                                byteBufferOrder16.putShort((short) this.f74275);
                            }
                            C6942 c69417 = new C6942();
                            c69417.m18755(this.f74293);
                            c69417.m18754(this.f74262);
                            c69417.m18757(this.f74268);
                            c69417.m18753(bArr);
                            c69417.m18756(this.f74271);
                            c69417.m18752(this.f74271);
                            c21054M18751 = c69417.m18751();
                        }
                        if (this.f74273 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f74269 == 0) {
                            if (Float.compare(this.f74263, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c1297.m4453(this.f74250);
                        c1297.m4457(this.f74295);
                        c1297.m4460(f);
                        c1297.m4439(iIntValue);
                        c1297.m4450(this.f74278);
                        c1297.m4478(this.f74257);
                        c1297.m4448(c21054M18751);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f74273 != null) {
                    c1297.m4473(this.f74273);
                }
                c1297.m4467(i);
                if (this.f74296) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c1297.m4462(str8);
                c1297.m4465(str11);
                c1297.m4451(i2);
                c1297.m4471(this.f74292);
                c1297.m4466(i1110);
                c1297.m4446(list);
                c1297.m4445(str);
                c1297.m4447(this.f74247);
                C8353 c8353M44415 = c1297.m4440();
                InterfaceC19383 interfaceC19383Mo342114 = interfaceC21830.mo3429(this.f74297, i6);
                this.f74276 = interfaceC19383Mo342114;
                interfaceC19383Mo342114.mo8456(c8353M44415);
                return;
            case 16:
                byte[] bArr7 = this.f74298;
                str4 = "video/av01";
                listOf2 = bArr7 == null ? null : AbstractC14545.of((Object) bArr7);
                str12 = str4;
                listOf = listOf2;
                str7 = null;
                list4 = listOf;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f74290 != null) {
                    str = c19126M44156.f60276;
                    str11 = "video/dolby-vision";
                }
                boolean z17 = this.f74259;
                if (this.f74249) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1111 = (z17 ? 1 : 0) | i5;
                c1297 = new C1297();
                if (C9786.m24810(str11)) {
                    c1297.m4472(this.f74286);
                    c1297.m4456(this.f74267);
                    c1297.m4475(i3);
                    i6 = 1;
                } else {
                    if (C9786.m24801(str11)) {
                        if (this.f74256 == 0) {
                            i10 = this.f74288;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f74250;
                            }
                            this.f74288 = i10;
                            i11 = this.f74253;
                            if (i11 == -1) {
                                i11 = this.f74295;
                            }
                            this.f74253 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f74288;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f74265) {
                            if (this.f74287 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder17 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder17.put((byte) 0);
                                byteBufferOrder17.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) (this.f74274 + 0.5f));
                                byteBufferOrder17.putShort((short) (this.f74270 + 0.5f));
                                byteBufferOrder17.putShort((short) this.f74255);
                                byteBufferOrder17.putShort((short) this.f74275);
                            }
                            C6942 c69418 = new C6942();
                            c69418.m18755(this.f74293);
                            c69418.m18754(this.f74262);
                            c69418.m18757(this.f74268);
                            c69418.m18753(bArr);
                            c69418.m18756(this.f74271);
                            c69418.m18752(this.f74271);
                            c21054M18751 = c69418.m18751();
                        }
                        if (this.f74273 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f74269 == 0) {
                            if (Float.compare(this.f74263, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c1297.m4453(this.f74250);
                        c1297.m4457(this.f74295);
                        c1297.m4460(f);
                        c1297.m4439(iIntValue);
                        c1297.m4450(this.f74278);
                        c1297.m4478(this.f74257);
                        c1297.m4448(c21054M18751);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f74273 != null) {
                    c1297.m4473(this.f74273);
                }
                c1297.m4467(i);
                if (this.f74296) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c1297.m4462(str8);
                c1297.m4465(str11);
                c1297.m4451(i2);
                c1297.m4471(this.f74292);
                c1297.m4466(i1111);
                c1297.m4446(list);
                c1297.m4445(str);
                c1297.m4447(this.f74247);
                C8353 c8353M44416 = c1297.m4440();
                InterfaceC19383 interfaceC19383Mo342115 = interfaceC21830.mo3429(this.f74297, i6);
                this.f74276 = interfaceC19383Mo342115;
                interfaceC19383Mo342115.mo8456(c8353M44416);
                return;
            case 17:
                str10 = "video/x-vnd.on2.vp8";
                str12 = str10;
                list4 = null;
                str7 = null;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f74290 != null) {
                    str = c19126M44156.f60276;
                    str11 = "video/dolby-vision";
                }
                boolean z18 = this.f74259;
                if (this.f74249) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1112 = (z18 ? 1 : 0) | i5;
                c1297 = new C1297();
                if (C9786.m24810(str11)) {
                    c1297.m4472(this.f74286);
                    c1297.m4456(this.f74267);
                    c1297.m4475(i3);
                    i6 = 1;
                } else {
                    if (C9786.m24801(str11)) {
                        if (this.f74256 == 0) {
                            i10 = this.f74288;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f74250;
                            }
                            this.f74288 = i10;
                            i11 = this.f74253;
                            if (i11 == -1) {
                                i11 = this.f74295;
                            }
                            this.f74253 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f74288;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f74265) {
                            if (this.f74287 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder18 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder18.put((byte) 0);
                                byteBufferOrder18.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) (this.f74274 + 0.5f));
                                byteBufferOrder18.putShort((short) (this.f74270 + 0.5f));
                                byteBufferOrder18.putShort((short) this.f74255);
                                byteBufferOrder18.putShort((short) this.f74275);
                            }
                            C6942 c69419 = new C6942();
                            c69419.m18755(this.f74293);
                            c69419.m18754(this.f74262);
                            c69419.m18757(this.f74268);
                            c69419.m18753(bArr);
                            c69419.m18756(this.f74271);
                            c69419.m18752(this.f74271);
                            c21054M18751 = c69419.m18751();
                        }
                        if (this.f74273 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f74269 == 0) {
                            if (Float.compare(this.f74263, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c1297.m4453(this.f74250);
                        c1297.m4457(this.f74295);
                        c1297.m4460(f);
                        c1297.m4439(iIntValue);
                        c1297.m4450(this.f74278);
                        c1297.m4478(this.f74257);
                        c1297.m4448(c21054M18751);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f74273 != null) {
                    c1297.m4473(this.f74273);
                }
                c1297.m4467(i);
                if (this.f74296) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c1297.m4462(str8);
                c1297.m4465(str11);
                c1297.m4451(i2);
                c1297.m4471(this.f74292);
                c1297.m4466(i1112);
                c1297.m4446(list);
                c1297.m4445(str);
                c1297.m4447(this.f74247);
                C8353 c8353M44417 = c1297.m4440();
                InterfaceC19383 interfaceC19383Mo342116 = interfaceC21830.mo3429(this.f74297, i6);
                this.f74276 = interfaceC19383Mo342116;
                interfaceC19383Mo342116.mo8456(c8353M44417);
                return;
            case 18:
                byte[] bArr8 = this.f74298;
                str4 = "video/x-vnd.on2.vp9";
                listOf2 = bArr8 == null ? null : AbstractC14545.of((Object) bArr8);
                str12 = str4;
                listOf = listOf2;
                str7 = null;
                list4 = listOf;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f74290 != null) {
                    str = c19126M44156.f60276;
                    str11 = "video/dolby-vision";
                }
                boolean z19 = this.f74259;
                if (this.f74249) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1113 = (z19 ? 1 : 0) | i5;
                c1297 = new C1297();
                if (C9786.m24810(str11)) {
                    c1297.m4472(this.f74286);
                    c1297.m4456(this.f74267);
                    c1297.m4475(i3);
                    i6 = 1;
                } else {
                    if (C9786.m24801(str11)) {
                        if (this.f74256 == 0) {
                            i10 = this.f74288;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f74250;
                            }
                            this.f74288 = i10;
                            i11 = this.f74253;
                            if (i11 == -1) {
                                i11 = this.f74295;
                            }
                            this.f74253 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f74288;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f74265) {
                            if (this.f74287 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder19 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder19.put((byte) 0);
                                byteBufferOrder19.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) (this.f74274 + 0.5f));
                                byteBufferOrder19.putShort((short) (this.f74270 + 0.5f));
                                byteBufferOrder19.putShort((short) this.f74255);
                                byteBufferOrder19.putShort((short) this.f74275);
                            }
                            C6942 c694110 = new C6942();
                            c694110.m18755(this.f74293);
                            c694110.m18754(this.f74262);
                            c694110.m18757(this.f74268);
                            c694110.m18753(bArr);
                            c694110.m18756(this.f74271);
                            c694110.m18752(this.f74271);
                            c21054M18751 = c694110.m18751();
                        }
                        if (this.f74273 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f74269 == 0) {
                            if (Float.compare(this.f74263, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c1297.m4453(this.f74250);
                        c1297.m4457(this.f74295);
                        c1297.m4460(f);
                        c1297.m4439(iIntValue);
                        c1297.m4450(this.f74278);
                        c1297.m4478(this.f74257);
                        c1297.m4448(c21054M18751);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f74273 != null) {
                    c1297.m4473(this.f74273);
                }
                c1297.m4467(i);
                if (this.f74296) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c1297.m4462(str8);
                c1297.m4465(str11);
                c1297.m4451(i2);
                c1297.m4471(this.f74292);
                c1297.m4466(i1113);
                c1297.m4446(list);
                c1297.m4445(str);
                c1297.m4447(this.f74247);
                C8353 c8353M44418 = c1297.m4440();
                InterfaceC19383 interfaceC19383Mo342117 = interfaceC21830.mo3429(this.f74297, i6);
                this.f74276 = interfaceC19383Mo342117;
                interfaceC19383Mo342117.mo8456(c8353M44418);
                return;
            case 19:
                str12 = "application/pgs";
                list4 = null;
                str7 = null;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f74290 != null) {
                    str = c19126M44156.f60276;
                    str11 = "video/dolby-vision";
                }
                boolean z110 = this.f74259;
                if (this.f74249) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1114 = (z110 ? 1 : 0) | i5;
                c1297 = new C1297();
                if (C9786.m24810(str11)) {
                    c1297.m4472(this.f74286);
                    c1297.m4456(this.f74267);
                    c1297.m4475(i3);
                    i6 = 1;
                } else {
                    if (C9786.m24801(str11)) {
                        if (this.f74256 == 0) {
                            i10 = this.f74288;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f74250;
                            }
                            this.f74288 = i10;
                            i11 = this.f74253;
                            if (i11 == -1) {
                                i11 = this.f74295;
                            }
                            this.f74253 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f74288;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f74265) {
                            if (this.f74287 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder110 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder110.put((byte) 0);
                                byteBufferOrder110.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) (this.f74274 + 0.5f));
                                byteBufferOrder110.putShort((short) (this.f74270 + 0.5f));
                                byteBufferOrder110.putShort((short) this.f74255);
                                byteBufferOrder110.putShort((short) this.f74275);
                            }
                            C6942 c694111 = new C6942();
                            c694111.m18755(this.f74293);
                            c694111.m18754(this.f74262);
                            c694111.m18757(this.f74268);
                            c694111.m18753(bArr);
                            c694111.m18756(this.f74271);
                            c694111.m18752(this.f74271);
                            c21054M18751 = c694111.m18751();
                        }
                        if (this.f74273 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f74269 == 0) {
                            if (Float.compare(this.f74263, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c1297.m4453(this.f74250);
                        c1297.m4457(this.f74295);
                        c1297.m4460(f);
                        c1297.m4439(iIntValue);
                        c1297.m4450(this.f74278);
                        c1297.m4478(this.f74257);
                        c1297.m4448(c21054M18751);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f74273 != null) {
                    c1297.m4473(this.f74273);
                }
                c1297.m4467(i);
                if (this.f74296) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c1297.m4462(str8);
                c1297.m4465(str11);
                c1297.m4451(i2);
                c1297.m4471(this.f74292);
                c1297.m4466(i1114);
                c1297.m4446(list);
                c1297.m4445(str);
                c1297.m4447(this.f74247);
                C8353 c8353M44419 = c1297.m4440();
                InterfaceC19383 interfaceC19383Mo342118 = interfaceC21830.mo3429(this.f74297, i6);
                this.f74276 = interfaceC19383Mo342118;
                interfaceC19383Mo342118.mo8456(c8353M44419);
                return;
            case 20:
                str12 = str10;
                list4 = null;
                str7 = null;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f74290 != null) {
                    str = c19126M44156.f60276;
                    str11 = "video/dolby-vision";
                }
                boolean z111 = this.f74259;
                if (this.f74249) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1115 = (z111 ? 1 : 0) | i5;
                c1297 = new C1297();
                if (C9786.m24810(str11)) {
                    c1297.m4472(this.f74286);
                    c1297.m4456(this.f74267);
                    c1297.m4475(i3);
                    i6 = 1;
                } else {
                    if (C9786.m24801(str11)) {
                        if (this.f74256 == 0) {
                            i10 = this.f74288;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f74250;
                            }
                            this.f74288 = i10;
                            i11 = this.f74253;
                            if (i11 == -1) {
                                i11 = this.f74295;
                            }
                            this.f74253 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f74288;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f74265) {
                            if (this.f74287 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder111 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder111.put((byte) 0);
                                byteBufferOrder111.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) (this.f74274 + 0.5f));
                                byteBufferOrder111.putShort((short) (this.f74270 + 0.5f));
                                byteBufferOrder111.putShort((short) this.f74255);
                                byteBufferOrder111.putShort((short) this.f74275);
                            }
                            C6942 c694112 = new C6942();
                            c694112.m18755(this.f74293);
                            c694112.m18754(this.f74262);
                            c694112.m18757(this.f74268);
                            c694112.m18753(bArr);
                            c694112.m18756(this.f74271);
                            c694112.m18752(this.f74271);
                            c21054M18751 = c694112.m18751();
                        }
                        if (this.f74273 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f74269 == 0) {
                            if (Float.compare(this.f74263, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c1297.m4453(this.f74250);
                        c1297.m4457(this.f74295);
                        c1297.m4460(f);
                        c1297.m4439(iIntValue);
                        c1297.m4450(this.f74278);
                        c1297.m4478(this.f74257);
                        c1297.m4448(c21054M18751);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f74273 != null) {
                    c1297.m4473(this.f74273);
                }
                c1297.m4467(i);
                if (this.f74296) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c1297.m4462(str8);
                c1297.m4465(str11);
                c1297.m4451(i2);
                c1297.m4471(this.f74292);
                c1297.m4466(i1115);
                c1297.m4446(list);
                c1297.m4445(str);
                c1297.m4447(this.f74247);
                C8353 c8353M444110 = c1297.m4440();
                InterfaceC19383 interfaceC19383Mo342119 = interfaceC21830.mo3429(this.f74297, i6);
                this.f74276 = interfaceC19383Mo342119;
                interfaceC19383Mo342119.mo8456(c8353M444110);
                return;
            case 22:
                if (this.f74251 == 32) {
                    list = null;
                    str = null;
                    i2 = -1;
                    i3 = 4;
                } else {
                    C19956.m46037("Unsupported floating point PCM bit depth: " + this.f74251 + ". Setting mimeType to audio/x-unknown");
                    list4 = null;
                    str7 = null;
                    str = str7;
                    str2 = str12;
                    i4 = -1;
                    list2 = list4;
                    str11 = str2;
                    i2 = i4;
                    list5 = list2;
                    i3 = -1;
                    list = list5;
                }
                if (this.f74290 != null) {
                    str = c19126M44156.f60276;
                    str11 = "video/dolby-vision";
                }
                boolean z112 = this.f74259;
                if (this.f74249) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1116 = (z112 ? 1 : 0) | i5;
                c1297 = new C1297();
                if (C9786.m24810(str11)) {
                    c1297.m4472(this.f74286);
                    c1297.m4456(this.f74267);
                    c1297.m4475(i3);
                    i6 = 1;
                } else {
                    if (C9786.m24801(str11)) {
                        if (this.f74256 == 0) {
                            i10 = this.f74288;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f74250;
                            }
                            this.f74288 = i10;
                            i11 = this.f74253;
                            if (i11 == -1) {
                                i11 = this.f74295;
                            }
                            this.f74253 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f74288;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f74265) {
                            if (this.f74287 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder112 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder112.put((byte) 0);
                                byteBufferOrder112.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) (this.f74274 + 0.5f));
                                byteBufferOrder112.putShort((short) (this.f74270 + 0.5f));
                                byteBufferOrder112.putShort((short) this.f74255);
                                byteBufferOrder112.putShort((short) this.f74275);
                            }
                            C6942 c694113 = new C6942();
                            c694113.m18755(this.f74293);
                            c694113.m18754(this.f74262);
                            c694113.m18757(this.f74268);
                            c694113.m18753(bArr);
                            c694113.m18756(this.f74271);
                            c694113.m18752(this.f74271);
                            c21054M18751 = c694113.m18751();
                        }
                        if (this.f74273 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f74269 == 0) {
                            if (Float.compare(this.f74263, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c1297.m4453(this.f74250);
                        c1297.m4457(this.f74295);
                        c1297.m4460(f);
                        c1297.m4439(iIntValue);
                        c1297.m4450(this.f74278);
                        c1297.m4478(this.f74257);
                        c1297.m4448(c21054M18751);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f74273 != null) {
                    c1297.m4473(this.f74273);
                }
                c1297.m4467(i);
                if (this.f74296) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c1297.m4462(str8);
                c1297.m4465(str11);
                c1297.m4451(i2);
                c1297.m4471(this.f74292);
                c1297.m4466(i1116);
                c1297.m4446(list);
                c1297.m4445(str);
                c1297.m4447(this.f74247);
                C8353 c8353M444111 = c1297.m4440();
                InterfaceC19383 interfaceC19383Mo3421110 = interfaceC21830.mo3429(this.f74297, i6);
                this.f74276 = interfaceC19383Mo3421110;
                interfaceC19383Mo3421110.mo8456(c8353M444111);
                return;
            case 23:
                int i29 = this.f74251;
                if (i29 == 8) {
                    list = null;
                    str = null;
                    i2 = -1;
                    i3 = 3;
                } else {
                    if (i29 == 16) {
                        iM11003 = 268435456;
                    } else if (i29 == 24) {
                        iM11003 = 1342177280;
                    } else if (i29 == 32) {
                        iM11003 = 1610612736;
                    } else {
                        C19956.m46037("Unsupported big endian PCM bit depth: " + this.f74251 + ". Setting mimeType to audio/x-unknown");
                        list4 = null;
                        str7 = null;
                        str = str7;
                        str2 = str12;
                        i4 = -1;
                        list2 = list4;
                        str11 = str2;
                        i2 = i4;
                        list5 = list2;
                        i3 = -1;
                        list = list5;
                    }
                    i2 = -1;
                    i3 = iM11003;
                    list = null;
                    str = null;
                }
                if (this.f74290 != null) {
                    str = c19126M44156.f60276;
                    str11 = "video/dolby-vision";
                }
                boolean z113 = this.f74259;
                if (this.f74249) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1117 = (z113 ? 1 : 0) | i5;
                c1297 = new C1297();
                if (C9786.m24810(str11)) {
                    c1297.m4472(this.f74286);
                    c1297.m4456(this.f74267);
                    c1297.m4475(i3);
                    i6 = 1;
                } else {
                    if (C9786.m24801(str11)) {
                        if (this.f74256 == 0) {
                            i10 = this.f74288;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f74250;
                            }
                            this.f74288 = i10;
                            i11 = this.f74253;
                            if (i11 == -1) {
                                i11 = this.f74295;
                            }
                            this.f74253 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f74288;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f74265) {
                            if (this.f74287 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder113 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder113.put((byte) 0);
                                byteBufferOrder113.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) (this.f74274 + 0.5f));
                                byteBufferOrder113.putShort((short) (this.f74270 + 0.5f));
                                byteBufferOrder113.putShort((short) this.f74255);
                                byteBufferOrder113.putShort((short) this.f74275);
                            }
                            C6942 c694114 = new C6942();
                            c694114.m18755(this.f74293);
                            c694114.m18754(this.f74262);
                            c694114.m18757(this.f74268);
                            c694114.m18753(bArr);
                            c694114.m18756(this.f74271);
                            c694114.m18752(this.f74271);
                            c21054M18751 = c694114.m18751();
                        }
                        if (this.f74273 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f74269 == 0) {
                            if (Float.compare(this.f74263, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c1297.m4453(this.f74250);
                        c1297.m4457(this.f74295);
                        c1297.m4460(f);
                        c1297.m4439(iIntValue);
                        c1297.m4450(this.f74278);
                        c1297.m4478(this.f74257);
                        c1297.m4448(c21054M18751);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f74273 != null) {
                    c1297.m4473(this.f74273);
                }
                c1297.m4467(i);
                if (this.f74296) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c1297.m4462(str8);
                c1297.m4465(str11);
                c1297.m4451(i2);
                c1297.m4471(this.f74292);
                c1297.m4466(i1117);
                c1297.m4446(list);
                c1297.m4445(str);
                c1297.m4447(this.f74247);
                C8353 c8353M444112 = c1297.m4440();
                InterfaceC19383 interfaceC19383Mo3421111 = interfaceC21830.mo3429(this.f74297, i6);
                this.f74276 = interfaceC19383Mo3421111;
                interfaceC19383Mo3421111.mo8456(c8353M444112);
                return;
            case 24:
                int i30 = this.f74251;
                String str14 = C3603.f11424;
                iM11003 = C3603.m11003(i30, ByteOrder.LITTLE_ENDIAN);
                if (iM11003 == 0) {
                    C19956.m46037("Unsupported little endian PCM bit depth: " + this.f74251 + ". Setting mimeType to audio/x-unknown");
                    list4 = null;
                    str7 = null;
                    str = str7;
                    str2 = str12;
                    i4 = -1;
                    list2 = list4;
                    str11 = str2;
                    i2 = i4;
                    list5 = list2;
                    i3 = -1;
                    list = list5;
                } else {
                    i2 = -1;
                    i3 = iM11003;
                    list = null;
                    str = null;
                }
                if (this.f74290 != null) {
                    str = c19126M44156.f60276;
                    str11 = "video/dolby-vision";
                }
                boolean z114 = this.f74259;
                if (this.f74249) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1118 = (z114 ? 1 : 0) | i5;
                c1297 = new C1297();
                if (C9786.m24810(str11)) {
                    c1297.m4472(this.f74286);
                    c1297.m4456(this.f74267);
                    c1297.m4475(i3);
                    i6 = 1;
                } else {
                    if (C9786.m24801(str11)) {
                        if (this.f74256 == 0) {
                            i10 = this.f74288;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f74250;
                            }
                            this.f74288 = i10;
                            i11 = this.f74253;
                            if (i11 == -1) {
                                i11 = this.f74295;
                            }
                            this.f74253 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f74288;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f74265) {
                            if (this.f74287 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder114 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder114.put((byte) 0);
                                byteBufferOrder114.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) (this.f74274 + 0.5f));
                                byteBufferOrder114.putShort((short) (this.f74270 + 0.5f));
                                byteBufferOrder114.putShort((short) this.f74255);
                                byteBufferOrder114.putShort((short) this.f74275);
                            }
                            C6942 c694115 = new C6942();
                            c694115.m18755(this.f74293);
                            c694115.m18754(this.f74262);
                            c694115.m18757(this.f74268);
                            c694115.m18753(bArr);
                            c694115.m18756(this.f74271);
                            c694115.m18752(this.f74271);
                            c21054M18751 = c694115.m18751();
                        }
                        if (this.f74273 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f74269 == 0) {
                            if (Float.compare(this.f74263, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c1297.m4453(this.f74250);
                        c1297.m4457(this.f74295);
                        c1297.m4460(f);
                        c1297.m4439(iIntValue);
                        c1297.m4450(this.f74278);
                        c1297.m4478(this.f74257);
                        c1297.m4448(c21054M18751);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f74273 != null) {
                    c1297.m4473(this.f74273);
                }
                c1297.m4467(i);
                if (this.f74296) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c1297.m4462(str8);
                c1297.m4465(str11);
                c1297.m4451(i2);
                c1297.m4471(this.f74292);
                c1297.m4466(i1118);
                c1297.m4446(list);
                c1297.m4445(str);
                c1297.m4447(this.f74247);
                C8353 c8353M444113 = c1297.m4440();
                InterfaceC19383 interfaceC19383Mo3421112 = interfaceC21830.mo3429(this.f74297, i6);
                this.f74276 = interfaceC19383Mo3421112;
                interfaceC19383Mo3421112.mo8456(c8353M444113);
                return;
            case 25:
            case 26:
                str12 = "text/x-ssa";
                listOf = AbstractC14545.of((Object) C13920.f41501, (Object) m51252(this.f74277));
                str7 = null;
                list4 = listOf;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f74290 != null) {
                    str = c19126M44156.f60276;
                    str11 = "video/dolby-vision";
                }
                boolean z115 = this.f74259;
                if (this.f74249) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1119 = (z115 ? 1 : 0) | i5;
                c1297 = new C1297();
                if (C9786.m24810(str11)) {
                    c1297.m4472(this.f74286);
                    c1297.m4456(this.f74267);
                    c1297.m4475(i3);
                    i6 = 1;
                } else {
                    if (C9786.m24801(str11)) {
                        if (this.f74256 == 0) {
                            i10 = this.f74288;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f74250;
                            }
                            this.f74288 = i10;
                            i11 = this.f74253;
                            if (i11 == -1) {
                                i11 = this.f74295;
                            }
                            this.f74253 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f74288;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f74265) {
                            if (this.f74287 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder115 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder115.put((byte) 0);
                                byteBufferOrder115.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) (this.f74274 + 0.5f));
                                byteBufferOrder115.putShort((short) (this.f74270 + 0.5f));
                                byteBufferOrder115.putShort((short) this.f74255);
                                byteBufferOrder115.putShort((short) this.f74275);
                            }
                            C6942 c694116 = new C6942();
                            c694116.m18755(this.f74293);
                            c694116.m18754(this.f74262);
                            c694116.m18757(this.f74268);
                            c694116.m18753(bArr);
                            c694116.m18756(this.f74271);
                            c694116.m18752(this.f74271);
                            c21054M18751 = c694116.m18751();
                        }
                        if (this.f74273 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f74269 == 0) {
                            if (Float.compare(this.f74263, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c1297.m4453(this.f74250);
                        c1297.m4457(this.f74295);
                        c1297.m4460(f);
                        c1297.m4439(iIntValue);
                        c1297.m4450(this.f74278);
                        c1297.m4478(this.f74257);
                        c1297.m4448(c21054M18751);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f74273 != null) {
                    c1297.m4473(this.f74273);
                }
                c1297.m4467(i);
                if (this.f74296) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c1297.m4462(str8);
                c1297.m4465(str11);
                c1297.m4451(i2);
                c1297.m4471(this.f74292);
                c1297.m4466(i1119);
                c1297.m4446(list);
                c1297.m4445(str);
                c1297.m4447(this.f74247);
                C8353 c8353M444114 = c1297.m4440();
                InterfaceC19383 interfaceC19383Mo3421113 = interfaceC21830.mo3429(this.f74297, i6);
                this.f74276 = interfaceC19383Mo3421113;
                interfaceC19383Mo3421113.mo8456(c8353M444114);
                return;
            case 27:
                C10916 c10916M27219 = C10916.m27219(new C17714(m51252(this.f74277)));
                List list7 = c10916M27219.f32808;
                this.f74261 = c10916M27219.f32794;
                str5 = c10916M27219.f32803;
                str6 = "video/hevc";
                list3 = list7;
                str12 = str6;
                List list8 = list3;
                str7 = str5;
                list4 = list8;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f74290 != null) {
                    str = c19126M44156.f60276;
                    str11 = "video/dolby-vision";
                }
                boolean z116 = this.f74259;
                if (this.f74249) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i11110 = (z116 ? 1 : 0) | i5;
                c1297 = new C1297();
                if (C9786.m24810(str11)) {
                    c1297.m4472(this.f74286);
                    c1297.m4456(this.f74267);
                    c1297.m4475(i3);
                    i6 = 1;
                } else {
                    if (C9786.m24801(str11)) {
                        if (this.f74256 == 0) {
                            i10 = this.f74288;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f74250;
                            }
                            this.f74288 = i10;
                            i11 = this.f74253;
                            if (i11 == -1) {
                                i11 = this.f74295;
                            }
                            this.f74253 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f74288;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f74265) {
                            if (this.f74287 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder116 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder116.put((byte) 0);
                                byteBufferOrder116.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) (this.f74274 + 0.5f));
                                byteBufferOrder116.putShort((short) (this.f74270 + 0.5f));
                                byteBufferOrder116.putShort((short) this.f74255);
                                byteBufferOrder116.putShort((short) this.f74275);
                            }
                            C6942 c694117 = new C6942();
                            c694117.m18755(this.f74293);
                            c694117.m18754(this.f74262);
                            c694117.m18757(this.f74268);
                            c694117.m18753(bArr);
                            c694117.m18756(this.f74271);
                            c694117.m18752(this.f74271);
                            c21054M18751 = c694117.m18751();
                        }
                        if (this.f74273 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f74269 == 0) {
                            if (Float.compare(this.f74263, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c1297.m4453(this.f74250);
                        c1297.m4457(this.f74295);
                        c1297.m4460(f);
                        c1297.m4439(iIntValue);
                        c1297.m4450(this.f74278);
                        c1297.m4478(this.f74257);
                        c1297.m4448(c21054M18751);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f74273 != null) {
                    c1297.m4473(this.f74273);
                }
                c1297.m4467(i);
                if (this.f74296) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c1297.m4462(str8);
                c1297.m4465(str11);
                c1297.m4451(i2);
                c1297.m4471(this.f74292);
                c1297.m4466(i11110);
                c1297.m4446(list);
                c1297.m4445(str);
                c1297.m4447(this.f74247);
                C8353 c8353M444115 = c1297.m4440();
                InterfaceC19383 interfaceC19383Mo3421114 = interfaceC21830.mo3429(this.f74297, i6);
                this.f74276 = interfaceC19383Mo3421114;
                interfaceC19383Mo3421114.mo8456(c8353M444115);
                return;
            case 28:
                str12 = "text/vtt";
                list4 = null;
                str7 = null;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f74290 != null) {
                    str = c19126M44156.f60276;
                    str11 = "video/dolby-vision";
                }
                boolean z117 = this.f74259;
                if (this.f74249) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i11111 = (z117 ? 1 : 0) | i5;
                c1297 = new C1297();
                if (C9786.m24810(str11)) {
                    c1297.m4472(this.f74286);
                    c1297.m4456(this.f74267);
                    c1297.m4475(i3);
                    i6 = 1;
                } else {
                    if (C9786.m24801(str11)) {
                        if (this.f74256 == 0) {
                            i10 = this.f74288;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f74250;
                            }
                            this.f74288 = i10;
                            i11 = this.f74253;
                            if (i11 == -1) {
                                i11 = this.f74295;
                            }
                            this.f74253 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f74288;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f74265) {
                            if (this.f74287 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder117 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder117.put((byte) 0);
                                byteBufferOrder117.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) (this.f74274 + 0.5f));
                                byteBufferOrder117.putShort((short) (this.f74270 + 0.5f));
                                byteBufferOrder117.putShort((short) this.f74255);
                                byteBufferOrder117.putShort((short) this.f74275);
                            }
                            C6942 c694118 = new C6942();
                            c694118.m18755(this.f74293);
                            c694118.m18754(this.f74262);
                            c694118.m18757(this.f74268);
                            c694118.m18753(bArr);
                            c694118.m18756(this.f74271);
                            c694118.m18752(this.f74271);
                            c21054M18751 = c694118.m18751();
                        }
                        if (this.f74273 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f74269 == 0) {
                            if (Float.compare(this.f74263, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c1297.m4453(this.f74250);
                        c1297.m4457(this.f74295);
                        c1297.m4460(f);
                        c1297.m4439(iIntValue);
                        c1297.m4450(this.f74278);
                        c1297.m4478(this.f74257);
                        c1297.m4448(c21054M18751);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f74273 != null) {
                    c1297.m4473(this.f74273);
                }
                c1297.m4467(i);
                if (this.f74296) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c1297.m4462(str8);
                c1297.m4465(str11);
                c1297.m4451(i2);
                c1297.m4471(this.f74292);
                c1297.m4466(i11111);
                c1297.m4446(list);
                c1297.m4445(str);
                c1297.m4447(this.f74247);
                C8353 c8353M444116 = c1297.m4440();
                InterfaceC19383 interfaceC19383Mo3421115 = interfaceC21830.mo3429(this.f74297, i6);
                this.f74276 = interfaceC19383Mo3421115;
                interfaceC19383Mo3421115.mo8456(c8353M444116);
                return;
            case 29:
                str12 = "application/x-subrip";
                list4 = null;
                str7 = null;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f74290 != null) {
                    str = c19126M44156.f60276;
                    str11 = "video/dolby-vision";
                }
                boolean z118 = this.f74259;
                if (this.f74249) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i11112 = (z118 ? 1 : 0) | i5;
                c1297 = new C1297();
                if (C9786.m24810(str11)) {
                    c1297.m4472(this.f74286);
                    c1297.m4456(this.f74267);
                    c1297.m4475(i3);
                    i6 = 1;
                } else {
                    if (C9786.m24801(str11)) {
                        if (this.f74256 == 0) {
                            i10 = this.f74288;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f74250;
                            }
                            this.f74288 = i10;
                            i11 = this.f74253;
                            if (i11 == -1) {
                                i11 = this.f74295;
                            }
                            this.f74253 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f74288;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f74265) {
                            if (this.f74287 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder118 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder118.put((byte) 0);
                                byteBufferOrder118.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) (this.f74274 + 0.5f));
                                byteBufferOrder118.putShort((short) (this.f74270 + 0.5f));
                                byteBufferOrder118.putShort((short) this.f74255);
                                byteBufferOrder118.putShort((short) this.f74275);
                            }
                            C6942 c694119 = new C6942();
                            c694119.m18755(this.f74293);
                            c694119.m18754(this.f74262);
                            c694119.m18757(this.f74268);
                            c694119.m18753(bArr);
                            c694119.m18756(this.f74271);
                            c694119.m18752(this.f74271);
                            c21054M18751 = c694119.m18751();
                        }
                        if (this.f74273 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f74269 == 0) {
                            if (Float.compare(this.f74263, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c1297.m4453(this.f74250);
                        c1297.m4457(this.f74295);
                        c1297.m4460(f);
                        c1297.m4439(iIntValue);
                        c1297.m4450(this.f74278);
                        c1297.m4478(this.f74257);
                        c1297.m4448(c21054M18751);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f74273 != null) {
                    c1297.m4473(this.f74273);
                }
                c1297.m4467(i);
                if (this.f74296) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c1297.m4462(str8);
                c1297.m4465(str11);
                c1297.m4451(i2);
                c1297.m4471(this.f74292);
                c1297.m4466(i11112);
                c1297.m4446(list);
                c1297.m4445(str);
                c1297.m4447(this.f74247);
                C8353 c8353M444117 = c1297.m4440();
                InterfaceC19383 interfaceC19383Mo3421116 = interfaceC21830.mo3429(this.f74297, i6);
                this.f74276 = interfaceC19383Mo3421116;
                interfaceC19383Mo3421116.mo8456(c8353M444117);
                return;
            case 30:
                str10 = "video/mpeg2";
                str12 = str10;
                list4 = null;
                str7 = null;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f74290 != null) {
                    str = c19126M44156.f60276;
                    str11 = "video/dolby-vision";
                }
                boolean z119 = this.f74259;
                if (this.f74249) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i11113 = (z119 ? 1 : 0) | i5;
                c1297 = new C1297();
                if (C9786.m24810(str11)) {
                    c1297.m4472(this.f74286);
                    c1297.m4456(this.f74267);
                    c1297.m4475(i3);
                    i6 = 1;
                } else {
                    if (C9786.m24801(str11)) {
                        if (this.f74256 == 0) {
                            i10 = this.f74288;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f74250;
                            }
                            this.f74288 = i10;
                            i11 = this.f74253;
                            if (i11 == -1) {
                                i11 = this.f74295;
                            }
                            this.f74253 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f74288;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f74265) {
                            if (this.f74287 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder119 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder119.put((byte) 0);
                                byteBufferOrder119.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) (this.f74274 + 0.5f));
                                byteBufferOrder119.putShort((short) (this.f74270 + 0.5f));
                                byteBufferOrder119.putShort((short) this.f74255);
                                byteBufferOrder119.putShort((short) this.f74275);
                            }
                            C6942 c6941110 = new C6942();
                            c6941110.m18755(this.f74293);
                            c6941110.m18754(this.f74262);
                            c6941110.m18757(this.f74268);
                            c6941110.m18753(bArr);
                            c6941110.m18756(this.f74271);
                            c6941110.m18752(this.f74271);
                            c21054M18751 = c6941110.m18751();
                        }
                        if (this.f74273 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f74269 == 0) {
                            if (Float.compare(this.f74263, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c1297.m4453(this.f74250);
                        c1297.m4457(this.f74295);
                        c1297.m4460(f);
                        c1297.m4439(iIntValue);
                        c1297.m4450(this.f74278);
                        c1297.m4478(this.f74257);
                        c1297.m4448(c21054M18751);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f74273 != null) {
                    c1297.m4473(this.f74273);
                }
                c1297.m4467(i);
                if (this.f74296) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c1297.m4462(str8);
                c1297.m4465(str11);
                c1297.m4451(i2);
                c1297.m4471(this.f74292);
                c1297.m4466(i11113);
                c1297.m4446(list);
                c1297.m4445(str);
                c1297.m4447(this.f74247);
                C8353 c8353M444118 = c1297.m4440();
                InterfaceC19383 interfaceC19383Mo3421117 = interfaceC21830.mo3429(this.f74297, i6);
                this.f74276 = interfaceC19383Mo3421117;
                interfaceC19383Mo3421117.mo8456(c8353M444118);
                return;
            case 31:
                str10 = "audio/eac3";
                str12 = str10;
                list4 = null;
                str7 = null;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f74290 != null) {
                    str = c19126M44156.f60276;
                    str11 = "video/dolby-vision";
                }
                boolean z1110 = this.f74259;
                if (this.f74249) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i11114 = (z1110 ? 1 : 0) | i5;
                c1297 = new C1297();
                if (C9786.m24810(str11)) {
                    c1297.m4472(this.f74286);
                    c1297.m4456(this.f74267);
                    c1297.m4475(i3);
                    i6 = 1;
                } else {
                    if (C9786.m24801(str11)) {
                        if (this.f74256 == 0) {
                            i10 = this.f74288;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f74250;
                            }
                            this.f74288 = i10;
                            i11 = this.f74253;
                            if (i11 == -1) {
                                i11 = this.f74295;
                            }
                            this.f74253 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f74288;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f74265) {
                            if (this.f74287 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder1110 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1110.put((byte) 0);
                                byteBufferOrder1110.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) (this.f74274 + 0.5f));
                                byteBufferOrder1110.putShort((short) (this.f74270 + 0.5f));
                                byteBufferOrder1110.putShort((short) this.f74255);
                                byteBufferOrder1110.putShort((short) this.f74275);
                            }
                            C6942 c6941111 = new C6942();
                            c6941111.m18755(this.f74293);
                            c6941111.m18754(this.f74262);
                            c6941111.m18757(this.f74268);
                            c6941111.m18753(bArr);
                            c6941111.m18756(this.f74271);
                            c6941111.m18752(this.f74271);
                            c21054M18751 = c6941111.m18751();
                        }
                        if (this.f74273 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f74269 == 0) {
                            if (Float.compare(this.f74263, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c1297.m4453(this.f74250);
                        c1297.m4457(this.f74295);
                        c1297.m4460(f);
                        c1297.m4439(iIntValue);
                        c1297.m4450(this.f74278);
                        c1297.m4478(this.f74257);
                        c1297.m4448(c21054M18751);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f74273 != null) {
                    c1297.m4473(this.f74273);
                }
                c1297.m4467(i);
                if (this.f74296) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c1297.m4462(str8);
                c1297.m4465(str11);
                c1297.m4451(i2);
                c1297.m4471(this.f74292);
                c1297.m4466(i11114);
                c1297.m4446(list);
                c1297.m4445(str);
                c1297.m4447(this.f74247);
                C8353 c8353M444119 = c1297.m4440();
                InterfaceC19383 interfaceC19383Mo3421118 = interfaceC21830.mo3429(this.f74297, i6);
                this.f74276 = interfaceC19383Mo3421118;
                interfaceC19383Mo3421118.mo8456(c8353M444119);
                return;
            case 32:
                str4 = "audio/flac";
                listOf2 = Collections.singletonList(m51252(this.f74277));
                str12 = str4;
                listOf = listOf2;
                str7 = null;
                list4 = listOf;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f74290 != null) {
                    str = c19126M44156.f60276;
                    str11 = "video/dolby-vision";
                }
                boolean z1111 = this.f74259;
                if (this.f74249) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i11115 = (z1111 ? 1 : 0) | i5;
                c1297 = new C1297();
                if (C9786.m24810(str11)) {
                    c1297.m4472(this.f74286);
                    c1297.m4456(this.f74267);
                    c1297.m4475(i3);
                    i6 = 1;
                } else {
                    if (C9786.m24801(str11)) {
                        if (this.f74256 == 0) {
                            i10 = this.f74288;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f74250;
                            }
                            this.f74288 = i10;
                            i11 = this.f74253;
                            if (i11 == -1) {
                                i11 = this.f74295;
                            }
                            this.f74253 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f74288;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f74265) {
                            if (this.f74287 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder1111 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1111.put((byte) 0);
                                byteBufferOrder1111.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) (this.f74274 + 0.5f));
                                byteBufferOrder1111.putShort((short) (this.f74270 + 0.5f));
                                byteBufferOrder1111.putShort((short) this.f74255);
                                byteBufferOrder1111.putShort((short) this.f74275);
                            }
                            C6942 c6941112 = new C6942();
                            c6941112.m18755(this.f74293);
                            c6941112.m18754(this.f74262);
                            c6941112.m18757(this.f74268);
                            c6941112.m18753(bArr);
                            c6941112.m18756(this.f74271);
                            c6941112.m18752(this.f74271);
                            c21054M18751 = c6941112.m18751();
                        }
                        if (this.f74273 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f74269 == 0) {
                            if (Float.compare(this.f74263, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c1297.m4453(this.f74250);
                        c1297.m4457(this.f74295);
                        c1297.m4460(f);
                        c1297.m4439(iIntValue);
                        c1297.m4450(this.f74278);
                        c1297.m4478(this.f74257);
                        c1297.m4448(c21054M18751);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f74273 != null) {
                    c1297.m4473(this.f74273);
                }
                c1297.m4467(i);
                if (this.f74296) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c1297.m4462(str8);
                c1297.m4465(str11);
                c1297.m4451(i2);
                c1297.m4471(this.f74292);
                c1297.m4466(i11115);
                c1297.m4446(list);
                c1297.m4445(str);
                c1297.m4447(this.f74247);
                C8353 c8353M4441110 = c1297.m4440();
                InterfaceC19383 interfaceC19383Mo3421119 = interfaceC21830.mo3429(this.f74297, i6);
                this.f74276 = interfaceC19383Mo3421119;
                interfaceC19383Mo3421119.mo8456(c8353M4441110);
                return;
            case 33:
                ArrayList arrayList3 = new ArrayList(3);
                arrayList3.add(m51252(this.f74277));
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                arrayList3.add(byteBufferAllocate.order(byteOrder).putLong(this.f74284).array());
                arrayList3.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.f74254).array());
                str2 = "audio/opus";
                str = null;
                i4 = 5760;
                list2 = arrayList3;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f74290 != null) {
                    str = c19126M44156.f60276;
                    str11 = "video/dolby-vision";
                }
                boolean z1112 = this.f74259;
                if (this.f74249) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i11116 = (z1112 ? 1 : 0) | i5;
                c1297 = new C1297();
                if (C9786.m24810(str11)) {
                    c1297.m4472(this.f74286);
                    c1297.m4456(this.f74267);
                    c1297.m4475(i3);
                    i6 = 1;
                } else {
                    if (C9786.m24801(str11)) {
                        if (this.f74256 == 0) {
                            i10 = this.f74288;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f74250;
                            }
                            this.f74288 = i10;
                            i11 = this.f74253;
                            if (i11 == -1) {
                                i11 = this.f74295;
                            }
                            this.f74253 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f74288;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f74265) {
                            if (this.f74287 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder1112 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1112.put((byte) 0);
                                byteBufferOrder1112.putShort((short) ((this.f74287 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f74285 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f74272 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f74283 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f74264 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f74252 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f74248 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f74260 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) (this.f74274 + 0.5f));
                                byteBufferOrder1112.putShort((short) (this.f74270 + 0.5f));
                                byteBufferOrder1112.putShort((short) this.f74255);
                                byteBufferOrder1112.putShort((short) this.f74275);
                            }
                            C6942 c6941113 = new C6942();
                            c6941113.m18755(this.f74293);
                            c6941113.m18754(this.f74262);
                            c6941113.m18757(this.f74268);
                            c6941113.m18753(bArr);
                            c6941113.m18756(this.f74271);
                            c6941113.m18752(this.f74271);
                            c21054M18751 = c6941113.m18751();
                        }
                        if (this.f74273 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f74269 == 0) {
                            if (Float.compare(this.f74263, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f74263, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f74263, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c1297.m4453(this.f74250);
                        c1297.m4457(this.f74295);
                        c1297.m4460(f);
                        c1297.m4439(iIntValue);
                        c1297.m4450(this.f74278);
                        c1297.m4478(this.f74257);
                        c1297.m4448(c21054M18751);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f74273 != null) {
                    c1297.m4473(this.f74273);
                }
                c1297.m4467(i);
                if (this.f74296) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c1297.m4462(str8);
                c1297.m4465(str11);
                c1297.m4451(i2);
                c1297.m4471(this.f74292);
                c1297.m4466(i11116);
                c1297.m4446(list);
                c1297.m4445(str);
                c1297.m4447(this.f74247);
                C8353 c8353M4441111 = c1297.m4440();
                InterfaceC19383 interfaceC19383Mo34211110 = interfaceC21830.mo3429(this.f74297, i6);
                this.f74276 = interfaceC19383Mo34211110;
                interfaceC19383Mo34211110.mo8456(c8353M4441111);
                return;
            default:
                throw C9080.m23440("Unrecognized codec identifier.", (Throwable) null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private byte[] m51252(String str) throws C9080 {
        byte[] bArr = this.f74298;
        if (bArr != null) {
            return bArr;
        }
        throw C9080.m23440("Missing CodecPrivate for codec " + str, (Throwable) null);
    }
}
