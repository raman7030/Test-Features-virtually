.class public final Ll/ۡۧܽ;
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
    iput-object p1, p0, Ll/ۡۧܽ;->᩹:Ljava/lang/ClassLoader;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ll/ܽ᩶᩵;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 6

    .line 95
    sget-object v0, Ll/ۘۧܽ;->֫:Ll/ۘۧܽ;

    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "androidx.window.extensions.layout.WindowLayoutComponent"

    .line 141
    iget-object v1, p0, Ll/ۡۧܽ;->᩹:Ljava/lang/ClassLoader;

    invoke-virtual {v1, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    .line 99
    const-class v3, Landroid/app/Activity;

    aput-object v3, v1, v2

    const/4 v3, 0x1

    const-class v4, Ljava/util/function/Consumer;

    aput-object v4, v1, v3

    const-string v5, "addWindowLayoutInfoListener"

    .line 97
    invoke-virtual {v0, v5, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    new-array v3, v3, [Ljava/lang/Class;

    aput-object v4, v3, v2

    const-string v4, "removeWindowLayoutInfoListener"

    .line 103
    invoke-virtual {v0, v4, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const-string v3, "addListenerMethod"

    .line 104
    invoke-static {v1, v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v1

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "removeListenerMethod"

    .line 104
    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    .line 104
    :cond_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
