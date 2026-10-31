.class public final Ll/֫᩸ܳ;
.super Ljava/lang/Object;
.source "17CG"


# static fields
.field public static final ֫:Ll/ۤ᩻ᩴ;

.field public static final ۧ:Ljava/util/ArrayList;

.field public static final ܽ:Ll/ۚۡ֫;

.field public static ܿ:I

.field public static final ᩳ:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    .line 32
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/֫᩸ܳ;->ᩳ:Ljava/lang/Object;

    .line 41
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sput-object v1, Ll/֫᩸ܳ;->ۧ:Ljava/util/ArrayList;

    .line 44
    new-instance v2, Ll/ۤ᩻ᩴ;

    invoke-direct {v2}, Ll/ۤ᩻ᩴ;-><init>()V

    sput-object v2, Ll/֫᩸ܳ;->֫:Ll/ۤ᩻ᩴ;

    .line 45
    new-instance v3, Ll/ۚۡ֫;

    invoke-direct {v3}, Ll/ۚۡ֫;-><init>()V

    sput-object v3, Ll/֫᩸ܳ;->ܽ:Ll/ۚۡ֫;

    const/4 v3, 0x1

    .line 46
    sput v3, Ll/֫᩸ܳ;->ܿ:I

    .line 628
    monitor-enter v0

    .line 629
    :try_start_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 630
    invoke-virtual {v2}, Ll/ۤ᩻ᩴ;->clear()V

    .line 631
    sput v3, Ll/֫᩸ܳ;->ܿ:I

    .line 632
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "ndg_data"

    const/4 v4, 0x0

    invoke-interface {v1, v2, v4}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 633
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    goto/16 :goto_2

    .line 637
    :cond_0
    :try_start_1
    new-instance v2, Lbin/mt/json/JSONObject;

    invoke-direct {v2, v1}, Lbin/mt/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v1, "nextId"

    .line 638
    invoke-virtual {v2, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    sput v1, Ll/֫᩸ܳ;->ܿ:I

    const-string v1, "groups"

    .line 639
    invoke-virtual {v2, v1}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    const/4 v4, 0x0

    .line 640
    :goto_0
    invoke-virtual {v1}, Lbin/mt/json/JSONArray;->size()I

    move-result v5

    if-ge v4, v5, :cond_1

    .line 641
    invoke-virtual {v1, v4}, Lbin/mt/json/JSONArray;->getJSONObject(I)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 642
    sget-object v6, Ll/֫᩸ܳ;->ۧ:Ljava/util/ArrayList;

    new-instance v7, Ll/ܰܶܳ;

    const-string v8, "id"

    invoke-virtual {v5, v8}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v8

    const-string v9, "name"

    invoke-virtual {v5, v9}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v7, v8, v5}, Ll/ܰܶܳ;-><init>(ILjava/lang/String;)V

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const-string v1, "assignments"

    .line 644
    invoke-virtual {v2, v1}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "assignments"

    .line 645
    invoke-virtual {v2, v1}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 646
    invoke-virtual {v1}, Lbin/mt/json/JSONObject;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbin/mt/json/JSONObject$Member;

    .line 647
    sget-object v4, Ll/֫᩸ܳ;->֫:Ll/ۤ᩻ᩴ;

    invoke-virtual {v2}, Lbin/mt/json/JSONObject$Member;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v2}, Lbin/mt/json/JSONObject$Member;->getValue()Lbin/mt/json/JSONValue;

    move-result-object v2

    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->asInt()I

    move-result v2

    invoke-virtual {v4, v5, v2}, Ll/ۤ᩻ᩴ;->֫(II)I
    :try_end_1
    .catch Lbin/mt/json/JSONParseException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 651
    :catch_0
    :try_start_2
    sget-object v1, Ll/֫᩸ܳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 652
    sget-object v1, Ll/֫᩸ܳ;->֫:Ll/ۤ᩻ᩴ;

    invoke-virtual {v1}, Ll/ۤ᩻ᩴ;->clear()V

    .line 653
    sput v3, Ll/֫᩸ܳ;->ܿ:I

    .line 655
    :cond_2
    monitor-exit v0

    goto :goto_3

    .line 634
    :cond_3
    :goto_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 50
    :goto_3
    invoke-static {}, Ll/֫᩸ܳ;->᩻()V

    .line 51
    new-instance v0, Ll/ۤܶܳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ll/۫᩻᩻;->֫(Ll/֨ۡ֫;)V

    return-void

    :catchall_0
    move-exception v1

    .line 655
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method

