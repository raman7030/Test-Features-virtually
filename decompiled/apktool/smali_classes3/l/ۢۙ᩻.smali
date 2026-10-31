.class public final synthetic Ll/ۢۙ᩻;
.super Ljava/lang/Object;
.source "75VW"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ܺۙ᩻;

.field public final synthetic ᩹:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ll/ܺۙ᩻;Ljava/util/List;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢۙ᩻;->᩸:Ll/ܺۙ᩻;

    iput-object p2, p0, Ll/ۢۙ᩻;->᩹:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 175
    new-instance v0, Ll/᩸ۖ;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    .line 68
    invoke-direct {v0, v1, p1, v2}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 176
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p1

    const v1, 0x7f1205eb

    .line 177
    invoke-interface {p1, v2, v1, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 178
    new-instance p1, Ll/ᩳۙ᩻;

    iget-object v1, p0, Ll/ۢۙ᩻;->᩸:Ll/ܺۙ᩻;

    iget-object v2, p0, Ll/ۢۙ᩻;->᩹:Ljava/util/List;

    invoke-direct {p1, v1, v2}, Ll/ᩳۙ᩻;-><init>(Ll/ܺۙ᩻;Ljava/util/List;)V

    invoke-virtual {v0, p1}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 182
    invoke-virtual {v0}, Ll/᩸ۖ;->ܿ()V

    return-void
.end method
