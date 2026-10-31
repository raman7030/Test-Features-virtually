.class public final Ll/ᩳ᩹ۡ;
.super Ljava/lang/Object;
.source "87EO"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Ljava/util/WeakHashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 17
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Ll/ᩳ᩹ۡ;->ۧ:Ljava/util/WeakHashMap;

    return-void
.end method

.method public static ֫(Landroid/view/View;)V
    .locals 1

    .line 26
    new-instance v0, Ll/ܽ᩹ۡ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method public static synthetic ֫(Landroid/view/View;Landroid/view/MotionEvent;)V
    .locals 3

    .line 27
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    .line 28
    sget-object v1, Ll/ᩳ᩹ۡ;->ۧ:Ljava/util/WeakHashMap;

    if-nez v0, :cond_0

    .line 29
    new-instance v0, Landroid/graphics/Point;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    invoke-direct {v0, v2, p1}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v1, p0, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    if-eq v0, p1, :cond_1

    const/4 p1, 0x3

    if-ne v0, p1, :cond_2

    .line 31
    :cond_1
    invoke-virtual {v1, p0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_0
    return-void
.end method

.method public static ֫(Landroid/view/View;Ll/᩸ۖ;)V
    .locals 2

    .line 41
    sget-object v0, Ll/ᩳ᩹ۡ;->ۧ:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    if-eqz v0, :cond_0

    .line 42
    iget v0, v0, Landroid/graphics/Point;->x:I

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    :goto_0
    if-ltz v0, :cond_1

    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    if-le v0, v1, :cond_2

    .line 44
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    .line 46
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p0

    div-int/lit8 p0, p0, 0x2

    if-ge v0, p0, :cond_3

    const/4 p0, 0x3

    goto :goto_1

    :cond_3
    const/4 p0, 0x5

    :goto_1
    invoke-virtual {p1, p0}, Ll/᩸ۖ;->֫(I)V

    .line 47
    invoke-virtual {p1}, Ll/᩸ۖ;->ܿ()V

    return-void
.end method
