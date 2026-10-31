.class public final synthetic Ll/۠᩻ᩳ;
.super Ljava/lang/Object;
.source "K5R1"

# interfaces
.implements Ll/֨ۡ֫;


# instance fields
.field public final synthetic ۙ:Landroid/view/MenuItem;

.field public final synthetic ᩶:Landroid/view/MenuItem;

.field public final synthetic ᩸:Landroid/view/MenuItem;

.field public final synthetic ᩹:Landroid/view/MenuItem;


# direct methods
.method public synthetic constructor <init>(Landroid/view/MenuItem;Landroid/view/MenuItem;Landroid/view/MenuItem;Landroid/view/MenuItem;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠᩻ᩳ;->᩸:Landroid/view/MenuItem;

    iput-object p2, p0, Ll/۠᩻ᩳ;->᩹:Landroid/view/MenuItem;

    iput-object p3, p0, Ll/۠᩻ᩳ;->᩶:Landroid/view/MenuItem;

    iput-object p4, p0, Ll/۠᩻ᩳ;->ۙ:Landroid/view/MenuItem;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 4

    .line 2
    check-cast p1, Ll/ۙۜᩳ;

    .line 4
    sget v0, Ll/ۜۜᩳ;->᩷ۧ:I

    .line 974
    sget-object v0, Ll/ۙۜᩳ;->ۨ:Ll/ۙۜᩳ;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Ll/۠᩻ᩳ;->᩸:Landroid/view/MenuItem;

    invoke-interface {v3, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    if-eq p1, v0, :cond_2

    .line 975
    sget-object v0, Ll/ۙۜᩳ;->᩹:Ll/ۙۜᩳ;

    if-eq p1, v0, :cond_2

    sget-object v0, Ll/ۙۜᩳ;->᩶:Ll/ۙۜᩳ;

    if-eq p1, v0, :cond_2

    sget-object v0, Ll/ۙۜᩳ;->ۛ:Ll/ۙۜᩳ;

    if-eq p1, v0, :cond_2

    sget-object v0, Ll/ۙۜᩳ;->۫:Ll/ۙۜᩳ;

    if-ne p1, v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v0, 0x1

    :goto_2
    iget-object v2, p0, Ll/۠᩻ᩳ;->᩹:Landroid/view/MenuItem;

    invoke-interface {v2, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 977
    sget-object v0, Ll/ۙۜᩳ;->᩺:Ll/ۙۜᩳ;

    if-eq p1, v0, :cond_4

    sget-object v2, Ll/ۙۜᩳ;->᩹:Ll/ۙۜᩳ;

    if-eq p1, v2, :cond_4

    sget-object v2, Ll/ۙۜᩳ;->᩶:Ll/ۙۜᩳ;

    if-ne p1, v2, :cond_3

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    goto :goto_4

    :cond_4
    :goto_3
    const/4 v2, 0x1

    :goto_4
    iget-object v3, p0, Ll/۠᩻ᩳ;->᩶:Landroid/view/MenuItem;

    invoke-interface {v3, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    if-ne p1, v0, :cond_5

    const/4 v1, 0x1

    .line 978
    :cond_5
    iget-object p1, p0, Ll/۠᩻ᩳ;->ۙ:Landroid/view/MenuItem;

    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    return-void
.end method
