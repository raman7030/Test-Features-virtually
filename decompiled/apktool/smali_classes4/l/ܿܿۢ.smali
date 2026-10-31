.class public final Ll/ܿܿۢ;
.super Ljava/lang/Object;
.source "81J9"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic ۗ:Ll/ۗۘ;

.field public final synthetic ۙ:Ll/ۗۘ;

.field public final synthetic ۫:Ll/ۗۘ;

.field public final synthetic ۬:Ll/ۗۘ;

.field public final synthetic ᩶:Ll/ۗۘ;

.field public ᩸:Z

.field public final synthetic ᩹:Ll/ۗۘ;


# direct methods
.method public constructor <init>(Ll/ۗۘ;Ll/ۗۘ;Ll/ۗۘ;Ll/ۗۘ;Ll/ۗۘ;Ll/ۗۘ;)V
    .locals 0

    .line 386
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿܿۢ;->۫:Ll/ۗۘ;

    iput-object p2, p0, Ll/ܿܿۢ;->᩶:Ll/ۗۘ;

    iput-object p3, p0, Ll/ܿܿۢ;->ۗ:Ll/ۗۘ;

    iput-object p4, p0, Ll/ܿܿۢ;->۬:Ll/ۗۘ;

    iput-object p5, p0, Ll/ܿܿۢ;->ۙ:Ll/ۗۘ;

    iput-object p6, p0, Ll/ܿܿۢ;->᩹:Ll/ۗۘ;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 8

    .line 392
    iget-boolean v0, p0, Ll/ܿܿۢ;->᩸:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 393
    iput-boolean v0, p0, Ll/ܿܿۢ;->᩸:Z

    .line 395
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v1, 0x7f0a0410

    const/4 v2, 0x0

    iget-object v3, p0, Ll/ܿܿۢ;->ۙ:Ll/ۗۘ;

    iget-object v4, p0, Ll/ܿܿۢ;->۬:Ll/ۗۘ;

    iget-object v5, p0, Ll/ܿܿۢ;->ۗ:Ll/ۗۘ;

    iget-object v6, p0, Ll/ܿܿۢ;->᩶:Ll/ۗۘ;

    iget-object v7, p0, Ll/ܿܿۢ;->۫:Ll/ۗۘ;

    if-ne p1, v1, :cond_1

    .line 396
    invoke-virtual {v7, p2}, Ll/ۗۘ;->setChecked(Z)V

    .line 397
    invoke-virtual {v6, p2}, Ll/ۗۘ;->setChecked(Z)V

    .line 398
    invoke-virtual {v5, p2}, Ll/ۗۘ;->setChecked(Z)V

    .line 399
    invoke-virtual {v4, p2}, Ll/ۗۘ;->setChecked(Z)V

    .line 400
    invoke-virtual {v3, p2}, Ll/ۗۘ;->setChecked(Z)V

    goto :goto_1

    .line 402
    :cond_1
    invoke-virtual {v7}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 403
    invoke-virtual {v6}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 404
    invoke-virtual {v5}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 405
    invoke-virtual {v4}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 406
    invoke-virtual {v3}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 407
    :goto_0
    iget-object p1, p0, Ll/ܿܿۢ;->᩹:Ll/ۗۘ;

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p2

    if-eq p2, v0, :cond_3

    .line 408
    invoke-virtual {p1, v0}, Ll/ۗۘ;->setChecked(Z)V

    .line 411
    :cond_3
    :goto_1
    iput-boolean v2, p0, Ll/ܿܿۢ;->᩸:Z

    return-void
.end method
