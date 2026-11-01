package p067l;

import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.᩵ܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes4.dex */
public final class C20998 {
    /* JADX INFO: renamed from: ֫ */
    public static AbstractC24329 m47338(C18691 c18691) {
        boolean z;
        try {
            try {
                c18691.m42643();
                z = false;
                try {
                    return (AbstractC24329) C23188.f72836.mo5173(c18691);
                } catch (EOFException e) {
                    e = e;
                    if (z) {
                        return C9577.f26370;
                    }
                    throw new C16322(e);
                }
            } catch (EOFException e2) {
                e = e2;
                z = true;
            }
        } catch (C8633 e3) {
            throw new C16322(e3);
        } catch (IOException e4) {
            throw new C15611(e4);
        } catch (NumberFormatException e5) {
            throw new C16322(e5);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Writer m47337(StringBuilder sb) {
        return new C20327(sb);
    }
}
