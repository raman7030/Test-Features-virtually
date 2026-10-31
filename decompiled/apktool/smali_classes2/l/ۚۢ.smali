.class public final Ll/ۚۢ;
.super Ljava/lang/Object;
.source "S696"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnLongClickListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public final synthetic ᩸:Ll/۠ۢ;


# direct methods
.method public constructor <init>(Ll/۠ۢ;)V
    .locals 0

    .line 581
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚۢ;->᩸:Ll/۠ۢ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 619
    iget-object v0, p0, Ll/ۚۢ;->᩸:Ll/۠ۢ;

    iget-object v1, v0, Ll/۠ۢ;->᩶:Ll/֡ۢ;

    iget-object v2, v0, Ll/۠ۢ;->ۗ:Landroid/widget/FrameLayout;

    if-eq p1, v2, :cond_1

    .line 628
    iget-object v0, v0, Ll/۠ۢ;->۬:Landroid/widget/FrameLayout;

    if-ne p1, v0, :cond_0

    .line 368
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No data model. Did you call #setDataModel?"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 632
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 620
    :cond_1
    invoke-virtual {v0}, Ll/۠ۢ;->֫()V

    .line 621
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    .line 825
    throw p1
.end method

.method public final onDismiss()V
    .locals 1

    .line 660
    iget-object v0, p0, Ll/ۚۢ;->᩸:Ll/۠ۢ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 654
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 587
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    move-result-object p1

    check-cast p1, Ll/֡ۢ;

    .line 588
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 594
    iget-object p1, p0, Ll/ۚۢ;->᩸:Ll/۠ۢ;

    invoke-virtual {p1}, Ll/۠ۢ;->֫()V

    .line 603
    iget-object p1, p1, Ll/۠ۢ;->᩶:Ll/֡ۢ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 604
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1
.end method

.method public final onLongClick(Landroid/view/View;)Z
    .locals 2

    .line 639
    iget-object v0, p0, Ll/ۚۢ;->᩸:Ll/۠ۢ;

    iget-object v1, v0, Ll/۠ۢ;->ۗ:Landroid/widget/FrameLayout;

    if-ne p1, v1, :cond_0

    .line 640
    iget-object p1, v0, Ll/۠ۢ;->᩶:Ll/֡ۢ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    .line 722
    throw p1

    .line 645
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method
