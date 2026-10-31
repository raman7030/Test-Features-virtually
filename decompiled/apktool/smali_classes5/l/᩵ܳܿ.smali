.class public final Ll/᩵ܳܿ;
.super Ll/ۨ᩺ۧ;
.source "4AWI"


# instance fields
.field public final synthetic ܽ:Ll/֡ܳܿ;


# direct methods
.method public constructor <init>(Ll/֡ܳܿ;)V
    .locals 0

    .line 458
    iput-object p1, p0, Ll/᩵ܳܿ;->ܽ:Ll/֡ܳܿ;

    invoke-direct {p0}, Ll/ۨ᩺ۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(I)Ljava/lang/CharSequence;
    .locals 3

    .line 466
    iget-object v0, p0, Ll/᩵ܳܿ;->ܽ:Ll/֡ܳܿ;

    invoke-static {v0}, Ll/֡ܳܿ;->ᩳ(Ll/֡ܳܿ;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    if-ne p1, v1, :cond_0

    .line 467
    new-instance v0, Ll/ᩴܳܿ;

    invoke-direct {v0, p0, p1}, Ll/ᩴܳܿ;-><init>(Ll/᩵ܳܿ;I)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-object v2

    .line 471
    :cond_0
    :try_start_0
    invoke-static {v0}, Ll/֡ܳܿ;->ᩳ(Ll/֡ܳܿ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩻ܳܿ;

    invoke-virtual {p1}, Ll/᩻ܳܿ;->ۧ()Ll/ۚܳܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۚܳܿ;->ۧ()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    return-object v2
.end method

.method public final ֫(Ll/֡ܰۧ;I)Ljava/lang/Object;
    .locals 2

    .line 481
    iget-object v0, p0, Ll/᩵ܳܿ;->ܽ:Ll/֡ܳܿ;

    invoke-static {v0}, Ll/֡ܳܿ;->ᩳ(Ll/֡ܳܿ;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne p2, v1, :cond_0

    .line 482
    invoke-static {v0}, Ll/֡ܳܿ;->ܽ(Ll/֡ܳܿ;)Ll/ۘܳܿ;

    move-result-object p2

    iget-object p2, p2, Ll/ۘܳܿ;->ܳ:Landroid/view/View;

    goto :goto_0

    .line 484
    :cond_0
    invoke-static {v0}, Ll/֡ܳܿ;->ᩳ(Ll/֡ܳܿ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩻ܳܿ;

    iget-object p2, p2, Ll/᩻ܳܿ;->᩷:Ll/۬۬ۧ;

    .line 486
    :goto_0
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_1

    check-cast v0, Landroid/view/ViewGroup;

    .line 487
    invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 489
    :cond_1
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object p2
.end method

.method public final ֫(Ll/֡ܰۧ;ILjava/lang/Object;)V
    .locals 0

    .line 495
    check-cast p3, Landroid/view/View;

    invoke-virtual {p1, p3}, Ll/֡ܰۧ;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public final ֫(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()I
    .locals 1

    .line 500
    iget-object v0, p0, Ll/᩵ܳܿ;->ܽ:Ll/֡ܳܿ;

    invoke-static {v0}, Ll/֡ܳܿ;->ᩳ(Ll/֡ܳܿ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method
