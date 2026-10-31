.class public final Ll/ᩳ۠ۜ;
.super Ljava/lang/Object;
.source "K74T"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۗ:Ll/ܽ۠ۜ;

.field public final ۙ:Ll/ܶ۠֫;

.field public final ۬:Landroid/net/Uri;

.field public final ᩶:Z

.field public final ᩸:Ll/᩻۬ۜ;

.field public final ᩹:Ll/ܽۚۜ;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Ll/ܽۚۜ;Ll/ܶ۠֫;Ll/ܽ۠ۜ;Ll/᩻۬ۜ;Z)V
    .locals 0

    .line 788
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 789
    iput-object p1, p0, Ll/ᩳ۠ۜ;->۬:Landroid/net/Uri;

    .line 790
    iput-object p2, p0, Ll/ᩳ۠ۜ;->᩹:Ll/ܽۚۜ;

    .line 791
    iput-object p3, p0, Ll/ᩳ۠ۜ;->ۙ:Ll/ܶ۠֫;

    .line 792
    iput-object p4, p0, Ll/ᩳ۠ۜ;->ۗ:Ll/ܽ۠ۜ;

    .line 793
    iput-object p5, p0, Ll/ᩳ۠ۜ;->᩸:Ll/᩻۬ۜ;

    .line 794
    iput-boolean p6, p0, Ll/ᩳ۠ۜ;->᩶:Z

    return-void
.end method

