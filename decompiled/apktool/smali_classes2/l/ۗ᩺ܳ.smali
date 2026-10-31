.class public final Ll/ۗ᩺ܳ;
.super Ll/۠ܶۢ;
.source "Q28R"


# instance fields
.field public final synthetic ۜ:Ll/ܶ᩵ܿ;


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 258
    iput-object p1, p0, Ll/ۗ᩺ܳ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-direct {p0}, Ll/۠ܶۢ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;)Landroid/view/View;
    .locals 3

    const v0, 0x7f0d00da

    .line 261
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object p1

    const v0, 0x7f0a03b2

    .line 262
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 263
    iget-object v1, p0, Ll/ۗ᩺ܳ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    sget v2, Ll/۬᩺ܳ;->۠֫:I

    const v2, 0x7f120642

    .line 655
    invoke-static {v2, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 263
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p1
.end method

.method public final ֫(Ll/֡ۚۢ;)V
    .locals 3

    .line 269
    invoke-virtual {p1}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object p1

    const/4 v0, 0x0

    .line 270
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 271
    new-instance v0, Ll/ۜ֨ᩳ;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p1}, Ll/ۜ֨ᩳ;-><init>(ILjava/lang/Object;)V

    const-wide/16 v1, 0x320

    invoke-static {v1, v2, v0}, Ll/ۙ᩸᩷;->֫(JLjava/lang/Runnable;)V

    return-void
.end method

.method public final ֫(Landroid/view/View;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
