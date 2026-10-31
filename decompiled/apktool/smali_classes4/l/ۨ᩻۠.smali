.class public final Ll/ۨ᩻۠;
.super Ll/᩷ۜ۠;
.source "Z5U8"


# instance fields
.field public final synthetic ܿ:Ll/᩶ۜ۠;


# direct methods
.method public constructor <init>(Ll/᩶ۜ۠;Ll/ۤܶ۠;Ll/ܽ᩻۠;Ljava/util/EnumSet;)V
    .locals 0

    .line 800
    iput-object p1, p0, Ll/ۨ᩻۠;->ܿ:Ll/᩶ۜ۠;

    invoke-direct {p0, p1, p2, p3, p4}, Ll/᩷ۜ۠;-><init>(Ll/᩶ۜ۠;Ll/ۤܶ۠;Ll/ܽ᩻۠;Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public final ֫(ILl/ۛ֡֨;)V
    .locals 6

    .line 802
    iget-object p1, p0, Ll/ۨ᩻۠;->ܿ:Ll/᩶ۜ۠;

    iget-object v0, p1, Ll/᩶ۜ۠;->۬:Ll/᩶ۢ۠;

    invoke-virtual {p1}, Ll/᩶ۜ۠;->ۧ()C

    move-result v1

    invoke-virtual {v0, v1}, Ll/᩶ۢ۠;->ۧ(I)Ljava/lang/Object;

    move-result-object v0

    .line 804
    invoke-virtual {p2}, Ll/ۛ֡֨;->۬()J

    move-result-wide v1

    const-wide/16 v3, 0x10

    and-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    goto/16 :goto_2

    .line 807
    :cond_0
    check-cast p2, Ll/۫֡֨;

    .line 808
    sget-object v1, Ll/ۤ᩻۠;->ۧ:[I

    iget-object v2, p2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v2}, Ll/ۙ֨֨;->֫֫()Ll/ۢ۠֨;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x1

    packed-switch v1, :pswitch_data_0

    goto :goto_2

    .line 826
    :pswitch_0
    iget-object v1, p2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    iget-object v4, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v5, p1, Ll/᩶ۜ۠;->ܳ֫:Ll/᩷ۚ֨;

    iget-object v5, v5, Ll/᩷ۚ֨;->᩻ۧ:Ll/ۙ֨֨;

    iget-object v5, v5, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    if-ne v4, v5, :cond_1

    .line 827
    const-class v1, Ljava/lang/String;

    invoke-virtual {p0, p2, v1, v0}, Ll/ۨ᩻۠;->֫(Ll/ۛ֡֨;Ljava/lang/Class;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-array p2, v3, [Ljava/lang/Object;

    aput-object v1, p2, v2

    const-string v0, "bad.constant.value.type"

    .line 829
    invoke-virtual {p1, v0, p2}, Ll/᩶ۜ۠;->֫(Ljava/lang/String;[Ljava/lang/Object;)Ll/᩸ۘ֨;

    move-result-object p1

    throw p1

    .line 823
    :pswitch_1
    const-class v1, Ljava/lang/Double;

    invoke-virtual {p0, p2, v1, v0}, Ll/ۨ᩻۠;->֫(Ll/ۛ֡֨;Ljava/lang/Class;Ljava/lang/Object;)V

    goto :goto_0

    .line 820
    :pswitch_2
    const-class v1, Ljava/lang/Float;

    invoke-virtual {p0, p2, v1, v0}, Ll/ۨ᩻۠;->֫(Ll/ۛ֡֨;Ljava/lang/Class;Ljava/lang/Object;)V

    goto :goto_0

    .line 817
    :pswitch_3
    const-class v1, Ljava/lang/Long;

    invoke-virtual {p0, p2, v1, v0}, Ll/ۨ᩻۠;->֫(Ll/ۛ֡֨;Ljava/lang/Class;Ljava/lang/Object;)V

    goto :goto_0

    .line 814
    :pswitch_4
    const-class v1, Ljava/lang/Integer;

    invoke-virtual {p0, p2, v1, v0}, Ll/ۨ᩻۠;->֫(Ll/ۛ֡֨;Ljava/lang/Class;Ljava/lang/Object;)V

    .line 836
    :goto_0
    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_3

    move-object v1, v0

    check-cast v1, Ljava/lang/Integer;

    iget-object v4, p2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v4}, Ll/ۙ֨֨;->֫֫()Ll/ۢ۠֨;

    move-result-object v4

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v4, v1}, Ll/ۢ۠֨;->֫(I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    .line 837
    :cond_2
    iget-object v1, p2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v0, v4, v2

    aput-object p2, v4, v3

    const/4 p2, 0x2

    aput-object v1, v4, p2

    const-string p2, "bad.constant.range"

    invoke-virtual {p1, p2, v4}, Ll/᩶ۜ۠;->֫(Ljava/lang/String;[Ljava/lang/Object;)Ll/᩸ۘ֨;

    move-result-object p1

    throw p1

    .line 839
    :cond_3
    :goto_1
    invoke-virtual {p2, v0}, Ll/۫֡֨;->֫(Ljava/lang/Object;)V

    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Ll/ۛ֡֨;Ljava/lang/Class;Ljava/lang/Object;)V
    .locals 2

    .line 843
    invoke-virtual {p2, p3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 844
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p3, v0, v1

    const/4 p3, 0x1

    aput-object p1, v0, p3

    const/4 p1, 0x2

    aput-object p2, v0, p1

    iget-object p1, p0, Ll/ۨ᩻۠;->ܿ:Ll/᩶ۜ۠;

    const-string p2, "bad.constant.value"

    invoke-virtual {p1, p2, v0}, Ll/᩶ۜ۠;->֫(Ljava/lang/String;[Ljava/lang/Object;)Ll/᩸ۘ֨;

    move-result-object p1

    throw p1
.end method
