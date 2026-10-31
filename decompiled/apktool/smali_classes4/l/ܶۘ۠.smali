.class public Ll/ܶۘ۠;
.super Ll/᩹ۘ۠;
.source "37RB"


# instance fields
.field public final ܿ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩶ۘ۠;IILjava/lang/String;Ll/ۖܶ۠;)V
    .locals 0

    .line 420
    invoke-direct {p0, p1, p2, p3, p5}, Ll/᩹ۘ۠;-><init>(Ll/᩶ۘ۠;IILl/ۖܶ۠;)V

    .line 421
    iput-object p4, p0, Ll/ܶۘ۠;->ܿ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public ֫()V
    .locals 4

    .line 425
    iget-object v0, p0, Ll/᩹ۘ۠;->ܽ:Ll/᩶ۘ۠;

    iget-object v0, v0, Ll/᩶ۘ۠;->᩹:Ll/᩸ۘ۠;

    sget-object v1, Ll/᩸ۘ۠;->ۗ:Ll/᩸ۘ۠;

    if-ne v0, v1, :cond_0

    return-void

    .line 426
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

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 432
    iget-object v0, p0, Ll/ܶۘ۠;->ܿ:Ljava/lang/String;

    return-object v0
.end method
