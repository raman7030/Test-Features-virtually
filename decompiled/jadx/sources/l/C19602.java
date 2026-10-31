package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.᩵ܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes4.dex */
public final class C19602 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC23107 m45043(C17175 c17175) {
        boolean z;
        try {
            try {
                c17175.m40398();
                z = false;
                try {
                    return (AbstractC23107) C21906.f70122.mo2844(c17175);
                } catch (EOFException e) {
                    e = e;
                    if (z) {
                        return C7585.f23459;
                    }
                    throw new C14682(e);
                }
            } catch (EOFException e2) {
                e = e2;
                z = true;
            }
        } catch (C6592 e3) {
            throw new C14682(e3);
        } catch (IOException e4) {
            throw new C13934(e4);
        } catch (NumberFormatException e5) {
            throw new C14682(e5);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Writer m45042(StringBuilder sb) {
        return new C18896(sb);
    }
}
