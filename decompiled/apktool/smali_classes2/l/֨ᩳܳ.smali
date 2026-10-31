.class public final Ll/֨ᩳܳ;
.super Ljava/lang/Object;
.source "J72V"


# static fields
.field public static final ֫:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 41
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "htm"

    const-string v2, "shtml"

    const-string v3, "html"

    .line 42
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "text/html"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "xhtml"

    const-string v2, "xht"

    .line 43
    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "application/xhtml+xml"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "mhtml"

    const-string v2, "mht"

    .line 44
    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "multipart/related"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "css"

    .line 45
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "text/css"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "mjs"

    const-string v2, "cjs"

    const-string v3, "js"

    .line 46
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "text/javascript"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "json"

    const-string v2, "map"

    .line 47
    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "application/json"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "webmanifest"

    .line 48
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "application/manifest+json"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "xsl"

    const-string v2, "xslt"

    const-string v3, "xml"

    .line 49
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "application/xml"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "wasm"

    .line 50
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "application/wasm"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "svg"

    const-string v2, "svgz"

    .line 51
    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "image/svg+xml"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "png"

    const-string v2, "apng"

    .line 52
    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "image/png"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "jpeg"

    const-string v2, "jpe"

    const-string v3, "jpg"

    .line 53
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "image/jpeg"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "gif"

    .line 54
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "image/gif"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "webp"

    .line 55
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "image/webp"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "avif"

    .line 56
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "image/avif"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "bmp"

    const-string v2, "dib"

    .line 57
    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "image/bmp"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "ico"

    const-string v2, "cur"

    .line 58
    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "image/x-icon"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "tif"

    const-string v2, "tiff"

    .line 59
    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "image/tiff"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "woff"

    .line 60
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "font/woff"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "woff2"

    .line 61
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "font/woff2"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "ttf"

    .line 62
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "font/ttf"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "otf"

    .line 63
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "font/otf"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "eot"

    .line 64
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "application/vnd.ms-fontobject"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "mp2"

    const-string v2, "mpga"

    const-string v3, "mp3"

    .line 65
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "audio/mpeg"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "ogg"

    const-string v2, "opus"

    const-string v3, "oga"

    .line 66
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "audio/ogg"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "wav"

    .line 67
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "audio/wav"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "m4a"

    .line 68
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "audio/mp4"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "aac"

    .line 69
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "audio/aac"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "flac"

    .line 70
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "audio/flac"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "mp4"

    const-string v2, "m4v"

    .line 71
    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "video/mp4"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "webm"

    .line 72
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "video/webm"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "ogv"

    .line 73
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "video/ogg"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "ts"

    const-string v2, "m2ts"

    .line 74
    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "video/mp2t"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "m3u8"

    .line 75
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "application/vnd.apple.mpegurl"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "vtt"

    .line 76
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "text/vtt"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "pdf"

    .line 77
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "application/pdf"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "txt"

    const-string v2, "text"

    .line 78
    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "text/plain"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "csv"

    .line 79
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "text/csv"

    invoke-static {v0, v2, v1}, Ll/֨ᩳܳ;->֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V

    .line 14
    sput-object v0, Ll/֨ᩳܳ;->֫:Ljava/util/HashMap;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/16 v0, 0x2f

    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    const/16 v1, 0x2e

    .line 25
    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    if-le v1, v0, :cond_0

    add-int/lit8 v1, v1, 0x1

    .line 26
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 27
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ll/֨ᩳܳ;->֫:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    .line 32
    :cond_0
    invoke-static {p0}, Ljava/net/URLConnection;->guessContentTypeFromName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    const-string p0, "application/octet-stream"

    :cond_1
    return-object p0
.end method

.method public static varargs ֫(Ljava/util/HashMap;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 3

    .line 88
    array-length v0, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p2, v1

    .line 89
    invoke-virtual {p0, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
