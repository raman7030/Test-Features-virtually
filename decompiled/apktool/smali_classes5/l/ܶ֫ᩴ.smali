.class public final Ll/ܶ֫ᩴ;
.super Ll/᩷ܽᩴ;
.source "UCGS"


# instance fields
.field public final synthetic ۙ:Ll/᩸֫ᩴ;


# direct methods
.method public constructor <init>(Ll/᩸֫ᩴ;)V
    .locals 0

    .line 489
    iput-object p1, p0, Ll/ܶ֫ᩴ;->ۙ:Ll/᩸֫ᩴ;

    .line 490
    iget p1, p1, Ll/ۘܰۘ;->᩸:I

    invoke-direct {p0, p1}, Ll/᩷ܽᩴ;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ll/᩸֫ᩴ;II)V
    .locals 0

    .line 493
    iput-object p1, p0, Ll/ܶ֫ᩴ;->ۙ:Ll/᩸֫ᩴ;

    .line 494
    invoke-direct {p0, p2, p3}, Ll/᩷ܽᩴ;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 487
    check-cast p1, Ll/᩻ۧᩴ;

    invoke-virtual {p0, p1}, Ll/ܶ֫ᩴ;->֫(Ll/᩻ۧᩴ;)V

    return-void
.end method

.method public final bridge synthetic tryAdvance(Ljava/lang/Object;)Z
    .locals 0

    .line 487
    check-cast p1, Ll/᩻ۧᩴ;

    invoke-virtual {p0, p1}, Ll/ܶ֫ᩴ;->ۧ(Ll/᩻ۧᩴ;)Z

    move-result p1

    return p1
.end method

.method public final ֫(I)C
    .locals 1

    .line 504
    iget-object v0, p0, Ll/ܶ֫ᩴ;->ۙ:Ll/᩸֫ᩴ;

    iget-object v0, v0, Ll/᩸֫ᩴ;->ۙ:Ll/᩹֫ᩴ;

    iget-object v0, v0, Ll/᩹֫ᩴ;->᩸:[C

    aget-char p1, v0, p1

    return p1
.end method

.method public final ֫(II)Ll/ܽܽᩴ;
    .locals 2

    .line 509
    new-instance v0, Ll/ܶ֫ᩴ;

    iget-object v1, p0, Ll/ܶ֫ᩴ;->ۙ:Ll/᩸֫ᩴ;

    invoke-direct {v0, v1, p1, p2}, Ll/ܶ֫ᩴ;-><init>(Ll/᩸֫ᩴ;II)V

    return-object v0
.end method

.method public final ֫(Ll/᩻ۧᩴ;)V
    .locals 4

    .line 521
    iget-object v0, p0, Ll/ܶ֫ᩴ;->ۙ:Ll/᩸֫ᩴ;

    iget-object v0, v0, Ll/᩸֫ᩴ;->ۙ:Ll/᩹֫ᩴ;

    iget-object v0, v0, Ll/᩹֫ᩴ;->᩸:[C

    .line 522
    invoke-virtual {p0}, Ll/᩷ܽᩴ;->֫()I

    move-result v1

    .line 523
    :goto_0
    iget v2, p0, Ll/ᩳܽᩴ;->᩸:I

    if-ge v2, v1, :cond_0

    add-int/lit8 v3, v2, 0x1

    .line 524
    iput v3, p0, Ll/ᩳܽᩴ;->᩸:I

    aget-char v2, v0, v2

    invoke-interface {p1, v2}, Ll/᩻ۧᩴ;->ܽ(C)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 499
    iget-object v0, p0, Ll/ܶ֫ᩴ;->ۙ:Ll/᩸֫ᩴ;

    iget v0, v0, Ll/ۘܰۘ;->᩶:I

    return v0
.end method

.method public final ۧ(Ll/᩻ۧᩴ;)Z
    .locals 3

    .line 514
    iget v0, p0, Ll/ᩳܽᩴ;->᩸:I

    invoke-virtual {p0}, Ll/᩷ܽᩴ;->֫()I

    move-result v1

    if-lt v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 515
    :cond_0
    iget-object v0, p0, Ll/ܶ֫ᩴ;->ۙ:Ll/᩸֫ᩴ;

    iget-object v0, v0, Ll/᩸֫ᩴ;->ۙ:Ll/᩹֫ᩴ;

    iget-object v0, v0, Ll/᩹֫ᩴ;->᩸:[C

    iget v1, p0, Ll/ᩳܽᩴ;->᩸:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ᩳܽᩴ;->᩸:I

    aget-char v0, v0, v1

    invoke-interface {p1, v0}, Ll/᩻ۧᩴ;->ܽ(C)V

    const/4 p1, 0x1

    return p1
.end method
