.class public final Ll/ᩳۖᩴ;
.super Ll/᩸ۘᩴ;
.source "GQL"


# instance fields
.field public final synthetic ᩶:Ll/ܿۖᩴ;


# direct methods
.method public constructor <init>(Ll/ܿۖᩴ;II)V
    .locals 0

    .line 558
    iput-object p1, p0, Ll/ᩳۖᩴ;->᩶:Ll/ܿۖᩴ;

    .line 559
    invoke-direct {p0, p2, p3}, Ll/᩸ۘᩴ;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final characteristics()I
    .locals 1

    const/16 v0, 0x4151

    return v0
.end method

.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 557
    check-cast p1, Ljava/util/function/LongConsumer;

    invoke-virtual {p0, p1}, Ll/ᩳۖᩴ;->forEachRemaining(Ljava/util/function/LongConsumer;)V

    return-void
.end method

.method public final forEachRemaining(Ljava/util/function/LongConsumer;)V
    .locals 4

    .line 581
    iget-object v0, p0, Ll/ᩳۖᩴ;->᩶:Ll/ܿۖᩴ;

    iget-object v0, v0, Ll/ܿۖᩴ;->᩸:Ll/ۢۖᩴ;

    iget-object v1, v0, Ll/ۢۖᩴ;->᩹:[J

    .line 582
    iget v0, v0, Ll/ۢۖᩴ;->ۙ:I

    .line 583
    :goto_0
    iget v2, p0, Ll/۠ۘᩴ;->᩸:I

    if-ge v2, v0, :cond_0

    add-int/lit8 v3, v2, 0x1

    .line 584
    iput v3, p0, Ll/۠ۘᩴ;->᩸:I

    aget-wide v2, v1, v2

    invoke-interface {p1, v2, v3}, Ljava/util/function/LongConsumer;->accept(J)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(I)J
    .locals 3

    .line 570
    iget-object v0, p0, Ll/ᩳۖᩴ;->᩶:Ll/ܿۖᩴ;

    iget-object v0, v0, Ll/ܿۖᩴ;->᩸:Ll/ۢۖᩴ;

    iget-object v0, v0, Ll/ۢۖᩴ;->᩹:[J

    aget-wide v1, v0, p1

    return-wide v1
.end method

.method public final ֫(II)Ll/֨ۘᩴ;
    .locals 2

    .line 575
    new-instance v0, Ll/ᩳۖᩴ;

    iget-object v1, p0, Ll/ᩳۖᩴ;->᩶:Ll/ܿۖᩴ;

    invoke-direct {v0, v1, p1, p2}, Ll/ᩳۖᩴ;-><init>(Ll/ܿۖᩴ;II)V

    return-object v0
.end method
