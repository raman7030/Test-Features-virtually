.class public final Ll/ܶܿۢ;
.super Ljava/lang/Object;
.source "SBMC"

# interfaces
.implements Ll/ܿۡۡ;


# instance fields
.field public final synthetic ֫:Ll/᩶ܿۢ;

.field public final synthetic ۧ:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ll/᩶ܿۢ;Landroid/widget/TextView;)V
    .locals 0

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶܿۢ;->֫:Ll/᩶ܿۢ;

    iput-object p2, p0, Ll/ܶܿۢ;->ۧ:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 103
    iget-object v0, p0, Ll/ܶܿۢ;->֫:Ll/᩶ܿۢ;

    invoke-static {v0}, Ll/᩶ܿۢ;->ᩳ(Ll/᩶ܿۢ;)Ll/᩸ܿۢ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/᩸ܿۢ;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ll/ܳۡۡ;)V
    .locals 1

    .line 108
    invoke-virtual {p1}, Ll/ܳۡۡ;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Ll/ܶܿۢ;->ۧ:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final synthetic ۧ(Ljava/lang/String;)V
    .locals 0

    return-void
.end method
