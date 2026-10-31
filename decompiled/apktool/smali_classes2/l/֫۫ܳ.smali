.class public final synthetic Ll/֫۫ܳ;
.super Ljava/lang/Object;
.source "A940"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ljava/util/ArrayList;

.field public final synthetic ᩹:Ll/۬۬ۧ;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Ll/۬۬ۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫۫ܳ;->᩸:Ljava/util/ArrayList;

    iput-object p2, p0, Ll/֫۫ܳ;->᩹:Ll/۬۬ۧ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .line 2
    iget-object v0, p0, Ll/֫۫ܳ;->᩹:Ll/۬۬ۧ;

    .line 48
    invoke-virtual {v0}, Ll/۬۬ۧ;->getAdapter()Ll/᩶ۗۧ;

    move-result-object v0

    const v1, 0x7f0a0540

    .line 202
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 203
    :goto_0
    new-instance v4, Ll/᩸ۖ;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    .line 68
    invoke-direct {v4, v5, p1, v3}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 204
    invoke-virtual {v4}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v5

    const v6, 0x7f1209b7

    .line 205
    invoke-interface {v5, v3, v6, v3, v6}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    const v6, 0x7f1209b6

    .line 206
    invoke-interface {v5, v3, v6, v3, v6}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    const v6, 0x7f1209b8

    .line 207
    invoke-interface {v5, v3, v6, v3, v6}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    const v6, 0x7f1209b9

    .line 208
    invoke-interface {v5, v3, v6, v3, v6}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    const v6, 0x7f1209ba

    .line 209
    invoke-interface {v5, v3, v6, v3, v6}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v3

    .line 210
    invoke-interface {v3, v2}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    move-result-object v2

    invoke-interface {v2, v1}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 211
    new-instance v2, Ll/ܿ۫ܳ;

    iget-object v3, p0, Ll/֫۫ܳ;->᩸:Ljava/util/ArrayList;

    invoke-direct {v2, v3, v1, p1, v0}, Ll/ܿ۫ܳ;-><init>(Ljava/util/ArrayList;ZLandroid/view/View;Ll/᩶ۗۧ;)V

    invoke-virtual {v4, v2}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 255
    invoke-virtual {v4}, Ll/᩸ۖ;->ܿ()V

    return-void
.end method
