.class public final Ll/ᩳܳۜ;
.super Ll/ۙۛ᩻;
.source "U7AG"


# instance fields
.field public ֫:Lbin/mt/json/JSONObject;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/᩵᩻ۜ;


# direct methods
.method public constructor <init>(Ll/᩵᩻ۜ;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 34
    iput-object p1, p0, Ll/ᩳܳۜ;->ܽ:Ll/᩵᩻ۜ;

    return-void
.end method

.method public static ֫(Ll/ۗۜۜ;)Lbin/mt/json/JSONObject;
    .locals 21

    move-object/from16 v0, p0

    .line 145
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v2, v0, Ll/ۗۜۜ;->ܳ:Ljava/util/ArrayList;

    iget-boolean v3, v0, Ll/ۗۜۜ;->ۢ:Z

    iget-object v4, v0, Ll/ۗۜۜ;->ۡ:Ljava/lang/String;

    .line 146
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const-string v5, "zipEntries"

    invoke-virtual {v1, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v2, v0, Ll/ۗۜۜ;->ᩳ:Ljava/util/ArrayList;

    .line 147
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const-string v5, "dexEntries"

    invoke-virtual {v1, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "xmlEntries"

    iget v5, v0, Ll/ۗۜۜ;->ܺ:I

    .line 148
    invoke-virtual {v1, v2, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v2, v0, Ll/ۗۜۜ;->ܿ:Ll/۟ۨ᩻;

    iget v2, v2, Ll/۟ۨ᩻;->ۧ:I

    const-string v5, "classes"

    .line 149
    invoke-virtual {v1, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 150
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "canReadAxml"

    const/4 v6, 0x1

    .line 151
    invoke-virtual {v2, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v2

    iget-boolean v5, v0, Ll/ۗۜۜ;->ۧ:Z

    const-string v6, "canSearchDexNames"

    .line 152
    invoke-virtual {v2, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v6, "canSearchDexStrings"

    iget-boolean v7, v0, Ll/ۗۜۜ;->ܽ:Z

    .line 153
    invoke-virtual {v2, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v2

    iget-object v6, v0, Ll/ۗۜۜ;->ۜ:Ll/ᩴᩳۜ;

    iget-boolean v7, v6, Ll/ᩴᩳۜ;->֫:Z

    const-string v8, "canReadResourceTable"

    .line 154
    invoke-virtual {v2, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 155
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v7

    .line 157
    iget-object v8, v0, Ll/ۗۜۜ;->᩻:Ll/᩶ۨ᩻;

    iget-boolean v9, v8, Ll/᩶ۨ᩻;->ܽ:Z

    const-string v10, "limit"

    const-string v11, "editSessionId"

    const-string v12, "inspect"

    const-string v13, "workspaceId"

    const-string v14, ""

    if-eqz v9, :cond_0

    .line 0
    invoke-static {v13, v4, v11, v14}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-string v15, "axml"

    const-string v16, "AndroidManifest.xml"

    const/16 v17, 0x0

    const/16 v18, 0x0

    .line 162
    invoke-static/range {v15 .. v20}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v16, v2

    const-string v2, "locator"

    invoke-virtual {v9, v2, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const/16 v9, 0x1f4

    .line 164
    invoke-virtual {v2, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v9, "maxChars"

    const v15, 0xc000

    .line 165
    invoke-virtual {v2, v9, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v9, "startLine"

    const/4 v15, 0x0

    .line 166
    invoke-virtual {v2, v9, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v9, "startColumn"

    .line 167
    invoke-virtual {v2, v9, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v9, "mt_apk_read_text"

    const-string v15, "Read decoded AndroidManifest.xml"

    .line 158
    invoke-static {v2, v9, v12, v15}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-virtual {v7, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_0
    move-object/from16 v16, v2

    .line 0
    :goto_0
    invoke-static {v13, v4, v11, v14}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v9, "zip_entries"

    const-string v15, "view"

    .line 173
    invoke-virtual {v2, v15, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v9, "prefix"

    .line 174
    invoke-virtual {v2, v9, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    move-object/from16 v17, v1

    const/16 v1, 0xc8

    .line 175
    invoke-virtual {v2, v10, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "mt_apk_list"

    const-string v0, "List APK ZIP entries"

    .line 169
    invoke-static {v1, v2, v12, v0}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v7, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    if-eqz v5, :cond_1

    .line 0
    invoke-static {v13, v4, v11, v14}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "dex_classes"

    .line 181
    invoke-virtual {v0, v15, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 182
    invoke-virtual {v0, v9, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const/16 v1, 0xc8

    .line 183
    invoke-virtual {v0, v10, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "List dex classes"

    .line 177
    invoke-static {v0, v2, v12, v1}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v7, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    .line 185
    :cond_1
    iget-boolean v0, v6, Ll/ᩴᩳۜ;->֫:Z

    if-eqz v0, :cond_2

    .line 0
    invoke-static {v13, v4, v11, v14}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "resource_table"

    .line 190
    invoke-virtual {v0, v15, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 191
    invoke-virtual {v0, v9, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const/16 v1, 0xc8

    .line 192
    invoke-virtual {v0, v10, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "List resource table"

    .line 186
    invoke-static {v0, v2, v12, v1}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v7, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    :cond_2
    if-eqz v3, :cond_3

    .line 198
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0, v13, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "mt_apk_workspace_delete"

    const-string v2, "cleanup"

    const-string v5, "Clean up this temporary workspace only after it is no longer needed"

    .line 195
    invoke-static {v0, v1, v2, v5}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v7, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    .line 200
    :cond_3
    iget-object v0, v8, Ll/᩶ۨ᩻;->֫:Ljava/lang/String;

    if-eqz v0, :cond_4

    goto :goto_1

    .line 202
    :cond_4
    iget-object v0, v8, Ll/᩶ۨ᩻;->ۧ:Ljava/lang/String;

    .line 203
    :goto_1
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 204
    invoke-virtual {v1, v13, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "temporary"

    .line 205
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    move-object/from16 v2, p0

    .line 206
    iget-object v3, v2, Ll/ۗۜۜ;->֫:Ljava/lang/String;

    if-eqz v3, :cond_5

    const-string v4, "apkFileName"

    .line 226
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 207
    :cond_5
    iget-object v3, v8, Ll/᩶ۨ᩻;->᩻:Ljava/lang/String;

    if-eqz v3, :cond_6

    const-string v4, "packageName"

    .line 226
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 208
    :cond_6
    iget-object v3, v8, Ll/᩶ۨ᩻;->ۢ:Ljava/lang/String;

    if-eqz v3, :cond_7

    const-string v4, "versionName"

    .line 226
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    :cond_7
    const-string v3, "versionCode"

    .line 209
    iget-object v4, v8, Ll/᩶ۨ᩻;->᩷:Ljava/lang/String;

    invoke-static {v1, v3, v4}, Ll/ᩳܳۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "minSdk"

    .line 210
    iget-object v4, v8, Ll/᩶ۨ᩻;->ܳ:Ljava/lang/String;

    invoke-static {v1, v3, v4}, Ll/ᩳܳۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "targetSdk"

    .line 211
    iget-object v4, v8, Ll/᩶ۨ᩻;->ۜ:Ljava/lang/String;

    invoke-static {v1, v3, v4}, Ll/ᩳܳۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_8

    const-string v3, "appLabel"

    .line 226
    invoke-virtual {v1, v3, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    :cond_8
    const-string v0, "counts"

    move-object/from16 v3, v17

    .line 213
    invoke-virtual {v1, v0, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "capabilities"

    move-object/from16 v4, v16

    .line 214
    invoke-virtual {v0, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v2, v2, Ll/ۗۜۜ;->᩷:Ll/۠ܿۜ;

    const/4 v3, 0x0

    .line 215
    invoke-static {v2, v3}, Ll/֨ܳۜ;->֫(Ll/۠ܿۜ;Z)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "signature"

    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "nextActions"

    .line 216
    invoke-virtual {v0, v2, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 217
    iget-object v0, v6, Ll/ᩴᩳۜ;->ۧ:Ljava/lang/String;

    if-eqz v0, :cond_9

    const-string v2, "resourceTableSummaryError"

    .line 226
    invoke-virtual {v1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    :cond_9
    return-object v1
.end method

.method private ֫(Ll/᩺᩻ۜ;)Ll/ۗۜۜ;
    .locals 5

    .line 122
    iget-object v0, p1, Ll/᩺᩻ۜ;->֫:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 123
    iget-object v1, p1, Ll/᩺᩻ۜ;->ᩳ:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 124
    invoke-static {}, Ll/ۧۨ᩻;->֫()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    .line 126
    :goto_0
    iget-object v2, p0, Ll/ᩳܳۜ;->ܽ:Ll/᩵᩻ۜ;

    if-nez v1, :cond_1

    .line 127
    invoke-virtual {v2, p1}, Ll/᩵᩻ۜ;->֫(Ll/᩺᩻ۜ;)Ll/ۗۜۜ;

    move-result-object p1

    return-object p1

    :cond_1
    const-string v3, "path"

    .line 129
    invoke-static {v1, v3}, Ll/۫ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v0, :cond_2

    .line 131
    new-instance v0, Ll/᩺᩻ۜ;

    iget-boolean v3, p1, Ll/᩺᩻ۜ;->ۧ:Z

    iget-boolean p1, p1, Ll/᩺᩻ۜ;->ܽ:Z

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v3, p1}, Ll/᩺᩻ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    move-object p1, v0

    .line 135
    :cond_2
    invoke-static {}, Ll/᩹ۤ᩻;->ۧ()Ll/ۛۖۜ;

    move-result-object v0

    invoke-virtual {v0, v1}, Ll/ۛۖۜ;->֫(Ljava/lang/String;)Ll/ۤۖۜ;

    move-result-object v0

    .line 137
    :try_start_0
    invoke-virtual {v2, p1}, Ll/᩵᩻ۜ;->֫(Ll/᩺᩻ۜ;)Ll/ۗۜۜ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    invoke-virtual {v0}, Ll/ۤۖۜ;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    .line 134
    :try_start_1
    invoke-virtual {v0}, Ll/ۤۖۜ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x0

    if-eqz p2, :cond_3

    .line 244
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 247
    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 248
    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x30

    if-lt v2, v3, :cond_3

    const/16 v3, 0x39

    if-le v2, v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 254
    :cond_2
    :try_start_0
    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    :cond_3
    :goto_1
    if-eqz v0, :cond_4

    .line 236
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    :cond_4
    return-void
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 57
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "readOnlyHint"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 2

    .line 170
    sget-object v0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    iget-object v1, p1, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    invoke-static {p1, v0, v1}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 2

    .line 106
    :try_start_0
    invoke-static {p1}, Ll/۬ܳۜ;->ۖ(Lbin/mt/json/JSONObject;)Ll/᩺᩻ۜ;

    move-result-object p1

    .line 107
    invoke-direct {p0, p1}, Ll/ᩳܳۜ;->֫(Ll/᩺᩻ۜ;)Ll/ۗۜۜ;

    move-result-object p1

    .line 108
    sget v0, Ll/ۡۨ᩻;->֫:I

    .line 109
    invoke-static {p1}, Ll/ᩳܳۜ;->֫(Ll/ۗۜۜ;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Ll/۠ܳۜ;->֫(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 110
    iget-object v1, p0, Ll/ᩳܳۜ;->ܽ:Ll/᩵᩻ۜ;

    iget-object p1, p1, Ll/ۗۜۜ;->ۡ:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;)V

    .line 111
    new-instance p1, Ll/۬ۛ᩻;

    invoke-direct {p1, v0}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    .line 113
    sget v0, Ll/ۡۨ᩻;->֫:I

    .line 114
    throw p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Use first. Open a read-only APK workspace. Inputs are path and temporary: use \"mt://current-apk\" for the current APK file, data.items[].path (\"mt://workspace/<workspaceId>\") returned by mt_apk_workspace_list with temporary=false to reopen an existing non-temporary workspace, or an allowed absolute path or Home-relative APK path. mt_apk_list_available_apks returns Home-relative paths that can be passed directly. Set temporary=true for one-time workspaces that may be inspected, edited, built, then deleted as a whole. Temporary workspaces are intended for targeted verification; prefer a reusable workspace for extensive Smali analysis or searches. Set false when the same workspace may need to be reused, reopened, kept long-term, or revisited later. Returns workspaceId, temporary, apkFileName, compact manifest/count/capability/signature summaries, and inspect nextActions."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Open APK"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 3

    .line 62
    iget-object v0, p0, Ll/ᩳܳۜ;->֫:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "${CURRENT_APK_PATH}"

    const-string v1, "mt://current-apk"

    const-string v2, "{\n  \"path\": {\n    \"type\": \"string\",\n    \"description\": \"Path target for mt_apk_workspace_open. Use ${CURRENT_APK_PATH} exactly when the user asks to analyze the current APK or current app. Pass items[i].path (${WORKSPACE_PATH_PREFIX}<workspaceId>) returned by mt_apk_workspace_list with temporary=false when reopening an existing non-temporary workspace. Otherwise pass items[i].path returned by mt_apk_list_available_apks, another Home-relative APK path, or an allowed absolute APK path. Relative paths are resolved against the current Home and may contain dot segments only when the normalized result remains inside Home. URI forms, backslashes, and empty paths are rejected.\"\n  },\n  \"temporary\": {\n    \"type\": \"boolean\",\n    \"description\": \"Set true for one-time generated, candidate, comparison, or diagnostic APK workspaces that may be inspected, edited, built, then deleted as a whole. temporary=true always creates a fresh workspace, is not reused by path, cannot be reopened with ${WORKSPACE_PATH_PREFIX}<workspaceId>, and may later be deleted by mt_apk_workspace_delete. Set false when the same workspace may need to be reused, reopened, kept long-term, or revisited later.\"\n  }\n}\n"

    .line 77
    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "${WORKSPACE_PATH_PREFIX}"

    const-string v2, "mt://workspace/"

    .line 78
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 66
    invoke-static {v0}, Ll/ۘܳ֨;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳܳۜ;->֫:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 12

    .line 83
    iget-object v0, p0, Ll/ᩳܳۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    .line 737
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Workspace id to pass to mt_apk_list, mt_apk_dex_read_class_outline, mt_apk_read_text, mt_apk_read_bytes, mt_apk_resource_read, mt_apk_search, mt_apk_dex_xref, mt_apk_resource_xref, or mt_apk_continue."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "workspaceId"

    .line 738
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "boolean"

    const-string v4, "Whether this workspace was opened as a one-time temporary workspace. Delete temporary workspaces with mt_apk_workspace_delete after they are no longer needed. Keep ordinary workspaces because they are reusable; delete an ordinary workspace only when the user explicitly asks or clearly confirms it is no longer needed."

    .line 124
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "temporary"

    .line 739
    invoke-virtual {v0, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v4, "Opened APK file name."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "apkFileName"

    .line 740
    invoke-virtual {v0, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v4, "Manifest package name when available."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "packageName"

    .line 741
    invoke-virtual {v0, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v4, "Manifest versionName when available."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "versionName"

    .line 742
    invoke-virtual {v0, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v4, "integer"

    const-string v5, "Manifest versionCode when available."

    .line 117
    invoke-static {v4, v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "versionCode"

    .line 743
    invoke-virtual {v0, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "Manifest minSdk when available."

    .line 117
    invoke-static {v4, v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "minSdk"

    .line 744
    invoke-virtual {v0, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "Manifest targetSdk when available."

    .line 117
    invoke-static {v4, v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "targetSdk"

    .line 745
    invoke-virtual {v0, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "Resolved or raw application label when available."

    .line 103
    invoke-static {v1, v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "appLabel"

    .line 746
    invoke-virtual {v0, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 829
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "ZIP entry count."

    .line 110
    invoke-static {v4, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "zipEntries"

    .line 830
    invoke-virtual {v5, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "DEX entry count."

    .line 110
    invoke-static {v4, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "dexEntries"

    .line 831
    invoke-virtual {v5, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "XML-looking entry count."

    .line 110
    invoke-static {v4, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "xmlEntries"

    .line 832
    invoke-virtual {v5, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "DEX class count when a dex summary is available."

    .line 110
    invoke-static {v4, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "classes"

    .line 833
    invoke-virtual {v5, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "Compact counts for major APK structures."

    .line 829
    invoke-static {v5, v6}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 747
    invoke-static {v5}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "counts"

    invoke-virtual {v0, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 837
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "AXML decode/read support."

    .line 124
    invoke-static {v2, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "canReadAxml"

    .line 838
    invoke-virtual {v5, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "Whether dex name search is available."

    .line 124
    invoke-static {v2, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "canSearchDexNames"

    .line 839
    invoke-virtual {v5, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "Whether dex string search is available."

    .line 124
    invoke-static {v2, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "canSearchDexStrings"

    .line 840
    invoke-virtual {v5, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "Whether resource table listing and reading are available."

    .line 124
    invoke-static {v2, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v6, "canReadResourceTable"

    .line 841
    invoke-virtual {v5, v6, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "Available APK analysis features for follow-up calls."

    .line 837
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 748
    invoke-static {v2}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "capabilities"

    invoke-virtual {v0, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "signature"

    const/4 v5, 0x0

    .line 848
    invoke-static {v5}, Ll/֨ܳۜ;->֫(Z)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 749
    invoke-virtual {v0, v2, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "resources.arsc summary error, or null."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v6, "resourceTableSummaryError"

    .line 750
    invoke-virtual {v0, v6, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Successful mt_apk_workspace_open data."

    .line 737
    invoke-static {v0, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "No mt_apk_workspace_open-specific diagnostics; call mt_apk_list_available_apks from nextActions to inspect available APK files."

    .line 801
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v6

    invoke-static {v6, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 38
    invoke-static {v2}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 1208
    invoke-static {}, Ll/ۧᩳܽ;->ۢ()Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "mt_apk_read_text"

    const-string v8, "inspect"

    .line 1207
    invoke-static {v6, v7, v8}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 41
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v9, "Relative APK path prefix; empty string means no filter and may include the current APK sentinel."

    .line 96
    invoke-static {v1, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "prefix"

    .line 42
    invoke-virtual {v7, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v9, "limit"

    const-string v10, "Page size; recommended value is 50 and maximum is 200."

    const-string v11, "Arguments for mt_apk_list_available_apks."

    .line 0
    invoke-static {v7, v4, v10, v9, v11}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v7, "mt_apk_list_available_apks"

    .line 1209
    invoke-static {v4, v7, v8}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v7, "mt_apk_list"

    .line 1212
    invoke-static {}, Ll/ۧᩳܽ;->ᩳ()Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 1211
    invoke-static {v9, v7, v8}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "retry"

    .line 1214
    invoke-static {}, Ll/ۧᩳܽ;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "mt_apk_workspace_open"

    .line 1213
    invoke-static {v9, v10, v8}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 33
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "Temporary workspace id to close only when this workspace is no longer needed; close deletes the temporary workspace and associated state, including edit sessions."

    const-string v11, "Arguments for mt_apk_workspace_delete."

    .line 0
    invoke-static {v9, v1, v10, v3, v11}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "mt_apk_workspace_delete"

    const-string v9, "cleanup"

    .line 1215
    invoke-static {v1, v3, v9}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const/4 v3, 0x5

    new-array v3, v3, [Lbin/mt/json/JSONObject;

    aput-object v6, v3, v5

    const/4 v5, 0x1

    aput-object v4, v3, v5

    const/4 v4, 0x2

    aput-object v7, v3, v4

    const/4 v4, 0x3

    aput-object v8, v3, v4

    const/4 v4, 0x4

    aput-object v1, v3, v4

    const-string v1, "Executable inspect, retry, or optional temporary cleanup actions; copy arguments directly."

    .line 1206
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Result for mt_apk_workspace_open. data returns workspaceId, temporary status, compact APK summaries, capability flags, and signing certificate summaries; nextActions carries executable inspect, retry, or optional temporary cleanup calls."

    .line 37
    invoke-static {v3, v0, v2, v1}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 86
    iput-object v0, p0, Ll/ᩳܳۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_workspace_open"

    return-object v0
.end method
