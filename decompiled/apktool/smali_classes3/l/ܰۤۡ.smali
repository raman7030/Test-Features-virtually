.class public final Ll/ܰۤۡ;
.super Ljava/lang/Object;
.source "IB2G"


# static fields
.field public static ֫:Ljava/util/ArrayList;

.field public static ۧ:Landroid/view/inputmethod/InputMethodManager;


# direct methods
.method public static ֫()Landroid/view/inputmethod/InputMethodManager;
    .locals 6

    .line 22
    sget-object v0, Ll/ܰۤۡ;->ۧ:Landroid/view/inputmethod/InputMethodManager;

    if-nez v0, :cond_1

    .line 23
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    sput-object v0, Ll/ܰۤۡ;->ۧ:Landroid/view/inputmethod/InputMethodManager;

    if-eqz v0, :cond_1

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const-string v2, "mServedView"

    const-string v3, "mNextServedView"

    const-string v4, "mCurRootView"

    .line 26
    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    move-result-object v2

    .line 27
    sget-object v3, Ll/ܰۤۡ;->ۧ:Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_0

    .line 28
    aget-object v5, v2, v4

    .line 30
    :try_start_0
    invoke-virtual {v3, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 34
    :cond_0
    sput-object v0, Ll/ܰۤۡ;->֫:Ljava/util/ArrayList;

    .line 37
    :cond_1
    sget-object v0, Ll/ܰۤۡ;->ۧ:Landroid/view/inputmethod/InputMethodManager;

    return-object v0
.end method

.method public static ֫(Ll/ۗܺ᩷;)V
    .locals 5

    .line 41
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    goto :goto_1

    .line 44
    :cond_0
    invoke-static {p0}, Ll/ۚ۫ۡ;->֫(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p0

    if-nez p0, :cond_1

    goto :goto_1

    .line 48
    :cond_1
    invoke-static {}, Ll/ܰۤۡ;->֫()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    .line 51
    :cond_2
    sget-object v1, Ll/ܰۤۡ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Field;

    .line 53
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    move-result v3

    if-nez v3, :cond_4

    const/4 v3, 0x1

    .line 54
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 56
    :cond_4
    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 57
    instance-of v4, v3, Landroid/view/View;

    if-eqz v4, :cond_3

    .line 58
    check-cast v3, Landroid/view/View;

    .line 59
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Ll/ۚ۫ۡ;->֫(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v3

    if-ne v3, p0, :cond_3

    const/4 v3, 0x0

    .line 60
    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    :cond_5
    :goto_1
    return-void
.end method

.method public static ֫(Ll/۫ۨᩳ;)V
    .locals 5

    .line 73
    invoke-static {}, Ll/ܰۤۡ;->֫()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 76
    :cond_0
    sget-object v1, Ll/ܰۤۡ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Field;

    .line 78
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    move-result v3

    if-nez v3, :cond_2

    const/4 v3, 0x1

    .line 79
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 81
    :cond_2
    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 82
    instance-of v4, v3, Landroid/view/View;

    if-eqz v4, :cond_1

    .line 83
    check-cast v3, Landroid/view/View;

    if-ne v3, p0, :cond_1

    const/4 v3, 0x0

    .line 85
    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method
