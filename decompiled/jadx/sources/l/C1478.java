package l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import bin.mt.plus.Main;
import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.c;
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
public final class C1478 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f5298;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f5299;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long f5300;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final RunnableC7039 f5301;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ExecutorC23203 f5302;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f5303;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Exception f5304;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f5305;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23909 f5306;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C4154 f5307;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Handler f5308;

    public C1478(C4154 c4154, C23909 c23909) {
        ExecutorC23203 executorC23203 = new ExecutorC23203();
        this.f5308 = new Handler(Looper.getMainLooper());
        this.f5301 = new RunnableC7039(1, this);
        this.f5303 = -1L;
        this.f5307 = c4154;
        this.f5306 = c23909;
        this.f5302 = executorC23203;
        this.f5300 = 20000L;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5118() {
        m5115();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m5119() {
        this.f5299 = true;
        this.f5308.removeCallbacks(this.f5301);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m5115() {
        if (this.f5299) {
            return;
        }
        C4154 c4154 = this.f5307;
        C19677 c19677 = c4154.f13560;
        if (c19677.f63582 || c19677.f63574 || c19677.f63570 || !c19677.m45240() || c19677.f63566.getActivity() == null || c19677.f63566.requireActivity().isFinishing() || c19677.f63566.requireActivity().isDestroyed()) {
            m5119();
            return;
        }
        C19677 c19678 = c4154.f13560;
        if (c19678.f63566.isResumed() && c19678.f63566.isVisible()) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (this.f5303 < 0) {
                this.f5303 = jUptimeMillis;
            }
            if (this.f5298 != null || this.f5304 != null) {
                m5119();
                String str = this.f5298;
                if (str == null) {
                    c4154.f13560.f63566.f5603.m46502((Throwable) this.f5304);
                    return;
                } else {
                    C19677 c19679 = c4154.f13560;
                    c19679.m45248();
                    Main.m63((ActivityC16315) c19679.f63566.requireActivity(), str);
                    return;
                }
            }
            if (!this.f5305 && jUptimeMillis - this.f5303 >= this.f5300) {
                this.f5305 = true;
                try {
                    this.f5302.execute(new RunnableC16126(this, "foregroundWaitMs=" + (jUptimeMillis - this.f5303) + "\n" + C19677.m45235(c4154.f13560), 1));
                } catch (RuntimeException e) {
                    this.f5304 = e;
                }
            }
        } else {
            this.f5303 = -1L;
        }
        this.f5308.postDelayed(this.f5301, 1000L);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m5114(final C1478 c1478, String str) throws Throwable {
        Handler handler = c1478.f5308;
        try {
            C23909 c23909 = c1478.f5306;
            final String strM5107 = m5107((InterfaceC20758) c23909.f77301, (String) c23909.f77302, str);
            handler.post(new Runnable() { // from class: l.ܰ᩵ᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42424.f5298 = strM5107;
                }
            });
        } catch (Exception e) {
            handler.post(new Runnable() { // from class: l.۟᩵ᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23725.f5304 = e;
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m5107(InterfaceC20758 interfaceC20758, String str, String str2) throws Throwable {
        AbstractC15440 abstractC15440M38327 = C16293.m38327();
        abstractC15440M38327.m36508();
        String str3 = "text-recovery-" + System.currentTimeMillis() + "-" + UUID.randomUUID() + ".zip";
        AbstractC15440 abstractC15440M36526 = abstractC15440M38327.m36526(str3);
        AbstractC15440 abstractC15440M36527 = abstractC15440M38327.m36526(str3 + ".tmp");
        boolean z = false;
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(abstractC15440M36527.m36525());
            try {
                zipOutputStream.setLevel(1);
                m5108(zipOutputStream, "diagnostics.txt", "version=2.26.10 (26101061)\npackage=" + C4925.m14337() + "\nmanufacturer=" + Build.MANUFACTURER + "\nmodel=" + Build.MODEL + "\nandroid=" + Build.VERSION.RELEASE + "\nsdk=" + Build.VERSION.SDK_INT + "\nstateName=" + str + "\ndirectory=" + interfaceC20758 + "\n" + str2);
                m5108(zipOutputStream, "threads.txt", m5116());
                m5108(zipOutputStream, "logcat.txt", m5117());
                ArrayList arrayList = new ArrayList();
                InterfaceC20758 parent = interfaceC20758.toAbsolutePath().normalize().getParent();
                DirectoryStream<InterfaceC20758> directoryStreamNewDirectoryStream = C17229.newDirectoryStream(parent);
                try {
                    for (InterfaceC20758 interfaceC20759 : directoryStreamNewDirectoryStream) {
                        String string = interfaceC20759.getFileName().toString();
                        if (interfaceC20759.equals(interfaceC20758.toAbsolutePath().normalize()) || m5113(string, str)) {
                            arrayList.add(interfaceC20759);
                        }
                    }
                    directoryStreamNewDirectoryStream.close();
                    C6083.sort(arrayList, C8200.comparing(new C10420(2)));
                    StringBuilder sb = new StringBuilder("Live diagnostic copy; no session locks acquired.\nFiles may change while copying; before/after sizes and timestamps follow.\n");
                    if (arrayList.isEmpty()) {
                        sb.append("No session files found.\n");
                    }
                    byte[] bArr = new byte[65536];
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        m5109(zipOutputStream, parent, (InterfaceC20758) it.next(), bArr, sb);
                    }
                    m5108(zipOutputStream, "manifest.txt", sb.toString());
                    zipOutputStream.close();
                    if (!abstractC15440M36527.mo23551(abstractC15440M36526)) {
                        throw new IOException("Cannot publish session diagnostics archive");
                    }
                    try {
                        return abstractC15440M36526.mo23554();
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        if (!z) {
                            abstractC15440M36527.mo23552();
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m5113(String str, String str2) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5109(ZipOutputStream zipOutputStream, InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC20759, byte[] bArr, StringBuilder sb) throws IOException {
        int i;
        String strReplace = interfaceC20758.relativize(interfaceC20759).toString().replace('\\', '/');
        try {
            EnumC14406 enumC14406 = EnumC14406.NOFOLLOW_LINKS;
            InterfaceC15111 attributes = C17229.readAttributes(interfaceC20759, InterfaceC15111.class, enumC14406);
            if (attributes.isDirectory()) {
                ArrayList arrayList = new ArrayList();
                DirectoryStream directoryStreamNewDirectoryStream = C17229.newDirectoryStream(interfaceC20759);
                try {
                    Iterator it = directoryStreamNewDirectoryStream.iterator();
                    while (it.hasNext()) {
                        arrayList.add((InterfaceC20758) it.next());
                    }
                    directoryStreamNewDirectoryStream.close();
                    C6083.sort(arrayList, C8200.comparing(new C10420(2)));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        m5109(zipOutputStream, interfaceC20758, (InterfaceC20758) it2.next(), bArr, sb);
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
                    InputStream inputStreamNewInputStream = C17229.newInputStream(interfaceC20759, enumC14406);
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
                            InterfaceC15111 attributes2 = C17229.readAttributes(interfaceC20759, InterfaceC15111.class, EnumC14406.NOFOLLOW_LINKS);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5108(ZipOutputStream zipOutputStream, String str, String str2) throws IOException {
        zipOutputStream.putNextEntry(new ZipEntry(str));
        zipOutputStream.write(str2.getBytes(StandardCharsets.UTF_8));
        zipOutputStream.closeEntry();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m5116() {
        StringBuilder sb = new StringBuilder();
        ArrayList<Map.Entry> arrayList = new ArrayList(Thread.getAllStackTraces().entrySet());
        C6083.sort(arrayList, C8200.comparing(new C13216(1)));
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
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m5117() {
        Process process = null;
        try {
            try {
                Process processStart = new ProcessBuilder("logcat", "-d", "-t", "2000", "-v", "threadtime").redirectErrorStream(true).start();
                InputStream inputStream = processStart.getInputStream();
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[8192];
                        long jUptimeMillis = SystemClock.uptimeMillis() + c.a;
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
                        String str = byteArrayOutputStream.toString(a.D) + "\n[Log capture bounded to 2000 entries, 2 MiB and 3 seconds]\n";
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
