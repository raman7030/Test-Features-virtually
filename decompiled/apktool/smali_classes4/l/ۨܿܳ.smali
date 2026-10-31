.class public final Ll/ۨܿܳ;
.super Ll/᩺᩵֡;
.source "A6LD"


# instance fields
.field public ᩵:I


# virtual methods
.method public final ֫(Ll/ᩳ֨֡;Ll/֡ۚ֡;)V
    .locals 2

    .line 137
    instance-of v0, p2, Ll/᩸ᩴ֡;

    if-eqz v0, :cond_1

    iget v0, p0, Ll/ۨܿܳ;->᩵:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۨܿܳ;->᩵:I

    const v1, 0x186a0

    if-gt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ll/۟ܿܳ;

    .line 56
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 137
    throw p1

    .line 138
    :cond_1
    :goto_0
    invoke-super {p0, p1, p2}, Ll/᩺᩵֡;->֫(Ll/ᩳ֨֡;Ll/֡ۚ֡;)V

    return-void
.end method
