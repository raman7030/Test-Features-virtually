.class public final Ll/᩺ᩳۢ;
.super Ljava/lang/Object;
.source "71FU"


# instance fields
.field public ֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩸ۖ;Ljava/lang/String;Z)V
    .locals 6

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p2, p0, Ll/᩺ᩳۢ;->֫:Ljava/lang/String;

    .line 21
    invoke-static {p2}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1e

    invoke-static {v1, v0}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x2f

    const/16 v3, 0x2e

    .line 22
    invoke-virtual {p2, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 23
    invoke-static {v1, p2}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 24
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "L"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ";"

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const v1, 0x7f1205c2

    const/4 v4, 0x0

    if-eqz p3, :cond_0

    .line 27
    invoke-virtual {p1}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p1

    invoke-interface {p1, v4, v1, v4, v1}, Landroid/view/Menu;->addSubMenu(IIII)Landroid/view/SubMenu;

    move-result-object p1

    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p1}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p1

    .line 31
    :goto_0
    invoke-interface {p1, v1, v4, v4, v0}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_1

    const/4 p3, 0x1

    .line 33
    invoke-interface {p1, v1, p3, v4, v2}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 34
    :cond_1
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_2

    const/4 p3, 0x2

    .line 35
    invoke-interface {p1, v1, p3, v4, v3}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    :cond_2
    const/4 p3, 0x3

    .line 36
    invoke-interface {p1, v1, p3, v4, p2}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/view/MenuItem;)Z
    .locals 3

    .line 40
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const/4 v1, 0x1

    const v2, 0x7f1205c2

    if-ne v0, v2, :cond_0

    return v1

    .line 43
    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getGroupId()I

    move-result v0

    if-ne v0, v2, :cond_5

    .line 44
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    iget-object v0, p0, Ll/᩺ᩳۢ;->֫:Ljava/lang/String;

    if-eqz p1, :cond_4

    if-eq p1, v1, :cond_3

    const/4 v2, 0x2

    if-eq p1, v2, :cond_2

    const/4 v2, 0x3

    if-eq p1, v2, :cond_1

    goto :goto_0

    .line 55
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v2, "L"

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ";"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 52
    :cond_2
    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_3
    const/16 p1, 0x2f

    const/16 v2, 0x2e

    .line 49
    invoke-virtual {v0, p1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 46
    :cond_4
    invoke-static {v0}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/CharSequence;)V

    :goto_0
    return v1

    :cond_5
    const/4 p1, 0x0

    return p1
.end method
