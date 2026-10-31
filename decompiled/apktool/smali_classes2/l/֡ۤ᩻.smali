.class public final Ll/֡ۤ᩻;
.super Ll/᩶ۗۧ;
.source "M6WW"


# instance fields
.field public final synthetic ֫:Ll/ܶۤ᩻;


# direct methods
.method public constructor <init>(Ll/ܶۤ᩻;)V
    .locals 0

    .line 284
    iput-object p1, p0, Ll/֡ۤ᩻;->֫:Ll/ܶۤ᩻;

    invoke-direct {p0}, Ll/᩶ۗۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 318
    iget-object v0, p0, Ll/֡ۤ᩻;->֫:Ll/ܶۤ᩻;

    invoke-static {v0}, Ll/ܶۤ᩻;->ᩳ(Ll/ܶۤ᩻;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final getItemViewType(I)I
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public final onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 7

    .line 302
    iget-object v0, p0, Ll/֡ۤ᩻;->֫:Ll/ܶۤ᩻;

    if-nez p2, :cond_0

    .line 303
    iget-object p1, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const p2, 0x7f0a0011

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    invoke-static {v0}, Ll/ܶۤ᩻;->ܿ(Ll/ܶۤ᩻;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 306
    :cond_0
    invoke-static {v0}, Ll/ܶۤ᩻;->ᩳ(Ll/ܶۤ᩻;)Ljava/util/ArrayList;

    move-result-object v1

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܰۢۜ;

    .line 307
    check-cast p1, Ll/۠ۤ᩻;

    .line 308
    iget-object v1, p1, Ll/۠ۤ᩻;->ܽ:Landroid/widget/TextView;

    invoke-virtual {p2}, Ll/ܰۢۜ;->֫()Z

    move-result v2

    iget-object v3, p2, Ll/ܰۢۜ;->֫:Ll/ۛۢۜ;

    if-eqz v2, :cond_1

    invoke-static {v0}, Ll/ܶۤ᩻;->֫(Ll/ܶۤ᩻;)Ll/ۗܺ᩷;

    move-result-object v2

    const v4, 0x7f120576

    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    iget-object v2, p2, Ll/ܰۢۜ;->ܽ:Ljava/lang/String;

    :goto_0
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 309
    iget-object v1, p1, Ll/۠ۤ᩻;->֫:Landroid/widget/TextView;

    invoke-virtual {p2}, Ll/ܰۢۜ;->֫()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {v0, v3}, Ll/ܶۤ᩻;->֫(Ll/ܶۤ᩻;Ll/ۛۢۜ;)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    .line 312
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 310
    invoke-static {v0, v3}, Ll/ܶۤ᩻;->֫(Ll/ܶۤ᩻;Ll/ۛۢۜ;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " \u00b7 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Ll/ܶۤ᩻;->֫(Ll/ܶۤ᩻;)Ll/ۗܺ᩷;

    move-result-object v4

    .line 311
    iget-object v5, p2, Ll/ܰۢۜ;->ᩳ:Ll/ۜܺۜ;

    sget-object v6, Ll/ۜܺۜ;->ۙ:Ll/ۜܺۜ;

    if-ne v5, v6, :cond_3

    const v5, 0x7f120393

    goto :goto_1

    :cond_3
    const v5, 0x7f1203fb

    :goto_1
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    iget-boolean v4, p2, Ll/ܰۢۜ;->ۧ:Z

    if-eqz v4, :cond_4

    const-string v0, ""

    goto :goto_2

    :cond_4
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ll/ܶۤ᩻;->֫(Ll/ܶۤ᩻;)Ll/ۗܺ᩷;

    move-result-object v0

    const v3, 0x7f120572

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 309
    :goto_3
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 313
    iget-object p1, p1, Ll/۠ۤ᩻;->ۧ:Landroid/view/View;

    invoke-virtual {p2}, Ll/ܰۢۜ;->֫()Z

    move-result p2

    if-eqz p2, :cond_5

    const/4 p2, 0x4

    goto :goto_4

    :cond_5
    const/4 p2, 0x0

    :goto_4
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 4

    .line 293
    iget-object v0, p0, Ll/֡ۤ᩻;->֫:Ll/ܶۤ᩻;

    invoke-static {v0}, Ll/ܶۤ᩻;->֫(Ll/ܶۤ᩻;)Ll/ۗܺ᩷;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const/4 v2, 0x0

    if-nez p2, :cond_0

    .line 295
    new-instance p2, Ll/᩵ۤ᩻;

    const v0, 0x7f0d00d4

    invoke-virtual {v1, v0, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-direct {p2, p1}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    return-object p2

    .line 297
    :cond_0
    new-instance p2, Ll/۠ۤ᩻;

    const v3, 0x7f0d0161

    invoke-virtual {v1, v3, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-direct {p2, v0, p1}, Ll/۠ۤ᩻;-><init>(Ll/ܶۤ᩻;Landroid/view/View;)V

    return-object p2
.end method
