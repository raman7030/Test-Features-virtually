.class public final Ll/ܽۘܽ;
.super Ljava/lang/Object;
.source "05OO"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public ۗ:I

.field public ۙ:I

.field public ۬:I

.field public ᩶:I

.field public ᩸:I

.field public ᩹:I


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 5
    invoke-virtual {p0}, Ll/ܽۘܽ;->clone()Ll/ܽۘܽ;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ll/ܽۘܽ;
    .locals 2

    .line 85
    new-instance v0, Ll/ܽۘܽ;

    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 86
    iget v1, p0, Ll/ܽۘܽ;->ۗ:I

    iput v1, v0, Ll/ܽۘܽ;->ۗ:I

    .line 87
    iget v1, p0, Ll/ܽۘܽ;->᩸:I

    iput v1, v0, Ll/ܽۘܽ;->᩸:I

    .line 88
    iget v1, p0, Ll/ܽۘܽ;->۬:I

    iput v1, v0, Ll/ܽۘܽ;->۬:I

    .line 89
    iget v1, p0, Ll/ܽۘܽ;->᩶:I

    iput v1, v0, Ll/ܽۘܽ;->᩶:I

    .line 90
    iget v1, p0, Ll/ܽۘܽ;->᩹:I

    iput v1, v0, Ll/ܽۘܽ;->᩹:I

    .line 91
    iget v1, p0, Ll/ܽۘܽ;->ۙ:I

    iput v1, v0, Ll/ܽۘܽ;->ۙ:I

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 77
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Ll/ܽۘܽ;->ۗ:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ܽۘܽ;->᩸:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0x2d

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ܽۘܽ;->᩶:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ܽۘܽ;->᩹:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 35
    iget v0, p0, Ll/ܽۘܽ;->᩸:I

    return v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 39
    iput p1, p0, Ll/ܽۘܽ;->᩸:I

    return-void
.end method

.method public final ֫(Ll/۟ۖܽ;)V
    .locals 1

    .line 21
    invoke-virtual {p1}, Ll/۟ۖܽ;->ܽ()I

    move-result v0

    iput v0, p0, Ll/ܽۘܽ;->᩶:I

    .line 22
    invoke-virtual {p1}, Ll/۟ۖܽ;->ۧ()I

    move-result v0

    iput v0, p0, Ll/ܽۘܽ;->᩹:I

    .line 23
    invoke-virtual {p1}, Ll/۟ۖܽ;->ᩳ()I

    move-result p1

    iput p1, p0, Ll/ܽۘܽ;->ۙ:I

    return-void
.end method

.method public final ۧ(Ll/۟ۖܽ;)V
    .locals 1

    .line 15
    invoke-virtual {p1}, Ll/۟ۖܽ;->ܽ()I

    move-result v0

    iput v0, p0, Ll/ܽۘܽ;->ۗ:I

    .line 16
    invoke-virtual {p1}, Ll/۟ۖܽ;->ۧ()I

    move-result v0

    iput v0, p0, Ll/ܽۘܽ;->᩸:I

    .line 17
    invoke-virtual {p1}, Ll/۟ۖܽ;->ᩳ()I

    move-result p1

    iput p1, p0, Ll/ܽۘܽ;->۬:I

    return-void
.end method

.method public final ܳ(I)V
    .locals 0

    .line 31
    iput p1, p0, Ll/ܽۘܽ;->ۗ:I

    return-void
.end method

.method public final ܽ()I
    .locals 1

    .line 67
    iget v0, p0, Ll/ܽۘܽ;->ۙ:I

    return v0
.end method

.method public final ܽ(I)V
    .locals 0

    .line 63
    iput p1, p0, Ll/ܽۘܽ;->᩹:I

    return-void
.end method

.method public final ܿ()I
    .locals 1

    .line 43
    iget v0, p0, Ll/ܽۘܽ;->۬:I

    return v0
.end method

.method public final ܿ(I)V
    .locals 0

    .line 71
    iput p1, p0, Ll/ܽۘܽ;->ۙ:I

    return-void
.end method

.method public final ᩳ()I
    .locals 1

    .line 27
    iget v0, p0, Ll/ܽۘܽ;->ۗ:I

    return v0
.end method

.method public final ᩳ(I)V
    .locals 0

    .line 55
    iput p1, p0, Ll/ܽۘܽ;->᩶:I

    return-void
.end method
