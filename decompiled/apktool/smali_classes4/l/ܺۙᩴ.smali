.class public final Ll/ܺۙᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ܳۙᩴ;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Ll/ܺۙᩴ;->a:I

    iput-object p2, p0, Ll/ܺۙᩴ;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/StringBuilder;I)V
    .locals 1

    .line 3875
    div-int/lit8 v0, p1, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    rem-int/lit8 p1, p1, 0xa

    add-int/lit8 p1, p1, 0x30

    int-to-char p1, p1

    .line 3876
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static b(Ljava/lang/CharSequence;I)I
    .locals 1

    .line 3920
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p0

    const/16 p1, 0x30

    if-lt p0, p1, :cond_1

    const/16 v0, 0x39

    if-le p0, v0, :cond_0

    goto :goto_0

    :cond_0
    sub-int/2addr p0, p1

    return p0

    :cond_1
    :goto_0
    const/4 p0, -0x1

    return p0
.end method


# virtual methods
.method public final l(Ll/ۤۙᩴ;Ljava/lang/StringBuilder;)Z
    .locals 5

    iget v0, p0, Ll/ܺۙᩴ;->a:I

    packed-switch v0, :pswitch_data_0

    .line 2606
    iget-object p1, p0, Ll/ܺۙᩴ;->b:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p1, 0x1

    return p1

    .line 3881
    :pswitch_0
    sget-object v0, Ll/ᩴۗᩴ;->OFFSET_SECONDS:Ll/ᩴۗᩴ;

    invoke-virtual {p1, v0}, Ll/ۤۙᩴ;->a(Ll/ۤۗᩴ;)Ljava/lang/Long;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto/16 :goto_2

    :cond_0
    const-string v0, "GMT"

    .line 3886
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3887
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/᩺ۚᩴ;->y(J)I

    move-result p1

    if-eqz p1, :cond_5

    .line 3889
    div-int/lit16 v0, p1, 0xe10

    rem-int/lit8 v0, v0, 0x64

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    .line 3890
    div-int/lit8 v1, p1, 0x3c

    rem-int/lit8 v1, v1, 0x3c

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    .line 3891
    rem-int/lit8 v2, p1, 0x3c

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    if-gez p1, :cond_1

    const-string p1, "-"

    goto :goto_0

    :cond_1
    const-string p1, "+"

    .line 3892
    :goto_0
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3893
    iget-object p1, p0, Ll/ܺۙᩴ;->b:Ljava/lang/Object;

    check-cast p1, Ll/᩷ۙᩴ;

    sget-object v3, Ll/᩷ۙᩴ;->FULL:Ll/᩷ۙᩴ;

    const/16 v4, 0x3a

    if-ne p1, v3, :cond_2

    .line 3894
    invoke-static {p2, v0}, Ll/ܺۙᩴ;->a(Ljava/lang/StringBuilder;I)V

    .line 3895
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 3896
    invoke-static {p2, v1}, Ll/ܺۙᩴ;->a(Ljava/lang/StringBuilder;I)V

    if-eqz v2, :cond_5

    .line 3898
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 3899
    invoke-static {p2, v2}, Ll/ܺۙᩴ;->a(Ljava/lang/StringBuilder;I)V

    goto :goto_1

    :cond_2
    const/16 p1, 0xa

    if-lt v0, p1, :cond_3

    .line 3903
    div-int/lit8 v3, v0, 0xa

    add-int/lit8 v3, v3, 0x30

    int-to-char v3, v3

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 3905
    :cond_3
    rem-int/2addr v0, p1

    add-int/lit8 v0, v0, 0x30

    int-to-char p1, v0

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-nez v1, :cond_4

    if-eqz v2, :cond_5

    .line 3907
    :cond_4
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 3908
    invoke-static {p2, v1}, Ll/ܺۙᩴ;->a(Ljava/lang/StringBuilder;I)V

    if-eqz v2, :cond_5

    .line 3910
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 3911
    invoke-static {p2, v2}, Ll/ܺۙᩴ;->a(Ljava/lang/StringBuilder;I)V

    :cond_5
    :goto_1
    const/4 p1, 0x1

    :goto_2
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Ll/ۗۙᩴ;Ljava/lang/CharSequence;I)I
    .locals 12

    iget v0, p0, Ll/ܺۙᩴ;->a:I

    packed-switch v0, :pswitch_data_0

    .line 2612
    iget-object v0, p0, Ll/ܺۙᩴ;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-gt p3, v1, :cond_e

    if-ltz p3, :cond_e

    const/4 v5, 0x0

    .line 2616
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, v0

    invoke-virtual/range {v1 .. v6}, Ll/ۗۙᩴ;->g(Ljava/lang/CharSequence;ILjava/lang/CharSequence;II)Z

    move-result p1

    if-nez p1, :cond_d

    not-int p1, p3

    goto/16 :goto_5

    .line 3930
    :pswitch_0
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v5, 0x0

    const/4 v6, 0x3

    const-string v4, "GMT"

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    .line 3932
    invoke-virtual/range {v1 .. v6}, Ll/ۗۙᩴ;->g(Ljava/lang/CharSequence;ILjava/lang/CharSequence;II)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_1

    :cond_0
    add-int/lit8 v7, p3, 0x3

    if-ne v7, v0, :cond_1

    .line 3939
    sget-object v3, Ll/ᩴۗᩴ;->OFFSET_SECONDS:Ll/ᩴۗᩴ;

    const-wide/16 v4, 0x0

    move-object v2, p1

    move v6, p3

    invoke-virtual/range {v2 .. v7}, Ll/ۗۙᩴ;->f(Ll/ۤۗᩴ;JII)I

    move-result p1

    goto/16 :goto_4

    .line 3941
    :cond_1
    invoke-interface {p2, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0x2b

    if-ne v1, v2, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/16 v2, 0x2d

    if-ne v1, v2, :cond_c

    const/4 v1, -0x1

    :goto_0
    add-int/lit8 v2, p3, 0x4

    .line 3953
    iget-object v3, p0, Ll/ܺۙᩴ;->b:Ljava/lang/Object;

    check-cast v3, Ll/᩷ۙᩴ;

    sget-object v4, Ll/᩷ۙᩴ;->FULL:Ll/᩷ۙᩴ;

    const/4 v5, 0x0

    const/16 v6, 0x3a

    if-ne v3, v4, :cond_5

    add-int/lit8 v3, p3, 0x5

    .line 3954
    invoke-static {p2, v2}, Ll/ܺۙᩴ;->b(Ljava/lang/CharSequence;I)I

    move-result v2

    add-int/lit8 v4, p3, 0x6

    .line 3955
    invoke-static {p2, v3}, Ll/ܺۙᩴ;->b(Ljava/lang/CharSequence;I)I

    move-result v3

    if-ltz v2, :cond_6

    if-ltz v3, :cond_6

    add-int/lit8 v7, p3, 0x7

    .line 3956
    invoke-interface {p2, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    if-eq v4, v6, :cond_3

    goto :goto_1

    :cond_3
    mul-int/lit8 v2, v2, 0xa

    add-int/2addr v2, v3

    add-int/lit8 v3, p3, 0x8

    .line 3960
    invoke-static {p2, v7}, Ll/ܺۙᩴ;->b(Ljava/lang/CharSequence;I)I

    move-result v4

    add-int/lit8 v7, p3, 0x9

    .line 3961
    invoke-static {p2, v3}, Ll/ܺۙᩴ;->b(Ljava/lang/CharSequence;I)I

    move-result v3

    if-ltz v4, :cond_6

    if-gez v3, :cond_4

    goto :goto_1

    :cond_4
    mul-int/lit8 v4, v4, 0xa

    add-int/2addr v4, v3

    add-int/lit8 v3, p3, 0xb

    if-ge v3, v0, :cond_9

    .line 3966
    invoke-interface {p2, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    if-ne v0, v6, :cond_9

    add-int/lit8 v0, p3, 0xa

    .line 3967
    invoke-static {p2, v0}, Ll/ܺۙᩴ;->b(Ljava/lang/CharSequence;I)I

    move-result v0

    .line 3968
    invoke-static {p2, v3}, Ll/ܺۙᩴ;->b(Ljava/lang/CharSequence;I)I

    move-result p2

    if-ltz v0, :cond_9

    if-ltz p2, :cond_9

    mul-int/lit8 v0, v0, 0xa

    add-int v5, v0, p2

    add-int/lit8 v7, p3, 0xc

    goto :goto_2

    :cond_5
    add-int/lit8 v3, p3, 0x5

    .line 3975
    invoke-static {p2, v2}, Ll/ܺۙᩴ;->b(Ljava/lang/CharSequence;I)I

    move-result v2

    if-gez v2, :cond_7

    :cond_6
    :goto_1
    not-int p1, p3

    goto/16 :goto_4

    :cond_7
    if-ge v3, v0, :cond_a

    .line 3980
    invoke-static {p2, v3}, Ll/ܺۙᩴ;->b(Ljava/lang/CharSequence;I)I

    move-result v4

    if-ltz v4, :cond_8

    mul-int/lit8 v2, v2, 0xa

    add-int/2addr v2, v4

    add-int/lit8 v3, p3, 0x6

    :cond_8
    add-int/lit8 v4, v3, 0x2

    if-ge v4, v0, :cond_a

    .line 3985
    invoke-interface {p2, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    if-ne v7, v6, :cond_a

    if-ge v4, v0, :cond_a

    .line 3986
    invoke-interface {p2, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    if-ne v7, v6, :cond_a

    add-int/lit8 v7, v3, 0x1

    .line 3987
    invoke-static {p2, v7}, Ll/ܺۙᩴ;->b(Ljava/lang/CharSequence;I)I

    move-result v7

    .line 3988
    invoke-static {p2, v4}, Ll/ܺۙᩴ;->b(Ljava/lang/CharSequence;I)I

    move-result v4

    if-ltz v7, :cond_a

    if-ltz v4, :cond_a

    mul-int/lit8 v7, v7, 0xa

    add-int v5, v7, v4

    add-int/lit8 v4, v3, 0x3

    add-int/lit8 v7, v3, 0x5

    if-ge v7, v0, :cond_b

    .line 3992
    invoke-interface {p2, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    if-ne v0, v6, :cond_b

    add-int/lit8 v0, v3, 0x4

    .line 3993
    invoke-static {p2, v0}, Ll/ܺۙᩴ;->b(Ljava/lang/CharSequence;I)I

    move-result v0

    .line 3994
    invoke-static {p2, v7}, Ll/ܺۙᩴ;->b(Ljava/lang/CharSequence;I)I

    move-result p2

    if-ltz v0, :cond_b

    if-ltz p2, :cond_b

    mul-int/lit8 v0, v0, 0xa

    add-int/2addr p2, v0

    add-int/lit8 v7, v3, 0x6

    move v4, v5

    move v5, p2

    :cond_9
    :goto_2
    move v11, v7

    goto :goto_3

    :cond_a
    move v4, v3

    :cond_b
    const/4 p2, 0x0

    move v11, v4

    move v4, v5

    const/4 v5, 0x0

    :goto_3
    int-to-long v0, v1

    int-to-long v2, v2

    const-wide/16 v6, 0xe10

    mul-long v2, v2, v6

    int-to-long v6, v4

    const-wide/16 v8, 0x3c

    mul-long v6, v6, v8

    add-long/2addr v6, v2

    int-to-long v2, v5

    add-long/2addr v6, v2

    mul-long v8, v6, v0

    .line 4006
    sget-object v7, Ll/ᩴۗᩴ;->OFFSET_SECONDS:Ll/ᩴۗᩴ;

    move-object v6, p1

    move v10, p3

    invoke-virtual/range {v6 .. v11}, Ll/ۗۙᩴ;->f(Ll/ۤۗᩴ;JII)I

    move-result p1

    goto :goto_4

    .line 3947
    :cond_c
    sget-object v3, Ll/ᩴۗᩴ;->OFFSET_SECONDS:Ll/ᩴۗᩴ;

    const-wide/16 v4, 0x0

    move-object v2, p1

    move v6, p3

    invoke-virtual/range {v2 .. v7}, Ll/ۗۙᩴ;->f(Ll/ۤۗᩴ;JII)I

    move-result p1

    :goto_4
    return p1

    .line 2619
    :cond_d
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, p3

    :goto_5
    return p1

    .line 2614
    :cond_e
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Ll/ܺۙᩴ;->a:I

    packed-switch v0, :pswitch_data_0

    .line 2624
    iget-object v0, p0, Ll/ܺۙᩴ;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const-string v1, "\'\'"

    const-string v2, "\'"

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 2625
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 4011
    :pswitch_0
    iget-object v0, p0, Ll/ܺۙᩴ;->b:Ljava/lang/Object;

    check-cast v0, Ll/᩷ۙᩴ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "LocalizedOffset("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
