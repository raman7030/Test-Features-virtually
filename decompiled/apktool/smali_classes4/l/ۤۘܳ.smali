.class public final synthetic Ll/ۤۘܳ;
.super Ljava/lang/Object;
.source "OAYY"

# interfaces
.implements Ll/ܺ᩹᩵;


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 2
    check-cast p1, Ll/ۗ᩻᩻;

    const-string v0, "cfg"

    .line 0
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 829
    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-virtual {p1}, Ll/ۗ᩻᩻;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    .line 830
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    .line 831
    invoke-virtual {p1}, Ll/ۗ᩻᩻;->ܽ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 832
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result p1

    .line 834
    new-instance v2, Landroid/text/style/ForegroundColorSpan;

    sget v3, Ll/᩹֡᩷;->ۜ֫:I

    invoke-direct {v2, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/16 v3, 0x11

    .line 833
    invoke-virtual {v0, v2, v1, p1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 840
    new-instance v2, Landroid/text/style/RelativeSizeSpan;

    const v4, 0x3f28f5c3    # 0.66f

    invoke-direct {v2, v4}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 839
    invoke-virtual {v0, v2, v1, p1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    return-object v0
.end method
