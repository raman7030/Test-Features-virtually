package l;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۬ۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: B99D */
/* JADX INFO: loaded from: classes4.dex */
public final class C12906 implements InterfaceC10085 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String f38719 = C4860.m14172("echo '", "MT - End of command", "'");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f38720;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f38721;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public BufferedReader f38722;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public BufferedWriter f38723;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f38724;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public BufferedReader f38725;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f38726;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Process f38727;

    @Override // l.InterfaceC10085
    public final synchronized void close() {
        this.f38720 = true;
        if (this.f38727 != null) {
            C22194.m49850(this.f38725);
            C22194.m49850(this.f38722);
            C22194.m49850(this.f38723);
            try {
                this.f38727.destroy();
            } catch (Exception unused) {
            }
            this.f38727 = null;
        }
    }

    @Override // l.InterfaceC10085
    /* JADX INFO: renamed from: ֫ */
    public final C12201 mo25343(String str) {
        return mo25342(8000L, str);
    }

    @Override // l.InterfaceC10085
    /* JADX INFO: renamed from: ֫ */
    public final C12201 mo25344(String str, boolean z) {
        return mo25342(z ? 0L : 8000L, str);
    }

    @Override // l.InterfaceC10085
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo25347() {
        return mo25345() && getUid() == 0;
    }

    @Override // l.InterfaceC10085
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo25348() {
        return mo25345() && getUid() == 2000;
    }

    @Override // l.InterfaceC10085
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo25346() {
        if (!mo25345()) {
            return false;
        }
        int uid = getUid();
        return uid == 0 || uid == 2000;
    }

    public C12906(String str, boolean z) throws IOException {
        this.f38724 = str;
        this.f38726 = z;
        try {
            C1802.f6208.submit(new Callable() { // from class: l.᩶ۚۢ
                @Override // java.util.concurrent.Callable
                public final Object call() throws IOException {
                    this.f64649.m31353();
                    return null;
                }
            }).get(5000L, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            if (e.getCause() != null) {
                throw new IOException(e.getCause());
            }
            throw new IOException(e);
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public void m31353() throws IOException {
        this.f38727 = Runtime.getRuntime().exec(this.f38724);
        OutputStream outputStream = this.f38727.getOutputStream();
        Charset charset = StandardCharsets.UTF_8;
        this.f38723 = new BufferedWriter(new OutputStreamWriter(outputStream, charset));
        this.f38725 = new BufferedReader(new InputStreamReader(this.f38727.getInputStream(), charset));
        this.f38722 = new BufferedReader(new InputStreamReader(this.f38727.getErrorStream(), charset));
        if (this.f38726) {
            new C3029(this).m9276();
        }
        this.f38720 = false;
        C12201 c12201Mo25342 = mo25342(8000L, "id -u");
        String[] strArr = c12201Mo25342.f36415;
        try {
            try {
                this.f38721 = Integer.parseInt(strArr[0]);
            } catch (Exception unused) {
                throw new IOException("Get shell's uid failed: " + c12201Mo25342);
            }
        } catch (Exception unused2) {
            Matcher matcher = Pattern.compile("uid=(\\d+)").matcher(strArr[0]);
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                C11003.requireNonNull(strGroup);
                this.f38721 = Integer.parseInt(strGroup);
                return;
            }
            throw new IOException("Get shell's uid failed: " + c12201Mo25342);
        }
    }

    @Override // l.InterfaceC10085
    /* JADX INFO: renamed from: ֫ */
    public final C12201 mo25342(long j, String str) {
        C12201 c12201M13191;
        synchronized (this) {
            try {
                m31351(str);
                c12201M13191 = new C4440(this).m13191(j);
            } catch (IOException e) {
                return new C12201(e);
            }
        }
        return c12201M13191;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m31351(String str) throws IOException {
        if (this.f38720) {
            throw new IOException("Closed");
        }
        Process process = this.f38727;
        if (process != null) {
            try {
                process.exitValue();
            } catch (IllegalThreadStateException unused) {
            }
        }
        try {
            close();
            m31353();
            try {
                m31347(str);
            } catch (IOException e) {
                String message = e.getMessage();
                if (message != null && message.contains("EPIPE")) {
                    close();
                    m31353();
                    m31347(str);
                    return;
                }
                throw e;
            }
        } catch (IOException e2) {
            throw new IOException("Shell died", e2);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m31347(String str) throws IOException {
        while (this.f38725.ready()) {
            try {
                this.f38725.read();
            } catch (Throwable unused) {
            }
        }
        while (this.f38722.ready()) {
            try {
                this.f38722.read();
            } catch (Throwable unused2) {
            }
        }
        this.f38723.write(str);
        this.f38723.newLine();
        this.f38723.write(f38719);
        this.f38723.newLine();
        this.f38723.flush();
    }

    @Override // l.InterfaceC10085
    public final int getUid() {
        return this.f38721;
    }

    @Override // l.InterfaceC10085
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo25345() {
        return !this.f38720;
    }
}
