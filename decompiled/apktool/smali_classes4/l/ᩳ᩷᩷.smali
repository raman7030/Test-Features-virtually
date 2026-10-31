.class public final Ll/ᩳ᩷᩷;
.super Ljava/lang/Object;
.source "P7RC"


# instance fields
.field public ֫:Z

.field public ۧ:Landroid/view/ViewTreeObserver;

.field public final ܽ:Ll/ܽ᩷᩷;

.field public final ܿ:Ljava/lang/ref/WeakReference;

.field public final ᩳ:Landroid/text/TextWatcher;


# direct methods
.method public constructor <init>(Landroid/view/View;Ll/ۖ۫᩻;)V
    .locals 3

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 28
    iput-boolean v0, p0, Ll/ᩳ᩷᩷;->֫:Z

    .line 31
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ᩳ᩷᩷;->ܿ:Ljava/lang/ref/WeakReference;

    .line 32
    new-instance p1, Ll/ܽ᩷᩷;

    invoke-direct {p1, p2}, Ll/ܽ᩷᩷;-><init>(Ll/ۖ۫᩻;)V

    iput-object p1, p0, Ll/ᩳ᩷᩷;->ܽ:Ll/ܽ᩷᩷;

    .line 33
    new-instance v1, Ll/֫᩷᩷;

    invoke-direct {v1, p2}, Ll/֫᩷᩷;-><init>(Ll/ۖ۫᩻;)V

    iput-object v1, p0, Ll/ᩳ᩷᩷;->ᩳ:Landroid/text/TextWatcher;

    .line 39
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    if-nez p2, :cond_0

    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 44
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 45
    invoke-virtual {v0, p1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 46
    iput-object v0, p0, Ll/ᩳ᩷᩷;->ۧ:Landroid/view/ViewTreeObserver;

    .line 50
    :cond_1
    instance-of p1, p2, Landroid/widget/TextView;

    if-eqz p1, :cond_2

    .line 51
    check-cast p2, Landroid/widget/TextView;

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    const/4 p1, 0x1

    .line 52
    iput-boolean p1, p0, Ll/ᩳ᩷᩷;->֫:Z

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 65
    iget-object v0, p0, Ll/ᩳ᩷᩷;->ܿ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 68
    iget-object v1, p0, Ll/ᩳ᩷᩷;->ۧ:Landroid/view/ViewTreeObserver;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 69
    iget-object v1, p0, Ll/ᩳ᩷᩷;->ۧ:Landroid/view/ViewTreeObserver;

    iget-object v2, p0, Ll/ᩳ᩷᩷;->ܽ:Ll/ܽ᩷᩷;

    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 73
    :cond_0
    iget-boolean v1, p0, Ll/ᩳ᩷᩷;->֫:Z

    if-eqz v1, :cond_1

    instance-of v1, v0, Landroid/widget/TextView;

    if-eqz v1, :cond_1

    check-cast v0, Landroid/widget/TextView;

    .line 74
    iget-object v1, p0, Ll/ᩳ᩷᩷;->ᩳ:Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    :cond_1
    return-void
.end method

.method public final ۧ()Landroid/view/View;
    .locals 1

    .line 57
    iget-object v0, p0, Ll/ᩳ᩷᩷;->ܿ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 61
    iget-object v0, p0, Ll/ᩳ᩷᩷;->ܿ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
