.class public final Ll/ۢۢܿ;
.super Ljava/lang/Object;
.source "970E"


# instance fields
.field public ֫:I


# virtual methods
.method public final ֫(I)V
    .locals 1

    if-ltz p1, :cond_0

    .line 311
    iget v0, p0, Ll/ۢۢܿ;->֫:I

    if-gt p1, v0, :cond_0

    sub-int/2addr v0, p1

    .line 314
    iput v0, p0, Ll/ۢۢܿ;->֫:I

    return-void

    .line 312
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid proof budget release"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()Z
    .locals 2

    .line 301
    iget v0, p0, Ll/ۢۢܿ;->֫:I

    const/16 v1, 0x400

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()Z
    .locals 2

    .line 305
    invoke-virtual {p0}, Ll/ۢۢܿ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 306
    :cond_0
    iget v0, p0, Ll/ۢۢܿ;->֫:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Ll/ۢۢܿ;->֫:I

    return v1
.end method
