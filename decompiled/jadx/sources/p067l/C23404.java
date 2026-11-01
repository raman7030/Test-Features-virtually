package p067l;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.᩹۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M8RW */
/* JADX INFO: loaded from: classes.dex */
public final class C23404 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f74551 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final HashMap f74552 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public static synchronized List m52069(String str, boolean z, boolean z2) {
        C2616 c2616 = new C2616(str, z, z2);
        HashMap map = f74552;
        List list = (List) map.get(c2616);
        if (list != null) {
            return list;
        }
        ArrayList arrayListM52068 = m52068(c2616, new C16697(z, z2, str.equals("video/mv-hevc")));
        if (z && arrayListM52068.isEmpty() && Build.VERSION.SDK_INT <= 23) {
            arrayListM52068 = m52068(c2616, new C9993());
            if (!arrayListM52068.isEmpty()) {
                C21334.m48351("MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((C18710) arrayListM52068.get(0)).f55902);
            }
        }
        m52071(str, arrayListM52068);
        AbstractC16192 abstractC16192CopyOf = AbstractC16192.copyOf((Collection) arrayListM52068);
        map.put(c2616, abstractC16192CopyOf);
        return abstractC16192CopyOf;
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    /* JADX INFO: renamed from: ֫ */
    public static List m52070(InterfaceC4629 interfaceC4629, C10307 c10307, boolean z, boolean z2) {
        List listMo9751;
        List listMo9752 = interfaceC4629.mo9751(c10307.f28528, z, z2);
        String strM52066 = m52066(c10307);
        if (strM52066 == null) {
            listMo9751 = AbstractC16192.m36872of();
        } else {
            listMo9751 = interfaceC4629.mo9751(strM52066, z, z2);
        }
        C4123 c4123 = new C4123();
        c4123.m18183(listMo9752);
        c4123.m18183(listMo9751);
        return c4123.m8329();
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m52067(List list, final C10307 c10307) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new C20052(new InterfaceC22734() { // from class: l.ۘ۟֫
            @Override // p067l.InterfaceC22734
            /* JADX INFO: renamed from: ֫ */
            public final int mo13383(Object obj) {
                return ((C18710) obj).m42699(c10307) ? 1 : 0;
            }
        }));
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m52066(C10307 c10307) {
        Pair pairM44014;
        String str = c10307.f28528;
        String str2 = c10307.f28528;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (pairM44014 = C19322.m44014(c10307)) != null) {
            int iIntValue = ((Integer) pairM44014.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0137 A[Catch: Exception -> 0x0187, TryCatch #4 {Exception -> 0x0187, blocks: (B:3:0x000a, B:5:0x001d, B:7:0x0027, B:77:0x0156, B:10:0x002e, B:14:0x0042, B:72:0x0131, B:74:0x0137, B:76:0x013d, B:78:0x0162, B:79:0x0185), top: B:92:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0162 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m52068(C2616 c2616, InterfaceC3287 interfaceC3287) throws C7311 {
        String str;
        String str2;
        String str3;
        int i;
        boolean z;
        int i2;
        boolean zIsHardwareAccelerated;
        boolean zIsVendor;
        String str4;
        C2616 c2617 = c2616;
        boolean z2 = c2617.f4323;
        String str5 = "tunneled-playback";
        try {
            ArrayList arrayList = new ArrayList();
            String str6 = c2617.f4322;
            boolean zMo5722 = interfaceC3287.mo5722();
            int i3 = 0;
            for (int iMo5718 = interfaceC3287.mo5718(); i3 < iMo5718; iMo5718 = i2) {
                MediaCodecInfo mediaCodecInfoMo5719 = interfaceC3287.mo5719(i3);
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 29 || !mediaCodecInfoMo5719.isAlias()) {
                    String name = mediaCodecInfoMo5719.getName();
                    if (m52073(mediaCodecInfoMo5719, name, zMo5722, str6)) {
                        String strM52065 = m52065(mediaCodecInfoMo5719, name, str6);
                        if (strM52065 == null) {
                            str = str5;
                        } else {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoMo5719.getCapabilitiesForType(strM52065);
                                boolean zMo5721 = interfaceC3287.mo5721(str5, strM52065, capabilitiesForType);
                                boolean zMo5720 = interfaceC3287.mo5720(str5, capabilitiesForType);
                                str = str5;
                                try {
                                    boolean z3 = c2617.f4324;
                                    if (z3 || !zMo5720) {
                                        if (!z3 || zMo5721) {
                                            boolean zMo5723 = interfaceC3287.mo5721("secure-playback", strM52065, capabilitiesForType);
                                            boolean zMo5724 = interfaceC3287.mo5720("secure-playback", capabilitiesForType);
                                            if (z2 || !zMo5724) {
                                                if (!z2 || zMo5723) {
                                                    if (i4 < 29) {
                                                        zIsHardwareAccelerated = !m52072(mediaCodecInfoMo5719, str6);
                                                    } else {
                                                        zIsHardwareAccelerated = mediaCodecInfoMo5719.isHardwareAccelerated();
                                                    }
                                                    boolean z4 = zIsHardwareAccelerated;
                                                    boolean zM52072 = m52072(mediaCodecInfoMo5719, str6);
                                                    if (i4 < 29) {
                                                        String strM37957 = C16726.m37957(mediaCodecInfoMo5719.getName());
                                                        zIsVendor = (strM37957.startsWith("omx.google.") || strM37957.startsWith("c2.android.") || strM37957.startsWith("c2.google.")) ? false : true;
                                                    } else {
                                                        zIsVendor = mediaCodecInfoMo5719.isVendor();
                                                    }
                                                    if (!(zMo5722 && z2 == zMo5723) && (zMo5722 || z2)) {
                                                        str2 = strM52065;
                                                        str4 = name;
                                                        i = i3;
                                                        z = zMo5722;
                                                        i2 = iMo5718;
                                                        if (!z && zMo5723) {
                                                            StringBuilder sb = new StringBuilder();
                                                            try {
                                                                sb.append(str4);
                                                                sb.append(".secure");
                                                                str3 = str4;
                                                                try {
                                                                    arrayList.add(C18710.m42691(sb.toString(), str6, str2, capabilitiesForType, z4, zM52072, zIsVendor, true));
                                                                    break;
                                                                } catch (Exception e) {
                                                                    e = e;
                                                                    if (Build.VERSION.SDK_INT <= 23) {
                                                                    }
                                                                    C21334.m48347("Failed to query codec " + str3 + " (" + str2 + MotionUtils.EASING_TYPE_FORMAT_END);
                                                                    throw e;
                                                                }
                                                            } catch (Exception e2) {
                                                                e = e2;
                                                                str3 = str4;
                                                            }
                                                        }
                                                    } else {
                                                        str2 = strM52065;
                                                        str4 = name;
                                                        i = i3;
                                                        z = zMo5722;
                                                        i2 = iMo5718;
                                                        try {
                                                            arrayList.add(C18710.m42691(name, str6, strM52065, capabilitiesForType, z4, zM52072, zIsVendor, false));
                                                        } catch (Exception e3) {
                                                            e = e3;
                                                            str3 = str4;
                                                            if (Build.VERSION.SDK_INT <= 23 || arrayList.isEmpty()) {
                                                                C21334.m48347("Failed to query codec " + str3 + " (" + str2 + MotionUtils.EASING_TYPE_FORMAT_END);
                                                                throw e;
                                                            }
                                                            C21334.m48347("Skipping codec " + str3 + " (failed to query capabilities)");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    str2 = strM52065;
                                    str3 = name;
                                    i = i3;
                                    z = zMo5722;
                                    i2 = iMo5718;
                                    if (Build.VERSION.SDK_INT <= 23) {
                                    }
                                    C21334.m48347("Failed to query codec " + str3 + " (" + str2 + MotionUtils.EASING_TYPE_FORMAT_END);
                                    throw e;
                                }
                            } catch (Exception e5) {
                                e = e5;
                                str = str5;
                            }
                            i3 = i + 1;
                            c2617 = c2616;
                            str5 = str;
                            zMo5722 = z;
                        }
                    }
                    i = i3;
                    z = zMo5722;
                    i2 = iMo5718;
                    i3 = i + 1;
                    c2617 = c2616;
                    str5 = str;
                    zMo5722 = z;
                }
                str = str5;
                i = i3;
                z = zMo5722;
                i2 = iMo5718;
                i3 = i + 1;
                c2617 = c2616;
                str5 = str;
                zMo5722 = z;
            }
            return arrayList;
        } catch (Exception e6) {
            throw new C7311("Failed to query underlying media codecs", e6);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m52065(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m52073(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z && str.endsWith(".secure")) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && ManufacturerUtils.SAMSUNG.equals(Build.MANUFACTURER))) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52071(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((C18710) arrayList.get(0)).f55902.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(C18710.m42691("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new C20052(new C20723()));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((C18710) arrayList.get(0)).f55902)) {
            return;
        }
        arrayList.add((C18710) arrayList.remove(0));
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m52072(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT < 29) {
            if (C11669.m26825(str)) {
                return true;
            }
            String strM37957 = C16726.m37957(mediaCodecInfo.getName());
            if (strM37957.startsWith("arc.")) {
                return false;
            }
            if (strM37957.startsWith("omx.google.") || strM37957.startsWith("omx.ffmpeg.")) {
                return true;
            }
            if ((strM37957.startsWith("omx.sec.") && strM37957.contains(".sw.")) || strM37957.equals("omx.qcom.video.decoder.hevcswvdec") || strM37957.startsWith("c2.android.") || strM37957.startsWith("c2.google.")) {
                return true;
            }
            return (strM37957.startsWith("omx.") || strM37957.startsWith("c2.")) ? false : true;
        }
        return mediaCodecInfo.isSoftwareOnly();
    }
}
