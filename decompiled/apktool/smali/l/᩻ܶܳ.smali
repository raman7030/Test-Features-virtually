.class public final synthetic Ll/᩻ܶܳ;
.super Ljava/lang/Object;
.source "E142"

# interfaces
.implements Ll/᩹֡ۘ;


# instance fields
.field public final synthetic ᩸:Landroid/view/View;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(ILandroid/view/View;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/᩻ܶܳ;->᩸:Landroid/view/View;

    iput p1, p0, Ll/᩻ܶܳ;->᩹:I

    return-void
.end method


# virtual methods
.method public final ֫(FLjava/lang/Float;Ljava/lang/Float;)Ljava/lang/Object;
    .locals 5

    const p2, 0x3fb33333    # 1.4f

    mul-float p1, p1, p2

    .line 44
    iget-object p2, p0, Ll/᩻ܶܳ;->᩸:Landroid/view/View;

    const/high16 p3, 0x40a00000    # 5.0f

    const v0, 0x3e4ccccd    # 0.2f

    cmpg-float v1, p1, v0

    if-gtz v1, :cond_0

    mul-float p1, p1, p3

    .line 45
    invoke-virtual {p2, p1}, Landroid/view/View;->setAlpha(F)V

    const/4 p1, 0x0

    .line 46
    invoke-virtual {p2, p1}, Landroid/view/View;->setTranslationY(F)V

    goto :goto_0

    .line 47
    :cond_0
    iget v1, p0, Ll/᩻ܶܳ;->᩹:I

    const/high16 v2, 0x3f800000    # 1.0f

    const v3, 0x3f99999a    # 1.2f

    cmpg-float v4, p1, v3

    if-gtz v4, :cond_1

    sub-float/2addr p1, v0

    .line 49
    invoke-virtual {p2, v2}, Landroid/view/View;->setAlpha(F)V

    neg-int p3, v1

    int-to-float p3, p3

    mul-float p3, p3, p1

    .line 50
    invoke-virtual {p2, p3}, Landroid/view/View;->setTranslationY(F)V

    goto :goto_0

    :cond_1
    sub-float/2addr p1, v3

    mul-float p1, p1, p3

    sub-float/2addr v2, p1

    .line 53
    invoke-virtual {p2, v2}, Landroid/view/View;->setAlpha(F)V

    neg-int p1, v1

    int-to-float p1, p1

    .line 54
    invoke-virtual {p2, p1}, Landroid/view/View;->setTranslationY(F)V

    :goto_0
    const/4 p1, 0x0

    .line 0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
