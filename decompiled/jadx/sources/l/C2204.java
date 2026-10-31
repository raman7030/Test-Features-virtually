package l;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import bin.mt.json.JSONObject;
import bin.mt.plus.Main;
import com.umeng.analytics.pro.am;
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
public final class C2204 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static long f7233;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static long f7236;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12082 f7239;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C9260 f7240;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C19883 f7241;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f7242;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public List f7243;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final HashMap f7235 = new HashMap();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final HashMap f7238 = new HashMap();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final HashMap f7232 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C11459 f7237 = C11459.m28260("\\.(?:00[1-9]|0[1-9][0-9]|[1-9][0-9]{2})");

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C11459 f7234 = C11459.m28260("\\.z(?:0[1-9]|[1-9][0-9]+)");

    static {
        m7296(".xml", 1, "text/xml");
        m7296(".kml", 1, "text/kml");
        m7296(".dex", 3, "application/octet-stream");
        m7296(".arsc", 2, "application/octet-stream");
        m7296(".mtp", 8, "application/mt-plugin");
        m7296(".apk", 4, "application/vnd.android.package-archive");
        m7296(".apk.1", 4, "application/vnd.android.package-archive");
        m7296(".apex", 4, "application/vnd.android.package-archive");
        m7296(".bks", 7, "application/bks");
        m7296(".jks", 7, "application/jks");
        m7296(".keystore", 7, "application/jks");
        m7296(".apks", 5, "application/vnd.android.package-archives");
        m7296(".xapk", 5, "application/vnd.android.package-archives");
        m7296(".apkm", 5, "application/vnd.android.package-archives");
        m7296(".sh", 12, "application/x-sh");
        m7296(".rc", 12, "application/x-rc");
        m7296(".zip", 6, "application/zip");
        m7296(".aab", 6, "application/zip");
        m7296(".mtz", 6, "application/zip");
        m7296(".hwt", 6, "application/zip");
        m7296(".bds", 6, "application/zip");
        m7296(".jar", 16, "application/x-jar", "application/java-archive", "application/x-java-archive");
        m7296(".ttf", 13, "application/x-font-ttf");
        m7296(".ttc", 13, "application/x-font-ttc");
        m7296(".otf", 13, "application/x-font-otf");
        m7296(".woff", 13, "application/x-font-woff");
        m7296(".plist", 1, "text/plist");
        m7296(".class", 17, "application/octet-stream");
        m7296(".mtcr", 18, "application/octet-stream");
        m7296(".iml", 9, "text/xml");
        m7296(".mtd", 9, "text/plain");
        m7296(".mtl", 9, "text/plain");
        m7296(".mtsx", 9, "text/plain");
        m7296(".m3u", 9, "text/plain");
        m7296(".mf", 9, "text/plain");
        m7296(".md", 9, "text/plain");
        m7296(".sf", 9, "text/plain");
        m7296(".txt", 9, "text/plain");
        m7296(".log", 9, "text/plain");
        m7296(".css", 9, "text/plain");
        m7296(".cfg", 9, "text/plain");
        m7296(".ini", 9, "text/plain");
        m7296(".conf", 9, "text/plain");
        m7296(".prop", 9, "text/plain");
        m7296(".json", 9, "text/plain");
        m7296(".properties", 9, "text/plain");
        C19883 c19883 = C19883.f64191;
        m7295(".htm", 21, c19883, "text/html");
        m7295(".html", 21, c19883, "text/html");
        m7295(".xhtml", 21, c19883, "application/xhtml+xml");
        m7295(".shtml", 21, c19883, "text/html");
        m7295(".mhtml", 21, c19883, "multipart/related");
        m7295(".mht", 21, c19883, "multipart/related");
        C19883 c19884 = C19883.f64242;
        m7295(".c", 9, c19884, "text/plain");
        m7295(".h", 9, c19884, "text/plain");
        m7295(".js", 9, c19884, "text/plain");
        m7295(".py", 9, C19883.f64224, "text/plain");
        m7295(".cc", 9, c19884, "text/plain");
        m7295(".go", 9, c19884, "text/plain");
        m7295(".kt", 9, C19883.f64243, "text/plain");
        m7295(".bat", 9, c19884, "text/plain");
        m7295(".php", 9, C19883.f64238, "text/plain");
        m7295(".cpp", 9, c19884, "text/plain");
        m7295(".hpp", 9, c19884, "text/plain");
        m7295(".lua", 9, C19883.f64183, "text/plain");
        m7295(".java", 9, C19883.f64207, "text/plain");
        m7295(".smali", 9, c19884, "text/plain");
        m7295(".yml", 9, c19884, "text/plain");
        m7295(".yaml", 9, c19884, "text/plain");
        m7295(".rs", 9, c19884, "text/plain");
        C19883 c19885 = C19883.f64234;
        m7295(".zshrc", 9, c19885, "text/plain");
        m7295(".bashrc", 9, c19885, "text/plain");
        m7295(".bash_history", 9, c19884, "text/plain");
        C19883 c19886 = C19883.f64208;
        m7295(".csv", 9, c19886, "text/csv");
        C19883 c19887 = C19883.f64240;
        m7295(".ass", 9, c19887, "text/x-ssa");
        m7295(".ssa", 9, c19887, "text/x-ssa");
        m7295(".srt", 9, c19887, "application/x-subrip");
        m7295(".vtt", 9, c19887, "text/vtt");
        m7295(".ttml", 9, c19887, "application/ttml+xml");
        m7296(".jpeg", 10, "image/jpeg");
        m7296(".jpg", 10, "image/jpeg");
        m7296(".bmp", 10, "image/bmp");
        m7296(".gif", 10, "image/gif");
        m7296(".ico", 10, "image/x-icon");
        m7296(".png", 10, "image/png");
        m7296(".webp", 10, "image/webp");
        m7296(".heic", 10, "image/heic");
        m7296(".heif", 10, "image/heif");
        m7296(".svg", 15, "image/svg+xml");
        m7296(".9.png", 10, "image/png");
        m7296(".tga", 10, "image/tga");
        m7296(".m4a", 11, "audio/mp4a-latm");
        m7296(".m4b", 11, "audio/mp4a-latm");
        m7296(".m4p", 11, "audio/mp4a-latm");
        m7296(".mp2", 11, "audio/x-mpeg");
        m7296(".mp3", 11, "audio/x-mpeg");
        m7296(".mpga", 11, "audio/mpeg");
        m7296(".ogg", 11, "audio/ogg");
        m7296(".wav", 11, "audio/x-wav");
        m7296(".wma", 11, "audio/x-ms-wma");
        m7296(".flac", 11, "audio/*");
        m7296(".amr", 11, "audio/amr");
        m7296(".mid", 11, "audio/midi");
        m7296(".midi", 11, "audio/midi");
        m7296(".oga", 11, "audio/ogg");
        m7296(".aac", 11, "audio/aac");
        m7296(".rpm", 11, "audio/vnd.rn-realaudio");
        m7296(".weba", 11, "audio/webm");
        m7296(".3gp", 20, "video/3gpp");
        m7296(".asf", 20, "video/x-ms-asf");
        m7296(".avi", 20, "video/x-msvideo");
        m7296(".mp4", 20, "video/mp4");
        m7296(".mpe", 20, "video/mpeg");
        m7296(".mpeg", 20, "video/mpeg");
        m7296(".mpg", 20, "video/mpeg");
        m7296(".mpg4", 20, "video/mp4");
        m7296(".m4u", 20, "video/vnd.mpegurl");
        m7296(".m3u8", 20, "video/vnd.mpegurl", "application/x-mpegurl", "application/vnd.apple.mpegurl");
        m7296(".m4v", 20, "video/x-m4v");
        m7296(".mov", 20, "video/quicktime");
        m7296(".rmvb", 20, "video/vnd.rn-realvideo");
        m7296(".wmv", 20, "video/x-ms-wmv");
        m7296(".3gpp", 20, "video/3gpp");
        m7296(".flv", 20, "video/x-flv");
        m7296(".ogv", 20, "video/ogg");
        m7296(".mkv", 20, "video/x-matroska");
        m7296(".dv", 20, "video/x-dv");
        m7296(".webm", 20, "video/webm");
        m7296(".7z", 6, "application/x-7z-compressed");
        m7296(".deb", 6, "application/vnd.debian.binary-package");
        m7296(".arj", 6, "application/arj");
        m7296(".cab", 6, "application/vnd.ms-cab-compressed");
        m7296(".chm", 6, "application/vnd.ms-htmlhelp");
        m7296(".cpio", 6, "application/x-cpio", "application/cpio");
        m7296(".iso", 6, "application/iso");
        m7296(".lzh", 6, "application/lzh");
        m7296(".lzma", 6, "application/lzma");
        m7296(".rar", 6, "application/x-rar-compressed");
        m7296(".wim", 6, "application/wim");
        m7296(".xar", 6, "application/xar");
        m7296(".ntfs", 6, "application/ntfs");
        m7296(".udf", 6, "application/udf");
        m7296(".z", 6, "application/z");
        m7296(".zl", 6, "application/zlib");
        m7296(".zli", 6, "application/zlib");
        m7296(".zlib", 6, "application/zlib");
        m7296(".tar", 6, "application/x-tar", "application/tar");
        m7296(".gz", 6, "application/x-gzip", "application/gzip");
        m7296(".tar.gz", 6, "application/x-gzip", "application/gzip");
        m7296(".tgz", 6, "application/x-gzip", "application/gzip");
        m7296(".taz", 6, "application/x-gzip", "application/gzip");
        m7296(".xz", 6, "application/x-xz", "application/xz");
        m7296(".tar.xz", 6, "application/x-xz", "application/xz");
        m7296(".txz", 6, "application/x-xz", "application/xz");
        m7296(".zst", 6, "application/zstd");
        m7296(".zstd", 6, "application/zstd");
        m7296(".tar.zst", 6, "application/zstd");
        m7296(".tar.zstd", 6, "application/zstd");
        m7296(".bz2", 6, "application/x-bzip2", "application/bzip2");
        m7296(".tar.bz2", 6, "application/x-bzip2", "application/bzip2");
        m7296(".tbz2", 6, "application/x-bzip2", "application/bzip2");
        m7296(".tbz", 6, "application/x-bzip2", "application/bzip2");
        m7296(".lz4", 6, "application/x-lz4", "application/lz4");
        m7296(".tar.lz4", 6, "application/x-lz4", "application/lz4");
        m7299(".pdf", C19883.f64198, "application/pdf");
        C19883 c19888 = C19883.f64206;
        m7299(".ppt", c19888, "application/vnd.ms-powerpoint");
        m7299(".xls", c19886, "application/vnd.ms-excel");
        m7299(".doc", c19887, "application/msword");
        m7299(".pptx", c19888, "application/vnd.ms-powerpoint");
        m7299(".xlsx", c19886, "application/vnd.ms-excel");
        m7299(".docx", c19887, "application/msword");
        C19883 c19889 = C19883.f64219;
        m7299(".odex", c19889, "application/oat");
        m7299(".oat", c19889, "application/oat");
        m7299(".torrent", C19883.f64193, "application/x-bittorrent");
        m7296(".ts-movie", 20, "video/MP2T");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m7304(String str) {
        return (String) m7292(str, true).f7243.get(0);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0089  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2204 m7292(String str, boolean z) {
        String lowerCase = str.toLowerCase();
        String strM36487 = AbstractC15440.m36487(lowerCase);
        if (strM36487.isEmpty()) {
            return new C2204("", null, null, "*/*");
        }
        if (System.currentTimeMillis() - f7233 > 10000) {
            long jMo23117 = C16293.m38327().m36526("openMethod").mo23117();
            if (jMo23117 != f7236) {
                m7303();
                f7236 = jMo23117;
            }
            f7233 = System.currentTimeMillis();
        }
        char cM19937 = C7416.m19937(1, strM36487);
        if ('0' <= cM19937 && cM19937 <= '9') {
            if (f7237.matcher((CharSequence) strM36487).matches()) {
                if (lowerCase.endsWith(".7z".concat(strM36487))) {
                    strM36487 = ".7z";
                } else if (lowerCase.endsWith(".zip".concat(strM36487))) {
                    strM36487 = ".zip";
                }
            } else if (f7234.matcher((CharSequence) strM36487).matches()) {
                strM36487 = ".zip";
            }
        }
        C2204 c2204 = z ? (C2204) f7238.get(strM36487) : null;
        if (c2204 == null) {
            c2204 = (C2204) f7232.get(strM36487);
        }
        if (c2204 == null) {
            c2204 = (C2204) f7235.get(strM36487);
        }
        if (c2204 == null) {
            return new C2204(strM36487, strM36487.equals(".img") ? C19883.f64241 : null, null, "*/*");
        }
        return c2204;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7301(boolean z) {
        Main mainM36593;
        C9340 c9340M132;
        C2727 c2727 = new C2727();
        Iterator it = C9840.m24908().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C15068) it.next()).m35662().iterator();
            while (it2.hasNext()) {
                String lowerCase = ((String) it2.next()).toLowerCase();
                if (!f7235.containsKey(lowerCase) && !c2727.containsKey(lowerCase)) {
                    c2727.put(lowerCase, new C2204(lowerCase, C9260.m23782(9)));
                }
            }
        }
        HashMap map = f7232;
        map.clear();
        map.putAll(c2727);
        if (!z || (mainM36593 = C15528.m36593()) == null || (c9340M132 = mainM36593.m132()) == null) {
            return;
        }
        C4925.m14315(new RunnableC20760(2, c9340M132.m24070()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7298(String str, C9260 c9260) {
        String lowerCase = str.toLowerCase();
        C2204 c2204 = new C2204(lowerCase, c9260);
        c2204.m7306();
        f7238.put(lowerCase, c2204);
        m7302();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7297(String str, InterfaceC5711 interfaceC5711) {
        String lowerCase = str.toLowerCase();
        C2204 c2204 = new C2204(lowerCase, new C12082(interfaceC5711.mo8896(), interfaceC5711.mo8894(), interfaceC5711.mo8892()));
        c2204.m7306();
        f7238.put(lowerCase, c2204);
        m7302();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7300(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2204 c2204 = (C2204) it.next();
            c2204.m7306();
            f7238.put(c2204.f7242, c2204);
        }
        m7302();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m7305(ArrayList arrayList) {
        HashMap map = f7238;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            m7307(((C2204) it.next()).f7242).mo23552();
        }
        map.clear();
        m7300(arrayList);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m7308(String str) {
        String lowerCase = str.toLowerCase();
        m7307(lowerCase).mo23552();
        f7238.remove(lowerCase);
        m7302();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ArrayList m7309() {
        m7303();
        ArrayList arrayList = new ArrayList(f7238.values());
        Collections.sort(arrayList, C8200.comparing(new C8554(0)));
        return arrayList;
    }

    public C2204(String str, C19883 c19883, C9260 c9260, String... strArr) {
        this.f7242 = str;
        this.f7241 = c19883;
        this.f7240 = c9260;
        this.f7243 = Arrays.asList(strArr);
    }

    public C2204(String str, C9260 c9260) {
        String str2;
        this.f7242 = str;
        C2204 c2204 = (C2204) f7235.get(str);
        if (c2204 != null) {
            this.f7243 = c2204.f7243;
            if (c9260 == c2204.f7240) {
                this.f7241 = c2204.f7241;
            }
        } else {
            int i = c9260.f28061;
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
                    throw new RuntimeException(C19370.m44628(i, "Unknown built-in function type: "));
            }
            this.f7243 = Collections.singletonList(str2);
        }
        this.f7240 = c9260;
    }

    public C2204(String str, C12082 c12082) {
        this.f7242 = str;
        C2204 c2204 = (C2204) f7235.get(str);
        if (c2204 != null) {
            this.f7243 = c2204.f7243;
            this.f7241 = c2204.m7317();
        } else {
            this.f7243 = Collections.singletonList("*/*");
        }
        this.f7239 = c12082;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m7319() {
        return this.f7242;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m7315() {
        return (String) this.f7243.get(0);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C9260 m7318() {
        return this.f7240;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m7314() {
        C9260 c9260 = this.f7240;
        return c9260 != null && c9260.f28061 == 5;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m7312(int... iArr) {
        C9260 c9260 = this.f7240;
        if (c9260 != null) {
            int i = c9260.f28061;
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12082 m7316() {
        return this.f7239;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C19883 m7317() {
        C19883 c19883 = this.f7241;
        if (c19883 != null) {
            return c19883;
        }
        C9260 c9260 = this.f7240;
        if (c9260 != null) {
            return c9260.m23783();
        }
        return C19883.f64193;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7310(C16560 c16560, InterfaceC17889 interfaceC17889) {
        C9260 c9260 = this.f7240;
        if (c9260 != null) {
            c9260.m23784(c16560, interfaceC17889);
        } else {
            this.f7239.m29466(c16560, interfaceC17889);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m7311() {
        if (this.f7240 != null) {
            return true;
        }
        C12082 c12082 = this.f7239;
        if (c12082 != null) {
            try {
                ComponentName componentNameMo8896 = c12082.mo8896();
                String packageName = componentNameMo8896.getPackageName();
                String strM7289 = m7289(componentNameMo8896.getClassName(), packageName);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage(packageName);
                AbstractC15440 abstractC15440M36526 = C16293.f50120.m36526("test" + this.f7242);
                PackageManager packageManagerM14320 = C4925.m14320();
                intent.setDataAndType(abstractC15440M36526.m36509(), "*/*");
                Iterator<ResolveInfo> it = packageManagerM14320.queryIntentActivities(intent, 65536).iterator();
                while (it.hasNext()) {
                    ActivityInfo activityInfo = it.next().activityInfo;
                    if (strM7289.equals(m7289(activityInfo.name, activityInfo.packageName))) {
                        return true;
                    }
                }
                intent.setDataAndType(abstractC15440M36526.m36522(), "*/*");
                Iterator<ResolveInfo> it2 = packageManagerM14320.queryIntentActivities(intent, 65536).iterator();
                while (it2.hasNext()) {
                    ActivityInfo activityInfo2 = it2.next().activityInfo;
                    if (strM7289.equals(m7289(activityInfo2.name, activityInfo2.packageName))) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m7289(String str, String str2) {
        return str.startsWith(".") ? C16014.m37867(str2, str) : str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2204 m7293(AbstractC15440 abstractC15440, String str) throws IOException {
        C12951 c12951M36528 = abstractC15440.m36528();
        C22124.m49722((InterfaceC20008) c12951M36528, 1935831681);
        int i = c12951M36528.readByte() & 255;
        if (i == 0) {
            return new C2204(str, new C12082(new ComponentName(c12951M36528.m31504(), c12951M36528.m31504()), c12951M36528.m31498(), c12951M36528.m31498()));
        }
        if (i >= 1 && i <= 21) {
            return new C2204(str, C9260.m23782(i));
        }
        throw new IOException();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m7306() {
        C10130 c10130M43030 = C18515.m43030(1935831681);
        C9260 c9260 = this.f7240;
        if (c9260 != null) {
            c10130M43030.writeByte(c9260.f28061);
        } else {
            c10130M43030.writeByte(0);
            C12082 c12082 = this.f7239;
            c10130M43030.m25423((CharSequence) c12082.mo8896().getPackageName());
            c10130M43030.m25423((CharSequence) c12082.mo8896().getClassName());
            c10130M43030.m25425(c12082.mo8894());
            c10130M43030.m25425(c12082.mo8892());
        }
        try {
            m7307(this.f7242).m36496(c10130M43030);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2204 m7291(JSONObject jSONObject) {
        String string = jSONObject.getString(am.aB);
        int i = jSONObject.getInt(am.aI);
        if (i == 0) {
            ComponentName componentName = new ComponentName(jSONObject.getString(am.ax), jSONObject.getString(am.aF));
            int i2 = jSONObject.getInt("f");
            return new C2204(string, new C12082(componentName, (i2 & 1) != 0, (i2 & 2) != 0));
        }
        if (i < 1 || i > 21) {
            throw new RuntimeException(C19370.m44628(i, "Unknown type: "));
        }
        return new C2204(string, C9260.m23782(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final JSONObject m7313() {
        int i;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(am.aB, this.f7242);
        C9260 c9260 = this.f7240;
        if (c9260 != null) {
            jSONObject.put(am.aI, c9260.f28061);
            return jSONObject;
        }
        jSONObject.put(am.aI, 0);
        C12082 c12082 = this.f7239;
        jSONObject.put(am.ax, c12082.mo8896().getPackageName());
        jSONObject.put(am.aF, c12082.mo8896().getClassName());
        boolean zMo8894 = c12082.mo8894();
        if (c12082.mo8892()) {
            i = zMo8894;
            i = (zMo8894 ? 1 : 0) | 2;
        }
        i = zMo8894;
        jSONObject.put("f", i);
        return jSONObject;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static void m7302() {
        f7236 = C16293.m38327().m36526("openMethod").mo23117();
        f7233 = System.currentTimeMillis();
        C4925.m14315(new RunnableC15608(0));
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static void m7303() {
        AbstractC15440 abstractC15440M36526 = C16293.m38327().m36526("openMethod");
        HashMap map = f7238;
        map.clear();
        for (AbstractC15440 abstractC15440 : abstractC15440M36526.mo23549(true)) {
            String name = abstractC15440.getName();
            if (name.endsWith(".om")) {
                try {
                    String lowerCase = name.substring(0, name.length() - 3).toLowerCase();
                    map.put(lowerCase, m7293(abstractC15440, lowerCase));
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m7307(String str) {
        return C16293.m38327().m36526("openMethod/" + str + ".om");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7299(String str, C19883 c19883, String... strArr) {
        f7235.put(str, new C2204(str, c19883, null, strArr));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7295(String str, int i, C19883 c19883, String... strArr) {
        f7235.put(str, new C2204(str, c19883, C9260.m23782(i), strArr));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7296(String str, int i, String... strArr) {
        f7235.put(str, new C2204(str, null, C9260.m23782(i), strArr));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7294(String str) {
        String lowerCase = str.toLowerCase();
        HashMap map = f7235;
        if (map.containsKey(lowerCase)) {
            return;
        }
        map.put(lowerCase, new C2204(lowerCase, C19883.f64242, C9260.m23782(9), "text/plain"));
    }
}
