.class public final Ll/۬ۡۜ;
.super Ljava/lang/Object;
.source "M6XL"


# instance fields
.field public final ֫:Ll/᩶۫᩷;

.field public final ۧ:Ll/ᩳۖۜ;


# direct methods
.method public constructor <init>(Ll/ᩳۖۜ;)V
    .locals 1

    .line 29
    new-instance v0, Ll/᩶۫᩷;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Ll/۬ۡۜ;->ۧ:Ll/ᩳۖۜ;

    .line 35
    iput-object v0, p0, Ll/۬ۡۜ;->֫:Ll/᩶۫᩷;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;
    .locals 2

    const-string v0, "path"

    const-string v1, "targetPath"

    .line 0
    invoke-static {v0, p0, v1, p1}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "policyRevision"

    .line 539
    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "operation"

    .line 540
    invoke-virtual {p0, p1, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "backendReason"

    .line 541
    invoke-virtual {p0, p1, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "changed"

    .line 542
    invoke-virtual {p0, p1, p5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p0

    if-nez p6, :cond_0

    .line 544
    sget-object p1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_0

    :cond_0
    invoke-static {p6}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    :goto_0
    const-string p2, "operationMode"

    .line 543
    invoke-virtual {p0, p2, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "stateKnown"

    .line 545
    invoke-virtual {p0, p1, p7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p0

    new-instance p1, Lbin/mt/json/JSONArray;

    invoke-direct {p1, p8}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    const-string p2, "warnings"

    .line 546
    invoke-virtual {p0, p2, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    :try_start_0
    const-string v0, "sourcePath"

    .line 371
    invoke-static {p0, v0}, Ll/۫ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_0

    .line 377
    invoke-static {p0, p1}, Ll/۫ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    const-string v6, "source_tree"

    const-string v7, "entry_outside_source"

    const-string v1, "FILE_MOVE_FAILED"

    const-string v2, "The storage backend returned an entry outside the source directory."

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    .line 378
    invoke-static/range {v1 .. v7}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :catch_0
    const-string v5, "source_tree"

    const-string v6, "invalid_entry_path"

    const-string v0, "FILE_MOVE_FAILED"

    const-string v1, "The storage backend returned an invalid directory entry path."

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    .line 373
    invoke-static/range {v0 .. v6}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 289
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    return-object p2

    :cond_0
    const-string p2, "The "

    const-string v0, " path has no parent directory."

    .line 0
    invoke-static {p2, p4, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string p2, "_parent_stat"

    .line 291
    invoke-virtual {p4, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "parent_missing"

    const-string v1, "FILE_PARENT_NOT_FOUND"

    move-object v3, p0

    move-object v4, p1

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ll/ۗ᩵ܿ;)Ljava/lang/String;
    .locals 1

    .line 468
    sget-object v0, Ll/᩶ۡۜ;->֫:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-ne p0, v0, :cond_0

    const-string p0, "other"

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IncompatibleClassChangeError;

    invoke-direct {p0}, Ljava/lang/IncompatibleClassChangeError;-><init>()V

    throw p0

    :cond_1
    const-string p0, "link"

    return-object p0

    :cond_2
    const-string p0, "missing"

    return-object p0

    :cond_3
    const-string p0, "directory"

    return-object p0

    :cond_4
    const-string p0, "file"

    return-object p0
.end method

.method public static synthetic ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 9

    const-string v0, "parent_missing"

    .line 392
    invoke-virtual {v0, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "The existing parent chain could not be verified safely."

    if-nez v0, :cond_2

    const-string v0, "ancestor_missing"

    invoke-virtual {v0, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "FILE_NOT_DIRECTORY"

    .line 396
    invoke-virtual {v0, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move-object v2, p4

    move-object v3, p5

    move-object v8, p6

    goto :goto_2

    :cond_2
    :goto_0
    const-string p4, "FILE_LINK_CHECK_FAILED"

    const-string p5, "missing"

    move-object p6, p5

    :goto_1
    move-object v2, p4

    move-object v8, p6

    move-object v3, v1

    :goto_2
    move-object v4, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    .line 399
    invoke-static/range {v2 .. v8}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Ll/۟ۢۜ;Ljava/lang/String;Ljava/lang/String;Z)Ll/ۗۡۜ;
    .locals 30

    move-object/from16 v7, p0

    move-object/from16 v0, p1

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    const-string v10, "File move notification could not be completed."

    .line 62
    iget-object v11, v7, Ll/۬ۡۜ;->֫:Ll/᩶۫᩷;

    iget-object v1, v0, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    iget-object v12, v7, Ll/۬ۡۜ;->ۧ:Ll/ᩳۖۜ;

    invoke-virtual {v12, v8}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v13

    .line 63
    invoke-virtual {v12, v9}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v14

    .line 64
    invoke-direct {v7, v13}, Ll/۬ۡۜ;->֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v15

    .line 65
    invoke-direct {v7, v14}, Ll/۬ۡۜ;->֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v16

    .line 66
    iget-object v4, v0, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    .line 215
    sget-object v2, Ll/᩶ۡۜ;->֫:[I

    invoke-virtual {v15}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v2, v3

    const/4 v5, 0x3

    if-eq v3, v5, :cond_28

    const/4 v5, 0x4

    if-eq v3, v5, :cond_27

    const/4 v5, 0x5

    if-eq v3, v5, :cond_26

    .line 68
    iget-object v4, v0, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    .line 235
    invoke-virtual {v15}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v3

    sget-object v5, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    const/4 v6, 0x1

    if-ne v3, v5, :cond_5

    if-nez p4, :cond_4

    .line 242
    invoke-virtual/range {v16 .. v16}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    if-eq v2, v6, :cond_3

    const/4 v3, 0x2

    if-eq v2, v3, :cond_2

    const/4 v3, 0x4

    if-eq v2, v3, :cond_1

    const/4 v3, 0x5

    if-eq v2, v3, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v5, "destination_stat"

    const-string v6, "other"

    const-string v0, "FILE_UNSUPPORTED_TYPE"

    const-string v1, "The destination node type cannot be replaced by the generic file tool."

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    .line 251
    invoke-static/range {v0 .. v6}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_1
    const-string v5, "destination_stat"

    const-string v6, "link"

    const-string v0, "FILE_IS_SYMLINK"

    const-string v1, "Symbolic links cannot be replaced by the generic file tool."

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    .line 248
    invoke-static/range {v0 .. v6}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_2
    const-string v5, "destination_stat"

    const-string v6, "directory"

    const-string v0, "FILE_DIRECTORY_MERGE_UNSUPPORTED"

    const-string v1, "Directory merging is not supported by the generic file tool."

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    .line 245
    invoke-static/range {v0 .. v6}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_3
    const-string v5, "destination_stat"

    const-string v6, "file"

    const-string v0, "FILE_ALREADY_EXISTS"

    const-string v1, "The destination of a directory move must not already exist."

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    .line 254
    invoke-static/range {v0 .. v6}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_4
    const-string v5, "prepare"

    const-string v6, "directory_overwrite_unsupported"

    const-string v0, "FILE_DIRECTORY_MERGE_UNSUPPORTED"

    const-string v1, "Directory moves require overwrite=false and never replace a target."

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    .line 237
    invoke-static/range {v0 .. v6}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_5
    if-nez p4, :cond_7

    .line 260
    invoke-virtual/range {v16 .. v16}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v2

    sget-object v3, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    if-ne v2, v3, :cond_6

    goto :goto_0

    .line 264
    :cond_6
    invoke-virtual/range {v16 .. v16}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v0

    invoke-static {v0}, Ll/۬ۡۜ;->֫(Ll/ۗ᩵ܿ;)Ljava/lang/String;

    move-result-object v6

    const-string v0, "FILE_ALREADY_EXISTS"

    const-string v1, "The destination already exists and overwrite is false."

    const-string v5, "destination_stat"

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    .line 261
    invoke-static/range {v0 .. v6}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_7
    :goto_0
    if-eqz p4, :cond_b

    .line 267
    invoke-virtual/range {v16 .. v16}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v2

    sget-object v3, Ll/ۗ᩵ܿ;->᩶:Ll/ۗ᩵ܿ;

    if-eq v2, v3, :cond_a

    .line 272
    invoke-virtual/range {v16 .. v16}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v2

    sget-object v3, Ll/ۗ᩵ܿ;->ۗ:Ll/ۗ᩵ܿ;

    if-eq v2, v3, :cond_9

    .line 277
    invoke-virtual/range {v16 .. v16}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v2

    if-eq v2, v5, :cond_8

    goto :goto_1

    :cond_8
    const-string v5, "destination_stat"

    const-string v6, "directory"

    const-string v0, "FILE_NOT_REGULAR"

    const-string v1, "A regular file cannot replace a directory."

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    .line 278
    invoke-static/range {v0 .. v6}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_9
    const-string v5, "destination_stat"

    const-string v6, "other"

    const-string v0, "FILE_UNSUPPORTED_TYPE"

    const-string v1, "The destination node type cannot be replaced by the generic file tool."

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    .line 273
    invoke-static/range {v0 .. v6}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_a
    const-string v5, "destination_stat"

    const-string v6, "link"

    const-string v0, "FILE_IS_SYMLINK"

    const-string v1, "Symbolic links cannot be replaced by the generic file tool."

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    .line 268
    invoke-static/range {v0 .. v6}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 70
    :cond_b
    :goto_1
    invoke-virtual {v15}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v2

    if-ne v2, v5, :cond_d

    .line 71
    invoke-static {v9, v8}, Ll/۫ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_c

    goto :goto_2

    .line 72
    :cond_c
    iget-object v4, v0, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v5, "prepare"

    const-string v6, "destination_is_descendant"

    const-string v0, "FILE_MOVE_INTO_DESCENDANT"

    const-string v1, "A directory cannot be moved into itself or one of its descendants."

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    invoke-static/range {v0 .. v6}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_d
    :goto_2
    const-string v2, "source"

    .line 78
    invoke-static {v8, v9, v13, v1, v2}, Ll/۬ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v2, "destination"

    .line 80
    invoke-static {v8, v9, v14, v1, v2}, Ll/۬ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 83
    invoke-virtual {v0, v6}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    .line 84
    invoke-virtual {v0, v5}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    .line 85
    iget-object v4, v0, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v17, "source"

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v18, v4

    move-object v4, v6

    move-object/from16 p4, v5

    move-object/from16 v5, v18

    move-object/from16 v18, v10

    move-object v10, v6

    move-object/from16 v6, v17

    invoke-direct/range {v1 .. v6}, Ll/۬ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    iget-object v5, v0, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v6, "destination"

    move-object/from16 v4, p4

    invoke-direct/range {v1 .. v6}, Ll/۬ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    iget-object v5, v0, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v6, "source_parent_links"

    move-object v4, v13

    invoke-direct/range {v1 .. v6}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    iget-object v5, v0, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v6, "destination_parent_links"

    move-object v4, v14

    invoke-direct/range {v1 .. v6}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    invoke-virtual/range {v16 .. v16}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v1

    sget-object v2, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    if-ne v1, v2, :cond_e

    .line 96
    sget-object v1, Ll/۬᩵ܿ;->۫:Ll/۬᩵ܿ;

    goto :goto_3

    .line 97
    :cond_e
    sget-object v1, Ll/۬᩵ܿ;->ۤ:Ll/۬᩵ܿ;

    :goto_3
    move-object v14, v1

    .line 99
    invoke-virtual {v13}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v1

    .line 100
    invoke-virtual {v1, v14}, Ll/ۤ᩵ܿ;->֫(Ll/۬᩵ܿ;)Ll/ۙ᩵ܿ;

    move-result-object v1

    .line 101
    sget-object v2, Ll/ۙ᩵ܿ;->ۗ:Ll/ۙ᩵ܿ;

    if-eq v1, v2, :cond_25

    .line 115
    :goto_4
    invoke-virtual {v12}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v13

    .line 116
    invoke-virtual {v13, v8}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    iget-object v6, v13, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    .line 117
    invoke-virtual {v13, v8}, Ll/۟ۢۜ;->ۧ(Ljava/lang/String;)V

    .line 118
    invoke-virtual {v13, v9}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    .line 119
    invoke-virtual {v13, v9}, Ll/۟ۢۜ;->ۧ(Ljava/lang/String;)V

    .line 120
    invoke-virtual {v13, v10}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    move-object/from16 v5, p4

    .line 121
    invoke-virtual {v13, v5}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    .line 122
    invoke-virtual {v12, v8}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 123
    invoke-virtual {v12, v9}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 124
    invoke-direct {v7, v4}, Ll/۬ۡۜ;->֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v2

    .line 125
    invoke-direct {v7, v3}, Ll/۬ۡۜ;->֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v17

    .line 126
    iget-object v1, v13, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    move-object/from16 v0, p2

    move-object/from16 v19, v1

    move-object/from16 v1, p3

    move-object/from16 p1, v2

    move-object v2, v15

    move-object/from16 v20, v3

    move-object/from16 v3, v16

    move-object/from16 v21, v4

    move-object/from16 v4, p1

    move-object/from16 v22, v5

    move-object/from16 v5, v17

    move-object/from16 v17, v11

    move-object v11, v6

    move-object/from16 v6, v19

    invoke-static/range {v0 .. v6}, Ll/۬ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/۫᩵ܿ;Ll/۫᩵ܿ;Ll/۫᩵ܿ;Ll/۫᩵ܿ;Ljava/lang/String;)V

    .line 129
    iget-object v5, v13, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v6, "source"

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object v4, v10

    invoke-direct/range {v1 .. v6}, Ll/۬ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    iget-object v5, v13, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v6, "destination"

    move-object/from16 v4, v22

    invoke-direct/range {v1 .. v6}, Ll/۬ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    iget-object v5, v13, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v6, "source_parent_links"

    move-object/from16 v4, v21

    invoke-direct/range {v1 .. v6}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    iget-object v5, v13, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v6, "destination_parent_links"

    move-object/from16 v4, v20

    invoke-direct/range {v1 .. v6}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    invoke-virtual/range {p1 .. p1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v0

    sget-object v1, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    if-ne v0, v1, :cond_14

    .line 329
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 330
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    move-object/from16 v2, p1

    .line 331
    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 332
    :cond_f
    :goto_5
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_14

    .line 333
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۫᩵ܿ;

    .line 334
    invoke-virtual {v2}, Ll/۫᩵ܿ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v8, v9, v11}, Ll/۬ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 336
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_10

    goto :goto_5

    .line 339
    :cond_10
    invoke-virtual {v2}, Ll/۫᩵ܿ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 164
    :try_start_0
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v3

    invoke-virtual {v3, v2}, Ll/ۤ᩵ܿ;->֫(Ll/۫᩵ܿ;)Ljava/util/List;

    move-result-object v2
    :try_end_0
    .catch Ll/᩹᩵ܿ; {:try_start_0 .. :try_end_0} :catch_0

    .line 339
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۫᩵ܿ;

    .line 340
    invoke-virtual {v3}, Ll/۫᩵ܿ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v8, v9, v11}, Ll/۬ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 0
    invoke-static/range {p3 .. p3}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 342
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 343
    invoke-virtual {v3}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v6

    move-object/from16 p1, v1

    sget-object v1, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    if-ne v6, v1, :cond_11

    goto :goto_7

    .line 347
    :cond_11
    invoke-virtual {v13, v4}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    .line 348
    invoke-virtual {v13, v5}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    .line 349
    sget-object v1, Ll/᩶ۡۜ;->֫:[I

    invoke-virtual {v3}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v1, v1, v6

    const/4 v6, 0x2

    if-eq v1, v6, :cond_13

    const/4 v3, 0x5

    if-eq v1, v3, :cond_12

    goto :goto_7

    .line 356
    :cond_12
    iget-object v0, v13, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v28, "source_tree"

    const-string v29, "other"

    const-string v23, "FILE_UNSUPPORTED_TYPE"

    const-string v24, "A directory move cannot include an unsupported special node."

    move-object/from16 v25, v4

    move-object/from16 v26, v5

    move-object/from16 v27, v0

    invoke-static/range {v23 .. v29}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 352
    :cond_13
    invoke-virtual {v0, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    :goto_7
    move-object/from16 v1, p1

    goto :goto_6

    :catch_0
    move-exception v0

    .line 166
    invoke-static {v0}, Ll/ᩳۖۜ;->֫(Ll/᩹᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 142
    :cond_14
    invoke-virtual {v12}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v13

    .line 143
    iget-object v0, v13, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    move-object/from16 v11, v17

    move-object/from16 p4, v22

    goto/16 :goto_4

    .line 148
    :cond_15
    invoke-virtual {v12, v8}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v11

    .line 149
    invoke-virtual {v12, v9}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v6

    .line 150
    invoke-direct {v7, v11}, Ll/۬ۡۜ;->֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v4

    .line 151
    invoke-direct {v7, v6}, Ll/۬ۡۜ;->֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v5

    .line 152
    iget-object v3, v13, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move-object v2, v15

    move-object/from16 v19, v3

    move-object/from16 v3, v16

    move-object/from16 p1, v6

    move-object/from16 v6, v19

    invoke-static/range {v0 .. v6}, Ll/۬ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/۫᩵ܿ;Ll/۫᩵ܿ;Ll/۫᩵ܿ;Ll/۫᩵ܿ;Ljava/lang/String;)V

    .line 155
    iget-object v5, v13, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v6, "source"

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object v4, v10

    invoke-direct/range {v1 .. v6}, Ll/۬ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    iget-object v5, v13, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v6, "destination"

    move-object/from16 v4, v22

    invoke-direct/range {v1 .. v6}, Ll/۬ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    iget-object v5, v13, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v6, "source_parent_links"

    move-object v4, v11

    invoke-direct/range {v1 .. v6}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    iget-object v5, v13, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v6, "destination_parent_links"

    move-object/from16 v4, p1

    invoke-direct/range {v1 .. v6}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    invoke-virtual {v11}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v0

    .line 164
    invoke-virtual {v0, v14}, Ll/ۤ᩵ܿ;->֫(Ll/۬᩵ܿ;)Ll/ۙ᩵ܿ;

    move-result-object v1

    .line 165
    sget-object v2, Ll/ۙ᩵ܿ;->ۗ:Ll/ۙ᩵ܿ;

    if-eq v1, v2, :cond_24

    .line 173
    sget-object v2, Ll/ۙ᩵ܿ;->᩹:Ll/ۙ᩵ܿ;

    if-ne v1, v2, :cond_16

    const-string v2, "atomic"

    goto :goto_8

    :cond_16
    const-string v2, "best_effort"

    .line 176
    :goto_8
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v3

    const/4 v4, 0x0

    .line 178
    :try_start_1
    sget-object v5, Ll/۬᩵ܿ;->ۤ:Ll/۬᩵ܿ;

    if-ne v14, v5, :cond_17

    move-object/from16 v5, p1

    .line 179
    invoke-virtual {v0, v5}, Ll/ۤ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)V

    goto :goto_9

    :cond_17
    move-object/from16 v5, p1

    .line 181
    invoke-virtual {v0, v5}, Ll/ۤ᩵ܿ;->֫(Ll/ܶ᩵ܿ;)V
    :try_end_1
    .catch Ll/᩹᩵ܿ; {:try_start_1 .. :try_end_1} :catch_2

    .line 205
    :goto_9
    invoke-virtual {v15}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v0

    sget-object v1, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    if-ne v0, v1, :cond_18

    const/4 v0, 0x1

    goto :goto_a

    :cond_18
    const/4 v0, 0x0

    .line 452
    :goto_a
    :try_start_2
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    invoke-static {}, Ll/ᩳ۬᩻;->֫()Ll/ᩳ۬᩻;

    if-eqz v0, :cond_19

    .line 37
    invoke-static/range {p2 .. p2}, Ll/ܳۤܳ;->ܿ(Ljava/lang/String;)V

    .line 38
    invoke-static {v9, v4}, Ll/ܳۤܳ;->֫(Ljava/lang/String;Z)V

    goto :goto_b

    .line 40
    :cond_19
    invoke-static/range {p2 .. p2}, Ll/ܳۤܳ;->ᩳ(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 217
    invoke-static {v9, v0}, Ll/ܳۤܳ;->֫(Ljava/lang/String;Z)V

    .line 43
    :goto_b
    invoke-static {}, Ll/ܽ۬᩻;->֫()V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_c

    :catch_1
    move-object/from16 v5, v18

    .line 454
    invoke-virtual {v3, v5}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    .line 207
    :goto_c
    new-instance v0, Ll/ۗۡۜ;

    invoke-virtual {v15}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v1

    invoke-static {v1}, Ll/۬ۡۜ;->֫(Ll/ۗ᩵ܿ;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lbin/mt/json/JSONArray;

    invoke-direct {v2, v3}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    invoke-direct {v0, v2, v8, v9, v1}, Ll/ۗۡۜ;-><init>(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :catch_2
    move-exception v0

    move-object/from16 v5, v18

    .line 184
    sget-object v6, Ll/ۙ᩵ܿ;->᩹:Ll/ۙ᩵ܿ;

    if-ne v1, v6, :cond_1a

    .line 185
    invoke-static {v4}, Ll/ۙۡۜ;->֫(Z)Ll/ۙۡۜ;

    move-result-object v1

    goto :goto_d

    .line 187
    :cond_1a
    invoke-virtual {v15}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v1

    .line 425
    :try_start_3
    invoke-virtual {v12, v8}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v6

    .line 426
    invoke-virtual {v12, v9}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v10

    .line 427
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v6

    invoke-virtual {v6}, Ll/ۤ᩵ܿ;->ۜ()Ll/۫᩵ܿ;

    move-result-object v6

    invoke-virtual {v6}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v6

    .line 428
    invoke-virtual {v10}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v10

    invoke-virtual {v10}, Ll/ۤ᩵ܿ;->ۜ()Ll/۫᩵ܿ;

    move-result-object v10

    invoke-virtual {v10}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v10

    .line 429
    sget-object v11, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    if-ne v6, v11, :cond_1b

    if-ne v10, v1, :cond_1b

    const/4 v1, 0x1

    .line 431
    invoke-static {v1}, Ll/ۙۡۜ;->֫(Z)Ll/ۙۡۜ;

    move-result-object v1

    goto :goto_d

    .line 433
    :cond_1b
    sget-object v12, Ll/۬᩵ܿ;->۫:Ll/۬᩵ܿ;

    if-ne v14, v12, :cond_1c

    if-ne v6, v1, :cond_1c

    if-ne v10, v11, :cond_1c

    .line 436
    invoke-static {v4}, Ll/ۙۡۜ;->֫(Z)Ll/ۙۡۜ;

    move-result-object v1

    goto :goto_d

    .line 439
    :cond_1c
    invoke-static {}, Ll/ۙۡۜ;->֫()Ll/ۙۡۜ;

    move-result-object v1
    :try_end_3
    .catch Ll/᩹᩵ܿ; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_d

    .line 441
    :catch_3
    invoke-static {}, Ll/ۙۡۜ;->֫()Ll/ۙۡۜ;

    move-result-object v1

    .line 189
    :goto_d
    iget-boolean v6, v1, Ll/ۙۡۜ;->ۧ:Z

    iget-boolean v10, v1, Ll/ۙۡۜ;->֫:Z

    invoke-virtual {v15}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v11

    sget-object v12, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    if-ne v11, v12, :cond_1d

    const/4 v11, 0x1

    goto :goto_e

    :cond_1d
    const/4 v11, 0x0

    :goto_e
    if-nez v10, :cond_1e

    if-eqz v6, :cond_1e

    goto :goto_10

    .line 452
    :cond_1e
    :try_start_4
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    invoke-static {}, Ll/ᩳ۬᩻;->֫()Ll/ᩳ۬᩻;

    if-eqz v11, :cond_1f

    .line 37
    invoke-static/range {p2 .. p2}, Ll/ܳۤܳ;->ܿ(Ljava/lang/String;)V

    .line 38
    invoke-static {v9, v4}, Ll/ܳۤܳ;->֫(Ljava/lang/String;Z)V

    goto :goto_f

    .line 40
    :cond_1f
    invoke-static/range {p2 .. p2}, Ll/ܳۤܳ;->ᩳ(Ljava/lang/String;)V

    const/4 v4, 0x1

    .line 217
    invoke-static {v9, v4}, Ll/ܳۤܳ;->֫(Ljava/lang/String;Z)V

    .line 43
    :goto_f
    invoke-static {}, Ll/ܽ۬᩻;->֫()V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_10

    .line 454
    :catch_4
    invoke-virtual {v3, v5}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    :goto_10
    const/4 v4, 0x0

    if-nez v10, :cond_21

    if-eqz v6, :cond_21

    .line 192
    invoke-virtual {v0}, Ll/᩹᩵ܿ;->ܽ()Ll/᩸᩵ܿ;

    move-result-object v5

    sget-object v6, Ll/᩸᩵ܿ;->᩶:Ll/᩸᩵ܿ;

    if-eq v5, v6, :cond_20

    .line 193
    invoke-virtual {v0}, Ll/᩹᩵ܿ;->ܽ()Ll/᩸᩵ܿ;

    move-result-object v5

    sget-object v6, Ll/᩸᩵ܿ;->ۨ:Ll/᩸᩵ܿ;

    if-eq v5, v6, :cond_20

    goto :goto_11

    .line 194
    :cond_20
    iget-object v10, v13, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    .line 196
    invoke-virtual {v0}, Ll/᩹᩵ܿ;->ܽ()Ll/᩸᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v12

    .line 478
    invoke-virtual {v14}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v11

    const/4 v13, 0x0

    const/4 v15, 0x1

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    move-object v14, v2

    move-object/from16 v16, v3

    .line 527
    invoke-static/range {v8 .. v16}, Ll/۬ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "FILE_DIRECT_MOVE_UNSUPPORTED"

    const-string v2, "The storage backend cannot perform this move as a direct operation."

    const-string v3, "fatal"

    .line 524
    invoke-static {v1, v2, v3, v4, v0}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 194
    throw v0

    .line 198
    :cond_21
    :goto_11
    iget-object v10, v13, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    .line 199
    invoke-virtual {v0}, Ll/᩹᩵ܿ;->ܽ()Ll/᩸᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v12

    iget-boolean v13, v1, Ll/ۙۡۜ;->֫:Z

    iget-boolean v15, v1, Ll/ۙۡۜ;->ۧ:Z

    if-eqz v15, :cond_22

    const-string v0, "FILE_MOVE_FAILED"

    goto :goto_12

    :cond_22
    const-string v0, "FILE_OPERATION_STATE_UNKNOWN"

    :goto_12
    if-eqz v15, :cond_23

    const-string v1, "The direct file move failed."

    goto :goto_13

    :cond_23
    const-string v1, "The direct file move failed and its final state is unknown."

    .line 478
    :goto_13
    invoke-virtual {v14}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v11

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    move-object v14, v2

    move-object/from16 v16, v3

    .line 514
    invoke-static/range {v8 .. v16}, Ll/۬ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "warning"

    .line 510
    invoke-static {v0, v1, v3, v4, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 198
    throw v0

    .line 166
    :cond_24
    iget-object v4, v13, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    .line 478
    invoke-virtual {v14}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "unsupported"

    const-string v0, "FILE_DIRECT_MOVE_UNSUPPORTED"

    const-string v1, "The storage backend cannot perform this move as a direct operation."

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    .line 166
    invoke-static/range {v0 .. v6}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 102
    :cond_25
    iget-object v4, v0, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    .line 478
    invoke-virtual {v14}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "unsupported"

    const-string v0, "FILE_DIRECT_MOVE_UNSUPPORTED"

    const-string v1, "The storage backend cannot perform this move as a direct operation."

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    .line 102
    invoke-static/range {v0 .. v6}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_26
    const-string v5, "source_stat"

    const-string v6, "other"

    const-string v0, "FILE_UNSUPPORTED_TYPE"

    const-string v1, "The source node type cannot be moved by the generic file tool."

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    .line 224
    invoke-static/range {v0 .. v6}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_27
    const-string v5, "source_stat"

    const-string v6, "link"

    const-string v0, "FILE_IS_SYMLINK"

    const-string v1, "Symbolic links cannot be moved by the generic file tool."

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    .line 221
    invoke-static/range {v0 .. v6}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_28
    const-string v5, "source_stat"

    const-string v6, "missing"

    const-string v0, "FILE_NOT_FOUND"

    const-string v1, "The source path does not exist."

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    .line 218
    invoke-static/range {v0 .. v6}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method

.method private ֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܿ;
    .locals 1

    .line 461
    :try_start_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۤ᩵ܿ;->ۜ()Ll/۫᩵ܿ;

    move-result-object p1
    :try_end_0
    .catch Ll/᩹᩵ܿ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 463
    iget-object v0, p0, Ll/۬ۡۜ;->ۧ:Ll/ᩳۖۜ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Ll/ᩳۖۜ;->֫(Ll/᩹᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method

.method private ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 14

    move-object v0, p0

    move-object/from16 v1, p5

    .line 302
    iget-object v2, v0, Ll/۬ۡۜ;->ۧ:Ll/ᩳۖۜ;

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-direct {p0, v2}, Ll/۬ۡۜ;->֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v2

    .line 303
    invoke-virtual {v2}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v3

    sget-object v4, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    const-string v5, "_parent_stat"

    const-string v6, "The "

    if-eq v3, v4, :cond_2

    .line 308
    invoke-virtual {v2}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v3

    sget-object v4, Ll/ۗ᩵ܿ;->᩶:Ll/ۗ᩵ܿ;

    if-eq v3, v4, :cond_1

    .line 314
    invoke-virtual {v2}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v3

    sget-object v4, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    if-ne v3, v4, :cond_0

    return-void

    :cond_0
    const-string v3, " parent is not a directory."

    .line 0
    invoke-static {v6, v1, v3}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 315
    invoke-virtual {v1, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 318
    invoke-virtual {v2}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v1

    invoke-static {v1}, Ll/۬ۡۜ;->֫(Ll/ۗ᩵ܿ;)Ljava/lang/String;

    move-result-object v13

    const-string v7, "FILE_NOT_DIRECTORY"

    move-object v9, p1

    move-object/from16 v10, p2

    move-object/from16 v11, p4

    .line 315
    invoke-static/range {v7 .. v13}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v1

    throw v1

    .line 309
    :cond_1
    invoke-virtual {v1, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "parent_is_link"

    const-string v2, "FILE_IS_SYMLINK"

    const-string v3, "A symbolic-link parent cannot be traversed by a destructive file tool."

    move-object v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p4

    invoke-static/range {v2 .. v8}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v1

    throw v1

    :cond_2
    const-string v2, " parent directory does not exist."

    .line 0
    invoke-static {v6, v1, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 304
    invoke-virtual {v1, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "missing"

    const-string v7, "FILE_PARENT_NOT_FOUND"

    move-object v9, p1

    move-object/from16 v10, p2

    move-object/from16 v11, p4

    invoke-static/range {v7 .. v13}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v1

    throw v1
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ll/۫᩵ܿ;Ll/۫᩵ܿ;Ll/۫᩵ܿ;Ll/۫᩵ܿ;Ljava/lang/String;)V
    .locals 7

    .line 411
    invoke-virtual {p2}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object p2

    invoke-virtual {p4}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object p4

    if-ne p2, p4, :cond_0

    .line 412
    invoke-virtual {p3}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object p2

    invoke-virtual {p5}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object p3

    if-ne p2, p3, :cond_0

    return-void

    :cond_0
    const-string v5, "pre_move_stat"

    const-string v6, "node_type_changed"

    const-string v0, "FILE_MOVE_FAILED"

    const-string v1, "A source or destination node changed during move validation."

    move-object v2, p0

    move-object v3, p1

    move-object v4, p6

    .line 413
    invoke-static/range {v0 .. v6}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 9

    const/4 v7, 0x1

    .line 486
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v8

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p2

    move-object v1, p3

    move-object v2, p4

    move-object v3, p5

    move-object v4, p6

    .line 485
    invoke-static/range {v0 .. v8}, Ll/۬ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "FILE_NOT_FOUND"

    .line 488
    invoke-virtual {p3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    const/4 p4, 0x0

    const-string v0, "missing"

    if-eqz p3, :cond_0

    const-string p3, "source_stat"

    invoke-virtual {p3, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    .line 489
    invoke-virtual {v0, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_5

    :cond_0
    const-string p3, "FILE_NOT_REGULAR"

    .line 490
    invoke-virtual {p3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    const-string p3, "destination_stat"

    invoke-virtual {p3, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    const-string p3, "directory"

    .line 491
    invoke-virtual {p3, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_5

    :cond_1
    const-string p3, "source_parent_stat"

    .line 492
    invoke-virtual {p3, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_2

    const-string p3, "destination_parent_stat"

    invoke-virtual {p3, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    :cond_2
    const-string p3, "FILE_PARENT_NOT_FOUND"

    .line 493
    invoke-virtual {p3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-virtual {v0, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_5

    :cond_3
    const-string p3, "FILE_NOT_DIRECTORY"

    .line 494
    invoke-virtual {p3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    const-string p3, "file"

    invoke-virtual {p3, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    goto :goto_0

    :cond_4
    const-string p3, "FILE_ALREADY_EXISTS"

    .line 495
    invoke-virtual {p3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_6

    :cond_5
    :goto_0
    const-string p3, "warning"

    .line 496
    invoke-static {p0, p1, p3, p4, p2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0

    :cond_6
    const-string p3, "fatal"

    .line 499
    invoke-static {p0, p1, p3, p4, p2}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method private ۧ(Ljava/lang/String;Ljava/lang/String;Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 390
    new-instance v0, Ll/᩹ۡۜ;

    invoke-direct {v0, p1, p2, p4, p5}, Ll/᩹ۡۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Ll/۬ۡۜ;->ۧ:Ll/ᩳۖۜ;

    invoke-virtual {p1, p3, v0}, Ll/ᩳۖۜ;->֫(Ll/ܶ᩵ܿ;Ll/ܽۖۜ;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ljava/lang/String;Z)Ll/ۗۡۜ;
    .locals 10

    .line 43
    iget-object v0, p0, Ll/۬ۡۜ;->ۧ:Ll/ᩳۖۜ;

    invoke-virtual {v0}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v1

    const-string v2, "sourcePath"

    .line 44
    invoke-static {p1, v1, v2}, Ll/ᩳۖۜ;->ۧ(Ljava/lang/String;Ll/۟ۢۜ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string p1, "destinationPath"

    .line 46
    invoke-static {p2, v1, p1}, Ll/ᩳۖۜ;->ۧ(Ljava/lang/String;Ll/۟ۢۜ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 48
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 53
    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object p1

    .line 54
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 53
    invoke-virtual {v0, p1}, Ll/ᩳۖۜ;->֫(Ljava/util/List;)Ll/ۤۖۜ;

    move-result-object p1

    .line 55
    :try_start_0
    invoke-direct {p0, v1, v5, v6, p3}, Ll/۬ۡۜ;->֫(Ll/۟ۢۜ;Ljava/lang/String;Ljava/lang/String;Z)Ll/ۗۡۜ;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    invoke-virtual {p1}, Ll/ۤۖۜ;->close()V

    return-object p2

    :catchall_0
    move-exception p2

    .line 53
    :try_start_1
    invoke-virtual {p1}, Ll/ۤۖۜ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p2

    .line 49
    :cond_0
    iget-object v7, v1, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v8, "prepare"

    const-string v9, "same_path"

    const-string v3, "FILE_MOVE_FAILED"

    const-string v4, "Source and destination must identify different paths."

    invoke-static/range {v3 .. v9}, Ll/۬ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method
