.class public abstract Ll/ۗܺۡ;
.super Ll/۬ܺۡ;
.source "35SE"

# interfaces
.implements Landroid/graphics/drawable/Animatable;


# instance fields
.field public ۛ:Z

.field public ۤ:[Landroid/animation/Animator;


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 33
    invoke-super {p0, p1}, Ll/ۙܺۡ;->draw(Landroid/graphics/Canvas;)V

    .line 57
    iget-object p1, p0, Ll/ۗܺۡ;->ۤ:[Landroid/animation/Animator;

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    .line 58
    invoke-virtual {v2}, Landroid/animation/Animator;->isStarted()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 36
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public isRunning()Z
    .locals 5

    .line 80
    iget-object v0, p0, Ll/ۗܺۡ;->ۤ:[Landroid/animation/Animator;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    .line 81
    invoke-virtual {v4}, Landroid/animation/Animator;->isRunning()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public start()V
    .locals 5

    .line 57
    iget-object v0, p0, Ll/ۗܺۡ;->ۤ:[Landroid/animation/Animator;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    .line 58
    invoke-virtual {v4}, Landroid/animation/Animator;->isStarted()Z

    move-result v4

    if-eqz v4, :cond_0

    return-void

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 50
    :cond_1
    iget-object v0, p0, Ll/ۗܺۡ;->ۤ:[Landroid/animation/Animator;

    array-length v1, v0

    :goto_1
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    .line 51
    invoke-virtual {v3}, Landroid/animation/Animator;->start()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 53
    :cond_2
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public stop()V
    .locals 4

    .line 70
    iget-object v0, p0, Ll/ۗܺۡ;->ۤ:[Landroid/animation/Animator;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 71
    invoke-virtual {v3}, Landroid/animation/Animator;->end()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
