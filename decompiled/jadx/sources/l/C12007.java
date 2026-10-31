package l;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.ۨ᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 97LV */
/* JADX INFO: loaded from: classes3.dex */
public final class C12007 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f35950;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f35951;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final BufferedReader f35952;

    public C12007(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f35950 = arrayDeque;
        this.f35952 = bufferedReader;
    }

    @EnsuresNonNullIf(expression = {"next"}, result = true)
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m29352() throws IOException {
        String strTrim;
        if (this.f35951 == null) {
            ArrayDeque arrayDeque = this.f35950;
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.f35951 = str;
                return true;
            }
            do {
                String line = this.f35952.readLine();
                this.f35951 = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f35951 = strTrim;
            } while (strTrim.isEmpty());
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m29353() {
        if (m29352()) {
            String str = this.f35951;
            this.f35951 = null;
            return str;
        }
        throw new NoSuchElementException();
    }
}
