.class public final Ll/ᩳܰܿ;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "D5GW"


# instance fields
.field public final synthetic ᩸:Ll/ۜܰܿ;


# direct methods
.method public constructor <init>(Ll/ۜܰܿ;Landroid/content/Context;)V
    .locals 0

    .line 758
    iput-object p1, p0, Ll/ᩳܰܿ;->᩸:Ll/ۜܰܿ;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    .line 759
    invoke-static {p2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    return-void
.end method


# virtual methods
.method public final onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 7

    .line 798
    iget-object v0, p0, Ll/ᩳܰܿ;->᩸:Ll/ۜܰܿ;

    iget-object v1, v0, Ll/ۜܰܿ;->ۨ:Ll/ۙܰܿ;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int p1, p1

    int-to-long v3, p1

    invoke-virtual {v0}, Ll/ۜܰܿ;->ܿ()J

    move-result-wide v5

    add-long/2addr v3, v5

    const/4 p1, 0x0

    .line 565
    invoke-virtual {v1, v2, v3, v4, p1}, Ll/ۙܰܿ;->֫(FJZ)I

    move-result v2

    .line 799
    iget-object v3, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v3}, Ll/ۧܰܿ;->ᩳ()I

    move-result v4

    if-lt v2, v4, :cond_0

    return p1

    .line 801
    :cond_0
    invoke-virtual {v3}, Ll/ۧܰܿ;->ۡ()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 802
    invoke-virtual {v1}, Ll/ۙܰܿ;->ܺ()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {v3}, Ll/ۧܰܿ;->᩷()I

    move-result p1

    if-lt v2, p1, :cond_1

    invoke-virtual {v3}, Ll/ۧܰܿ;->ۜ()I

    move-result p1

    if-le v2, p1, :cond_3

    .line 803
    :cond_1
    invoke-virtual {v3, v2, v2}, Ll/ۧܰܿ;->ۧ(II)V

    goto :goto_0

    .line 806
    :cond_2
    invoke-virtual {v3, v2, v2}, Ll/ۧܰܿ;->ۧ(II)V

    .line 808
    :cond_3
    :goto_0
    invoke-static {v0}, Ll/ۜܰܿ;->ᩳ(Ll/ۜܰܿ;)V

    .line 809
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 810
    invoke-virtual {v0, v2}, Ll/ۜܰܿ;->֫(I)Z

    move-result p1

    invoke-static {v0, p1}, Ll/ۜܰܿ;->֫(Ll/ۜܰܿ;Z)V

    const/4 p1, 0x1

    return p1
.end method

