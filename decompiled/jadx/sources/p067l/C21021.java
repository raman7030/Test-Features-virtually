package p067l;

import java.io.IOException;
import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: l.᩵ᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z75Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C21021 {

    /* JADX INFO: renamed from: ֫ */
    public volatile SoftReference f65988;

    /* JADX INFO: renamed from: ۧ */
    public final Object f65989 = new Object();

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC17043 f65990;

    /* JADX INFO: renamed from: ܿ */
    public final String f65991;

    /* JADX INFO: renamed from: ᩳ */
    public final long f65992;

    public C21021(long j, AbstractC17043 abstractC17043, String str) throws IOException {
        if (str != null && str.length() == 64) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.digit(str.charAt(i), 16) != -1) {
                }
            }
            if (j >= 0) {
                if (!abstractC17043.mo25093()) {
                    throw new IOException("Resource table is unavailable");
                }
                if (abstractC17043.mo25101() != j) {
                    throw new IOException("Resource table metadata length mismatch");
                }
                this.f65990 = abstractC17043;
                this.f65991 = str;
                this.f65992 = j;
                return;
            }
        }
        throw new IOException("Invalid resource table metadata");
    }

    /* JADX INFO: renamed from: ۧ */
    public final C24538 m47386() {
        C24538 c24538;
        C24538 c24539;
        if (this.f65988 != null && (c24539 = (C24538) this.f65988.get()) != null) {
            return c24539;
        }
        synchronized (this.f65989) {
            if (this.f65988 != null && (c24538 = (C24538) this.f65988.get()) != null) {
                return c24538;
            }
            try {
                C24538 c245310 = new C24538(this.f65990);
                c245310.m54128();
                this.f65988 = new SoftReference(c245310);
                return c245310;
            } catch (Exception e) {
                throw C5276.m11410("RESOURCE_TABLE_PARSE_FAILED", e.getMessage() == null ? "Failed to parse resources.arsc" : e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m47385() throws C5276 {
        try {
            byte[] bArrM36669 = C16111.m36669(this.f65991);
            if (bArrM36669.length == 32) {
                return bArrM36669;
            }
            throw new IllegalArgumentException("Invalid SHA-256 length");
        } catch (RuntimeException unused) {
            throw C5276.m11410("RESOURCE_TABLE_PARSE_FAILED", "Resource table metadata is invalid.");
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m47387() {
        return this.f65992;
    }
}
