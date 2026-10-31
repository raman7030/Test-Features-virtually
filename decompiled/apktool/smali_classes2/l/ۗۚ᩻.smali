.class public final Ll/ۗۚ᩻;
.super Ll/֫ۜܳ;
.source "C9QS"


# instance fields
.field public final ۗ:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 2

    if-eqz p1, :cond_0

    const v0, 0x7f1205d0

    goto :goto_0

    :cond_0
    const v0, 0x7f1205d6

    :goto_0
    if-eqz p1, :cond_1

    const v1, 0x7f080254

    goto :goto_1

    :cond_1
    const v1, 0x7f080250

    .line 57
    :goto_1
    invoke-direct {p0, v0, v1}, Ll/֫ۜܳ;-><init>(II)V

    .line 59
    iput-boolean p1, p0, Ll/ۗۚ᩻;->ۗ:Z

    .line 60
    invoke-virtual {p0}, Ll/֫ۜܳ;->֫()V

    return-void
.end method


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 10

    .line 73
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    const-string v1, "payload"

    .line 74
    invoke-virtual {p1, v1}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    const-string v1, "local"

    .line 75
    invoke-virtual {v0, v1}, Ll/ܽۢܳ;->֫(Ljava/lang/String;)V

    .line 76
    iget-boolean v0, p0, Ll/ۗۚ᩻;->ۗ:Z

    if-eqz v0, :cond_0

    const v1, 0x7f1205d0

    goto :goto_0

    :cond_0
    const v1, 0x7f1205d6

    .line 77
    :goto_0
    invoke-static {p1, v1}, Ll/֫ۜܳ;->֫(Ll/ۖۢܳ;I)Ljava/lang/String;

    move-result-object v2

    if-eqz v0, :cond_2

    .line 79
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v0

    .line 86
    new-instance v3, Landroid/text/SpannableStringBuilder;

    invoke-direct {v3, v2}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 87
    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    const-string v4, "\n \n"

    .line 88
    invoke-virtual {v3, v4}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 89
    new-instance v4, Landroid/text/style/AbsoluteSizeSpan;

    const/4 v5, 0x4

    const/4 v6, 0x1

    invoke-direct {v4, v5, v6}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v5

    const/16 v7, 0x21

    invoke-virtual {v3, v4, v2, v5, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 91
    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    .line 105
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide/16 v4, 0x0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ᩳۜܳ;

    .line 106
    check-cast v8, Ll/᩵֨᩻;

    invoke-virtual {v8}, Ll/᩵֨᩻;->ܽ()J

    move-result-wide v8

    add-long/2addr v4, v8

    goto :goto_1

    .line 94
    :cond_1
    invoke-static {v4, v5}, Ll/᩺ۤۡ;->ۧ(J)Ljava/lang/String;

    move-result-object v0

    new-array v4, v6, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const v0, 0x7f120851

    .line 92
    invoke-static {v0, v4}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 95
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    sget v4, Ll/᩹֡᩷;->ۜ֫:I

    invoke-direct {v0, v4}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 96
    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v4

    .line 95
    invoke-virtual {v3, v0, v2, v4, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 97
    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    const/high16 v4, 0x41700000    # 15.0f

    invoke-static {v4}, Ll/ۧ᩸ۡ;->ܽ(F)I

    move-result v4

    invoke-direct {v0, v4}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    .line 98
    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v4

    .line 97
    invoke-virtual {v3, v0, v2, v4, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    move-object v2, v3

    .line 81
    :cond_2
    invoke-virtual {p0, p1, v1, v2}, Ll/֫ۜܳ;->֫(Ll/ۖۢܳ;ILjava/lang/CharSequence;)Ll/֡ۚۢ;

    return-void
.end method

.method public final ܿ(Ll/ۖۢܳ;)V
    .locals 4

    .line 113
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    const-string v1, "local"

    .line 114
    invoke-virtual {v0, v1}, Ll/ܽۢܳ;->֫(Ljava/lang/String;)V

    .line 115
    invoke-virtual {v0}, Ll/ܽۢܳ;->᩵()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/String;

    invoke-static {v1, v3}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 377
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۠()Z

    move-result v1

    if-nez v1, :cond_1

    .line 116
    iget-boolean v1, p0, Ll/ۗۚ᩻;->ۗ:Z

    if-eqz v1, :cond_0

    const v1, 0x7f120852

    goto :goto_0

    :cond_0
    const v1, 0x7f120b8e

    .line 118
    :goto_0
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-virtual {v0}, Ll/ܽۢܳ;->᩵()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v2

    invoke-static {v1, v3}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 516
    invoke-virtual {p1, v0, v2}, Ll/ۗܺ᩷;->֫(Ljava/lang/String;Z)V

    return-void

    .line 121
    :cond_1
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v1

    .line 122
    sget v2, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance v2, Ll/֨۠ۢ;

    const-class v3, Ll/ۙۚ᩻;

    invoke-direct {v2, v3}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    .line 123
    invoke-virtual {v2, v1}, Ll/֨۠ۢ;->֫(Ljava/util/List;)V

    .line 124
    invoke-virtual {v2, p1}, Ll/֨۠ۢ;->ۧ(Ll/ۖۢܳ;)V

    .line 330
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object p1

    invoke-virtual {v2, p1}, Ll/֨۠ۢ;->֫(Ll/ܽ᩷ܳ;)V

    const-string p1, "targetPath"

    .line 126
    invoke-virtual {v0}, Ll/ܽۢܳ;->᩵()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, p1, v0}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    invoke-virtual {v2}, Ll/֨۠ۢ;->֫()I

    return-void
.end method

.method public final ᩳ(Ll/ۖۢܳ;)Z
    .locals 2

    .line 65
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    const-string v1, "payload"

    .line 66
    invoke-virtual {p1, v1}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "local"

    .line 67
    invoke-virtual {v0, p1}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 68
    invoke-virtual {v0}, Ll/ܽۢܳ;->۫()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
