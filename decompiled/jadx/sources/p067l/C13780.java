package p067l;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.ۨ᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 97LV */
/* JADX INFO: loaded from: classes3.dex */
public final class C13780 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayDeque f38960;

    /* JADX INFO: renamed from: ۧ */
    public String f38961;

    /* JADX INFO: renamed from: ܽ */
    public final BufferedReader f38962;

    public C13780(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f38960 = arrayDeque;
        this.f38962 = bufferedReader;
    }

    @EnsuresNonNullIf(expression = {"next"}, result = true)
    /* JADX INFO: renamed from: ֫ */
    public final boolean m31410() throws IOException {
        String strTrim;
        if (this.f38961 == null) {
            ArrayDeque arrayDeque = this.f38960;
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.f38961 = str;
                return true;
            }
            do {
                String line = this.f38962.readLine();
                this.f38961 = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f38961 = strTrim;
            } while (strTrim.isEmpty());
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m31411() {
        if (m31410()) {
            String str = this.f38961;
            this.f38961 = null;
            return str;
        }
        throw new NoSuchElementException();
    }
}
