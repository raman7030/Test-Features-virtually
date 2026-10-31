.class public final Ll/᩺᩵᩵;
.super Ll/۫ᩴ᩵;
.source "TA0G"

# interfaces
.implements Ll/ۢۖ᩵;


# instance fields
.field public ᩴ֫:I

.field public ᩵֫:I


# virtual methods
.method public final ֫(Ll/۟ܺ᩵;)V
    .locals 2

    .line 149
    invoke-virtual {p0}, Ll/۫ᩴ᩵;->۟()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 150
    move-object v0, p1

    check-cast v0, Ll/ۗᩴ᩵;

    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ۡ֫()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۗᩴ᩵;->ۢ(I)V

    .line 152
    :cond_0
    invoke-super {p0, p1}, Ll/۫ᩴ᩵;->֫(Ll/۟ܺ᩵;)V

    return-void
.end method

.method public final ۙ()Z
    .locals 2

    .line 201
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ۡ֫()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۡ()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۧ(I[B)I
    .locals 2

    .line 248
    invoke-static {p1, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    add-int/lit8 v0, p1, 0x2

    .line 253
    aget-byte v0, p2, v0

    add-int/lit8 v0, p1, 0x4

    .line 255
    invoke-static {v0, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    iput v0, p0, Ll/᩺᩵᩵;->᩵֫:I

    add-int/lit8 v0, p1, 0x8

    .line 257
    invoke-static {v0, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    iput v0, p0, Ll/᩺᩵᩵;->ᩴ֫:I

    add-int/lit8 v0, p1, 0xc

    .line 259
    invoke-static {v0, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    add-int/lit8 p2, p1, 0x10

    sub-int/2addr p2, p1

    return p2

    .line 250
    :cond_0
    new-instance p1, Ll/ᩳۖ᩵;

    const-string p2, "Structure size is not 16"

    .line 58
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 250
    throw p1
.end method

.method public final ᩳ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ᩴ()Z
    .locals 2

    .line 223
    iget v0, p0, Ll/᩺᩵᩵;->᩵֫:I

    and-int/lit8 v0, v0, 0x3

    if-nez v0, :cond_1

    iget v0, p0, Ll/᩺᩵᩵;->ᩴ֫:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
