.class public final Ll/ۘۧܽ;
.super Ljava/lang/Object;
.source "PANA"


# static fields
.field public static final ֫:Ll/ۘۧܽ;

.field public static final ۧ:Ll/ܿ۠᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 2
    new-instance v0, Ll/ۘۧܽ;

    .line 5
    invoke-direct {v0}, Ll/ۘۧܽ;-><init>()V

    .line 7
    sput-object v0, Ll/ۘۧܽ;->֫:Ll/ۘۧܽ;

    .line 32
    sget-object v0, Ll/ۖۧܽ;->᩹:Ll/ۖۧܽ;

    invoke-static {v0}, Ll/ܳ۠᩵;->֫(Ll/֫᩹᩵;)Ll/ܿ۠᩵;

    move-result-object v0

    sput-object v0, Ll/ۘۧܽ;->ۧ:Ll/ܿ۠᩵;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫()Landroidx/window/extensions/layout/WindowLayoutComponent;
    .locals 1

    .line 32
    sget-object v0, Ll/ۘۧܽ;->ۧ:Ll/ܿ۠᩵;

    invoke-interface {v0}, Ll/ܿ۠᩵;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/window/extensions/layout/WindowLayoutComponent;

    return-object v0
.end method

.method public static ֫(Ll/֫᩹᩵;)Z
    .locals 0

    .line 110
    :try_start_0
    invoke-interface {p0}, Ll/֫᩹᩵;->֫()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final ֫(Ll/ۘۧܽ;Ljava/lang/ClassLoader;)Z
    .locals 1

    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x18

    if-lt p0, v0, :cond_0

    .line 57
    new-instance p0, Ll/ܺۧܽ;

    invoke-direct {p0, p1}, Ll/ܺۧܽ;-><init>(Ljava/lang/ClassLoader;)V

    invoke-static {p0}, Ll/ۘۧܽ;->֫(Ll/֫᩹᩵;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 67
    new-instance p0, Ll/ۢۧܽ;

    invoke-direct {p0, p1}, Ll/ۢۧܽ;-><init>(Ljava/lang/ClassLoader;)V

    invoke-static {p0}, Ll/ۘۧܽ;->֫(Ll/֫᩹᩵;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 94
    new-instance p0, Ll/ۡۧܽ;

    invoke-direct {p0, p1}, Ll/ۡۧܽ;-><init>(Ljava/lang/ClassLoader;)V

    invoke-static {p0}, Ll/ۘۧܽ;->֫(Ll/֫᩹᩵;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 78
    new-instance p0, Ll/᩷ۧܽ;

    invoke-direct {p0, p1}, Ll/᩷ۧܽ;-><init>(Ljava/lang/ClassLoader;)V

    invoke-static {p0}, Ll/ۘۧܽ;->֫(Ll/֫᩹᩵;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final ֫(Ll/ۘۧܽ;Ljava/lang/reflect/Method;Ll/ۛ᩹᩵;)Z
    .locals 0

    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    invoke-virtual {p2}, Ll/ۛ᩹᩵;->֫()Ljava/lang/Class;

    move-result-object p0

    const-string p2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>"

    invoke-static {p0, p2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
