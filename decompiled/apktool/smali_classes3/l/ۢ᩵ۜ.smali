.class public final Ll/ۢ᩵ۜ;
.super Ljava/lang/Object;
.source "W6LP"


# instance fields
.field public final ֫:Ll/ۜۡۜ;

.field public final ۧ:Ll/۬ۖۜ;

.field public final ܽ:Ll/ᩳۖۜ;


# direct methods
.method public constructor <init>(Ll/ᩳۖۜ;Ll/۬ۖۜ;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Ll/ۢ᩵ۜ;->ܽ:Ll/ᩳۖۜ;

    .line 45
    iput-object p2, p0, Ll/ۢ᩵ۜ;->ۧ:Ll/۬ۖۜ;

    .line 46
    new-instance p2, Ll/ۜۡۜ;

    invoke-direct {p2, p1}, Ll/ۜۡۜ;-><init>(Ll/ᩳۖۜ;)V

    iput-object p2, p0, Ll/ۢ᩵ۜ;->֫:Ll/ۜۡۜ;

    return-void
.end method

.method public static ֫(Ll/ۗ᩺ۡ;Ll/ᩳܰۡ;)Ljava/io/InputStream;
    .locals 1

    .line 307
    :try_start_0
    new-instance v0, Ll/᩷᩵ۜ;

    invoke-virtual {p1, p0}, Ll/ᩳܰۡ;->ܽ(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/᩷᩵ۜ;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    .line 309
    invoke-static {p0}, Ll/ۢ᩵ۜ;->ۧ(Ljava/io/IOException;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 364
    invoke-static {p0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    return-object p0

    .line 365
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v1, "shared-storage:"

    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lbin/mt/json/JSONArray;Ll/۟ۢۜ;)Ljava/util/ArrayList;
    .locals 10

    const-string v0, "entryPath"

    const-string v1, "destinationPath"

    .line 98
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 99
    :goto_0
    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->size()I

    move-result v5

    if-ge v4, v5, :cond_6

    const/4 v5, 0x0

    .line 103
    :try_start_0
    invoke-virtual {p0, v4}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object v6

    const-string v7, "entries"

    invoke-static {v7, v6}, Ll/ۚ᩵ۜ;->֫(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 104
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V

    .line 105
    invoke-static {v6, v0}, Ll/ۚ᩵ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_1

    .line 106
    :try_start_1
    invoke-static {v6, v1}, Ll/ۚ᩵ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    .line 107
    invoke-static {v7, v0, v6}, Ll/ۚ᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 108
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v8
    :try_end_1
    .catch Ll/ۗۛ᩻; {:try_start_1 .. :try_end_1} :catch_0

    const-string v9, "/"

    if-nez v8, :cond_1

    :try_start_2
    invoke-virtual {v7, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    .line 109
    :cond_1
    :goto_1
    invoke-virtual {v5, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-ne v6, v8, :cond_3

    .line 114
    invoke-static {p1, v5, v1, v3}, Ll/۫ۡۜ;->֫(Ll/۟ۢۜ;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v5

    .line 115
    invoke-virtual {p1, v5}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    if-nez v6, :cond_2

    .line 116
    invoke-virtual {p1, v5}, Ll/۟ۢۜ;->ۧ(Ljava/lang/String;)V

    .line 117
    :cond_2
    new-instance v8, Ll/ᩳ᩵ۜ;

    invoke-direct {v8, v7, v4, v5, v6}, Ll/ᩳ᩵ۜ;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    const-string p0, "ZIP_PATH_TYPE_MISMATCH"

    const-string p1, "Directory mappings require trailing slashes on both paths"

    .line 111
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 110
    invoke-static {v0, p0, p1}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
    :try_end_2
    .catch Ll/ۗۛ᩻; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception p0

    move-object p1, v5

    move-object v5, v7

    goto :goto_2

    :catch_1
    move-exception p0

    move-object p1, v5

    .line 120
    :goto_2
    filled-new-array {v4}, [I

    move-result-object v0

    invoke-static {v0}, Lbin/mt/json/JSON;->array([I)Lbin/mt/json/JSONArray;

    move-result-object v0

    iget-object v2, p0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string v3, "operationIndexes"

    invoke-virtual {v2, v3, v0}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    if-eqz v5, :cond_4

    .line 121
    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v3, "entryPaths"

    invoke-virtual {v2, v3, v0}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    :cond_4
    if-eqz p1, :cond_5

    .line 122
    invoke-virtual {v2, v1, p1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 123
    :cond_5
    throw p0

    :cond_6
    return-object v2
.end method

.method public static bridge synthetic ֫(Ljava/io/IOException;)Ll/ۗۛ᩻;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۢ᩵ۜ;->ۧ(Ljava/io/IOException;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܿ᩵ۜ;Ll/ܿ᩵ۜ;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 3

    .line 352
    invoke-static {p0}, Ll/ܿ᩵ۜ;->ܿ(Ll/ܿ᩵ۜ;)I

    move-result v0

    filled-new-array {v0}, [I

    move-result-object v0

    invoke-static {v0}, Lbin/mt/json/JSON;->array([I)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 353
    invoke-static {p1}, Ll/ܿ᩵ۜ;->ܿ(Ll/ܿ᩵ۜ;)I

    move-result v1

    invoke-static {p0}, Ll/ܿ᩵ۜ;->ܿ(Ll/ܿ᩵ۜ;)I

    move-result v2

    if-eq v1, v2, :cond_0

    invoke-static {p1}, Ll/ܿ᩵ۜ;->ܿ(Ll/ܿ᩵ۜ;)I

    move-result v1

    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->add(I)Lbin/mt/json/JSONArray;

    .line 354
    :cond_0
    invoke-static {p0}, Ll/ܿ᩵ۜ;->ᩳ(Ll/ܿ᩵ۜ;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 355
    invoke-static {p1}, Ll/ܿ᩵ۜ;->ᩳ(Ll/ܿ᩵ۜ;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Ll/ܿ᩵ۜ;->ᩳ(Ll/ܿ᩵ۜ;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    invoke-static {p1}, Ll/ܿ᩵ۜ;->ᩳ(Ll/ܿ᩵ۜ;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    .line 358
    :cond_1
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "entryPaths"

    invoke-virtual {p0, p1, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "operationIndexes"

    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "destinationPath"

    .line 359
    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "ZIP_DESTINATION_CONFLICT"

    const-string p2, "Multiple ZIP entries require the same destination or a file as a parent directory"

    .line 356
    invoke-static {p0, p1, p2}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ᩳܰۡ;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ll/᩻᩵ۜ;)Ll/ܳ᩵ۜ;
    .locals 20

    move-object/from16 v0, p2

    move-object/from16 v1, p4

    .line 132
    new-instance v2, Ll/᩻ܰۡ;

    .line 9
    invoke-virtual/range {p0 .. p0}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object v3

    invoke-direct {v2, v3}, Ll/֨᩺ۡ;-><init>(Ljava/util/Collection;)V

    .line 133
    new-instance v3, Ljava/util/ArrayList;

    invoke-virtual/range {p0 .. p0}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 134
    new-instance v4, Ll/ۜ۠ۢ;

    const/4 v5, 0x2

    invoke-direct {v4, v5}, Ll/ۜ۠ۢ;-><init>(I)V

    invoke-static {v4}, Ll/۠۬ᩴ;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object v4

    invoke-static {v3, v4}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 135
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 136
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_14

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩳ᩵ۜ;

    .line 137
    invoke-static {}, Ll/ۚ᩵ۜ;->֫()V

    .line 138
    new-instance v13, Ll/ܿ᩵ۜ;

    invoke-static {v6}, Ll/ᩳ᩵ۜ;->ܽ(Ll/ᩳ᩵ۜ;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v6}, Ll/ᩳ᩵ۜ;->֫(Ll/ᩳ᩵ۜ;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v6}, Ll/ᩳ᩵ۜ;->ۧ(Ll/ᩳ᩵ۜ;)Z

    move-result v11

    invoke-static {v6}, Ll/ᩳ᩵ۜ;->ᩳ(Ll/ᩳ᩵ۜ;)I

    move-result v12

    const/4 v8, 0x0

    move-object v7, v13

    invoke-direct/range {v7 .. v12}, Ll/ܿ᩵ۜ;-><init>(Ll/ۗ᩺ۡ;Ljava/lang/String;Ljava/lang/String;ZI)V

    iput-object v13, v1, Ll/᩻᩵ۜ;->ܽ:Ll/ܿ᩵ۜ;

    .line 140
    invoke-static {v6}, Ll/ᩳ᩵ۜ;->ܽ(Ll/ᩳ᩵ۜ;)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v8, p0

    invoke-virtual {v8, v7}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v10

    .line 141
    invoke-static {v6}, Ll/ᩳ᩵ۜ;->ۧ(Ll/ᩳ᩵ۜ;)Z

    move-result v7

    const-string v9, "The ZIP entry requires a password"

    const-string v11, "ZIP_PASSWORD_REQUIRED"

    const-string v12, "ZIP_ENTRY_NOT_FOUND"

    if-eqz v7, :cond_10

    .line 142
    invoke-static {v6}, Ll/ᩳ᩵ۜ;->ܽ(Ll/ᩳ᩵ۜ;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_1

    if-nez v10, :cond_1

    invoke-static {v6}, Ll/ᩳ᩵ۜ;->ܽ(Ll/ᩳ᩵ۜ;)Ljava/lang/String;

    move-result-object v7

    .line 143
    invoke-virtual {v2, v7}, Ll/֨᩺ۡ;->֫(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "The ZIP directory does not exist"

    .line 144
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {v1, v12, v0}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_1
    :goto_1
    if-eqz v10, :cond_2

    .line 146
    invoke-static {v10}, Ll/ۢ᩵ۜ;->֫(Ll/ۗ᩺ۡ;)V

    .line 147
    :cond_2
    iget-object v7, v1, Ll/᩻᩵ۜ;->ܽ:Ll/ܿ᩵ۜ;

    invoke-static {v4, v7, v0}, Ll/ۢ᩵ۜ;->֫(Ljava/util/LinkedHashMap;Ll/ܿ᩵ۜ;Ljava/lang/String;)V

    .line 148
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_3
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_f

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۗ᩺ۡ;

    .line 149
    invoke-virtual {v10}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-static {v6}, Ll/ᩳ᩵ۜ;->ܽ(Ll/ᩳ᩵ۜ;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_3

    .line 150
    invoke-virtual {v10}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-static {v6}, Ll/ᩳ᩵ۜ;->ܽ(Ll/ᩳ᩵ۜ;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    goto :goto_2

    .line 151
    :cond_4
    new-instance v15, Ll/ܿ᩵ۜ;

    invoke-virtual {v10}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-static {v6}, Ll/ᩳ᩵ۜ;->֫(Ll/ᩳ᩵ۜ;)Ljava/lang/String;

    move-result-object v16

    .line 152
    invoke-virtual {v10}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v17

    invoke-static {v6}, Ll/ᩳ᩵ۜ;->ᩳ(Ll/ᩳ᩵ۜ;)I

    move-result v18

    move-object v12, v15

    move-object v13, v10

    move-object/from16 v19, v2

    move-object v2, v15

    move-object/from16 v15, v16

    move/from16 v16, v17

    move/from16 v17, v18

    invoke-direct/range {v12 .. v17}, Ll/ܿ᩵ۜ;-><init>(Ll/ۗ᩺ۡ;Ljava/lang/String;Ljava/lang/String;ZI)V

    iput-object v2, v1, Ll/᩻᩵ۜ;->ܽ:Ll/ܿ᩵ۜ;

    .line 153
    invoke-static {v10}, Ll/ۢ᩵ۜ;->֫(Ll/ۗ᩺ۡ;)V

    .line 155
    invoke-virtual {v10}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v6}, Ll/ᩳ᩵ۜ;->ܽ(Ll/ᩳ᩵ۜ;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v12

    invoke-virtual {v2, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 156
    invoke-virtual {v10}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v12

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 325
    :goto_3
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v15

    move-object/from16 v18, v3

    const-string v3, "ZIP_UNSAFE_ENTRY_PATH"

    if-gt v13, v15, :cond_9

    .line 326
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v15

    if-ge v13, v15, :cond_5

    invoke-virtual {v2, v13}, Ljava/lang/String;->charAt(I)C

    move-result v15

    move-object/from16 p1, v5

    const/16 v5, 0x2f

    if-eq v15, v5, :cond_6

    invoke-virtual {v2, v13}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v15, 0x5c

    if-eq v5, v15, :cond_6

    goto :goto_5

    :cond_5
    move-object/from16 p1, v5

    :cond_6
    sub-int v5, v13, v14

    const/4 v15, 0x2

    if-ne v5, v15, :cond_8

    .line 327
    invoke-virtual {v2, v14}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v15, 0x2e

    if-ne v5, v15, :cond_8

    add-int/lit8 v14, v14, 0x1

    invoke-virtual {v2, v14}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-eq v5, v15, :cond_7

    goto :goto_4

    :cond_7
    const-string v0, "The extraction path contains a parent directory segment"

    .line 329
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 328
    invoke-static {v1, v3, v0}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_8
    :goto_4
    add-int/lit8 v3, v13, 0x1

    move v14, v3

    :goto_5
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v5, p1

    move-object/from16 v3, v18

    goto :goto_3

    :cond_9
    move-object/from16 p1, v5

    .line 334
    :try_start_0
    invoke-static {v2, v12}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v5, "/"

    if-eqz v12, :cond_a

    .line 335
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_a

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 158
    :cond_a
    invoke-virtual {v10}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_b

    goto :goto_8

    .line 159
    :cond_b
    invoke-static {v6}, Ll/ᩳ᩵ۜ;->֫(Ll/ᩳ᩵ۜ;)Ljava/lang/String;

    move-result-object v3

    .line 369
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_c

    .line 0
    invoke-static {v3, v2}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_6

    :cond_c
    invoke-static {v3, v5, v2}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_6
    const-string v3, "destinationPath"

    .line 159
    invoke-static {v2, v3}, Ll/۫ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 161
    new-instance v2, Ll/ܿ᩵ۜ;

    invoke-virtual {v10}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v14

    .line 162
    invoke-virtual {v10}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v16

    invoke-static {v6}, Ll/ᩳ᩵ۜ;->ᩳ(Ll/ᩳ᩵ۜ;)I

    move-result v17

    move-object v12, v2

    move-object v13, v10

    invoke-direct/range {v12 .. v17}, Ll/ܿ᩵ۜ;-><init>(Ll/ۗ᩺ۡ;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 163
    iput-object v2, v1, Ll/᩻᩵ۜ;->ܽ:Ll/ܿ᩵ۜ;

    .line 299
    invoke-virtual {v10}, Ll/ۗ᩺ۡ;->ᩴ()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_d

    goto :goto_7

    .line 300
    :cond_d
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-static {v0, v11, v9}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 165
    :cond_e
    :goto_7
    invoke-static {v4, v2, v0}, Ll/ۢ᩵ۜ;->֫(Ljava/util/LinkedHashMap;Ll/ܿ᩵ۜ;Ljava/lang/String;)V

    :goto_8
    move-object/from16 v5, p1

    move-object/from16 v3, v18

    move-object/from16 v2, v19

    goto/16 :goto_2

    :catch_0
    const-string v0, "The ZIP entry has an unsafe extraction path"

    .line 337
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {v1, v3, v0}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_f
    move-object/from16 v19, v2

    move-object/from16 v18, v3

    move-object/from16 p1, v5

    goto :goto_a

    :cond_10
    move-object/from16 v19, v2

    move-object/from16 v18, v3

    move-object/from16 p1, v5

    if-eqz v10, :cond_13

    .line 171
    invoke-static {v10}, Ll/ۢ᩵ۜ;->֫(Ll/ۗ᩺ۡ;)V

    .line 299
    invoke-virtual {v10}, Ll/ۗ᩺ۡ;->ᩴ()Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_11

    goto :goto_9

    .line 300
    :cond_11
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-static {v0, v11, v9}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 174
    :cond_12
    :goto_9
    new-instance v2, Ll/ܿ᩵ۜ;

    invoke-virtual {v10}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-static {v6}, Ll/ᩳ᩵ۜ;->֫(Ll/ᩳ᩵ۜ;)Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x0

    invoke-static {v6}, Ll/ᩳ᩵ۜ;->ᩳ(Ll/ᩳ᩵ۜ;)I

    move-result v14

    move-object v9, v2

    invoke-direct/range {v9 .. v14}, Ll/ܿ᩵ۜ;-><init>(Ll/ۗ᩺ۡ;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 176
    iput-object v2, v1, Ll/᩻᩵ۜ;->ܽ:Ll/ܿ᩵ۜ;

    .line 177
    invoke-static {v4, v2, v0}, Ll/ۢ᩵ۜ;->֫(Ljava/util/LinkedHashMap;Ll/ܿ᩵ۜ;Ljava/lang/String;)V

    :goto_a
    move-object/from16 v5, p1

    move-object/from16 v3, v18

    move-object/from16 v2, v19

    goto/16 :goto_0

    :cond_13
    const-string v0, "The ZIP entry does not exist"

    .line 169
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {v1, v12, v0}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 181
    :cond_14
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 182
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 183
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_15
    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܿ᩵ۜ;

    .line 184
    iput-object v5, v1, Ll/᩻᩵ۜ;->ܽ:Ll/ܿ᩵ۜ;

    .line 185
    invoke-static {v5}, Ll/ܿ᩵ۜ;->ۧ(Ll/ܿ᩵ۜ;)Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-static {v5}, Ll/ܿ᩵ۜ;->֫(Ll/ܿ᩵ۜ;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/ۢ᩵ۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_c

    .line 186
    :cond_16
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 187
    :goto_c
    invoke-static {v5}, Ll/ܿ᩵ۜ;->֫(Ll/ܿ᩵ۜ;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/ۢ᩵ۜ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    :goto_d
    if-eqz v6, :cond_19

    .line 189
    invoke-static {v6}, Ll/ۢ᩵ۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܿ᩵ۜ;

    if-eqz v7, :cond_18

    .line 190
    invoke-static {v7}, Ll/ܿ᩵ۜ;->ۧ(Ll/ܿ᩵ۜ;)Z

    move-result v8

    if-eqz v8, :cond_17

    goto :goto_e

    :cond_17
    invoke-static {v7, v5, v6}, Ll/ۢ᩵ۜ;->֫(Ll/ܿ᩵ۜ;Ll/ܿ᩵ۜ;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 191
    :cond_18
    :goto_e
    invoke-static {v6}, Ll/ۢ᩵ۜ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_d

    .line 193
    :cond_19
    invoke-static {v5}, Ll/ܿ᩵ۜ;->ۧ(Ll/ܿ᩵ۜ;)Z

    move-result v6

    if-nez v6, :cond_15

    .line 194
    invoke-static {v5}, Ll/ܿ᩵ۜ;->֫(Ll/ܿ᩵ۜ;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/ۢ᩵ۜ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_1a

    .line 198
    invoke-static {v10}, Ll/ۢ᩵ۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-instance v13, Ll/ܿ᩵ۜ;

    invoke-static {v5}, Ll/ܿ᩵ۜ;->ᩳ(Ll/ܿ᩵ۜ;)Ljava/lang/String;

    move-result-object v9

    const/4 v11, 0x1

    invoke-static {v5}, Ll/ܿ᩵ۜ;->ܿ(Ll/ܿ᩵ۜ;)I

    move-result v12

    const/4 v8, 0x0

    move-object v7, v13

    invoke-direct/range {v7 .. v12}, Ll/ܿ᩵ۜ;-><init>(Ll/ۗ᩺ۡ;Ljava/lang/String;Ljava/lang/String;ZI)V

    invoke-static {v0, v6, v13}, Ll/ܰ۬ᩴ;->putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_b

    :cond_1a
    const-string v0, "The output has no parent directory"

    .line 196
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "FILE_PARENT_NOT_FOUND"

    invoke-static {v1, v2, v0}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 202
    :cond_1b
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 203
    new-instance v0, Ll/֫᩵ۜ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ll/۠۬ᩴ;->comparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 204
    new-instance v0, Ll/ܳ᩵ۜ;

    invoke-direct {v0, v1, v2}, Ll/ܳ᩵ۜ;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    return-object v0
.end method

.method public static ֫(Ljava/util/LinkedHashMap;Ll/ܿ᩵ۜ;Ljava/lang/String;)V
    .locals 1

    .line 343
    invoke-static {p1}, Ll/ܿ᩵ۜ;->֫(Ll/ܿ᩵ۜ;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Ll/ܿ֡ܿ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 347
    invoke-static {p1}, Ll/ܿ᩵ۜ;->֫(Ll/ܿ᩵ۜ;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ll/ۢ᩵ۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p2, p1}, Ll/ܰ۬ᩴ;->putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܿ᩵ۜ;

    if-nez p0, :cond_0

    return-void

    .line 348
    :cond_0
    invoke-static {p1}, Ll/ܿ᩵ۜ;->֫(Ll/ܿ᩵ۜ;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Ll/ۢ᩵ۜ;->֫(Ll/ܿ᩵ۜ;Ll/ܿ᩵ۜ;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_1
    const-string p0, "Extraction cannot replace its source ZIP"

    .line 345
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "ZIP_SOURCE_DESTINATION_CONFLICT"

    .line 344
    invoke-static {p1, p2, p0}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ll/ۗ᩺ۡ;)V
    .locals 4

    .line 315
    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->ۗ()I

    move-result p0

    const v0, 0xf000

    and-int/2addr p0, v0

    const v0, 0xa000

    if-eq p0, v0, :cond_0

    return-void

    :cond_0
    const/4 p0, 0x0

    .line 318
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "ZIP_UNSUPPORTED_ENTRY"

    const-string v2, "Symbolic link entries cannot be extracted by this tool"

    const-string v3, "fatal"

    .line 316
    invoke-static {v1, v2, v3, p0, v0}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method private ֫(Ll/ܳ᩵ۜ;Ljava/lang/String;ZLl/᩻᩵ۜ;)V
    .locals 6

    .line 210
    iget-object v0, p0, Ll/ۢ᩵ۜ;->ܽ:Ll/ᩳۖۜ;

    invoke-virtual {v0}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v1

    .line 211
    invoke-virtual {v1, p2}, Ll/۟ۢۜ;->ܽ(Ljava/lang/String;)V

    .line 212
    invoke-static {p1}, Ll/ܳ᩵ۜ;->֫(Ll/ܳ᩵ۜ;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܿ᩵ۜ;

    .line 213
    invoke-static {}, Ll/ۚ᩵ۜ;->֫()V

    .line 214
    iput-object v2, p4, Ll/᩻᩵ۜ;->ܽ:Ll/ܿ᩵ۜ;

    .line 215
    invoke-static {v2}, Ll/ܿ᩵ۜ;->֫(Ll/ܿ᩵ۜ;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    .line 216
    iget-object v3, p0, Ll/ۢ᩵ۜ;->֫:Ll/ۜۡۜ;

    invoke-static {v2}, Ll/ܿ᩵ۜ;->֫(Ll/ܿ᩵ۜ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ll/ۜۡۜ;->ܽ(Ljava/lang/String;)V

    goto :goto_0

    .line 218
    :cond_0
    invoke-static {p1}, Ll/ܳ᩵ۜ;->ۧ(Ll/ܳ᩵ۜ;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܿ᩵ۜ;

    .line 219
    invoke-static {}, Ll/ۚ᩵ۜ;->֫()V

    .line 220
    iput-object p2, p4, Ll/᩻᩵ۜ;->ܽ:Ll/ܿ᩵ۜ;

    .line 221
    invoke-static {p2}, Ll/ܿ᩵ۜ;->֫(Ll/ܿ᩵ۜ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    .line 222
    invoke-static {p2}, Ll/ܿ᩵ۜ;->֫(Ll/ܿ᩵ۜ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/۟ۢۜ;->ۧ(Ljava/lang/String;)V

    .line 223
    invoke-static {p2}, Ll/ܿ᩵ۜ;->֫(Ll/ܿ᩵ۜ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ᩳۖۜ;->ᩳ(Ljava/lang/String;)Ll/۫᩵ܿ;

    move-result-object v2

    .line 224
    sget-object v3, Ll/ܽ᩵ۜ;->֫:[I

    invoke-virtual {v2}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const-string v5, "fatal"

    if-eq v2, v3, :cond_2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_3

    const/4 p1, 0x3

    if-eq v2, p1, :cond_1

    const-string p1, "Extraction destinations must be regular files or missing paths"

    .line 235
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "FILE_UNSUPPORTED_TYPE"

    .line 233
    invoke-static {p3, p1, v5, v4, p2}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :cond_1
    const-string p1, "A directory cannot be used as an extracted file destination"

    .line 232
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "ZIP_PATH_TYPE_MISMATCH"

    .line 231
    invoke-static {p2, p3, p1}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :cond_2
    if-eqz p3, :cond_5

    .line 237
    :cond_3
    invoke-static {p2}, Ll/ܿ᩵ۜ;->֫(Ll/ܿ᩵ۜ;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p2

    .line 238
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object p2

    sget-object v2, Ll/۬᩵ܿ;->᩶:Ll/۬᩵ܿ;

    invoke-virtual {p2, v2}, Ll/ۤ᩵ܿ;->֫(Ll/۬᩵ܿ;)Ll/ۙ᩵ܿ;

    move-result-object p2

    sget-object v2, Ll/ۙ᩵ܿ;->ۗ:Ll/ۙ᩵ܿ;

    if-eq p2, v2, :cond_4

    goto :goto_1

    :cond_4
    const-string p1, "The destination backend cannot safely create temporary extraction files"

    .line 242
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "FILE_BACKEND_UNSUPPORTED"

    .line 240
    invoke-static {p3, p1, v5, v4, p2}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :cond_5
    const-string p1, "An extraction destination exists and overwrite is false"

    .line 227
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "FILE_ALREADY_EXISTS"

    .line 226
    invoke-static {p2, p3, p1}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :cond_6
    return-void
.end method

.method private ֫(Ll/ᩳܰۡ;Ll/ܳ᩵ۜ;Ljava/lang/String;ZLl/᩻᩵ۜ;)V
    .locals 7

    .line 250
    invoke-static {p2}, Ll/ܳ᩵ۜ;->֫(Ll/ܳ᩵ۜ;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    iget-object v3, p0, Ll/ۢ᩵ۜ;->ܽ:Ll/ᩳۖۜ;

    const/4 v4, 0x1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿ᩵ۜ;

    .line 251
    iput-object v1, p5, Ll/᩻᩵ۜ;->ܽ:Ll/ܿ᩵ۜ;

    .line 252
    invoke-static {}, Ll/ۚ᩵ۜ;->֫()V

    .line 253
    invoke-virtual {v3}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v3

    invoke-virtual {v3, p3}, Ll/۟ۢۜ;->ܽ(Ljava/lang/String;)V

    .line 254
    iput-boolean v4, p5, Ll/᩻᩵ۜ;->ᩳ:Z

    .line 255
    iget-object v3, p0, Ll/ۢ᩵ۜ;->֫:Ll/ۜۡۜ;

    invoke-static {v1}, Ll/ܿ᩵ۜ;->֫(Ll/ܿ᩵ۜ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ll/ۜۡۜ;->ۧ(Ljava/lang/String;)Ll/᩻ۡۜ;

    move-result-object v1

    .line 256
    iput-boolean v2, p5, Ll/᩻᩵ۜ;->ᩳ:Z

    .line 257
    iget v2, p5, Ll/᩻᩵ۜ;->ۧ:I

    iget v3, v1, Ll/᩻ۡۜ;->ۧ:I

    add-int/2addr v2, v3

    iput v2, p5, Ll/᩻᩵ۜ;->ۧ:I

    .line 258
    iget-object v1, v1, Ll/᩻ۡۜ;->ᩳ:Lbin/mt/json/JSONArray;

    invoke-virtual {p5, v1}, Ll/᩻᩵ۜ;->֫(Lbin/mt/json/JSONArray;)V

    goto :goto_0

    .line 260
    :cond_0
    invoke-static {p2}, Ll/ܳ᩵ۜ;->ۧ(Ll/ܳ᩵ۜ;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿ᩵ۜ;

    .line 261
    iput-object v0, p5, Ll/᩻᩵ۜ;->ܽ:Ll/ܿ᩵ۜ;

    .line 262
    invoke-static {}, Ll/ۚ᩵ۜ;->֫()V

    .line 263
    invoke-virtual {v3}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v1

    .line 264
    invoke-virtual {v1, p3}, Ll/۟ۢۜ;->ܽ(Ljava/lang/String;)V

    .line 265
    iput-boolean v4, p5, Ll/᩻᩵ۜ;->ᩳ:Z

    .line 266
    invoke-static {v0}, Ll/ܿ᩵ۜ;->֫(Ll/ܿ᩵ۜ;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ll/ۧ᩵ۜ;

    invoke-direct {v6, p1, v0, p3}, Ll/ۧ᩵ۜ;-><init>(Ll/ᩳܰۡ;Ll/ܿ᩵ۜ;Ljava/lang/String;)V

    iget-object v0, p0, Ll/ۢ᩵ۜ;->ۧ:Ll/۬ۖۜ;

    invoke-virtual {v0, v5, p4, v1, v6}, Ll/۬ۖۜ;->֫(Ljava/lang/String;ZLl/۟ۢۜ;Ll/᩵ۖۜ;)Ll/֡ۖۜ;

    move-result-object v0

    .line 292
    iput-boolean v2, p5, Ll/᩻᩵ۜ;->ᩳ:Z

    .line 293
    iget v1, p5, Ll/᩻᩵ۜ;->֫:I

    add-int/2addr v1, v4

    iput v1, p5, Ll/᩻᩵ۜ;->֫:I

    .line 294
    iget-object v0, v0, Ll/֡ۖۜ;->ܿ:Lbin/mt/json/JSONArray;

    invoke-virtual {p5, v0}, Ll/᩻᩵ۜ;->֫(Lbin/mt/json/JSONArray;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "/"

    .line 373
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/16 v1, 0x2f

    .line 374
    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    const/4 v0, 0x0

    .line 375
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/io/IOException;)Ll/ۗۛ᩻;
    .locals 4

    .line 379
    instance-of v0, p0, Ljava/io/InterruptedIOException;

    if-nez v0, :cond_5

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 382
    :cond_0
    instance-of v0, p0, Ll/ۘܰۡ;

    if-eqz v0, :cond_1

    const-string p0, "The password could not decrypt the ZIP entry"

    .line 383
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "ZIP_BAD_PASSWORD"

    invoke-static {v0, v1, p0}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0

    .line 385
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_2

    const-string p0, ""

    goto :goto_0

    .line 386
    :cond_2
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    const-string v0, "unsupported"

    .line 387
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "not supported"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "not implemented"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_3

    goto :goto_1

    :cond_3
    const-string p0, "The ZIP file or entry could not be read and verified"

    .line 392
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "ZIP_READ_FAILED"

    invoke-static {v0, v1, p0}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0

    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 390
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "ZIP_UNSUPPORTED"

    const-string v2, "The ZIP uses an unsupported archive, compression, or encryption feature"

    const-string v3, "fatal"

    .line 388
    invoke-static {v1, v2, v3, p0, v0}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0

    :cond_5
    :goto_2
    const-string p0, "ZIP operation was cancelled"

    .line 380
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "ZIP_OPERATION_CANCELLED"

    invoke-static {v0, v1, p0}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
    .locals 13

    const-string v0, "path"

    const-string v1, "entries"

    const-string v2, "password"

    const-string v3, "overwrite"

    .line 51
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V

    .line 52
    invoke-static {p1, v2}, Ll/ۚ᩵ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 53
    invoke-static {p1, v3}, Ll/ۚ᩵ۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v8

    .line 54
    iget-object v3, p0, Ll/ۢ᩵ۜ;->ܽ:Ll/ᩳۖۜ;

    invoke-virtual {v3}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v4

    .line 55
    invoke-static {p1, v0}, Ll/ۚ᩵ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4, v0}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;Ll/۟ۢۜ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 57
    new-instance v11, Ll/᩻᩵ۜ;

    invoke-direct {v11, v10}, Ll/᩻᩵ۜ;-><init>(Ljava/lang/String;)V

    const/4 v12, 0x0

    .line 59
    :try_start_0
    invoke-static {p1, v1}, Ll/ۚ᩵ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p1

    invoke-static {p1, v4}, Ll/ۢ᩵ۜ;->֫(Lbin/mt/json/JSONArray;Ll/۟ۢۜ;)Ljava/util/ArrayList;

    move-result-object p1

    .line 60
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 61
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳ᩵ۜ;

    invoke-static {v5}, Ll/ᩳ᩵ۜ;->֫(Ll/ᩳ᩵ۜ;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 63
    :cond_0
    invoke-virtual {v3, v1}, Ll/ᩳۖۜ;->֫(Ljava/util/List;)Ll/ۤۖۜ;

    move-result-object v1
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    :try_start_1
    invoke-virtual {v3}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v4

    invoke-virtual {v4, v10}, Ll/۟ۢۜ;->ܽ(Ljava/lang/String;)V

    .line 65
    invoke-static {v3, v10, v12}, Ll/ۚ᩵ۜ;->֫(Ll/ᩳۖۜ;Ljava/lang/String;Z)Ll/۫᩵ܿ;

    .line 66
    invoke-virtual {v3, v10}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    invoke-static {v3, v12}, Ll/ᩳܰۡ;->֫(Ll/ܶ᩵ܿ;Z)Ll/ᩳܰۡ;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 67
    :try_start_2
    invoke-virtual {v3, v2}, Ll/ᩳܰۡ;->֫(Ljava/lang/String;)V

    .line 68
    invoke-static {v3, p1, v10, v2, v11}, Ll/ۢ᩵ۜ;->֫(Ll/ᩳܰۡ;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ll/᩻᩵ۜ;)Ll/ܳ᩵ۜ;

    move-result-object v6

    .line 69
    invoke-direct {p0, v6, v10, v8, v11}, Ll/ۢ᩵ۜ;->֫(Ll/ܳ᩵ۜ;Ljava/lang/String;ZLl/᩻᩵ۜ;)V

    move-object v4, p0

    move-object v5, v3

    move-object v7, v10

    move-object v9, v11

    .line 70
    invoke-direct/range {v4 .. v9}, Ll/ۢ᩵ۜ;->֫(Ll/ᩳܰۡ;Ll/ܳ᩵ۜ;Ljava/lang/String;ZLl/᩻᩵ۜ;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 71
    :try_start_3
    invoke-virtual {v3}, Ll/ᩳܰۡ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 72
    :try_start_4
    invoke-virtual {v1}, Ll/ۤۖۜ;->close()V

    .line 73
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1, v0, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "completedFiles"

    iget v1, v11, Ll/᩻᩵ۜ;->֫:I

    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "createdDirectories"

    iget v1, v11, Ll/᩻᩵ۜ;->ۧ:I

    .line 74
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "warnings"

    iget-object v1, v11, Ll/᩻᩵ۜ;->ܳ:Lbin/mt/json/JSONArray;

    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1
    :try_end_4
    .catch Ll/ۗۛ᩻; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_4 .. :try_end_4} :catch_0

    return-object p1

    :catchall_0
    move-exception p1

    .line 66
    :try_start_5
    invoke-virtual {v3}, Ll/ᩳܰۡ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_6
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception p1

    .line 63
    :try_start_7
    invoke-virtual {v1}, Ll/ۤۖۜ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v0

    :try_start_8
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
    :try_end_8
    .catch Ll/ۗۛ᩻; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_8 .. :try_end_8} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_8 .. :try_end_8} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_8 .. :try_end_8} :catch_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_8 .. :try_end_8} :catch_0

    :catch_0
    const/4 p1, 0x0

    .line 88
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "ZIP_IO_ERROR"

    const-string v2, "The storage backend failed during ZIP extraction"

    const-string v3, "fatal"

    .line 86
    invoke-static {v1, v2, v3, p1, v0}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 89
    iget-boolean v0, v11, Ll/᩻᩵ۜ;->ᩳ:Z

    if-eqz v0, :cond_1

    .line 90
    iget-object v0, p1, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string v1, "changed"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "stateKnown"

    invoke-virtual {v0, v1, v12}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    .line 92
    :cond_1
    invoke-virtual {v11, p1}, Ll/᩻᩵ۜ;->֫(Ll/ۗۛ᩻;)V

    throw p1

    :catch_1
    move-exception p1

    .line 83
    invoke-static {p1}, Ll/ۢ᩵ۜ;->ۧ(Ljava/io/IOException;)Ll/ۗۛ᩻;

    move-result-object p1

    invoke-virtual {v11, p1}, Ll/᩻᩵ۜ;->֫(Ll/ۗۛ᩻;)V

    throw p1

    :catch_2
    move-exception p1

    const-string v0, "FILE_OPERATION_INTERRUPTED"

    .line 76
    iget-object v1, p1, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 77
    iget-object v0, p1, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    iget-object p1, p1, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string v1, "ZIP_OPERATION_CANCELLED"

    const-string v2, "ZIP operation was cancelled"

    const-string v3, "warning"

    invoke-static {v1, v2, v3, v0, p1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 81
    :cond_2
    invoke-virtual {v11, p1}, Ll/᩻᩵ۜ;->֫(Ll/ۗۛ᩻;)V

    throw p1
.end method
