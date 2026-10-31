.class public final Ll/ۙۘۜ;
.super Ll/ۙۛ᩻;
.source "P6W3"


# instance fields
.field public final ֫:Ll/۬ۖۜ;


# direct methods
.method public constructor <init>(Ll/۬ۖۜ;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 24
    iput-object p1, p0, Ll/ۙۘۜ;->֫:Ll/۬ۖۜ;

    return-void
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 34
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "readOnlyHint"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "destructiveHint"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 1

    const-string v0, "mt_file_append_bytes"

    .line 40
    invoke-static {v0, p1}, Ll/ۗᩳۘ;->֫(Ljava/lang/String;Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 13

    const-string v0, "path"

    const-string v1, "targetVersion"

    const-string v2, "hex"

    .line 43
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    .line 26
    new-instance v3, Ll/ۤᩴۜ;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    const-string v4, "Invalid file tail argument"

    invoke-static {p1, v3, v4, v1}, Ll/ۛۘۜ;->֫(Lbin/mt/json/JSONObject;Ll/ۤۘۜ;Ljava/lang/String;[Ljava/lang/String;)V

    .line 44
    invoke-static {p1, v0}, Ll/ۛᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 45
    invoke-static {p1}, Ll/ۛᩴۜ;->֫(Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    .line 46
    invoke-static {p1, v2}, Ll/ۛᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 47
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/high16 v3, 0x200000

    if-gt v2, v3, :cond_0

    .line 52
    :try_start_0
    invoke-static {p1}, Ll/ܰۘܺ;->֫(Ljava/lang/String;)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    invoke-static {}, Ll/᩸ܺۜ;->֫()V

    const/4 v2, 0x1

    new-array v2, v2, [J

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    aput-wide v4, v2, v3

    .line 58
    new-instance v6, Ll/᩶ۘۜ;

    invoke-direct {v6, v2, p1}, Ll/᩶ۘۜ;-><init>([J[B)V

    iget-object p1, p0, Ll/ۙۘۜ;->֫:Ll/۬ۖۜ;

    invoke-virtual {p1, v0, v1, v6}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ۢۖۜ;)Ll/۠ۖۜ;

    move-result-object v7

    .line 70
    aget-wide v0, v2, v3

    const-wide/16 v2, 0x20

    sub-long/2addr v0, v2

    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v11

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    invoke-static/range {v7 .. v12}, Ll/ۛᩴۜ;->֫(Ll/۠ۖۜ;Ljava/lang/String;JJ)Ll/۬ۛ᩻;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 54
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    .line 53
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "FILE_INVALID_HEX"

    const-string v3, "warning"

    .line 52
    invoke-static {v2, p1, v3, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 54
    throw p1

    .line 48
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    int-to-long v0, p1

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    const-wide/16 v2, 0x2

    div-long/2addr v0, v2

    const-string p1, "Appended bytes exceed the 1048576-byte limit."

    const-wide/32 v2, 0x100000

    invoke-static {p1, v2, v3, v0, v1}, Ll/ۛᩴۜ;->֫(Ljava/lang/String;JJ)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Append raw hexadecimal bytes at the original EOF, preserving all existing bytes. No separator, newline or BOM is added. Empty hex is a successful no-op. The final file size must be at most 9007199254740991 bytes. Only existing regular files are supported; no creation or automatic backup. Copy the current targetVersion before calling. Large files are streamed but require whole-file reads and space for the resulting file. Publication guarantees depend on the file backend; inspect error state before retrying. After a lost response, read the file before repeating an append with a refreshed version."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Append File Bytes"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 5

    .line 36
    invoke-static {}, Ll/ۛᩴۜ;->֫()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Append 0..1048576 raw bytes as even-length, case-insensitive hexadecimal without separators. Empty is a no-op."

    const-string v2, "string"

    const-string v3, "hex"

    const-string v4, "Arguments for mt_file_append_bytes."

    .line 0
    invoke-static {v0, v2, v1, v3, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 2

    const-string v0, "mt_file_append_bytes"

    const/4 v1, 0x0

    .line 39
    invoke-static {v0, v1}, Ll/ۛᩴۜ;->֫(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_file_append_bytes"

    return-object v0
.end method
