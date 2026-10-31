.class public final Ll/ܳܰ;
.super Ljava/lang/Object;
.source "M4Z7"


# static fields
.field public static ֫:Ljava/lang/reflect/Field;

.field public static ۧ:Z

.field public static ܽ:Ljava/lang/reflect/Field;

.field public static ᩳ:Ljava/lang/reflect/Field;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 2131
    :try_start_0
    const-class v0, Landroid/view/View;

    const-string v1, "mAttachInfo"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, Ll/ܳܰ;->ᩳ:Ljava/lang/reflect/Field;

    const/4 v1, 0x1

    .line 2132
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const-string v0, "android.view.View$AttachInfo"

    .line 2133
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v2, "mStableInsets"

    .line 2134
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    sput-object v2, Ll/ܳܰ;->ܽ:Ljava/lang/reflect/Field;

    .line 2135
    invoke-virtual {v2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const-string v2, "mContentInsets"

    .line 2136
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, Ll/ܳܰ;->֫:Ljava/lang/reflect/Field;

    .line 2137
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 2138
    sput-boolean v1, Ll/ܳܰ;->ۧ:Z
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 2140
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    return-void
.end method

.method public static ֫(Landroid/view/View;)Ll/᩸ܰ;
    .locals 7

    .line 2148
    sget-boolean v0, Ll/ܳܰ;->ۧ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2152
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    .line 2154
    :try_start_0
    sget-object v2, Ll/ܳܰ;->ᩳ:Ljava/lang/reflect/Field;

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2156
    sget-object v2, Ll/ܳܰ;->ܽ:Ljava/lang/reflect/Field;

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Rect;

    .line 2157
    sget-object v3, Ll/ܳܰ;->֫:Ljava/lang/reflect/Field;

    invoke-virtual {v3, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    if-eqz v2, :cond_1

    if-eqz v0, :cond_1

    .line 2159
    new-instance v3, Ll/᩻ܰ;

    invoke-direct {v3}, Ll/᩻ܰ;-><init>()V

    .line 78
    iget v4, v2, Landroid/graphics/Rect;->left:I

    iget v5, v2, Landroid/graphics/Rect;->top:I

    iget v6, v2, Landroid/graphics/Rect;->right:I

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    invoke-static {v4, v5, v6, v2}, Ll/ۧ۬;->֫(IIII)Ll/ۧ۬;

    move-result-object v2

    .line 2160
    invoke-virtual {v3, v2}, Ll/᩻ܰ;->֫(Ll/ۧ۬;)V

    .line 78
    iget v2, v0, Landroid/graphics/Rect;->left:I

    iget v4, v0, Landroid/graphics/Rect;->top:I

    iget v5, v0, Landroid/graphics/Rect;->right:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    invoke-static {v2, v4, v5, v0}, Ll/ۧ۬;->֫(IIII)Ll/ۧ۬;

    move-result-object v0

    .line 2161
    invoke-virtual {v3, v0}, Ll/᩻ܰ;->ۧ(Ll/ۧ۬;)V

    .line 2162
    invoke-virtual {v3}, Ll/᩻ܰ;->֫()Ll/᩸ܰ;

    move-result-object v0

    .line 2166
    invoke-virtual {v0, v0}, Ll/᩸ܰ;->֫(Ll/᩸ܰ;)V

    .line 2167
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/᩸ܰ;->֫(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    .line 2172
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    :cond_1
    :goto_0
    return-object v1
.end method
