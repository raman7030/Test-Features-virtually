.class public final Ll/֫᩶ۚ;
.super Ljava/lang/Object;
.source "M4HM"


# direct methods
.method public static ֫(Ll/ܶ᩶ۚ;)Ll/ܶ᩶ۚ;
    .locals 1

    :goto_0
    if-eqz p0, :cond_0

    .line 26
    instance-of v0, p0, Ll/᩸᩶ۚ;

    if-nez v0, :cond_0

    .line 27
    iget-object p0, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public static ֫(Ll/ܶ᩶ۚ;Ll/ۨۙۚ;)V
    .locals 2

    .line 86
    check-cast p0, Ll/᩸᩶ۚ;

    .line 78
    :try_start_0
    const-class v0, Ll/᩸᩶ۚ;

    const-string v1, "\u1a75\u05ab"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 80
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛ᩶ۚ;

    .line 82
    iget-object v0, v0, Ll/ۛ᩶ۚ;->ᩳ:Ll/ۜ᩶ۚ;

    .line 91
    invoke-virtual {p1, v0}, Ll/ۨۙۚ;->֫(Ll/ۜ᩶ۚ;)V

    .line 92
    invoke-static {p0}, Ll/֫᩶ۚ;->֫(Ll/᩸᩶ۚ;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static ֫(Ll/᩸᩶ۚ;)V
    .locals 6

    .line 42
    const-class v0, Ll/ۜ᩶ۚ;

    .line 78
    :try_start_0
    const-class v1, Ll/᩸᩶ۚ;

    const-string v2, "\u1a75\u05ab"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    const/4 v2, 0x1

    .line 79
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 80
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛ᩶ۚ;

    .line 82
    iget-object v1, v1, Ll/ۛ᩶ۚ;->ᩳ:Ll/ۜ᩶ۚ;

    const-string v3, "\u06e2"

    .line 44
    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    .line 45
    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 46
    invoke-virtual {v3, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩸᩶ۚ;

    const-string v5, "\u1a75"

    .line 48
    invoke-virtual {v0, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 49
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩸᩶ۚ;

    if-ne v4, p0, :cond_0

    const/4 v4, 0x0

    .line 54
    invoke-virtual {v3, v1, v4}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    if-ne v2, p0, :cond_2

    .line 56
    invoke-virtual {v0, v1, v4}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_0
    :goto_0
    if-eqz v4, :cond_2

    .line 60
    iget-object v3, v4, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-ne v3, p0, :cond_1

    .line 61
    iget-object v3, p0, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    iput-object v3, v4, Ll/ܶ᩶ۚ;->ۧ:Ll/ܶ᩶ۚ;

    if-ne v2, p0, :cond_2

    .line 63
    invoke-virtual {v0, v1, v4}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 67
    :cond_1
    move-object v4, v3

    check-cast v4, Ll/᩸᩶ۚ;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_2
    return-void
.end method

.method public static ۧ(Ll/ܶ᩶ۚ;)V
    .locals 0

    .line 33
    check-cast p0, Ll/᩸᩶ۚ;

    .line 34
    invoke-virtual {p0}, Ll/᩸᩶ۚ;->ᩳ()I

    return-void
.end method
