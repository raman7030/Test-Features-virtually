.class public final Ll/ۘ֡ᩴ;
.super Ll/ۗۚᩴ;
.source "C1NC"


# instance fields
.field public final synthetic ۙ:Ll/ᩴ֡ᩴ;


# direct methods
.method public constructor <init>(Ll/ᩴ֡ᩴ;)V
    .locals 0

    .line 567
    iput-object p1, p0, Ll/ۘ֡ᩴ;->ۙ:Ll/ᩴ֡ᩴ;

    .line 568
    iget p1, p1, Ll/ܽᩴᩴ;->᩸:I

    invoke-direct {p0, p1}, Ll/ۗۚᩴ;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ll/ᩴ֡ᩴ;II)V
    .locals 0

    .line 571
    iput-object p1, p0, Ll/ۘ֡ᩴ;->ۙ:Ll/ᩴ֡ᩴ;

    .line 572
    invoke-direct {p0, p2, p3}, Ll/ۗۚᩴ;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 4

    .line 599
    iget-object v0, p0, Ll/ۘ֡ᩴ;->ۙ:Ll/ᩴ֡ᩴ;

    iget-object v0, v0, Ll/ᩴ֡ᩴ;->ۙ:Ll/᩵֡ᩴ;

    iget-object v0, v0, Ll/᩵֡ᩴ;->᩸:[Ljava/lang/Object;

    .line 600
    invoke-virtual {p0}, Ll/ۗۚᩴ;->֫()I

    move-result v1

    .line 601
    :goto_0
    iget v2, p0, Ll/ܶۚᩴ;->᩸:I

    if-ge v2, v1, :cond_0

    add-int/lit8 v3, v2, 0x1

    .line 602
    iput v3, p0, Ll/ܶۚᩴ;->᩸:I

    aget-object v2, v0, v2

    invoke-interface {p1, v2}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 3

    .line 592
    iget v0, p0, Ll/ܶۚᩴ;->᩸:I

    invoke-virtual {p0}, Ll/ۗۚᩴ;->֫()I

    move-result v1

    if-lt v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 593
    :cond_0
    iget-object v0, p0, Ll/ۘ֡ᩴ;->ۙ:Ll/ᩴ֡ᩴ;

    iget-object v0, v0, Ll/ᩴ֡ᩴ;->ۙ:Ll/᩵֡ᩴ;

    iget-object v0, v0, Ll/᩵֡ᩴ;->᩸:[Ljava/lang/Object;

    iget v1, p0, Ll/ܶۚᩴ;->᩸:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ܶۚᩴ;->᩸:I

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ֫(I)Ljava/lang/Object;
    .locals 1

    .line 582
    iget-object v0, p0, Ll/ۘ֡ᩴ;->ۙ:Ll/ᩴ֡ᩴ;

    iget-object v0, v0, Ll/ᩴ֡ᩴ;->ۙ:Ll/᩵֡ᩴ;

    iget-object v0, v0, Ll/᩵֡ᩴ;->᩸:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ֫(II)Ll/۠ۚᩴ;
    .locals 2

    .line 587
    new-instance v0, Ll/ۘ֡ᩴ;

    iget-object v1, p0, Ll/ۘ֡ᩴ;->ۙ:Ll/ᩴ֡ᩴ;

    invoke-direct {v0, v1, p1, p2}, Ll/ۘ֡ᩴ;-><init>(Ll/ᩴ֡ᩴ;II)V

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 577
    iget-object v0, p0, Ll/ۘ֡ᩴ;->ۙ:Ll/ᩴ֡ᩴ;

    iget v0, v0, Ll/ܽᩴᩴ;->᩶:I

    return v0
.end method
