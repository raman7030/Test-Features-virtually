.class public final Ll/ۡۛ֡;
.super Ll/᩹۟֡;
.source "M605"


# instance fields
.field public ۗ:I

.field public ۙ:I

.field public final synthetic ۛ:Ll/ܰܰ֡;

.field public final synthetic ۤ:Ll/ܰܰ֡;

.field public final synthetic ۫:Ll/ܺۛ֡;

.field public ۬:I


# direct methods
.method public constructor <init>(Ll/ܺۛ֡;Ll/۬ۛ֡;ILl/ܰܰ֡;Ll/ܰܰ֡;)V
    .locals 0

    .line 372
    iput-object p1, p0, Ll/ۡۛ֡;->۫:Ll/ܺۛ֡;

    iput-object p4, p0, Ll/ۡۛ֡;->ۤ:Ll/ܰܰ֡;

    iput-object p5, p0, Ll/ۡۛ֡;->ۛ:Ll/ܰܰ֡;

    invoke-direct {p0, p2, p3}, Ll/᩹۟֡;-><init>(Ll/۬ۛ֡;I)V

    const/4 p1, -0x1

    .line 374
    iput p1, p0, Ll/ۡۛ֡;->۬:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ᩴۨ֡;)Ljava/lang/Object;
    .locals 10

    .line 381
    :goto_0
    iget v0, p0, Ll/ۡۛ֡;->ۙ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۡۛ֡;->ۙ:I

    iget-object v1, p0, Ll/ۡۛ֡;->۫:Ll/ܺۛ֡;

    iget-object v5, v1, Ll/ܺۛ֡;->᩸:Ll/۠ۛ֡;

    invoke-static {v5}, Ll/۠ۛ֡;->֫(Ll/۠ۛ֡;)I

    move-result v2

    if-le v0, v2, :cond_0

    .line 382
    invoke-virtual {p1}, Ll/ᩴۨ֡;->ۧ()I

    move-result p1

    invoke-static {v5, p1}, Ll/۠ۛ֡;->ܽ(Ll/۠ۛ֡;I)V

    .line 383
    invoke-virtual {p0}, Ll/֨᩶ܺ;->ۧ()V

    const/4 p1, 0x0

    return-object p1

    .line 387
    :cond_0
    iget-object v0, v1, Ll/ܺۛ֡;->᩶:Ljava/util/Iterator;

    if-eqz v0, :cond_1

    .line 388
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move v9, v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x7

    const/4 v9, 0x7

    .line 391
    :goto_1
    new-instance v0, Ll/ܽۨ֡;

    iget-object v3, v5, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    iget v6, p0, Ll/ۡۛ֡;->ۗ:I

    iget-object v7, p0, Ll/ۡۛ֡;->ۤ:Ll/ܰܰ֡;

    iget-object v8, p0, Ll/ۡۛ֡;->ۛ:Ll/ܰܰ֡;

    move-object v2, v0

    move-object v4, p1

    invoke-direct/range {v2 .. v9}, Ll/ܽۨ֡;-><init>(Ll/۬ۛ֡;Ll/ᩴۨ֡;Ll/۠ۛ֡;ILl/ܰܰ֡;Ll/ܰܰ֡;I)V

    .line 394
    iget v2, v0, Ll/ܽۨ֡;->ۤ:I

    iput v2, p0, Ll/ۡۛ֡;->ۗ:I

    .line 397
    iget-boolean v1, v1, Ll/ܺۛ֡;->ۗ:Z

    if-eqz v1, :cond_2

    iget v1, p0, Ll/ۡۛ֡;->۬:I

    if-ne v1, v2, :cond_2

    goto :goto_0

    .line 400
    :cond_2
    iput v2, p0, Ll/ۡۛ֡;->۬:I

    return-object v0
.end method
