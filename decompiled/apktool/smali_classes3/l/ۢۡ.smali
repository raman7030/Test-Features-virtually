.class public Ll/ۢۡ;
.super Landroid/widget/RatingBar;
.source "O5U4"


# instance fields
.field public final ᩸:Ll/ۜۡ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f0403ea

    .line 46
    invoke-direct {p0, p1, p2, v0}, Ll/ۢۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RatingBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p0}, Ll/۬ۘ;->֫(Landroid/content/Context;Landroid/view/View;)V

    .line 55
    new-instance p1, Ll/ۜۡ;

    invoke-direct {p1, p0}, Ll/ۜۡ;-><init>(Landroid/widget/AbsSeekBar;)V

    iput-object p1, p0, Ll/ۢۡ;->᩸:Ll/ۜۡ;

    .line 56
    invoke-virtual {p1, p2, p3}, Ll/ۜۡ;->֫(Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final declared-synchronized onMeasure(II)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 61
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/widget/RatingBar;->onMeasure(II)V

    .line 63
    iget-object p2, p0, Ll/ۢۡ;->᩸:Ll/ۜۡ;

    invoke-virtual {p2}, Ll/ۜۡ;->֫()Landroid/graphics/Bitmap;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 65
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p2

    invoke-virtual {p0}, Landroid/widget/RatingBar;->getNumStars()I

    move-result v1

    mul-int p2, p2, v1

    const/4 v1, 0x0

    .line 66
    invoke-static {p2, p1, v1}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result p1

    .line 67
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    .line 66
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
