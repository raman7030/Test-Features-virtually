package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֫᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: W9OU */
/* JADX INFO: loaded from: classes2.dex */
public class C4293 extends IOException {
    public static final long serialVersionUID = -1616151763072450476L;

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC10467 f9540;

    /* JADX INFO: renamed from: ֫ */
    public final void m8713(InterfaceC10467 interfaceC10467) {
        this.f9540 = interfaceC10467;
    }

    /* JADX INFO: renamed from: ֫ */
    public final IOException m8712() {
        return getCause() instanceof IOException ? (IOException) getCause() : this;
    }

    /* JADX INFO: renamed from: ᩷ */
    public static C4293 m8710() {
        return new C4293("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: ᩻ */
    public static C4293 m8711() {
        return new C4293("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: ܳ */
    public static C4293 m8706() {
        return new C4293("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: ܽ */
    public static C4293 m8707() {
        return new C4293("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: ۧ */
    public static C4293 m8705() {
        return new C4293("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: renamed from: ܿ */
    public static C9637 m8708() {
        return new C9637("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: ۜ */
    public static C4293 m8704() {
        return new C4293("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C4293 m8709() {
        return new C4293("Protocol message had invalid UTF-8.");
    }
}
