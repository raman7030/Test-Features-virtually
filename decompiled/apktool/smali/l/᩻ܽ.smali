.class public Ll/᩻ܽ;
.super Ll/ۙ᩹;
.source "V22O"

# interfaces
.implements Ll/۬ܺ֫;
.implements Ll/ۙۢ֫;
.implements Ll/᩹۫ۧ;
.implements Ll/᩺ܽ;
.implements Ll/֡ᩳ;
.implements Ll/ۗۙ;
.implements Ll/۬ۙ;
.implements Ll/ۤ᩶;
.implements Ll/ۛ᩶;
.implements Ll/᩶ۛ;


# static fields
.field public static final synthetic ᩻֫:I


# instance fields
.field public final ֫֫:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public ۗ:Z

.field public ۙ:Ll/ۖܺ֫;

.field public final ۛ:Ll/۫ۛ;

.field public final ۟:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final ۤ:Ll/᩷ۡ֫;

.field public final ۧ֫:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final ۨ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ۫:Ll/ᩴܽ;

.field public ۬:Z

.field public final ܰ:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public ܳ֫:Ll/ۗܺ֫;

.field public final ܽ֫:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final ܿ֫:Ll/᩸۫ۧ;

.field public final ᩳ֫:Ll/ܳܽ;

.field public final ᩶:Ll/ܿᩳ;

.field public final ᩹:Ll/᩵ᩳ;

