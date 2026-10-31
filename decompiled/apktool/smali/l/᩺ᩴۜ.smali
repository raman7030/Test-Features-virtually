.class public final Ll/᩺ᩴۜ;
.super Ll/ۙۛ᩻;
.source "D6WI"


# instance fields
.field public final ֫:Ll/۬ۖۜ;


# direct methods
.method public constructor <init>(Ll/۬ۖۜ;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 24
    iput-object p1, p0, Ll/᩺ᩴۜ;->֫:Ll/۬ۖۜ;

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

    const-string v0, "mt_file_truncate_bytes"

    .line 40
    invoke-static {v0, p1}, Ll/ۗᩳۘ;->֫(Ljava/lang/String;Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 11

    const-string v0, "targetVersion"

    const-string v1, "size"

    const-string v2, "path"

    .line 43
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    .line 26
    new-instance v1, Ll/ۤᩴۜ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v3, "Invalid file tail argument"

    invoke-static {p1, v1, v3, v0}, Ll/ۛۘۜ;->֫(Lbin/mt/json/JSONObject;Ll/ۤۘۜ;Ljava/lang/String;[Ljava/lang/String;)V

    .line 44
    invoke-static {p1, v2}, Ll/ۛᩴۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 45
    invoke-static {p1}, Ll/ۛᩴۜ;->֫(Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    const-wide/16 v4, 0x0

    const-wide v6, 0x1fffffffffffffL

    const-string v3, "size"

    move-object v2, p1

    .line 46
    invoke-static/range {v2 .. v7}, Ll/᩸ۡۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;JJ)J

    move-result-wide v2

    .line 47
    invoke-static {}, Ll/᩸ܺۜ;->֫()V

    .line 48
    new-instance p1, Ll/ۨᩴۜ;

    invoke-direct {p1, v2, v3}, Ll/ۨᩴۜ;-><init>(J)V

    iget-object v4, p0, Ll/᩺ᩴۜ;->֫:Ll/۬ۖۜ;

    invoke-virtual {v4, v0, v1, p1}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ۢۖۜ;)Ll/۠ۖۜ;

    move-result-object v5

    const-wide/16 v0, 0x100

    sub-long/2addr v2, v0

    const-wide/16 v0, 0x0

    .line 57
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v9

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    invoke-static/range {v5 .. v10}, Ll/ۛᩴۜ;->֫(Ll/۠ۖۜ;Ljava/lang/String;JJ)Ll/۬ۛ᩻;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Keep the original byte range [0, size) and discard the tail. size=0 empties the file; the current size is a successful no-op. A size greater than the current file is rejected, never zero-filled. May split encoded characters and does not guarantee valid text. Only existing regular files are supported; no creation or automatic backup. Copy the current targetVersion before calling. Large files are streamed but require whole-file reads and space for the resulting file. Publication guarantees depend on the file backend; inspect error state before retrying. After a lost response, read the file before repeating an append with a refreshed version."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Truncate File Bytes"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 5

    .line 36
    invoke-static {}, Ll/ۛᩴۜ;->֫()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Final byte size to keep, 0..9007199254740991 and no greater than current size. Use 0 to empty."

    const-string v2, "integer"

    const-string v3, "size"

    const-string v4, "Arguments for mt_file_truncate_bytes."

    .line 0
    invoke-static {v0, v2, v1, v3, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 2

    const-string v0, "mt_file_truncate_bytes"

    const/4 v1, 0x0

    .line 39
    invoke-static {v0, v1}, Ll/ۛᩴۜ;->֫(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_file_truncate_bytes"

    return-object v0
.end method
