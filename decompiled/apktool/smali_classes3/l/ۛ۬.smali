.class public final Ll/ۛ۬;
.super Ll/ۤ۬;
.source "G4XY"


# static fields
.field public static ۤ:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 43
    invoke-direct {p0, p1}, Ll/ۤ۬;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 141
    sget-object p1, Ll/ۛ۬;->ۤ:Ljava/lang/reflect/Method;

    if-nez p1, :cond_0

    .line 143
    :try_start_0
    const-class p1, Landroid/graphics/drawable/Drawable;

    const-string v0, "isProjected"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    sput-object p1, Ll/ۛ۬;->ۤ:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public constructor <init>(Ll/ۨ۬;Landroid/content/res/Resources;)V
    .locals 1

    .line 52
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 53
    iput-object p1, p0, Ll/ۤ۬;->۬:Ll/ۨ۬;

    .line 74
    iget-object p1, p1, Ll/ۨ۬;->ۧ:Landroid/graphics/drawable/Drawable$ConstantState;

    if-eqz p1, :cond_0

    .line 75
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۤ۬;->֫(Landroid/graphics/drawable/Drawable;)V

    .line 141
    :cond_0
    sget-object p1, Ll/ۛ۬;->ۤ:Ljava/lang/reflect/Method;

    if-nez p1, :cond_1

    .line 143
    :try_start_0
    const-class p1, Landroid/graphics/drawable/Drawable;

    const-string p2, "isProjected"

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    sput-object p1, Ll/ۛ۬;->ۤ:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    return-void
.end method


# virtual methods
.method public final getDirtyBounds()Landroid/graphics/Rect;
    .locals 1

    .line 70
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getDirtyBounds()Landroid/graphics/Rect;

    move-result-object v0

    return-object v0
.end method

.method public final getOutline(Landroid/graphics/Outline;)V
    .locals 1

    .line 64
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->getOutline(Landroid/graphics/Outline;)V

    return-void
.end method

.method public final isProjected()Z
    .locals 3

    .line 129
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    sget-object v1, Ll/ۛ۬;->ۤ:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    .line 131
    :try_start_0
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final setHotspot(FF)V
    .locals 1

    .line 54
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setHotspot(FF)V

    return-void
.end method

.method public final setHotspotBounds(IIII)V
    .locals 1

    .line 59
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/drawable/Drawable;->setHotspotBounds(IIII)V

    return-void
.end method

.method public final setState([I)Z
    .locals 0

    .line 102
    invoke-super {p0, p1}, Ll/ۤ۬;->setState([I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 105
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final setTint(I)V
    .locals 1

    .line 84
    invoke-virtual {p0}, Ll/ۛ۬;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 85
    invoke-super {p0, p1}, Ll/ۤ۬;->setTint(I)V

    return-void

    .line 87
    :cond_0
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    return-void
.end method

.method public final setTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 75
    invoke-virtual {p0}, Ll/ۛ۬;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 76
    invoke-super {p0, p1}, Ll/ۤ۬;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void

    .line 78
    :cond_0
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public final setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 93
    invoke-virtual {p0}, Ll/ۛ۬;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 94
    invoke-super {p0, p1}, Ll/ۤ۬;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    return-void

    .line 96
    :cond_0
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public final ۧ()Z
    .locals 3

    .line 113
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    const/4 v2, 0x0

    if-ne v0, v1, :cond_2

    .line 114
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    .line 115
    instance-of v1, v0, Landroid/graphics/drawable/GradientDrawable;

    if-nez v1, :cond_1

    instance-of v1, v0, Landroid/graphics/drawable/DrawableContainer;

    if-nez v1, :cond_1

    instance-of v1, v0, Landroid/graphics/drawable/InsetDrawable;

    if-nez v1, :cond_1

    instance-of v0, v0, Landroid/graphics/drawable/RippleDrawable;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return v2

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_2
    return v2
.end method
