.class public final Ll/ᩳ֫;
.super Ljava/lang/Object;
.source "757I"


# direct methods
.method public static ֫(Landroid/media/Rating;)F
    .locals 0

    .line 435
    invoke-virtual {p0}, Landroid/media/Rating;->getPercentRating()F

    move-result p0

    return p0
.end method

.method public static ֫(F)Landroid/media/Rating;
    .locals 0

    .line 455
    invoke-static {p0}, Landroid/media/Rating;->newPercentageRating(F)Landroid/media/Rating;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(I)Landroid/media/Rating;
    .locals 0

    .line 460
    invoke-static {p0}, Landroid/media/Rating;->newUnratedRating(I)Landroid/media/Rating;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(IF)Landroid/media/Rating;
    .locals 0

    .line 450
    invoke-static {p0, p1}, Landroid/media/Rating;->newStarRating(IF)Landroid/media/Rating;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Z)Landroid/media/Rating;
    .locals 0

    .line 440
    invoke-static {p0}, Landroid/media/Rating;->newHeartRating(Z)Landroid/media/Rating;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Landroid/media/Rating;)I
    .locals 0

    .line 410
    invoke-virtual {p0}, Landroid/media/Rating;->getRatingStyle()I

    move-result p0

    return p0
.end method

.method public static ۧ(Z)Landroid/media/Rating;
    .locals 0

    .line 445
    invoke-static {p0}, Landroid/media/Rating;->newThumbRating(Z)Landroid/media/Rating;

    move-result-object p0

    return-object p0
.end method

.method public static ܳ(Landroid/media/Rating;)Z
    .locals 0

    .line 425
    invoke-virtual {p0}, Landroid/media/Rating;->isThumbUp()Z

    move-result p0

    return p0
.end method

.method public static ܽ(Landroid/media/Rating;)F
    .locals 0

    .line 430
    invoke-virtual {p0}, Landroid/media/Rating;->getStarRating()F

    move-result p0

    return p0
.end method

.method public static ܿ(Landroid/media/Rating;)Z
    .locals 0

    .line 415
    invoke-virtual {p0}, Landroid/media/Rating;->isRated()Z

    move-result p0

    return p0
.end method

.method public static ᩳ(Landroid/media/Rating;)Z
    .locals 0

    .line 420
    invoke-virtual {p0}, Landroid/media/Rating;->hasHeart()Z

    move-result p0

    return p0
.end method
