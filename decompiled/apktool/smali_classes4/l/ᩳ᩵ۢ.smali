.class public final Ll/ᩳ᩵ۢ;
.super Ljava/lang/Object;
.source "07BN"


# direct methods
.method public static ۧ(Ll/ܺܳܳ;)Ll/ܽ᩵ۢ;
    .locals 3

    .line 105
    invoke-static {p0}, Ll/ۜ֡ۢ;->֫(Ll/ܺܳܳ;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 106
    new-instance v0, Ll/ܽ᩵ۢ;

    .line 118
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v1, "targetPath"

    .line 107
    invoke-static {p0, v1}, Ll/ۜ֡ۢ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ܽ᩵ۢ;->ۧ(Ll/ܽ᩵ۢ;Ljava/lang/String;)V

    const-string v1, "name"

    .line 108
    invoke-static {p0, v1}, Ll/ۜ֡ۢ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ܽ᩵ۢ;->֫(Ll/ܽ᩵ۢ;Ljava/lang/String;)V

    const-string v1, "isDirectory"

    .line 109
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 111
    :cond_0
    invoke-static {p0, v1}, Ll/ۜ֡ۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x0

    :goto_1
    invoke-static {v0, p0}, Ll/ܽ᩵ۢ;->֫(Ll/ܽ᩵ۢ;Ljava/lang/Boolean;)V

    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/ܺܳܳ;)Ll/۠ܳܳ;
    .locals 5

    .line 34
    sget-object v0, Ll/ۘܳܳ;->ܰ:Ll/ۘܳܳ;

    invoke-virtual {p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 35
    sget-object p1, Ll/֨ܳܳ;->֫֫:Ll/֨ܳܳ;

    const v0, 0x7f120824

    new-array v1, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 39
    :cond_0
    :try_start_0
    invoke-static {p1}, Ll/ᩳ᩵ۢ;->ۧ(Ll/ܺܳܳ;)Ll/ܽ᩵ۢ;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/ܶܳܳ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 46
    invoke-static {p1}, Ll/ܽ᩵ۢ;->ܽ(Ll/ܽ᩵ۢ;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    const v3, 0x7f120827

    if-eqz v0, :cond_11

    invoke-static {p1}, Ll/ܽ᩵ۢ;->ܽ(Ll/ܽ᩵ۢ;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_8

    .line 49
    :cond_1
    invoke-static {p1}, Ll/ܽ᩵ۢ;->ۧ(Ll/ܽ᩵ۢ;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-static {p1}, Ll/ܽ᩵ۢ;->ۧ(Ll/ܽ᩵ۢ;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto/16 :goto_7

    .line 52
    :cond_2
    invoke-static {p1}, Ll/ܽ᩵ۢ;->֫(Ll/ܽ᩵ۢ;)Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_3

    .line 53
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v2, [Ljava/lang/Object;

    const-string v2, "isDirectory"

    aput-object v2, v0, v1

    .line 62
    invoke-static {v3, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 55
    :cond_3
    invoke-static {p1}, Ll/ܽ᩵ۢ;->ۧ(Ll/ܽ᩵ۢ;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "\\"

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_f

    invoke-static {p1}, Ll/ܽ᩵ۢ;->ۧ(Ll/ܽ᩵ۢ;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "/"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto/16 :goto_6

    .line 62
    :cond_4
    invoke-static {p1}, Ll/ܽ᩵ۢ;->ܽ(Ll/ܽ᩵ۢ;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ܽ᩷ܳ;->᩻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 405
    :try_start_1
    sget-object v4, Ll/ܽ֨ۢ;->ۗ:Ll/ܽ֨ۢ;

    invoke-static {v0, v4}, Ll/ᩳ֨ۢ;->֫(Ljava/lang/String;Ll/ܽ֨ۢ;)V
    :try_end_1
    .catch Ll/֫ۛۡ; {:try_start_1 .. :try_end_1} :catch_0

    .line 69
    invoke-static {p1}, Ll/ܽ᩵ۢ;->ۧ(Ll/ܽ᩵ۢ;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-static {p1}, Ll/ܽ᩵ۢ;->ۧ(Ll/ܽ᩵ۢ;)Ljava/lang/String;

    move-result-object v0

    new-array v3, v1, [Ljava/lang/String;

    invoke-static {v0, v3}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    goto :goto_0

    :cond_5
    invoke-static {p1}, Ll/ܽ᩵ۢ;->ۧ(Ll/ܽ᩵ۢ;)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 70
    :goto_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v3

    if-eqz v3, :cond_7

    .line 71
    sget-object p1, Ll/֨ܳܳ;->۬:Ll/֨ܳܳ;

    .line 73
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    if-eqz v0, :cond_6

    const v0, 0x7f1203fc

    goto :goto_1

    :cond_6
    const v0, 0x7f1203a1

    :goto_1
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    .line 71
    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 76
    :cond_7
    invoke-static {p1}, Ll/ܽ᩵ۢ;->֫(Ll/ܽ᩵ۢ;)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۙ()Z

    move-result v3

    goto :goto_2

    .line 97
    :cond_8
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩻֫()Ll/ܶ᩵ܿ;

    move-result-object v3

    if-eqz v3, :cond_9

    .line 98
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v4

    if-nez v4, :cond_9

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ۙ()Z

    move-result v3

    if-eqz v3, :cond_a

    :cond_9
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۗ()Z

    move-result v3

    if-eqz v3, :cond_a

    const/4 v3, 0x1

    goto :goto_2

    :cond_a
    const/4 v3, 0x0

    :goto_2
    if-nez v3, :cond_d

    .line 447
    new-instance v0, Ll/ܺ֨ܿ;

    invoke-direct {v0, v1}, Ll/ܺ֨ܿ;-><init>(I)V

    .line 449
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v3

    if-eqz v3, :cond_b

    .line 450
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    goto :goto_3

    .line 452
    :cond_b
    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 79
    :goto_3
    sget-object v0, Ll/֨ܳܳ;->ܰ:Ll/֨ܳܳ;

    .line 81
    invoke-static {p1}, Ll/ܽ᩵ۢ;->֫(Ll/ܽ᩵ۢ;)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_c

    const v3, 0x7f120821

    goto :goto_4

    :cond_c
    const v3, 0x7f120820

    :goto_4
    invoke-static {p1}, Ll/ܽ᩵ۢ;->ۧ(Ll/ܽ᩵ۢ;)Ljava/lang/String;

    move-result-object p1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v1

    .line 62
    invoke-static {v3, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 430
    :cond_d
    new-instance p1, Ll/ۤ֡ۢ;

    invoke-direct {p1, v1, v0}, Ll/ۤ֡ۢ;-><init>(ILjava/lang/Object;)V

    .line 436
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_e

    .line 437
    invoke-virtual {p1}, Ll/ۤ֡ۢ;->run()V

    goto :goto_5

    .line 439
    :cond_e
    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 87
    :goto_5
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 88
    new-instance v1, Ll/ۢۧ᩻;

    invoke-direct {v1, v0}, Ll/ۢۧ᩻;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-static {v1}, Ll/᩷᩵ۢ;->֫(Ll/ᩳۜܳ;)Ljava/util/HashMap;

    move-result-object v1

    const-string v2, "item"

    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "parentPath"

    .line 89
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    invoke-static {p1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 66
    sget-object v0, Ll/֨ܳܳ;->۬:Ll/֨ܳܳ;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 56
    :cond_f
    :goto_6
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    const v0, 0x7f1203ae

    .line 58
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    .line 56
    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 50
    :cond_10
    :goto_7
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v2, [Ljava/lang/Object;

    const-string v2, "name"

    aput-object v2, v0, v1

    .line 62
    invoke-static {v3, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 47
    :cond_11
    :goto_8
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v2, [Ljava/lang/Object;

    const-string v2, "targetPath"

    aput-object v2, v0, v1

    .line 62
    invoke-static {v3, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 41
    :catch_1
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    const v0, 0x7f12082b

    new-array v1, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1
.end method
