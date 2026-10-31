.class public final Ll/᩵᩻֫;
.super Ll/ۙ᩻֫;
.source "O4XG"

# interfaces
.implements Ll/ۗۙ;
.implements Ll/۬ۙ;
.implements Ll/ۤ᩶;
.implements Ll/ۛ᩶;
.implements Ll/۬ܺ֫;
.implements Ll/᩺ܽ;
.implements Ll/֡ᩳ;
.implements Ll/᩹۫ۧ;
.implements Ll/᩶ۜ֫;
.implements Ll/᩶ۛ;


# instance fields
.field public final synthetic ۗ:Ll/֡᩻֫;


# direct methods
.method public constructor <init>(Ll/֡᩻֫;)V
    .locals 0

    .line 585
    iput-object p1, p0, Ll/᩵᩻֫;->ۗ:Ll/֡᩻֫;

    .line 586
    invoke-direct {p0, p1}, Ll/ۙ᩻֫;-><init>(Ll/֡᩻֫;)V

    return-void
.end method


# virtual methods
.method public final addMenuProvider(Ll/ۨۛ;)V
    .locals 1

    .line 736
    iget-object v0, p0, Ll/᩵᩻֫;->ۗ:Ll/֡᩻֫;

    invoke-virtual {v0, p1}, Ll/᩻ܽ;->addMenuProvider(Ll/ۨۛ;)V

    return-void
.end method

.method public final getLifecycle()Ll/۟ۢ֫;
    .locals 1

    .line 596
    iget-object v0, p0, Ll/᩵᩻֫;->ۗ:Ll/֡᩻֫;

    iget-object v0, v0, Ll/֡᩻֫;->᩷֫:Ll/᩷ۡ֫;

    return-object v0
.end method

.method public final getOnBackPressedDispatcher()Ll/ۨܽ;
    .locals 1

    .line 608
    iget-object v0, p0, Ll/᩵᩻֫;->ۗ:Ll/֡᩻֫;

    invoke-virtual {v0}, Ll/᩻ܽ;->getOnBackPressedDispatcher()Ll/ۨܽ;

    move-result-object v0

    return-object v0
.end method

.method public final getSavedStateRegistry()Ll/ܶ۫ۧ;
    .locals 1

    .line 683
    iget-object v0, p0, Ll/᩵᩻֫;->ۗ:Ll/֡᩻֫;

    invoke-virtual {v0}, Ll/᩻ܽ;->getSavedStateRegistry()Ll/ܶ۫ۧ;

    move-result-object v0

    return-object v0
.end method

.method public final getViewModelStore()Ll/ۗܺ֫;
    .locals 1

    .line 602
    iget-object v0, p0, Ll/᩵᩻֫;->ۗ:Ll/֡᩻֫;

    invoke-virtual {v0}, Ll/᩻ܽ;->getViewModelStore()Ll/ۗܺ֫;

    move-result-object v0

    return-object v0
.end method

.method public final removeMenuProvider(Ll/ۨۛ;)V
    .locals 1

    .line 752
    iget-object v0, p0, Ll/᩵᩻֫;->ۗ:Ll/֡᩻֫;

    invoke-virtual {v0, p1}, Ll/᩻ܽ;->removeMenuProvider(Ll/ۨۛ;)V

    return-void
.end method

.method public final ֫(I)Landroid/view/View;
    .locals 1

    .line 665
    iget-object v0, p0, Ll/᩵᩻֫;->ۗ:Ll/֡᩻֫;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/᩵ᩳ;
    .locals 1

    .line 677
    iget-object v0, p0, Ll/᩵᩻֫;->ۗ:Ll/֡᩻֫;

    invoke-virtual {v0}, Ll/᩻ܽ;->֫()Ll/᩵ᩳ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x0

    .line 614
    iget-object v1, p0, Ll/᩵᩻֫;->ۗ:Ll/֡᩻֫;

    const-string v2, "  "

    invoke-virtual {v1, v2, v0, p1, p2}, Ll/֡᩻֫;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ll/ۡ᩻֫;)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/۬ۤ;)V
    .locals 1

    .line 690
    iget-object v0, p0, Ll/᩵᩻֫;->ۗ:Ll/֡᩻֫;

    invoke-virtual {v0, p1}, Ll/᩻ܽ;->֫(Ll/۬ۤ;)V

    return-void
