.class public final Ll/ۢۢ᩷;
.super Ljava/lang/Object;
.source "A7I8"

# interfaces
.implements Lbin/mt/plugin/api/ui/menu/PluginPopupMenu;


# instance fields
.field public final ֫:Ll/᩻ۢ᩷;

.field public final ۧ:Ll/᩸ۖ;


# direct methods
.method public constructor <init>(Lbin/mt/plugin/api/PluginContext;Landroid/content/Context;Lbin/mt/plugin/api/ui/PluginView;)V
    .locals 2

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Ll/᩸ۖ;

    check-cast p3, Ll/۟ۜ᩷;

    invoke-virtual {p3}, Ll/۟ۜ᩷;->֫()Landroid/view/View;

    move-result-object p3

    const/4 v1, 0x0

    .line 68
    invoke-direct {v0, p2, p3, v1}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 21
    iput-object v0, p0, Ll/ۢۢ᩷;->ۧ:Ll/᩸ۖ;

    .line 22
    new-instance p2, Ll/᩻ۢ᩷;

    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p3

    .line 28
    new-instance v1, Ll/۠ᩴᩴ;

    invoke-direct {v1}, Ll/۠ᩴᩴ;-><init>()V

    invoke-direct {p2, p1, p3, v1}, Ll/᩻ۢ᩷;-><init>(Lbin/mt/plugin/api/PluginContext;Ll/᩺۬;Ll/۫ᩴᩴ;)V

    .line 22
    iput-object p2, p0, Ll/ۢۢ᩷;->֫:Ll/᩻ۢ᩷;

    .line 23
    invoke-virtual {v0}, Ll/᩸ۖ;->ᩳ()V

    return-void
.end method

.method public static synthetic ֫(Ll/ۢۢ᩷;Lbin/mt/plugin/api/ui/menu/PluginMenu$OnMenuItemClickListener;Landroid/view/MenuItem;)Z
    .locals 0

    .line 58
    iget-object p0, p0, Ll/ۢۢ᩷;->֫:Ll/᩻ۢ᩷;

    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result p2

    invoke-virtual {p0, p2}, Ll/᩻ۢ᩷;->֫(I)Ll/ۜۢ᩷;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 60
    invoke-interface {p1, p0}, Lbin/mt/plugin/api/ui/menu/PluginMenu$OnMenuItemClickListener;->onMenuItemClick(Lbin/mt/plugin/api/ui/menu/PluginMenuItem;)Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final dismiss()V
    .locals 1

    .line 49
    iget-object v0, p0, Ll/ۢۢ᩷;->ۧ:Ll/᩸ۖ;

    invoke-virtual {v0}, Ll/᩸ۖ;->֫()V

    return-void
.end method

.method public final getGravity()I
    .locals 1

    .line 39
    iget-object v0, p0, Ll/ۢۢ᩷;->ۧ:Ll/᩸ۖ;

    invoke-virtual {v0}, Ll/᩸ۖ;->ۧ()I

    move-result v0

    return v0
.end method

.method public final getMenu()Lbin/mt/plugin/api/ui/menu/PluginMenu;
    .locals 1

    .line 29
    iget-object v0, p0, Ll/ۢۢ᩷;->֫:Ll/᩻ۢ᩷;

    return-object v0
.end method

.method public final setGravity(I)V
    .locals 1

    .line 34
    iget-object v0, p0, Ll/ۢۢ᩷;->ۧ:Ll/᩸ۖ;

    invoke-virtual {v0, p1}, Ll/᩸ۖ;->֫(I)V

    return-void
.end method

.method public final setOnDismissListener(Lbin/mt/plugin/api/ui/menu/PluginPopupMenu$OnDismissListener;)V
    .locals 2

    .line 69
    iget-object v0, p0, Ll/ۢۢ᩷;->ۧ:Ll/᩸ۖ;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 70
    invoke-virtual {v0, p1}, Ll/᩸ۖ;->֫(Ll/۠ۖ;)V

    return-void

    .line 72
    :cond_0
    new-instance v1, Ll/᩷ۢ᩷;

    invoke-direct {v1, p0, p1}, Ll/᩷ۢ᩷;-><init>(Ll/ۢۢ᩷;Lbin/mt/plugin/api/ui/menu/PluginPopupMenu$OnDismissListener;)V

    invoke-virtual {v0, v1}, Ll/᩸ۖ;->֫(Ll/۠ۖ;)V

    return-void
.end method

.method public final setOnMenuItemClickListener(Lbin/mt/plugin/api/ui/menu/PluginMenu$OnMenuItemClickListener;)V
    .locals 2

    .line 54
    iget-object v0, p0, Ll/ۢۢ᩷;->ۧ:Ll/᩸ۖ;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 55
    invoke-virtual {v0, p1}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    return-void

    .line 57
    :cond_0
    new-instance v1, Ll/ᩴۡܳ;

    invoke-direct {v1, p0, p1}, Ll/ᩴۡܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    return-void
.end method

.method public final show()V
    .locals 1

    .line 44
    iget-object v0, p0, Ll/ۢۢ᩷;->ۧ:Ll/᩸ۖ;

    invoke-virtual {v0}, Ll/᩸ۖ;->ܿ()V

    return-void
.end method
