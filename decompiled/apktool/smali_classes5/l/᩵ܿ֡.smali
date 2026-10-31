.class public final Ll/᩵ܿ֡;
.super Ll/ܺܿ֡;
.source "K6AA"

# interfaces
.implements Ll/ۙܿ֡;
.implements Ll/֡ܿ֡;


# instance fields
.field public ۖ:Ljava/lang/Object;

.field public ۘ:Ll/۬ᩳ֡;

.field public ۜ:Ll/ۛ᩸ۘ;

.field public ۡ:I

.field public ۢ:Ll/᩶ܿ֡;

.field public ܺ:Ljava/lang/Object;

.field public ᩷:Z


# direct methods
.method public constructor <init>(Ll/ᩴܿ֡;)V
    .locals 3

    .line 73
    new-instance v0, Ll/ۛ᩸ۘ;

    .line 38
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 76
    invoke-direct {p0}, Ll/ܺܿ֡;-><init>()V

    const/4 v1, 0x0

    .line 56
    iput-boolean v1, p0, Ll/᩵ܿ֡;->᩷:Z

    .line 59
    iput v1, p0, Ll/᩵ܿ֡;->ۡ:I

    .line 77
    iput-object p1, p0, Ll/᩵ܿ֡;->ۖ:Ljava/lang/Object;

    .line 78
    iput-object v0, p0, Ll/᩵ܿ֡;->ۜ:Ll/ۛ᩸ۘ;

    .line 79
    new-instance v1, Ll/᩶ܿ֡;

    .line 60
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x1

    .line 44
    iput-boolean v2, v1, Ll/᩶ܿ֡;->᩶:Z

    .line 62
    iput-object p1, v1, Ll/᩶ܿ֡;->۬:Ljava/lang/Object;

    .line 63
    iput-object p1, v1, Ll/᩶ܿ֡;->ۗ:Ljava/lang/Object;

    .line 64
    new-instance p1, Ll/ۡܿ֡;

    invoke-direct {p1}, Ll/ۡܿ֡;-><init>()V

    iput-object p1, v1, Ll/᩶ܿ֡;->ۙ:Ll/ۡܿ֡;

    const/4 p1, 0x2

    const-string v2, "DOWN"

    .line 65
    invoke-virtual {v0, p1, v2}, Ll/ۛ᩸ۘ;->֫(ILjava/lang/String;)Ll/ᩴܿ֡;

    move-result-object p1

    iput-object p1, v1, Ll/᩶ܿ֡;->᩸:Ll/ᩴܿ֡;

    const/4 p1, 0x3

    const-string v2, "UP"

    .line 66
    invoke-virtual {v0, p1, v2}, Ll/ۛ᩸ۘ;->֫(ILjava/lang/String;)Ll/ᩴܿ֡;

    move-result-object p1

    iput-object p1, v1, Ll/᩶ܿ֡;->۫:Ll/ᩴܿ֡;

    const/4 p1, -0x1

    const-string v2, "EOF"

    .line 67
    invoke-virtual {v0, p1, v2}, Ll/ۛ᩸ۘ;->֫(ILjava/lang/String;)Ll/ᩴܿ֡;

    move-result-object p1

    iput-object p1, v1, Ll/᩶ܿ֡;->᩹:Ll/ᩴܿ֡;

    .line 79
    iput-object v1, p0, Ll/᩵ܿ֡;->ۢ:Ll/᩶ܿ֡;

    return-void
.end method


