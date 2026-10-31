.class public Lbin/mt/plugin/api/ui/dialog/LoadingDialog;
.super Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;
.source "LoadingDialog.java"


# instance fields
.field public delayShow:Z

.field public final dialog:Lbin/mt/plugin/api/ui/dialog/PluginDialog;

.field public final messageUpdater:Lbin/mt/plugin/api/util/UIUpdater;

.field public final messageView:Lbin/mt/plugin/api/ui/PluginTextView;

.field public final secondaryMessageUpdater:Lbin/mt/plugin/api/util/UIUpdater;

.field public final secondaryMessageView:Lbin/mt/plugin/api/ui/PluginTextView;


# direct methods
.method public static synthetic $r8$lambda$GboXaHjgw-QeHawSGhweYDlxbog(Lbin/mt/plugin/api/ui/dialog/LoadingDialog;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->lambda$dismiss$2()V

    return-void
.end method

.method public static synthetic $r8$lambda$QWmsr9SOaqSJq5dogzEk6LuF6sM(Lbin/mt/plugin/api/ui/dialog/LoadingDialog;Ljava/lang/CharSequence;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->lambda$new$1(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static synthetic $r8$lambda$lr8zokJiYLX0ZzHcXICzIfn6kRc(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->lambda$new$0(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V

    return-void
.end method

.method public constructor <init>(Lbin/mt/plugin/api/ui/PluginUI;)V
    .locals 3

    .line 30
    invoke-direct {p0, p1}, Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;-><init>(Lbin/mt/plugin/api/ui/PluginUI;)V

    .line 32
    invoke-interface {p1}, Lbin/mt/plugin/api/ui/PluginUI;->buildHorizontalLayout()Lbin/mt/plugin/api/ui/builder/PluginRootLayoutBuilder;

    move-result-object v0

    const/16 v1, 0x10

    .line 33
    invoke-interface {v0, v1}, Lbin/mt/plugin/api/ui/builder/PluginRootLayoutBuilder;->gravity(I)Lbin/mt/plugin/api/ui/builder/PluginRootLayoutBuilder;

    move-result-object v0

    const/high16 v1, 0x41700000    # 15.0f

    .line 34
    invoke-interface {v0, v1}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->paddingDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object v0

    check-cast v0, Lbin/mt/plugin/api/ui/builder/PluginRootLayoutBuilder;

    .line 36
    invoke-interface {v0}, Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;->addProgressBar()Lbin/mt/plugin/api/ui/builder/PluginProgressBarBuilder;

    move-result-object v0

    sget-object v2, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;->CIRCULAR:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    invoke-interface {v0, v2}, Lbin/mt/plugin/api/ui/builder/PluginProgressBarBuilder;->style(Lbin/mt/plugin/api/ui/PluginProgressBar$Style;)Lbin/mt/plugin/api/ui/builder/PluginProgressBarBuilder;

    move-result-object v0

    .line 38
    invoke-interface {v0}, Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;->addVerticalLayout()Lbin/mt/plugin/api/ui/builder/PluginLinearLayoutBuilder;

    move-result-object v0

    invoke-interface {v0}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->widthMatchParent()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object v0

    check-cast v0, Lbin/mt/plugin/api/ui/builder/PluginLinearLayoutBuilder;

    invoke-interface {v0, v1}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->marginLeftDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object v0

    check-cast v0, Lbin/mt/plugin/api/ui/builder/PluginLinearLayoutBuilder;

    new-instance v1, Ll/ܶ֡ۚ;

    const/4 v2, 0x4

    invoke-direct {v1, v2, p1}, Ll/ܶ֡ۚ;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, v1}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewGroupBuilder;->children(Lbin/mt/plugin/api/util/Consumer;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object v0

    check-cast v0, Lbin/mt/plugin/api/ui/builder/PluginLinearLayoutBuilder;

    .line 46
    invoke-interface {v0}, Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;->build()Lbin/mt/plugin/api/ui/PluginView;

    move-result-object v0

    .line 49
    invoke-interface {p1}, Lbin/mt/plugin/api/ui/PluginUI;->buildDialog()Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;

    move-result-object p1

    invoke-interface {p1, v0}, Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;->setView(Lbin/mt/plugin/api/ui/PluginView;)Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;->setCancelable(Z)Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;

    move-result-object p1

    invoke-interface {p1}, Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;->create()Lbin/mt/plugin/api/ui/dialog/PluginDialog;

    move-result-object p1

    iput-object p1, p0, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->dialog:Lbin/mt/plugin/api/ui/dialog/PluginDialog;

    const-string p1, "message"

    .line 52
    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginView;->requireViewById(Ljava/lang/String;)Lbin/mt/plugin/api/ui/PluginView;

    move-result-object p1

    check-cast p1, Lbin/mt/plugin/api/ui/PluginTextView;

    iput-object p1, p0, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->messageView:Lbin/mt/plugin/api/ui/PluginTextView;

    const-string v1, "secondaryMessage"

    .line 53
    invoke-interface {v0, v1}, Lbin/mt/plugin/api/ui/PluginView;->requireViewById(Ljava/lang/String;)Lbin/mt/plugin/api/ui/PluginView;

    move-result-object v0

    check-cast v0, Lbin/mt/plugin/api/ui/PluginTextView;

    iput-object v0, p0, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->secondaryMessageView:Lbin/mt/plugin/api/ui/PluginTextView;

    .line 56
    new-instance v0, Lbin/mt/plugin/api/util/UIUpdaterGroup;

    invoke-direct {v0}, Lbin/mt/plugin/api/util/UIUpdaterGroup;-><init>()V

    .line 59
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ll/᩶᩶᩻;

    invoke-direct {v1, p1}, Ll/᩶᩶᩻;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lbin/mt/plugin/api/util/UIUpdaterGroup;->registerUpdater(Lbin/mt/plugin/api/util/Consumer;)Lbin/mt/plugin/api/util/UIUpdater;

    move-result-object p1

    iput-object p1, p0, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->messageUpdater:Lbin/mt/plugin/api/util/UIUpdater;

    .line 62
    new-instance p1, Ll/᩸᩸ۜ;

    invoke-direct {p1, p0}, Ll/᩸᩸ۜ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lbin/mt/plugin/api/util/UIUpdaterGroup;->registerUpdater(Lbin/mt/plugin/api/util/Consumer;)Lbin/mt/plugin/api/util/UIUpdater;

    move-result-object p1

    iput-object p1, p0, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->secondaryMessageUpdater:Lbin/mt/plugin/api/util/UIUpdater;

    return-void
.end method

.method public static synthetic access$100(Lbin/mt/plugin/api/ui/dialog/LoadingDialog;)Z
    .locals 0

    .line 21
    iget-boolean p0, p0, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->delayShow:Z

    return p0
.end method

.method public static synthetic access$102(Lbin/mt/plugin/api/ui/dialog/LoadingDialog;Z)Z
    .locals 0

    .line 21
    iput-boolean p1, p0, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->delayShow:Z

    return p1
.end method

.method public static synthetic access$200(Lbin/mt/plugin/api/ui/dialog/LoadingDialog;)Lbin/mt/plugin/api/ui/dialog/PluginDialog;
    .locals 0

    .line 21
    iget-object p0, p0, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->dialog:Lbin/mt/plugin/api/ui/dialog/PluginDialog;

    return-object p0
.end method

.method private synthetic lambda$dismiss$2()V
    .locals 1

    .line 166
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->dialog:Lbin/mt/plugin/api/ui/dialog/PluginDialog;

    invoke-interface {v0}, Lbin/mt/plugin/api/ui/dialog/PluginDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 167
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->dialog:Lbin/mt/plugin/api/ui/dialog/PluginDialog;

    invoke-interface {v0}, Lbin/mt/plugin/api/ui/dialog/PluginDialog;->dismiss()V

    :cond_0
    return-void
.end method

.method public static synthetic lambda$new$0(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V
    .locals 2

    const-string v0, "message"

    .line 40
    invoke-interface {p1, v0}, Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;->addTextView(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;

    move-result-object p1

    const-string v0, "{loading}"

    invoke-interface {p1, v0}, Lbin/mt/plugin/api/ui/builder/PluginBaseTextViewBuilder;->text(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object p1

    check-cast p1, Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;

    invoke-interface {p0}, Lbin/mt/plugin/api/ui/PluginUI;->colorTextStateList()Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-interface {p1, v0}, Lbin/mt/plugin/api/ui/builder/PluginBaseTextViewBuilder;->textColor(Landroid/content/res/ColorStateList;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object p1

    check-cast p1, Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;

    const/high16 v0, 0x41900000    # 18.0f

    invoke-interface {p1, v0}, Lbin/mt/plugin/api/ui/builder/PluginBaseTextViewBuilder;->textSize(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object p1

    check-cast p1, Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;

    .line 41
    invoke-interface {p1}, Lbin/mt/plugin/api/ui/builder/PluginBaseTextViewBuilder;->singleLine()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object p1

    check-cast p1, Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;

    sget-object v0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-interface {p1, v0}, Lbin/mt/plugin/api/ui/builder/PluginBaseTextViewBuilder;->ellipsize(Landroid/text/TextUtils$TruncateAt;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object p1

    check-cast p1, Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;

    const-string v1, "secondaryMessage"

    .line 43
    invoke-interface {p1, v1}, Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;->addTextView(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;

    move-result-object p1

    invoke-interface {p0}, Lbin/mt/plugin/api/ui/PluginUI;->colorTextSecondaryStateList()Landroid/content/res/ColorStateList;

    move-result-object p0

    invoke-interface {p1, p0}, Lbin/mt/plugin/api/ui/builder/PluginBaseTextViewBuilder;->textColor(Landroid/content/res/ColorStateList;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object p0

    check-cast p0, Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;

    const/high16 p1, 0x41600000    # 14.0f

    invoke-interface {p0, p1}, Lbin/mt/plugin/api/ui/builder/PluginBaseTextViewBuilder;->textSize(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object p0

    check-cast p0, Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;

    .line 44
    invoke-interface {p0}, Lbin/mt/plugin/api/ui/builder/PluginBaseTextViewBuilder;->singleLine()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object p0

    check-cast p0, Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;

    invoke-interface {p0, v0}, Lbin/mt/plugin/api/ui/builder/PluginBaseTextViewBuilder;->ellipsize(Landroid/text/TextUtils$TruncateAt;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object p0

    check-cast p0, Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;

    invoke-interface {p0}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->gone()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-void
.end method

.method private synthetic lambda$new$1(Ljava/lang/CharSequence;)V
    .locals 2

    .line 64
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->secondaryMessageView:Lbin/mt/plugin/api/ui/PluginTextView;

    if-nez p1, :cond_0

    const/16 v1, 0x8

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Lbin/mt/plugin/api/ui/PluginView;->setVisibility(I)V

    .line 65
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->secondaryMessageView:Lbin/mt/plugin/api/ui/PluginTextView;

    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginTextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public dismiss()V
    .locals 2

    const/4 v0, 0x0

    .line 164
    iput-boolean v0, p0, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->delayShow:Z

    .line 165
    new-instance v0, Ll/ۡ۫ᩳ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/ۡ۫ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public getDialog()Lbin/mt/plugin/api/ui/dialog/PluginDialog;
    .locals 1

    .line 71
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->dialog:Lbin/mt/plugin/api/ui/dialog/PluginDialog;

    return-object v0
.end method

.method public getMessageView()Lbin/mt/plugin/api/ui/PluginTextView;
    .locals 1

    .line 137
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->messageView:Lbin/mt/plugin/api/ui/PluginTextView;

    return-object v0
.end method

.method public getSecondaryMessageView()Lbin/mt/plugin/api/ui/PluginTextView;
    .locals 1

    .line 146
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->secondaryMessageView:Lbin/mt/plugin/api/ui/PluginTextView;

    return-object v0
.end method

.method public isShowing()Z
    .locals 1

    .line 155
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->dialog:Lbin/mt/plugin/api/ui/dialog/PluginDialog;

    invoke-interface {v0}, Lbin/mt/plugin/api/ui/dialog/PluginDialog;->isShowing()Z

    move-result v0

    return v0
.end method

.method public setMessage(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/ui/dialog/LoadingDialog;
    .locals 1

    .line 81
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->messageUpdater:Lbin/mt/plugin/api/util/UIUpdater;

    invoke-virtual {v0, p1}, Lbin/mt/plugin/api/util/UIUpdater;->submitUpdate(Ljava/lang/Object;)V

    return-object p0
.end method

.method public setSecondaryMessage(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/ui/dialog/LoadingDialog;
    .locals 1

    .line 92
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->secondaryMessageUpdater:Lbin/mt/plugin/api/util/UIUpdater;

    invoke-virtual {v0, p1}, Lbin/mt/plugin/api/util/UIUpdater;->submitUpdate(Ljava/lang/Object;)V

    return-object p0
.end method

.method public show()Lbin/mt/plugin/api/ui/dialog/LoadingDialog;
    .locals 1

    .line 103
    invoke-static {}, Lbin/mt/plugin/api/util/ThreadUtil;->assertInUIThread()V

    .line 104
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->dialog:Lbin/mt/plugin/api/ui/dialog/PluginDialog;

    invoke-interface {v0}, Lbin/mt/plugin/api/ui/dialog/PluginDialog;->show()V

    const/4 v0, 0x0

    .line 105
    iput-boolean v0, p0, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->delayShow:Z

    return-object p0
.end method

.method public showDelay()Lbin/mt/plugin/api/ui/dialog/LoadingDialog;
    .locals 2

    const-wide/16 v0, 0xc8

    .line 115
    invoke-virtual {p0, v0, v1}, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->showDelay(J)Lbin/mt/plugin/api/ui/dialog/LoadingDialog;

    move-result-object v0

    return-object v0
.end method

.method public showDelay(J)Lbin/mt/plugin/api/ui/dialog/LoadingDialog;
    .locals 2

    .line 125
    invoke-static {}, Lbin/mt/plugin/api/util/ThreadUtil;->assertInUIThread()V

    const/4 v0, 0x1

    .line 126
    iput-boolean v0, p0, Lbin/mt/plugin/api/ui/dialog/LoadingDialog;->delayShow:Z

    .line 127
    new-instance v0, Ll/۟ܳ᩷;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll/۟ܳ᩷;-><init>(Lbin/mt/plugin/api/ui/dialog/LoadingDialog;Ll/ܰܳ᩷;)V

    invoke-static {v0, p1, p2}, Lbin/mt/plugin/api/util/ThreadUtil;->postDelayed(Ljava/lang/Runnable;J)V

    return-object p0
.end method
