package l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: B99D */
/* JADX INFO: loaded from: classes2.dex */
public final class C4440 extends Thread {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12906 f14188;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f14190 = new ArrayList();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final StringBuilder f14189 = new StringBuilder();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f14187 = true;

    public C4440(C12906 c12906) {
        this.f14188 = c12906;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12201 m13191(long j) {
        start();
        if (j > 0) {
            try {
                join(j);
                this.f14187 = false;
            } catch (InterruptedException unused) {
            }
        }
        join();
        return new C12201(this.f14189.toString(), (String[]) this.f14190.toArray(new String[0]));
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            m13189();
        } catch (IOException e) {
            m13190(e.toString());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13189() throws IOException {
        C12906 c12906;
        loop0: while (true) {
            boolean z = this.f14187;
            c12906 = this.f14188;
            if (!z || c12906.f38720) {
                break;
            }
            if (c12906.f38725.ready()) {
                do {
                    String line = c12906.f38725.readLine();
                    if (line.equals("MT - End of command")) {
                        while (c12906.f38722.ready()) {
                            String line2 = c12906.f38722.readLine();
                            if (!line2.contains("unused DT entry")) {
                                m13190(line2);
                            }
                        }
                        break loop0;
                    }
                    this.f14190.add(line);
                } while (c12906.f38725.ready());
            } else if (c12906.f38722.ready()) {
                do {
                    String line3 = c12906.f38722.readLine();
                    if (!line3.contains("unused DT entry")) {
                        m13190(line3);
                    }
                } while (c12906.f38722.ready());
            }
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
            }
        }
        if (!this.f14187) {
            m13190("Read shell timeout.");
        }
        if (c12906.f38720) {
            m13190("Shell closed.");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13190(String str) {
        String strTrim = str.trim();
        if (strTrim.length() > 0) {
            StringBuilder sb = this.f14189;
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append(strTrim);
        }
    }
}
