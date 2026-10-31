.class public final Ll/ܽ۬ܿ;
.super Ll/֫۫ܿ;
.source "S5I2"


# instance fields
.field public final synthetic ۗ:Ll/ܿ۬ܿ;

.field public final synthetic ۛ:Ll/ۙۢ;

.field public final synthetic ۤ:Ll/ۙۢ;

.field public final synthetic ۫:Ll/ۙۢ;

.field public final synthetic ۬:Ll/ۗܺ᩷;


# direct methods
.method public constructor <init>(Ll/ܿ۬ܿ;Ll/ۗܺ᩷;Ljava/lang/String;ILl/ۙۢ;Ll/ۙۢ;Ll/ۙۢ;Ll/ۗܺ᩷;)V
    .locals 0

    .line 38
    iput-object p1, p0, Ll/ܽ۬ܿ;->ۗ:Ll/ܿ۬ܿ;

    iput-object p5, p0, Ll/ܽ۬ܿ;->ۛ:Ll/ۙۢ;

    iput-object p6, p0, Ll/ܽ۬ܿ;->۫:Ll/ۙۢ;

    iput-object p7, p0, Ll/ܽ۬ܿ;->ۤ:Ll/ۙۢ;

    iput-object p8, p0, Ll/ܽ۬ܿ;->۬:Ll/ۗܺ᩷;

    invoke-direct {p0, p4, p2, p3}, Ll/֫۫ܿ;-><init>(ILl/ۗܺ᩷;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 3

    .line 82
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    .line 83
    iget-object v0, p0, Ll/ܽ۬ܿ;->ۗ:Ll/ܿ۬ܿ;

    invoke-static {v0}, Ll/ܿ۬ܿ;->֫(Ll/ܿ۬ܿ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙۢ;

    .line 84
    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 85
    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    invoke-interface {p1, v2, v1}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    goto :goto_0

    .line 87
    :cond_1
    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    return-void
.end method

.method public final ܿ()V
    .locals 6

    .line 41
    invoke-virtual {p0}, Ll/֫۫ܿ;->ܽ()Ljava/lang/String;

    move-result-object v0

    .line 42
    iget-object v1, p0, Ll/ܽ۬ܿ;->ۗ:Ll/ܿ۬ܿ;

    invoke-virtual {v1, v0}, Ll/ܿ۬ܿ;->֫(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 43
    invoke-virtual {p0}, Ll/֫۫ܿ;->ܳ()V

    .line 44
    invoke-virtual {p0}, Ll/֫۫ܿ;->֫()V

    return-void

    .line 48
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 49
    invoke-virtual {v1}, Ll/ܿ۬ܿ;->֫()V

    .line 50
    invoke-virtual {p0}, Ll/֫۫ܿ;->֫()V

    return-void

    .line 54
    :cond_1
    iget-object v2, p0, Ll/ܽ۬ܿ;->ۛ:Ll/ۙۢ;

    invoke-virtual {v2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v2

    iget-object v3, p0, Ll/ܽ۬ܿ;->۫:Ll/ۙۢ;

    if-nez v2, :cond_2

    const/16 v2, 0x10

    move-object v4, v0

    goto :goto_1

    .line 56
    :cond_2
    invoke-virtual {v3}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v2

    if-nez v2, :cond_3

    move-object v2, v0

    :goto_0
    const-string v4, ".*"

    .line 58
    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x2

    if-le v4, v5, :cond_4

    .line 59
    invoke-virtual {v2, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_3
    move-object v2, v0

    :cond_4
    const/4 v4, 0x0

    move-object v4, v2

    const/4 v2, 0x0

    .line 62
    :goto_1
    iget-object v5, p0, Ll/ܽ۬ܿ;->ۤ:Ll/ۙۢ;

    invoke-virtual {v5}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v5

    if-nez v5, :cond_5

    or-int/lit8 v2, v2, 0x42

    .line 66
    :cond_5
    :try_start_0
    invoke-static {v2, v4}, Ll/ۨۘܽ;->֫(ILjava/lang/String;)Ll/ۨۘܽ;

    move-result-object v2

    .line 67
    invoke-virtual {p0}, Ll/֫۫ܿ;->ܳ()V

    .line 68
    invoke-virtual {p0}, Ll/֫۫ܿ;->֫()V

    .line 69
    new-instance v4, Ll/ᩳ۬ܿ;

    invoke-virtual {v3}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v3

    invoke-direct {v4, v2, v3}, Ll/ᩳ۬ܿ;-><init>(Ll/ۨۘܽ;Z)V

    invoke-virtual {v1, v4, v0}, Ll/ܿ۬ܿ;->֫(Ll/ᩳ۬ܿ;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 71
    iget-object v1, p0, Ll/ܽ۬ܿ;->۬:Ll/ۗܺ᩷;

    const/4 v2, 0x0

    .line 546
    invoke-virtual {v1, v0, v2}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 77
    iget-object v0, p0, Ll/ܽ۬ܿ;->ۗ:Ll/ܿ۬ܿ;

    invoke-virtual {v0}, Ll/ܿ۬ܿ;->֫()V

    return-void
.end method
