.class public final Ll/֡ۡۜ;
.super Ljava/lang/Object;
.source "46X2"


# instance fields
.field public final ֫:Ll/᩶۫᩷;

.field public final ۧ:Ll/ᩳۖۜ;


# direct methods
.method public constructor <init>(Ll/ᩳۖۜ;)V
    .locals 1

    .line 30
    new-instance v0, Ll/᩶۫᩷;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Ll/֡ۡۜ;->ۧ:Ll/ᩳۖۜ;

    .line 37
    iput-object v0, p0, Ll/֡ۡۜ;->֫:Ll/᩶۫᩷;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۖۡۜ;Ll/۫᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2, p3}, Ll/֡ۡۜ;->ۧ(Ll/ۖۡۜ;Ll/۫᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 671
    iget-object p0, p0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 672
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p2
.end method

.method public static bridge synthetic ֫(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 10

    const-string v6, "non_atomic"

    const-string v9, "list_directory"

    const-string v0, "FILE_STORAGE_ERROR"

    const-string v1, "The backend returned a duplicate directory child."

    const-string v4, "list_directory"

    const-string v5, "duplicate_child"

    move-object v2, p1

    move-object v3, p2

    move-object v7, p0

    move-object v8, p3

    .line 0
    invoke-static/range {v0 .. v9}, Ll/֡ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 2

    const-string v0, "path"

    const-string v1, "policyRevision"

    .line 0
    invoke-static {v0, p2, v1, p3}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "operation"

    .line 629
    invoke-virtual {p2, p3, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "backendReason"

    .line 630
    invoke-virtual {p2, p3, p5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "changed"

    const/4 p4, 0x0

    .line 631
    invoke-virtual {p2, p3, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p2

    if-nez p6, :cond_0

    .line 633
    sget-object p3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_0

    :cond_0
    invoke-static {p6}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p3

    :goto_0
    const-string p5, "operationMode"

    .line 632
    invoke-virtual {p2, p5, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "stateKnown"

    const/4 p5, 0x1

    .line 634
    invoke-virtual {p2, p3, p5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p2

    new-instance p3, Lbin/mt/json/JSONArray;

    invoke-direct {p3, p7}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    const-string p5, "warnings"

    .line 635
    invoke-virtual {p2, p5, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "deletedFiles"

    .line 636
    invoke-virtual {p2, p3, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "deletedDirectories"

    .line 637
    invoke-virtual {p2, p3, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p2

    if-nez p8, :cond_1

    .line 638
    sget-object p3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_1

    :cond_1
    invoke-static {p8}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p3

    :goto_1
    const-string p5, "failedPath"

    invoke-virtual {p2, p5, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "failureStage"

    .line 640
    invoke-static {p9}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p5

    .line 639
    invoke-virtual {p2, p3, p5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "safeToRetry"

    .line 641
    invoke-virtual {p2, p3, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "FILE_STORAGE_ERROR"

    .line 642
    invoke-virtual {p3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    const/4 p4, 0x0

    if-nez p3, :cond_3

    const-string p3, "FILE_DIRECTORY_DELETE_FAILED"

    .line 643
    invoke-virtual {p3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_3

    const-string p3, "FILE_OPERATION_STATE_UNKNOWN"

    .line 644
    invoke-virtual {p3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    goto :goto_2

    :cond_2
    const-string p3, "fatal"

    .line 648
    invoke-static {p0, p1, p3, p4, p2}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_2
    const-string p3, "warning"

    .line 645
    invoke-static {p0, p1, p3, p4, p2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Ljava/lang/String;Ll/ۗ᩵ܿ;)Ll/ۗۛ᩻;
    .locals 2

    .line 444
    sget-object v0, Ll/ۗ᩵ܿ;->᩶:Ll/ۗ᩵ܿ;

    iget-object v1, p0, Ll/֡ۡۜ;->ۧ:Ll/ᩳۖۜ;

    if-ne p2, v0, :cond_0

    .line 445
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "FILE_IS_SYMLINK"

    const-string v1, "A directory changed into a symbolic link during deletion."

    invoke-static {v0, v1, p1, p2}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ۗ᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object p1

    return-object p1

    .line 448
    :cond_0
    sget-object v0, Ll/ۗ᩵ܿ;->ۗ:Ll/ۗ᩵ܿ;

    if-ne p2, v0, :cond_1

    .line 449
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "FILE_UNSUPPORTED_TYPE"

    const-string v1, "The directory tree contains an unsupported special node."

    invoke-static {v0, v1, p1, p2}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ۗ᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object p1

    return-object p1

    .line 452
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "FILE_NOT_DIRECTORY"

    const-string v1, "A directory changed type during deletion."

    invoke-static {v0, v1, p1, p2}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ۗ᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object p1

    return-object p1
.end method

.method public static ֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLbin/mt/json/JSONArray;IILjava/lang/String;Ljava/lang/String;Z)Ll/ۗۛ᩻;
    .locals 3

    .line 593
    new-instance v0, Lbin/mt/json/JSONObject;

    iget-object v1, p0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    iget-object v2, p0, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    invoke-direct {v0, v1}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    const-string v1, "path"

    .line 594
    invoke-virtual {v0, v1, p1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string p1, "policyRevision"

    .line 595
    invoke-virtual {v0, p1, p2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string p1, "changed"

    .line 596
    invoke-virtual {v0, p1, p4}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    const-string p1, "operationMode"

    .line 598
    invoke-static {p3}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p2

    .line 597
    invoke-virtual {v0, p1, p2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    const-string p1, "stateKnown"

    .line 599
    invoke-virtual {v0, p1, p5}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    .line 600
    new-instance p1, Lbin/mt/json/JSONArray;

    invoke-direct {p1, p6}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    const-string p2, "warnings"

    invoke-virtual {v0, p2, p1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    const-string p1, "deletedFiles"

    .line 601
    invoke-virtual {v0, p1, p7}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    const-string p1, "deletedDirectories"

    .line 602
    invoke-virtual {v0, p1, p8}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    if-nez p9, :cond_0

    .line 603
    sget-object p1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_0

    :cond_0
    invoke-static {p9}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    :goto_0
    const-string p2, "failedPath"

    invoke-virtual {v0, p2, p1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    if-nez p10, :cond_1

    .line 605
    sget-object p1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_1

    :cond_1
    invoke-static {p10}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    :goto_1
    const-string p2, "failureStage"

    .line 604
    invoke-virtual {v0, p2, p1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    const-string p1, "safeToRetry"

    .line 606
    invoke-virtual {v0, p1, p11}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    const-string p1, "non_atomic"

    .line 608
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    if-gtz p7, :cond_2

    if-gtz p8, :cond_2

    if-eqz p4, :cond_3

    :cond_2
    const/4 p1, 0x1

    goto :goto_2

    :cond_3
    const/4 p1, 0x0

    :goto_2
    if-eqz p1, :cond_4

    const-string p2, "FILE_DIRECTORY_DELETE_PARTIAL"

    goto :goto_3

    .line 610
    :cond_4
    iget-object p2, p0, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    .line 611
    :goto_3
    iget-boolean p3, p0, Ll/ۗۛ᩻;->۫:Z

    if-nez p3, :cond_6

    if-eqz p1, :cond_5

    goto :goto_4

    .line 615
    :cond_5
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    iget-object p0, p0, Ll/ۗۛ᩻;->᩹:Ljava/lang/String;

    invoke-static {p2, p1, p0, v2, v0}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0

    .line 612
    :cond_6
    :goto_4
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    const-string p1, "warning"

    invoke-static {p2, p0, p1, v2, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۡۜ;Ljava/lang/String;Ljava/lang/String;ZZLbin/mt/json/JSONArray;Z)Ll/ۗۛ᩻;
    .locals 12

    move-object v0, p3

    move-object/from16 v9, p4

    .line 559
    iput-object v9, v0, Ll/ᩴۡۜ;->ܽ:Ljava/lang/String;

    move-object/from16 v10, p5

    .line 560
    iput-object v10, v0, Ll/ᩴۡۜ;->ᩳ:Ljava/lang/String;

    move/from16 v5, p6

    .line 561
    iput-boolean v5, v0, Ll/ᩴۡۜ;->ܳ:Z

    move/from16 v11, p7

    .line 562
    iput-boolean v11, v0, Ll/ᩴۡۜ;->ܿ:Z

    .line 563
    iget-boolean v1, v0, Ll/ᩴۡۜ;->᩻:Z

    or-int v1, v1, p9

    iput-boolean v1, v0, Ll/ᩴۡۜ;->᩻:Z

    .line 565
    invoke-static {p3}, Ll/ᩴۡۜ;->֫(Ll/ᩴۡۜ;)Z

    move-result v4

    iget v7, v0, Ll/ᩴۡۜ;->ۧ:I

    iget v8, v0, Ll/ᩴۡۜ;->֫:I

    const-string v3, "non_atomic"

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object/from16 v6, p8

    .line 564
    invoke-static/range {v0 .. v11}, Ll/֡ۡۜ;->֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLbin/mt/json/JSONArray;IILjava/lang/String;Ljava/lang/String;Z)Ll/ۗۛ᩻;

    move-result-object v0

    return-object v0
.end method

.method private ֫(Ll/᩹᩵ܿ;)Ll/ۗۛ᩻;
    .locals 4

    .line 535
    iget-object v0, p0, Ll/֡ۡۜ;->ۧ:Ll/ᩳۖۜ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Ll/ᩳۖۜ;->֫(Ll/᩹᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 536
    invoke-virtual {p1}, Ll/᩹᩵ܿ;->ܽ()Ll/᩸᩵ܿ;

    move-result-object p1

    sget-object v1, Ll/᩸᩵ܿ;->ۗ:Ll/᩸᩵ܿ;

    if-eq p1, v1, :cond_0

    return-object v0

    .line 539
    :cond_0
    new-instance p1, Lbin/mt/json/JSONObject;

    iget-object v0, v0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    invoke-direct {p1, v0}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    const-string v0, "FILE_DIRECTORY_DELETE_FAILED"

    const-string v1, "Failed to permanently delete a directory tree node."

    const-string v2, "warning"

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3, p1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    return-object p1
.end method

.method private ֫(Ljava/lang/String;Ll/ۗ᩵ܿ;Ll/ۙ᩵ܿ;)Ll/ۘۡۜ;
    .locals 3

    .line 406
    :try_start_0
    iget-object v0, p0, Ll/֡ۡۜ;->ۧ:Ll/ᩳۖۜ;

    invoke-virtual {v0, p1}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۤ᩵ܿ;->ۜ()Ll/۫᩵ܿ;

    move-result-object p1
    :try_end_0
    .catch Ll/᩹᩵ܿ; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    :goto_0
    const/4 v0, 0x1

    if-eqz p1, :cond_0

    .line 523
    invoke-virtual {p1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v1

    sget-object v2, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    if-ne v1, v2, :cond_0

    .line 524
    new-instance p1, Ll/ۘۡۜ;

    invoke-direct {p1, v0, v0, v0}, Ll/ۘۡۜ;-><init>(ZZZ)V

    return-object p1

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_1

    .line 526
    invoke-virtual {p1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object p1

    if-ne p1, p2, :cond_1

    .line 527
    new-instance p1, Ll/ۘۡۜ;

    invoke-direct {p1, v1, v0, v1}, Ll/ۘۡۜ;-><init>(ZZZ)V

    return-object p1

    .line 529
    :cond_1
    sget-object p1, Ll/ۙ᩵ܿ;->᩹:Ll/ۙ᩵ܿ;

    if-ne p3, p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 530
    :goto_1
    new-instance p1, Ll/ۘۡۜ;

    xor-int/lit8 p2, v0, 0x1

    invoke-direct {p1, v1, v0, p2}, Ll/ۘۡۜ;-><init>(ZZZ)V

    return-object p1
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ll/۬᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۙ᩵ܿ;
    .locals 11

    .line 460
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۤ᩵ܿ;->֫(Ll/۬᩵ܿ;)Ll/ۙ᩵ܿ;

    move-result-object p1

    .line 461
    sget-object v0, Ll/ۙ᩵ܿ;->ۗ:Ll/ۙ᩵ܿ;

    if-eq p1, v0, :cond_0

    return-object p1

    .line 464
    :cond_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v3

    .line 465
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v8

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v9

    const-string v1, "FILE_BACKEND_UNSUPPORTED"

    const-string v2, "The file backend does not support the required checked delete operation."

    const-string v6, "unsupported"

    const/4 v7, 0x0

    move-object v4, p2

    move-object v5, p3

    move-object v10, p3

    .line 462
    invoke-static/range {v1 .. v10}, Ll/֡ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method private ֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܿ;
    .locals 1

    .line 397
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

    .line 399
    iget-object v0, p0, Ll/֡ۡۜ;->ۧ:Ll/ᩳۖۜ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Ll/ᩳۖۜ;->֫(Ll/᩹᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method

.method private ֫(Ljava/lang/String;Ljava/lang/String;)Ll/᩵ۡۜ;
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v14, p1

    move-object/from16 v0, p2

    .line 88
    :goto_0
    iget-object v2, v1, Ll/֡ۡۜ;->ۧ:Ll/ᩳۖۜ;

    invoke-virtual {v2}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v3

    .line 89
    invoke-virtual {v3, v14}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    iget-object v4, v3, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 91
    invoke-virtual {v3, v0}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    .line 93
    :cond_0
    invoke-virtual {v3, v14}, Ll/۟ۢۜ;->ۧ(Ljava/lang/String;)V

    .line 94
    invoke-virtual {v2, v14}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 474
    new-instance v5, Ll/ۡۡۜ;

    invoke-direct {v5, v14, v4}, Ll/ۡۡۜ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3, v5}, Ll/ᩳۖۜ;->֫(Ll/ܶ᩵ܿ;Ll/ܽۖۜ;)V

    .line 96
    invoke-direct {v1, v3}, Ll/֡ۡۜ;->֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v5

    invoke-direct {v1, v5, v14}, Ll/֡ۡۜ;->֫(Ll/۫᩵ܿ;Ljava/lang/String;)V

    .line 97
    sget-object v5, Ll/۬᩵ܿ;->ۙ:Ll/۬᩵ܿ;

    const-string v15, "delete_directory"

    invoke-static {v3, v5, v4, v15}, Ll/֡ۡۜ;->֫(Ll/ܶ᩵ܿ;Ll/۬᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۙ᩵ܿ;

    .line 100
    invoke-virtual {v2}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v13

    .line 101
    iget-object v3, v13, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    .line 105
    :cond_1
    invoke-virtual {v2, v14}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 474
    new-instance v4, Ll/ۡۡۜ;

    invoke-direct {v4, v14, v3}, Ll/ۡۡۜ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v0, v4}, Ll/ᩳۖۜ;->֫(Ll/ܶ᩵ܿ;Ll/ܽۖۜ;)V

    .line 107
    invoke-direct {v1, v0}, Ll/֡ۡۜ;->֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v2

    invoke-direct {v1, v2, v14}, Ll/֡ۡۜ;->֫(Ll/۫᩵ܿ;Ljava/lang/String;)V

    .line 115
    invoke-static {v0, v5, v3, v15}, Ll/֡ۡۜ;->֫(Ll/ܶ᩵ܿ;Ll/۬᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۙ᩵ܿ;

    move-result-object v2

    .line 665
    sget-object v3, Ll/ۙ᩵ܿ;->᩹:Ll/ۙ᩵ܿ;

    if-ne v2, v3, :cond_2

    const-string v3, "atomic"

    goto :goto_1

    :cond_2
    const-string v3, "best_effort"

    :goto_1
    move-object/from16 v16, v3

    .line 119
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v12

    const/4 v3, 0x0

    .line 125
    :try_start_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۤ᩵ܿ;->ᩳ()V
    :try_end_0
    .catch Ll/᩹᩵ܿ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 129
    sget-object v4, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    invoke-direct {v1, v14, v4, v2}, Ll/֡ۡۜ;->֫(Ljava/lang/String;Ll/ۗ᩵ܿ;Ll/ۙ᩵ܿ;)Ll/ۘۡۜ;

    move-result-object v2

    .line 131
    iget-boolean v4, v2, Ll/ۘۡۜ;->֫:Z

    if-eqz v4, :cond_3

    const-string v0, "The backend reported an error after the directory disappeared."

    .line 133
    invoke-static {v12, v0}, Ll/֡ۡۜ;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;)V

    :goto_2
    const/4 v0, 0x1

    const/4 v2, 0x1

    move-object v2, v3

    move-object/from16 v19, v12

    move-object/from16 v17, v15

    const/4 v6, 0x1

    move-object v15, v13

    const/4 v13, 0x1

    goto :goto_3

    .line 136
    :cond_3
    iget-boolean v11, v2, Ll/ۘۡۜ;->ۧ:Z

    .line 137
    iget-boolean v10, v2, Ll/ۘۡۜ;->ܽ:Z

    .line 138
    invoke-direct {v1, v0}, Ll/֡ۡۜ;->֫(Ll/᩹᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object v2

    iget-object v4, v13, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const/4 v0, 0x0

    const-string v17, "delete_directory"

    const/4 v9, 0x0

    move-object/from16 v3, p1

    move-object/from16 v5, v16

    move v6, v11

    move v7, v10

    move-object v8, v12

    move/from16 v18, v10

    move v10, v0

    move v0, v11

    move-object/from16 v11, p1

    move-object/from16 v19, v12

    move-object/from16 v12, v17

    move-object/from16 v17, v15

    move-object v15, v13

    move/from16 v13, v18

    invoke-static/range {v2 .. v13}, Ll/֡ۡۜ;->֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLbin/mt/json/JSONArray;IILjava/lang/String;Ljava/lang/String;Z)Ll/ۗۛ᩻;

    move-result-object v2

    move v6, v0

    :goto_3
    if-nez v6, :cond_5

    if-nez v13, :cond_4

    goto :goto_5

    :cond_4
    :goto_4
    move-object/from16 v8, v19

    goto :goto_6

    .line 658
    :cond_5
    :goto_5
    :try_start_1
    iget-object v0, v1, Ll/֡ۡۜ;->֫:Ll/᩶۫᩷;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    invoke-static {}, Ll/ᩳ۬᩻;->֫()Ll/ᩳ۬᩻;

    .line 27
    invoke-static/range {p1 .. p1}, Ll/ܳۤܳ;->ܿ(Ljava/lang/String;)V

    .line 31
    invoke-static {}, Ll/ܽ۬᩻;->֫()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_4

    :catch_1
    const-string v0, "Directory change notification could not be completed."

    move-object/from16 v8, v19

    .line 660
    invoke-static {v8, v0}, Ll/֡ۡۜ;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;)V

    :goto_6
    if-nez v2, :cond_6

    .line 150
    new-instance v0, Ll/᩵ۡۜ;

    new-instance v2, Lbin/mt/json/JSONArray;

    invoke-direct {v2, v8}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    const/4 v3, 0x0

    .line 151
    invoke-direct {v0, v3, v6, v2, v14}, Ll/᩵ۡۜ;-><init>(IILbin/mt/json/JSONArray;Ljava/lang/String;)V

    return-object v0

    .line 146
    :cond_6
    iget-object v4, v15, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v0, "operation"

    move-object/from16 v3, v17

    .line 676
    invoke-static {v2, v0, v3}, Ll/֡ۡۜ;->֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v3, p1

    move-object/from16 v5, v16

    move v7, v13

    move-object/from16 v11, p1

    .line 146
    invoke-static/range {v2 .. v13}, Ll/֡ۡۜ;->֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLbin/mt/json/JSONArray;IILjava/lang/String;Ljava/lang/String;Z)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method

.method private ֫(Ll/ܶ᩵ܿ;Ll/۟ۢۜ;Ljava/lang/String;)Ll/᩵ۡۜ;
    .locals 24

    move-object/from16 v9, p0

    move-object/from16 v10, p2

    move-object/from16 v8, p3

    .line 216
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v7

    .line 217
    new-instance v6, Ll/ᩴۡۜ;

    .line 765
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    const/4 v5, 0x1

    .line 770
    iput-boolean v5, v6, Ll/ᩴۡۜ;->ܳ:Z

    .line 219
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 220
    new-instance v1, Ll/ۖۡۜ;

    move-object/from16 v2, p1

    invoke-direct {v1, v2}, Ll/ۖۡۜ;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 222
    :cond_0
    :goto_0
    :try_start_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    .line 223
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖۡۜ;

    .line 224
    iget-boolean v2, v1, Ll/ۖۡۜ;->ᩳ:Z
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_6

    if-nez v2, :cond_1

    .line 225
    :try_start_1
    invoke-direct {v9, v1, v8, v10, v6}, Ll/֡ۡۜ;->֫(Ll/ۖۡۜ;Ljava/lang/String;Ll/۟ۢۜ;Ll/ᩴۡۜ;)V

    .line 226
    iget-boolean v1, v1, Ll/ۖۡۜ;->ᩳ:Z

    if-nez v1, :cond_0

    .line 227
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;
    :try_end_1
    .catch Ll/ۗۛ᩻; {:try_start_1 .. :try_end_1} :catch_3

    goto :goto_0

    :goto_1
    move-object/from16 v23, v8

    move-object v8, v7

    move-object/from16 v7, v23

    goto/16 :goto_4

    .line 231
    :cond_1
    :try_start_2
    iget v2, v1, Ll/ۖۡۜ;->ܽ:I

    iget-object v3, v1, Ll/ۖۡۜ;->֫:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3
    :try_end_2
    .catch Ll/ۗۛ᩻; {:try_start_2 .. :try_end_2} :catch_6

    if-ge v2, v3, :cond_5

    .line 232
    :try_start_3
    iget-object v2, v1, Ll/ۖۡۜ;->֫:Ljava/util/List;

    iget v3, v1, Ll/ۖۡۜ;->ܽ:I

    add-int/lit8 v4, v3, 0x1

    iput v4, v1, Ll/ۖۡۜ;->ܽ:I

    .line 233
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۫᩵ܿ;

    iget-object v3, v10, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    .line 232
    invoke-static {v1, v2, v8, v3}, Ll/֡ۡۜ;->ۧ(Ll/ۖۡۜ;Ll/۫᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 235
    invoke-virtual {v10, v15}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    .line 236
    invoke-virtual {v10, v15}, Ll/۟ۢۜ;->ۧ(Ljava/lang/String;)V

    .line 238
    iget-object v2, v1, Ll/ۖۡۜ;->֫:Ljava/util/List;

    iget v1, v1, Ll/ۖۡۜ;->ܽ:I

    sub-int/2addr v1, v5

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫᩵ܿ;

    invoke-virtual {v1}, Ll/۫᩵ܿ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v4
    :try_end_3
    .catch Ll/ۗۛ᩻; {:try_start_3 .. :try_end_3} :catch_3

    .line 241
    :try_start_4
    invoke-direct {v9, v4}, Ll/֡ۡۜ;->֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v1
    :try_end_4
    .catch Ll/ۗۛ᩻; {:try_start_4 .. :try_end_4} :catch_1

    .line 248
    :try_start_5
    sget-object v2, Ll/ܺۡۜ;->֫:[I

    invoke-virtual {v1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x2

    if-eq v2, v3, :cond_4

    const/4 v3, 0x3

    if-eq v2, v3, :cond_3

    const/4 v3, 0x4

    if-eq v2, v3, :cond_3

    const/4 v3, 0x5

    if-eq v2, v3, :cond_2

    move-object v15, v6

    const/4 v11, 0x1

    move-object/from16 v23, v8

    move-object v8, v7

    move-object/from16 v7, v23

    goto/16 :goto_5

    .line 260
    :cond_2
    invoke-virtual {v1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v0

    .line 259
    invoke-direct {v9, v15, v0}, Ll/֡ۡۜ;->֫(Ljava/lang/String;Ll/ۗ᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object v11

    iget-object v13, v10, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v16, "delete_file"

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v17, 0x1

    move-object/from16 v12, p3

    move-object v14, v6

    move-object/from16 v19, v7

    .line 550
    invoke-static/range {v11 .. v20}, Ll/֡ۡۜ;->֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۡۜ;Ljava/lang/String;Ljava/lang/String;ZZLbin/mt/json/JSONArray;Z)Ll/ۗۛ᩻;

    move-result-object v0

    .line 259
    throw v0
    :try_end_5
    .catch Ll/ۗۛ᩻; {:try_start_5 .. :try_end_5} :catch_3

    .line 255
    :cond_3
    :try_start_6
    invoke-virtual {v1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v11
    :try_end_6
    .catch Ll/ۗۛ᩻; {:try_start_6 .. :try_end_6} :catch_0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object v3, v15

    const/4 v14, 0x1

    move-object v5, v11

    move-object v13, v6

    move-object/from16 v6, p2

    move-object v12, v7

    move-object v7, v13

    move-object v11, v8

    move-object v8, v12

    :try_start_7
    invoke-direct/range {v1 .. v8}, Ll/֡ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ܶ᩵ܿ;Ll/ۗ᩵ܿ;Ll/۟ۢۜ;Ll/ᩴۡۜ;Lbin/mt/json/JSONArray;)V

    goto :goto_2

    :catch_0
    move-exception v0

    move-object v13, v6

    move-object v12, v7

    move-object v11, v8

    const/4 v14, 0x1

    goto :goto_3

    :cond_4
    move-object v13, v6

    move-object v12, v7

    move-object v11, v8

    const/4 v14, 0x1

    .line 252
    new-instance v1, Ll/ۖۡۜ;

    invoke-direct {v1, v4}, Ll/ۖۡۜ;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    :goto_2
    move-object v7, v11

    move-object v8, v12

    move-object v15, v13

    const/4 v11, 0x1

    goto :goto_5

    :catch_1
    move-exception v0

    move-object v13, v6

    move-object v12, v7

    move-object v11, v8

    const/4 v14, 0x1

    move-object v1, v0

    .line 244
    iget-object v0, v10, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v16, "stat_entry"

    .line 245
    invoke-static {v13}, Ll/ᩴۡۜ;->֫(Ll/ᩴۡۜ;)Z

    move-result v2
    :try_end_7
    .catch Ll/ۗۛ᩻; {:try_start_7 .. :try_end_7} :catch_2

    xor-int/lit8 v17, v2, 0x1

    const/16 v18, 0x1

    const/16 v20, 0x0

    move-object v7, v11

    move-object v11, v1

    move-object v8, v12

    move-object/from16 v12, p3

    move-object v6, v13

    move-object v13, v0

    const/4 v5, 0x1

    move-object v14, v6

    move-object/from16 v19, v8

    .line 550
    :try_start_8
    invoke-static/range {v11 .. v20}, Ll/֡ۡۜ;->֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۡۜ;Ljava/lang/String;Ljava/lang/String;ZZLbin/mt/json/JSONArray;Z)Ll/ۗۛ᩻;

    move-result-object v0

    .line 244
    throw v0

    :catch_2
    move-exception v0

    :goto_3
    move-object v7, v11

    move-object v8, v12

    move-object v6, v13

    const/4 v5, 0x1

    goto :goto_4

    :catch_3
    move-exception v0

    goto/16 :goto_1

    :goto_4
    move-object v15, v6

    const/4 v11, 0x1

    goto :goto_6

    :cond_5
    move-object/from16 v23, v8

    move-object v8, v7

    move-object/from16 v7, v23

    .line 265
    iget-object v3, v1, Ll/ۖۡۜ;->ۧ:Ll/ܶ᩵ܿ;
    :try_end_8
    .catch Ll/ۗۛ᩻; {:try_start_8 .. :try_end_8} :catch_5

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v4, p2

    const/4 v11, 0x1

    move-object v5, v6

    move-object v15, v6

    move-object v6, v8

    :try_start_9
    invoke-direct/range {v1 .. v6}, Ll/֡ۡۜ;->֫(Ljava/lang/String;Ll/ܶ᩵ܿ;Ll/۟ۢۜ;Ll/ᩴۡۜ;Lbin/mt/json/JSONArray;)V

    .line 266
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;
    :try_end_9
    .catch Ll/ۗۛ᩻; {:try_start_9 .. :try_end_9} :catch_4

    :goto_5
    move-object v6, v15

    const/4 v5, 0x1

    move-object/from16 v23, v8

    move-object v8, v7

    move-object/from16 v7, v23

    goto/16 :goto_0

    :catch_4
    move-exception v0

    goto :goto_6

    :catch_5
    move-exception v0

    goto :goto_4

    :cond_6
    move-object v15, v6

    move-object/from16 v23, v8

    move-object v8, v7

    move-object/from16 v7, v23

    const/4 v0, 0x0

    move-object/from16 p1, v15

    goto :goto_7

    :catch_6
    move-exception v0

    move-object v15, v6

    const/4 v11, 0x1

    move-object/from16 v23, v8

    move-object v8, v7

    move-object/from16 v7, v23

    .line 269
    :goto_6
    iget-object v13, v10, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    .line 574
    iget-object v1, v15, Ll/ᩴۡۜ;->ܽ:Ljava/lang/String;

    if-nez v1, :cond_7

    const-string v1, "path"

    .line 575
    invoke-static {v0, v1, v7}, Ll/֡ۡۜ;->֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v15, Ll/ᩴۡۜ;->ܽ:Ljava/lang/String;

    const-string v1, "delete_tree"

    const-string v2, "operation"

    .line 676
    invoke-static {v0, v2, v1}, Ll/֡ۡۜ;->֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 576
    iput-object v1, v15, Ll/ᩴۡۜ;->ᩳ:Ljava/lang/String;

    .line 577
    iput-boolean v11, v15, Ll/ᩴۡۜ;->ܳ:Z

    const/4 v1, 0x0

    .line 578
    iput-boolean v1, v15, Ll/ᩴۡۜ;->ܿ:Z

    .line 581
    :cond_7
    invoke-static {v15}, Ll/ᩴۡۜ;->֫(Ll/ᩴۡۜ;)Z

    move-result v1

    iget-boolean v2, v15, Ll/ᩴۡۜ;->ܳ:Z

    iget v3, v15, Ll/ᩴۡۜ;->ۧ:I

    iget v4, v15, Ll/ᩴۡۜ;->֫:I

    iget-object v5, v15, Ll/ᩴۡۜ;->ܽ:Ljava/lang/String;

    iget-object v6, v15, Ll/ᩴۡۜ;->ᩳ:Ljava/lang/String;

    iget-boolean v14, v15, Ll/ᩴۡۜ;->ܿ:Z

    const-string v16, "non_atomic"

    move-object v11, v0

    move-object/from16 v12, p3

    move v0, v14

    move-object/from16 v14, v16

    move-object/from16 p1, v15

    move v15, v1

    move/from16 v16, v2

    move-object/from16 v17, v8

    move/from16 v18, v3

    move/from16 v19, v4

    move-object/from16 v20, v5

    move-object/from16 v21, v6

    move/from16 v22, v0

    .line 580
    invoke-static/range {v11 .. v22}, Ll/֡ۡۜ;->֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLbin/mt/json/JSONArray;IILjava/lang/String;Ljava/lang/String;Z)Ll/ۗۛ᩻;

    move-result-object v0

    .line 273
    :goto_7
    invoke-static/range {p1 .. p1}, Ll/ᩴۡۜ;->֫(Ll/ᩴۡۜ;)Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_8

    .line 658
    :cond_8
    :try_start_a
    iget-object v1, v9, Ll/֡ۡۜ;->֫:Ll/᩶۫᩷;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    invoke-static {}, Ll/ᩳ۬᩻;->֫()Ll/ᩳ۬᩻;

    .line 27
    invoke-static/range {p3 .. p3}, Ll/ܳۤܳ;->ܿ(Ljava/lang/String;)V

    .line 31
    invoke-static {}, Ll/ܽ۬᩻;->֫()V
    :try_end_a
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_7

    goto :goto_8

    :catch_7
    const-string v1, "Directory change notification could not be completed."

    .line 660
    invoke-static {v8, v1}, Ll/֡ۡۜ;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;)V

    :goto_8
    if-nez v0, :cond_9

    .line 281
    new-instance v0, Ll/᩵ۡۜ;

    new-instance v1, Lbin/mt/json/JSONArray;

    invoke-direct {v1, v8}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    move-object/from16 v2, p1

    iget v3, v2, Ll/ᩴۡۜ;->ۧ:I

    iget v2, v2, Ll/ᩴۡۜ;->֫:I

    invoke-direct {v0, v3, v2, v1, v7}, Ll/᩵ۡۜ;-><init>(IILbin/mt/json/JSONArray;Ljava/lang/String;)V

    return-object v0

    :cond_9
    move-object/from16 v2, p1

    .line 275
    iget-object v12, v10, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    .line 276
    invoke-static {v2}, Ll/ᩴۡۜ;->֫(Ll/ᩴۡۜ;)Z

    move-result v14

    iget-boolean v15, v2, Ll/ᩴۡۜ;->ܳ:Z

    iget v1, v2, Ll/ᩴۡۜ;->ۧ:I

    iget v3, v2, Ll/ᩴۡۜ;->֫:I

    iget-object v4, v2, Ll/ᩴۡۜ;->ܽ:Ljava/lang/String;

    iget-object v5, v2, Ll/ᩴۡۜ;->ᩳ:Ljava/lang/String;

    iget-boolean v2, v2, Ll/ᩴۡۜ;->ܿ:Z

    const-string v13, "non_atomic"

    move-object v10, v0

    move-object/from16 v11, p3

    move-object/from16 v16, v8

    move/from16 v17, v1

    move/from16 v18, v3

    move-object/from16 v19, v4

    move-object/from16 v20, v5

    move/from16 v21, v2

    .line 275
    invoke-static/range {v10 .. v21}, Ll/֡ۡۜ;->֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLbin/mt/json/JSONArray;IILjava/lang/String;Ljava/lang/String;Z)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method

.method public static ֫(Lbin/mt/json/JSONArray;Ljava/lang/String;)V
    .locals 3

    .line 688
    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbin/mt/json/JSONValue;

    .line 689
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 693
    :cond_1
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    return-void
.end method

.method private ֫(Ljava/lang/String;Ljava/lang/String;Ll/ܶ᩵ܿ;Ll/ۗ᩵ܿ;Ll/۟ۢۜ;Ll/ᩴۡۜ;Lbin/mt/json/JSONArray;)V
    .locals 12

    move-object v1, p0

    move-object/from16 v2, p5

    move-object/from16 v5, p6

    .line 328
    sget-object v0, Ll/۬᩵ܿ;->ۗ:Ll/۬᩵ܿ;

    iget-object v3, v2, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v4, "delete_file"

    move-object v6, p3

    invoke-static {p3, v0, v3, v4}, Ll/֡ۡۜ;->֫(Ll/ܶ᩵ܿ;Ll/۬᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۙ᩵ܿ;

    move-result-object v3

    .line 333
    :try_start_0
    invoke-virtual {p3}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۤ᩵ܿ;->ܿ()V
    :try_end_0
    .catch Ll/᩹᩵ܿ; {:try_start_0 .. :try_end_0} :catch_0

    .line 347
    iget v0, v5, Ll/ᩴۡۜ;->ۧ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v5, Ll/ᩴۡۜ;->ۧ:I

    return-void

    :catch_0
    move-exception v0

    move-object v6, p2

    move-object/from16 v4, p4

    .line 335
    invoke-direct {p0, p2, v4, v3}, Ll/֡ۡۜ;->֫(Ljava/lang/String;Ll/ۗ᩵ܿ;Ll/ۙ᩵ܿ;)Ll/ۘۡۜ;

    move-result-object v3

    .line 336
    iget-boolean v4, v3, Ll/ۘۡۜ;->֫:Z

    if-eqz v4, :cond_0

    .line 337
    iget v0, v5, Ll/ᩴۡۜ;->ۧ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v5, Ll/ᩴۡۜ;->ۧ:I

    const-string v0, "The backend reported an error after a file or link disappeared."

    move-object/from16 v10, p7

    .line 338
    invoke-static {v10, v0}, Ll/֡ۡۜ;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;)V

    return-void

    :cond_0
    move-object/from16 v10, p7

    .line 342
    invoke-direct {p0, v0}, Ll/֡ۡۜ;->֫(Ll/᩹᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object v0

    iget-object v4, v2, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    iget-boolean v9, v3, Ll/ۘۡۜ;->ܽ:Z

    iget-boolean v11, v3, Ll/ۘۡۜ;->ۧ:Z

    const-string v7, "delete_file"

    move-object v2, v0

    move-object v3, p1

    move-object/from16 v5, p6

    move-object v6, p2

    move v8, v9

    invoke-static/range {v2 .. v11}, Ll/֡ۡۜ;->֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۡۜ;Ljava/lang/String;Ljava/lang/String;ZZLbin/mt/json/JSONArray;Z)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method

.method private ֫(Ljava/lang/String;Ll/ܶ᩵ܿ;Ll/۟ۢۜ;Ll/ᩴۡۜ;Lbin/mt/json/JSONArray;)V
    .locals 10

    .line 354
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v4

    .line 357
    :try_start_0
    invoke-direct {p0, p2}, Ll/֡ۡۜ;->֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v0
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_1

    .line 363
    invoke-virtual {v0}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v1

    sget-object v2, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    if-ne v1, v2, :cond_0

    return-void

    .line 366
    :cond_0
    invoke-virtual {v0}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v1

    sget-object v2, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    if-ne v1, v2, :cond_2

    .line 371
    sget-object v0, Ll/۬᩵ܿ;->ۙ:Ll/۬᩵ܿ;

    iget-object v1, p3, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v2, "delete_directory"

    invoke-static {p2, v0, v1, v2}, Ll/֡ۡۜ;->֫(Ll/ܶ᩵ܿ;Ll/۬᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۙ᩵ܿ;

    move-result-object v0

    .line 376
    :try_start_1
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۤ᩵ܿ;->ᩳ()V
    :try_end_1
    .catch Ll/᩹᩵ܿ; {:try_start_1 .. :try_end_1} :catch_0

    .line 391
    iget p1, p4, Ll/ᩴۡۜ;->֫:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p4, Ll/ᩴۡۜ;->֫:I

    return-void

    :catch_0
    move-exception p2

    .line 378
    sget-object v1, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    invoke-direct {p0, v4, v1, v0}, Ll/֡ۡۜ;->֫(Ljava/lang/String;Ll/ۗ᩵ܿ;Ll/ۙ᩵ܿ;)Ll/ۘۡۜ;

    move-result-object v0

    .line 380
    iget-boolean v1, v0, Ll/ۘۡۜ;->֫:Z

    if-eqz v1, :cond_1

    .line 381
    iget p1, p4, Ll/ᩴۡۜ;->֫:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p4, Ll/ᩴۡۜ;->֫:I

    const-string p1, "The backend reported an error after a directory disappeared."

    .line 382
    invoke-static {p5, p1}, Ll/֡ۡۜ;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;)V

    return-void

    .line 386
    :cond_1
    invoke-direct {p0, p2}, Ll/֡ۡۜ;->֫(Ll/᩹᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object p2

    iget-object v2, p3, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    iget-boolean v7, v0, Ll/ۘۡۜ;->ܽ:Z

    iget-boolean v9, v0, Ll/ۘۡۜ;->ۧ:Z

    const-string v5, "delete_directory"

    move-object v0, p2

    move-object v1, p1

    move-object v3, p4

    move v6, v7

    move-object v8, p5

    invoke-static/range {v0 .. v9}, Ll/֡ۡۜ;->֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۡۜ;Ljava/lang/String;Ljava/lang/String;ZZLbin/mt/json/JSONArray;Z)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    .line 367
    :cond_2
    invoke-virtual {v0}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object p2

    invoke-direct {p0, v4, p2}, Ll/֡ۡۜ;->֫(Ljava/lang/String;Ll/ۗ᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object v0

    iget-object v2, p3, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const/4 v7, 0x0

    const/4 v9, 0x0

    const-string v5, "delete_directory"

    const/4 v6, 0x1

    move-object v1, p1

    move-object v3, p4

    move-object v8, p5

    .line 550
    invoke-static/range {v0 .. v9}, Ll/֡ۡۜ;->֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۡۜ;Ljava/lang/String;Ljava/lang/String;ZZLbin/mt/json/JSONArray;Z)Ll/ۗۛ᩻;

    move-result-object p1

    .line 367
    throw p1

    :catch_1
    move-exception v0

    .line 359
    iget-object v2, p3, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    .line 360
    invoke-static {p4}, Ll/ᩴۡۜ;->֫(Ll/ᩴۡۜ;)Z

    move-result p2

    xor-int/lit8 v6, p2, 0x1

    const/4 v7, 0x1

    const/4 v9, 0x0

    const-string v5, "stat_directory"

    move-object v1, p1

    move-object v3, p4

    move-object v8, p5

    .line 550
    invoke-static/range {v0 .. v9}, Ll/֡ۡۜ;->֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۡۜ;Ljava/lang/String;Ljava/lang/String;ZZLbin/mt/json/JSONArray;Z)Ll/ۗۛ᩻;

    move-result-object p1

    .line 359
    throw p1
.end method

.method private ֫(Ll/ۖۡۜ;Ljava/lang/String;Ll/۟ۢۜ;Ll/ᩴۡۜ;)V
    .locals 11

    .line 290
    iget-object v0, p1, Ll/ۖۡۜ;->ۧ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v5

    .line 291
    invoke-virtual {p3, v5}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    iget-object v1, p3, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    .line 292
    invoke-virtual {p3, v5}, Ll/۟ۢۜ;->ۧ(Ljava/lang/String;)V

    .line 295
    :try_start_0
    invoke-direct {p0, v0}, Ll/֡ۡۜ;->֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v2
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_2

    .line 300
    invoke-virtual {v2}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v3

    sget-object v4, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    iget-object v6, p0, Ll/֡ۡۜ;->ۧ:Ll/ᩳۖۜ;

    if-ne v3, v4, :cond_2

    .line 301
    invoke-virtual {v5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget p1, p4, Ll/ᩴۡۜ;->֫:I

    if-nez p1, :cond_1

    iget p1, p4, Ll/ᩴۡۜ;->ۧ:I

    if-eqz p1, :cond_0

    goto :goto_0

    .line 303
    :cond_0
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2}, Ll/ᩳۖۜ;->ܿ(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    return-void

    .line 307
    :cond_2
    invoke-virtual {v2}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v3

    sget-object v4, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    if-ne v3, v4, :cond_3

    .line 312
    sget-object v2, Ll/۬᩵ܿ;->ۙ:Ll/۬᩵ܿ;

    const-string v3, "delete_directory"

    invoke-static {v0, v2, v1, v3}, Ll/֡ۡۜ;->֫(Ll/ܶ᩵ܿ;Ll/۬᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۙ᩵ܿ;

    .line 415
    :try_start_1
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Ll/ۗۛ᩻; {:try_start_1 .. :try_end_1} :catch_1

    .line 154
    :try_start_2
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۤ᩵ܿ;->᩻()Ljava/util/List;

    move-result-object v0
    :try_end_2
    .catch Ll/᩹᩵ܿ; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ll/ۗۛ᩻; {:try_start_2 .. :try_end_2} :catch_1

    .line 316
    :try_start_3
    invoke-static {p1, v0, p2, v1}, Ll/ۖۡۜ;->֫(Ll/ۖۡۜ;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :catch_0
    move-exception p1

    .line 156
    invoke-static {p1}, Ll/ᩳۖۜ;->֫(Ll/᩹᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
    :try_end_3
    .catch Ll/ۗۛ᩻; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    move-exception p1

    move-object v1, p1

    .line 318
    iget-object v3, p3, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    .line 319
    invoke-static {p4}, Ll/ᩴۡۜ;->֫(Ll/ᩴۡۜ;)Z

    move-result p1

    xor-int/lit8 v7, p1, 0x1

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v9

    const/4 v10, 0x0

    const-string v6, "list_directory"

    const/4 v8, 0x1

    move-object v2, p2

    move-object v4, p4

    .line 550
    invoke-static/range {v1 .. v10}, Ll/֡ۡۜ;->֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۡۜ;Ljava/lang/String;Ljava/lang/String;ZZLbin/mt/json/JSONArray;Z)Ll/ۗۛ᩻;

    move-result-object p1

    .line 318
    throw p1

    .line 308
    :cond_3
    invoke-virtual {v2}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object p1

    invoke-direct {p0, v5, p1}, Ll/֡ۡۜ;->֫(Ljava/lang/String;Ll/ۗ᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object v1

    iget-object v3, p3, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    .line 310
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v9

    const/4 v10, 0x0

    const-string v6, "stat_directory"

    const/4 v7, 0x1

    const/4 v8, 0x0

    move-object v2, p2

    move-object v4, p4

    .line 550
    invoke-static/range {v1 .. v10}, Ll/֡ۡۜ;->֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۡۜ;Ljava/lang/String;Ljava/lang/String;ZZLbin/mt/json/JSONArray;Z)Ll/ۗۛ᩻;

    move-result-object p1

    .line 308
    throw p1

    :catch_2
    move-exception v1

    .line 297
    iget-object v3, p3, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    .line 298
    invoke-static {p4}, Ll/ᩴۡۜ;->֫(Ll/ᩴۡۜ;)Z

    move-result p1

    xor-int/lit8 v7, p1, 0x1

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v9

    const/4 v10, 0x0

    const-string v6, "stat_directory"

    const/4 v8, 0x1

    move-object v2, p2

    move-object v4, p4

    .line 550
    invoke-static/range {v1 .. v10}, Ll/֡ۡۜ;->֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۡۜ;Ljava/lang/String;Ljava/lang/String;ZZLbin/mt/json/JSONArray;Z)Ll/ۗۛ᩻;

    move-result-object p1

    .line 297
    throw p1
.end method

.method private ֫(Ll/۫᩵ܿ;Ljava/lang/String;)V
    .locals 3

    .line 421
    sget-object v0, Ll/ܺۡۜ;->֫:[I

    invoke-virtual {p1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Ll/֡ۡۜ;->ۧ:Ll/ᩳۖۜ;

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    const-string v0, "FILE_UNSUPPORTED_TYPE"

    const-string v1, "Special nodes cannot be deleted by general directory tools."

    .line 0
    invoke-static {p1, v2, v0, v1, p2}, Ll/᩶᩵ᩳ;->֫(Ll/۫᩵ܿ;Ll/ᩳۖۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 435
    throw p1

    :cond_1
    const-string v0, "FILE_IS_SYMLINK"

    const-string v1, "Symbolic links are not accepted as directory delete roots."

    .line 0
    invoke-static {p1, v2, v0, v1, p2}, Ll/᩶᩵ᩳ;->֫(Ll/۫᩵ܿ;Ll/ᩳۖۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 427
    throw p1

    :cond_2
    const-string v0, "FILE_NOT_DIRECTORY"

    const-string v1, "The requested delete root is not a directory."

    .line 0
    invoke-static {p1, v2, v0, v1, p2}, Ll/᩶᩵ᩳ;->֫(Ll/۫᩵ܿ;Ll/ᩳۖۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 431
    throw p1

    .line 425
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2}, Ll/ᩳۖۜ;->ܿ(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method

.method public static ۧ(Ll/ۖۡۜ;Ll/۫᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 495
    invoke-virtual {p1}, Ll/۫᩵ܿ;->֫()Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v8

    :try_start_0
    const-string p1, "path"

    .line 498
    invoke-static {v8, p1}, Ll/۫ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_0

    .line 502
    invoke-virtual {p1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "/"

    .line 680
    invoke-virtual {p1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x2f

    .line 683
    invoke-virtual {v8, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 684
    invoke-virtual {v8, p1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 503
    :goto_0
    iget-object p0, p0, Ll/ۖۡۜ;->ۧ:Ll/ܶ᩵ܿ;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    .line 504
    invoke-static {v8, p2}, Ll/۫ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2

    return-object v8

    .line 515
    :cond_2
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v7

    const-string v9, "list_directory"

    const-string v0, "FILE_STORAGE_ERROR"

    const-string v1, "The backend returned an invalid directory child identity."

    const-string v4, "list_directory"

    const-string v5, "invalid_child_path"

    const-string v6, "non_atomic"

    move-object v2, p2

    move-object v3, p3

    .line 512
    invoke-static/range {v0 .. v9}, Ll/֡ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 505
    throw p0

    .line 515
    :catch_0
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v7

    const-string v9, "list_directory"

    const-string v0, "FILE_STORAGE_ERROR"

    const-string v1, "The backend returned an invalid directory child identity."

    const-string v4, "list_directory"

    const-string v5, "invalid_child_path"

    const-string v6, "non_atomic"

    move-object v2, p2

    move-object v3, p3

    .line 512
    invoke-static/range {v0 .. v9}, Ll/֡ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 500
    throw p0
.end method

.method private ۧ(Ll/ܶ᩵ܿ;Ll/۟ۢۜ;Ljava/lang/String;)V
    .locals 8

    .line 160
    iget-object v0, p2, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    .line 161
    new-instance v2, Ll/ۖۡۜ;

    invoke-direct {v2, p1}, Ll/ۖۡۜ;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 162
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_9

    .line 163
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖۡۜ;

    .line 164
    iget-boolean v2, p1, Ll/ۖۡۜ;->ᩳ:Z

    iget-object v3, p1, Ll/ۖۡۜ;->ۧ:Ll/ܶ᩵ܿ;

    if-nez v2, :cond_4

    .line 165
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    .line 166
    invoke-virtual {p2, v2}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    .line 167
    invoke-virtual {p2, v2}, Ll/۟ۢۜ;->ۧ(Ljava/lang/String;)V

    .line 168
    iget-object v4, p1, Ll/ۖۡۜ;->ܿ:Ll/۫᩵ܿ;

    if-eqz v4, :cond_0

    goto :goto_1

    .line 169
    :cond_0
    invoke-direct {p0, v3}, Ll/֡ۡۜ;->֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v4

    .line 170
    :goto_1
    invoke-virtual {v4}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v5

    sget-object v6, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    iget-object v7, p0, Ll/֡ۡۜ;->ۧ:Ll/ᩳۖۜ;

    if-ne v5, v6, :cond_2

    .line 171
    invoke-virtual {v2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 174
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    goto :goto_0

    .line 172
    :cond_1
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p3}, Ll/ᩳۖۜ;->ܿ(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    .line 177
    :cond_2
    invoke-virtual {v4}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v5

    sget-object v6, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    if-ne v5, v6, :cond_3

    .line 180
    sget-object v2, Ll/۬᩵ܿ;->ۙ:Ll/۬᩵ܿ;

    const-string v5, "preflight_delete_directory"

    invoke-static {v3, v2, v0, v5}, Ll/֡ۡۜ;->֫(Ll/ܶ᩵ܿ;Ll/۬᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۙ᩵ܿ;

    .line 183
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    :try_start_0
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v2

    invoke-virtual {v2, v4}, Ll/ۤ᩵ܿ;->֫(Ll/۫᩵ܿ;)Ljava/util/List;

    move-result-object v2
    :try_end_0
    .catch Ll/᩹᩵ܿ; {:try_start_0 .. :try_end_0} :catch_0

    .line 183
    invoke-static {p1, v2, p3, v0}, Ll/ۖۡۜ;->֫(Ll/ۖۡۜ;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception p1

    .line 166
    invoke-static {p1}, Ll/ᩳۖۜ;->֫(Ll/᩹᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    .line 178
    :cond_3
    invoke-virtual {v4}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object p1

    invoke-direct {p0, v2, p1}, Ll/֡ۡۜ;->֫(Ljava/lang/String;Ll/ۗ᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    .line 186
    :cond_4
    iget v2, p1, Ll/ۖۡۜ;->ܽ:I

    iget-object v3, p1, Ll/ۖۡۜ;->֫:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-lt v2, v3, :cond_5

    .line 187
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    goto :goto_0

    .line 190
    :cond_5
    iget-object v2, p1, Ll/ۖۡۜ;->֫:Ljava/util/List;

    iget v3, p1, Ll/ۖۡۜ;->ܽ:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p1, Ll/ۖۡۜ;->ܽ:I

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۫᩵ܿ;

    invoke-static {p1, v2, p3, v0}, Ll/֡ۡۜ;->ۧ(Ll/ۖۡۜ;Ll/۫᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 192
    invoke-virtual {p2, v2}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    .line 193
    invoke-virtual {p2, v2}, Ll/۟ۢۜ;->ۧ(Ljava/lang/String;)V

    .line 195
    iget-object v3, p1, Ll/ۖۡۜ;->֫:Ljava/util/List;

    iget p1, p1, Ll/ۖۡۜ;->ܽ:I

    add-int/lit8 p1, p1, -0x1

    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۫᩵ܿ;

    .line 196
    invoke-virtual {p1}, Ll/۫᩵ܿ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 197
    sget-object v4, Ll/ܺۡۜ;->֫:[I

    invoke-virtual {p1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v4, v4, v5

    const/4 v5, 0x2

    if-eq v4, v5, :cond_8

    const/4 v5, 0x3

    if-eq v4, v5, :cond_7

    const/4 v5, 0x4

    if-eq v4, v5, :cond_7

    const/4 v3, 0x5

    if-eq v4, v3, :cond_6

    goto/16 :goto_0

    .line 208
    :cond_6
    invoke-virtual {p1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object p1

    invoke-direct {p0, v2, p1}, Ll/֡ۡۜ;->֫(Ljava/lang/String;Ll/ۗ᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    .line 204
    :cond_7
    sget-object p1, Ll/۬᩵ܿ;->ۗ:Ll/۬᩵ܿ;

    const-string v2, "preflight_delete_file"

    invoke-static {v3, p1, v0, v2}, Ll/֡ۡۜ;->֫(Ll/ܶ᩵ܿ;Ll/۬᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/ۙ᩵ܿ;

    goto/16 :goto_0

    .line 201
    :cond_8
    new-instance v2, Ll/ۖۡۜ;

    const/4 v4, 0x0

    invoke-direct {v2, v3, p1, v4}, Ll/ۖۡۜ;-><init>(Ll/ܶ᩵ܿ;Ll/۫᩵ܿ;I)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_9
    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Z)Ll/᩵ۡۜ;
    .locals 6

    .line 44
    iget-object v0, p0, Ll/֡ۡۜ;->ۧ:Ll/ᩳۖۜ;

    invoke-virtual {v0}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v1

    const-string v2, "path"

    .line 45
    invoke-static {p1, v1, v2}, Ll/ᩳۖۜ;->ۧ(Ljava/lang/String;Ll/۟ۢۜ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 46
    invoke-virtual {v0, p1}, Ll/ᩳۖۜ;->ۧ(Ljava/lang/String;)Ll/ۤۖۜ;

    move-result-object v1

    .line 47
    :try_start_0
    invoke-virtual {v0, p1}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 48
    invoke-direct {p0, v2}, Ll/֡ۡۜ;->֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v3

    invoke-direct {p0, v3, p1}, Ll/֡ۡۜ;->֫(Ll/۫᩵ܿ;Ljava/lang/String;)V

    .line 49
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object v2

    if-nez p2, :cond_0

    .line 51
    invoke-direct {p0, p1, v2}, Ll/֡ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/᩵ۡۜ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    invoke-virtual {v1}, Ll/ۤۖۜ;->close()V

    return-object p1

    .line 54
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object p2

    .line 56
    :cond_1
    invoke-virtual {p2, p1}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v3, p2, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    if-eqz v2, :cond_2

    .line 58
    :try_start_2
    invoke-virtual {p2, v2}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    .line 60
    :cond_2
    invoke-virtual {p2, p1}, Ll/۟ۢۜ;->ۧ(Ljava/lang/String;)V

    .line 61
    invoke-virtual {v0, p1}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 474
    new-instance v5, Ll/ۡۡۜ;

    invoke-direct {v5, p1, v3}, Ll/ۡۡۜ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4, v5}, Ll/ᩳۖۜ;->֫(Ll/ܶ᩵ܿ;Ll/ܽۖۜ;)V

    .line 63
    invoke-direct {p0, v4}, Ll/֡ۡۜ;->֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v5

    invoke-direct {p0, v5, p1}, Ll/֡ۡۜ;->֫(Ll/۫᩵ܿ;Ljava/lang/String;)V

    .line 64
    invoke-direct {p0, v4, p2, p1}, Ll/֡ۡۜ;->ۧ(Ll/ܶ᩵ܿ;Ll/۟ۢۜ;Ljava/lang/String;)V

    .line 65
    invoke-virtual {v0}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object p2

    .line 66
    iget-object v4, p2, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 68
    invoke-virtual {p2, p1}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    if-eqz v2, :cond_3

    .line 70
    invoke-virtual {p2, v2}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    .line 72
    :cond_3
    invoke-virtual {p2, p1}, Ll/۟ۢۜ;->ۧ(Ljava/lang/String;)V

    .line 73
    invoke-virtual {v0, p1}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 74
    iget-object v3, p2, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    .line 474
    new-instance v4, Ll/ۡۡۜ;

    invoke-direct {v4, p1, v3}, Ll/ۡۡۜ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v2, v4}, Ll/ᩳۖۜ;->֫(Ll/ܶ᩵ܿ;Ll/ܽۖۜ;)V

    .line 75
    invoke-direct {p0, v2}, Ll/֡ۡۜ;->֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Ll/֡ۡۜ;->֫(Ll/۫᩵ܿ;Ljava/lang/String;)V

    .line 76
    invoke-direct {p0, v2, p2, p1}, Ll/֡ۡۜ;->֫(Ll/ܶ᩵ܿ;Ll/۟ۢۜ;Ljava/lang/String;)Ll/᩵ۡۜ;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 81
    invoke-virtual {v1}, Ll/ۤۖۜ;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    .line 46
    :try_start_3
    invoke-virtual {v1}, Ll/ۤۖۜ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method
