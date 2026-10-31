.class public Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;
.super Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;
.source "DualProgressDialog.java"


# instance fields
.field public final dialog:Lbin/mt/plugin/api/ui/dialog/PluginDialog;

.field public final messageUpdater:Lbin/mt/plugin/api/util/UIUpdater;

.field public final messageView:Lbin/mt/plugin/api/ui/PluginTextView;

.field public final subProgressBar:Lbin/mt/plugin/api/ui/PluginProgressBar;

.field public final subProgressUpdater:Lbin/mt/plugin/api/util/UIUpdater;

.field public final titleUpdater:Lbin/mt/plugin/api/util/UIUpdater;

.field public final totalProgressBar:Lbin/mt/plugin/api/ui/PluginProgressBar;

.field public final totalProgressUpdater:Lbin/mt/plugin/api/util/UIUpdater;


# direct methods
.method public static synthetic $r8$lambda$Iygjd31m4yf-wFEZNciUMMkZCho(Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->lambda$dismiss$3()V

    return-void
.end method

.method public static synthetic $r8$lambda$U6BvPZo3qklSrHzran95HOO0iaU(Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->lambda$setMaxTotalProgress$2(I)V

    return-void
.end method

.method public static synthetic $r8$lambda$YGoc72W4PaVci462hvbeS0iWXII(Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->lambda$setMaxSubProgress$1(I)V

    return-void
.end method

.method public static synthetic $r8$lambda$diHaj3KVLD4f9HLhcnX74q8TZMQ(Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;Ljava/lang/CharSequence;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->lambda$new$0(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public constructor <init>(Lbin/mt/plugin/api/ui/PluginUI;)V
    .locals 5

    .line 32
    invoke-direct {p0, p1}, Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;-><init>(Lbin/mt/plugin/api/ui/PluginUI;)V

    .line 34
    invoke-interface {p1}, Lbin/mt/plugin/api/ui/PluginUI;->buildVerticalLayout()Lbin/mt/plugin/api/ui/builder/PluginRootLayoutBuilder;

    move-result-object v0

    .line 35
    invoke-interface {p1}, Lbin/mt/plugin/api/ui/PluginUI;->dialogPaddingHorizontal()I

    move-result v1

    invoke-interface {v0, v1}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->paddingHorizontal(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object v0

    check-cast v0, Lbin/mt/plugin/api/ui/builder/PluginRootLayoutBuilder;

    .line 36
    invoke-interface {p1}, Lbin/mt/plugin/api/ui/PluginUI;->dialogPaddingVertical()I

    move-result v1

    invoke-interface {v0, v1}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->paddingBottom(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object v0

    check-cast v0, Lbin/mt/plugin/api/ui/builder/PluginRootLayoutBuilder;

    const-string v1, "message"

    .line 37
    invoke-interface {v0, v1}, Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;->addTextView(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;

    move-result-object v0

    invoke-interface {v0}, Lbin/mt/plugin/api/ui/builder/PluginBaseTextViewBuilder;->singleLine()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object v0

    check-cast v0, Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;

    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-interface {v0, v2}, Lbin/mt/plugin/api/ui/builder/PluginBaseTextViewBuilder;->ellipsize(Landroid/text/TextUtils$TruncateAt;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object v0

    check-cast v0, Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;

    const/high16 v2, 0x41000000    # 8.0f

    invoke-interface {v0, v2}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->marginTopDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object v0

    check-cast v0, Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;

    invoke-interface {v0}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->gone()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object v0

    check-cast v0, Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;

    const-string v2, "subProgressBar"

    .line 38
    invoke-interface {v0, v2}, Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;->addProgressBar(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginProgressBarBuilder;

    move-result-object v0

    const/high16 v3, 0x41400000    # 12.0f

    invoke-interface {v0, v3}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->marginTopDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object v0

    check-cast v0, Lbin/mt/plugin/api/ui/builder/PluginProgressBarBuilder;

    .line 39
    invoke-interface {v0}, Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;->addTextView()Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;

    move-result-object v0

    const-string v3, "{dual_progress_dialog_total}"

    invoke-interface {v0, v3}, Lbin/mt/plugin/api/ui/builder/PluginBaseTextViewBuilder;->text(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object v0

    check-cast v0, Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;

    const/high16 v3, 0x40c00000    # 6.0f

    invoke-interface {v0, v3}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->marginTopDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object v0

    check-cast v0, Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;

    const-string v4, "totalProgressBar"

    .line 40
    invoke-interface {v0, v4}, Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;->addProgressBar(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginProgressBarBuilder;

    move-result-object v0

    invoke-interface {v0, v3}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->marginTopDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object v0

    check-cast v0, Lbin/mt/plugin/api/ui/builder/PluginProgressBarBuilder;

    .line 41
    invoke-interface {v0}, Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;->build()Lbin/mt/plugin/api/ui/PluginView;

    move-result-object v0

    .line 44
    invoke-interface {p1}, Lbin/mt/plugin/api/ui/PluginUI;->buildDialog()Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;

    move-result-object p1

    invoke-interface {p1, v0}, Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;->setView(Lbin/mt/plugin/api/ui/PluginView;)Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;

    move-result-object p1

    const/4 v3, 0x0

    invoke-interface {p1, v3}, Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;->setCancelable(Z)Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;

    move-result-object p1

    invoke-interface {p1}, Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;->create()Lbin/mt/plugin/api/ui/dialog/PluginDialog;

    move-result-object p1

    iput-object p1, p0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->dialog:Lbin/mt/plugin/api/ui/dialog/PluginDialog;

    .line 47
    invoke-interface {v0, v1}, Lbin/mt/plugin/api/ui/PluginView;->requireViewById(Ljava/lang/String;)Lbin/mt/plugin/api/ui/PluginView;

    move-result-object v1

    check-cast v1, Lbin/mt/plugin/api/ui/PluginTextView;

    iput-object v1, p0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->messageView:Lbin/mt/plugin/api/ui/PluginTextView;

    .line 48
    invoke-interface {v0, v2}, Lbin/mt/plugin/api/ui/PluginView;->requireViewById(Ljava/lang/String;)Lbin/mt/plugin/api/ui/PluginView;

    move-result-object v1

    check-cast v1, Lbin/mt/plugin/api/ui/PluginProgressBar;

    iput-object v1, p0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->subProgressBar:Lbin/mt/plugin/api/ui/PluginProgressBar;

    .line 49
    invoke-interface {v0, v4}, Lbin/mt/plugin/api/ui/PluginView;->requireViewById(Ljava/lang/String;)Lbin/mt/plugin/api/ui/PluginView;

    move-result-object v0

    check-cast v0, Lbin/mt/plugin/api/ui/PluginProgressBar;

    iput-object v0, p0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->totalProgressBar:Lbin/mt/plugin/api/ui/PluginProgressBar;

    .line 52
    new-instance v2, Lbin/mt/plugin/api/util/UIUpdaterGroup;

    invoke-direct {v2}, Lbin/mt/plugin/api/util/UIUpdaterGroup;-><init>()V

    .line 53
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Ll/᩻ܶ᩷;

    const/4 v4, 0x5

    invoke-direct {v3, v4, p1}, Ll/᩻ܶ᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, v3}, Lbin/mt/plugin/api/util/UIUpdaterGroup;->registerUpdater(Lbin/mt/plugin/api/util/Consumer;)Lbin/mt/plugin/api/util/UIUpdater;

    move-result-object p1

    iput-object p1, p0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->titleUpdater:Lbin/mt/plugin/api/util/UIUpdater;

    .line 54
    new-instance p1, Ll/᩻ۨۡ;

    invoke-direct {p1, p0}, Ll/᩻ۨۡ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lbin/mt/plugin/api/util/UIUpdaterGroup;->registerUpdater(Lbin/mt/plugin/api/util/Consumer;)Lbin/mt/plugin/api/util/UIUpdater;

    move-result-object p1

    iput-object p1, p0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->messageUpdater:Lbin/mt/plugin/api/util/UIUpdater;

    .line 68
    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Ll/ۖ֡ᩳ;

    const/4 v3, 0x6

    invoke-direct {p1, v3, v1}, Ll/ۖ֡ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, p1}, Lbin/mt/plugin/api/util/UIUpdaterGroup;->registerUpdater(Lbin/mt/plugin/api/util/Consumer;)Lbin/mt/plugin/api/util/UIUpdater;

    move-result-object p1

    iput-object p1, p0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->subProgressUpdater:Lbin/mt/plugin/api/util/UIUpdater;

    .line 69
    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Ll/ۖ֡ᩳ;

    const/4 v1, 0x6

    invoke-direct {p1, v1, v0}, Ll/ۖ֡ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, p1}, Lbin/mt/plugin/api/util/UIUpdaterGroup;->registerUpdater(Lbin/mt/plugin/api/util/Consumer;)Lbin/mt/plugin/api/util/UIUpdater;

    move-result-object p1

    iput-object p1, p0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->totalProgressUpdater:Lbin/mt/plugin/api/util/UIUpdater;

    return-void
.end method

.method private synthetic lambda$dismiss$3()V
    .locals 1

    .line 198
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->dialog:Lbin/mt/plugin/api/ui/dialog/PluginDialog;

    invoke-interface {v0}, Lbin/mt/plugin/api/ui/dialog/PluginDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 199
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->dialog:Lbin/mt/plugin/api/ui/dialog/PluginDialog;

    invoke-interface {v0}, Lbin/mt/plugin/api/ui/dialog/PluginDialog;->dismiss()V

    :cond_0
    return-void
.end method

.method private synthetic lambda$new$0(Ljava/lang/CharSequence;)V
    .locals 2

    if-nez p1, :cond_0

    .line 56
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->messageView:Lbin/mt/plugin/api/ui/PluginTextView;

    invoke-interface {v0}, Lbin/mt/plugin/api/ui/PluginView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 57
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->messageView:Lbin/mt/plugin/api/ui/PluginTextView;

    invoke-interface {v0}, Lbin/mt/plugin/api/ui/PluginView;->setGone()V

    .line 58
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->subProgressBar:Lbin/mt/plugin/api/ui/PluginProgressBar;

    const/high16 v1, 0x41400000    # 12.0f

    invoke-interface {v0, v1}, Lbin/mt/plugin/api/ui/PluginView;->setMarginTopDp(F)V

    goto :goto_0

    .line 61
    :cond_0
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->messageView:Lbin/mt/plugin/api/ui/PluginTextView;

    invoke-interface {v0}, Lbin/mt/plugin/api/ui/PluginView;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    .line 62
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->messageView:Lbin/mt/plugin/api/ui/PluginTextView;

    invoke-interface {v0}, Lbin/mt/plugin/api/ui/PluginView;->setVisible()V

    .line 63
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->subProgressBar:Lbin/mt/plugin/api/ui/PluginProgressBar;

    const/4 v1, 0x6

    invoke-interface {v0, v1}, Lbin/mt/plugin/api/ui/PluginView;->setMarginTop(I)V

    .line 66
    :cond_1
    :goto_0
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->messageView:Lbin/mt/plugin/api/ui/PluginTextView;

    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginTextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private synthetic lambda$setMaxSubProgress$1(I)V
    .locals 1

    .line 123
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->subProgressBar:Lbin/mt/plugin/api/ui/PluginProgressBar;

    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginProgressBar;->setMaxProgress(I)V

    return-void
.end method

.method private synthetic lambda$setMaxTotalProgress$2(I)V
    .locals 1

    .line 134
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->totalProgressBar:Lbin/mt/plugin/api/ui/PluginProgressBar;

    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginProgressBar;->setMaxProgress(I)V

    return-void
.end method


# virtual methods
.method public dismiss()V
    .locals 2

    .line 197
    new-instance v0, Ll/ᩴ᩷ܳ;

    const/4 v1, 0x4

    invoke-direct {v0, v1, p0}, Ll/ᩴ᩷ܳ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public getDialog()Lbin/mt/plugin/api/ui/dialog/PluginDialog;
    .locals 1

    .line 167
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->dialog:Lbin/mt/plugin/api/ui/dialog/PluginDialog;

    return-object v0
.end method

.method public getMessageView()Lbin/mt/plugin/api/ui/PluginTextView;
    .locals 1

    .line 144
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->messageView:Lbin/mt/plugin/api/ui/PluginTextView;

    return-object v0
.end method

.method public getSubProgressBar()Lbin/mt/plugin/api/ui/PluginProgressBar;
    .locals 1

    .line 153
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->subProgressBar:Lbin/mt/plugin/api/ui/PluginProgressBar;

    return-object v0
.end method

.method public getTotalProgressBar()Lbin/mt/plugin/api/ui/PluginProgressBar;
    .locals 1

    .line 162
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->totalProgressBar:Lbin/mt/plugin/api/ui/PluginProgressBar;

    return-object v0
.end method

.method public isShowing()Z
    .locals 1

    .line 188
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->dialog:Lbin/mt/plugin/api/ui/dialog/PluginDialog;

    invoke-interface {v0}, Lbin/mt/plugin/api/ui/dialog/PluginDialog;->isShowing()Z

    move-result v0

    return v0
.end method

.method public setMaxSubProgress(I)Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;
    .locals 2

    .line 123
    new-instance v0, Ll/֫ۚܿ;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1, p0}, Ll/֫ۚܿ;-><init>(IILjava/lang/Object;)V

    invoke-static {v0}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-object p0
.end method

.method public setMaxTotalProgress(I)Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;
    .locals 1

    .line 134
    new-instance v0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog$$ExternalSyntheticLambda3;

    invoke-direct {v0, p0, p1}, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog$$ExternalSyntheticLambda3;-><init>(Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;I)V

    invoke-static {v0}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-object p0
.end method

.method public setMessage(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;
    .locals 1

    .line 90
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->messageUpdater:Lbin/mt/plugin/api/util/UIUpdater;

    invoke-virtual {v0, p1}, Lbin/mt/plugin/api/util/UIUpdater;->submitUpdate(Ljava/lang/Object;)V

    return-object p0
.end method

.method public setSubProgress(I)Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;
    .locals 1

    .line 101
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->subProgressUpdater:Lbin/mt/plugin/api/util/UIUpdater;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lbin/mt/plugin/api/util/UIUpdater;->submitUpdate(Ljava/lang/Object;)V

    return-object p0
.end method

.method public setTitle(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;
    .locals 1

    .line 79
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->titleUpdater:Lbin/mt/plugin/api/util/UIUpdater;

    invoke-virtual {v0, p1}, Lbin/mt/plugin/api/util/UIUpdater;->submitUpdate(Ljava/lang/Object;)V

    return-object p0
.end method

.method public setTotalProgress(I)Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;
    .locals 1

    .line 112
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->totalProgressUpdater:Lbin/mt/plugin/api/util/UIUpdater;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lbin/mt/plugin/api/util/UIUpdater;->submitUpdate(Ljava/lang/Object;)V

    return-object p0
.end method

.method public show()Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;
    .locals 1

    .line 177
    invoke-static {}, Lbin/mt/plugin/api/util/ThreadUtil;->assertInUIThread()V

    .line 178
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/DualProgressDialog;->dialog:Lbin/mt/plugin/api/ui/dialog/PluginDialog;

    invoke-interface {v0}, Lbin/mt/plugin/api/ui/dialog/PluginDialog;->show()V

    return-object p0
.end method
