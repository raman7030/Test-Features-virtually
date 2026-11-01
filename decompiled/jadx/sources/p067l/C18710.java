package p067l;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;

/* JADX INFO: renamed from: l.ܿ۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 38M9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18710 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f55899;

    /* JADX INFO: renamed from: ۖ */
    public final boolean f55900;

    /* JADX INFO: renamed from: ۜ */
    public int f55901;

    /* JADX INFO: renamed from: ۡ */
    public final String f55902;

    /* JADX INFO: renamed from: ۢ */
    public final String f55903;

    /* JADX INFO: renamed from: ۧ */
    public final MediaCodecInfo.CodecCapabilities f55904;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f55905;

    /* JADX INFO: renamed from: ܺ */
    public final boolean f55906;

    /* JADX INFO: renamed from: ܽ */
    public final String f55907;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f55908;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f55909;

    /* JADX INFO: renamed from: ᩷ */
    public int f55910;

    /* JADX INFO: renamed from: ᩻ */
    public float f55911;

    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX INFO: renamed from: ֫ */
    public static C18710 m42691(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        if (codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            if (Build.VERSION.SDK_INT <= 22) {
                String str4 = Build.MODEL;
                z5 = (("ODROID-XU3".equals(str4) || "Nexus 10".equals(str4)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) ? false : true;
            }
        }
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z7 = z4 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Build.VERSION.SDK_INT < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface")) {
            z6 = false;
        } else {
            String str5 = Build.MANUFACTURER;
            if (str5.equals("Xiaomi") || str5.equals("OPPO") || str5.equals("realme") || str5.equals("motorola") || str5.equals("LENOVO")) {
                z6 = false;
            } else {
                z6 = true;
            }
        }
        return new C18710(str, str2, str3, codecCapabilities, z, z2, z3, z5, z7, z6);
    }

    public C18710(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.f55902 = str;
        this.f55903 = str2;
        this.f55907 = str3;
        this.f55904 = codecCapabilities;
        this.f55908 = z;
        this.f55900 = z2;
        this.f55899 = z4;
        this.f55906 = z5;
        this.f55909 = z6;
        this.f55905 = C11669.m26816(str2);
        this.f55911 = -3.4028235E38f;
        this.f55910 = -1;
        this.f55901 = -1;
    }

    public final String toString() {
        return this.f55902;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m42699(C10307 c10307) {
        String str = c10307.f28528;
        String str2 = this.f55903;
        return (str2.equals(str) || str2.equals(C23404.m52066(c10307))) && m42694(c10307, false) && m42695(c10307);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m42700(C10307 c10307) {
        int i;
        int i2;
        String str = c10307.f28528;
        String str2 = this.f55903;
        if ((!str2.equals(str) && !str2.equals(C23404.m52066(c10307))) || !m42694(c10307, true) || !m42695(c10307)) {
            return false;
        }
        if (this.f55905) {
            int i3 = c10307.f28547;
            if (i3 > 0 && (i2 = c10307.f28523) > 0) {
                return m42698(i3, i2, c10307.f28510);
            }
        } else {
            int i4 = c10307.f28538;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f55904;
            if (i4 != -1) {
                if (codecCapabilities == null) {
                    m42692("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    m42692("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i4)) {
                    m42692(C20778.m46922(i4, "sampleRate.support, "));
                    return false;
                }
            }
            int i5 = c10307.f28539;
            if (i5 != -1) {
                if (codecCapabilities == null) {
                    m42692("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    m42692("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i = 6;
                    } else {
                        i = "audio/eac3".equals(str2) ? 16 : 30;
                    }
                    C21334.m48351("AssumedMaxChannelAdjustment: " + this.f55902 + ", [" + maxInputChannelCount + " to " + i + "]");
                    maxInputChannelCount = i;
                }
                if (maxInputChannelCount < i5) {
                    m42692(C20778.m46922(i5, "channelCount.support, "));
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x015e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:22:0x0073  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Code duplicated, block: B:30:0x0087  */
    /* JADX WARN: Code duplicated, block: B:33:0x0090  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:74:0x0100  */
    /* JADX WARN: Code duplicated, block: B:76:0x0105  */
    /* JADX WARN: Code duplicated, block: B:77:0x0108  */
    /* JADX WARN: Code duplicated, block: B:79:0x010d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0110  */
    /* JADX WARN: Code duplicated, block: B:83:0x0116  */
    /* JADX WARN: Code duplicated, block: B:85:0x011b  */
    /* JADX WARN: Code duplicated, block: B:86:0x011d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0122  */
    /* JADX WARN: Code duplicated, block: B:89:0x0124  */
    /* JADX WARN: Code duplicated, block: B:93:0x0136  */
    /* JADX WARN: Code duplicated, block: B:95:0x013c  */
    /* JADX INFO: renamed from: ֫ */
    private boolean m42694(C10307 c10307, boolean z) {
        int iIntValue;
        int iIntValue2;
        boolean zEquals;
        int i;
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int length;
        int i2;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel;
        int iIntValue3;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i3 = C23404.f74551;
        Pair pairM44014 = C19322.m44014(c10307);
        String str2 = c10307.f28528;
        String str3 = this.f55907;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String strM26815 = C11669.m26815(str3);
            if (!strM26815.equals("video/mv-hevc")) {
                if (strM26815.equals("video/hevc")) {
                    String strM41108 = C18058.m41108(c10307.f28548);
                    if (strM41108 == null) {
                        pairM44014 = null;
                    } else {
                        String strTrim = strM41108.trim();
                        String str4 = C5792.f14228;
                        pairM44014 = C19322.m44013(strM41108, strTrim.split("\\.", -1), c10307.f28551);
                    }
                }
                if (pairM44014 != null) {
                    iIntValue = ((Integer) pairM44014.first).intValue();
                    iIntValue2 = ((Integer) pairM44014.second).intValue();
                    zEquals = "video/dolby-vision".equals(str2);
                    i = 8;
                    str = this.f55903;
                    if (zEquals) {
                        str.getClass();
                        switch (str) {
                            case "video/av01":
                            case "video/hevc":
                                iIntValue2 = 0;
                                iIntValue = 2;
                                break;
                            case "video/avc":
                                iIntValue2 = 0;
                                iIntValue = 8;
                                break;
                        }
                    }
                    if (this.f55905) {
                        codecCapabilities = this.f55904;
                        if (codecCapabilities != null) {
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                        } else {
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                        }
                        if (Build.VERSION.SDK_INT <= 23) {
                            if (codecCapabilities != null) {
                                iIntValue3 = 0;
                            } else {
                                iIntValue3 = 0;
                            }
                            if (iIntValue3 >= 180000000) {
                                i = 1024;
                            } else if (iIntValue3 >= 120000000) {
                                i = 512;
                            } else if (iIntValue3 >= 60000000) {
                                i = 256;
                            } else if (iIntValue3 >= 30000000) {
                                i = 128;
                            } else if (iIntValue3 >= 18000000) {
                                i = 64;
                            } else if (iIntValue3 >= 12000000) {
                                i = 32;
                            } else if (iIntValue3 >= 7200000) {
                                i = 16;
                            } else if (iIntValue3 < 3600000) {
                                if (iIntValue3 >= 1800000) {
                                    i = 4;
                                } else if (iIntValue3 >= 800000) {
                                    i = 2;
                                } else {
                                    i = 1;
                                }
                            }
                            MediaCodecInfo.CodecProfileLevel codecProfileLevel2 = new MediaCodecInfo.CodecProfileLevel();
                            codecProfileLevel2.profile = 1;
                            codecProfileLevel2.level = i;
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel2};
                        }
                        length = codecProfileLevelArr.length;
                        for (i2 = 0; i2 < length; i2++) {
                            codecProfileLevel = codecProfileLevelArr[i2];
                            if (codecProfileLevel.profile != iIntValue) {
                            }
                        }
                        m42692(C24420.m53894(new StringBuilder("codec.profileLevel, "), c10307.f28533, ", ", str3));
                        return false;
                    }
                    codecCapabilities = this.f55904;
                    if (codecCapabilities != null) {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    } else {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    }
                    if (Build.VERSION.SDK_INT <= 23) {
                        if (codecCapabilities != null) {
                            iIntValue3 = 0;
                        } else {
                            iIntValue3 = 0;
                        }
                        if (iIntValue3 >= 180000000) {
                            i = 1024;
                        } else if (iIntValue3 >= 120000000) {
                            i = 512;
                        } else if (iIntValue3 >= 60000000) {
                            i = 256;
                        } else if (iIntValue3 >= 30000000) {
                            i = 128;
                        } else if (iIntValue3 >= 18000000) {
                            i = 64;
                        } else if (iIntValue3 >= 12000000) {
                            i = 32;
                        } else if (iIntValue3 >= 7200000) {
                            i = 16;
                        } else if (iIntValue3 < 3600000) {
                            if (iIntValue3 >= 1800000) {
                                i = 4;
                            } else if (iIntValue3 >= 800000) {
                                i = 2;
                            } else {
                                i = 1;
                            }
                        }
                        MediaCodecInfo.CodecProfileLevel codecProfileLevel3 = new MediaCodecInfo.CodecProfileLevel();
                        codecProfileLevel3.profile = 1;
                        codecProfileLevel3.level = i;
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel3};
                    }
                    length = codecProfileLevelArr.length;
                    while (i2 < length) {
                        codecProfileLevel = codecProfileLevelArr[i2];
                        if (codecProfileLevel.profile != iIntValue) {
                        }
                    }
                    m42692(C24420.m53894(new StringBuilder("codec.profileLevel, "), c10307.f28533, ", ", str3));
                    return false;
                }
            }
        } else if (pairM44014 != null) {
            iIntValue = ((Integer) pairM44014.first).intValue();
            iIntValue2 = ((Integer) pairM44014.second).intValue();
            zEquals = "video/dolby-vision".equals(str2);
            i = 8;
            str = this.f55903;
            if (zEquals) {
                str.getClass();
                switch (str) {
                    case -1662735862:
                        if (str.equals("video/av01")) {
                        }
                        break;
                    case -1662541442:
                        if (str.equals("video/hevc")) {
                        }
                        break;
                    case 1331836730:
                        if (str.equals("video/avc")) {
                        }
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:235)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    */
                /*
                    Method dump skipped, instruction units count: 396
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p067l.C18710.m42694(l.۠ᩴ֫, boolean):boolean");
            }

            /* JADX INFO: renamed from: ᩳ */
            private boolean m42695(C10307 c10307) {
                return (C12826.equals(c10307.f28528, "audio/flac") && c10307.f28519 == 22 && Build.VERSION.SDK_INT < 34 && this.f55902.equals("c2.android.flac.decoder")) ? false : true;
            }

            /* JADX INFO: renamed from: ܽ */
            public final boolean m42701(C10307 c10307) {
                if (this.f55905) {
                    return this.f55899;
                }
                int i = C23404.f74551;
                Pair pairM44014 = C19322.m44014(c10307);
                return pairM44014 != null && ((Integer) pairM44014.first).intValue() == 42;
            }

            /* JADX INFO: renamed from: ֫ */
            public final C15100 m42697(C10307 c10307, C10307 c10308) {
                int i;
                String str = c10307.f28528;
                C22378 c22378 = c10307.f28551;
                String str2 = c10308.f28528;
                C22378 c22379 = c10308.f28551;
                int i2 = !C12826.equals(str, str2) ? 8 : 0;
                if (this.f55905) {
                    if (c10307.f28513 != c10308.f28513) {
                        i2 |= 1024;
                    }
                    boolean z = (c10307.f28547 == c10308.f28547 && c10307.f28523 == c10308.f28523) ? false : true;
                    if (!this.f55899 && z) {
                        i2 |= 512;
                    }
                    if ((!C22378.m50224(c22378) || !C22378.m50224(c22379)) && !C12826.equals(c22378, c22379)) {
                        i2 |= 2048;
                    }
                    if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f55902) && !c10307.m23920(c10308)) {
                        i2 |= 2;
                    }
                    int i3 = c10307.f28514;
                    if (i3 != -1 && (i = c10307.f28536) != -1 && i3 == c10308.f28514 && i == c10308.f28536 && z) {
                        i2 |= 2;
                    }
                    if (i2 == 0) {
                        return new C15100(this.f55902, c10307, c10308, c10307.m23920(c10308) ? 3 : 2, 0);
                    }
                } else {
                    if (c10307.f28539 != c10308.f28539) {
                        i2 |= 4096;
                    }
                    if (c10307.f28538 != c10308.f28538) {
                        i2 |= 8192;
                    }
                    if (c10307.f28519 != c10308.f28519) {
                        i2 |= 16384;
                    }
                    String str3 = this.f55903;
                    if (i2 == 0 && "audio/mp4a-latm".equals(str3)) {
                        int i4 = C23404.f74551;
                        Pair pairM44014 = C19322.m44014(c10307);
                        Pair pairM44015 = C19322.m44014(c10308);
                        if (pairM44014 != null && pairM44015 != null) {
                            int iIntValue = ((Integer) pairM44014.first).intValue();
                            int iIntValue2 = ((Integer) pairM44015.first).intValue();
                            if (iIntValue == 42 && iIntValue2 == 42) {
                                return new C15100(this.f55902, c10307, c10308, 3, 0);
                            }
                        }
                    }
                    if (!c10307.m23920(c10308)) {
                        i2 |= 32;
                    }
                    if ("audio/opus".equals(str3)) {
                        i2 |= 2;
                    }
                    if (i2 == 0) {
                        return new C15100(this.f55902, c10307, c10308, 1, 0);
                    }
                }
                return new C15100(this.f55902, c10307, c10308, 0, i2);
            }

            /* JADX WARN: Code duplicated, block: B:20:0x0044 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:21:0x0046  */
            /* JADX INFO: renamed from: ֫ */
            public final boolean m42698(int i, int i2, double d) {
                String str;
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.f55904;
                if (codecCapabilities == null) {
                    m42692("sizeAndRate.caps");
                    return false;
                }
                MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
                if (videoCapabilities == null) {
                    m42692("sizeAndRate.vCaps");
                    return false;
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    int iM54405 = C24745.m54405(videoCapabilities, i, i2, d);
                    if (iM54405 != 2) {
                        if (iM54405 == 1) {
                            StringBuilder sbM49005 = C21720.m49005("sizeAndRate.cover, ", i, "x", "@", i2);
                            sbM49005.append(d);
                            m42692(sbM49005.toString());
                            return false;
                        }
                        if (!m42693(videoCapabilities, i, i2, d)) {
                            if (i < i2) {
                                str = this.f55902;
                                if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                                    StringBuilder sbM49006 = C21720.m49005("sizeAndRate.rotated, ", i, "x", "@", i2);
                                    sbM49006.append(d);
                                    StringBuilder sbM12525 = C5633.m12525("AssumedSupport [", sbM49006.toString(), "] [", str, ", ");
                                    sbM12525.append(this.f55903);
                                    sbM12525.append("] [");
                                    sbM12525.append(C5792.f14228);
                                    sbM12525.append("]");
                                    C21334.m48345(sbM12525.toString());
                                    return true;
                                }
                                StringBuilder sbM49007 = C21720.m49005("sizeAndRate.rotated, ", i, "x", "@", i2);
                                sbM49007.append(d);
                                StringBuilder sbM12526 = C5633.m12525("AssumedSupport [", sbM49007.toString(), "] [", str, ", ");
                                sbM12526.append(this.f55903);
                                sbM12526.append("] [");
                                sbM12526.append(C5792.f14228);
                                sbM12526.append("]");
                                C21334.m48345(sbM12526.toString());
                                return true;
                            }
                            StringBuilder sbM49008 = C21720.m49005("sizeAndRate.support, ", i, "x", "@", i2);
                            sbM49008.append(d);
                            m42692(sbM49008.toString());
                            return false;
                        }
                    }
                } else if (!m42693(videoCapabilities, i, i2, d)) {
                    if (i < i2) {
                        str = this.f55902;
                        if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && m42693(videoCapabilities, i2, i, d)) {
                            StringBuilder sbM49009 = C21720.m49005("sizeAndRate.rotated, ", i, "x", "@", i2);
                            sbM49009.append(d);
                            StringBuilder sbM12527 = C5633.m12525("AssumedSupport [", sbM49009.toString(), "] [", str, ", ");
                            sbM12527.append(this.f55903);
                            sbM12527.append("] [");
                            sbM12527.append(C5792.f14228);
                            sbM12527.append("]");
                            C21334.m48345(sbM12527.toString());
                            return true;
                        }
                    }
                    StringBuilder sbM490010 = C21720.m49005("sizeAndRate.support, ", i, "x", "@", i2);
                    sbM490010.append(d);
                    m42692(sbM490010.toString());
                    return false;
                }
                return true;
            }

            /* JADX INFO: renamed from: ֫ */
            public final float m42696(int i, int i2) {
                if (!this.f55905) {
                    return -3.4028235E38f;
                }
                float f = this.f55911;
                if (f != -3.4028235E38f && this.f55910 == i && this.f55901 == i2) {
                    return f;
                }
                float f2 = 1024.0f;
                if (!m42698(i, i2, 1024.0f)) {
                    float f3 = 0.0f;
                    while (true) {
                        float f4 = f2 - f3;
                        if (Math.abs(f4) <= 5.0f) {
                            break;
                        }
                        float f5 = (f4 / 2.0f) + f3;
                        if (m42698(i, i2, f5)) {
                            f3 = f5;
                        } else {
                            f2 = f5;
                        }
                    }
                    f2 = f3;
                }
                this.f55911 = f2;
                this.f55910 = i;
                this.f55901 = i2;
                return f2;
            }

            /* JADX INFO: renamed from: ֫ */
            private void m42692(String str) {
                StringBuilder sbM11879 = C5410.m11879("NoSupport [", str, "] [");
                sbM11879.append(this.f55902);
                sbM11879.append(", ");
                sbM11879.append(this.f55903);
                sbM11879.append("] [");
                sbM11879.append(C5792.f14228);
                sbM11879.append("]");
                C21334.m48345(sbM11879.toString());
            }

            /* JADX INFO: renamed from: ֫ */
            public static boolean m42693(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
                Range<Double> achievableFrameRatesFor;
                int widthAlignment = videoCapabilities.getWidthAlignment();
                int heightAlignment = videoCapabilities.getHeightAlignment();
                Point point = new Point(C5792.m12975(i, widthAlignment) * widthAlignment, C5792.m12975(i2, heightAlignment) * heightAlignment);
                int i3 = point.x;
                int i4 = point.y;
                if (d == -1.0d || d < 1.0d) {
                    return videoCapabilities.isSizeSupported(i3, i4);
                }
                double dFloor = Math.floor(d);
                if (videoCapabilities.areSizeAndRateSupported(i3, i4, dFloor)) {
                    return Build.VERSION.SDK_INT < 24 || (achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4)) == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
                }
                return false;
            }
        }
