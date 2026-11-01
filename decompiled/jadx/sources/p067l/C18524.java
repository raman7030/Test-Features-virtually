package p067l;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Pair;
import bin.p000mt.plus.Features3;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.google.android.material.color.MaterialColors;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ܿ֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D18B */
/* JADX INFO: loaded from: classes4.dex */
public final class C18524 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f55316 = 0;

    /* JADX INFO: renamed from: ۜ */
    public static Boolean f55317;

    /* JADX INFO: renamed from: ۧ */
    public static final String f55318;

    /* JADX INFO: renamed from: ܳ */
    public static InterfaceC10399 f55319;

    /* JADX INFO: renamed from: ܽ */
    public static final C1782 f55320;

    /* JADX INFO: renamed from: ܿ */
    public static boolean f55321;

    /* JADX INFO: renamed from: ᩳ */
    public static Boolean f55322;

    /* JADX INFO: renamed from: ᩻ */
    public static int f55323;

    static {
        String path = Environment.getExternalStorageDirectory().getPath();
        f55318 = path;
        f55323 = (int) (System.currentTimeMillis() & 16777215);
        C1782 c1782 = new C1782();
        f55320 = c1782;
        f55321 = true;
        f55319 = new C24420(0);
        c1782.add(path);
        c1782.add("/sdcard");
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m42101() {
        return f55318;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C1782 m42119() {
        C21089 c21089M12615;
        boolean z = f55321;
        C1782 c1782 = f55320;
        if (z && C23770.m52833() && !C5665.m12620()) {
            f55321 = false;
            LinkedList linkedList = new LinkedList(c1782);
            try {
                c21089M12615 = C5665.m12615(false);
                while (!linkedList.isEmpty()) {
                    try {
                        C19136 c19136M47663 = c21089M12615.m47663(new File((String) linkedList.removeFirst()).getPath());
                        if (c19136M47663.m43531() != null) {
                            String strM43531 = c19136M47663.m43531();
                            if (c1782.add(strM43531)) {
                                linkedList.addLast(strM43531);
                            } else {
                                continue;
                            }
                        }
                    } catch (Throwable unused) {
                        if (c21089M12615 != null) {
                            c21089M12615.m47686();
                        }
                        return c1782;
                    }
                }
                c21089M12615.m47686();
                return c1782;
            } catch (Throwable unused2) {
                c21089M12615 = null;
            }
        }
        return c1782;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m42116(AbstractActivityC5549 abstractActivityC5549) {
        if (abstractActivityC5549.getIntent().getData() != null) {
            return false;
        }
        abstractActivityC5549.finish();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m42105(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            throw new NullPointerException("Intent data is null: " + intent);
        }
        return m42106(data);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m42110(ActivityC4388 activityC4388) {
        Intent intent = activityC4388.getIntent();
        Uri data = intent.getData();
        if (data == null) {
            data = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
        }
        if (data == null) {
            throw new NullPointerException("Intent data is null: " + intent);
        }
        return m42106(data);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m42106(Uri uri) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        String path;
        if ("file".equals(uri.getScheme())) {
            String path2 = uri.getPath();
            C12826.requireNonNull(path2);
            return m42109(C25091.m55070(path2), new String[0]);
        }
        if ("content".equals(uri.getScheme())) {
            String host = uri.getHost();
            if (C13692.f38625.equals(host)) {
                return C13692.m31099(uri);
            }
            if ("bin.mt.plus.fileprovider2".equals(host) || "bin.mt.plus.canary.fileprovider2".equals(host) || "bin.mt.plus.fp".equals(host) || "bin.mt.plus.canary.fp".equals(host)) {
                String path3 = uri.getPath();
                if (path3 != null && !path3.startsWith("/NOT_DELETE/")) {
                    return m42109(path3, new String[0]);
                }
            } else if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                String strM37022 = C16253.m37022(uri);
                if (strM37022 != null) {
                    if ("primary".equals(strM37022)) {
                        return C17853.f53287.m38684(C16253.m37020(uri).getPathSegments().get(3).substring(strM37022.length() + 1));
                    }
                    for (C6376 c6376 : (ArrayList) C21129.m47756(null)) {
                        if (c6376.f16501.equals(strM37022)) {
                            return m42109(c6376.f16500.getAbsolutePath(), C16253.m37020(uri).getPathSegments().get(3).substring(strM37022.length() + 1));
                        }
                    }
                }
            } else if ("com.android.providers.downloads.ui.fileprovider".equals(uri.getAuthority()) && (path = uri.getPath()) != null && path.startsWith("/external_files/Download/")) {
                return C17853.f53287.m38684(path.substring(16));
            }
            String strM55069 = C25091.m55069(uri);
            if (strM55069 != null) {
                AbstractC17043 abstractC17043M42109 = m42109(strM55069, new String[0]);
                if (abstractC17043M42109.mo29997()) {
                    if (Build.VERSION.SDK_INT >= 30) {
                        InterfaceC2982 interfaceC2982M52834 = C23770.m52834();
                        if (!interfaceC2982M52834.mo4997()) {
                            try {
                                if (abstractC17043M42109 instanceof C14717) {
                                    C14717 c14717 = (C14717) abstractC17043M42109;
                                    if (interfaceC2982M52834.mo4998()) {
                                        Future futureSubmit = C4081.f8987.submit(new CallableC15702(0, c14717));
                                        try {
                                            if (futureSubmit.get(1L, TimeUnit.SECONDS) == Boolean.TRUE) {
                                                if (!futureSubmit.isDone()) {
                                                    futureSubmit.cancel(true);
                                                    return abstractC17043M42109;
                                                }
                                            } else if (!futureSubmit.isDone()) {
                                                futureSubmit.cancel(true);
                                            }
                                        } catch (Exception unused) {
                                            if (!futureSubmit.isDone()) {
                                            }
                                        } catch (Throwable th) {
                                            if (!futureSubmit.isDone()) {
                                                futureSubmit.cancel(true);
                                            }
                                            throw th;
                                        }
                                    } else if (c14717.mo33653() && (parcelFileDescriptorOpenFileDescriptor = C7050.m16233().openFileDescriptor(c14717.mo33652(), "r")) != null) {
                                        parcelFileDescriptorOpenFileDescriptor.close();
                                        return abstractC17043M42109;
                                    }
                                } else if (abstractC17043M42109 instanceof C13672) {
                                    ((C13672) abstractC17043M42109).mo29987().close();
                                }
                            } catch (Exception unused2) {
                            }
                        }
                    }
                    return abstractC17043M42109;
                }
            }
            return new C16433(uri);
        }
        throw new RuntimeException("Unsupported uri: " + uri);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043[] m42118(String[] strArr) {
        AbstractC17043[] abstractC17043Arr = new AbstractC17043[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            abstractC17043Arr[i] = m42109(strArr[i], new String[0]);
        }
        return abstractC17043Arr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m42103(String str, boolean z) throws IOException {
        if (str.indexOf(0) >= 0 || str.startsWith("/") || str.startsWith("\\")) {
            throw new IOException("Unsafe archive entry path: ".concat(str));
        }
        if (str.length() >= 2 && Character.isLetter(str.charAt(0)) && str.charAt(1) == ':') {
            throw new IOException("Unsafe archive entry path: ".concat(str));
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 <= str.length(); i2++) {
            if (i2 == str.length() || str.charAt(i2) == '/' || str.charAt(i2) == '\\') {
                String strSubstring = str.substring(i, i2);
                int i3 = i2 + 1;
                if (!strSubstring.isEmpty() && !".".equals(strSubstring)) {
                    if ("..".equals(strSubstring)) {
                        if (arrayList.isEmpty()) {
                            throw new IOException("Unsafe archive entry path: ".concat(str));
                        }
                        C19925.m45229(arrayList, 1);
                    } else {
                        if (strSubstring.length() >= 2 && Character.isLetter(strSubstring.charAt(0)) && strSubstring.charAt(1) == ':') {
                            throw new IOException("Unsafe archive entry path: ".concat(str));
                        }
                        arrayList.add(m42123(strSubstring));
                    }
                }
                i = i3;
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "/");
            }
        }
        String string = sb.toString();
        if (z || !string.isEmpty()) {
            return string;
        }
        throw new IOException("Unsafe archive entry path: ".concat(str));
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m42124(String str, String str2) throws IOException {
        if (!str2.isEmpty()) {
            int i = 0;
            if (str2.indexOf(0) < 0 && !str2.startsWith("/") && !str2.startsWith("\\")) {
                if (str2.length() >= 2 && Character.isLetter(str2.charAt(0)) && str2.charAt(1) == ':') {
                    throw new IOException("Unsafe archive symbolic link target: ".concat(str2));
                }
                String strM42103 = m42103(str, false);
                ArrayList arrayList = new ArrayList();
                int iLastIndexOf = strM42103.lastIndexOf(47);
                if (iLastIndexOf != -1) {
                    int i2 = 0;
                    for (int i3 = 0; i3 < iLastIndexOf; i3++) {
                        if (strM42103.charAt(i3) == '/') {
                            arrayList.add(strM42103.substring(i2, i3));
                            i2 = i3 + 1;
                        }
                    }
                    arrayList.add(strM42103.substring(i2, iLastIndexOf));
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                int i4 = 0;
                for (int i5 = 0; i5 <= str2.length(); i5++) {
                    if (i5 == str2.length() || str2.charAt(i5) == '/' || str2.charAt(i5) == '\\') {
                        String strSubstring = str2.substring(i4, i5);
                        int i6 = i5 + 1;
                        if (!strSubstring.isEmpty() && !".".equals(strSubstring)) {
                            if ("..".equals(strSubstring)) {
                                if (arrayList2.isEmpty()) {
                                    throw new IOException("Unsafe archive symbolic link target: ".concat(str2));
                                }
                                C19925.m45229(arrayList2, 1);
                            } else {
                                if (strSubstring.length() >= 2 && Character.isLetter(strSubstring.charAt(0)) && strSubstring.charAt(1) == ':') {
                                    throw new IOException("Unsafe archive symbolic link target: ".concat(str2));
                                }
                                arrayList2.add(m42123(strSubstring));
                            }
                        }
                        i4 = i6;
                    }
                }
                while (i < arrayList.size() && i < arrayList2.size() && ((String) arrayList.get(i)).equals(arrayList2.get(i))) {
                    i++;
                }
                ArrayList arrayList3 = new ArrayList();
                for (int i7 = i; i7 < arrayList.size(); i7++) {
                    arrayList3.add("..");
                }
                while (i < arrayList2.size()) {
                    arrayList3.add((String) arrayList2.get(i));
                    i++;
                }
                if (arrayList3.isEmpty()) {
                    return ".";
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        }
                        sb.append((CharSequence) "/");
                    }
                }
                return sb.toString();
            }
        }
        throw new IOException("Unsafe archive symbolic link target: ".concat(str2));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX INFO: renamed from: ܳ */
    public static String m42123(String str) {
        char c;
        int length = str.length();
        StringBuilder sb = null;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '>' && cCharAt != '?') {
                c = ' ';
                if (cCharAt != 8232 && cCharAt != 8233) {
                    switch (cCharAt) {
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                            break;
                        default:
                            switch (cCharAt) {
                                case ' ':
                                case 133:
                                case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                                case 5760:
                                case 8239:
                                case 8287:
                                case 12288:
                                    break;
                                case '\"':
                                case '*':
                                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                case '<':
                                case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                case '|':
                                    c = '_';
                                    break;
                                default:
                                    if (cCharAt < 8192 || cCharAt > 8202) {
                                        c = cCharAt;
                                    }
                                    break;
                            }
                            break;
                    }
                }
            } else {
                c = '_';
            }
            if (c != cCharAt && sb == null) {
                sb = new StringBuilder(length);
                sb.append((CharSequence) str, 0, i);
            }
            if (sb != null) {
                sb.append(c);
            }
        }
        return sb == null ? str : sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m42109(String str, String... strArr) {
        String strM42102;
        if (str.startsWith("content://") || str.startsWith("android.resource://")) {
            if (strArr.length != 0) {
                throw new IllegalArgumentException("Children must be empty when path is context uri");
            }
            return new C16433(Uri.parse(str));
        }
        if (str.startsWith("$RECYCLE.BIN$/")) {
            str = C23219.m51756().mo25505() + str.substring(13);
            if (C23770.m52834().mo4997() && (strM42102 = m42102(str)) != null) {
                str = "/data/media/" + C17853.f53287.getName() + "/" + strM42102;
            }
        }
        File file = new File(str);
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            File file2 = new File(file, strArr[i]);
            i++;
            file = file2;
        }
        return m42107(file);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00da  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e1  */
    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m42107(File file) {
        Pair pairCreate;
        String strM56;
        String path = file.getPath();
        if (Build.VERSION.SDK_INT >= 30) {
            Iterator it = m42119().iterator();
            while (true) {
                if (!it.hasNext()) {
                    pairCreate = Pair.create(0, null);
                    break;
                }
                String str = (String) it.next();
                if (m42115(path, str)) {
                    int length = str.length();
                    int i = length + 1;
                    if (!m42114(path, i, "android", path.length(), 7)) {
                        if (path.length() == str.length()) {
                            strM56 = Features3.m56(path);
                        } else {
                            strM56 = null;
                        }
                        if (strM56 == null) {
                            strM56 = "";
                        }
                        pairCreate = Pair.create(1, strM56);
                        break;
                    }
                    int i2 = length + 9;
                    if (!m42114(path, i2, AbstractC0213e.f989m, path.length(), 4)) {
                        if (!m42114(path, i2, "obb", path.length(), 3)) {
                            if (path.length() == str.length()) {
                                strM56 = Features3.m56(path);
                            } else {
                                strM56 = null;
                            }
                            if (strM56 == null) {
                                strM56 = "";
                            }
                            pairCreate = Pair.create(1, strM56);
                            break;
                        }
                        String strM16234 = C7050.m16234();
                        if (!m42114(path, length + 13, strM16234, path.length(), strM16234.length())) {
                            pairCreate = Pair.create(3, path.substring(i, path.endsWith("/") ? path.length() - 1 : path.length()));
                            break;
                        }
                        pairCreate = Pair.create(4, null);
                        break;
                    }
                    String strM16235 = C7050.m16234();
                    if (!m42114(path, length + 14, strM16235, path.length(), strM16235.length())) {
                        pairCreate = Pair.create(2, path.substring(i, path.endsWith("/") ? path.length() - 1 : path.length()));
                        break;
                    }
                    pairCreate = Pair.create(4, null);
                    break;
                }
            }
            int iIntValue = ((Integer) pairCreate.first).intValue();
            if (iIntValue == 1) {
                C17182 c17182 = new C17182(file, false);
                c17182.f51153 = (String) pairCreate.second;
                return c17182;
            }
            if (iIntValue == 2 || iIntValue == 3) {
                return m42108(file, (String) pairCreate.second, null);
            }
            if (iIntValue == 4) {
                C17182 c17183 = new C17182(file, true);
                c17183.f51153 = "";
                return c17183;
            }
        } else if (m42130(path)) {
            return new C17182(file, false);
        }
        if (m42127(path)) {
            return new C13102(file, true);
        }
        AbstractC17043 abstractC17043M26614 = C11561.m26614(file);
        if (abstractC17043M26614 != null) {
            return abstractC17043M26614;
        }
        C10890 c10890M45798 = C20278.m45798(file);
        return c10890M45798 != null ? c10890M45798 : new C13102(file, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m42108(File file, String str, C6671 c6671) {
        String str2;
        int i;
        if (str.regionMatches(true, 0, "Android/data", 0, 12)) {
            str2 = "Android/data";
            i = 14;
        } else {
            if (!str.regionMatches(true, 0, "Android/obb", 0, 11)) {
                throw new IllegalArgumentException("Path must be in Android/data or Android/obb: ".concat(str));
            }
            str2 = "Android/obb";
            i = 13;
        }
        if (!C23770.m52834().mo4996() && (m42126() || (m42129() && str.equalsIgnoreCase(str2)))) {
            return new C13672(new File(f55318, C21459.m48621(7, str, new StringBuilder("\u200bAndroid"))), false);
        }
        if (m42129()) {
            return new C14717(file, C21459.m48621(7, str, new StringBuilder("\u200bAndroid")), "\u200bAndroid", c6671);
        }
        if (Build.VERSION.SDK_INT < 33 || !str.regionMatches(true, 0, str2.concat("/"), 0, str2.length() + 1)) {
            return new C14717(file, str, str2, c6671);
        }
        int iIndexOf = str.indexOf(47, i);
        return iIndexOf == -1 ? new C14717(file, str, str, c6671) : new C14717(file, str, str.substring(0, iIndexOf), c6671);
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m42120(String str) {
        return C21129.m47753(str) != null;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m42130(String str) {
        Iterator it = m42119().iterator();
        while (it.hasNext()) {
            if (m42115(str, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m42121(String str, String str2) {
        if (!str.equals(str2)) {
            int iLastIndexOf = str.lastIndexOf(47) + 1;
            int iLastIndexOf2 = str2.lastIndexOf(47) + 1;
            int length = str.length() - iLastIndexOf;
            if (length != str2.length() - iLastIndexOf2 || !str.regionMatches(true, iLastIndexOf, str2, iLastIndexOf2, length)) {
                return false;
            }
            int i = -1;
            int i2 = -1;
            for (String str3 : m42119()) {
                int length2 = str3.endsWith("/") ? str3.length() : str3.length() + 1;
                int i3 = (i >= 0 || str.length() <= length2 || !m42115(str, str3)) ? i : length2;
                int i4 = (i2 >= 0 || str2.length() <= length2 || !m42115(str2, str3)) ? i2 : length2;
                if (i3 < 0 || i4 < 0) {
                    i = i3;
                    i2 = i4;
                } else {
                    int length3 = str.length() - i3;
                    if (length3 != str2.length() - i4 || !str.regionMatches(true, i3, str2, i4, length3 - length)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m42102(String str) {
        for (String str2 : m42119()) {
            if (m42115(str, str2)) {
                int length = str2.endsWith("/") ? str2.length() : str2.length() + 1;
                if (str.length() > length) {
                    return str.substring(length);
                }
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܿ */
    public static String m42128(String str) {
        String strM42102 = m42102(str);
        String str2 = f55318;
        if (strM42102 != null) {
            return new File(str2, strM42102).getPath();
        }
        return m42130(str) ? str2 : str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m42115(String str, String str2) {
        return m42114(str, 0, str2, str.length(), str2.length());
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m42114(String str, int i, String str2, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > str.length() || i3 < 0 || i3 > str2.length()) {
            return false;
        }
        int i4 = i2 - i;
        if (i4 > 1 && str.charAt(i2 - 1) == '/') {
            i4--;
        }
        if (i3 > 1 && str2.charAt(i3 - 1) == '/') {
            i3--;
        }
        if (i3 <= i4 && str.regionMatches(true, i, str2, 0, i3)) {
            return i4 == i3 || (i3 == 1 && str2.charAt(0) == '/') || str.charAt(i + i3) == '/';
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m42127(String str) {
        String lowerCase = (str.endsWith("/") ? str : str.concat("/")).toLowerCase();
        if (lowerCase.startsWith(C7050.m16237().getAbsolutePath().toLowerCase() + "/")) {
            return true;
        }
        if (!str.startsWith("/data/")) {
            return false;
        }
        String lowerCase2 = C7050.m16234().toLowerCase();
        if (lowerCase.startsWith("/data/data/" + lowerCase2 + "/")) {
            return true;
        }
        if (lowerCase.startsWith("/data/user/0/" + lowerCase2 + "/")) {
            return true;
        }
        if (lowerCase.startsWith("/data/user_de/0/" + lowerCase2 + "/")) {
            return true;
        }
        if (lowerCase.startsWith("/data/user/999/" + lowerCase2 + "/")) {
            return true;
        }
        StringBuilder sb = new StringBuilder("/data/user_de/999/");
        sb.append(lowerCase2);
        sb.append("/");
        return lowerCase.startsWith(sb.toString());
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m42111(AbstractC17043 abstractC17043, String str) {
        AbstractC17043 abstractC17043M38684;
        abstractC17043.mo25497();
        do {
            StringBuilder sb = new StringBuilder();
            int i = f55323;
            f55323 = i + 1;
            sb.append(i);
            sb.append(str);
            abstractC17043M38684 = abstractC17043.m38684(sb.toString());
        } while (abstractC17043M38684.mo25094());
        return abstractC17043M38684;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42112(InterfaceC10399 interfaceC10399) {
        f55319 = interfaceC10399;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m42122(AbstractC17043 abstractC17043) {
        InterfaceC17103 interfaceC17103;
        return ((abstractC17043.mo29978() && abstractC17043.mo29986().m29977()) || (interfaceC17103 = f55319.get()) == null || !interfaceC17103.mo38733(abstractC17043.mo25505())) ? false : true;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m42125(AbstractC17043 abstractC17043) {
        InterfaceC17103 interfaceC17103 = f55319.get();
        if (interfaceC17103 != null) {
            interfaceC17103.mo38734(abstractC17043.mo25505());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42113(AbstractC17043 abstractC17043) {
        if (abstractC17043.mo29978() && abstractC17043.mo29986().m29977()) {
            return;
        }
        InterfaceC17103 interfaceC17103 = f55319.get();
        String strMo25505 = abstractC17043.mo25505();
        if (interfaceC17103 == null || !interfaceC17103.mo38733(strMo25505)) {
            return;
        }
        interfaceC17103.mo38734(strMo25505);
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m42126() {
        File[] fileArrListFiles;
        Boolean bool = f55322;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = f55318;
        if (Arrays.equals(new File(str, AnalyticsConstants.SDK_TYPE).list(), new File(str, "\u200bAndroid").list()) && (fileArrListFiles = new File(str, "\u200bAndroid/data").listFiles()) != null) {
            int i = 0;
            for (File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    try {
                        Os.access(file.getPath(), OsConstants.X_OK);
                        i++;
                        if (i == 20) {
                            break;
                        }
                    } catch (ErrnoException unused) {
                        f55322 = Boolean.FALSE;
                        f55317 = Boolean.TRUE;
                        return false;
                    }
                }
            }
            Boolean bool2 = Boolean.TRUE;
            f55322 = bool2;
            f55317 = bool2;
            return true;
        }
        Boolean bool3 = Boolean.FALSE;
        f55322 = bool3;
        f55317 = bool3;
        return false;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m42129() {
        if (f55317 == null) {
            m42126();
        }
        return f55317.booleanValue();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m42104(AbstractC17043 abstractC17043, AbstractC17043 abstractC17044) {
        String name = abstractC17043.getName();
        String name2 = abstractC17044.getName();
        if (name2.equals(name)) {
            return null;
        }
        if (name2.contains("\\") || name2.contains("/")) {
            return C7050.m16224(R.string.MT_Protector);
        }
        if (name2.equalsIgnoreCase(name)) {
            if (abstractC17044.mo25094()) {
                List listMo29992 = abstractC17044.m38672().mo29992();
                if (listMo29992.contains(name) && listMo29992.contains(name2)) {
                    if (abstractC17044.mo25087()) {
                        return C7050.m16224(R.string.MT_Protector);
                    }
                    return C7050.m16224(R.string.MT_Protector);
                }
            }
            AbstractC17043 abstractC17043M38678 = abstractC17043.m38678(".tmp");
            if (abstractC17043.mo25502(abstractC17043M38678) && abstractC17043M38678.mo25502(abstractC17044)) {
                return null;
            }
            if (name2.contains(":") || name2.contains("?") || name2.contains("*") || name2.contains("\"") || name2.contains("<") || name2.contains(">") || name2.contains("|")) {
                return C7050.m16224(R.string.MT_Protector);
            }
            return C7050.m16224(R.string.MT_Protector);
        }
        if (abstractC17044.mo25094()) {
            if (abstractC17044.mo25087()) {
                return C7050.m16224(R.string.MT_Protector);
            }
            return C7050.m16224(R.string.MT_Protector);
        }
        if (abstractC17043.mo25502(abstractC17044)) {
            return null;
        }
        return C7050.m16224(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m42117(AbstractC17043 abstractC17043, List list) {
        String lowerCase;
        Set<String> set = (Set) C7480.stream(list).map(new C9668(0)).collect(C24205.toUnmodifiableSet());
        if (abstractC17043.mo38688() && abstractC17043.mo20489()) {
            return false;
        }
        for (String str : set) {
            int length = str.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    lowerCase = null;
                    break;
                }
                char cCharAt = str.charAt(0);
                if (cCharAt >= 'a' && cCharAt <= 'z') {
                    lowerCase = str.toUpperCase();
                    break;
                }
                if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    lowerCase = str.toLowerCase();
                    break;
                }
                i++;
            }
            if (lowerCase != null && !set.contains(lowerCase)) {
                return !abstractC17043.m38684(lowerCase).mo25094();
            }
        }
        return true;
    }
}
