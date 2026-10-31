.class public final Ll/ܿ۫ܳ;
.super Ljava/lang/Object;
.source "A940"

# interfaces
.implements Ll/ܶۖ;


# instance fields
.field public final synthetic ۙ:Landroid/view/View;

.field public final synthetic ᩶:Z

.field public final synthetic ᩸:Ll/᩶ۗۧ;

.field public final synthetic ᩹:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;ZLandroid/view/View;Ll/᩶ۗۧ;)V
    .locals 0

    .line 211
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿ۫ܳ;->᩹:Ljava/util/ArrayList;

    iput-boolean p2, p0, Ll/ܿ۫ܳ;->᩶:Z

    iput-object p3, p0, Ll/ܿ۫ܳ;->ۙ:Landroid/view/View;

    iput-object p4, p0, Ll/ܿ۫ܳ;->᩸:Ll/᩶ۗۧ;

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 6

    .line 215
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ܿ۫ܳ;->᩹:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 216
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v2

    const v3, 0x7f1209b7

    const/4 v4, 0x1

    .line 217
    iget-boolean v5, p0, Ll/ܿ۫ܳ;->᩶:Z

    if-ne v2, v3, :cond_0

    const/4 p1, 0x0

    .line 218
    invoke-static {v1, p1, v5}, Ll/۟۬ܳ;->֫(Ljava/util/ArrayList;IZ)V

    goto :goto_1

    :cond_0
    const v3, 0x7f1209b6

    if-ne v2, v3, :cond_1

    .line 220
    invoke-static {v1, v4, v5}, Ll/۟۬ܳ;->֫(Ljava/util/ArrayList;IZ)V

    goto :goto_1

    :cond_1
    const v3, 0x7f1209b8

    if-ne v2, v3, :cond_2

    const/4 p1, 0x2

    .line 222
    invoke-static {v1, p1, v5}, Ll/۟۬ܳ;->֫(Ljava/util/ArrayList;IZ)V

    goto :goto_1

    :cond_2
    const v3, 0x7f1209b9

    if-ne v2, v3, :cond_3

    const/4 p1, 0x3

    .line 224
    invoke-static {v1, p1, v5}, Ll/۟۬ܳ;->֫(Ljava/util/ArrayList;IZ)V

    goto :goto_1

    :cond_3
    const v3, 0x7f1209ba

    if-ne v2, v3, :cond_5

    .line 226
    invoke-static {v1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    xor-int/lit8 v1, v5, 0x1

    .line 227
    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    if-nez v5, :cond_4

    .line 228
    const-class p1, Ljava/lang/Object;

    goto :goto_0

    :cond_4
    const/4 p1, 0x0

    :goto_0
    iget-object v1, p0, Ll/ܿ۫ܳ;->ۙ:Landroid/view/View;

    const v2, 0x7f0a0540

    invoke-virtual {v1, v2, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 230
    :cond_5
    :goto_1
    new-instance p1, Ll/ᩳ۫ܳ;

    invoke-direct {p1, p0, v0}, Ll/ᩳ۫ܳ;-><init>(Ll/ܿ۫ܳ;Ljava/util/ArrayList;)V

    invoke-static {p1}, Ll/᩷ۙۧ;->֫(Ll/ۧۙۧ;)Ll/ܿۙۧ;

    move-result-object p1

    .line 251
    iget-object v0, p0, Ll/ܿ۫ܳ;->᩸:Ll/᩶ۗۧ;

    invoke-virtual {p1, v0}, Ll/ܿۙۧ;->֫(Ll/᩶ۗۧ;)V

    return v4
.end method
