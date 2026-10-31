.class public final Ll/᩺ۚ᩵;
.super Ljava/lang/Object;
.source "7A20"

# interfaces
.implements Ll/ܰۚ᩵;


# static fields
.field public static final ܰ:Ll/֫᩻֨;


# instance fields
.field public volatile ۗ:Z

.field public ۙ:Ll/۟ۚ᩵;

.field public final ۛ:Z

.field public final ۤ:Ll/ۨۚ᩵;

.field public ۨ:Ll/ۘ֨᩵;

.field public ۫:Ll/֫֨᩵;

.field public final ۬:I

.field public ᩶:Ll/۫ۚ᩵;

.field public final ᩸:I

.field public final ᩹:Z

.field public final ᩺:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 46
    const-class v0, Ll/᩺ۚ᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/᩺ۚ᩵;->ܰ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/ۨۚ᩵;)V
    .locals 4

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 54
    iput-boolean v0, p0, Ll/᩺ۚ᩵;->ۗ:Z

    .line 71
    iput-object p1, p0, Ll/᩺ۚ᩵;->ۤ:Ll/ۨۚ᩵;

    .line 72
    invoke-virtual {p1}, Ll/ۨۚ᩵;->ᩴ()I

    move-result v1

    const/16 v2, 0x200

    and-int/2addr v1, v2

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Ll/᩺ۚ᩵;->ۛ:Z

    .line 73
    iput-boolean v3, p0, Ll/᩺ۚ᩵;->᩹:Z

    .line 74
    invoke-virtual {p1}, Ll/ۨۚ᩵;->ᩴ()I

    move-result v0

    const v1, -0xff01

    and-int/2addr v0, v1

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Ll/᩺ۚ᩵;->۬:I

    .line 75
    invoke-virtual {p1}, Ll/ۨۚ᩵;->ᩴ()I

    move-result v0

    and-int/lit8 v0, v0, 0x7

    const/high16 v1, 0x20000

    or-int/2addr v0, v1

    iput v0, p0, Ll/᩺ۚ᩵;->᩸:I

    .line 732
    iget-object p1, p1, Ll/۬ۚ᩵;->᩶:Ll/ᩳ֨᩵;

    invoke-virtual {p1}, Ll/ᩳ֨᩵;->᩷()Ljava/lang/String;

    move-result-object p1

    .line 76
    iput-object p1, p0, Ll/᩺ۚ᩵;->᩺:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 310
    :try_start_0
    invoke-virtual {p0}, Ll/᩺ۚ᩵;->isOpen()Z

    move-result v1

    const/4 v2, 0x0

    .line 311
    iput-boolean v2, p0, Ll/᩺ۚ᩵;->ۗ:Z

    .line 312
    iget-object v2, p0, Ll/᩺ۚ᩵;->ۙ:Ll/۟ۚ᩵;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 313
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    iput-object v3, p0, Ll/᩺ۚ᩵;->ۙ:Ll/۟ۚ᩵;

    .line 317
    :cond_0
    iget-object v2, p0, Ll/᩺ۚ᩵;->۫:Ll/֫֨᩵;

    if-eqz v2, :cond_1

    .line 318
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    iput-object v3, p0, Ll/᩺ۚ᩵;->۫:Ll/֫֨᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_1
    if-eqz v1, :cond_2

    .line 324
    :try_start_1
    iget-object v1, p0, Ll/᩺ۚ᩵;->᩶:Ll/۫ۚ᩵;

    .line 227
    invoke-virtual {v1}, Ll/۫ۚ᩵;->ۘ()V

    goto :goto_0

    .line 325
    :cond_2
    iget-object v1, p0, Ll/᩺ۚ᩵;->᩶:Ll/۫ۚ᩵;

    if-eqz v1, :cond_3

    .line 326
    invoke-virtual {v1}, Ll/۫ۚ᩵;->ۘ()V

    .line 328
    :cond_3
    :goto_0
    iput-object v3, p0, Ll/᩺ۚ᩵;->᩶:Ll/۫ۚ᩵;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 330
    :try_start_2
    iget-object v1, p0, Ll/᩺ۚ᩵;->ۨ:Ll/ۘ֨᩵;

    if-eqz v1, :cond_4

    .line 331
    invoke-virtual {v1}, Ll/ۘ֨᩵;->᩹()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 334
    :cond_4
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    .line 330
    :try_start_3
    iget-object v2, p0, Ll/᩺ۚ᩵;->ۨ:Ll/ۘ֨᩵;

    if-eqz v2, :cond_5

    .line 331
    invoke-virtual {v2}, Ll/ۘ֨᩵;->᩹()V

    .line 333
    :cond_5
    throw v1

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1
.end method

