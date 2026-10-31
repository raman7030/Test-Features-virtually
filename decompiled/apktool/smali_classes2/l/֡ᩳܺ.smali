.class public Ll/֡ᩳܺ;
.super Ljava/lang/Object;
.source "SBE3"


# instance fields
.field public ֫:I

.field public ۖ:I

.field public ۘ:[Ll/֫ۖܺ;

.field public ۜ:Ll/۟ܺܺ;

.field public ۡ:Ll/᩸ۡܺ;

.field public ۢ:Z

.field public ۧ:[Ll/֫ۖܺ;

.field public ܳ:I

.field public final ܺ:Ll/᩺ܺܺ;

.field public ܽ:Ll/᩵ᩳܺ;

.field public ܿ:Ljava/util/ArrayList;

.field public ᩳ:Ll/ܰۡܺ;

.field public ᩷:I

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/᩺ܺܺ;)V
    .locals 1

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 117
    iput-object p1, p0, Ll/֡ᩳܺ;->ܺ:Ll/᩺ܺܺ;

    const/16 p1, 0xa

    new-array p1, p1, [Ll/֫ۖܺ;

    .line 118
    iput-object p1, p0, Ll/֡ᩳܺ;->ۧ:[Ll/֫ۖܺ;

    const/4 p1, 0x6

    new-array p1, p1, [Ll/֫ۖܺ;

    .line 119
    iput-object p1, p0, Ll/֡ᩳܺ;->ۘ:[Ll/֫ۖܺ;

    .line 120
    invoke-virtual {p0}, Ll/֡ᩳܺ;->ۧ()V

    return-void

    .line 114
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "prototype == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 341
    iget v0, p0, Ll/֡ᩳܺ;->֫:I

    return v0
.end method

.method public final ֫(I)Ll/֫ۖܺ;
    .locals 1

    .line 367
    iget v0, p0, Ll/֡ᩳܺ;->֫:I

    if-ge p1, v0, :cond_0

    .line 372
    :try_start_0
    iget-object v0, p0, Ll/֡ᩳܺ;->ۧ:[Ll/֫ۖܺ;

    aget-object p1, v0, p1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 375
    :catch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "n < 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 368
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "n >= argCount"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Z)Ll/᩸ۡܺ;
    .locals 5

    .line 467
    iget-object v0, p0, Ll/֡ᩳܺ;->ۡ:Ll/᩸ۡܺ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 471
    :cond_0
    iget v0, p0, Ll/֡ᩳܺ;->ۖ:I

    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    .line 472
    new-instance p1, Ll/ۖᩳܺ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "local target with "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 473
    iget v2, p0, Ll/֡ᩳܺ;->ۖ:I

    if-nez v2, :cond_1

    const-string v2, "no"

    goto :goto_0

    :cond_1
    const-string v2, "multiple"

    :goto_0
    const-string v3, " results"

    .line 0
    invoke-static {v0, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 60
    invoke-direct {p1, v0, v1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 473
    throw p1

    .line 476
    :cond_2
    iget-object v0, p0, Ll/֡ᩳܺ;->ۘ:[Ll/֫ۖܺ;

    const/4 v2, 0x0

    aget-object v0, v0, v2

    .line 477
    invoke-interface {v0}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object v2

    .line 478
    iget-object v3, p0, Ll/֡ᩳܺ;->ۡ:Ll/᩸ۡܺ;

    invoke-virtual {v3}, Ll/᩸ۡܺ;->getType()Ll/۟ܺܺ;

    move-result-object v3

    if-ne v2, v3, :cond_4

    if-eqz p1, :cond_3

    .line 487
    iget-object p1, p0, Ll/֡ᩳܺ;->ۡ:Ll/᩸ۡܺ;

    invoke-virtual {p1, v0}, Ll/᩸ۡܺ;->֫(Ll/֫ۖܺ;)Ll/᩸ۡܺ;

    move-result-object p1

    return-object p1

    .line 489
    :cond_3
    iget-object p1, p0, Ll/֡ᩳܺ;->ۡ:Ll/᩸ۡܺ;

    return-object p1

    .line 493
    :cond_4
    invoke-static {v3, v2}, Ll/᩺ۤۡ;->֫(Ll/֫ۖܺ;Ll/֫ۖܺ;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 499
    sget-object p1, Ll/۟ܺܺ;->ܶ֫:Ll/۟ܺܺ;

    if-ne v3, p1, :cond_5

    .line 504
    iget-object p1, p0, Ll/֡ᩳܺ;->ۡ:Ll/᩸ۡܺ;

    invoke-virtual {p1, v0}, Ll/᩸ۡܺ;->֫(Ll/֫ۖܺ;)Ll/᩸ۡܺ;

    move-result-object p1

    iput-object p1, p0, Ll/֡ᩳܺ;->ۡ:Ll/᩸ۡܺ;

    .line 507
    :cond_5
    iget-object p1, p0, Ll/֡ᩳܺ;->ۡ:Ll/᩸ۡܺ;

    return-object p1

    .line 642
    :cond_6
    new-instance p1, Ll/ۖᩳܺ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "local variable type mismatch: attempt to set or access a value of type "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 644
    invoke-virtual {v2}, Ll/۟ܺܺ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " using a local variable of type "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 646
    invoke-virtual {v3}, Ll/۟ܺܺ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ". This is symptomatic of .class transformation tools that ignore local variable information."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 60
    invoke-direct {p1, v0, v1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 646
    throw p1
.end method

.method public final ֫(ILl/۟ܺܺ;Ll/ᩴۡܺ;)V
    .locals 0

    .line 332
    invoke-static {p1, p2, p3}, Ll/᩸ۡܺ;->ܽ(ILl/֫ۖܺ;Ll/ᩴۡܺ;)Ll/᩸ۡܺ;

    move-result-object p1

    iput-object p1, p0, Ll/֡ᩳܺ;->ۡ:Ll/᩸ۡܺ;

    return-void
.end method

.method public final ֫(Ljava/util/ArrayList;)V
    .locals 0

    .line 324
    iput-object p1, p0, Ll/֡ᩳܺ;->ܿ:Ljava/util/ArrayList;

    return-void
.end method

.method public final ֫(Ll/֫ۖܺ;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 530
    iget-object v0, p0, Ll/֡ᩳܺ;->ۘ:[Ll/֫ۖܺ;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    .line 531
    iput p1, p0, Ll/֡ᩳܺ;->ۖ:I

    return-void

    .line 527
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "result == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/۟ܺܺ;)V
    .locals 0

    .line 276
    iput-object p1, p0, Ll/֡ᩳܺ;->ۜ:Ll/۟ܺܺ;

    return-void
.end method

.method public final ֫(Ll/۫ܽܺ;I)V
    .locals 2

    .line 257
    invoke-virtual {p0}, Ll/֡ᩳܺ;->ۧ()V

    .line 258
    iget-object v0, p0, Ll/֡ᩳܺ;->ۧ:[Ll/֫ۖܺ;

    invoke-virtual {p1}, Ll/۫ܽܺ;->ۧ()Ll/ܰܽܺ;

    move-result-object p1

    invoke-virtual {p1, p2}, Ll/ܰܽܺ;->get(I)Ll/֫ۖܺ;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    .line 259
    iput p1, p0, Ll/֡ᩳܺ;->֫:I

    .line 260
    iput p2, p0, Ll/֡ᩳܺ;->᩷:I

    return-void
.end method

.method public ֫(Ll/۫ܽܺ;II)V
    .locals 3

    .line 46
    iget-object v0, p0, Ll/֡ᩳܺ;->ۘ:[Ll/֫ۖܺ;

    const/4 v1, 0x0

    if-eqz p3, :cond_7

    const/16 v2, 0x14

    if-eq p3, v2, :cond_6

    const/16 v2, 0x15

    if-eq p3, v2, :cond_5

    const/16 v2, 0xab

    if-eq p3, v2, :cond_7

    const/16 v2, 0xac

    if-eq p3, v2, :cond_7

    sparse-switch p3, :sswitch_data_0

    packed-switch p3, :pswitch_data_0

    packed-switch p3, :pswitch_data_1

    packed-switch p3, :pswitch_data_2

    packed-switch p3, :pswitch_data_3

    .line 205
    new-instance p1, Ljava/lang/RuntimeException;

    .line 206
    invoke-static {p3}, Ll/ܳᩴܺ;->ۧ(I)Ljava/lang/String;

    move-result-object p2

    const-string p3, "shouldn\'t happen: "

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 514
    :pswitch_0
    iput v1, p0, Ll/֡ᩳܺ;->ۖ:I

    .line 394
    iget p2, p0, Ll/֡ᩳܺ;->ܳ:I

    :goto_0
    if-eqz p2, :cond_8

    and-int/lit8 p3, p2, 0xf

    add-int/lit8 p3, p3, -0x1

    .line 139
    invoke-virtual {p0, p3}, Ll/֡ᩳܺ;->֫(I)Ll/֫ۖܺ;

    move-result-object p3

    if-eqz p3, :cond_0

    .line 545
    iget v2, p0, Ll/֡ᩳܺ;->ۖ:I

    aput-object p3, v0, v2

    add-int/lit8 v2, v2, 0x1

    .line 546
    iput v2, p0, Ll/֡ᩳܺ;->ۖ:I

    shr-int/lit8 p2, p2, 0x4

    goto :goto_0

    .line 542
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "result == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 145
    :pswitch_1
    new-instance p2, Ll/ۧᩳܺ;

    .line 412
    iget p3, p0, Ll/֡ᩳܺ;->᩻:I

    .line 145
    invoke-direct {p2, p3}, Ll/ۧᩳܺ;-><init>(I)V

    invoke-virtual {p0, p2}, Ll/֡ᩳܺ;->֫(Ll/֫ۖܺ;)V

    goto/16 :goto_2

    .line 201
    :pswitch_2
    sget-object p2, Ll/۟ܺܺ;->ܺ֫:Ll/۟ܺܺ;

    invoke-virtual {p0, p2}, Ll/֡ᩳܺ;->֫(Ll/֫ۖܺ;)V

    goto/16 :goto_2

    .line 385
    :pswitch_3
    :sswitch_0
    iget-object p2, p0, Ll/֡ᩳܺ;->ۜ:Ll/۟ܺܺ;

    .line 126
    invoke-virtual {p0, p2}, Ll/֡ᩳܺ;->֫(Ll/֫ۖܺ;)V

    goto/16 :goto_2

    .line 403
    :pswitch_4
    iget-object p2, p0, Ll/֡ᩳܺ;->ᩳ:Ll/ܰۡܺ;

    .line 196
    check-cast p2, Ll/۫ܺܺ;

    invoke-virtual {p2}, Ll/۫ܺܺ;->ܺ()Ll/۟ܺܺ;

    move-result-object p2

    .line 197
    invoke-virtual {p2}, Ll/۟ܺܺ;->ۧ()Ll/۟ܺܺ;

    move-result-object p2

    invoke-virtual {p0, p2}, Ll/֡ᩳܺ;->֫(Ll/֫ۖܺ;)V

    goto/16 :goto_2

    .line 403
    :pswitch_5
    iget-object p3, p0, Ll/֡ᩳܺ;->ᩳ:Ll/ܰۡܺ;

    .line 184
    check-cast p3, Ll/۫ܺܺ;

    invoke-virtual {p3}, Ll/۫ܺܺ;->ܺ()Ll/۟ܺܺ;

    move-result-object p3

    .line 185
    invoke-virtual {p3, p2}, Ll/۟ܺܺ;->֫(I)Ll/۟ܺܺ;

    move-result-object p2

    invoke-virtual {p0, p2}, Ll/֡ᩳܺ;->֫(Ll/֫ۖܺ;)V

    goto :goto_2

    .line 403
    :pswitch_6
    iget-object p2, p0, Ll/֡ᩳܺ;->ᩳ:Ll/ܰۡܺ;

    .line 175
    check-cast p2, Ll/᩻ܺܺ;

    invoke-virtual {p2}, Ll/᩻ܺܺ;->ᩳ()Ll/۟ܺܺ;

    move-result-object p2

    .line 176
    sget-object p3, Ll/۟ܺܺ;->ۨ֫:Ll/۟ܺܺ;

    if-ne p2, p3, :cond_1

    goto :goto_1

    .line 179
    :cond_1
    invoke-virtual {p0, p2}, Ll/֡ᩳܺ;->֫(Ll/֫ۖܺ;)V

    goto :goto_2

    .line 162
    :pswitch_7
    invoke-virtual {p0, v1}, Ll/֡ᩳܺ;->֫(I)Ll/֫ۖܺ;

    move-result-object p2

    invoke-interface {p2}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object p2

    .line 163
    invoke-virtual {p2}, Ll/۟ܺܺ;->ۙ()Z

    move-result p3

    if-eqz p3, :cond_2

    .line 164
    invoke-virtual {p1, p2}, Ll/۫ܽܺ;->֫(Ll/۟ܺܺ;)V

    .line 403
    :cond_2
    iget-object p2, p0, Ll/֡ᩳܺ;->ᩳ:Ll/ܰۡܺ;

    .line 166
    check-cast p2, Ll/֫ۖܺ;

    invoke-interface {p2}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object p2

    .line 167
    sget-object p3, Ll/۟ܺܺ;->ۨ֫:Ll/۟ܺܺ;

    if-ne p2, p3, :cond_3

    goto :goto_1

    .line 170
    :cond_3
    invoke-virtual {p0, p2}, Ll/֡ᩳܺ;->֫(Ll/֫ۖܺ;)V

    goto :goto_2

    .line 403
    :pswitch_8
    iget-object p2, p0, Ll/֡ᩳܺ;->ᩳ:Ll/ܰۡܺ;

    .line 153
    check-cast p2, Ll/֫ۖܺ;

    invoke-interface {p2}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object p2

    .line 154
    sget-object p3, Ll/۟ܺܺ;->ۨ֫:Ll/۟ܺܺ;

    if-ne p2, p3, :cond_4

    goto :goto_1

    .line 157
    :cond_4
    invoke-virtual {p0, p2}, Ll/֡ᩳܺ;->֫(Ll/֫ۖܺ;)V

    goto :goto_2

    .line 403
    :pswitch_9
    iget-object p2, p0, Ll/֡ᩳܺ;->ᩳ:Ll/ܰۡܺ;

    .line 191
    check-cast p2, Ll/۫ܺܺ;

    invoke-virtual {p2}, Ll/۫ܺܺ;->ܺ()Ll/۟ܺܺ;

    move-result-object p2

    .line 192
    invoke-virtual {p0, p2}, Ll/֡ᩳܺ;->֫(Ll/֫ۖܺ;)V

    goto :goto_2

    .line 88
    :cond_5
    :sswitch_1
    invoke-virtual {p0, v1}, Ll/֡ᩳܺ;->֫(I)Ll/֫ۖܺ;

    move-result-object p2

    invoke-virtual {p0, p2}, Ll/֡ᩳܺ;->֫(Ll/֫ۖܺ;)V

    goto :goto_2

    .line 403
    :cond_6
    :sswitch_2
    iget-object p2, p0, Ll/֡ᩳܺ;->ᩳ:Ll/ܰۡܺ;

    .line 83
    check-cast p2, Ll/֫ۖܺ;

    invoke-virtual {p0, p2}, Ll/֡ᩳܺ;->֫(Ll/֫ۖܺ;)V

    goto :goto_2

    .line 514
    :cond_7
    :goto_1
    :pswitch_a
    :sswitch_3
    iput v1, p0, Ll/֡ᩳܺ;->ۖ:I

    .line 607
    :cond_8
    :goto_2
    iget p2, p0, Ll/֡ᩳܺ;->ۖ:I

    if-ltz p2, :cond_d

    if-nez p2, :cond_9

    goto :goto_4

    .line 616
    :cond_9
    iget-object p2, p0, Ll/֡ᩳܺ;->ۡ:Ll/᩸ۡܺ;

    if-eqz p2, :cond_a

    .line 621
    invoke-virtual {p1}, Ll/۫ܽܺ;->ۧ()Ll/ܰܽܺ;

    move-result-object p1

    invoke-virtual {p0, v1}, Ll/֡ᩳܺ;->֫(Z)Ll/᩸ۡܺ;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ܰܽܺ;->֫(Ll/᩸ۡܺ;)V

    return-void

    .line 623
    :cond_a
    invoke-virtual {p1}, Ll/۫ܽܺ;->ܽ()Ll/۬ܽܺ;

    move-result-object p1

    .line 624
    :goto_3
    iget p2, p0, Ll/֡ᩳܺ;->ۖ:I

    if-ge v1, p2, :cond_c

    .line 625
    iget-boolean p2, p0, Ll/֡ᩳܺ;->ۢ:Z

    if-eqz p2, :cond_b

    .line 626
    invoke-virtual {p1}, Ll/۬ܽܺ;->ܶ()V

    .line 628
    :cond_b
    aget-object p2, v0, v1

    invoke-virtual {p1, p2}, Ll/۬ܽܺ;->֫(Ll/֫ۖܺ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_c
    :goto_4
    return-void

    .line 608
    :cond_d
    new-instance p1, Ll/ۖᩳܺ;

    const-string p2, "results never set"

    const/4 p3, 0x0

    .line 60
    invoke-direct {p1, p2, p3}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 608
    throw p1

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_3
        0x12 -> :sswitch_2
        0x2e -> :sswitch_0
        0x36 -> :sswitch_1
        0x4f -> :sswitch_3
        0x64 -> :sswitch_0
        0x68 -> :sswitch_0
        0x6c -> :sswitch_0
        0x70 -> :sswitch_0
        0x74 -> :sswitch_0
        0x78 -> :sswitch_0
        0x7a -> :sswitch_0
        0x7c -> :sswitch_0
        0x7e -> :sswitch_0
        0x80 -> :sswitch_0
        0x82 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x57
        :pswitch_a
        :pswitch_a
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x84
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_1
        :pswitch_a
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0xb1
        :pswitch_a
        :pswitch_8
        :pswitch_a
        :pswitch_8
        :pswitch_a
        :pswitch_8
        :pswitch_7
        :pswitch_8
        :pswitch_8
        :pswitch_6
        :pswitch_5
        :pswitch_9
        :pswitch_4
        :pswitch_3
        :pswitch_a
        :pswitch_9
        :pswitch_2
        :pswitch_a
        :pswitch_a
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0xc5
        :pswitch_9
        :pswitch_a
        :pswitch_a
    .end packed-switch
.end method

.method public final ֫(Ll/۫ܽܺ;Ll/۟ܺܺ;)V
    .locals 3

    const/4 v0, 0x1

    .line 195
    invoke-virtual {p0, p1, v0}, Ll/֡ᩳܺ;->ۧ(Ll/۫ܽܺ;I)V

    .line 198
    iget-object p1, p0, Ll/֡ᩳܺ;->ۧ:[Ll/֫ۖܺ;

    const/4 v0, 0x0

    aget-object p1, p1, v0

    invoke-static {p2, p1}, Ll/᩺ۤۡ;->֫(Ll/֫ۖܺ;Ll/֫ۖܺ;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 199
    :cond_0
    new-instance p1, Ll/ۖᩳܺ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "expected type "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ll/۟ܺܺ;->֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " but found "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Ll/֡ᩳܺ;->ۧ:[Ll/֫ۖܺ;

    aget-object p2, p2, v0

    .line 200
    invoke-interface {p2}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object p2

    invoke-virtual {p2}, Ll/۟ܺܺ;->֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    .line 60
    invoke-direct {p1, p2, v0}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 200
    throw p1
.end method

.method public final ֫(Ll/۫ܽܺ;Ll/۟ܺܺ;Ll/۟ܺܺ;)V
    .locals 4

    const/4 v0, 0x2

    .line 210
    invoke-virtual {p0, p1, v0}, Ll/֡ᩳܺ;->ۧ(Ll/۫ܽܺ;I)V

    .line 214
    iget-object p1, p0, Ll/֡ᩳܺ;->ۧ:[Ll/֫ۖܺ;

    const/4 v0, 0x0

    aget-object p1, p1, v0

    invoke-static {p2, p1}, Ll/᩺ۤۡ;->֫(Ll/֫ۖܺ;Ll/֫ۖܺ;)Z

    move-result p1

    const/4 v1, 0x0

    const-string v2, " but found "

    const-string v3, "expected type "

    if-eqz p1, :cond_1

    .line 219
    iget-object p1, p0, Ll/֡ᩳܺ;->ۧ:[Ll/֫ۖܺ;

    const/4 p2, 0x1

    aget-object p1, p1, p2

    invoke-static {p3, p1}, Ll/᩺ۤۡ;->֫(Ll/֫ۖܺ;Ll/֫ۖܺ;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 220
    :cond_0
    new-instance p1, Ll/ۖᩳܺ;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Ll/۟ܺܺ;->֫()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Ll/֡ᩳܺ;->ۧ:[Ll/֫ۖܺ;

    aget-object p2, p3, p2

    .line 221
    invoke-interface {p2}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object p2

    invoke-virtual {p2}, Ll/۟ܺܺ;->֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 60
    invoke-direct {p1, p2, v1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 221
    throw p1

    .line 215
    :cond_1
    new-instance p1, Ll/ۖᩳܺ;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ll/۟ܺܺ;->֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Ll/֡ᩳܺ;->ۧ:[Ll/֫ۖܺ;

    aget-object p2, p2, v0

    .line 216
    invoke-interface {p2}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object p2

    invoke-virtual {p2}, Ll/۟ܺܺ;->֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 60
    invoke-direct {p1, p2, v1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 216
    throw p1
.end method

.method public final ֫(Ll/۫ܽܺ;Ll/۟ܺܺ;Ll/۟ܺܺ;Ll/۟ܺܺ;)V
    .locals 4

    const/4 v0, 0x3

    .line 232
    invoke-virtual {p0, p1, v0}, Ll/֡ᩳܺ;->ۧ(Ll/۫ܽܺ;I)V

    .line 236
    iget-object p1, p0, Ll/֡ᩳܺ;->ۧ:[Ll/֫ۖܺ;

    const/4 v0, 0x0

    aget-object p1, p1, v0

    invoke-static {p2, p1}, Ll/᩺ۤۡ;->֫(Ll/֫ۖܺ;Ll/֫ۖܺ;)Z

    move-result p1

    const/4 v1, 0x0

    const-string v2, " but found "

    const-string v3, "expected type "

    if-eqz p1, :cond_2

    .line 241
    iget-object p1, p0, Ll/֡ᩳܺ;->ۧ:[Ll/֫ۖܺ;

    const/4 p2, 0x1

    aget-object p1, p1, p2

    invoke-static {p3, p1}, Ll/᩺ۤۡ;->֫(Ll/֫ۖܺ;Ll/֫ۖܺ;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 246
    iget-object p1, p0, Ll/֡ᩳܺ;->ۧ:[Ll/֫ۖܺ;

    const/4 p2, 0x2

    aget-object p1, p1, p2

    invoke-static {p4, p1}, Ll/᩺ۤۡ;->֫(Ll/֫ۖܺ;Ll/֫ۖܺ;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 247
    :cond_0
    new-instance p1, Ll/ۖᩳܺ;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4}, Ll/۟ܺܺ;->֫()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p4, p0, Ll/֡ᩳܺ;->ۧ:[Ll/֫ۖܺ;

    aget-object p2, p4, p2

    .line 248
    invoke-interface {p2}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object p2

    invoke-virtual {p2}, Ll/۟ܺܺ;->֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 60
    invoke-direct {p1, p2, v1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 248
    throw p1

    .line 242
    :cond_1
    new-instance p1, Ll/ۖᩳܺ;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Ll/۟ܺܺ;->֫()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Ll/֡ᩳܺ;->ۧ:[Ll/֫ۖܺ;

    aget-object p2, p3, p2

    .line 243
    invoke-interface {p2}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object p2

    invoke-virtual {p2}, Ll/۟ܺܺ;->֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 60
    invoke-direct {p1, p2, v1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 243
    throw p1

    .line 237
    :cond_2
    new-instance p1, Ll/ۖᩳܺ;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ll/۟ܺܺ;->֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Ll/֡ᩳܺ;->ۧ:[Ll/֫ۖܺ;

    aget-object p2, p2, v0

    .line 238
    invoke-interface {p2}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object p2

    invoke-virtual {p2}, Ll/۟ܺܺ;->֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 60
    invoke-direct {p1, p2, v1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 238
    throw p1
.end method

.method public final ֫(Ll/۫ܽܺ;Ll/᩺ܺܺ;)V
    .locals 4

    .line 175
    invoke-virtual {p2}, Ll/᩺ܺܺ;->ۘ()Ll/ܰܺܺ;

    move-result-object p2

    .line 176
    invoke-virtual {p2}, Ll/ܿᩴܺ;->size()I

    move-result v0

    .line 179
    invoke-virtual {p0, p1, v0}, Ll/֡ᩳܺ;->ۧ(Ll/۫ܽܺ;I)V

    const/4 p1, 0x0

    :goto_0
    if-ge p1, v0, :cond_1

    .line 184
    invoke-virtual {p2, p1}, Ll/ܿᩴܺ;->getType(I)Ll/۟ܺܺ;

    move-result-object v1

    iget-object v2, p0, Ll/֡ᩳܺ;->ۧ:[Ll/֫ۖܺ;

    aget-object v2, v2, p1

    invoke-static {v1, v2}, Ll/᩺ۤۡ;->֫(Ll/֫ۖܺ;Ll/֫ۖܺ;)Z

    move-result v1

    if-eqz v1, :cond_0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 185
    :cond_0
    new-instance v1, Ll/ۖᩳܺ;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "at stack depth "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v0, p1

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", expected type "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    invoke-virtual {p2, p1}, Ll/ܿᩴܺ;->getType(I)Ll/۟ܺܺ;

    move-result-object p2

    invoke-virtual {p2}, Ll/۟ܺܺ;->֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " but found "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Ll/֡ᩳܺ;->ۧ:[Ll/֫ۖܺ;

    aget-object p1, p2, p1

    .line 187
    invoke-interface {p1}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/۟ܺܺ;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    .line 60
    invoke-direct {v1, p1, p2}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 187
    throw v1

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ܰۡܺ;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 296
    iput-object p1, p0, Ll/֡ᩳܺ;->ᩳ:Ll/ܰۡܺ;

    return-void

    .line 293
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "cst == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/᩵ᩳܺ;)V
    .locals 0

    .line 316
    iput-object p1, p0, Ll/֡ᩳܺ;->ܽ:Ll/᩵ᩳܺ;

    return-void
.end method

.method public final ۜ()Ll/᩺ܺܺ;
    .locals 1

    .line 128
    iget-object v0, p0, Ll/֡ᩳܺ;->ܺ:Ll/᩺ܺܺ;

    return-object v0
.end method

.method public final ۢ()I
    .locals 3

    .line 556
    iget v0, p0, Ll/֡ᩳܺ;->ۖ:I

    if-ltz v0, :cond_0

    return v0

    .line 557
    :cond_0
    new-instance v0, Ll/ۖᩳܺ;

    const-string v1, "results never set"

    const/4 v2, 0x0

    .line 60
    invoke-direct {v0, v1, v2}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 557
    throw v0
.end method

.method public final ۧ()V
    .locals 3

    const/4 v0, 0x0

    .line 136
    iput v0, p0, Ll/֡ᩳܺ;->֫:I

    const/4 v1, 0x0

    .line 137
    iput-object v1, p0, Ll/֡ᩳܺ;->ۜ:Ll/۟ܺܺ;

    .line 138
    iput v0, p0, Ll/֡ᩳܺ;->ܳ:I

    .line 139
    iput-object v1, p0, Ll/֡ᩳܺ;->ᩳ:Ll/ܰۡܺ;

    .line 140
    iput v0, p0, Ll/֡ᩳܺ;->᩻:I

    .line 141
    iput-object v1, p0, Ll/֡ᩳܺ;->ܽ:Ll/᩵ᩳܺ;

    .line 142
    iput-object v1, p0, Ll/֡ᩳܺ;->ܿ:Ljava/util/ArrayList;

    const/4 v2, -0x1

    .line 143
    iput v2, p0, Ll/֡ᩳܺ;->᩷:I

    .line 144
    iput-boolean v0, p0, Ll/֡ᩳܺ;->ۢ:Z

    .line 145
    iput-object v1, p0, Ll/֡ᩳܺ;->ۡ:Ll/᩸ۡܺ;

    .line 146
    iput v2, p0, Ll/֡ᩳܺ;->ۖ:I

    return-void
.end method

.method public final ۧ(I)V
    .locals 0

    .line 284
    iput p1, p0, Ll/֡ᩳܺ;->ܳ:I

    return-void
.end method

.method public final ۧ(Ll/۫ܽܺ;I)V
    .locals 3

    .line 154
    invoke-virtual {p1}, Ll/۫ܽܺ;->ܽ()Ll/۬ܽܺ;

    move-result-object p1

    .line 156
    invoke-virtual {p0}, Ll/֡ᩳܺ;->ۧ()V

    .line 158
    iget-object v0, p0, Ll/֡ᩳܺ;->ۧ:[Ll/֫ۖܺ;

    array-length v0, v0

    if-le p2, v0, :cond_0

    add-int/lit8 v0, p2, 0xa

    .line 160
    new-array v0, v0, [Ll/֫ۖܺ;

    iput-object v0, p0, Ll/֡ᩳܺ;->ۧ:[Ll/֫ۖܺ;

    :cond_0
    add-int/lit8 v0, p2, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 164
    iget-object v1, p0, Ll/֡ᩳܺ;->ۧ:[Ll/֫ۖܺ;

    invoke-virtual {p1}, Ll/۬ܽܺ;->۠()Ll/֫ۖܺ;

    move-result-object v2

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 167
    :cond_1
    iput p2, p0, Ll/֡ᩳܺ;->֫:I

    return-void
.end method

.method public final ۧ(Z)V
    .locals 0

    .line 268
    iput-boolean p1, p0, Ll/֡ᩳܺ;->ۢ:Z

    return-void
.end method

.method public final ܳ()Ljava/util/ArrayList;
    .locals 1

    .line 430
    iget-object v0, p0, Ll/֡ᩳܺ;->ܿ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ܽ()Ll/᩵ᩳܺ;
    .locals 1

    .line 421
    iget-object v0, p0, Ll/֡ᩳܺ;->ܽ:Ll/᩵ᩳܺ;

    return-object v0
.end method

.method public final ܽ(I)V
    .locals 0

    .line 304
    iput p1, p0, Ll/֡ᩳܺ;->᩻:I

    return-void
.end method

.method public final ܿ()I
    .locals 1

    .line 394
    iget v0, p0, Ll/֡ᩳܺ;->ܳ:I

    return v0
.end method

.method public final ᩳ()Ll/ܰۡܺ;
    .locals 1

    .line 403
    iget-object v0, p0, Ll/֡ᩳܺ;->ᩳ:Ll/ܰۡܺ;

    return-object v0
.end method

.method public final ᩷()Ll/֫ۖܺ;
    .locals 2

    .line 586
    iget v0, p0, Ll/֡ᩳܺ;->ۖ:I

    if-lez v0, :cond_0

    .line 591
    :try_start_0
    iget-object v0, p0, Ll/֡ᩳܺ;->ۘ:[Ll/֫ۖܺ;

    const/4 v1, 0x0

    aget-object v0, v0, v1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 594
    :catch_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "n < 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 587
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "n >= resultCount"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩻()I
    .locals 1

    .line 440
    iget v0, p0, Ll/֡ᩳܺ;->᩷:I

    return v0
.end method
