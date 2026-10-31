.class public final Ll/ۗܺ;
.super Ljava/lang/Object;
.source "J5NH"


# static fields
.field public static final ֫:Ljava/lang/reflect/Field;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x0

    .line 817
    :try_start_0
    const-class v1, Landroid/widget/AbsListView;

    const-string v2, "mIsChildViewEnabled"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    .line 818
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 823
    :catch_0
    sput-object v0, Ll/ۗܺ;->֫:Ljava/lang/reflect/Field;

    return-void
.end method

.method public static ֫(Landroid/widget/AbsListView;Z)V
    .locals 1

    .line 843
    sget-object v0, Ll/ۗܺ;->֫:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_0

    .line 845
    :try_start_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public static ֫(Landroid/widget/AbsListView;)Z
    .locals 1

    .line 831
    sget-object v0, Ll/ۗܺ;->֫:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_0

    .line 833
    :try_start_0
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    :cond_0
    const/4 p0, 0x0

    return p0
.end method
