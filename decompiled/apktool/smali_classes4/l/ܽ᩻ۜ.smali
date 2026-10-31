.class public final Ll/ܽ᩻ۜ;
.super Ljava/lang/Object;
.source "K6YZ"


# instance fields
.field public final ֫:Ll/۠᩷ۜ;


# direct methods
.method public constructor <init>(Ll/۠᩷ۜ;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Ll/ܽ᩻ۜ;->֫:Ll/۠᩷ۜ;

    return-void
.end method

.method private ֫(Ll/֡᩷ۜ;)Ll/֫᩻ۜ;
    .locals 18

    move-object/from16 v0, p1

    .line 84
    new-instance v1, Ll/ᩳܰۡ;

    iget-object v2, v0, Ll/֡᩷ۜ;->ܽ:Ll/ܶ᩵ܿ;

    const-string v3, "original.apk"

    .line 393
    invoke-virtual {v2, v3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 84
    invoke-direct {v1, v2}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V

    .line 85
    :try_start_0
    invoke-static {v1}, Ll/ۗۨ᩻;->֫(Ll/ᩳܰۡ;)Ll/᩶ۨ᩻;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    invoke-virtual {v1}, Ll/ᩳܰۡ;->close()V

    .line 87
    iget-object v1, v2, Ll/᩶ۨ᩻;->֫:Ljava/lang/String;

    if-eqz v1, :cond_0

    :goto_0
    move-object v8, v1

    goto :goto_1

    .line 89
    :cond_0
    iget-object v1, v2, Ll/᩶ۨ᩻;->ۧ:Ljava/lang/String;

    goto :goto_0

    .line 90
    :goto_1
    iget-wide v3, v0, Ll/֡᩷ۜ;->ᩳ:J

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-ltz v1, :cond_1

    :goto_2
    move-wide v14, v3

    goto :goto_3

    .line 92
    :cond_1
    iget-wide v3, v0, Ll/֡᩷ۜ;->֫:J

    goto :goto_2

    .line 93
    :goto_3
    new-instance v1, Ll/֫᩻ۜ;

    iget-object v4, v0, Ll/֡᩷ۜ;->ᩴ:Ljava/lang/String;

    iget-object v5, v0, Ll/֡᩷ۜ;->ܺ:Ljava/lang/String;

    const/4 v3, 0x0

    if-eqz v5, :cond_3

    .line 103
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_4

    :cond_2
    :try_start_1
    new-array v6, v3, [Ljava/lang/String;

    .line 107
    invoke-static {v5, v6}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v6

    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v6
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_5

    :catch_0
    :cond_3
    :goto_4
    const/4 v6, 0x0

    .line 93
    :goto_5
    iget-object v7, v0, Ll/֡᩷ۜ;->ܺ:Ljava/lang/String;

    const/4 v9, 0x0

    if-eqz v7, :cond_5

    .line 118
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_4

    goto :goto_6

    :cond_4
    :try_start_2
    new-array v10, v3, [Ljava/lang/String;

    .line 122
    invoke-static {v7, v10}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v7

    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v7
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_7

    :catch_1
    :cond_5
    :goto_6
    move-object v7, v9

    .line 94
    :goto_7
    iget-object v9, v2, Ll/᩶ۨ᩻;->᩻:Ljava/lang/String;

    iget-object v10, v2, Ll/᩶ۨ᩻;->ۢ:Ljava/lang/String;

    iget-object v11, v2, Ll/᩶ۨ᩻;->᩷:Ljava/lang/String;

    if-eqz v11, :cond_9

    .line 133
    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_6

    goto :goto_9

    .line 136
    :cond_6
    :goto_8
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v12

    if-ge v3, v12, :cond_8

    .line 137
    invoke-virtual {v11, v3}, Ljava/lang/String;->charAt(I)C

    move-result v12

    const/16 v13, 0x30

    if-lt v12, v13, :cond_9

    const/16 v13, 0x39

    if-le v12, v13, :cond_7

    goto :goto_9

    :cond_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    .line 143
    :cond_8
    :try_start_3
    invoke-static {v11}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_a

    :catch_2
    :cond_9
    :goto_9
    const/4 v3, 0x0

    :goto_a
    move-object v11, v3

    .line 95
    iget-wide v12, v0, Ll/֡᩷ۜ;->֫:J

    iget-boolean v0, v2, Ll/᩶ۨ᩻;->ܽ:Z

    iget-object v2, v2, Ll/᩶ۨ᩻;->ᩳ:Ljava/lang/String;

    move-object v3, v1

    move/from16 v16, v0

    move-object/from16 v17, v2

    invoke-direct/range {v3 .. v17}, Ll/֫᩻ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;JJZLjava/lang/String;)V

    return-object v1

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 84
    :try_start_4
    invoke-virtual {v1}, Ll/ᩳܰۡ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_b

    :catchall_1
    move-exception v0

    move-object v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_b
    throw v2
.end method


# virtual methods
.method public final ֫()Ll/ۧ᩻ۜ;
    .locals 8

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 33
    iget-object v1, p0, Ll/ܽ᩻ۜ;->֫:Ll/۠᩷ۜ;

    invoke-virtual {v1}, Ll/۠᩷ۜ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 34
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    .line 35
    new-instance v1, Ll/ۧ᩻ۜ;

    invoke-direct {v1, v0, v4}, Ll/ۧ᩻ۜ;-><init>(Ljava/util/ArrayList;I)V

    return-object v1

    :cond_0
    const/4 v3, 0x1

    .line 413
    invoke-virtual {v2, v3}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v2

    .line 37
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܶ᩵ܿ;

    .line 61
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v6

    .line 62
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v7

    if-eqz v7, :cond_2

    const-string v7, ".tmp-"

    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_2

    const-string v7, "xref"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    .line 69
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x1

    goto :goto_1

    .line 73
    :cond_1
    :try_start_0
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v6

    new-array v7, v4, [Ljava/lang/String;

    invoke-static {v6, v7}, Ll/ۡ۠ᩴ;->get(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v6

    invoke-static {v6}, Ll/ܿ۠ᩴ;->isSymbolicLink(Ll/᩷۠ᩴ;)Z

    move-result v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const/4 v6, 0x0

    :goto_1
    if-nez v6, :cond_2

    const/4 v6, 0x1

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    :goto_2
    if-nez v6, :cond_3

    goto :goto_0

    .line 42
    :cond_3
    :try_start_1
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ll/۠᩷ۜ;->ۧ(Ljava/lang/String;)Ll/֡᩷ۜ;

    move-result-object v5

    .line 43
    iget-boolean v6, v5, Ll/֡᩷ۜ;->ۘ:Z

    if-eqz v6, :cond_4

    goto :goto_0

    .line 46
    :cond_4
    invoke-direct {p0, v5}, Ll/ܽ᩻ۜ;->֫(Ll/֡᩷ۜ;)Ll/֫᩻ۜ;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 52
    :cond_5
    new-instance v1, Ll/۟ܳۜ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v1}, Ll/۠۬ᩴ;->comparingLong(Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;

    move-result-object v1

    invoke-static {v1}, Ll/ܶ۬ᩴ;->reversed(Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object v1

    new-instance v2, Ll/۠ۜܳ;

    const/4 v4, 0x2

    invoke-direct {v2, v4}, Ll/۠ۜܳ;-><init>(I)V

    .line 53
    invoke-static {v1, v2}, Ll/ܶ۬ᩴ;->thenComparing(Ljava/util/Comparator;Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object v1

    .line 52
    invoke-static {v0, v1}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 54
    new-instance v1, Ll/ۧ᩻ۜ;

    invoke-direct {v1, v0, v3}, Ll/ۧ᩻ۜ;-><init>(Ljava/util/ArrayList;I)V

    return-object v1
.end method
