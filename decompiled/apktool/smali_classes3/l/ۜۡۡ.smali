.class public Ll/ۜۡۡ;
.super Ll/֡ܰۧ;
.source "U14P"


# instance fields
.field public ۟֫:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1, p2}, Ll/֡ܰۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Ll/ۜۡۡ;->۟֫:Z

    return-void
.end method


# virtual methods
.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 43
    iget-boolean v0, p0, Ll/ۜۡۡ;->۟֫:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 45
    :try_start_0
    invoke-super {p0, p1}, Ll/֡ܰۧ;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    :cond_0
    return v1
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 30
    iget-boolean v0, p0, Ll/ۜۡۡ;->۟֫:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 32
    :try_start_0
    invoke-super {p0, p1}, Ll/֡ܰۧ;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    :cond_0
    return v1
.end method

.method public final ֫(Z)V
    .locals 0

    .line 21
    iput-boolean p1, p0, Ll/ۜۡۡ;->۟֫:Z

    return-void
.end method
