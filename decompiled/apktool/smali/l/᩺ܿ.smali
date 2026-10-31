.class public final Ll/᩺ܿ;
.super Ljava/lang/Object;
.source "422Y"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۚܳ;


# direct methods
.method public constructor <init>(Ll/ۚܳ;)V
    .locals 0

    .line 1340
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ܿ;->᩸:Ll/ۚܳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1343
    iget-object v0, p0, Ll/᩺ܿ;->᩸:Ll/ۚܳ;

    iget-object v1, v0, Ll/ۚܳ;->֫֫:Landroid/widget/PopupWindow;

    iget-object v2, v0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    const/16 v3, 0x37

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v3, v4, v4}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 1452
    iget-object v1, v0, Ll/ۚܳ;->۠֫:Ll/ܶ᩺;

    if-eqz v1, :cond_0

    .line 1453
    invoke-virtual {v1}, Ll/ܶ᩺;->֫()V

    .line 1348
    :cond_0
    invoke-virtual {v0}, Ll/ۚܳ;->᩶()Z

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz v1, :cond_1

    .line 1349
    iget-object v1, v0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/view/View;->setAlpha(F)V

    .line 1350
    iget-object v1, v0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    invoke-static {v1}, Ll/ܿ᩺;->֫(Landroid/view/View;)Ll/ܶ᩺;

    move-result-object v1

    invoke-virtual {v1, v2}, Ll/ܶ᩺;->֫(F)V

    iput-object v1, v0, Ll/ۚܳ;->۠֫:Ll/ܶ᩺;

    .line 1351
    new-instance v0, Ll/ۨܿ;

    invoke-direct {v0, p0}, Ll/ۨܿ;-><init>(Ll/᩺ܿ;)V

    invoke-virtual {v1, v0}, Ll/ܶ᩺;->֫(Ll/᩸᩺;)V

    return-void

    .line 1365
    :cond_1
    iget-object v1, v0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 1366
    iget-object v0, v0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    invoke-virtual {v0, v4}, Ll/֨᩷;->setVisibility(I)V

    return-void
.end method
