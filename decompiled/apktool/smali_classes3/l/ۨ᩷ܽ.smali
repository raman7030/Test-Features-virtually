.class public final Ll/ۨ᩷ܽ;
.super Ljava/lang/Object;
.source "K5DU"


# instance fields
.field public ֫:Z

.field public ۧ:Ljava/lang/Object;

.field public ܽ:Ll/ۛ᩷ܽ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Ll/ۨ᩷ܽ;->֫:Z

    return-void
.end method

.method private ֡()F
    .locals 2

    .line 924
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 926
    :cond_0
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_6

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    .line 928
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0

    .line 940
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 930
    :cond_2
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    long-to-float v0, v0

    return v0

    .line 932
    :cond_3
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-float v0, v0

    return v0

    .line 934
    :cond_4
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Short;

    invoke-virtual {v0}, Ljava/lang/Short;->shortValue()S

    move-result v0

    int-to-float v0, v0

    return v0

    .line 936
    :cond_5
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Character;

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v0

    int-to-float v0, v0

    return v0

    .line 938
    :cond_6
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Byte;

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    int-to-float v0, v0

    return v0
.end method

.method private ֨()J
    .locals 2

    .line 945
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 947
    :cond_0
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_5

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 949
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    .line 959
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 951
    :cond_2
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v0, v0

    return-wide v0

    .line 953
    :cond_3
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Short;

    invoke-virtual {v0}, Ljava/lang/Short;->shortValue()S

    move-result v0

    int-to-long v0, v0

    return-wide v0

    .line 955
    :cond_4
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Character;

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v0

    int-to-long v0, v0

    return-wide v0

    .line 957
    :cond_5
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Byte;

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method private ۚ()I
    .locals 2

    .line 964
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 966
    :cond_0
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 968
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    .line 976
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 970
    :cond_2
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Short;

    invoke-virtual {v0}, Ljava/lang/Short;->shortValue()S

    move-result v0

    return v0

    .line 972
    :cond_3
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Character;

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v0

    return v0

    .line 974
    :cond_4
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Byte;

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    return v0
.end method

.method private ۠()Ljava/lang/Number;
    .locals 2

    .line 878
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    .line 879
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    return-object v0

    .line 880
    :cond_0
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 896
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 882
    :pswitch_0
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    return-object v0

    .line 884
    :pswitch_1
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    return-object v0

    .line 886
    :pswitch_2
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    return-object v0

    .line 892
    :pswitch_3
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Short;

    invoke-virtual {v0}, Ljava/lang/Short;->shortValue()S

    return-object v0

    .line 890
    :pswitch_4
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    return-object v0

    .line 894
    :pswitch_5
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Byte;

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private ᩵()D
    .locals 2

    .line 901
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 903
    :cond_0
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 919
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 905
    :pswitch_0
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0

    .line 907
    :pswitch_1
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    float-to-double v0, v0

    return-wide v0

    .line 909
    :pswitch_2
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    long-to-double v0, v0

    return-wide v0

    .line 911
    :pswitch_3
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-double v0, v0

    return-wide v0

    .line 913
    :pswitch_4
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Short;

    invoke-virtual {v0}, Ljava/lang/Short;->shortValue()S

    move-result v0

    int-to-double v0, v0

    return-wide v0

    .line 915
    :pswitch_5
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Character;

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v0

    int-to-double v0, v0

    return-wide v0

    .line 917
    :pswitch_6
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Byte;

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    int-to-double v0, v0

    return-wide v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡(Ll/ۨ᩷ܽ;)V
    .locals 2

    .line 520
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    return-void

    .line 522
    :cond_0
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->᩷()J

    move-result-wide v0

    .line 523
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    shl-long/2addr v0, p1

    .line 524
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 528
    :cond_1
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ۜ()I

    move-result v0

    .line 529
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    shl-int p1, v0, p1

    .line 530
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 534
    :cond_2
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ۡ()S

    move-result v0

    .line 535
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    shl-int p1, v0, p1

    int-to-short p1, p1

    .line 536
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 540
    :cond_3
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ᩳ()B

    move-result v0

    .line 541
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    shl-int p1, v0, p1

    int-to-byte p1, p1

    .line 542
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void
.end method

.method public final ֡(Ll/ۨ᩷ܽ;Ll/ۨ᩷ܽ;)V
    .locals 4

    .line 474
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    sget-object v1, Ll/ۛ᩷ܽ;->ۛ:Ll/ۛ᩷ܽ;

    if-eq v0, v1, :cond_1

    iget-object v0, p1, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 477
    :cond_0
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->ۚ()I

    move-result v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->ۚ()I

    move-result p1

    xor-int/2addr p1, v0

    invoke-virtual {p2, p1}, Ll/ۨ᩷ܽ;->֫(I)V

    return-void

    .line 475
    :cond_1
    :goto_0
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->֨()J

    move-result-wide v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->֨()J

    move-result-wide v2

    xor-long/2addr v0, v2

    invoke-virtual {p2, v0, v1}, Ll/ۨ᩷ܽ;->֫(J)V

    return-void
.end method

.method public final ֨(Ll/ۨ᩷ܽ;)V
    .locals 2

    .line 596
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    return-void

    .line 598
    :cond_0
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->᩷()J

    move-result-wide v0

    .line 599
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    ushr-long/2addr v0, p1

    .line 600
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 604
    :cond_1
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ۜ()I

    move-result v0

    .line 605
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    ushr-int p1, v0, p1

    .line 606
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 610
    :cond_2
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ۡ()S

    move-result v0

    .line 611
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    ushr-int p1, v0, p1

    int-to-short p1, p1

    .line 612
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 616
    :cond_3
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ᩳ()B

    move-result v0

    .line 617
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    ushr-int p1, v0, p1

    int-to-byte p1, p1

    .line 618
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void
.end method

.method public final ֫()V
    .locals 4

    .line 846
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    if-eq v0, v1, :cond_3

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 848
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    .line 849
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 873
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 853
    :cond_1
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 854
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 858
    :cond_2
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Short;

    invoke-virtual {v0}, Ljava/lang/Short;->shortValue()S

    move-result v0

    sub-int/2addr v0, v1

    int-to-short v0, v0

    .line 859
    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v0

    iput-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 863
    :cond_3
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Character;

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v0

    sub-int/2addr v0, v1

    int-to-char v0, v0

    .line 864
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    iput-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 868
    :cond_4
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Byte;

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    sub-int/2addr v0, v1

    int-to-byte v0, v0

    .line 869
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    iput-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void
.end method

