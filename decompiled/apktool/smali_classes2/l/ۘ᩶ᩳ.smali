.class public final Ll/ۘ᩶ᩳ;
.super Ljava/lang/Object;
.source "46SG"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ۗ:Z

.field public ۙ:Ll/ۖۙᩳ;

.field public ۛ:Z

.field public ۤ:Ll/ۖۗᩳ;

.field public final ۨ:Ll/᩸۬ᩳ;

.field public ۫:Z

.field public final ۬:Ll/᩺۬ᩳ;

.field public final ܰ:Ljava/lang/Thread;

.field public ᩶:Ll/۫᩶ᩳ;

.field public ᩸:Z

.field public final ᩹:Ll/᩷۠ᩴ;

.field public ᩺:Ll/ۨ᩹ᩳ;


# direct methods
.method public constructor <init>(Ll/᩸۬ᩳ;Ll/᩷۠ᩴ;)V
    .locals 1

    .line 180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 173
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Ll/ۘ᩶ᩳ;->ܰ:Ljava/lang/Thread;

    .line 175
    new-instance v0, Ll/ۖۙᩳ;

    invoke-direct {v0}, Ll/ۖۙᩳ;-><init>()V

    iput-object v0, p0, Ll/ۘ᩶ᩳ;->ۙ:Ll/ۖۙᩳ;

    const/4 v0, 0x1

    .line 178
    iput-boolean v0, p0, Ll/ۘ᩶ᩳ;->᩸:Z

    .line 181
    iput-object p1, p0, Ll/ۘ᩶ᩳ;->ۨ:Ll/᩸۬ᩳ;

    .line 182
    iput-object p2, p0, Ll/ۘ᩶ᩳ;->᩹:Ll/᩷۠ᩴ;

    sget-object p2, Ll/᩺۬ᩳ;->֫:Ll/᩺۬ᩳ;

    iput-object p2, p0, Ll/ۘ᩶ᩳ;->۬:Ll/᩺۬ᩳ;

    .line 183
    iget-object p1, p1, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    const/4 p2, 0x0

    new-array p2, p2, [B

    invoke-static {p1, p2}, Ll/ۖۗᩳ;->֫(Ll/֨۬ᩳ;[B)Ll/ۖۗᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۘ᩶ᩳ;->ۤ:Ll/ۖۗᩳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۘ᩶ᩳ;)Ll/ۖۙᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘ᩶ᩳ;->ۙ:Ll/ۖۙᩳ;

    return-object p0
.end method

.method private ֫()V
    .locals 2

    .line 298
    iget-boolean v0, p0, Ll/ۘ᩶ᩳ;->᩸:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ۘ᩶ᩳ;->ۛ:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۘ᩶ᩳ;->ܰ:Ljava/lang/Thread;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Migration writer is outside its converter callback or failed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static bridge synthetic ۧ(Ll/ۘ᩶ᩳ;)Ll/ۖۗᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘ᩶ᩳ;->ۤ:Ll/ۖۗᩳ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۘ᩶ᩳ;)Ll/ۨ᩹ᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘ᩶ᩳ;->᩺:Ll/ۨ᩹ᩳ;

    return-object p0
.end method

