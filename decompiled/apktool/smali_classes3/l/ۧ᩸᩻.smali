.class public final Ll/ۧ᩸᩻;
.super Ljava/lang/Object;
.source "V8F2"


# instance fields
.field public final ֫:Ll/ܳ۠ܳ;

.field public final ۧ:Ljava/util/List;

.field public ܽ:Ll/ۨܶ᩻;

.field public ᩳ:Ll/ܽۢܳ;


# direct methods
.method public constructor <init>(Ll/ܽۢܳ;Ljava/util/List;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Ll/ۧ᩸᩻;->ᩳ:Ll/ܽۢܳ;

    .line 29
    iput-object p2, p0, Ll/ۧ᩸᩻;->ۧ:Ljava/util/List;

    .line 30
    new-instance p2, Ll/ܳ۠ܳ;

    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-direct {p2, p1}, Ll/ܳ۠ܳ;-><init>(Lbin/mt/plus/Main;)V

    .line 31
    invoke-virtual {p2}, Ll/ܳ۠ܳ;->᩻()V

    iput-object p2, p0, Ll/ۧ᩸᩻;->֫:Ll/ܳ۠ܳ;

    return-void
.end method

.method public static ֫(Landroid/widget/TextView;Landroid/widget/TextView;Ll/ܰܺܳ;Ljava/util/List;)V
    .locals 2

    const-string v0, "..."

    .line 144
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 145
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 146
    sget-object v0, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/֫᩸᩻;

    invoke-direct {v1, p0, p1, p2, p3}, Ll/֫᩸᩻;-><init>(Landroid/widget/TextView;Landroid/widget/TextView;Ll/ܰܺܳ;Ljava/util/List;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public static ֫(Ll/ۧ᩸᩻;)V
    .locals 1

    .line 183
    iget-object p0, p0, Ll/ۧ᩸᩻;->ܽ:Ll/ۨܶ᩻;

    if-eqz p0, :cond_0

    .line 184
    invoke-virtual {p0}, Ll/ܺۘܳ;->getPath()Ljava/lang/String;

    move-result-object p0

    const v0, 0x7f120411

    invoke-static {v0, p0}, Ll/ۙ᩸᩷;->֫(ILjava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/ۧ᩸᩻;Landroid/widget/TextView;)V
    .locals 2

    .line 128
    iget-object v0, p0, Ll/ۧ᩸᩻;->֫:Ll/ܳ۠ܳ;

    new-instance v1, Ll/᩸۬ۜ;

    invoke-direct {v1, p0, p1}, Ll/᩸۬ۜ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const p0, 0x7f1207b2

    invoke-virtual {v0, p0, v1}, Ll/ܳ۠ܳ;->֫(ILl/֫۠ܳ;)Ll/۟֨ܳ;

    return-void
.end method

.method public static synthetic ֫(Ll/ۧ᩸᩻;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 1

    .line 129
    iget-object v0, p0, Ll/ۧ᩸᩻;->ᩳ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽ᩷ܳ;->᩶()Ll/ܰܺܳ;

    move-result-object v0

    iget-object p0, p0, Ll/ۧ᩸᩻;->ۧ:Ljava/util/List;

    invoke-static {p1, p2, v0, p0}, Ll/ۧ᩸᩻;->֫(Landroid/widget/TextView;Landroid/widget/TextView;Ll/ܰܺܳ;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic ۧ(Ll/ۧ᩸᩻;Landroid/widget/TextView;)V
    .locals 3

    .line 109
    iget-object v0, p0, Ll/ۧ᩸᩻;->֫:Ll/ܳ۠ܳ;

    new-instance v1, Ll/ۡۡܳ;

    const/4 v2, 0x3

    invoke-direct {v1, v2, p0, p1}, Ll/ۡۡܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const p0, 0x7f1207b2

    invoke-virtual {v0, p0, v1}, Ll/ܳ۠ܳ;->֫(ILl/֫۠ܳ;)Ll/۟֨ܳ;

    return-void
.end method

.method public static synthetic ۧ(Ll/ۧ᩸᩻;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 1

    .line 110
    iget-object v0, p0, Ll/ۧ᩸᩻;->ᩳ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽ᩷ܳ;->᩶()Ll/ܰܺܳ;

    move-result-object v0

    iget-object p0, p0, Ll/ۧ᩸᩻;->ۧ:Ljava/util/List;

    invoke-static {p1, p2, v0, p0}, Ll/ۧ᩸᩻;->֫(Landroid/widget/TextView;Landroid/widget/TextView;Ll/ܰܺܳ;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)V
    .locals 5

    .line 120
    iget-object v0, p0, Ll/ۧ᩸᩻;->֫:Ll/ܳ۠ܳ;

    iget-object v1, p0, Ll/ۧ᩸᩻;->ۧ:Ljava/util/List;

    invoke-virtual {v0, v1}, Ll/ܳ۠ܳ;->֫(Ljava/util/List;)V

    .line 121
    new-instance v2, Ll/᩺ܶ᩻;

    invoke-direct {v2, p0}, Ll/᩺ܶ᩻;-><init>(Ll/ۧ᩸᩻;)V

    invoke-virtual {v0, p1, v2}, Ll/ܳ۠ܳ;->֫(Ljava/lang/String;Landroid/view/View$OnLongClickListener;)V

    .line 123
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const-wide/16 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۜܳ;

    .line 124
    invoke-interface {v3}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v3

    add-long/2addr v1, v3

    goto :goto_0

    .line 126
    :cond_0
    invoke-virtual {v0, v1, v2}, Ll/ܳ۠ܳ;->ܽ(J)Ll/۟֨ܳ;

    .line 127
    new-instance p1, Ll/ۖ֡ᩳ;

    const/4 v1, 0x5

    invoke-direct {p1, v1, p0}, Ll/ۖ֡ᩳ;-><init>(ILjava/lang/Object;)V

    const v1, 0x7f1207b1

    invoke-virtual {v0, v1, p1}, Ll/ܳ۠ܳ;->֫(ILl/֫۠ܳ;)Ll/۟֨ܳ;

    move-result-object p1

    const/16 v1, 0x8

    .line 131
    invoke-virtual {p1, v1}, Ll/۟֨ܳ;->֫(I)V

    .line 132
    invoke-virtual {v0}, Ll/ܳ۠ܳ;->ۜ()V

    return-void
.end method

.method public final ֫(Ll/ᩳۜܳ;)V
    .locals 5

    .line 38
    invoke-interface {p1}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_4

    instance-of v0, p1, Ll/ۨܶ᩻;

    if-eqz v0, :cond_4

    check-cast p1, Ll/ۨܶ᩻;

    .line 41
    iput-object p1, p0, Ll/ۧ᩸᩻;->ܽ:Ll/ۨܶ᩻;

    .line 43
    iget-object v0, p0, Ll/ۧ᩸᩻;->֫:Ll/ܳ۠ܳ;

    invoke-virtual {v0, p1}, Ll/ܳ۠ܳ;->֫(Ll/ܺۘܳ;)V

    .line 44
    invoke-virtual {p1}, Ll/ܺۘܳ;->۬()Z

    move-result v1

    if-eqz v1, :cond_0

    const v1, 0x7f12051a

    goto :goto_0

    :cond_0
    const v1, 0x7f120393

    :goto_0
    invoke-virtual {v0, v1}, Ll/ܳ۠ܳ;->֫(I)V

    .line 45
    invoke-virtual {p1}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ܳ۠ܳ;->ܽ(J)Ll/۟֨ܳ;

    .line 46
    invoke-virtual {p1}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ܳ۠ܳ;->ۧ(J)Ll/۟֨ܳ;

    .line 48
    invoke-virtual {p1}, Ll/ۨܶ᩻;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v1

    const/4 v2, 0x6

    if-eqz v1, :cond_2

    .line 50
    new-instance v3, Ll/֫᩺᩷;

    invoke-direct {v3, v1}, Ll/֫᩺᩷;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v3}, Ll/ܳ۠ܳ;->֫(Ll/ܿ۠ܳ;)Ll/ᩳ۠ܳ;

    move-result-object v3

    .line 53
    invoke-virtual {v3, v2}, Ll/ᩳ۠ܳ;->֫(I)V

    .line 54
    invoke-virtual {v1}, Ll/ܽۜܳ;->ۜ()Ljava/lang/String;

    move-result-object v3

    .line 55
    invoke-virtual {v1}, Ll/ܽۜܳ;->֫()Ljava/lang/String;

    move-result-object v1

    .line 56
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 57
    :cond_1
    new-instance v4, Ll/ۚ֨᩷;

    invoke-direct {v4, v3, v1}, Ll/ۚ֨᩷;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v4}, Ll/ܳ۠ܳ;->֫(Ll/ܽ۠ܳ;)Ll/ۧ۠ܳ;

    move-result-object v1

    .line 61
    invoke-virtual {v1}, Ll/ۧ۠ܳ;->ᩳ()V

    .line 64
    :cond_2
    invoke-virtual {p1}, Ll/ܺۘܳ;->۬()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 65
    invoke-virtual {p1}, Ll/ܺۘܳ;->ۧ֫()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Ll/ܳ۠ܳ;->֫(Ljava/lang/String;Landroid/view/View$OnClickListener;)Ll/۟֨ܳ;

    move-result-object v1

    invoke-virtual {v1, v2}, Ll/۟֨ܳ;->֫(I)V

    .line 68
    :cond_3
    invoke-virtual {v0}, Ll/ܳ۠ܳ;->ܿ()V

    .line 69
    invoke-virtual {v0}, Ll/ܳ۠ܳ;->ۜ()V

    .line 70
    invoke-virtual {v0}, Ll/ܳ۠ܳ;->ۧ()Landroid/widget/Button;

    move-result-object v0

    iget-object v1, p0, Ll/ۧ᩸᩻;->ᩳ:Ll/ܽۢܳ;

    invoke-static {v0, v1, p1}, Ll/ۛ۫ܳ;->ۧ(Landroid/widget/Button;Ll/ܽۢܳ;Ll/ᩳۜܳ;)V

    return-void

    .line 39
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final ۧ(Ll/ᩳۜܳ;)V
    .locals 5

    .line 77
    invoke-interface {p1}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v0

    if-nez v0, :cond_4

    instance-of v0, p1, Ll/ۨܶ᩻;

    if-eqz v0, :cond_4

    check-cast p1, Ll/ۨܶ᩻;

    .line 80
    iput-object p1, p0, Ll/ۧ᩸᩻;->ܽ:Ll/ۨܶ᩻;

    .line 82
    iget-object v0, p0, Ll/ۧ᩸᩻;->֫:Ll/ܳ۠ܳ;

    invoke-virtual {v0, p1}, Ll/ܳ۠ܳ;->֫(Ll/ܺۘܳ;)V

    .line 83
    invoke-virtual {p1}, Ll/ܺۘܳ;->۬()Z

    move-result v1

    if-eqz v1, :cond_0

    const v1, 0x7f12051a

    goto :goto_0

    :cond_0
    const v1, 0x7f1203fb

    :goto_0
    invoke-virtual {v0, v1}, Ll/ܳ۠ܳ;->֫(I)V

    .line 84
    invoke-virtual {p1}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ܳ۠ܳ;->ܽ(J)Ll/۟֨ܳ;

    .line 85
    invoke-virtual {p1}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ܳ۠ܳ;->ۧ(J)Ll/۟֨ܳ;

    .line 87
    invoke-virtual {p1}, Ll/ۨܶ᩻;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v1

    const/4 v2, 0x6

    if-eqz v1, :cond_2

    .line 89
    new-instance v3, Ll/᩻ۡܳ;

    invoke-direct {v3, v1}, Ll/᩻ۡܳ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v3}, Ll/ܳ۠ܳ;->֫(Ll/ܿ۠ܳ;)Ll/ᩳ۠ܳ;

    move-result-object v3

    .line 92
    invoke-virtual {v3, v2}, Ll/ᩳ۠ܳ;->֫(I)V

    .line 93
    invoke-virtual {v1}, Ll/ܽۜܳ;->ۜ()Ljava/lang/String;

    move-result-object v3

    .line 94
    invoke-virtual {v1}, Ll/ܽۜܳ;->֫()Ljava/lang/String;

    move-result-object v1

    .line 95
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 96
    :cond_1
    new-instance v4, Ll/ۨ֨ܳ;

    invoke-direct {v4, v3, v1}, Ll/ۨ֨ܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v4}, Ll/ܳ۠ܳ;->֫(Ll/ܽ۠ܳ;)Ll/ۧ۠ܳ;

    move-result-object v1

    .line 100
    invoke-virtual {v1}, Ll/ۧ۠ܳ;->ᩳ()V

    .line 104
    :cond_2
    invoke-virtual {p1}, Ll/ܺۘܳ;->۬()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 105
    invoke-virtual {p1}, Ll/ܺۘܳ;->ۧ֫()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ll/ܳ۠ܳ;->֫(Ljava/lang/String;Landroid/view/View$OnClickListener;)Ll/۟֨ܳ;

    move-result-object p1

    invoke-virtual {p1, v2}, Ll/۟֨ܳ;->֫(I)V

    .line 108
    :cond_3
    new-instance p1, Ll/۠۫᩷;

    invoke-direct {p1, p0}, Ll/۠۫᩷;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f1207b1

    invoke-virtual {v0, v1, p1}, Ll/ܳ۠ܳ;->֫(ILl/֫۠ܳ;)Ll/۟֨ܳ;

    move-result-object p1

    const/16 v1, 0x8

    .line 112
    invoke-virtual {p1, v1}, Ll/۟֨ܳ;->֫(I)V

    .line 113
    invoke-virtual {v0}, Ll/ܳ۠ܳ;->ۜ()V

    return-void

    .line 78
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method
