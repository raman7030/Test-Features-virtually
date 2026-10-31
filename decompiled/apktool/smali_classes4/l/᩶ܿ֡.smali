.class public final Ll/᩶ܿ֡;
.super Ljava/lang/Object;
.source "P5BM"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public ۗ:Ljava/lang/Object;

.field public ۙ:Ll/ۡܿ֡;

.field public ۫:Ll/ᩴܿ֡;

.field public ۬:Ljava/lang/Object;

.field public ᩶:Z

.field public ᩸:Ll/ᩴܿ֡;

.field public ᩹:Ll/ᩴܿ֡;


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 78
    iget-boolean v0, p0, Ll/᩶ܿ֡;->᩶:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩶ܿ֡;->ۗ:Ljava/lang/Object;

    if-eqz v0, :cond_5

    goto :goto_1

    .line 79
    :cond_0
    iget-object v0, p0, Ll/᩶ܿ֡;->ۙ:Ll/ۡܿ֡;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/ۡܿ֡;->size()I

    move-result v0

    if-lez v0, :cond_1

    goto :goto_1

    .line 80
    :cond_1
    iget-object v0, p0, Ll/᩶ܿ֡;->۬:Ljava/lang/Object;

    if-nez v0, :cond_2

    goto :goto_2

    .line 154
    :cond_2
    check-cast v0, Ll/᩹ܿ֡;

    invoke-interface {v0}, Ll/᩹ܿ֡;->getChildCount()I

    move-result v0

    if-lez v0, :cond_3

    goto :goto_1

    .line 82
    :cond_3
    iget-object v0, p0, Ll/᩶ܿ֡;->۬:Ljava/lang/Object;

    if-nez v0, :cond_4

    const/4 v0, 0x0

    goto :goto_0

    .line 160
    :cond_4
    check-cast v0, Ll/᩹ܿ֡;

    invoke-interface {v0}, Ll/᩹ܿ֡;->getParent()Ll/᩹ܿ֡;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_5

    :goto_1
    const/4 v0, 0x1

    return v0

    :cond_5
    :goto_2
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 7

    .line 87
    iget-object v0, p0, Ll/᩶ܿ֡;->᩹:Ll/ᩴܿ֡;

    iget-object v1, p0, Ll/᩶ܿ֡;->ۙ:Ll/ۡܿ֡;

    iget-boolean v2, p0, Ll/᩶ܿ֡;->᩶:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    .line 88
    iput-boolean v3, p0, Ll/᩶ܿ֡;->᩶:Z

    .line 89
    iget-object v2, p0, Ll/᩶ܿ֡;->۬:Ljava/lang/Object;

    if-nez v2, :cond_0

    goto :goto_0

    .line 154
    :cond_0
    check-cast v2, Ll/᩹ܿ֡;

    invoke-interface {v2}, Ll/᩹ܿ֡;->getChildCount()I

    move-result v3

    :goto_0
    if-nez v3, :cond_1

    .line 90
    invoke-virtual {v1, v0}, Ll/ۡܿ֡;->֫(Ll/᩹ܿ֡;)V

    .line 91
    iget-object v0, p0, Ll/᩶ܿ֡;->۬:Ljava/lang/Object;

    return-object v0

    .line 93
    :cond_1
    iget-object v0, p0, Ll/᩶ܿ֡;->۬:Ljava/lang/Object;

    return-object v0

    :cond_2
    if-eqz v1, :cond_3

    .line 96
    invoke-virtual {v1}, Ll/ۡܿ֡;->size()I

    move-result v2

    if-lez v2, :cond_3

    invoke-virtual {v1}, Ll/ۡܿ֡;->ܿ()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 99
    :cond_3
    iget-object v2, p0, Ll/᩶ܿ֡;->۬:Ljava/lang/Object;

    if-nez v2, :cond_4

    return-object v0

    .line 154
    :cond_4
    check-cast v2, Ll/᩹ܿ֡;

    invoke-interface {v2}, Ll/᩹ܿ֡;->getChildCount()I

    move-result v2

    const/4 v4, 0x0

    if-lez v2, :cond_6

    .line 103
    iget-object v0, p0, Ll/᩶ܿ֡;->۬:Ljava/lang/Object;

    if-nez v0, :cond_5

    goto :goto_1

    .line 148
    :cond_5
    check-cast v0, Ll/᩹ܿ֡;

    invoke-interface {v0, v3}, Ll/᩹ܿ֡;->֫(I)Ll/᩹ܿ֡;

    move-result-object v4

    .line 103
    :goto_1
    iput-object v4, p0, Ll/᩶ܿ֡;->۬:Ljava/lang/Object;

    .line 104
    invoke-virtual {v1, v4}, Ll/ۡܿ֡;->֫(Ll/᩹ܿ֡;)V

    .line 105
    iget-object v0, p0, Ll/᩶ܿ֡;->᩸:Ll/ᩴܿ֡;

    return-object v0

    .line 108
    :cond_6
    iget-object v2, p0, Ll/᩶ܿ֡;->۬:Ljava/lang/Object;

    if-nez v2, :cond_7

    move-object v2, v4

    goto :goto_3

    .line 160
    :cond_7
    check-cast v2, Ll/᩹ܿ֡;

    :goto_2
    invoke-interface {v2}, Ll/᩹ܿ֡;->getParent()Ll/᩹ܿ֡;

    move-result-object v2

    :goto_3
    if-eqz v2, :cond_9

    .line 110
    iget-object v5, p0, Ll/᩶ܿ֡;->۬:Ljava/lang/Object;

    if-nez v5, :cond_8

    const/4 v5, 0x0

    goto :goto_4

    .line 171
    :cond_8
    check-cast v5, Ll/᩹ܿ֡;

    invoke-interface {v5}, Ll/᩹ܿ֡;->ۧ()I

    move-result v5

    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 154
    invoke-interface {v2}, Ll/᩹ܿ֡;->getChildCount()I

    move-result v6

    if-lt v5, v6, :cond_9

    .line 113
    iget-object v5, p0, Ll/᩶ܿ֡;->۫:Ll/ᩴܿ֡;

    invoke-virtual {v1, v5}, Ll/ۡܿ֡;->֫(Ll/᩹ܿ֡;)V

    .line 114
    iput-object v2, p0, Ll/᩶ܿ֡;->۬:Ljava/lang/Object;

    goto :goto_2

    :cond_9
    if-nez v2, :cond_a

    .line 119
    iput-object v4, p0, Ll/᩶ܿ֡;->۬:Ljava/lang/Object;

    .line 120
    invoke-virtual {v1, v0}, Ll/ۡܿ֡;->֫(Ll/᩹ܿ֡;)V

    .line 121
    invoke-virtual {v1}, Ll/ۡܿ֡;->ܿ()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 126
    :cond_a
    iget-object v0, p0, Ll/᩶ܿ֡;->۬:Ljava/lang/Object;

    if-nez v0, :cond_b

    goto :goto_5

    .line 171
    :cond_b
    check-cast v0, Ll/᩹ܿ֡;

    invoke-interface {v0}, Ll/᩹ܿ֡;->ۧ()I

    move-result v3

    :goto_5
    add-int/lit8 v3, v3, 0x1

    .line 148
    invoke-interface {v2, v3}, Ll/᩹ܿ֡;->֫(I)Ll/᩹ܿ֡;

    move-result-object v0

    .line 127
    iput-object v0, p0, Ll/᩶ܿ֡;->۬:Ljava/lang/Object;

    .line 128
    invoke-virtual {v1, v0}, Ll/ۡܿ֡;->֫(Ll/᩹ܿ֡;)V

    .line 129
    invoke-virtual {v1}, Ll/ۡܿ֡;->ܿ()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 1

    .line 133
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
