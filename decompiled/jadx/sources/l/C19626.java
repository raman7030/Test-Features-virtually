package l;

import java.io.IOException;
import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: l.᩵ᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z75Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C19626 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile SoftReference f63367;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f63368 = new Object();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f63369;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f63370;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f63371;

    public C19626(long j, AbstractC15440 abstractC15440, String str) throws IOException {
        if (str != null && str.length() == 64) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.digit(str.charAt(i), 16) != -1) {
                }
            }
            if (j >= 0) {
                if (!abstractC15440.mo23119()) {
                    throw new IOException("Resource table is unavailable");
                }
                if (abstractC15440.mo23127() != j) {
                    throw new IOException("Resource table metadata length mismatch");
                }
                this.f63369 = abstractC15440;
                this.f63370 = str;
                this.f63371 = j;
                return;
            }
        }
        throw new IOException("Invalid resource table metadata");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23326 m45090() {
        C23326 c23326;
        C23326 c23327;
        if (this.f63367 != null && (c23327 = (C23326) this.f63367.get()) != null) {
            return c23327;
        }
        synchronized (this.f63368) {
            if (this.f63367 != null && (c23326 = (C23326) this.f63367.get()) != null) {
                return c23326;
            }
            try {
                C23326 c23328 = new C23326(this.f63369);
                c23328.m51731();
                this.f63367 = new SoftReference(c23328);
                return c23328;
            } catch (Exception e) {
                throw C3059.m9368("RESOURCE_TABLE_PARSE_FAILED", e.getMessage() == null ? "Failed to parse resources.arsc" : e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m45089() throws C3059 {
        try {
            byte[] bArrM34535 = C14460.m34535(this.f63370);
            if (bArrM34535.length == 32) {
                return bArrM34535;
            }
            throw new IllegalArgumentException("Invalid SHA-256 length");
        } catch (RuntimeException unused) {
            throw C3059.m9368("RESOURCE_TABLE_PARSE_FAILED", "Resource table metadata is invalid.");
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m45091() {
        return this.f63371;
    }
}
