package l;

import java.io.BufferedReader;

/* JADX INFO: renamed from: l.֡ۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 54IP */
/* JADX INFO: loaded from: classes2.dex */
public final class C0114 extends BufferedReader implements InterfaceC19140 {
    @Override // java.io.BufferedReader, l.InterfaceC19140
    public /* synthetic */ InterfaceC17664 lines() {
        return C5028.lines(this);
    }

    @Override // java.io.BufferedReader
    public final String readLine() {
        StringBuilder sb = new StringBuilder();
        synchronized (((BufferedReader) this).lock) {
            boolean z = false;
            while (true) {
                int i = read();
                if (i == -1) {
                    String string = sb.toString();
                    if (string.isEmpty()) {
                        return null;
                    }
                    return string;
                }
                if (z && i == 10) {
                    return sb.substring(0, sb.length() - 1);
                }
                z = i == 13;
                sb.append((char) i);
            }
        }
    }
}
