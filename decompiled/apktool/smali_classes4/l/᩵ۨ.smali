.class public final Ll/᩵ۨ;
.super Ljava/lang/Object;
.source "V32V"


# static fields
.field public static ֫:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 78
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 79
    invoke-static {v0}, Ll/᩶۬ᩴ;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Ll/᩵ۨ;->֫:Ljava/util/Map;

    return-void
.end method

.method public static ֫(Landroid/view/VelocityTracker;I)F
    .locals 2

    .line 145
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    .line 146
    invoke-static {p0, p1}, Ll/ᩴۨ;->֫(Landroid/view/VelocityTracker;I)F

    move-result p0

    return p0

    :cond_0
    if-nez p1, :cond_1

    .line 151
    invoke-virtual {p0}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result p0

    return p0

    :cond_1
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 154
    invoke-virtual {p0}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result p0

    return p0

    .line 300
    :cond_2
    sget-object v0, Ll/᩵ۨ;->֫:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֡ۨ;

    if-eqz p0, :cond_3

    .line 161
    invoke-virtual {p0, p1}, Ll/֡ۨ;->֫(I)F

    move-result p0

    return p0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(Landroid/view/VelocityTracker;)V
    .locals 2

    const/16 v0, 0x3e8

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 250
    invoke-virtual {p0, v0, v1}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 300
    sget-object v0, Ll/᩵ۨ;->֫:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֡ۨ;

    if-eqz p0, :cond_0

    .line 253
    invoke-virtual {p0}, Ll/֡ۨ;->֫()V

    :cond_0
    return-void
.end method

.method public static ֫(Landroid/view/VelocityTracker;Landroid/view/MotionEvent;)V
    .locals 2

    .line 278
    invoke-virtual {p0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 279
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    goto :goto_0

    .line 284
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v0

    const/high16 v1, 0x400000

    if-ne v0, v1, :cond_2

    .line 287
    sget-object v0, Ll/᩵ۨ;->֫:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 288
    new-instance v1, Ll/֡ۨ;

    invoke-direct {v1}, Ll/֡ۨ;-><init>()V

    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    :cond_1
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֡ۨ;

    invoke-virtual {p0, p1}, Ll/֡ۨ;->֫(Landroid/view/MotionEvent;)V

    :cond_2
    :goto_0
    return-void
.end method