.field public ᩺:Ll/ۨܽ;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 263
    invoke-direct {p0}, Ll/ۙ᩹;-><init>()V

    .line 143
    new-instance v0, Ll/ܿᩳ;

    invoke-direct {v0}, Ll/ܿᩳ;-><init>()V

    iput-object v0, p0, Ll/᩻ܽ;->᩶:Ll/ܿᩳ;

    .line 144
    new-instance v1, Ll/۫ۛ;

    new-instance v2, Ll/᩺ۤᩳ;

    const/4 v3, 0x1

    invoke-direct {v2, v3, p0}, Ll/᩺ۤᩳ;-><init>(ILjava/lang/Object;)V

    invoke-direct {v1, v2}, Ll/۫ۛ;-><init>(Ljava/lang/Runnable;)V

    iput-object v1, p0, Ll/᩻ܽ;->ۛ:Ll/۫ۛ;

    .line 145
    new-instance v1, Ll/᩷ۡ֫;

    invoke-direct {v1, p0}, Ll/᩷ۡ֫;-><init>(Ll/᩻ۡ֫;)V

    iput-object v1, p0, Ll/᩻ܽ;->ۤ:Ll/᩷ۡ֫;

    .line 92
    new-instance v2, Ll/᩸۫ۧ;

    invoke-direct {v2, p0}, Ll/᩸۫ۧ;-><init>(Ll/᩹۫ۧ;)V

    .line 148
    iput-object v2, p0, Ll/᩻ܽ;->ܿ֫:Ll/᩸۫ۧ;

    const/4 v3, 0x0

    .line 154
    iput-object v3, p0, Ll/᩻ܽ;->᩺:Ll/ۨܽ;

    .line 1144
    new-instance v3, Ll/ܳܽ;

    invoke-direct {v3, p0}, Ll/ܳܽ;-><init>(Ll/᩻ܽ;)V

    .line 156
    iput-object v3, p0, Ll/᩻ܽ;->ᩳ֫:Ll/ܳܽ;

    .line 158
    new-instance v4, Ll/ᩴܽ;

    new-instance v5, Ll/ۗۧ;

    invoke-direct {v5, p0}, Ll/ۗۧ;-><init>(Ll/᩻ܽ;)V

    invoke-direct {v4, v3, v5}, Ll/ᩴܽ;-><init>(Ljava/util/concurrent/Executor;Ll/ۗۧ;)V

    iput-object v4, p0, Ll/᩻ܽ;->۫:Ll/ᩴܽ;

    .line 170
    new-instance v3, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v3, p0, Ll/᩻ܽ;->ۨ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 172
    new-instance v3, Ll/ۨۧ;

    invoke-direct {v3, p0}, Ll/ۨۧ;-><init>(Ll/᩻ܽ;)V

    iput-object v3, p0, Ll/᩻ܽ;->᩹:Ll/᩵ᩳ;

    .line 244
    new-instance v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v3, p0, Ll/᩻ܽ;->ܰ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 246
    new-instance v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v3, p0, Ll/᩻ܽ;->ܽ֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 248
    new-instance v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v3, p0, Ll/᩻ܽ;->֫֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 250
    new-instance v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v3, p0, Ll/᩻ܽ;->۟:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 252
    new-instance v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v3, p0, Ll/᩻ܽ;->ۧ֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 v3, 0x0

    .line 255
    iput-boolean v3, p0, Ll/᩻ܽ;->ۗ:Z

    .line 256
    iput-boolean v3, p0, Ll/᩻ܽ;->۬:Z

    .line 272
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 273
    new-instance v4, Ll/᩺ۧ;

    invoke-direct {v4, p0}, Ll/᩺ۧ;-><init>(Ll/᩻ܽ;)V

    invoke-virtual {v1, v4}, Ll/᩷ۡ֫;->֫(Ll/ܳۡ֫;)V

    .line 287
    new-instance v4, Ll/ܰۧ;

    invoke-direct {v4, p0}, Ll/ܰۧ;-><init>(Ll/᩻ܽ;)V

    invoke-virtual {v1, v4}, Ll/᩷ۡ֫;->֫(Ll/ܳۡ֫;)V

    .line 302
    new-instance v4, Ll/۟ۧ;

    invoke-direct {v4, p0}, Ll/۟ۧ;-><init>(Ll/᩻ܽ;)V

    invoke-virtual {v1, v4}, Ll/᩷ۡ֫;->֫(Ll/ܳۡ֫;)V

    .line 310
    invoke-virtual {v2}, Ll/᩸۫ۧ;->ۧ()V

    .line 311
    invoke-static {p0}, Ll/᩷ܺ֫;->֫(Ll/᩹۫ۧ;)V

    const/16 v4, 0x17

    if-gt v3, v4, :cond_0

    .line 314
    new-instance v3, Ll/᩵ܽ;

    invoke-direct {v3, p0}, Ll/᩵ܽ;-><init>(Ll/᩻ܽ;)V

    invoke-virtual {v1, v3}, Ll/᩷ۡ֫;->֫(Ll/ܳۡ֫;)V

    .line 737
    :cond_0
    invoke-virtual {v2}, Ll/᩸۫ۧ;->֫()Ll/ܶ۫ۧ;

    move-result-object v1

    .line 316
    new-instance v2, Ll/۬ۧ;

    invoke-direct {v2, p0}, Ll/۬ۧ;-><init>(Ll/᩻ܽ;)V

    const-string v3, "android:support:activity-result"

    invoke-virtual {v1, v3, v2}, Ll/ܶ۫ۧ;->֫(Ljava/lang/String;Ll/۠۫ۧ;)V

    .line 322
    new-instance v1, Ll/۫ۧ;

    invoke-direct {v1, p0}, Ll/۫ۧ;-><init>(Ll/᩻ܽ;)V

    .line 499
    invoke-virtual {v0, v1}, Ll/ܿᩳ;->֫(Ll/ܳᩳ;)V

    return-void
.end method

