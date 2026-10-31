package l;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Pair;
import bin.mt.plus.Features3;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
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
public final class C16999 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f52136 = 0;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static Boolean f52137;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final String f52138;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static InterfaceC8449 f52139;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C18955 f52140;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean f52141;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Boolean f52142;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static int f52143;

    static {
        String path = Environment.getExternalStorageDirectory().getPath();
        f52138 = path;
        f52143 = (int) (System.currentTimeMillis() & 16777215);
        C18955 c18955 = new C18955();
        f52140 = c18955;
        f52141 = true;
        f52139 = new C23202(0);
        c18955.add(path);
        c18955.add("/sdcard");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m39858() {
        return f52138;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C18955 m39876() {
        C19697 c19697M10607;
        boolean z = f52141;
        C18955 c18955 = f52140;
        if (z && C22518.m50491() && !C3468.m10612()) {
            f52141 = false;
            LinkedList linkedList = new LinkedList(c18955);
            try {
                c19697M10607 = C3468.m10607(false);
                while (!linkedList.isEmpty()) {
                    try {
                        C17642 c17642M45366 = c19697M10607.m45366(new File((String) linkedList.removeFirst()).getPath());
                        if (c17642M45366.m41285() != null) {
                            String strM41285 = c17642M45366.m41285();
                            if (c18955.add(strM41285)) {
                                linkedList.addLast(strM41285);
                            } else {
                                continue;
                            }
                        }
                    } catch (Throwable unused) {
                        if (c19697M10607 != null) {
                            c19697M10607.m45389();
                        }
                        return c18955;
                    }
                }
                c19697M10607.m45389();
                return c18955;
            } catch (Throwable unused2) {
                c19697M10607 = null;
            }
        }
        return c18955;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m39873(AbstractActivityC3346 abstractActivityC3346) {
        if (abstractActivityC3346.getIntent().getData() != null) {
            return false;
        }
        abstractActivityC3346.finish();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m39862(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            throw new NullPointerException("Intent data is null: " + intent);
        }
        return m39863(data);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m39867(ActivityC2124 activityC2124) {
        Intent intent = activityC2124.getIntent();
        Uri data = intent.getData();
        if (data == null) {
            data = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
        }
        if (data == null) {
            throw new NullPointerException("Intent data is null: " + intent);
        }
        return m39863(data);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m39863(Uri uri) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        String path;
        if ("file".equals(uri.getScheme())) {
            String path2 = uri.getPath();
            C11003.requireNonNull(path2);
            return m39866(C23908.m52661(path2), new String[0]);
        }
        if ("content".equals(uri.getScheme())) {
            String host = uri.getHost();
            if (C11914.f35616.equals(host)) {
                return C11914.m29047(uri);
            }
            if ("bin.mt.plus.fileprovider2".equals(host) || "bin.mt.plus.canary.fileprovider2".equals(host) || "bin.mt.plus.fp".equals(host) || "bin.mt.plus.canary.fp".equals(host)) {
                String path3 = uri.getPath();
                if (path3 != null && !path3.startsWith("/NOT_DELETE/")) {
                    return m39866(path3, new String[0]);
                }
            } else if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                String strM34871 = C14609.m34871(uri);
                if (strM34871 != null) {
                    if ("primary".equals(strM34871)) {
                        return C16293.f50120.m36526(C14609.m34869(uri).getPathSegments().get(3).substring(strM34871.length() + 1));
                    }
                    for (C4216 c4216 : (ArrayList) C19739.m45452(null)) {
                        if (c4216.f13688.equals(strM34871)) {
                            return m39866(c4216.f13687.getAbsolutePath(), C14609.m34869(uri).getPathSegments().get(3).substring(strM34871.length() + 1));
                        }
                    }
                }
            } else if ("com.android.providers.downloads.ui.fileprovider".equals(uri.getAuthority()) && (path = uri.getPath()) != null && path.startsWith("/external_files/Download/")) {
                return C16293.f50120.m36526(path.substring(16));
            }
            String strM52660 = C23908.m52660(uri);
            if (strM52660 != null) {
                AbstractC15440 abstractC15440M39866 = m39866(strM52660, new String[0]);
                if (abstractC15440M39866.mo27936()) {
                    if (Build.VERSION.SDK_INT >= 30) {
                        InterfaceC0645 interfaceC0645M50492 = C22518.m50492();
                        if (!interfaceC0645M50492.mo2657()) {
                            try {
                                if (abstractC15440M39866 instanceof C12993) {
                                    C12993 c12993 = (C12993) abstractC15440M39866;
                                    if (interfaceC0645M50492.mo2658()) {
                                        Future futureSubmit = C1802.f6208.submit(new CallableC14029(0, c12993));
                                        try {
                                            if (futureSubmit.get(1L, TimeUnit.SECONDS) == Boolean.TRUE) {
                                                if (!futureSubmit.isDone()) {
                                                    futureSubmit.cancel(true);
                                                    return abstractC15440M39866;
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
                                    } else if (c12993.mo31568() && (parcelFileDescriptorOpenFileDescriptor = C4925.m14336().openFileDescriptor(c12993.mo31567(), "r")) != null) {
                                        parcelFileDescriptorOpenFileDescriptor.close();
                                        return abstractC15440M39866;
                                    }
                                } else if (abstractC15440M39866 instanceof C11893) {
                                    ((C11893) abstractC15440M39866).mo27926().close();
                                }
                            } catch (Exception unused2) {
                            }
                        }
                    }
                    return abstractC15440M39866;
                }
            }
            return new C14798(uri);
        }
        throw new RuntimeException("Unsupported uri: " + uri);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440[] m39875(String[] strArr) {
        AbstractC15440[] abstractC15440Arr = new AbstractC15440[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            abstractC15440Arr[i] = m39866(strArr[i], new String[0]);
        }
        return abstractC15440Arr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m39860(String str, boolean z) throws IOException {
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
                        C18473.m42953(arrayList, 1);
                    } else {
                        if (strSubstring.length() >= 2 && Character.isLetter(strSubstring.charAt(0)) && strSubstring.charAt(1) == ':') {
                            throw new IOException("Unsafe archive entry path: ".concat(str));
                        }
                        arrayList.add(m39880(strSubstring));
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m39881(String str, String str2) throws IOException {
        if (!str2.isEmpty()) {
            int i = 0;
            if (str2.indexOf(0) < 0 && !str2.startsWith("/") && !str2.startsWith("\\")) {
                if (str2.length() >= 2 && Character.isLetter(str2.charAt(0)) && str2.charAt(1) == ':') {
                    throw new IOException("Unsafe archive symbolic link target: ".concat(str2));
                }
                String strM39860 = m39860(str, false);
                ArrayList arrayList = new ArrayList();
                int iLastIndexOf = strM39860.lastIndexOf(47);
                if (iLastIndexOf != -1) {
                    int i2 = 0;
                    for (int i3 = 0; i3 < iLastIndexOf; i3++) {
                        if (strM39860.charAt(i3) == '/') {
                            arrayList.add(strM39860.substring(i2, i3));
                            i2 = i3 + 1;
                        }
                    }
                    arrayList.add(strM39860.substring(i2, iLastIndexOf));
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
                                C18473.m42953(arrayList2, 1);
                            } else {
                                if (strSubstring.length() >= 2 && Character.isLetter(strSubstring.charAt(0)) && strSubstring.charAt(1) == ':') {
                                    throw new IOException("Unsafe archive symbolic link target: ".concat(str2));
                                }
                                arrayList2.add(m39880(strSubstring));
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
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m39880(String str) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m39866(String str, String... strArr) {
        String strM39859;
        if (str.startsWith("content://") || str.startsWith("android.resource://")) {
            if (strArr.length != 0) {
                throw new IllegalArgumentException("Children must be empty when path is context uri");
            }
            return new C14798(Uri.parse(str));
        }
        if (str.startsWith("$RECYCLE.BIN$/")) {
            str = C21939.m49419().mo23554() + str.substring(13);
            if (C22518.m50492().mo2657() && (strM39859 = m39859(str)) != null) {
                str = "/data/media/" + C16293.f50120.getName() + "/" + strM39859;
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
        return m39864(file);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00da  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e1  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m39864(File file) {
        Pair pairCreate;
        String strM58;
        String path = file.getPath();
        if (Build.VERSION.SDK_INT >= 30) {
            Iterator it = m39876().iterator();
            while (true) {
                if (!it.hasNext()) {
                    pairCreate = Pair.create(0, null);
                    break;
                }
                String str = (String) it.next();
                if (m39872(path, str)) {
                    int length = str.length();
                    int i = length + 1;
                    if (!m39871(path, i, "android", path.length(), 7)) {
                        if (path.length() == str.length()) {
                            strM58 = Features3.m58(path);
                        } else {
                            strM58 = null;
                        }
                        if (strM58 == null) {
                            strM58 = "";
                        }
                        pairCreate = Pair.create(1, strM58);
                        break;
                    }
                    int i2 = length + 9;
                    if (!m39871(path, i2, e.m, path.length(), 4)) {
                        if (!m39871(path, i2, "obb", path.length(), 3)) {
                            if (path.length() == str.length()) {
                                strM58 = Features3.m58(path);
                            } else {
                                strM58 = null;
                            }
                            if (strM58 == null) {
                                strM58 = "";
                            }
                            pairCreate = Pair.create(1, strM58);
                            break;
                        }
                        String strM14337 = C4925.m14337();
                        if (!m39871(path, length + 13, strM14337, path.length(), strM14337.length())) {
                            pairCreate = Pair.create(3, path.substring(i, path.endsWith("/") ? path.length() - 1 : path.length()));
                            break;
                        }
                        pairCreate = Pair.create(4, null);
                        break;
                    }
                    String strM14338 = C4925.m14337();
                    if (!m39871(path, length + 14, strM14338, path.length(), strM14338.length())) {
                        pairCreate = Pair.create(2, path.substring(i, path.endsWith("/") ? path.length() - 1 : path.length()));
                        break;
                    }
                    pairCreate = Pair.create(4, null);
                    break;
                }
            }
            int iIntValue = ((Integer) pairCreate.first).intValue();
            if (iIntValue == 1) {
                C15587 c15587 = new C15587(file, false);
                c15587.f48021 = (String) pairCreate.second;
                return c15587;
            }
            if (iIntValue == 2 || iIntValue == 3) {
                return m39865(file, (String) pairCreate.second, null);
            }
            if (iIntValue == 4) {
                C15587 c15588 = new C15587(file, true);
                c15588.f48021 = "";
                return c15588;
            }
        } else if (m39887(path)) {
            return new C15587(file, false);
        }
        if (m39884(path)) {
            return new C11293(file, true);
        }
        AbstractC15440 abstractC15440M24600 = C9672.m24600(file);
        if (abstractC15440M24600 != null) {
            return abstractC15440M24600;
        }
        C8966 c8966M43532 = C18844.m43532(file);
        return c8966M43532 != null ? c8966M43532 : new C11293(file, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m39865(File file, String str, C4527 c4527) {
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
        if (!C22518.m50492().mo2656() && (m39883() || (m39886() && str.equalsIgnoreCase(str2)))) {
            return new C11893(new File(f52138, C20087.m46305(7, str, new StringBuilder("\u200bAndroid"))), false);
        }
        if (m39886()) {
            return new C12993(file, C20087.m46305(7, str, new StringBuilder("\u200bAndroid")), "\u200bAndroid", c4527);
        }
        if (Build.VERSION.SDK_INT < 33 || !str.regionMatches(true, 0, str2.concat("/"), 0, str2.length() + 1)) {
            return new C12993(file, str, str2, c4527);
        }
        int iIndexOf = str.indexOf(47, i);
        return iIndexOf == -1 ? new C12993(file, str, str, c4527) : new C12993(file, str, str.substring(0, iIndexOf), c4527);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m39877(String str) {
        return C19739.m45449(str) != null;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m39887(String str) {
        Iterator it = m39876().iterator();
        while (it.hasNext()) {
            if (m39872(str, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m39878(String str, String str2) {
        if (!str.equals(str2)) {
            int iLastIndexOf = str.lastIndexOf(47) + 1;
            int iLastIndexOf2 = str2.lastIndexOf(47) + 1;
            int length = str.length() - iLastIndexOf;
            if (length != str2.length() - iLastIndexOf2 || !str.regionMatches(true, iLastIndexOf, str2, iLastIndexOf2, length)) {
                return false;
            }
            int i = -1;
            int i2 = -1;
            for (String str3 : m39876()) {
                int length2 = str3.endsWith("/") ? str3.length() : str3.length() + 1;
                int i3 = (i >= 0 || str.length() <= length2 || !m39872(str, str3)) ? i : length2;
                int i4 = (i2 >= 0 || str2.length() <= length2 || !m39872(str2, str3)) ? i2 : length2;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m39859(String str) {
        for (String str2 : m39876()) {
            if (m39872(str, str2)) {
                int length = str2.endsWith("/") ? str2.length() : str2.length() + 1;
                if (str.length() > length) {
                    return str.substring(length);
                }
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m39885(String str) {
        String strM39859 = m39859(str);
        String str2 = f52138;
        if (strM39859 != null) {
            return new File(str2, strM39859).getPath();
        }
        return m39887(str) ? str2 : str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m39872(String str, String str2) {
        return m39871(str, 0, str2, str.length(), str2.length());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m39871(String str, int i, String str2, int i2, int i3) {
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m39884(String str) {
        String lowerCase = (str.endsWith("/") ? str : str.concat("/")).toLowerCase();
        if (lowerCase.startsWith(C4925.m14340().getAbsolutePath().toLowerCase() + "/")) {
            return true;
        }
        if (!str.startsWith("/data/")) {
            return false;
        }
        String lowerCase2 = C4925.m14337().toLowerCase();
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m39868(AbstractC15440 abstractC15440, String str) {
        AbstractC15440 abstractC15440M36526;
        abstractC15440.mo23546();
        do {
            StringBuilder sb = new StringBuilder();
            int i = f52143;
            f52143 = i + 1;
            sb.append(i);
            sb.append(str);
            abstractC15440M36526 = abstractC15440.m36526(sb.toString());
        } while (abstractC15440M36526.mo23120());
        return abstractC15440M36526;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39869(InterfaceC8449 interfaceC8449) {
        f52139 = interfaceC8449;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m39879(AbstractC15440 abstractC15440) {
        InterfaceC15503 interfaceC15503;
        return ((abstractC15440.mo27917() && abstractC15440.mo27925().m27916()) || (interfaceC15503 = f52139.get()) == null || !interfaceC15503.mo36574(abstractC15440.mo23554())) ? false : true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m39882(AbstractC15440 abstractC15440) {
        InterfaceC15503 interfaceC15503 = f52139.get();
        if (interfaceC15503 != null) {
            interfaceC15503.mo36575(abstractC15440.mo23554());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39870(AbstractC15440 abstractC15440) {
        if (abstractC15440.mo27917() && abstractC15440.mo27925().m27916()) {
            return;
        }
        InterfaceC15503 interfaceC15503 = f52139.get();
        String strMo23554 = abstractC15440.mo23554();
        if (interfaceC15503 == null || !interfaceC15503.mo36574(strMo23554)) {
            return;
        }
        interfaceC15503.mo36575(strMo23554);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m39883() {
        File[] fileArrListFiles;
        Boolean bool = f52142;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = f52138;
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
                        f52142 = Boolean.FALSE;
                        f52137 = Boolean.TRUE;
                        return false;
                    }
                }
            }
            Boolean bool2 = Boolean.TRUE;
            f52142 = bool2;
            f52137 = bool2;
            return true;
        }
        Boolean bool3 = Boolean.FALSE;
        f52142 = bool3;
        f52137 = bool3;
        return false;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m39886() {
        if (f52137 == null) {
            m39883();
        }
        return f52137.booleanValue();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m39861(AbstractC15440 abstractC15440, AbstractC15440 abstractC15441) {
        String name = abstractC15440.getName();
        String name2 = abstractC15441.getName();
        if (name2.equals(name)) {
            return null;
        }
        if (name2.contains("\\") || name2.contains("/")) {
            return C4925.m14327(R.string.MT_Protector);
        }
        if (name2.equalsIgnoreCase(name)) {
            if (abstractC15441.mo23120()) {
                List listMo27931 = abstractC15441.m36514().mo27931();
                if (listMo27931.contains(name) && listMo27931.contains(name2)) {
                    if (abstractC15441.mo23113()) {
                        return C4925.m14327(R.string.MT_Protector);
                    }
                    return C4925.m14327(R.string.MT_Protector);
                }
            }
            AbstractC15440 abstractC15440M36520 = abstractC15440.m36520(".tmp");
            if (abstractC15440.mo23551(abstractC15440M36520) && abstractC15440M36520.mo23551(abstractC15441)) {
                return null;
            }
            if (name2.contains(":") || name2.contains("?") || name2.contains("*") || name2.contains("\"") || name2.contains("<") || name2.contains(">") || name2.contains("|")) {
                return C4925.m14327(R.string.MT_Protector);
            }
            return C4925.m14327(R.string.MT_Protector);
        }
        if (abstractC15441.mo23120()) {
            if (abstractC15441.mo23113()) {
                return C4925.m14327(R.string.MT_Protector);
            }
            return C4925.m14327(R.string.MT_Protector);
        }
        if (abstractC15440.mo23551(abstractC15441)) {
            return null;
        }
        return C4925.m14327(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m39874(AbstractC15440 abstractC15440, List list) {
        String lowerCase;
        Set<String> set = (Set) C5378.stream(list).map(new C7680(0)).collect(C22976.toUnmodifiableSet());
        if (abstractC15440.mo36530() && abstractC15440.mo18540()) {
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
                return !abstractC15440.m36526(lowerCase).mo23120();
            }
        }
        return true;
    }
}
