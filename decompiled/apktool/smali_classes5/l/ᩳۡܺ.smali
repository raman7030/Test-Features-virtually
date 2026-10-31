.class public final Ll/ᩳۡܺ;
.super Ljava/lang/Object;
.source "1BCD"

# interfaces
.implements Ll/ۡۡܺ;


# instance fields
.field public ֫:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 322
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 323
    iput v0, p0, Ll/ᩳۡܺ;->֫:I

    return-void
.end method

.method private ֫(Ll/ܺۡܺ;)V
    .locals 4

    .line 397
    invoke-virtual {p1}, Ll/ܺۡܺ;->ܺ()Ll/᩸ۡܺ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 417
    invoke-virtual {v0}, Ll/᩸ۡܺ;->ܺ()I

    move-result v0

    .line 419
    iget v1, p0, Ll/ᩳۡܺ;->֫:I

    if-le v0, v1, :cond_0

    .line 420
    iput v0, p0, Ll/ᩳۡܺ;->֫:I

    .line 403
    :cond_0
    invoke-virtual {p1}, Ll/ܺۡܺ;->ۖ()Ll/᩶ۡܺ;

    move-result-object p1

    .line 404
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 407
    invoke-virtual {p1, v1}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v2

    .line 417
    invoke-virtual {v2}, Ll/᩸ۡܺ;->ܺ()I

    move-result v2

    .line 419
    iget v3, p0, Ll/ᩳۡܺ;->֫:I

    if-le v2, v3, :cond_1

    .line 420
    iput v2, p0, Ll/ᩳۡܺ;->֫:I

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 332
    iget v0, p0, Ll/ᩳۡܺ;->֫:I

    return v0
.end method

.method public final ֫(Ll/֨ۡܺ;)V
    .locals 0

    .line 340
    invoke-direct {p0, p1}, Ll/ᩳۡܺ;->֫(Ll/ܺۡܺ;)V

    return-void
.end method

.method public final ֫(Ll/ۘۡܺ;)V
    .locals 0

    .line 388
    invoke-direct {p0, p1}, Ll/ᩳۡܺ;->֫(Ll/ܺۡܺ;)V

    return-void
.end method

.method public final ֫(Ll/ۚۡܺ;)V
    .locals 0

    .line 348
    invoke-direct {p0, p1}, Ll/ᩳۡܺ;->֫(Ll/ܺۡܺ;)V

    return-void
.end method

.method public final ֫(Ll/ۛۡܺ;)V
    .locals 0

    .line 356
    invoke-direct {p0, p1}, Ll/ᩳۡܺ;->֫(Ll/ܺۡܺ;)V

    return-void
.end method

.method public final ֫(Ll/ۨۡܺ;)V
    .locals 0

    .line 364
    invoke-direct {p0, p1}, Ll/ᩳۡܺ;->֫(Ll/ܺۡܺ;)V

    return-void
.end method

.method public final ֫(Ll/᩷ۡܺ;)V
    .locals 0

    .line 380
    invoke-direct {p0, p1}, Ll/ᩳۡܺ;->֫(Ll/ܺۡܺ;)V

    return-void
.end method

.method public final ֫(Ll/᩺ۡܺ;)V
    .locals 0

    .line 372
    invoke-direct {p0, p1}, Ll/ᩳۡܺ;->֫(Ll/ܺۡܺ;)V

    return-void
.end method
