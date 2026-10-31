.class public final Ll/ۙ۬֨;
.super Ljava/lang/Object;
.source "T41H"


# static fields
.field public static final ۧ:Ll/ۙ֨۠;

.field public static final ܽ:Ljava/lang/Integer;

.field public static final ܿ:Ljava/lang/Integer;

.field public static final ᩳ:Ljava/lang/Integer;


# instance fields
.field public ֫:Ll/᩷ۚ֨;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 46
    new-instance v0, Ll/ۙ֨۠;

    invoke-direct {v0}, Ll/ۙ֨۠;-><init>()V

    sput-object v0, Ll/ۙ۬֨;->ۧ:Ll/ۙ֨۠;

    const/4 v0, -0x1

    .line 63
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Ll/ۙ۬֨;->ܽ:Ljava/lang/Integer;

    const/4 v0, 0x0

    .line 64
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Ll/ۙ۬֨;->ܿ:Ljava/lang/Integer;

    const/4 v0, 0x1

    .line 65
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Ll/ۙ۬֨;->ᩳ:Ljava/lang/Integer;

    return-void
.end method

.method public static ֫(Z)Ljava/lang/Integer;
    .locals 0

    if-eqz p0, :cond_0

    .line 70
    sget-object p0, Ll/ۙ۬֨;->ᩳ:Ljava/lang/Integer;

    return-object p0

    :cond_0
    sget-object p0, Ll/ۙ۬֨;->ܿ:Ljava/lang/Integer;

    return-object p0
.end method

.method public static ֫(Ll/ۗ֨۠;)Ll/ۙ۬֨;
    .locals 2

    .line 51
    sget-object v0, Ll/ۙ۬֨;->ۧ:Ll/ۙ֨۠;

    invoke-virtual {p0, v0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ۬֨;

    if-nez v1, :cond_0

    .line 53
    new-instance v1, Ll/ۙ۬֨;

    .line 57
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 58
    invoke-virtual {p0, v0, v1}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;Ljava/lang/Object;)V

    .line 60
    invoke-static {p0}, Ll/᩷ۚ֨;->֫(Ll/ۗ֨۠;)Ll/᩷ۚ֨;

    move-result-object p0

    iput-object p0, v1, Ll/ۙ۬֨;->֫:Ll/᩷ۚ֨;

    :cond_0
    return-object v1
.end method