.method public final ֫(B)V
    .locals 1

    .line 733
    sget-object v0, Ll/ۛ᩷ܽ;->ۙ:Ll/ۛ᩷ܽ;

    iput-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    .line 734
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void
.end method

.method public final ֫(C)V
    .locals 1

    .line 738
    sget-object v0, Ll/ۛ᩷ܽ;->ۗ:Ll/ۛ᩷ܽ;

    iput-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    .line 739
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void
.end method

.method public final ֫(D)V
    .locals 1

    .line 748
    sget-object v0, Ll/ۛ᩷ܽ;->۬:Ll/ۛ᩷ܽ;

    iput-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    .line 749
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void
.end method

.method public final ֫(F)V
    .locals 1

    .line 743
    sget-object v0, Ll/ۛ᩷ܽ;->۫:Ll/ۛ᩷ܽ;

    iput-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    .line 744
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    .line 718
    sget-object v0, Ll/ۛ᩷ܽ;->ۤ:Ll/ۛ᩷ܽ;

    iput-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    .line 719
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void
.end method

.method public final ֫(J)V
    .locals 1

    .line 723
    sget-object v0, Ll/ۛ᩷ܽ;->ۛ:Ll/ۛ᩷ܽ;

    iput-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    .line 724
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 1

    .line 753
    sget-object v0, Ll/ۛ᩷ܽ;->ۨ:Ll/ۛ᩷ܽ;

    iput-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    .line 754
    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 708
    sget-object v0, Ll/ۛ᩷ܽ;->ܰ:Ll/ۛ᩷ܽ;

    iput-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    .line 709
    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ll/ۨ᩷ܽ;)V
    .locals 4

    .line 104
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    packed-switch v0, :pswitch_data_0

    return-void

    .line 110
    :pswitch_0
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ܳ()D

    move-result-wide v0

    .line 111
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    add-double/2addr v2, v0

    .line 112
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 116
    :pswitch_1
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->᩻()F

    move-result v0

    .line 117
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    add-float/2addr p1, v0

    .line 118
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 122
    :pswitch_2
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->᩷()J

    move-result-wide v0

    .line 123
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    add-long/2addr v2, v0

    .line 124
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 128
    :pswitch_3
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ۜ()I

    move-result v0

    .line 129
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    add-int/2addr p1, v0

    .line 130
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 140
    :pswitch_4
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ۡ()S

    move-result v0

    .line 141
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    move-result p1

    add-int/2addr p1, v0

    int-to-short p1, p1

    .line 142
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 134
    :pswitch_5
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ܿ()C

    move-result v0

    .line 135
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    add-int/2addr p1, v0

    int-to-char p1, p1

    .line 136
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 146
    :pswitch_6
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ᩳ()B

    move-result v0

    .line 147
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    add-int/2addr p1, v0

    int-to-byte p1, p1

    .line 148
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 106
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Ll/ۨ᩷ܽ;I)V
    .locals 2

    .line 676
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    instance-of v1, v0, [I

    if-eqz v1, :cond_0

    .line 677
    invoke-static {v0, p2}, Ljava/lang/reflect/Array;->getInt(Ljava/lang/Object;I)I

    move-result p2

    invoke-virtual {p1, p2}, Ll/ۨ᩷ܽ;->֫(I)V

    return-void

    .line 679
    :cond_0
    instance-of v1, v0, [B

    if-eqz v1, :cond_1

    .line 680
    invoke-static {v0, p2}, Ljava/lang/reflect/Array;->getByte(Ljava/lang/Object;I)B

    move-result p2

    invoke-virtual {p1, p2}, Ll/ۨ᩷ܽ;->֫(B)V

    return-void

    .line 682
    :cond_1
    instance-of v1, v0, [Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 683
    invoke-static {v0, p2}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, p2}, Ll/ۨ᩷ܽ;->֫(Ljava/lang/String;)V

    return-void

    .line 685
    :cond_2
    instance-of v1, v0, [J

    if-eqz v1, :cond_3

    .line 686
    invoke-static {v0, p2}, Ljava/lang/reflect/Array;->getLong(Ljava/lang/Object;I)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ll/ۨ᩷ܽ;->֫(J)V

    return-void

    .line 688
    :cond_3
    instance-of v1, v0, [C

    if-eqz v1, :cond_4

    .line 689
    invoke-static {v0, p2}, Ljava/lang/reflect/Array;->getChar(Ljava/lang/Object;I)C

    move-result p2

    invoke-virtual {p1, p2}, Ll/ۨ᩷ܽ;->֫(C)V

    return-void

    .line 691
    :cond_4
    instance-of v1, v0, [Z

    if-eqz v1, :cond_5

    .line 692
    invoke-static {v0, p2}, Ljava/lang/reflect/Array;->getBoolean(Ljava/lang/Object;I)Z

    move-result p2

    invoke-virtual {p1, p2}, Ll/ۨ᩷ܽ;->֫(Z)V

    return-void

    .line 694
    :cond_5
    instance-of v1, v0, [S

    if-eqz v1, :cond_6

    .line 695
    invoke-static {v0, p2}, Ljava/lang/reflect/Array;->getShort(Ljava/lang/Object;I)S

    move-result p2

    invoke-virtual {p1, p2}, Ll/ۨ᩷ܽ;->֫(S)V

    return-void

    .line 697
    :cond_6
    instance-of v1, v0, [F

    if-eqz v1, :cond_7

    .line 698
    invoke-static {v0, p2}, Ljava/lang/reflect/Array;->getFloat(Ljava/lang/Object;I)F

    move-result p2

    invoke-virtual {p1, p2}, Ll/ۨ᩷ܽ;->֫(F)V

    return-void

    .line 700
    :cond_7
    instance-of v1, v0, [D

    if-eqz v1, :cond_8

    .line 701
    invoke-static {v0, p2}, Ljava/lang/reflect/Array;->getDouble(Ljava/lang/Object;I)D

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ll/ۨ᩷ܽ;->֫(D)V

    return-void

    .line 704
    :cond_8
    invoke-static {v0, p2}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۨ᩷ܽ;->֫(Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ll/ۨ᩷ܽ;Ll/ۨ᩷ܽ;)V
    .locals 4

    .line 90
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    sget-object v1, Ll/ۛ᩷ܽ;->ܰ:Ll/ۛ᩷ܽ;

    if-eq v0, v1, :cond_7

    iget-object v2, p1, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    if-ne v2, v1, :cond_0

    goto :goto_3

    .line 92
    :cond_0
    sget-object v1, Ll/ۛ᩷ܽ;->۬:Ll/ۛ᩷ܽ;

    if-eq v0, v1, :cond_6

    if-ne v2, v1, :cond_1

    goto :goto_2

    .line 94
    :cond_1
    sget-object v1, Ll/ۛ᩷ܽ;->۫:Ll/ۛ᩷ܽ;

    if-eq v0, v1, :cond_5

    if-ne v2, v1, :cond_2

    goto :goto_1

    .line 96
    :cond_2
    sget-object v1, Ll/ۛ᩷ܽ;->ۛ:Ll/ۛ᩷ܽ;

    if-eq v0, v1, :cond_4

    if-ne v2, v1, :cond_3

    goto :goto_0

    .line 99
    :cond_3
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->ۚ()I

    move-result v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->ۚ()I

    move-result p1

    add-int/2addr v0, p1

    invoke-virtual {p2, v0}, Ll/ۨ᩷ܽ;->֫(I)V

    return-void

    .line 97
    :cond_4
    :goto_0
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->֨()J

    move-result-wide v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->֨()J

    move-result-wide v2

    add-long/2addr v0, v2

    invoke-virtual {p2, v0, v1}, Ll/ۨ᩷ܽ;->֫(J)V

    return-void

    .line 95
    :cond_5
    :goto_1
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->֡()F

    move-result v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->֡()F

    move-result p1

    add-float/2addr v0, p1

    invoke-virtual {p2, v0}, Ll/ۨ᩷ܽ;->֫(F)V

    return-void

    .line 93
    :cond_6
    :goto_2
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->᩵()D

    move-result-wide v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->᩵()D

    move-result-wide v2

    add-double/2addr v0, v2

    invoke-virtual {p2, v0, v1}, Ll/ۨ᩷ܽ;->֫(D)V

    return-void

    .line 91
    :cond_7
    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/ۨ᩷ܽ;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(S)V
    .locals 1

    .line 713
    sget-object v0, Ll/ۛ᩷ܽ;->᩺:Ll/ۛ᩷ܽ;

    iput-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    .line 714
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 728
    sget-object v0, Ll/ۛ᩷ܽ;->᩶:Ll/ۛ᩷ܽ;

    iput-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    .line 729
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void
.end method

.method public final ۖ()V
    .locals 4

    .line 814
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    if-eq v0, v1, :cond_3

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 816
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    .line 817
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 841
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 821
    :cond_1
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/2addr v0, v1

    .line 822
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 826
    :cond_2
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Short;

    invoke-virtual {v0}, Ljava/lang/Short;->shortValue()S

    move-result v0

    add-int/2addr v0, v1

    int-to-short v0, v0

    .line 827
    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v0

    iput-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 831
    :cond_3
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Character;

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v0

    add-int/2addr v0, v1

    int-to-char v0, v0

    .line 832
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    iput-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 836
    :cond_4
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Byte;

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    add-int/2addr v0, v1

    int-to-byte v0, v0

    .line 837
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    iput-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void
.end method

.method public final ۖ(Ll/ۨ᩷ܽ;)V
    .locals 2

    .line 634
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    sget-object v1, Ll/ۛ᩷ܽ;->᩶:Ll/ۛ᩷ܽ;

    if-ne v0, v1, :cond_0

    .line 635
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ܽ()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Ll/ۨ᩷ܽ;->֫(Z)V

    return-void

    .line 637
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public final ۖ(Ll/ۨ᩷ܽ;Ll/ۨ᩷ܽ;)V
    .locals 4

    .line 512
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    sget-object v1, Ll/ۛ᩷ܽ;->ۛ:Ll/ۛ᩷ܽ;

    if-eq v0, v1, :cond_1

    iget-object v0, p1, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 515
    :cond_0
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->ۚ()I

    move-result v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->ۚ()I

    move-result p1

    shl-int p1, v0, p1

    invoke-virtual {p2, p1}, Ll/ۨ᩷ܽ;->֫(I)V

    return-void

    .line 513
    :cond_1
    :goto_0
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->֨()J

    move-result-wide v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->֨()J

    move-result-wide v2

    long-to-int p1, v2

    shl-long/2addr v0, p1

    invoke-virtual {p2, v0, v1}, Ll/ۨ᩷ܽ;->֫(J)V

    return-void
.end method

.method public final ۘ(Ll/ۨ᩷ܽ;)V
    .locals 2

    .line 626
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    sget-object v1, Ll/ۛ᩷ܽ;->ۛ:Ll/ۛ᩷ܽ;

    if-ne v0, v1, :cond_0

    .line 627
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->֨()J

    move-result-wide v0

    not-long v0, v0

    invoke-virtual {p1, v0, v1}, Ll/ۨ᩷ܽ;->֫(J)V

    return-void

    .line 629
    :cond_0
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->ۚ()I

    move-result v0

    not-int v0, v0

    invoke-virtual {p1, v0}, Ll/ۨ᩷ܽ;->֫(I)V

    return-void
.end method

.method public final ۘ(Ll/ۨ᩷ܽ;Ll/ۨ᩷ܽ;)V
    .locals 4

    .line 550
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    sget-object v1, Ll/ۛ᩷ܽ;->ۛ:Ll/ۛ᩷ܽ;

    if-eq v0, v1, :cond_1

    iget-object v0, p1, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 553
    :cond_0
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->ۚ()I

    move-result v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->ۚ()I

    move-result p1

    shr-int p1, v0, p1

    invoke-virtual {p2, p1}, Ll/ۨ᩷ܽ;->֫(I)V

    return-void

    .line 551
    :cond_1
    :goto_0
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->֨()J

    move-result-wide v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->֨()J

    move-result-wide v2

    long-to-int p1, v2

    shr-long/2addr v0, p1

    invoke-virtual {p2, v0, v1}, Ll/ۨ᩷ܽ;->֫(J)V

    return-void
.end method

.method public final ۘ()Z
    .locals 1

    .line 31
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۚ(Ll/ۨ᩷ܽ;)V
    .locals 2

    .line 558
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    return-void

    .line 560
    :cond_0
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->᩷()J

    move-result-wide v0

    .line 561
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    shr-long/2addr v0, p1

    .line 562
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 566
    :cond_1
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ۜ()I

    move-result v0

    .line 567
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    shr-int p1, v0, p1

    .line 568
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 572
    :cond_2
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ۡ()S

    move-result v0

    .line 573
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    shr-int p1, v0, p1

    int-to-short p1, p1

    .line 574
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 578
    :cond_3
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ᩳ()B

    move-result v0

    .line 579
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    shr-int p1, v0, p1

    int-to-byte p1, p1

    .line 580
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void
.end method

.method public final ۜ()I
    .locals 1

    .line 770
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 772
    :cond_0
    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public final ۜ(Ll/ۨ᩷ܽ;)V
    .locals 2

    .line 1057
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->᩵()D

    move-result-wide v0

    double-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Ll/ۨ᩷ܽ;->֫(J)V

    return-void
.end method

.method public final ۜ(Ll/ۨ᩷ܽ;Ll/ۨ᩷ܽ;)V
    .locals 5

    .line 66
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    sget-object v1, Ll/ۛ᩷ܽ;->ܰ:Ll/ۛ᩷ܽ;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iget-object v0, p1, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    if-ne v0, v1, :cond_1

    .line 67
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object p1, p1, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    if-gez p1, :cond_0

    const/4 v2, 0x1

    :cond_0
    invoke-virtual {p2, v2}, Ll/ۨ᩷ܽ;->֫(Z)V

    return-void

    .line 69
    :cond_1
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->᩵()D

    move-result-wide v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->᩵()D

    move-result-wide v3

    cmpg-double p1, v0, v3

    if-gez p1, :cond_2

    const/4 v2, 0x1

    :cond_2
    invoke-virtual {p2, v2}, Ll/ۨ᩷ܽ;->֫(Z)V

    return-void
.end method

.method public final ۠(Ll/ۨ᩷ܽ;)V
    .locals 4

    .line 168
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    return-void

    .line 170
    :pswitch_0
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ܳ()D

    move-result-wide v0

    .line 171
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    sub-double/2addr v0, v2

    .line 172
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 176
    :pswitch_1
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->᩻()F

    move-result v0

    .line 177
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    sub-float/2addr v0, p1

    .line 178
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 182
    :pswitch_2
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->᩷()J

    move-result-wide v0

    .line 183
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    sub-long/2addr v0, v2

    .line 184
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 188
    :pswitch_3
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ۜ()I

    move-result v0

    .line 189
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    sub-int/2addr v0, p1

    .line 190
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 200
    :pswitch_4
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ۡ()S

    move-result v0

    .line 201
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    move-result p1

    sub-int/2addr v0, p1

    int-to-short p1, v0

    .line 202
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 194
    :pswitch_5
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ܿ()C

    move-result v0

    .line 195
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    sub-int/2addr v0, p1

    int-to-char p1, v0

    .line 196
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 206
    :pswitch_6
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ᩳ()B

    move-result v0

    .line 207
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    sub-int/2addr v0, p1

    int-to-byte p1, v0

    .line 208
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ۡ()S
    .locals 1

    .line 764
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 766
    :cond_0
    check-cast v0, Ljava/lang/Short;

    invoke-virtual {v0}, Ljava/lang/Short;->shortValue()S

    move-result v0

    return v0
.end method

.method public final ۡ(Ll/ۨ᩷ܽ;)V
    .locals 4

    .line 228
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    return-void

    .line 230
    :pswitch_0
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ܳ()D

    move-result-wide v0

    .line 231
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    div-double/2addr v0, v2

    .line 232
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 236
    :pswitch_1
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->᩻()F

    move-result v0

    .line 237
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    div-float/2addr v0, p1

    .line 238
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 242
    :pswitch_2
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->᩷()J

    move-result-wide v0

    .line 243
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    div-long/2addr v0, v2

    .line 244
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 248
    :pswitch_3
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ۜ()I

    move-result v0

    .line 249
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    div-int/2addr v0, p1

    .line 250
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 260
    :pswitch_4
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ۡ()S

    move-result v0

    .line 261
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    move-result p1

    div-int/2addr v0, p1

    int-to-short p1, v0

    .line 262
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 254
    :pswitch_5
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ܿ()C

    move-result v0

    .line 255
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    div-int/2addr v0, p1

    int-to-char p1, v0

    .line 256
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 266
    :pswitch_6
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ᩳ()B

    move-result v0

    .line 267
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    div-int/2addr v0, p1

    int-to-byte p1, v0

    .line 268
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ۡ(Ll/ۨ᩷ܽ;Ll/ۨ᩷ܽ;)V
    .locals 4

    .line 436
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    sget-object v1, Ll/ۛ᩷ܽ;->ۛ:Ll/ۛ᩷ܽ;

    if-eq v0, v1, :cond_1

    iget-object v0, p1, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 439
    :cond_0
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->ۚ()I

    move-result v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->ۚ()I

    move-result p1

    or-int/2addr p1, v0

    invoke-virtual {p2, p1}, Ll/ۨ᩷ܽ;->֫(I)V

    return-void

    .line 437
    :cond_1
    :goto_0
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->֨()J

    move-result-wide v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->֨()J

    move-result-wide v2

    or-long/2addr v0, v2

    invoke-virtual {p2, v0, v1}, Ll/ۨ᩷ܽ;->֫(J)V

    return-void
.end method

.method public final ۢ()Ljava/lang/Object;
    .locals 1

    .line 810
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-object v0
.end method

.method public final ۢ(Ll/ۨ᩷ܽ;)V
    .locals 2

    .line 1049
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->᩵()D

    move-result-wide v0

    double-to-int v0, v0

    int-to-short v0, v0

    invoke-virtual {p1, v0}, Ll/ۨ᩷ܽ;->֫(S)V

    return-void
.end method

.method public final ۢ(Ll/ۨ᩷ܽ;Ll/ۨ᩷ܽ;)V
    .locals 5

    .line 47
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    sget-object v1, Ll/ۛ᩷ܽ;->ܰ:Ll/ۛ᩷ܽ;

    const/4 v2, 0x1

    if-eq v0, v1, :cond_4

    iget-object v3, p1, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    if-eq v3, v1, :cond_4

    sget-object v1, Ll/ۛ᩷ܽ;->ۨ:Ll/ۛ᩷ܽ;

    if-eq v0, v1, :cond_4

    if-ne v3, v1, :cond_0

    goto :goto_2

    .line 50
    :cond_0
    sget-object v1, Ll/ۛ᩷ܽ;->᩶:Ll/ۛ᩷ܽ;

    if-ne v0, v1, :cond_2

    if-ne v3, v1, :cond_2

    .line 51
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ܽ()Z

    move-result v0

    invoke-virtual {p1}, Ll/ۨ᩷ܽ;->ܽ()Z

    move-result p1

    if-eq v0, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p2, v2}, Ll/ۨ᩷ܽ;->֫(Z)V

    return-void

    .line 53
    :cond_2
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->᩵()D

    move-result-wide v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->᩵()D

    move-result-wide v3

    cmpl-double p1, v0, v3

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {p2, v2}, Ll/ۨ᩷ܽ;->֫(Z)V

    return-void

    .line 49
    :cond_4
    :goto_2
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    iget-object p1, p1, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v2

    invoke-virtual {p2, p1}, Ll/ۨ᩷ܽ;->֫(Z)V

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 671
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final ۧ(Ll/ۨ᩷ܽ;)V
    .locals 4

    .line 405
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    return-void

    .line 407
    :cond_0
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->᩷()J

    move-result-wide v0

    .line 408
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    and-long/2addr v0, v2

    .line 409
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 413
    :cond_1
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ۜ()I

    move-result v0

    .line 414
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    and-int/2addr p1, v0

    .line 415
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 419
    :cond_2
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ۡ()S

    move-result v0

    .line 420
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    move-result p1

    and-int/2addr p1, v0

    int-to-short p1, p1

    .line 421
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 425
    :cond_3
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ᩳ()B

    move-result v0

    .line 426
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    and-int/2addr p1, v0

    int-to-byte p1, p1

    .line 427
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void
.end method

.method public final ۧ(Ll/ۨ᩷ܽ;I)V
    .locals 3

    .line 642
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    instance-of v1, v0, [I

    if-eqz v1, :cond_0

    .line 643
    invoke-virtual {p1}, Ll/ۨ᩷ܽ;->ۜ()I

    move-result p1

    invoke-static {v0, p2, p1}, Ljava/lang/reflect/Array;->setInt(Ljava/lang/Object;II)V

    return-void

    .line 645
    :cond_0
    instance-of v1, v0, [B

    if-eqz v1, :cond_1

    .line 646
    invoke-virtual {p1}, Ll/ۨ᩷ܽ;->ᩳ()B

    move-result p1

    invoke-static {v0, p2, p1}, Ljava/lang/reflect/Array;->setByte(Ljava/lang/Object;IB)V

    return-void

    .line 648
    :cond_1
    instance-of v1, v0, [Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 649
    invoke-virtual {p1}, Ll/ۨ᩷ܽ;->ܺ()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p2, p1}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    return-void

    .line 651
    :cond_2
    instance-of v1, v0, [C

    if-eqz v1, :cond_3

    .line 652
    invoke-virtual {p1}, Ll/ۨ᩷ܽ;->ܿ()C

    move-result p1

    invoke-static {v0, p2, p1}, Ljava/lang/reflect/Array;->setChar(Ljava/lang/Object;IC)V

    return-void

    .line 654
    :cond_3
    instance-of v1, v0, [Z

    if-eqz v1, :cond_4

    .line 655
    invoke-virtual {p1}, Ll/ۨ᩷ܽ;->ܽ()Z

    move-result p1

    invoke-static {v0, p2, p1}, Ljava/lang/reflect/Array;->setBoolean(Ljava/lang/Object;IZ)V

    return-void

    .line 657
    :cond_4
    instance-of v1, v0, [S

    if-eqz v1, :cond_5

    .line 658
    invoke-virtual {p1}, Ll/ۨ᩷ܽ;->ۡ()S

    move-result p1

    invoke-static {v0, p2, p1}, Ljava/lang/reflect/Array;->setShort(Ljava/lang/Object;IS)V

    return-void

    .line 660
    :cond_5
    instance-of v1, v0, [F

    if-eqz v1, :cond_6

    .line 661
    invoke-virtual {p1}, Ll/ۨ᩷ܽ;->᩻()F

    move-result p1

    invoke-static {v0, p2, p1}, Ljava/lang/reflect/Array;->setFloat(Ljava/lang/Object;IF)V

    return-void

    .line 663
    :cond_6
    instance-of v1, v0, [D

    if-eqz v1, :cond_7

    .line 664
    invoke-virtual {p1}, Ll/ۨ᩷ܽ;->ܳ()D

    move-result-wide v1

    invoke-static {v0, p2, v1, v2}, Ljava/lang/reflect/Array;->setDouble(Ljava/lang/Object;ID)V

    return-void

    .line 810
    :cond_7
    iget-object p1, p1, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    .line 667
    invoke-static {v0, p2, p1}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public final ۧ(Ll/ۨ᩷ܽ;Ll/ۨ᩷ܽ;)V
    .locals 4

    .line 397
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    sget-object v1, Ll/ۛ᩷ܽ;->ۛ:Ll/ۛ᩷ܽ;

    if-eq v0, v1, :cond_1

    iget-object v0, p1, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 400
    :cond_0
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->ۚ()I

    move-result v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->ۚ()I

    move-result p1

    and-int/2addr p1, v0

    invoke-virtual {p2, p1}, Ll/ۨ᩷ܽ;->֫(I)V

    return-void

    .line 398
    :cond_1
    :goto_0
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->֨()J

    move-result-wide v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->֨()J

    move-result-wide v2

    and-long/2addr v0, v2

    invoke-virtual {p2, v0, v1}, Ll/ۨ᩷ܽ;->֫(J)V

    return-void
.end method

.method public final ܳ()D
    .locals 2

    .line 788
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 790
    :cond_0
    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public final ܳ(Ll/ۨ᩷ܽ;)V
    .locals 2

    .line 1061
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->᩵()D

    move-result-wide v0

    double-to-float v0, v0

    invoke-virtual {p1, v0}, Ll/ۨ᩷ܽ;->֫(F)V

    return-void
.end method

.method public final ܳ(Ll/ۨ᩷ܽ;Ll/ۨ᩷ܽ;)V
    .locals 5

    .line 58
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    sget-object v1, Ll/ۛ᩷ܽ;->ܰ:Ll/ۛ᩷ܽ;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iget-object v0, p1, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    if-ne v0, v1, :cond_1

    .line 59
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object p1, p1, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    if-lez p1, :cond_0

    const/4 v2, 0x1

    :cond_0
    invoke-virtual {p2, v2}, Ll/ۨ᩷ܽ;->֫(Z)V

    return-void

    .line 61
    :cond_1
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->᩵()D

    move-result-wide v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->᩵()D

    move-result-wide v3

    cmpl-double p1, v0, v3

    if-lez p1, :cond_2

    const/4 v2, 0x1

    :cond_2
    invoke-virtual {p2, v2}, Ll/ۨ᩷ܽ;->֫(Z)V

    return-void
.end method

.method public final ܶ(Ll/ۨ᩷ܽ;)V
    .locals 4

    .line 482
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    return-void

    .line 484
    :cond_0
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->᩷()J

    move-result-wide v0

    .line 485
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    xor-long/2addr v0, v2

    .line 486
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 490
    :cond_1
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ۜ()I

    move-result v0

    .line 491
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    xor-int/2addr p1, v0

    .line 492
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 496
    :cond_2
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ۡ()S

    move-result v0

    .line 497
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    move-result p1

    xor-int/2addr p1, v0

    int-to-short p1, p1

    .line 498
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 502
    :cond_3
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ᩳ()B

    move-result v0

    .line 503
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    xor-int/2addr p1, v0

    int-to-byte p1, p1

    .line 504
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void
.end method

.method public final ܺ()Ljava/lang/String;
    .locals 1

    .line 758
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    .line 760
    :cond_0
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final ܺ(Ll/ۨ᩷ܽ;)V
    .locals 4

    .line 288
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    return-void

    .line 290
    :pswitch_0
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ܳ()D

    move-result-wide v0

    .line 291
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    mul-double v2, v2, v0

    .line 292
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 296
    :pswitch_1
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->᩻()F

    move-result v0

    .line 297
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    mul-float p1, p1, v0

    .line 298
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 302
    :pswitch_2
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->᩷()J

    move-result-wide v0

    .line 303
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    mul-long v2, v2, v0

    .line 304
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 308
    :pswitch_3
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ۜ()I

    move-result v0

    .line 309
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    mul-int p1, p1, v0

    .line 310
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 320
    :pswitch_4
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ۡ()S

    move-result v0

    .line 321
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    move-result p1

    mul-int p1, p1, v0

    int-to-short p1, p1

    .line 322
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 314
    :pswitch_5
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ܿ()C

    move-result v0

    .line 315
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    mul-int p1, p1, v0

    int-to-char p1, p1

    .line 316
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 326
    :pswitch_6
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ᩳ()B

    move-result v0

    .line 327
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    mul-int p1, p1, v0

    int-to-byte p1, p1

    .line 328
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ܺ(Ll/ۨ᩷ܽ;Ll/ۨ᩷ܽ;)V
    .locals 4

    .line 337
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    sget-object v1, Ll/ۛ᩷ܽ;->۬:Ll/ۛ᩷ܽ;

    if-eq v0, v1, :cond_5

    iget-object v2, p1, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    if-ne v2, v1, :cond_0

    goto :goto_2

    .line 339
    :cond_0
    sget-object v1, Ll/ۛ᩷ܽ;->۫:Ll/ۛ᩷ܽ;

    if-eq v0, v1, :cond_4

    if-ne v2, v1, :cond_1

    goto :goto_1

    .line 341
    :cond_1
    sget-object v1, Ll/ۛ᩷ܽ;->ۛ:Ll/ۛ᩷ܽ;

    if-eq v0, v1, :cond_3

    if-ne v2, v1, :cond_2

    goto :goto_0

    .line 344
    :cond_2
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->ۚ()I

    move-result v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->ۚ()I

    move-result p1

    rem-int/2addr v0, p1

    invoke-virtual {p2, v0}, Ll/ۨ᩷ܽ;->֫(I)V

    return-void

    .line 342
    :cond_3
    :goto_0
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->֨()J

    move-result-wide v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->֨()J

    move-result-wide v2

    rem-long/2addr v0, v2

    invoke-virtual {p2, v0, v1}, Ll/ۨ᩷ܽ;->֫(J)V

    return-void

    .line 340
    :cond_4
    :goto_1
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->֡()F

    move-result v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->֡()F

    move-result p1

    rem-float/2addr v0, p1

    invoke-virtual {p2, v0}, Ll/ۨ᩷ܽ;->֫(F)V

    return-void

    .line 338
    :cond_5
    :goto_2
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->᩵()D

    move-result-wide v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->᩵()D

    move-result-wide v2

    rem-double/2addr v0, v2

    invoke-virtual {p2, v0, v1}, Ll/ۨ᩷ܽ;->֫(D)V

    return-void
.end method

.method public final ܽ(Ll/ۨ᩷ܽ;)V
    .locals 2

    .line 1041
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->᩵()D

    move-result-wide v0

    double-to-int v0, v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Ll/ۨ᩷ܽ;->֫(B)V

    return-void
.end method

.method public final ܽ(Ll/ۨ᩷ܽ;Ll/ۨ᩷ܽ;)V
    .locals 4

    .line 216
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    sget-object v1, Ll/ۛ᩷ܽ;->۬:Ll/ۛ᩷ܽ;

    if-eq v0, v1, :cond_5

    iget-object v2, p1, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    if-ne v2, v1, :cond_0

    goto :goto_2

    .line 218
    :cond_0
    sget-object v1, Ll/ۛ᩷ܽ;->۫:Ll/ۛ᩷ܽ;

    if-eq v0, v1, :cond_4

    if-ne v2, v1, :cond_1

    goto :goto_1

    .line 220
    :cond_1
    sget-object v1, Ll/ۛ᩷ܽ;->ۛ:Ll/ۛ᩷ܽ;

    if-eq v0, v1, :cond_3

    if-ne v2, v1, :cond_2

    goto :goto_0

    .line 223
    :cond_2
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->ۚ()I

    move-result v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->ۚ()I

    move-result p1

    div-int/2addr v0, p1

    invoke-virtual {p2, v0}, Ll/ۨ᩷ܽ;->֫(I)V

    return-void

    .line 221
    :cond_3
    :goto_0
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->֨()J

    move-result-wide v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->֨()J

    move-result-wide v2

    div-long/2addr v0, v2

    invoke-virtual {p2, v0, v1}, Ll/ۨ᩷ܽ;->֫(J)V

    return-void

    .line 219
    :cond_4
    :goto_1
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->֡()F

    move-result v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->֡()F

    move-result p1

    div-float/2addr v0, p1

    invoke-virtual {p2, v0}, Ll/ۨ᩷ܽ;->֫(F)V

    return-void

    .line 217
    :cond_5
    :goto_2
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->᩵()D

    move-result-wide v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->᩵()D

    move-result-wide v2

    div-double/2addr v0, v2

    invoke-virtual {p2, v0, v1}, Ll/ۨ᩷ܽ;->֫(D)V

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 794
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    if-eqz v0, :cond_0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܿ()C
    .locals 1

    .line 804
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 806
    :cond_0
    check-cast v0, Ljava/lang/Character;

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v0

    return v0
.end method

.method public final ܿ(Ll/ۨ᩷ܽ;)V
    .locals 2

    .line 1065
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->᩵()D

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ll/ۨ᩷ܽ;->֫(D)V

    return-void
.end method

.method public final ܿ(Ll/ۨ᩷ܽ;Ll/ۨ᩷ܽ;)V
    .locals 5

    .line 74
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    sget-object v1, Ll/ۛ᩷ܽ;->ܰ:Ll/ۛ᩷ܽ;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iget-object v0, p1, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    if-ne v0, v1, :cond_1

    .line 75
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object p1, p1, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 v2, 0x1

    :cond_0
    invoke-virtual {p2, v2}, Ll/ۨ᩷ܽ;->֫(Z)V

    return-void

    .line 77
    :cond_1
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->᩵()D

    move-result-wide v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->᩵()D

    move-result-wide v3

    cmpl-double p1, v0, v3

    if-ltz p1, :cond_2

    const/4 v2, 0x1

    :cond_2
    invoke-virtual {p2, v2}, Ll/ۨ᩷ܽ;->֫(Z)V

    return-void
.end method

.method public final ᩳ()B
    .locals 1

    .line 798
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 800
    :cond_0
    check-cast v0, Ljava/lang/Byte;

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    return v0
.end method

.method public final ᩳ(Ll/ۨ᩷ܽ;)V
    .locals 2

    .line 1045
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->᩵()D

    move-result-wide v0

    double-to-int v0, v0

    int-to-char v0, v0

    invoke-virtual {p1, v0}, Ll/ۨ᩷ܽ;->֫(C)V

    return-void
.end method

.method public final ᩳ(Ll/ۨ᩷ܽ;Ll/ۨ᩷ܽ;)V
    .locals 6

    .line 36
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    sget-object v1, Ll/ۛ᩷ܽ;->ܰ:Ll/ۛ᩷ܽ;

    if-eq v0, v1, :cond_4

    iget-object v2, p1, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    if-eq v2, v1, :cond_4

    sget-object v1, Ll/ۛ᩷ܽ;->ۨ:Ll/ۛ᩷ܽ;

    if-eq v0, v1, :cond_4

    if-ne v2, v1, :cond_0

    goto :goto_0

    .line 39
    :cond_0
    sget-object v1, Ll/ۛ᩷ܽ;->᩶:Ll/ۛ᩷ܽ;

    const/4 v3, 0x0

    if-ne v0, v1, :cond_2

    if-ne v2, v1, :cond_2

    .line 40
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ܽ()Z

    move-result v0

    invoke-virtual {p1}, Ll/ۨ᩷ܽ;->ܽ()Z

    move-result p1

    if-ne v0, p1, :cond_1

    const/4 v3, 0x1

    :cond_1
    invoke-virtual {p2, v3}, Ll/ۨ᩷ܽ;->֫(Z)V

    return-void

    .line 42
    :cond_2
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->᩵()D

    move-result-wide v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->᩵()D

    move-result-wide v4

    cmpl-double p1, v0, v4

    if-nez p1, :cond_3

    const/4 v3, 0x1

    :cond_3
    invoke-virtual {p2, v3}, Ll/ۨ᩷ܽ;->֫(Z)V

    return-void

    .line 38
    :cond_4
    :goto_0
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    iget-object p1, p1, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {p2, p1}, Ll/ۨ᩷ܽ;->֫(Z)V

    return-void
.end method

.method public final ᩴ()V
    .locals 1

    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    .line 17
    iput-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    return-void
.end method

.method public final ᩴ(Ll/ۨ᩷ܽ;)V
    .locals 4

    .line 444
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    return-void

    .line 446
    :cond_0
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->᩷()J

    move-result-wide v0

    .line 447
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    or-long/2addr v0, v2

    .line 448
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 452
    :cond_1
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ۜ()I

    move-result v0

    .line 453
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    or-int/2addr p1, v0

    .line 454
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 458
    :cond_2
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ۡ()S

    move-result v0

    .line 459
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    move-result p1

    or-int/2addr p1, v0

    int-to-short p1, p1

    .line 460
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 464
    :cond_3
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ᩳ()B

    move-result v0

    .line 465
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    or-int/2addr p1, v0

    int-to-byte p1, p1

    .line 466
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void
.end method

.method public final ᩴ(Ll/ۨ᩷ܽ;Ll/ۨ᩷ܽ;)V
    .locals 4

    .line 588
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    sget-object v1, Ll/ۛ᩷ܽ;->ۛ:Ll/ۛ᩷ܽ;

    if-eq v0, v1, :cond_1

    iget-object v0, p1, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 591
    :cond_0
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->ۚ()I

    move-result v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->ۚ()I

    move-result p1

    ushr-int p1, v0, p1

    invoke-virtual {p2, p1}, Ll/ۨ᩷ܽ;->֫(I)V

    return-void

    .line 589
    :cond_1
    :goto_0
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->֨()J

    move-result-wide v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->֨()J

    move-result-wide v2

    long-to-int p1, v2

    ushr-long/2addr v0, p1

    invoke-virtual {p2, v0, v1}, Ll/ۨ᩷ܽ;->֫(J)V

    return-void
.end method

.method public final ᩵(Ll/ۨ᩷ܽ;)V
    .locals 4

    .line 349
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    return-void

    .line 351
    :pswitch_0
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ܳ()D

    move-result-wide v0

    .line 352
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    rem-double/2addr v0, v2

    .line 353
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 357
    :pswitch_1
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->᩻()F

    move-result v0

    .line 358
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    rem-float/2addr v0, p1

    .line 359
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 363
    :pswitch_2
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->᩷()J

    move-result-wide v0

    .line 364
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    rem-long/2addr v0, v2

    .line 365
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 369
    :pswitch_3
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ۜ()I

    move-result v0

    .line 370
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    rem-int/2addr v0, p1

    .line 371
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 381
    :pswitch_4
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ۡ()S

    move-result v0

    .line 382
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    move-result p1

    rem-int/2addr v0, p1

    int-to-short p1, v0

    .line 383
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 375
    :pswitch_5
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ܿ()C

    move-result v0

    .line 376
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    rem-int/2addr v0, p1

    int-to-char p1, v0

    .line 377
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    .line 387
    :pswitch_6
    invoke-virtual {p0}, Ll/ۨ᩷ܽ;->ᩳ()B

    move-result v0

    .line 388
    invoke-direct {p1}, Ll/ۨ᩷ܽ;->۠()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    rem-int/2addr v0, p1

    int-to-byte p1, v0

    .line 389
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ᩵(Ll/ۨ᩷ܽ;Ll/ۨ᩷ܽ;)V
    .locals 4

    .line 156
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    sget-object v1, Ll/ۛ᩷ܽ;->۬:Ll/ۛ᩷ܽ;

    if-eq v0, v1, :cond_5

    iget-object v2, p1, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    if-ne v2, v1, :cond_0

    goto :goto_2

    .line 158
    :cond_0
    sget-object v1, Ll/ۛ᩷ܽ;->۫:Ll/ۛ᩷ܽ;

    if-eq v0, v1, :cond_4

    if-ne v2, v1, :cond_1

    goto :goto_1

    .line 160
    :cond_1
    sget-object v1, Ll/ۛ᩷ܽ;->ۛ:Ll/ۛ᩷ܽ;

    if-eq v0, v1, :cond_3

    if-ne v2, v1, :cond_2

    goto :goto_0

    .line 163
    :cond_2
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->ۚ()I

    move-result v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->ۚ()I

    move-result p1

    sub-int/2addr v0, p1

    invoke-virtual {p2, v0}, Ll/ۨ᩷ܽ;->֫(I)V

    return-void

    .line 161
    :cond_3
    :goto_0
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->֨()J

    move-result-wide v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->֨()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-virtual {p2, v0, v1}, Ll/ۨ᩷ܽ;->֫(J)V

    return-void

    .line 159
    :cond_4
    :goto_1
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->֡()F

    move-result v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->֡()F

    move-result p1

    sub-float/2addr v0, p1

    invoke-virtual {p2, v0}, Ll/ۨ᩷ܽ;->֫(F)V

    return-void

    .line 157
    :cond_5
    :goto_2
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->᩵()D

    move-result-wide v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->᩵()D

    move-result-wide v2

    sub-double/2addr v0, v2

    invoke-virtual {p2, v0, v1}, Ll/ۨ᩷ܽ;->֫(D)V

    return-void
.end method

.method public final ᩷()J
    .locals 2

    .line 776
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 778
    :cond_0
    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩷(Ll/ۨ᩷ܽ;)V
    .locals 2

    .line 1035
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    sget-object v1, Ll/ۛ᩷ܽ;->۟:Ll/ۛ᩷ܽ;

    if-eq v0, v1, :cond_0

    .line 1037
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ll/ۨ᩷ܽ;->֫(Ljava/lang/Object;)V

    return-void

    .line 1036
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public final ᩷(Ll/ۨ᩷ܽ;Ll/ۨ᩷ܽ;)V
    .locals 4

    .line 276
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    sget-object v1, Ll/ۛ᩷ܽ;->۬:Ll/ۛ᩷ܽ;

    if-eq v0, v1, :cond_5

    iget-object v2, p1, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    if-ne v2, v1, :cond_0

    goto :goto_2

    .line 278
    :cond_0
    sget-object v1, Ll/ۛ᩷ܽ;->۫:Ll/ۛ᩷ܽ;

    if-eq v0, v1, :cond_4

    if-ne v2, v1, :cond_1

    goto :goto_1

    .line 280
    :cond_1
    sget-object v1, Ll/ۛ᩷ܽ;->ۛ:Ll/ۛ᩷ܽ;

    if-eq v0, v1, :cond_3

    if-ne v2, v1, :cond_2

    goto :goto_0

    .line 283
    :cond_2
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->ۚ()I

    move-result v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->ۚ()I

    move-result p1

    mul-int v0, v0, p1

    invoke-virtual {p2, v0}, Ll/ۨ᩷ܽ;->֫(I)V

    return-void

    .line 281
    :cond_3
    :goto_0
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->֨()J

    move-result-wide v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->֨()J

    move-result-wide v2

    mul-long v0, v0, v2

    invoke-virtual {p2, v0, v1}, Ll/ۨ᩷ܽ;->֫(J)V

    return-void

    .line 279
    :cond_4
    :goto_1
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->֡()F

    move-result v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->֡()F

    move-result p1

    mul-float v0, v0, p1

    invoke-virtual {p2, v0}, Ll/ۨ᩷ܽ;->֫(F)V

    return-void

    .line 277
    :cond_5
    :goto_2
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->᩵()D

    move-result-wide v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->᩵()D

    move-result-wide v2

    mul-double v0, v0, v2

    invoke-virtual {p2, v0, v1}, Ll/ۨ᩷ܽ;->֫(D)V

    return-void
.end method

.method public final ᩻()F
    .locals 1

    .line 782
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 784
    :cond_0
    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method

.method public final ᩻(Ll/ۨ᩷ܽ;)V
    .locals 2

    .line 1053
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->᩵()D

    move-result-wide v0

    double-to-int v0, v0

    invoke-virtual {p1, v0}, Ll/ۨ᩷ܽ;->֫(I)V

    return-void
.end method

.method public final ᩻(Ll/ۨ᩷ܽ;Ll/ۨ᩷ܽ;)V
    .locals 5

    .line 82
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    sget-object v1, Ll/ۛ᩷ܽ;->ܰ:Ll/ۛ᩷ܽ;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iget-object v0, p1, Ll/ۨ᩷ܽ;->ܽ:Ll/ۛ᩷ܽ;

    if-ne v0, v1, :cond_1

    .line 83
    iget-object v0, p0, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object p1, p1, Ll/ۨ᩷ܽ;->ۧ:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    if-gtz p1, :cond_0

    const/4 v2, 0x1

    :cond_0
    invoke-virtual {p2, v2}, Ll/ۨ᩷ܽ;->֫(Z)V

    return-void

    .line 85
    :cond_1
    invoke-direct {p0}, Ll/ۨ᩷ܽ;->᩵()D

    move-result-wide v0

    invoke-direct {p1}, Ll/ۨ᩷ܽ;->᩵()D

    move-result-wide v3

    cmpg-double p1, v0, v3

    if-gtz p1, :cond_2

    const/4 v2, 0x1

    :cond_2
    invoke-virtual {p2, v2}, Ll/ۨ᩷ܽ;->֫(Z)V

    return-void
.end method
