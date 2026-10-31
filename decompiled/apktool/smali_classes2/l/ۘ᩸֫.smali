.class public abstract Ll/ۘ᩸֫;
.super Ljava/lang/Object;
.source "04CR"


# instance fields
.field public ᩸:I


# virtual methods
.method public final ۡ()Z
    .locals 1

    const/high16 v0, 0x20000000

    .line 55
    invoke-virtual {p0, v0}, Ll/ۘ᩸֫;->ᩳ(I)Z

    move-result v0

    return v0
.end method

.method public final ۢ()Z
    .locals 1

    const/4 v0, 0x1

    .line 50
    invoke-virtual {p0, v0}, Ll/ۘ᩸֫;->ᩳ(I)Z

    move-result v0

    return v0
.end method

.method public ۧ()V
    .locals 1

    const/4 v0, 0x0

    .line 31
    iput v0, p0, Ll/ۘ᩸֫;->᩸:I

    return-void
.end method

.method public final ۧ(I)V
    .locals 1

    .line 85
    iget v0, p0, Ll/ۘ᩸֫;->᩸:I

    or-int/2addr p1, v0

    iput p1, p0, Ll/ۘ᩸֫;->᩸:I

    return-void
.end method

.method public final ܺ()Z
    .locals 1

    const/high16 v0, 0x4000000

    .line 65
    invoke-virtual {p0, v0}, Ll/ۘ᩸֫;->ᩳ(I)Z

    move-result v0

    return v0
.end method

.method public final ܿ(I)V
    .locals 0

    .line 75
    iput p1, p0, Ll/ۘ᩸֫;->᩸:I

    return-void
.end method

.method public final ܿ()Z
    .locals 1

    const/high16 v0, 0x10000000

    .line 60
    invoke-virtual {p0, v0}, Ll/ۘ᩸֫;->ᩳ(I)Z

    move-result v0

    return v0
.end method

.method public final ᩳ(I)Z
    .locals 1

    .line 104
    iget v0, p0, Ll/ۘ᩸֫;->᩸:I

    and-int/2addr v0, p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩷()Z
    .locals 1

    const/high16 v0, 0x8000000

    .line 36
    invoke-virtual {p0, v0}, Ll/ۘ᩸֫;->ᩳ(I)Z

    move-result v0

    return v0
.end method

.method public final ᩻()Z
    .locals 1

    const/4 v0, 0x4

    .line 45
    invoke-virtual {p0, v0}, Ll/ۘ᩸֫;->ᩳ(I)Z

    move-result v0

    return v0
.end method
