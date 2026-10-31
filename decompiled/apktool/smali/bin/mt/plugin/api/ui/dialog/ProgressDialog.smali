.class public Lbin/mt/plugin/api/ui/dialog/ProgressDialog;
.super Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;
.source "ProgressDialog.java"


# instance fields
.field public final dialog:Lbin/mt/plugin/api/ui/dialog/PluginDialog;

.field public final messageUpdater:Lbin/mt/plugin/api/util/UIUpdater;

.field public final messageView:Lbin/mt/plugin/api/ui/PluginTextView;

.field public final progressBar:Lbin/mt/plugin/api/ui/PluginProgressBar;

.field public final progressUpdater:Lbin/mt/plugin/api/util/UIUpdater;

.field public final secondaryProgressUpdater:Lbin/mt/plugin/api/util/UIUpdater;

.field public final titleUpdater:Lbin/mt/plugin/api/util/UIUpdater;


# direct methods
.method public static synthetic $r8$lambda$9k-SR9sSmmoOCDIj1lWJ-LZCjcI(Lbin/mt/plugin/api/ui/dialog/ProgressDialog;Z)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->lambda$setIndeterminate$2(Z)V

    return-void
.end method

.method public static synthetic $r8$lambda$RXRVdOP2Ops8JetgN5e2AF0jW18(Lbin/mt/plugin/api/ui/dialog/ProgressDialog;Ljava/lang/CharSequence;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->lambda$new$0(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static synthetic $r8$lambda$nza1UqYLXW35VbrTZGCc_AGDSIU(Lbin/mt/plugin/api/ui/dialog/ProgressDialog;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->lambda$dismiss$3()V

    return-void
.end method

.method public static synthetic $r8$lambda$t485j4PCiZY56SEki8HlB2IF3D8(Lbin/mt/plugin/api/ui/dialog/ProgressDialog;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->lambda$setMaxProgress$1(I)V

    return-void
.end method

.method public constructor <init>(Lbin/mt/plugin/api/ui/PluginUI;)V
    .locals 4

    .line 31
    invoke-direct {p0, p1}, Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;-><init>(Lbin/mt/plugin/api/ui/PluginUI;)V

    .line 33
    invoke-interface {p1}, Lbin/mt/plugin/api/ui/PluginUI;->buildVerticalLayout()Lbin/mt/plugin/api/ui/builder/PluginRootLayoutBuilder;

    move-result-object v0

    .line 34
    invoke-interface {p1}, Lbin/mt/plugin/api/ui/PluginUI;->dialogPaddingHorizontal()I

    move-result v1

    invoke-interface {v0, v1}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->paddingHorizontal(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object v0

    check-cast v0, Lbin/mt/plugin/api/ui/builder/PluginRootLayoutBuilder;

    .line 35
    invoke-interface {p1}, Lbin/mt/plugin/api/ui/PluginUI;->dialogPaddingVertical()I

    move-result v1

    invoke-interface {v0, v1}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->paddingBottom(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object v0

    check-cast v0, Lbin/mt/plugin/api/ui/builder/PluginRootLayoutBuilder;

    const-string v1, "message"

    .line 36
    invoke-interface {v0, v1}, Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;->addTextView(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;

    move-result-object v0

    const/high16 v2, 0x41800000    # 16.0f

    invoke-interface {v0, v2}, Lbin/mt/plugin/api/ui/builder/PluginBaseTextViewBuilder;->textSize(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object v0

    check-cast v0, Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;

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

    const-string v2, "progressBar"

    .line 37
    invoke-interface {v0, v2}, Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;->addProgressBar(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginProgressBarBuilder;

    move-result-object v0

    const/high16 v3, 0x41400000    # 12.0f

    invoke-interface {v0, v3}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->marginTopDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object v0

    check-cast v0, Lbin/mt/plugin/api/ui/builder/PluginProgressBarBuilder;

    .line 38
    invoke-interface {v0}, Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;->build()Lbin/mt/plugin/api/ui/PluginView;

    move-result-object v0

    .line 41
    invoke-interface {p1}, Lbin/mt/plugin/api/ui/PluginUI;->buildDialog()Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;

    move-result-object p1

    invoke-interface {p1, v0}, Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;->setView(Lbin/mt/plugin/api/ui/PluginView;)Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;

    move-result-object p1

    const/4 v3, 0x0

    invoke-interface {p1, v3}, Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;->setCancelable(Z)Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;

    move-result-object p1

    invoke-interface {p1}, Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;->create()Lbin/mt/plugin/api/ui/dialog/PluginDialog;

    move-result-object p1

    iput-object p1, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->dialog:Lbin/mt/plugin/api/ui/dialog/PluginDialog;

    .line 44
    invoke-interface {v0, v1}, Lbin/mt/plugin/api/ui/PluginView;->requireViewById(Ljava/lang/String;)Lbin/mt/plugin/api/ui/PluginView;

    move-result-object v1

    check-cast v1, Lbin/mt/plugin/api/ui/PluginTextView;

    iput-object v1, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->messageView:Lbin/mt/plugin/api/ui/PluginTextView;

    .line 45
    invoke-interface {v0, v2}, Lbin/mt/plugin/api/ui/PluginView;->requireViewById(Ljava/lang/String;)Lbin/mt/plugin/api/ui/PluginView;

    move-result-object v0

    check-cast v0, Lbin/mt/plugin/api/ui/PluginProgressBar;

    iput-object v0, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->progressBar:Lbin/mt/plugin/api/ui/PluginProgressBar;

    .line 48
    new-instance v1, Lbin/mt/plugin/api/util/UIUpdaterGroup;

    invoke-direct {v1}, Lbin/mt/plugin/api/util/UIUpdaterGroup;-><init>()V

    .line 49
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ll/᩻ܶ᩷;

    const/4 v3, 0x5

    invoke-direct {v2, v3, p1}, Ll/᩻ܶ᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v2}, Lbin/mt/plugin/api/util/UIUpdaterGroup;->registerUpdater(Lbin/mt/plugin/api/util/Consumer;)Lbin/mt/plugin/api/util/UIUpdater;

    move-result-object p1

    iput-object p1, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->titleUpdater:Lbin/mt/plugin/api/util/UIUpdater;

    .line 50
    new-instance p1, Ll/ۗۖܳ;

    const/4 v2, 0x5

    invoke-direct {p1, v2, p0}, Ll/ۗۖܳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, p1}, Lbin/mt/plugin/api/util/UIUpdaterGroup;->registerUpdater(Lbin/mt/plugin/api/util/Consumer;)Lbin/mt/plugin/api/util/UIUpdater;

    move-result-object p1

    iput-object p1, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->messageUpdater:Lbin/mt/plugin/api/util/UIUpdater;

    .line 64
    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Ll/ۖ֡ᩳ;

    const/4 v2, 0x6

    invoke-direct {p1, v2, v0}, Ll/ۖ֡ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, p1}, Lbin/mt/plugin/api/util/UIUpdaterGroup;->registerUpdater(Lbin/mt/plugin/api/util/Consumer;)Lbin/mt/plugin/api/util/UIUpdater;

    move-result-object p1

    iput-object p1, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->progressUpdater:Lbin/mt/plugin/api/util/UIUpdater;

    .line 65
    new-instance p1, Ll/ۘ᩹ܽ;

    const/4 v2, 0x7

    invoke-direct {p1, v2, v0}, Ll/ۘ᩹ܽ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, p1}, Lbin/mt/plugin/api/util/UIUpdaterGroup;->registerUpdater(Lbin/mt/plugin/api/util/Consumer;)Lbin/mt/plugin/api/util/UIUpdater;

    move-result-object p1

    iput-object p1, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->secondaryProgressUpdater:Lbin/mt/plugin/api/util/UIUpdater;

    return-void
.end method

.method private synthetic lambda$dismiss$3()V
    .locals 1

    .line 197
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->dialog:Lbin/mt/plugin/api/ui/dialog/PluginDialog;

    invoke-interface {v0}, Lbin/mt/plugin/api/ui/dialog/PluginDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 198
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->dialog:Lbin/mt/plugin/api/ui/dialog/PluginDialog;

    invoke-interface {v0}, Lbin/mt/plugin/api/ui/dialog/PluginDialog;->dismiss()V

    :cond_0
    return-void
.end method

.method private synthetic lambda$new$0(Ljava/lang/CharSequence;)V
    .locals 2

    if-nez p1, :cond_0

    .line 52
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->messageView:Lbin/mt/plugin/api/ui/PluginTextView;

    invoke-interface {v0}, Lbin/mt/plugin/api/ui/PluginView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 53
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->messageView:Lbin/mt/plugin/api/ui/PluginTextView;

    invoke-interface {v0}, Lbin/mt/plugin/api/ui/PluginView;->setGone()V

    .line 54
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->progressBar:Lbin/mt/plugin/api/ui/PluginProgressBar;

    const/high16 v1, 0x41400000    # 12.0f

    invoke-interface {v0, v1}, Lbin/mt/plugin/api/ui/PluginView;->setMarginTopDp(F)V

    goto :goto_0

    .line 57
    :cond_0
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->messageView:Lbin/mt/plugin/api/ui/PluginTextView;

    invoke-interface {v0}, Lbin/mt/plugin/api/ui/PluginView;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    .line 58
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->messageView:Lbin/mt/plugin/api/ui/PluginTextView;

    invoke-interface {v0}, Lbin/mt/plugin/api/ui/PluginView;->setVisible()V

    .line 59
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->progressBar:Lbin/mt/plugin/api/ui/PluginProgressBar;

    const/4 v1, 0x6

    invoke-interface {v0, v1}, Lbin/mt/plugin/api/ui/PluginView;->setMarginTop(I)V

    .line 62
    :cond_1
    :goto_0
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->messageView:Lbin/mt/plugin/api/ui/PluginTextView;

    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginTextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private synthetic lambda$setIndeterminate$2(Z)V
    .locals 1

    .line 141
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->progressBar:Lbin/mt/plugin/api/ui/PluginProgressBar;

    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginProgressBar;->setIndeterminate(Z)V

    return-void
.end method

.method private synthetic lambda$setMaxProgress$1(I)V
    .locals 1

    .line 119
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->progressBar:Lbin/mt/plugin/api/ui/PluginProgressBar;

    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginProgressBar;->setMaxProgress(I)V

    return-void
.end method


# virtual methods
.method public dismiss()V
    .locals 2

    .line 196
    new-instance v0, Ll/᩹ܶ᩷;

    const/4 v1, 0x4

    invoke-direct {v0, v1, p0}, Ll/᩹ܶ᩷;-><init>(ILjava/lang/Object;)V

    invoke-static {v0}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public getDialog()Lbin/mt/plugin/api/ui/dialog/PluginDialog;
    .locals 1

    .line 166
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->dialog:Lbin/mt/plugin/api/ui/dialog/PluginDialog;

    return-object v0
.end method

.method public getMessageView()Lbin/mt/plugin/api/ui/PluginTextView;
    .locals 1

    .line 152
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->messageView:Lbin/mt/plugin/api/ui/PluginTextView;

    return-object v0
.end method

.method public getProgressBar()Lbin/mt/plugin/api/ui/PluginProgressBar;
    .locals 1

    .line 161
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->progressBar:Lbin/mt/plugin/api/ui/PluginProgressBar;

    return-object v0
.end method

.method public isShowing()Z
    .locals 1

    .line 187
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->dialog:Lbin/mt/plugin/api/ui/dialog/PluginDialog;

    invoke-interface {v0}, Lbin/mt/plugin/api/ui/dialog/PluginDialog;->isShowing()Z

    move-result v0

    return v0
.end method

.method public setIndeterminate()Lbin/mt/plugin/api/ui/dialog/ProgressDialog;
    .locals 1

    const/4 v0, 0x1

    .line 129
    invoke-virtual {p0, v0}, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->setIndeterminate(Z)Lbin/mt/plugin/api/ui/dialog/ProgressDialog;

    return-object p0
.end method

.method public setIndeterminate(Z)Lbin/mt/plugin/api/ui/dialog/ProgressDialog;
    .locals 1

    .line 140
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->progressBar:Lbin/mt/plugin/api/ui/PluginProgressBar;

    invoke-interface {v0}, Lbin/mt/plugin/api/ui/PluginProgressBar;->isIndeterminate()Z

    move-result v0

    if-eq v0, p1, :cond_0

    .line 141
    new-instance v0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog$$ExternalSyntheticLambda3;

    invoke-direct {v0, p0, p1}, Lbin/mt/plugin/api/ui/dialog/ProgressDialog$$ExternalSyntheticLambda3;-><init>(Lbin/mt/plugin/api/ui/dialog/ProgressDialog;Z)V

    invoke-static {v0}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-object p0
.end method

.method public setMaxProgress(I)Lbin/mt/plugin/api/ui/dialog/ProgressDialog;
    .locals 1

    .line 119
    new-instance v0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog$$ExternalSyntheticLambda2;

    invoke-direct {v0, p0, p1}, Lbin/mt/plugin/api/ui/dialog/ProgressDialog$$ExternalSyntheticLambda2;-><init>(Lbin/mt/plugin/api/ui/dialog/ProgressDialog;I)V

    invoke-static {v0}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-object p0
.end method

.method public setMessage(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/ui/dialog/ProgressDialog;
    .locals 1

    .line 86
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->messageUpdater:Lbin/mt/plugin/api/util/UIUpdater;

    invoke-virtual {v0, p1}, Lbin/mt/plugin/api/util/UIUpdater;->submitUpdate(Ljava/lang/Object;)V

    return-object p0
.end method

.method public setProgress(I)Lbin/mt/plugin/api/ui/dialog/ProgressDialog;
    .locals 1

    .line 97
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->progressUpdater:Lbin/mt/plugin/api/util/UIUpdater;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lbin/mt/plugin/api/util/UIUpdater;->submitUpdate(Ljava/lang/Object;)V

    return-object p0
.end method

.method public setSecondaryProgress(I)Lbin/mt/plugin/api/ui/dialog/ProgressDialog;
    .locals 1

    .line 108
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->secondaryProgressUpdater:Lbin/mt/plugin/api/util/UIUpdater;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lbin/mt/plugin/api/util/UIUpdater;->submitUpdate(Ljava/lang/Object;)V

    return-object p0
.end method

.method public setTitle(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/ui/dialog/ProgressDialog;
    .locals 1

    .line 75
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->titleUpdater:Lbin/mt/plugin/api/util/UIUpdater;

    invoke-virtual {v0, p1}, Lbin/mt/plugin/api/util/UIUpdater;->submitUpdate(Ljava/lang/Object;)V

    return-object p0
.end method

.method public show()Lbin/mt/plugin/api/ui/dialog/ProgressDialog;
    .locals 1

    .line 176
    invoke-static {}, Lbin/mt/plugin/api/util/ThreadUtil;->assertInUIThread()V

    .line 177
    iget-object v0, p0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->dialog:Lbin/mt/plugin/api/ui/dialog/PluginDialog;

    invoke-interface {v0}, Lbin/mt/plugin/api/ui/dialog/PluginDialog;->show()V

    return-object p0
.end method
