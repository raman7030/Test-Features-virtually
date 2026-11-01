package p067l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import bin.p000mt.plus.Main;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0240c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: renamed from: l.֫֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G6MK */
/* JADX INFO: loaded from: classes2.dex */
public final class C3773 {

    /* JADX INFO: renamed from: ֫ */
    public String f8071;

    /* JADX INFO: renamed from: ۜ */
    public boolean f8072;

    /* JADX INFO: renamed from: ۡ */
    public final long f8073;

    /* JADX INFO: renamed from: ۢ */
    public final RunnableC9059 f8074;

    /* JADX INFO: renamed from: ۧ */
    public final ExecutorC24421 f8075;

    /* JADX INFO: renamed from: ܳ */
    public long f8076;

    /* JADX INFO: renamed from: ܽ */
    public Exception f8077;

    /* JADX INFO: renamed from: ܿ */
    public boolean f8078;

    /* JADX INFO: renamed from: ᩳ */
    public final C25092 f8079;

    /* JADX INFO: renamed from: ᩷ */
    public final C6317 f8080;

    /* JADX INFO: renamed from: ᩻ */
    public final Handler f8081;

    public C3773(C6317 c6317, C25092 c25092) {
        ExecutorC24421 executorC24421 = new ExecutorC24421();
        this.f8081 = new Handler(Looper.getMainLooper());
        this.f8074 = new RunnableC9059(1, this);
        this.f8076 = -1L;
        this.f8080 = c6317;
        this.f8079 = c25092;
        this.f8075 = executorC24421;
        this.f8073 = 20000L;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7360() {
        m7357();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m7361() {
        this.f8072 = true;
        this.f8081.removeCallbacks(this.f8074);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public void m7357() {
        if (this.f8072) {
            return;
        }
        C6317 c6317 = this.f8080;
        C21070 c21070 = c6317.f16374;
        if (c21070.f66203 || c21070.f66195 || c21070.f66191 || !c21070.m47537() || c21070.f66187.getActivity() == null || c21070.f66187.requireActivity().isFinishing() || c21070.f66187.requireActivity().isDestroyed()) {
            m7361();
            return;
        }
        C21070 c21071 = c6317.f16374;
        if (c21071.f66187.isResumed() && c21071.f66187.isVisible()) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (this.f8076 < 0) {
                this.f8076 = jUptimeMillis;
            }
            if (this.f8071 != null || this.f8077 != null) {
                m7361();
                String str = this.f8071;
                if (str == null) {
                    c6317.f16374.f66187.f8383.m48823((Throwable) this.f8077);
                    return;
                } else {
                    C21070 c21072 = c6317.f16374;
                    c21072.m47545();
                    Main.m61((ActivityC17874) c21072.f66187.requireActivity(), str);
                    return;
                }
            }
            if (!this.f8078 && jUptimeMillis - this.f8076 >= this.f8073) {
                this.f8078 = true;
                try {
                    this.f8075.execute(new RunnableC17695(this, "foregroundWaitMs=" + (jUptimeMillis - this.f8076) + "\n" + C21070.m47532(c6317.f16374), 1));
                } catch (RuntimeException e) {
                    this.f8077 = e;
                }
            }
        } else {
            this.f8076 = -1L;
        }
        this.f8081.postDelayed(this.f8074, 1000L);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m7356(final C3773 c3773, String str) throws Throwable {
        Handler handler = c3773.f8081;
        try {
            C25092 c25092 = c3773.f8079;
            final String strM7349 = m7349((InterfaceC22097) c25092.f80052, (String) c25092.f80053, str);
            handler.post(new Runnable() { // from class: l.ܰ᩵ᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45507.f8071 = strM7349;
                }
            });
        } catch (Exception e) {
            handler.post(new Runnable() { // from class: l.۟᩵ᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26638.f8077 = e;
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m7349(InterfaceC22097 interfaceC22097, String str, String str2) throws Throwable {
        AbstractC17043 abstractC17043M40542 = C17853.m40542();
        abstractC17043M40542.m38666();
        String str3 = "text-recovery-" + System.currentTimeMillis() + "-" + UUID.randomUUID() + ".zip";
        AbstractC17043 abstractC17043M38684 = abstractC17043M40542.m38684(str3);
        AbstractC17043 abstractC17043M38685 = abstractC17043M40542.m38684(str3 + ".tmp");
        boolean z = false;
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(abstractC17043M38685.m38683());
            try {
                zipOutputStream.setLevel(1);
                m7350(zipOutputStream, "diagnostics.txt", "version=2.26.10 (26101061)\npackage=" + C7050.m16234() + "\nmanufacturer=" + Build.MANUFACTURER + "\nmodel=" + Build.MODEL + "\nandroid=" + Build.VERSION.RELEASE + "\nsdk=" + Build.VERSION.SDK_INT + "\nstateName=" + str + "\ndirectory=" + interfaceC22097 + "\n" + str2);
                m7350(zipOutputStream, "threads.txt", m7358());
                m7350(zipOutputStream, "logcat.txt", m7359());
                ArrayList arrayList = new ArrayList();
                InterfaceC22097 parent = interfaceC22097.toAbsolutePath().normalize().getParent();
                DirectoryStream<InterfaceC22097> directoryStreamNewDirectoryStream = C18743.newDirectoryStream(parent);
                try {
                    for (InterfaceC22097 interfaceC22098 : directoryStreamNewDirectoryStream) {
                        String string = interfaceC22098.getFileName().toString();
                        if (interfaceC22098.equals(interfaceC22097.toAbsolutePath().normalize()) || m7355(string, str)) {
                            arrayList.add(interfaceC22098);
                        }
                    }
                    directoryStreamNewDirectoryStream.close();
                    C8150.sort(arrayList, C10162.comparing(new C12272(2)));
                    StringBuilder sb = new StringBuilder("Live diagnostic copy; no session locks acquired.\nFiles may change while copying; before/after sizes and timestamps follow.\n");
                    if (arrayList.isEmpty()) {
                        sb.append("No session files found.\n");
                    }
                    byte[] bArr = new byte[65536];
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        m7351(zipOutputStream, parent, (InterfaceC22097) it.next(), bArr, sb);
                    }
                    m7350(zipOutputStream, "manifest.txt", sb.toString());
                    zipOutputStream.close();
                    if (!abstractC17043M38685.mo25502(abstractC17043M38684)) {
                        throw new IOException("Cannot publish session diagnostics archive");
                    }
                    try {
                        return abstractC17043M38684.mo25505();
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        if (!z) {
                            abstractC17043M38685.mo25503();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (directoryStreamNewDirectoryStream != null) {
                        try {
                            directoryStreamNewDirectoryStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    zipOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m7355(String str, String str2) {
        int length;
        int length2;
        if (!str.equals(str2.concat(".dat")) && !str.equals(str2.concat(".tat")) && !str.equals(str2.concat(".lit"))) {
            if (!str.startsWith(str2.concat("-")) || !str.endsWith(".dat") || (length2 = str2.length() + 1) == (length = str.length() - 4)) {
                return false;
            }
            for (length2 = str2.length() + 1; length2 < length; length2++) {
                if (str.charAt(length2) < '0' || str.charAt(length2) > '9') {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7351(ZipOutputStream zipOutputStream, InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098, byte[] bArr, StringBuilder sb) throws IOException {
        int i;
        String strReplace = interfaceC22097.relativize(interfaceC22098).toString().replace('\\', '/');
        try {
            EnumC16060 enumC16060 = EnumC16060.NOFOLLOW_LINKS;
            InterfaceC16730 attributes = C18743.readAttributes(interfaceC22098, InterfaceC16730.class, enumC16060);
            if (attributes.isDirectory()) {
                ArrayList arrayList = new ArrayList();
                DirectoryStream directoryStreamNewDirectoryStream = C18743.newDirectoryStream(interfaceC22098);
                try {
                    Iterator it = directoryStreamNewDirectoryStream.iterator();
                    while (it.hasNext()) {
                        arrayList.add((InterfaceC22097) it.next());
                    }
                    directoryStreamNewDirectoryStream.close();
                    C8150.sort(arrayList, C10162.comparing(new C12272(2)));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        m7351(zipOutputStream, interfaceC22097, (InterfaceC22097) it2.next(), bArr, sb);
                    }
                    return;
                } catch (Throwable th) {
                    if (directoryStreamNewDirectoryStream == null) {
                        throw th;
                    }
                    try {
                        directoryStreamNewDirectoryStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            if (attributes.isRegularFile()) {
                try {
                    InputStream inputStreamNewInputStream = C18743.newInputStream(interfaceC22098, enumC16060);
                    try {
                        zipOutputStream.putNextEntry(new ZipEntry("session/" + strReplace));
                        long size = attributes.size();
                        while (size > 0 && (i = inputStreamNewInputStream.read(bArr, 0, (int) Math.min(bArr.length, size))) >= 0) {
                            if (i == 0) {
                                throw new IOException("Session diagnostic read made no progress");
                            }
                            zipOutputStream.write(bArr, 0, i);
                            size -= (long) i;
                        }
                        zipOutputStream.closeEntry();
                        sb.append(strReplace);
                        sb.append(" sizeBefore=");
                        sb.append(attributes.size());
                        sb.append(" copied=");
                        sb.append(attributes.size() - size);
                        sb.append(" modifiedBefore=");
                        sb.append(attributes.lastModifiedTime().toMillis());
                        if (inputStreamNewInputStream != null) {
                            inputStreamNewInputStream.close();
                        }
                        try {
                            InterfaceC16730 attributes2 = C18743.readAttributes(interfaceC22098, InterfaceC16730.class, EnumC16060.NOFOLLOW_LINKS);
                            sb.append(" sizeAfter=");
                            sb.append(attributes2.size());
                            sb.append(" modifiedAfter=");
                            sb.append(attributes2.lastModifiedTime().toMillis());
                        } catch (IOException e) {
                            sb.append(" afterCopy=");
                            sb.append(e);
                        }
                        sb.append('\n');
                        return;
                    } catch (Throwable th3) {
                        if (inputStreamNewInputStream == null) {
                            throw th3;
                        }
                        try {
                            inputStreamNewInputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (IOException e2) {
                    sb.append(strReplace);
                    sb.append(" unavailable: ");
                    sb.append(e2);
                    sb.append('\n');
                    return;
                }
            }
            sb.append(strReplace);
            sb.append(" skipped: not a regular file or directory\n");
        } catch (IOException e3) {
            sb.append(strReplace);
            sb.append(" unavailable: ");
            sb.append(e3);
            sb.append('\n');
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7350(ZipOutputStream zipOutputStream, String str, String str2) throws IOException {
        zipOutputStream.putNextEntry(new ZipEntry(str));
        zipOutputStream.write(str2.getBytes(StandardCharsets.UTF_8));
        zipOutputStream.closeEntry();
    }

    /* JADX INFO: renamed from: ܿ */
    public static String m7358() {
        StringBuilder sb = new StringBuilder();
        ArrayList<Map.Entry> arrayList = new ArrayList(Thread.getAllStackTraces().entrySet());
        C8150.sort(arrayList, C10162.comparing(new C14929(1)));
        for (Map.Entry entry : arrayList) {
            Thread thread = (Thread) entry.getKey();
            sb.append('\"');
            sb.append(thread.getName());
            sb.append("\" id=");
            sb.append(thread.getId());
            sb.append(" state=");
            sb.append(thread.getState());
            sb.append('\n');
            for (StackTraceElement stackTraceElement : (StackTraceElement[]) entry.getValue()) {
                sb.append("    at ");
                sb.append(stackTraceElement);
                sb.append('\n');
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ᩳ */
    public static String m7359() {
        Process process = null;
        try {
            try {
                Process processStart = new ProcessBuilder("logcat", "-d", "-t", "2000", "-v", "threadtime").redirectErrorStream(true).start();
                InputStream inputStream = processStart.getInputStream();
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[8192];
                        long jUptimeMillis = SystemClock.uptimeMillis() + C0240c.f1145a;
                        while (SystemClock.uptimeMillis() < jUptimeMillis && byteArrayOutputStream.size() < 2097152) {
                            int iAvailable = inputStream.available();
                            if (iAvailable > 0) {
                                int i = inputStream.read(bArr, 0, Math.min(8192, iAvailable));
                                if (i < 0) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i);
                            } else {
                                try {
                                    processStart.exitValue();
                                    break;
                                } catch (IllegalThreadStateException unused) {
                                    Thread.sleep(20L);
                                }
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th) {
                                    th.addSuppressed(th);
                                }
                            }
                            throw th;
                        }
                        String str = byteArrayOutputStream.toString(C0233a.f1077D) + "\n[Log capture bounded to 2000 entries, 2 MiB and 3 seconds]\n";
                        byteArrayOutputStream.close();
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        processStart.destroy();
                        return str;
                    } catch (Throwable th2) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th4;
                }
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                String str2 = "Logcat unavailable: " + e + "\n";
                if (0 != 0) {
                    process.destroy();
                }
                return str2;
            }
        } catch (Throwable th5) {
            if (0 != 0) {
                process.destroy();
            }
            throw th5;
        }
    }
}
