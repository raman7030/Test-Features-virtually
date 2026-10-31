.class public final Ll/ܶ֨;
.super Ll/ۛ֨;
.source "V1D4"


# instance fields
.field public ۡ:Z


# virtual methods
.method public final ۧ(FJLandroid/view/View;Ll/ܶ֡;)Z
    .locals 6

    .line 394
    instance-of v0, p4, Ll/ۤۚ;

    if-eqz v0, :cond_0

    .line 395
    move-object v0, p4

    check-cast v0, Ll/ۤۚ;

    invoke-virtual/range {p0 .. p5}, Ll/ۛ֨;->֫(FJLandroid/view/View;Ll/ܶ֡;)F

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤۚ;->ۧ(F)V

    goto :goto_1

    .line 397
    :cond_0
    iget-boolean v0, p0, Ll/ܶ֨;->ۡ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x1

    .line 402
    :try_start_0
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v3, "setProgress"

    new-array v4, v0, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    aput-object v5, v4, v1

    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 404
    :catch_0
    iput-boolean v0, p0, Ll/ܶ֨;->ۡ:Z

    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    .line 408
    :try_start_1
    invoke-virtual/range {p0 .. p5}, Ll/ۛ֨;->֫(FJLandroid/view/View;Ll/ܶ֡;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    new-array p2, v0, [Ljava/lang/Object;

    aput-object p1, p2, v1

    invoke-virtual {v2, p4, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    .line 416
    :catch_1
    :cond_2
    :goto_1
    iget-boolean p1, p0, Ll/ۛ֨;->ܿ:Z

    return p1
.end method
