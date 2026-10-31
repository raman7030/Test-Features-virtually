.class public final synthetic Ll/ۗ᩸ۡ;
.super Ljava/lang/Object;
.source "Z6W9"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩶:Ll/ۗܺ᩷;

.field public final synthetic ᩸:[Z

.field public final synthetic ᩹:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>([ZLandroid/view/View;Ll/ۗܺ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗ᩸ۡ;->᩸:[Z

    iput-object p2, p0, Ll/ۗ᩸ۡ;->᩹:Landroid/view/View;

    iput-object p3, p0, Ll/ۗ᩸ۡ;->᩶:Ll/ۗܺ᩷;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    .line 2
    check-cast p1, Ljava/lang/Boolean;

    .line 102
    invoke-static {}, Ll/ۛ᩸ۡ;->֫()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 129
    invoke-static {}, Ll/۬ۘۢ;->ۧ()Ljava/net/Inet4Address;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 104
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v3, p0, Ll/ۗ᩸ۡ;->᩸:[Z

    if-nez p1, :cond_1

    aget-boolean p1, v3, v2

    if-ne p1, v0, :cond_1

    return-void

    .line 107
    :cond_1
    aput-boolean v0, v3, v2

    if-eqz v0, :cond_2

    .line 108
    iget-object p1, p0, Ll/ۗ᩸ۡ;->᩶:Ll/ۗܺ᩷;

    invoke-static {p1, v1}, Ll/ۛ᩸ۡ;->֫(Landroid/content/Context;Z)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    const/16 v2, 0x8

    :goto_1
    iget-object p1, p0, Ll/ۗ᩸ۡ;->᩹:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
