.class public final Ll/ۢ۟ۚ;
.super Ll/ۜ۫ۚ;
.source "I7D9"


# instance fields
.field public ۗ:Ljava/lang/StringBuilder;

.field public ۙ:Ll/᩷۟ۚ;

.field public ᩶:Ljava/util/ArrayList;


# virtual methods
.method public final ֫(Ll/֡۫ۚ;)V
    .locals 5

    .line 93
    invoke-super {p0, p1}, Ll/ۜ۫ۚ;->֫(Ll/֡۫ۚ;)V

    .line 94
    iget-object v0, p0, Ll/ۢ۟ۚ;->ۙ:Ll/᩷۟ۚ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    return-void

    .line 96
    :cond_0
    iget-object v0, p0, Ll/ۢ۟ۚ;->᩶:Ljava/util/ArrayList;

    sget v1, Ll/᩻ۗۚ;->֫:I

    .line 78
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 79
    new-array v2, v1, [B

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    .line 81
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Byte;

    invoke-virtual {v4}, Ljava/lang/Byte;->byteValue()B

    move-result v4

    aput-byte v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 96
    :cond_1
    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    invoke-virtual {p1, v1, v2}, Ll/ۛ۫ۚ;->֫(I[B)V

    return-void

    .line 95
    :cond_2
    iget-object v0, p0, Ll/ۢ۟ۚ;->ۗ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->֫(Ljava/lang/String;)V

    return-void

    .line 97
    :cond_3
    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1}, Ll/ۛ۫ۚ;->֫()V

    return-void
.end method

.method public final ܽ()I
    .locals 2

    .line 85
    iget-object v0, p0, Ll/ۢ۟ۚ;->ۙ:Ll/᩷۟ۚ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 87
    iget-object v0, p0, Ll/ۢ۟ۚ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0

    .line 85
    :cond_0
    new-instance v0, Ljava/lang/IncompatibleClassChangeError;

    invoke-direct {v0}, Ljava/lang/IncompatibleClassChangeError;-><init>()V

    throw v0

    .line 86
    :cond_1
    iget-object v0, p0, Ll/ۢ۟ۚ;->ۗ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    array-length v0, v0

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method
