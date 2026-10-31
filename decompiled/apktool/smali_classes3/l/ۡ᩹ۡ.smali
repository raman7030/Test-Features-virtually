.class public final Ll/ۡ᩹ۡ;
.super Ljava/lang/Object;
.source "Y6P1"


# instance fields
.field public final ֫:Ll/۟ۢ֫;


# direct methods
.method public constructor <init>(Ll/۟ۢ֫;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Ll/ۡ᩹ۡ;->֫:Ll/۟ۢ֫;

    return-void
.end method

.method public static ֫(Ll/۫ۨᩳ;)Ll/ۡ᩹ۡ;
    .locals 2

    .line 40
    invoke-static {p0}, Ll/ۛܺ֫;->֫(Landroid/view/View;)Ll/᩻ۡ֫;

    move-result-object v0

    if-nez v0, :cond_0

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Ll/ۚ۫ۡ;->֫(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p0

    .line 43
    instance-of v1, p0, Ll/᩻ۡ֫;

    if-eqz v1, :cond_0

    move-object v0, p0

    check-cast v0, Ll/᩻ۡ֫;

    .line 46
    :cond_0
    new-instance p0, Ll/ۡ᩹ۡ;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ll/᩻ۡ֫;->getLifecycle()Ll/۟ۢ֫;

    move-result-object v0

    :goto_0
    invoke-direct {p0, v0}, Ll/ۡ᩹ۡ;-><init>(Ll/۟ۢ֫;)V

    return-object p0
.end method

.method public static ֫(Ll/᩻ۡ֫;)Ll/ۡ᩹ۡ;
    .locals 1

    .line 34
    new-instance v0, Ll/ۡ᩹ۡ;

    invoke-interface {p0}, Ll/᩻ۡ֫;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ۡ᩹ۡ;-><init>(Ll/۟ۢ֫;)V

    return-object v0
.end method


# virtual methods
.method public final ֫()Ll/۟ۢ֫;
    .locals 1

    .line 28
    iget-object v0, p0, Ll/ۡ᩹ۡ;->֫:Ll/۟ۢ֫;

    return-object v0
.end method

.method public final ۧ()Z
    .locals 2

    .line 52
    iget-object v0, p0, Ll/ۡ᩹ۡ;->֫:Ll/۟ۢ֫;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v0

    sget-object v1, Ll/ܰۢ֫;->᩶:Ll/ܰۢ֫;

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
