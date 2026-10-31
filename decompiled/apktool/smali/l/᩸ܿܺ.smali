.class public final Ll/᩸ܿܺ;
.super Ll/ۤܿܺ;
.source "SBH2"


# instance fields
.field public final ܳ:Ll/ܰۡܺ;

.field public ܿ:I

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/۬ܿܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;Ll/ܰۡܺ;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1, p2, p3}, Ll/ۙܿܺ;-><init>(Ll/۬ܿܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;)V

    if-eqz p4, :cond_0

    .line 66
    iput-object p4, p0, Ll/᩸ܿܺ;->ܳ:Ll/ܰۡܺ;

    const/4 p1, -0x1

    .line 67
    iput p1, p0, Ll/᩸ܿܺ;->᩻:I

    .line 68
    iput p1, p0, Ll/᩸ܿܺ;->ܿ:I

    return-void

    .line 63
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "constant == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 211
    iget-object v0, p0, Ll/᩸ܿܺ;->ܳ:Ll/ܰۡܺ;

    invoke-interface {v0}, Ll/֡ᩴܺ;->֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/۬ܿܺ;)Ll/ۙܿܺ;
    .locals 4

    .line 76
    new-instance v0, Ll/᩸ܿܺ;

    .line 77
    invoke-virtual {p0}, Ll/ۙܿܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v1

    invoke-virtual {p0}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v2

    iget-object v3, p0, Ll/᩸ܿܺ;->ܳ:Ll/ܰۡܺ;

    invoke-direct {v0, p1, v1, v2, v3}, Ll/᩸ܿܺ;-><init>(Ll/۬ܿܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;Ll/ܰۡܺ;)V

    .line 79
    iget p1, p0, Ll/᩸ܿܺ;->᩻:I

    if-ltz p1, :cond_0

    .line 80
    invoke-virtual {v0, p1}, Ll/᩸ܿܺ;->ᩳ(I)V

    .line 83
    :cond_0
    iget p1, p0, Ll/᩸ܿܺ;->ܿ:I

    if-ltz p1, :cond_1

    .line 84
    invoke-virtual {v0, p1}, Ll/᩸ܿܺ;->ܽ(I)V

    :cond_1
    return-object v0
.end method

.method public final ֫(Ll/᩶ۡܺ;)Ll/ۙܿܺ;
    .locals 4

    .line 95
    new-instance v0, Ll/᩸ܿܺ;

    .line 96
    invoke-virtual {p0}, Ll/ۙܿܺ;->᩻()Ll/۬ܿܺ;

    move-result-object v1

    invoke-virtual {p0}, Ll/ۙܿܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v2

    iget-object v3, p0, Ll/᩸ܿܺ;->ܳ:Ll/ܰۡܺ;

    invoke-direct {v0, v1, v2, p1, v3}, Ll/᩸ܿܺ;-><init>(Ll/۬ܿܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;Ll/ܰۡܺ;)V

    .line 98
    iget p1, p0, Ll/᩸ܿܺ;->᩻:I

    if-ltz p1, :cond_0

    .line 99
    invoke-virtual {v0, p1}, Ll/᩸ܿܺ;->ᩳ(I)V

    .line 102
    :cond_0
    iget p1, p0, Ll/᩸ܿܺ;->ܿ:I

    if-ltz p1, :cond_1

    .line 103
    invoke-virtual {v0, p1}, Ll/᩸ܿܺ;->ܽ(I)V

    :cond_1
    return-object v0
.end method

.method public final ۖ()Ll/ܰۡܺ;
    .locals 1

    .line 115
    iget-object v0, p0, Ll/᩸ܿܺ;->ܳ:Ll/ܰۡܺ;

    return-object v0
.end method

.method public final ۘ()I
    .locals 3

    .line 125
    iget v0, p0, Ll/᩸ܿܺ;->᩻:I

    if-ltz v0, :cond_0

    return v0

    .line 126
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "index not yet set for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/᩸ܿܺ;->ܳ:Ll/ܰۡܺ;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 3

    .line 139
    iget v0, p0, Ll/᩸ܿܺ;->᩻:I

    if-ltz v0, :cond_1

    .line 234
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 115
    iget-object v1, p0, Ll/᩸ܿܺ;->ܳ:Ll/ܰۡܺ;

    .line 235
    invoke-virtual {v1}, Ll/ܰۡܺ;->᩻()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    .line 236
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 238
    iget v1, p0, Ll/᩸ܿܺ;->᩻:I

    const/high16 v2, 0x10000

    if-ge v1, v2, :cond_0

    .line 239
    invoke-static {v1}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 241
    :cond_0
    invoke-static {v1}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v0, ""

    return-object v0
.end method

.method public final ܽ(I)V
    .locals 1

    if-ltz p1, :cond_1

    .line 199
    iget v0, p0, Ll/᩸ܿܺ;->ܿ:I

    if-gez v0, :cond_0

    .line 203
    iput p1, p0, Ll/᩸ܿܺ;->ܿ:I

    return-void

    .line 200
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "class index already set"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 196
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "index < 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 2

    .line 219
    iget-object v0, p0, Ll/᩸ܿܺ;->ܳ:Ll/ܰۡܺ;

    instance-of v1, v0, Ll/۬ܺܺ;

    if-eqz v1, :cond_0

    .line 220
    check-cast v0, Ll/۬ܺܺ;

    invoke-virtual {v0}, Ll/۬ܺܺ;->ۚ()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 222
    :cond_0
    invoke-interface {v0}, Ll/֡ᩴܺ;->֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ(I)V
    .locals 1

    if-ltz p1, :cond_1

    .line 153
    iget v0, p0, Ll/᩸ܿܺ;->᩻:I

    if-gez v0, :cond_0

    .line 157
    iput p1, p0, Ll/᩸ܿܺ;->᩻:I

    return-void

    .line 154
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "index already set"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 150
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "index < 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
