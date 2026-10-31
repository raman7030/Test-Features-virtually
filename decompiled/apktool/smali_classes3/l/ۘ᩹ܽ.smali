.class public final synthetic Ll/ۘ᩹ܽ;
.super Ljava/lang/Object;
.source "P676"

# interfaces
.implements Ll/ۖۛۡ;
.implements Ll/᩵᩹᩷;
.implements Ll/֨۟ᩳ;
.implements Ll/۠᩺ᩳ;
.implements Ll/ܽۨ;
.implements Lbin/mt/plugin/api/util/Consumer;
.implements Ll/۠ۛ᩷;
.implements Ll/ܶۖ;
.implements Ll/ۜ֡֨;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۘ᩹ܽ;->᩸:I

    iput-object p2, p0, Ll/ۘ᩹ܽ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)Ljava/util/List;
    .locals 5

    iget-object v0, p0, Ll/ۘ᩹ܽ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ܶۛ᩷;

    check-cast p1, Ll/֨᩺᩷;

    .line 55
    :try_start_0
    invoke-interface {p1}, Ll/֨᩺᩷;->֫()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 57
    invoke-virtual {v0}, Ll/ܶۛ᩷;->get()Ll/۫ۘܽ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 39
    invoke-static {v0}, Ll/ۛۜᩳ;->֫(Ll/۫ۘܽ;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 59
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 61
    :cond_0
    new-instance v2, Ll/᩵ۛ᩷;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ll/᩵ۛ᩷;-><init>(I)V

    .line 62
    invoke-virtual {v0}, Ll/۫ۘܽ;->start()I

    move-result v3

    iput v3, v2, Ll/᩵ۛ᩷;->᩸:I

    .line 63
    invoke-virtual {v0}, Ll/۫ۘܽ;->end()I

    move-result v3

    iput v3, v2, Ll/᩵ۛ᩷;->᩹:I

    .line 64
    iget v4, v2, Ll/᩵ۛ᩷;->᩸:I

    invoke-virtual {v2, v4, v3, p1}, Ll/᩵ۛ᩷;->֫(IILjava/lang/CharSequence;)V

    .line 65
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    invoke-static {v0}, Ll/ۛۜᩳ;->֫(Ll/۫ۘܽ;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 66
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v3, 0x7d0

    if-lt v2, v3, :cond_0

    :cond_1
    return-object v1

    :catchall_0
    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۘ᩹ܽ;->᩹:Ljava/lang/Object;

    check-cast v0, Lbin/mt/plugin/api/ui/PluginProgressBar;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginProgressBar;->setSecondaryProgress(I)V

    return-void
.end method

.method public onApplyWindowInsets(Landroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;
    .locals 5

    .line 2
    iget-object v0, p0, Ll/ۘ᩹ܽ;->᩹:Ljava/lang/Object;

    .line 4
    check-cast v0, Landroid/view/ViewGroup;

    .line 6
    sget v1, Ll/֡ۧ᩷;->ۢۧ:I

    const/4 v1, 0x1

    .line 166
    invoke-virtual {p2, v1}, Ll/᩸ܰ;->֫(I)Ll/ۧ۬;

    move-result-object v1

    const/4 v2, 0x2

    .line 167
    invoke-virtual {p2, v2}, Ll/᩸ܰ;->֫(I)Ll/ۧ۬;

    move-result-object v2

    const/16 v3, 0x8

    .line 168
    invoke-virtual {p2, v3}, Ll/᩸ܰ;->֫(I)Ll/ۧ۬;

    move-result-object v3

    .line 169
    iget v1, v1, Ll/ۧ۬;->ᩳ:I

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v1, v4, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 170
    iget v0, v2, Ll/ۧ۬;->֫:I

    iget v1, v3, Ll/ۧ۬;->֫:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p1, v4, v4, v4, v0}, Landroid/view/View;->setPadding(IIII)V

    return-object p2
.end method

.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۘ᩹ܽ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ۤ᩹ۢ;

    invoke-static {v0, p1}, Ll/ۤ᩹ۢ;->֫(Ll/ۤ᩹ۢ;Landroid/view/MenuItem;)V

    const/4 p1, 0x1

    return p1
.end method

.method public ֫()Landroid/view/View;
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ۘ᩹ܽ;->᩹:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    const v1, 0x7f0a04cf

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public ֫(I)V
    .locals 1

    .line 0
    iget v0, p0, Ll/ۘ᩹ܽ;->᩸:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/ۘ᩹ܽ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ܰ֡ܳ;

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Ll/ۘ᩹ܽ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ܰ۠ܽ;

    :goto_0
    invoke-virtual {v0, p1}, Ll/ۘ۠ۢ;->ۢ(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public ֫(IIII)V
    .locals 0

    .line 0
    iget-object p1, p0, Ll/ۘ᩹ܽ;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/۟۫ᩳ;

    invoke-static {p1, p2, p3, p4}, Ll/۟۫ᩳ;->֫(Ll/۟۫ᩳ;III)V

    return-void
.end method

.method public ֫(Landroid/content/Intent;I)V
    .locals 1

    .line 0
    iget v0, p0, Ll/ۘ᩹ܽ;->᩸:I

    packed-switch v0, :pswitch_data_0

    iget-object p1, p0, Ll/ۘ᩹ܽ;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/ۗܺ᩷;

    invoke-static {p1, p2}, Ll/ۗܺ᩷;->ۧ(Ll/ۗܺ᩷;I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ll/ۘ᩹ܽ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/᩷᩶ܽ;

    invoke-static {v0, p2, p1}, Ll/᩷᩶ܽ;->֫(Ll/᩷᩶ܽ;ILandroid/content/Intent;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public ֫(Ll/ۛ֡֨;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۘ᩹ܽ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/᩶ۘ֨;

    invoke-static {v0, p1}, Ll/᩶ۘ֨;->֫(Ll/᩶ۘ֨;Ll/ۛ֡֨;)V

    return-void
.end method

.method public synthetic ۧ()Ll/ۖۧܿ;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public synthetic ܽ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
