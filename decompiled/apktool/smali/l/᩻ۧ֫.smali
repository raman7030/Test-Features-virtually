.class public final Ll/᩻ۧ֫;
.super Ljava/lang/Object;
.source "D33U"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final ۙ:Landroid/graphics/Rect;

.field public final ᩶:Landroid/graphics/Rect;

.field public final ᩸:Ll/ܿۧ֫;

.field public final ᩹:Z


# direct methods
.method public constructor <init>(ZLl/ܿۧ֫;)V
    .locals 1

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/᩻ۧ֫;->᩶:Landroid/graphics/Rect;

    .line 96
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/᩻ۧ֫;->ۙ:Landroid/graphics/Rect;

    .line 102
    iput-boolean p1, p0, Ll/᩻ۧ֫;->᩹:Z

    .line 103
    iput-object p2, p0, Ll/᩻ۧ֫;->᩸:Ll/ܿۧ֫;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 3

    .line 111
    iget-object v0, p0, Ll/᩻ۧ֫;->᩸:Ll/ܿۧ֫;

    check-cast v0, Ll/֫ۧ֫;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    check-cast p1, Ll/ܳ۟;

    .line 339
    iget-object v1, p0, Ll/᩻ۧ֫;->᩶:Landroid/graphics/Rect;

    invoke-virtual {p1, v1}, Ll/ܳ۟;->֫(Landroid/graphics/Rect;)V

    .line 112
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    check-cast p2, Ll/ܳ۟;

    .line 339
    iget-object p1, p0, Ll/᩻ۧ֫;->ۙ:Landroid/graphics/Rect;

    invoke-virtual {p2, p1}, Ll/ܳ۟;->֫(Landroid/graphics/Rect;)V

    .line 114
    iget p2, v1, Landroid/graphics/Rect;->top:I

    iget v0, p1, Landroid/graphics/Rect;->top:I

    if-ge p2, v0, :cond_0

    goto :goto_0

    :cond_0
    if-le p2, v0, :cond_1

    goto :goto_1

    .line 118
    :cond_1
    iget p2, v1, Landroid/graphics/Rect;->left:I

    iget v0, p1, Landroid/graphics/Rect;->left:I

    iget-boolean v2, p0, Ll/᩻ۧ֫;->᩹:Z

    if-ge p2, v0, :cond_2

    if-eqz v2, :cond_7

    goto :goto_1

    :cond_2
    if-le p2, v0, :cond_3

    if-eqz v2, :cond_8

    goto :goto_0

    .line 122
    :cond_3
    iget p2, v1, Landroid/graphics/Rect;->bottom:I

    iget v0, p1, Landroid/graphics/Rect;->bottom:I

    if-ge p2, v0, :cond_4

    goto :goto_0

    :cond_4
    if-le p2, v0, :cond_5

    goto :goto_1

    .line 126
    :cond_5
    iget p2, v1, Landroid/graphics/Rect;->right:I

    iget p1, p1, Landroid/graphics/Rect;->right:I

    if-ge p2, p1, :cond_6

    if-eqz v2, :cond_7

    goto :goto_1

    :cond_6
    if-le p2, p1, :cond_9

    if-eqz v2, :cond_8

    :cond_7
    :goto_0
    const/4 p1, -0x1

    return p1

    :cond_8
    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_9
    const/4 p1, 0x0

    return p1
.end method
