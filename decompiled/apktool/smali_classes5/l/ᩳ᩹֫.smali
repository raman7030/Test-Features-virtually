.class public final Ll/ᩳ᩹֫;
.super Ll/ܰ᩷ۧ;
.source "K8DD"


# instance fields
.field public ۧ:I


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 396
    iput v0, p0, Ll/ᩳ᩹֫;->ۧ:I

    return-void
.end method

.method public final ֫(JIIILl/ᩴۢۧ;)V
    .locals 7

    and-int/lit8 v0, p3, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 387
    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 388
    iget v0, p0, Ll/ᩳ᩹֫;->ۧ:I

    if-nez v0, :cond_1

    or-int/lit8 p3, p3, 0x1

    :cond_1
    move v3, p3

    move-object v0, p0

    move-wide v1, p1

    move v4, p4

    move v5, p5

    move-object v6, p6

    .line 391
    invoke-super/range {v0 .. v6}, Ll/ܰ᩷ۧ;->֫(JIIILl/ᩴۢۧ;)V

    .line 392
    iget p1, p0, Ll/ᩳ᩹֫;->ۧ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ᩳ᩹֫;->ۧ:I

    return-void
.end method
