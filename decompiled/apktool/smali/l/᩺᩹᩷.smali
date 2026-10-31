.class public final synthetic Ll/᩺᩹᩷;
.super Ljava/lang/Object;
.source "V933"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۗ:Ll/᩸֡ᩴ;

.field public final synthetic ۙ:Ll/ܳ᩶᩷;

.field public final synthetic ᩶:Landroid/widget/ImageView;

.field public final synthetic ᩸:Ll/ۗܺ᩷;

.field public final synthetic ᩹:Ll/ۨ᩹᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ۗܺ᩷;Ll/ۨ᩹᩷;Landroid/widget/ImageView;Ll/ܳ᩶᩷;Ll/᩸֡ᩴ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺᩹᩷;->᩸:Ll/ۗܺ᩷;

    iput-object p2, p0, Ll/᩺᩹᩷;->᩹:Ll/ۨ᩹᩷;

    iput-object p3, p0, Ll/᩺᩹᩷;->᩶:Landroid/widget/ImageView;

    iput-object p4, p0, Ll/᩺᩹᩷;->ۙ:Ll/ܳ᩶᩷;

    iput-object p5, p0, Ll/᩺᩹᩷;->ۗ:Ll/᩸֡ᩴ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    .line 58
    new-instance p1, Ll/۬۬ۧ;

    iget-object v0, p0, Ll/᩺᩹᩷;->᩸:Ll/ۗܺ᩷;

    invoke-direct {p1, v0}, Ll/۬۬ۧ;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    .line 59
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setMotionEventSplittingEnabled(Z)V

    .line 60
    new-instance v1, Ll/᩸ۙۧ;

    const/4 v2, 0x5

    invoke-direct {v1, v0, v2}, Ll/᩸ۙۧ;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p1, v1}, Ll/۬۬ۧ;->setLayoutManager(Ll/ܿ۬ۧ;)V

    .line 61
    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v6

    .line 62
    new-instance v0, Ll/᩻᩶᩷;

    new-instance v7, Ll/ᩳ᩶᩷;

    iget-object v2, p0, Ll/᩺᩹᩷;->᩹:Ll/ۨ᩹᩷;

    iget-object v3, p0, Ll/᩺᩹᩷;->᩶:Landroid/widget/ImageView;

    iget-object v4, p0, Ll/᩺᩹᩷;->ۙ:Ll/ܳ᩶᩷;

    iget-object v5, p0, Ll/᩺᩹᩷;->ۗ:Ll/᩸֡ᩴ;

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Ll/ᩳ᩶᩷;-><init>(Ll/ۨ᩹᩷;Landroid/widget/ImageView;Ll/ܳ᩶᩷;Ll/᩸֡ᩴ;Ll/֡ۚۢ;)V

    invoke-direct {v0, v7}, Ll/᩻᩶᩷;-><init>(Ll/ᩳ᩶᩷;)V

    invoke-virtual {p1, v0}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    return-void
.end method
