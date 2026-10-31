.class public Ll/ۜۧ۠;
.super Ll/ۚܽ۠;
.source "A451"


# instance fields
.field public final synthetic ܰ:Ll/᩹ܽ۠;

.field public ᩺:Ll/۫ۧ۠;


# direct methods
.method public constructor <init>(Ll/᩹ܽ۠;Ll/֨ᩴ֨;Ljava/lang/String;Ll/۫ۧ۠;)V
    .locals 0

    .line 4112
    iput-object p1, p0, Ll/ۜۧ۠;->ܰ:Ll/᩹ܽ۠;

    .line 4113
    invoke-direct {p0, p1, p2, p3}, Ll/ۚܽ۠;-><init>(Ll/᩹ܽ۠;Ll/֨ᩴ֨;Ljava/lang/String;)V

    .line 4114
    iput-object p4, p0, Ll/ۜۧ۠;->᩺:Ll/۫ۧ۠;

    return-void
.end method

.method public constructor <init>(Ll/᩹ܽ۠;Ll/۫ۧ۠;)V
    .locals 2

    .line 4109
    sget-object v0, Ll/֨ᩴ֨;->᩷֫:Ll/֨ᩴ֨;

    const-string v1, "inapplicable symbol error"

    invoke-direct {p0, p1, v0, v1, p2}, Ll/ۜۧ۠;-><init>(Ll/᩹ܽ۠;Ll/֨ᩴ֨;Ljava/lang/String;Ll/۫ۧ۠;)V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 3921
    iget-object v0, p0, Ll/ۚܽ۠;->ۛ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ll/ۤܶ۠;Ll/᩶֡֨;)Ll/ۛ֡֨;
    .locals 6

    .line 4160
    invoke-virtual {p0}, Ll/ۜۧ۠;->᩹֫()Ll/᩺ܶ۠;

    move-result-object v0

    .line 4161
    iget-object v1, p0, Ll/ۜۧ۠;->ܰ:Ll/᩹ܽ۠;

    iget-object v2, v1, Ll/᩹ܽ۠;->ܳ֫:Ll/ۛ᩸֨;

    if-eqz v0, :cond_0

    iget-object v3, v0, Ll/᩺ܶ۠;->֫:Ljava/lang/Object;

    check-cast v3, Ll/ۛ֡֨;

    goto :goto_0

    :cond_0
    iget-object v3, v1, Ll/᩹ܽ۠;->ᩳ֫:Ll/᩷ۚ֨;

    iget-object v3, v3, Ll/᩷ۚ֨;->ۙ:Ll/ܳ֡֨;

    :goto_0
    iget-object v3, v3, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, p2, v3}, Ll/ۛ᩸֨;->֫(Ll/ۤܶ۠;Ll/᩶֡֨;Ll/ۙ֨֨;)Ll/۫ۚ֨;

    move-result-object p1

    iget-object p1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    if-eqz v0, :cond_7

    .line 4163
    iget-object p2, v1, Ll/᩹ܽ۠;->ۜ:Ll/۠ۗ֨;

    iget-object v1, v0, Ll/᩺ܶ۠;->֫:Ljava/lang/Object;

    check-cast v1, Ll/ۛ֡֨;

    iget-object v0, v0, Ll/᩺ܶ۠;->ۧ:Ljava/lang/Object;

    check-cast v0, Ll/ܽܶ۠;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    invoke-static {v0}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p2

    .line 231
    :cond_1
    invoke-virtual {p2}, Ll/ۖܶ۠;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 232
    iget-object v0, p2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ܽܶ۠;

    .line 233
    iget-object p2, p2, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    .line 234
    invoke-virtual {v0}, Ll/ܽܶ۠;->ۧ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, -0x1

    sparse-switch v3, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v3, "compiler.misc.arg.length.mismatch"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v5, 0x3

    goto :goto_1

    :sswitch_1
    const-string v3, "compiler.misc.unexpected.ret.val"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    const/4 v5, 0x2

    goto :goto_1

    :sswitch_2
    const-string v3, "compiler.misc.missing.ret.val"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    const/4 v5, 0x1

    goto :goto_1

    :sswitch_3
    const-string v3, "compiler.misc.infer.arg.length.mismatch"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_1

    :cond_5
    const/4 v5, 0x0

    :goto_1
    packed-switch v5, :pswitch_data_0

    .line 245
    invoke-virtual {v0}, Ll/ܽܶ۠;->ܽ()[Ljava/lang/Object;

    move-result-object v0

    array-length v2, v0

    goto :goto_2

    .line 239
    :pswitch_0
    new-instance p2, Ll/֨ۗ֨;

    iget-object v0, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    check-cast v0, Ll/۫ۚ֨;

    invoke-direct {p2, v0, v1}, Ll/֨ۗ֨;-><init>(Ll/۫ۚ֨;Ll/ۛ֡֨;)V

    iput-object p2, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 240
    iget-wide v0, p1, Ll/ۛ֡֨;->᩶:J

    const-wide v2, 0x10000000000L

    or-long/2addr v0, v2

    iput-wide v0, p1, Ll/ۛ֡֨;->᩶:J

    goto :goto_3

    :goto_2
    if-ge v4, v2, :cond_1

    .line 245
    aget-object v3, v0, v4

    .line 246
    instance-of v5, v3, Ll/ܽܶ۠;

    if-eqz v5, :cond_6

    check-cast v3, Ll/ܽܶ۠;

    .line 247
    invoke-virtual {p2, v3}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p2

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_7
    :goto_3
    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x6cc4a4b5 -> :sswitch_3
        -0x4cd2bf47 -> :sswitch_2
        0x120b03aa -> :sswitch_1
        0x6a1e1eab -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public ֫(Ll/۬۠۠;Ll/ۗ۠۠;Ll/ۛ֡֨;Ll/ۙ֨֨;Ll/ۤܶ۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ܽܶ۠;
    .locals 7

    .line 4135
    iget-object p3, p0, Ll/ۜۧ۠;->ܰ:Ll/᩹ܽ۠;

    iget-object p7, p3, Ll/᩹ܽ۠;->۬:Ll/ۛܶ۠;

    iget-object v0, p3, Ll/᩹ܽ۠;->ܶ:Ll/᩹ܶ۠;

    iget-object p7, p7, Ll/ۛܶ۠;->ܳۧ:Ll/ۤܶ۠;

    if-ne p5, p7, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 4138
    :cond_0
    invoke-virtual {p0}, Ll/ۜۧ۠;->᩹֫()Ll/᩺ܶ۠;

    move-result-object p5

    .line 4139
    invoke-static {p3}, Ll/᩹ܽ۠;->֫(Ll/᩹ܽ۠;)Z

    move-result p7

    if-eqz p7, :cond_1

    .line 4140
    iget-object p7, p3, Ll/᩹ܽ۠;->᩵:Ll/ۛ۠۠;

    .line 4141
    invoke-virtual {v0}, Ll/ۖ֨۠;->֫()Ll/ܳ۠۠;

    move-result-object v1

    iget-object v2, p5, Ll/᩺ܶ۠;->ۧ:Ljava/lang/Object;

    check-cast v2, Ll/ܽܶ۠;

    invoke-static {p7, p2, v1, p1, v2}, Ll/֫ܽ۠;->֫(Ll/ۛ۠۠;Ll/ۗ۠۠;Ll/ܳ۠۠;Ll/۬۠۠;Ll/ܽܶ۠;)Ll/ܽܶ۠;

    move-result-object p7

    if-eqz p7, :cond_1

    return-object p7

    .line 4146
    :cond_1
    iget-object p7, p5, Ll/᩺ܶ۠;->֫:Ljava/lang/Object;

    check-cast p7, Ll/ۛ֡֨;

    iget-object v1, p3, Ll/᩹ܽ۠;->ܳ֫:Ll/ۛ᩸֨;

    invoke-virtual {p7, p4, v1}, Ll/ۛ֡֨;->֫(Ll/ۙ֨֨;Ll/ۛ᩸֨;)Ll/ۛ֡֨;

    move-result-object p4

    .line 4147
    iget-object v1, p3, Ll/᩹ܽ۠;->᩵:Ll/ۛ۠۠;

    invoke-virtual {v0}, Ll/ۖ֨۠;->֫()Ll/ܳ۠۠;

    move-result-object v3

    .line 4149
    invoke-static {p4}, Ll/᩸ᩴ֨;->֫(Ll/ۛ֡֨;)Ll/۠ᩴ֨;

    move-result-object p7

    .line 4150
    iget-object v0, p4, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v2, p3, Ll/᩹ܽ۠;->۬:Ll/ۛܶ۠;

    iget-object v2, v2, Ll/ۛܶ۠;->ᩴۧ:Ll/ۤܶ۠;

    if-ne v0, v2, :cond_2

    iget-object v0, p4, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v0, v0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    :cond_2
    iget-object v2, p4, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 4151
    invoke-virtual {v2}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object v2

    invoke-virtual {p3, v2}, Ll/᩹ܽ۠;->֫(Ll/ۖܶ۠;)Ljava/lang/Object;

    move-result-object v2

    .line 4152
    invoke-virtual {p3, p6}, Ll/᩹ܽ۠;->֫(Ll/ۖܶ۠;)Ljava/lang/Object;

    move-result-object p3

    iget-object p6, p4, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    .line 4153
    invoke-static {p6}, Ll/᩸ᩴ֨;->֫(Ll/ۛ֡֨;)Ll/۠ᩴ֨;

    move-result-object p6

    iget-object p4, p4, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object p4, p4, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    iget-object p5, p5, Ll/᩺ܶ۠;->ۧ:Ljava/lang/Object;

    const/4 v4, 0x7

    new-array v6, v4, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p7, v6, v4

    const/4 p7, 0x1

    aput-object v0, v6, p7

    const/4 p7, 0x2

    aput-object v2, v6, p7

    const/4 p7, 0x3

    aput-object p3, v6, p7

    const/4 p3, 0x4

    aput-object p6, v6, p3

    const/4 p3, 0x5

    aput-object p4, v6, p3

    const/4 p3, 0x6

    aput-object p5, v6, p3

    const-string v5, "cant.apply.symbol"

    move-object v2, p1

    move-object v4, p2

    .line 4147
    invoke-virtual/range {v1 .. v6}, Ll/ۛ۠۠;->֫(Ll/۬۠۠;Ll/ܳ۠۠;Ll/ۗ۠۠;Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ۗ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ᩹֫()Ll/᩺ܶ۠;
    .locals 4

    .line 4170
    iget-object v0, p0, Ll/ۜۧ۠;->᩺:Ll/۫ۧ۠;

    invoke-static {v0}, Ll/۫ۧ۠;->֫(Ll/۫ۧ۠;)Ll/ۖܶ۠;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬ۧ۠;

    .line 4171
    invoke-virtual {v2}, Ll/۬ۧ۠;->֫()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v2

    goto :goto_0

    .line 4174
    :cond_1
    invoke-static {v1}, Ll/۫ۙ;->֫(Ljava/lang/Object;)V

    .line 4175
    new-instance v0, Ll/᩺ܶ۠;

    iget-object v2, v1, Ll/۬ۧ۠;->ᩳ:Ll/ۛ֡֨;

    iget-object v1, v1, Ll/۬ۧ۠;->֫:Ll/ܽܶ۠;

    invoke-direct {v0, v2, v1}, Ll/᩺ܶ۠;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method
