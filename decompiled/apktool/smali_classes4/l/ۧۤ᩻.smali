.class public final Ll/ۧۤ᩻;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Ll/۬ۗܳ;


# instance fields
.field public final synthetic ۗ:Ll/ܳ۫᩻;

.field public final synthetic ۙ:Landroid/widget/TextView;

.field public final synthetic ۫:Ll/ܳۨܽ;

.field public final synthetic ۬:Ll/ܽ᩺ܽ;

.field public final synthetic ᩶:Ll/֡ۚۢ;

.field public final synthetic ᩸:Ll/ۗܺ᩷;

.field public final synthetic ᩹:Z


# direct methods
.method public constructor <init>(ZLl/ܳۨܽ;Ll/֡ۚۢ;Ll/ܽ᩺ܽ;Ll/ܳ۫᩻;Landroid/widget/TextView;Ll/ۗܺ᩷;)V
    .locals 0

    .line 674
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ll/ۧۤ᩻;->᩹:Z

    iput-object p2, p0, Ll/ۧۤ᩻;->۫:Ll/ܳۨܽ;

    iput-object p3, p0, Ll/ۧۤ᩻;->᩶:Ll/֡ۚۢ;

    iput-object p4, p0, Ll/ۧۤ᩻;->۬:Ll/ܽ᩺ܽ;

    iput-object p5, p0, Ll/ۧۤ᩻;->ۗ:Ll/ܳ۫᩻;

    iput-object p6, p0, Ll/ۧۤ᩻;->ۙ:Landroid/widget/TextView;

    iput-object p7, p0, Ll/ۧۤ᩻;->᩸:Ll/ۗܺ᩷;

    return-void
.end method


# virtual methods
.method public final onCanceled()V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ۨۧᩳ;Z)V
    .locals 0

    .line 678
    iget-boolean p1, p0, Ll/ۧۤ᩻;->᩹:Z

    iget-object p2, p0, Ll/ۧۤ᩻;->᩶:Ll/֡ۚۢ;

    if-eqz p1, :cond_1

    .line 679
    iget-object p1, p0, Ll/ۧۤ᩻;->۫:Ll/ܳۨܽ;

    invoke-virtual {p1, p2}, Ll/ܳۨܽ;->֫(Ll/֡ۚۢ;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Ll/֡ۚۢ;->ۜ()Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    return-void

    .line 683
    :cond_1
    iget-object p1, p0, Ll/ۧۤ᩻;->۬:Ll/ܽ᩺ܽ;

    invoke-static {p1}, Ll/᩶ۗ᩻;->ۧ(Ll/ܽ᩺ܽ;)V

    .line 684
    iget-object p1, p0, Ll/ۧۤ᩻;->ۗ:Ll/ܳ۫᩻;

    invoke-virtual {p1}, Ll/ܳ۫᩻;->run()V

    const p1, 0x7f1208d1

    .line 685
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 686
    invoke-virtual {p2}, Ll/֡ۚۢ;->dismiss()V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)Z
    .locals 4

    .line 696
    iget-boolean v0, p0, Ll/ۧۤ᩻;->᩹:Z

    const/4 v1, 0x1

    iget-object v2, p0, Ll/ۧۤ᩻;->᩶:Ll/֡ۚۢ;

    if-eqz v0, :cond_1

    .line 697
    iget-object v0, p0, Ll/ۧۤ᩻;->۫:Ll/ܳۨܽ;

    invoke-virtual {v0, v2}, Ll/ܳۨܽ;->֫(Ll/֡ۚۢ;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v2}, Ll/֡ۚۢ;->ۜ()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    return v1

    .line 701
    :cond_1
    instance-of v0, p1, Ll/᩸ܿᩳ;

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    check-cast p1, Ll/᩸ܿᩳ;

    .line 702
    iget-object v0, p0, Ll/ۧۤ᩻;->ۙ:Landroid/widget/TextView;

    invoke-static {v0, p1}, Ll/ۡۨܽ;->֫(Landroid/widget/TextView;Ll/᩸ܿᩳ;)V

    .line 703
    invoke-virtual {v2}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/view/View;->setEnabled(Z)V

    return v1

    .line 715
    :cond_2
    instance-of v0, p1, Ll/۫ۗܳ;

    if-eqz v0, :cond_3

    check-cast p1, Ll/۫ۗܳ;

    .line 717
    invoke-virtual {p1}, Ll/۫ۗܳ;->֫()Ljava/lang/String;

    move-result-object p1

    new-array v0, v1, [Ljava/lang/Object;

    aput-object p1, v0, v3

    const p1, 0x7f12007e

    .line 716
    invoke-static {p1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩸ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    return v1

    :cond_3
    const/4 v0, 0x0

    .line 546
    iget-object v2, p0, Ll/ۧۤ᩻;->᩸:Ll/ۗܺ᩷;

    invoke-virtual {v2, p1, v0}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return v1
.end method
