.class public Ll/۠ۜ᩷;
.super Ll/ۨۜ᩷;
.source "17MX"

# interfaces
.implements Lbin/mt/plugin/api/ui/PluginLinearLayout;


# instance fields
.field public ۜ:I


# direct methods
.method public constructor <init>(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1, p2}, Ll/ۨۜ᩷;-><init>(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;)V

    const p1, 0x800033

    .line 12
    iput p1, p0, Ll/۠ۜ᩷;->ۜ:I

    return-void
.end method


# virtual methods
.method public final getGravity()I
    .locals 2

    .line 30
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-ge v0, v1, :cond_0

    .line 31
    iget v0, p0, Ll/۠ۜ᩷;->ۜ:I

    return v0

    .line 33
    :cond_0
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getGravity()I

    move-result v0

    return v0
.end method

.method public final isHorizontal()Z
    .locals 1

    .line 20
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getOrientation()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isVertical()Z
    .locals 2

    .line 25
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getOrientation()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final setGravity(I)V
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 40
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 41
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-ge v0, v1, :cond_0

    .line 42
    iput p1, p0, Ll/۠ۜ᩷;->ۜ:I

    :cond_0
    return-void

    .line 649
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
