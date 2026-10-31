.class public final Ll/᩹ۖᩴ;
.super Ll/᩶ۘᩴ;
.source "QCDS"


# instance fields
.field public final synthetic ۙ:Ll/᩶ۖᩴ;


# direct methods
.method public constructor <init>(Ll/᩶ۖᩴ;)V
    .locals 0

    .line 523
    iput-object p1, p0, Ll/᩹ۖᩴ;->ۙ:Ll/᩶ۖᩴ;

    .line 524
    iget p1, p1, Ll/ۤܺᩴ;->᩸:I

    invoke-direct {p0, p1}, Ll/᩶ۘᩴ;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ll/᩶ۖᩴ;II)V
    .locals 0

    .line 527
    iput-object p1, p0, Ll/᩹ۖᩴ;->ۙ:Ll/᩶ۖᩴ;

    .line 528
    invoke-direct {p0, p2, p3}, Ll/᩶ۘᩴ;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 521
    check-cast p1, Ljava/util/function/LongConsumer;

    invoke-virtual {p0, p1}, Ll/᩹ۖᩴ;->forEachRemaining(Ljava/util/function/LongConsumer;)V

    return-void
.end method

.method public final forEachRemaining(Ljava/util/function/LongConsumer;)V
    .locals 4

    .line 555
    iget-object v0, p0, Ll/᩹ۖᩴ;->ۙ:Ll/᩶ۖᩴ;

    iget-object v0, v0, Ll/᩶ۖᩴ;->ۙ:Ll/ۙۖᩴ;

    iget-object v0, v0, Ll/ۙۖᩴ;->᩸:[J

    .line 556
    invoke-virtual {p0}, Ll/᩶ۘᩴ;->֫()I

    move-result v1

    .line 557
    :goto_0
    iget v2, p0, Ll/۠ۘᩴ;->᩸:I

    if-ge v2, v1, :cond_0

    add-int/lit8 v3, v2, 0x1

    .line 558
    iput v3, p0, Ll/۠ۘᩴ;->᩸:I

    aget-wide v2, v0, v2

    invoke-interface {p1, v2, v3}, Ljava/util/function/LongConsumer;->accept(J)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final bridge synthetic tryAdvance(Ljava/lang/Object;)Z
    .locals 0

    .line 521
    check-cast p1, Ljava/util/function/LongConsumer;

    invoke-virtual {p0, p1}, Ll/᩹ۖᩴ;->tryAdvance(Ljava/util/function/LongConsumer;)Z

    move-result p1

    return p1
.end method

.method public final tryAdvance(Ljava/util/function/LongConsumer;)Z
    .locals 3

    .line 548
    iget v0, p0, Ll/۠ۘᩴ;->᩸:I

    invoke-virtual {p0}, Ll/᩶ۘᩴ;->֫()I

    move-result v1

    if-lt v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 549
    :cond_0
    iget-object v0, p0, Ll/᩹ۖᩴ;->ۙ:Ll/᩶ۖᩴ;

    iget-object v0, v0, Ll/᩶ۖᩴ;->ۙ:Ll/ۙۖᩴ;

    iget-object v0, v0, Ll/ۙۖᩴ;->᩸:[J

    iget v1, p0, Ll/۠ۘᩴ;->᩸:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/۠ۘᩴ;->᩸:I

    aget-wide v1, v0, v1

    invoke-interface {p1, v1, v2}, Ljava/util/function/LongConsumer;->accept(J)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ֫(I)J
    .locals 3

    .line 538
    iget-object v0, p0, Ll/᩹ۖᩴ;->ۙ:Ll/᩶ۖᩴ;

    iget-object v0, v0, Ll/᩶ۖᩴ;->ۙ:Ll/ۙۖᩴ;

    iget-object v0, v0, Ll/ۙۖᩴ;->᩸:[J

    aget-wide v1, v0, p1

    return-wide v1
.end method

.method public final ֫(II)Ll/֨ۘᩴ;
    .locals 2

    .line 543
    new-instance v0, Ll/᩹ۖᩴ;

    iget-object v1, p0, Ll/᩹ۖᩴ;->ۙ:Ll/᩶ۖᩴ;

    invoke-direct {v0, v1, p1, p2}, Ll/᩹ۖᩴ;-><init>(Ll/᩶ۖᩴ;II)V

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 533
    iget-object v0, p0, Ll/᩹ۖᩴ;->ۙ:Ll/᩶ۖᩴ;

    iget v0, v0, Ll/ۤܺᩴ;->᩶:I

    return v0
.end method
