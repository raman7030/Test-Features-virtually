.class public abstract Ll/ۜ᩷᩷;
.super Ll/ܺ᩷᩷;
.source "Q7N9"

# interfaces
.implements Lbin/mt/plugin/api/ui/builder/PluginBaseLinearLayoutBuilder;


# instance fields
.field public final ֡:I

.field public ᩵:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;Lbin/mt/plugin/api/ui/PluginUI$Style;I)V
    .locals 0

    .line 18
    invoke-direct {p0, p1, p2}, Ll/ܺ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;Lbin/mt/plugin/api/ui/PluginUI$Style;)V

    .line 19
    iput p3, p0, Ll/ۜ᩷᩷;->֡:I

    return-void
.end method


# virtual methods
.method public gravity(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 24
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/ۜ᩷᩷;->᩵:Ljava/lang/Integer;

    return-object p0
.end method

.method public isHorizontal()Z
    .locals 1

    .line 39
    iget v0, p0, Ll/ۜ᩷᩷;->֡:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isVertical()Z
    .locals 2

    .line 44
    iget v0, p0, Ll/ۜ᩷᩷;->֡:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(Ll/۟ۜ᩷;)V
    .locals 2

    .line 13
    check-cast p1, Ll/۠ۜ᩷;

    .line 30
    invoke-virtual {p1}, Ll/۟ۜ᩷;->֫()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iget v1, p0, Ll/ۜ᩷᩷;->֡:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 31
    invoke-super {p0, p1}, Ll/ۢ᩷᩷;->֫(Ll/۟ۜ᩷;)V

    .line 32
    iget-object v0, p0, Ll/ۜ᩷᩷;->᩵:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 33
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/۠ۜ᩷;->setGravity(I)V

    :cond_0
    return-void
.end method
