.class public final Ll/۠۟᩷;
.super Ll/ۗ۬ۧ;
.source "O1JS"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۗ:Ll/ۛ۟᩷;

.field public ۙ:Landroid/widget/TextView;

.field public ᩶:Ll/᩵ۛ᩷;

.field public ᩸:I

.field public ᩹:Ll/ۚۛ᩷;


# direct methods
.method public constructor <init>(Ll/ۛ۟᩷;Landroid/view/View;)V
    .locals 0

    .line 542
    iput-object p1, p0, Ll/۠۟᩷;->ۗ:Ll/ۛ۟᩷;

    .line 543
    invoke-direct {p0, p2}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    const p1, 0x7f0a05e2

    .line 544
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/۠۟᩷;->ۙ:Landroid/widget/TextView;

    .line 545
    invoke-static {p2}, Ll/᩶ۖ᩷;->ۧ(Landroid/view/View;)V

    .line 546
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۠۟᩷;)Landroid/widget/TextView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۠۟᩷;->ۙ:Landroid/widget/TextView;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/۠۟᩷;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۠۟᩷;->᩸:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۠۟᩷;Ll/ۚۛ᩷;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/۠۟᩷;->᩹:Ll/ۚۛ᩷;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۠۟᩷;Ll/᩵ۛ᩷;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/۠۟᩷;->᩶:Ll/᩵ۛ᩷;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 551
    iget-object p1, p0, Ll/۠۟᩷;->ۗ:Ll/ۛ۟᩷;

    invoke-static {p1}, Ll/ۛ۟᩷;->ܽ(Ll/ۛ۟᩷;)Ll/᩵ۨ᩷;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ll/ۛ۟᩷;->ܽ(Ll/ۛ۟᩷;)Ll/᩵ۨ᩷;

    move-result-object v0

    iget-object v1, p0, Ll/۠۟᩷;->᩹:Ll/ۚۛ᩷;

    iget-object v1, v1, Ll/ۚۛ᩷;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/᩵ۨ᩷;->ۡ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 554
    :cond_0
    sget-object v0, Ll/ܰܳۡ;->ۢ֫:Ll/ۡۤۡ;

    invoke-virtual {v0}, Ll/ۡۤۡ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 557
    :cond_1
    invoke-virtual {p1}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v0

    check-cast v0, Ll/ܿۛ᩷;

    iget-object v1, p0, Ll/۠۟᩷;->᩹:Ll/ۚۛ᩷;

    iget-object v1, v1, Ll/ۚۛ᩷;->ۧ:Ljava/lang/String;

    iget-object v2, p0, Ll/۠۟᩷;->᩶:Ll/᩵ۛ᩷;

    invoke-virtual {v0, v1, v2}, Ll/ܿۛ᩷;->ۧ(Ljava/lang/String;Ll/᩵ۛ᩷;)V

    .line 558
    invoke-static {p1}, Ll/ۛ۟᩷;->ܽ(Ll/ۛ۟᩷;)Ll/᩵ۨ᩷;

    move-result-object v0

    iget-object v1, p0, Ll/۠۟᩷;->᩹:Ll/ۚۛ᩷;

    iget-object v1, v1, Ll/ۚۛ᩷;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/᩵ۨ᩷;->֫(Ljava/lang/String;)V

    .line 559
    invoke-static {p1}, Ll/ۛ۟᩷;->ᩳ(Ll/ۛ۟᩷;)Ljava/util/Stack;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֨ۛ᩷;

    iget-object p1, p1, Ll/֨ۛ᩷;->֫:Ljava/util/HashSet;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/۠۟᩷;->᩹:Ll/ۚۛ᩷;

    iget-object v1, v1, Ll/ۚۛ᩷;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/۠۟᩷;->᩸:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 560
    new-instance p1, Ll/֨۟᩷;

    invoke-direct {p1, p0}, Ll/֨۟᩷;-><init>(Ll/۠۟᩷;)V

    const-wide/16 v0, 0xc8

    invoke-static {p1, v0, v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    :cond_2
    :goto_0
    return-void
.end method
