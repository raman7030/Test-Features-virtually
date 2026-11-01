package p067l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: B99D */
/* JADX INFO: loaded from: classes2.dex */
public final class C6588 extends Thread {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C14634 f17012;

    /* JADX INFO: renamed from: ᩹ */
    public final ArrayList f17014 = new ArrayList();

    /* JADX INFO: renamed from: ᩸ */
    public final StringBuilder f17013 = new StringBuilder();

    /* JADX INFO: renamed from: ۙ */
    public boolean f17011 = true;

    public C6588(C14634 c14634) {
        this.f17012 = c14634;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13964 m15072(long j) {
        start();
        if (j > 0) {
            try {
                join(j);
                this.f17011 = false;
            } catch (InterruptedException unused) {
            }
        }
        join();
        return new C13964(this.f17013.toString(), (String[]) this.f17014.toArray(new String[0]));
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            m15070();
        } catch (IOException e) {
            m15071(e.toString());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m15070() throws IOException {
        C14634 c14634;
        loop0: while (true) {
            boolean z = this.f17011;
            c14634 = this.f17012;
            if (!z || c14634.f41762) {
                break;
            }
            if (c14634.f41767.ready()) {
                do {
                    String line = c14634.f41767.readLine();
                    if (line.equals("MT - End of command")) {
                        while (c14634.f41764.ready()) {
                            String line2 = c14634.f41764.readLine();
                            if (!line2.contains("unused DT entry")) {
                                m15071(line2);
                            }
                        }
                        break loop0;
                    }
                    this.f17014.add(line);
                } while (c14634.f41767.ready());
            } else if (c14634.f41764.ready()) {
                do {
                    String line3 = c14634.f41764.readLine();
                    if (!line3.contains("unused DT entry")) {
                        m15071(line3);
                    }
                } while (c14634.f41764.ready());
            }
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
            }
        }
        if (!this.f17011) {
            m15071("Read shell timeout.");
        }
        if (c14634.f41762) {
            m15071("Shell closed.");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m15071(String str) {
        String strTrim = str.trim();
        if (strTrim.length() > 0) {
            StringBuilder sb = this.f17013;
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append(strTrim);
        }
    }
}
