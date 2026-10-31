.class public final synthetic Ll/ܺۗ᩷;
.super Ljava/lang/Object;
.source "Z3WS"

# interfaces
.implements Landroid/widget/AdapterView$OnItemLongClickListener;


# instance fields
.field public final synthetic ۙ:[Ljava/lang/CharSequence;

.field public final synthetic ᩶:Ll/֡ۚۢ;

.field public final synthetic ᩸:Ll/ۚۗ᩷;

.field public final synthetic ᩹:Ll/ۗܺ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ۚۗ᩷;Ll/ۗܺ᩷;Ll/֡ۚۢ;[Ljava/lang/CharSequence;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺۗ᩷;->᩸:Ll/ۚۗ᩷;

    iput-object p2, p0, Ll/ܺۗ᩷;->᩹:Ll/ۗܺ᩷;

    iput-object p3, p0, Ll/ܺۗ᩷;->᩶:Ll/֡ۚۢ;

    iput-object p4, p0, Ll/ܺۗ᩷;->ۙ:[Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public final onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 6

    .line 109
    new-instance p4, Ll/᩸ۖ;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const/4 p5, 0x0

    .line 68
    invoke-direct {p4, p1, p2, p5}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 110
    invoke-virtual {p4}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p1

    const p2, 0x7f1206c4

    invoke-interface {p1, p5, p2, p5, p2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 111
    invoke-virtual {p4}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p1

    const p2, 0x7f1205ca

    invoke-interface {p1, p5, p2, p5, p2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 112
    new-instance p1, Ll/֡ۗ᩷;

    iget-object v1, p0, Ll/ܺۗ᩷;->᩸:Ll/ۚۗ᩷;

    iget-object v2, p0, Ll/ܺۗ᩷;->᩹:Ll/ۗܺ᩷;

    iget-object v4, p0, Ll/ܺۗ᩷;->᩶:Ll/֡ۚۢ;

    iget-object v5, p0, Ll/ܺۗ᩷;->ۙ:[Ljava/lang/CharSequence;

    move-object v0, p1

    move v3, p3

    invoke-direct/range {v0 .. v5}, Ll/֡ۗ᩷;-><init>(Ll/ۚۗ᩷;Ll/ۗܺ᩷;ILl/֡ۚۢ;[Ljava/lang/CharSequence;)V

    invoke-virtual {p4, p1}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 120
    invoke-virtual {p4}, Ll/᩸ۖ;->ܿ()V

    const/4 p1, 0x1

    return p1
.end method
