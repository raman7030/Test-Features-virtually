.class public final Ll/ۗ᩸᩻;
.super Ljava/lang/Object;
.source "P97N"


# instance fields
.field public final ֫:Ll/ܳ۠ܳ;

.field public ۧ:[Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ll/ܽۢܳ;)V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Ll/ܳ۠ܳ;

    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ܳ۠ܳ;-><init>(Lbin/mt/plus/Main;)V

    invoke-virtual {v0}, Ll/ܳ۠ܳ;->᩻()V

    iput-object v0, p0, Ll/ۗ᩸᩻;->֫:Ll/ܳ۠ܳ;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 98
    invoke-static {p0}, Ll/ܽ᩷ܳ;->᩻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 99
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const-string v1, "/"

    const/4 v2, 0x1

    if-le v0, v2, :cond_0

    const/16 v0, 0x2f

    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v3, v2

    if-ne v0, v3, :cond_0

    move-object p0, v1

    .line 102
    :cond_0
    invoke-static {p0}, Ll/ۨ᩸᩻;->ᩳ(Ljava/lang/String;)Ll/ۛ᩸᩻;

    move-result-object p0

    const v0, 0x7f1207df

    .line 103
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    if-nez p0, :cond_1

    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 0
    :cond_1
    invoke-static {v0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 107
    invoke-virtual {p0}, Ll/ۛ᩸᩻;->ᩳ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 30
    iget-object v0, p0, Ll/ۗ᩸᩻;->֫:Ll/ܳ۠ܳ;

    invoke-virtual {v0}, Ll/ܳ۠ܳ;->ᩳ()V

    return-void
.end method

.method public final ֫(IIJ)V
    .locals 7

    .line 118
    iget-object v0, p0, Ll/ۗ᩸᩻;->ۧ:[Landroid/widget/TextView;

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_0

    const v0, 0x7f1207be

    .line 120
    iget-object v4, p0, Ll/ۗ᩸᩻;->֫:Ll/ܳ۠ܳ;

    invoke-virtual {v4, v0}, Ll/ܳ۠ܳ;->ۧ(I)Ll/۟֨ܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟֨ܳ;->ܽ()Landroid/widget/TextView;

    move-result-object v0

    const v5, 0x7f1207b1

    .line 121
    invoke-virtual {v4, v5}, Ll/ܳ۠ܳ;->ۧ(I)Ll/۟֨ܳ;

    move-result-object v5

    invoke-virtual {v5}, Ll/۟֨ܳ;->ܽ()Landroid/widget/TextView;

    move-result-object v5

    const v6, 0x7f1207b2

    .line 122
    invoke-virtual {v4, v6}, Ll/ܳ۠ܳ;->ۧ(I)Ll/۟֨ܳ;

    move-result-object v4

    invoke-virtual {v4}, Ll/۟֨ܳ;->ܽ()Landroid/widget/TextView;

    move-result-object v4

    const/4 v6, 0x3

    new-array v6, v6, [Landroid/widget/TextView;

    aput-object v0, v6, v3

    aput-object v5, v6, v2

    aput-object v4, v6, v1

    iput-object v6, p0, Ll/ۗ᩸᩻;->ۧ:[Landroid/widget/TextView;

    .line 125
    :cond_0
    iget-object v0, p0, Ll/ۗ᩸᩻;->ۧ:[Landroid/widget/TextView;

    aget-object v0, v0, v3

    invoke-static {v0, p3, p4}, Ll/ܺ۫ܳ;->ۧ(Landroid/widget/TextView;J)V

    .line 126
    iget-object p3, p0, Ll/ۗ᩸᩻;->ۧ:[Landroid/widget/TextView;

    aget-object p3, p3, v2

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 127
    iget-object p1, p0, Ll/ۗ᩸᩻;->ۧ:[Landroid/widget/TextView;

    aget-object p1, p1, v1

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 1

    .line 111
    iget-object v0, p0, Ll/ۗ᩸᩻;->֫:Ll/ܳ۠ܳ;

    invoke-virtual {v0, p1}, Ll/ܳ۠ܳ;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/util/List;)V
    .locals 1

    .line 84
    iget-object v0, p0, Ll/ۗ᩸᩻;->֫:Ll/ܳ۠ܳ;

    invoke-virtual {v0, p2}, Ll/ܳ۠ܳ;->֫(Ljava/util/List;)V

    .line 85
    invoke-static {p1}, Ll/ۗ᩸᩻;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {v0, p1, p2}, Ll/ܳ۠ܳ;->֫(Ljava/lang/String;Landroid/view/View$OnLongClickListener;)V

    const-wide/16 p1, 0x0

    .line 86
    invoke-virtual {v0, p1, p2}, Ll/ܳ۠ܳ;->ܽ(J)Ll/۟֨ܳ;

    .line 87
    new-instance p1, Ll/۫᩷ᩳ;

    const/4 p2, 0x4

    invoke-direct {p1, p2}, Ll/۫᩷ᩳ;-><init>(I)V

    const p2, 0x7f1207b1

    invoke-virtual {v0, p2, p1}, Ll/ܳ۠ܳ;->֫(ILl/֫۠ܳ;)Ll/۟֨ܳ;

    move-result-object p1

    const/16 p2, 0x8

    .line 89
    invoke-virtual {p1, p2}, Ll/۟֨ܳ;->֫(I)V

    .line 90
    new-instance p1, Ll/ۗۧᩳ;

    const/16 p2, 0x9

    invoke-direct {p1, p2}, Ll/ۗۧᩳ;-><init>(I)V

    const p2, 0x7f1207b2

    invoke-virtual {v0, p2, p1}, Ll/ܳ۠ܳ;->֫(ILl/֫۠ܳ;)Ll/۟֨ܳ;

    .line 93
    invoke-virtual {v0}, Ll/ܳ۠ܳ;->᩷()V

    .line 94
    invoke-virtual {v0}, Ll/ܳ۠ܳ;->ۜ()V

    return-void
.end method

.method public final ֫(Ll/ᩳۜܳ;)V
    .locals 4

    .line 35
    invoke-interface {p1}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_1

    instance-of v0, p1, Ll/۫᩸᩻;

    if-eqz v0, :cond_1

    check-cast p1, Ll/۫᩸᩻;

    .line 37
    invoke-virtual {p1}, Ll/ܺۘܳ;->getName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ۗ᩸᩻;->֫:Ll/ܳ۠ܳ;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Ll/ܳ۠ܳ;->֫(Ljava/lang/String;Ll/ۤ֨ܳ;)V

    .line 38
    invoke-virtual {p1}, Ll/ܺۘܳ;->getParent()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۗ᩸᩻;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v2}, Ll/ܳ۠ܳ;->֫(Ljava/lang/String;Landroid/view/View$OnLongClickListener;)V

    const v0, 0x7f120393

    .line 39
    invoke-virtual {v1, v0}, Ll/ܳ۠ܳ;->֫(I)V

    .line 40
    invoke-virtual {p1}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ll/ܳ۠ܳ;->ܽ(J)Ll/۟֨ܳ;

    .line 41
    invoke-virtual {p1}, Ll/۫᩸᩻;->ܽ()Ll/᩸֡ܿ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 43
    invoke-virtual {v0}, Ll/᩸֡ܿ;->ۚ()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ll/ܳ۠ܳ;->ۧ(J)Ll/۟֨ܳ;

    .line 44
    invoke-virtual {v0}, Ll/᩸֡ܿ;->ܳ()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll/ܿۤۡ;->ۧ(J)Ljava/lang/String;

    move-result-object p1

    const v2, 0x7f1207b0

    invoke-virtual {v1, v2, p1}, Ll/ܳ۠ܳ;->֫(ILjava/lang/String;)Ll/۟֨ܳ;

    .line 45
    sget-object p1, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ll/᩸֡ܿ;->᩻()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۢۤۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const v0, 0x7f1207b8

    invoke-virtual {v1, v0, p1}, Ll/ܳ۠ܳ;->֫(ILjava/lang/String;)Ll/۟֨ܳ;

    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {p1}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ll/ܳ۠ܳ;->ۧ(J)Ll/۟֨ܳ;

    .line 49
    :goto_0
    invoke-virtual {v1}, Ll/ܳ۠ܳ;->ۜ()V

    return-void

    .line 36
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final ۧ(Ll/ᩳۜܳ;)V
    .locals 4

    .line 56
    invoke-interface {p1}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v0

    if-nez v0, :cond_1

    instance-of v0, p1, Ll/۫᩸᩻;

    if-eqz v0, :cond_1

    check-cast p1, Ll/۫᩸᩻;

    .line 58
    invoke-virtual {p1}, Ll/ܺۘܳ;->getName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ۗ᩸᩻;->֫:Ll/ܳ۠ܳ;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Ll/ܳ۠ܳ;->֫(Ljava/lang/String;Ll/ۤ֨ܳ;)V

    .line 59
    invoke-virtual {p1}, Ll/ܺۘܳ;->getParent()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۗ᩸᩻;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v2}, Ll/ܳ۠ܳ;->֫(Ljava/lang/String;Landroid/view/View$OnLongClickListener;)V

    const v0, 0x7f1203fb

    .line 60
    invoke-virtual {v1, v0}, Ll/ܳ۠ܳ;->֫(I)V

    const-wide/16 v2, 0x0

    .line 61
    invoke-virtual {v1, v2, v3}, Ll/ܳ۠ܳ;->ܽ(J)Ll/۟֨ܳ;

    .line 62
    invoke-virtual {p1}, Ll/۫᩸᩻;->ܽ()Ll/᩸֡ܿ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 64
    invoke-virtual {v0}, Ll/᩸֡ܿ;->ۚ()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ll/ܳ۠ܳ;->ۧ(J)Ll/۟֨ܳ;

    .line 65
    invoke-virtual {v0}, Ll/᩸֡ܿ;->ܳ()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll/ܿۤۡ;->ۧ(J)Ljava/lang/String;

    move-result-object p1

    const v2, 0x7f1207b0

    invoke-virtual {v1, v2, p1}, Ll/ܳ۠ܳ;->֫(ILjava/lang/String;)Ll/۟֨ܳ;

    .line 66
    sget-object p1, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ll/᩸֡ܿ;->᩻()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۢۤۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const v0, 0x7f1207b8

    invoke-virtual {v1, v0, p1}, Ll/ܳ۠ܳ;->֫(ILjava/lang/String;)Ll/۟֨ܳ;

    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {p1}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ll/ܳ۠ܳ;->ۧ(J)Ll/۟֨ܳ;

    .line 70
    :goto_0
    new-instance p1, Ll/ۚ۬ۚ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const v0, 0x7f1207b1

    invoke-virtual {v1, v0, p1}, Ll/ܳ۠ܳ;->֫(ILl/֫۠ܳ;)Ll/۟֨ܳ;

    move-result-object p1

    const/16 v0, 0x8

    .line 72
    invoke-virtual {p1, v0}, Ll/۟֨ܳ;->֫(I)V

    .line 73
    new-instance p1, Ll/ۧ۬֫;

    const/4 v0, 0x5

    invoke-direct {p1, v0}, Ll/ۧ۬֫;-><init>(I)V

    const v0, 0x7f1207b2

    invoke-virtual {v1, v0, p1}, Ll/ܳ۠ܳ;->֫(ILl/֫۠ܳ;)Ll/۟֨ܳ;

    .line 76
    invoke-virtual {v1}, Ll/ܳ۠ܳ;->᩷()V

    .line 77
    invoke-virtual {v1}, Ll/ܳ۠ܳ;->ۜ()V

    return-void

    .line 57
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method
