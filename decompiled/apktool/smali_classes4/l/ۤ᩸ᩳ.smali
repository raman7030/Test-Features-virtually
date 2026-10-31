.class public Ll/ۤ᩸ᩳ;
.super Ljava/lang/Object;
.source "CB2D"

# interfaces
.implements Ll/᩶᩸ᩳ;
.implements Ljava/lang/AutoCloseable;


# static fields
.field public static final ܿ֫:[Landroid/text/InputFilter;


# instance fields
.field public ֫֫:Z

.field public ۗ:I

.field public ۙ:[Landroid/text/InputFilter;

.field public final ۛ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field public ۟:I

.field public ۤ:Ll/ᩳ۬ᩳ;

.field public final ۧ֫:Ll/᩻۬ᩳ;

.field public volatile ۨ:I

.field public final ۫:Ll/֨ۙᩳ;

.field public ۬:Ll/ۧۙᩳ;

.field public final ܰ:Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

.field public final ܽ֫:Ll/ۨ᩸ᩳ;

.field public final ᩳ֫:Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

.field public final ᩶:Ll/ۖ᩹ᩳ;

.field public volatile ᩸:Z

.field public ᩹:I

.field public ᩺:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Landroid/text/InputFilter;

    .line 26
    sput-object v0, Ll/ۤ᩸ᩳ;->ܿ֫:[Landroid/text/InputFilter;

    return-void
.end method

.method public constructor <init>()V
    .locals 11

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Ll/ۤ᩸ᩳ;->ۛ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 28
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v1

    iput-object v1, p0, Ll/ۤ᩸ᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 29
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    iput-object v0, p0, Ll/ۤ᩸ᩳ;->ᩳ֫:Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    .line 32
    new-instance v0, Ll/۬᩸ᩳ;

    invoke-direct {v0, p0}, Ll/۬᩸ᩳ;-><init>(Ll/ۤ᩸ᩳ;)V

    iput-object v0, p0, Ll/ۤ᩸ᩳ;->۫:Ll/֨ۙᩳ;

    .line 55
    sget-object v0, Ll/ۤ᩸ᩳ;->ܿ֫:[Landroid/text/InputFilter;

    iput-object v0, p0, Ll/ۤ᩸ᩳ;->ۙ:[Landroid/text/InputFilter;

    const/4 v0, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    .line 67
    invoke-static {v5, v7, v0}, Ll/ۨ᩹ᩳ;->֫(III)V

    const/4 v0, 0x0

    .line 68
    iput-object v0, p0, Ll/ۤ᩸ᩳ;->ۧ֫:Ll/᩻۬ᩳ;

    .line 69
    new-instance v8, Ll/ۖ᩹ᩳ;

    const-string v1, ""

    .line 17
    invoke-direct {v8, v1}, Ll/ۖ᩹ᩳ;-><init>(Ljava/lang/CharSequence;)V

    .line 69
    iput-object v8, p0, Ll/ۤ᩸ᩳ;->᩶:Ll/ۖ᩹ᩳ;

    .line 108
    new-instance v9, Ll/ۢ᩹ᩳ;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v10, ""

    move-object v1, v9

    move-object v4, v10

    move v6, v7

    invoke-direct/range {v1 .. v6}, Ll/ۢ᩹ᩳ;-><init>(IILjava/lang/CharSequence;II)V

    .line 113
    invoke-virtual {v8, v9, v0}, Ll/ۖ᩹ᩳ;->֫(Ljava/util/function/Consumer;Ll/۫ۗᩳ;)V

    .line 71
    new-instance v0, Ll/ۨ᩸ᩳ;

    invoke-direct {v0, p0, v10, v7}, Ll/ۨ᩸ᩳ;-><init>(Ll/ۤ᩸ᩳ;Ljava/lang/CharSequence;I)V

    iput-object v0, p0, Ll/ۤ᩸ᩳ;->ܽ֫:Ll/ۨ᩸ᩳ;

    return-void
.end method

.method public constructor <init>(Ll/᩻۬ᩳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 78
    invoke-direct {p0, p1, v0}, Ll/ۤ᩸ᩳ;-><init>(Ll/᩻۬ᩳ;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public constructor <init>(Ll/᩻۬ᩳ;Ljava/lang/CharSequence;)V
    .locals 4

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Ll/ۤ᩸ᩳ;->ۛ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 28
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v1

    iput-object v1, p0, Ll/ۤ᩸ᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 29
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    iput-object v0, p0, Ll/ۤ᩸ᩳ;->ᩳ֫:Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    .line 32
    new-instance v0, Ll/۬᩸ᩳ;

    invoke-direct {v0, p0}, Ll/۬᩸ᩳ;-><init>(Ll/ۤ᩸ᩳ;)V

    iput-object v0, p0, Ll/ۤ᩸ᩳ;->۫:Ll/֨ۙᩳ;

    .line 55
    sget-object v0, Ll/ۤ᩸ᩳ;->ܿ֫:[Landroid/text/InputFilter;

    iput-object v0, p0, Ll/ۤ᩸ᩳ;->ۙ:[Landroid/text/InputFilter;

    .line 82
    iput-object p1, p0, Ll/ۤ᩸ᩳ;->ۧ֫:Ll/᩻۬ᩳ;

    const/4 v0, 0x0

    .line 83
    iput-object v0, p0, Ll/ۤ᩸ᩳ;->᩶:Ll/ۖ᩹ᩳ;

    const/4 v1, 0x0

    if-nez p2, :cond_0

    .line 84
    new-instance p2, Ll/ۨ᩸ᩳ;

    .line 30
    invoke-direct {p2, p0, v0, v1}, Ll/ۨ᩸ᩳ;-><init>(Ll/ۤ᩸ᩳ;Ljava/lang/CharSequence;I)V

    goto :goto_0

    .line 84
    :cond_0
    new-instance v0, Ll/ۨ᩸ᩳ;

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-direct {v0, p0, p2, v2}, Ll/ۨ᩸ᩳ;-><init>(Ll/ۤ᩸ᩳ;Ljava/lang/CharSequence;I)V

    move-object p2, v0

    :goto_0
    iput-object p2, p0, Ll/ۤ᩸ᩳ;->ܽ֫:Ll/ۨ᩸ᩳ;

    .line 85
    invoke-virtual {p1}, Ll/᩻۬ᩳ;->ܰ()Ll/ۚۗᩳ;

    move-result-object p1

    const/4 p2, 0x1

    .line 86
    iput-boolean p2, p0, Ll/ۤ᩸ᩳ;->֫֫:Z

    .line 88
    :try_start_0
    invoke-virtual {p1}, Ll/ۚۗᩳ;->ܽ()I

    move-result p2

    const/16 v0, 0x22

    if-ltz p2, :cond_1

    sget-object p2, Landroid/text/Selection;->SELECTION_START:Ljava/lang/Object;

    invoke-virtual {p1}, Ll/ۚۗᩳ;->ܽ()I

    move-result v2

    invoke-virtual {p1}, Ll/ۚۗᩳ;->ܽ()I

    move-result v3

    invoke-virtual {p0, p2, v2, v3, v0}, Ll/ۤ᩸ᩳ;->setSpan(Ljava/lang/Object;III)V

    .line 89
    :cond_1
    invoke-virtual {p1}, Ll/ۚۗᩳ;->֫()I

    move-result p2

    if-ltz p2, :cond_2

    sget-object p2, Landroid/text/Selection;->SELECTION_END:Ljava/lang/Object;

    invoke-virtual {p1}, Ll/ۚۗᩳ;->֫()I

    move-result v2

    invoke-virtual {p1}, Ll/ۚۗᩳ;->֫()I

    move-result p1

    invoke-virtual {p0, p2, v2, p1, v0}, Ll/ۤ᩸ᩳ;->setSpan(Ljava/lang/Object;III)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    :cond_2
    iput-boolean v1, p0, Ll/ۤ᩸ᩳ;->֫֫:Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v1, p0, Ll/ۤ᩸ᩳ;->֫֫:Z

    throw p1
.end method

.method private ֫(IILjava/lang/CharSequence;IILl/ۧۙᩳ;)V
    .locals 17

    move-object/from16 v8, p0

    move/from16 v0, p1

    move/from16 v9, p2

    move/from16 v1, p4

    move/from16 v2, p5

    .line 252
    iget-object v10, v8, Ll/ۤ᩸ᩳ;->ᩳ֫:Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    .line 632
    iget-boolean v3, v8, Ll/ۤ᩸ᩳ;->᩸:Z

    if-eqz v3, :cond_0

    goto :goto_1

    .line 254
    :cond_0
    invoke-interface/range {p3 .. p3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    .line 632
    iget-boolean v4, v8, Ll/ۤ᩸ᩳ;->᩸:Z

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    if-ltz v1, :cond_7

    if-lt v2, v1, :cond_7

    if-gt v2, v3, :cond_7

    .line 260
    iget-object v11, v8, Ll/ۤ᩸ᩳ;->ۙ:[Landroid/text/InputFilter;

    array-length v12, v11

    const/4 v3, 0x0

    move-object/from16 v14, p3

    move v15, v1

    move/from16 v16, v2

    const/4 v13, 0x0

    :goto_0
    if-ge v13, v12, :cond_5

    aget-object v1, v11, v13

    .line 632
    iget-boolean v2, v8, Ll/ۤ᩸ᩳ;->᩸:Z

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    move-object v2, v14

    move v3, v15

    move/from16 v4, v16

    move-object/from16 v5, p0

    move/from16 v6, p1

    move/from16 v7, p2

    .line 262
    invoke-interface/range {v1 .. v7}, Landroid/text/InputFilter;->filter(Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;

    move-result-object v1

    .line 632
    iget-boolean v2, v8, Ll/ۤ᩸ᩳ;->᩸:Z

    if-eqz v2, :cond_3

    :goto_1
    return-void

    :cond_3
    if-eqz v1, :cond_4

    .line 267
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v3, 0x0

    move-object v14, v1

    move/from16 v16, v2

    const/4 v15, 0x0

    :cond_4
    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    .line 270
    :cond_5
    invoke-virtual {v10}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 273
    :try_start_0
    invoke-direct/range {p0 .. p0}, Ll/ۤ᩸ᩳ;->ۘ()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v1, :cond_6

    .line 292
    invoke-virtual {v10}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return-void

    .line 274
    :cond_6
    :try_start_1
    invoke-virtual/range {p0 .. p0}, Ll/ۤ᩸ᩳ;->ۖ()V

    .line 275
    invoke-virtual/range {p0 .. p0}, Ll/ۤ᩸ᩳ;->length()I

    move-result v1

    invoke-static {v0, v9, v1}, Ll/ۨ᩹ᩳ;->֫(III)V

    .line 276
    invoke-virtual/range {p0 .. p0}, Ll/ۤ᩸ᩳ;->length()I

    move-result v1

    sub-int v2, v9, v0

    sub-int v3, v16, v15

    invoke-static {v1, v2, v3}, Ll/ۨ᩹ᩳ;->ۧ(III)V

    .line 278
    iget v1, v8, Ll/ۤ᩸ᩳ;->۟:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v8, Ll/ۤ᩸ᩳ;->۟:I

    .line 279
    iget-object v11, v8, Ll/ۤ᩸ᩳ;->۬:Ll/ۧۙᩳ;

    .line 280
    iget-object v12, v8, Ll/ۤ᩸ᩳ;->ۤ:Ll/ᩳ۬ᩳ;

    move-object/from16 v1, p6

    .line 281
    iput-object v1, v8, Ll/ۤ᩸ᩳ;->۬:Ll/ۧۙᩳ;

    const/4 v1, 0x0

    .line 282
    iput-object v1, v8, Ll/ۤ᩸ᩳ;->ۤ:Ll/ᩳ۬ᩳ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 284
    :try_start_2
    iget-object v1, v8, Ll/ۤ᩸ᩳ;->ܽ֫:Ll/ۨ᩸ᩳ;

    const/4 v7, 0x0

    move/from16 v2, p1

    move/from16 v3, p2

    move-object v4, v14

    move v5, v15

    move/from16 v6, v16

    .line 203
    invoke-virtual/range {v1 .. v7}, Ll/ۨ᩸ᩳ;->֫(IILjava/lang/CharSequence;IIZ)V

    .line 285
    iget-object v0, v8, Ll/ۤ᩸ᩳ;->ܽ֫:Ll/ۨ᩸ᩳ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 287
    :try_start_3
    iput-object v11, v8, Ll/ۤ᩸ᩳ;->۬:Ll/ۧۙᩳ;

    .line 288
    iput-object v12, v8, Ll/ۤ᩸ᩳ;->ۤ:Ll/ᩳ۬ᩳ;

    .line 289
    iget v0, v8, Ll/ۤ᩸ᩳ;->۟:I

    add-int/lit8 v0, v0, -0x1

    iput v0, v8, Ll/ۤ᩸ᩳ;->۟:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 292
    invoke-virtual {v10}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    .line 287
    :try_start_4
    iput-object v11, v8, Ll/ۤ᩸ᩳ;->۬:Ll/ۧۙᩳ;

    .line 288
    iput-object v12, v8, Ll/ۤ᩸ᩳ;->ۤ:Ll/ᩳ۬ᩳ;

    .line 289
    iget v1, v8, Ll/ۤ᩸ᩳ;->۟:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v8, Ll/ۤ᩸ᩳ;->۟:I

    .line 290
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v0

    .line 292
    invoke-virtual {v10}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 293
    throw v0

    .line 258
    :cond_7
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v4, ", end = "

    const-string v5, ", length = "

    const-string v6, "start = "

    .line 0
    invoke-static {v6, v1, v4, v5, v2}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 258
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ֫(II[CI)V
    .locals 2

    .line 406
    invoke-direct {p0}, Ll/ۤ᩸ᩳ;->᩵()Ll/۫᩹ᩳ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 407
    :try_start_0
    invoke-virtual {v0, p1, p2, p3, p4}, Ll/۬᩹ᩳ;->getChars(II[CI)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    sub-int v1, p2, p1

    if-ltz p1, :cond_2

    if-lt p2, p1, :cond_2

    if-ltz p4, :cond_2

    .line 411
    array-length p1, p3

    sub-int/2addr p1, p4

    if-gt v1, p1, :cond_2

    add-int/2addr v1, p4

    const/4 p1, 0x0

    .line 413
    invoke-static {p3, p4, v1, p1}, Ljava/util/Arrays;->fill([CIIC)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    if-eqz v0, :cond_1

    .line 415
    invoke-virtual {v0}, Ll/۬᩹ᩳ;->close()V

    :cond_1
    return-void

    .line 412
    :cond_2
    :try_start_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "Invalid character copy range"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    if-eqz v0, :cond_3

    .line 406
    :try_start_2
    invoke-virtual {v0}, Ll/۬᩹ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_2
    throw p1
.end method

.method public static bridge synthetic ֫(Ll/ۤ᩸ᩳ;IILl/۬᩹ᩳ;ILl/ۧۙᩳ;)V
    .locals 7

    const/4 v4, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move v5, p4

    move-object v6, p5

    .line 0
    invoke-direct/range {v0 .. v6}, Ll/ۤ᩸ᩳ;->֫(IILjava/lang/CharSequence;IILl/ۧۙᩳ;)V

    return-void
.end method

.method private ۘ()Z
    .locals 2

    .line 632
    iget-boolean v0, p0, Ll/ۤ᩸ᩳ;->᩸:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 626
    :cond_0
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ۧ֫:Ll/᩻۬ᩳ;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Ll/ۤ᩸ᩳ;->֫֫:Z

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ll/᩻۬ᩳ;->ۖ()V

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private ܽ(Z)Ll/۟᩸ᩳ;
    .locals 2

    .line 110
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 113
    :try_start_0
    iget v0, p0, Ll/ۤ᩸ᩳ;->᩺:I

    if-nez v0, :cond_1

    .line 114
    invoke-direct {p0}, Ll/ۤ᩸ᩳ;->ᩴ()V

    if-eqz p1, :cond_0

    .line 115
    iget-object p1, p0, Ll/ۤ᩸ᩳ;->ۧ֫:Ll/᩻۬ᩳ;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll/᩻۬ᩳ;->᩵()Ll/۫᩹ᩳ;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->᩻()Ll/۫᩹ᩳ;

    move-result-object p1

    .line 116
    :goto_0
    iget v0, p0, Ll/ۤ᩸ᩳ;->ۨ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    iget-object v1, p0, Ll/ۤ᩸ᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 121
    invoke-static {p1, v0}, Ll/۟᩸ᩳ;->֫(Ll/۫᩹ᩳ;I)Ll/۟᩸ᩳ;

    move-result-object p1

    return-object p1

    .line 113
    :cond_1
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Text replacement is not published"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    .line 118
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 119
    throw p1
.end method

.method private ᩳ(Z)Ll/ܽ۬ᩳ;
    .locals 2

    .line 159
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ᩳ֫:Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 639
    :try_start_0
    iget-boolean v0, p0, Ll/ۤ᩸ᩳ;->᩸:Z

    if-eqz v0, :cond_0

    .line 161
    sget-object p1, Ll/ܽ۬ᩳ;->ۙ:Ll/ܽ۬ᩳ;

    goto :goto_0

    .line 162
    :cond_0
    invoke-direct {p0}, Ll/ۤ᩸ᩳ;->ᩴ()V

    .line 163
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ۧ֫:Ll/᩻۬ᩳ;

    if-eqz v0, :cond_2

    .line 164
    iget v0, p0, Ll/ۤ᩸ᩳ;->ۗ:I

    if-nez v0, :cond_1

    iget v1, p0, Ll/ۤ᩸ᩳ;->۟:I

    if-nez v1, :cond_1

    add-int/lit8 v0, v0, 0x1

    .line 165
    iput v0, p0, Ll/ۤ᩸ᩳ;->ۗ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 167
    :try_start_1
    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->ۖ()V

    .line 168
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ۧ֫:Ll/᩻۬ᩳ;

    new-instance v1, Ll/۫᩸ᩳ;

    invoke-direct {v1, p0}, Ll/۫᩸ᩳ;-><init>(Ll/ۤ᩸ᩳ;)V

    invoke-virtual {v0, p1, v1}, Ll/᩻۬ᩳ;->֫(ZLl/۟᩶ᩳ;)Ll/ܽ۬ᩳ;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 176
    :try_start_2
    iget v0, p0, Ll/ۤ᩸ᩳ;->ۗ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ۤ᩸ᩳ;->ۗ:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 177
    :goto_0
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ᩳ֫:Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return-object p1

    :catchall_0
    move-exception p1

    .line 176
    :try_start_3
    iget v0, p0, Ll/ۤ᩸ᩳ;->ۗ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ۤ᩸ᩳ;->ۗ:I

    throw p1

    .line 164
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot replay history during text callbacks"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 163
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "History requires a text session"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    .line 177
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ᩳ֫:Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    throw p1
.end method

.method private ᩴ()V
    .locals 2

    .line 642
    iget-boolean v0, p0, Ll/ۤ᩸ᩳ;->᩸:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ll/֫᩹ᩳ;

    const-string v1, "Editable is closed"

    .line 9
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 642
    throw v0
.end method

.method private ᩵()Ll/۫᩹ᩳ;
    .locals 2

    .line 639
    iget-boolean v0, p0, Ll/ۤ᩸ᩳ;->᩸:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 421
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->᩻()Ll/۫᩹ᩳ;

    move-result-object v0
    :try_end_0
    .catch Ll/֫᩹ᩳ; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 639
    iget-boolean v1, p0, Ll/ۤ᩸ᩳ;->᩸:Z

    if-eqz v1, :cond_1

    :goto_0
    const/4 v0, 0x0

    return-object v0

    .line 423
    :cond_1
    throw v0
.end method


# virtual methods
.method public final append(C)Landroid/text/Editable;
    .locals 1

    .line 366
    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->length()I

    move-result v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Ll/ۤ᩸ᩳ;->insert(ILjava/lang/CharSequence;)V

    return-object p0
.end method

.method public final bridge synthetic append(Ljava/lang/CharSequence;)Landroid/text/Editable;
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Ll/ۤ᩸ᩳ;->append(Ljava/lang/CharSequence;)V

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;II)Landroid/text/Editable;
    .locals 6

    .line 359
    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->length()I

    move-result v2

    move-object v0, p0

    move v1, v2

    move-object v3, p1

    move v4, p2

    move v5, p3

    .line 341
    invoke-virtual/range {v0 .. v5}, Ll/ۤ᩸ᩳ;->replace(IILjava/lang/CharSequence;II)Ll/ۤ᩸ᩳ;

    return-object p0
.end method

.method public final append(C)Ljava/lang/Appendable;
    .locals 1

    .line 366
    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->length()I

    move-result v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Ll/ۤ᩸ᩳ;->insert(ILjava/lang/CharSequence;)V

    return-object p0
.end method

.method public final bridge synthetic append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Ll/ۤ᩸ᩳ;->append(Ljava/lang/CharSequence;)V

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
    .locals 6

    .line 359
    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->length()I

    move-result v2

    move-object v0, p0

    move v1, v2

    move-object v3, p1

    move v4, p2

    move v5, p3

    .line 341
    invoke-virtual/range {v0 .. v5}, Ll/ۤ᩸ᩳ;->replace(IILjava/lang/CharSequence;II)Ll/ۤ᩸ᩳ;

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;)V
    .locals 1

    .line 352
    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->length()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Ll/ۤ᩸ᩳ;->insert(ILjava/lang/CharSequence;)V

    return-void
.end method

.method public final charAt(I)C
    .locals 2

    .line 431
    :try_start_0
    iget-boolean v0, p0, Ll/ۤ᩸ᩳ;->᩸:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 435
    :cond_0
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ۧ֫:Ll/᩻۬ᩳ;

    if-nez v0, :cond_3

    iget-object v0, p0, Ll/ۤ᩸ᩳ;->᩶:Ll/ۖ᩹ᩳ;

    .line 55
    invoke-virtual {v0, p1}, Ll/ۖ᩹ᩳ;->֫(I)Ll/ۨ᩹ᩳ;

    move-result-object v0

    .line 73
    iget-object v1, v0, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;
    :try_end_0
    .catch Ll/֫᩹ᩳ; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {v0, p1}, Ll/ۨ᩹ᩳ;->֫(I)C

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_1

    .line 75
    :try_start_2
    invoke-virtual {v1}, Ll/᩸۬ᩳ;->᩻()V

    :cond_1
    return p1

    :catchall_0
    move-exception p1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ll/᩸۬ᩳ;->᩻()V

    .line 76
    :cond_2
    throw p1

    .line 435
    :cond_3
    invoke-virtual {v0, p1}, Ll/᩻۬ᩳ;->֫(I)C

    move-result p1
    :try_end_2
    .catch Ll/֫᩹ᩳ; {:try_start_2 .. :try_end_2} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 639
    iget-boolean v0, p0, Ll/ۤ᩸ᩳ;->᩸:Z

    if-eqz v0, :cond_4

    :goto_0
    const/4 p1, 0x0

    return p1

    .line 437
    :cond_4
    throw p1
.end method

.method public final clear()V
    .locals 1

    .line 372
    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->length()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ۤ᩸ᩳ;->ۧ(I)V

    return-void
.end method

.method public final clearSpans()V
    .locals 3

    .line 479
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ܽ֫:Ll/ۨ᩸ᩳ;

    iget-object v1, p0, Ll/ۤ᩸ᩳ;->ᩳ֫:Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 481
    :try_start_0
    invoke-direct {p0}, Ll/ۤ᩸ᩳ;->ۘ()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    .line 486
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return-void

    .line 482
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Ll/ۨ᩸ᩳ;->֫()V

    .line 483
    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->ۖ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 486
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 487
    throw v0
.end method

.method public close()V
    .locals 2

    .line 647
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ᩳ֫:Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 649
    :try_start_0
    iget-boolean v0, p0, Ll/ۤ᩸ᩳ;->᩸:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 650
    :cond_0
    iget v0, p0, Ll/ۤ᩸ᩳ;->۟:I

    if-nez v0, :cond_3

    iget v0, p0, Ll/ۤ᩸ᩳ;->ۗ:I

    if-nez v0, :cond_3

    .line 651
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ۧ֫:Ll/᩻۬ᩳ;

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۤ᩸ᩳ;->᩶:Ll/ۖ᩹ᩳ;

    invoke-virtual {v0}, Ll/ۖ᩹ᩳ;->length()I

    move-result v0

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ll/᩻۬ᩳ;->length()I

    move-result v0

    :goto_0
    iput v0, p0, Ll/ۤ᩸ᩳ;->᩹:I

    const/4 v0, 0x1

    .line 653
    iput-boolean v0, p0, Ll/ۤ᩸ᩳ;->᩸:Z

    .line 654
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->᩶:Ll/ۖ᩹ᩳ;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ll/ۖ᩹ᩳ;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 656
    :cond_2
    :goto_1
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ᩳ֫:Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return-void

    .line 650
    :cond_3
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot close during editable replacement"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    .line 656
    iget-object v1, p0, Ll/ۤ᩸ᩳ;->ᩳ֫:Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 657
    throw v0
.end method

.method public final delete(II)Landroid/text/Editable;
    .locals 1

    const-string v0, ""

    .line 346
    invoke-virtual {p0, p1, p2, v0}, Ll/ۤ᩸ᩳ;->replace(IILjava/lang/CharSequence;)Ll/ۤ᩸ᩳ;

    move-result-object p1

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 9

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    goto/16 :goto_8

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_1b

    .line 577
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_c

    .line 578
    :cond_1
    check-cast p1, Ll/ۤ᩸ᩳ;

    .line 579
    invoke-direct {p0}, Ll/ۤ᩸ᩳ;->᩵()Ll/۫᩹ᩳ;

    move-result-object v2

    :try_start_0
    invoke-direct {p1}, Ll/ۤ᩸ᩳ;->᩵()Ll/۫᩹ᩳ;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    if-nez v2, :cond_2

    .line 580
    :try_start_1
    iget v4, p0, Ll/ۤ᩸ᩳ;->᩹:I

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Ll/۬᩹ᩳ;->length()I

    move-result v4

    :goto_0
    if-nez v3, :cond_3

    .line 581
    iget p1, p1, Ll/ۤ᩸ᩳ;->᩹:I

    goto :goto_1

    :cond_3
    invoke-virtual {v3}, Ll/۬᩹ᩳ;->length()I

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    :goto_1
    if-eq v4, p1, :cond_5

    if-eqz v3, :cond_4

    .line 590
    :try_start_2
    invoke-virtual {v3}, Ll/۬᩹ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    :cond_4
    if-eqz v2, :cond_1b

    invoke-virtual {v2}, Ll/۬᩹ᩳ;->close()V

    return v1

    :cond_5
    const/4 p1, 0x0

    if-nez v2, :cond_6

    move-object v5, p1

    goto :goto_2

    .line 582
    :cond_6
    :try_start_3
    invoke-virtual {v2, v1}, Ll/۬᩹ᩳ;->ۧ(I)Ll/᩷᩹ᩳ;

    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    :goto_2
    if-nez v3, :cond_7

    goto :goto_3

    .line 583
    :cond_7
    :try_start_4
    invoke-virtual {v3, v1}, Ll/۬᩹ᩳ;->ۧ(I)Ll/᩷᩹ᩳ;

    move-result-object p1

    :goto_3
    if-nez v5, :cond_b

    if-nez p1, :cond_b

    if-eqz p1, :cond_8

    .line 589
    invoke-virtual {p1}, Ll/᩷᩹ᩳ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :cond_8
    if-eqz v5, :cond_9

    :try_start_5
    invoke-virtual {v5}, Ll/᩷᩹ᩳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :cond_9
    if-eqz v3, :cond_a

    .line 590
    :try_start_6
    invoke-virtual {v3}, Ll/۬᩹ᩳ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    :cond_a
    if-eqz v2, :cond_17

    invoke-virtual {v2}, Ll/۬᩹ᩳ;->close()V

    return v0

    :cond_b
    const/4 v6, 0x0

    :goto_4
    if-ge v6, v4, :cond_13

    if-nez v5, :cond_c

    const/4 v7, 0x0

    goto :goto_5

    .line 586
    :cond_c
    :try_start_7
    invoke-virtual {v5}, Ll/᩷᩹ᩳ;->ܽ()C

    move-result v7

    :goto_5
    if-nez p1, :cond_d

    const/4 v8, 0x0

    goto :goto_6

    :cond_d
    invoke-virtual {p1}, Ll/᩷᩹ᩳ;->ܽ()C

    move-result v8
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_6
    if-eq v7, v8, :cond_11

    if-eqz p1, :cond_e

    .line 589
    :try_start_8
    invoke-virtual {p1}, Ll/᩷᩹ᩳ;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :cond_e
    if-eqz v5, :cond_f

    :try_start_9
    invoke-virtual {v5}, Ll/᩷᩹ᩳ;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :cond_f
    if-eqz v3, :cond_10

    .line 590
    :try_start_a
    invoke-virtual {v3}, Ll/۬᩹ᩳ;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    :cond_10
    if-eqz v2, :cond_1b

    invoke-virtual {v2}, Ll/۬᩹ᩳ;->close()V

    return v1

    :cond_11
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :catchall_0
    move-exception v0

    if-eqz p1, :cond_12

    .line 582
    :try_start_b
    invoke-virtual {p1}, Ll/᩷᩹ᩳ;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    goto :goto_7

    :catchall_1
    move-exception p1

    :try_start_c
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_12
    :goto_7
    throw v0

    :cond_13
    if-eqz p1, :cond_14

    .line 589
    invoke-virtual {p1}, Ll/᩷᩹ᩳ;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    :cond_14
    if-eqz v5, :cond_15

    :try_start_d
    invoke-virtual {v5}, Ll/᩷᩹ᩳ;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    :cond_15
    if-eqz v3, :cond_16

    .line 590
    :try_start_e
    invoke-virtual {v3}, Ll/۬᩹ᩳ;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    :cond_16
    if-eqz v2, :cond_17

    invoke-virtual {v2}, Ll/۬᩹ᩳ;->close()V

    :cond_17
    :goto_8
    return v0

    :catchall_2
    move-exception p1

    if-eqz v5, :cond_18

    .line 582
    :try_start_f
    invoke-virtual {v5}, Ll/᩷᩹ᩳ;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    goto :goto_9

    :catchall_3
    move-exception v0

    :try_start_10
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_18
    :goto_9
    throw p1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    :catchall_4
    move-exception p1

    if-eqz v3, :cond_19

    .line 579
    :try_start_11
    invoke-virtual {v3}, Ll/۬᩹ᩳ;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_5

    goto :goto_a

    :catchall_5
    move-exception v0

    :try_start_12
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_19
    :goto_a
    throw p1
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    :catchall_6
    move-exception p1

    if-eqz v2, :cond_1a

    :try_start_13
    invoke-virtual {v2}, Ll/۬᩹ᩳ;->close()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_7

    goto :goto_b

    :catchall_7
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1a
    :goto_b
    throw p1

    :cond_1b
    :goto_c
    return v1
.end method

.method public final getChars(II[CI)V
    .locals 1

    .line 392
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 394
    :try_start_0
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ۤ᩸ᩳ;->֫(II[CI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 396
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 397
    throw p1
.end method

.method public final getFilters()[Landroid/text/InputFilter;
    .locals 1

    .line 387
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ۙ:[Landroid/text/InputFilter;

    return-object v0
.end method

.method public final getSpanEnd(Ljava/lang/Object;)I
    .locals 1

    .line 543
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 639
    :try_start_0
    iget-boolean v0, p0, Ll/ۤ᩸ᩳ;->᩸:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 548
    iget-object p1, p0, Ll/ۤ᩸ᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    const/4 p1, -0x1

    return p1

    .line 546
    :cond_0
    :try_start_1
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ܽ֫:Ll/ۨ᩸ᩳ;

    invoke-virtual {v0, p1}, Ll/ۨ᩸ᩳ;->֫(Ljava/lang/Object;)I

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 548
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    return p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 549
    throw p1
.end method

.method public final getSpanFlags(Ljava/lang/Object;)I
    .locals 1

    .line 554
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 639
    :try_start_0
    iget-boolean v0, p0, Ll/ۤ᩸ᩳ;->᩸:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 559
    iget-object p1, p0, Ll/ۤ᩸ᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    const/4 p1, 0x0

    return p1

    .line 557
    :cond_0
    :try_start_1
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ܽ֫:Ll/ۨ᩸ᩳ;

    invoke-virtual {v0, p1}, Ll/ۨ᩸ᩳ;->ۧ(Ljava/lang/Object;)I

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 559
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    return p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 560
    throw p1
.end method

.method public final getSpanStart(Ljava/lang/Object;)I
    .locals 1

    .line 532
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 639
    :try_start_0
    iget-boolean v0, p0, Ll/ۤ᩸ᩳ;->᩸:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 537
    iget-object p1, p0, Ll/ۤ᩸ᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    const/4 p1, -0x1

    return p1

    .line 535
    :cond_0
    :try_start_1
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ܽ֫:Ll/ۨ᩸ᩳ;

    invoke-virtual {v0, p1}, Ll/ۨ᩸ᩳ;->ܽ(Ljava/lang/Object;)I

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 537
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    return p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 538
    throw p1
.end method

.method public final getSpans(IILjava/lang/Class;)[Ljava/lang/Object;
    .locals 1

    .line 518
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 639
    :try_start_0
    iget-boolean v0, p0, Ll/ۤ᩸ᩳ;->᩸:Z

    if-eqz v0, :cond_1

    if-nez p3, :cond_0

    .line 522
    const-class p3, Ljava/lang/Object;

    :cond_0
    const/4 p1, 0x0

    invoke-static {p3, p1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    goto :goto_0

    .line 524
    :cond_1
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ܽ֫:Ll/ۨ᩸ᩳ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۨ᩸ᩳ;->֫(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 526
    :goto_0
    iget-object p2, p0, Ll/ۤ᩸ᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    return-object p1

    :catchall_0
    move-exception p1

    iget-object p2, p0, Ll/ۤ᩸ᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 527
    throw p1
.end method

.method public final hashCode()I
    .locals 4

    .line 596
    invoke-direct {p0}, Ll/ۤ᩸ᩳ;->᩵()Ll/۫᩹ᩳ;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    if-eqz v0, :cond_0

    .line 601
    invoke-virtual {v0}, Ll/۬᩹ᩳ;->close()V

    :cond_0
    return v1

    .line 598
    :cond_1
    :try_start_0
    invoke-virtual {v0, v1}, Ll/۬᩹ᩳ;->ۧ(I)Ll/᩷᩹ᩳ;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 599
    :goto_0
    :try_start_1
    invoke-virtual {v2}, Ll/᩷᩹ᩳ;->֫()Z

    move-result v3

    if-eqz v3, :cond_2

    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {v2}, Ll/᩷᩹ᩳ;->ܽ()C

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/2addr v1, v3

    goto :goto_0

    .line 600
    :cond_2
    :try_start_2
    invoke-virtual {v2}, Ll/᩷᩹ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 601
    invoke-virtual {v0}, Ll/۬᩹ᩳ;->close()V

    return v1

    :catchall_0
    move-exception v1

    .line 598
    :try_start_3
    invoke-virtual {v2}, Ll/᩷᩹ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v2

    :try_start_4
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v1

    .line 596
    :try_start_5
    invoke-virtual {v0}, Ll/۬᩹ᩳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1
.end method

.method public final bridge synthetic insert(ILjava/lang/CharSequence;)Landroid/text/Editable;
    .locals 0

    .line 25
    invoke-virtual {p0, p1, p2}, Ll/ۤ᩸ᩳ;->insert(ILjava/lang/CharSequence;)V

    return-object p0
.end method

.method public final insert(ILjava/lang/CharSequence;II)Landroid/text/Editable;
    .locals 6

    move-object v0, p0

    move v1, p1

    move v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    .line 341
    invoke-virtual/range {v0 .. v5}, Ll/ۤ᩸ᩳ;->replace(IILjava/lang/CharSequence;II)Ll/ۤ᩸ᩳ;

    move-result-object p1

    return-object p1
.end method

.method public final insert(ILjava/lang/CharSequence;)V
    .locals 7

    .line 639
    iget-boolean v0, p0, Ll/ۤ᩸ᩳ;->᩸:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v5, 0x0

    .line 335
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v6

    move-object v1, p0

    move v2, p1

    move v3, p1

    move-object v4, p2

    .line 341
    invoke-virtual/range {v1 .. v6}, Ll/ۤ᩸ᩳ;->replace(IILjava/lang/CharSequence;II)Ll/ۤ᩸ᩳ;

    return-void
.end method

.method public final length()I
    .locals 2

    .line 445
    :try_start_0
    iget-boolean v0, p0, Ll/ۤ᩸ᩳ;->᩸:Z

    if-eqz v0, :cond_0

    .line 447
    iget v0, p0, Ll/ۤ᩸ᩳ;->᩹:I

    return v0

    .line 449
    :cond_0
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ۧ֫:Ll/᩻۬ᩳ;

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۤ᩸ᩳ;->᩶:Ll/ۖ᩹ᩳ;

    invoke-virtual {v0}, Ll/ۖ᩹ᩳ;->length()I

    move-result v0

    return v0

    :cond_1
    invoke-virtual {v0}, Ll/᩻۬ᩳ;->length()I

    move-result v0
    :try_end_0
    .catch Ll/֫᩹ᩳ; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 639
    iget-boolean v1, p0, Ll/ۤ᩸ᩳ;->᩸:Z

    if-eqz v1, :cond_2

    .line 452
    iget v0, p0, Ll/ۤ᩸ᩳ;->᩹:I

    return v0

    .line 451
    :cond_2
    throw v0
.end method

.method public final nextSpanTransition(IILjava/lang/Class;)I
    .locals 1

    .line 565
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 639
    :try_start_0
    iget-boolean v0, p0, Ll/ۤ᩸ᩳ;->᩸:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 570
    iget-object p1, p0, Ll/ۤ᩸ᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    return p2

    .line 568
    :cond_0
    :try_start_1
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ܽ֫:Ll/ۨ᩸ᩳ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۨ᩸ᩳ;->ۧ(IILjava/lang/Class;)I

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 570
    iget-object p2, p0, Ll/ۤ᩸ᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    return p1

    :catchall_0
    move-exception p1

    iget-object p2, p0, Ll/ۤ᩸ᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 571
    throw p1
.end method

.method public final removeSpan(Ljava/lang/Object;)V
    .locals 3

    .line 505
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ܽ֫:Ll/ۨ᩸ᩳ;

    iget-object v1, p0, Ll/ۤ᩸ᩳ;->ᩳ֫:Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 507
    :try_start_0
    invoke-direct {p0}, Ll/ۤ᩸ᩳ;->ۘ()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    .line 512
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return-void

    .line 508
    :cond_0
    :try_start_1
    invoke-virtual {v0, p1}, Ll/ۨ᩸ᩳ;->ᩳ(Ljava/lang/Object;)V

    .line 509
    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->ۖ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 512
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 513
    throw p1
.end method

.method public final bridge synthetic replace(IILjava/lang/CharSequence;)Landroid/text/Editable;
    .locals 0

    .line 25
    invoke-virtual {p0, p1, p2, p3}, Ll/ۤ᩸ᩳ;->replace(IILjava/lang/CharSequence;)Ll/ۤ᩸ᩳ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic replace(IILjava/lang/CharSequence;II)Landroid/text/Editable;
    .locals 0

    .line 25
    invoke-virtual/range {p0 .. p5}, Ll/ۤ᩸ᩳ;->replace(IILjava/lang/CharSequence;II)Ll/ۤ᩸ᩳ;

    move-result-object p1

    return-object p1
.end method

.method public final replace(IILjava/lang/CharSequence;)Ll/ۤ᩸ᩳ;
    .locals 7

    .line 639
    iget-boolean v0, p0, Ll/ۤ᩸ᩳ;->᩸:Z

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    const/4 v5, 0x0

    .line 329
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v6

    move-object v1, p0

    move v2, p1

    move v3, p2

    move-object v4, p3

    invoke-virtual/range {v1 .. v6}, Ll/ۤ᩸ᩳ;->replace(IILjava/lang/CharSequence;II)Ll/ۤ᩸ᩳ;

    move-result-object p1

    return-object p1
.end method

.method public replace(IILjava/lang/CharSequence;II)Ll/ۤ᩸ᩳ;
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    .line 248
    invoke-direct/range {v0 .. v6}, Ll/ۤ᩸ᩳ;->֫(IILjava/lang/CharSequence;IILl/ۧۙᩳ;)V

    return-object p0
.end method

.method public final setFilters([Landroid/text/InputFilter;)V
    .locals 1

    .line 377
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ᩳ֫:Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 639
    :try_start_0
    iget-boolean v0, p0, Ll/ۤ᩸ᩳ;->᩸:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    .line 381
    iput-object p1, p0, Ll/ۤ᩸ᩳ;->ۙ:[Landroid/text/InputFilter;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 382
    :goto_0
    iget-object p1, p0, Ll/ۤ᩸ᩳ;->ᩳ֫:Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return-void

    .line 380
    :cond_1
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    .line 382
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ᩳ֫:Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    throw p1
.end method

.method public final setSelection(I)V
    .locals 0

    .line 233
    invoke-virtual {p0, p1, p1}, Ll/ۤ᩸ᩳ;->setSelection(II)V

    return-void
.end method

.method public final setSelection(II)V
    .locals 1

    .line 237
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ᩳ֫:Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 639
    :try_start_0
    iget-boolean v0, p0, Ll/ۤ᩸ᩳ;->᩸:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 240
    :cond_0
    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->length()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->length()I

    move-result v0

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {p0, p1, p2}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 242
    :goto_0
    iget-object p1, p0, Ll/ۤ᩸ᩳ;->ᩳ֫:Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Ll/ۤ᩸ᩳ;->ᩳ֫:Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 243
    throw p1
.end method

.method public final setSpan(Ljava/lang/Object;III)V
    .locals 3

    .line 492
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ܽ֫:Ll/ۨ᩸ᩳ;

    iget-object v1, p0, Ll/ۤ᩸ᩳ;->ᩳ֫:Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 494
    :try_start_0
    invoke-direct {p0}, Ll/ۤ᩸ᩳ;->ۘ()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    .line 499
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return-void

    .line 495
    :cond_0
    :try_start_1
    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ۨ᩸ᩳ;->֫(Ljava/lang/Object;III)V

    .line 496
    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->ۖ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 499
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 500
    throw p1
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 2

    sub-int v0, p2, p1

    .line 459
    new-array v0, v0, [C

    const/4 v1, 0x0

    .line 460
    invoke-virtual {p0, p1, p2, v0, v1}, Ll/ۤ᩸ᩳ;->getChars(II[CI)V

    .line 461
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v0}, Ljava/lang/String;-><init>([C)V

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 472
    invoke-direct {p0}, Ll/ۤ᩸ᩳ;->᩵()Ll/۫᩹ᩳ;

    move-result-object v0

    if-nez v0, :cond_0

    .line 473
    :try_start_0
    new-instance v1, Ljava/lang/String;

    iget v2, p0, Ll/ۤ᩸ᩳ;->᩹:I

    new-array v2, v2, [C

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([C)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ll/۬᩹ᩳ;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    if-eqz v0, :cond_1

    .line 474
    invoke-virtual {v0}, Ll/۬᩹ᩳ;->close()V

    :cond_1
    return-object v1

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_2

    .line 472
    :try_start_1
    invoke-virtual {v0}, Ll/۬᩹ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    throw v1
.end method

.method public final ֨ۧ()I
    .locals 1

    .line 298
    iget v0, p0, Ll/ۤ᩸ᩳ;->ۨ:I

    return v0
.end method

.method public ֫(Ll/ᩴۗᩳ;)Ll/ۚۙᩳ;
    .locals 1

    .line 206
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->۫:Ll/֨ۙᩳ;

    invoke-virtual {p1, v0}, Ll/ᩴۗᩳ;->֫(Ll/֨ۙᩳ;)Ll/ۚۙᩳ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(IILjava/lang/CharSequence;II)V
    .locals 9

    .line 310
    iget v0, p0, Ll/ۤ᩸ᩳ;->᩺:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۤ᩸ᩳ;->᩺:I

    if-ne p1, p2, :cond_0

    if-eq p4, p5, :cond_1

    .line 315
    :cond_0
    :try_start_0
    iget v0, p0, Ll/ۤ᩸ᩳ;->ۨ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۤ᩸ᩳ;->ۨ:I

    .line 317
    :cond_1
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ۧ֫:Ll/᩻۬ᩳ;

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/ۤ᩸ᩳ;->᩶:Ll/ۖ᩹ᩳ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    new-instance v7, Ll/ۢ᩹ᩳ;

    move-object v1, v7

    move v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Ll/ۢ᩹ᩳ;-><init>(IILjava/lang/CharSequence;II)V

    const/4 p1, 0x0

    .line 113
    invoke-virtual {v0, v7, p1}, Ll/ۖ᩹ᩳ;->֫(Ljava/util/function/Consumer;Ll/۫ۗᩳ;)V

    goto :goto_0

    .line 318
    :cond_2
    iget-object v1, p0, Ll/ۤ᩸ᩳ;->ۤ:Ll/ᩳ۬ᩳ;

    if-eqz v1, :cond_3

    invoke-virtual {v0, v1}, Ll/᩻۬ᩳ;->֫(Ll/ᩳ۬ᩳ;)V

    goto :goto_0

    .line 319
    :cond_3
    iget-object v1, p0, Ll/ۤ᩸ᩳ;->۬:Ll/ۧۙᩳ;

    if-eqz v1, :cond_4

    new-instance v8, Ll/ۙ᩸ᩳ;

    move-object v2, v8

    move v3, p1

    move v4, p2

    move-object v5, p3

    move v6, p4

    move v7, p5

    invoke-direct/range {v2 .. v7}, Ll/ۙ᩸ᩳ;-><init>(IILjava/lang/CharSequence;II)V

    invoke-virtual {v0, v1, v8}, Ll/᩻۬ᩳ;->֫(Ll/ۧۙᩳ;Ll/ۙ᩸ᩳ;)V

    goto :goto_0

    .line 320
    :cond_4
    new-instance v7, Ll/ۗ᩸ᩳ;

    move-object v1, v7

    move v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Ll/ۗ᩸ᩳ;-><init>(IILjava/lang/CharSequence;II)V

    invoke-virtual {v0, v7}, Ll/᩻۬ᩳ;->֫(Ll/ۗ᩸ᩳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 322
    :goto_0
    iget p1, p0, Ll/ۤ᩸ᩳ;->᩺:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/ۤ᩸ᩳ;->᩺:I

    return-void

    :catchall_0
    move-exception p1

    iget p2, p0, Ll/ۤ᩸ᩳ;->᩺:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p0, Ll/ۤ᩸ᩳ;->᩺:I

    .line 323
    throw p1
.end method

.method public final ֫(Ll/ᩳ۬ᩳ;)V
    .locals 8

    .line 219
    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->length()I

    move-result v2

    .line 220
    iget-object v7, p0, Ll/ۤ᩸ᩳ;->ۤ:Ll/ᩳ۬ᩳ;

    .line 221
    iput-object p1, p0, Ll/ۤ᩸ᩳ;->ۤ:Ll/ᩳ۬ᩳ;

    .line 222
    iget v0, p0, Ll/ۤ᩸ᩳ;->۟:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۤ᩸ᩳ;->۟:I

    .line 224
    :try_start_0
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ܽ֫:Ll/ۨ᩸ᩳ;

    invoke-virtual {p1}, Ll/ᩳ۬ᩳ;->֫()[C

    move-result-object v1

    invoke-virtual {p1}, Ll/ᩳ۬ᩳ;->ۧ()I

    move-result v3

    const/4 v4, 0x0

    invoke-static {v1, v4, v3}, Ljava/nio/CharBuffer;->wrap([CII)Ljava/nio/CharBuffer;

    move-result-object v3

    invoke-virtual {p1}, Ll/ᩳ۬ᩳ;->ۧ()I

    move-result v5

    const/4 v6, 0x1

    const/4 v4, 0x0

    move v1, v2

    invoke-virtual/range {v0 .. v6}, Ll/ۨ᩸ᩳ;->֫(IILjava/lang/CharSequence;IIZ)V

    .line 225
    iget-object p1, p0, Ll/ۤ᩸ᩳ;->ܽ֫:Ll/ۨ᩸ᩳ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 227
    iput-object v7, p0, Ll/ۤ᩸ᩳ;->ۤ:Ll/ᩳ۬ᩳ;

    .line 228
    iget p1, p0, Ll/ۤ᩸ᩳ;->۟:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/ۤ᩸ᩳ;->۟:I

    return-void

    :catchall_0
    move-exception p1

    .line 227
    iput-object v7, p0, Ll/ۤ᩸ᩳ;->ۤ:Ll/ᩳ۬ᩳ;

    .line 228
    iget v0, p0, Ll/ۤ᩸ᩳ;->۟:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ۤ᩸ᩳ;->۟:I

    .line 229
    throw p1
.end method

.method public final ֫(Ll/᩻۬ᩳ;)V
    .locals 2

    .line 196
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ᩳ֫:Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 198
    :try_start_0
    invoke-direct {p0}, Ll/ۤ᩸ᩳ;->ᩴ()V

    .line 199
    iget-object v1, p0, Ll/ۤ᩸ᩳ;->ۧ֫:Ll/᩻۬ᩳ;

    if-ne v1, p1, :cond_1

    .line 200
    iget p1, p0, Ll/ۤ᩸ᩳ;->۟:I

    if-nez p1, :cond_0

    iget p1, p0, Ll/ۤ᩸ᩳ;->ۗ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 201
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return-void

    .line 200
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot publish text load during callbacks"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 199
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v1, "Text batch belongs to another session"

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    .line 201
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    throw p1
.end method

.method public ֫(Z)V
    .locals 0

    .line 162
    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->close()V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 639
    iget-boolean v0, p0, Ll/ۤ᩸ᩳ;->᩸:Z

    return v0
.end method

.method public final ֫(Ll/۟᩸ᩳ;)Z
    .locals 3

    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 126
    :cond_0
    invoke-virtual {p1}, Ll/۟᩸ᩳ;->ۖ()Ll/۫᩹ᩳ;

    move-result-object v0

    :goto_0
    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    .line 128
    :cond_1
    iget-object v2, p0, Ll/ۤ᩸ᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 130
    :try_start_0
    iget-boolean v2, p0, Ll/ۤ᩸ᩳ;->᩸:Z

    if-nez v2, :cond_3

    iget v2, p0, Ll/ۤ᩸ᩳ;->᩺:I

    if-nez v2, :cond_3

    invoke-virtual {p1}, Ll/۟᩸ᩳ;->ܳ()I

    move-result p1

    iget v2, p0, Ll/ۤ᩸ᩳ;->ۨ:I

    if-ne p1, v2, :cond_3

    iget-object p1, p0, Ll/ۤ᩸ᩳ;->ۧ֫:Ll/᩻۬ᩳ;

    if-nez p1, :cond_2

    iget-object p1, p0, Ll/ۤ᩸ᩳ;->᩶:Ll/ۖ᩹ᩳ;

    .line 131
    invoke-virtual {p1, v0}, Ll/ۖ᩹ᩳ;->֫(Ll/۫᩹ᩳ;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_2
    invoke-virtual {p1, v0}, Ll/᩻۬ᩳ;->֫(Ll/۫᩹ᩳ;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_3

    :goto_1
    const/4 v1, 0x1

    .line 133
    :cond_3
    iget-object p1, p0, Ll/ۤ᩸ᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    return v1

    :catchall_0
    move-exception p1

    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ܰ:Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 134
    throw p1
.end method

.method public final ֫(Ll/᩻۬ᩳ;Ll/֡ۗᩳ;[CILl/ۚۙᩳ;I)Z
    .locals 8

    .line 210
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ᩳ֫:Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 212
    :try_start_0
    invoke-virtual {p0, p1}, Ll/ۤ᩸ᩳ;->֫(Ll/᩻۬ᩳ;)V

    .line 213
    iget-object v1, p0, Ll/ۤ᩸ᩳ;->ۧ֫:Ll/᩻۬ᩳ;

    iget-object v2, p0, Ll/ۤ᩸ᩳ;->۫:Ll/֨ۙᩳ;

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    move v7, p6

    invoke-virtual/range {v1 .. v7}, Ll/᩻۬ᩳ;->֫(Ll/֨ۙᩳ;Ll/֡ۗᩳ;[CILl/ۚۙᩳ;I)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 214
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return p1

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    throw p1
.end method

.method public final ۖ()V
    .locals 3

    .line 616
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ۧ֫:Ll/᩻۬ᩳ;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Ll/ۤ᩸ᩳ;->֫֫:Z

    if-nez v1, :cond_0

    invoke-static {p0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v1

    invoke-static {p0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ll/᩻۬ᩳ;->֫(II)V

    :cond_0
    return-void
.end method

.method public final ۖ֫()Ll/۟᩸ᩳ;
    .locals 1

    const/4 v0, 0x0

    .line 101
    invoke-direct {p0, v0}, Ll/ۤ᩸ᩳ;->ܽ(Z)Ll/۟᩸ᩳ;

    move-result-object v0

    return-object v0
.end method

.method public ۗ֫()Ll/ܽ۬ᩳ;
    .locals 1

    const/4 v0, 0x1

    .line 141
    invoke-direct {p0, v0}, Ll/ۤ᩸ᩳ;->ᩳ(Z)Ll/ܽ۬ᩳ;

    move-result-object v0

    return-object v0
.end method

.method public ۤ֫()Ll/ܽ۬ᩳ;
    .locals 1

    const/4 v0, 0x0

    .line 138
    invoke-direct {p0, v0}, Ll/ۤ᩸ᩳ;->ᩳ(Z)Ll/ܽ۬ᩳ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(II)Ljava/lang/String;
    .locals 0

    .line 466
    invoke-virtual {p0, p1, p2}, Ll/ۤ᩸ᩳ;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(I)V
    .locals 2

    const/4 v0, 0x0

    const-string v1, ""

    .line 346
    invoke-virtual {p0, v0, p1, v1}, Ll/ۤ᩸ᩳ;->replace(IILjava/lang/CharSequence;)Ll/ۤ᩸ᩳ;

    return-void
.end method

.method public final ۧ(II[CI)V
    .locals 0

    .line 402
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ۤ᩸ᩳ;->֫(II[CI)V

    return-void
.end method

.method public final ۧ(Ljava/lang/Runnable;)V
    .locals 4

    .line 145
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ᩳ֫:Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 147
    :try_start_0
    invoke-direct {p0}, Ll/ۤ᩸ᩳ;->ᩴ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 148
    iget-object v1, p0, Ll/ۤ᩸ᩳ;->ۧ֫:Ll/᩻۬ᩳ;

    if-eqz v1, :cond_1

    .line 149
    :try_start_1
    iget v2, p0, Ll/ۤ᩸ᩳ;->ۗ:I

    if-nez v2, :cond_0

    iget v3, p0, Ll/ۤ᩸ᩳ;->۟:I

    if-nez v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    .line 150
    iput v2, p0, Ll/ۤ᩸ᩳ;->ۗ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 152
    :try_start_2
    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->ۖ()V

    .line 153
    invoke-virtual {v1, p1}, Ll/᩻۬ᩳ;->֫(Ljava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 154
    :try_start_3
    iget p1, p0, Ll/ۤ᩸ᩳ;->ۗ:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/ۤ᩸ᩳ;->ۗ:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 155
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    .line 154
    :try_start_4
    iget v1, p0, Ll/ۤ᩸ᩳ;->ۗ:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll/ۤ᩸ᩳ;->ۗ:I

    throw p1

    .line 149
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot group history during text callbacks"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 148
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "History requires a text session"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p1

    .line 155
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    throw p1
.end method

.method public ۬()I
    .locals 1

    .line 156
    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->hashCode()I

    move-result v0

    return v0
.end method

.method public final ܳ()Ll/֨ۙᩳ;
    .locals 1

    .line 43
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->۫:Ll/֨ۙᩳ;

    return-object v0
.end method

.method public final ܶ()Ll/۟᩸ᩳ;
    .locals 1

    const/4 v0, 0x1

    .line 104
    invoke-direct {p0, v0}, Ll/ۤ᩸ᩳ;->ܽ(Z)Ll/۟᩸ᩳ;

    move-result-object v0

    return-object v0
.end method

.method public final ܺ֫()Ll/᩸᩸ᩳ;
    .locals 2

    .line 611
    new-instance v0, Ll/᩸᩸ᩳ;

    const/4 v1, -0x1

    invoke-direct {v0, p0, v1}, Ll/᩸᩸ᩳ;-><init>(Landroid/text/Editable;I)V

    return-object v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 303
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ۛ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->isWriteLockedByCurrentThread()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Ll/ۤ᩸ᩳ;->۟:I

    if-nez v0, :cond_0

    iget v0, p0, Ll/ۤ᩸ᩳ;->ۗ:I

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩻()Ll/۫᩹ᩳ;
    .locals 1

    .line 95
    invoke-direct {p0}, Ll/ۤ᩸ᩳ;->ᩴ()V

    .line 96
    iget-object v0, p0, Ll/ۤ᩸ᩳ;->ۧ֫:Ll/᩻۬ᩳ;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۤ᩸ᩳ;->᩶:Ll/ۖ᩹ᩳ;

    invoke-virtual {v0}, Ll/ۖ᩹ᩳ;->֫()Ll/۫᩹ᩳ;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ll/᩻۬ᩳ;->ۧ֫()Ll/۫᩹ᩳ;

    move-result-object v0

    return-object v0
.end method
