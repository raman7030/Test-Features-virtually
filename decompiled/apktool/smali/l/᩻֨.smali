.class public final Ll/᩻֨;
.super Ll/᩵֨;
.source "H1CY"


# instance fields
.field public ܳ:Z


# virtual methods
.method public final ֫(FLandroid/view/View;)V
    .locals 6

    .line 306
    instance-of v0, p2, Ll/ۤۚ;

    if-eqz v0, :cond_0

    .line 307
    check-cast p2, Ll/ۤۚ;

    invoke-virtual {p0, p1}, Ll/᩵֨;->֫(F)F

    move-result p1

    invoke-virtual {p2, p1}, Ll/ۤۚ;->ۧ(F)V

    return-void

    .line 309
    :cond_0
    iget-boolean v0, p0, Ll/᩻֨;->ܳ:Z

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 314
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v3, "setProgress"

    new-array v4, v1, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    aput-object v5, v4, v0

    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 316
    :catch_0
    iput-boolean v1, p0, Ll/᩻֨;->ܳ:Z

    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    .line 320
    :try_start_1
    invoke-virtual {p0, p1}, Ll/᩵֨;->֫(F)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v0

    invoke-virtual {v2, p2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_2
    :goto_1
    return-void
.end method
