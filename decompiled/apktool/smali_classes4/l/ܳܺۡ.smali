.class public final Ll/ܳܺۡ;
.super Ljava/lang/Object;
.source "H9SC"


# static fields
.field public static final ֫:Ljava/lang/reflect/Field;

.field public static final ۧ:Ljava/lang/reflect/Field;

.field public static final ܽ:Ljava/lang/reflect/Field;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 19
    const-class v0, Ll/ۢᩴ;

    :try_start_0
    const-string v1, "mTitleTextView"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, Ll/ܳܺۡ;->ܽ:Ljava/lang/reflect/Field;

    const/4 v2, 0x1

    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const-string v1, "mSubtitleTextView"

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, Ll/ܳܺۡ;->ۧ:Ljava/lang/reflect/Field;

    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const-string v1, "mMenuView"

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const-string v1, "mNavButtonView"

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, Ll/ܳܺۡ;->֫:Ljava/lang/reflect/Field;

    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 28
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static ֫(Ll/ۢᩴ;)Landroid/widget/ImageButton;
    .locals 1

    .line 58
    :try_start_0
    sget-object v0, Ll/ܳܺۡ;->֫:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageButton;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 60
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static ۧ(Ll/ۢᩴ;)Landroid/widget/TextView;
    .locals 1

    .line 42
    :try_start_0
    sget-object v0, Ll/ܳܺۡ;->ۧ:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 44
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static ܽ(Ll/ۢᩴ;)Landroid/widget/TextView;
    .locals 1

    .line 34
    :try_start_0
    sget-object v0, Ll/ܳܺۡ;->ܽ:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 36
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method
