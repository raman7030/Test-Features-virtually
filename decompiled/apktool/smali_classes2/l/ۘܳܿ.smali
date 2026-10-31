.class public final Ll/ۘܳܿ;
.super Ljava/lang/Object;
.source "4AWI"


# instance fields
.field public final ֫:Ll/ۗۘ;

.field public final ۧ:Landroid/widget/TextView;

.field public final ܳ:Landroid/view/View;

.field public final ܽ:Landroid/widget/TextView;

.field public final synthetic ܿ:Ll/֡ܳܿ;

.field public final ᩳ:Ll/ۗۘ;


# direct methods
.method public constructor <init>(Ll/֡ܳܿ;)V
    .locals 4

    .line 805
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘܳܿ;->ܿ:Ll/֡ܳܿ;

    const v0, 0x7f0d01e9

    .line 806
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Ll/ۘܳܿ;->ܳ:Landroid/view/View;

    const v0, 0x7f0a0402

    .line 807
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll/ۘܳܿ;->ۧ:Landroid/widget/TextView;

    .line 808
    invoke-direct {p0}, Ll/ۘܳܿ;->֫()V

    const v0, 0x7f0a0401

    .line 809
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Ll/ۜܳܿ;

    invoke-direct {v1, p0}, Ll/ۜܳܿ;-><init>(Ll/ۘܳܿ;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a0405

    .line 848
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll/ۘܳܿ;->ܽ:Landroid/widget/TextView;

    .line 849
    invoke-direct {p0}, Ll/ۘܳܿ;->ۧ()V

    const v0, 0x7f0a0404

    .line 850
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Ll/᩷ܳܿ;

    invoke-direct {v1, p0}, Ll/᩷ܳܿ;-><init>(Ll/ۘܳܿ;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a0599

    .line 858
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ۗۘ;

    iput-object v0, p0, Ll/ۘܳܿ;->ᩳ:Ll/ۗۘ;

    .line 859
    sget v1, Ll/۠ܳܿ;->֫:I

    .line 276
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "tfugh"

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    .line 859
    invoke-virtual {v0, v1}, Ll/ۗۘ;->setChecked(Z)V

    const v0, 0x7f0a0407

    .line 860
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Ll/ۢܳܿ;

    invoke-direct {v1, p0}, Ll/ۢܳܿ;-><init>(Ll/ۘܳܿ;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a059a

    .line 864
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ۗۘ;

    iput-object v0, p0, Ll/ۘܳܿ;->֫:Ll/ۗۘ;

    .line 865
    invoke-static {}, Ll/ۙ֡ᩳ;->ܿ()Z

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۗۘ;->setChecked(Z)V

    const v0, 0x7f0a03ff

    .line 866
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance v0, Ll/ۡܳܿ;

    invoke-direct {v0, p0}, Ll/ۡܳܿ;-><init>(Ll/ۘܳܿ;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private ֫()V
    .locals 4

    .line 874
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget v1, Ll/۠ܳܿ;->֫:I

    .line 245
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "text_function_min_line"

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v1

    .line 874
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "text_function_max_line"

    const/4 v3, 0x4

    invoke-interface {v1, v2, v3}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v1

    .line 874
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ۘܳܿ;->ۧ:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۘܳܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۘܳܿ;->֫()V

    return-void
.end method

.method public static ֫(Ll/ۘܳܿ;Landroid/content/DialogInterface;I)V
    .locals 2

    .line 853
    sget v0, Ll/۠ܳܿ;->֫:I

    .line 271
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    const-string v1, "tfgi"

    invoke-interface {v0, p2, v1}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p2

    invoke-interface {p2}, Ll/۬ۤۡ;->apply()V

    .line 272
    invoke-static {}, Ll/۠ܳܿ;->ᩳ()V

    .line 854
    invoke-direct {p0}, Ll/ۘܳܿ;->ۧ()V

    .line 855
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method

.method private ۧ()V
    .locals 3

    .line 878
    sget v0, Ll/۠ܳܿ;->֫:I

    .line 267
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "tfgi"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const v0, 0x7f120429

    .line 881
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const v0, 0x7f12042a

    .line 880
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    const v0, 0x7f12042b

    .line 879
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    .line 878
    :goto_0
    iget-object v1, p0, Ll/ۘܳܿ;->ܽ:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
