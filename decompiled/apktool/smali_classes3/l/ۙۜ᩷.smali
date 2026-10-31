.class public final Ll/ۙۜ᩷;
.super Ll/۠ۜ᩷;
.source "K7RF"

# interfaces
.implements Lbin/mt/plugin/api/ui/PluginRadioGroup;


# instance fields
.field public ۡ:Lbin/mt/plugin/api/ui/PluginRadioGroup$OnCheckedChangeListener;

.field public ۢ:Lbin/mt/plugin/api/ui/PluginCompoundButton$OnCheckedChangeListener;

.field public ᩷:Ll/᩹ۜ᩷;


# direct methods
.method public constructor <init>(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2}, Ll/۠ۜ᩷;-><init>(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;)V

    .line 22
    new-instance p1, Ll/᩶ۜ᩷;

    invoke-direct {p1, p0}, Ll/᩶ۜ᩷;-><init>(Ll/ۙۜ᩷;)V

    iput-object p1, p0, Ll/ۙۜ᩷;->ۢ:Lbin/mt/plugin/api/ui/PluginCompoundButton$OnCheckedChangeListener;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۙۜ᩷;)Ll/᩹ۜ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۙۜ᩷;->᩷:Ll/᩹ۜ᩷;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ۙۜ᩷;Ll/᩹ۜ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ۙۜ᩷;->֫(Ll/᩹ۜ᩷;)V

    return-void
.end method

.method private ֫(Ll/᩹ۜ᩷;)V
    .locals 2

    .line 78
    iput-object p1, p0, Ll/ۙۜ᩷;->᩷:Ll/᩹ۜ᩷;

    .line 80
    iget-object v0, p0, Ll/ۙۜ᩷;->ۡ:Lbin/mt/plugin/api/ui/PluginRadioGroup$OnCheckedChangeListener;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    const/4 v1, -0x1

    goto :goto_0

    .line 82
    :cond_0
    invoke-virtual {p1}, Ll/᩹ۜ᩷;->getPositionInRadioGroup()I

    move-result v1

    .line 81
    :goto_0
    invoke-interface {v0, p0, p1, v1}, Lbin/mt/plugin/api/ui/PluginRadioGroup$OnCheckedChangeListener;->onCheckedChanged(Lbin/mt/plugin/api/ui/PluginRadioGroup;Lbin/mt/plugin/api/ui/PluginRadioButton;I)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final check(I)V
    .locals 3

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 59
    iget-object v0, p0, Ll/ۙۜ᩷;->᩷:Ll/᩹ۜ᩷;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩹ۜ᩷;->getPositionInRadioGroup()I

    move-result v0

    if-ne p1, v0, :cond_0

    return-void

    .line 62
    :cond_0
    iget-object v0, p0, Ll/ۙۜ᩷;->᩷:Ll/᩹ۜ᩷;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 63
    invoke-virtual {v0, v1}, Ll/ۜۜ᩷;->setChecked(Z)V

    :cond_1
    if-ltz p1, :cond_3

    .line 66
    iget-object v0, p0, Ll/ۨۜ᩷;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbin/mt/plugin/api/ui/PluginView;

    .line 67
    instance-of v2, v1, Ll/᩹ۜ᩷;

    if-eqz v2, :cond_2

    check-cast v1, Ll/᩹ۜ᩷;

    invoke-virtual {v1}, Ll/᩹ۜ᩷;->getPositionInRadioGroup()I

    move-result v2

    if-ne v2, p1, :cond_2

    const/4 p1, 0x1

    .line 68
    invoke-virtual {v1, p1}, Ll/ۜۜ᩷;->setChecked(Z)V

    .line 69
    invoke-direct {p0, v1}, Ll/ۙۜ᩷;->֫(Ll/᩹ۜ᩷;)V

    return-void

    :cond_3
    const/4 p1, 0x0

    .line 74
    invoke-direct {p0, p1}, Ll/ۙۜ᩷;->֫(Ll/᩹ۜ᩷;)V

    return-void

    .line 649
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final check(Ljava/lang/String;)V
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_3

    if-eqz p1, :cond_0

    .line 42
    iget-object v0, p0, Ll/ۙۜ᩷;->᩷:Ll/᩹ۜ᩷;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/۟ۜ᩷;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 45
    :cond_0
    iget-object v0, p0, Ll/ۙۜ᩷;->᩷:Ll/᩹ۜ᩷;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 46
    invoke-virtual {v0, v1}, Ll/ۜۜ᩷;->setChecked(Z)V

    .line 48
    :cond_1
    invoke-virtual {p0, p1}, Ll/۟ۜ᩷;->findViewById(Ljava/lang/String;)Lbin/mt/plugin/api/ui/PluginView;

    move-result-object p1

    instance-of v0, p1, Ll/᩹ۜ᩷;

    if-eqz v0, :cond_2

    check-cast p1, Ll/᩹ۜ᩷;

    const/4 v0, 0x1

    .line 49
    invoke-virtual {p1, v0}, Ll/ۜۜ᩷;->setChecked(Z)V

    .line 50
    invoke-direct {p0, p1}, Ll/ۙۜ᩷;->֫(Ll/᩹ۜ᩷;)V

    return-void

    :cond_2
    const/4 p1, 0x0

    .line 52
    invoke-direct {p0, p1}, Ll/ۙۜ᩷;->֫(Ll/᩹ۜ᩷;)V

    return-void

    .line 649
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final clearCheck()V
    .locals 1

    const/4 v0, 0x0

    .line 111
    invoke-virtual {p0, v0}, Ll/ۙۜ᩷;->check(Ljava/lang/String;)V

    return-void
