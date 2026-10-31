.class public final synthetic Ll/ۘᩴܳ;
.super Ljava/lang/Object;
.source "715M"

# interfaces
.implements Ll/ۛᩴܳ;
.implements Ll/ܶۖ;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Object;

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۘᩴܳ;->᩸:Ljava/lang/Object;

    iput-object p2, p0, Ll/ۘᩴܳ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ۘᩴܳ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/᩸ܰ᩷;

    iget-object v1, p0, Ll/ۘᩴܳ;->᩹:Ljava/lang/Object;

    check-cast v1, Ll/ܽ᩻ۡ;

    invoke-static {v0, v1, p1}, Ll/᩸ܰ᩷;->֫(Ll/᩸ܰ᩷;Ll/ܽ᩻ۡ;Landroid/view/MenuItem;)V

    const/4 p1, 0x1

    return p1
.end method

.method public ֫(Ljava/lang/String;Ll/ܿᩴܳ;)V
    .locals 5

    .line 2
    iget-object v0, p0, Ll/ۘᩴܳ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۢۘܳ;

    .line 6
    iget-object v1, p0, Ll/ۘᩴܳ;->᩹:Ljava/lang/Object;

    .line 8
    check-cast v1, Lbin/mt/plus/Main;

    .line 114
    sget-object v2, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v3, "bookmark_swipe_pos_aware"

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 115
    invoke-virtual {v1}, Lbin/mt/plus/Main;->۟()Ll/᩵᩷ۡ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩵᩷ۡ;->ܿ()Z

    move-result v2

    invoke-virtual {v0, v2}, Ll/ۢۘܳ;->ۧ(Z)V

    :cond_0
    if-nez p2, :cond_1

    .line 118
    invoke-virtual {v0}, Ll/ۢۘܳ;->ܿ()V

    new-array p2, v4, [Ljava/lang/String;

    .line 119
    invoke-static {p1, p2}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 120
    invoke-virtual {v0}, Ll/ۢۘܳ;->ۜ()Ll/ܽۢܳ;

    move-result-object p2

    .line 121
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    .line 122
    new-instance v1, Ll/᩵ᩴܳ;

    invoke-direct {v1, v0, p2, p1}, Ll/᩵ᩴܳ;-><init>(ZLl/ܽۢܳ;Ll/ܶ᩵ܿ;)V

    const-wide/16 p1, 0xb4

    invoke-static {v1, p1, p2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    return-void

    .line 127
    :cond_1
    invoke-virtual {p2}, Ll/ܿᩴܳ;->ۧ()I

    move-result v2

    invoke-virtual {p2}, Ll/ܿᩴܳ;->ܽ()Z

    move-result p2

    invoke-virtual {v1, v2, p1, p2}, Lbin/mt/plus/Main;->ۧ(ILjava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 128
    invoke-virtual {v0}, Ll/ۢۘܳ;->ܿ()V

    :cond_2
    return-void
.end method
