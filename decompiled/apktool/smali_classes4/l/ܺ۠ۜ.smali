.class public final Ll/ܺ۠ۜ;
.super Ljava/lang/Object;
.source "474R"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ᩸:Ll/᩸۠ۜ;

.field public final ᩹:Ll/۫֡ۜ;


# direct methods
.method public constructor <init>(Ll/᩸۠ۜ;Ll/۫֡ۜ;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Ll/ܺ۠ۜ;->᩸:Ll/᩸۠ۜ;

    .line 25
    iput-object p2, p0, Ll/ܺ۠ۜ;->᩹:Ll/۫֡ۜ;

    return-void
.end method

.method public static ֫(Ll/᩻۬ۜ;Landroid/net/Uri;Ll/ܶ۠֫;Ll/֨۠ۜ;)Ll/ܺ۠ۜ;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const/4 v7, 0x0

    .line 47
    :try_start_0
    invoke-static {v0, v6, v1, v7}, Ll/ۗ۠ۜ;->֫(Ll/᩻۬ۜ;Landroid/net/Uri;Ll/ܶ۠֫;Ll/ܺۗۜ;)Ll/᩸۠ۜ;

    move-result-object v8
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2

    .line 38
    :try_start_1
    invoke-virtual {v8}, Ll/᩸۠ۜ;->֫()Ljava/lang/String;

    move-result-object v15

    if-nez v15, :cond_0

    .line 40
    invoke-virtual {v8}, Ll/᩸۠ۜ;->close()V

    return-object v7

    .line 43
    :cond_0
    invoke-virtual {v8}, Ll/᩸۠ۜ;->ܽ()J

    move-result-wide v3

    .line 44
    invoke-virtual/range {p0 .. p0}, Ll/᩻۬ۜ;->ᩳ()Ll/ܺ᩸֫;

    move-result-object v5

    const-wide/16 v16, 0x0

    cmp-long v9, v3, v16

    if-gtz v9, :cond_1

    if-eqz v5, :cond_1

    .line 46
    invoke-virtual {v5, v15}, Ll/ܺ᩸֫;->֫(Ljava/lang/String;)Ll/ۜ᩸֫;

    move-result-object v3

    invoke-static {v3}, Ll/۬᩵ᩳ;->֫(Ll/ܳ᩸֫;)J

    move-result-wide v3

    :cond_1
    const/16 v18, 0x0

    cmp-long v19, v3, v16

    if-lez v19, :cond_2

    if-eqz v5, :cond_2

    const-wide/16 v11, 0x0

    move-object v9, v5

    move-object v10, v15

    move-wide v13, v3

    .line 48
    invoke-virtual/range {v9 .. v14}, Ll/ܺ᩸֫;->ܳ(Ljava/lang/String;JJ)Z

    move-result v9

    if-eqz v9, :cond_2

    const/4 v9, 0x1

    goto :goto_0

    :cond_2
    const/4 v9, 0x0

    .line 49
    :goto_0
    invoke-virtual {v8}, Ll/᩸۠ۜ;->ᩳ()Ljava/lang/Boolean;

    move-result-object v10

    if-gtz v19, :cond_4

    .line 52
    invoke-virtual {v2, v6, v1}, Ll/֨۠ۜ;->֫(Landroid/net/Uri;Ll/ܶ۠֫;)Ll/֡۠ۜ;

    move-result-object v2

    .line 53
    invoke-virtual {v2}, Ll/֡۠ۜ;->֫()J

    move-result-wide v3

    cmp-long v9, v3, v16

    if-lez v9, :cond_3

    if-eqz v5, :cond_3

    const-wide/16 v11, 0x0

    move-object v9, v5

    move-object v10, v15

    move-wide v13, v3

    .line 54
    invoke-virtual/range {v9 .. v14}, Ll/ܺ᩸֫;->ܳ(Ljava/lang/String;JJ)Z

    move-result v5

    if-eqz v5, :cond_3

    const/4 v5, 0x1

    const/4 v9, 0x1

    goto :goto_1

    :cond_3
    const/4 v5, 0x0

    const/4 v9, 0x0

    .line 55
    :goto_1
    invoke-virtual {v2}, Ll/֡۠ۜ;->ܽ()Z

    move-result v2

    goto :goto_2

    :cond_4
    if-nez v9, :cond_6

    if-eqz v10, :cond_5

    .line 58
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    .line 61
    :cond_5
    :try_start_2
    invoke-virtual {v2, v6, v1}, Ll/֨۠ۜ;->֫(Landroid/net/Uri;Ll/ܶ۠֫;)Ll/֡۠ۜ;

    move-result-object v2

    invoke-virtual {v2}, Ll/֡۠ۜ;->ܽ()Z

    move-result v2
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :catch_0
    const/4 v2, 0x0

    goto :goto_2

    :cond_6
    const/4 v2, 0x1

    :goto_2
    move-wide v4, v3

    if-nez v9, :cond_7

    if-nez v2, :cond_7

    .line 70
    :try_start_3
    invoke-virtual {v8}, Ll/᩸۠ۜ;->close()V

    goto :goto_6

    :cond_7
    cmp-long v3, v4, v16

    if-lez v3, :cond_a

    const-wide/16 v10, -0x1

    cmp-long v3, v4, v10

    if-nez v3, :cond_8

    goto :goto_4

    :cond_8
    if-eqz v2, :cond_9

    if-nez v9, :cond_9

    const/16 v18, 0x1

    const/4 v2, 0x1

    goto :goto_3

    :cond_9
    const/4 v2, 0x0

    .line 124
    :goto_3
    new-instance v3, Ll/ۢۗۜ;

    new-instance v9, Ll/ۜ᩸ܽ;

    invoke-direct {v9, v15}, Ll/ۜ᩸ܽ;-><init>(Ljava/lang/Object;)V

    invoke-direct {v3, v0, v1, v9}, Ll/ۢۗۜ;-><init>(Ll/᩻۬ۜ;Ll/ܶ۠֫;Ll/᩻ۗۜ;)V

    .line 126
    new-instance v1, Ll/ܿۗۜ;

    invoke-direct {v1, v0, v3, v15, v2}, Ll/ܿۗۜ;-><init>(Ll/᩻۬ۜ;Ll/ۢۗۜ;Ljava/lang/String;Z)V

    .line 80
    new-instance v9, Ll/ۡ۠ۜ;

    move-object v0, v9

    move-object/from16 v2, p1

    move-object v3, v15

    invoke-direct/range {v0 .. v5}, Ll/ۡ۠ۜ;-><init>(Ll/ܿۗۜ;Landroid/net/Uri;Ljava/lang/String;J)V

    .line 86
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    .line 85
    invoke-static {v0}, Ll/۫֡ۜ;->֫(Ljava/lang/String;)Z

    move-result v0

    .line 81
    invoke-static {v15, v9, v0}, Ll/۫֡ۜ;->֫(Ljava/lang/String;Ll/ۛ֡ۜ;Z)Ll/۫֡ۜ;

    move-result-object v0

    .line 87
    new-instance v1, Ll/ܺ۠ۜ;

    invoke-direct {v1, v8, v0}, Ll/ܺ۠ۜ;-><init>(Ll/᩸۠ۜ;Ll/۫֡ۜ;)V

    return-object v1

    .line 74
    :cond_a
    :goto_4
    invoke-virtual {v8}, Ll/᩸۠ۜ;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_6

    :catch_1
    nop

    goto :goto_5

    :catch_2
    move-object v8, v7

    :goto_5
    if-eqz v8, :cond_b

    .line 90
    invoke-virtual {v8}, Ll/᩸۠ۜ;->close()V

    :cond_b
    :goto_6
    return-object v7
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 104
    iget-object v0, p0, Ll/ܺ۠ۜ;->᩸:Ll/᩸۠ۜ;

    invoke-virtual {v0}, Ll/᩸۠ۜ;->close()V

    return-void
.end method

.method public final ֫()Ll/۫֡ۜ;
    .locals 1

    .line 98
    iget-object v0, p0, Ll/ܺ۠ۜ;->᩹:Ll/۫֡ۜ;

    return-object v0
.end method