.method public static ֫(Ll/᩻ܽ;)V
    .locals 2

    .line 737
    iget-object v0, p0, Ll/᩻ܽ;->ܿ֫:Ll/᩸۫ۧ;

    invoke-virtual {v0}, Ll/᩸۫ۧ;->֫()Ll/ܶ۫ۧ;

    move-result-object v0

    const-string v1, "android:support:activity-result"

    .line 324
    invoke-virtual {v0, v1}, Ll/ܶ۫ۧ;->֫(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 326
    iget-object p0, p0, Ll/᩻ܽ;->᩹:Ll/᩵ᩳ;

    invoke-virtual {p0, v0}, Ll/᩵ᩳ;->֫(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public static synthetic ۧ(Ll/᩻ܽ;)Landroid/os/Bundle;
    .locals 1

    .line 318
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 319
    iget-object p0, p0, Ll/᩻ܽ;->᩹:Ll/᩵ᩳ;

    invoke-virtual {p0, v0}, Ll/᩵ᩳ;->ۧ(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public static synthetic ܽ(Ll/᩻ܽ;)V
    .locals 0

    .line 119
    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    return-void
.end method

.method public static synthetic ᩳ(Ll/᩻ܽ;)Ll/ۨܽ;
    .locals 0

    .line 119
    iget-object p0, p0, Ll/᩻ܽ;->᩺:Ll/ۨܽ;

    return-object p0
.end method


# virtual methods
.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness",
                "MissingNullability"
            }
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup$LayoutParams;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness",
                "MissingNullability"
            }
        .end annotation
    .end param

    .line 463
    invoke-virtual {p0}, Ll/᩻ܽ;->᩷()V

    .line 464
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Ll/᩻ܽ;->ᩳ֫:Ll/ܳܽ;

    invoke-virtual {v1, v0}, Ll/ܳܽ;->֫(Landroid/view/View;)V

    .line 465
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final addMenuProvider(Ll/ۨۛ;)V
    .locals 1

    .line 545
    iget-object v0, p0, Ll/᩻ܽ;->ۛ:Ll/۫ۛ;

    invoke-virtual {v0, p1}, Ll/۫ۛ;->֫(Ll/ۨۛ;)V

    return-void
.end method

.method public final getDefaultViewModelCreationExtras()Ll/۟ܺ֫;
    .locals 4

    .line 648
    new-instance v0, Ll/ܽۖ֫;

    invoke-direct {v0}, Ll/ܽۖ֫;-><init>()V

    .line 649
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 650
    sget-object v1, Ll/۠ܺ֫;->ᩳ:Ll/ܰܺ֫;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v2

    .line 61
    invoke-virtual {v0}, Ll/۟ܺ֫;->֫()Ljava/util/LinkedHashMap;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 652
    :cond_0
    sget-object v1, Ll/᩷ܺ֫;->ۧ:Ll/ܳܺ֫;

    .line 61
    invoke-virtual {v0}, Ll/۟ܺ֫;->֫()Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-interface {v2, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 653
    sget-object v1, Ll/᩷ܺ֫;->ܽ:Ll/᩻ܺ֫;

    .line 61
    invoke-virtual {v0}, Ll/۟ܺ֫;->֫()Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-interface {v2, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 654
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 655
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    .line 61
    invoke-virtual {v0}, Ll/۟ܺ֫;->֫()Ljava/util/LinkedHashMap;

    move-result-object v2

    sget-object v3, Ll/᩷ܺ֫;->֫:Ll/ܿܺ֫;

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public final getDefaultViewModelProviderFactory()Ll/ܶܺ֫;
    .locals 3

    .line 628
    iget-object v0, p0, Ll/᩻ܽ;->ۙ:Ll/ۖܺ֫;

    if-nez v0, :cond_1

    .line 629
    new-instance v0, Ll/ۖܺ֫;

    .line 630
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    .line 632
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-direct {v0, v1, p0, v2}, Ll/ۖܺ֫;-><init>(Landroid/app/Application;Ll/᩹۫ۧ;Landroid/os/Bundle;)V

    iput-object v0, p0, Ll/᩻ܽ;->ۙ:Ll/ۖܺ֫;

    .line 634
    :cond_1
    iget-object v0, p0, Ll/᩻ܽ;->ۙ:Ll/ۖܺ֫;

    return-object v0
.end method

.method public final getLifecycle()Ll/۟ۢ֫;
    .locals 1

    .line 586
    iget-object v0, p0, Ll/᩻ܽ;->ۤ:Ll/᩷ۡ֫;

    return-object v0
.end method

.method public final getOnBackPressedDispatcher()Ll/ۨܽ;
    .locals 2

    .line 689
    iget-object v0, p0, Ll/᩻ܽ;->᩺:Ll/ۨܽ;

    if-nez v0, :cond_0

    .line 690
    new-instance v0, Ll/ۨܽ;

    new-instance v1, Ll/֫ܽ;

    invoke-direct {v1, p0}, Ll/֫ܽ;-><init>(Ll/᩻ܽ;)V

    invoke-direct {v0, v1}, Ll/ۨܽ;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Ll/᩻ܽ;->᩺:Ll/ۨܽ;

    .line 714
    new-instance v0, Ll/ۧܽ;

    invoke-direct {v0, p0}, Ll/ۧܽ;-><init>(Ll/᩻ܽ;)V

    iget-object v1, p0, Ll/᩻ܽ;->ۤ:Ll/᩷ۡ֫;

    invoke-virtual {v1, v0}, Ll/᩷ۡ֫;->֫(Ll/ܳۡ֫;)V

    .line 731
    :cond_0
    iget-object v0, p0, Ll/᩻ܽ;->᩺:Ll/ۨܽ;

    return-object v0
.end method

.method public final getSavedStateRegistry()Ll/ܶ۫ۧ;
    .locals 1

    .line 737
    iget-object v0, p0, Ll/᩻ܽ;->ܿ֫:Ll/᩸۫ۧ;

    invoke-virtual {v0}, Ll/᩸۫ۧ;->֫()Ll/ܶ۫ۧ;

    move-result-object v0

    return-object v0
.end method

.method public final getViewModelStore()Ll/ۗܺ֫;
    .locals 2

    .line 602
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 606
    invoke-virtual {p0}, Ll/᩻ܽ;->ۜ()V

    .line 607
    iget-object v0, p0, Ll/᩻ܽ;->ܳ֫:Ll/ۗܺ֫;

    return-object v0

    .line 603
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Your activity is not yet attached to the Application instance. You can\'t request ViewModel before onCreate call."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 845
    iget-object v0, p0, Ll/᩻ܽ;->᩹:Ll/᩵ᩳ;

    invoke-virtual {v0, p1, p2, p3}, Ll/᩵ᩳ;->֫(IILandroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 846
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 678
    invoke-virtual {p0}, Ll/᩻ܽ;->getOnBackPressedDispatcher()Ll/ۨܽ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨܽ;->֫()V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 917
    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 918
    iget-object v0, p0, Ll/᩻ܽ;->ܰ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ۤ;

    .line 919
    invoke-interface {v1, p1}, Ll/۬ۤ;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 357
    iget-object v0, p0, Ll/᩻ܽ;->ܿ֫:Ll/᩸۫ۧ;

    invoke-virtual {v0, p1}, Ll/᩸۫ۧ;->֫(Landroid/os/Bundle;)V

    .line 358
    iget-object v0, p0, Ll/᩻ܽ;->᩶:Ll/ܿᩳ;

    invoke-virtual {v0, p0}, Ll/ܿᩳ;->֫(Ll/᩻ܽ;)V

    .line 359
    invoke-super {p0, p1}, Ll/ۙ᩹;->onCreate(Landroid/os/Bundle;)V

    .line 0
    sget p1, Ll/ܰۡ֫;->᩹:I

    invoke-static {p0}, Ll/ۛۡ֫;->֫(Landroid/app/Activity;)V

    return-void
.end method

.method public final onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 1

    if-nez p1, :cond_0

    .line 520
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 521
    iget-object p1, p0, Ll/᩻ܽ;->ۛ:Ll/۫ۛ;

    invoke-virtual {p0}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Ll/۫ۛ;->֫(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    .line 528
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-nez p1, :cond_1

    .line 532
    iget-object p1, p0, Ll/᩻ܽ;->ۛ:Ll/۫ۛ;

    invoke-virtual {p1, p2}, Ll/۫ۛ;->֫(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final onMultiWindowModeChanged(Z)V
    .locals 3

    .line 1005
    iget-boolean v0, p0, Ll/᩻ܽ;->ۗ:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 1008
    :cond_0
    iget-object v0, p0, Ll/᩻ܽ;->۟:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ۤ;

    .line 1009
    new-instance v2, Ll/ܽ᩶;

    invoke-direct {v2, p1}, Ll/ܽ᩶;-><init>(Z)V

    invoke-interface {v1, v2}, Ll/۬ۤ;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final onMultiWindowModeChanged(ZLandroid/content/res/Configuration;)V
    .locals 4

    const/4 v0, 0x1

    .line 1024
    iput-boolean v0, p0, Ll/᩻ܽ;->ۗ:Z

    const/4 v0, 0x0

    .line 1029
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMultiWindowModeChanged(ZLandroid/content/res/Configuration;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1031
    iput-boolean v0, p0, Ll/᩻ܽ;->ۗ:Z

    .line 1033
    iget-object v0, p0, Ll/᩻ܽ;->۟:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ۤ;

    .line 1034
    new-instance v2, Ll/ܽ᩶;

    const-string v3, "newConfig"

    .line 0
    invoke-static {p2, v3}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    invoke-direct {v2, p1}, Ll/ܽ᩶;-><init>(Z)V

    .line 1034
    invoke-interface {v1, v2}, Ll/۬ۤ;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 1031
    iput-boolean v0, p0, Ll/᩻ܽ;->ۗ:Z

    .line 1032
    throw p1
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 2
    .param p1    # Landroid/content/Intent;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness",
                "MissingNullability"
            }
        .end annotation
    .end param

    .line 972
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    .line 973
    iget-object v0, p0, Ll/᩻ܽ;->֫֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ۤ;

    .line 974
    invoke-interface {v1, p1}, Ll/۬ۤ;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 1

    .line 539
    iget-object v0, p0, Ll/᩻ܽ;->ۛ:Ll/۫ۛ;

    invoke-virtual {v0, p2}, Ll/۫ۛ;->֫(Landroid/view/Menu;)V

    .line 540
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPanelClosed(ILandroid/view/Menu;)V

    return-void
.end method

.method public final onPictureInPictureModeChanged(Z)V
    .locals 3

    .line 1065
    iget-boolean v0, p0, Ll/᩻ܽ;->۬:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 1070
    :cond_0
    iget-object v0, p0, Ll/᩻ܽ;->ۧ֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ۤ;

    .line 1071
    new-instance v2, Ll/۟᩶;

    invoke-direct {v2, p1}, Ll/۟᩶;-><init>(Z)V

    invoke-interface {v1, v2}, Ll/۬ۤ;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final onPictureInPictureModeChanged(ZLandroid/content/res/Configuration;)V
    .locals 4

    const/4 v0, 0x1

    .line 1086
    iput-boolean v0, p0, Ll/᩻ܽ;->۬:Z

    const/4 v0, 0x0

    .line 1091
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPictureInPictureModeChanged(ZLandroid/content/res/Configuration;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1093
    iput-boolean v0, p0, Ll/᩻ܽ;->۬:Z

    .line 1096
    iget-object v0, p0, Ll/᩻ܽ;->ۧ֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ۤ;

    .line 1097
    new-instance v2, Ll/۟᩶;

    const-string v3, "newConfig"

    .line 0
    invoke-static {p2, v3}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    invoke-direct {v2, p1}, Ll/۟᩶;-><init>(Z)V

    .line 1097
    invoke-interface {v1, v2}, Ll/۬ۤ;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 1093
    iput-boolean v0, p0, Ll/᩻ܽ;->۬:Z

    .line 1094
    throw p1
.end method

.method public final onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 0

    if-nez p1, :cond_0

    .line 511
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 512
    iget-object p1, p0, Ll/᩻ܽ;->ۛ:Ll/۫ۛ;

    invoke-virtual {p1, p3}, Ll/۫ۛ;->ۧ(Landroid/view/Menu;)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 870
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "androidx.activity.result.contract.extra.PERMISSIONS"

    .line 871
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"

    .line 872
    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[I)Landroid/content/Intent;

    move-result-object v0

    .line 870
    iget-object v1, p0, Ll/᩻ܽ;->᩹:Ll/᩵ᩳ;

    const/4 v2, -0x1

    invoke-virtual {v1, p1, v2, v0}, Ll/᩵ᩳ;->֫(IILandroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 873
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 874
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    :cond_0
    return-void
.end method

.method public final onRetainNonConfigurationInstance()Ljava/lang/Object;
    .locals 2

    .line 389
    iget-object v0, p0, Ll/᩻ܽ;->ܳ֫:Ll/ۗܺ֫;

    if-nez v0, :cond_0

    .line 394
    invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳܽ;

    if-eqz v1, :cond_0

    .line 396
    iget-object v0, v1, Ll/ᩳܽ;->֫:Ll/ۗܺ֫;

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 404
    :cond_1
    new-instance v1, Ll/ᩳܽ;

    invoke-direct {v1}, Ll/ᩳܽ;-><init>()V

    .line 406
    iput-object v0, v1, Ll/ᩳܽ;->֫:Ll/ۗܺ֫;

    return-object v1
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 370
    iget-object v0, p0, Ll/᩻ܽ;->ۤ:Ll/᩷ۡ֫;

    if-eqz v0, :cond_0

    .line 371
    sget-object v1, Ll/ܰۢ֫;->᩹:Ll/ܰۢ֫;

    invoke-virtual {v0, v1}, Ll/᩷ۡ֫;->֫(Ll/ܰۢ֫;)V

    .line 373
    :cond_0
    invoke-super {p0, p1}, Ll/ۙ᩹;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 374
    iget-object v0, p0, Ll/᩻ܽ;->ܿ֫:Ll/᩸۫ۧ;

    invoke-virtual {v0, p1}, Ll/᩸۫ۧ;->ۧ(Landroid/os/Bundle;)V

    return-void
.end method

.method public onTrimMemory(I)V
    .locals 3

    .line 945
    invoke-super {p0, p1}, Landroid/app/Activity;->onTrimMemory(I)V

    .line 946
    iget-object v0, p0, Ll/᩻ܽ;->ܽ֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ۤ;

    .line 947
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/۬ۤ;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final removeMenuProvider(Ll/ۨۛ;)V
    .locals 1

    .line 562
    iget-object v0, p0, Ll/᩻ܽ;->ۛ:Ll/۫ۛ;

    invoke-virtual {v0, p1}, Ll/۫ۛ;->ۧ(Ll/ۨۛ;)V

    return-void
.end method

.method public final reportFullyDrawn()V
    .locals 1

    .line 1119
    :try_start_0
    invoke-static {}, Ll/ۤۤۧ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "reportFullyDrawn() for ComponentActivity"

    .line 49
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1124
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->reportFullyDrawn()V

    .line 1134
    iget-object v0, p0, Ll/᩻ܽ;->۫:Ll/ᩴܽ;

    invoke-virtual {v0}, Ll/ᩴܽ;->֫()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1137
    throw v0
.end method

.method public setContentView(I)V
    .locals 2

    .line 438
    invoke-virtual {p0}, Ll/᩻ܽ;->᩷()V

    .line 439
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Ll/᩻ܽ;->ᩳ֫:Ll/ܳܽ;

    invoke-virtual {v1, v0}, Ll/ܳܽ;->֫(Landroid/view/View;)V

    .line 440
    invoke-super {p0, p1}, Landroid/app/Activity;->setContentView(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness",
                "MissingNullability"
            }
        .end annotation
    .end param

    .line 445
    invoke-virtual {p0}, Ll/᩻ܽ;->᩷()V

    .line 446
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Ll/᩻ܽ;->ᩳ֫:Ll/ܳܽ;

    invoke-virtual {v1, v0}, Ll/ܳܽ;->֫(Landroid/view/View;)V

    .line 447
    invoke-super {p0, p1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness",
                "MissingNullability"
            }
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup$LayoutParams;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness",
                "MissingNullability"
            }
        .end annotation
    .end param

    .line 454
    invoke-virtual {p0}, Ll/᩻ܽ;->᩷()V

    .line 455
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Ll/᩻ܽ;->ᩳ֫:Ll/ܳܽ;

    invoke-virtual {v1, v0}, Ll/ܳܽ;->֫(Landroid/view/View;)V

    .line 456
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final ֫(Ll/᩸ᩳ;Ll/᩷ᩳ;)Ll/ۢᩳ;
    .locals 2

    .line 885
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "activity_rq#"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩻ܽ;->ۨ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 886
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 885
    iget-object v1, p0, Ll/᩻ܽ;->᩹:Ll/᩵ᩳ;

    invoke-virtual {v1, v0, p0, p1, p2}, Ll/᩵ᩳ;->֫(Ljava/lang/String;Ll/᩻ۡ֫;Ll/᩸ᩳ;Ll/᩷ᩳ;)Ll/ۢᩳ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/᩵ᩳ;
    .locals 1

    .line 905
    iget-object v0, p0, Ll/᩻ܽ;->᩹:Ll/᩵ᩳ;

    return-object v0
.end method

.method public final ֫(Ll/ۘ᩻֫;)V
    .locals 1

    .line 982
    iget-object v0, p0, Ll/᩻ܽ;->֫֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/۬ۤ;)V
    .locals 1

    .line 927
    iget-object v0, p0, Ll/᩻ܽ;->ܰ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/ܳᩳ;)V
    .locals 1

    .line 499
    iget-object v0, p0, Ll/᩻ܽ;->᩶:Ll/ܿᩳ;

    invoke-virtual {v0, p1}, Ll/ܿᩳ;->֫(Ll/ܳᩳ;)V

    return-void
.end method

.method public final ۜ()V
    .locals 1

    .line 612
    iget-object v0, p0, Ll/᩻ܽ;->ܳ֫:Ll/ۗܺ֫;

    if-nez v0, :cond_1

    .line 614
    invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳܽ;

    if-eqz v0, :cond_0

    .line 617
    iget-object v0, v0, Ll/ᩳܽ;->֫:Ll/ۗܺ֫;

    iput-object v0, p0, Ll/᩻ܽ;->ܳ֫:Ll/ۗܺ֫;

    .line 619
    :cond_0
    iget-object v0, p0, Ll/᩻ܽ;->ܳ֫:Ll/ۗܺ֫;

    if-nez v0, :cond_1

    .line 620
    new-instance v0, Ll/ۗܺ֫;

    invoke-direct {v0}, Ll/ۗܺ֫;-><init>()V

    iput-object v0, p0, Ll/᩻ܽ;->ܳ֫:Ll/ۗܺ֫;

    :cond_1
    return-void
.end method

.method public final ۜ(Ll/۬ۤ;)V
    .locals 1

    .line 934
    iget-object v0, p0, Ll/᩻ܽ;->ܰ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۧ(Ll/۬ۤ;)V
    .locals 1

    .line 1113
    iget-object v0, p0, Ll/᩻ܽ;->ۧ֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ܳ(Ll/۬ۤ;)V
    .locals 1

    .line 1049
    iget-object v0, p0, Ll/᩻ܽ;->۟:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ܽ(Ll/۬ۤ;)V
    .locals 1

    .line 958
    iget-object v0, p0, Ll/᩻ܽ;->ܽ֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ܿ(Ll/۬ۤ;)V
    .locals 1

    .line 953
    iget-object v0, p0, Ll/᩻ܽ;->ܽ֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ᩳ(Ll/۬ۤ;)V
    .locals 1

    .line 1106
    iget-object v0, p0, Ll/᩻ܽ;->ۧ֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ᩷()V
    .locals 3

    .line 474
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, Ll/ۛܺ֫;->֫(Landroid/view/View;Ll/᩻ۡ֫;)V

    .line 475
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<this>"

    .line 0
    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f0a068c

    .line 38
    invoke-virtual {v0, v2, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 476
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, Ll/ۗ᩻ۚ;->֫(Landroid/view/View;Ll/᩹۫ۧ;)V

    .line 477
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, Ll/ᩳᩳ;->֫(Landroid/view/View;Ll/᩺ܽ;)V

    .line 478
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    .line 0
    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x7f0a04b6

    .line 36
    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public final ᩻(Ll/۬ۤ;)V
    .locals 1

    .line 1042
    iget-object v0, p0, Ll/᩻ܽ;->۟:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
