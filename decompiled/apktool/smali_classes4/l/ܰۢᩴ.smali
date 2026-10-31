.class public final Ll/ܰۢᩴ;
.super Ll/᩻ܺᩴ;
.source "K9S0"


# instance fields
.field public final synthetic ᩶:Ll/۟ۢᩴ;


# direct methods
.method public constructor <init>(Ll/۟ۢᩴ;)V
    .locals 1

    .line 563
    iput-object p1, p0, Ll/ܰۢᩴ;->᩶:Ll/۟ۢᩴ;

    .line 564
    iget v0, p1, Ll/۟ۢᩴ;->᩹:I

    iget p1, p1, Ll/۟ۢᩴ;->ۙ:I

    invoke-direct {p0, v0, p1}, Ll/᩻ܺᩴ;-><init>(II)V

    return-void
.end method

.method public constructor <init>(Ll/۟ۢᩴ;II)V
    .locals 0

    .line 568
    iput-object p1, p0, Ll/ܰۢᩴ;->᩶:Ll/۟ۢᩴ;

    .line 569
    invoke-direct {p0, p2, p3}, Ll/᩻ܺᩴ;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final characteristics()I
    .locals 1

    const/16 v0, 0x4550

    return v0
.end method

.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 561
    check-cast p1, Ljava/util/function/IntConsumer;

    invoke-virtual {p0, p1}, Ll/ܰۢᩴ;->forEachRemaining(Ljava/util/function/IntConsumer;)V

    return-void
.end method

.method public final forEachRemaining(Ljava/util/function/IntConsumer;)V
    .locals 3

    .line 592
    iget-object v0, p0, Ll/ܰۢᩴ;->᩶:Ll/۟ۢᩴ;

    iget-object v0, v0, Ll/۟ۢᩴ;->᩸:[I

    .line 594
    :goto_0
    iget v1, p0, Ll/ᩳܺᩴ;->᩸:I

    iget v2, p0, Ll/᩻ܺᩴ;->᩹:I

    if-ge v1, v2, :cond_0

    add-int/lit8 v2, v1, 0x1

    .line 595
    iput v2, p0, Ll/ᩳܺᩴ;->᩸:I

    aget v1, v0, v1

    invoke-interface {p1, v1}, Ljava/util/function/IntConsumer;->accept(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final bridge synthetic tryAdvance(Ljava/lang/Object;)Z
    .locals 0

    .line 561
    check-cast p1, Ljava/util/function/IntConsumer;

    invoke-virtual {p0, p1}, Ll/ܰۢᩴ;->tryAdvance(Ljava/util/function/IntConsumer;)Z

    move-result p1

    return p1
.end method

.method public final tryAdvance(Ljava/util/function/IntConsumer;)Z
    .locals 3

    .line 585
    iget v0, p0, Ll/ᩳܺᩴ;->᩸:I

    iget v1, p0, Ll/᩻ܺᩴ;->᩹:I

    if-lt v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 586
    :cond_0
    iget-object v1, p0, Ll/ܰۢᩴ;->᩶:Ll/۟ۢᩴ;

    iget-object v1, v1, Ll/۟ۢᩴ;->᩸:[I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Ll/ᩳܺᩴ;->᩸:I

    aget v0, v1, v0

    invoke-interface {p1, v0}, Ljava/util/function/IntConsumer;->accept(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ֫(I)I
    .locals 1

    .line 575
    iget-object v0, p0, Ll/ܰۢᩴ;->᩶:Ll/۟ۢᩴ;

    iget-object v0, v0, Ll/۟ۢᩴ;->᩸:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ֫(II)Ll/ܽܺᩴ;
    .locals 2

    .line 580
    new-instance v0, Ll/ܰۢᩴ;

    iget-object v1, p0, Ll/ܰۢᩴ;->᩶:Ll/۟ۢᩴ;

    invoke-direct {v0, v1, p1, p2}, Ll/ܰۢᩴ;-><init>(Ll/۟ۢᩴ;II)V

    return-object v0
.end method
