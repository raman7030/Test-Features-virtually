package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩺ܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: IAZV */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24329 {
    @Deprecated
    public AbstractC24329() {
    }

    /* JADX INFO: renamed from: ۧ */
    public final C19676 m53689() {
        if (this instanceof C19676) {
            return (C19676) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* JADX INFO: renamed from: ܽ */
    public String mo19013() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            C24726 c24726 = new C24726(C20998.m47337(sb));
            c24726.m54379(EnumC17663.LENIENT);
            C23188.f72836.mo5174(c24726, this);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
