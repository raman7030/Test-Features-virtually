package l;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.᩸ܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 85AW */
/* JADX INFO: loaded from: classes4.dex */
public final class C21652 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48913(Writer writer, InterfaceC8566 interfaceC8566, C22357 c22357) {
        try {
            C0985 c0985 = new C0985(c22357, interfaceC8566);
            if (writer instanceof C3438) {
                c0985.m3450((C3438) writer);
            } else {
                c0985.m3450(new C3438(writer));
            }
        } catch (Throwable th) {
            throw new IOException(C20094.m46315("An error occurred with the class: ", C15472.m36561(1, 1, interfaceC8566.getType())), th);
        }
    }
}
