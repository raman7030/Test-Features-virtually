package p067l;

/* JADX INFO: renamed from: l.۬۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: I8QJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14686 implements InterfaceC14016 {
    /* JADX INFO: renamed from: ۧ */
    public final boolean m33616(C10307 c10307) {
        String str = c10307.f28528;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC16744 m33615(C10307 c10307) {
        String str = c10307.f28528;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new C23451();
                case "application/x-icy":
                    return new C14063();
                case "application/id3":
                    return new C18952(null);
                case "application/x-emsg":
                    return new C6687();
                case "application/x-scte35":
                    return new C3529();
            }
        }
        throw new IllegalArgumentException(C21466.m48631("Attempted to create decoder for unsupported MIME type: ", str));
    }
}
