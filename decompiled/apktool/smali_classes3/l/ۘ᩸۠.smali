.class public final Ll/ۘ᩸۠;
.super Ll/ۤܶ۠;
.source "143Z"


# instance fields
.field public ۙ:Ll/ۘ᩸۠;

.field public ᩶:I

.field public ᩹:I


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 208
    instance-of v0, p1, Ll/ۤܶ۠;

    if-eqz v0, :cond_0

    .line 206
    check-cast p1, Ll/ۤܶ۠;

    iget-object v0, p0, Ll/ۤܶ۠;->᩸:Ll/۫ܶ۠;

    iget-object v1, p1, Ll/ۤܶ۠;->᩸:Ll/۫ܶ۠;

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ۘ᩸۠;->᩹:I

    .line 208
    invoke-virtual {p1}, Ll/ۤܶ۠;->ܿ()I

    move-result p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 199
    iget v0, p0, Ll/ۘ᩸۠;->᩹:I

    return v0
.end method

.method public final ֫()[B
    .locals 1

    .line 187
    iget-object v0, p0, Ll/ۤܶ۠;->᩸:Ll/۫ܶ۠;

    check-cast v0, Ll/ᩴ᩸۠;

    iget-object v0, v0, Ll/ᩴ᩸۠;->ۧ:[B

    return-object v0
.end method

.method public final ۧ(I)B
    .locals 2

    .line 182
    invoke-virtual {p0}, Ll/ۘ᩸۠;->֫()[B

    move-result-object v0

    iget v1, p0, Ll/ۘ᩸۠;->᩹:I

    add-int/2addr v1, p1

    aget-byte p1, v0, v1

    return p1
.end method

.method public final ۧ()I
    .locals 1

    .line 177
    iget v0, p0, Ll/ۘ᩸۠;->᩶:I

    return v0
.end method

.method public final ܿ()I
    .locals 1

    .line 172
    iget v0, p0, Ll/ۘ᩸۠;->᩹:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 192
    iget v0, p0, Ll/ۘ᩸۠;->᩹:I

    return v0
.end method
