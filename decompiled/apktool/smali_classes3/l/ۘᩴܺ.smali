.class public final Ll/ۘᩴܺ;
.super Ljava/lang/Object;
.source "FBI6"

# interfaces
.implements Ll/ۢᩴܺ;


# instance fields
.field public final ֫:Ll/᩷ᩴܺ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Ll/᩷ᩴܺ;

    invoke-direct {v0}, Ll/᩷ᩴܺ;-><init>()V

    iput-object v0, p0, Ll/ۘᩴܺ;->֫:Ll/᩷ᩴܺ;

    .line 36
    invoke-virtual {v0}, Ll/᩷ᩴܺ;->۠()V

    return-void
.end method


# virtual methods
.method public final add(I)V
    .locals 2

    .line 44
    iget-object v0, p0, Ll/ۘᩴܺ;->֫:Ll/᩷ᩴܺ;

    invoke-virtual {v0, p1}, Ll/᩷ᩴܺ;->֫(I)I

    move-result v1

    if-gez v1, :cond_0

    add-int/lit8 v1, v1, 0x1

    neg-int v1, v1

    .line 47
    invoke-virtual {v0, v1, p1}, Ll/᩷ᩴܺ;->ۧ(II)V

    :cond_0
    return-void
.end method

.method public final elements()I
    .locals 1

    .line 121
    iget-object v0, p0, Ll/ۘᩴܺ;->֫:Ll/᩷ᩴܺ;

    invoke-virtual {v0}, Ll/᩷ᩴܺ;->size()I

    move-result v0

    return v0
.end method

.method public final iterator()Ll/ۜᩴܺ;
    .locals 1

    .line 129
    new-instance v0, Ll/ۖᩴܺ;

    invoke-direct {v0, p0}, Ll/ۖᩴܺ;-><init>(Ll/ۘᩴܺ;)V

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 155
    iget-object v0, p0, Ll/ۘᩴܺ;->֫:Ll/᩷ᩴܺ;

    invoke-virtual {v0}, Ll/᩷ᩴܺ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۢᩴܺ;)V
    .locals 7

    .line 76
    instance-of v0, p1, Ll/ۘᩴܺ;

    const/4 v1, 0x0

    iget-object v2, p0, Ll/ۘᩴܺ;->֫:Ll/᩷ᩴܺ;

    if-eqz v0, :cond_5

    .line 77
    check-cast p1, Ll/ۘᩴܺ;

    iget-object p1, p1, Ll/ۘᩴܺ;->֫:Ll/᩷ᩴܺ;

    .line 78
    invoke-virtual {v2}, Ll/᩷ᩴܺ;->size()I

    move-result v0

    .line 79
    invoke-virtual {p1}, Ll/᩷ᩴܺ;->size()I

    move-result v3

    const/4 v4, 0x0

    :cond_0
    if-ge v1, v3, :cond_3

    if-ge v4, v0, :cond_3

    :goto_0
    if-ge v1, v3, :cond_1

    .line 85
    invoke-virtual {p1, v1}, Ll/᩷ᩴܺ;->get(I)I

    move-result v5

    invoke-virtual {v2, v4}, Ll/᩷ᩴܺ;->get(I)I

    move-result v6

    if-ge v5, v6, :cond_1

    add-int/lit8 v5, v1, 0x1

    .line 86
    invoke-virtual {p1, v1}, Ll/᩷ᩴܺ;->get(I)I

    move-result v1

    invoke-virtual {p0, v1}, Ll/ۘᩴܺ;->add(I)V

    move v1, v5

    goto :goto_0

    :cond_1
    if-ne v1, v3, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    if-ge v4, v0, :cond_0

    .line 91
    invoke-virtual {p1, v1}, Ll/᩷ᩴܺ;->get(I)I

    move-result v5

    invoke-virtual {v2, v4}, Ll/᩷ᩴܺ;->get(I)I

    move-result v6

    if-lt v5, v6, :cond_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    if-ge v1, v3, :cond_4

    add-int/lit8 v0, v1, 0x1

    .line 97
    invoke-virtual {p1, v1}, Ll/᩷ᩴܺ;->get(I)I

    move-result v1

    invoke-virtual {p0, v1}, Ll/ۘᩴܺ;->add(I)V

    move v1, v0

    goto :goto_2

    .line 100
    :cond_4
    invoke-virtual {v2}, Ll/᩷ᩴܺ;->۠()V

    return-void

    .line 101
    :cond_5
    instance-of v0, p1, Ll/᩺ۘܺ;

    if-eqz v0, :cond_7

    .line 102
    check-cast p1, Ll/᩺ۘܺ;

    :goto_3
    if-ltz v1, :cond_6

    .line 105
    invoke-virtual {v2, v1}, Ll/᩷ᩴܺ;->add(I)V

    .line 104
    iget-object v0, p1, Ll/᩺ۘܺ;->֫:[I

    add-int/lit8 v1, v1, 0x1

    invoke-static {v1, v0}, Ll/ܰۘܺ;->ۧ(I[I)I

    move-result v1

    goto :goto_3

    .line 107
    :cond_6
    invoke-virtual {v2}, Ll/᩷ᩴܺ;->۠()V

    return-void

    .line 109
    :cond_7
    invoke-interface {p1}, Ll/ۢᩴܺ;->iterator()Ll/ۜᩴܺ;

    move-result-object p1

    .line 110
    :goto_4
    invoke-interface {p1}, Ll/ۜᩴܺ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 111
    invoke-interface {p1}, Ll/ۜᩴܺ;->next()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ۘᩴܺ;->add(I)V

    goto :goto_4

    :cond_8
    return-void
.end method

.method public final ֫(I)Z
    .locals 1

    .line 68
    iget-object v0, p0, Ll/ۘᩴܺ;->֫:Ll/᩷ᩴܺ;

    .line 389
    invoke-virtual {v0, p1}, Ll/᩷ᩴܺ;->֫(I)I

    move-result p1

    if-ltz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    if-ltz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
