.class public final Ll/۠֫ᩴ;
.super Ll/ۘۧᩴ;
.source "UCGS"


# instance fields
.field public final synthetic ᩶:Ll/᩸֫ᩴ;


# direct methods
.method public constructor <init>(Ll/᩸֫ᩴ;I)V
    .locals 0

    .line 431
    iput-object p1, p0, Ll/۠֫ᩴ;->᩶:Ll/᩸֫ᩴ;

    .line 1066
    invoke-direct {p0, p2}, Ll/ۖۧᩴ;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 428
    check-cast p1, Ll/᩻ۧᩴ;

    invoke-virtual {p0, p1}, Ll/۠֫ᩴ;->ۧ(Ll/᩻ۧᩴ;)V

    return-void
.end method

.method public final ֡ۧ()C
    .locals 4

    .line 462
    invoke-virtual {p0}, Ll/ۖۧᩴ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 463
    iget-object v0, p0, Ll/۠֫ᩴ;->᩶:Ll/᩸֫ᩴ;

    iget-object v1, v0, Ll/᩸֫ᩴ;->ۙ:Ll/᩹֫ᩴ;

    iget-object v1, v1, Ll/᩹֫ᩴ;->᩸:[C

    iget v0, v0, Ll/ۘܰۘ;->᩸:I

    iget v2, p0, Ll/ۖۧᩴ;->᩹:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Ll/ۖۧᩴ;->᩹:I

    iput v2, p0, Ll/ۖۧᩴ;->᩸:I

    add-int/2addr v0, v2

    aget-char v0, v1, v0

    return v0

    .line 462
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final ֫()I
    .locals 2

    .line 457
    iget-object v0, p0, Ll/۠֫ᩴ;->᩶:Ll/᩸֫ᩴ;

    iget v1, v0, Ll/ۘܰۘ;->᩶:I

    iget v0, v0, Ll/ۘܰۘ;->᩸:I

    sub-int/2addr v1, v0

    return v1
.end method

.method public final ֫(CI)V
    .locals 1

    .line 442
    iget-object v0, p0, Ll/۠֫ᩴ;->᩶:Ll/᩸֫ᩴ;

    invoke-virtual {v0, p1, p2}, Ll/ۘܰۘ;->ۧ(CI)V

    return-void
.end method

.method public final ۧ(I)C
    .locals 2

    .line 437
    iget-object v0, p0, Ll/۠֫ᩴ;->᩶:Ll/᩸֫ᩴ;

    iget-object v1, v0, Ll/᩸֫ᩴ;->ۙ:Ll/᩹֫ᩴ;

    iget-object v1, v1, Ll/᩹֫ᩴ;->᩸:[C

    iget v0, v0, Ll/ۘܰۘ;->᩸:I

    add-int/2addr v0, p1

    aget-char p1, v1, v0

    return p1
.end method

.method public final ۧ(CI)V
    .locals 1

    .line 447
    iget-object v0, p0, Ll/۠֫ᩴ;->᩶:Ll/᩸֫ᩴ;

    invoke-virtual {v0, p1, p2}, Ll/ۘܰۘ;->֫(CI)C

    return-void
.end method

.method public final ۧ(Ll/᩻ۧᩴ;)V
    .locals 6

    .line 474
    iget-object v0, p0, Ll/۠֫ᩴ;->᩶:Ll/᩸֫ᩴ;

    iget-object v1, v0, Ll/᩸֫ᩴ;->ۙ:Ll/᩹֫ᩴ;

    iget-object v1, v1, Ll/᩹֫ᩴ;->᩸:[C

    .line 475
    iget v2, v0, Ll/ۘܰۘ;->᩶:I

    iget v3, v0, Ll/ۘܰۘ;->᩸:I

    sub-int/2addr v2, v3

    .line 476
    :goto_0
    iget v3, p0, Ll/ۖۧᩴ;->᩹:I

    if-ge v3, v2, :cond_0

    .line 477
    iget v4, v0, Ll/ۘܰۘ;->᩸:I

    add-int/lit8 v5, v3, 0x1

    iput v5, p0, Ll/ۖۧᩴ;->᩹:I

    iput v3, p0, Ll/ۖۧᩴ;->᩸:I

    add-int/2addr v4, v3

    aget-char v3, v1, v4

    invoke-interface {p1, v3}, Ll/᩻ۧᩴ;->ܽ(C)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܽ(I)V
    .locals 1

    .line 452
    iget-object v0, p0, Ll/۠֫ᩴ;->᩶:Ll/᩸֫ᩴ;

    invoke-virtual {v0, p1}, Ll/ۘܰۘ;->֡(I)C

    return-void
.end method

.method public final ᩺֫()C
    .locals 3

    .line 468
    invoke-virtual {p0}, Ll/ۘۧᩴ;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 469
    iget-object v0, p0, Ll/۠֫ᩴ;->᩶:Ll/᩸֫ᩴ;

    iget-object v1, v0, Ll/᩸֫ᩴ;->ۙ:Ll/᩹֫ᩴ;

    iget-object v1, v1, Ll/᩹֫ᩴ;->᩸:[C

    iget v0, v0, Ll/ۘܰۘ;->᩸:I

    iget v2, p0, Ll/ۖۧᩴ;->᩹:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/ۖۧᩴ;->᩹:I

    iput v2, p0, Ll/ۖۧᩴ;->᩸:I

    add-int/2addr v0, v2

    aget-char v0, v1, v0

    return v0

    .line 468
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
