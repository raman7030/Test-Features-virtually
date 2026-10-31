.class public final Ll/۠ۘ۠;
.super Ll/ܶۘ۠;
.source "37RB"


# instance fields
.field public final ܳ:I


# direct methods
.method public constructor <init>(Ll/᩶ۘ۠;IILjava/lang/String;ILl/ۖܶ۠;)V
    .locals 6

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p6

    .line 441
    invoke-direct/range {v0 .. v5}, Ll/ܶۘ۠;-><init>(Ll/᩶ۘ۠;IILjava/lang/String;Ll/ۖܶ۠;)V

    .line 442
    iput p5, p0, Ll/۠ۘ۠;->ܳ:I

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 446
    iget-object v0, p0, Ll/᩹ۘ۠;->ܽ:Ll/᩶ۘ۠;

    iget-object v0, v0, Ll/᩶ۘ۠;->᩹:Ll/᩸ۘ۠;

    sget-object v1, Ll/᩸ۘ۠;->ۙ:Ll/᩸ۘ۠;

    if-ne v0, v1, :cond_0

    return-void

    .line 447
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Bad token kind - expected "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public final ܿ()I
    .locals 1

    .line 453
    iget v0, p0, Ll/۠ۘ۠;->ܳ:I

    return v0
.end method
