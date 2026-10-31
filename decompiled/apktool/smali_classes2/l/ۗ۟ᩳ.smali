.class public final Ll/ۗ۟ᩳ;
.super Ljava/lang/Object;
.source "46OI"


# instance fields
.field public final ֫:Ll/ۗۤᩳ;

.field public final ۜ:Ll/᩸ܰᩳ;

.field public final ۡ:I

.field public final ۢ:I

.field public final ۧ:I

.field public final ܳ:I

.field public final ܺ:I

.field public final ܽ:I

.field public final ܿ:I

.field public final ᩳ:I

.field public final ᩷:Ll/᩷۟ᩳ;

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ll/ۗۤᩳ;IIIII)V
    .locals 2

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Ll/ۗ۟ᩳ;->֫:Ll/ۗۤᩳ;

    .line 20
    iget-object v0, p1, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    iput-object v0, p0, Ll/ۗ۟ᩳ;->᩷:Ll/᩷۟ᩳ;

    .line 21
    iget-object v1, p1, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    iput-object v1, p0, Ll/ۗ۟ᩳ;->ۜ:Ll/᩸ܰᩳ;

    .line 23
    iput p3, p0, Ll/ۗ۟ᩳ;->ۢ:I

    .line 24
    iput p4, p0, Ll/ۗ۟ᩳ;->ܳ:I

    .line 25
    iput p5, p0, Ll/ۗ۟ᩳ;->ۡ:I

    .line 26
    iput p6, p0, Ll/ۗ۟ᩳ;->ܺ:I

    .line 27
    invoke-virtual {p1}, Ll/ۗۤᩳ;->ۤ()I

    move-result p5

    iput p5, p0, Ll/ۗ۟ᩳ;->ܿ:I

    const/4 p5, 0x1

    .line 28
    invoke-virtual {p1, p2, p5}, Ll/ۗۤᩳ;->֫(IZ)I

    move-result p5

    invoke-virtual {v0, p5}, Ll/᩷۟ᩳ;->ᩳ(I)I

    move-result p5

    iput p5, p0, Ll/ۗ۟ᩳ;->ᩳ:I

    add-int/2addr p2, p3

    const/4 p6, 0x0

    .line 29
    invoke-virtual {p1, p2, p6}, Ll/ۗۤᩳ;->֫(IZ)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/᩷۟ᩳ;->ܿ(I)I

    move-result p1

    iput p1, p0, Ll/ۗ۟ᩳ;->᩻:I

    .line 30
    invoke-virtual {v0, p5}, Ll/᩷۟ᩳ;->ۚ(I)I

    move-result p2

    iput p2, p0, Ll/ۗ۟ᩳ;->ܽ:I

    .line 31
    invoke-virtual {v0, p1}, Ll/᩷۟ᩳ;->ۧ(I)I

    move-result p1

    add-int/2addr p1, p4

    sub-int/2addr p1, p3

    iput p1, p0, Ll/ۗ۟ᩳ;->ۧ:I

    return-void
.end method

