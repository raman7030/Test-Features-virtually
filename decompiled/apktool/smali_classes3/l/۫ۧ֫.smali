.class public final Ll/۫ۧ֫;
.super Ljava/lang/Object;
.source "71JX"


# static fields
.field public static final ֫:Ljava/lang/reflect/Field;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 15
    :try_start_0
    const-class v0, Ll/۬ۧ֫;

    const-string v1, "\u06d6\u05ab"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, Ll/۫ۧ֫;->֫:Ljava/lang/reflect/Field;

    const/4 v1, 0x1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 18
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static ֫(Ll/۬ۧ֫;Landroid/view/View;)F
    .locals 0

    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 978
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Ll/ܶۧ֫;

    iget p0, p0, Ll/ܶۧ֫;->ܽ:F

    return p0
.end method

.method public static ֫(Ll/۬ۧ֫;I)Landroid/view/View;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Ll/۬ۧ֫;->ۧ(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/۬ۧ֫;Landroid/view/View;F)V
    .locals 1

    .line 50
    invoke-virtual {p0, p2, p1}, Ll/۬ۧ֫;->֫(FLandroid/view/View;)V

    .line 51
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ll/ܶۧ֫;

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p2, v0

    if-nez v0, :cond_0

    .line 55
    iget v0, p1, Ll/ܶۧ֫;->ᩳ:I

    or-int/lit8 v0, v0, 0x1

    and-int/lit8 v0, v0, -0x3

    iput v0, p1, Ll/ܶۧ֫;->ᩳ:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    cmpl-float v0, p2, v0

    if-nez v0, :cond_1

    .line 57
    iget v0, p1, Ll/ܶۧ֫;->ᩳ:I

    and-int/lit8 v0, v0, -0x4

    iput v0, p1, Ll/ܶۧ֫;->ᩳ:I

    goto :goto_0

    .line 59
    :cond_1
    iget v0, p1, Ll/ܶۧ֫;->ᩳ:I

    or-int/lit8 v0, v0, 0x2

    and-int/lit8 v0, v0, -0x2

    iput v0, p1, Ll/ܶۧ֫;->ᩳ:I

    .line 62
    :goto_0
    :try_start_0
    sget-object p1, Ll/۫ۧ֫;->֫:Ljava/lang/reflect/Field;

    invoke-virtual {p1, p0, p2}, Ljava/lang/reflect/Field;->setFloat(Ljava/lang/Object;F)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void

    :catch_0
    move-exception p0

    .line 64
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static ֫(Ll/۬ۧ֫;)Z
    .locals 1

    const v0, 0x800003

    .line 27
    invoke-virtual {p0, v0}, Ll/۬ۧ֫;->ۧ(I)Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Ll/ܶۧ֫;

    .line 30
    iget p0, p0, Ll/ܶۧ֫;->ᩳ:I

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
