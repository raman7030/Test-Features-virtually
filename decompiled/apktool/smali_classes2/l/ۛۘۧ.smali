.class public final Ll/ۛۘۧ;
.super Ljava/lang/Object;
.source "P8MK"


# direct methods
.method public static ֫(Ll/ܰۘۧ;ILl/᩻ۚ֫;)V
    .locals 6

    .line 93
    invoke-interface {p0, p1}, Ll/ܰۘۧ;->֫(I)J

    move-result-wide v1

    .line 94
    invoke-interface {p0, v1, v2}, Ll/ܰۘۧ;->ܽ(J)Ljava/util/List;

    move-result-object v5

    .line 95
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 99
    :cond_0
    invoke-interface {p0}, Ll/ܰۘۧ;->֫()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-eq p1, v0, :cond_2

    add-int/lit8 v0, p1, 0x1

    .line 105
    invoke-interface {p0, v0}, Ll/ܰۘۧ;->֫(I)J

    move-result-wide v3

    invoke-interface {p0, p1}, Ll/ܰۘۧ;->֫(I)J

    move-result-wide p0

    sub-long/2addr v3, p0

    const-wide/16 p0, 0x0

    cmp-long v0, v3, p0

    if-lez v0, :cond_1

    .line 107
    new-instance p0, Ll/۬ۘۧ;

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ll/۬ۘۧ;-><init>(JJLjava/util/List;)V

    invoke-interface {p2, p0}, Ll/᩻ۚ֫;->accept(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void

    .line 101
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0
.end method

.method public static ֫(Ll/ܰۘۧ;Ll/᩷ᩴۧ;Ll/᩻ۚ֫;)V
    .locals 13

    .line 40
    iget-wide v0, p1, Ll/᩷ᩴۧ;->ۧ:J

    const/4 v2, 0x0

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    const/4 v5, 0x0

    goto :goto_0

    .line 81
    :cond_0
    invoke-interface {p0, v0, v1}, Ll/ܰۘۧ;->֫(J)I

    move-result v5

    const/4 v6, -0x1

    if-ne v5, v6, :cond_1

    .line 83
    invoke-interface {p0}, Ll/ܰۘۧ;->֫()I

    move-result v5

    :cond_1
    if-lez v5, :cond_2

    add-int/lit8 v6, v5, -0x1

    .line 85
    invoke-interface {p0, v6}, Ll/ܰۘۧ;->֫(I)J

    move-result-wide v6

    cmp-long v8, v6, v0

    if-nez v8, :cond_2

    add-int/lit8 v5, v5, -0x1

    :cond_2
    :goto_0
    cmp-long v6, v0, v3

    if-eqz v6, :cond_3

    .line 42
    invoke-interface {p0}, Ll/ܰۘۧ;->֫()I

    move-result v3

    if-ge v5, v3, :cond_3

    .line 43
    invoke-interface {p0, v0, v1}, Ll/ܰۘۧ;->ܽ(J)Ljava/util/List;

    move-result-object v11

    .line 44
    invoke-interface {p0, v5}, Ll/ܰۘۧ;->֫(I)J

    move-result-wide v3

    .line 45
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_3

    iget-wide v7, p1, Ll/᩷ᩴۧ;->ۧ:J

    cmp-long v6, v7, v3

    if-gez v6, :cond_3

    .line 46
    new-instance v12, Ll/۬ۘۧ;

    sub-long v9, v3, v7

    move-object v6, v12

    invoke-direct/range {v6 .. v11}, Ll/۬ۘۧ;-><init>(JJLjava/util/List;)V

    invoke-interface {p2, v12}, Ll/᩻ۚ֫;->accept(Ljava/lang/Object;)V

    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :goto_1
    move v4, v5

    .line 54
    :goto_2
    invoke-interface {p0}, Ll/ܰۘۧ;->֫()I

    move-result v6

    if-ge v4, v6, :cond_4

    .line 55
    invoke-static {p0, v4, p2}, Ll/ۛۘۧ;->֫(Ll/ܰۘۧ;ILl/᩻ۚ֫;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 57
    :cond_4
    iget-boolean p1, p1, Ll/᩷ᩴۧ;->֫:Z

    if-eqz p1, :cond_7

    if-eqz v3, :cond_5

    add-int/lit8 v5, v5, -0x1

    :cond_5
    :goto_3
    if-ge v2, v5, :cond_6

    .line 60
    invoke-static {p0, v2, p2}, Ll/ۛۘۧ;->֫(Ll/ܰۘۧ;ILl/᩻ۚ֫;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_6
    if-eqz v3, :cond_7

    .line 63
    new-instance p1, Ll/۬ۘۧ;

    .line 65
    invoke-interface {p0, v0, v1}, Ll/ܰۘۧ;->ܽ(J)Ljava/util/List;

    move-result-object v11

    .line 66
    invoke-interface {p0, v5}, Ll/ܰۘۧ;->֫(I)J

    move-result-wide v7

    .line 67
    invoke-interface {p0, v5}, Ll/ܰۘۧ;->֫(I)J

    move-result-wide v2

    sub-long v9, v0, v2

    move-object v6, p1

    invoke-direct/range {v6 .. v11}, Ll/۬ۘۧ;-><init>(JJLjava/util/List;)V

    .line 63
    invoke-interface {p2, p1}, Ll/᩻ۚ֫;->accept(Ljava/lang/Object;)V

    :cond_7
    return-void
.end method