.method public static ֫(Ljava/util/function/BooleanSupplier;)V
    .locals 1

    .line 105
    invoke-interface {p0}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/util/concurrent/CancellationException;

    const-string v0, "Layout preparation canceled"

    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final ֫(Ll/ۗۤᩳ;Ljava/util/function/BooleanSupplier;)Ll/ۙ۟ᩳ;
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 47
    iget v2, v1, Ll/ۗ۟ᩳ;->ܽ:I

    iget v3, v1, Ll/ۗ۟ᩳ;->ۧ:I

    iget-object v4, v1, Ll/ۗ۟ᩳ;->᩷:Ll/᩷۟ᩳ;

    iget v5, v1, Ll/ۗ۟ᩳ;->ᩳ:I

    invoke-virtual {v4, v5}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v6

    .line 48
    iget v7, v1, Ll/ۗ۟ᩳ;->᩻:I

    invoke-virtual {v4, v7}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v8

    .line 49
    new-instance v9, Ll/᩷۟ᩳ;

    invoke-virtual {v4}, Ll/᩷۟ᩳ;->size()I

    move-result v10

    sub-int v11, v7, v5

    add-int/lit8 v11, v11, 0x1

    sub-int/2addr v10, v11

    const/16 v11, 0x10

    invoke-static {v11, v10}, Ljava/lang/Math;->max(II)I

    const/4 v10, 0x0

    invoke-direct {v9, v10}, Ll/᩷۟ᩳ;-><init>(I)V

    .line 50
    new-instance v10, Ll/᩸ܰᩳ;

    invoke-direct {v10}, Ll/᩸ܰᩳ;-><init>()V

    const/4 v11, 0x0

    :goto_0
    const/16 v12, 0x4000

    if-ge v11, v5, :cond_0

    .line 85
    invoke-static/range {p2 .. p2}, Ll/ۗ۟ᩳ;->֫(Ljava/util/function/BooleanSupplier;)V

    sub-int v13, v5, v11

    .line 86
    invoke-static {v13, v12}, Ljava/lang/Math;->min(II)I

    move-result v12

    add-int/2addr v12, v11

    .line 87
    invoke-virtual {v9, v11, v12, v4}, Ll/᩷۟ᩳ;->֫(IILl/᩷۟ᩳ;)V

    move v11, v12

    goto :goto_0

    .line 90
    :cond_0
    invoke-static/range {p2 .. p2}, Ll/ۗ۟ᩳ;->֫(Ljava/util/function/BooleanSupplier;)V

    const/4 v11, 0x0

    .line 95
    :goto_1
    iget-object v13, v1, Ll/ۗ۟ᩳ;->ۜ:Ll/᩸ܰᩳ;

    if-ge v11, v6, :cond_1

    .line 96
    invoke-static/range {p2 .. p2}, Ll/ۗ۟ᩳ;->֫(Ljava/util/function/BooleanSupplier;)V

    sub-int v14, v6, v11

    .line 97
    invoke-static {v14, v12}, Ljava/lang/Math;->min(II)I

    move-result v14

    add-int/2addr v14, v11

    .line 98
    invoke-virtual {v10, v13, v11, v14}, Ll/᩸ܰᩳ;->֫(Ll/᩸ܰᩳ;II)V

    move v11, v14

    goto :goto_1

    .line 101
    :cond_1
    invoke-static/range {p2 .. p2}, Ll/ۗ۟ᩳ;->֫(Ljava/util/function/BooleanSupplier;)V

    .line 54
    invoke-virtual/range {p1 .. p1}, Ll/ۗۤᩳ;->᩹()Ll/۟᩸ᩳ;

    move-result-object v11

    .line 55
    :try_start_0
    invoke-virtual {v0, v11, v2, v3}, Ll/ۗۤᩳ;->֫(Ll/۟᩸ᩳ;II)Ll/᩺᩸ᩳ;

    move-result-object v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 57
    :try_start_1
    new-instance v14, Ll/ۨܰᩳ;

    invoke-direct {v14}, Ll/ۨܰᩳ;-><init>()V

    move v15, v6

    .line 59
    :goto_2
    invoke-static/range {p2 .. p2}, Ll/ۗ۟ᩳ;->֫(Ljava/util/function/BooleanSupplier;)V

    move/from16 v16, v5

    .line 60
    iget-object v5, v0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {v5}, Ll/ۢ۫ۡ;->ۡ()I

    move-result v5

    invoke-static {v0, v11, v2, v5}, Ll/᩵ܰᩳ;->֫(Ll/ۗۤᩳ;Ljava/lang/CharSequence;II)I

    move-result v5

    invoke-virtual {v10, v5}, Ll/᩸ܰᩳ;->add(I)V

    .line 61
    invoke-virtual {v12}, Ll/᩺᩸ᩳ;->֫()I

    move-result v5

    if-ltz v5, :cond_3

    if-lt v5, v3, :cond_2

    goto :goto_3

    :cond_2
    const/16 v17, 0x0

    goto :goto_4

    :cond_3
    :goto_3
    const/16 v17, 0x1

    :goto_4
    if-eqz v17, :cond_4

    move v5, v3

    :cond_4
    move/from16 v18, v3

    add-int/lit8 v3, v15, 0x1

    .line 64
    invoke-virtual {v14, v2, v5, v15}, Ll/ۨܰᩳ;->֫(III)V

    .line 65
    invoke-virtual {v14, v11}, Ll/ۨܰᩳ;->֫(Ll/۟᩸ᩳ;)V

    .line 66
    invoke-virtual {v9, v14}, Ll/᩷۟ᩳ;->֫(Ll/ۨܰᩳ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v17, :cond_7

    .line 70
    :try_start_2
    invoke-virtual {v12}, Ll/᩺᩸ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {v11}, Ll/۟᩸ᩳ;->close()V

    .line 71
    invoke-virtual {v9}, Ll/᩷۟ᩳ;->size()I

    move-result v2

    sub-int v5, v3, v8

    add-int/lit8 v5, v5, -0x1

    add-int/lit8 v7, v7, 0x1

    .line 73
    invoke-virtual {v4}, Ll/᩷۟ᩳ;->size()I

    move-result v11

    :goto_5
    if-ge v7, v11, :cond_5

    .line 85
    invoke-static/range {p2 .. p2}, Ll/ۗ۟ᩳ;->֫(Ljava/util/function/BooleanSupplier;)V

    sub-int v12, v11, v7

    const/16 v14, 0x4000

    .line 86
    invoke-static {v12, v14}, Ljava/lang/Math;->min(II)I

    move-result v12

    add-int/2addr v12, v7

    .line 87
    invoke-virtual {v9, v7, v12, v4}, Ll/᩷۟ᩳ;->֫(IILl/᩷۟ᩳ;)V

    move v7, v12

    goto :goto_5

    .line 90
    :cond_5
    invoke-static/range {p2 .. p2}, Ll/ۗ۟ᩳ;->֫(Ljava/util/function/BooleanSupplier;)V

    .line 74
    invoke-virtual {v9}, Ll/᩷۟ᩳ;->size()I

    move-result v4

    iget v7, v1, Ll/ۗ۟ᩳ;->ܳ:I

    iget v11, v1, Ll/ۗ۟ᩳ;->ۢ:I

    sub-int/2addr v7, v11

    invoke-virtual {v9, v2, v4, v7, v5}, Ll/᩷۟ᩳ;->֫(IIII)V

    add-int/lit8 v8, v8, 0x1

    .line 75
    invoke-virtual {v13}, Ll/᩸ܰᩳ;->size()I

    move-result v4

    :goto_6
    if-ge v8, v4, :cond_6

    .line 96
    invoke-static/range {p2 .. p2}, Ll/ۗ۟ᩳ;->֫(Ljava/util/function/BooleanSupplier;)V

    sub-int v5, v4, v8

    const/16 v7, 0x4000

    .line 97
    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    move-result v5

    add-int/2addr v5, v8

    .line 98
    invoke-virtual {v10, v13, v8, v5}, Ll/᩸ܰᩳ;->֫(Ll/᩸ܰᩳ;II)V

    move v8, v5

    goto :goto_6

    .line 101
    :cond_6
    invoke-static/range {p2 .. p2}, Ll/ۗ۟ᩳ;->֫(Ljava/util/function/BooleanSupplier;)V

    .line 76
    invoke-virtual {v10, v6, v3}, Ll/᩸ܰᩳ;->ᩳ(II)V

    .line 77
    iput-object v9, v0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    .line 78
    iput-object v10, v0, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    .line 79
    new-instance v0, Ll/ۙ۟ᩳ;

    move/from16 v15, v16

    invoke-direct {v0, v15, v2}, Ll/ۙ۟ᩳ;-><init>(II)V

    return-object v0

    :cond_7
    move/from16 v15, v16

    add-int/lit8 v2, v5, 0x1

    move v5, v15

    move v15, v3

    move/from16 v3, v18

    goto/16 :goto_2

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 54
    :try_start_3
    invoke-virtual {v12}, Ll/᩺᩸ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_7

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_4
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v0

    move-object v2, v0

    :try_start_5
    invoke-virtual {v11}, Ll/۟᩸ᩳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_8

    :catchall_3
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw v2
.end method

.method public final ֫(Ll/ۗۤᩳ;II)Z
    .locals 2

    .line 39
    iget-object v0, p0, Ll/ۗ۟ᩳ;->֫:Ll/ۗۤᩳ;

    if-ne p1, v0, :cond_0

    iget-object p1, v0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    iget-object v1, p0, Ll/ۗ۟ᩳ;->᩷:Ll/᩷۟ᩳ;

    if-ne p1, v1, :cond_0

    iget-object p1, v0, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    iget-object v1, p0, Ll/ۗ۟ᩳ;->ۜ:Ll/᩸ܰᩳ;

    if-ne p1, v1, :cond_0

    .line 40
    invoke-virtual {v0}, Ll/ۗۤᩳ;->ۖ()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Ll/ۗ۟ᩳ;->֫:Ll/ۗۤᩳ;

    iget-boolean p1, p1, Ll/ۗۤᩳ;->ܳ֫:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Ll/ۗ۟ᩳ;->֫:Ll/ۗۤᩳ;

    invoke-virtual {p1}, Ll/ۗۤᩳ;->᩶()Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Ll/ۗ۟ᩳ;->֫:Ll/ۗۤᩳ;

    .line 41
    invoke-virtual {p1}, Ll/ۗۤᩳ;->ۤ()I

    move-result p1

    iget v0, p0, Ll/ۗ۟ᩳ;->ܿ:I

    if-ne p1, v0, :cond_0

    iget p1, p0, Ll/ۗ۟ᩳ;->ۡ:I

    if-ne p2, p1, :cond_0

    iget p1, p0, Ll/ۗ۟ᩳ;->ܺ:I

    if-ne p3, p1, :cond_0

    iget-object p1, p0, Ll/ۗ۟ᩳ;->֫:Ll/ۗۤᩳ;

    iget-object p1, p1, Ll/ۗۤᩳ;->ܳ:Ll/ᩴۨᩳ;

    iget-object p2, p0, Ll/ۗ۟ᩳ;->֫:Ll/ۗۤᩳ;

    iget-object p2, p2, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    .line 42
    invoke-virtual {p2}, Ll/۫ۨᩳ;->᩻ܽ()Ll/ᩴۨᩳ;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ᩴۨᩳ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