# virtual methods
.method public final ֫(ILl/ۙ֨֨;)Ll/ۙ֨֨;
    .locals 3

    .line 87
    iget-object v0, p0, Ll/ۙ۬֨;->֫:Ll/᩷ۚ֨;

    :try_start_0
    invoke-virtual {p2}, Ll/ۙ֨֨;->ۗ()Ljava/lang/Object;

    move-result-object v1

    if-eqz p1, :cond_a

    const/16 p2, 0x101

    const/4 v2, 0x0

    if-eq p1, p2, :cond_8

    const/16 p2, 0x82

    if-eq p1, p2, :cond_7

    const/16 p2, 0x83

    if-eq p1, p2, :cond_6

    packed-switch p1, :pswitch_data_0

    packed-switch p1, :pswitch_data_1

    goto/16 :goto_0

    .line 119
    :pswitch_0
    iget-object p1, v0, Ll/᩷ۚ֨;->ܶ:Ll/۟ۚ֨;

    .line 75
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    neg-double v0, v0

    .line 119
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 116
    :pswitch_1
    iget-object p1, v0, Ll/᩷ۚ֨;->ۤ:Ll/۟ۚ֨;

    .line 74
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result p2

    neg-float p2, p2

    .line 116
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 111
    :pswitch_2
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ֫:Ll/۟ۚ֨;

    .line 73
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    neg-long v0, v0

    .line 111
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 92
    :pswitch_3
    iget-object p1, v0, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    .line 72
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p2

    neg-int p2, p2

    .line 92
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 106
    :pswitch_4
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ:Ll/۟ۚ֨;

    .line 72
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p2

    if-gtz p2, :cond_0

    const/4 v2, 0x1

    .line 106
    :cond_0
    invoke-static {v2}, Ll/ۙ۬֨;->֫(Z)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 104
    :pswitch_5
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ:Ll/۟ۚ֨;

    .line 72
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p2

    if-lez p2, :cond_1

    const/4 v2, 0x1

    .line 104
    :cond_1
    invoke-static {v2}, Ll/ۙ۬֨;->֫(Z)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 108
    :pswitch_6
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ:Ll/۟ۚ֨;

    .line 72
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p2

    if-ltz p2, :cond_2

    const/4 v2, 0x1

    .line 108
    :cond_2
    invoke-static {v2}, Ll/ۙ۬֨;->֫(Z)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 102
    :pswitch_7
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ:Ll/۟ۚ֨;

    .line 72
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p2

    if-gez p2, :cond_3

    const/4 v2, 0x1

    .line 102
    :cond_3
    invoke-static {v2}, Ll/ۙ۬֨;->֫(Z)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 100
    :pswitch_8
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ:Ll/۟ۚ֨;

    .line 72
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p2

    if-eqz p2, :cond_4

    const/4 v2, 0x1

    .line 100
    :cond_4
    invoke-static {v2}, Ll/ۙ۬֨;->֫(Z)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 98
    :pswitch_9
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ:Ll/۟ۚ֨;

    .line 72
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p2

    if-nez p2, :cond_5

    const/4 v2, 0x1

    .line 98
    :cond_5
    invoke-static {v2}, Ll/ۙ۬֨;->֫(Z)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 113
    :cond_6
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ֫:Ll/۟ۚ֨;

    .line 73
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    not-long v0, v0

    .line 113
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 94
    :cond_7
    iget-object p1, v0, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    .line 72
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p2

    not-int p2, p2

    .line 94
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 96
    :cond_8
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ:Ll/۟ۚ֨;

    .line 72
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p2

    if-nez p2, :cond_9

    const/4 v2, 0x1

    .line 96
    :cond_9
    invoke-static {v2}, Ll/ۙ۬֨;->֫(Z)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :cond_a
    return-object p2

    :catch_0
    :goto_0
    const/4 p1, 0x0

    return-object p1

    :pswitch_data_0
    .packed-switch 0x74
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x99
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method

