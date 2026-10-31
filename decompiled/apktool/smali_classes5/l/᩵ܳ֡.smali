.class public Ll/᩵ܳ֡;
.super Ljava/lang/Object;
.source "8AR0"

# interfaces
.implements Ll/ܺ᩷֡;


# instance fields
.field public ֫:I

.field public ۧ:Ll/ۡܳ֡;


# virtual methods
.method public getChildCount()I
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 3

    .line 129
    invoke-virtual {p0}, Ll/᩵ܳ֡;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    .line 133
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    .line 134
    :goto_0
    invoke-virtual {p0}, Ll/᩵ܳ֡;->getChildCount()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 135
    invoke-virtual {p0, v1}, Ll/᩵ܳ֡;->֫(I)Ll/ܺ᩷֡;

    move-result-object v2

    invoke-interface {v2}, Ll/ܺ᩷֡;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 138
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 225
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object v1, p0

    :goto_0
    if-eqz v1, :cond_3

    .line 101
    iget v2, v1, Ll/᩵ܳ֡;->֫:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    goto :goto_1

    .line 231
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 240
    :goto_1
    iget-object v2, v1, Ll/᩵ܳ֡;->ۧ:Ll/ۡܳ֡;

    if-eqz v2, :cond_2

    .line 101
    iget v2, v2, Ll/᩵ܳ֡;->֫:I

    if-ne v2, v3, :cond_1

    goto :goto_2

    :cond_1
    const-string v2, " "

    .line 241
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    :cond_2
    :goto_2
    iget-object v1, v1, Ll/᩵ܳ֡;->ۧ:Ll/ۡܳ֡;

    goto :goto_0

    :cond_3
    const-string v1, "]"

    .line 247
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫(I)Ll/ܺ᩷֡;
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ۧ()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method
