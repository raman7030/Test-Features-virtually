.class public final Ll/֡᩻ܳ;
.super Ll/᩶ۗۧ;
.source "K7HV"


# instance fields
.field public final synthetic ֫:Ll/ۙ᩻ܳ;


# direct methods
.method public constructor <init>(Ll/ۙ᩻ܳ;)V
    .locals 0

    .line 194
    iput-object p1, p0, Ll/֡᩻ܳ;->֫:Ll/ۙ᩻ܳ;

    invoke-direct {p0}, Ll/᩶ۗۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 226
    iget-object v0, p0, Ll/֡᩻ܳ;->֫:Ll/ۙ᩻ܳ;

    invoke-static {v0}, Ll/ۙ᩻ܳ;->ܽ(Ll/ۙ᩻ܳ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 3

    .line 194
    check-cast p1, Ll/᩶᩻ܳ;

    .line 207
    iget-object v0, p0, Ll/֡᩻ܳ;->֫:Ll/ۙ᩻ܳ;

    invoke-static {v0}, Ll/ۙ᩻ܳ;->ܽ(Ll/ۙ᩻ܳ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/֨᩻ܳ;

    .line 208
    iget-object v1, p1, Ll/᩶᩻ܳ;->᩶:Landroid/widget/TextView;

    invoke-static {p2}, Ll/֨᩻ܳ;->֫(Ll/֨᩻ܳ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 209
    invoke-virtual {p2}, Ll/֨᩻ܳ;->ܽ()I

    move-result v1

    invoke-static {v1}, Ll/۟۬ܳ;->֫(I)I

    move-result v1

    .line 210
    invoke-virtual {p2}, Ll/֨᩻ܳ;->ܽ()I

    move-result p2

    invoke-static {p2}, Ll/۟۬ܳ;->ۧ(I)Z

    move-result p2

    if-eqz v1, :cond_3

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-eq v1, v2, :cond_0

    const-string v1, "error"

    goto :goto_0

    :cond_0
    const v1, 0x7f1209b9

    .line 215
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const v1, 0x7f1209b8

    .line 214
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    const v1, 0x7f1209b6

    .line 213
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_3
    const v1, 0x7f1209b7

    .line 212
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    if-eqz p2, :cond_4

    const-string p2, " ("

    .line 0
    invoke-static {v1, p2}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    const v1, 0x7f1209ba

    .line 219
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 221
    :cond_4
    iget-object p1, p1, Ll/᩶᩻ܳ;->᩸:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 3

    .line 199
    iget-object p2, p0, Ll/֡᩻ܳ;->֫:Ll/ۙ᩻ܳ;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d014e

    const/4 v2, 0x0

    .line 200
    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 201
    new-instance v0, Ll/᩶᩻ܳ;

    invoke-direct {v0, p2, p1}, Ll/᩶᩻ܳ;-><init>(Ll/ۙ᩻ܳ;Landroid/view/View;)V

    return-object v0
.end method
