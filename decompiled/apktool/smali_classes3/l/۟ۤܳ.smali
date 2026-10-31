.class public final Ll/۟ۤܳ;
.super Ljava/lang/Object;
.source "ZB6H"


# instance fields
.field public final ֫:Ll/ܳ۠ܳ;

.field public final ۧ:Ll/ܽۢܳ;


# direct methods
.method public constructor <init>(Ll/ܽۢܳ;)V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Ll/۟ۤܳ;->ۧ:Ll/ܽۢܳ;

    .line 21
    new-instance v0, Ll/ܳ۠ܳ;

    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ܳ۠ܳ;-><init>(Lbin/mt/plus/Main;)V

    .line 22
    invoke-virtual {v0}, Ll/ܳ۠ܳ;->᩻()V

    iput-object v0, p0, Ll/۟ۤܳ;->֫:Ll/ܳ۠ܳ;

    return-void
.end method

.method public static synthetic ֫(Ll/۟ۤܳ;Ljava/util/List;Landroid/widget/TextView;)V
    .locals 2

    .line 100
    iget-object v0, p0, Ll/۟ۤܳ;->֫:Ll/ܳ۠ܳ;

    new-instance v1, Ll/᩺ۤܳ;

    invoke-direct {v1, p0, p1, p2}, Ll/᩺ۤܳ;-><init>(Ll/۟ۤܳ;Ljava/util/List;Landroid/widget/TextView;)V

    const p0, 0x7f1207b2

    invoke-virtual {v0, p0, v1}, Ll/ܳ۠ܳ;->֫(ILl/֫۠ܳ;)Ll/۟֨ܳ;

    move-result-object p0

    const/16 p1, 0x8

    .line 102
    invoke-virtual {p0, p1}, Ll/۟֨ܳ;->֫(I)V

    return-void
.end method

