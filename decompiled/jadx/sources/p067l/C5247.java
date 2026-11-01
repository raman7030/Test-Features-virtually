package p067l;

import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ۗۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: B99D */
/* JADX INFO: loaded from: classes2.dex */
public final class C5247 extends Thread {

    /* JADX INFO: renamed from: ᩶ */
    public int f12359 = -1;

    /* JADX INFO: renamed from: ᩸ */
    public C14634 f12360;

    /* JADX INFO: renamed from: ᩹ */
    public String f12361;

    public C5247(C14634 c14634) {
        this.f12360 = c14634;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11318() {
        C14634 c14634;
        C21306.m48191("Shell.verify");
        start();
        int i = 0;
        while (true) {
            c14634 = this.f12360;
            if (i >= 9) {
                break;
            }
            try {
                C21306.m48191("Shell.verify write");
                c14634.f41765.write("echo Started\n");
                c14634.f41765.flush();
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
        C21306.m48191("Shell.verify result " + this.f12359);
        int i2 = this.f12359;
        if (i2 == -1) {
            c14634.close();
            throw new IOException("Shell verify timeout.");
        }
        if (i2 != -2) {
            return;
        }
        c14634.close();
        throw new IOException(this.f12361);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                String line = this.f12360.f41767.readLine();
                C21306.m48191("Shell.verify read [" + line + "]");
                if (line == null) {
                    throw new EOFException();
                }
                if (!"".equals(line)) {
                    if ("Started".equals(line)) {
                        this.f12359 = 0;
                        m11317();
                        return;
                    } else {
                        this.f12361 = "Unknown error occurred. Line: " + line;
                    }
                }
            } catch (IOException e) {
                this.f12359 = -2;
                if (e.getMessage() != null) {
                    this.f12361 = e.getMessage();
                    return;
                } else {
                    this.f12361 = "Root Access Denied.";
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m11317() {
        Field declaredField;
        C14634 c14634 = this.f12360;
        try {
            Class<?> cls = c14634.f41769.getClass();
            try {
                declaredField = cls.getDeclaredField("pid");
            } catch (NoSuchFieldException unused) {
                declaredField = cls.getDeclaredField("id");
            }
            declaredField.setAccessible(true);
            int iIntValue = ((Integer) declaredField.get(c14634.f41769)).intValue();
            c14634.f41765.write("(echo -17 > /proc/" + iIntValue + "/oom_adj) &> /dev/null\n");
            c14634.f41765.write("(echo -17 > /proc/$$/oom_adj) &> /dev/null\n");
            c14634.f41765.flush();
        } catch (Exception unused2) {
        }
    }
}