# virtual methods
.method public final ֫(Z)Ljava/lang/Object;
    .locals 3

    .line 182
    iget v0, p0, Ll/ۡܿ֡;->ۧ:I

    iget-object v1, p0, Ll/ۡܿ֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 183
    invoke-virtual {p0, v0}, Ll/᩵ܿ֡;->ۧ(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v0

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 191
    :cond_1
    iget p1, p0, Ll/ۡܿ֡;->ۧ:I

    :cond_2
    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_3

    .line 192
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 193
    invoke-virtual {p0, v0}, Ll/᩵ܿ֡;->ۧ(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    return-object v0

    .line 198
    :cond_3
    iget-object p1, p0, Ll/᩵ܿ֡;->ܺ:Ljava/lang/Object;

    return-object p1
.end method

.method public final ֫(Ll/۬ᩳ֡;)V
    .locals 0

    .line 138
    iput-object p1, p0, Ll/᩵ܿ֡;->ۘ:Ll/۬ᩳ֡;

    return-void
.end method

.method public final ֫(Ljava/lang/Object;)Z
    .locals 2

    .line 124
    iget-object v0, p0, Ll/᩵ܿ֡;->ۜ:Ll/ۛ᩸ۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 130
    :cond_0
    check-cast p1, Ll/᩹ܿ֡;

    invoke-interface {p1}, Ll/᩹ܿ֡;->getType()I

    move-result p1

    :goto_0
    const/4 v1, -0x1

    if-ne p1, v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method

.method public final ۜ()Ljava/lang/Object;
    .locals 4

    .line 97
    iget-object v0, p0, Ll/᩵ܿ֡;->ۢ:Ll/᩶ܿ֡;

    invoke-virtual {v0}, Ll/᩶ܿ֡;->next()Ljava/lang/Object;

    move-result-object v1

    .line 99
    iget-object v2, v0, Ll/᩶ܿ֡;->۫:Ll/ᩴܿ֡;

    const/4 v3, 0x1

    if-ne v1, v2, :cond_0

    .line 100
    iget v2, p0, Ll/᩵ܿ֡;->ۡ:I

    sub-int/2addr v2, v3

    iput v2, p0, Ll/᩵ܿ֡;->ۡ:I

    if-nez v2, :cond_1

    .line 101
    iget-boolean v2, p0, Ll/᩵ܿ֡;->᩷:Z

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Ll/᩶ܿ֡;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 103
    :cond_0
    iget-object v2, v0, Ll/᩶ܿ֡;->᩸:Ll/ᩴܿ֡;

    if-ne v1, v2, :cond_1

    iget v2, p0, Ll/᩵ܿ֡;->ۡ:I

    add-int/2addr v2, v3

    iput v2, p0, Ll/᩵ܿ֡;->ۡ:I

    .line 104
    :cond_1
    iget v2, p0, Ll/᩵ܿ֡;->ۡ:I

    if-nez v2, :cond_2

    iget-object v2, p0, Ll/᩵ܿ֡;->ۜ:Ll/ۛ᩸ۘ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    move-object v2, v1

    check-cast v2, Ll/᩹ܿ֡;

    invoke-interface {v2}, Ll/᩹ܿ֡;->ᩳ()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 105
    iput-boolean v3, p0, Ll/᩵ܿ֡;->᩷:Z

    .line 106
    invoke-virtual {v0}, Ll/᩶ܿ֡;->next()Ljava/lang/Object;

    .line 107
    iget v1, p0, Ll/᩵ܿ֡;->ۡ:I

    add-int/2addr v1, v3

    iput v1, p0, Ll/᩵ܿ֡;->ۡ:I

    .line 108
    invoke-virtual {v0}, Ll/᩶ܿ֡;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_2
    return-object v1
.end method

.method public final ۧ(I)I
    .locals 1

    .line 151
    invoke-virtual {p0, p1}, Ll/ܺܿ֡;->ܽ(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Ll/᩵ܿ֡;->ۜ:Ll/ۛ᩸ۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 130
    :cond_0
    check-cast p1, Ll/᩹ܿ֡;

    invoke-interface {p1}, Ll/᩹ܿ֡;->getType()I

    move-result p1

    return p1
.end method

.method public final ۧ(Ljava/lang/Object;)Z
    .locals 1

    .line 203
    iget-object v0, p0, Ll/᩵ܿ֡;->ۜ:Ll/ۛ᩸ۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    instance-of v0, p1, Ll/ᩴܿ֡;

    if-eqz v0, :cond_0

    .line 140
    check-cast p1, Ll/ᩴܿ֡;

    .line 67
    iget-object p1, p1, Ll/ᩴܿ֡;->ܳ:Ll/ۜܿ֡;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    .line 208
    :cond_1
    invoke-interface {p1}, Ll/ۜܿ֡;->getLine()I

    move-result p1

    if-gtz p1, :cond_2

    :goto_1
    const/4 p1, 0x0

    return p1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public final ܽ()Ll/ۛ᩸ۘ;
    .locals 1

    .line 141
    iget-object v0, p0, Ll/᩵ܿ֡;->ۜ:Ll/ۛ᩸ۘ;

    return-object v0
.end method

.method public final ܿ()Ljava/lang/Object;
    .locals 2

    .line 115
    invoke-super {p0}, Ll/ܺܿ֡;->ܿ()Ljava/lang/Object;

    move-result-object v0

    .line 116
    iget v1, p0, Ll/ۡܿ֡;->ۧ:I

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/ܺܿ֡;->᩻:Ljava/lang/Object;

    invoke-virtual {p0, v1}, Ll/᩵ܿ֡;->ۧ(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 117
    iget-object v1, p0, Ll/ܺܿ֡;->᩻:Ljava/lang/Object;

    iput-object v1, p0, Ll/᩵ܿ֡;->ܺ:Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public final ᩷()Ll/᩷ܿ֡;
    .locals 1

    .line 136
    iget-object v0, p0, Ll/᩵ܿ֡;->ۘ:Ll/۬ᩳ֡;

    return-object v0
.end method
