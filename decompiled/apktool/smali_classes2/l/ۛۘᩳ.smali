.class public final Ll/ۛۘᩳ;
.super Ljava/lang/Object;
.source "U6T0"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۜ:I

.field public final ۧ:Ljava/util/Map;

.field public final ܳ:Z

.field public final ܽ:I

.field public final ܿ:Z

.field public final ᩳ:Z

.field public final ᩻:I


# direct methods
.method public constructor <init>(ZZZIIILjava/lang/String;Ljava/util/HashMap;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-boolean p1, p0, Ll/ۛۘᩳ;->ܳ:Z

    iput-boolean p2, p0, Ll/ۛۘᩳ;->ᩳ:Z

    iput-boolean p3, p0, Ll/ۛۘᩳ;->ܿ:Z

    .line 25
    iput p4, p0, Ll/ۛۘᩳ;->ۜ:I

    iput p5, p0, Ll/ۛۘᩳ;->ܽ:I

    iput p6, p0, Ll/ۛۘᩳ;->᩻:I

    .line 26
    iput-object p7, p0, Ll/ۛۘᩳ;->֫:Ljava/lang/String;

    iput-object p8, p0, Ll/ۛۘᩳ;->ۧ:Ljava/util/Map;

    return-void
.end method

.method public static ֫(IJLjava/io/InputStream;)Ll/ۛۘᩳ;
    .locals 22

    move/from16 v0, p0

    .line 31
    invoke-static/range {p1 .. p3}, Ll/᩻᩶ᩳ;->֫(JLjava/io/InputStream;)Ll/᩻᩶ᩳ;

    move-result-object v1

    if-ltz v0, :cond_6

    int-to-long v2, v0

    cmp-long v4, p1, v2

    if-gtz v4, :cond_6

    .line 33
    :try_start_0
    invoke-virtual {v1}, Ll/᩻᩶ᩳ;->֫()Z

    move-result v2

    if-nez v2, :cond_0

    .line 34
    invoke-virtual {v1}, Ll/᩻᩶ᩳ;->ᩳ()V

    .line 35
    new-instance v0, Ll/ۛۘᩳ;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v11}, Ll/ۛۘᩳ;-><init>(ZZZIIILjava/lang/String;Ljava/util/HashMap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    invoke-virtual {v1}, Ll/᩻᩶ᩳ;->close()V

    return-object v0

    .line 37
    :cond_0
    :try_start_1
    invoke-virtual {v1}, Ll/᩻᩶ᩳ;->readByte()I

    move-result v16

    invoke-virtual {v1}, Ll/᩻᩶ᩳ;->ۛۧ()I

    move-result v17

    .line 38
    invoke-virtual {v1}, Ll/᩻᩶ᩳ;->֫()Z

    move-result v15

    invoke-virtual {v1}, Ll/᩻᩶ᩳ;->readByte()I

    .line 39
    invoke-virtual {v1}, Ll/᩻᩶ᩳ;->readInt()I

    move-result v18

    .line 40
    invoke-virtual {v1}, Ll/᩻᩶ᩳ;->֫()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1, v0}, Ll/᩻᩶ᩳ;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    move-object/from16 v19, v2

    .line 41
    invoke-virtual {v1}, Ll/᩻᩶ᩳ;->֫()Z

    move-result v14

    .line 61
    invoke-virtual {v1}, Ll/᩻᩶ᩳ;->readInt()I

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v3, "Invalid legacy attribute count"

    if-ltz v2, :cond_5

    int-to-long v4, v2

    .line 62
    :try_start_2
    invoke-virtual {v1}, Ll/᩻᩶ᩳ;->ܽ()J

    move-result-wide v6

    const/16 v8, 0x14

    int-to-long v8, v8

    div-long/2addr v6, v8

    cmp-long v8, v4, v6

    if-gtz v8, :cond_5

    .line 43
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v2, :cond_4

    .line 45
    invoke-virtual {v1, v0}, Ll/᩻᩶ᩳ;->ܽ(I)Ljava/lang/String;

    move-result-object v6

    .line 46
    invoke-virtual {v1}, Ll/᩻᩶ᩳ;->readInt()I

    move-result v7

    invoke-virtual {v1}, Ll/᩻᩶ᩳ;->readInt()I

    move-result v8

    .line 47
    invoke-virtual {v1, v0}, Ll/᩻᩶ᩳ;->ܽ(I)Ljava/lang/String;

    move-result-object v9

    .line 61
    invoke-virtual {v1}, Ll/᩻᩶ᩳ;->readInt()I

    move-result v10

    if-ltz v10, :cond_3

    int-to-long v11, v10

    .line 62
    invoke-virtual {v1}, Ll/᩻᩶ᩳ;->ܽ()J

    move-result-wide v20

    const/16 v13, 0xc

    move/from16 p1, v14

    int-to-long v13, v13

    div-long v20, v20, v13

    cmp-long v13, v11, v20

    if-gtz v13, :cond_3

    .line 48
    new-array v11, v10, [Ll/ܳᩳܽ;

    const/4 v12, 0x0

    :goto_2
    if-ge v12, v10, :cond_2

    .line 50
    new-instance v13, Ll/ܳᩳܽ;

    invoke-virtual {v1}, Ll/᩻᩶ᩳ;->readInt()I

    move-result v14

    move/from16 p2, v2

    invoke-virtual {v1}, Ll/᩻᩶ᩳ;->readInt()I

    move-result v2

    move/from16 p3, v10

    invoke-virtual {v1, v0}, Ll/᩻᩶ᩳ;->ܽ(I)Ljava/lang/String;

    move-result-object v10

    invoke-direct {v13, v14, v2, v10}, Ll/ܳᩳܽ;-><init>(IILjava/lang/String;)V

    aput-object v13, v11, v12

    add-int/lit8 v12, v12, 0x1

    move/from16 v2, p2

    move/from16 v10, p3

    goto :goto_2

    :cond_2
    move/from16 p2, v2

    .line 53
    new-instance v2, Ll/ܽᩳܽ;

    invoke-direct {v2, v7, v9, v11, v8}, Ll/ܽᩳܽ;-><init>(ILjava/lang/String;[Ll/ܳᩳܽ;I)V

    invoke-virtual {v4, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v5, v5, 0x1

    move/from16 v14, p1

    move/from16 v2, p2

    goto :goto_1

    .line 62
    :cond_3
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    move/from16 p1, v14

    .line 55
    invoke-virtual {v1}, Ll/᩻᩶ᩳ;->ᩳ()V

    .line 56
    new-instance v0, Ll/ۛۘᩳ;

    const/4 v13, 0x1

    move-object v12, v0

    move/from16 v14, p1

    move-object/from16 v20, v4

    invoke-direct/range {v12 .. v20}, Ll/ۛۘᩳ;-><init>(ZZZIIILjava/lang/String;Ljava/util/HashMap;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 57
    invoke-virtual {v1}, Ll/᩻᩶ᩳ;->close()V

    return-object v0

    .line 62
    :cond_5
    :try_start_3
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 32
    :cond_6
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Legacy parameters exceed app state limit"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 31
    :try_start_4
    invoke-virtual {v1}, Ll/᩻᩶ᩳ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v2
.end method


# virtual methods
.method public final ֫()Ll/᩺ܶᩳ;
    .locals 10

    .line 68
    iget-boolean v0, p0, Ll/ۛۘᩳ;->ܳ:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 69
    :cond_0
    iget-object v0, p0, Ll/ۛۘᩳ;->֫:Ljava/lang/String;

    if-nez v0, :cond_1

    move-object v7, v1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {v0, v2}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    move-object v7, v0

    .line 71
    :goto_0
    iget-boolean v0, p0, Ll/ۛۘᩳ;->ᩳ:Z

    if-eqz v0, :cond_3

    if-eqz v7, :cond_2

    .line 72
    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 73
    :try_start_0
    new-instance v0, Ll/۫ܽܽ;

    invoke-direct {v0, v7}, Ll/۫ܽܽ;-><init>(Ll/ܶ᩵ܿ;)V

    .line 125
    invoke-virtual {v0}, Ll/۫ܽܽ;->ۧ()Ll/ܿᩳܽ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    goto :goto_1

    :catchall_0
    nop

    :cond_2
    :goto_1
    if-nez v1, :cond_3

    .line 76
    new-instance v1, Ll/۫ܽܽ;

    invoke-direct {v1}, Ll/۫ܽܽ;-><init>()V

    :cond_3
    move-object v8, v1

    .line 78
    new-instance v0, Ll/᩺ܶᩳ;

    iget v6, p0, Ll/ۛۘᩳ;->᩻:I

    iget-object v9, p0, Ll/ۛۘᩳ;->ۧ:Ljava/util/Map;

    iget v3, p0, Ll/ۛۘᩳ;->ۜ:I

    iget v4, p0, Ll/ۛۘᩳ;->ܽ:I

    iget-boolean v5, p0, Ll/ۛۘᩳ;->ܿ:Z

    move-object v2, v0

    invoke-direct/range {v2 .. v9}, Ll/᩺ܶᩳ;-><init>(IIZILl/ܶ᩵ܿ;Ll/۫ܽܽ;Ljava/util/Map;)V

    return-object v0
.end method
