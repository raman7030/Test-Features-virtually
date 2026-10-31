.class public final Ll/ۛ᩺ᩳ;
.super Ljava/lang/Object;
.source "H6NE"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ۗ:I

.field public ۙ:I

.field public ۤ:Ljava/util/ArrayList;

.field public ۫:Ll/۬᩹ᩳ;

.field public ۬:Z

.field public ᩶:J

.field public ᩸:Z

.field public ᩹:I


# direct methods
.method public static bridge synthetic ֫(Ll/ۛ᩺ᩳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۛ᩺ᩳ;->᩹:I

    return p0
.end method

.method public static ֫(Ll/۟᩸ᩳ;Ll/۫ۘܽ;Ljava/lang/String;ZIZLjava/lang/Runnable;Ljava/util/function/Supplier;)Ll/ۛ᩺ᩳ;
    .locals 5

    .line 41
    new-instance v0, Ll/ۛ᩺ᩳ;

    .line 35
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Ll/ۛ᩺ᩳ;->ۤ:Ljava/util/ArrayList;

    .line 42
    :try_start_0
    new-instance v1, Ll/۬᩺ᩳ;

    invoke-direct {v1, v0, p0, p6, p7}, Ll/۬᩺ᩳ;-><init>(Ll/ۛ᩺ᩳ;Ll/۟᩸ᩳ;Ljava/lang/Runnable;Ljava/util/function/Supplier;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/ܳۨۡ; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p7, 0x1

    const/4 v2, 0x0

    if-eqz p3, :cond_1

    const/16 p3, 0x24

    .line 44
    :try_start_1
    invoke-virtual {p2, p3}, Ljava/lang/String;->indexOf(I)I

    move-result p3

    if-gez p3, :cond_0

    const/16 p3, 0x5c

    invoke-virtual {p2, p3}, Ljava/lang/String;->indexOf(I)I

    move-result p3

    if-ltz p3, :cond_1

    :cond_0
    const/4 p3, 0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    goto/16 :goto_7

    :cond_1
    const/4 p3, 0x0

    :goto_0
    const/4 v3, 0x0

    if-eqz p3, :cond_2

    .line 45
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_1

    :cond_2
    move-object v4, v3

    :goto_1
    if-eqz p5, :cond_6

    if-lez p4, :cond_6

    .line 47
    new-instance p5, Ljava/util/ArrayDeque;

    invoke-direct {p5}, Ljava/util/ArrayDeque;-><init>()V

    .line 48
    :goto_2
    invoke-static {p1}, Ll/۫۟ᩳ;->ۧ(Ll/۫ۘܽ;)Z

    move-result p7

    if-eqz p7, :cond_4

    .line 49
    invoke-interface {p6}, Ljava/lang/Runnable;->run()V

    .line 50
    invoke-virtual {p5}, Ljava/util/ArrayDeque;->size()I

    move-result p7

    if-ne p7, p4, :cond_3

    invoke-virtual {p5}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object p7

    check-cast p7, Ll/۫᩺ᩳ;

    goto :goto_3

    :cond_3
    new-instance p7, Ll/۫᩺ᩳ;

    invoke-virtual {p1}, Ll/۫ۘܽ;->pattern()Ll/ۨۘܽ;

    move-result-object v3

    invoke-direct {p7, p0, v3, p6}, Ll/۫᩺ᩳ;-><init>(Ll/۟᩸ᩳ;Ll/ۨۘܽ;Ljava/lang/Runnable;)V

    .line 51
    :goto_3
    invoke-virtual {p7, p1, p3}, Ll/۫᩺ᩳ;->֫(Ll/۫ۘܽ;Z)V

    .line 52
    invoke-virtual {p5, p7}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    goto :goto_2

    .line 54
    :cond_4
    invoke-virtual {p5}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۫᩺ᩳ;

    .line 55
    invoke-interface {p6}, Ljava/lang/Runnable;->run()V

    .line 56
    invoke-virtual {p1, v2}, Ll/۫᩺ᩳ;->start(I)I

    move-result p3

    invoke-virtual {p1, v2}, Ll/۫᩺ᩳ;->end(I)I

    move-result p4

    if-nez v4, :cond_5

    move-object p1, p2

    goto :goto_5

    .line 78
    :cond_5
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 79
    invoke-static {p1, v4, p2}, Ll/ܰۘܽ;->֫(Ll/᩺ۘܽ;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    move-object p1, v4

    .line 56
    :goto_5
    invoke-virtual {v1, p3, p4, p1}, Ll/۬᩺ᩳ;->֫(IILjava/lang/CharSequence;)V

    goto :goto_4

    :cond_6
    if-eqz p3, :cond_7

    .line 59
    new-instance v3, Ll/۫᩺ᩳ;

    invoke-virtual {p1}, Ll/۫ۘܽ;->pattern()Ll/ۨۘܽ;

    move-result-object p3

    invoke-direct {v3, p0, p3, p6}, Ll/۫᩺ᩳ;-><init>(Ll/۟᩸ᩳ;Ll/ۨۘܽ;Ljava/lang/Runnable;)V

    .line 60
    :cond_7
    invoke-static {p1}, Ll/۫۟ᩳ;->ۧ(Ll/۫ۘܽ;)Z

    move-result p0

    if-eqz p0, :cond_a

    .line 61
    invoke-interface {p6}, Ljava/lang/Runnable;->run()V

    if-eqz v3, :cond_8

    .line 62
    invoke-virtual {v3, p1, p7}, Ll/۫᩺ᩳ;->֫(Ll/۫ۘܽ;Z)V

    .line 63
    :cond_8
    invoke-virtual {p1}, Ll/۫ۘܽ;->start()I

    move-result p0

    invoke-virtual {p1}, Ll/۫ۘܽ;->end()I

    move-result p3

    if-nez v4, :cond_9

    move-object p5, p2

    goto :goto_6

    .line 78
    :cond_9
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 79
    invoke-static {v3, v4, p2}, Ll/ܰۘܽ;->֫(Ll/᩺ۘܽ;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    move-object p5, v4

    .line 63
    :goto_6
    invoke-virtual {v1, p0, p3, p5}, Ll/۬᩺ᩳ;->֫(IILjava/lang/CharSequence;)V

    if-lez p4, :cond_7

    .line 64
    iget p0, v0, Ll/ۛ᩺ᩳ;->᩹:I

    if-ne p0, p4, :cond_7

    .line 67
    :cond_a
    invoke-virtual {v1}, Ll/۬᩺ᩳ;->finish()V

    .line 68
    invoke-interface {p6}, Ljava/lang/Runnable;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    :try_start_2
    invoke-virtual {v1}, Ll/۬᩺ᩳ;->close()V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ll/ܳۨۡ; {:try_start_2 .. :try_end_2} :catch_0

    return-object v0

    .line 42
    :goto_7
    :try_start_3
    invoke-virtual {v1}, Ll/۬᩺ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_8

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw p0
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ll/ܳۨۡ; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p0

    goto :goto_9

    :catch_1
    move-exception p0

    goto :goto_9

    :catch_2
    move-exception p0

    .line 71
    :goto_9
    invoke-virtual {v0}, Ll/ۛ᩺ᩳ;->close()V

    .line 72
    throw p0
.end method

.method public static bridge synthetic ֫(Ll/ۛ᩺ᩳ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۛ᩺ᩳ;->᩹:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۛ᩺ᩳ;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/ۛ᩺ᩳ;->᩶:J

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۛ᩺ᩳ;Ljava/util/ArrayList;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۛ᩺ᩳ;->ۤ:Ljava/util/ArrayList;

    return-void
.end method

.method public static ֫(Ll/ۛ᩺ᩳ;Ll/۟᩺ᩳ;Ll/ۨ֨᩷;Ll/۫ۨᩳ;Z)V
    .locals 13

    move-object v0, p0

    move-object v7, p1

    move-object/from16 v8, p3

    .line 106
    iget-boolean v1, v0, Ll/ۛ᩺ᩳ;->۬:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    move-object v9, p2

    goto :goto_0

    :cond_0
    new-instance v1, Ll/ۗ᩺ᩳ;

    move-object v9, p2

    invoke-direct {v1, p1, p2}, Ll/ۗ᩺ᩳ;-><init>(Ll/۟᩺ᩳ;Ll/ۨ֨᩷;)V

    :goto_0
    move-object v10, v1

    .line 110
    iget-object v1, v0, Ll/ۛ᩺ᩳ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const/4 v2, -0x1

    move v11, v1

    :goto_1
    const/4 v1, 0x0

    const-string v3, "Replacement owner changed"

    if-ltz v11, :cond_5

    .line 111
    invoke-virtual/range {p3 .. p3}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v4

    if-ne v4, v7, :cond_4

    .line 112
    iget-object v3, v0, Ll/ۛ᩺ᩳ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v12, v3

    check-cast v12, Ll/ۤ᩺ᩳ;

    if-eqz v10, :cond_2

    if-ltz v2, :cond_1

    .line 115
    iget v3, v12, Ll/ۤ᩺ᩳ;->֫:I

    sub-int/2addr v2, v3

    const/16 v3, 0x100

    if-le v2, v3, :cond_1

    invoke-virtual {v10}, Ll/᩸᩸ᩳ;->ۧ()V

    .line 116
    :cond_1
    iget v2, v12, Ll/ۤ᩺ᩳ;->ᩳ:I

    iget v3, v12, Ll/ۤ᩺ᩳ;->֫:I

    iget-object v4, v12, Ll/ۤ᩺ᩳ;->ܿ:Ljava/lang/String;

    .line 47
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    .line 51
    invoke-virtual {v10, v2, v3}, Ll/᩸᩸ᩳ;->delete(II)V

    .line 52
    invoke-virtual {v10, v2, v1, v5, v4}, Ll/᩸᩸ᩳ;->֫(IIILjava/lang/CharSequence;)V

    goto :goto_2

    .line 118
    :cond_2
    invoke-virtual {p2}, Ll/ۨ֨᩷;->run()V

    .line 119
    iget-object v4, v0, Ll/ۛ᩺ᩳ;->۫:Ll/۬᩹ᩳ;

    if-nez v4, :cond_3

    iget v1, v12, Ll/ۤ᩺ᩳ;->ᩳ:I

    iget v2, v12, Ll/ۤ᩺ᩳ;->֫:I

    iget-object v3, v12, Ll/ۤ᩺ᩳ;->ܿ:Ljava/lang/String;

    invoke-interface {p1, v1, v2, v3}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    goto :goto_2

    .line 120
    :cond_3
    iget v2, v12, Ll/ۤ᩺ᩳ;->ᩳ:I

    iget v3, v12, Ll/ۤ᩺ᩳ;->֫:I

    iget v5, v12, Ll/ۤ᩺ᩳ;->ܽ:I

    iget v1, v12, Ll/ۤ᩺ᩳ;->ۧ:I

    add-int v6, v1, v5

    move-object v1, p1

    invoke-interface/range {v1 .. v6}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;II)Landroid/text/Editable;

    .line 122
    :goto_2
    iget v2, v12, Ll/ۤ᩺ᩳ;->ᩳ:I

    add-int/lit8 v11, v11, -0x1

    goto :goto_1

    .line 111
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    if-eqz v10, :cond_6

    .line 124
    invoke-virtual {v10}, Ll/᩸᩸ᩳ;->ۧ()V

    .line 125
    :cond_6
    invoke-virtual/range {p3 .. p3}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v2

    if-ne v2, v7, :cond_9

    if-eqz p4, :cond_7

    .line 87
    iget v0, v0, Ll/ۛ᩺ᩳ;->ۙ:I

    goto :goto_3

    :cond_7
    iget v2, v0, Ll/ۛ᩺ᩳ;->ۗ:I

    int-to-long v2, v2

    iget-wide v4, v0, Ll/ۛ᩺ᩳ;->᩶:J

    add-long/2addr v2, v4

    long-to-int v0, v2

    int-to-long v4, v0

    cmp-long v6, v2, v4

    if-nez v6, :cond_8

    .line 126
    :goto_3
    invoke-virtual {v8, v0}, Ll/۫ۨᩳ;->ᩴ(I)V

    .line 1040
    invoke-virtual {v8, v1}, Ll/۫ۨᩳ;->ᩳ(Z)V

    return-void

    .line 0
    :cond_8
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    .line 125
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static bridge synthetic ֫(Ll/ۛ᩺ᩳ;Ll/۬᩹ᩳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۛ᩺ᩳ;->۫:Ll/۬᩹ᩳ;

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۛ᩺ᩳ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۛ᩺ᩳ;->᩶:J

    return-wide v0
.end method

.method public static bridge synthetic ۧ(Ll/ۛ᩺ᩳ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۛ᩺ᩳ;->ۙ:I

    return-void
.end method

.method public static bridge synthetic ܳ(Ll/ۛ᩺ᩳ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/ۛ᩺ᩳ;->۬:Z

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ۛ᩺ᩳ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۛ᩺ᩳ;->ۗ:I

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ۛ᩺ᩳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۛ᩺ᩳ;->۬:Z

    return p0
.end method

.method public static bridge synthetic ܿ(Ll/ۛ᩺ᩳ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ᩺ᩳ;->ۤ:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۛ᩺ᩳ;)Ll/۬᩹ᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ᩺ᩳ;->۫:Ll/۬᩹ᩳ;

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 1

    const/4 v0, 0x1

    .line 140
    iput-boolean v0, p0, Ll/ۛ᩺ᩳ;->᩸:Z

    .line 141
    iget-object v0, p0, Ll/ۛ᩺ᩳ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 142
    iget-object v0, p0, Ll/ۛ᩺ᩳ;->۫:Ll/۬᩹ᩳ;

    if-eqz v0, :cond_0

    .line 143
    invoke-virtual {v0}, Ll/۬᩹ᩳ;->close()V

    const/4 v0, 0x0

    .line 144
    iput-object v0, p0, Ll/ۛ᩺ᩳ;->۫:Ll/۬᩹ᩳ;

    :cond_0
    return-void
.end method

.method public final count()I
    .locals 1

    .line 83
    iget v0, p0, Ll/ۛ᩺ᩳ;->᩹:I

    return v0
.end method

.method public final ֫(Ll/۫ۨᩳ;Ll/۟᩺ᩳ;Z)V
    .locals 9

    .line 93
    iget-boolean v0, p0, Ll/ۛ᩺ᩳ;->᩸:Z

    if-nez v0, :cond_5

    const/4 v0, 0x1

    .line 94
    iput-boolean v0, p0, Ll/ۛ᩺ᩳ;->᩸:Z

    .line 95
    iget v1, p0, Ll/ۛ᩺ᩳ;->᩹:I

    if-nez v1, :cond_0

    return-void

    .line 96
    :cond_0
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    if-ne v1, p2, :cond_4

    new-array v1, v0, [Z

    const/4 v2, 0x0

    aput-boolean v2, v1, v2

    .line 98
    new-instance v6, Ll/ۨ֨᩷;

    invoke-direct {v6, v0, v1, p1}, Ll/ۨ֨᩷;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 105
    :try_start_0
    new-instance v0, Ll/ۙ᩺ᩳ;

    move-object v3, v0

    move-object v4, p0

    move-object v5, p2

    move-object v7, p1

    move v8, p3

    invoke-direct/range {v3 .. v8}, Ll/ۙ᩺ᩳ;-><init>(Ll/ۛ᩺ᩳ;Ll/۟᩺ᩳ;Ll/ۨ֨᩷;Ll/۫ۨᩳ;Z)V

    invoke-interface {p2, v0}, Ll/۟᩺ᩳ;->֫(Ljava/lang/Runnable;)Z

    move-result p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p3, :cond_2

    .line 131
    aget-boolean p3, v1, v2

    if-eqz p3, :cond_1

    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object p3

    if-ne p3, p2, :cond_1

    .line 9843
    iget-boolean p2, p1, Ll/۫ۨᩳ;->ۜۧ:Z

    if-eqz p2, :cond_1

    .line 132
    invoke-virtual {p1}, Ll/۫ۨᩳ;->۟()V

    .line 135
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 1674
    invoke-virtual {p1, v2}, Ll/۫ۨᩳ;->ۧ(Z)V

    return-void

    .line 129
    :cond_2
    :try_start_1
    new-instance p3, Ljava/lang/IllegalStateException;

    const-string v0, "Replacement owner is unavailable"

    invoke-direct {p3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p3

    .line 131
    aget-boolean v0, v1, v2

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    if-ne v0, p2, :cond_3

    .line 9843
    iget-boolean p2, p1, Ll/۫ۨᩳ;->ۜۧ:Z

    if-eqz p2, :cond_3

    .line 132
    invoke-virtual {p1}, Ll/۫ۨᩳ;->۟()V

    .line 134
    :cond_3
    throw p3

    .line 96
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Replacement owner changed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 93
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Replacement plan is consumed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
