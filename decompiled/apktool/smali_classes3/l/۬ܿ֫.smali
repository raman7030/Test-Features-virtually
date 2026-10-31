.class public final Ll/۬ܿ֫;
.super Ljava/lang/Object;
.source "BB1T"

# interfaces
.implements Landroid/text/method/TransformationMethod;


# instance fields
.field public final ᩸:Landroid/text/method/TransformationMethod;


# direct methods
.method public constructor <init>(Landroid/text/method/TransformationMethod;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Ll/۬ܿ֫;->᩸:Landroid/text/method/TransformationMethod;

    return-void
.end method


# virtual methods
.method public final getTransformation(Ljava/lang/CharSequence;Landroid/view/View;)Ljava/lang/CharSequence;
    .locals 2

    .line 45
    invoke-virtual {p2}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    .line 49
    :cond_0
    iget-object v0, p0, Ll/۬ܿ֫;->᩸:Landroid/text/method/TransformationMethod;

    if-eqz v0, :cond_1

    .line 50
    invoke-interface {v0, p1, p2}, Landroid/text/method/TransformationMethod;->getTransformation(Ljava/lang/CharSequence;Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object p1

    :cond_1
    if-eqz p1, :cond_3

    .line 54
    invoke-static {}, Ll/ۜᩳ֫;->ᩳ()Ll/ۜᩳ֫;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۜᩳ֫;->֫()I

    move-result p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    goto :goto_0

    .line 56
    :cond_2
    invoke-static {}, Ll/ۜᩳ֫;->ᩳ()Ll/ۜᩳ֫;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 984
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    .line 1057
    invoke-virtual {p2, v1, v0, p1}, Ll/ۜᩳ֫;->֫(IILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    :cond_3
    :goto_0
    return-object p1
.end method

.method public final onFocusChanged(Landroid/view/View;Ljava/lang/CharSequence;ZILandroid/graphics/Rect;)V
    .locals 6

    .line 70
    iget-object v0, p0, Ll/۬ܿ֫;->᩸:Landroid/text/method/TransformationMethod;

    if-eqz v0, :cond_0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    .line 71
    invoke-interface/range {v0 .. v5}, Landroid/text/method/TransformationMethod;->onFocusChanged(Landroid/view/View;Ljava/lang/CharSequence;ZILandroid/graphics/Rect;)V

    :cond_0
    return-void
.end method

.method public final ֫()Landroid/text/method/TransformationMethod;
    .locals 1

    .line 81
    iget-object v0, p0, Ll/۬ܿ֫;->᩸:Landroid/text/method/TransformationMethod;

    return-object v0
.end method
