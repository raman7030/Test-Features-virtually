.class public Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;
.super Lbin/mt/plugin/api/ui/PluginUI$Style;
.source "PluginUI.java"


# instance fields
.field public mBase:Lbin/mt/plugin/api/ui/PluginUI$Style;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 712
    invoke-direct {p0}, Lbin/mt/plugin/api/ui/PluginUI$Style;-><init>()V

    return-void
.end method

.method public constructor <init>(Lbin/mt/plugin/api/ui/PluginUI$Style;)V
    .locals 0

    .line 732
    invoke-direct {p0}, Lbin/mt/plugin/api/ui/PluginUI$Style;-><init>()V

    .line 733
    iput-object p1, p0, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;->mBase:Lbin/mt/plugin/api/ui/PluginUI$Style;

    return-void
.end method


# virtual methods
.method public attachStyle(Lbin/mt/plugin/api/ui/PluginUI$Style;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 751
    iget-object v0, p0, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;->mBase:Lbin/mt/plugin/api/ui/PluginUI$Style;

    if-nez v0, :cond_0

    .line 754
    iput-object p1, p0, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;->mBase:Lbin/mt/plugin/api/ui/PluginUI$Style;

    return-void

    .line 752
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Style already attached"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 749
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Cannot attach null style"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getBaseStyle()Lbin/mt/plugin/api/ui/PluginUI$Style;
    .locals 1

    .line 763
    iget-object v0, p0, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;->mBase:Lbin/mt/plugin/api/ui/PluginUI$Style;

    return-object v0
.end method

.method public handleBaseButton(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseButtonBuilder;)Z
    .locals 1

    .line 787
    iget-object v0, p0, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;->mBase:Lbin/mt/plugin/api/ui/PluginUI$Style;

    invoke-virtual {v0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleBaseButton(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseButtonBuilder;)Z

    move-result p1

    return p1
.end method

.method public handleBaseCompoundButton(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseCompoundButtonBuilder;)Z
    .locals 1

    .line 795
    iget-object v0, p0, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;->mBase:Lbin/mt/plugin/api/ui/PluginUI$Style;

    invoke-virtual {v0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleBaseCompoundButton(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseCompoundButtonBuilder;)Z

    move-result p1

    return p1
.end method

.method public handleBaseTextView(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseTextViewBuilder;)Z
    .locals 1

    .line 779
    iget-object v0, p0, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;->mBase:Lbin/mt/plugin/api/ui/PluginUI$Style;

    invoke-virtual {v0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleBaseTextView(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseTextViewBuilder;)Z

    move-result p1

    return p1
.end method

.method public handleBaseView(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;)Z
    .locals 1

    .line 771
    iget-object v0, p0, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;->mBase:Lbin/mt/plugin/api/ui/PluginUI$Style;

    invoke-virtual {v0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleBaseView(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;)Z

    move-result p1

    return p1
.end method

.method public handleBaseViewGroup(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseViewGroupBuilder;)Z
    .locals 1

    .line 803
    iget-object v0, p0, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;->mBase:Lbin/mt/plugin/api/ui/PluginUI$Style;

    invoke-virtual {v0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleBaseViewGroup(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseViewGroupBuilder;)Z

    move-result p1

    return p1
.end method

.method public handleButton(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginButtonBuilder;)V
    .locals 1

    .line 827
    iget-object v0, p0, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;->mBase:Lbin/mt/plugin/api/ui/PluginUI$Style;

    invoke-virtual {v0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleButton(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginButtonBuilder;)V

    return-void
.end method

.method public handleCheckBox(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginCheckBoxBuilder;)V
    .locals 1

    .line 835
    iget-object v0, p0, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;->mBase:Lbin/mt/plugin/api/ui/PluginUI$Style;

    invoke-virtual {v0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleCheckBox(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginCheckBoxBuilder;)V

    return-void
.end method

.method public handleEditText(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;)V
    .locals 1

    .line 883
    iget-object v0, p0, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;->mBase:Lbin/mt/plugin/api/ui/PluginUI$Style;

    invoke-virtual {v0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleEditText(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;)V

    return-void
.end method

.method public handleImageView(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginImageViewBuilder;)V
    .locals 1

    .line 891
    iget-object v0, p0, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;->mBase:Lbin/mt/plugin/api/ui/PluginUI$Style;

    invoke-virtual {v0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleImageView(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginImageViewBuilder;)V

    return-void
.end method

.method public handleLinearLayout(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginLinearLayoutBuilder;)V
    .locals 1

    .line 899
    iget-object v0, p0, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;->mBase:Lbin/mt/plugin/api/ui/PluginUI$Style;

    invoke-virtual {v0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleLinearLayout(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginLinearLayoutBuilder;)V

    return-void
.end method

.method public handleProgressBar(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginProgressBarBuilder;)V
    .locals 1

    .line 875
    iget-object v0, p0, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;->mBase:Lbin/mt/plugin/api/ui/PluginUI$Style;

    invoke-virtual {v0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleProgressBar(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginProgressBarBuilder;)V

    return-void
.end method

.method public handleRadioButton(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginRadioButtonBuilder;)V
    .locals 1

    .line 851
    iget-object v0, p0, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;->mBase:Lbin/mt/plugin/api/ui/PluginUI$Style;

    invoke-virtual {v0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleRadioButton(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginRadioButtonBuilder;)V

    return-void
.end method

.method public handleRadioGroup(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginRadioGroupBuilder;)V
    .locals 1

    .line 859
    iget-object v0, p0, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;->mBase:Lbin/mt/plugin/api/ui/PluginUI$Style;

    invoke-virtual {v0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleRadioGroup(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginRadioGroupBuilder;)V

    return-void
.end method

.method public handleRootLayout(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginRootLayoutBuilder;)V
    .locals 1

    .line 907
    iget-object v0, p0, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;->mBase:Lbin/mt/plugin/api/ui/PluginUI$Style;

    invoke-virtual {v0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleRootLayout(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginRootLayoutBuilder;)V

    return-void
.end method

.method public handleSpinner(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginSpinnerBuilder;)V
    .locals 1

    .line 867
    iget-object v0, p0, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;->mBase:Lbin/mt/plugin/api/ui/PluginUI$Style;

    invoke-virtual {v0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleSpinner(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginSpinnerBuilder;)V

    return-void
.end method

.method public handleSwitchButton(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginSwitchButtonBuilder;)V
    .locals 1

    .line 843
    iget-object v0, p0, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;->mBase:Lbin/mt/plugin/api/ui/PluginUI$Style;

    invoke-virtual {v0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleSwitchButton(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginSwitchButtonBuilder;)V

    return-void
.end method

.method public handleTextView(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;)V
    .locals 1

    .line 819
    iget-object v0, p0, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;->mBase:Lbin/mt/plugin/api/ui/PluginUI$Style;

    invoke-virtual {v0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleTextView(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;)V

    return-void
.end method

.method public handleView(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginViewBuilder;)V
    .locals 1

    .line 811
    iget-object v0, p0, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;->mBase:Lbin/mt/plugin/api/ui/PluginUI$Style;

    invoke-virtual {v0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleView(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginViewBuilder;)V

    return-void
.end method
