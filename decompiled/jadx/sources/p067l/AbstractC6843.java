package p067l;

import com.alipay.sdk.p010m.p055w.C0233a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۙܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6843 {

    /* JADX INFO: renamed from: ۧ */
    public final int f17779;

    /* JADX INFO: renamed from: ܽ */
    public volatile ServerSocket f17780;

    /* JADX INFO: renamed from: ᩳ */
    public Thread f17782;

    /* JADX INFO: renamed from: ᩻ */
    public static final Pattern f17777 = Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);

    /* JADX INFO: renamed from: ۜ */
    public static final Pattern f17773 = Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);

    /* JADX INFO: renamed from: ܳ */
    public static final Pattern f17775 = Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");

    /* JADX INFO: renamed from: ᩷ */
    public static final Pattern f17776 = Pattern.compile("[-!#$%&'*+.^_`|~0-9A-Za-z]+");

    /* JADX INFO: renamed from: ۢ */
    public static final Logger f17774 = Logger.getLogger(AbstractC6843.class.getName());

    /* JADX INFO: renamed from: ܿ */
    public InterfaceC21596 f17781 = new C10867();

    /* JADX INFO: renamed from: ֫ */
    public C24948 f17778 = new C24948();

    /* JADX INFO: renamed from: ֫ */
    public static int m15654(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m15675() {
        this.f17780 = new ServerSocket();
        this.f17780.setReuseAddress(true);
        RunnableC22937 runnableC22937 = new RunnableC22937(this);
        Thread thread = new Thread(runnableC22937);
        this.f17782 = thread;
        thread.setDaemon(true);
        this.f17782.setName("NanoHttpd Main Listener");
        this.f17782.start();
        while (!runnableC22937.f72175 && runnableC22937.f72174 == null) {
            try {
                Thread.sleep(10L);
            } catch (Throwable unused) {
            }
        }
        if (runnableC22937.f72174 != null) {
            throw runnableC22937.f72174;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static final void m15666(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else {
                    if (obj instanceof ServerSocket) {
                        ((ServerSocket) obj).close();
                        return;
                    }
                    throw new IllegalArgumentException("Unknown object to close");
                }
            } catch (IOException e) {
                f17774.log(Level.SEVERE, "Could not close", (Throwable) e);
            }
        }
    }

    public AbstractC6843(int i) {
        this.f17779 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m15664(String str) {
        return m15657(str, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m15657(String str, boolean z) {
        StringBuilder sb = new StringBuilder(str.length());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '%') {
                byteArrayOutputStream.reset();
                while (i < str.length() && str.charAt(i) == '%') {
                    int i2 = i + 2;
                    if (i2 >= str.length()) {
                        throw new IllegalArgumentException("Incomplete percent encoding");
                    }
                    int iM15654 = m15654(str.charAt(i + 1));
                    int iM15655 = m15654(str.charAt(i2));
                    if (iM15654 < 0 || iM15655 < 0) {
                        throw new IllegalArgumentException("Invalid percent encoding");
                    }
                    byteArrayOutputStream.write((iM15654 << 4) + iM15655);
                    i += 3;
                }
                sb.append(new String(byteArrayOutputStream.toByteArray(), Charset.forName(C0233a.f1077D)));
            } else {
                if (cCharAt == '+' && z) {
                    cCharAt = ' ';
                }
                sb.append(cCharAt);
                i++;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo15673(C10196 c10196) {
        if (c10196.m23779() != null) {
            return c10196.m23779().toLowerCase().contains("text/") || c10196.m23779().toLowerCase().contains("/json");
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m15671() {
        if (this.f17780 == null) {
            return -1;
        }
        return this.f17780.getLocalPort();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m15674() {
        return m15676() && !this.f17780.isClosed() && this.f17782.isAlive();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10196 m15658(EnumC3490 enumC3490, PipedInputStream pipedInputStream) {
        return new C10196(enumC3490, "application/zip", pipedInputStream, -1L);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10196 m15659(InterfaceC7514 interfaceC7514, String str, InputStream inputStream, long j) {
        return new C10196(interfaceC7514, str, inputStream, j);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10196 m15660(InterfaceC7514 interfaceC7514, String str, String str2) {
        byte[] bytes;
        C19584 c19584 = new C19584(str);
        if (str2 == null) {
            return new C10196(interfaceC7514, str, new ByteArrayInputStream(new byte[0]), 0L);
        }
        try {
            if (!Charset.forName(c19584.m44495()).newEncoder().canEncode(str2)) {
                c19584 = c19584.m44492();
            }
            bytes = str2.getBytes(c19584.m44495());
        } catch (UnsupportedEncodingException e) {
            f17774.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e);
            bytes = new byte[0];
        }
        return new C10196(interfaceC7514, c19584.m44493(), new ByteArrayInputStream(bytes), bytes.length);
    }

    /* JADX INFO: renamed from: ֫ */
    public C10196 mo15672(C17571 c17571) {
        HashMap map = new HashMap();
        EnumC6173 enumC6173M39993 = c17571.m39993();
        if (EnumC6173.PUT.equals(enumC6173M39993) || EnumC6173.POST.equals(enumC6173M39993)) {
            try {
                c17571.m39988(map);
            } catch (IOException e) {
                return m15660(EnumC3490.INTERNAL_ERROR, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e.getMessage());
            } catch (C16900 e2) {
                return m15660(e2.m38461(), "text/plain", e2.getMessage());
            }
        }
        c17571.m39989().put("NanoHttpd.QUERY_STRING", c17571.m39998());
        return m15660(EnumC3490.NOT_FOUND, "text/plain", "Not Found");
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo15677() {
        try {
            m15666(this.f17780);
            this.f17778.m54815();
            Thread thread = this.f17782;
            if (thread != null) {
                thread.join();
            }
        } catch (Exception e) {
            f17774.log(Level.SEVERE, "Could not stop all connections", (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m15676() {
        return (this.f17780 == null || this.f17782 == null) ? false : true;
    }
}
