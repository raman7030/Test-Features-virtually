.class public final Ll/ۖۧܽ;
.super Ll/ܽ᩶᩵;
.source "PANA"

# interfaces
.implements Ll/֫᩹᩵;


# static fields
.field public static final ᩹:Ll/ۖۧܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 2
    new-instance v0, Ll/ۖۧܽ;

    const/4 v1, 0x0

    .line 0
    invoke-direct {v0, v1}, Ll/ܽ᩶᩵;-><init>(I)V

    sput-object v0, Ll/ۖۧܽ;->᩹:Ll/ۖۧܽ;

    return-void
.end method

.method public static ֫()Landroidx/window/extensions/layout/WindowLayoutComponent;
    .locals 3

    const-class v0, Ll/ۘۧܽ;

    .line 33
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 34
    sget-object v2, Ll/ۘۧܽ;->֫:Ll/ۘۧܽ;

    invoke-static {v2, v0}, Ll/ۘۧܽ;->֫(Ll/ۘۧܽ;Ljava/lang/ClassLoader;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 36
    :try_start_0
    invoke-static {}, Landroidx/window/extensions/WindowExtensionsProvider;->getWindowExtensions()Landroidx/window/extensions/WindowExtensions;

    move-result-object v0

    invoke-interface {v0}, Landroidx/window/extensions/WindowExtensions;->getWindowLayoutComponent()Landroidx/window/extensions/layout/WindowLayoutComponent;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 38
    :catch_0
    move-object v0, v1

    check-cast v0, Landroidx/window/extensions/layout/WindowLayoutComponent;

    return-object v1

    .line 41
    :cond_0
    move-object v0, v1

    check-cast v0, Landroidx/window/extensions/layout/WindowLayoutComponent;

    return-object v1
.end method


# virtual methods
.method public final bridge synthetic ֫()Ljava/lang/Object;
    .locals 1

    .line 32
    invoke-static {}, Ll/ۖۧܽ;->֫()Landroidx/window/extensions/layout/WindowLayoutComponent;

    move-result-object v0

    return-object v0
.end method
