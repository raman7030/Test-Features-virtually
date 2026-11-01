package p067l;

import android.text.TextUtils;
import com.alipay.sdk.p010m.p058y.C0254q;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.i18n.TextBundle;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: renamed from: l.ۢ᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U8ON */
/* JADX INFO: loaded from: classes3.dex */
public final class C11669 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f32550 = 0;

    /* JADX INFO: renamed from: ܽ */
    public static final ArrayList f32552 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public static final Pattern f32551 = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: renamed from: ֫ */
    public static String m26811(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case C0254q.f1216f /* 99 */:
            case 100:
            case 101:
                return "video/mpeg2";
            case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
            case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
            case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                return "audio/mp4a-latm";
            case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
            case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                return "audio/mpeg";
            case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public static boolean m26825(String str) {
        return "audio".equals(m26823(str));
    }

    /* JADX INFO: renamed from: ۢ */
    public static boolean m26816(String str) {
        return "video".equals(m26823(str));
    }

    @Pure
    /* JADX INFO: renamed from: ᩷ */
    public static boolean m26824(String str) {
        return TextBundle.TEXT_ENTRY.equals(m26823(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* JADX INFO: renamed from: ۜ */
    public static boolean m26814(String str) {
        return "image".equals(m26823(str)) || "application/x-image-uri".equals(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m26813(String str, String str2) {
        C22398 c22398M26821;
        int iM50308;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/ac3":
            case "audio/raw":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (c22398M26821 = m26821(str2)) == null || (iM50308 = c22398M26821.m50308()) == 0 || iM50308 == 16) ? false : true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public static String m26819(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : C5792.m13028(str)) {
            String strM26817 = m26817(str2);
            if (strM26817 != null && m26816(strM26817)) {
                return strM26817;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m26818(String str, String str2) {
        if (str != null && str2 != null) {
            String[] strArrM13028 = C5792.m13028(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : strArrM13028) {
                if (str2.equals(m26817(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m26812(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : C5792.m13028(str)) {
            String strM26817 = m26817(str2);
            if (strM26817 != null && m26825(strM26817)) {
                return strM26817;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m26817(String str) {
        C22398 c22398M26821;
        String strM26811 = null;
        if (str == null) {
            return null;
        }
        String strM37957 = C16726.m37957(str.trim());
        if (strM37957.startsWith("avc1") || strM37957.startsWith("avc3")) {
            return "video/avc";
        }
        if (strM37957.startsWith("hev1") || strM37957.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strM37957.startsWith("dvav") || strM37957.startsWith("dva1") || strM37957.startsWith("dvhe") || strM37957.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strM37957.startsWith("av01")) {
            return "video/av01";
        }
        if (strM37957.startsWith("vp9") || strM37957.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strM37957.startsWith("vp8") || strM37957.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strM37957.startsWith("mp4a")) {
            if (strM37957.startsWith("mp4a.") && (c22398M26821 = m26821(strM37957)) != null) {
                strM26811 = m26811(c22398M26821.f70667);
            }
            return strM26811 == null ? "audio/mp4a-latm" : strM26811;
        }
        if (strM37957.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (strM37957.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (strM37957.startsWith("ac-3") || strM37957.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (strM37957.startsWith("ec-3") || strM37957.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (strM37957.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (strM37957.startsWith("ac-4") || strM37957.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (strM37957.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (strM37957.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (strM37957.startsWith("dtsh") || strM37957.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (strM37957.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (strM37957.startsWith("opus")) {
            return "audio/opus";
        }
        if (strM37957.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (strM37957.startsWith("flac")) {
            return "audio/flac";
        }
        if (strM37957.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (strM37957.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (strM37957.contains("cea708")) {
            return "application/cea-708";
        }
        if (strM37957.contains("eia608") || strM37957.contains("cea608")) {
            return "application/cea-608";
        }
        ArrayList arrayList = f32552;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C8986) arrayList.get(i)).getClass();
            if (strM37957.startsWith(null)) {
                break;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܿ */
    public static int m26822(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m26825(str)) {
            return 1;
        }
        if (m26816(str)) {
            return 2;
        }
        if (m26824(str)) {
            return 3;
        }
        if (m26814(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f32552;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C8986) arrayList.get(i)).getClass();
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m26820(String str, String str2) {
        C22398 c22398M26821;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (c22398M26821 = m26821(str2)) == null) {
                    return 0;
                }
                return c22398M26821.m50308();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: ۡ */
    public static String m26815(String str) {
        if (str == null) {
            return null;
        }
        String strM37957 = C16726.m37957(str);
        strM37957.getClass();
        switch (strM37957) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strM37957;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static String m26823(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    /* JADX INFO: renamed from: ܽ */
    public static C22398 m26821(String str) {
        Matcher matcher = f32551.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new C22398(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
