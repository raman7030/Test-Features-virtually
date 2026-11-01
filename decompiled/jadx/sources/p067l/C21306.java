package p067l;

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
public final class C21306 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f67147 = 0;

    /* JADX INFO: renamed from: ܽ */
    public static File f67149;

    /* JADX INFO: renamed from: ᩳ */
    public static boolean f67151;

    /* JADX INFO: renamed from: ܿ */
    public static final InterfaceC18744 f67150 = C16061.m36565(new C22647());

    /* JADX INFO: renamed from: ۧ */
    public static final LinkedBlockingQueue f67148 = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: ֫ */
    public static final void m48187(String str) {
        C13045.m29867(str, "content");
        m48192("mtio ".concat(str), null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m48189(ApplicationC21448 applicationC21448) {
        final File file = new File(applicationC21448.getFilesDir(), "log");
        if (file.mkdirs() || file.isDirectory()) {
            final long jCurrentTimeMillis = System.currentTimeMillis() - 259200000;
            C4081.f8987.execute(new Runnable() { // from class: l.۠ۘܽ
                @Override // java.lang.Runnable
                public final void run() {
                    Object objM45501;
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            String name = file2.getName();
                            C13045.m29861((Object) name);
                            if (C5235.m11298(name, ".log", false)) {
                                try {
                                    int length = name.length() - 4;
                                    if (length < 0) {
                                        length = 0;
                                    }
                                    if (length < 0) {
                                        throw new IllegalArgumentException(C19768.m44906(length, "Requested character count ", " is less than zero.").toString());
                                    }
                                    int length2 = name.length();
                                    if (length > length2) {
                                        length = length2;
                                    }
                                    String strSubstring = name.substring(0, length);
                                    C13045.m29865(strSubstring, "substring(...)");
                                    objM45501 = Long.valueOf(Long.parseLong(strSubstring));
                                } catch (Throwable th) {
                                    objM45501 = C20086.m45501(th);
                                }
                                if (!(objM45501 instanceof C4663) && ((Number) objM45501).longValue() < jCurrentTimeMillis) {
                                    file2.delete();
                                }
                            }
                        }
                    }
                }
            });
            f67151 = true;
            m48192("init: pid=" + Process.myPid(), null);
            f67149 = new File(file, System.currentTimeMillis() + ".log");
            C23633 c23633 = new C23633();
            c23633.setDaemon(true);
            c23633.setName("MLog");
            c23633.start();
        }
    }

    /* JADX INFO: Infinite loop detected, blocks: 13, insns: 0 */
    /* JADX INFO: renamed from: ֫ */
    public static C10027 m48186() {
        LinkedBlockingQueue linkedBlockingQueue = f67148;
        try {
            File file = f67149;
            if (file == null) {
                C13045.m29866("currentFile");
                throw null;
            }
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), 8192);
            Charset charsetDefaultCharset = Charset.defaultCharset();
            while (true) {
                boolean z = false;
                while (true) {
                    String str = (String) linkedBlockingQueue.poll(1L, TimeUnit.SECONDS);
                    if (str != null) {
                        C13045.m29861(charsetDefaultCharset);
                        byte[] bytes = str.getBytes(charsetDefaultCharset);
                        C13045.m29865(bytes, "getBytes(...)");
                        bufferedOutputStream.write(bytes);
                        z = true;
                    } else if (z) {
                        break;
                    }
                }
                bufferedOutputStream.flush();
            }
        } catch (Throwable th) {
            if (C6004.m13520(C20086.m45501(th)) != null) {
                f67151 = false;
                linkedBlockingQueue.clear();
            }
            return C10027.f27775;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static final void m48193(String str) {
        C13045.m29867(str, "content");
        m48192(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۧ */
    public static final void m48192(String str, Throwable th) {
        C13045.m29867(str, "content");
        CharSequence charSequenceSubSequence = "";
        String strM48631 = charSequenceSubSequence;
        if (th != null) {
            String strM13907 = C6112.m13907(th);
            C13045.m29865(strM13907, "getStackTraceString(...)");
            int length = strM13907.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (strM13907.charAt(length) != '\n') {
                        charSequenceSubSequence = strM13907.subSequence(0, length + 1);
                        break;
                    } else if (i < 0) {
                        break;
                    } else {
                        length = i;
                    }
                }
            }
            strM48631 = C21466.m48631("\n", charSequenceSubSequence.toString());
        }
        if (f67151) {
            f67148.offer(((C23317) f67150.getValue()).m51927(System.currentTimeMillis()) + " [" + Thread.currentThread().getName() + "] " + str + strM48631 + "\n");
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static final void m48191(String str) {
        C13045.m29867(str, "content");
        m48188(str, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m48188(String str, Throwable th) {
        C13045.m29867(str, "content");
        m48192("start-up ".concat(str), th);
    }

    /* JADX INFO: renamed from: ۧ */
    public static final void m48190() throws InterruptedException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (!f67148.isEmpty() && System.currentTimeMillis() - jCurrentTimeMillis < 1000) {
            Thread.sleep(100L);
        }
    }
}
