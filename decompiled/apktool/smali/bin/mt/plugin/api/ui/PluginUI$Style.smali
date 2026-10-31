.class public Lbin/mt/plugin/api/ui/PluginUI$Style;
.super Ljava/lang/Object;
.source "PluginUI.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 374
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final dispatch(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;)V
    .locals 1

    .line 384
    invoke-virtual {p0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleBaseView(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 387
    :cond_0
    instance-of v0, p2, Lbin/mt/plugin/api/ui/builder/PluginBaseTextViewBuilder;

    if-eqz v0, :cond_1

    .line 388
    check-cast p2, Lbin/mt/plugin/api/ui/builder/PluginBaseTextViewBuilder;

    invoke-virtual {p0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->dispatchBaseTextView(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseTextViewBuilder;)V

    return-void

    .line 389
    :cond_1
    instance-of v0, p2, Lbin/mt/plugin/api/ui/builder/PluginBaseViewGroupBuilder;

    if-eqz v0, :cond_2

    .line 390
    check-cast p2, Lbin/mt/plugin/api/ui/builder/PluginBaseViewGroupBuilder;

    invoke-virtual {p0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->dispatchBaseViewGroup(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseViewGroupBuilder;)V

    return-void

    .line 391
    :cond_2
    instance-of v0, p2, Lbin/mt/plugin/api/ui/builder/PluginViewBuilder;

    if-eqz v0, :cond_3

    .line 392
    check-cast p2, Lbin/mt/plugin/api/ui/builder/PluginViewBuilder;

    invoke-virtual {p0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleView(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginViewBuilder;)V

    return-void

    .line 393
    :cond_3
    instance-of v0, p2, Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;

    if-eqz v0, :cond_4

    .line 394
    check-cast p2, Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;

    invoke-virtual {p0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleEditText(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;)V

    return-void

    .line 395
    :cond_4
    instance-of v0, p2, Lbin/mt/plugin/api/ui/builder/PluginImageViewBuilder;

    if-eqz v0, :cond_5

    .line 396
    check-cast p2, Lbin/mt/plugin/api/ui/builder/PluginImageViewBuilder;

    invoke-virtual {p0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleImageView(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginImageViewBuilder;)V

    return-void

    .line 397
    :cond_5
    instance-of v0, p2, Lbin/mt/plugin/api/ui/builder/PluginSpinnerBuilder;

    if-eqz v0, :cond_6

    .line 398
    check-cast p2, Lbin/mt/plugin/api/ui/builder/PluginSpinnerBuilder;

    invoke-virtual {p0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleSpinner(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginSpinnerBuilder;)V

    return-void

    .line 399
    :cond_6
    instance-of v0, p2, Lbin/mt/plugin/api/ui/builder/PluginProgressBarBuilder;

    if-eqz v0, :cond_7

    .line 400
    check-cast p2, Lbin/mt/plugin/api/ui/builder/PluginProgressBarBuilder;

    invoke-virtual {p0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleProgressBar(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginProgressBarBuilder;)V

    return-void

    .line 401
    :cond_7
    instance-of v0, p2, Lbin/mt/plugin/api/ui/builder/PluginRootLayoutBuilder;

    if-eqz v0, :cond_8

    .line 402
    check-cast p2, Lbin/mt/plugin/api/ui/builder/PluginRootLayoutBuilder;

    invoke-virtual {p0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleRootLayout(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginRootLayoutBuilder;)V

    return-void

    .line 404
    :cond_8
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final dispatchBaseButton(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseButtonBuilder;)V
    .locals 1

    .line 428
    invoke-virtual {p0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleBaseButton(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseButtonBuilder;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 431
    :cond_0
    instance-of v0, p2, Lbin/mt/plugin/api/ui/builder/PluginBaseCompoundButtonBuilder;

    if-eqz v0, :cond_1

    .line 432
    check-cast p2, Lbin/mt/plugin/api/ui/builder/PluginBaseCompoundButtonBuilder;

    invoke-virtual {p0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->dispatchBaseCompoundButton(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseCompoundButtonBuilder;)V

    return-void

    .line 433
    :cond_1
    instance-of v0, p2, Lbin/mt/plugin/api/ui/builder/PluginButtonBuilder;

    if-eqz v0, :cond_2

    .line 434
    check-cast p2, Lbin/mt/plugin/api/ui/builder/PluginButtonBuilder;

    invoke-virtual {p0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleButton(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginButtonBuilder;)V

    return-void

    .line 436
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final dispatchBaseCompoundButton(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseCompoundButtonBuilder;)V
    .locals 1

    .line 444
    invoke-virtual {p0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleBaseCompoundButton(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseCompoundButtonBuilder;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 447
    :cond_0
    instance-of v0, p2, Lbin/mt/plugin/api/ui/builder/PluginCheckBoxBuilder;

    if-eqz v0, :cond_1

    .line 448
    check-cast p2, Lbin/mt/plugin/api/ui/builder/PluginCheckBoxBuilder;

    invoke-virtual {p0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleCheckBox(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginCheckBoxBuilder;)V

    return-void

    .line 449
    :cond_1
    instance-of v0, p2, Lbin/mt/plugin/api/ui/builder/PluginSwitchButtonBuilder;

    if-eqz v0, :cond_2

    .line 450
    check-cast p2, Lbin/mt/plugin/api/ui/builder/PluginSwitchButtonBuilder;

    invoke-virtual {p0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleSwitchButton(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginSwitchButtonBuilder;)V

    return-void

    .line 451
    :cond_2
    instance-of v0, p2, Lbin/mt/plugin/api/ui/builder/PluginRadioButtonBuilder;

    if-eqz v0, :cond_3

    .line 452
    check-cast p2, Lbin/mt/plugin/api/ui/builder/PluginRadioButtonBuilder;

    invoke-virtual {p0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleRadioButton(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginRadioButtonBuilder;)V

    return-void

    .line 454
    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final dispatchBaseLinearLayout(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseLinearLayoutBuilder;)V
    .locals 1

    .line 473
    instance-of v0, p2, Lbin/mt/plugin/api/ui/builder/PluginLinearLayoutBuilder;

    if-eqz v0, :cond_0

    .line 474
    check-cast p2, Lbin/mt/plugin/api/ui/builder/PluginLinearLayoutBuilder;

    invoke-virtual {p0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleLinearLayout(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginLinearLayoutBuilder;)V

    return-void

    .line 475
    :cond_0
    instance-of v0, p2, Lbin/mt/plugin/api/ui/builder/PluginRadioGroupBuilder;

    if-eqz v0, :cond_1

    .line 476
    check-cast p2, Lbin/mt/plugin/api/ui/builder/PluginRadioGroupBuilder;

    invoke-virtual {p0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleRadioGroup(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginRadioGroupBuilder;)V

    return-void

    .line 478
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final dispatchBaseTextView(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseTextViewBuilder;)V
    .locals 1

    .line 412
    invoke-virtual {p0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleBaseTextView(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseTextViewBuilder;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 415
    :cond_0
    instance-of v0, p2, Lbin/mt/plugin/api/ui/builder/PluginBaseButtonBuilder;

    if-eqz v0, :cond_1

    .line 416
    check-cast p2, Lbin/mt/plugin/api/ui/builder/PluginBaseButtonBuilder;

    invoke-virtual {p0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->dispatchBaseButton(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseButtonBuilder;)V

    return-void

    .line 417
    :cond_1
    instance-of v0, p2, Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;

    if-eqz v0, :cond_2

    .line 418
    check-cast p2, Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;

    invoke-virtual {p0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleTextView(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;)V

    return-void

    .line 420
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final dispatchBaseViewGroup(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseViewGroupBuilder;)V
    .locals 1

    .line 462
    invoke-virtual {p0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->handleBaseViewGroup(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseViewGroupBuilder;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 465
    :cond_0
    instance-of v0, p2, Lbin/mt/plugin/api/ui/builder/PluginBaseLinearLayoutBuilder;

    if-eqz v0, :cond_1

    .line 466
    check-cast p2, Lbin/mt/plugin/api/ui/builder/PluginBaseLinearLayoutBuilder;

    invoke-virtual {p0, p1, p2}, Lbin/mt/plugin/api/ui/PluginUI$Style;->dispatchBaseLinearLayout(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseLinearLayoutBuilder;)V

    return-void

    .line 468
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public handleBaseButton(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseButtonBuilder;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public handleBaseCompoundButton(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseCompoundButtonBuilder;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public handleBaseTextView(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseTextViewBuilder;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public handleBaseView(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public handleBaseViewGroup(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseViewGroupBuilder;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public handleButton(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginButtonBuilder;)V
    .locals 0

    return-void
.end method

.method public handleCheckBox(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginCheckBoxBuilder;)V
    .locals 0

    return-void
.end method

.method public handleEditText(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;)V
    .locals 0

    return-void
.end method

.method public handleImageView(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginImageViewBuilder;)V
    .locals 0

    return-void
.end method

.method public handleLinearLayout(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginLinearLayoutBuilder;)V
    .locals 0

    return-void
.end method

.method public handleProgressBar(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginProgressBarBuilder;)V
    .locals 0

    return-void
.end method

.method public handleRadioButton(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginRadioButtonBuilder;)V
    .locals 0

    return-void
.end method

.method public handleRadioGroup(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginRadioGroupBuilder;)V
    .locals 0

    return-void
.end method

.method public handleRootLayout(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginRootLayoutBuilder;)V
    .locals 0

    return-void
.end method

.method public handleSpinner(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginSpinnerBuilder;)V
    .locals 0

    return-void
.end method

.method public handleSwitchButton(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginSwitchButtonBuilder;)V
    .locals 0

    return-void
.end method

.method public handleTextView(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;)V
    .locals 0

    return-void
.end method

.method public handleView(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginViewBuilder;)V
    .locals 0

    return-void
.end method
