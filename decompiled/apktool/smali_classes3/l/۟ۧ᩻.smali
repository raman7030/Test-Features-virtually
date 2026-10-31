.class public final Ll/۟ۧ᩻;
.super Ll/ۤۜܳ;
.source "22BV"


# direct methods
.method public static synthetic ֫(Ljava/util/List;)V
    .locals 2

    .line 982
    invoke-static {p0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    new-instance v0, Ll/֫ۧ֨;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/֫ۧ֨;-><init>(I)V

    .line 983
    invoke-interface {p0, v0}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v0

    invoke-interface {p0, v0}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    .line 984
    invoke-static {p0}, Ll/ܿۧ᩻;->֫(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܽۢܳ;)V
    .locals 9

    const v0, 0x7f12044a

    .line 964
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    .line 965
    invoke-virtual {p1}, Ll/ܽۢܳ;->᩸()Ljava/util/List;

    move-result-object v2

    .line 967
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-ne v3, v6, :cond_0

    .line 969
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۜܳ;

    invoke-interface {v3}, Ll/ᩳۜܳ;->᩺()Ljava/lang/String;

    move-result-object v3

    new-array v7, v5, [Ljava/lang/Object;

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    const v1, 0x7f1203b2

    .line 968
    invoke-static {v1, v7}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 972
    :cond_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-array v7, v5, [Ljava/lang/Object;

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    const v1, 0x7f1203b1

    .line 971
    invoke-static {v1, v7}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 974
    :goto_0
    new-instance v3, Landroid/text/SpannableString;

    const-string v4, "\n\n"

    .line 0
    invoke-static {v1, v4}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const v6, 0x7f12044d

    .line 974
    invoke-static {v6}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 975
    new-instance v4, Landroid/text/style/ForegroundColorSpan;

    sget v6, Ll/᩹֡᩷;->ۜ֫:I

    invoke-direct {v4, v6}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {v3}, Landroid/text/SpannableString;->length()I

    move-result v7

    const/16 v8, 0x11

    invoke-virtual {v3, v4, v6, v7, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 976
    new-instance v4, Landroid/text/style/RelativeSizeSpan;

    const/high16 v6, 0x3e800000    # 0.25f

    invoke-direct {v4, v6}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v7

    add-int/2addr v7, v5

    invoke-virtual {v3, v4, v6, v7, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 977
    new-instance v4, Landroid/text/style/RelativeSizeSpan;

    const v6, 0x3f666666    # 0.9f

    invoke-direct {v4, v6}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v5

    invoke-virtual {v3}, Landroid/text/SpannableString;->length()I

    move-result v5

    invoke-virtual {v3, v4, v1, v5, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 978
    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    .line 979
    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 980
    invoke-virtual {p1, v3}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance v0, Ll/ܰۧ᩻;

    invoke-direct {v0, v2}, Ll/ܰۧ᩻;-><init>(Ljava/util/List;)V

    const v1, 0x7f12070a

    .line 981
    invoke-virtual {p1, v1, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f12015e

    const/4 v1, 0x0

    .line 986
    invoke-virtual {p1, v0, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 987
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p1

    .line 988
    invoke-static {p1}, Ll/ۡܶۡ;->ۧ(Ll/֡ۚۢ;)V

    return-void
.end method

.method public final ۧ(Ll/ܽۢܳ;)Z
    .locals 0

    .line 959
    invoke-virtual {p1}, Ll/ܽۢܳ;->ۤ()Z

    move-result p1

    return p1
.end method
