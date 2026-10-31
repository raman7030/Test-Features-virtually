.class public final Ll/ۧۢۢ;
.super Ll/ۨ᩺ۧ;
.source "K1PX"


# instance fields
.field public final synthetic ܽ:Ll/۠ۢۢ;


# direct methods
.method public constructor <init>(Ll/۠ۢۢ;)V
    .locals 0

    .line 90
    iput-object p1, p0, Ll/ۧۢۢ;->ܽ:Ll/۠ۢۢ;

    invoke-direct {p0}, Ll/ۨ᩺ۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(I)Ljava/lang/CharSequence;
    .locals 1

    .line 99
    iget-object v0, p0, Ll/ۧۢۢ;->ܽ:Ll/۠ۢۢ;

    if-nez p1, :cond_0

    const p1, 0x7f120085

    goto :goto_0

    :cond_0
    const p1, 0x7f120086

    :goto_0
    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/֡ܰۧ;I)Ljava/lang/Object;
    .locals 1

    .line 105
    iget-object v0, p0, Ll/ۧۢۢ;->ܽ:Ll/۠ۢۢ;

    if-nez p2, :cond_0

    invoke-static {v0}, Ll/۠ۢۢ;->ۧ(Ll/۠ۢۢ;)Ll/ۖۢۢ;

    move-result-object p2

    iget-object p2, p2, Ll/ۖۢۢ;->ۧ:Ll/۬۬ۧ;

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ll/۠ۢۢ;->֫(Ll/۠ۢۢ;)Ll/ܿۢۢ;

    move-result-object p2

    iget-object p2, p2, Ll/ܿۢۢ;->ۧ:Ll/۬۬ۧ;

    .line 106
    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object p2
.end method

.method public final ֫(Ll/֡ܰۧ;ILjava/lang/Object;)V
    .locals 0

    .line 112
    iget-object p3, p0, Ll/ۧۢۢ;->ܽ:Ll/۠ۢۢ;

    if-nez p2, :cond_0

    invoke-static {p3}, Ll/۠ۢۢ;->ۧ(Ll/۠ۢۢ;)Ll/ۖۢۢ;

    move-result-object p2

    iget-object p2, p2, Ll/ۖۢۢ;->ۧ:Ll/۬۬ۧ;

    goto :goto_0

    :cond_0
    invoke-static {p3}, Ll/۠ۢۢ;->֫(Ll/۠ۢۢ;)Ll/ܿۢۢ;

    move-result-object p2

    iget-object p2, p2, Ll/ܿۢۢ;->ۧ:Ll/۬۬ۧ;

    .line 113
    :goto_0
    invoke-virtual {p1, p2}, Ll/֡ܰۧ;->removeView(Landroid/view/View;)V

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

    const/4 v0, 0x2

    return v0
.end method
