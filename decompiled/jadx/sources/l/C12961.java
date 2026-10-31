package l;

/* JADX INFO: renamed from: l.۬۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: I8QJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C12961 implements InterfaceC12256 {
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m31530(C8353 c8353) {
        String str = c8353.f25614;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15126 m31529(C8353 c8353) {
        String str = c8353.f25614;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new C22183();
                case "application/x-icy":
                    return new C12305();
                case "application/id3":
                    return new C17449(null);
                case "application/x-emsg":
                    return new C4544();
                case "application/x-scte35":
                    return new C1221();
            }
        }
        throw new IllegalArgumentException(C20094.m46315("Attempted to create decoder for unsupported MIME type: ", str));
    }
}
