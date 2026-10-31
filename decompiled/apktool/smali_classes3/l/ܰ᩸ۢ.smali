.class public final Ll/ܰ᩸ۢ;
.super Ljava/lang/Object;
.source "N1TT"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/۟᩸ۢ;

.field public final synthetic ᩹:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ll/۟᩸ۢ;Landroid/widget/TextView;)V
    .locals 0

    .line 395
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ᩸ۢ;->᩸:Ll/۟᩸ۢ;

    iput-object p2, p0, Ll/ܰ᩸ۢ;->᩹:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 398
    iget-object v0, p0, Ll/ܰ᩸ۢ;->᩸:Ll/۟᩸ۢ;

    invoke-static {v0}, Ll/۟᩸ۢ;->ۡ(Ll/۟᩸ۢ;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_0

    return-void

    .line 401
    :cond_0
    iget-object v1, p0, Ll/ܰ᩸ۢ;->᩹:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-nez v3, :cond_1

    .line 403
    invoke-static {v0}, Ll/۟᩸ۢ;->ۡ(Ll/۟᩸ۢ;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 405
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x7f12015e

    invoke-static {v2}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " ("

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    add-int/lit8 v3, v3, -0x1

    .line 406
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const-wide/16 v0, 0x3e8

    .line 407
    invoke-static {p0, v0, v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    return-void
.end method