.end method

.method public final getCheckedRadioButton()Lbin/mt/plugin/api/ui/PluginRadioButton;
    .locals 1

    .line 106
    iget-object v0, p0, Ll/ۙۜ᩷;->᩷:Ll/᩹ۜ᩷;

    return-object v0
.end method

.method public final getCheckedRadioButtonId()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Ll/ۙۜ᩷;->᩷:Ll/᩹ۜ᩷;

    if-eqz v0, :cond_0

    .line 90
    invoke-virtual {v0}, Ll/۟ۜ᩷;->getId()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getCheckedRadioButtonPosition()I
    .locals 1

    .line 97
    iget-object v0, p0, Ll/ۙۜ᩷;->᩷:Ll/᩹ۜ᩷;

    if-eqz v0, :cond_0

    .line 98
    invoke-virtual {v0}, Ll/᩹ۜ᩷;->getPositionInRadioGroup()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public final setOnCheckedChangeListener(Lbin/mt/plugin/api/ui/PluginRadioGroup$OnCheckedChangeListener;)V
    .locals 0

    .line 116
    iput-object p1, p0, Ll/ۙۜ᩷;->ۡ:Lbin/mt/plugin/api/ui/PluginRadioGroup$OnCheckedChangeListener;

    return-void
.end method

.method public final ֫(Lbin/mt/plugin/api/ui/PluginView;)V
    .locals 3

    .line 27
    instance-of v0, p1, Ll/᩹ۜ᩷;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Ll/᩹ۜ᩷;

    .line 28
    invoke-virtual {v0}, Ll/ۜۜ᩷;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 29
    iget-object v1, p0, Ll/ۙۜ᩷;->᩷:Ll/᩹ۜ᩷;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    .line 30
    invoke-virtual {v1, v2}, Ll/ۜۜ᩷;->setChecked(Z)V

    .line 32
    :cond_0
    invoke-direct {p0, v0}, Ll/ۙۜ᩷;->֫(Ll/᩹ۜ᩷;)V

    .line 34
    :cond_1
    iget-object v1, p0, Ll/ۙۜ᩷;->ۢ:Lbin/mt/plugin/api/ui/PluginCompoundButton$OnCheckedChangeListener;

    invoke-virtual {v0, v1}, Ll/᩹ۜ᩷;->֫(Lbin/mt/plugin/api/ui/PluginCompoundButton$OnCheckedChangeListener;)V

    .line 36
    :cond_2
    invoke-super {p0, p1}, Ll/ۨۜ᩷;->֫(Lbin/mt/plugin/api/ui/PluginView;)V

    return-void
.end method
