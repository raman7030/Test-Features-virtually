.class public final synthetic Ll/ܺۗܳ;
.super Ljava/lang/Object;
.source "X4HD"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۗ:Ll/۬ۗܳ;

.field public final synthetic ۙ:Ll/ۗܺ᩷;

.field public final synthetic ۬:Landroid/widget/TextView;

.field public final synthetic ᩶:Ll/ܳۨܽ;

.field public final synthetic ᩸:Ll/֡ۚۢ;

.field public final synthetic ᩹:Ll/ۜۨܽ;


# direct methods
.method public synthetic constructor <init>(Ll/֡ۚۢ;Ll/ۜۨܽ;Ll/ܳۨܽ;Ll/ۗܺ᩷;Ll/۬ۗܳ;Landroid/widget/TextView;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺۗܳ;->᩸:Ll/֡ۚۢ;

    iput-object p2, p0, Ll/ܺۗܳ;->᩹:Ll/ۜۨܽ;

    iput-object p3, p0, Ll/ܺۗܳ;->᩶:Ll/ܳۨܽ;

    iput-object p4, p0, Ll/ܺۗܳ;->ۙ:Ll/ۗܺ᩷;

    iput-object p5, p0, Ll/ܺۗܳ;->ۗ:Ll/۬ۗܳ;

    iput-object p6, p0, Ll/ܺۗܳ;->۬:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 10

    .line 227
    iget-object v3, p0, Ll/ܺۗܳ;->᩸:Ll/֡ۚۢ;

    invoke-virtual {v3}, Ll/֡ۚۢ;->ۜ()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 230
    :cond_0
    iget-object v5, p0, Ll/ܺۗܳ;->᩹:Ll/ۜۨܽ;

    invoke-interface {v5}, Ll/᩻ۨܽ;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 233
    :cond_1
    invoke-interface {v5}, Ll/᩻ۨܽ;->֫()Ll/ܽ᩺ܽ;

    move-result-object v6

    .line 234
    invoke-static {v6}, Ll/ۡۨܽ;->֫(Ll/ܽ᩺ܽ;)Ll/ۨۧᩳ;

    move-result-object v7

    .line 235
    invoke-virtual {v7}, Ll/ۨۧᩳ;->ᩳ()Ll/۬ܿᩳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/۬ܿᩳ;->ᩴ()Z

    move-result p1

    iget-object v4, p0, Ll/ܺۗܳ;->ۗ:Ll/۬ۗܳ;

    if-eqz p1, :cond_3

    .line 236
    invoke-virtual {v7}, Ll/ۨۧᩳ;->ᩳ()Ll/۬ܿᩳ;

    move-result-object p1

    instance-of v1, p1, Ll/᩹ܿᩳ;

    .line 237
    iget-object v2, p0, Ll/ܺۗܳ;->᩶:Ll/ܳۨܽ;

    if-eqz v1, :cond_2

    invoke-virtual {v2, v3}, Ll/ܳۨܽ;->ۧ(Ll/֡ۚۢ;)Z

    move-result p1

    if-nez p1, :cond_2

    :goto_0
    return-void

    .line 240
    :cond_2
    invoke-virtual {v7}, Ll/ۨۧᩳ;->ᩳ()Ll/۬ܿᩳ;

    move-result-object p1

    new-instance v9, Ll/᩹ۗܳ;

    iget-object v8, p0, Ll/ܺۗܳ;->۬:Landroid/widget/TextView;

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Ll/᩹ۗܳ;-><init>(ZLl/ܳۨܽ;Ll/֡ۚۢ;Ll/۬ۗܳ;Ll/ۜۨܽ;Ll/ܽ᩺ܽ;Ll/ۨۧᩳ;Landroid/widget/TextView;)V

    iget-object v0, p0, Ll/ܺۗܳ;->ۙ:Ll/ۗܺ᩷;

    invoke-static {v9, p1, v0}, Ll/ۡۨܽ;->֫(Ll/᩷ۨܽ;Ll/۬ܿᩳ;Ll/ۗܺ᩷;)V

    return-void

    .line 283
    :cond_3
    invoke-interface {v5, v6}, Ll/ۜۨܽ;->֫(Ll/ܽ᩺ܽ;)V

    .line 284
    invoke-virtual {v3}, Ll/֡ۚۢ;->dismiss()V

    const/4 p1, 0x0

    .line 285
    invoke-interface {v4, v7, p1}, Ll/۬ۗܳ;->֫(Ll/ۨۧᩳ;Z)V

    return-void
.end method
