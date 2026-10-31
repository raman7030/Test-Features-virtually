.class public final Ll/ۘۙ۠;
.super Ljava/lang/Object;
.source "T5PO"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Ll/ᩴۙ۠;

.field public final ᩶:Ll/۠ۙ۠;

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ll/ᩴۙ۠;)V
    .locals 0

    .line 1098
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/ۘۙ۠;->ۙ:Ll/ᩴۙ۠;

    .line 23
    new-instance p2, Ll/۠ۙ۠;

    invoke-direct {p2, p1}, Ll/۠ۙ۠;-><init>(Landroid/content/Context;)V

    .line 1099
    iput-object p2, p0, Ll/ۘۙ۠;->᩶:Ll/۠ۙ۠;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1153
    iget-object v0, p0, Ll/ۘۙ۠;->᩶:Ll/۠ۙ۠;

    invoke-virtual {v0}, Ll/۠ۙ۠;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 1157
    :cond_0
    iget-object v1, p0, Ll/ۘۙ۠;->ۙ:Ll/ᩴۙ۠;

    invoke-virtual {v1}, Ll/ᩴۙ۠;->ᩳ()Landroid/widget/ImageView;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 1158
    invoke-virtual {v0}, Ll/۠ۙ۠;->֫()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 1160
    invoke-virtual {v0}, Ll/۠ۙ۠;->ܽ()I

    move-result v3

    .line 1161
    invoke-virtual {v0}, Ll/۠ۙ۠;->ᩳ()I

    move-result v0

    .line 1171
    invoke-static {v1}, Ll/ᩴۙ۠;->ۧ(Ll/ᩴۙ۠;)Landroid/graphics/Matrix;

    move-result-object v4

    iget v5, p0, Ll/ۘۙ۠;->᩸:I

    sub-int/2addr v5, v3

    int-to-float v5, v5

    iget v6, p0, Ll/ۘۙ۠;->᩹:I

    sub-int/2addr v6, v0

    int-to-float v6, v6

    invoke-virtual {v4, v5, v6}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 1172
    invoke-virtual {v1}, Ll/ᩴۙ۠;->ܽ()Landroid/graphics/Matrix;

    move-result-object v4

    invoke-static {v1, v4}, Ll/ᩴۙ۠;->֫(Ll/ᩴۙ۠;Landroid/graphics/Matrix;)V

    .line 1174
    iput v3, p0, Ll/ۘۙ۠;->᩸:I

    .line 1175
    iput v0, p0, Ll/ۘۙ۠;->᩹:I

    .line 38
    invoke-virtual {v2, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫()V
    .locals 1

    .line 1106
    iget-object v0, p0, Ll/ۘۙ۠;->᩶:Ll/۠ۙ۠;

    invoke-virtual {v0}, Ll/۠ۙ۠;->ۧ()V

    return-void
.end method

.method public final ֫(IIII)V
    .locals 11

    .line 1111
    iget-object v0, p0, Ll/ۘۙ۠;->ۙ:Ll/ᩴۙ۠;

    invoke-virtual {v0}, Ll/ᩴۙ۠;->ۧ()Landroid/graphics/RectF;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_2

    .line 1116
    :cond_0
    iget v1, v0, Landroid/graphics/RectF;->left:F

    neg-float v1, v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v3

    int-to-float p1, p1

    .line 1119
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v1

    cmpg-float v1, p1, v1

    if-gez v1, :cond_1

    .line 1121
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v1

    sub-float/2addr v1, p1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result p1

    const/4 v1, 0x0

    move v8, p1

    const/4 v7, 0x0

    goto :goto_0

    :cond_1
    move v7, v3

    move v8, v7

    .line 1126
    :goto_0
    iget p1, v0, Landroid/graphics/RectF;->top:F

    neg-float p1, p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result v4

    int-to-float p1, p2

    .line 1127
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result p2

    cmpg-float p2, p1, p2

    if-gez p2, :cond_2

    .line 1129
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result p2

    sub-float/2addr p2, p1

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p1

    const/4 p2, 0x0

    move v10, p1

    const/4 v9, 0x0

    goto :goto_1

    :cond_2
    move v9, v4

    move v10, v9

    .line 1134
    :goto_1
    iput v3, p0, Ll/ۘۙ۠;->᩸:I

    .line 1135
    iput v4, p0, Ll/ۘۙ۠;->᩹:I

    if-ne v3, v8, :cond_4

    if-eq v4, v10, :cond_3

    goto :goto_3

    :cond_3
    :goto_2
    return-void

    .line 1146
    :cond_4
    :goto_3
    iget-object v2, p0, Ll/ۘۙ۠;->᩶:Ll/۠ۙ۠;

    move v5, p3

    move v6, p4

    invoke-virtual/range {v2 .. v10}, Ll/۠ۙ۠;->֫(IIIIIIII)V

    return-void
.end method