.method public static ֫(Ll/ᩳۜܳ;Ll/ܰܺܳ;)Ll/ᩳ۠ۜ;
    .locals 18

    move-object/from16 v0, p1

    .line 801
    instance-of v7, v0, Ll/ۗۢ᩻;

    if-nez v7, :cond_1

    .line 802
    instance-of v1, v0, Ll/ۖۧ᩻;

    if-eqz v1, :cond_0

    goto :goto_0

    .line 803
    :cond_0
    new-instance v0, Ll/᩷۠ۜ;

    const-string v1, "HLS thumbnails require a local or network visitor"

    .line 1027
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 803
    throw v0

    :cond_1
    :goto_0
    const/4 v8, 0x0

    if-eqz v7, :cond_2

    .line 806
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v1

    invoke-static {v1}, Ll/᩷۬ۜ;->ۧ(Landroid/content/ContextWrapper;)Ll/᩻۬ۜ;

    move-result-object v1

    move-object v15, v1

    goto :goto_1

    :cond_2
    move-object v15, v8

    .line 809
    :goto_1
    :try_start_0
    new-instance v9, Ll/ᩳۚۜ;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    .line 0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    aget-object v1, v2, v3

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v4}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 809
    invoke-direct {v9, v3, v1}, Ll/ᩳۚۜ;-><init>(ILjava/util/List;)V

    .line 810
    new-instance v14, Ll/ܽۚۜ;

    sget-object v5, Ll/ۧۚۜ;->᩹:Ll/ۧۚۜ;

    const/4 v2, 0x0

    move-object v1, v14

    move-object/from16 v3, p1

    move-object v4, v9

    move-object v6, v15

    invoke-direct/range {v1 .. v6}, Ll/ܽۚۜ;-><init>(Ll/ۤۤۜ;Ll/ܰܺܳ;Ll/ᩳۚۜ;Ll/ۧۚۜ;Ll/᩻۬ۜ;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_4

    .line 816
    :try_start_1
    invoke-virtual {v9}, Ll/ᩳۚۜ;->ܳ()Ll/ۧ᩵֫;

    move-result-object v1

    iget-object v1, v1, Ll/ۧ᩵֫;->ܽ:Ll/ۨᩴ֫;

    iget-object v1, v1, Ll/ۨᩴ֫;->᩻:Landroid/net/Uri;

    if-nez v15, :cond_3

    .line 818
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_3
    invoke-virtual {v15}, Ll/᩻۬ۜ;->ܳ()Ljava/lang/String;

    move-result-object v2

    :goto_2
    if-eqz v7, :cond_4

    .line 821
    new-instance v12, Ll/ۛ᩸ۜ;

    invoke-direct {v12, v14, v15}, Ll/ۛ᩸ۜ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 825
    invoke-static {}, Ll/᩷۬ۜ;->ܿ()Ll/ۨۚۜ;

    move-result-object v13

    .line 101
    new-instance v3, Ll/᩻֨ۜ;

    sget-object v4, Ll/ܽ֨ۜ;->᩶:Ll/ܽ֨ۜ;

    new-instance v5, Ll/ۢ᩻ۜ;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_2

    const/16 v16, 0x0

    move-object v9, v3

    move-object v10, v15

    move-object v11, v14

    move-object v8, v14

    move-object v14, v4

    move-object/from16 v17, v15

    move-object v15, v5

    :try_start_2
    invoke-direct/range {v9 .. v16}, Ll/᩻֨ۜ;-><init>(Ll/᩻۬ۜ;Ll/ܶ۠֫;Ll/᩻ۗۜ;Ll/ۨۚۜ;Ll/ܽ֨ۜ;Ljava/util/function/LongSupplier;Ll/ܶ֨ۜ;)V

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_6

    :catch_1
    move-exception v0

    goto :goto_6

    :cond_4
    move-object v8, v14

    move-object/from16 v17, v15

    move-object v3, v8

    .line 828
    :goto_3
    new-instance v4, Ll/ܽ۠ۜ;

    invoke-direct {v4, v8, v0, v2}, Ll/ܽ۠ۜ;-><init>(Ll/ܽۚۜ;Ll/ܰܺܳ;Ljava/lang/String;)V

    .line 851
    new-instance v9, Ll/ᩳ۠ۜ;

    move-object v0, v9

    move-object v2, v8

    move-object/from16 v5, v17

    move v6, v7

    invoke-direct/range {v0 .. v6}, Ll/ᩳ۠ۜ;-><init>(Landroid/net/Uri;Ll/ܽۚۜ;Ll/ܶ۠֫;Ll/ܽ۠ۜ;Ll/᩻۬ۜ;Z)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0

    return-object v9

    :catch_2
    move-exception v0

    :goto_4
    move-object v8, v14

    :goto_5
    move-object/from16 v17, v15

    goto :goto_6

    :catch_3
    move-exception v0

    goto :goto_4

    :catch_4
    move-exception v0

    goto :goto_5

    :catch_5
    move-exception v0

    goto :goto_5

    :goto_6
    if-eqz v8, :cond_5

    .line 692
    invoke-virtual {v8}, Ll/ܽۚۜ;->ܿ()V

    .line 693
    invoke-virtual {v8}, Ll/ܽۚۜ;->ܽ()V

    :cond_5
    if-eqz v17, :cond_6

    .line 858
    invoke-virtual/range {v17 .. v17}, Ll/᩻۬ۜ;->close()V

    .line 860
    :cond_6
    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 893
    iget-object v0, p0, Ll/ᩳ۠ۜ;->᩸:Ll/᩻۬ۜ;

    :try_start_0
    iget-object v1, p0, Ll/ᩳ۠ۜ;->᩹:Ll/ܽۚۜ;

    .line 692
    invoke-virtual {v1}, Ll/ܽۚۜ;->ܿ()V

    .line 693
    invoke-virtual {v1}, Ll/ܽۚۜ;->ܽ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 896
    invoke-virtual {v0}, Ll/᩻۬ۜ;->close()V

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/᩻۬ۜ;->close()V

    .line 898
    :cond_1
    throw v1
.end method

.method public final ֫()Ll/ܶ۠֫;
    .locals 5

    .line 868
    iget-boolean v0, p0, Ll/ᩳ۠ۜ;->᩶:Z

    iget-object v1, p0, Ll/ᩳ۠ۜ;->᩹:Ll/ܽۚۜ;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ᩳ۠ۜ;->᩸:Ll/᩻۬ۜ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/᩻۬ۜ;->ᩳ()Ll/ܺ᩸֫;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 871
    :cond_0
    new-instance v2, Ll/ۢۗۜ;

    .line 873
    new-instance v3, Ll/ܳܶۜ;

    invoke-direct {v3, v1}, Ll/ܳܶۜ;-><init>(Ljava/lang/Object;)V

    new-instance v4, Ll/᩵۫ۡ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-direct {v2, v0, v3, v1, v4}, Ll/ۢۗۜ;-><init>(Ll/᩻۬ۜ;Ll/ܶ۠֫;Ll/ܶ۠֫;Ll/᩻ۗۜ;)V

    return-object v2

    :cond_1
    :goto_0
    return-object v1
.end method