.method public final ֫(ILl/ۙ֨֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;
    .locals 9

    .line 139
    iget-object v0, p0, Ll/ۙ۬֨;->֫:Ll/᩷ۚ֨;

    const/16 v1, 0x1ff

    if-le p1, v1, :cond_1

    shr-int/lit8 v0, p1, 0x9

    .line 142
    :try_start_0
    invoke-virtual {p0, v0, p2, p3}, Ll/ۙ۬֨;->֫(ILl/ۙ֨֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p2

    .line 143
    invoke-virtual {p2}, Ll/ۙ֨֨;->ۗ()Ljava/lang/Object;

    move-result-object p3

    if-nez p3, :cond_0

    return-object p2

    :cond_0
    and-int/2addr p1, v1

    .line 144
    invoke-virtual {p0, p1, p2}, Ll/ۙ۬֨;->֫(ILl/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 146
    :cond_1
    invoke-virtual {p2}, Ll/ۙ֨֨;->ۗ()Ljava/lang/Object;

    move-result-object v1

    .line 147
    invoke-virtual {p3}, Ll/ۙ֨֨;->ۗ()Ljava/lang/Object;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v3, 0x100

    if-eq p1, v3, :cond_19

    const/16 p3, 0x102

    const/4 v3, 0x0

    if-eq p1, p3, :cond_17

    const/16 p3, 0x103

    if-eq p1, p3, :cond_15

    packed-switch p1, :pswitch_data_0

    packed-switch p1, :pswitch_data_1

    .line 148
    sget-object p2, Ll/ۙ۬֨;->ܿ:Ljava/lang/Integer;

    sget-object p3, Ll/ۙ۬֨;->ᩳ:Ljava/lang/Integer;

    sget-object v4, Ll/ۙ۬֨;->ܽ:Ljava/lang/Integer;

    packed-switch p1, :pswitch_data_2

    packed-switch p1, :pswitch_data_3

    packed-switch p1, :pswitch_data_4

    goto/16 :goto_3

    .line 279
    :pswitch_0
    :try_start_1
    iget-object p1, v0, Ll/᩷ۚ֨;->ܶ:Ll/۟ۚ֨;

    .line 75
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    rem-double/2addr p2, v0

    .line 280
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    .line 279
    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 253
    :pswitch_1
    iget-object p1, v0, Ll/᩷ۚ֨;->ۤ:Ll/۟ۚ֨;

    .line 74
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result p3

    rem-float/2addr p2, p3

    .line 254
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    .line 253
    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 213
    :pswitch_2
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ֫:Ll/۟ۚ֨;

    .line 73
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    .line 214
    rem-long/2addr p2, v0

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    .line 213
    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 158
    :pswitch_3
    iget-object p1, v0, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    .line 72
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result p3

    .line 158
    rem-int/2addr p2, p3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 276
    :pswitch_4
    iget-object p1, v0, Ll/᩷ۚ֨;->ܶ:Ll/۟ۚ֨;

    .line 75
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    div-double/2addr p2, v0

    .line 277
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    .line 276
    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 250
    :pswitch_5
    iget-object p1, v0, Ll/᩷ۚ֨;->ۤ:Ll/۟ۚ֨;

    .line 74
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result p3

    div-float/2addr p2, p3

    .line 251
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    .line 250
    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 210
    :pswitch_6
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ֫:Ll/۟ۚ֨;

    .line 73
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    .line 211
    div-long/2addr p2, v0

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    .line 210
    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 156
    :pswitch_7
    iget-object p1, v0, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    .line 72
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result p3

    .line 156
    div-int/2addr p2, p3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 273
    :pswitch_8
    iget-object p1, v0, Ll/᩷ۚ֨;->ܶ:Ll/۟ۚ֨;

    .line 75
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    mul-double p2, p2, v0

    .line 274
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    .line 273
    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 247
    :pswitch_9
    iget-object p1, v0, Ll/᩷ۚ֨;->ۤ:Ll/۟ۚ֨;

    .line 74
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result p3

    mul-float p2, p2, p3

    .line 248
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    .line 247
    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 207
    :pswitch_a
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ֫:Ll/۟ۚ֨;

    .line 73
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    mul-long p2, p2, v0

    .line 208
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    .line 207
    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 154
    :pswitch_b
    iget-object p1, v0, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    .line 72
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result p3

    mul-int p2, p2, p3

    .line 154
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 270
    :pswitch_c
    iget-object p1, v0, Ll/᩷ۚ֨;->ܶ:Ll/۟ۚ֨;

    .line 75
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    sub-double/2addr p2, v0

    .line 271
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    .line 270
    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 244
    :pswitch_d
    iget-object p1, v0, Ll/᩷ۚ֨;->ۤ:Ll/۟ۚ֨;

    .line 74
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result p3

    sub-float/2addr p2, p3

    .line 245
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    .line 244
    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 204
    :pswitch_e
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ֫:Ll/۟ۚ֨;

    .line 73
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    sub-long/2addr p2, v0

    .line 205
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    .line 204
    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 152
    :pswitch_f
    iget-object p1, v0, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    .line 72
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result p3

    sub-int/2addr p2, p3

    .line 152
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 267
    :pswitch_10
    iget-object p1, v0, Ll/᩷ۚ֨;->ܶ:Ll/۟ۚ֨;

    .line 75
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    add-double/2addr p2, v0

    .line 268
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    .line 267
    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 241
    :pswitch_11
    iget-object p1, v0, Ll/᩷ۚ֨;->ۤ:Ll/۟ۚ֨;

    .line 74
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result p3

    add-float/2addr p2, p3

    .line 242
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    .line 241
    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 201
    :pswitch_12
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ֫:Ll/۟ۚ֨;

    .line 73
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    add-long/2addr p2, v0

    .line 202
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    .line 201
    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 150
    :pswitch_13
    iget-object p1, v0, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    .line 72
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result p3

    add-int/2addr p2, p3

    .line 150
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 222
    :pswitch_14
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ֫:Ll/۟ۚ֨;

    .line 73
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    xor-long/2addr p2, v0

    .line 223
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    .line 222
    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 172
    :pswitch_15
    sget-object p1, Ll/ۢ۠֨;->۬:Ll/ۢ۠֨;

    invoke-virtual {p2, p1}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 173
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ:Ll/۟ۚ֨;

    goto :goto_0

    :cond_2
    iget-object p1, v0, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    .line 72
    :goto_0
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result p3

    xor-int/2addr p2, p3

    .line 174
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 219
    :pswitch_16
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ֫:Ll/۟ۚ֨;

    .line 73
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    or-long/2addr p2, v0

    .line 220
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    .line 219
    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 166
    :pswitch_17
    sget-object p1, Ll/ۢ۠֨;->۬:Ll/ۢ۠֨;

    invoke-virtual {p2, p1}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 167
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ:Ll/۟ۚ֨;

    goto :goto_1

    :cond_3
    iget-object p1, v0, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    .line 72
    :goto_1
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result p3

    or-int/2addr p2, p3

    .line 168
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 216
    :pswitch_18
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ֫:Ll/۟ۚ֨;

    .line 73
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    and-long/2addr p2, v0

    .line 217
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    .line 216
    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 160
    :pswitch_19
    sget-object p1, Ll/ۢ۠֨;->۬:Ll/ۢ۠֨;

    invoke-virtual {p2, p1}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 161
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ:Ll/۟ۚ֨;

    goto :goto_2

    :cond_4
    iget-object p1, v0, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    .line 72
    :goto_2
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result p3

    and-int/2addr p2, p3

    .line 162
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 231
    :pswitch_1a
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ֫:Ll/۟ۚ֨;

    .line 73
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide p2

    .line 72
    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v0

    ushr-long/2addr p2, v0

    .line 232
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    .line 231
    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 75
    :pswitch_1b
    move-object v3, v1

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v5

    move-object v3, v2

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    cmpg-double v3, v5, v7

    if-gez v3, :cond_5

    .line 283
    iget-object p1, v0, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    invoke-virtual {p1, v4}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 75
    :cond_5
    move-object v3, v1

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v5

    move-object v3, v2

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    cmpl-double v3, v5, v7

    if-lez v3, :cond_6

    .line 285
    iget-object p1, v0, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    invoke-virtual {p1, p3}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 75
    :cond_6
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v5

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    cmpl-double v3, v5, v1

    if-nez v3, :cond_7

    .line 287
    iget-object p1, v0, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    :cond_7
    const/16 p2, 0x98

    if-ne p1, p2, :cond_8

    .line 289
    iget-object p1, v0, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    invoke-virtual {p1, p3}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 291
    :cond_8
    iget-object p1, v0, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    invoke-virtual {p1, v4}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 74
    :pswitch_1c
    move-object v3, v1

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    move-object v5, v2

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    cmpg-float v3, v3, v5

    if-gez v3, :cond_9

    .line 257
    iget-object p1, v0, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    invoke-virtual {p1, v4}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 74
    :cond_9
    move-object v3, v1

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    move-object v5, v2

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    cmpl-float v3, v3, v5

    if-lez v3, :cond_a

    .line 259
    iget-object p1, v0, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    invoke-virtual {p1, p3}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 74
    :cond_a
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    cmpl-float v1, v1, v2

    if-nez v1, :cond_b

    .line 261
    iget-object p1, v0, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    :cond_b
    const/16 p2, 0x96

    if-ne p1, p2, :cond_c

    .line 263
    iget-object p1, v0, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    invoke-virtual {p1, p3}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 265
    :cond_c
    iget-object p1, v0, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    invoke-virtual {p1, v4}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 73
    :pswitch_1d
    move-object p1, v1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    move-object p1, v2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v7

    cmp-long p1, v5, v7

    if-gez p1, :cond_d

    .line 235
    iget-object p1, v0, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    invoke-virtual {p1, v4}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 73
    :cond_d
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    cmp-long p1, v3, v1

    if-lez p1, :cond_e

    .line 237
    iget-object p1, v0, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    invoke-virtual {p1, p3}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 239
    :cond_e
    iget-object p1, v0, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 295
    :pswitch_1e
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ:Ll/۟ۚ֨;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Ll/ۙ۬֨;->֫(Z)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 293
    :pswitch_1f
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ:Ll/۟ۚ֨;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    invoke-static {p2}, Ll/ۙ۬֨;->֫(Z)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 194
    :pswitch_20
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ:Ll/۟ۚ֨;

    .line 72
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result p3

    if-gt p2, p3, :cond_f

    const/4 v3, 0x1

    .line 195
    :cond_f
    invoke-static {v3}, Ll/ۙ۬֨;->֫(Z)Ljava/lang/Integer;

    move-result-object p2

    .line 194
    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 191
    :pswitch_21
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ:Ll/۟ۚ֨;

    .line 72
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result p3

    if-le p2, p3, :cond_10

    const/4 v3, 0x1

    .line 192
    :cond_10
    invoke-static {v3}, Ll/ۙ۬֨;->֫(Z)Ljava/lang/Integer;

    move-result-object p2

    .line 191
    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 197
    :pswitch_22
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ:Ll/۟ۚ֨;

    .line 72
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result p3

    if-lt p2, p3, :cond_11

    const/4 v3, 0x1

    .line 198
    :cond_11
    invoke-static {v3}, Ll/ۙ۬֨;->֫(Z)Ljava/lang/Integer;

    move-result-object p2

    .line 197
    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 188
    :pswitch_23
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ:Ll/۟ۚ֨;

    .line 72
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result p3

    if-ge p2, p3, :cond_12

    const/4 v3, 0x1

    .line 189
    :cond_12
    invoke-static {v3}, Ll/ۙ۬֨;->֫(Z)Ljava/lang/Integer;

    move-result-object p2

    .line 188
    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 185
    :pswitch_24
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ:Ll/۟ۚ֨;

    .line 72
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result p3

    if-eq p2, p3, :cond_13

    const/4 v3, 0x1

    .line 186
    :cond_13
    invoke-static {v3}, Ll/ۙ۬֨;->֫(Z)Ljava/lang/Integer;

    move-result-object p2

    .line 185
    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 182
    :pswitch_25
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ:Ll/۟ۚ֨;

    .line 72
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result p3

    if-ne p2, p3, :cond_14

    const/4 v3, 0x1

    .line 183
    :cond_14
    invoke-static {v3}, Ll/ۙ۬֨;->֫(Z)Ljava/lang/Integer;

    move-result-object p2

    .line 182
    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 180
    :pswitch_26
    iget-object p1, v0, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    .line 72
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result p3

    ushr-int/2addr p2, p3

    .line 180
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 228
    :pswitch_27
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ֫:Ll/۟ۚ֨;

    .line 73
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide p2

    .line 72
    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v0

    shr-long/2addr p2, v0

    .line 229
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    .line 228
    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 178
    :pswitch_28
    iget-object p1, v0, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    .line 72
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result p3

    shr-int/2addr p2, p3

    .line 178
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 225
    :pswitch_29
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ֫:Ll/۟ۚ֨;

    .line 73
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide p2

    .line 72
    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v0

    shl-long/2addr p2, v0

    .line 226
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    .line 225
    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 176
    :pswitch_2a
    iget-object p1, v0, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    .line 72
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result p3

    shl-int/2addr p2, p3

    .line 176
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 170
    :cond_15
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ:Ll/۟ۚ֨;

    .line 72
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result p3

    or-int/2addr p2, p3

    if-eqz p2, :cond_16

    const/4 v3, 0x1

    .line 170
    :cond_16
    invoke-static {v3}, Ll/ۙ۬֨;->֫(Z)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 164
    :cond_17
    iget-object p1, v0, Ll/᩷ۚ֨;->ۜ:Ll/۟ۚ֨;

    .line 72
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result p3

    and-int/2addr p2, p3

    if-eqz p2, :cond_18

    const/4 v3, 0x1

    .line 164
    :cond_18
    invoke-static {v3}, Ll/ۙ۬֨;->֫(Z)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 297
    :cond_19
    iget-object p1, v0, Ll/᩷ۚ֨;->᩻ۧ:Ll/ۙ֨֨;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 298
    invoke-virtual {p2}, Ll/ۙ֨֨;->᩶֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ll/ۙ֨֨;->᩶֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 297
    invoke-virtual {p1, p2}, Ll/ۙ֨֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/ArithmeticException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    :goto_3
    const/4 p1, 0x0

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x60
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x78
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x94
        :pswitch_1d
        :pswitch_1c
        :pswitch_1c
        :pswitch_1b
        :pswitch_1b
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x9f
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x10e
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
    .end packed-switch
.end method

.method public final ֫(Ll/ۙ֨֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;
    .locals 3

    .line 316
    iget-object v0, p0, Ll/ۙ۬֨;->֫:Ll/᩷ۚ֨;

    iget-object v1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v1, v1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    iget-object v2, p2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v2, v2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    if-ne v1, v2, :cond_0

    return-object p1

    .line 318
    :cond_0
    invoke-virtual {p1}, Ll/ۙ֨֨;->ۖ֫()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 319
    invoke-virtual {p1}, Ll/ۙ֨֨;->ۗ()Ljava/lang/Object;

    move-result-object p1

    .line 320
    sget-object v1, Ll/᩶۬֨;->֫:[I

    invoke-virtual {p2}, Ll/ۙ֨֨;->֫֫()Ll/ۢ۠֨;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 334
    :pswitch_0
    iget-object p2, v0, Ll/᩷ۚ֨;->ܶ:Ll/۟ۚ֨;

    .line 75
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    .line 334
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 332
    :pswitch_1
    iget-object p2, v0, Ll/᩷ۚ֨;->ۤ:Ll/۟ۚ֨;

    .line 74
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    .line 332
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 330
    :pswitch_2
    iget-object p2, v0, Ll/᩷ۚ֨;->ۜ֫:Ll/۟ۚ֨;

    .line 73
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    .line 330
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 328
    :pswitch_3
    iget-object p2, v0, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    .line 72
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    .line 328
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 326
    :pswitch_4
    iget-object p2, v0, Ll/᩷ۚ֨;->ᩳۧ:Ll/۟ۚ֨;

    .line 72
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    int-to-short p1, p1

    .line 326
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 324
    :pswitch_5
    iget-object p2, v0, Ll/᩷ۚ֨;->ۖ:Ll/۟ۚ֨;

    .line 72
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    int-to-char p1, p1

    .line 324
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 322
    :pswitch_6
    iget-object p2, v0, Ll/᩷ۚ֨;->ܺ:Ll/۟ۚ֨;

    .line 72
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    int-to-byte p1, p1

    .line 322
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/۟ۚ֨;->֫(Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    return-object p2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
