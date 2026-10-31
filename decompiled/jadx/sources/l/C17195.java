package l;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;

/* JADX INFO: renamed from: l.ܿ۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 38M9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17195 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f52718;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f52719;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f52720;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String f52721;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String f52722;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final MediaCodecInfo.CodecCapabilities f52723;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f52724;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f52725;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f52726;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f52727;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f52728;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f52729;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f52730;

    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17195 m40445(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
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
        return new C17195(str, str2, str3, codecCapabilities, z, z2, z3, z5, z7, z6);
    }

    public C17195(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.f52721 = str;
        this.f52722 = str2;
        this.f52726 = str3;
        this.f52723 = codecCapabilities;
        this.f52727 = z;
        this.f52719 = z2;
        this.f52718 = z4;
        this.f52725 = z5;
        this.f52728 = z6;
        this.f52724 = C9786.m24801(str2);
        this.f52730 = -3.4028235E38f;
        this.f52729 = -1;
        this.f52720 = -1;
    }

    public final String toString() {
        return this.f52721;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40453(C8353 c8353) {
        String str = c8353.f25614;
        String str2 = this.f52722;
        return (str2.equals(str) || str2.equals(C22134.m49728(c8353))) && m40448(c8353, false) && m40449(c8353);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m40454(C8353 c8353) {
        int i;
        int i2;
        String str = c8353.f25614;
        String str2 = this.f52722;
        if ((!str2.equals(str) && !str2.equals(C22134.m49728(c8353))) || !m40448(c8353, true) || !m40449(c8353)) {
            return false;
        }
        if (this.f52724) {
            int i3 = c8353.f25633;
            if (i3 > 0 && (i2 = c8353.f25609) > 0) {
                return m40452(i3, i2, c8353.f25596);
            }
        } else {
            int i4 = c8353.f25624;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f52723;
            if (i4 != -1) {
                if (codecCapabilities == null) {
                    m40446("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    m40446("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i4)) {
                    m40446(C19370.m44628(i4, "sampleRate.support, "));
                    return false;
                }
            }
            int i5 = c8353.f25625;
            if (i5 != -1) {
                if (codecCapabilities == null) {
                    m40446("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    m40446("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i = 6;
                    } else {
                        i = "audio/eac3".equals(str2) ? 16 : 30;
                    }
                    C19956.m46037("AssumedMaxChannelAdjustment: " + this.f52721 + ", [" + maxInputChannelCount + " to " + i + "]");
                    maxInputChannelCount = i;
                }
                if (maxInputChannelCount < i5) {
                    m40446(C19370.m44628(i5, "channelCount.support, "));
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m40448(C8353 c8353, boolean z) {
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
        int i3 = C22134.f71829;
        Pair pairM41768 = C17839.m41768(c8353);
        String str2 = c8353.f25614;
        String str3 = this.f52726;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String strM24800 = C9786.m24800(str3);
            if (!strM24800.equals("video/mv-hevc")) {
                if (strM24800.equals("video/hevc")) {
                    String strM38882 = C16509.m38882(c8353.f25634);
                    if (strM38882 == null) {
                        pairM41768 = null;
                    } else {
                        String strTrim = strM38882.trim();
                        String str4 = C3603.f11424;
                        pairM41768 = C17839.m41767(strM38882, strTrim.split("\\.", -1), c8353.f25637);
                    }
                }
                if (pairM41768 != null) {
                    iIntValue = ((Integer) pairM41768.first).intValue();
                    iIntValue2 = ((Integer) pairM41768.second).intValue();
                    zEquals = "video/dolby-vision".equals(str2);
                    i = 8;
                    str = this.f52722;
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
                    if (this.f52724) {
                        codecCapabilities = this.f52723;
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
                        m40446(C23202.m51498(new StringBuilder("codec.profileLevel, "), c8353.f25619, ", ", str3));
                        return false;
                    }
                    codecCapabilities = this.f52723;
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
                    m40446(C23202.m51498(new StringBuilder("codec.profileLevel, "), c8353.f25619, ", ", str3));
                    return false;
                }
            }
        } else if (pairM41768 != null) {
            iIntValue = ((Integer) pairM41768.first).intValue();
            iIntValue2 = ((Integer) pairM41768.second).intValue();
            zEquals = "video/dolby-vision".equals(str2);
            i = 8;
            str = this.f52722;
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
                throw new UnsupportedOperationException("Method not decompiled: l.C17195.m40448(l.۠ᩴ֫, boolean):boolean");
            }

            /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
            private boolean m40449(C8353 c8353) {
                return (C11003.equals(c8353.f25614, "audio/flac") && c8353.f25605 == 22 && Build.VERSION.SDK_INT < 34 && this.f52721.equals("c2.android.flac.decoder")) ? false : true;
            }

            /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
            public final boolean m40455(C8353 c8353) {
                if (this.f52724) {
                    return this.f52718;
                }
                int i = C22134.f71829;
                Pair pairM41768 = C17839.m41768(c8353);
                return pairM41768 != null && ((Integer) pairM41768.first).intValue() == 42;
            }

            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final C13396 m40451(C8353 c8353, C8353 c8354) {
                int i;
                String str = c8353.f25614;
                C21054 c21054 = c8353.f25637;
                String str2 = c8354.f25614;
                C21054 c21055 = c8354.f25637;
                int i2 = !C11003.equals(str, str2) ? 8 : 0;
                if (this.f52724) {
                    if (c8353.f25599 != c8354.f25599) {
                        i2 |= 1024;
                    }
                    boolean z = (c8353.f25633 == c8354.f25633 && c8353.f25609 == c8354.f25609) ? false : true;
                    if (!this.f52718 && z) {
                        i2 |= 512;
                    }
                    if ((!C21054.m47894(c21054) || !C21054.m47894(c21055)) && !C11003.equals(c21054, c21055)) {
                        i2 |= 2048;
                    }
                    if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f52721) && !c8353.m21950(c8354)) {
                        i2 |= 2;
                    }
                    int i3 = c8353.f25600;
                    if (i3 != -1 && (i = c8353.f25622) != -1 && i3 == c8354.f25600 && i == c8354.f25622 && z) {
                        i2 |= 2;
                    }
                    if (i2 == 0) {
                        return new C13396(this.f52721, c8353, c8354, c8353.m21950(c8354) ? 3 : 2, 0);
                    }
                } else {
                    if (c8353.f25625 != c8354.f25625) {
                        i2 |= 4096;
                    }
                    if (c8353.f25624 != c8354.f25624) {
                        i2 |= 8192;
                    }
                    if (c8353.f25605 != c8354.f25605) {
                        i2 |= 16384;
                    }
                    String str3 = this.f52722;
                    if (i2 == 0 && "audio/mp4a-latm".equals(str3)) {
                        int i4 = C22134.f71829;
                        Pair pairM41768 = C17839.m41768(c8353);
                        Pair pairM41769 = C17839.m41768(c8354);
                        if (pairM41768 != null && pairM41769 != null) {
                            int iIntValue = ((Integer) pairM41768.first).intValue();
                            int iIntValue2 = ((Integer) pairM41769.first).intValue();
                            if (iIntValue == 42 && iIntValue2 == 42) {
                                return new C13396(this.f52721, c8353, c8354, 3, 0);
                            }
                        }
                    }
                    if (!c8353.m21950(c8354)) {
                        i2 |= 32;
                    }
                    if ("audio/opus".equals(str3)) {
                        i2 |= 2;
                    }
                    if (i2 == 0) {
                        return new C13396(this.f52721, c8353, c8354, 1, 0);
                    }
                }
                return new C13396(this.f52721, c8353, c8354, 0, i2);
            }

            /* JADX WARN: Code duplicated, block: B:20:0x0044 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:21:0x0046  */
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final boolean m40452(int i, int i2, double d) {
                String str;
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.f52723;
                if (codecCapabilities == null) {
                    m40446("sizeAndRate.caps");
                    return false;
                }
                MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
                if (videoCapabilities == null) {
                    m40446("sizeAndRate.vCaps");
                    return false;
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    int iM52003 = C23545.m52003(videoCapabilities, i, i2, d);
                    if (iM52003 != 2) {
                        if (iM52003 == 1) {
                            StringBuilder sbM46682 = C20361.m46682("sizeAndRate.cover, ", i, "x", "@", i2);
                            sbM46682.append(d);
                            m40446(sbM46682.toString());
                            return false;
                        }
                        if (!m40447(videoCapabilities, i, i2, d)) {
                            if (i < i2) {
                                str = this.f52721;
                                if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                                    StringBuilder sbM46683 = C20361.m46682("sizeAndRate.rotated, ", i, "x", "@", i2);
                                    sbM46683.append(d);
                                    StringBuilder sbM10501 = C3435.m10501("AssumedSupport [", sbM46683.toString(), "] [", str, ", ");
                                    sbM10501.append(this.f52722);
                                    sbM10501.append("] [");
                                    sbM10501.append(C3603.f11424);
                                    sbM10501.append("]");
                                    C19956.m46031(sbM10501.toString());
                                    return true;
                                }
                                StringBuilder sbM46684 = C20361.m46682("sizeAndRate.rotated, ", i, "x", "@", i2);
                                sbM46684.append(d);
                                StringBuilder sbM10502 = C3435.m10501("AssumedSupport [", sbM46684.toString(), "] [", str, ", ");
                                sbM10502.append(this.f52722);
                                sbM10502.append("] [");
                                sbM10502.append(C3603.f11424);
                                sbM10502.append("]");
                                C19956.m46031(sbM10502.toString());
                                return true;
                            }
                            StringBuilder sbM46685 = C20361.m46682("sizeAndRate.support, ", i, "x", "@", i2);
                            sbM46685.append(d);
                            m40446(sbM46685.toString());
                            return false;
                        }
                    }
                } else if (!m40447(videoCapabilities, i, i2, d)) {
                    if (i < i2) {
                        str = this.f52721;
                        if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && m40447(videoCapabilities, i2, i, d)) {
                            StringBuilder sbM46686 = C20361.m46682("sizeAndRate.rotated, ", i, "x", "@", i2);
                            sbM46686.append(d);
                            StringBuilder sbM10503 = C3435.m10501("AssumedSupport [", sbM46686.toString(), "] [", str, ", ");
                            sbM10503.append(this.f52722);
                            sbM10503.append("] [");
                            sbM10503.append(C3603.f11424);
                            sbM10503.append("]");
                            C19956.m46031(sbM10503.toString());
                            return true;
                        }
                    }
                    StringBuilder sbM46687 = C20361.m46682("sizeAndRate.support, ", i, "x", "@", i2);
                    sbM46687.append(d);
                    m40446(sbM46687.toString());
                    return false;
                }
                return true;
            }

            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final float m40450(int i, int i2) {
                if (!this.f52724) {
                    return -3.4028235E38f;
                }
                float f = this.f52730;
                if (f != -3.4028235E38f && this.f52729 == i && this.f52720 == i2) {
                    return f;
                }
                float f2 = 1024.0f;
                if (!m40452(i, i2, 1024.0f)) {
                    float f3 = 0.0f;
                    while (true) {
                        float f4 = f2 - f3;
                        if (Math.abs(f4) <= 5.0f) {
                            break;
                        }
                        float f5 = (f4 / 2.0f) + f3;
                        if (m40452(i, i2, f5)) {
                            f3 = f5;
                        } else {
                            f2 = f5;
                        }
                    }
                    f2 = f3;
                }
                this.f52730 = f2;
                this.f52729 = i;
                this.f52720 = i2;
                return f2;
            }

            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            private void m40446(String str) {
                StringBuilder sbM9834 = C3200.m9834("NoSupport [", str, "] [");
                sbM9834.append(this.f52721);
                sbM9834.append(", ");
                sbM9834.append(this.f52722);
                sbM9834.append("] [");
                sbM9834.append(C3603.f11424);
                sbM9834.append("]");
                C19956.m46031(sbM9834.toString());
            }

            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public static boolean m40447(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
                Range<Double> achievableFrameRatesFor;
                int widthAlignment = videoCapabilities.getWidthAlignment();
                int heightAlignment = videoCapabilities.getHeightAlignment();
                Point point = new Point(C3603.m10999(i, widthAlignment) * widthAlignment, C3603.m10999(i2, heightAlignment) * heightAlignment);
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
