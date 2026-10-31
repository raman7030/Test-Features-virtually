.class public final Ll/۟᩵ۜ;
.super Ll/ۙۛ᩻;
.source "66KH"


# instance fields
.field public final ֫:Ll/ܰ᩵ۜ;


# direct methods
.method public constructor <init>(Ll/ܰ᩵ۜ;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 19
    iput-object p1, p0, Ll/۟᩵ۜ;->֫:Ll/ܰ᩵ۜ;

    return-void
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 39
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

    const/4 v0, 0x0

    .line 63
    invoke-static {p1, v0}, Ll/᩷֡ۜ;->֫(Ll/ۗۛ᩻;Z)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 2

    .line 68
    new-instance v0, Ll/۬ۛ᩻;

    iget-object v1, p0, Ll/۟᩵ۜ;->֫:Ll/ܰ᩵ۜ;

    invoke-virtual {v1, p1}, Ll/ܰ᩵ۜ;->֫(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {p1, v1}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Create a ZIP archive from local files or directory contents using explicit sourcePath to entryPath mappings. Sources remain unchanged. ZIP names are case-sensitive; trailing / distinguishes directories, and leading /, . and .. are preserved literally. Conflicting mapped files are rejected. The output cannot be included in its own sources. A non-empty password encrypts file entries with AES-256. If saving fails, check the reported destination state before retrying."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Create ZIP"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 6

    .line 44
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Absolute or Home-relative source file or directory; directories must end in /. Includes hidden files and empty directories."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "sourcePath"

    .line 45
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "entryPath"

    const-string v3, "Complete destination ZIP entry path, not a basename. For a directory source, end in / or use an empty string for the root. Maps contents without the source folder name: images/ to assets/ puts images/a.png at assets/a.png."

    const-string v4, "One source mapping."

    .line 0
    invoke-static {v0, v1, v3, v2, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 47
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Absolute or Home-relative destination ZIP file; its parent must exist. Split archives are not supported."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "outputPath"

    .line 48
    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 49
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "type"

    const-string v5, "array"

    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "items"

    invoke-virtual {v3, v4, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "description"

    const-string v4, "Non-empty source mappings; expanded targets must not conflict."

    .line 50
    invoke-virtual {v0, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "sources"

    .line 49
    invoke-virtual {v2, v3, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "True permits replacing an existing regular output file; recommended false."

    const-string v3, "boolean"

    .line 124
    invoke-static {v3, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "overwrite"

    .line 51
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Compression level 0 through 9: 0 stores files without compression; 1 through 9 use Deflate, from fastest to strongest compression. Recommended 6."

    const-string v3, "integer"

    .line 110
    invoke-static {v3, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "level"

    .line 52
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "password"

    const-string v3, "Empty string for no encryption; otherwise the password for new file entries."

    const-string v4, "Arguments for mt_zip_create."

    .line 0
    invoke-static {v0, v1, v3, v2, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 2

    const-string v0, "mt_zip_create"

    const/4 v1, 0x0

    .line 58
    invoke-static {v0, v1}, Ll/᩷֡ۜ;->֫(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_zip_create"

    return-object v0
.end method
