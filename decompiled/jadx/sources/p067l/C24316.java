package p067l;

import android.util.Pair;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.C0684bo;
import com.umeng.analytics.pro.C0698cb;
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
public final class C24316 {

    /* JADX INFO: renamed from: ֡ */
    public C21037 f76993;

    /* JADX INFO: renamed from: ֨ */
    public boolean f76995;

    /* JADX INFO: renamed from: ۙ */
    public int f77004;

    /* JADX INFO: renamed from: ۛ */
    public int f77007;

    /* JADX INFO: renamed from: ۡ */
    public C20119 f77012;

    /* JADX INFO: renamed from: ۨ */
    public String f77019;

    /* JADX INFO: renamed from: ܰ */
    public InterfaceC20790 f77022;

    /* JADX INFO: renamed from: ܳ */
    public String f77023;

    /* JADX INFO: renamed from: ܶ */
    public boolean f77025;

    /* JADX INFO: renamed from: ܺ */
    public int f77026;

    /* JADX INFO: renamed from: ܺ֫ */
    public byte[] f77027;

    /* JADX INFO: renamed from: ܽ */
    public int f77028;

    /* JADX INFO: renamed from: ᩴ֫ */
    public C2683 f77035;

    /* JADX INFO: renamed from: ᩵ */
    public byte[] f77036;

    /* JADX INFO: renamed from: ᩵֫ */
    public int f77037;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f77042;

    /* JADX INFO: renamed from: ᩺ */
    public int f77043;

    /* JADX INFO: renamed from: ᩻ */
    public byte[] f77044;

    /* JADX INFO: renamed from: ֨֫ */
    public int f76996 = -1;

    /* JADX INFO: renamed from: ᩸ */
    public int f77041 = -1;

    /* JADX INFO: renamed from: ۧ */
    public int f77017 = -1;

    /* JADX INFO: renamed from: ᩴ */
    public int f77034 = -1;

    /* JADX INFO: renamed from: ۖ */
    public int f76999 = -1;

    /* JADX INFO: renamed from: ۘ */
    public int f77002 = 0;

    /* JADX INFO: renamed from: ۢ֫ */
    public int f77015 = -1;

    /* JADX INFO: renamed from: ᩷֫ */
    public float f77040 = 0.0f;

    /* JADX INFO: renamed from: ᩻֫ */
    public float f77045 = 0.0f;

    /* JADX INFO: renamed from: ۜ֫ */
    public float f77009 = 0.0f;

    /* JADX INFO: renamed from: ܳ֫ */
    public byte[] f77024 = null;

    /* JADX INFO: renamed from: ۘ֫ */
    public int f77003 = -1;

    /* JADX INFO: renamed from: ۠ */
    public boolean f77011 = false;

    /* JADX INFO: renamed from: ᩷ */
    public int f77039 = -1;

    /* JADX INFO: renamed from: ۢ */
    public int f77014 = -1;

    /* JADX INFO: renamed from: ۜ */
    public int f77008 = -1;

    /* JADX INFO: renamed from: ۗ */
    public int f77001 = 1000;

    /* JADX INFO: renamed from: ۬ */
    public int f77021 = 200;

    /* JADX INFO: renamed from: ᩳ֫ */
    public float f77033 = -1.0f;

    /* JADX INFO: renamed from: ܿ֫ */
    public float f77031 = -1.0f;

    /* JADX INFO: renamed from: ۧ֫ */
    public float f77018 = -1.0f;

    /* JADX INFO: renamed from: ܽ֫ */
    public float f77029 = -1.0f;

    /* JADX INFO: renamed from: ۟ */
    public float f77010 = -1.0f;

    /* JADX INFO: renamed from: ֫֫ */
    public float f76998 = -1.0f;

    /* JADX INFO: renamed from: ֡֫ */
    public float f76994 = -1.0f;

    /* JADX INFO: renamed from: ۚ֫ */
    public float f77006 = -1.0f;

    /* JADX INFO: renamed from: ۫ */
    public float f77020 = -1.0f;

    /* JADX INFO: renamed from: ۤ */
    public float f77016 = -1.0f;

    /* JADX INFO: renamed from: ᩳ */
    public int f77032 = 1;

    /* JADX INFO: renamed from: ֫ */
    public int f76997 = -1;

    /* JADX INFO: renamed from: ۡ֫ */
    public int f77013 = 8000;

    /* JADX INFO: renamed from: ܿ */
    public long f77030 = 0;

    /* JADX INFO: renamed from: ۖ֫ */
    public long f77000 = 0;

    /* JADX INFO: renamed from: ۚ */
    public boolean f77005 = true;

