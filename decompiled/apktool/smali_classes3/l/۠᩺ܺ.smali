.class public final Ll/۠᩺ܺ;
.super Ljava/lang/Object;
.source "73GB"


# direct methods
.method public static ֫(JJ)J
    .locals 6

    add-long v0, p0, p2

    xor-long/2addr p2, p0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    cmp-long v5, p2, v3

    if-gez v5, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    xor-long/2addr p0, v0

    cmp-long p3, p0, v3

    if-ltz p3, :cond_1

    const/4 v2, 0x1

    :cond_1
    or-int p0, p2, v2

    if-eqz p0, :cond_2

    return-wide v0

    .line 0
    :cond_2
    new-instance p0, Ljava/lang/ArithmeticException;

    invoke-direct {p0}, Ljava/lang/ArithmeticException;-><init>()V

    throw p0
.end method

.method public static ֫(JJLjava/math/RoundingMode;)J
    .locals 9

    .line 902
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    div-long v0, p0, p2

    mul-long v2, p2, v0

    sub-long v2, p0, v2

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-nez v6, :cond_0

    return-wide v0

    :cond_0
    xor-long/2addr p0, p2

    const/16 v7, 0x3f

    shr-long/2addr p0, v7

    long-to-int p1, p0

    const/4 p0, 0x1

    or-int/2addr p1, p0

    .line 397
    sget-object v7, Ll/֨᩺ܺ;->֫:[I

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v7, v7, v8

    packed-switch v7, :pswitch_data_0

    .line 427
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    .line 416
    :pswitch_0
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    .line 417
    invoke-static {p2, p3}, Ljava/lang/Math;->abs(J)J

    move-result-wide p2

    sub-long/2addr p2, v2

    sub-long/2addr v2, p2

    cmp-long p0, v2, v4

    if-nez p0, :cond_2

    .line 421
    sget-object p0, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    if-eq p4, p0, :cond_5

    sget-object p0, Ljava/math/RoundingMode;->HALF_EVEN:Ljava/math/RoundingMode;

    if-ne p4, p0, :cond_1

    const-wide/16 p2, 0x1

    and-long/2addr p2, v0

    cmp-long p0, p2, v4

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    return-wide v0

    :cond_2
    if-lez p0, :cond_3

    goto :goto_0

    :cond_3
    return-wide v0

    :pswitch_1
    if-lez p1, :cond_4

    goto :goto_0

    :cond_4
    return-wide v0

    :pswitch_2
    if-gez p1, :cond_6

    :cond_5
    :goto_0
    :pswitch_3
    int-to-long p0, p1

    add-long/2addr v0, p0

    :cond_6
    return-wide v0

    :pswitch_4
    if-nez v6, :cond_7

    goto :goto_1

    :cond_7
    const/4 p0, 0x0

    .line 399
    :goto_1
    invoke-static {p0}, Ll/ܶ᩺ܺ;->֫(Z)V

    :pswitch_5
    return-wide v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_5
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static ۧ(JJ)J
    .locals 4

    const-string v0, "a"

    .line 494
    invoke-static {p0, p1, v0}, Ll/ܶ᩺ܺ;->֫(JLjava/lang/String;)V

    const-string v0, "b"

    .line 495
    invoke-static {p2, p3, v0}, Ll/ܶ᩺ܺ;->֫(JLjava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-nez v2, :cond_0

    return-wide p2

    :cond_0
    cmp-long v2, p2, v0

    if-nez v2, :cond_1

    return-wide p0

    .line 507
    :cond_1
    invoke-static {p0, p1}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v0

    shr-long/2addr p0, v0

    .line 509
    invoke-static {p2, p3}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v1

    shr-long/2addr p2, v1

    :goto_0
    cmp-long v2, p0, p2

    if-eqz v2, :cond_2

    sub-long/2addr p0, p2

    const/16 v2, 0x3f

    shr-long v2, p0, v2

    and-long/2addr v2, p0

    sub-long/2addr p0, v2

    sub-long/2addr p0, v2

    add-long/2addr p2, v2

    .line 528
    invoke-static {p0, p1}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v2

    shr-long/2addr p0, v2

    goto :goto_0

    .line 530
    :cond_2
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result p2

    shl-long/2addr p0, p2

    return-wide p0
.end method

.method public static ܽ(JJ)J
    .locals 9

    .line 682
    invoke-static {p0, p1}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v0

    not-long v1, p0

    .line 683
    invoke-static {v1, v2}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v1

    add-int/2addr v1, v0

    .line 684
    invoke-static {p2, p3}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v0

    add-int/2addr v0, v1

    not-long v1, p2

    .line 685
    invoke-static {v1, v2}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v1

    add-int/2addr v1, v0

    const/16 v0, 0x41

    if-le v1, v0, :cond_0

    mul-long p0, p0, p2

    return-wide p0

    :cond_0
    xor-long v2, p0, p2

    const/16 v0, 0x3f

    ushr-long/2addr v2, v0

    const-wide v4, 0x7fffffffffffffffL

    add-long/2addr v2, v4

    const/16 v0, 0x40

    const/4 v4, 0x0

    if-ge v1, v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const-wide/16 v5, 0x0

    cmp-long v1, p0, v5

    if-gez v1, :cond_2

    const/4 v5, 0x1

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_1
    const-wide/high16 v6, -0x8000000000000000L

    cmp-long v8, p2, v6

    if-nez v8, :cond_3

    const/4 v4, 0x1

    :cond_3
    and-int/2addr v4, v5

    or-int/2addr v0, v4

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    mul-long v4, p0, p2

    if-eqz v1, :cond_6

    .line 696
    div-long p0, v4, p0

    cmp-long v0, p0, p2

    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    return-wide v2

    :cond_6
    :goto_3
    return-wide v4
.end method
