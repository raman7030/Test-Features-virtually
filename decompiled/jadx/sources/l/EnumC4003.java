package l;

/* JADX INFO: renamed from: l.ۘܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC4003 {
    GET,
    PUT,
    POST,
    DELETE,
    HEAD,
    OPTIONS,
    TRACE,
    CONNECT,
    PATCH,
    PROPFIND,
    PROPPATCH,
    MKCOL,
    MOVE,
    COPY,
    LOCK,
    UNLOCK;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC4003 m12056(String str) {
        if (str == null) {
            return null;
        }
        try {
            return valueOf(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
