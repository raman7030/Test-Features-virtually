package p067l;

import java.io.BufferedReader;
import java.io.IOException;
import java.p066io.UncheckedIOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩸֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22571 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final BufferedReader f71263a;

    /* JADX INFO: renamed from: b */
    public String f71264b = null;

    public C22571(BufferedReader bufferedReader) {
        this.f71263a = bufferedReader;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f71264b != null) {
            return true;
        }
        try {
            String line = this.f71263a.readLine();
            this.f71264b = line;
            return line != null;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f71264b != null || hasNext()) {
            String str = this.f71264b;
            this.f71264b = null;
            return str;
        }
        throw new NoSuchElementException();
    }
}