    /* JADX INFO: renamed from: ᩶ */
    public String f77038 = "eng";

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
    /* JADX INFO: renamed from: ֫ */
    public final void m53647(InterfaceC23116 interfaceC23116, int i) throws C10998 {
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
        int iM12979;
        List list3;
        List list4;
        List listM36873of;
        List listM36873of2;
        int i5;
        C3601 c3601;
        int i6;
        int i7;
        int i8;
        float f;
        int iIntValue;
        int i9;
        int i10;
        int i11;
        String str8;
        C20545 c20545M46450;
        List list5;
        String str9 = this.f77023;
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
                b = C0698cb.f2569k;
                break;
            case "A_AC3":
                b = C0698cb.f2570l;
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
                b = C0684bo.f2505j;
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
        C22378 c22378M20705 = null;
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
                byte[] bArr2 = this.f77044;
                str12 = "video/mp4v-es";
                listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                i2 = -1;
                str = null;
                str11 = str12;
                list5 = listSingletonList;
                i3 = -1;
                list = list5;
                if (this.f77036 != null && (c20545M46450 = C20545.m46450(new C19203(this.f77036))) != null) {
                    str = c20545M46450.f63508;
                    str11 = "video/dolby-vision";
                }
                boolean z = this.f77005;
                if (this.f76995) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i12 = (z ? 1 : 0) | i5;
                c3601 = new C3601();
                if (C11669.m26825(str11)) {
                    c3601.m6704(this.f77032);
                    c3601.m6688(this.f77013);
                    c3601.m6707(i3);
                    i6 = 1;
                } else if (C11669.m26816(str11)) {
                    if (this.f77002 == 0) {
                        i10 = this.f77034;
                        i7 = -1;
                        if (i10 == -1) {
                            i10 = this.f76996;
                        }
                        this.f77034 = i10;
                        i11 = this.f76999;
                        if (i11 == -1) {
                            i11 = this.f77041;
                        }
                        this.f76999 = i11;
                    } else {
                        i7 = -1;
                    }
                    i8 = this.f77034;
                    if (i8 != i7 || (i9 = this.f76999) == i7) {
                        f = -1.0f;
                    } else {
                        f = (this.f77041 * i8) / (this.f76996 * i9);
                    }
                    if (this.f77011) {
                        if (this.f77033 != -1.0f && this.f77031 != -1.0f && this.f77018 != -1.0f && this.f77029 != -1.0f && this.f77010 != -1.0f && this.f76998 != -1.0f && this.f76994 != -1.0f && this.f77006 != -1.0f && this.f77020 != -1.0f && this.f77016 != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder.put((byte) 0);
                            byteBufferOrder.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) (this.f77020 + 0.5f));
                            byteBufferOrder.putShort((short) (this.f77016 + 0.5f));
                            byteBufferOrder.putShort((short) this.f77001);
                            byteBufferOrder.putShort((short) this.f77021);
                        }
                        C8966 c8966 = new C8966();
                        c8966.m20709(this.f77039);
                        c8966.m20708(this.f77008);
                        c8966.m20711(this.f77014);
                        c8966.m20707(bArr);
                        c8966.m20710(this.f77017);
                        c8966.m20706(this.f77017);
                        c22378M20705 = c8966.m20705();
                    }
                    if (this.f77019 == null && C15598.f44581.containsKey(this.f77019)) {
                        iIntValue = ((Integer) C15598.f44581.get(this.f77019)).intValue();
                    } else {
                        iIntValue = -1;
                    }
                    if (this.f77015 == 0 && Float.compare(this.f77040, 0.0f) == 0 && Float.compare(this.f77045, 0.0f) == 0) {
                        if (Float.compare(this.f77009, 0.0f) == 0) {
                            iIntValue = 0;
                        } else if (Float.compare(this.f77009, 90.0f) == 0) {
                            iIntValue = 90;
                        } else if (Float.compare(this.f77009, -180.0f) != 0 || Float.compare(this.f77009, 180.0f) == 0) {
                            iIntValue = 180;
                        } else if (Float.compare(this.f77009, -90.0f) == 0) {
                            iIntValue = BottomAppBarTopEdgeTreatment.ANGLE_UP;
                        }
                    }
                    c3601.m6685(this.f76996);
                    c3601.m6689(this.f77041);
                    c3601.m6692(f);
                    c3601.m6671(iIntValue);
                    c3601.m6682(this.f77024);
                    c3601.m6710(this.f77003);
                    c3601.m6680(c22378M20705);
                    i6 = 2;
                } else {
                    if ("application/x-subrip".equals(str11) && !"text/x-ssa".equals(str11) && !"text/vtt".equals(str11) && !"application/vobsub".equals(str11) && !"application/pgs".equals(str11) && !"application/dvbsubs".equals(str11)) {
                        throw C10998.m25387("Unexpected MIME type.", (Throwable) null);
                    }
                    i6 = 3;
                }
                if (this.f77019 != null && !C15598.f44581.containsKey(this.f77019)) {
                    c3601.m6705(this.f77019);
                }
                c3601.m6699(i);
                if (this.f77042) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c3601.m6694(str8);
                c3601.m6697(str11);
                c3601.m6683(i2);
                c3601.m6703(this.f77038);
                c3601.m6698(i12);
                c3601.m6678(list);
                c3601.m6677(str);
                c3601.m6679(this.f76993);
                C10307 c10307M6672 = c3601.m6672();
                InterfaceC20790 interfaceC20790Mo5732 = interfaceC23116.mo5732(this.f77043, i6);
                this.f77022 = interfaceC20790Mo5732;
                interfaceC20790Mo5732.mo10503(c10307M6672);
                return;
            case 2:
                C19203 c19203 = new C19203(m53646(this.f77023));
                try {
                    int iM43711 = c19203.m43711();
                    if (iM43711 != 1) {
                        if (iM43711 == 65534) {
                            c19203.m43730(24);
                            if (c19203.m43733() != C15598.f44579.getMostSignificantBits() || c19203.m43733() != C15598.f44579.getLeastSignificantBits()) {
                            }
                            listSingletonList = null;
                            i2 = -1;
                            str = null;
                            str11 = str12;
                            list5 = listSingletonList;
                            i3 = -1;
                            list = list5;
                            if (this.f77036 != null) {
                                str = c20545M46450.f63508;
                                str11 = "video/dolby-vision";
                            }
                            boolean z2 = this.f77005;
                            if (this.f76995) {
                                i5 = 2;
                            } else {
                                i5 = 0;
                            }
                            int i13 = (z2 ? 1 : 0) | i5;
                            c3601 = new C3601();
                            if (C11669.m26825(str11)) {
                                c3601.m6704(this.f77032);
                                c3601.m6688(this.f77013);
                                c3601.m6707(i3);
                                i6 = 1;
                            } else {
                                if (C11669.m26816(str11)) {
                                    if (this.f77002 == 0) {
                                        i10 = this.f77034;
                                        i7 = -1;
                                        if (i10 == -1) {
                                            i10 = this.f76996;
                                        }
                                        this.f77034 = i10;
                                        i11 = this.f76999;
                                        if (i11 == -1) {
                                            i11 = this.f77041;
                                        }
                                        this.f76999 = i11;
                                    } else {
                                        i7 = -1;
                                    }
                                    i8 = this.f77034;
                                    if (i8 != i7) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (this.f77011) {
                                        if (this.f77033 != -1.0f) {
                                            bArr = new byte[25];
                                            ByteBuffer byteBufferOrder2 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                            byteBufferOrder2.put((byte) 0);
                                            byteBufferOrder2.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                            byteBufferOrder2.putShort((short) (this.f77020 + 0.5f));
                                            byteBufferOrder2.putShort((short) (this.f77016 + 0.5f));
                                            byteBufferOrder2.putShort((short) this.f77001);
                                            byteBufferOrder2.putShort((short) this.f77021);
                                        }
                                        C8966 c8967 = new C8966();
                                        c8967.m20709(this.f77039);
                                        c8967.m20708(this.f77008);
                                        c8967.m20711(this.f77014);
                                        c8967.m20707(bArr);
                                        c8967.m20710(this.f77017);
                                        c8967.m20706(this.f77017);
                                        c22378M20705 = c8967.m20705();
                                    }
                                    if (this.f77019 == null) {
                                        iIntValue = -1;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (this.f77015 == 0) {
                                        if (Float.compare(this.f77009, 0.0f) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    c3601.m6685(this.f76996);
                                    c3601.m6689(this.f77041);
                                    c3601.m6692(f);
                                    c3601.m6671(iIntValue);
                                    c3601.m6682(this.f77024);
                                    c3601.m6710(this.f77003);
                                    c3601.m6680(c22378M20705);
                                    i6 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str11)) {
                                    }
                                    i6 = 3;
                                }
                                break;
                            }
                            if (this.f77019 != null) {
                                c3601.m6705(this.f77019);
                            }
                            c3601.m6699(i);
                            if (this.f77042) {
                                str8 = "video/webm";
                            } else {
                                str8 = "video/x-matroska";
                            }
                            c3601.m6694(str8);
                            c3601.m6697(str11);
                            c3601.m6683(i2);
                            c3601.m6703(this.f77038);
                            c3601.m6698(i13);
                            c3601.m6678(list);
                            c3601.m6677(str);
                            c3601.m6679(this.f76993);
                            C10307 c10307M6673 = c3601.m6672();
                            InterfaceC20790 interfaceC20790Mo5733 = interfaceC23116.mo5732(this.f77043, i6);
                            this.f77022 = interfaceC20790Mo5733;
                            interfaceC20790Mo5733.mo10503(c10307M6673);
                            return;
                        }
                        C21334.m48351("Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                        listSingletonList = null;
                        i2 = -1;
                        str = null;
                        str11 = str12;
                        list5 = listSingletonList;
                        i3 = -1;
                        list = list5;
                        if (this.f77036 != null) {
                            str = c20545M46450.f63508;
                            str11 = "video/dolby-vision";
                        }
                        boolean z3 = this.f77005;
                        if (this.f76995) {
                            i5 = 2;
                        } else {
                            i5 = 0;
                        }
                        int i14 = (z3 ? 1 : 0) | i5;
                        c3601 = new C3601();
                        if (C11669.m26825(str11)) {
                            c3601.m6704(this.f77032);
                            c3601.m6688(this.f77013);
                            c3601.m6707(i3);
                            i6 = 1;
                        } else {
                            if (C11669.m26816(str11)) {
                                if (this.f77002 == 0) {
                                    i10 = this.f77034;
                                    i7 = -1;
                                    if (i10 == -1) {
                                        i10 = this.f76996;
                                    }
                                    this.f77034 = i10;
                                    i11 = this.f76999;
                                    if (i11 == -1) {
                                        i11 = this.f77041;
                                    }
                                    this.f76999 = i11;
                                } else {
                                    i7 = -1;
                                }
                                i8 = this.f77034;
                                if (i8 != i7) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (this.f77011) {
                                    if (this.f77033 != -1.0f) {
                                        bArr = new byte[25];
                                        ByteBuffer byteBufferOrder3 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                        byteBufferOrder3.put((byte) 0);
                                        byteBufferOrder3.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                        byteBufferOrder3.putShort((short) (this.f77020 + 0.5f));
                                        byteBufferOrder3.putShort((short) (this.f77016 + 0.5f));
                                        byteBufferOrder3.putShort((short) this.f77001);
                                        byteBufferOrder3.putShort((short) this.f77021);
                                    }
                                    C8966 c8968 = new C8966();
                                    c8968.m20709(this.f77039);
                                    c8968.m20708(this.f77008);
                                    c8968.m20711(this.f77014);
                                    c8968.m20707(bArr);
                                    c8968.m20710(this.f77017);
                                    c8968.m20706(this.f77017);
                                    c22378M20705 = c8968.m20705();
                                }
                                if (this.f77019 == null) {
                                    iIntValue = -1;
                                } else {
                                    iIntValue = -1;
                                }
                                if (this.f77015 == 0) {
                                    if (Float.compare(this.f77009, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                c3601.m6685(this.f76996);
                                c3601.m6689(this.f77041);
                                c3601.m6692(f);
                                c3601.m6671(iIntValue);
                                c3601.m6682(this.f77024);
                                c3601.m6710(this.f77003);
                                c3601.m6680(c22378M20705);
                                i6 = 2;
                            } else {
                                if ("application/x-subrip".equals(str11)) {
                                }
                                i6 = 3;
                            }
                            break;
                        }
                        if (this.f77019 != null) {
                            c3601.m6705(this.f77019);
                        }
                        c3601.m6699(i);
                        if (this.f77042) {
                            str8 = "video/webm";
                        } else {
                            str8 = "video/x-matroska";
                        }
                        c3601.m6694(str8);
                        c3601.m6697(str11);
                        c3601.m6683(i2);
                        c3601.m6703(this.f77038);
                        c3601.m6698(i14);
                        c3601.m6678(list);
                        c3601.m6677(str);
                        c3601.m6679(this.f76993);
                        C10307 c10307M6674 = c3601.m6672();
                        InterfaceC20790 interfaceC20790Mo5734 = interfaceC23116.mo5732(this.f77043, i6);
                        this.f77022 = interfaceC20790Mo5734;
                        interfaceC20790Mo5734.mo10503(c10307M6674);
                        return;
                    }
                    int i15 = this.f76997;
                    String str13 = C5792.f14228;
                    int iM129710 = C5792.m12979(i15, ByteOrder.LITTLE_ENDIAN);
                    if (iM129710 == 0) {
                        C21334.m48351("Unsupported PCM bit depth: " + this.f76997 + ". Setting mimeType to audio/x-unknown");
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
                        i3 = iM129710;
                        i2 = -1;
                    }
                    if (this.f77036 != null) {
                        str = c20545M46450.f63508;
                        str11 = "video/dolby-vision";
                    }
                    boolean z4 = this.f77005;
                    if (this.f76995) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    int i16 = (z4 ? 1 : 0) | i5;
                    c3601 = new C3601();
                    if (C11669.m26825(str11)) {
                        c3601.m6704(this.f77032);
                        c3601.m6688(this.f77013);
                        c3601.m6707(i3);
                        i6 = 1;
                    } else {
                        if (C11669.m26816(str11)) {
                            if (this.f77002 == 0) {
                                i10 = this.f77034;
                                i7 = -1;
                                if (i10 == -1) {
                                    i10 = this.f76996;
                                }
                                this.f77034 = i10;
                                i11 = this.f76999;
                                if (i11 == -1) {
                                    i11 = this.f77041;
                                }
                                this.f76999 = i11;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.f77034;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f77011) {
                                if (this.f77033 != -1.0f) {
                                    bArr = new byte[25];
                                    ByteBuffer byteBufferOrder4 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                    byteBufferOrder4.put((byte) 0);
                                    byteBufferOrder4.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                    byteBufferOrder4.putShort((short) (this.f77020 + 0.5f));
                                    byteBufferOrder4.putShort((short) (this.f77016 + 0.5f));
                                    byteBufferOrder4.putShort((short) this.f77001);
                                    byteBufferOrder4.putShort((short) this.f77021);
                                }
                                C8966 c8969 = new C8966();
                                c8969.m20709(this.f77039);
                                c8969.m20708(this.f77008);
                                c8969.m20711(this.f77014);
                                c8969.m20707(bArr);
                                c8969.m20710(this.f77017);
                                c8969.m20706(this.f77017);
                                c22378M20705 = c8969.m20705();
                            }
                            if (this.f77019 == null) {
                                iIntValue = -1;
                            } else {
                                iIntValue = -1;
                            }
                            if (this.f77015 == 0) {
                                if (Float.compare(this.f77009, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            c3601.m6685(this.f76996);
                            c3601.m6689(this.f77041);
                            c3601.m6692(f);
                            c3601.m6671(iIntValue);
                            c3601.m6682(this.f77024);
                            c3601.m6710(this.f77003);
                            c3601.m6680(c22378M20705);
                            i6 = 2;
                        } else {
                            if ("application/x-subrip".equals(str11)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.f77019 != null) {
                        c3601.m6705(this.f77019);
                    }
                    c3601.m6699(i);
                    if (this.f77042) {
                        str8 = "video/webm";
                    } else {
                        str8 = "video/x-matroska";
                    }
                    c3601.m6694(str8);
                    c3601.m6697(str11);
                    c3601.m6683(i2);
                    c3601.m6703(this.f77038);
                    c3601.m6698(i16);
                    c3601.m6678(list);
                    c3601.m6677(str);
                    c3601.m6679(this.f76993);
                    C10307 c10307M6675 = c3601.m6672();
                    InterfaceC20790 interfaceC20790Mo5735 = interfaceC23116.mo5732(this.f77043, i6);
                    this.f77022 = interfaceC20790Mo5735;
                    interfaceC20790Mo5735.mo10503(c10307M6675);
                    return;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw C10998.m25387("Error parsing MS/ACM codec private", (Throwable) null);
                }
            case 3:
                this.f77035 = new C2683();
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
                if (this.f77036 != null) {
                    str = c20545M46450.f63508;
                    str11 = "video/dolby-vision";
                }
                boolean z5 = this.f77005;
                if (this.f76995) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i17 = (z5 ? 1 : 0) | i5;
                c3601 = new C3601();
                if (C11669.m26825(str11)) {
                    c3601.m6704(this.f77032);
                    c3601.m6688(this.f77013);
                    c3601.m6707(i3);
                    i6 = 1;
                } else {
                    if (C11669.m26816(str11)) {
                        if (this.f77002 == 0) {
                            i10 = this.f77034;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f76996;
                            }
                            this.f77034 = i10;
                            i11 = this.f76999;
                            if (i11 == -1) {
                                i11 = this.f77041;
                            }
                            this.f76999 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f77034;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f77011) {
                            if (this.f77033 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder5 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder5.put((byte) 0);
                                byteBufferOrder5.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) (this.f77020 + 0.5f));
                                byteBufferOrder5.putShort((short) (this.f77016 + 0.5f));
                                byteBufferOrder5.putShort((short) this.f77001);
                                byteBufferOrder5.putShort((short) this.f77021);
                            }
                            C8966 c89610 = new C8966();
                            c89610.m20709(this.f77039);
                            c89610.m20708(this.f77008);
                            c89610.m20711(this.f77014);
                            c89610.m20707(bArr);
                            c89610.m20710(this.f77017);
                            c89610.m20706(this.f77017);
                            c22378M20705 = c89610.m20705();
                        }
                        if (this.f77019 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f77015 == 0) {
                            if (Float.compare(this.f77009, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c3601.m6685(this.f76996);
                        c3601.m6689(this.f77041);
                        c3601.m6692(f);
                        c3601.m6671(iIntValue);
                        c3601.m6682(this.f77024);
                        c3601.m6710(this.f77003);
                        c3601.m6680(c22378M20705);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f77019 != null) {
                    c3601.m6705(this.f77019);
                }
                c3601.m6699(i);
                if (this.f77042) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c3601.m6694(str8);
                c3601.m6697(str11);
                c3601.m6683(i2);
                c3601.m6703(this.f77038);
                c3601.m6698(i17);
                c3601.m6678(list);
                c3601.m6677(str);
                c3601.m6679(this.f76993);
                C10307 c10307M6676 = c3601.m6672();
                InterfaceC20790 interfaceC20790Mo5736 = interfaceC23116.mo5732(this.f77043, i6);
                this.f77022 = interfaceC20790Mo5736;
                interfaceC20790Mo5736.mo10503(c10307M6676);
                return;
            case 4:
                byte[] bArrM53646 = m53646(this.f77023);
                try {
                    if (bArrM53646[0] != 2) {
                        throw C10998.m25387("Error parsing vorbis codec private", (Throwable) null);
                    }
                    int i18 = 1;
                    int i19 = 0;
                    while (true) {
                        int i20 = bArrM53646[i18] & 255;
                        if (i20 == 255) {
                            i19 += 255;
                            i18++;
                        } else {
                            int i21 = i18 + 1;
                            int i22 = i19 + i20;
                            int i23 = 0;
                            while (true) {
                                int i24 = bArrM53646[i21] & 255;
                                if (i24 != 255) {
                                    int i25 = i21 + 1;
                                    int i26 = i23 + i24;
                                    if (bArrM53646[i25] != 1) {
                                        throw C10998.m25387("Error parsing vorbis codec private", (Throwable) null);
                                    }
                                    byte[] bArr3 = new byte[i22];
                                    System.arraycopy(bArrM53646, i25, bArr3, 0, i22);
                                    int i27 = i25 + i22;
                                    if (bArrM53646[i27] != 3) {
                                        throw C10998.m25387("Error parsing vorbis codec private", (Throwable) null);
                                    }
                                    int i28 = i27 + i26;
                                    if (bArrM53646[i28] != 5) {
                                        throw C10998.m25387("Error parsing vorbis codec private", (Throwable) null);
                                    }
                                    byte[] bArr4 = new byte[bArrM53646.length - i28];
                                    System.arraycopy(bArrM53646, i28, bArr4, 0, bArrM53646.length - i28);
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
                                    if (this.f77036 != null) {
                                        str = c20545M46450.f63508;
                                        str11 = "video/dolby-vision";
                                    }
                                    boolean z6 = this.f77005;
                                    if (this.f76995) {
                                        i5 = 2;
                                    } else {
                                        i5 = 0;
                                    }
                                    int i110 = (z6 ? 1 : 0) | i5;
                                    c3601 = new C3601();
                                    if (C11669.m26825(str11)) {
                                        c3601.m6704(this.f77032);
                                        c3601.m6688(this.f77013);
                                        c3601.m6707(i3);
                                        i6 = 1;
                                    } else {
                                        if (C11669.m26816(str11)) {
                                            if (this.f77002 == 0) {
                                                i10 = this.f77034;
                                                i7 = -1;
                                                if (i10 == -1) {
                                                    i10 = this.f76996;
                                                }
                                                this.f77034 = i10;
                                                i11 = this.f76999;
                                                if (i11 == -1) {
                                                    i11 = this.f77041;
                                                }
                                                this.f76999 = i11;
                                            } else {
                                                i7 = -1;
                                            }
                                            i8 = this.f77034;
                                            if (i8 != i7) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (this.f77011) {
                                                if (this.f77033 != -1.0f) {
                                                    bArr = new byte[25];
                                                    ByteBuffer byteBufferOrder6 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                                    byteBufferOrder6.put((byte) 0);
                                                    byteBufferOrder6.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                                    byteBufferOrder6.putShort((short) (this.f77020 + 0.5f));
                                                    byteBufferOrder6.putShort((short) (this.f77016 + 0.5f));
                                                    byteBufferOrder6.putShort((short) this.f77001);
                                                    byteBufferOrder6.putShort((short) this.f77021);
                                                }
                                                C8966 c89611 = new C8966();
                                                c89611.m20709(this.f77039);
                                                c89611.m20708(this.f77008);
                                                c89611.m20711(this.f77014);
                                                c89611.m20707(bArr);
                                                c89611.m20710(this.f77017);
                                                c89611.m20706(this.f77017);
                                                c22378M20705 = c89611.m20705();
                                            }
                                            if (this.f77019 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (this.f77015 == 0) {
                                                if (Float.compare(this.f77009, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            c3601.m6685(this.f76996);
                                            c3601.m6689(this.f77041);
                                            c3601.m6692(f);
                                            c3601.m6671(iIntValue);
                                            c3601.m6682(this.f77024);
                                            c3601.m6710(this.f77003);
                                            c3601.m6680(c22378M20705);
                                            i6 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str11)) {
                                            }
                                            i6 = 3;
                                        }
                                        break;
                                    }
                                    if (this.f77019 != null) {
                                        c3601.m6705(this.f77019);
                                    }
                                    c3601.m6699(i);
                                    if (this.f77042) {
                                        str8 = "video/webm";
                                    } else {
                                        str8 = "video/x-matroska";
                                    }
                                    c3601.m6694(str8);
                                    c3601.m6697(str11);
                                    c3601.m6683(i2);
                                    c3601.m6703(this.f77038);
                                    c3601.m6698(i110);
                                    c3601.m6678(list);
                                    c3601.m6677(str);
                                    c3601.m6679(this.f76993);
                                    C10307 c10307M6677 = c3601.m6672();
                                    InterfaceC20790 interfaceC20790Mo5737 = interfaceC23116.mo5732(this.f77043, i6);
                                    this.f77022 = interfaceC20790Mo5737;
                                    interfaceC20790Mo5737.mo10503(c10307M6677);
                                    return;
                                }
                                i23 += 255;
                                i21++;
                            }
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException unused2) {
                    throw C10998.m25387("Error parsing vorbis codec private", (Throwable) null);
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
                if (this.f77036 != null) {
                    str = c20545M46450.f63508;
                    str11 = "video/dolby-vision";
                }
                boolean z7 = this.f77005;
                if (this.f76995) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i111 = (z7 ? 1 : 0) | i5;
                c3601 = new C3601();
                if (C11669.m26825(str11)) {
                    c3601.m6704(this.f77032);
                    c3601.m6688(this.f77013);
                    c3601.m6707(i3);
                    i6 = 1;
                } else {
                    if (C11669.m26816(str11)) {
                        if (this.f77002 == 0) {
                            i10 = this.f77034;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f76996;
                            }
                            this.f77034 = i10;
                            i11 = this.f76999;
                            if (i11 == -1) {
                                i11 = this.f77041;
                            }
                            this.f76999 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f77034;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f77011) {
                            if (this.f77033 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder7 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder7.put((byte) 0);
                                byteBufferOrder7.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) (this.f77020 + 0.5f));
                                byteBufferOrder7.putShort((short) (this.f77016 + 0.5f));
                                byteBufferOrder7.putShort((short) this.f77001);
                                byteBufferOrder7.putShort((short) this.f77021);
                            }
                            C8966 c89612 = new C8966();
                            c89612.m20709(this.f77039);
                            c89612.m20708(this.f77008);
                            c89612.m20711(this.f77014);
                            c89612.m20707(bArr);
                            c89612.m20710(this.f77017);
                            c89612.m20706(this.f77017);
                            c22378M20705 = c89612.m20705();
                        }
                        if (this.f77019 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f77015 == 0) {
                            if (Float.compare(this.f77009, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c3601.m6685(this.f76996);
                        c3601.m6689(this.f77041);
                        c3601.m6692(f);
                        c3601.m6671(iIntValue);
                        c3601.m6682(this.f77024);
                        c3601.m6710(this.f77003);
                        c3601.m6680(c22378M20705);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f77019 != null) {
                    c3601.m6705(this.f77019);
                }
                c3601.m6699(i);
                if (this.f77042) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c3601.m6694(str8);
                c3601.m6697(str11);
                c3601.m6683(i2);
                c3601.m6703(this.f77038);
                c3601.m6698(i111);
                c3601.m6678(list);
                c3601.m6677(str);
                c3601.m6679(this.f76993);
                C10307 c10307M6678 = c3601.m6672();
                InterfaceC20790 interfaceC20790Mo5738 = interfaceC23116.mo5732(this.f77043, i6);
                this.f77022 = interfaceC20790Mo5738;
                interfaceC20790Mo5738.mo10503(c10307M6678);
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
                if (this.f77036 != null) {
                    str = c20545M46450.f63508;
                    str11 = "video/dolby-vision";
                }
                boolean z8 = this.f77005;
                if (this.f76995) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i112 = (z8 ? 1 : 0) | i5;
                c3601 = new C3601();
                if (C11669.m26825(str11)) {
                    c3601.m6704(this.f77032);
                    c3601.m6688(this.f77013);
                    c3601.m6707(i3);
                    i6 = 1;
                } else {
                    if (C11669.m26816(str11)) {
                        if (this.f77002 == 0) {
                            i10 = this.f77034;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f76996;
                            }
                            this.f77034 = i10;
                            i11 = this.f76999;
                            if (i11 == -1) {
                                i11 = this.f77041;
                            }
                            this.f76999 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f77034;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f77011) {
                            if (this.f77033 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder8 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder8.put((byte) 0);
                                byteBufferOrder8.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) (this.f77020 + 0.5f));
                                byteBufferOrder8.putShort((short) (this.f77016 + 0.5f));
                                byteBufferOrder8.putShort((short) this.f77001);
                                byteBufferOrder8.putShort((short) this.f77021);
                            }
                            C8966 c89613 = new C8966();
                            c89613.m20709(this.f77039);
                            c89613.m20708(this.f77008);
                            c89613.m20711(this.f77014);
                            c89613.m20707(bArr);
                            c89613.m20710(this.f77017);
                            c89613.m20706(this.f77017);
                            c22378M20705 = c89613.m20705();
                        }
                        if (this.f77019 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f77015 == 0) {
                            if (Float.compare(this.f77009, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c3601.m6685(this.f76996);
                        c3601.m6689(this.f77041);
                        c3601.m6692(f);
                        c3601.m6671(iIntValue);
                        c3601.m6682(this.f77024);
                        c3601.m6710(this.f77003);
                        c3601.m6680(c22378M20705);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f77019 != null) {
                    c3601.m6705(this.f77019);
                }
                c3601.m6699(i);
                if (this.f77042) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c3601.m6694(str8);
                c3601.m6697(str11);
                c3601.m6683(i2);
                c3601.m6703(this.f77038);
                c3601.m6698(i112);
                c3601.m6678(list);
                c3601.m6677(str);
                c3601.m6679(this.f76993);
                C10307 c10307M6679 = c3601.m6672();
                InterfaceC20790 interfaceC20790Mo5739 = interfaceC23116.mo5732(this.f77043, i6);
                this.f77022 = interfaceC20790Mo5739;
                interfaceC20790Mo5739.mo10503(c10307M6679);
                return;
            case 7:
                C19203 c19204 = new C19203(m53646(this.f77023));
                try {
                    c19204.m43724(16);
                    long jM43726 = c19204.m43726();
                    if (jM43726 == 1482049860) {
                        pair = new Pair("video/divx", null);
                    } else if (jM43726 == 859189832) {
                        pair = new Pair("video/3gpp", null);
                    } else if (jM43726 == 826496599) {
                        int iM43731 = c19204.m43731() + 20;
                        byte[] bArrM43728 = c19204.m43728();
                        while (true) {
                            if (iM43731 < bArrM43728.length - 4) {
                                if (bArrM43728[iM43731] == 0 && bArrM43728[iM43731 + 1] == 0 && bArrM43728[iM43731 + 2] == 1 && bArrM43728[iM43731 + 3] == 15) {
                                    pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrM43728, iM43731, bArrM43728.length)));
                                } else {
                                    iM43731++;
                                }
                            } else {
                                throw C10998.m25387("Failed to find FourCC VC1 initialization data", (Throwable) null);
                            }
                        }
                    } else {
                        C21334.m48351("Unknown FourCC. Setting mimeType to video/x-unknown");
                        pair = new Pair("video/x-unknown", null);
                    }
                    str4 = (String) pair.first;
                    listM36873of2 = (List) pair.second;
                    str12 = str4;
                    listM36873of = listM36873of2;
                    str7 = null;
                    list4 = listM36873of;
                    str = str7;
                    str2 = str12;
                    i4 = -1;
                    list2 = list4;
                    str11 = str2;
                    i2 = i4;
                    list5 = list2;
                    i3 = -1;
                    list = list5;
                    if (this.f77036 != null) {
                        str = c20545M46450.f63508;
                        str11 = "video/dolby-vision";
                    }
                    boolean z9 = this.f77005;
                    if (this.f76995) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    int i113 = (z9 ? 1 : 0) | i5;
                    c3601 = new C3601();
                    if (C11669.m26825(str11)) {
                        c3601.m6704(this.f77032);
                        c3601.m6688(this.f77013);
                        c3601.m6707(i3);
                        i6 = 1;
                    } else {
                        if (C11669.m26816(str11)) {
                            if (this.f77002 == 0) {
                                i10 = this.f77034;
                                i7 = -1;
                                if (i10 == -1) {
                                    i10 = this.f76996;
                                }
                                this.f77034 = i10;
                                i11 = this.f76999;
                                if (i11 == -1) {
                                    i11 = this.f77041;
                                }
                                this.f76999 = i11;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.f77034;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f77011) {
                                if (this.f77033 != -1.0f) {
                                    bArr = new byte[25];
                                    ByteBuffer byteBufferOrder9 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                    byteBufferOrder9.put((byte) 0);
                                    byteBufferOrder9.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                    byteBufferOrder9.putShort((short) (this.f77020 + 0.5f));
                                    byteBufferOrder9.putShort((short) (this.f77016 + 0.5f));
                                    byteBufferOrder9.putShort((short) this.f77001);
                                    byteBufferOrder9.putShort((short) this.f77021);
                                }
                                C8966 c89614 = new C8966();
                                c89614.m20709(this.f77039);
                                c89614.m20708(this.f77008);
                                c89614.m20711(this.f77014);
                                c89614.m20707(bArr);
                                c89614.m20710(this.f77017);
                                c89614.m20706(this.f77017);
                                c22378M20705 = c89614.m20705();
                            }
                            if (this.f77019 == null) {
                                iIntValue = -1;
                            } else {
                                iIntValue = -1;
                            }
                            if (this.f77015 == 0) {
                                if (Float.compare(this.f77009, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            c3601.m6685(this.f76996);
                            c3601.m6689(this.f77041);
                            c3601.m6692(f);
                            c3601.m6671(iIntValue);
                            c3601.m6682(this.f77024);
                            c3601.m6710(this.f77003);
                            c3601.m6680(c22378M20705);
                            i6 = 2;
                        } else {
                            if ("application/x-subrip".equals(str11)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.f77019 != null) {
                        c3601.m6705(this.f77019);
                    }
                    c3601.m6699(i);
                    if (this.f77042) {
                        str8 = "video/webm";
                    } else {
                        str8 = "video/x-matroska";
                    }
                    c3601.m6694(str8);
                    c3601.m6697(str11);
                    c3601.m6683(i2);
                    c3601.m6703(this.f77038);
                    c3601.m6698(i113);
                    c3601.m6678(list);
                    c3601.m6677(str);
                    c3601.m6679(this.f76993);
                    C10307 c10307M66710 = c3601.m6672();
                    InterfaceC20790 interfaceC20790Mo57310 = interfaceC23116.mo5732(this.f77043, i6);
                    this.f77022 = interfaceC20790Mo57310;
                    interfaceC20790Mo57310.mo10503(c10307M66710);
                    return;
                } catch (ArrayIndexOutOfBoundsException unused3) {
                    throw C10998.m25387("Error parsing FourCC private data", (Throwable) null);
                }
            case 8:
                byte[] bArr5 = new byte[4];
                System.arraycopy(m53646(this.f77023), 0, bArr5, 0, 4);
                str12 = "application/dvbsubs";
                listM36873of = AbstractC16192.m36873of((Object) bArr5);
                str7 = null;
                list4 = listM36873of;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f77036 != null) {
                    str = c20545M46450.f63508;
                    str11 = "video/dolby-vision";
                }
                boolean z10 = this.f77005;
                if (this.f76995) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i114 = (z10 ? 1 : 0) | i5;
                c3601 = new C3601();
                if (C11669.m26825(str11)) {
                    c3601.m6704(this.f77032);
                    c3601.m6688(this.f77013);
                    c3601.m6707(i3);
                    i6 = 1;
                } else {
                    if (C11669.m26816(str11)) {
                        if (this.f77002 == 0) {
                            i10 = this.f77034;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f76996;
                            }
                            this.f77034 = i10;
                            i11 = this.f76999;
                            if (i11 == -1) {
                                i11 = this.f77041;
                            }
                            this.f76999 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f77034;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f77011) {
                            if (this.f77033 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder10 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder10.put((byte) 0);
                                byteBufferOrder10.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) (this.f77020 + 0.5f));
                                byteBufferOrder10.putShort((short) (this.f77016 + 0.5f));
                                byteBufferOrder10.putShort((short) this.f77001);
                                byteBufferOrder10.putShort((short) this.f77021);
                            }
                            C8966 c89615 = new C8966();
                            c89615.m20709(this.f77039);
                            c89615.m20708(this.f77008);
                            c89615.m20711(this.f77014);
                            c89615.m20707(bArr);
                            c89615.m20710(this.f77017);
                            c89615.m20706(this.f77017);
                            c22378M20705 = c89615.m20705();
                        }
                        if (this.f77019 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f77015 == 0) {
                            if (Float.compare(this.f77009, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c3601.m6685(this.f76996);
                        c3601.m6689(this.f77041);
                        c3601.m6692(f);
                        c3601.m6671(iIntValue);
                        c3601.m6682(this.f77024);
                        c3601.m6710(this.f77003);
                        c3601.m6680(c22378M20705);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f77019 != null) {
                    c3601.m6705(this.f77019);
                }
                c3601.m6699(i);
                if (this.f77042) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c3601.m6694(str8);
                c3601.m6697(str11);
                c3601.m6683(i2);
                c3601.m6703(this.f77038);
                c3601.m6698(i114);
                c3601.m6678(list);
                c3601.m6677(str);
                c3601.m6679(this.f76993);
                C10307 c10307M66711 = c3601.m6672();
                InterfaceC20790 interfaceC20790Mo57311 = interfaceC23116.mo5732(this.f77043, i6);
                this.f77022 = interfaceC20790Mo57311;
                interfaceC20790Mo57311.mo10503(c10307M66711);
                return;
            case 10:
                C9310 c9310M21550 = C9310.m21550(new C19203(m53646(this.f77023)));
                ArrayList arrayList2 = c9310M21550.f25306;
                this.f77007 = c9310M21550.f25308;
                str5 = c9310M21550.f25312;
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
                if (this.f77036 != null) {
                    str = c20545M46450.f63508;
                    str11 = "video/dolby-vision";
                }
                boolean z11 = this.f77005;
                if (this.f76995) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i115 = (z11 ? 1 : 0) | i5;
                c3601 = new C3601();
                if (C11669.m26825(str11)) {
                    c3601.m6704(this.f77032);
                    c3601.m6688(this.f77013);
                    c3601.m6707(i3);
                    i6 = 1;
                } else {
                    if (C11669.m26816(str11)) {
                        if (this.f77002 == 0) {
                            i10 = this.f77034;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f76996;
                            }
                            this.f77034 = i10;
                            i11 = this.f76999;
                            if (i11 == -1) {
                                i11 = this.f77041;
                            }
                            this.f76999 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f77034;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f77011) {
                            if (this.f77033 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder11 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder11.put((byte) 0);
                                byteBufferOrder11.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) (this.f77020 + 0.5f));
                                byteBufferOrder11.putShort((short) (this.f77016 + 0.5f));
                                byteBufferOrder11.putShort((short) this.f77001);
                                byteBufferOrder11.putShort((short) this.f77021);
                            }
                            C8966 c89616 = new C8966();
                            c89616.m20709(this.f77039);
                            c89616.m20708(this.f77008);
                            c89616.m20711(this.f77014);
                            c89616.m20707(bArr);
                            c89616.m20710(this.f77017);
                            c89616.m20706(this.f77017);
                            c22378M20705 = c89616.m20705();
                        }
                        if (this.f77019 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f77015 == 0) {
                            if (Float.compare(this.f77009, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c3601.m6685(this.f76996);
                        c3601.m6689(this.f77041);
                        c3601.m6692(f);
                        c3601.m6671(iIntValue);
                        c3601.m6682(this.f77024);
                        c3601.m6710(this.f77003);
                        c3601.m6680(c22378M20705);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f77019 != null) {
                    c3601.m6705(this.f77019);
                }
                c3601.m6699(i);
                if (this.f77042) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c3601.m6694(str8);
                c3601.m6697(str11);
                c3601.m6683(i2);
                c3601.m6703(this.f77038);
                c3601.m6698(i115);
                c3601.m6678(list);
                c3601.m6677(str);
                c3601.m6679(this.f76993);
                C10307 c10307M66712 = c3601.m6672();
                InterfaceC20790 interfaceC20790Mo57312 = interfaceC23116.mo5732(this.f77043, i6);
                this.f77022 = interfaceC20790Mo57312;
                interfaceC20790Mo57312.mo10503(c10307M66712);
                return;
            case 11:
                str12 = "application/vobsub";
                listM36873of = AbstractC16192.m36873of((Object) m53646(this.f77023));
                str7 = null;
                list4 = listM36873of;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f77036 != null) {
                    str = c20545M46450.f63508;
                    str11 = "video/dolby-vision";
                }
                boolean z12 = this.f77005;
                if (this.f76995) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i116 = (z12 ? 1 : 0) | i5;
                c3601 = new C3601();
                if (C11669.m26825(str11)) {
                    c3601.m6704(this.f77032);
                    c3601.m6688(this.f77013);
                    c3601.m6707(i3);
                    i6 = 1;
                } else {
                    if (C11669.m26816(str11)) {
                        if (this.f77002 == 0) {
                            i10 = this.f77034;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f76996;
                            }
                            this.f77034 = i10;
                            i11 = this.f76999;
                            if (i11 == -1) {
                                i11 = this.f77041;
                            }
                            this.f76999 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f77034;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f77011) {
                            if (this.f77033 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder12 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder12.put((byte) 0);
                                byteBufferOrder12.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) (this.f77020 + 0.5f));
                                byteBufferOrder12.putShort((short) (this.f77016 + 0.5f));
                                byteBufferOrder12.putShort((short) this.f77001);
                                byteBufferOrder12.putShort((short) this.f77021);
                            }
                            C8966 c89617 = new C8966();
                            c89617.m20709(this.f77039);
                            c89617.m20708(this.f77008);
                            c89617.m20711(this.f77014);
                            c89617.m20707(bArr);
                            c89617.m20710(this.f77017);
                            c89617.m20706(this.f77017);
                            c22378M20705 = c89617.m20705();
                        }
                        if (this.f77019 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f77015 == 0) {
                            if (Float.compare(this.f77009, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c3601.m6685(this.f76996);
                        c3601.m6689(this.f77041);
                        c3601.m6692(f);
                        c3601.m6671(iIntValue);
                        c3601.m6682(this.f77024);
                        c3601.m6710(this.f77003);
                        c3601.m6680(c22378M20705);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f77019 != null) {
                    c3601.m6705(this.f77019);
                }
                c3601.m6699(i);
                if (this.f77042) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c3601.m6694(str8);
                c3601.m6697(str11);
                c3601.m6683(i2);
                c3601.m6703(this.f77038);
                c3601.m6698(i116);
                c3601.m6678(list);
                c3601.m6677(str);
                c3601.m6679(this.f76993);
                C10307 c10307M66713 = c3601.m6672();
                InterfaceC20790 interfaceC20790Mo57313 = interfaceC23116.mo5732(this.f77043, i6);
                this.f77022 = interfaceC20790Mo57313;
                interfaceC20790Mo57313.mo10503(c10307M66713);
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
                if (this.f77036 != null) {
                    str = c20545M46450.f63508;
                    str11 = "video/dolby-vision";
                }
                boolean z13 = this.f77005;
                if (this.f76995) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i117 = (z13 ? 1 : 0) | i5;
                c3601 = new C3601();
                if (C11669.m26825(str11)) {
                    c3601.m6704(this.f77032);
                    c3601.m6688(this.f77013);
                    c3601.m6707(i3);
                    i6 = 1;
                } else {
                    if (C11669.m26816(str11)) {
                        if (this.f77002 == 0) {
                            i10 = this.f77034;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f76996;
                            }
                            this.f77034 = i10;
                            i11 = this.f76999;
                            if (i11 == -1) {
                                i11 = this.f77041;
                            }
                            this.f76999 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f77034;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f77011) {
                            if (this.f77033 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder13 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder13.put((byte) 0);
                                byteBufferOrder13.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) (this.f77020 + 0.5f));
                                byteBufferOrder13.putShort((short) (this.f77016 + 0.5f));
                                byteBufferOrder13.putShort((short) this.f77001);
                                byteBufferOrder13.putShort((short) this.f77021);
                            }
                            C8966 c89618 = new C8966();
                            c89618.m20709(this.f77039);
                            c89618.m20708(this.f77008);
                            c89618.m20711(this.f77014);
                            c89618.m20707(bArr);
                            c89618.m20710(this.f77017);
                            c89618.m20706(this.f77017);
                            c22378M20705 = c89618.m20705();
                        }
                        if (this.f77019 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f77015 == 0) {
                            if (Float.compare(this.f77009, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c3601.m6685(this.f76996);
                        c3601.m6689(this.f77041);
                        c3601.m6692(f);
                        c3601.m6671(iIntValue);
                        c3601.m6682(this.f77024);
                        c3601.m6710(this.f77003);
                        c3601.m6680(c22378M20705);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f77019 != null) {
                    c3601.m6705(this.f77019);
                }
                c3601.m6699(i);
                if (this.f77042) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c3601.m6694(str8);
                c3601.m6697(str11);
                c3601.m6683(i2);
                c3601.m6703(this.f77038);
                c3601.m6698(i117);
                c3601.m6678(list);
                c3601.m6677(str);
                c3601.m6679(this.f76993);
                C10307 c10307M66714 = c3601.m6672();
                InterfaceC20790 interfaceC20790Mo57314 = interfaceC23116.mo5732(this.f77043, i6);
                this.f77022 = interfaceC20790Mo57314;
                interfaceC20790Mo57314.mo10503(c10307M66714);
                return;
            case 13:
                List listSingletonList2 = Collections.singletonList(m53646(this.f77023));
                byte[] bArr6 = this.f77044;
                C14674 c14674M31803 = C14004.m31803(new C17861(bArr6, bArr6.length), false);
                this.f77013 = c14674M31803.f41890;
                this.f77032 = c14674M31803.f41888;
                str7 = c14674M31803.f41889;
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
                if (this.f77036 != null) {
                    str = c20545M46450.f63508;
                    str11 = "video/dolby-vision";
                }
                boolean z14 = this.f77005;
                if (this.f76995) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i118 = (z14 ? 1 : 0) | i5;
                c3601 = new C3601();
                if (C11669.m26825(str11)) {
                    c3601.m6704(this.f77032);
                    c3601.m6688(this.f77013);
                    c3601.m6707(i3);
                    i6 = 1;
                } else {
                    if (C11669.m26816(str11)) {
                        if (this.f77002 == 0) {
                            i10 = this.f77034;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f76996;
                            }
                            this.f77034 = i10;
                            i11 = this.f76999;
                            if (i11 == -1) {
                                i11 = this.f77041;
                            }
                            this.f76999 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f77034;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f77011) {
                            if (this.f77033 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder14 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder14.put((byte) 0);
                                byteBufferOrder14.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) (this.f77020 + 0.5f));
                                byteBufferOrder14.putShort((short) (this.f77016 + 0.5f));
                                byteBufferOrder14.putShort((short) this.f77001);
                                byteBufferOrder14.putShort((short) this.f77021);
                            }
                            C8966 c89619 = new C8966();
                            c89619.m20709(this.f77039);
                            c89619.m20708(this.f77008);
                            c89619.m20711(this.f77014);
                            c89619.m20707(bArr);
                            c89619.m20710(this.f77017);
                            c89619.m20706(this.f77017);
                            c22378M20705 = c89619.m20705();
                        }
                        if (this.f77019 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f77015 == 0) {
                            if (Float.compare(this.f77009, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c3601.m6685(this.f76996);
                        c3601.m6689(this.f77041);
                        c3601.m6692(f);
                        c3601.m6671(iIntValue);
                        c3601.m6682(this.f77024);
                        c3601.m6710(this.f77003);
                        c3601.m6680(c22378M20705);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f77019 != null) {
                    c3601.m6705(this.f77019);
                }
                c3601.m6699(i);
                if (this.f77042) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c3601.m6694(str8);
                c3601.m6697(str11);
                c3601.m6683(i2);
                c3601.m6703(this.f77038);
                c3601.m6698(i118);
                c3601.m6678(list);
                c3601.m6677(str);
                c3601.m6679(this.f76993);
                C10307 c10307M66715 = c3601.m6672();
                InterfaceC20790 interfaceC20790Mo57315 = interfaceC23116.mo5732(this.f77043, i6);
                this.f77022 = interfaceC20790Mo57315;
                interfaceC20790Mo57315.mo10503(c10307M66715);
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
                if (this.f77036 != null) {
                    str = c20545M46450.f63508;
                    str11 = "video/dolby-vision";
                }
                boolean z15 = this.f77005;
                if (this.f76995) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i119 = (z15 ? 1 : 0) | i5;
                c3601 = new C3601();
                if (C11669.m26825(str11)) {
                    c3601.m6704(this.f77032);
                    c3601.m6688(this.f77013);
                    c3601.m6707(i3);
                    i6 = 1;
                } else {
                    if (C11669.m26816(str11)) {
                        if (this.f77002 == 0) {
                            i10 = this.f77034;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f76996;
                            }
                            this.f77034 = i10;
                            i11 = this.f76999;
                            if (i11 == -1) {
                                i11 = this.f77041;
                            }
                            this.f76999 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f77034;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f77011) {
                            if (this.f77033 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder15 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder15.put((byte) 0);
                                byteBufferOrder15.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) (this.f77020 + 0.5f));
                                byteBufferOrder15.putShort((short) (this.f77016 + 0.5f));
                                byteBufferOrder15.putShort((short) this.f77001);
                                byteBufferOrder15.putShort((short) this.f77021);
                            }
                            C8966 c896110 = new C8966();
                            c896110.m20709(this.f77039);
                            c896110.m20708(this.f77008);
                            c896110.m20711(this.f77014);
                            c896110.m20707(bArr);
                            c896110.m20710(this.f77017);
                            c896110.m20706(this.f77017);
                            c22378M20705 = c896110.m20705();
                        }
                        if (this.f77019 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f77015 == 0) {
                            if (Float.compare(this.f77009, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c3601.m6685(this.f76996);
                        c3601.m6689(this.f77041);
                        c3601.m6692(f);
                        c3601.m6671(iIntValue);
                        c3601.m6682(this.f77024);
                        c3601.m6710(this.f77003);
                        c3601.m6680(c22378M20705);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f77019 != null) {
                    c3601.m6705(this.f77019);
                }
                c3601.m6699(i);
                if (this.f77042) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c3601.m6694(str8);
                c3601.m6697(str11);
                c3601.m6683(i2);
                c3601.m6703(this.f77038);
                c3601.m6698(i119);
                c3601.m6678(list);
                c3601.m6677(str);
                c3601.m6679(this.f76993);
                C10307 c10307M66716 = c3601.m6672();
                InterfaceC20790 interfaceC20790Mo57316 = interfaceC23116.mo5732(this.f77043, i6);
                this.f77022 = interfaceC20790Mo57316;
                interfaceC20790Mo57316.mo10503(c10307M66716);
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
                if (this.f77036 != null) {
                    str = c20545M46450.f63508;
                    str11 = "video/dolby-vision";
                }
                boolean z16 = this.f77005;
                if (this.f76995) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1110 = (z16 ? 1 : 0) | i5;
                c3601 = new C3601();
                if (C11669.m26825(str11)) {
                    c3601.m6704(this.f77032);
                    c3601.m6688(this.f77013);
                    c3601.m6707(i3);
                    i6 = 1;
                } else {
                    if (C11669.m26816(str11)) {
                        if (this.f77002 == 0) {
                            i10 = this.f77034;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f76996;
                            }
                            this.f77034 = i10;
                            i11 = this.f76999;
                            if (i11 == -1) {
                                i11 = this.f77041;
                            }
                            this.f76999 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f77034;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f77011) {
                            if (this.f77033 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder16 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder16.put((byte) 0);
                                byteBufferOrder16.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) (this.f77020 + 0.5f));
                                byteBufferOrder16.putShort((short) (this.f77016 + 0.5f));
                                byteBufferOrder16.putShort((short) this.f77001);
                                byteBufferOrder16.putShort((short) this.f77021);
                            }
                            C8966 c896111 = new C8966();
                            c896111.m20709(this.f77039);
                            c896111.m20708(this.f77008);
                            c896111.m20711(this.f77014);
                            c896111.m20707(bArr);
                            c896111.m20710(this.f77017);
                            c896111.m20706(this.f77017);
                            c22378M20705 = c896111.m20705();
                        }
                        if (this.f77019 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f77015 == 0) {
                            if (Float.compare(this.f77009, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c3601.m6685(this.f76996);
                        c3601.m6689(this.f77041);
                        c3601.m6692(f);
                        c3601.m6671(iIntValue);
                        c3601.m6682(this.f77024);
                        c3601.m6710(this.f77003);
                        c3601.m6680(c22378M20705);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f77019 != null) {
                    c3601.m6705(this.f77019);
                }
                c3601.m6699(i);
                if (this.f77042) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c3601.m6694(str8);
                c3601.m6697(str11);
                c3601.m6683(i2);
                c3601.m6703(this.f77038);
                c3601.m6698(i1110);
                c3601.m6678(list);
                c3601.m6677(str);
                c3601.m6679(this.f76993);
                C10307 c10307M66717 = c3601.m6672();
                InterfaceC20790 interfaceC20790Mo57317 = interfaceC23116.mo5732(this.f77043, i6);
                this.f77022 = interfaceC20790Mo57317;
                interfaceC20790Mo57317.mo10503(c10307M66717);
                return;
            case 16:
                byte[] bArr7 = this.f77044;
                str4 = "video/av01";
                listM36873of2 = bArr7 == null ? null : AbstractC16192.m36873of((Object) bArr7);
                str12 = str4;
                listM36873of = listM36873of2;
                str7 = null;
                list4 = listM36873of;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f77036 != null) {
                    str = c20545M46450.f63508;
                    str11 = "video/dolby-vision";
                }
                boolean z17 = this.f77005;
                if (this.f76995) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1111 = (z17 ? 1 : 0) | i5;
                c3601 = new C3601();
                if (C11669.m26825(str11)) {
                    c3601.m6704(this.f77032);
                    c3601.m6688(this.f77013);
                    c3601.m6707(i3);
                    i6 = 1;
                } else {
                    if (C11669.m26816(str11)) {
                        if (this.f77002 == 0) {
                            i10 = this.f77034;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f76996;
                            }
                            this.f77034 = i10;
                            i11 = this.f76999;
                            if (i11 == -1) {
                                i11 = this.f77041;
                            }
                            this.f76999 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f77034;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f77011) {
                            if (this.f77033 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder17 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder17.put((byte) 0);
                                byteBufferOrder17.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) (this.f77020 + 0.5f));
                                byteBufferOrder17.putShort((short) (this.f77016 + 0.5f));
                                byteBufferOrder17.putShort((short) this.f77001);
                                byteBufferOrder17.putShort((short) this.f77021);
                            }
                            C8966 c896112 = new C8966();
                            c896112.m20709(this.f77039);
                            c896112.m20708(this.f77008);
                            c896112.m20711(this.f77014);
                            c896112.m20707(bArr);
                            c896112.m20710(this.f77017);
                            c896112.m20706(this.f77017);
                            c22378M20705 = c896112.m20705();
                        }
                        if (this.f77019 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f77015 == 0) {
                            if (Float.compare(this.f77009, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c3601.m6685(this.f76996);
                        c3601.m6689(this.f77041);
                        c3601.m6692(f);
                        c3601.m6671(iIntValue);
                        c3601.m6682(this.f77024);
                        c3601.m6710(this.f77003);
                        c3601.m6680(c22378M20705);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f77019 != null) {
                    c3601.m6705(this.f77019);
                }
                c3601.m6699(i);
                if (this.f77042) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c3601.m6694(str8);
                c3601.m6697(str11);
                c3601.m6683(i2);
                c3601.m6703(this.f77038);
                c3601.m6698(i1111);
                c3601.m6678(list);
                c3601.m6677(str);
                c3601.m6679(this.f76993);
                C10307 c10307M66718 = c3601.m6672();
                InterfaceC20790 interfaceC20790Mo57318 = interfaceC23116.mo5732(this.f77043, i6);
                this.f77022 = interfaceC20790Mo57318;
                interfaceC20790Mo57318.mo10503(c10307M66718);
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
                if (this.f77036 != null) {
                    str = c20545M46450.f63508;
                    str11 = "video/dolby-vision";
                }
                boolean z18 = this.f77005;
                if (this.f76995) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1112 = (z18 ? 1 : 0) | i5;
                c3601 = new C3601();
                if (C11669.m26825(str11)) {
                    c3601.m6704(this.f77032);
                    c3601.m6688(this.f77013);
                    c3601.m6707(i3);
                    i6 = 1;
                } else {
                    if (C11669.m26816(str11)) {
                        if (this.f77002 == 0) {
                            i10 = this.f77034;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f76996;
                            }
                            this.f77034 = i10;
                            i11 = this.f76999;
                            if (i11 == -1) {
                                i11 = this.f77041;
                            }
                            this.f76999 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f77034;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f77011) {
                            if (this.f77033 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder18 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder18.put((byte) 0);
                                byteBufferOrder18.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) (this.f77020 + 0.5f));
                                byteBufferOrder18.putShort((short) (this.f77016 + 0.5f));
                                byteBufferOrder18.putShort((short) this.f77001);
                                byteBufferOrder18.putShort((short) this.f77021);
                            }
                            C8966 c896113 = new C8966();
                            c896113.m20709(this.f77039);
                            c896113.m20708(this.f77008);
                            c896113.m20711(this.f77014);
                            c896113.m20707(bArr);
                            c896113.m20710(this.f77017);
                            c896113.m20706(this.f77017);
                            c22378M20705 = c896113.m20705();
                        }
                        if (this.f77019 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f77015 == 0) {
                            if (Float.compare(this.f77009, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c3601.m6685(this.f76996);
                        c3601.m6689(this.f77041);
                        c3601.m6692(f);
                        c3601.m6671(iIntValue);
                        c3601.m6682(this.f77024);
                        c3601.m6710(this.f77003);
                        c3601.m6680(c22378M20705);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f77019 != null) {
                    c3601.m6705(this.f77019);
                }
                c3601.m6699(i);
                if (this.f77042) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c3601.m6694(str8);
                c3601.m6697(str11);
                c3601.m6683(i2);
                c3601.m6703(this.f77038);
                c3601.m6698(i1112);
                c3601.m6678(list);
                c3601.m6677(str);
                c3601.m6679(this.f76993);
                C10307 c10307M66719 = c3601.m6672();
                InterfaceC20790 interfaceC20790Mo57319 = interfaceC23116.mo5732(this.f77043, i6);
                this.f77022 = interfaceC20790Mo57319;
                interfaceC20790Mo57319.mo10503(c10307M66719);
                return;
            case 18:
                byte[] bArr8 = this.f77044;
                str4 = "video/x-vnd.on2.vp9";
                listM36873of2 = bArr8 == null ? null : AbstractC16192.m36873of((Object) bArr8);
                str12 = str4;
                listM36873of = listM36873of2;
                str7 = null;
                list4 = listM36873of;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f77036 != null) {
                    str = c20545M46450.f63508;
                    str11 = "video/dolby-vision";
                }
                boolean z19 = this.f77005;
                if (this.f76995) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1113 = (z19 ? 1 : 0) | i5;
                c3601 = new C3601();
                if (C11669.m26825(str11)) {
                    c3601.m6704(this.f77032);
                    c3601.m6688(this.f77013);
                    c3601.m6707(i3);
                    i6 = 1;
                } else {
                    if (C11669.m26816(str11)) {
                        if (this.f77002 == 0) {
                            i10 = this.f77034;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f76996;
                            }
                            this.f77034 = i10;
                            i11 = this.f76999;
                            if (i11 == -1) {
                                i11 = this.f77041;
                            }
                            this.f76999 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f77034;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f77011) {
                            if (this.f77033 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder19 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder19.put((byte) 0);
                                byteBufferOrder19.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) (this.f77020 + 0.5f));
                                byteBufferOrder19.putShort((short) (this.f77016 + 0.5f));
                                byteBufferOrder19.putShort((short) this.f77001);
                                byteBufferOrder19.putShort((short) this.f77021);
                            }
                            C8966 c896114 = new C8966();
                            c896114.m20709(this.f77039);
                            c896114.m20708(this.f77008);
                            c896114.m20711(this.f77014);
                            c896114.m20707(bArr);
                            c896114.m20710(this.f77017);
                            c896114.m20706(this.f77017);
                            c22378M20705 = c896114.m20705();
                        }
                        if (this.f77019 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f77015 == 0) {
                            if (Float.compare(this.f77009, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c3601.m6685(this.f76996);
                        c3601.m6689(this.f77041);
                        c3601.m6692(f);
                        c3601.m6671(iIntValue);
                        c3601.m6682(this.f77024);
                        c3601.m6710(this.f77003);
                        c3601.m6680(c22378M20705);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f77019 != null) {
                    c3601.m6705(this.f77019);
                }
                c3601.m6699(i);
                if (this.f77042) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c3601.m6694(str8);
                c3601.m6697(str11);
                c3601.m6683(i2);
                c3601.m6703(this.f77038);
                c3601.m6698(i1113);
                c3601.m6678(list);
                c3601.m6677(str);
                c3601.m6679(this.f76993);
                C10307 c10307M667110 = c3601.m6672();
                InterfaceC20790 interfaceC20790Mo573110 = interfaceC23116.mo5732(this.f77043, i6);
                this.f77022 = interfaceC20790Mo573110;
                interfaceC20790Mo573110.mo10503(c10307M667110);
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
                if (this.f77036 != null) {
                    str = c20545M46450.f63508;
                    str11 = "video/dolby-vision";
                }
                boolean z110 = this.f77005;
                if (this.f76995) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1114 = (z110 ? 1 : 0) | i5;
                c3601 = new C3601();
                if (C11669.m26825(str11)) {
                    c3601.m6704(this.f77032);
                    c3601.m6688(this.f77013);
                    c3601.m6707(i3);
                    i6 = 1;
                } else {
                    if (C11669.m26816(str11)) {
                        if (this.f77002 == 0) {
                            i10 = this.f77034;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f76996;
                            }
                            this.f77034 = i10;
                            i11 = this.f76999;
                            if (i11 == -1) {
                                i11 = this.f77041;
                            }
                            this.f76999 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f77034;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f77011) {
                            if (this.f77033 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder110 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder110.put((byte) 0);
                                byteBufferOrder110.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) (this.f77020 + 0.5f));
                                byteBufferOrder110.putShort((short) (this.f77016 + 0.5f));
                                byteBufferOrder110.putShort((short) this.f77001);
                                byteBufferOrder110.putShort((short) this.f77021);
                            }
                            C8966 c896115 = new C8966();
                            c896115.m20709(this.f77039);
                            c896115.m20708(this.f77008);
                            c896115.m20711(this.f77014);
                            c896115.m20707(bArr);
                            c896115.m20710(this.f77017);
                            c896115.m20706(this.f77017);
                            c22378M20705 = c896115.m20705();
                        }
                        if (this.f77019 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f77015 == 0) {
                            if (Float.compare(this.f77009, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c3601.m6685(this.f76996);
                        c3601.m6689(this.f77041);
                        c3601.m6692(f);
                        c3601.m6671(iIntValue);
                        c3601.m6682(this.f77024);
                        c3601.m6710(this.f77003);
                        c3601.m6680(c22378M20705);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f77019 != null) {
                    c3601.m6705(this.f77019);
                }
                c3601.m6699(i);
                if (this.f77042) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c3601.m6694(str8);
                c3601.m6697(str11);
                c3601.m6683(i2);
                c3601.m6703(this.f77038);
                c3601.m6698(i1114);
                c3601.m6678(list);
                c3601.m6677(str);
                c3601.m6679(this.f76993);
                C10307 c10307M667111 = c3601.m6672();
                InterfaceC20790 interfaceC20790Mo573111 = interfaceC23116.mo5732(this.f77043, i6);
                this.f77022 = interfaceC20790Mo573111;
                interfaceC20790Mo573111.mo10503(c10307M667111);
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
                if (this.f77036 != null) {
                    str = c20545M46450.f63508;
                    str11 = "video/dolby-vision";
                }
                boolean z111 = this.f77005;
                if (this.f76995) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1115 = (z111 ? 1 : 0) | i5;
                c3601 = new C3601();
                if (C11669.m26825(str11)) {
                    c3601.m6704(this.f77032);
                    c3601.m6688(this.f77013);
                    c3601.m6707(i3);
                    i6 = 1;
                } else {
                    if (C11669.m26816(str11)) {
                        if (this.f77002 == 0) {
                            i10 = this.f77034;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f76996;
                            }
                            this.f77034 = i10;
                            i11 = this.f76999;
                            if (i11 == -1) {
                                i11 = this.f77041;
                            }
                            this.f76999 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f77034;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f77011) {
                            if (this.f77033 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder111 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder111.put((byte) 0);
                                byteBufferOrder111.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) (this.f77020 + 0.5f));
                                byteBufferOrder111.putShort((short) (this.f77016 + 0.5f));
                                byteBufferOrder111.putShort((short) this.f77001);
                                byteBufferOrder111.putShort((short) this.f77021);
                            }
                            C8966 c896116 = new C8966();
                            c896116.m20709(this.f77039);
                            c896116.m20708(this.f77008);
                            c896116.m20711(this.f77014);
                            c896116.m20707(bArr);
                            c896116.m20710(this.f77017);
                            c896116.m20706(this.f77017);
                            c22378M20705 = c896116.m20705();
                        }
                        if (this.f77019 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f77015 == 0) {
                            if (Float.compare(this.f77009, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c3601.m6685(this.f76996);
                        c3601.m6689(this.f77041);
                        c3601.m6692(f);
                        c3601.m6671(iIntValue);
                        c3601.m6682(this.f77024);
                        c3601.m6710(this.f77003);
                        c3601.m6680(c22378M20705);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f77019 != null) {
                    c3601.m6705(this.f77019);
                }
                c3601.m6699(i);
                if (this.f77042) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c3601.m6694(str8);
                c3601.m6697(str11);
                c3601.m6683(i2);
                c3601.m6703(this.f77038);
                c3601.m6698(i1115);
                c3601.m6678(list);
                c3601.m6677(str);
                c3601.m6679(this.f76993);
                C10307 c10307M667112 = c3601.m6672();
                InterfaceC20790 interfaceC20790Mo573112 = interfaceC23116.mo5732(this.f77043, i6);
                this.f77022 = interfaceC20790Mo573112;
                interfaceC20790Mo573112.mo10503(c10307M667112);
                return;
            case 22:
                if (this.f76997 == 32) {
                    list = null;
                    str = null;
                    i2 = -1;
                    i3 = 4;
                } else {
                    C21334.m48351("Unsupported floating point PCM bit depth: " + this.f76997 + ". Setting mimeType to audio/x-unknown");
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
                if (this.f77036 != null) {
                    str = c20545M46450.f63508;
                    str11 = "video/dolby-vision";
                }
                boolean z112 = this.f77005;
                if (this.f76995) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1116 = (z112 ? 1 : 0) | i5;
                c3601 = new C3601();
                if (C11669.m26825(str11)) {
                    c3601.m6704(this.f77032);
                    c3601.m6688(this.f77013);
                    c3601.m6707(i3);
                    i6 = 1;
                } else {
                    if (C11669.m26816(str11)) {
                        if (this.f77002 == 0) {
                            i10 = this.f77034;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f76996;
                            }
                            this.f77034 = i10;
                            i11 = this.f76999;
                            if (i11 == -1) {
                                i11 = this.f77041;
                            }
                            this.f76999 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f77034;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f77011) {
                            if (this.f77033 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder112 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder112.put((byte) 0);
                                byteBufferOrder112.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) (this.f77020 + 0.5f));
                                byteBufferOrder112.putShort((short) (this.f77016 + 0.5f));
                                byteBufferOrder112.putShort((short) this.f77001);
                                byteBufferOrder112.putShort((short) this.f77021);
                            }
                            C8966 c896117 = new C8966();
                            c896117.m20709(this.f77039);
                            c896117.m20708(this.f77008);
                            c896117.m20711(this.f77014);
                            c896117.m20707(bArr);
                            c896117.m20710(this.f77017);
                            c896117.m20706(this.f77017);
                            c22378M20705 = c896117.m20705();
                        }
                        if (this.f77019 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f77015 == 0) {
                            if (Float.compare(this.f77009, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c3601.m6685(this.f76996);
                        c3601.m6689(this.f77041);
                        c3601.m6692(f);
                        c3601.m6671(iIntValue);
                        c3601.m6682(this.f77024);
                        c3601.m6710(this.f77003);
                        c3601.m6680(c22378M20705);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f77019 != null) {
                    c3601.m6705(this.f77019);
                }
                c3601.m6699(i);
                if (this.f77042) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c3601.m6694(str8);
                c3601.m6697(str11);
                c3601.m6683(i2);
                c3601.m6703(this.f77038);
                c3601.m6698(i1116);
                c3601.m6678(list);
                c3601.m6677(str);
                c3601.m6679(this.f76993);
                C10307 c10307M667113 = c3601.m6672();
                InterfaceC20790 interfaceC20790Mo573113 = interfaceC23116.mo5732(this.f77043, i6);
                this.f77022 = interfaceC20790Mo573113;
                interfaceC20790Mo573113.mo10503(c10307M667113);
                return;
            case 23:
                int i29 = this.f76997;
                if (i29 == 8) {
                    list = null;
                    str = null;
                    i2 = -1;
                    i3 = 3;
                } else {
                    if (i29 == 16) {
                        iM12979 = 268435456;
                    } else if (i29 == 24) {
                        iM12979 = 1342177280;
                    } else if (i29 == 32) {
                        iM12979 = 1610612736;
                    } else {
                        C21334.m48351("Unsupported big endian PCM bit depth: " + this.f76997 + ". Setting mimeType to audio/x-unknown");
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
                    i3 = iM12979;
                    list = null;
                    str = null;
                }
                if (this.f77036 != null) {
                    str = c20545M46450.f63508;
                    str11 = "video/dolby-vision";
                }
                boolean z113 = this.f77005;
                if (this.f76995) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1117 = (z113 ? 1 : 0) | i5;
                c3601 = new C3601();
                if (C11669.m26825(str11)) {
                    c3601.m6704(this.f77032);
                    c3601.m6688(this.f77013);
                    c3601.m6707(i3);
                    i6 = 1;
                } else {
                    if (C11669.m26816(str11)) {
                        if (this.f77002 == 0) {
                            i10 = this.f77034;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f76996;
                            }
                            this.f77034 = i10;
                            i11 = this.f76999;
                            if (i11 == -1) {
                                i11 = this.f77041;
                            }
                            this.f76999 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f77034;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f77011) {
                            if (this.f77033 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder113 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder113.put((byte) 0);
                                byteBufferOrder113.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) (this.f77020 + 0.5f));
                                byteBufferOrder113.putShort((short) (this.f77016 + 0.5f));
                                byteBufferOrder113.putShort((short) this.f77001);
                                byteBufferOrder113.putShort((short) this.f77021);
                            }
                            C8966 c896118 = new C8966();
                            c896118.m20709(this.f77039);
                            c896118.m20708(this.f77008);
                            c896118.m20711(this.f77014);
                            c896118.m20707(bArr);
                            c896118.m20710(this.f77017);
                            c896118.m20706(this.f77017);
                            c22378M20705 = c896118.m20705();
                        }
                        if (this.f77019 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f77015 == 0) {
                            if (Float.compare(this.f77009, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c3601.m6685(this.f76996);
                        c3601.m6689(this.f77041);
                        c3601.m6692(f);
                        c3601.m6671(iIntValue);
                        c3601.m6682(this.f77024);
                        c3601.m6710(this.f77003);
                        c3601.m6680(c22378M20705);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f77019 != null) {
                    c3601.m6705(this.f77019);
                }
                c3601.m6699(i);
                if (this.f77042) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c3601.m6694(str8);
                c3601.m6697(str11);
                c3601.m6683(i2);
                c3601.m6703(this.f77038);
                c3601.m6698(i1117);
                c3601.m6678(list);
                c3601.m6677(str);
                c3601.m6679(this.f76993);
                C10307 c10307M667114 = c3601.m6672();
                InterfaceC20790 interfaceC20790Mo573114 = interfaceC23116.mo5732(this.f77043, i6);
                this.f77022 = interfaceC20790Mo573114;
                interfaceC20790Mo573114.mo10503(c10307M667114);
                return;
            case 24:
                int i30 = this.f76997;
                String str14 = C5792.f14228;
                iM12979 = C5792.m12979(i30, ByteOrder.LITTLE_ENDIAN);
                if (iM12979 == 0) {
                    C21334.m48351("Unsupported little endian PCM bit depth: " + this.f76997 + ". Setting mimeType to audio/x-unknown");
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
                    i3 = iM12979;
                    list = null;
                    str = null;
                }
                if (this.f77036 != null) {
                    str = c20545M46450.f63508;
                    str11 = "video/dolby-vision";
                }
                boolean z114 = this.f77005;
                if (this.f76995) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1118 = (z114 ? 1 : 0) | i5;
                c3601 = new C3601();
                if (C11669.m26825(str11)) {
                    c3601.m6704(this.f77032);
                    c3601.m6688(this.f77013);
                    c3601.m6707(i3);
                    i6 = 1;
                } else {
                    if (C11669.m26816(str11)) {
                        if (this.f77002 == 0) {
                            i10 = this.f77034;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f76996;
                            }
                            this.f77034 = i10;
                            i11 = this.f76999;
                            if (i11 == -1) {
                                i11 = this.f77041;
                            }
                            this.f76999 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f77034;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f77011) {
                            if (this.f77033 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder114 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder114.put((byte) 0);
                                byteBufferOrder114.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) (this.f77020 + 0.5f));
                                byteBufferOrder114.putShort((short) (this.f77016 + 0.5f));
                                byteBufferOrder114.putShort((short) this.f77001);
                                byteBufferOrder114.putShort((short) this.f77021);
                            }
                            C8966 c896119 = new C8966();
                            c896119.m20709(this.f77039);
                            c896119.m20708(this.f77008);
                            c896119.m20711(this.f77014);
                            c896119.m20707(bArr);
                            c896119.m20710(this.f77017);
                            c896119.m20706(this.f77017);
                            c22378M20705 = c896119.m20705();
                        }
                        if (this.f77019 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f77015 == 0) {
                            if (Float.compare(this.f77009, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c3601.m6685(this.f76996);
                        c3601.m6689(this.f77041);
                        c3601.m6692(f);
                        c3601.m6671(iIntValue);
                        c3601.m6682(this.f77024);
                        c3601.m6710(this.f77003);
                        c3601.m6680(c22378M20705);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f77019 != null) {
                    c3601.m6705(this.f77019);
                }
                c3601.m6699(i);
                if (this.f77042) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c3601.m6694(str8);
                c3601.m6697(str11);
                c3601.m6683(i2);
                c3601.m6703(this.f77038);
                c3601.m6698(i1118);
                c3601.m6678(list);
                c3601.m6677(str);
                c3601.m6679(this.f76993);
                C10307 c10307M667115 = c3601.m6672();
                InterfaceC20790 interfaceC20790Mo573115 = interfaceC23116.mo5732(this.f77043, i6);
                this.f77022 = interfaceC20790Mo573115;
                interfaceC20790Mo573115.mo10503(c10307M667115);
                return;
            case 25:
            case 26:
                str12 = "text/x-ssa";
                listM36873of = AbstractC16192.m36874of((Object) C15598.f44582, (Object) m53646(this.f77023));
                str7 = null;
                list4 = listM36873of;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f77036 != null) {
                    str = c20545M46450.f63508;
                    str11 = "video/dolby-vision";
                }
                boolean z115 = this.f77005;
                if (this.f76995) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i1119 = (z115 ? 1 : 0) | i5;
                c3601 = new C3601();
                if (C11669.m26825(str11)) {
                    c3601.m6704(this.f77032);
                    c3601.m6688(this.f77013);
                    c3601.m6707(i3);
                    i6 = 1;
                } else {
                    if (C11669.m26816(str11)) {
                        if (this.f77002 == 0) {
                            i10 = this.f77034;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f76996;
                            }
                            this.f77034 = i10;
                            i11 = this.f76999;
                            if (i11 == -1) {
                                i11 = this.f77041;
                            }
                            this.f76999 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f77034;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f77011) {
                            if (this.f77033 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder115 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder115.put((byte) 0);
                                byteBufferOrder115.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) (this.f77020 + 0.5f));
                                byteBufferOrder115.putShort((short) (this.f77016 + 0.5f));
                                byteBufferOrder115.putShort((short) this.f77001);
                                byteBufferOrder115.putShort((short) this.f77021);
                            }
                            C8966 c8961110 = new C8966();
                            c8961110.m20709(this.f77039);
                            c8961110.m20708(this.f77008);
                            c8961110.m20711(this.f77014);
                            c8961110.m20707(bArr);
                            c8961110.m20710(this.f77017);
                            c8961110.m20706(this.f77017);
                            c22378M20705 = c8961110.m20705();
                        }
                        if (this.f77019 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f77015 == 0) {
                            if (Float.compare(this.f77009, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c3601.m6685(this.f76996);
                        c3601.m6689(this.f77041);
                        c3601.m6692(f);
                        c3601.m6671(iIntValue);
                        c3601.m6682(this.f77024);
                        c3601.m6710(this.f77003);
                        c3601.m6680(c22378M20705);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f77019 != null) {
                    c3601.m6705(this.f77019);
                }
                c3601.m6699(i);
                if (this.f77042) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c3601.m6694(str8);
                c3601.m6697(str11);
                c3601.m6683(i2);
                c3601.m6703(this.f77038);
                c3601.m6698(i1119);
                c3601.m6678(list);
                c3601.m6677(str);
                c3601.m6679(this.f76993);
                C10307 c10307M667116 = c3601.m6672();
                InterfaceC20790 interfaceC20790Mo573116 = interfaceC23116.mo5732(this.f77043, i6);
                this.f77022 = interfaceC20790Mo573116;
                interfaceC20790Mo573116.mo10503(c10307M667116);
                return;
            case 27:
                C12743 c12743M29264 = C12743.m29264(new C19203(m53646(this.f77023)));
                List list7 = c12743M29264.f35786;
                this.f77007 = c12743M29264.f35772;
                str5 = c12743M29264.f35781;
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
                if (this.f77036 != null) {
                    str = c20545M46450.f63508;
                    str11 = "video/dolby-vision";
                }
                boolean z116 = this.f77005;
                if (this.f76995) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i11110 = (z116 ? 1 : 0) | i5;
                c3601 = new C3601();
                if (C11669.m26825(str11)) {
                    c3601.m6704(this.f77032);
                    c3601.m6688(this.f77013);
                    c3601.m6707(i3);
                    i6 = 1;
                } else {
                    if (C11669.m26816(str11)) {
                        if (this.f77002 == 0) {
                            i10 = this.f77034;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f76996;
                            }
                            this.f77034 = i10;
                            i11 = this.f76999;
                            if (i11 == -1) {
                                i11 = this.f77041;
                            }
                            this.f76999 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f77034;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f77011) {
                            if (this.f77033 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder116 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder116.put((byte) 0);
                                byteBufferOrder116.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) (this.f77020 + 0.5f));
                                byteBufferOrder116.putShort((short) (this.f77016 + 0.5f));
                                byteBufferOrder116.putShort((short) this.f77001);
                                byteBufferOrder116.putShort((short) this.f77021);
                            }
                            C8966 c8961111 = new C8966();
                            c8961111.m20709(this.f77039);
                            c8961111.m20708(this.f77008);
                            c8961111.m20711(this.f77014);
                            c8961111.m20707(bArr);
                            c8961111.m20710(this.f77017);
                            c8961111.m20706(this.f77017);
                            c22378M20705 = c8961111.m20705();
                        }
                        if (this.f77019 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f77015 == 0) {
                            if (Float.compare(this.f77009, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c3601.m6685(this.f76996);
                        c3601.m6689(this.f77041);
                        c3601.m6692(f);
                        c3601.m6671(iIntValue);
                        c3601.m6682(this.f77024);
                        c3601.m6710(this.f77003);
                        c3601.m6680(c22378M20705);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f77019 != null) {
                    c3601.m6705(this.f77019);
                }
                c3601.m6699(i);
                if (this.f77042) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c3601.m6694(str8);
                c3601.m6697(str11);
                c3601.m6683(i2);
                c3601.m6703(this.f77038);
                c3601.m6698(i11110);
                c3601.m6678(list);
                c3601.m6677(str);
                c3601.m6679(this.f76993);
                C10307 c10307M667117 = c3601.m6672();
                InterfaceC20790 interfaceC20790Mo573117 = interfaceC23116.mo5732(this.f77043, i6);
                this.f77022 = interfaceC20790Mo573117;
                interfaceC20790Mo573117.mo10503(c10307M667117);
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
                if (this.f77036 != null) {
                    str = c20545M46450.f63508;
                    str11 = "video/dolby-vision";
                }
                boolean z117 = this.f77005;
                if (this.f76995) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i11111 = (z117 ? 1 : 0) | i5;
                c3601 = new C3601();
                if (C11669.m26825(str11)) {
                    c3601.m6704(this.f77032);
                    c3601.m6688(this.f77013);
                    c3601.m6707(i3);
                    i6 = 1;
                } else {
                    if (C11669.m26816(str11)) {
                        if (this.f77002 == 0) {
                            i10 = this.f77034;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f76996;
                            }
                            this.f77034 = i10;
                            i11 = this.f76999;
                            if (i11 == -1) {
                                i11 = this.f77041;
                            }
                            this.f76999 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f77034;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f77011) {
                            if (this.f77033 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder117 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder117.put((byte) 0);
                                byteBufferOrder117.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) (this.f77020 + 0.5f));
                                byteBufferOrder117.putShort((short) (this.f77016 + 0.5f));
                                byteBufferOrder117.putShort((short) this.f77001);
                                byteBufferOrder117.putShort((short) this.f77021);
                            }
                            C8966 c8961112 = new C8966();
                            c8961112.m20709(this.f77039);
                            c8961112.m20708(this.f77008);
                            c8961112.m20711(this.f77014);
                            c8961112.m20707(bArr);
                            c8961112.m20710(this.f77017);
                            c8961112.m20706(this.f77017);
                            c22378M20705 = c8961112.m20705();
                        }
                        if (this.f77019 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f77015 == 0) {
                            if (Float.compare(this.f77009, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c3601.m6685(this.f76996);
                        c3601.m6689(this.f77041);
                        c3601.m6692(f);
                        c3601.m6671(iIntValue);
                        c3601.m6682(this.f77024);
                        c3601.m6710(this.f77003);
                        c3601.m6680(c22378M20705);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f77019 != null) {
                    c3601.m6705(this.f77019);
                }
                c3601.m6699(i);
                if (this.f77042) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c3601.m6694(str8);
                c3601.m6697(str11);
                c3601.m6683(i2);
                c3601.m6703(this.f77038);
                c3601.m6698(i11111);
                c3601.m6678(list);
                c3601.m6677(str);
                c3601.m6679(this.f76993);
                C10307 c10307M667118 = c3601.m6672();
                InterfaceC20790 interfaceC20790Mo573118 = interfaceC23116.mo5732(this.f77043, i6);
                this.f77022 = interfaceC20790Mo573118;
                interfaceC20790Mo573118.mo10503(c10307M667118);
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
                if (this.f77036 != null) {
                    str = c20545M46450.f63508;
                    str11 = "video/dolby-vision";
                }
                boolean z118 = this.f77005;
                if (this.f76995) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i11112 = (z118 ? 1 : 0) | i5;
                c3601 = new C3601();
                if (C11669.m26825(str11)) {
                    c3601.m6704(this.f77032);
                    c3601.m6688(this.f77013);
                    c3601.m6707(i3);
                    i6 = 1;
                } else {
                    if (C11669.m26816(str11)) {
                        if (this.f77002 == 0) {
                            i10 = this.f77034;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f76996;
                            }
                            this.f77034 = i10;
                            i11 = this.f76999;
                            if (i11 == -1) {
                                i11 = this.f77041;
                            }
                            this.f76999 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f77034;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f77011) {
                            if (this.f77033 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder118 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder118.put((byte) 0);
                                byteBufferOrder118.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) (this.f77020 + 0.5f));
                                byteBufferOrder118.putShort((short) (this.f77016 + 0.5f));
                                byteBufferOrder118.putShort((short) this.f77001);
                                byteBufferOrder118.putShort((short) this.f77021);
                            }
                            C8966 c8961113 = new C8966();
                            c8961113.m20709(this.f77039);
                            c8961113.m20708(this.f77008);
                            c8961113.m20711(this.f77014);
                            c8961113.m20707(bArr);
                            c8961113.m20710(this.f77017);
                            c8961113.m20706(this.f77017);
                            c22378M20705 = c8961113.m20705();
                        }
                        if (this.f77019 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f77015 == 0) {
                            if (Float.compare(this.f77009, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c3601.m6685(this.f76996);
                        c3601.m6689(this.f77041);
                        c3601.m6692(f);
                        c3601.m6671(iIntValue);
                        c3601.m6682(this.f77024);
                        c3601.m6710(this.f77003);
                        c3601.m6680(c22378M20705);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f77019 != null) {
                    c3601.m6705(this.f77019);
                }
                c3601.m6699(i);
                if (this.f77042) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c3601.m6694(str8);
                c3601.m6697(str11);
                c3601.m6683(i2);
                c3601.m6703(this.f77038);
                c3601.m6698(i11112);
                c3601.m6678(list);
                c3601.m6677(str);
                c3601.m6679(this.f76993);
                C10307 c10307M667119 = c3601.m6672();
                InterfaceC20790 interfaceC20790Mo573119 = interfaceC23116.mo5732(this.f77043, i6);
                this.f77022 = interfaceC20790Mo573119;
                interfaceC20790Mo573119.mo10503(c10307M667119);
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
                if (this.f77036 != null) {
                    str = c20545M46450.f63508;
                    str11 = "video/dolby-vision";
                }
                boolean z119 = this.f77005;
                if (this.f76995) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i11113 = (z119 ? 1 : 0) | i5;
                c3601 = new C3601();
                if (C11669.m26825(str11)) {
                    c3601.m6704(this.f77032);
                    c3601.m6688(this.f77013);
                    c3601.m6707(i3);
                    i6 = 1;
                } else {
                    if (C11669.m26816(str11)) {
                        if (this.f77002 == 0) {
                            i10 = this.f77034;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f76996;
                            }
                            this.f77034 = i10;
                            i11 = this.f76999;
                            if (i11 == -1) {
                                i11 = this.f77041;
                            }
                            this.f76999 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f77034;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f77011) {
                            if (this.f77033 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder119 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder119.put((byte) 0);
                                byteBufferOrder119.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) (this.f77020 + 0.5f));
                                byteBufferOrder119.putShort((short) (this.f77016 + 0.5f));
                                byteBufferOrder119.putShort((short) this.f77001);
                                byteBufferOrder119.putShort((short) this.f77021);
                            }
                            C8966 c8961114 = new C8966();
                            c8961114.m20709(this.f77039);
                            c8961114.m20708(this.f77008);
                            c8961114.m20711(this.f77014);
                            c8961114.m20707(bArr);
                            c8961114.m20710(this.f77017);
                            c8961114.m20706(this.f77017);
                            c22378M20705 = c8961114.m20705();
                        }
                        if (this.f77019 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f77015 == 0) {
                            if (Float.compare(this.f77009, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c3601.m6685(this.f76996);
                        c3601.m6689(this.f77041);
                        c3601.m6692(f);
                        c3601.m6671(iIntValue);
                        c3601.m6682(this.f77024);
                        c3601.m6710(this.f77003);
                        c3601.m6680(c22378M20705);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f77019 != null) {
                    c3601.m6705(this.f77019);
                }
                c3601.m6699(i);
                if (this.f77042) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c3601.m6694(str8);
                c3601.m6697(str11);
                c3601.m6683(i2);
                c3601.m6703(this.f77038);
                c3601.m6698(i11113);
                c3601.m6678(list);
                c3601.m6677(str);
                c3601.m6679(this.f76993);
                C10307 c10307M6671110 = c3601.m6672();
                InterfaceC20790 interfaceC20790Mo5731110 = interfaceC23116.mo5732(this.f77043, i6);
                this.f77022 = interfaceC20790Mo5731110;
                interfaceC20790Mo5731110.mo10503(c10307M6671110);
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
                if (this.f77036 != null) {
                    str = c20545M46450.f63508;
                    str11 = "video/dolby-vision";
                }
                boolean z1110 = this.f77005;
                if (this.f76995) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i11114 = (z1110 ? 1 : 0) | i5;
                c3601 = new C3601();
                if (C11669.m26825(str11)) {
                    c3601.m6704(this.f77032);
                    c3601.m6688(this.f77013);
                    c3601.m6707(i3);
                    i6 = 1;
                } else {
                    if (C11669.m26816(str11)) {
                        if (this.f77002 == 0) {
                            i10 = this.f77034;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f76996;
                            }
                            this.f77034 = i10;
                            i11 = this.f76999;
                            if (i11 == -1) {
                                i11 = this.f77041;
                            }
                            this.f76999 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f77034;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f77011) {
                            if (this.f77033 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder1110 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1110.put((byte) 0);
                                byteBufferOrder1110.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) (this.f77020 + 0.5f));
                                byteBufferOrder1110.putShort((short) (this.f77016 + 0.5f));
                                byteBufferOrder1110.putShort((short) this.f77001);
                                byteBufferOrder1110.putShort((short) this.f77021);
                            }
                            C8966 c8961115 = new C8966();
                            c8961115.m20709(this.f77039);
                            c8961115.m20708(this.f77008);
                            c8961115.m20711(this.f77014);
                            c8961115.m20707(bArr);
                            c8961115.m20710(this.f77017);
                            c8961115.m20706(this.f77017);
                            c22378M20705 = c8961115.m20705();
                        }
                        if (this.f77019 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f77015 == 0) {
                            if (Float.compare(this.f77009, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c3601.m6685(this.f76996);
                        c3601.m6689(this.f77041);
                        c3601.m6692(f);
                        c3601.m6671(iIntValue);
                        c3601.m6682(this.f77024);
                        c3601.m6710(this.f77003);
                        c3601.m6680(c22378M20705);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f77019 != null) {
                    c3601.m6705(this.f77019);
                }
                c3601.m6699(i);
                if (this.f77042) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c3601.m6694(str8);
                c3601.m6697(str11);
                c3601.m6683(i2);
                c3601.m6703(this.f77038);
                c3601.m6698(i11114);
                c3601.m6678(list);
                c3601.m6677(str);
                c3601.m6679(this.f76993);
                C10307 c10307M6671111 = c3601.m6672();
                InterfaceC20790 interfaceC20790Mo5731111 = interfaceC23116.mo5732(this.f77043, i6);
                this.f77022 = interfaceC20790Mo5731111;
                interfaceC20790Mo5731111.mo10503(c10307M6671111);
                return;
            case 32:
                str4 = "audio/flac";
                listM36873of2 = Collections.singletonList(m53646(this.f77023));
                str12 = str4;
                listM36873of = listM36873of2;
                str7 = null;
                list4 = listM36873of;
                str = str7;
                str2 = str12;
                i4 = -1;
                list2 = list4;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f77036 != null) {
                    str = c20545M46450.f63508;
                    str11 = "video/dolby-vision";
                }
                boolean z1111 = this.f77005;
                if (this.f76995) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i11115 = (z1111 ? 1 : 0) | i5;
                c3601 = new C3601();
                if (C11669.m26825(str11)) {
                    c3601.m6704(this.f77032);
                    c3601.m6688(this.f77013);
                    c3601.m6707(i3);
                    i6 = 1;
                } else {
                    if (C11669.m26816(str11)) {
                        if (this.f77002 == 0) {
                            i10 = this.f77034;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f76996;
                            }
                            this.f77034 = i10;
                            i11 = this.f76999;
                            if (i11 == -1) {
                                i11 = this.f77041;
                            }
                            this.f76999 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f77034;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f77011) {
                            if (this.f77033 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder1111 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1111.put((byte) 0);
                                byteBufferOrder1111.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) (this.f77020 + 0.5f));
                                byteBufferOrder1111.putShort((short) (this.f77016 + 0.5f));
                                byteBufferOrder1111.putShort((short) this.f77001);
                                byteBufferOrder1111.putShort((short) this.f77021);
                            }
                            C8966 c8961116 = new C8966();
                            c8961116.m20709(this.f77039);
                            c8961116.m20708(this.f77008);
                            c8961116.m20711(this.f77014);
                            c8961116.m20707(bArr);
                            c8961116.m20710(this.f77017);
                            c8961116.m20706(this.f77017);
                            c22378M20705 = c8961116.m20705();
                        }
                        if (this.f77019 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f77015 == 0) {
                            if (Float.compare(this.f77009, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c3601.m6685(this.f76996);
                        c3601.m6689(this.f77041);
                        c3601.m6692(f);
                        c3601.m6671(iIntValue);
                        c3601.m6682(this.f77024);
                        c3601.m6710(this.f77003);
                        c3601.m6680(c22378M20705);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f77019 != null) {
                    c3601.m6705(this.f77019);
                }
                c3601.m6699(i);
                if (this.f77042) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c3601.m6694(str8);
                c3601.m6697(str11);
                c3601.m6683(i2);
                c3601.m6703(this.f77038);
                c3601.m6698(i11115);
                c3601.m6678(list);
                c3601.m6677(str);
                c3601.m6679(this.f76993);
                C10307 c10307M6671112 = c3601.m6672();
                InterfaceC20790 interfaceC20790Mo5731112 = interfaceC23116.mo5732(this.f77043, i6);
                this.f77022 = interfaceC20790Mo5731112;
                interfaceC20790Mo5731112.mo10503(c10307M6671112);
                return;
            case 33:
                ArrayList arrayList3 = new ArrayList(3);
                arrayList3.add(m53646(this.f77023));
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                arrayList3.add(byteBufferAllocate.order(byteOrder).putLong(this.f77030).array());
                arrayList3.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.f77000).array());
                str2 = "audio/opus";
                str = null;
                i4 = 5760;
                list2 = arrayList3;
                str11 = str2;
                i2 = i4;
                list5 = list2;
                i3 = -1;
                list = list5;
                if (this.f77036 != null) {
                    str = c20545M46450.f63508;
                    str11 = "video/dolby-vision";
                }
                boolean z1112 = this.f77005;
                if (this.f76995) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                int i11116 = (z1112 ? 1 : 0) | i5;
                c3601 = new C3601();
                if (C11669.m26825(str11)) {
                    c3601.m6704(this.f77032);
                    c3601.m6688(this.f77013);
                    c3601.m6707(i3);
                    i6 = 1;
                } else {
                    if (C11669.m26816(str11)) {
                        if (this.f77002 == 0) {
                            i10 = this.f77034;
                            i7 = -1;
                            if (i10 == -1) {
                                i10 = this.f76996;
                            }
                            this.f77034 = i10;
                            i11 = this.f76999;
                            if (i11 == -1) {
                                i11 = this.f77041;
                            }
                            this.f76999 = i11;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f77034;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f77011) {
                            if (this.f77033 != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder1112 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1112.put((byte) 0);
                                byteBufferOrder1112.putShort((short) ((this.f77033 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f77031 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f77018 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f77029 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f77010 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f76998 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f76994 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.f77006 * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) (this.f77020 + 0.5f));
                                byteBufferOrder1112.putShort((short) (this.f77016 + 0.5f));
                                byteBufferOrder1112.putShort((short) this.f77001);
                                byteBufferOrder1112.putShort((short) this.f77021);
                            }
                            C8966 c8961117 = new C8966();
                            c8961117.m20709(this.f77039);
                            c8961117.m20708(this.f77008);
                            c8961117.m20711(this.f77014);
                            c8961117.m20707(bArr);
                            c8961117.m20710(this.f77017);
                            c8961117.m20706(this.f77017);
                            c22378M20705 = c8961117.m20705();
                        }
                        if (this.f77019 == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = -1;
                        }
                        if (this.f77015 == 0) {
                            if (Float.compare(this.f77009, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f77009, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f77009, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        c3601.m6685(this.f76996);
                        c3601.m6689(this.f77041);
                        c3601.m6692(f);
                        c3601.m6671(iIntValue);
                        c3601.m6682(this.f77024);
                        c3601.m6710(this.f77003);
                        c3601.m6680(c22378M20705);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str11)) {
                        }
                        i6 = 3;
                    }
                    break;
                }
                if (this.f77019 != null) {
                    c3601.m6705(this.f77019);
                }
                c3601.m6699(i);
                if (this.f77042) {
                    str8 = "video/webm";
                } else {
                    str8 = "video/x-matroska";
                }
                c3601.m6694(str8);
                c3601.m6697(str11);
                c3601.m6683(i2);
                c3601.m6703(this.f77038);
                c3601.m6698(i11116);
                c3601.m6678(list);
                c3601.m6677(str);
                c3601.m6679(this.f76993);
                C10307 c10307M6671113 = c3601.m6672();
                InterfaceC20790 interfaceC20790Mo5731113 = interfaceC23116.mo5732(this.f77043, i6);
                this.f77022 = interfaceC20790Mo5731113;
                interfaceC20790Mo5731113.mo10503(c10307M6671113);
                return;
            default:
                throw C10998.m25387("Unrecognized codec identifier.", (Throwable) null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    /* JADX INFO: renamed from: ֫ */
    private byte[] m53646(String str) throws C10998 {
        byte[] bArr = this.f77044;
        if (bArr != null) {
            return bArr;
        }
        throw C10998.m25387("Missing CodecPrivate for codec " + str, (Throwable) null);
    }
}
