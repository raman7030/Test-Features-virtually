.class public final Ll/᩹ۜ᩷;
.super Ll/ۜۜ᩷;
.source "K7OU"

# interfaces
.implements Lbin/mt/plugin/api/ui/PluginRadioButton;


# instance fields
.field public ۜ:Lbin/mt/plugin/api/ui/PluginCompoundButton$OnCheckedChangeListener;

.field public ᩷:Lbin/mt/plugin/api/ui/PluginCompoundButton$OnCheckedChangeListener;

.field public ᩻:I


# direct methods
.method public constructor <init>(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1, p2}, Ll/ۜۜ᩷;-><init>(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;)V

    const/4 p1, -0x1

    .line 12
    iput p1, p0, Ll/᩹ۜ᩷;->᩻:I

    return-void
.end method

.method public static synthetic ֫(Ll/᩹ۜ᩷;Z)V
    .locals 1

    .line 22
    iget-object v0, p0, Ll/᩹ۜ᩷;->ۜ:Lbin/mt/plugin/api/ui/PluginCompoundButton$OnCheckedChangeListener;

    if-eqz v0, :cond_0

    .line 24
    invoke-interface {v0, p0, p1}, Lbin/mt/plugin/api/ui/PluginCompoundButton$OnCheckedChangeListener;->onCheckedChanged(Lbin/mt/plugin/api/ui/PluginCompoundButton;Z)V

    .line 26
    :cond_0
    iget-object v0, p0, Ll/᩹ۜ᩷;->᩷:Lbin/mt/plugin/api/ui/PluginCompoundButton$OnCheckedChangeListener;

    if-eqz v0, :cond_1

    .line 28
    invoke-interface {v0, p0, p1}, Lbin/mt/plugin/api/ui/PluginCompoundButton$OnCheckedChangeListener;->onCheckedChanged(Lbin/mt/plugin/api/ui/PluginCompoundButton;Z)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final getPositionInRadioGroup()I
    .locals 1

    .line 48
    iget v0, p0, Ll/᩹ۜ᩷;->᩻:I

    return v0
.end method

.method public final setOnCheckedChangeListener(Lbin/mt/plugin/api/ui/PluginCompoundButton$OnCheckedChangeListener;)V
    .locals 0

    .line 35
    iput-object p1, p0, Ll/᩹ۜ᩷;->ۜ:Lbin/mt/plugin/api/ui/PluginCompoundButton$OnCheckedChangeListener;

    return-void
.end method

.method public final ֫(I)V
    .locals 0

    .line 43
    iput p1, p0, Ll/᩹ۜ᩷;->᩻:I

    return-void
.end method

.method public final ֫(Landroid/view/View;)V
    .locals 1

    .line 9
    check-cast p1, Landroid/widget/RadioButton;

    .line 46
    iput-object p1, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    .line 21
    new-instance v0, Ll/᩸ۜ᩷;

    invoke-direct {v0, p0}, Ll/᩸ۜ᩷;-><init>(Ll/᩹ۜ᩷;)V

    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    return-void
.end method

.method public final ֫(Lbin/mt/plugin/api/ui/PluginCompoundButton$OnCheckedChangeListener;)V
    .locals 0

    .line 39
    iput-object p1, p0, Ll/᩹ۜ᩷;->᩷:Lbin/mt/plugin/api/ui/PluginCompoundButton$OnCheckedChangeListener;

    return-void
.end method
