.class public Ll/ܳ᩻ۖ;
.super Ll/۠ᩳۖ;
.source "0B0D"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 693
    invoke-direct {p0}, Ll/۠ᩳۖ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿۜۖ;)Ljava/lang/Object;
    .locals 13

    .line 703
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;

    move-result-object v0

    sget-object v1, Ll/ܳۜۖ;->ۛ:Ll/ܳۜۖ;

    if-ne v0, v1, :cond_0

    .line 704
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۗ()V

    const/4 p1, 0x0

    return-object p1

    .line 707
    :cond_0
    invoke-virtual {p1}, Ll/ܿۜۖ;->ܽ()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 714
    :goto_0
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;

    move-result-object v0

    sget-object v1, Ll/ܳۜۖ;->۫:Ll/ܳۜۖ;

    if-eq v0, v1, :cond_7

    .line 715
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۙ()Ljava/lang/String;

    move-result-object v0

    .line 716
    invoke-virtual {p1}, Ll/ܿۜۖ;->᩹()I

    move-result v1

    .line 717
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v3, -0x1

    sparse-switch v2, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v2, "hourOfDay"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x5

    goto :goto_1

    :sswitch_1
    const-string v2, "month"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x4

    goto :goto_1

    :sswitch_2
    const-string v2, "year"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    const/4 v3, 0x3

    goto :goto_1

    :sswitch_3
    const-string v2, "second"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    const/4 v3, 0x2

    goto :goto_1

    :sswitch_4
    const-string v2, "minute"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_1

    :cond_5
    const/4 v3, 0x1

    goto :goto_1

    :sswitch_5
    const-string v2, "dayOfMonth"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_1

    :cond_6
    const/4 v3, 0x0

    :goto_1
    packed-switch v3, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    move v10, v1

    goto :goto_0

    :pswitch_1
    move v8, v1

    goto :goto_0

    :pswitch_2
    move v7, v1

    goto :goto_0

    :pswitch_3
    move v12, v1

    goto :goto_0

    :pswitch_4
    move v11, v1

    goto :goto_0

    :pswitch_5
    move v9, v1

    goto :goto_0

    .line 740
    :cond_7
    invoke-virtual {p1}, Ll/ܿۜۖ;->᩻()V

    .line 741
    new-instance p1, Ljava/util/GregorianCalendar;

    move-object v6, p1

    invoke-direct/range {v6 .. v12}, Ljava/util/GregorianCalendar;-><init>(IIIIII)V

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4667c053 -> :sswitch_5
        -0x400459ec -> :sswitch_4
        -0x3604bb8c -> :sswitch_3
        0x38883d -> :sswitch_2
        0x6342280 -> :sswitch_1
        0x3ab9c2c1 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 2

    .line 693
    check-cast p2, Ljava/util/Calendar;

    if-nez p2, :cond_0

    .line 747
    invoke-virtual {p1}, Ll/᩻ۜۖ;->ۘ()Ll/᩻ۜۖ;

    return-void

    .line 750
    :cond_0
    invoke-virtual {p1}, Ll/᩻ۜۖ;->ܽ()V

    const-string v0, "year"

    .line 751
    invoke-virtual {p1, v0}, Ll/᩻ۜۖ;->֫(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 752
    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Ll/᩻ۜۖ;->ۧ(J)V

    const-string v0, "month"

    .line 753
    invoke-virtual {p1, v0}, Ll/᩻ۜۖ;->֫(Ljava/lang/String;)V

    const/4 v0, 0x2

    .line 754
    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Ll/᩻ۜۖ;->ۧ(J)V

    const-string v0, "dayOfMonth"

    .line 755
    invoke-virtual {p1, v0}, Ll/᩻ۜۖ;->֫(Ljava/lang/String;)V

    const/4 v0, 0x5

    .line 756
    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Ll/᩻ۜۖ;->ۧ(J)V

    const-string v0, "hourOfDay"

    .line 757
    invoke-virtual {p1, v0}, Ll/᩻ۜۖ;->֫(Ljava/lang/String;)V

    const/16 v0, 0xb

    .line 758
    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Ll/᩻ۜۖ;->ۧ(J)V

    const-string v0, "minute"

    .line 759
    invoke-virtual {p1, v0}, Ll/᩻ۜۖ;->֫(Ljava/lang/String;)V

    const/16 v0, 0xc

    .line 760
    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Ll/᩻ۜۖ;->ۧ(J)V

    const-string v0, "second"

    .line 761
    invoke-virtual {p1, v0}, Ll/᩻ۜۖ;->֫(Ljava/lang/String;)V

    const/16 v0, 0xd

    .line 762
    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result p2

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Ll/᩻ۜۖ;->ۧ(J)V

    .line 763
    invoke-virtual {p1}, Ll/᩻ۜۖ;->ܳ()V

    return-void
.end method