.method public static ֫(Ljava/util/ArrayList;I)I
    .locals 3

    .line 424
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 425
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗ᩻᩻;

    iget v2, v2, Ll/ۗ᩻᩻;->᩶:I

    if-ne v2, p1, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static ֫(Ljava/util/ArrayList;IILjava/lang/Integer;)I
    .locals 5

    const/4 v0, -0x1

    if-nez p3, :cond_0

    const/4 p3, -0x1

    goto :goto_0

    .line 293
    :cond_0
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {p0, p3}, Ll/֫᩸ܳ;->֫(Ljava/util/ArrayList;I)I

    move-result p3

    :goto_0
    if-gez p3, :cond_5

    .line 297
    new-instance p3, Ll/ۤ᩻ᩴ;

    sget-object v1, Ll/֫᩸ܳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    const/4 v3, 0x0

    .line 110
    invoke-direct {p3, v2, v3}, Ll/ۤ᩻ᩴ;-><init>(II)V

    .line 298
    invoke-virtual {p3}, Ll/ᩴܿᩴ;->֫()V

    .line 299
    invoke-virtual {p3, v0, v3}, Ll/ۤ᩻ᩴ;->֫(II)I

    .line 300
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v0, :cond_1

    .line 301
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܰܶܳ;

    iget v4, v4, Ll/ܰܶܳ;->֫:I

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p3, v4, v2}, Ll/ۤ᩻ᩴ;->֫(II)I

    goto :goto_1

    .line 303
    :cond_1
    invoke-virtual {p3, p2}, Ll/ۤ᩻ᩴ;->get(I)I

    move-result v0

    if-ltz v0, :cond_4

    .line 307
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p2

    .line 308
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_2
    if-ge v3, v1, :cond_3

    .line 309
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗ᩻᩻;

    iget v2, v2, Ll/ۗ᩻᩻;->᩶:I

    invoke-static {v2}, Ll/֫᩸ܳ;->ᩳ(I)I

    move-result v2

    invoke-virtual {p3, v2}, Ll/ۤ᩻ᩴ;->get(I)I

    move-result v2

    if-le v2, v0, :cond_2

    move p3, v3

    goto :goto_3

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    move p3, p2

    goto :goto_3

    .line 305
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Unknown group "

    .line 0
    invoke-static {p2, p1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 305
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    :goto_3
    if-ge p1, p3, :cond_6

    add-int/lit8 p3, p3, -0x1

    :cond_6
    return p3
.end method

.method public static ֫()Ljava/util/HashMap;
    .locals 4

    .line 606
    new-instance v0, Ljava/util/HashMap;

    sget-object v1, Ll/֫᩸ܳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 607
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰܶܳ;

    .line 608
    iget-object v3, v2, Ll/ܰܶܳ;->ۧ:Ljava/lang/String;

    iget v2, v2, Ll/ܰܶܳ;->֫:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ֫(I)V
    .locals 4

    const-string v1, "Unknown group "

    .line 152
    invoke-static {}, Ll/֫᩸ܳ;->ܳ()Ljava/util/ArrayList;

    move-result-object v2

    .line 153
    sget-object v0, Ll/֫᩸ܳ;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 154
    :try_start_0
    invoke-static {p0}, Ll/֫᩸ܳ;->ۧ(I)Ll/ܰܶܳ;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 157
    sget-object v1, Ll/֫᩸ܳ;->ۧ:Ljava/util/ArrayList;

    new-instance v3, Ll/ۛܶܳ;

    invoke-direct {v3, p0}, Ll/ۛܶܳ;-><init>(I)V

    invoke-static {v1, v3}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 158
    sget-object v1, Ll/֫᩸ܳ;->֫:Ll/ۤ᩻ᩴ;

    invoke-virtual {v1}, Ll/ۤ᩻ᩴ;->۫֫()Ll/ᩴۚᩴ;

    move-result-object v1

    new-instance v3, Ll/ۨܶܳ;

    invoke-direct {v3, p0}, Ll/ۨܶܳ;-><init>(I)V

    invoke-static {v1, v3}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 159
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p0, 0x1

    .line 160
    invoke-static {v2, p0, p0}, Ll/֫᩸ܳ;->֫(Ljava/util/ArrayList;ZZ)V

    return-void

    .line 155
    :cond_0
    :try_start_1
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :catchall_0
    move-exception p0

    .line 159
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(IILjava/lang/Integer;)V
    .locals 5

    .line 259
    invoke-static {}, Ll/֫᩸ܳ;->ܳ()Ljava/util/ArrayList;

    move-result-object v1

    .line 260
    invoke-static {v1, p0}, Ll/֫᩸ܳ;->֫(Ljava/util/ArrayList;I)I

    move-result v2

    if-ltz v2, :cond_6

    .line 265
    sget-object v0, Ll/֫᩸ܳ;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 266
    :try_start_0
    invoke-static {p0}, Ll/֫᩸ܳ;->ᩳ(I)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, p1, :cond_2

    if-nez p2, :cond_0

    goto :goto_0

    .line 269
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {v1, p0}, Ll/֫᩸ܳ;->֫(Ljava/util/ArrayList;I)I

    move-result v4

    :goto_0
    if-ltz v4, :cond_1

    goto :goto_2

    :cond_1
    move v4, v2

    goto :goto_2

    .line 274
    :cond_2
    invoke-static {v1, v2, p1, p2}, Ll/֫᩸ܳ;->֫(Ljava/util/ArrayList;IILjava/lang/Integer;)I

    move-result p2

    .line 449
    sget-object v1, Ll/֫᩸ܳ;->֫:Ll/ۤ᩻ᩴ;

    if-ne p1, v4, :cond_3

    .line 450
    invoke-virtual {v1, p0}, Ll/ۤ᩻ᩴ;->remove(I)I

    goto :goto_1

    .line 453
    :cond_3
    invoke-static {p1}, Ll/֫᩸ܳ;->ۧ(I)Ll/ܰܶܳ;

    move-result-object v3

    if-eqz v3, :cond_5

    .line 456
    invoke-virtual {v1, p0, p1}, Ll/ۤ᩻ᩴ;->֫(II)I

    .line 276
    :goto_1
    invoke-static {}, Ll/֫᩸ܳ;->ܿ()V

    move v4, p2

    .line 278
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v2, v4, :cond_4

    .line 280
    invoke-static {v2, v4}, Ll/۫᩻᩻;->֫(II)V

    :cond_4
    return-void

    .line 454
    :cond_5
    :try_start_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Unknown group "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_0
    move-exception p0

    .line 278
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    .line 262
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unknown config "

    .line 0
    invoke-static {p0, p2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 262
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(ILjava/lang/String;Ljava/util/HashMap;)V
    .locals 2

    .line 617
    sget-object v0, Ll/֫᩸ܳ;->֫:Ll/ۤ᩻ᩴ;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 621
    :cond_0
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_1

    .line 623
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p0, p1}, Ll/ۤ᩻ᩴ;->֫(II)I

    :cond_1
    return-void

    .line 618
    :cond_2
    :goto_0
    invoke-virtual {v0, p0}, Ll/ۤ᩻ᩴ;->remove(I)I

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Z)V
    .locals 8

    .line 226
    invoke-static {}, Ll/֫᩸ܳ;->ܳ()Ljava/util/ArrayList;

    move-result-object v1

    .line 488
    new-instance v2, Ll/᩺ܶܳ;

    invoke-direct {v2}, Ll/᩺ܶܳ;-><init>()V

    .line 489
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v3, "groups"

    .line 490
    invoke-virtual {p0, v3}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v3

    if-eqz v3, :cond_7

    const/4 v4, 0x0

    .line 492
    :goto_0
    invoke-virtual {v3}, Lbin/mt/json/JSONArray;->size()I

    move-result v5

    if-ge v4, v5, :cond_7

    .line 493
    invoke-virtual {v3, v4}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object v5

    const/4 v6, 0x0

    if-nez v5, :cond_0

    goto :goto_2

    .line 541
    :cond_0
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v7

    if-eqz v7, :cond_2

    .line 542
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v7, "name"

    invoke-virtual {v5, v7}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v5

    if-eqz v5, :cond_4

    .line 543
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v7

    if-nez v7, :cond_1

    goto :goto_2

    .line 546
    :cond_1
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    .line 547
    :cond_2
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v7

    if-eqz v7, :cond_4

    .line 548
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v5

    .line 552
    :goto_1
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    .line 553
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_2

    :cond_3
    move-object v6, v5

    :cond_4
    :goto_2
    if-eqz v6, :cond_6

    .line 495
    invoke-virtual {v0, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_3

    .line 498
    :cond_5
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 499
    iget-object v5, v2, Ll/᩺ܶܳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 502
    :cond_7
    new-instance v3, Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/HashMap;-><init>(I)V

    .line 503
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۗ᩻᩻;

    .line 504
    iget v5, v5, Ll/ۗ᩻᩻;->᩶:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_8
    const-string v4, "assignments"

    .line 506
    invoke-virtual {p0, v4}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_d

    .line 508
    invoke-virtual {p0}, Lbin/mt/json/JSONObject;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_9
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbin/mt/json/JSONObject$Member;

    .line 511
    :try_start_0
    invoke-virtual {v4}, Lbin/mt/json/JSONObject$Member;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 515
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    goto :goto_5

    .line 518
    :cond_a
    invoke-virtual {v4}, Lbin/mt/json/JSONObject$Member;->getValue()Lbin/mt/json/JSONValue;

    move-result-object v4

    if-eqz v4, :cond_9

    .line 519
    invoke-virtual {v4}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v6

    if-nez v6, :cond_b

    goto :goto_5

    .line 522
    :cond_b
    invoke-virtual {v4}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 523
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_c

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_c

    goto :goto_5

    .line 526
    :cond_c
    iget-object v6, v2, Ll/᩺ܶܳ;->֫:Ljava/util/HashMap;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v6, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :catch_0
    nop

    goto :goto_5

    .line 228
    :cond_d
    sget-object p0, Ll/֫᩸ܳ;->ᩳ:Ljava/lang/Object;

    move-object v0, p0

    monitor-enter v0

    if-eqz p1, :cond_e

    .line 230
    :try_start_1
    invoke-static {v2}, Ll/֫᩸ܳ;->֫(Ll/᩺ܶܳ;)V

    goto :goto_6

    .line 232
    :cond_e
    invoke-static {v2, v1}, Ll/֫᩸ܳ;->֫(Ll/᩺ܶܳ;Ljava/util/ArrayList;)V

    .line 234
    :goto_6
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 p0, 0x1

    .line 235
    invoke-static {v1, p0, p0}, Ll/֫᩸ܳ;->֫(Ljava/util/ArrayList;ZZ)V

    return-void

    :catchall_0
    move-exception p0

    .line 234
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static ֫(Lbin/mt/plus/Main;Ll/۠ܶܳ;)V
    .locals 1

    .line 65
    sget-object v0, Ll/֫᩸ܳ;->ܽ:Ll/ۚۡ֫;

    invoke-virtual {v0, p0, p1}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    return-void
.end method

.method public static ֫(Ljava/lang/String;)V
    .locals 4

    .line 124
    sget-object v0, Ll/֫᩸ܳ;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 125
    :try_start_0
    new-instance v1, Ll/ܰܶܳ;

    sget v2, Ll/֫᩸ܳ;->ܿ:I

    add-int/lit8 v3, v2, 0x1

    sput v3, Ll/֫᩸ܳ;->ܿ:I

    invoke-direct {v1, v2, p0}, Ll/ܰܶܳ;-><init>(ILjava/lang/String;)V

    .line 126
    sget-object p0, Ll/֫᩸ܳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    invoke-static {}, Ll/֫᩸ܳ;->ܿ()V

    .line 128
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    sget-object p0, Ll/֫᩸ܳ;->ܽ:Ll/ۚۡ֫;

    const-class v0, Ljava/lang/Object;

    invoke-virtual {p0, v0}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p0

    .line 128
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(Ljava/util/ArrayList;)V
    .locals 6

    const-string v1, "Unexpected group count "

    .line 167
    invoke-static {}, Ll/֫᩸ܳ;->ܳ()Ljava/util/ArrayList;

    move-result-object v2

    .line 168
    sget-object v0, Ll/֫᩸ܳ;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 169
    :try_start_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v3

    sget-object v4, Ll/֫᩸ܳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ne v3, v5, :cond_5

    .line 172
    new-instance v1, Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/HashMap;-><init>(I)V

    .line 173
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܰܶܳ;

    .line 174
    iget v5, v4, Ll/ܰܶܳ;->֫:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 176
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    sget-object v4, Ll/֫᩸ܳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 177
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-eqz v4, :cond_2

    .line 181
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܰܶܳ;

    if-eqz v5, :cond_1

    .line 185
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 183
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown or duplicate group "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 179
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Group id can not be null"

    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 187
    :cond_3
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_4

    .line 190
    sget-object p0, Ll/֫᩸ܳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 191
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 192
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p0, 0x1

    .line 193
    invoke-static {v2, p0, p0}, Ll/֫᩸ܳ;->֫(Ljava/util/ArrayList;ZZ)V

    return-void

    .line 188
    :cond_4
    :try_start_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing group ids "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 170
    :cond_5
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :catchall_0
    move-exception p0

    .line 192
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(Ljava/util/ArrayList;ZZ)V
    .locals 1

    .line 339
    sget-object v0, Ll/֫᩸ܳ;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 340
    :try_start_0
    invoke-static {p0}, Ll/֫᩸ܳ;->ۧ(Ljava/util/ArrayList;)Ll/۟ܶܳ;

    move-result-object p0

    if-nez p1, :cond_0

    .line 341
    iget-boolean p1, p0, Ll/۟ܶܳ;->֫:Z

    if-eqz p1, :cond_1

    .line 342
    :cond_0
    invoke-static {}, Ll/֫᩸ܳ;->ܿ()V

    .line 344
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 345
    iget-object p1, p0, Ll/۟ܶܳ;->ۧ:Ll/֨ۡᩴ;

    if-eqz p1, :cond_2

    .line 346
    invoke-static {p1}, Ll/۫᩻᩻;->֫(Ll/֨ۡᩴ;)V

    :cond_2
    if-nez p2, :cond_4

    .line 737
    iget-boolean p1, p0, Ll/۟ܶܳ;->֫:Z

    if-nez p1, :cond_4

    iget-object p0, p0, Ll/۟ܶܳ;->ۧ:Ll/֨ۡᩴ;

    if-eqz p0, :cond_3

    goto :goto_0

    :cond_3
    return-void

    .line 349
    :cond_4
    :goto_0
    sget-object p0, Ll/֫᩸ܳ;->ܽ:Ll/ۚۡ֫;

    const-class p1, Ljava/lang/Object;

    invoke-virtual {p0, p1}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p0

    .line 344
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/᩶ܶܳ;)V
    .locals 3

    .line 83
    sget-object v0, Ll/֫᩸ܳ;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 84
    :try_start_0
    sget-object v1, Ll/֫᩸ܳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰܶܳ;

    .line 85
    invoke-virtual {p0, v2}, Ll/᩶ܶܳ;->accept(Ljava/lang/Object;)V

    goto :goto_0

    .line 87
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/᩺ܶܳ;)V
    .locals 8

    .line 576
    iget-object v0, p0, Ll/᩺ܶܳ;->ۧ:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/HashMap;

    sget-object v2, Ll/֫᩸ܳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/HashMap;-><init>(I)V

    .line 577
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܰܶܳ;

    .line 578
    iget-object v5, v4, Ll/ܰܶܳ;->ۧ:Ljava/lang/String;

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 580
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 581
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 582
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܰܶܳ;

    if-nez v5, :cond_1

    .line 584
    new-instance v5, Ll/ܰܶܳ;

    sget v6, Ll/֫᩸ܳ;->ܿ:I

    add-int/lit8 v7, v6, 0x1

    sput v7, Ll/֫᩸ܳ;->ܿ:I

    invoke-direct {v5, v6, v4}, Ll/ܰܶܳ;-><init>(ILjava/lang/String;)V

    .line 586
    :cond_1
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 588
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܰܶܳ;

    .line 589
    iget-object v5, v4, Ll/ܰܶܳ;->ۧ:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 590
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 593
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 594
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 595
    invoke-static {}, Ll/֫᩸ܳ;->֫()Ljava/util/HashMap;

    move-result-object v0

    .line 596
    iget-object p0, p0, Ll/᩺ܶܳ;->֫:Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 597
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ll/֫᩸ܳ;->֫(ILjava/lang/String;Ljava/util/HashMap;)V

    goto :goto_3

    :cond_5
    return-void
