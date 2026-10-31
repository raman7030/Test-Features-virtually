.class public final Ll/ۜ֡;
.super Ll/᩷֡;
.source "41BY"


# instance fields
.field public ֫:D

.field public ۧ:[D


# virtual methods
.method public final ֫(D)D
    .locals 0

    const/4 p1, 0x0

    .line 82
    iget-object p2, p0, Ll/ۜ֡;->ۧ:[D

    aget-wide p1, p2, p1

    return-wide p1
.end method

.method public final ֫(D[D)V
    .locals 1

    .line 70
    iget-object p1, p0, Ll/ۜ֡;->ۧ:[D

    const/4 p2, 0x0

    array-length v0, p1

    invoke-static {p1, p2, p3, p2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public final ֫(D[F)V
    .locals 2

    const/4 p1, 0x0

    .line 75
    :goto_0
    iget-object p2, p0, Ll/ۜ֡;->ۧ:[D

    array-length v0, p2

    if-ge p1, v0, :cond_0

    .line 76
    aget-wide v0, p2, p1

    double-to-float p2, v0

    aput p2, p3, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫()[D
    .locals 4

    .line 99
    iget-wide v0, p0, Ll/ۜ֡;->֫:D

    const/4 v2, 0x1

    new-array v2, v2, [D

    const/4 v3, 0x0

    aput-wide v0, v2, v3

    return-object v2
.end method

.method public final ۧ(D)D
    .locals 0

    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public final ۧ(D[D)V
    .locals 2

    const/4 p1, 0x0

    .line 87
    :goto_0
    iget-object p2, p0, Ll/ۜ֡;->ۧ:[D

    array-length p2, p2

    if-ge p1, p2, :cond_0

    const-wide/16 v0, 0x0

    .line 88
    aput-wide v0, p3, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
