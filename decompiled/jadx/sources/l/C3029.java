package l;

import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ۗۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: B99D */
/* JADX INFO: loaded from: classes2.dex */
public final class C3029 extends Thread {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f9557 = -1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C12906 f9558;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f9559;

    public C3029(C12906 c12906) {
        this.f9558 = c12906;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9276() {
        C12906 c12906;
        C19926.m45878("Shell.verify");
        start();
        int i = 0;
        while (true) {
            c12906 = this.f9558;
            if (i >= 9) {
                break;
            }
            try {
                C19926.m45878("Shell.verify write");
                c12906.f38723.write("echo Started\n");
                c12906.f38723.flush();
                join(1000L);
                if (!isAlive()) {
                    break;
                } else {
                    i++;
                }
            } catch (InterruptedException e) {
                throw new IOException(e);
            }
        }
        C19926.m45878("Shell.verify result " + this.f9557);
        int i2 = this.f9557;
        if (i2 == -1) {
            c12906.close();
            throw new IOException("Shell verify timeout.");
        }
        if (i2 != -2) {
            return;
        }
        c12906.close();
        throw new IOException(this.f9559);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                String line = this.f9558.f38725.readLine();
                C19926.m45878("Shell.verify read [" + line + "]");
                if (line == null) {
                    throw new EOFException();
                }
                if (!"".equals(line)) {
                    if ("Started".equals(line)) {
                        this.f9557 = 0;
                        m9275();
                        return;
                    } else {
                        this.f9559 = "Unknown error occurred. Line: " + line;
                    }
                }
            } catch (IOException e) {
                this.f9557 = -2;
                if (e.getMessage() != null) {
                    this.f9559 = e.getMessage();
                    return;
                } else {
                    this.f9559 = "Root Access Denied.";
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m9275() {
        Field declaredField;
        C12906 c12906 = this.f9558;
        try {
            Class<?> cls = c12906.f38727.getClass();
            try {
                declaredField = cls.getDeclaredField("pid");
            } catch (NoSuchFieldException unused) {
                declaredField = cls.getDeclaredField("id");
            }
            declaredField.setAccessible(true);
            int iIntValue = ((Integer) declaredField.get(c12906.f38727)).intValue();
            c12906.f38723.write("(echo -17 > /proc/" + iIntValue + "/oom_adj) &> /dev/null\n");
            c12906.f38723.write("(echo -17 > /proc/$$/oom_adj) &> /dev/null\n");
            c12906.f38723.flush();
        } catch (Exception unused2) {
        }
    }
}
