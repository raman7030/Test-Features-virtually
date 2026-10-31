.class public Ll/֨᩻;
.super Ll/ᩴ᩻;
.source "T9OD"


# instance fields
.field public ۟:[[I


# virtual methods
.method public final ֫([I)I
    .locals 4

    .line 353
    iget-object v0, p0, Ll/֨᩻;->۟:[[I

    .line 820
    iget v1, p0, Ll/ᩴ᩻;->۬:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 356
    aget-object v3, v0, v2

    invoke-static {v3, p1}, Landroid/util/StateSet;->stateSetMatches([I[I)Z

    move-result v3

    if-eqz v3, :cond_0

    return v2

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public ܿ()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method
