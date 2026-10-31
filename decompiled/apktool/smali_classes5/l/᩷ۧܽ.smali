.class public final Ll/᩷ۧܽ;
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
    iput-object p1, p0, Ll/᩷ۧܽ;->᩹:Ljava/lang/ClassLoader;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ll/ܽ᩶᩵;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 6

    .line 79
    sget-object v0, Ll/ۘۧܽ;->֫:Ll/ۘۧܽ;

    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "androidx.window.extensions.layout.FoldingFeature"

    .line 138
    iget-object v2, p0, Ll/᩷ۧܽ;->᩹:Ljava/lang/ClassLoader;

    invoke-virtual {v2, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "getBounds"

    const/4 v3, 0x0

    .line 80
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const-string v4, "getType"

    .line 81
    invoke-virtual {v1, v4, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    const-string v5, "getState"

    .line 82
    invoke-virtual {v1, v5, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const-string v3, "getBoundsMethod"

    .line 83
    invoke-static {v2, v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Landroid/graphics/Rect;

    invoke-static {v3}, Ll/ۜ᩶᩵;->֫(Ljava/lang/Class;)Ll/ۛ᩹᩵;

    move-result-object v3

    invoke-static {v0, v2, v3}, Ll/ۘۧܽ;->֫(Ll/ۘۧܽ;Ljava/lang/reflect/Method;Ll/ۛ᩹᩵;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 120
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v2

    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "getTypeMethod"

    .line 85
    invoke-static {v4, v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v2}, Ll/ۜ᩶᩵;->֫(Ljava/lang/Class;)Ll/ۛ᩹᩵;

    move-result-object v3

    invoke-static {v0, v4, v3}, Ll/ۘۧܽ;->֫(Ll/ۘۧܽ;Ljava/lang/reflect/Method;Ll/ۛ᩹᩵;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 120
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v3

    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "getStateMethod"

    .line 87
    invoke-static {v1, v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Ll/ۜ᩶᩵;->֫(Ljava/lang/Class;)Ll/ۛ᩹᩵;

    move-result-object v2

    invoke-static {v0, v1, v2}, Ll/ۘۧܽ;->֫(Ll/ۘۧܽ;Ljava/lang/reflect/Method;Ll/ۛ᩹᩵;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 120
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 88
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
