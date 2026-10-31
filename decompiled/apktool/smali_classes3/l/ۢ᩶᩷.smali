.class public final Ll/ۢ᩶᩷;
.super Ll/ۗۗۧ;
.source "892H"


# instance fields
.field public final synthetic ֫:Ll/ۖ᩶᩷;

.field public final synthetic ۧ:Landroid/widget/TextView;

.field public final synthetic ܽ:Ll/۬۬ۧ;


# direct methods
.method public constructor <init>(Ll/ۖ᩶᩷;Ll/۬۬ۧ;Landroid/widget/TextView;)V
    .locals 0

    .line 36
    iput-object p1, p0, Ll/ۢ᩶᩷;->֫:Ll/ۖ᩶᩷;

    iput-object p2, p0, Ll/ۢ᩶᩷;->ܽ:Ll/۬۬ۧ;

    iput-object p3, p0, Ll/ۢ᩶᩷;->ۧ:Landroid/widget/TextView;

    invoke-direct {p0}, Ll/ۗۗۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 5

    .line 39
    iget-object v0, p0, Ll/ۢ᩶᩷;->֫:Ll/ۖ᩶᩷;

    .line 92
    iget-object v0, v0, Ll/ۖ᩶᩷;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    .line 39
    iget-object v2, p0, Ll/ۢ᩶᩷;->ۧ:Landroid/widget/TextView;

    const/16 v3, 0x8

    iget-object v4, p0, Ll/ۢ᩶᩷;->ܽ:Ll/۬۬ۧ;

    if-nez v0, :cond_0

    .line 40
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    .line 41
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 43
    :cond_0
    invoke-virtual {v4, v1}, Landroid/view/View;->setVisibility(I)V

    .line 44
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
