package p067l;

import android.text.TextUtils;
import bin.p000mt.json.JSONObject;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ۧᩴۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47AI */
/* JADX INFO: loaded from: classes3.dex */
public final class C12997 {

    /* JADX INFO: renamed from: ܽ */
    public static final InterfaceC7514 f36569 = new C11914();

    /* JADX INFO: renamed from: ֫ */
    public final C24395 f36570;

    /* JADX INFO: renamed from: ۧ */
    public final ExecutorService f36571 = Executors.newCachedThreadPool(new ThreadFactoryC9231());

    /* JADX INFO: renamed from: ֫ */
    public static void m29798(C12997 c12997, C13255 c13255, PipedOutputStream pipedOutputStream) throws Throwable {
        c12997.getClass();
        C7890 c7890 = null;
        try {
            C7890 c7891 = new C7890(pipedOutputStream);
            try {
                c7891.setLevel(1);
                HashSet hashSet = new HashSet();
                for (C15265 c15265 : c13255.f37222) {
                    m29797(c7891, hashSet, c15265.f43568, c15265.f43567);
                }
                c7891.close();
            } catch (IOException | RuntimeException | C23983 unused) {
                c7890 = c7891;
                try {
                    pipedOutputStream.close();
                } catch (IOException unused2) {
                }
                if (c7890 != null) {
                    C7890.m18237(c7890);
                }
            } catch (Throwable th) {
                th = th;
                c7890 = c7891;
                try {
                    pipedOutputStream.close();
                } catch (IOException unused3) {
                }
                if (c7890 == null) {
                    throw th;
                }
                C7890.m18237(c7890);
                throw th;
            }
        } catch (IOException | RuntimeException | C23983 unused4) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public C12997(C5109 c5109, C24395 c24395) {
        this.f36570 = c24395;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C3608 m29795(String str) {
        C4279 c4279;
        ArrayList arrayList;
        try {
            JSONObject jSONObjectM19681 = C8461.m19681(str);
            c4279 = new C4279();
            c4279.f9502 = C8461.m19689(jSONObjectM19681, "basePath");
            c4279.f9503 = C8461.m19685(jSONObjectM19681);
            c4279.f9501 = C8461.m19689(jSONObjectM19681, "archiveName");
        } catch (C24554 unused) {
            c4279 = null;
        }
        if (c4279 == null || TextUtils.isEmpty(c4279.f9502) || (arrayList = c4279.f9503) == null || arrayList.isEmpty()) {
            throw new C23983();
        }
        String strM41972 = AbstractC18422.m41972(m29799(c4279.f9502));
        ArrayList arrayList2 = new ArrayList(c4279.f9503.size());
        Iterator it = c4279.f9503.iterator();
        while (it.hasNext()) {
            arrayList2.add(m29799((String) it.next()));
        }
        String str2 = c4279.f9501;
        String strTrim = TextUtils.isEmpty(str2) ? "download.zip" : str2.trim();
        StringBuilder sb = new StringBuilder(strTrim.length());
        for (int i = 0; i < strTrim.length(); i++) {
            char cCharAt = strTrim.charAt(i);
            if (cCharAt <= 31 || cCharAt == '/' || cCharAt == '\\' || cCharAt == ':' || cCharAt == '*' || cCharAt == '?' || cCharAt == '\"' || cCharAt == '<' || cCharAt == '>' || cCharAt == '|') {
                sb.append('_');
            } else {
                sb.append(cCharAt);
            }
        }
        String strTrim2 = sb.toString().trim();
        String strConcat = TextUtils.isEmpty(strTrim2) ? "download.zip" : strTrim2;
        if (!strConcat.toLowerCase(Locale.ROOT).endsWith(".zip")) {
            strConcat = strConcat.concat(".zip");
        }
        C3608 c3608 = new C3608(strM41972, strConcat, arrayList2);
        m29796(c3608);
        return c3608;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10196 m29801(C17571 c17571, C17018 c17018) {
        PipedInputStream pipedInputStream;
        if (!EnumC6173.GET.equals(c17571.m39993())) {
            return C5109.m10885(EnumC3490.METHOD_NOT_ALLOWED, C7050.m16203(R.string.MT_Protector, new Object[0]));
        }
        if (!TextUtils.isEmpty(C18658.m42476(c17571, "range"))) {
            return AbstractC6843.m15660(f36569, "text/plain", "");
        }
        PipedOutputStream pipedOutputStream = null;
        C3608 c3608 = c17018 == null ? null : c17018.f50339;
        if (c3608 == null) {
            return C5109.m10885(EnumC3490.UNAUTHORIZED, C7050.m16203(R.string.MT_Protector, new Object[0]));
        }
        try {
            final C13255 c13255M29796 = m29796(c3608);
            if (!this.f36570.m53792(c17018.f50340)) {
                return C5109.m10885(EnumC3490.UNAUTHORIZED, C7050.m16203(R.string.MT_Protector, new Object[0]));
            }
            try {
                pipedInputStream = new PipedInputStream(262144);
                try {
                    final PipedOutputStream pipedOutputStream2 = new PipedOutputStream(pipedInputStream);
                    try {
                        this.f36571.execute(new Runnable() { // from class: l.۫ۘۢ
                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                C12997.m29798(this.f39286, c13255M29796, pipedOutputStream2);
                            }
                        });
                        C10196 c10196M15658 = AbstractC6843.m15658(EnumC3490.OK, pipedInputStream);
                        c10196M15658.m23774("Content-Disposition", C13017.m29833(c13255M29796.f37221, "attachment"));
                        c10196M15658.m23774("Referrer-Policy", "no-referrer");
                        return c10196M15658;
                    } catch (IOException | RuntimeException unused) {
                        pipedOutputStream = pipedOutputStream2;
                        if (pipedOutputStream != null) {
                            try {
                                pipedOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        if (pipedInputStream != null) {
                            try {
                                pipedInputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        return C5109.m10885(EnumC3490.INTERNAL_ERROR, C7050.m16203(R.string.MT_Protector, new Object[0]));
                    }
                } catch (IOException | RuntimeException unused4) {
                }
            } catch (IOException | RuntimeException unused5) {
                pipedInputStream = null;
            }
        } catch (C23983 unused6) {
            return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29802() {
        this.f36571.shutdownNow();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13255 m29796(C3608 c3608) throws C23983 {
        String strSubstring;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (String str : c3608.f7446) {
            String strConcat = c3608.f7445;
            if (!"/".equals(strConcat)) {
                if (!strConcat.endsWith("/")) {
                    strConcat = strConcat.concat("/");
                }
                if (!str.startsWith(strConcat) || str.length() <= strConcat.length()) {
                    throw new C23983();
                }
                strSubstring = str.substring(strConcat.length());
            } else {
                if (!str.startsWith("/") || str.length() <= 1) {
                    throw new C23983();
                }
                strSubstring = str.substring(1);
            }
            if (strSubstring.contains("/")) {
                throw new C23983();
            }
            m29800(strSubstring);
            AbstractC17043 abstractC17043M42109 = C18524.m42109(str, new String[0]);
            m29800(strSubstring);
            if (!abstractC17043M42109.mo25094() || abstractC17043M42109.m38691()) {
                throw new C23983();
            }
            if (!hashSet.add((!abstractC17043M42109.mo25087() || strSubstring.endsWith("/")) ? strSubstring : strSubstring.concat("/"))) {
                throw new C23983();
            }
            arrayList.add(new C15265(abstractC17043M42109, strSubstring));
        }
        return new C13255(c3608.f7444, arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29797(ZipOutputStream zipOutputStream, HashSet hashSet, AbstractC17043 abstractC17043, String str) throws C23983, IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("Archive stream interrupted");
        }
        m29800(str);
        if (abstractC17043.m38691()) {
            throw new C23983();
        }
        if (abstractC17043.mo25087()) {
            if (!str.endsWith("/")) {
                str = str.concat("/");
            }
            long jMo25091 = abstractC17043.mo25091();
            if (!hashSet.add(str)) {
                throw new C23983();
            }
            ZipEntry zipEntry = new ZipEntry(str);
            if (jMo25091 > 0) {
                zipEntry.setTime(jMo25091);
            }
            zipOutputStream.putNextEntry(zipEntry);
            zipOutputStream.closeEntry();
            ArrayList<AbstractC17043> arrayList = new ArrayList(abstractC17043.mo25500(true));
            C8150.sort(arrayList, C16866.thenComparing(C10162.comparing(new C9668(0), String.CASE_INSENSITIVE_ORDER), new C9668(0)));
            for (AbstractC17043 abstractC17044 : arrayList) {
                StringBuilder sbM17248 = C7470.m17248(str);
                sbM17248.append(abstractC17044.getName());
                m29797(zipOutputStream, hashSet, abstractC17044, sbM17248.toString());
            }
            return;
        }
        long jMo25092 = abstractC17043.mo25091();
        if (!hashSet.add(str)) {
            throw new C23983();
        }
        ZipEntry zipEntry2 = new ZipEntry(str);
        if (jMo25092 > 0) {
            zipEntry2.setTime(jMo25092);
        }
        zipOutputStream.putNextEntry(zipEntry2);
        try {
            InputStream inputStreamMo29987 = abstractC17043.mo29987();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = inputStreamMo29987.read(bArr);
                    if (i == -1) {
                        inputStreamMo29987.close();
                        zipOutputStream.closeEntry();
                        return;
                    } else {
                        if (Thread.currentThread().isInterrupted()) {
                            throw new InterruptedIOException("Archive stream interrupted");
                        }
                        zipOutputStream.write(bArr, 0, i);
                    }
                    zipOutputStream.closeEntry();
                    throw th;
                }
            } catch (Throwable th) {
                if (inputStreamMo29987 != null) {
                    try {
                        inputStreamMo29987.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            zipOutputStream.closeEntry();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m29799(String str) throws C23983 {
        if (TextUtils.isEmpty(str)) {
            throw new C23983();
        }
        String strReplace = str.replace('\\', '/');
        if (!strReplace.startsWith("/")) {
            strReplace = "/".concat(strReplace);
        }
        while (strReplace.length() > 1 && strReplace.endsWith("/")) {
            strReplace = C17073.m38720(1, 0, strReplace);
        }
        if (strReplace.contains(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)) {
            throw new C23983();
        }
        return strReplace;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m29800(String str) throws C23983 {
        if (TextUtils.isEmpty(str) || str.startsWith("/") || str.contains("\\") || str.contains("//")) {
            throw new C23983();
        }
        for (String str2 : str.split("/")) {
            if (TextUtils.isEmpty(str2) || ".".equals(str2) || "..".equals(str2)) {
                throw new C23983();
            }
        }
    }
}