.end method

.method public static ֫(Ll/᩺ܶܳ;Ljava/util/ArrayList;)V
    .locals 6

    .line 560
    sget-object v0, Ll/֫᩸ܳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 561
    sget-object v1, Ll/֫᩸ܳ;->֫:Ll/ۤ᩻ᩴ;

    invoke-virtual {v1}, Ll/ۤ᩻ᩴ;->clear()V

    const/4 v1, 0x1

    .line 562
    sput v1, Ll/֫᩸ܳ;->ܿ:I

    .line 563
    iget-object v1, p0, Ll/᩺ܶܳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 564
    new-instance v3, Ll/ܰܶܳ;

    sget v4, Ll/֫᩸ܳ;->ܿ:I

    add-int/lit8 v5, v4, 0x1

    sput v5, Ll/֫᩸ܳ;->ܿ:I

    invoke-direct {v3, v4, v2}, Ll/ܰܶܳ;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 566
    :cond_0
    invoke-static {}, Ll/֫᩸ܳ;->֫()Ljava/util/HashMap;

    move-result-object v0

    .line 567
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗ᩻᩻;

    .line 568
    iget v1, v1, Ll/ۗ᩻᩻;->᩶:I

    iget-object v2, p0, Ll/᩺ܶܳ;->֫:Ljava/util/HashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v1, v2, v0}, Ll/֫᩸ܳ;->֫(ILjava/lang/String;Ljava/util/HashMap;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public static ֫(ILjava/lang/String;)Z
    .locals 4

    .line 108
    sget-object v0, Ll/֫᩸ܳ;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 109
    :try_start_0
    sget-object v1, Ll/֫᩸ܳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰܶܳ;

    .line 110
    iget v3, v2, Ll/ܰܶܳ;->֫:I

    if-eq v3, p0, :cond_0

    iget-object v2, v2, Ll/ܰܶܳ;->ۧ:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 p0, 0x1

    .line 111
    monitor-exit v0

    return p0

    .line 114
    :cond_1
    monitor-exit v0

    const/4 p0, 0x0

    return p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static synthetic ֫(Ljava/util/HashMap;Ll/ۖ᩻ᩴ;)Z
    .locals 1

    .line 441
    invoke-interface {p1}, Ll/ۖ᩻ᩴ;->֫()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 442
    invoke-interface {p1}, Ll/ۖ᩻ᩴ;->᩷()I

    move-result p0

    const/4 v0, -0x1

    if-eq p0, v0, :cond_0

    invoke-interface {p1}, Ll/ۖ᩻ᩴ;->᩷()I

    move-result p0

    invoke-static {p0}, Ll/֫᩸ܳ;->ۧ(I)Ll/ܰܶܳ;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ۧ()Lbin/mt/json/JSONObject;
    .locals 9

    .line 201
    invoke-static {}, Ll/֫᩸ܳ;->ܳ()Ljava/util/ArrayList;

    move-result-object v1

    .line 202
    new-instance v2, Lbin/mt/json/JSONObject;

    invoke-direct {v2}, Lbin/mt/json/JSONObject;-><init>()V

    .line 203
    new-instance v3, Lbin/mt/json/JSONArray;

    invoke-direct {v3}, Lbin/mt/json/JSONArray;-><init>()V

    .line 204
    new-instance v4, Lbin/mt/json/JSONObject;

    invoke-direct {v4}, Lbin/mt/json/JSONObject;-><init>()V

    .line 205
    sget-object v0, Ll/֫᩸ܳ;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 206
    :try_start_0
    sget-object v5, Ll/֫᩸ܳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܰܶܳ;

    .line 207
    new-instance v7, Lbin/mt/json/JSONObject;

    invoke-direct {v7}, Lbin/mt/json/JSONObject;-><init>()V

    const-string v8, "name"

    .line 208
    iget-object v6, v6, Ll/ܰܶܳ;->ۧ:Ljava/lang/String;

    invoke-virtual {v7, v8, v6}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 209
    invoke-virtual {v3, v7}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    .line 211
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۗ᩻᩻;

    .line 212
    iget v6, v5, Ll/ۗ᩻᩻;->᩶:I

    invoke-static {v6}, Ll/֫᩸ܳ;->ᩳ(I)I

    move-result v6

    const/4 v7, -0x1

    if-ne v6, v7, :cond_1

    const/4 v6, 0x0

    goto :goto_2

    .line 213
    :cond_1
    invoke-static {v6}, Ll/֫᩸ܳ;->ۧ(I)Ll/ܰܶܳ;

    move-result-object v6

    .line 214
    :goto_2
    iget v5, v5, Ll/ۗ᩻᩻;->᩶:I

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    if-nez v6, :cond_2

    const-string v6, ""

    goto :goto_3

    :cond_2
    iget-object v6, v6, Ll/ܰܶܳ;->ۧ:Ljava/lang/String;

    :goto_3
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    goto :goto_1

    .line 216
    :cond_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v0, "groups"

    .line 217
    invoke-virtual {v2, v0, v3}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    const-string v0, "assignments"

    .line 218
    invoke-virtual {v2, v0, v4}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    return-object v2

    :catchall_0
    move-exception v1

    .line 216
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static ۧ(Ljava/util/ArrayList;)Ll/۟ܶܳ;
    .locals 9

    .line 436
    new-instance v0, Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 437
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗ᩻᩻;

    .line 438
    iget v2, v2, Ll/ۗ᩻᩻;->᩶:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 440
    :cond_0
    sget-object v1, Ll/֫᩸ܳ;->֫:Ll/ۤ᩻ᩴ;

    invoke-virtual {v1}, Ll/ۤ᩻ᩴ;->۫֫()Ll/ᩴۚᩴ;

    move-result-object v1

    new-instance v2, Ll/ۚۛ᩻;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v0}, Ll/ۚۛ᩻;-><init>(ILjava/lang/Object;)V

    invoke-static {v1, v2}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    move-result v0

    .line 360
    sget-object v1, Ll/֫᩸ܳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_7

    .line 398
    new-instance v2, Ll/ܺۢᩴ;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ll/ܺۢᩴ;-><init>(I)V

    .line 399
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۗ᩻᩻;

    .line 400
    iget v4, v4, Ll/ۗ᩻᩻;->᩶:I

    invoke-virtual {v2, v4}, Ll/ܺۢᩴ;->add(I)Z

    goto :goto_1

    .line 375
    :cond_1
    new-instance v3, Ll/ۤ᩻ᩴ;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    const/4 v5, 0x0

    .line 110
    invoke-direct {v3, v4, v5}, Ll/ۤ᩻ᩴ;-><init>(II)V

    .line 376
    new-instance v4, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    add-int/lit8 v6, v6, 0x1

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v6, -0x1

    .line 377
    invoke-virtual {v3, v6, v5}, Ll/ۤ᩻ᩴ;->֫(II)I

    .line 378
    new-instance v6, Ll/ܺۢᩴ;

    invoke-direct {v6}, Ll/ܺۢᩴ;-><init>()V

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 379
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v6, :cond_2

    .line 380
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܰܶܳ;

    iget v8, v8, Ll/ܰܶܳ;->֫:I

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v3, v8, v7}, Ll/ۤ᩻ᩴ;->֫(II)I

    .line 381
    new-instance v8, Ll/ܺۢᩴ;

    invoke-direct {v8}, Ll/ܺۢᩴ;-><init>()V

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 383
    :cond_2
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۗ᩻᩻;

    .line 384
    iget v7, v6, Ll/ۗ᩻᩻;->᩶:I

    invoke-static {v7}, Ll/֫᩸ܳ;->ᩳ(I)I

    move-result v7

    invoke-virtual {v3, v7}, Ll/ۤ᩻ᩴ;->get(I)I

    move-result v7

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/֨ۡᩴ;

    iget v6, v6, Ll/ۗ᩻᩻;->᩶:I

    invoke-interface {v7, v6}, Ll/֨ۡᩴ;->add(I)Z

    goto :goto_3

    .line 386
    :cond_3
    new-instance v1, Ll/ܺۢᩴ;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    invoke-direct {v1, p0}, Ll/ܺۢᩴ;-><init>(I)V

    .line 387
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֨ۡᩴ;

    .line 388
    invoke-virtual {v1, v3}, Ll/ۤܿᩴ;->֫(Ll/֨ۡᩴ;)Z

    goto :goto_4

    .line 409
    :cond_4
    invoke-virtual {v2}, Ll/ܺۢᩴ;->size()I

    move-result p0

    invoke-virtual {v1}, Ll/ܺۢᩴ;->size()I

    move-result v3

    if-eq p0, v3, :cond_5

    goto :goto_6

    .line 412
    :cond_5
    invoke-virtual {v2}, Ll/ܺۢᩴ;->size()I

    move-result p0

    :goto_5
    if-ge v5, p0, :cond_7

    .line 413
    invoke-virtual {v2, v5}, Ll/ܺۢᩴ;->getInt(I)I

    move-result v3

    invoke-virtual {v1, v5}, Ll/ܺۢᩴ;->getInt(I)I

    move-result v4

    if-eq v3, v4, :cond_6

    goto :goto_6

    :cond_6
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_7
    const/4 v1, 0x0

    .line 367
    :goto_6
    new-instance p0, Ll/۟ܶܳ;

    invoke-direct {p0, v0, v1}, Ll/۟ܶܳ;-><init>(ZLl/ܺۢᩴ;)V

    return-object p0
