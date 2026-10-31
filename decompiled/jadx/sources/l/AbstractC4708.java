package l;

import com.alipay.sdk.m.w.a;
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
public abstract class AbstractC4708 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f14949;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile ServerSocket f14950;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Thread f14952;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Pattern f14947 = Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Pattern f14943 = Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f14945 = Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f14946 = Pattern.compile("[-!#$%&'*+.^_`|~0-9A-Za-z]+");

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Logger f14944 = Logger.getLogger(AbstractC4708.class.getName());

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC20231 f14951 = new C8942();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C23758 f14948 = new C23758();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m13778(char c) {
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m13799() {
        this.f14950 = new ServerSocket();
        this.f14950.setReuseAddress(true);
        RunnableC21642 runnableC21642 = new RunnableC21642(this);
        Thread thread = new Thread(runnableC21642);
        this.f14952 = thread;
        thread.setDaemon(true);
        this.f14952.setName("NanoHttpd Main Listener");
        this.f14952.start();
        while (!runnableC21642.f69472 && runnableC21642.f69471 == null) {
            try {
                Thread.sleep(10L);
            } catch (Throwable unused) {
            }
        }
        if (runnableC21642.f69471 != null) {
            throw runnableC21642.f69471;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final void m13790(Object obj) {
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
                f14944.log(Level.SEVERE, "Could not close", (Throwable) e);
            }
        }
    }

    public AbstractC4708(int i) {
        this.f14949 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m13788(String str) {
        return m13781(str, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m13781(String str, boolean z) {
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
                    int iM13778 = m13778(str.charAt(i + 1));
                    int iM13779 = m13778(str.charAt(i2));
                    if (iM13778 < 0 || iM13779 < 0) {
                        throw new IllegalArgumentException("Invalid percent encoding");
                    }
                    byteArrayOutputStream.write((iM13778 << 4) + iM13779);
                    i += 3;
                }
                sb.append(new String(byteArrayOutputStream.toByteArray(), Charset.forName(a.D)));
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo13797(C8236 c8236) {
        if (c8236.m21810() != null) {
            return c8236.m21810().toLowerCase().contains("text/") || c8236.m21810().toLowerCase().contains("/json");
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m13795() {
        if (this.f14950 == null) {
            return -1;
        }
        return this.f14950.getLocalPort();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m13798() {
        return m13800() && !this.f14950.isClosed() && this.f14952.isAlive();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8236 m13782(EnumC1180 enumC1180, PipedInputStream pipedInputStream) {
        return new C8236(enumC1180, "application/zip", pipedInputStream, -1L);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8236 m13783(InterfaceC5414 interfaceC5414, String str, InputStream inputStream, long j) {
        return new C8236(interfaceC5414, str, inputStream, j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8236 m13784(InterfaceC5414 interfaceC5414, String str, String str2) {
        byte[] bytes;
        C18114 c18114 = new C18114(str);
        if (str2 == null) {
            return new C8236(interfaceC5414, str, new ByteArrayInputStream(new byte[0]), 0L);
        }
        try {
            if (!Charset.forName(c18114.m42236()).newEncoder().canEncode(str2)) {
                c18114 = c18114.m42233();
            }
            bytes = str2.getBytes(c18114.m42236());
        } catch (UnsupportedEncodingException e) {
            f14944.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e);
            bytes = new byte[0];
        }
        return new C8236(interfaceC5414, c18114.m42234(), new ByteArrayInputStream(bytes), bytes.length);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C8236 mo13796(C15996 c15996) {
        HashMap map = new HashMap();
        EnumC4003 enumC4003M37807 = c15996.m37807();
        if (EnumC4003.PUT.equals(enumC4003M37807) || EnumC4003.POST.equals(enumC4003M37807)) {
            try {
                c15996.m37802(map);
            } catch (IOException e) {
                return m13784(EnumC1180.INTERNAL_ERROR, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e.getMessage());
            } catch (C15290 e2) {
                return m13784(e2.m36300(), "text/plain", e2.getMessage());
            }
        }
        c15996.m37803().put("NanoHttpd.QUERY_STRING", c15996.m37812());
        return m13784(EnumC1180.NOT_FOUND, "text/plain", "Not Found");
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void mo13801() {
        try {
            m13790(this.f14950);
            this.f14948.m52406();
            Thread thread = this.f14952;
            if (thread != null) {
                thread.join();
            }
        } catch (Exception e) {
            f14944.log(Level.SEVERE, "Could not stop all connections", (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m13800() {
        return (this.f14950 == null || this.f14952 == null) ? false : true;
    }
}
