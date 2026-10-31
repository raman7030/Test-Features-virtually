package l;

import android.os.Process;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩶ۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5ED */
/* JADX INFO: loaded from: classes4.dex */
public final class C19926 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f64510 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static File f64512;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean f64514;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC17230 f64513 = C14407.m34431(new C21337());

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final LinkedBlockingQueue f64511 = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m45874(String str) {
        C11233.m27805(str, "content");
        m45879("mtio ".concat(str), null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m45876(ApplicationC20075 applicationC20075) {
        final File file = new File(applicationC20075.getFilesDir(), "log");
        if (file.mkdirs() || file.isDirectory()) {
            final long jCurrentTimeMillis = System.currentTimeMillis() - 259200000;
            C1802.f6208.execute(new Runnable() { // from class: l.۠ۘܽ
                @Override // java.lang.Runnable
                public final void run() {
                    Object objM43235;
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            String name = file2.getName();
                            C11233.m27799((Object) name);
                            if (C3016.m9240(name, ".log", false)) {
                                try {
                                    int length = name.length() - 4;
                                    if (length < 0) {
                                        length = 0;
                                    }
                                    if (length < 0) {
                                        throw new IllegalArgumentException(C18307.m42645(length, "Requested character count ", " is less than zero.").toString());
                                    }
                                    int length2 = name.length();
                                    if (length > length2) {
                                        length = length2;
                                    }
                                    String strSubstring = name.substring(0, length);
                                    C11233.m27803(strSubstring, "substring(...)");
                                    objM43235 = Long.valueOf(Long.parseLong(strSubstring));
                                } catch (Throwable th) {
                                    objM43235 = C18642.m43235(th);
                                }
                                if (!(objM43235 instanceof C2414) && ((Number) objM43235).longValue() < jCurrentTimeMillis) {
                                    file2.delete();
                                }
                            }
                        }
                    }
                }
            });
            f64514 = true;
            m45879("init: pid=" + Process.myPid(), null);
            f64512 = new File(file, System.currentTimeMillis() + ".log");
            C22374 c22374 = new C22374();
            c22374.setDaemon(true);
            c22374.setName("MLog");
            c22374.start();
        }
    }

    /* JADX INFO: Infinite loop detected, blocks: 13, insns: 0 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8058 m45873() {
        LinkedBlockingQueue linkedBlockingQueue = f64511;
        try {
            File file = f64512;
            if (file == null) {
                C11233.m27804("currentFile");
                throw null;
            }
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), 8192);
            Charset charsetDefaultCharset = Charset.defaultCharset();
            while (true) {
                boolean z = false;
                while (true) {
                    String str = (String) linkedBlockingQueue.poll(1L, TimeUnit.SECONDS);
                    if (str != null) {
                        C11233.m27799(charsetDefaultCharset);
                        byte[] bytes = str.getBytes(charsetDefaultCharset);
                        C11233.m27803(bytes, "getBytes(...)");
                        bufferedOutputStream.write(bytes);
                        z = true;
                    } else if (z) {
                        break;
                    }
                }
                bufferedOutputStream.flush();
            }
        } catch (Throwable th) {
            if (C3825.m11584(C18642.m43235(th)) != null) {
                f64514 = false;
                linkedBlockingQueue.clear();
            }
            return C8058.f24861;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final void m45880(String str) {
        C11233.m27805(str, "content");
        m45879(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final void m45879(String str, Throwable th) {
        C11233.m27805(str, "content");
        CharSequence charSequenceSubSequence = "";
        String strM46315 = charSequenceSubSequence;
        if (th != null) {
            String strM11987 = C3939.m11987(th);
            C11233.m27803(strM11987, "getStackTraceString(...)");
            int length = strM11987.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (strM11987.charAt(length) != '\n') {
                        charSequenceSubSequence = strM11987.subSequence(0, length + 1);
                        break;
                    } else if (i < 0) {
                        break;
                    } else {
                        length = i;
                    }
                }
            }
            strM46315 = C20094.m46315("\n", charSequenceSubSequence.toString());
        }
        if (f64514) {
            f64511.offer(((C22042) f64513.getValue()).m49591(System.currentTimeMillis()) + " [" + Thread.currentThread().getName() + "] " + str + strM46315 + "\n");
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final void m45878(String str) {
        C11233.m27805(str, "content");
        m45875(str, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m45875(String str, Throwable th) {
        C11233.m27805(str, "content");
        m45879("start-up ".concat(str), th);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final void m45877() throws InterruptedException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (!f64511.isEmpty() && System.currentTimeMillis() - jCurrentTimeMillis < 1000) {
            Thread.sleep(100L);
        }
    }
}
