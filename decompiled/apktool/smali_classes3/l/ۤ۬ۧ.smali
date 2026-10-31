.class public Ll/ۤ۬ۧ;
.super Ll/ܽۛ;
.source "N69K"


# instance fields
.field public final mItemDelegate:Ll/۫۬ۧ;

.field public final mRecyclerView:Ll/۬۬ۧ;


# direct methods
.method public constructor <init>(Ll/۬۬ۧ;)V
    .locals 1

    .line 44
    invoke-direct {p0}, Ll/ܽۛ;-><init>()V

    .line 45
    iput-object p1, p0, Ll/ۤ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    .line 46
    invoke-virtual {p0}, Ll/ۤ۬ۧ;->getItemDelegate()Ll/ܽۛ;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 47
    instance-of v0, p1, Ll/۫۬ۧ;

    if-eqz v0, :cond_0

    .line 48
    check-cast p1, Ll/۫۬ۧ;

    iput-object p1, p0, Ll/ۤ۬ۧ;->mItemDelegate:Ll/۫۬ۧ;

    return-void

    .line 50
    :cond_0
    new-instance p1, Ll/۫۬ۧ;

    invoke-direct {p1, p0}, Ll/۫۬ۧ;-><init>(Ll/ۤ۬ۧ;)V

    iput-object p1, p0, Ll/ۤ۬ۧ;->mItemDelegate:Ll/۫۬ۧ;

    return-void
.end method


# virtual methods
.method public getItemDelegate()Ll/ܽۛ;
    .locals 1

    .line 109
    iget-object v0, p0, Ll/ۤ۬ۧ;->mItemDelegate:Ll/۫۬ۧ;

    return-object v0
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "InvalidNullabilityOverride"
            }
        .end annotation
    .end param
    .param p2    # Landroid/view/accessibility/AccessibilityEvent;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "InvalidNullabilityOverride"
            }
        .end annotation
    .end param

    .line 90
    invoke-super {p0, p1, p2}, Ll/ܽۛ;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 91
    instance-of v0, p1, Ll/۬۬ۧ;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/ۤ۬ۧ;->shouldIgnore()Z

    move-result v0

    if-nez v0, :cond_0

    .line 92
    check-cast p1, Ll/۬۬ۧ;

    .line 93
    invoke-virtual {p1}, Ll/۬۬ۧ;->getLayoutManager()Ll/ܿ۬ۧ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 94
    invoke-virtual {p1}, Ll/۬۬ۧ;->getLayoutManager()Ll/ܿ۬ۧ;

    move-result-object p1

    invoke-virtual {p1, p2}, Ll/ܿ۬ۧ;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    :cond_0
    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "InvalidNullabilityOverride"
            }
        .end annotation
    .end param
    .param p2    # Ll/ܳ۟;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "InvalidNullabilityOverride"
            }
        .end annotation
    .end param

    .line 79
    invoke-super {p0, p1, p2}, Ll/ܽۛ;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V

    .line 80
    invoke-virtual {p0}, Ll/ۤ۬ۧ;->shouldIgnore()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Ll/ۤ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {p1}, Ll/۬۬ۧ;->getLayoutManager()Ll/ܿ۬ۧ;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 81
    iget-object p1, p0, Ll/ۤ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {p1}, Ll/۬۬ۧ;->getLayoutManager()Ll/ܿ۬ۧ;

    move-result-object p1

    invoke-virtual {p1, p2}, Ll/ܿ۬ۧ;->onInitializeAccessibilityNodeInfo(Ll/ܳ۟;)V

    :cond_0
    return-void
.end method

.method public performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "InvalidNullabilityOverride"
            }
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "InvalidNullabilityOverride"
            }
        .end annotation
    .end param

    .line 64
    invoke-super {p0, p1, p2, p3}, Ll/ܽۛ;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 67
    :cond_0
    invoke-virtual {p0}, Ll/ۤ۬ۧ;->shouldIgnore()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Ll/ۤ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {p1}, Ll/۬۬ۧ;->getLayoutManager()Ll/ܿ۬ۧ;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 68
    iget-object p1, p0, Ll/ۤ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {p1}, Ll/۬۬ۧ;->getLayoutManager()Ll/ܿ۬ۧ;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Ll/ܿ۬ۧ;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public shouldIgnore()Z
    .locals 1

    .line 55
    iget-object v0, p0, Ll/ۤ۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {v0}, Ll/۬۬ۧ;->hasPendingAdapterUpdates()Z

    move-result v0

    return v0
.end method
