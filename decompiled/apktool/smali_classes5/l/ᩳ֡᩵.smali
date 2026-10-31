.class public final Ll/ᩳ֡᩵;
.super Ll/ۡ֡᩵;
.source "K9V6"


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;Ll/ܽ֡᩵;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Ll/ۡ֡᩵;-><init>(Ll/֨ۡ᩵;)V

    .line 29
    iput-object p2, p0, Ll/ۡ֡᩵;->ۚ:Ll/ܽ֡᩵;

    const/16 p1, 0x20

    .line 30
    iput p1, p0, Ll/ۡ֡᩵;->֨:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 60
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "NameQueryRequest["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-super {p0}, Ll/ۡ֡᩵;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "]"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 60
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫(I[B)I
    .locals 2

    .line 179
    iget-object v0, p0, Ll/ۡ֡᩵;->ۚ:Ll/ܽ֡᩵;

    invoke-virtual {v0, p1, p2}, Ll/ܽ֡᩵;->֫(I[B)I

    move-result v0

    add-int/2addr v0, p1

    .line 180
    invoke-static {v0, p2}, Ll/ۡ֡᩵;->ܿ(I[B)I

    move-result v1

    iput v1, p0, Ll/ۡ֡᩵;->֨:I

    add-int/lit8 v1, v0, 0x2

    .line 182
    invoke-static {v1, p2}, Ll/ۡ֡᩵;->ܿ(I[B)I

    move-result p2

    iput p2, p0, Ll/ۡ֡᩵;->᩵:I

    add-int/lit8 v0, v0, 0x4

    sub-int/2addr v0, p1

    return v0
.end method

.method public final ۧ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ᩳ(I[B)I
    .locals 3

    .line 168
    iget-object v0, p0, Ll/ۡ֡᩵;->ۚ:Ll/ܽ֡᩵;

    invoke-virtual {v0, p1, p2}, Ll/ܽ֡᩵;->ۧ(I[B)I

    move-result v0

    add-int/2addr v0, p1

    .line 169
    iget v1, p0, Ll/ۡ֡᩵;->֨:I

    invoke-static {v1, v0, p2}, Ll/ۡ֡᩵;->֫(II[B)V

    add-int/lit8 v1, v0, 0x2

    .line 171
    iget v2, p0, Ll/ۡ֡᩵;->᩵:I

    invoke-static {v2, v1, p2}, Ll/ۡ֡᩵;->֫(II[B)V

    add-int/lit8 v0, v0, 0x4

    sub-int/2addr v0, p1

    return v0
.end method
