.class public final Ll/ۘۨۡ;
.super Ljava/lang/Object;
.source "PAIZ"


# static fields
.field public static final ֫:Ljava/lang/Object;

.field public static final ۧ:Ljava/lang/Object;

.field public static final ܽ:Ljava/lang/Object;

.field public static final ᩳ:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 10
    sget-object v0, Ll/᩷۠᩵;->᩶:Ll/᩷۠᩵;

    new-instance v1, Ll/ۢۨۡ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v1}, Ll/ܳ۠᩵;->֫(Ll/᩷۠᩵;Ll/֫᩹᩵;)Ll/ܿ۠᩵;

    move-result-object v1

    sput-object v1, Ll/ۘۨۡ;->ܽ:Ljava/lang/Object;

    .line 21
    new-instance v1, Ll/ۡۨۡ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v1}, Ll/ܳ۠᩵;->֫(Ll/᩷۠᩵;Ll/֫᩹᩵;)Ll/ܿ۠᩵;

    move-result-object v1

    sput-object v1, Ll/ۘۨۡ;->ᩳ:Ljava/lang/Object;

    .line 30
    new-instance v1, Ll/ܺۨۡ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v1}, Ll/ܳ۠᩵;->֫(Ll/᩷۠᩵;Ll/֫᩹᩵;)Ll/ܿ۠᩵;

    move-result-object v1

    sput-object v1, Ll/ۘۨۡ;->ۧ:Ljava/lang/Object;

    .line 37
    new-instance v1, Ll/ۖۨۡ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v1}, Ll/ܳ۠᩵;->֫(Ll/᩷۠᩵;Ll/֫᩹᩵;)Ll/ܿ۠᩵;

    return-void
.end method

.method public static ֫()Ljava/lang/Object;
    .locals 3

    .line 22
    invoke-static {}, Ll/ۘۨۡ;->ܿ()Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "getInstance"

    .line 25
    invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    return-object v1
.end method

.method public static ۧ()Ljava/lang/reflect/Field;
    .locals 2

    .line 31
    invoke-static {}, Ll/ۘۨۡ;->ܿ()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "mViews"

    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static ܽ()Ljava/lang/reflect/Field;
    .locals 2

    .line 38
    invoke-static {}, Ll/ۘۨۡ;->ܿ()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "mParams"

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static ܿ()Ljava/lang/Class;
    .locals 1

    .line 10
    sget-object v0, Ll/ۘۨۡ;->ܽ:Ljava/lang/Object;

    invoke-interface {v0}, Ll/ܿ۠᩵;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    return-object v0
.end method

.method public static final ᩳ()Ljava/util/ArrayList;
    .locals 2

    .line 21
    :try_start_0
    sget-object v0, Ll/ۘۨۡ;->ᩳ:Ljava/lang/Object;

    invoke-interface {v0}, Ll/ܿ۠᩵;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 30
    sget-object v1, Ll/ۘۨۡ;->ۧ:Ljava/lang/Object;

    invoke-interface {v1}, Ll/ܿ۠᩵;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Field;

    if-eqz v1, :cond_0

    .line 51
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type java.util.ArrayList<android.view.View>"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/ArrayList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    .line 57
    :catchall_0
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method
