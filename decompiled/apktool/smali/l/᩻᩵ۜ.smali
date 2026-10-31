.class public final Ll/᩻᩵ۜ;
.super Ljava/lang/Object;
.source "W6LP"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public final ܳ:Lbin/mt/json/JSONArray;

.field public ܽ:Ll/ܿ᩵ۜ;

.field public final ܿ:Ljava/lang/String;

.field public ᩳ:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 456
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 450
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    iput-object v0, p0, Ll/᩻᩵ۜ;->ܳ:Lbin/mt/json/JSONArray;

    .line 457
    iput-object p1, p0, Ll/᩻᩵ۜ;->ܿ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Lbin/mt/json/JSONArray;)V
    .locals 4

    .line 461
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbin/mt/json/JSONValue;

    .line 463
    iget-object v1, p0, Ll/᩻᩵ۜ;->ܳ:Lbin/mt/json/JSONArray;

    invoke-virtual {v1}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbin/mt/json/JSONValue;

    .line 464
    invoke-virtual {v3, v0}, Lbin/mt/json/JSONValue;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    .line 469
    :cond_1
    invoke-virtual {v1, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ֫(Ll/ۗۛ᩻;)V
    .locals 11

    .line 474
    iget-object p1, p1, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string v0, "createdDirectories"

    .line 475
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    .line 476
    iget v2, p0, Ll/᩻᩵ۜ;->ۧ:I

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 477
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->asInt()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v2, v1

    const-string v1, "warnings"

    .line 478
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 479
    invoke-virtual {v4}, Lbin/mt/json/JSONValue;->isArray()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Lbin/mt/json/JSONValue;->asArray()Lbin/mt/json/JSONArray;

    move-result-object v4

    invoke-virtual {p0, v4}, Ll/᩻᩵ۜ;->֫(Lbin/mt/json/JSONArray;)V

    :cond_1
    const-string v4, "changed"

    .line 480
    invoke-virtual {p1, v4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v5

    const-string v6, "stateKnown"

    .line 481
    invoke-virtual {p1, v6}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v7

    const-string v8, "path"

    .line 482
    iget-object v9, p0, Ll/᩻᩵ۜ;->ܿ:Ljava/lang/String;

    invoke-virtual {p1, v8, v9}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "completedFiles"

    iget v10, p0, Ll/᩻᩵ۜ;->֫:I

    invoke-virtual {v8, v9, v10}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v8

    invoke-virtual {v8, v0, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget v8, p0, Ll/᩻᩵ۜ;->֫:I

    if-gtz v8, :cond_3

    if-gtz v2, :cond_3

    if-eqz v5, :cond_2

    .line 483
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v2, 0x1

    :goto_2
    invoke-virtual {v0, v4, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    if-eqz v7, :cond_4

    .line 484
    invoke-virtual {v7}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v7}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result v2

    if-eqz v2, :cond_5

    :cond_4
    const/4 v3, 0x1

    :cond_5
    invoke-virtual {v0, v6, v3}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "operationMode"

    const-string v3, "non_atomic"

    .line 485
    invoke-virtual {v0, v2, v3}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    new-instance v2, Lbin/mt/json/JSONArray;

    iget-object v3, p0, Ll/᩻᩵ۜ;->ܳ:Lbin/mt/json/JSONArray;

    invoke-direct {v2, v3}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    .line 486
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    const-string v0, "entryPaths"

    .line 487
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    if-nez v1, :cond_7

    .line 488
    iget-object v1, p0, Ll/᩻᩵ۜ;->ܽ:Ll/ܿ᩵ۜ;

    if-nez v1, :cond_6

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    goto :goto_3

    :cond_6
    invoke-static {v1}, Ll/ܿ᩵ۜ;->ᩳ(Ll/ܿ᩵ۜ;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    :goto_3
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    :cond_7
    const-string v0, "operationIndexes"

    .line 490
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    if-nez v1, :cond_9

    .line 491
    iget-object v1, p0, Ll/᩻᩵ۜ;->ܽ:Ll/ܿ᩵ۜ;

    if-nez v1, :cond_8

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    goto :goto_4

    :cond_8
    invoke-static {v1}, Ll/ܿ᩵ۜ;->ܿ(Ll/ܿ᩵ۜ;)I

    move-result v1

    filled-new-array {v1}, [I

    move-result-object v1

    invoke-static {v1}, Lbin/mt/json/JSON;->array([I)Lbin/mt/json/JSONArray;

    move-result-object v1

    :goto_4
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    :cond_9
    const-string v0, "destinationPath"

    .line 493
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    if-nez v1, :cond_b

    .line 494
    iget-object v1, p0, Ll/᩻᩵ۜ;->ܽ:Ll/ܿ᩵ۜ;

    if-nez v1, :cond_a

    sget-object v1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_5

    :cond_a
    invoke-static {v1}, Ll/ܿ᩵ۜ;->֫(Ll/ܿ᩵ۜ;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    :goto_5
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    :cond_b
    return-void
.end method
