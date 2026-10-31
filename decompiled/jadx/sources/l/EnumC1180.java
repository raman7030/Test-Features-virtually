package l;

/* JADX INFO: renamed from: l.֨ܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1180 implements InterfaceC5414 {
    SWITCH_PROTOCOL(101, "Switching Protocols"),
    OK(200, "OK"),
    CREATED(201, "Created"),
    ACCEPTED(202, "Accepted"),
    NO_CONTENT(204, "No Content"),
    PARTIAL_CONTENT(206, "Partial Content"),
    MULTI_STATUS(207, "Multi-Status"),
    REDIRECT(301, "Moved Permanently"),
    FOUND(302, "Found"),
    REDIRECT_SEE_OTHER(303, "See Other"),
    NOT_MODIFIED(304, "Not Modified"),
    TEMPORARY_REDIRECT(307, "Temporary Redirect"),
    BAD_REQUEST(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not Found"),
    METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
    NOT_ACCEPTABLE(406, "Not Acceptable"),
    REQUEST_TIMEOUT(408, "Request Timeout"),
    CONFLICT(409, "Conflict"),
    GONE(410, "Gone"),
    LENGTH_REQUIRED(411, "Length Required"),
    PRECONDITION_FAILED(412, "Precondition Failed"),
    PAYLOAD_TOO_LARGE(413, "Payload Too Large"),
    UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type"),
    RANGE_NOT_SATISFIABLE(416, "Requested Range Not Satisfiable"),
    EXPECTATION_FAILED(417, "Expectation Failed"),
    TOO_MANY_REQUESTS(429, "Too Many Requests"),
    INTERNAL_ERROR(500, "Internal Server Error"),
    NOT_IMPLEMENTED(501, "Not Implemented"),
    SERVICE_UNAVAILABLE(503, "Service Unavailable"),
    UNSUPPORTED_HTTP_VERSION(505, "HTTP Version Not Supported");


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f4268;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f4269;

    EnumC1180(int i, String str) {
        this.f4269 = i;
        this.f4268 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC1180 m3990(int i) {
        for (EnumC1180 enumC1180 : values()) {
            if (enumC1180.mo3992() == i) {
                return enumC1180;
            }
        }
        return null;
    }

    @Override // l.InterfaceC5414
    public String getDescription() {
        return "" + this.f4269 + " " + this.f4268;
    }

    @Override // l.InterfaceC5414
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int mo3992() {
        return this.f4269;
    }
}
