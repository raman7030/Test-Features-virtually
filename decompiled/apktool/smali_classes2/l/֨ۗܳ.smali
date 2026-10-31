.class public final synthetic Ll/֨ۗܳ;
.super Ljava/lang/Object;
.source "X4HD"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Ll/֡ۚۢ;

.field public final synthetic ᩸:Landroid/widget/TextView;

.field public final synthetic ᩹:Ll/ۜۨܽ;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/TextView;Ll/ۜۨܽ;Ll/֡ۚۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ۗܳ;->᩸:Landroid/widget/TextView;

    iput-object p2, p0, Ll/֨ۗܳ;->᩹:Ll/ۜۨܽ;

    iput-object p3, p0, Ll/֨ۗܳ;->᩶:Ll/֡ۚۢ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 216
    iget-object v0, p0, Ll/֨ۗܳ;->᩹:Ll/ۜۨܽ;

    invoke-interface {v0}, Ll/᩻ۨܽ;->ܿ()Ll/᩸ܿᩳ;

    move-result-object v1

    iget-object v2, p0, Ll/֨ۗܳ;->᩸:Landroid/widget/TextView;

    invoke-static {v2, v1}, Ll/ۡۨܽ;->֫(Landroid/widget/TextView;Ll/᩸ܿᩳ;)V

    .line 217
    iget-object v1, p0, Ll/֨ۗܳ;->᩶:Ll/֡ۚۢ;

    invoke-virtual {v1}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v1

    invoke-interface {v0}, Ll/᩻ۨܽ;->ᩳ()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method
