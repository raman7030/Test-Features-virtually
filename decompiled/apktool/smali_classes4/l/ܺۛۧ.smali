.class public final Ll/ܺۛۧ;
.super Ljava/lang/Object;
.source "C5U9"

# interfaces
.implements Ll/ۛۛۧ;


# instance fields
.field public final synthetic ֫:Ljava/util/ArrayList;

.field public final synthetic ۧ:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;Ljava/util/ArrayList;)V
    .locals 0

    .line 154
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺۛۧ;->ۧ:Landroid/view/View;

    iput-object p2, p0, Ll/ܺۛۧ;->֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final onTransitionCancel(Ll/ܽۨۧ;)V
    .locals 0

    return-void
.end method

.method public final onTransitionEnd(Ll/ܽۨۧ;)V
    .locals 4

    .line 169
    invoke-virtual {p1, p0}, Ll/ܽۨۧ;->removeListener(Ll/ۛۛۧ;)Ll/ܽۨۧ;

    .line 170
    iget-object p1, p0, Ll/ܺۛۧ;->ۧ:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 171
    iget-object p1, p0, Ll/ܺۛۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 173
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final onTransitionEnd(Ll/ܽۨۧ;Z)V
    .locals 0

    .line 2525
    invoke-virtual {p0, p1}, Ll/ܺۛۧ;->onTransitionEnd(Ll/ܽۨۧ;)V

    return-void
.end method

.method public final onTransitionPause(Ll/ܽۨۧ;)V
    .locals 0

    return-void
.end method

.method public final onTransitionResume(Ll/ܽۨۧ;)V
    .locals 0

    return-void
.end method

.method public final onTransitionStart(Ll/ܽۨۧ;)V
    .locals 0

    .line 163
    invoke-virtual {p1, p0}, Ll/ܽۨۧ;->removeListener(Ll/ۛۛۧ;)Ll/ܽۨۧ;

    .line 164
    invoke-virtual {p1, p0}, Ll/ܽۨۧ;->addListener(Ll/ۛۛۧ;)Ll/ܽۨۧ;

    return-void
.end method

.method public final onTransitionStart(Ll/ܽۨۧ;Z)V
    .locals 0

    .line 2499
    invoke-virtual {p0, p1}, Ll/ܺۛۧ;->onTransitionStart(Ll/ܽۨۧ;)V

    return-void
.end method
