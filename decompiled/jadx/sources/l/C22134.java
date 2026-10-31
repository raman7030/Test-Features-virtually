package l;

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
public final class C22134 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f71829 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final HashMap f71830 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized List m49731(String str, boolean z, boolean z2) {
        C0261 c0261 = new C0261(str, z, z2);
        HashMap map = f71830;
        List list = (List) map.get(c0261);
        if (list != null) {
            return list;
        }
        ArrayList arrayListM49730 = m49730(c0261, new C15077(z, z2, str.equals("video/mv-hevc")));
        if (z && arrayListM49730.isEmpty() && Build.VERSION.SDK_INT <= 23) {
            arrayListM49730 = m49730(c0261, new C8023());
            if (!arrayListM49730.isEmpty()) {
                C19956.m46037("MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((C17195) arrayListM49730.get(0)).f52721);
            }
        }
        m49733(str, arrayListM49730);
        AbstractC14545 abstractC14545CopyOf = AbstractC14545.copyOf((Collection) arrayListM49730);
        map.put(c0261, abstractC14545CopyOf);
        return abstractC14545CopyOf;
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m49732(InterfaceC2379 interfaceC2379, C8353 c8353, boolean z, boolean z2) {
        List listMo7690;
        List listMo7691 = interfaceC2379.mo7690(c8353.f25614, z, z2);
        String strM49728 = m49728(c8353);
        if (strM49728 == null) {
            listMo7690 = AbstractC14545.of();
        } else {
            listMo7690 = interfaceC2379.mo7690(strM49728, z, z2);
        }
        C1846 c1846 = new C1846();
        c1846.m16263(listMo7691);
        c1846.m16263(listMo7690);
        return c1846.m6131();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m49729(List list, final C8353 c8353) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new C18607(new InterfaceC21429() { // from class: l.ۘ۟֫
            @Override // l.InterfaceC21429
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final int mo11447(Object obj) {
                return ((C17195) obj).m40453(c8353) ? 1 : 0;
            }
        }));
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m49728(C8353 c8353) {
        Pair pairM41768;
        String str = c8353.f25614;
        String str2 = c8353.f25614;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (pairM41768 = C17839.m41768(c8353)) != null) {
            int iIntValue = ((Integer) pairM41768.first).intValue();
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m49730(C0261 c0261, InterfaceC0967 interfaceC0967) throws C5201 {
        String str;
        String str2;
        String str3;
        int i;
        boolean z;
        int i2;
        boolean zIsHardwareAccelerated;
        boolean zIsVendor;
        String str4;
        C0261 c0262 = c0261;
        boolean z2 = c0262.f1545;
        String str5 = "tunneled-playback";
        try {
            ArrayList arrayList = new ArrayList();
            String str6 = c0262.f1544;
            boolean zMo3419 = interfaceC0967.mo3419();
            int i3 = 0;
            for (int iMo3415 = interfaceC0967.mo3415(); i3 < iMo3415; iMo3415 = i2) {
                MediaCodecInfo mediaCodecInfoMo3416 = interfaceC0967.mo3416(i3);
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 29 || !mediaCodecInfoMo3416.isAlias()) {
                    String name = mediaCodecInfoMo3416.getName();
                    if (m49735(mediaCodecInfoMo3416, name, zMo3419, str6)) {
                        String strM49727 = m49727(mediaCodecInfoMo3416, name, str6);
                        if (strM49727 == null) {
                            str = str5;
                        } else {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoMo3416.getCapabilitiesForType(strM49727);
                                boolean zMo3418 = interfaceC0967.mo3418(str5, strM49727, capabilitiesForType);
                                boolean zMo3417 = interfaceC0967.mo3417(str5, capabilitiesForType);
                                str = str5;
                                try {
                                    boolean z3 = c0262.f1546;
                                    if (z3 || !zMo3417) {
                                        if (!z3 || zMo3418) {
                                            boolean zMo34110 = interfaceC0967.mo3418("secure-playback", strM49727, capabilitiesForType);
                                            boolean zMo34111 = interfaceC0967.mo3417("secure-playback", capabilitiesForType);
                                            if (z2 || !zMo34111) {
                                                if (!z2 || zMo34110) {
                                                    if (i4 < 29) {
                                                        zIsHardwareAccelerated = !m49734(mediaCodecInfoMo3416, str6);
                                                    } else {
                                                        zIsHardwareAccelerated = mediaCodecInfoMo3416.isHardwareAccelerated();
                                                    }
                                                    boolean z4 = zIsHardwareAccelerated;
                                                    boolean zM49734 = m49734(mediaCodecInfoMo3416, str6);
                                                    if (i4 < 29) {
                                                        String strM35799 = C15107.m35799(mediaCodecInfoMo3416.getName());
                                                        zIsVendor = (strM35799.startsWith("omx.google.") || strM35799.startsWith("c2.android.") || strM35799.startsWith("c2.google.")) ? false : true;
                                                    } else {
                                                        zIsVendor = mediaCodecInfoMo3416.isVendor();
                                                    }
                                                    if (!(zMo3419 && z2 == zMo34110) && (zMo3419 || z2)) {
                                                        str2 = strM49727;
                                                        str4 = name;
                                                        i = i3;
                                                        z = zMo3419;
                                                        i2 = iMo3415;
                                                        if (!z && zMo34110) {
                                                            StringBuilder sb = new StringBuilder();
                                                            try {
                                                                sb.append(str4);
                                                                sb.append(".secure");
                                                                str3 = str4;
                                                                try {
                                                                    arrayList.add(C17195.m40445(sb.toString(), str6, str2, capabilitiesForType, z4, zM49734, zIsVendor, true));
                                                                    break;
                                                                } catch (Exception e) {
                                                                    e = e;
                                                                    if (Build.VERSION.SDK_INT <= 23) {
                                                                    }
                                                                    C19956.m46033("Failed to query codec " + str3 + " (" + str2 + MotionUtils.EASING_TYPE_FORMAT_END);
                                                                    throw e;
                                                                }
                                                            } catch (Exception e2) {
                                                                e = e2;
                                                                str3 = str4;
                                                            }
                                                        }
                                                    } else {
                                                        str2 = strM49727;
                                                        str4 = name;
                                                        i = i3;
                                                        z = zMo3419;
                                                        i2 = iMo3415;
                                                        try {
                                                            arrayList.add(C17195.m40445(name, str6, strM49727, capabilitiesForType, z4, zM49734, zIsVendor, false));
                                                        } catch (Exception e3) {
                                                            e = e3;
                                                            str3 = str4;
                                                            if (Build.VERSION.SDK_INT <= 23 || arrayList.isEmpty()) {
                                                                C19956.m46033("Failed to query codec " + str3 + " (" + str2 + MotionUtils.EASING_TYPE_FORMAT_END);
                                                                throw e;
                                                            }
                                                            C19956.m46033("Skipping codec " + str3 + " (failed to query capabilities)");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    str2 = strM49727;
                                    str3 = name;
                                    i = i3;
                                    z = zMo3419;
                                    i2 = iMo3415;
                                    if (Build.VERSION.SDK_INT <= 23) {
                                    }
                                    C19956.m46033("Failed to query codec " + str3 + " (" + str2 + MotionUtils.EASING_TYPE_FORMAT_END);
                                    throw e;
                                }
                            } catch (Exception e5) {
                                e = e5;
                                str = str5;
                            }
                            i3 = i + 1;
                            c0262 = c0261;
                            str5 = str;
                            zMo3419 = z;
                        }
                    }
                    i = i3;
                    z = zMo3419;
                    i2 = iMo3415;
                    i3 = i + 1;
                    c0262 = c0261;
                    str5 = str;
                    zMo3419 = z;
                }
                str = str5;
                i = i3;
                z = zMo3419;
                i2 = iMo3415;
                i3 = i + 1;
                c0262 = c0261;
                str5 = str;
                zMo3419 = z;
            }
            return arrayList;
        } catch (Exception e6) {
            throw new C5201("Failed to query underlying media codecs", e6);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m49727(MediaCodecInfo mediaCodecInfo, String str, String str2) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m49735(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49733(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((C17195) arrayList.get(0)).f52721.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(C17195.m40445("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new C18607(new C19313()));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((C17195) arrayList.get(0)).f52721)) {
            return;
        }
        arrayList.add((C17195) arrayList.remove(0));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m49734(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT < 29) {
            if (C9786.m24810(str)) {
                return true;
            }
            String strM35799 = C15107.m35799(mediaCodecInfo.getName());
            if (strM35799.startsWith("arc.")) {
                return false;
            }
            if (strM35799.startsWith("omx.google.") || strM35799.startsWith("omx.ffmpeg.")) {
                return true;
            }
            if ((strM35799.startsWith("omx.sec.") && strM35799.contains(".sw.")) || strM35799.equals("omx.qcom.video.decoder.hevcswvdec") || strM35799.startsWith("c2.android.") || strM35799.startsWith("c2.google.")) {
                return true;
            }
            return (strM35799.startsWith("omx.") || strM35799.startsWith("c2.")) ? false : true;
        }
        return mediaCodecInfo.isSoftwareOnly();
    }
}
