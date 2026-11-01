package p067l;

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
public final class C14634 implements InterfaceC11953 {

    /* JADX INFO: renamed from: ᩷ */
    public static String f41761 = C6988.m16053("echo '", "MT - End of command", "'");

    /* JADX INFO: renamed from: ֫ */
    public boolean f41762;

    /* JADX INFO: renamed from: ۜ */
    public int f41763;

    /* JADX INFO: renamed from: ۧ */
    public BufferedReader f41764;

    /* JADX INFO: renamed from: ܳ */
    public BufferedWriter f41765;

    /* JADX INFO: renamed from: ܽ */
    public String f41766;

    /* JADX INFO: renamed from: ܿ */
    public BufferedReader f41767;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f41768;

    /* JADX INFO: renamed from: ᩻ */
    public Process f41769;

    @Override // p067l.InterfaceC11953
    public final synchronized void close() {
        this.f41762 = true;
        if (this.f41769 != null) {
            C23461.m52177(this.f41767);
            C23461.m52177(this.f41764);
            C23461.m52177(this.f41765);
            try {
                this.f41769.destroy();
            } catch (Exception unused) {
            }
            this.f41769 = null;
        }
    }

    @Override // p067l.InterfaceC11953
    /* JADX INFO: renamed from: ֫ */
    public final C13964 mo27362(String str) {
        return mo27361(8000L, str);
    }

    @Override // p067l.InterfaceC11953
    /* JADX INFO: renamed from: ֫ */
    public final C13964 mo27363(String str, boolean z) {
        return mo27361(z ? 0L : 8000L, str);
    }

    @Override // p067l.InterfaceC11953
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo27366() {
        return mo27364() && getUid() == 0;
    }

    @Override // p067l.InterfaceC11953
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo27367() {
        return mo27364() && getUid() == 2000;
    }

    @Override // p067l.InterfaceC11953
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo27365() {
        if (!mo27364()) {
            return false;
        }
        int uid = getUid();
        return uid == 0 || uid == 2000;
    }

    public C14634(String str, boolean z) throws IOException {
        this.f41766 = str;
        this.f41768 = z;
        try {
            C4081.f8987.submit(new Callable() { // from class: l.᩶ۚۢ
                @Override // java.util.concurrent.Callable
                public final Object call() throws IOException {
                    this.f67289.m33439();
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
    /* JADX INFO: renamed from: ܿ */
    public void m33439() throws IOException {
        this.f41769 = Runtime.getRuntime().exec(this.f41766);
        OutputStream outputStream = this.f41769.getOutputStream();
        Charset charset = StandardCharsets.UTF_8;
        this.f41765 = new BufferedWriter(new OutputStreamWriter(outputStream, charset));
        this.f41767 = new BufferedReader(new InputStreamReader(this.f41769.getInputStream(), charset));
        this.f41764 = new BufferedReader(new InputStreamReader(this.f41769.getErrorStream(), charset));
        if (this.f41768) {
            new C5247(this).m11318();
        }
        this.f41762 = false;
        C13964 c13964Mo27361 = mo27361(8000L, "id -u");
        String[] strArr = c13964Mo27361.f39430;
        try {
            try {
                this.f41763 = Integer.parseInt(strArr[0]);
            } catch (Exception unused) {
                throw new IOException("Get shell's uid failed: " + c13964Mo27361);
            }
        } catch (Exception unused2) {
            Matcher matcher = Pattern.compile("uid=(\\d+)").matcher(strArr[0]);
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                C12826.requireNonNull(strGroup);
                this.f41763 = Integer.parseInt(strGroup);
                return;
            }
            throw new IOException("Get shell's uid failed: " + c13964Mo27361);
        }
    }

    @Override // p067l.InterfaceC11953
    /* JADX INFO: renamed from: ֫ */
    public final C13964 mo27361(long j, String str) {
        C13964 c13964M15072;
        synchronized (this) {
            try {
                m33437(str);
                c13964M15072 = new C6588(this).m15072(j);
            } catch (IOException e) {
                return new C13964(e);
            }
        }
        return c13964M15072;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m33437(String str) throws IOException {
        if (this.f41762) {
            throw new IOException("Closed");
        }
        Process process = this.f41769;
        if (process != null) {
            try {
                process.exitValue();
            } catch (IllegalThreadStateException unused) {
            }
        }
        try {
            close();
            m33439();
            try {
                m33433(str);
            } catch (IOException e) {
                String message = e.getMessage();
                if (message != null && message.contains("EPIPE")) {
                    close();
                    m33439();
                    m33433(str);
                    return;
                }
                throw e;
            }
        } catch (IOException e2) {
            throw new IOException("Shell died", e2);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m33433(String str) throws IOException {
        while (this.f41767.ready()) {
            try {
                this.f41767.read();
            } catch (Throwable unused) {
            }
        }
        while (this.f41764.ready()) {
            try {
                this.f41764.read();
            } catch (Throwable unused2) {
            }
        }
        this.f41765.write(str);
        this.f41765.newLine();
        this.f41765.write(f41761);
        this.f41765.newLine();
        this.f41765.flush();
    }

    @Override // p067l.InterfaceC11953
    public final int getUid() {
        return this.f41763;
    }

    @Override // p067l.InterfaceC11953
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo27364() {
        return !this.f41762;
    }
}
