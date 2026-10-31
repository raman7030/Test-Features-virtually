.class public final Ll/۬ܿۜ;
.super Ll/ۙۛ᩻;
.source "W760"


# instance fields
.field public ֫:Lbin/mt/json/JSONObject;

.field public final ۧ:Ll/֫ۨ᩻;

.field public ܽ:Lbin/mt/json/JSONObject;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 32
    new-instance v0, Ll/֫ۨ᩻;

    .line 27
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 38
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 39
    iput-object v0, p0, Ll/۬ܿۜ;->ۧ:Ll/֫ۨ᩻;

    return-void
.end method

.method public static ֫(I)V
    .locals 4

    const/16 v0, 0xc8

    const/4 v1, 0x1

    if-lt p0, v1, :cond_0

    if-gt p0, v0, :cond_0

    return-void

    .line 222
    :cond_0
    invoke-static {p0}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object p0

    filled-new-array {v1, v0}, [I

    move-result-object v0

    .line 223
    invoke-static {v0}, Lbin/mt/json/JSON;->array([I)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 224
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const/16 v2, 0x32

    const-string v3, "limit"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Invalid limit"

    .line 222
    invoke-static {v2, v3, p0, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ۧ(Lbin/mt/json/JSONObject;)Ll/ۗܿۜ;
    .locals 7

    .line 164
    invoke-virtual {p0}, Lbin/mt/json/JSONObject;->names()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/16 v2, 0x32

    const-string v3, ""

    const-string v4, "limit"

    const-string v5, "prefix"

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 165
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_0

    .line 167
    :cond_1
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    filled-new-array {v5, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 168
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v6

    invoke-virtual {v6, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v3, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Invalid list_available_apks argument"

    .line 166
    invoke-static {v3, v1, p0, v0, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 174
    :cond_2
    invoke-virtual {p0, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 175
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v1

    if-nez v1, :cond_6

    .line 179
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 183
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v0

    .line 195
    invoke-virtual {p0, v4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_4

    .line 196
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v1

    if-nez v1, :cond_4

    .line 200
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v1

    const-string v3, "Invalid limit"

    if-eqz v1, :cond_3

    .line 205
    :try_start_0
    invoke-static {p0}, Ll/֨ۙ᩵;->ۧ(Lbin/mt/json/JSONValue;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 152
    invoke-static {p0}, Ll/۬ܿۜ;->֫(I)V

    .line 153
    new-instance v1, Ll/ۗܿۜ;

    invoke-direct {v1, v0, p0}, Ll/ۗܿۜ;-><init>(Ljava/lang/String;I)V

    return-object v1

    .line 208
    :catch_0
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 207
    invoke-static {v3, v4, p0, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 202
    :cond_3
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 201
    invoke-static {v3, v4, p0, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 198
    :cond_4
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Missing parameter: limit"

    .line 197
    invoke-static {v2, v4, p0, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 181
    :cond_5
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p0

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Invalid prefix"

    .line 180
    invoke-static {v2, v5, v0, p0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 177
    :cond_6
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p0

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Missing parameter: prefix"

    .line 176
    invoke-static {v2, v5, v0, p0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 62
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "readOnlyHint"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 0

    .line 95
    invoke-static {p1}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 3

    .line 106
    :try_start_0
    invoke-static {p1}, Ll/۬ܿۜ;->ۧ(Lbin/mt/json/JSONObject;)Ll/ۗܿۜ;

    move-result-object p1

    .line 107
    sget v0, Ll/ۡۨ᩻;->֫:I

    .line 157
    iget-object v0, p0, Ll/۬ܿۜ;->ۧ:Ll/֫ۨ᩻;

    iget-object v1, p1, Ll/ۗܿۜ;->ۧ:Ljava/lang/String;

    iget p1, p1, Ll/ۗܿۜ;->֫:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v2, 0x1

    invoke-static {v1, p1, v0, v2}, Ll/֫ۨ᩻;->֫(Ljava/lang/String;IIZ)Ll/۟ۛ᩻;

    move-result-object p1

    .line 110
    new-instance v0, Ll/۬ۛ᩻;

    invoke-static {p1}, Ll/ۙܿۜ;->֫(Ll/۟ۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception p1

    .line 112
    sget v0, Ll/ۡۨ᩻;->֫:I

    .line 113
    throw p1
.end method

.method public final ֫(Ll/ۖۨ᩻;Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 5

    .line 121
    iget-object v0, p1, Ll/ۖۨ᩻;->ۧ:Lbin/mt/json/JSONObject;

    .line 122
    iget-object v1, p1, Ll/ۖۨ᩻;->ܽ:Lbin/mt/json/JSONObject;

    const-string v2, "prefix"

    const/4 v3, 0x0

    .line 123
    invoke-virtual {v0, v2, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "offset"

    const/4 v3, -0x1

    .line 124
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v1

    const-string v2, "limit"

    .line 125
    invoke-virtual {p2, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p2

    .line 126
    iget p1, p1, Ll/ۖۨ᩻;->ᩳ:I

    if-eqz p2, :cond_1

    .line 128
    invoke-virtual {p2}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result p1

    const/16 v3, 0x32

    const-string v4, "Invalid limit"

    if-eqz p1, :cond_0

    .line 132
    :try_start_0
    invoke-static {p2}, Ll/֨ۙ᩵;->ۧ(Lbin/mt/json/JSONValue;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 217
    :catch_0
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p1

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 216
    invoke-static {v4, v2, p2, p1, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 134
    throw p1

    .line 217
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p1

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 216
    invoke-static {v4, v2, p2, p1, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 129
    throw p1

    .line 137
    :cond_1
    :goto_0
    invoke-static {p1}, Ll/۬ܿۜ;->֫(I)V

    .line 143
    sget p2, Ll/ۡۨ᩻;->֫:I

    .line 144
    iget-object p2, p0, Ll/۬ܿۜ;->ۧ:Ll/֫ۨ᩻;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x0

    invoke-static {v0, p1, v1, p2}, Ll/֫ۨ᩻;->֫(Ljava/lang/String;IIZ)Ll/۟ۛ᩻;

    move-result-object p1

    .line 146
    new-instance p2, Ll/۬ۛ᩻;

    invoke-static {p1}, Ll/ۙܿۜ;->֫(Ll/۟ۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-direct {p2, p1}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object p2
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "List APK targets that mt_apk_workspace_open can open. Use prefix=\"\" for no filter; when the current APK is available, the first page may start with mt://current-apk. Other items recursively include APK files in the current Home folder and its subdirectories, and return paths relative to Home. Pass data.items[].path directly as mt_apk_workspace_open.path, choose mt_apk_workspace_open.temporary for the intended lifetime, pass limit=50 unless you need a different page size, and use mt_apk_continue for later pages."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "List Available APKs"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 67
    iget-object v0, p0, Ll/۬ܿۜ;->֫:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "{\n  \"prefix\": {\n    \"type\": \"string\",\n    \"description\": \"Home-relative path prefix filter for APK paths returned by this tool. Pass \\\"\\\" for no filter and to include mt://current-apk when available. Prefixes may name subdirectories such as release/.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Page size for the first page. Recommended value is 50; maximum 200. Use mt_apk_continue for later pages.\"\n  }\n}\n"

    .line 70
    invoke-static {v0}, Ll/ۘܳ֨;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/۬ܿۜ;->֫:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 7

    .line 87
    iget-object v0, p0, Ll/۬ܿۜ;->ܽ:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    .line 94
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Actual relative path prefix filter; empty string means no filter and may include mt://current-apk."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "prefix"

    .line 95
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "description"

    const-string v3, "APK targets that can be opened by mt_apk_workspace_open."

    const-string v4, "type"

    const-string v5, "array"

    .line 0
    invoke-static {v4, v5, v2, v3}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 106
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Path target to pass directly to mt_apk_workspace_open.path; may be mt://current-apk for the current APK or a relative APK path. Also set mt_apk_workspace_open.temporary when opening it."

    .line 96
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "path"

    .line 107
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "integer"

    const-string v5, "File size in bytes."

    .line 110
    invoke-static {v4, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "size"

    .line 108
    invoke-virtual {v3, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "File modification time as epoch milliseconds."

    .line 110
    invoke-static {v4, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "lastModified"

    .line 109
    invoke-virtual {v3, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "Resolved or raw application label when available."

    .line 103
    invoke-static {v1, v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "appLabel"

    .line 110
    invoke-virtual {v3, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "Manifest package name when available."

    .line 103
    invoke-static {v1, v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "packageName"

    .line 111
    invoke-virtual {v3, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "Manifest versionName when available."

    .line 103
    invoke-static {v1, v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "versionName"

    .line 112
    invoke-virtual {v3, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "Manifest versionCode when available."

    .line 117
    invoke-static {v4, v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "versionCode"

    .line 113
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Whether AndroidManifest.xml was parsed successfully."

    const-string v5, "boolean"

    .line 124
    invoke-static {v5, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "manifestAvailable"

    .line 114
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Manifest parse error, or null."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "manifestError"

    .line 115
    invoke-virtual {v3, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Available APK target."

    .line 106
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "items"

    invoke-virtual {v2, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 96
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Hard maximum limit accepted by mt_apk_continue for this cursor."

    const-string v2, "Total available count when known, or null."

    const-string v3, "Number of APK targets returned on this page."

    .line 170
    invoke-static {v3, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 97
    invoke-static {v1}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "pagination"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Successful mt_apk_list_available_apks data."

    .line 94
    invoke-static {v0, v1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 30
    invoke-static {}, Ll/۫ܳۜ;->֫()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "continue"

    .line 121
    invoke-static {}, Ll/ۧᩳܽ;->֫()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "mt_apk_continue"

    .line 120
    invoke-static {v3, v4, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Lbin/mt/json/JSONObject;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const-string v2, "Executable continue actions; copy arguments directly."

    .line 119
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_apk_list_available_apks. data.items[] contains APK targets that can be opened by mt_apk_workspace_open; pass items[i].path to mt_apk_workspace_open.path and choose mt_apk_workspace_open.temporary for the intended lifetime; nextActions carries continuation calls."

    .line 28
    invoke-static {v3, v0, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 90
    iput-object v0, p0, Ll/۬ܿۜ;->ܽ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_list_available_apks"

    return-object v0
.end method
