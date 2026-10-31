.class public final Ll/ۧۨ;
.super Ljava/lang/Object;
.source "15CD"


# instance fields
.field public ֫:I

.field public ۧ:I


# virtual methods
.method public final ֫()I
    .locals 2

    .line 92
    iget v0, p0, Ll/ۧۨ;->ۧ:I

    iget v1, p0, Ll/ۧۨ;->֫:I

    or-int/2addr v0, v1

    return v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 79
    iput p1, p0, Ll/ۧۨ;->ۧ:I

    return-void
.end method

.method public final ֫(II)V
    .locals 1

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 77
    iput p1, p0, Ll/ۧۨ;->֫:I

    return-void

    .line 79
    :cond_0
    iput p1, p0, Ll/ۧۨ;->ۧ:I

    return-void
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x0

    .line 117
    iput v0, p0, Ll/ۧۨ;->ۧ:I

    return-void
.end method

.method public final ۧ(I)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    .line 115
    iput v1, p0, Ll/ۧۨ;->֫:I

    return-void

    .line 117
    :cond_0
    iput v1, p0, Ll/ۧۨ;->ۧ:I

    return-void
.end method
