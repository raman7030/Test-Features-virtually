package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֫᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: W9OU */
/* JADX INFO: loaded from: classes2.dex */
public class C2025 extends IOException {
    public static final long serialVersionUID = -1616151763072450476L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC8522 f6755;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6587(InterfaceC8522 interfaceC8522) {
        this.f6755 = interfaceC8522;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final IOException m6586() {
        return getCause() instanceof IOException ? (IOException) getCause() : this;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C2025 m6584() {
        return new C2025("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C2025 m6585() {
        return new C2025("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C2025 m6580() {
        return new C2025("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C2025 m6581() {
        return new C2025("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C2025 m6579() {
        return new C2025("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C7648 m6582() {
        return new C7648("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C2025 m6578() {
        return new C2025("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C2025 m6583() {
        return new C2025("Protocol message had invalid UTF-8.");
    }
}
