.class public final Ll/ۚܶܳ;
.super Ll/ܿܶܳ;
.source "67CI"


# instance fields
.field public final ۨ:Ll/ܰܶܳ;


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;Ll/ۗܶܳ;Ll/ܰܶܳ;)V
    .locals 6

    .line 22
    iget-object v2, p3, Ll/ܰܶܳ;->ۧ:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "drawer_expand_network_group_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p3, Ll/ܰܶܳ;->֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget v5, p3, Ll/ܰܶܳ;->֫:I

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Ll/ܿܶܳ;-><init>(Lbin/mt/plus/Main;Ljava/lang/String;Ljava/lang/String;Ll/ۗܶܳ;I)V

    .line 23
    iput-object p3, p0, Ll/ۚܶܳ;->ۨ:Ll/ܰܶܳ;

    return-void
.end method

.method public static synthetic ֫(Ll/ۚܶܳ;)V
    .locals 0

    .line 64
    iget-object p0, p0, Ll/ۚܶܳ;->ۨ:Ll/ܰܶܳ;

    iget p0, p0, Ll/ܰܶܳ;->֫:I

    invoke-static {p0}, Ll/֫᩸ܳ;->֫(I)V

    return-void
.end method

.method public static ֫(Ll/ۚܶܳ;Landroid/view/MenuItem;)V
    .locals 8

    .line 57
    iget-object v0, p0, Ll/ۚܶܳ;->ۨ:Ll/ܰܶܳ;

    iget-object v1, p0, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const/4 v2, 0x1

    const v3, 0x7f1205f9

    if-ne p1, v3, :cond_0

    .line 178
    new-instance p0, Ll/۟۠ܳ;

    invoke-direct {p0, v1, v0}, Ll/۟۠ܳ;-><init>(Ll/ۗܺ᩷;Ll/ܰܶܳ;)V

    .line 195
    invoke-virtual {p0, v3}, Ll/۬ۗܿ;->ۡ(I)V

    iget-object p1, v0, Ll/ܰܶܳ;->ۧ:Ljava/lang/String;

    .line 196
    invoke-virtual {p0, p1}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    .line 197
    invoke-virtual {p0}, Ll/۬ۗܿ;->֫()V

    .line 198
    invoke-virtual {p0}, Ll/۬ۗܿ;->᩵()V

    .line 205
    invoke-virtual {p0, v2}, Ll/۬ۗܿ;->ۧ(Z)V

    return-void

    :cond_0
    const/4 v3, 0x0

    const v4, 0x7f12015e

    const v5, 0x7f12070a

    const v6, 0x7f1205ca

    if-ne p1, v6, :cond_1

    .line 61
    invoke-virtual {v1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    .line 62
    invoke-virtual {p1, v6}, Ll/᩵ۚۢ;->ۧ(I)V

    iget-object v0, v0, Ll/ܰܶܳ;->ۧ:Ljava/lang/String;

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v0, v2, v6

    const v0, 0x7f12023e

    .line 63
    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance v0, Ll/֡ܶܳ;

    invoke-direct {v0, p0}, Ll/֡ܶܳ;-><init>(Ll/ۚܶܳ;)V

    .line 64
    invoke-virtual {p1, v5, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 65
    invoke-virtual {p1, v4, v3}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 66
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    :cond_1
    const p0, 0x7f1202d5

    if-ne p1, p0, :cond_2

    const p1, 0x7f0d01e2

    .line 37
    invoke-virtual {v1, p1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/۬۬ۧ;

    .line 38
    invoke-static {}, Ll/֫᩸ܳ;->ܽ()Ljava/util/ArrayList;

    move-result-object v0

    .line 39
    new-instance v2, Ll/ᩳ᩸ܳ;

    invoke-direct {v2, v1, v0}, Ll/ᩳ᩸ܳ;-><init>(Ll/ۗܺ᩷;Ljava/util/ArrayList;)V

    const/high16 v6, 0x40c00000    # 6.0f

    .line 40
    invoke-static {v6}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v6

    const/4 v7, -0x1

    .line 27
    invoke-static {p1, v7, v6, v7, v7}, Ll/ۢ᩹ۡ;->֫(Landroid/view/View;IIII)V

    .line 41
    invoke-virtual {p1, v2}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    .line 42
    new-instance v6, Ll/֫ۗۧ;

    new-instance v7, Ll/ܽ᩸ܳ;

    invoke-direct {v7, v0, v2}, Ll/ܽ᩸ܳ;-><init>(Ljava/util/ArrayList;Ll/ᩳ᩸ܳ;)V

    invoke-direct {v6, v7}, Ll/֫ۗۧ;-><init>(Ll/ۤۙۧ;)V

    .line 69
    invoke-virtual {v6, p1}, Ll/֫ۗۧ;->֫(Ll/۬۬ۧ;)V

    .line 70
    invoke-virtual {v2, v6}, Ll/ᩳ᩸ܳ;->֫(Ll/֫ۗۧ;)V

    .line 71
    invoke-virtual {v1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v1

    .line 72
    invoke-virtual {v1, p0}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 73
    invoke-virtual {v1, p1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    new-instance p0, Ll/ۧ᩸ܳ;

    invoke-direct {p0, v0}, Ll/ۧ᩸ܳ;-><init>(Ljava/util/ArrayList;)V

    .line 74
    invoke-virtual {v1, v5, p0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 82
    invoke-virtual {v1, v4, v3}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 83
    invoke-virtual {v1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    :cond_2
    const p0, 0x7f1202d2

    if-ne p1, p0, :cond_3

    .line 70
    invoke-static {v1}, Ll/ܿܶܳ;->֫(Ll/ۗܺ᩷;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 4

    .line 44
    iget-object v0, p0, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    invoke-virtual {v0}, Ll/ۗܶܳ;->ܽ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 48
    :cond_0
    new-instance v0, Ll/᩸ۖ;

    iget-object v2, p0, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    const v3, 0x800055

    invoke-direct {v0, v2, p1, v3}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 49
    invoke-static {p1}, Ll/۟᩷ۡ;->᩷(Landroid/view/View;)V

    .line 50
    invoke-virtual {v0}, Ll/᩸ۖ;->ᩳ()V

    .line 51
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p1

    const v2, 0x7f1205f9

    .line 52
    invoke-interface {p1, v1, v2, v1, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const v3, 0x7f080231

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const v2, 0x7f1205ca

    .line 53
    invoke-interface {p1, v1, v2, v1, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const v3, 0x7f0801e7

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const v2, 0x7f1202d5

    .line 54
    invoke-interface {p1, v1, v2, v1, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const v3, 0x7f0801ee

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const v2, 0x7f1202d2

    .line 55
    invoke-interface {p1, v1, v2, v1, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    const v1, 0x7f0801fb

    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 56
    new-instance p1, Ll/ۚᩴᩳ;

    invoke-direct {p1, p0}, Ll/ۚᩴᩳ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 74
    invoke-virtual {v0}, Ll/᩸ۖ;->ܿ()V

    const/4 p1, 0x1

    return p1
.end method

.method public final ֫(Ll/ܳܶܳ;)V
    .locals 2

    .line 29
    invoke-super {p0, p1}, Ll/۫ܶܳ;->֫(Ll/ܳܶܳ;)V

    .line 30
    iget-object v0, p0, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    invoke-virtual {v0}, Ll/ۗܶܳ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 31
    check-cast p1, Ll/۬ܶܳ;

    .line 32
    iget-object p1, p1, Ll/ܳܶܳ;->۬:Landroid/widget/TextView;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/۫ܶܳ;->۫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v1, 0x7f1206c9

    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final ܽ()I
    .locals 2

    .line 39
    iget-boolean v0, p0, Ll/۫ܶܳ;->ۙ:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۫ܶܳ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/2addr v0, v1

    return v0

    :cond_0
    return v1
.end method