.end method

.method public static ۧ(I)Ll/ܰܶܳ;
    .locals 3

    .line 475
    sget-object v0, Ll/֫᩸ܳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰܶܳ;

    .line 476
    iget v2, v1, Ll/ܰܶܳ;->֫:I

    if-ne v2, p0, :cond_0

    return-object v1

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۧ(ILjava/lang/String;)V
    .locals 3

    const-string v1, "Unknown group "

    .line 137
    sget-object v0, Ll/֫᩸ܳ;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 138
    :try_start_0
    invoke-static {p0}, Ll/֫᩸ܳ;->ۧ(I)Ll/ܰܶܳ;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 142
    iput-object p1, v2, Ll/ܰܶܳ;->ۧ:Ljava/lang/String;

    .line 143
    invoke-static {}, Ll/֫᩸ܳ;->ܿ()V

    .line 144
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    sget-object p0, Ll/֫᩸ܳ;->ܽ:Ll/ۚۡ֫;

    const-class p1, Ljava/lang/Object;

    invoke-virtual {p0, p1}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    return-void

    .line 140
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p0

    .line 144
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ܳ()Ljava/util/ArrayList;
    .locals 3

    .line 322
    const-class v0, Ll/۫᩻᩻;

    monitor-enter v0

    .line 323
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-static {}, Ll/۫᩻᩻;->ܽ()Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 324
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static ܽ(I)I
    .locals 1

    .line 239
    sget-object v0, Ll/֫᩸ܳ;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 240
    :try_start_0
    invoke-static {p0}, Ll/֫᩸ܳ;->ᩳ(I)I

    move-result p0

    monitor-exit v0

    return p0

    :catchall_0
    move-exception p0

    .line 241
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ܽ()Ljava/util/ArrayList;
    .locals 3

    .line 73
    sget-object v0, Ll/֫᩸ܳ;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 74
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    sget-object v2, Ll/֫᩸ܳ;->ۧ:Ljava/util/ArrayList;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 75
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static ܿ()V
    .locals 7

    .line 683
    new-instance v0, Lbin/mt/json/JSONObject;

    invoke-direct {v0}, Lbin/mt/json/JSONObject;-><init>()V

    const-string v1, "nextId"

    .line 684
    sget v2, Ll/֫᩸ܳ;->ܿ:I

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    .line 685
    new-instance v1, Lbin/mt/json/JSONArray;

    invoke-direct {v1}, Lbin/mt/json/JSONArray;-><init>()V

    .line 686
    sget-object v2, Ll/֫᩸ܳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܰܶܳ;

    .line 687
    new-instance v4, Lbin/mt/json/JSONObject;

    invoke-direct {v4}, Lbin/mt/json/JSONObject;-><init>()V

    const-string v5, "id"

    .line 688
    iget v6, v3, Ll/ܰܶܳ;->֫:I

    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    const-string v5, "name"

    .line 689
    iget-object v3, v3, Ll/ܰܶܳ;->ۧ:Ljava/lang/String;

    invoke-virtual {v4, v5, v3}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 690
    invoke-virtual {v1, v4}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_0
    const-string v2, "groups"

    .line 692
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 693
    new-instance v1, Lbin/mt/json/JSONObject;

    invoke-direct {v1}, Lbin/mt/json/JSONObject;-><init>()V

    .line 694
    sget-object v2, Ll/֫᩸ܳ;->֫:Ll/ۤ᩻ᩴ;

    invoke-virtual {v2}, Ll/ۤ᩻ᩴ;->۫֫()Ll/ᩴۚᩴ;

    move-result-object v2

    invoke-interface {v2}, Ll/ᩴۚᩴ;->iterator()Ll/۫֡ᩴ;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖ᩻ᩴ;

    .line 695
    invoke-interface {v3}, Ll/ۖ᩻ᩴ;->֫()I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3}, Ll/ۖ᩻ᩴ;->᩷()I

    move-result v3

    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    goto :goto_1

    :cond_1
    const-string v2, "assignments"

    .line 697
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 698
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v1

    const-string v2, "ndg_data"

    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    return-void
.end method

.method public static ᩳ(I)I
    .locals 2

    .line 463
    sget-object v0, Ll/֫᩸ܳ;->֫:Ll/ۤ᩻ᩴ;

    invoke-virtual {v0, p0}, Ll/ۤ᩻ᩴ;->ܽ(I)I

    move-result p0

    const/4 v0, -0x1

    if-eq p0, v0, :cond_1

    .line 464
    invoke-static {p0}, Ll/֫᩸ܳ;->ۧ(I)Ll/ܰܶܳ;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    return p0

    :cond_1
    :goto_0
    return v0
.end method

.method public static ᩳ()Z
    .locals 1

    .line 79
    sget-object v0, Ll/֫᩸ܳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public static ᩻()V
    .locals 2

    .line 331
    invoke-static {}, Ll/֫᩸ܳ;->ܳ()Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Ll/֫᩸ܳ;->֫(Ljava/util/ArrayList;ZZ)V

    return-void
.end method
