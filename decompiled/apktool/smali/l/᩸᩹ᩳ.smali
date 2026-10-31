.class public final Ll/᩸᩹ᩳ;
.super Ll/᩶᩹ᩳ;
.source "26UL"


# instance fields
.field public final ۜ:Ll/ۧ۫ᩳ;

.field public final ܳ:I

.field public final ᩷:Ll/۠۬ᩳ;

.field public final ᩻:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;I[CIILl/᩸۬ᩳ;)V
    .locals 9

    const/4 v0, 0x0

    .line 20
    invoke-direct {p0, v0, p1}, Ll/᩶᩹ᩳ;-><init>(ILjava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v0, 0x1

    move p1, p4

    const/4 v6, 0x0

    const/4 v7, 0x1

    :goto_0
    add-int v0, p4, p5

    if-ge p1, v0, :cond_2

    .line 24
    aget-char v0, p3, p1

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    add-int/lit8 v6, v6, 0x1

    :cond_0
    const/16 v1, 0xff

    if-le v0, v1, :cond_1

    const/4 v0, 0x0

    const/4 v7, 0x0

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 27
    :cond_2
    iput p2, p0, Ll/᩸᩹ᩳ;->ܳ:I

    .line 28
    iput-boolean v7, p0, Ll/᩸᩹ᩳ;->᩻:Z

    .line 29
    iput p5, p0, Ll/᩶᩹ᩳ;->ۧ:I

    .line 30
    iput v6, p0, Ll/᩶᩹ᩳ;->ܽ:I

    const/4 p1, 0x0

    if-nez p6, :cond_3

    .line 32
    iput-object p1, p0, Ll/᩸᩹ᩳ;->᩷:Ll/۠۬ᩳ;

    .line 33
    new-instance p1, Ll/ۧ۫ᩳ;

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v1 .. v7}, Ll/ۧ۫ᩳ;-><init>(I[CIIIZ)V

    iput-object p1, p0, Ll/᩸᩹ᩳ;->ۜ:Ll/ۧ۫ᩳ;

    return-void

    .line 36
    :cond_3
    new-instance v8, Ll/֨᩹ᩳ;

    move-object v0, v8

    move-object v1, p0

    move v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Ll/֨᩹ᩳ;-><init>(Ll/᩸᩹ᩳ;I[CII)V

    invoke-virtual {p6, p5, v6, v7, v8}, Ll/᩸۬ᩳ;->֫(IIZLjava/util/function/Supplier;)Ll/۠۬ᩳ;

    move-result-object p2

    iput-object p2, p0, Ll/᩸᩹ᩳ;->᩷:Ll/۠۬ᩳ;

    .line 38
    iput-object p1, p0, Ll/᩸᩹ᩳ;->ۜ:Ll/ۧ۫ᩳ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ll/۠۬ᩳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 43
    invoke-direct {p0, v0, p1}, Ll/᩶᩹ᩳ;-><init>(ILjava/lang/Object;)V

    .line 44
    iput-object p2, p0, Ll/᩸᩹ᩳ;->᩷:Ll/۠۬ᩳ;

    const/4 p1, 0x0

    .line 45
    iput-object p1, p0, Ll/᩸᩹ᩳ;->ۜ:Ll/ۧ۫ᩳ;

    .line 46
    iget p1, p2, Ll/۠۬ᩳ;->ۧ:I

    iput p1, p0, Ll/᩸᩹ᩳ;->ܳ:I

    .line 47
    iget-boolean p1, p2, Ll/۠۬ᩳ;->ᩳ:Z

    iput-boolean p1, p0, Ll/᩸᩹ᩳ;->᩻:Z

    .line 48
    iget p1, p2, Ll/۠۬ᩳ;->ܿ:I

    iput p1, p0, Ll/᩶᩹ᩳ;->ۧ:I

    .line 49
    iget p1, p2, Ll/۠۬ᩳ;->ܳ:I

    iput p1, p0, Ll/᩶᩹ᩳ;->ܽ:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ll/ۧ۫ᩳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 53
    invoke-direct {p0, v0, p1}, Ll/᩶᩹ᩳ;-><init>(ILjava/lang/Object;)V

    const/4 p1, 0x0

    .line 54
    iput-object p1, p0, Ll/᩸᩹ᩳ;->᩷:Ll/۠۬ᩳ;

    .line 55
    iput-object p2, p0, Ll/᩸᩹ᩳ;->ۜ:Ll/ۧ۫ᩳ;

    .line 56
    invoke-virtual {p2}, Ll/ۧ۫ᩳ;->ۧ()I

    move-result p1

    iput p1, p0, Ll/᩸᩹ᩳ;->ܳ:I

    .line 57
    invoke-virtual {p2}, Ll/ۧ۫ᩳ;->ܽ()Z

    move-result p1

    iput-boolean p1, p0, Ll/᩸᩹ᩳ;->᩻:Z

    .line 58
    invoke-virtual {p2}, Ll/ۧ۫ᩳ;->ᩳ()I

    move-result p1

    iput p1, p0, Ll/᩶᩹ᩳ;->ۧ:I

    .line 59
    invoke-virtual {p2}, Ll/ۧ۫ᩳ;->ܿ()I

    move-result p1

    iput p1, p0, Ll/᩶᩹ᩳ;->ܽ:I

    return-void
.end method

.method public static synthetic ֫(Ll/᩸᩹ᩳ;I[CII)Ll/ۧ۫ᩳ;
    .locals 8

    .line 37
    new-instance v7, Ll/ۧ۫ᩳ;

    iget v5, p0, Ll/᩶᩹ᩳ;->ܽ:I

    iget-boolean v6, p0, Ll/᩸᩹ᩳ;->᩻:Z

    move-object v0, v7

    move v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v6}, Ll/ۧ۫ᩳ;-><init>(I[CIIIZ)V

    return-object v7
.end method


# virtual methods
.method public final ֫(I)C
    .locals 2

    .line 79
    iget-object v0, p0, Ll/᩸᩹ᩳ;->ۜ:Ll/ۧ۫ᩳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/ۧ۫ᩳ;->֫(I)C

    move-result p1

    return p1

    .line 80
    :cond_0
    invoke-virtual {p0}, Ll/᩸᩹ᩳ;->ܽ()Ll/ܶ᩹ᩳ;

    move-result-object v0

    .line 81
    :try_start_0
    iget-object v1, v0, Ll/ܶ᩹ᩳ;->᩹:Ll/ۧ۫ᩳ;

    invoke-virtual {v1, p1}, Ll/ۧ۫ᩳ;->֫(I)C

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    invoke-virtual {v0}, Ll/ܶ᩹ᩳ;->close()V

    return p1

    :catchall_0
    move-exception p1

    .line 80
    :try_start_1
    invoke-virtual {v0}, Ll/ܶ᩹ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final ֫()I
    .locals 1

    .line 63
    iget v0, p0, Ll/᩸᩹ᩳ;->ܳ:I

    return v0
.end method

.method public final ֫(Ljava/lang/Object;II[CI)Ll/᩸᩹ᩳ;
    .locals 14

    move-object v1, p0

    move-object v0, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move-object/from16 v6, p4

    move/from16 v7, p5

    .line 97
    invoke-virtual {p0}, Ll/᩸᩹ᩳ;->ܽ()Ll/ܶ᩹ᩳ;

    move-result-object v8

    .line 98
    :try_start_0
    iget-object v3, v8, Ll/ܶ᩹ᩳ;->᩹:Ll/ۧ۫ᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    iget-object v2, v1, Ll/᩸᩹ᩳ;->᩷:Ll/۠۬ᩳ;

    if-nez v2, :cond_0

    :try_start_1
    new-instance v2, Ll/᩸᩹ᩳ;

    invoke-virtual {v3, v4, v5, v6, v7}, Ll/ۧ۫ᩳ;->ۧ(II[CI)Ll/ۧ۫ᩳ;

    move-result-object v3

    invoke-direct {v2, p1, v3}, Ll/᩸᩹ᩳ;-><init>(Ljava/lang/Object;Ll/ۧ۫ᩳ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 109
    invoke-virtual {v8}, Ll/ܶ᩹ᩳ;->close()V

    return-object v2

    .line 100
    :cond_0
    :try_start_2
    iget v9, v1, Ll/᩶᩹ᩳ;->ܽ:I

    invoke-virtual {v3, v5}, Ll/ۧ۫ᩳ;->ۧ(I)I

    move-result v10

    invoke-virtual {v3, v4}, Ll/ۧ۫ᩳ;->ۧ(I)I

    move-result v11

    sub-int/2addr v10, v11

    sub-int/2addr v9, v10

    .line 101
    iget-boolean v10, v1, Ll/᩸᩹ᩳ;->᩻:Z

    const/4 v11, 0x0

    :goto_0
    if-ge v11, v7, :cond_3

    .line 103
    aget-char v12, v6, v11

    const/16 v13, 0xa

    if-ne v12, v13, :cond_1

    add-int/lit8 v9, v9, 0x1

    :cond_1
    const/16 v13, 0xff

    if-le v12, v13, :cond_2

    const/4 v10, 0x0

    :cond_2
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 106
    :cond_3
    iget-object v11, v2, Ll/۠۬ᩳ;->ۜ:Ll/᩸۬ᩳ;

    iget v2, v1, Ll/᩶᩹ᩳ;->ۧ:I

    sub-int v12, v5, v4

    sub-int/2addr v2, v12

    add-int v12, v2, v7

    new-instance v13, Ll/۠᩹ᩳ;

    move-object v2, v13

    move/from16 v4, p2

    move/from16 v5, p3

    move-object/from16 v6, p4

    move/from16 v7, p5

    invoke-direct/range {v2 .. v7}, Ll/۠᩹ᩳ;-><init>(Ll/ۧ۫ᩳ;II[CI)V

    invoke-virtual {v11, v12, v9, v10, v13}, Ll/᩸۬ᩳ;->֫(IIZLjava/util/function/Supplier;)Ll/۠۬ᩳ;

    move-result-object v2

    .line 108
    new-instance v3, Ll/᩸᩹ᩳ;

    invoke-direct {v3, p1, v2}, Ll/᩸᩹ᩳ;-><init>(Ljava/lang/Object;Ll/۠۬ᩳ;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 109
    invoke-virtual {v8}, Ll/ܶ᩹ᩳ;->close()V

    return-object v3

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 97
    :try_start_3
    invoke-virtual {v8}, Ll/ܶ᩹ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v2
.end method

.method public final ֫([CII)V
    .locals 3

    const/4 v0, 0x0

    .line 86
    iget-object v1, p0, Ll/᩸᩹ᩳ;->ۜ:Ll/ۧ۫ᩳ;

    if-eqz v1, :cond_0

    .line 87
    invoke-virtual {v1, v0, p2, p1, p3}, Ll/ۧ۫ᩳ;->֫(II[CI)V

    return-void

    .line 90
    :cond_0
    invoke-virtual {p0}, Ll/᩸᩹ᩳ;->ܽ()Ll/ܶ᩹ᩳ;

    move-result-object v1

    .line 91
    :try_start_0
    iget-object v2, v1, Ll/ܶ᩹ᩳ;->᩹:Ll/ۧ۫ᩳ;

    invoke-virtual {v2, v0, p2, p1, p3}, Ll/ۧ۫ᩳ;->֫(II[CI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    invoke-virtual {v1}, Ll/ܶ᩹ᩳ;->close()V

    return-void

    :catchall_0
    move-exception p1

    .line 90
    :try_start_1
    invoke-virtual {v1}, Ll/ܶ᩹ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final ۧ(I)I
    .locals 2

    .line 113
    iget-object v0, p0, Ll/᩸᩹ᩳ;->ۜ:Ll/ۧ۫ᩳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/ۧ۫ᩳ;->ۧ(I)I

    move-result p1

    return p1

    .line 114
    :cond_0
    invoke-virtual {p0}, Ll/᩸᩹ᩳ;->ܽ()Ll/ܶ᩹ᩳ;

    move-result-object v0

    .line 115
    :try_start_0
    iget-object v1, v0, Ll/ܶ᩹ᩳ;->᩹:Ll/ۧ۫ᩳ;

    invoke-virtual {v1, p1}, Ll/ۧ۫ᩳ;->ۧ(I)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    invoke-virtual {v0}, Ll/ܶ᩹ᩳ;->close()V

    return p1

    :catchall_0
    move-exception p1

    .line 114
    :try_start_1
    invoke-virtual {v0}, Ll/ܶ᩹ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final ۧ()Z
    .locals 1

    .line 67
    iget-boolean v0, p0, Ll/᩸᩹ᩳ;->᩻:Z

    return v0
.end method

.method public final ܽ(I)I
    .locals 2

    .line 120
    iget-object v0, p0, Ll/᩸᩹ᩳ;->ۜ:Ll/ۧ۫ᩳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/ۧ۫ᩳ;->ܽ(I)I

    move-result p1

    return p1

    .line 121
    :cond_0
    invoke-virtual {p0}, Ll/᩸᩹ᩳ;->ܽ()Ll/ܶ᩹ᩳ;

    move-result-object v0

    .line 122
    :try_start_0
    iget-object v1, v0, Ll/ܶ᩹ᩳ;->᩹:Ll/ۧ۫ᩳ;

    invoke-virtual {v1, p1}, Ll/ۧ۫ᩳ;->ܽ(I)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    invoke-virtual {v0}, Ll/ܶ᩹ᩳ;->close()V

    return p1

    :catchall_0
    move-exception p1

    .line 121
    :try_start_1
    invoke-virtual {v0}, Ll/ܶ᩹ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final ܽ()Ll/ܶ᩹ᩳ;
    .locals 4

    const/4 v0, 0x0

    .line 74
    iget-object v1, p0, Ll/᩸᩹ᩳ;->ۜ:Ll/ۧ۫ᩳ;

    if-eqz v1, :cond_0

    new-instance v2, Ll/ܶ᩹ᩳ;

    invoke-direct {v2, v1, v0}, Ll/ܶ᩹ᩳ;-><init>(Ll/ۧ۫ᩳ;Ll/᩵۬ᩳ;)V

    return-object v2

    .line 75
    :cond_0
    new-instance v1, Ll/ܶ᩹ᩳ;

    iget-object v2, p0, Ll/᩸᩹ᩳ;->᩷:Ll/۠۬ᩳ;

    iget-object v3, v2, Ll/۠۬ᩳ;->ۜ:Ll/᩸۬ᩳ;

    iget-object v3, v3, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    invoke-virtual {v3, v2}, Ll/֨۬ᩳ;->֫(Ll/۠۬ᩳ;)Ll/᩵۬ᩳ;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Ll/ܶ᩹ᩳ;-><init>(Ll/ۧ۫ᩳ;Ll/᩵۬ᩳ;)V

    return-object v1
.end method

.method public final ᩳ()Ljava/lang/Object;
    .locals 1

    .line 71
    iget-object v0, p0, Ll/᩸᩹ᩳ;->᩷:Ll/۠۬ᩳ;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/᩸᩹ᩳ;->ۜ:Ll/ۧ۫ᩳ;

    :cond_0
    return-object v0
.end method
