.class public final Ll/ۖۛ֡;
.super Ll/᩹۟֡;
.source "M605"


# instance fields
.field public ۗ:I

.field public ۙ:I

.field public final synthetic ۫:Ll/ۘۛ֡;

.field public ۬:I


# direct methods
.method public constructor <init>(Ll/ۘۛ֡;Ll/۬ۛ֡;I)V
    .locals 0

    .line 434
    iput-object p1, p0, Ll/ۖۛ֡;->۫:Ll/ۘۛ֡;

    invoke-direct {p0, p2, p3}, Ll/᩹۟֡;-><init>(Ll/۬ۛ֡;I)V

    const/4 p1, -0x1

    .line 436
    iput p1, p0, Ll/ۖۛ֡;->۬:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ᩴۨ֡;)Ljava/lang/Object;
    .locals 11

    .line 443
    iget-object v0, p0, Ll/ۖۛ֡;->۫:Ll/ۘۛ֡;

    iget-object v9, v0, Ll/ۘۛ֡;->᩶:Ll/۠ۛ֡;

    :goto_0
    iget v1, p0, Ll/ۖۛ֡;->ۙ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ۖۛ֡;->ۙ:I

    invoke-static {v9}, Ll/۠ۛ֡;->ܿ(Ll/۠ۛ֡;)I

    move-result v2

    if-le v1, v2, :cond_0

    .line 444
    invoke-virtual {p0}, Ll/֨᩶ܺ;->ۧ()V

    const/4 p1, 0x0

    return-object p1

    .line 448
    :cond_0
    iget-object v1, v0, Ll/ۘۛ֡;->ۙ:Ljava/util/Iterator;

    if-eqz v1, :cond_1

    .line 449
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move v8, v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x7

    const/4 v8, 0x7

    .line 452
    :goto_1
    new-instance v10, Ll/ܽۨ֡;

    iget-object v2, v9, Ll/۠ۛ֡;->᩶:Ll/۬ۛ֡;

    iget v5, p0, Ll/ۖۛ֡;->ۗ:I

    iget-object v6, v0, Ll/ۘۛ֡;->᩸:Ll/ܰܰ֡;

    iget-object v7, v0, Ll/ۘۛ֡;->᩹:Ll/ܰܰ֡;

    move-object v1, v10

    move-object v3, p1

    move-object v4, v9

    invoke-direct/range {v1 .. v8}, Ll/ܽۨ֡;-><init>(Ll/۬ۛ֡;Ll/ᩴۨ֡;Ll/۠ۛ֡;ILl/ܰܰ֡;Ll/ܰܰ֡;I)V

    .line 455
    iget v1, v10, Ll/ܽۨ֡;->ۤ:I

    iput v1, p0, Ll/ۖۛ֡;->ۗ:I

    .line 458
    iget-boolean v2, v0, Ll/ۘۛ֡;->۬:Z

    if-eqz v2, :cond_2

    iget v2, p0, Ll/ۖۛ֡;->۬:I

    if-ne v2, v1, :cond_2

    goto :goto_0

    .line 461
    :cond_2
    iput v1, p0, Ll/ۖۛ֡;->۬:I

    return-object v10
.end method
