.class public final Ll/ܺۧܽ;
.super Ll/ܽ᩶᩵;
.source "PANA"

# interfaces
.implements Ll/֫᩹᩵;


# instance fields
.field public final synthetic ᩹:Ljava/lang/ClassLoader;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܺۧܽ;->᩹:Ljava/lang/ClassLoader;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ll/ܽ᩶᩵;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 4

    .line 58
    sget-object v0, Ll/ۘۧܽ;->֫:Ll/ۘۧܽ;

    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "androidx.window.extensions.WindowExtensionsProvider"

    .line 132
    iget-object v1, p0, Ll/ܺۧܽ;->᩹:Ljava/lang/ClassLoader;

    invoke-virtual {v1, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v2, "getWindowExtensions"

    const/4 v3, 0x0

    .line 59
    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const-string v2, "androidx.window.extensions.WindowExtensions"

    .line 135
    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "getWindowExtensionsMethod"

    .line 61
    invoke-static {v0, v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "windowExtensionsClass"

    invoke-static {v1, v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 120
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 62
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