.method public final isOpen()Z
    .locals 1

    .line 128
    iget-boolean v0, p0, Ll/᩺ۚ᩵;->ۗ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩺ۚ᩵;->᩶:Ll/۫ۚ᩵;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/۫ۚ᩵;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(I[BI[BI)I
    .locals 14

    move-object v1, p0

    move v0, p1

    move-object/from16 v5, p2

    move/from16 v7, p3

    move-object/from16 v8, p4

    .line 246
    invoke-virtual {p0}, Ll/᩺ۚ᩵;->֫()Ll/۫ۚ᩵;

    move-result-object v9

    .line 247
    :try_start_0
    invoke-virtual {v9}, Ll/۫ۚ᩵;->᩻()Ll/ۘ֨᩵;

    move-result-object v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 249
    :try_start_1
    invoke-virtual {v10}, Ll/ۘ֨᩵;->᩸()Z

    move-result v2

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eqz v2, :cond_0

    .line 250
    new-instance v2, Ll/ۖ᩵᩵;

    invoke-virtual {v10}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v3

    invoke-virtual {v9}, Ll/۫ۚ᩵;->ܳ()[B

    move-result-object v4

    invoke-direct {v2, v3, v4, v8}, Ll/ۖ᩵᩵;-><init>(Ll/֨ۡ᩵;[B[B)V

    .line 251
    invoke-virtual {v2}, Ll/ۖ᩵᩵;->ۘ֫()V

    .line 252
    new-instance v3, Ll/᩶֨᩵;

    invoke-direct {v3, v5, p1, v7}, Ll/᩶֨᩵;-><init>([BII)V

    invoke-virtual {v2, v3}, Ll/ۖ᩵᩵;->֫(Ll/᩹ۡ᩵;)V

    move/from16 v0, p5

    .line 253
    invoke-virtual {v2, v0}, Ll/ۖ᩵᩵;->ܺ(I)V

    new-array v0, v11, [Ll/֡ۚ᩵;

    .line 254
    sget-object v3, Ll/֡ۚ᩵;->᩶:Ll/֡ۚ᩵;

    aput-object v3, v0, v12

    const/4 v3, 0x0

    .line 115
    invoke-virtual {v10, v2, v3, v0}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    move-result-object v0

    .line 254
    check-cast v0, Ll/ۘ᩵᩵;

    .line 255
    invoke-virtual {v0}, Ll/ۘ᩵᩵;->ۚ֫()I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 275
    :try_start_2
    invoke-virtual {v10}, Ll/ۘ֨᩵;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 227
    invoke-virtual {v9}, Ll/۫ۚ᩵;->ۘ()V

    return v0

    .line 256
    :cond_0
    :try_start_3
    iget-boolean v2, v1, Ll/᩺ۚ᩵;->ۛ:Z

    if-eqz v2, :cond_2

    .line 257
    new-instance v13, Ll/ۢᩴ᩵;

    invoke-virtual {v10}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v3

    invoke-virtual {v9}, Ll/۫ۚ᩵;->ᩳ()I

    move-result v4

    move-object v2, v13

    move-object/from16 v5, p2

    move v6, p1

    move/from16 v7, p3

    invoke-direct/range {v2 .. v7}, Ll/ۢᩴ᩵;-><init>(Ll/֨ۡ᩵;I[BII)V

    .line 258
    new-instance v0, Ll/ۡᩴ᩵;

    invoke-virtual {v10}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v2

    invoke-direct {v0, v2, v8}, Ll/ۡᩴ᩵;-><init>(Ll/֨ۡ᩵;[B)V

    .line 299
    iget-object v2, v1, Ll/᩺ۚ᩵;->ۤ:Ll/ۨۚ᩵;

    invoke-virtual {v2}, Ll/ۨۚ᩵;->ᩴ()I

    move-result v2

    const/16 v3, 0x600

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_1

    .line 260
    invoke-virtual {v13}, Ll/ᩳᩴ᩵;->ۖ֫()V

    :cond_1
    new-array v2, v11, [Ll/֡ۚ᩵;

    .line 262
    sget-object v3, Ll/֡ۚ᩵;->᩶:Ll/֡ۚ᩵;

    aput-object v3, v2, v12

    invoke-virtual {v10, v13, v0, v2}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    .line 263
    invoke-virtual {v0}, Ll/ۡᩴ᩵;->֡֫()I

    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 275
    :try_start_4
    invoke-virtual {v10}, Ll/ۘ֨᩵;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 227
    invoke-virtual {v9}, Ll/۫ۚ᩵;->ۘ()V

    return v0

    .line 264
    :cond_2
    :try_start_5
    iget-boolean v2, v1, Ll/᩺ۚ᩵;->᩹:Z

    if-eqz v2, :cond_3

    .line 265
    new-instance v2, Ll/ܺᩴ᩵;

    invoke-virtual {v10}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v3

    iget-object v4, v1, Ll/᩺ۚ᩵;->᩺:Ljava/lang/String;

    invoke-direct {v2, v4, v3}, Ll/ܺᩴ᩵;-><init>(Ljava/lang/String;Ll/֨ۡ᩵;)V

    new-instance v3, Ll/ۖᩴ᩵;

    invoke-virtual {v10}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v4

    invoke-direct {v3, v4}, Ll/ۖᩴ᩵;-><init>(Ll/֨ۡ᩵;)V

    new-array v4, v12, [Ll/֡ۚ᩵;

    invoke-virtual {v10, v2, v3, v4}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    .line 266
    new-instance v11, Ll/᩻ᩴ᩵;

    invoke-virtual {v10}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v2

    invoke-direct {v11, v2, v8}, Ll/᩻ᩴ᩵;-><init>(Ll/֨ۡ᩵;[B)V

    .line 267
    new-instance v8, Ll/ܳᩴ᩵;

    invoke-virtual {v10}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v3

    iget-object v4, v1, Ll/᩺ۚ᩵;->᩺:Ljava/lang/String;

    move-object v2, v8

    move-object/from16 v5, p2

    move v6, p1

    move/from16 v7, p3

    invoke-direct/range {v2 .. v7}, Ll/ܳᩴ᩵;-><init>(Ll/֨ۡ᩵;Ljava/lang/String;[BII)V

    new-array v0, v12, [Ll/֡ۚ᩵;

    invoke-virtual {v10, v8, v11, v0}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    .line 268
    invoke-virtual {v11}, Ll/᩻ᩴ᩵;->֡֫()I

    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 275
    :try_start_6
    invoke-virtual {v10}, Ll/ۘ֨᩵;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 227
    invoke-virtual {v9}, Ll/۫ۚ᩵;->ۘ()V

    return v0

    .line 270
    :cond_3
    :try_start_7
    invoke-virtual {p0}, Ll/᩺ۚ᩵;->ܳ()Ll/֫֨᩵;

    move-result-object v2

    .line 271
    invoke-virtual {p0}, Ll/᩺ۚ᩵;->ᩳ()Ll/۟ۚ᩵;

    move-result-object v3

    .line 283
    invoke-virtual {v2, p1, v5, v7, v12}, Ll/ۛۚ᩵;->ۧ(I[BII)V

    .line 273
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    array-length v0, v8

    .line 267
    invoke-virtual {v3, v12, v0, v8}, Ll/ۤۚ᩵;->ܿ(II[B)I

    move-result v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 275
    :try_start_8
    invoke-virtual {v10}, Ll/ۘ֨᩵;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 227
    invoke-virtual {v9}, Ll/۫ۚ᩵;->ۘ()V

    return v0

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 246
    :try_start_9
    invoke-virtual {v10}, Ll/ۘ֨᩵;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_a
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :catchall_2
    move-exception v0

    move-object v2, v0

    .line 227
    :try_start_b
    invoke-virtual {v9}, Ll/۫ۚ᩵;->ۘ()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v0

    move-object v3, v0

    .line 246
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v2
.end method

.method public final declared-synchronized ֫()Ll/۫ۚ᩵;
    .locals 11

    const-string v1, "\\pipe"

    move-object v0, p0

    .line 3
    monitor-enter v0

    .line 159
    :try_start_0
    iget-boolean v2, p0, Ll/᩺ۚ᩵;->ۗ:Z

    if-eqz v2, :cond_5

    .line 163
    invoke-virtual {p0}, Ll/᩺ۚ᩵;->isOpen()Z

    move-result v2

    if-nez v2, :cond_4

    .line 164
    invoke-virtual {p0}, Ll/᩺ۚ᩵;->ܽ()Ll/ۘ֨᩵;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 166
    :try_start_1
    invoke-virtual {v2}, Ll/ۘ֨᩵;->᩸()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 167
    iget-object v4, p0, Ll/᩺ۚ᩵;->ۤ:Ll/ۨۚ᩵;

    iget-object v5, p0, Ll/᩺ۚ᩵;->᩺:Ljava/lang/String;

    iget v7, p0, Ll/᩺ۚ᩵;->᩸:I

    const/16 v9, 0x80

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x7

    invoke-virtual/range {v4 .. v10}, Ll/۬ۚ᩵;->֫(Ljava/lang/String;IIIII)Ll/۫ۚ᩵;

    move-result-object v1

    iput-object v1, p0, Ll/᩺ۚ᩵;->᩶:Ll/۫ۚ᩵;

    .line 168
    invoke-virtual {v1}, Ll/۫ۚ᩵;->֫()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 185
    :try_start_2
    invoke-virtual {v2}, Ll/ۘ֨᩵;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 168
    monitor-exit v0

    return-object v1

    .line 172
    :cond_0
    :try_start_3
    iget-object v3, p0, Ll/᩺ۚ᩵;->᩺:Ljava/lang/String;

    const-string v4, "\\pipe\\"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 173
    new-instance v3, Ll/ܺᩴ᩵;

    invoke-virtual {v2}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v4

    iget-object v5, p0, Ll/᩺ۚ᩵;->᩺:Ljava/lang/String;

    invoke-direct {v3, v5, v4}, Ll/ܺᩴ᩵;-><init>(Ljava/lang/String;Ll/֨ۡ᩵;)V

    new-instance v4, Ll/ۖᩴ᩵;

    invoke-virtual {v2}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v5

    invoke-direct {v4, v5}, Ll/ۖᩴ᩵;-><init>(Ll/֨ۡ᩵;)V

    const/4 v5, 0x0

    new-array v5, v5, [Ll/֡ۚ᩵;

    invoke-virtual {v2, v3, v4, v5}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    :cond_1
    const/16 v3, 0x10

    .line 176
    invoke-virtual {v2, v3}, Ll/ۘ֨᩵;->֫(I)Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v3, p0, Ll/᩺ۚ᩵;->᩺:Ljava/lang/String;

    const-string v4, "\\pipe\\"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    .line 180
    :cond_2
    iget-object v4, p0, Ll/᩺ۚ᩵;->ۤ:Ll/ۨۚ᩵;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 117
    iget-object v1, p0, Ll/᩺ۚ᩵;->᩺:Ljava/lang/String;

    .line 181
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    iget v6, p0, Ll/᩺ۚ᩵;->۬:I

    iget v7, p0, Ll/᩺ۚ᩵;->᩸:I

    const/16 v9, 0x80

    const/4 v10, 0x0

    const/4 v8, 0x7

    invoke-virtual/range {v4 .. v10}, Ll/۬ۚ᩵;->֫(Ljava/lang/String;IIIII)Ll/۫ۚ᩵;

    move-result-object v1

    iput-object v1, p0, Ll/᩺ۚ᩵;->᩶:Ll/۫ۚ᩵;

    goto :goto_1

    .line 177
    :cond_3
    :goto_0
    iget-object v3, p0, Ll/᩺ۚ᩵;->ۤ:Ll/ۨۚ᩵;

    iget v4, p0, Ll/᩺ۚ᩵;->۬:I

    iget v5, p0, Ll/᩺ۚ᩵;->᩸:I

    const/16 v7, 0x80

    const/4 v8, 0x0

    const/4 v6, 0x7

    invoke-virtual/range {v3 .. v8}, Ll/۬ۚ᩵;->֫(IIIII)Ll/۫ۚ᩵;

    move-result-object v1

    iput-object v1, p0, Ll/᩺ۚ᩵;->᩶:Ll/۫ۚ᩵;

    .line 184
    :goto_1
    iget-object v1, p0, Ll/᩺ۚ᩵;->᩶:Ll/۫ۚ᩵;

    invoke-virtual {v1}, Ll/۫ۚ᩵;->֫()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 185
    :try_start_4
    invoke-virtual {v2}, Ll/ۘ֨᩵;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 184
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 164
    :try_start_5
    invoke-virtual {v2}, Ll/ۘ֨᩵;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v2

    :try_start_6
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1

    .line 188
    :cond_4
    sget-object v1, Ll/᩺ۚ᩵;->ܰ:Ll/֫᩻֨;

    const-string v2, "Pipe already open"

    invoke-interface {v1, v2}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 189
    iget-object v1, p0, Ll/᩺ۚ᩵;->᩶:Ll/۫ۚ᩵;

    invoke-virtual {v1}, Ll/۫ۚ᩵;->֫()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    monitor-exit v0

    return-object v1

    .line 160
    :cond_5
    :try_start_7
    new-instance v1, Ll/ۗۚ᩵;

    const-string v2, "Pipe handle already closed"

    invoke-direct {v1, v2}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_2
    move-exception v1

    .line 189
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    throw v1
.end method

.method public final ֫(II[B)V
    .locals 2

    .line 288
    invoke-virtual {p0}, Ll/᩺ۚ᩵;->ܳ()Ll/֫֨᩵;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p3, p2, v1}, Ll/ۛۚ᩵;->ۧ(I[BII)V

    return-void
.end method

.method public final ۛ֫()Z
    .locals 1

    .line 153
    iget-boolean v0, p0, Ll/᩺ۚ᩵;->ۗ:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/᩺ۚ᩵;->᩶:Ll/۫ۚ᩵;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/۫ۚ᩵;->ۜ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 1

    .line 117
    iget-object v0, p0, Ll/᩺ۚ᩵;->᩺:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()Ll/ܰۚ᩵;
    .locals 2

    .line 2
    const-class v0, Ll/ܰۚ᩵;

    .line 88
    const-class v1, Ll/᩺ۚ᩵;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 91
    :cond_0
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0
.end method

.method public final ܳ()Ll/֫֨᩵;
    .locals 2

    .line 223
    iget-boolean v0, p0, Ll/᩺ۚ᩵;->ۗ:Z

    if-eqz v0, :cond_1

    .line 227
    iget-object v0, p0, Ll/᩺ۚ᩵;->۫:Ll/֫֨᩵;

    if-eqz v0, :cond_0

    return-object v0

    .line 231
    :cond_0
    invoke-virtual {p0}, Ll/᩺ۚ᩵;->ܽ()Ll/ۘ֨᩵;

    move-result-object v0

    .line 232
    :try_start_0
    new-instance v1, Ll/֫֨᩵;

    invoke-direct {v1, p0, v0}, Ll/֫֨᩵;-><init>(Ll/᩺ۚ᩵;Ll/ۘ֨᩵;)V

    iput-object v1, p0, Ll/᩺ۚ᩵;->۫:Ll/֫֨᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 233
    invoke-virtual {v0}, Ll/ۘ֨᩵;->close()V

    .line 234
    iget-object v0, p0, Ll/᩺ۚ᩵;->۫:Ll/֫֨᩵;

    return-object v0

    :catchall_0
    move-exception v1

    .line 231
    :try_start_1
    invoke-virtual {v0}, Ll/ۘ֨᩵;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1

    .line 224
    :cond_1
    new-instance v0, Ll/ۗۚ᩵;

    const-string v1, "Already closed"

    invoke-direct {v0, v1}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ(II[B)I
    .locals 1

    .line 281
    invoke-virtual {p0}, Ll/᩺ۚ᩵;->ᩳ()Ll/۟ۚ᩵;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Ll/ۤۚ᩵;->ܿ(II[B)I

    move-result p1

    return p1
.end method

.method public final ܽ()Ll/ۘ֨᩵;
    .locals 1

    .line 108
    iget-object v0, p0, Ll/᩺ۚ᩵;->ۨ:Ll/ۘ֨᩵;

    if-nez v0, :cond_0

    .line 110
    iget-object v0, p0, Ll/᩺ۚ᩵;->ۤ:Ll/ۨۚ᩵;

    invoke-virtual {v0}, Ll/۬ۚ᩵;->ᩳ()Ll/ۘ֨᩵;

    move-result-object v0

    iput-object v0, p0, Ll/᩺ۚ᩵;->ۨ:Ll/ۘ֨᩵;

    .line 112
    :cond_0
    iget-object v0, p0, Ll/᩺ۚ᩵;->ۨ:Ll/ۘ֨᩵;

    invoke-virtual {v0}, Ll/ۘ֨᩵;->֫()V

    return-object v0
.end method

.method public final ᩳ()Ll/۟ۚ᩵;
    .locals 2

    .line 201
    iget-boolean v0, p0, Ll/᩺ۚ᩵;->ۗ:Z

    if-eqz v0, :cond_1

    .line 205
    iget-object v0, p0, Ll/᩺ۚ᩵;->ۙ:Ll/۟ۚ᩵;

    if-eqz v0, :cond_0

    return-object v0

    .line 209
    :cond_0
    invoke-virtual {p0}, Ll/᩺ۚ᩵;->ܽ()Ll/ۘ֨᩵;

    move-result-object v0

    .line 210
    :try_start_0
    new-instance v1, Ll/۟ۚ᩵;

    invoke-direct {v1, p0, v0}, Ll/۟ۚ᩵;-><init>(Ll/᩺ۚ᩵;Ll/ۘ֨᩵;)V

    iput-object v1, p0, Ll/᩺ۚ᩵;->ۙ:Ll/۟ۚ᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 211
    invoke-virtual {v0}, Ll/ۘ֨᩵;->close()V

    .line 212
    iget-object v0, p0, Ll/᩺ۚ᩵;->ۙ:Ll/۟ۚ᩵;

    return-object v0

    :catchall_0
    move-exception v1

    .line 209
    :try_start_1
    invoke-virtual {v0}, Ll/ۘ֨᩵;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1

    .line 202
    :cond_1
    new-instance v0, Ll/ۗۚ᩵;

    const-string v1, "Already closed"

    invoke-direct {v0, v1}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩻()Ll/ۨۚ᩵;
    .locals 1

    .line 102
    iget-object v0, p0, Ll/᩺ۚ᩵;->ۤ:Ll/ۨۚ᩵;

    return-object v0
.end method
