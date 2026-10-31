.class public final Ll/ۘ᩷᩷;
.super Ll/ܳ᩷᩷;
.source "N7O9"

# interfaces
.implements Lbin/mt/plugin/api/ui/builder/PluginButtonBuilder;


# instance fields
.field public ۗ:Lbin/mt/plugin/api/ui/PluginButton$Style;


# direct methods
.method public constructor <init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Ll/ۢ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V

    .line 19
    sget-object p1, Lbin/mt/plugin/api/ui/PluginButton$Style;->DEFAULT:Lbin/mt/plugin/api/ui/PluginButton$Style;

    iput-object p1, p0, Ll/ۘ᩷᩷;->ۗ:Lbin/mt/plugin/api/ui/PluginButton$Style;

    return-void
.end method


# virtual methods
.method public final style(Lbin/mt/plugin/api/ui/PluginButton$Style;)Lbin/mt/plugin/api/ui/builder/PluginButtonBuilder;
    .locals 0

    .line 47
    iput-object p1, p0, Ll/ۘ᩷᩷;->ۗ:Lbin/mt/plugin/api/ui/PluginButton$Style;

    return-object p0
.end method

.method public final ֫(Landroid/content/Context;)Landroid/view/View;
    .locals 3

    .line 32
    sget-object v0, Ll/ۖ᩷᩷;->֫:[I

    iget-object v1, p0, Ll/ۘ᩷᩷;->ۗ:Lbin/mt/plugin/api/ui/PluginButton$Style;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    const v2, 0x7f13000d

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 37
    new-instance v0, Ll/᩶ۢ;

    new-instance v1, Ll/۫᩻;

    invoke-direct {v1, p1, v2}, Ll/۫᩻;-><init>(Landroid/content/Context;I)V

    invoke-direct {v0, v1}, Ll/᩶ۢ;-><init>(Landroid/content/Context;)V

    .line 38
    invoke-static {v0}, Ll/ܰ᩸᩷;->֫(Landroid/widget/TextView;)V

    return-object v0

    .line 32
    :cond_0
    new-instance p1, Ljava/lang/IncompatibleClassChangeError;

    invoke-direct {p1}, Ljava/lang/IncompatibleClassChangeError;-><init>()V

    throw p1

    .line 35
    :cond_1
    new-instance v0, Ll/᩶ۢ;

    new-instance v1, Ll/۫᩻;

    invoke-direct {v1, p1, v2}, Ll/۫᩻;-><init>(Landroid/content/Context;I)V

    invoke-direct {v0, v1}, Ll/᩶ۢ;-><init>(Landroid/content/Context;)V

    return-object v0

    .line 33
    :cond_2
    new-instance v0, Ll/᩶ۢ;

    invoke-direct {v0, p1}, Ll/᩶ۢ;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final ֫(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;)Ll/۟ۜ᩷;
    .locals 2

    .line 27
    new-instance v0, Ll/ܿۜ᩷;

    iget-object v1, p0, Ll/ۘ᩷᩷;->ۗ:Lbin/mt/plugin/api/ui/PluginButton$Style;

    invoke-direct {v0, p1, p2, v1}, Ll/ܿۜ᩷;-><init>(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;Lbin/mt/plugin/api/ui/PluginButton$Style;)V

    return-object v0
.end method
