.class public final Ll/ۡۢ᩷;
.super Ll/᩻ۢ᩷;
.source "37IG"

# interfaces
.implements Lbin/mt/plugin/api/ui/menu/PluginSubMenu;


# instance fields
.field public ܿ:Ll/ۜۢ᩷;


# direct methods
.method public constructor <init>(Lbin/mt/plugin/api/PluginContext;Ljava/lang/String;Ljava/lang/String;Ll/᩵᩷;Ll/۫ᩴᩴ;)V
    .locals 6

    .line 17
    invoke-direct {p0, p1, p4, p5}, Ll/᩻ۢ᩷;-><init>(Lbin/mt/plugin/api/PluginContext;Ll/᩺۬;Ll/۫ᩴᩴ;)V

    .line 18
    new-instance p5, Ll/ۜۢ᩷;

    invoke-virtual {p4}, Ll/᩵᩷;->getItem()Landroid/view/MenuItem;

    move-result-object p4

    move-object v4, p4

    check-cast v4, Ll/ܰ۬;

    move-object v0, p5

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Ll/ۜۢ᩷;-><init>(Lbin/mt/plugin/api/PluginContext;Ljava/lang/String;Ljava/lang/String;Ll/ܰ۬;Ll/ۡۢ᩷;)V

    iput-object p5, p0, Ll/ۡۢ᩷;->ܿ:Ll/ۜۢ᩷;

    return-void
.end method


# virtual methods
.method public final getItem()Lbin/mt/plugin/api/ui/menu/PluginMenuItem;
    .locals 1

    .line 29
    iget-object v0, p0, Ll/ۡۢ᩷;->ܿ:Ll/ۜۢ᩷;

    return-object v0
.end method

.method public final getItem()Ll/ۜۢ᩷;
    .locals 1

    .line 29
    iget-object v0, p0, Ll/ۡۢ᩷;->ܿ:Ll/ۜۢ᩷;

    return-object v0
.end method

.method public final setIcon(Landroid/graphics/drawable/Drawable;)Lbin/mt/plugin/api/ui/menu/PluginSubMenu;
    .locals 1

    .line 23
    iget-object v0, p0, Ll/᩻ۢ᩷;->ܽ:Ll/᩺۬;

    check-cast v0, Ll/۟۬;

    invoke-interface {v0, p1}, Landroid/view/SubMenu;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;

    return-object p0
.end method