.end method

.method public final ۜ()Landroid/view/LayoutInflater;
    .locals 2

    .line 625
    iget-object v0, p0, Ll/᩵᩻֫;->ۗ:Ll/֡᩻֫;

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    return-object v0
.end method

.method public final ۜ(Ll/۬ۤ;)V
    .locals 1

    .line 697
    iget-object v0, p0, Ll/᩵᩻֫;->ۗ:Ll/֡᩻֫;

    invoke-virtual {v0, p1}, Ll/᩻ܽ;->ۜ(Ll/۬ۤ;)V

    return-void
.end method

.method public final ۧ(Ll/۬ۤ;)V
    .locals 1

    .line 731
    iget-object v0, p0, Ll/᩵᩻֫;->ۗ:Ll/֡᩻֫;

    invoke-virtual {v0, p1}, Ll/᩻ܽ;->ۧ(Ll/۬ۤ;)V

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 670
    iget-object v0, p0, Ll/᩵᩻֫;->ۗ:Ll/֡᩻֫;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 671
    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ(Ljava/lang/String;)Z
    .locals 1

    .line 640
    iget-object v0, p0, Ll/᩵᩻֫;->ۗ:Ll/֡᩻֫;

    invoke-static {v0, p1}, Ll/ᩴ᩹;->֫(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final ܳ()Ll/֡᩻֫;
    .locals 1

    .line 630
    iget-object v0, p0, Ll/᩵᩻֫;->ۗ:Ll/֡᩻֫;

    return-object v0
.end method

.method public final ܳ(Ll/۬ۤ;)V
    .locals 1

    .line 719
    iget-object v0, p0, Ll/᩵᩻֫;->ۗ:Ll/֡᩻֫;

    invoke-virtual {v0, p1}, Ll/᩻ܽ;->ܳ(Ll/۬ۤ;)V

    return-void
.end method

.method public final ܽ(Ll/۬ۤ;)V
    .locals 1

    .line 707
    iget-object v0, p0, Ll/᩵᩻֫;->ۗ:Ll/֡᩻֫;

    invoke-virtual {v0, p1}, Ll/᩻ܽ;->ܽ(Ll/۬ۤ;)V

    return-void
.end method

.method public final ܿ(Ll/۬ۤ;)V
    .locals 1

    .line 702
    iget-object v0, p0, Ll/᩵᩻֫;->ۗ:Ll/֡᩻֫;

    invoke-virtual {v0, p1}, Ll/᩻ܽ;->ܿ(Ll/۬ۤ;)V

    return-void
.end method

.method public final ᩳ(Ll/۬ۤ;)V
    .locals 1

    .line 725
    iget-object v0, p0, Ll/᩵᩻֫;->ۗ:Ll/֡᩻֫;

    invoke-virtual {v0, p1}, Ll/᩻ܽ;->ᩳ(Ll/۬ۤ;)V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    .line 757
    iget-object v0, p0, Ll/᩵᩻֫;->ۗ:Ll/֡᩻֫;

    invoke-virtual {v0}, Landroid/app/Activity;->invalidateOptionsMenu()V

    return-void
.end method

.method public final ᩻(Ll/۬ۤ;)V
    .locals 1

    .line 713
    iget-object v0, p0, Ll/᩵᩻֫;->ۗ:Ll/֡᩻֫;

    invoke-virtual {v0, p1}, Ll/᩻ܽ;->᩻(Ll/۬ۤ;)V

    return-void
.end method
