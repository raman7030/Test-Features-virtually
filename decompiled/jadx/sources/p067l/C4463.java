package p067l;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import bin.p000mt.json.JSONObject;
import bin.p000mt.plus.Main;
import com.umeng.analytics.pro.C0655am;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: B13Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C4463 {

    /* JADX INFO: renamed from: ۡ */
    public static long f10018;

    /* JADX INFO: renamed from: ܺ */
    public static long f10021;

    /* JADX INFO: renamed from: ֫ */
    public C13851 f10024;

    /* JADX INFO: renamed from: ۧ */
    public C11169 f10025;

    /* JADX INFO: renamed from: ܽ */
    public C21265 f10026;

    /* JADX INFO: renamed from: ܿ */
    public String f10027;

    /* JADX INFO: renamed from: ᩳ */
    public List f10028;

    /* JADX INFO: renamed from: ܳ */
    public static final HashMap f10020 = new HashMap();

    /* JADX INFO: renamed from: ᩻ */
    public static final HashMap f10023 = new HashMap();

    /* JADX INFO: renamed from: ۜ */
    public static final HashMap f10017 = new HashMap();

    /* JADX INFO: renamed from: ᩷ */
    public static final C13259 f10022 = C13259.m30304("\\.(?:00[1-9]|0[1-9][0-9]|[1-9][0-9]{2})");

    /* JADX INFO: renamed from: ۢ */
    public static final C13259 f10019 = C13259.m30304("\\.z(?:0[1-9]|[1-9][0-9]+)");

    static {
        m9375(".xml", 1, "text/xml");
        m9375(".kml", 1, "text/kml");
        m9375(".dex", 3, "application/octet-stream");
        m9375(".arsc", 2, "application/octet-stream");
        m9375(".mtp", 8, "application/mt-plugin");
        m9375(".apk", 4, "application/vnd.android.package-archive");
        m9375(".apk.1", 4, "application/vnd.android.package-archive");
        m9375(".apex", 4, "application/vnd.android.package-archive");
        m9375(".bks", 7, "application/bks");
        m9375(".jks", 7, "application/jks");
        m9375(".keystore", 7, "application/jks");
        m9375(".apks", 5, "application/vnd.android.package-archives");
        m9375(".xapk", 5, "application/vnd.android.package-archives");
        m9375(".apkm", 5, "application/vnd.android.package-archives");
        m9375(".sh", 12, "application/x-sh");
        m9375(".rc", 12, "application/x-rc");
        m9375(".zip", 6, "application/zip");
        m9375(".aab", 6, "application/zip");
        m9375(".mtz", 6, "application/zip");
        m9375(".hwt", 6, "application/zip");
        m9375(".bds", 6, "application/zip");
        m9375(".jar", 16, "application/x-jar", "application/java-archive", "application/x-java-archive");
        m9375(".ttf", 13, "application/x-font-ttf");
        m9375(".ttc", 13, "application/x-font-ttc");
        m9375(".otf", 13, "application/x-font-otf");
        m9375(".woff", 13, "application/x-font-woff");
        m9375(".plist", 1, "text/plist");
        m9375(".class", 17, "application/octet-stream");
        m9375(".mtcr", 18, "application/octet-stream");
        m9375(".iml", 9, "text/xml");
        m9375(".mtd", 9, "text/plain");
        m9375(".mtl", 9, "text/plain");
        m9375(".mtsx", 9, "text/plain");
        m9375(".m3u", 9, "text/plain");
        m9375(".mf", 9, "text/plain");
        m9375(".md", 9, "text/plain");
        m9375(".sf", 9, "text/plain");
        m9375(".txt", 9, "text/plain");
        m9375(".log", 9, "text/plain");
        m9375(".css", 9, "text/plain");
        m9375(".cfg", 9, "text/plain");
        m9375(".ini", 9, "text/plain");
        m9375(".conf", 9, "text/plain");
        m9375(".prop", 9, "text/plain");
        m9375(".json", 9, "text/plain");
        m9375(".properties", 9, "text/plain");
        C21265 c21265 = C21265.f66827;
        m9374(".htm", 21, c21265, "text/html");
        m9374(".html", 21, c21265, "text/html");
        m9374(".xhtml", 21, c21265, "application/xhtml+xml");
        m9374(".shtml", 21, c21265, "text/html");
        m9374(".mhtml", 21, c21265, "multipart/related");
        m9374(".mht", 21, c21265, "multipart/related");
        C21265 c21266 = C21265.f66878;
        m9374(".c", 9, c21266, "text/plain");
        m9374(".h", 9, c21266, "text/plain");
        m9374(".js", 9, c21266, "text/plain");
        m9374(".py", 9, C21265.f66860, "text/plain");
        m9374(".cc", 9, c21266, "text/plain");
        m9374(".go", 9, c21266, "text/plain");
        m9374(".kt", 9, C21265.f66879, "text/plain");
        m9374(".bat", 9, c21266, "text/plain");
        m9374(".php", 9, C21265.f66874, "text/plain");
        m9374(".cpp", 9, c21266, "text/plain");
        m9374(".hpp", 9, c21266, "text/plain");
        m9374(".lua", 9, C21265.f66819, "text/plain");
        m9374(".java", 9, C21265.f66843, "text/plain");
        m9374(".smali", 9, c21266, "text/plain");
        m9374(".yml", 9, c21266, "text/plain");
        m9374(".yaml", 9, c21266, "text/plain");
        m9374(".rs", 9, c21266, "text/plain");
        C21265 c21267 = C21265.f66870;
        m9374(".zshrc", 9, c21267, "text/plain");
        m9374(".bashrc", 9, c21267, "text/plain");
        m9374(".bash_history", 9, c21266, "text/plain");
        C21265 c21268 = C21265.f66844;
        m9374(".csv", 9, c21268, "text/csv");
        C21265 c21269 = C21265.f66876;
        m9374(".ass", 9, c21269, "text/x-ssa");
        m9374(".ssa", 9, c21269, "text/x-ssa");
        m9374(".srt", 9, c21269, "application/x-subrip");
        m9374(".vtt", 9, c21269, "text/vtt");
        m9374(".ttml", 9, c21269, "application/ttml+xml");
        m9375(".jpeg", 10, "image/jpeg");
        m9375(".jpg", 10, "image/jpeg");
        m9375(".bmp", 10, "image/bmp");
        m9375(".gif", 10, "image/gif");
        m9375(".ico", 10, "image/x-icon");
        m9375(".png", 10, "image/png");
        m9375(".webp", 10, "image/webp");
        m9375(".heic", 10, "image/heic");
        m9375(".heif", 10, "image/heif");
        m9375(".svg", 15, "image/svg+xml");
        m9375(".9.png", 10, "image/png");
        m9375(".tga", 10, "image/tga");
        m9375(".m4a", 11, "audio/mp4a-latm");
        m9375(".m4b", 11, "audio/mp4a-latm");
        m9375(".m4p", 11, "audio/mp4a-latm");
        m9375(".mp2", 11, "audio/x-mpeg");
        m9375(".mp3", 11, "audio/x-mpeg");
        m9375(".mpga", 11, "audio/mpeg");
        m9375(".ogg", 11, "audio/ogg");
        m9375(".wav", 11, "audio/x-wav");
        m9375(".wma", 11, "audio/x-ms-wma");
        m9375(".flac", 11, "audio/*");
        m9375(".amr", 11, "audio/amr");
        m9375(".mid", 11, "audio/midi");
        m9375(".midi", 11, "audio/midi");
        m9375(".oga", 11, "audio/ogg");
        m9375(".aac", 11, "audio/aac");
        m9375(".rpm", 11, "audio/vnd.rn-realaudio");
        m9375(".weba", 11, "audio/webm");
        m9375(".3gp", 20, "video/3gpp");
        m9375(".asf", 20, "video/x-ms-asf");
        m9375(".avi", 20, "video/x-msvideo");
        m9375(".mp4", 20, "video/mp4");
        m9375(".mpe", 20, "video/mpeg");
        m9375(".mpeg", 20, "video/mpeg");
        m9375(".mpg", 20, "video/mpeg");
        m9375(".mpg4", 20, "video/mp4");
        m9375(".m4u", 20, "video/vnd.mpegurl");
        m9375(".m3u8", 20, "video/vnd.mpegurl", "application/x-mpegurl", "application/vnd.apple.mpegurl");
        m9375(".m4v", 20, "video/x-m4v");
        m9375(".mov", 20, "video/quicktime");
        m9375(".rmvb", 20, "video/vnd.rn-realvideo");
        m9375(".wmv", 20, "video/x-ms-wmv");
        m9375(".3gpp", 20, "video/3gpp");
        m9375(".flv", 20, "video/x-flv");
        m9375(".ogv", 20, "video/ogg");
        m9375(".mkv", 20, "video/x-matroska");
        m9375(".dv", 20, "video/x-dv");
        m9375(".webm", 20, "video/webm");
        m9375(".7z", 6, "application/x-7z-compressed");
        m9375(".deb", 6, "application/vnd.debian.binary-package");
        m9375(".arj", 6, "application/arj");
        m9375(".cab", 6, "application/vnd.ms-cab-compressed");
        m9375(".chm", 6, "application/vnd.ms-htmlhelp");
        m9375(".cpio", 6, "application/x-cpio", "application/cpio");
        m9375(".iso", 6, "application/iso");
        m9375(".lzh", 6, "application/lzh");
        m9375(".lzma", 6, "application/lzma");
        m9375(".rar", 6, "application/x-rar-compressed");
        m9375(".wim", 6, "application/wim");
        m9375(".xar", 6, "application/xar");
        m9375(".ntfs", 6, "application/ntfs");
        m9375(".udf", 6, "application/udf");
        m9375(".z", 6, "application/z");
        m9375(".zl", 6, "application/zlib");
        m9375(".zli", 6, "application/zlib");
        m9375(".zlib", 6, "application/zlib");
        m9375(".tar", 6, "application/x-tar", "application/tar");
        m9375(".gz", 6, "application/x-gzip", "application/gzip");
        m9375(".tar.gz", 6, "application/x-gzip", "application/gzip");
        m9375(".tgz", 6, "application/x-gzip", "application/gzip");
        m9375(".taz", 6, "application/x-gzip", "application/gzip");
        m9375(".xz", 6, "application/x-xz", "application/xz");
        m9375(".tar.xz", 6, "application/x-xz", "application/xz");
        m9375(".txz", 6, "application/x-xz", "application/xz");
        m9375(".zst", 6, "application/zstd");
        m9375(".zstd", 6, "application/zstd");
        m9375(".tar.zst", 6, "application/zstd");
        m9375(".tar.zstd", 6, "application/zstd");
        m9375(".bz2", 6, "application/x-bzip2", "application/bzip2");
        m9375(".tar.bz2", 6, "application/x-bzip2", "application/bzip2");
        m9375(".tbz2", 6, "application/x-bzip2", "application/bzip2");
        m9375(".tbz", 6, "application/x-bzip2", "application/bzip2");
        m9375(".lz4", 6, "application/x-lz4", "application/lz4");
        m9375(".tar.lz4", 6, "application/x-lz4", "application/lz4");
        m9378(".pdf", C21265.f66834, "application/pdf");
        C21265 c212610 = C21265.f66842;
        m9378(".ppt", c212610, "application/vnd.ms-powerpoint");
        m9378(".xls", c21268, "application/vnd.ms-excel");
        m9378(".doc", c21269, "application/msword");
        m9378(".pptx", c212610, "application/vnd.ms-powerpoint");
        m9378(".xlsx", c21268, "application/vnd.ms-excel");
        m9378(".docx", c21269, "application/msword");
        C21265 c212611 = C21265.f66855;
        m9378(".odex", c212611, "application/oat");
        m9378(".oat", c212611, "application/oat");
        m9378(".torrent", C21265.f66829, "application/x-bittorrent");
        m9375(".ts-movie", 20, "video/MP2T");
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m9383(String str) {
        return (String) m9371(str, true).f10028.get(0);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0089  */
    /* JADX INFO: renamed from: ֫ */
    public static C4463 m9371(String str, boolean z) {
        String lowerCase = str.toLowerCase();
        String strM38645 = AbstractC17043.m38645(lowerCase);
        if (strM38645.isEmpty()) {
            return new C4463("", null, null, "*/*");
        }
        if (System.currentTimeMillis() - f10018 > 10000) {
            long jMo25091 = C17853.m40542().m38684("openMethod").mo25091();
            if (jMo25091 != f10021) {
                m9382();
                f10021 = jMo25091;
            }
            f10018 = System.currentTimeMillis();
        }
        char cM21911 = C9417.m21911(1, strM38645);
        if ('0' <= cM21911 && cM21911 <= '9') {
            if (f10022.matcher((CharSequence) strM38645).matches()) {
                if (lowerCase.endsWith(".7z".concat(strM38645))) {
                    strM38645 = ".7z";
                } else if (lowerCase.endsWith(".zip".concat(strM38645))) {
                    strM38645 = ".zip";
                }
            } else if (f10019.matcher((CharSequence) strM38645).matches()) {
                strM38645 = ".zip";
            }
        }
        C4463 c4463 = z ? (C4463) f10023.get(strM38645) : null;
        if (c4463 == null) {
            c4463 = (C4463) f10017.get(strM38645);
        }
        if (c4463 == null) {
            c4463 = (C4463) f10020.get(strM38645);
        }
        if (c4463 == null) {
            return new C4463(strM38645, strM38645.equals(".img") ? C21265.f66877 : null, null, "*/*");
        }
        return c4463;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9380(boolean z) {
        Main mainM38753;
        C11245 c11245M130;
        C0977 c0977 = new C0977();
        Iterator it = C11721.m26923().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C16689) it.next()).m37820().iterator();
            while (it2.hasNext()) {
                String lowerCase = ((String) it2.next()).toLowerCase();
                if (!f10020.containsKey(lowerCase) && !c0977.containsKey(lowerCase)) {
                    c0977.put(lowerCase, new C4463(lowerCase, C11169.m25783(9)));
                }
            }
        }
        HashMap map = f10017;
        map.clear();
        map.putAll(c0977);
        if (!z || (mainM38753 = C17127.m38753()) == null || (c11245M130 = mainM38753.m130()) == null) {
            return;
        }
        C7050.m16212(new RunnableC22099(2, c11245M130.m26079()));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9377(String str, C11169 c11169) {
        String lowerCase = str.toLowerCase();
        C4463 c4463 = new C4463(lowerCase, c11169);
        c4463.m9385();
        f10023.put(lowerCase, c4463);
        m9381();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9376(String str, InterfaceC7796 interfaceC7796) {
        String lowerCase = str.toLowerCase();
        C4463 c4463 = new C4463(lowerCase, new C13851(interfaceC7796.mo10963(), interfaceC7796.mo10961(), interfaceC7796.mo10959()));
        c4463.m9385();
        f10023.put(lowerCase, c4463);
        m9381();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9379(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4463 c4463 = (C4463) it.next();
            c4463.m9385();
            f10023.put(c4463.f10027, c4463);
        }
        m9381();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m9384(ArrayList arrayList) {
        HashMap map = f10023;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            m9386(((C4463) it.next()).f10027).mo25503();
        }
        map.clear();
        m9379(arrayList);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m9387(String str) {
        String lowerCase = str.toLowerCase();
        m9386(lowerCase).mo25503();
        f10023.remove(lowerCase);
        m9381();
    }

    /* JADX INFO: renamed from: ᩷ */
    public static ArrayList m9388() {
        m9382();
        ArrayList arrayList = new ArrayList(f10023.values());
        Collections.sort(arrayList, C10162.comparing(new C10498(0)));
        return arrayList;
    }

    public C4463(String str, C21265 c21265, C11169 c11169, String... strArr) {
        this.f10027 = str;
        this.f10026 = c21265;
        this.f10025 = c11169;
        this.f10028 = Arrays.asList(strArr);
    }

    public C4463(String str, C11169 c11169) {
        String str2;
        this.f10027 = str;
        C4463 c4463 = (C4463) f10020.get(str);
        if (c4463 != null) {
            this.f10028 = c4463.f10028;
            if (c11169 == c4463.f10025) {
                this.f10026 = c4463.f10026;
            }
        } else {
            int i = c11169.f31006;
            switch (i) {
                case 1:
                    str2 = "text/xml";
                    break;
                case 2:
                case 3:
                case 8:
                case 13:
                case 14:
                case 17:
                case 18:
                    str2 = "application/octet-stream";
                    break;
                case 4:
                    str2 = "application/vnd.android.package-archive";
                    break;
                case 5:
                    str2 = "application/vnd.android.package-archives";
                    break;
                case 6:
                    str2 = "application/zip";
                    break;
                case 7:
                    str2 = "application/jks";
                    break;
                case 9:
                case 12:
                    str2 = "text/plain";
                    break;
                case 10:
                    str2 = "image/*";
                    break;
                case 11:
                    str2 = "audio/*";
                    break;
                case 15:
                    str2 = "image/svg+xml";
                    break;
                case 16:
                    str2 = "application/x-jar";
                    break;
                case 19:
                    str2 = "image/png";
                    break;
                case 20:
                    str2 = "video/*";
                    break;
                case 21:
                    str2 = "text/html";
                    break;
                default:
                    throw new RuntimeException(C20778.m46922(i, "Unknown built-in function type: "));
            }
            this.f10028 = Collections.singletonList(str2);
        }
        this.f10025 = c11169;
    }

    public C4463(String str, C13851 c13851) {
        this.f10027 = str;
        C4463 c4463 = (C4463) f10020.get(str);
        if (c4463 != null) {
            this.f10028 = c4463.f10028;
            this.f10026 = c4463.m9396();
        } else {
            this.f10028 = Collections.singletonList("*/*");
        }
        this.f10024 = c13851;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m9398() {
        return this.f10027;
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m9394() {
        return (String) this.f10028.get(0);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C11169 m9397() {
        return this.f10025;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m9393() {
        C11169 c11169 = this.f10025;
        return c11169 != null && c11169.f31006 == 5;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m9391(int... iArr) {
        C11169 c11169 = this.f10025;
        if (c11169 != null) {
            int i = c11169.f31006;
            if (i == 6) {
                return true;
            }
            for (int i2 : iArr) {
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C13851 m9395() {
        return this.f10024;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C21265 m9396() {
        C21265 c21265 = this.f10026;
        if (c21265 != null) {
            return c21265;
        }
        C11169 c11169 = this.f10025;
        if (c11169 != null) {
            return c11169.m25784();
        }
        return C21265.f66829;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9389(C18107 c18107, InterfaceC19370 interfaceC19370) {
        C11169 c11169 = this.f10025;
        if (c11169 != null) {
            c11169.m25785(c18107, interfaceC19370);
        } else {
            this.f10024.m31528(c18107, interfaceC19370);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m9390() {
        if (this.f10025 != null) {
            return true;
        }
        C13851 c13851 = this.f10024;
        if (c13851 != null) {
            try {
                ComponentName componentNameMo10963 = c13851.mo10963();
                String packageName = componentNameMo10963.getPackageName();
                String strM9368 = m9368(componentNameMo10963.getClassName(), packageName);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage(packageName);
                AbstractC17043 abstractC17043M38684 = C17853.f53287.m38684("test" + this.f10027);
                PackageManager packageManagerM16217 = C7050.m16217();
                intent.setDataAndType(abstractC17043M38684.m38667(), "*/*");
                Iterator<ResolveInfo> it = packageManagerM16217.queryIntentActivities(intent, 65536).iterator();
                while (it.hasNext()) {
                    ActivityInfo activityInfo = it.next().activityInfo;
                    if (strM9368.equals(m9368(activityInfo.name, activityInfo.packageName))) {
                        return true;
                    }
                }
                intent.setDataAndType(abstractC17043M38684.m38680(), "*/*");
                Iterator<ResolveInfo> it2 = packageManagerM16217.queryIntentActivities(intent, 65536).iterator();
                while (it2.hasNext()) {
                    ActivityInfo activityInfo2 = it2.next().activityInfo;
                    if (strM9368.equals(m9368(activityInfo2.name, activityInfo2.packageName))) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m9368(String str, String str2) {
        return str.startsWith(".") ? C17588.m40053(str2, str) : str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4463 m9372(AbstractC17043 abstractC17043, String str) throws IOException {
        C14677 c14677M38686 = abstractC17043.m38686();
        C23395.m52060((InterfaceC21384) c14677M38686, 1935831681);
        int i = c14677M38686.readByte() & 255;
        if (i == 0) {
            return new C4463(str, new C13851(new ComponentName(c14677M38686.m33591(), c14677M38686.m33591()), c14677M38686.m33585(), c14677M38686.m33585()));
        }
        if (i >= 1 && i <= 21) {
            return new C4463(str, C11169.m25783(i));
        }
        throw new IOException();
    }

    /* JADX INFO: renamed from: ܺ */
    private void m9385() {
        C11996 c11996M45308 = C19965.m45308(1935831681);
        C11169 c11169 = this.f10025;
        if (c11169 != null) {
            c11996M45308.writeByte(c11169.f31006);
        } else {
            c11996M45308.writeByte(0);
            C13851 c13851 = this.f10024;
            c11996M45308.m27443((CharSequence) c13851.mo10963().getPackageName());
            c11996M45308.m27443((CharSequence) c13851.mo10963().getClassName());
            c11996M45308.m27445(c13851.mo10961());
            c11996M45308.m27445(c13851.mo10959());
        }
        try {
            m9386(this.f10027).m38654(c11996M45308);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4463 m9370(JSONObject jSONObject) {
        String string = jSONObject.getString(C0655am.f2274aB);
        int i = jSONObject.getInt(C0655am.f2281aI);
        if (i == 0) {
            ComponentName componentName = new ComponentName(jSONObject.getString(C0655am.f2322ax), jSONObject.getString(C0655am.f2278aF));
            int i2 = jSONObject.getInt("f");
            return new C4463(string, new C13851(componentName, (i2 & 1) != 0, (i2 & 2) != 0));
        }
        if (i < 1 || i > 21) {
            throw new RuntimeException(C20778.m46922(i, "Unknown type: "));
        }
        return new C4463(string, C11169.m25783(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۜ */
    public final JSONObject m9392() {
        int i;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0655am.f2274aB, this.f10027);
        C11169 c11169 = this.f10025;
        if (c11169 != null) {
            jSONObject.put(C0655am.f2281aI, c11169.f31006);
            return jSONObject;
        }
        jSONObject.put(C0655am.f2281aI, 0);
        C13851 c13851 = this.f10024;
        jSONObject.put(C0655am.f2322ax, c13851.mo10963().getPackageName());
        jSONObject.put(C0655am.f2278aF, c13851.mo10963().getClassName());
        boolean zMo10961 = c13851.mo10961();
        if (c13851.mo10959()) {
            i = zMo10961;
            i = (zMo10961 ? 1 : 0) | 2;
        }
        i = zMo10961;
        jSONObject.put("f", i);
        return jSONObject;
    }

    /* JADX INFO: renamed from: ۡ */
    public static void m9381() {
        f10021 = C17853.m40542().m38684("openMethod").mo25091();
        f10018 = System.currentTimeMillis();
        C7050.m16212(new RunnableC17202(0));
    }

    /* JADX INFO: renamed from: ۢ */
    public static void m9382() {
        AbstractC17043 abstractC17043M38684 = C17853.m40542().m38684("openMethod");
        HashMap map = f10023;
        map.clear();
        for (AbstractC17043 abstractC17043 : abstractC17043M38684.mo25500(true)) {
            String name = abstractC17043.getName();
            if (name.endsWith(".om")) {
                try {
                    String lowerCase = name.substring(0, name.length() - 3).toLowerCase();
                    map.put(lowerCase, m9372(abstractC17043, lowerCase));
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static AbstractC17043 m9386(String str) {
        return C17853.m40542().m38684("openMethod/" + str + ".om");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9378(String str, C21265 c21265, String... strArr) {
        f10020.put(str, new C4463(str, c21265, null, strArr));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9374(String str, int i, C21265 c21265, String... strArr) {
        f10020.put(str, new C4463(str, c21265, C11169.m25783(i), strArr));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9375(String str, int i, String... strArr) {
        f10020.put(str, new C4463(str, null, C11169.m25783(i), strArr));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9373(String str) {
        String lowerCase = str.toLowerCase();
        HashMap map = f10020;
        if (map.containsKey(lowerCase)) {
            return;
        }
        map.put(lowerCase, new C4463(lowerCase, C21265.f66878, C11169.m25783(9), "text/plain"));
    }
}
