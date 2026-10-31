.class public final Ll/ܿ֡᩵;
.super Ll/ۡ֡᩵;
.source "KA0F"


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;)V
    .locals 1

    .line 30
    invoke-direct {p0, p1}, Ll/ۡ֡᩵;-><init>(Ll/֨ۡ᩵;)V

    .line 31
    new-instance v0, Ll/ܽ֡᩵;

    invoke-direct {v0, p1}, Ll/ܽ֡᩵;-><init>(Ll/֨ۡ᩵;)V

    iput-object v0, p0, Ll/ۡ֡᩵;->᩹:Ll/ܽ֡᩵;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 74
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "NameQueryResponse["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    invoke-super {p0}, Ll/ۡ֡᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",addrEntry="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ۡ֡᩵;->ܽ:[Ll/ܺ֡᩵;

    if-eqz v2, :cond_0

    invoke-static {v2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const-string v2, ""

    :goto_0
    const-string v3, "]"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 75
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫(I[B)I
    .locals 0

    .line 43
    invoke-virtual {p0, p1, p2}, Ll/ۡ֡᩵;->ܽ(I[B)I

    move-result p1

    return p1
.end method

.method public final ۧ(I[B)I
    .locals 3

    .line 55
    iget v0, p0, Ll/ۡ֡᩵;->ۙ:I

    if-nez v0, :cond_2

    iget v0, p0, Ll/ۡ֡᩵;->ᩴ:I

    if-eqz v0, :cond_0

    goto :goto_1

    .line 58
    :cond_0
    aget-byte v0, p2, p1

    add-int/lit8 p1, p1, 0x2

    .line 61
    invoke-static {p1, p2}, Ll/ۡ֡᩵;->ܳ(I[B)I

    move-result p1

    if-eqz p1, :cond_1

    .line 63
    iget-object p2, p0, Ll/ۡ֡᩵;->ܽ:[Ll/ܺ֡᩵;

    iget v0, p0, Ll/ۡ֡᩵;->ᩳ:I

    new-instance v1, Ll/ܺ֡᩵;

    iget-object v2, p0, Ll/ۡ֡᩵;->᩹:Ll/ܽ֡᩵;

    invoke-direct {v1, v2, p1}, Ll/ܺ֡᩵;-><init>(Ll/ܽ֡᩵;I)V

    aput-object v1, p2, v0

    goto :goto_0

    .line 65
    :cond_1
    iget-object p1, p0, Ll/ۡ֡᩵;->ܽ:[Ll/ܺ֡᩵;

    iget p2, p0, Ll/ۡ֡᩵;->ᩳ:I

    const/4 v0, 0x0

    aput-object v0, p1, p2

    :goto_0
    const/4 p1, 0x6

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩳ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
