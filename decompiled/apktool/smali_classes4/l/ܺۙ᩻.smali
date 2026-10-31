.class public final Ll/ܺۙ᩻;
.super Ljava/lang/Object;
.source "75VW"


# instance fields
.field public final ֫:Ll/ܳ۠ܳ;

.field public final ۧ:Ll/ܽۢܳ;


# direct methods
.method public constructor <init>(Ll/ܽۢܳ;)V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Ll/ܺۙ᩻;->ۧ:Ll/ܽۢܳ;

    .line 43
    new-instance v0, Ll/ܳ۠ܳ;

    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ܳ۠ܳ;-><init>(Lbin/mt/plus/Main;)V

    .line 44
    invoke-virtual {v0}, Ll/ܳ۠ܳ;->᩻()V

    .line 45
    invoke-virtual {v0}, Ll/ܳ۠ܳ;->ܳ()V

    iput-object v0, p0, Ll/ܺۙ᩻;->֫:Ll/ܳ۠ܳ;

    return-void
.end method

.method public static ֫(Ll/ܺۙ᩻;Ljava/util/List;)V
    .locals 2

    .line 187
    new-instance v0, Ll/֫ۙ᩻;

    iget-object v1, p0, Ll/ܺۙ᩻;->ۧ:Ll/ܽۢܳ;

    invoke-direct {v0, v1, p1}, Ll/֫ۙ᩻;-><init>(Ll/ܽۢܳ;Ljava/util/List;)V

    new-instance p1, Ll/ܳۙ᩻;

    invoke-direct {p1, p0}, Ll/ܳۙ᩻;-><init>(Ll/ܺۙ᩻;)V

    invoke-virtual {v0, p1}, Ll/֫ۙ᩻;->֫(Ll/ܳۙ᩻;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܺۙ᩻;Ljava/util/List;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    .line 161
    iget-object p0, p0, Ll/ܺۙ᩻;->ۧ:Ll/ܽۢܳ;

    invoke-virtual {p0}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ܽ᩷ܳ;->᩶()Ll/ܰܺܳ;

    move-result-object p0

    invoke-static {p2, p3, p0, p1}, Ll/ۧ᩸᩻;->֫(Landroid/widget/TextView;Landroid/widget/TextView;Ll/ܰܺܳ;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܺۙ᩻;Ll/۫᩶᩻;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    .line 135
    iget-object p0, p0, Ll/ܺۙ᩻;->ۧ:Ll/ܽۢܳ;

    invoke-virtual {p0}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ܽ᩷ܳ;->᩶()Ll/ܰܺܳ;

    move-result-object p0

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p2, p3, p0, p1}, Ll/ۧ᩸᩻;->֫(Landroid/widget/TextView;Landroid/widget/TextView;Ll/ܰܺܳ;Ljava/util/List;)V

    return-void
.end method

.method private ۧ(Ljava/util/List;)V
    .locals 2

    .line 170
    new-instance v0, Ll/᩷ۙ᩻;

    invoke-direct {v0, p0, p1}, Ll/᩷ۙ᩻;-><init>(Ll/ܺۙ᩻;Ljava/util/List;)V

    iget-object v1, p0, Ll/ܺۙ᩻;->֫:Ll/ܳ۠ܳ;

    invoke-virtual {v1, v0}, Ll/ܳ۠ܳ;->֫(Ll/۬ۤ;)V

    .line 174
    invoke-virtual {v1}, Ll/ܳ۠ܳ;->ܽ()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/ۢۙ᩻;

    invoke-direct {v1, p0, p1}, Ll/ۢۙ᩻;-><init>(Ll/ܺۙ᩻;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static ۧ(Ll/ܺۙ᩻;Ljava/util/List;)V
    .locals 2

    .line 187
    new-instance v0, Ll/֫ۙ᩻;

    iget-object v1, p0, Ll/ܺۙ᩻;->ۧ:Ll/ܽۢܳ;

    invoke-direct {v0, v1, p1}, Ll/֫ۙ᩻;-><init>(Ll/ܽۢܳ;Ljava/util/List;)V

    new-instance p1, Ll/ܳۙ᩻;

    invoke-direct {p1, p0}, Ll/ܳۙ᩻;-><init>(Ll/ܺۙ᩻;)V

    invoke-virtual {v0, p1}, Ll/֫ۙ᩻;->֫(Ll/ܳۙ᩻;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/util/List;)V
    .locals 9

    .line 143
    iget-object v0, p0, Ll/ܺۙ᩻;->֫:Ll/ܳ۠ܳ;

    invoke-virtual {v0, p1}, Ll/ܳ۠ܳ;->֫(Ljava/util/List;)V

    .line 144
    iget-object v1, p0, Ll/ܺۙ᩻;->ۧ:Ll/ܽۢܳ;

    invoke-virtual {v1}, Ll/ܽۢܳ;->᩵()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ll/ܳ۠ܳ;->֫(Ljava/lang/String;Landroid/view/View$OnLongClickListener;)V

    .line 147
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const-wide/16 v2, 0x0

    move-wide v4, v2

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩳۜܳ;

    .line 148
    invoke-interface {v6}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v7

    add-long/2addr v2, v7

    .line 149
    check-cast v6, Ll/۫᩶᩻;

    .line 150
    invoke-virtual {v6}, Ll/۫᩶᩻;->ܽ()Ll/ۗ᩺ۡ;

    move-result-object v7

    invoke-virtual {v7}, Ll/ۗ᩺ۡ;->ۨ()Z

    move-result v7

    if-nez v7, :cond_0

    .line 151
    invoke-virtual {v6}, Ll/۫᩶᩻;->ܽ()Ll/ۗ᩺ۡ;

    move-result-object v6

    invoke-virtual {v6}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v6

    add-long/2addr v4, v6

    goto :goto_0

    .line 156
    :cond_1
    invoke-virtual {v0, v2, v3}, Ll/ܳ۠ܳ;->ܽ(J)Ll/۟֨ܳ;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Ll/۟֨ܳ;->֫(I)V

    .line 157
    invoke-virtual {v0, v4, v5}, Ll/ܳ۠ܳ;->֫(J)Ll/۟֨ܳ;

    .line 159
    new-instance v1, Ll/᩻ۙ᩻;

    invoke-direct {v1, p0, p1}, Ll/᩻ۙ᩻;-><init>(Ll/ܺۙ᩻;Ljava/util/List;)V

    const v3, 0x7f1207b1

    invoke-virtual {v0, v3, v1}, Ll/ܳ۠ܳ;->֫(ILl/֫۠ܳ;)Ll/۟֨ܳ;

    move-result-object v1

    .line 163
    invoke-virtual {v1, v2}, Ll/۟֨ܳ;->֫(I)V

    .line 165
    invoke-virtual {v0}, Ll/ܳ۠ܳ;->ۜ()V

    .line 166
    invoke-static {p1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v0, Ll/ᩴۚܳ;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ll/ᩴۚܳ;-><init>(I)V

    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-direct {p0, p1}, Ll/ܺۙ᩻;->ۧ(Ljava/util/List;)V

    return-void
.end method

.method public final ֫(Ll/۫᩶᩻;)V
    .locals 8

    .line 49
    invoke-virtual {p1}, Ll/۫᩶᩻;->ܽ()Ll/ۗ᩺ۡ;

    move-result-object v0

    .line 50
    iget-object v1, p0, Ll/ܺۙ᩻;->֫:Ll/ܳ۠ܳ;

    invoke-virtual {v1, p1}, Ll/ܳ۠ܳ;->֫(Ll/ܺۘܳ;)V

    const v2, 0x7f120393

    .line 51
    invoke-virtual {v1, v2}, Ll/ܳ۠ܳ;->֫(I)V

    .line 53
    invoke-virtual {p1}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ll/ܳ۠ܳ;->ܽ(J)Ll/۟֨ܳ;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Ll/۟֨ܳ;->֫(I)V

    .line 54
    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->ۨ()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 55
    new-instance v2, Landroid/text/SpannableStringBuilder;

    const-string v4, "0 \u2192 "

    invoke-direct {v2, v4}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 56
    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->ۘ()Ll/ۗ᩺ۡ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 57
    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v4

    const-string v5, " ("

    .line 58
    invoke-virtual {v2, v5}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v5

    const v6, 0x7f120223

    invoke-static {v6}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v5

    const-string v6, ")"

    invoke-virtual {v5, v6}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 59
    new-instance v5, Landroid/text/style/ForegroundColorSpan;

    sget v6, Ll/᩹֡᩷;->ۜ֫:I

    invoke-direct {v5, v6}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v6

    const/16 v7, 0x11

    invoke-virtual {v2, v5, v4, v6, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 60
    new-instance v4, Ll/ۜۙ᩻;

    invoke-direct {v4, v2, v0}, Ll/ۜۙ᩻;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x7f1207af

    invoke-virtual {v1, v2, v4}, Ll/ܳ۠ܳ;->֫(ILl/֫۠ܳ;)Ll/۟֨ܳ;

    goto :goto_0

    .line 66
    :cond_0
    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Ll/ܳ۠ܳ;->֫(J)Ll/۟֨ܳ;

    .line 69
    :goto_0
    invoke-virtual {p1}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Ll/ܳ۠ܳ;->ۧ(J)Ll/۟֨ܳ;

    move-result-object v2

    invoke-virtual {v2, v3}, Ll/۟֨ܳ;->֫(I)V

    .line 70
    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->۫()J

    move-result-wide v4

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    .line 515
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const/4 v2, 0x1

    new-array v4, v2, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const-string v0, "%08X"

    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const v4, 0x7f1207ae

    invoke-virtual {v1, v4, v0}, Ll/ܳ۠ܳ;->֫(ILjava/lang/String;)Ll/۟֨ܳ;

    move-result-object v0

    .line 70
    invoke-virtual {v0, v3}, Ll/۟֨ܳ;->֫(I)V

    const v0, 0x7f1200ea

    const/4 v4, 0x0

    .line 72
    invoke-virtual {v1, v0, v4}, Ll/ܳ۠ܳ;->֫(ILl/֫۠ܳ;)Ll/۟֨ܳ;

    move-result-object v0

    invoke-virtual {v0, v3}, Ll/۟֨ܳ;->֫(I)V

    .line 73
    invoke-virtual {v0}, Ll/ܰ֨ܳ;->֫()V

    .line 75
    invoke-virtual {v1}, Ll/ܳ۠ܳ;->ܿ()V

    .line 76
    invoke-virtual {v1}, Ll/ܳ۠ܳ;->ۜ()V

    .line 77
    invoke-virtual {v1}, Ll/ܳ۠ܳ;->ۧ()Landroid/widget/Button;

    move-result-object v1

    iget-object v3, p0, Ll/ܺۙ᩻;->ۧ:Ll/ܽۢܳ;

    invoke-static {v1, v3, p1}, Ll/ۛ۫ܳ;->ۧ(Landroid/widget/Button;Ll/ܽۢܳ;Ll/ᩳۜܳ;)V

    .line 78
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, v1}, Ll/ܺۙ᩻;->ۧ(Ljava/util/List;)V

    .line 80
    invoke-virtual {v3}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v1

    check-cast v1, Ll/ۧۗ᩻;

    .line 81
    invoke-virtual {v1}, Ll/ۧۗ᩻;->ۜ֫()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 82
    sget-object v3, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v4, Ll/֡֫ܿ;

    invoke-direct {v4, v1, p1, v0, v2}, Ll/֡֫ܿ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v3, v4}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    :cond_1
    return-void
.end method

.method public final ۧ(Ll/۫᩶᩻;)V
    .locals 5

    .line 125
    iget-object v0, p0, Ll/ܺۙ᩻;->֫:Ll/ܳ۠ܳ;

    invoke-virtual {v0, p1}, Ll/ܳ۠ܳ;->֫(Ll/ܺۘܳ;)V

    const v1, 0x7f1203fb

    .line 126
    invoke-virtual {v0, v1}, Ll/ܳ۠ܳ;->֫(I)V

    .line 128
    invoke-virtual {p1}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ܳ۠ܳ;->ܽ(J)Ll/۟֨ܳ;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Ll/۟֨ܳ;->֫(I)V

    .line 129
    invoke-virtual {p1}, Ll/۫᩶᩻;->ܽ()Ll/ۗ᩺ۡ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Ll/ܳ۠ܳ;->֫(J)Ll/۟֨ܳ;

    .line 131
    invoke-virtual {p1}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Ll/ܳ۠ܳ;->ۧ(J)Ll/۟֨ܳ;

    move-result-object v1

    invoke-virtual {v1, v2}, Ll/۟֨ܳ;->֫(I)V

    .line 133
    new-instance v1, Ll/ۧۙ᩻;

    invoke-direct {v1, p0, p1}, Ll/ۧۙ᩻;-><init>(Ll/ܺۙ᩻;Ll/۫᩶᩻;)V

    const v3, 0x7f1207b1

    invoke-virtual {v0, v3, v1}, Ll/ܳ۠ܳ;->֫(ILl/֫۠ܳ;)Ll/۟֨ܳ;

    move-result-object v1

    .line 137
    invoke-virtual {v1, v2}, Ll/۟֨ܳ;->֫(I)V

    .line 138
    invoke-virtual {v0}, Ll/ܳ۠ܳ;->ۜ()V

    .line 139
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ܺۙ᩻;->ۧ(Ljava/util/List;)V

    return-void
.end method
