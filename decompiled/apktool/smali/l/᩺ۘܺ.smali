.class public final Ll/᩺ۘܺ;
.super Ljava/lang/Object;
.source "SBH8"

# interfaces
.implements Ll/ۢᩴܺ;


# instance fields
.field public ֫:[I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    invoke-static {p1}, Ll/ܰۘܺ;->֫(I)[I

    move-result-object p1

    iput-object p1, p0, Ll/᩺ۘܺ;->֫:[I

    return-void
.end method

.method private ۧ(I)V
    .locals 3

    .line 55
    iget-object v0, p0, Ll/᩺ۘܺ;->֫:[I

    .line 48
    array-length v1, v0

    mul-int/lit8 v1, v1, 0x20

    if-lt p1, v1, :cond_0

    add-int/lit8 p1, p1, 0x1

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x40

    .line 57
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 56
    invoke-static {p1}, Ll/ܰۘܺ;->֫(I)[I

    move-result-object p1

    .line 58
    iget-object v0, p0, Ll/᩺ۘܺ;->֫:[I

    array-length v1, v0

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 59
    iput-object p1, p0, Ll/᩺ۘܺ;->֫:[I

    :cond_0
    return-void
.end method


# virtual methods
.method public final add(I)V
    .locals 3

    .line 45
    invoke-direct {p0, p1}, Ll/᩺ۘܺ;->ۧ(I)V

    .line 46
    iget-object v0, p0, Ll/᩺ۘܺ;->֫:[I

    shr-int/lit8 v1, p1, 0x5

    and-int/lit8 p1, p1, 0x1f

    const/4 v2, 0x1

    shl-int p1, v2, p1

    .line 76
    aget v2, v0, v1

    or-int/2addr p1, v2

    aput p1, v0, v1

    return-void
.end method

.method public final elements()I
    .locals 5

    .line 113
    iget-object v0, p0, Ll/᩺ۘܺ;->֫:[I

    .line 132
    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 136
    aget v4, v0, v2

    invoke-static {v4}, Ljava/lang/Integer;->bitCount(I)I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v3
.end method

.method public final iterator()Ll/ۜᩴܺ;
    .locals 1

    .line 121
    new-instance v0, Ll/ۨۘܺ;

    invoke-direct {v0, p0}, Ll/ۨۘܺ;-><init>(Ll/᩺ۘܺ;)V

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 151
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 156
    iget-object v1, p0, Ll/᩺ۘܺ;->֫:[I

    const/4 v2, 0x0

    invoke-static {v2, v1}, Ll/ܰۘܺ;->ۧ(I[I)I

    move-result v1

    const/4 v2, 0x1

    :goto_0
    if-ltz v1, :cond_1

    if-nez v2, :cond_0

    const-string v2, ", "

    .line 160
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 158
    iget-object v2, p0, Ll/᩺ۘܺ;->֫:[I

    add-int/lit8 v1, v1, 0x1

    invoke-static {v1, v2}, Ll/ܰۘܺ;->ۧ(I[I)I

    move-result v1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    const/16 v1, 0x7d

    .line 166
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 168
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۢᩴܺ;)V
    .locals 6

    .line 86
    instance-of v0, p1, Ll/᩺ۘܺ;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 87
    check-cast p1, Ll/᩺ۘܺ;

    .line 88
    iget-object v0, p1, Ll/᩺ۘܺ;->֫:[I

    .line 48
    array-length v0, v0

    mul-int/lit8 v0, v0, 0x20

    add-int/2addr v0, v2

    .line 88
    invoke-direct {p0, v0}, Ll/᩺ۘܺ;->ۧ(I)V

    .line 89
    iget-object v0, p0, Ll/᩺ۘܺ;->֫:[I

    iget-object p1, p1, Ll/᩺ۘܺ;->֫:[I

    .line 210
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_3

    .line 211
    aget v2, v0, v1

    aget v3, p1, v1

    or-int/2addr v2, v3

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 90
    :cond_0
    instance-of v0, p1, Ll/ۘᩴܺ;

    if-eqz v0, :cond_2

    .line 91
    check-cast p1, Ll/ۘᩴܺ;

    iget-object p1, p1, Ll/ۘᩴܺ;->֫:Ll/᩷ᩴܺ;

    .line 92
    invoke-virtual {p1}, Ll/᩷ᩴܺ;->size()I

    move-result v0

    if-lez v0, :cond_1

    sub-int/2addr v0, v2

    .line 95
    invoke-virtual {p1, v0}, Ll/᩷ᩴܺ;->get(I)I

    move-result v0

    invoke-direct {p0, v0}, Ll/᩺ۘܺ;->ۧ(I)V

    .line 97
    :cond_1
    :goto_1
    invoke-virtual {p1}, Ll/᩷ᩴܺ;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 98
    iget-object v0, p0, Ll/᩺ۘܺ;->֫:[I

    invoke-virtual {p1, v1}, Ll/᩷ᩴܺ;->get(I)I

    move-result v3

    shr-int/lit8 v4, v3, 0x5

    and-int/lit8 v3, v3, 0x1f

    shl-int v3, v2, v3

    .line 76
    aget v5, v0, v4

    or-int/2addr v3, v5

    aput v3, v0, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 101
    :cond_2
    invoke-interface {p1}, Ll/ۢᩴܺ;->iterator()Ll/ۜᩴܺ;

    move-result-object p1

    .line 102
    :goto_2
    invoke-interface {p1}, Ll/ۜᩴܺ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 103
    invoke-interface {p1}, Ll/ۜᩴܺ;->next()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/᩺ۘܺ;->add(I)V

    goto :goto_2

    :cond_3
    return-void
.end method

.method public final ֫(I)Z
    .locals 2

    .line 78
    iget-object v0, p0, Ll/᩺ۘܺ;->֫:[I

    .line 48
    array-length v1, v0

    mul-int/lit8 v1, v1, 0x20

    if-ge p1, v1, :cond_0

    .line 78
    invoke-static {p1, v0}, Ll/ܰۘܺ;->ܽ(I[I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
