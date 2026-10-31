.class public final Ll/ۙ۬ܳ;
.super Ljava/lang/Object;
.source "N7AP"


# direct methods
.method public static ֫(Landroid/view/View;Ll/᩹۬ܳ;Ll/᩹۬ܳ;)V
    .locals 4

    const v0, 0x7f0a01e6

    .line 30
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a01e5

    .line 31
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f0a01e4

    .line 32
    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    .line 101
    invoke-virtual {p1}, Ll/᩹۬ܳ;->ܽ()Z

    move-result v2

    invoke-virtual {p2}, Ll/᩹۬ܳ;->ܽ()Z

    move-result v3

    if-nez v2, :cond_1

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    .line 37
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    const/4 p2, 0x0

    .line 93
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    .line 93
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_1
    :goto_0
    const/4 v2, 0x0

    .line 43
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f12039e

    .line 44
    invoke-static {v1, v0, p1}, Ll/ۙ۬ܳ;->֫(Landroid/widget/TextView;ILl/᩹۬ܳ;)V

    const p1, 0x7f12039d

    .line 45
    invoke-static {p0, p1, p2}, Ll/ۙ۬ܳ;->֫(Landroid/widget/TextView;ILl/᩹۬ܳ;)V

    return-void
.end method

.method public static ֫(Landroid/widget/TextView;ILl/᩹۬ܳ;)V
    .locals 5

    .line 101
    invoke-virtual {p2}, Ll/᩹۬ܳ;->ܽ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    .line 93
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 p1, 0x8

    .line 94
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 57
    :cond_0
    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    const-string p1, ": "

    invoke-virtual {v0, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    .line 59
    invoke-virtual {p2}, Ll/᩹۬ܳ;->ܿ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 86
    invoke-virtual {p2}, Ll/᩹۬ܳ;->ۧ()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll/ܿۤۡ;->֫(J)Ljava/lang/String;

    move-result-object v0

    .line 60
    invoke-virtual {p1, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 63
    :goto_0
    invoke-virtual {p2}, Ll/᩹۬ܳ;->ᩳ()Z

    move-result v2

    if-eqz v2, :cond_3

    if-eqz v0, :cond_2

    .line 77
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    const-string v2, "\u00b7"

    .line 78
    invoke-virtual {p1, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 79
    new-instance v2, Ll/᩶۬ܳ;

    .line 107
    invoke-direct {v2}, Landroid/text/style/ReplacementSpan;-><init>()V

    .line 79
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v3

    const/16 v4, 0x21

    invoke-virtual {p1, v2, v0, v3, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 67
    :cond_2
    invoke-virtual {p2}, Ll/᩹۬ܳ;->֫()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll/᩺ۤۡ;->ۧ(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 69
    :cond_3
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
