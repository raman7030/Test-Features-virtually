.class public final Ll/ۖ۠ܿ;
.super Ll/ۗ۬ۧ;
.source "313O"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final ۙ:Landroid/widget/TextView;

.field public final synthetic ᩶:Ll/ۘ۠ܿ;

.field public ᩸:Ll/ۡ۠ܿ;

.field public final ᩹:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Ll/ۘ۠ܿ;Landroid/view/View;)V
    .locals 0

    .line 498
    iput-object p1, p0, Ll/ۖ۠ܿ;->᩶:Ll/ۘ۠ܿ;

    .line 499
    invoke-direct {p0, p2}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    const p1, 0x7f0a05e4

    .line 500
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/ۖ۠ܿ;->ۙ:Landroid/widget/TextView;

    const p1, 0x7f0a0288

    .line 501
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Ll/ۖ۠ܿ;->᩹:Landroid/widget/ImageView;

    .line 502
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 503
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 508
    iget-object p1, p0, Ll/ۖ۠ܿ;->᩶:Ll/ۘ۠ܿ;

    invoke-static {p1}, Ll/ۘ۠ܿ;->ܳ(Ll/ۘ۠ܿ;)Ll/ܺ۠ܿ;

    move-result-object v0

    invoke-static {p1}, Ll/ۘ۠ܿ;->ܿ(Ll/ۘ۠ܿ;)Ll/ۛ֨ܿ;

    move-result-object v1

    iget-object v2, p0, Ll/ۖ۠ܿ;->᩸:Ll/ۡ۠ܿ;

    iget-object v3, v2, Ll/ۡ۠ܿ;->֫:Ll/ۗ֨ܿ;

    iget-object v2, v2, Ll/ۡ۠ܿ;->ۧ:Ll/ۢ֨ܿ;

    invoke-interface {v0, v1, v3, v2}, Ll/ܺ۠ܿ;->֫(Ll/ۛ֨ܿ;Ll/ۛ֡ܿ;Ll/ۢ֨ܿ;)V

    .line 509
    invoke-static {p1}, Ll/ۘ۠ܿ;->ᩳ(Ll/ۘ۠ܿ;)Ll/֡ۚۢ;

    move-result-object p1

    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    return-void
.end method

.method public final onLongClick(Landroid/view/View;)Z
    .locals 4

    .line 514
    iget-object v0, p0, Ll/ۖ۠ܿ;->᩶:Ll/ۘ۠ܿ;

    invoke-static {v0}, Ll/ۘ۠ܿ;->ܳ(Ll/ۘ۠ܿ;)Ll/ܺ۠ܿ;

    move-result-object v1

    invoke-static {v0}, Ll/ۘ۠ܿ;->ܿ(Ll/ۘ۠ܿ;)Ll/ۛ֨ܿ;

    move-result-object v0

    iget-object v2, p0, Ll/ۖ۠ܿ;->᩸:Ll/ۡ۠ܿ;

    iget-object v3, v2, Ll/ۡ۠ܿ;->֫:Ll/ۗ֨ܿ;

    iget-object v2, v2, Ll/ۡ۠ܿ;->ۧ:Ll/ۢ֨ܿ;

    invoke-interface {v1, p1, v0, v3, v2}, Ll/ܺ۠ܿ;->֫(Landroid/view/View;Ll/ۛ֨ܿ;Ll/ۛ֡ܿ;Ll/ۢ֨ܿ;)V

    const/4 p1, 0x1

    return p1
.end method