.method public static ᩳ(Ll/ۘ᩶ᩳ;)V
    .locals 14

    .line 302
    iget-object v0, p0, Ll/ۘ᩶ᩳ;->ۨ:Ll/᩸۬ᩳ;

    invoke-direct {p0}, Ll/ۘ᩶ᩳ;->֫()V

    .line 300
    iget-object v1, p0, Ll/ۘ᩶ᩳ;->᩺:Ll/ۨ᩹ᩳ;

    if-eqz v1, :cond_1

    .line 303
    iget-object v2, p0, Ll/ۘ᩶ᩳ;->ۙ:Ll/ۖۙᩳ;

    iget-object v2, v2, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    invoke-virtual {v1}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v1

    invoke-static {v2, v1}, Ll/ܳۗᩳ;->֫(Ll/ۢ۬ᩳ;I)V

    .line 304
    iget-object v1, p0, Ll/ۘ᩶ᩳ;->᩶:Ll/۫᩶ᩳ;

    if-nez v1, :cond_0

    .line 305
    new-instance v1, Ll/۫᩶ᩳ;

    iget-object v3, v0, Ll/᩸۬ᩳ;->ۧ֫:Ljava/util/UUID;

    iget-object v2, p0, Ll/ۘ᩶ᩳ;->ۤ:Ll/ۖۗᩳ;

    invoke-virtual {v2}, Ll/ۖۗᩳ;->֫()[B

    move-result-object v7

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, Ll/۫᩶ᩳ;-><init>(Ljava/util/UUID;J[B[B)V

    goto :goto_0

    .line 306
    :cond_0
    new-instance v2, Ll/۫᩶ᩳ;

    iget-object v9, v0, Ll/᩸۬ᩳ;->ۧ֫:Ljava/util/UUID;

    iget-wide v10, v1, Ll/۫᩶ᩳ;->ܽ:J

    iget-object v12, v1, Ll/۫᩶ᩳ;->ۧ:[B

    iget-object v1, p0, Ll/ۘ᩶ᩳ;->ۤ:Ll/ۖۗᩳ;

    invoke-virtual {v1}, Ll/ۖۗᩳ;->֫()[B

    move-result-object v13

    move-object v8, v2

    invoke-direct/range {v8 .. v13}, Ll/۫᩶ᩳ;-><init>(Ljava/util/UUID;J[B[B)V

    move-object v1, v2

    .line 307
    :goto_0
    iget-object v0, v0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    invoke-virtual {v1}, Ll/۫᩶ᩳ;->֫()[B

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۖۗᩳ;->֫(Ll/֨۬ᩳ;[B)Ll/ۖۗᩳ;

    move-result-object v0

    .line 308
    iget-object v1, p0, Ll/ۘ᩶ᩳ;->ۤ:Ll/ۖۗᩳ;

    invoke-virtual {v1}, Ll/ۖۗᩳ;->close()V

    iput-object v0, p0, Ll/ۘ᩶ᩳ;->ۤ:Ll/ۖۗᩳ;

    const/4 v0, 0x0

    .line 309
    iput-boolean v0, p0, Ll/ۘ᩶ᩳ;->᩸:Z

    return-void

    .line 300
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Legacy text has not been supplied"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 312
    iget-object v0, p0, Ll/ۘ᩶ᩳ;->ܰ:Ljava/lang/Thread;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    .line 313
    iput-boolean v0, p0, Ll/ۘ᩶ᩳ;->᩸:Z

    const/4 v0, 0x0

    .line 314
    iput-object v0, p0, Ll/ۘ᩶ᩳ;->᩺:Ll/ۨ᩹ᩳ;

    iput-object v0, p0, Ll/ۘ᩶ᩳ;->ۙ:Ll/ۖۙᩳ;

    .line 315
    iget-object v1, p0, Ll/ۘ᩶ᩳ;->ۤ:Ll/ۖۗᩳ;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ll/ۖۗᩳ;->close()V

    iput-object v0, p0, Ll/ۘ᩶ᩳ;->ۤ:Ll/ۖۗᩳ;

    :cond_0
    return-void

    .line 312
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Migration writer belongs to its converter thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(IILl/֫ܶܽ;)I
    .locals 19

    move-object/from16 v1, p0

    move/from16 v0, p1

    move/from16 v2, p2

    .line 266
    invoke-direct/range {p0 .. p0}, Ll/ۘ᩶ᩳ;->֫()V

    .line 300
    iget-object v3, v1, Ll/ۘ᩶ᩳ;->᩺:Ll/ۨ᩹ᩳ;

    if-eqz v3, :cond_a

    .line 267
    iget-boolean v4, v1, Ll/ۘ᩶ᩳ;->۫:Z

    if-nez v4, :cond_9

    .line 268
    iget-object v4, v1, Ll/ۘ᩶ᩳ;->ۙ:Ll/ۖۙᩳ;

    const/4 v5, 0x1

    if-lt v0, v5, :cond_8

    const/16 v5, 0x400

    if-gt v0, v5, :cond_8

    if-ltz v2, :cond_8

    if-ge v2, v0, :cond_8

    .line 22
    iget-object v5, v3, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    if-eqz v5, :cond_7

    .line 24
    iget v6, v5, Ll/᩸۬ᩳ;->ۗ:I

    iget v7, v5, Ll/᩸۬ᩳ;->ۤ:I

    invoke-static {v6, v7, v5}, Ll/ۨ᩹ᩳ;->֫(IILl/᩸۬ᩳ;)Ll/ۨ᩹ᩳ;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_0
    if-ge v7, v0, :cond_2

    const v9, 0x7fffffff

    if-ne v7, v2, :cond_0

    .line 29
    invoke-virtual {v6}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v8

    move-object/from16 v10, p3

    move-object v12, v3

    goto :goto_1

    :cond_0
    move-object/from16 v10, p3

    .line 32
    iget-object v11, v10, Ll/֫ܶܽ;->᩸:Ljava/lang/Object;

    check-cast v11, Ll/ۙۘᩳ;

    .line 208
    invoke-virtual {v11, v7}, Ll/ۙۘᩳ;->֫(I)Ljava/io/InputStream;

    move-result-object v11

    .line 32
    iget-object v12, v5, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    invoke-static {v11, v12}, Ll/֨᩶ᩳ;->֫(Ljava/io/InputStream;Ll/֨۬ᩳ;)Ll/֨᩶ᩳ;

    move-result-object v11

    .line 33
    :try_start_0
    invoke-virtual {v6}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v12

    sub-int v12, v9, v12

    const/4 v13, 0x0

    .line 16
    invoke-static {v11, v5, v12, v13}, Ll/᩶᩶ᩳ;->֫(Ljava/io/Reader;Ll/᩸۬ᩳ;ILl/᩹᩶ᩳ;)Ll/ۨ᩹ᩳ;

    move-result-object v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    invoke-virtual {v11}, Ll/֨᩶ᩳ;->close()V

    .line 36
    :goto_1
    invoke-virtual {v6}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v11

    int-to-long v13, v11

    invoke-virtual {v12}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v11

    move-object v15, v3

    int-to-long v2, v11

    add-long/2addr v13, v2

    int-to-long v2, v9

    cmp-long v9, v13, v2

    if-gtz v9, :cond_1

    .line 37
    invoke-virtual {v6, v12}, Ll/ۨ᩹ᩳ;->֫(Ll/ۨ᩹ᩳ;)Ll/ۨ᩹ᩳ;

    move-result-object v6

    add-int/lit8 v7, v7, 0x1

    move/from16 v2, p2

    move-object v3, v15

    goto :goto_0

    .line 36
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Legacy pages exceed migration coordinate limit"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 32
    :try_start_1
    invoke-virtual {v11}, Ll/֨᩶ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v2

    .line 44
    :cond_2
    new-instance v0, Ll/ۖۙᩳ;

    new-instance v10, Ll/ۢ۬ᩳ;

    invoke-direct {v10}, Ll/ۢ۬ᩳ;-><init>()V

    iget-object v2, v4, Ll/ۖۙᩳ;->ܿ:Ll/ۚۗᩳ;

    .line 49
    new-instance v11, Ll/ۚۗᩳ;

    invoke-virtual {v2}, Ll/ۚۗᩳ;->ܽ()I

    move-result v3

    const-string v5, "Legacy page coordinate exceeds limit"

    const-wide/32 v12, 0x7fffffff

    const/4 v7, -0x1

    if-ne v3, v7, :cond_3

    const/4 v3, -0x1

    move-object/from16 p1, v5

    move-object/from16 v18, v6

    goto :goto_3

    :cond_3
    int-to-long v14, v3

    move-object/from16 p1, v5

    move-object/from16 v18, v6

    int-to-long v5, v8

    add-long/2addr v14, v5

    cmp-long v5, v14, v12

    if-gtz v5, :cond_6

    add-int/2addr v3, v8

    :goto_3
    invoke-virtual {v2}, Ll/ۚۗᩳ;->֫()I

    move-result v2

    if-ne v2, v7, :cond_4

    goto :goto_4

    :cond_4
    int-to-long v5, v2

    int-to-long v14, v8

    add-long/2addr v5, v14

    cmp-long v7, v5, v12

    if-gtz v7, :cond_5

    add-int v7, v2, v8

    :goto_4
    invoke-direct {v11, v3, v7}, Ll/ۚۗᩳ;-><init>(II)V

    .line 44
    iget-wide v12, v4, Ll/ۖۙᩳ;->֫:J

    iget-wide v14, v4, Ll/ۖۙᩳ;->ᩳ:J

    iget-wide v2, v4, Ll/ۖۙᩳ;->ܽ:J

    move-object v9, v0

    move-wide/from16 v16, v2

    invoke-direct/range {v9 .. v17}, Ll/ۖۙᩳ;-><init>(Ll/ۢ۬ᩳ;Ll/ۚۗᩳ;JJJ)V

    .line 40
    new-instance v2, Ll/ۚ᩶ᩳ;

    move-object/from16 v6, v18

    invoke-direct {v2, v6, v0, v8}, Ll/ۚ᩶ᩳ;-><init>(Ll/ۨ᩹ᩳ;Ll/ۖۙᩳ;I)V

    .line 269
    invoke-virtual {v2}, Ll/ۚ᩶ᩳ;->ᩳ()Ll/ۨ᩹ᩳ;

    move-result-object v0

    iput-object v0, v1, Ll/ۘ᩶ᩳ;->᩺:Ll/ۨ᩹ᩳ;

    invoke-virtual {v2}, Ll/ۚ᩶ᩳ;->ܽ()Ll/ۖۙᩳ;

    move-result-object v0

    iput-object v0, v1, Ll/ۘ᩶ᩳ;->ۙ:Ll/ۖۙᩳ;

    const/4 v0, 0x1

    iput-boolean v0, v1, Ll/ۘ᩶ᩳ;->۫:Z

    .line 270
    invoke-virtual {v2}, Ll/ۚ᩶ᩳ;->֫()I

    move-result v0

    return v0

    .line 54
    :cond_5
    new-instance v0, Ljava/io/IOException;

    move-object/from16 v2, p1

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    move-object/from16 v2, p1

    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 23
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Legacy page migration requires a page store"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 20
    :cond_8
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Invalid legacy page manifest"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 267
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Legacy pages already joined"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 300
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Legacy text has not been supplied"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(JLjava/io/InputStream;)V
    .locals 8

    .line 289
    :try_start_0
    invoke-direct {p0}, Ll/ۘ᩶ᩳ;->֫()V

    .line 290
    iget-object v0, p0, Ll/ۘ᩶ᩳ;->᩶:Ll/۫᩶ᩳ;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 291
    iput-boolean v0, p0, Ll/ۘ᩶ᩳ;->ۛ:Z

    .line 292
    iget-object v1, p0, Ll/ۘ᩶ᩳ;->᩹:Ll/᩷۠ᩴ;

    iget-object v0, p0, Ll/ۘ᩶ᩳ;->ۨ:Ll/᩸۬ᩳ;

    iget-object v2, v0, Ll/᩸۬ᩳ;->ۧ֫:Ljava/util/UUID;

    iget-object v6, v0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v7, p0, Ll/ۘ᩶ᩳ;->۬:Ll/᩺۬ᩳ;

    move-object v3, p3

    move-wide v4, p1

    invoke-static/range {v1 .. v7}, Ll/ۛ᩶ᩳ;->֫(Ll/᩷۠ᩴ;Ljava/util/UUID;Ljava/io/InputStream;JLl/֨۬ᩳ;Ll/᩺۬ᩳ;)Ll/۫᩶ᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۘ᩶ᩳ;->᩶:Ll/۫᩶ᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 293
    invoke-virtual {p3}, Ljava/io/InputStream;->close()V

    const/4 p1, 0x0

    .line 294
    iput-boolean p1, p0, Ll/ۘ᩶ᩳ;->ۛ:Z

    return-void

    .line 290
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Migration state already supplied"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    .line 288
    :try_start_2
    invoke-virtual {p3}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final ֫(Ljava/io/InputStream;JLl/᩶ۘᩳ;I)V
    .locals 3

    .line 237
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p5

    const/4 v0, 0x1

    .line 243
    :try_start_0
    new-instance v1, Ll/᩻᩶ᩳ;

    invoke-direct {v1, p2, p3, p1}, Ll/᩻᩶ᩳ;-><init>(JLjava/io/InputStream;)V

    .line 244
    invoke-direct {p0}, Ll/ۘ᩶ᩳ;->֫()V

    .line 245
    iget-object p2, p0, Ll/ۘ᩶ᩳ;->᩺:Ll/ۨ᩹ᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p2, :cond_0

    .line 247
    :try_start_1
    iget-object p2, p0, Ll/ۘ᩶ᩳ;->ۨ:Ll/᩸۬ᩳ;

    new-instance p3, Ll/ۘ᩹ܽ;

    const/4 v2, 0x2

    invoke-direct {p3, v2, p4}, Ll/ۘ᩹ܽ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, p2, p3, p5}, Ll/᩻᩶ᩳ;->֫(Ll/᩸۬ᩳ;Ll/ۘ᩹ܽ;Ljava/lang/Integer;)Ll/ۨ᩹ᩳ;

    move-result-object p2
    :try_end_1
    .catch Ll/ۙ᩶ᩳ; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 249
    :try_start_2
    invoke-virtual {v1}, Ll/᩻᩶ᩳ;->ᩳ()V

    .line 250
    iput-object p2, p0, Ll/ۘ᩶ᩳ;->᩺:Ll/ۨ᩹ᩳ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 251
    check-cast p1, Ll/᩷᩶ᩳ;

    .line 216
    iput-boolean v0, p1, Ll/᩷᩶ᩳ;->᩸:Z

    return-void

    :catch_0
    move-exception p2

    .line 248
    :try_start_3
    iput-boolean v0, p0, Ll/ۘ᩶ᩳ;->ۛ:Z

    throw p2

    .line 245
    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string p3, "Legacy text already supplied"

    invoke-direct {p2, p3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p2

    .line 241
    :try_start_4
    check-cast p1, Ll/᩷᩶ᩳ;

    .line 216
    iput-boolean v0, p1, Ll/᩷᩶ᩳ;->᩸:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    .line 241
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p2
.end method

.method public final ֫(Ll/ۚۗᩳ;II)V
    .locals 11

    .line 256
    invoke-direct {p0}, Ll/ۘ᩶ᩳ;->֫()V

    .line 300
    iget-object v0, p0, Ll/ۘ᩶ᩳ;->᩺:Ll/ۨ᩹ᩳ;

    if-eqz v0, :cond_2

    .line 257
    iget-boolean v0, p0, Ll/ۘ᩶ᩳ;->ۗ:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/ۘ᩶ᩳ;->۫:Z

    if-nez v0, :cond_1

    .line 258
    invoke-virtual {p1}, Ll/ۚۗᩳ;->ܽ()I

    move-result v0

    iget-object v1, p0, Ll/ۘ᩶ᩳ;->᩺:Ll/ۨ᩹ᩳ;

    invoke-virtual {v1}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v1

    if-gt v0, v1, :cond_0

    invoke-virtual {p1}, Ll/ۚۗᩳ;->֫()I

    move-result v0

    iget-object v1, p0, Ll/ۘ᩶ᩳ;->᩺:Ll/ۨ᩹ᩳ;

    invoke-virtual {v1}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v1

    if-gt v0, v1, :cond_0

    .line 259
    new-instance v0, Ll/ۖۙᩳ;

    new-instance v3, Ll/ۢ۬ᩳ;

    invoke-direct {v3}, Ll/ۢ۬ᩳ;-><init>()V

    int-to-long v1, p2

    const-wide v4, 0xffffffffL

    and-long v6, v1, v4

    int-to-long p2, p3

    and-long/2addr p2, v4

    const-wide/32 v9, 0x1000000

    move-object v2, v0

    move-object v4, p1

    move-wide v5, v6

    move-wide v7, p2

    .line 260
    invoke-direct/range {v2 .. v10}, Ll/ۖۙᩳ;-><init>(Ll/ۢ۬ᩳ;Ll/ۚۗᩳ;JJJ)V

    iput-object v0, p0, Ll/ۘ᩶ᩳ;->ۙ:Ll/ۖۙᩳ;

    const/4 p1, 0x1

    .line 261
    iput-boolean p1, p0, Ll/ۘ᩶ᩳ;->ۗ:Z

    return-void

    .line 258
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Legacy selection exceeds text"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 257
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Legacy history already supplied or pages joined"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 300
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Legacy text has not been supplied"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۡ᩶ᩳ;Ll/᩶ۘᩳ;IILl/ۙۘᩳ;[B)V
    .locals 9

    .line 199
    invoke-direct {p0}, Ll/ۘ᩶ᩳ;->֫()V

    .line 200
    iget-object v0, p0, Ll/ۘ᩶ᩳ;->᩺:Ll/ۨ᩹ᩳ;

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/ۘ᩶ᩳ;->᩶:Ll/۫᩶ᩳ;

    if-nez v0, :cond_4

    const/4 v0, 0x1

    if-lt p3, v0, :cond_3

    const/16 v1, 0x400

    if-gt p3, v1, :cond_3

    if-ltz p4, :cond_3

    if-ge p4, p3, :cond_3

    .line 204
    :try_start_0
    invoke-virtual {p1}, Ll/ۡ᩶ᩳ;->᩵()Ll/ۢ᩶ᩳ;

    move-result-object v1

    .line 197
    iget-object v2, v1, Ll/ۢ᩶ᩳ;->ܽ:Ll/ۡ᩶ᩳ;

    invoke-static {v2}, Ll/ۡ᩶ᩳ;->ۧ(Ll/ۡ᩶ᩳ;)V

    .line 198
    new-instance v4, Ll/᩷᩶ᩳ;

    invoke-direct {v4, v1}, Ll/᩷᩶ᩳ;-><init>(Ll/ۢ᩶ᩳ;)V

    .line 204
    invoke-virtual {p1}, Ll/ۡ᩶ᩳ;->᩵()Ll/ۢ᩶ᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ᩶ᩳ;->֫()J

    move-result-wide v5

    invoke-virtual {p1}, Ll/ۡ᩶ᩳ;->ᩳ()I

    move-result v8

    move-object v3, p0

    move-object v7, p2

    invoke-virtual/range {v3 .. v8}, Ll/ۘ᩶ᩳ;->֫(Ljava/io/InputStream;JLl/᩶ۘᩳ;I)V

    .line 205
    iget-object p2, p0, Ll/ۘ᩶ᩳ;->᩺:Ll/ۨ᩹ᩳ;

    invoke-virtual {p2}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result p2

    .line 207
    invoke-virtual {p1}, Ll/ۡ᩶ᩳ;->ᩴ()Ll/ۚۗᩳ;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۡ᩶ᩳ;->ܽ()I

    move-result v2

    invoke-virtual {p1}, Ll/ۡ᩶ᩳ;->᩻()I

    move-result v3

    invoke-virtual {p0, v1, v2, v3}, Ll/ۘ᩶ᩳ;->֫(Ll/ۚۗᩳ;II)V

    .line 208
    new-instance v1, Ll/֫ܶܽ;

    invoke-direct {v1, p5}, Ll/֫ܶܽ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, p3, p4, v1}, Ll/ۘ᩶ᩳ;->֫(IILl/֫ܶܽ;)I

    move-result p3

    .line 209
    new-instance p4, Ll/۫᩹ᩳ;

    iget-object p5, p0, Ll/ۘ᩶ᩳ;->᩺:Ll/ۨ᩹ᩳ;

    const-wide/16 v1, 0x0

    invoke-direct {p4, p5, v1, v2}, Ll/۫᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    .line 210
    :try_start_1
    new-instance p5, Ll/֡᩶ᩳ;

    invoke-direct {p5, p4, p3, p2}, Ll/֡᩶ᩳ;-><init>(Ll/۫᩹ᩳ;II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    const/4 v1, 0x7

    .line 211
    :try_start_2
    invoke-virtual {p1, v1}, Ll/ۡ᩶ᩳ;->֫(I)Ll/ۢ᩶ᩳ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 213
    new-instance v2, Ll/᩻᩶ᩳ;

    .line 197
    iget-object v3, v1, Ll/ۢ᩶ᩳ;->ܽ:Ll/ۡ᩶ᩳ;

    invoke-static {v3}, Ll/ۡ᩶ᩳ;->ۧ(Ll/ۡ᩶ᩳ;)V

    .line 198
    new-instance v3, Ll/᩷᩶ᩳ;

    invoke-direct {v3, v1}, Ll/᩷᩶ᩳ;-><init>(Ll/ۢ᩶ᩳ;)V

    .line 213
    invoke-virtual {v1}, Ll/ۢ᩶ᩳ;->֫()J

    move-result-wide v4

    invoke-direct {v2, v4, v5, v3}, Ll/᩻᩶ᩳ;-><init>(JLjava/io/InputStream;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 214
    :try_start_3
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->readInt()I

    move-result v1

    invoke-virtual {p5, v1}, Ll/֡᩶ᩳ;->֫(I)I

    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->readInt()I

    move-result v1

    invoke-virtual {p5, v1}, Ll/֡᩶ᩳ;->֫(I)I

    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->ᩳ()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 215
    :try_start_4
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 213
    :try_start_5
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    :try_start_6
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1

    .line 217
    :cond_0
    :goto_1
    invoke-virtual {p1}, Ll/ۡ᩶ᩳ;->֫()Ll/ۢ᩶ᩳ;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۡ᩶ᩳ;->ܳ()Ll/ۢ᩶ᩳ;

    move-result-object v2

    const/4 v3, 0x2

    new-array v4, v3, [Ll/ۢ᩶ᩳ;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    aput-object v2, v4, v0

    :goto_2
    if-ge v5, v3, :cond_2

    aget-object v1, v4, v5

    if-eqz v1, :cond_1

    .line 197
    iget-object v2, v1, Ll/ۢ᩶ᩳ;->ܽ:Ll/ۡ᩶ᩳ;

    invoke-static {v2}, Ll/ۡ᩶ᩳ;->ۧ(Ll/ۡ᩶ᩳ;)V

    .line 198
    new-instance v2, Ll/᩷᩶ᩳ;

    invoke-direct {v2, v1}, Ll/᩷᩶ᩳ;-><init>(Ll/ۢ᩶ᩳ;)V

    .line 218
    invoke-virtual {v1}, Ll/ۢ᩶ᩳ;->֫()J

    move-result-wide v6

    new-instance v1, Ll/ۡܽܳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p5, v2, v6, v7, v1}, Ll/֡᩶ᩳ;->֫(Ljava/io/InputStream;JLl/᩵᩶ᩳ;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 220
    :cond_2
    :try_start_7
    invoke-virtual {p5}, Ll/֡᩶ᩳ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    :try_start_8
    invoke-virtual {p4}, Ll/۬᩹ᩳ;->close()V

    .line 221
    iget-object p4, p0, Ll/ۘ᩶ᩳ;->ۨ:Ll/᩸۬ᩳ;

    iget-object p4, p4, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    invoke-static {p1, p3, p2, p6, p4}, Ll/ܿ᩶ᩳ;->֫(Ll/ۡ᩶ᩳ;II[BLl/֨۬ᩳ;)Ll/ܿ᩶ᩳ;

    move-result-object p1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/Error; {:try_start_8 .. :try_end_8} :catch_0

    .line 222
    :try_start_9
    invoke-virtual {p1}, Ll/ܿ᩶ᩳ;->֫()Ljava/io/InputStream;

    move-result-object p2

    invoke-virtual {p1}, Ll/ܿ᩶ᩳ;->length()J

    move-result-wide p3

    invoke-virtual {p0, p3, p4, p2}, Ll/ۘ᩶ᩳ;->֫(JLjava/io/InputStream;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 223
    :try_start_a
    invoke-virtual {p1}, Ll/ܿ᩶ᩳ;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_1
    .catch Ljava/lang/Error; {:try_start_a .. :try_end_a} :catch_0

    return-void

    :catchall_2
    move-exception p2

    .line 221
    :try_start_b
    invoke-virtual {p1}, Ll/ܿ᩶ᩳ;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception p1

    :try_start_c
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p2
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_c .. :try_end_c} :catch_1
    .catch Ljava/lang/Error; {:try_start_c .. :try_end_c} :catch_0

    :catchall_4
    move-exception p1

    .line 209
    :try_start_d
    invoke-virtual {p5}, Ll/֡᩶ᩳ;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    goto :goto_4

    :catchall_5
    move-exception p2

    :try_start_e
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    :catchall_6
    move-exception p1

    :try_start_f
    invoke-virtual {p4}, Ll/۬᩹ᩳ;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    goto :goto_5

    :catchall_7
    move-exception p2

    :try_start_10
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw p1

    :catch_0
    move-exception p1

    goto :goto_6

    :catch_1
    move-exception p1

    goto :goto_6

    :catch_2
    move-exception p1

    goto :goto_6

    .line 203
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid legacy page manifest"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_10 .. :try_end_10} :catch_1
    .catch Ljava/lang/Error; {:try_start_10 .. :try_end_10} :catch_0

    .line 225
    :goto_6
    iput-boolean v0, p0, Ll/ۘ᩶ᩳ;->ۛ:Z

    .line 226
    throw p1

    .line 200
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Legacy editor state already supplied"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