.method public final onDown(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 764
    iget-object p1, p0, Ll/ᩳܰܿ;->᩸:Ll/ۜܰܿ;

    invoke-virtual {p1}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-nez v0, :cond_0

    .line 765
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 9

    const/4 p1, 0x0

    cmpl-float p1, p4, p1

    if-eqz p1, :cond_0

    .line 839
    iget-object p1, p0, Ll/ᩳܰܿ;->᩸:Ll/ۜܰܿ;

    invoke-static {p1}, Ll/ۜܰܿ;->֫(Ll/ۜܰܿ;)Ll/ᩴ۟ܿ;

    move-result-object v0

    invoke-virtual {p1}, Ll/ۜܰܿ;->ܿ()J

    move-result-wide v1

    neg-float p2, p4

    float-to-int p2, p2

    int-to-long v3, p2

    iget-object p2, p1, Ll/ۜܰܿ;->ۨ:Ll/ۙܰܿ;

    .line 840
    invoke-virtual {p2}, Ll/ۙܰܿ;->ܽ()J

    move-result-wide v5

    invoke-static {p1}, Ll/ۜܰܿ;->ܽ(Ll/ۜܰܿ;)I

    move-result p2

    int-to-long v7, p2

    .line 839
    invoke-virtual/range {v0 .. v8}, Ll/ᩴ۟ܿ;->֫(JJJJ)V

    .line 841
    invoke-static {p1}, Ll/ۜܰܿ;->ܿ(Ll/ۜܰܿ;)V

    .line 842
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 1

    .line 816
    invoke-virtual {p0, p1}, Ll/ᩳܰܿ;->onDoubleTap(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 817
    iget-object p1, p0, Ll/ᩳܰܿ;->᩸:Ll/ۜܰܿ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    :cond_0
    return-void
.end method

.method public final onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 4

    const/4 p1, 0x0

    cmpl-float p1, p4, p1

    if-eqz p1, :cond_2

    .line 823
    iget-object p1, p0, Ll/ᩳܰܿ;->᩸:Ll/ۜܰܿ;

    invoke-virtual {p1}, Ll/ۜܰܿ;->ܿ()J

    move-result-wide p2

    invoke-static {p4}, Ljava/lang/Math;->round(F)I

    move-result p4

    int-to-long v0, p4

    add-long/2addr p2, v0

    .line 824
    iget-object p4, p1, Ll/ۜܰܿ;->ۨ:Ll/ۙܰܿ;

    invoke-virtual {p4}, Ll/ۙܰܿ;->ܽ()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p4, p2, v2

    if-gez p4, :cond_0

    move-wide p2, v2

    goto :goto_0

    :cond_0
    cmp-long p4, p2, v0

    if-lez p4, :cond_1

    move-wide p2, v0

    .line 829
    :cond_1
    :goto_0
    invoke-static {p1}, Ll/ۜܰܿ;->ܿ(Ll/ۜܰܿ;)V

    .line 830
    invoke-virtual {p1, p2, p3}, Ll/ۜܰܿ;->֫(J)V

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 7

    .line 772
    iget-object v0, p0, Ll/ᩳܰܿ;->᩸:Ll/ۜܰܿ;

    iget-object v1, v0, Ll/ۜܰܿ;->ۨ:Ll/ۙܰܿ;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int p1, p1

    int-to-long v3, p1

    invoke-virtual {v0}, Ll/ۜܰܿ;->ܿ()J

    move-result-wide v5

    add-long/2addr v3, v5

    const/4 p1, 0x0

    .line 565
    invoke-virtual {v1, v2, v3, v4, p1}, Ll/ۙܰܿ;->֫(FJZ)I

    move-result v2

    .line 773
    iget-object v3, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v3}, Ll/ۧܰܿ;->ۡ()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 774
    invoke-virtual {v1}, Ll/ۙܰܿ;->ܺ()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v3}, Ll/ۧܰܿ;->᩷()I

    move-result v4

    if-lt v2, v4, :cond_1

    invoke-virtual {v3}, Ll/ۧܰܿ;->ۜ()I

    move-result v4

    if-le v2, v4, :cond_0

    goto :goto_0

    .line 779
    :cond_0
    invoke-static {v0}, Ll/ۜܰܿ;->ܳ(Ll/ۜܰܿ;)V

    goto :goto_3

    .line 775
    :cond_1
    :goto_0
    invoke-virtual {v1}, Ll/ۙܰܿ;->ۖ()Z

    move-result v1

    invoke-virtual {v3, v2, v1}, Ll/ۧܰܿ;->֫(IZ)V

    .line 776
    invoke-virtual {v0, v2}, Ll/ۜܰܿ;->֫(I)Z

    .line 777
    invoke-virtual {v0}, Ll/ۜܰܿ;->ۧ()V

    goto :goto_3

    .line 781
    :cond_2
    invoke-virtual {v3}, Ll/ۧܰܿ;->᩷()I

    move-result v4

    if-ne v4, v2, :cond_5

    invoke-virtual {v3}, Ll/ۧܰܿ;->ܺ()Z

    move-result v4

    invoke-virtual {v1}, Ll/ۙܰܿ;->ۖ()Z

    move-result v5

    if-eq v4, v5, :cond_3

    goto :goto_1

    .line 785
    :cond_3
    invoke-virtual {v1}, Ll/ۙܰܿ;->ܺ()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 786
    invoke-virtual {v0, v2}, Ll/ۜܰܿ;->֫(I)Z

    goto :goto_2

    .line 788
    :cond_4
    invoke-virtual {v0, v2}, Ll/ۜܰܿ;->֫(I)Z

    move-result v1

    invoke-static {v0, v1}, Ll/ۜܰܿ;->֫(Ll/ۜܰܿ;Z)V

    goto :goto_2

    .line 783
    :cond_5
    :goto_1
    invoke-virtual {v1}, Ll/ۙܰܿ;->ۖ()Z

    move-result v1

    invoke-virtual {v3, v2, v1}, Ll/ۧܰܿ;->֫(IZ)V

    .line 784
    invoke-virtual {v0, v2}, Ll/ۜܰܿ;->֫(I)Z

    .line 789
    :goto_2
    invoke-virtual {v0}, Ll/ۜܰܿ;->ۧ()V

    .line 791
    :goto_3
    invoke-static {v0}, Ll/ۜܰܿ;->ᩳ(Ll/ۜܰܿ;)V

    .line 792
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return p1
.end method