.method public static synthetic ֫(Ll/۟ۤܳ;Ljava/util/List;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    .line 101
    iget-object p0, p0, Ll/۟ۤܳ;->ۧ:Ll/ܽۢܳ;

    invoke-virtual {p0}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ܽ᩷ܳ;->᩶()Ll/ܰܺܳ;

    move-result-object p0

    invoke-static {p2, p3, p0, p1}, Ll/ۧ᩸᩻;->֫(Landroid/widget/TextView;Landroid/widget/TextView;Ll/ܰܺܳ;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic ֫(Ll/۟ۤܳ;Ll/ۤۤܳ;Landroid/widget/TextView;)V
    .locals 2

    .line 62
    iget-object v0, p0, Ll/۟ۤܳ;->֫:Ll/ܳ۠ܳ;

    new-instance v1, Ll/ܰۤܳ;

    invoke-direct {v1, p0, p1, p2}, Ll/ܰۤܳ;-><init>(Ll/۟ۤܳ;Ll/ۤۤܳ;Landroid/widget/TextView;)V

    const p0, 0x7f1207b2

    invoke-virtual {v0, p0, v1}, Ll/ܳ۠ܳ;->֫(ILl/֫۠ܳ;)Ll/۟֨ܳ;

    return-void
.end method

.method public static synthetic ֫(Ll/۟ۤܳ;Ll/ۤۤܳ;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    .line 63
    iget-object p0, p0, Ll/۟ۤܳ;->ۧ:Ll/ܽۢܳ;

    invoke-virtual {p0}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ܽ᩷ܳ;->᩶()Ll/ܰܺܳ;

    move-result-object p0

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p2, p3, p0, p1}, Ll/ۧ᩸᩻;->֫(Landroid/widget/TextView;Landroid/widget/TextView;Ll/ܰܺܳ;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/util/List;)V
    .locals 14

    .line 71
    iget-object v0, p0, Ll/۟ۤܳ;->ۧ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v0

    check-cast v0, Ll/ۚۛܳ;

    .line 73
    iget-object v1, p0, Ll/۟ۤܳ;->֫:Ll/ܳ۠ܳ;

    invoke-virtual {v1, p1}, Ll/ܳ۠ܳ;->֫(Ljava/util/List;)V

    .line 74
    invoke-virtual {v0}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Ll/ܳ۠ܳ;->֫(Ljava/lang/String;Landroid/view/View$OnLongClickListener;)V

    .line 78
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide/16 v2, -0x1

    const-wide/16 v4, 0x0

    move-wide v6, v2

    move-wide v8, v4

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ᩳۜܳ;

    .line 79
    invoke-interface {v10}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v11

    cmp-long v13, v11, v2

    if-eqz v13, :cond_2

    cmp-long v13, v6, v2

    if-nez v13, :cond_1

    move-wide v6, v4

    :cond_1
    add-long/2addr v6, v11

    .line 86
    :cond_2
    check-cast v10, Ll/ۤۤܳ;

    invoke-virtual {v10}, Ll/ۤۤܳ;->ܽ()Ll/ۘܳᩳ;

    move-result-object v10

    invoke-virtual {v10}, Ll/ۘܳᩳ;->֫()J

    move-result-wide v10

    cmp-long v12, v10, v2

    if-eqz v12, :cond_0

    add-long/2addr v8, v10

    goto :goto_0

    :cond_3
    const/16 v0, 0x8

    cmp-long v4, v6, v2

    if-nez v4, :cond_4

    .line 94
    invoke-virtual {v1, v8, v9}, Ll/ܳ۠ܳ;->֫(J)Ll/۟֨ܳ;

    move-result-object v2

    invoke-virtual {v2, v0}, Ll/۟֨ܳ;->֫(I)V

    goto :goto_1

    .line 96
    :cond_4
    invoke-virtual {v1, v6, v7}, Ll/ܳ۠ܳ;->ܽ(J)Ll/۟֨ܳ;

    move-result-object v2

    invoke-virtual {v2, v0}, Ll/۟֨ܳ;->֫(I)V

    .line 97
    invoke-virtual {v1, v8, v9}, Ll/ܳ۠ܳ;->֫(J)Ll/۟֨ܳ;

    .line 99
    :goto_1
    new-instance v0, Ll/ۛۤܳ;

    invoke-direct {v0, p0, p1}, Ll/ۛۤܳ;-><init>(Ll/۟ۤܳ;Ljava/util/List;)V

    const p1, 0x7f1207b1

    invoke-virtual {v1, p1, v0}, Ll/ܳ۠ܳ;->֫(ILl/֫۠ܳ;)Ll/۟֨ܳ;

    .line 104
    invoke-virtual {v1}, Ll/ܳ۠ܳ;->ۜ()V

    return-void
.end method

.method public final ֫(Ll/ۤۤܳ;)V
    .locals 9

    .line 26
    iget-object v0, p0, Ll/۟ۤܳ;->֫:Ll/ܳ۠ܳ;

    invoke-virtual {v0, p1}, Ll/ܳ۠ܳ;->֫(Ll/ܺۘܳ;)V

    const v1, 0x7f120393

    .line 27
    invoke-virtual {v0, v1}, Ll/ܳ۠ܳ;->֫(I)V

    .line 28
    invoke-virtual {p1}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    const/16 v5, 0x8

    const-wide/16 v6, -0x1

    cmp-long v8, v1, v6

    if-nez v8, :cond_0

    .line 29
    invoke-virtual {p1}, Ll/ۤۤܳ;->ܽ()Ll/ۘܳᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۘܳᩳ;->֫()J

    move-result-wide v1

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ܳ۠ܳ;->֫(J)Ll/۟֨ܳ;

    move-result-object v1

    invoke-virtual {v1, v5}, Ll/۟֨ܳ;->֫(I)V

    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p1}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ܳ۠ܳ;->ܽ(J)Ll/۟֨ܳ;

    move-result-object v1

    invoke-virtual {v1, v5}, Ll/۟֨ܳ;->֫(I)V

    .line 32
    invoke-virtual {p1}, Ll/ۤۤܳ;->ܽ()Ll/ۘܳᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۘܳᩳ;->֫()J

    move-result-wide v1

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ܳ۠ܳ;->֫(J)Ll/۟֨ܳ;

    .line 34
    :goto_0
    invoke-virtual {p1}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v1

    cmp-long v3, v1, v6

    if-eqz v3, :cond_1

    .line 35
    invoke-virtual {p1}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ܳ۠ܳ;->ۧ(J)Ll/۟֨ܳ;

    move-result-object v1

    invoke-virtual {v1, v5}, Ll/۟֨ܳ;->֫(I)V

    .line 37
    :cond_1
    invoke-virtual {p1}, Ll/ۤۤܳ;->ܽ()Ll/ۘܳᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۘܳᩳ;->ۧ()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 39
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v1, v1

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    .line 515
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const-string v1, "%08X"

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f1207ae

    invoke-virtual {v0, v2, v1}, Ll/ܳ۠ܳ;->֫(ILjava/lang/String;)Ll/۟֨ܳ;

    .line 41
    :cond_2
    invoke-virtual {v0}, Ll/ܳ۠ܳ;->ܿ()V

    .line 42
    invoke-virtual {v0}, Ll/ܳ۠ܳ;->ۜ()V

    .line 43
    invoke-virtual {v0}, Ll/ܳ۠ܳ;->ۧ()Landroid/widget/Button;

    move-result-object v0

    iget-object v1, p0, Ll/۟ۤܳ;->ۧ:Ll/ܽۢܳ;

    invoke-static {v0, v1, p1}, Ll/ۛ۫ܳ;->ۧ(Landroid/widget/Button;Ll/ܽۢܳ;Ll/ᩳۜܳ;)V

    return-void
.end method

.method public final ۧ(Ll/ۤۤܳ;)V
    .locals 9

    .line 50
    iget-object v0, p0, Ll/۟ۤܳ;->֫:Ll/ܳ۠ܳ;

    invoke-virtual {v0, p1}, Ll/ܳ۠ܳ;->֫(Ll/ܺۘܳ;)V

    const v1, 0x7f1203fb

    .line 51
    invoke-virtual {v0, v1}, Ll/ܳ۠ܳ;->֫(I)V

    .line 52
    invoke-virtual {p1}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    const/16 v5, 0x8

    const-wide/16 v6, -0x1

    cmp-long v8, v1, v6

    if-nez v8, :cond_0

    .line 53
    invoke-virtual {p1}, Ll/ۤۤܳ;->ܽ()Ll/ۘܳᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۘܳᩳ;->֫()J

    move-result-wide v1

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ܳ۠ܳ;->֫(J)Ll/۟֨ܳ;

    move-result-object v1

    invoke-virtual {v1, v5}, Ll/۟֨ܳ;->֫(I)V

    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {p1}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ܳ۠ܳ;->ܽ(J)Ll/۟֨ܳ;

    move-result-object v1

    invoke-virtual {v1, v5}, Ll/۟֨ܳ;->֫(I)V

    .line 56
    invoke-virtual {p1}, Ll/ۤۤܳ;->ܽ()Ll/ۘܳᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۘܳᩳ;->֫()J

    move-result-wide v1

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ܳ۠ܳ;->֫(J)Ll/۟֨ܳ;

    .line 58
    :goto_0
    invoke-virtual {p1}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v1

    cmp-long v3, v1, v6

    if-eqz v3, :cond_1

    .line 59
    invoke-virtual {p1}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ܳ۠ܳ;->ۧ(J)Ll/۟֨ܳ;

    move-result-object v1

    invoke-virtual {v1, v5}, Ll/۟֨ܳ;->֫(I)V

    .line 61
    :cond_1
    new-instance v1, Ll/ۨۤܳ;

    invoke-direct {v1, p0, p1}, Ll/ۨۤܳ;-><init>(Ll/۟ۤܳ;Ll/ۤۤܳ;)V

    const p1, 0x7f1207b1

    invoke-virtual {v0, p1, v1}, Ll/ܳ۠ܳ;->֫(ILl/֫۠ܳ;)Ll/۟֨ܳ;

    move-result-object p1

    .line 65
    invoke-virtual {p1, v5}, Ll/۟֨ܳ;->֫(I)V

    .line 66
    invoke-virtual {v0}, Ll/ܳ۠ܳ;->ۜ()V

    return-void
.end method
