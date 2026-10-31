.class public final Ll/۬ۢᩳ;
.super Ljava/lang/Object;
.source "C1WV"


# instance fields
.field public ֫:Ll/ܿۡᩳ;

.field public ۧ:Ljava/lang/Integer;

.field public ܽ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ll/ܿۡᩳ;)V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/۬ۢᩳ;->ܽ:Ljava/util/HashMap;

    .line 39
    iput-object p1, p0, Ll/۬ۢᩳ;->֫:Ll/ܿۡᩳ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/util/ArrayList;I)[Ljava/lang/Object;
    .locals 10

    .line 43
    new-array p2, p2, [Ljava/lang/Object;

    .line 44
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺֫ۚ;

    .line 45
    invoke-interface {v0}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v1

    .line 46
    sget-object v2, Ll/ۗۢᩳ;->֫:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const-string v3, "[S"

    const/4 v4, 0x0

    const-string v5, "I"

    iget-object v6, p0, Ll/۬ۢᩳ;->֫:Ll/ܿۡᩳ;

    const/4 v7, 0x1

    iget-object v8, p0, Ll/۬ۢᩳ;->ܽ:Ljava/util/HashMap;

    packed-switch v2, :pswitch_data_0

    .line 516
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    iget-object p2, v1, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 182
    :pswitch_0
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    move-object v2, v0

    check-cast v2, Ll/᩻ۧۚ;

    invoke-interface {v2}, Ll/᩻ۧۚ;->ܶ()I

    move-result v2

    .line 164
    check-cast v0, Ll/ۧۧۚ;

    invoke-interface {v0}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v0

    .line 495
    check-cast v0, Ll/᩸ܽۚ;

    invoke-interface {v0}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object v0

    .line 496
    aget-object v2, p2, v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 497
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    const/4 v4, 0x3

    goto :goto_2

    :sswitch_1
    const-string v3, "[I"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v4, 0x2

    goto :goto_2

    :sswitch_2
    const-string v3, "[C"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    const/4 v4, 0x1

    goto :goto_2

    :sswitch_3
    const-string v3, "[B"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :goto_1
    const/4 v4, -0x1

    :cond_3
    :goto_2
    packed-switch v4, :pswitch_data_1

    .line 511
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "new-array "

    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 505
    :pswitch_1
    new-array v0, v2, [S

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 508
    :pswitch_2
    new-array v0, v2, [I

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 502
    :pswitch_3
    new-array v0, v2, [C

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 499
    :pswitch_4
    new-array v0, v2, [B

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 470
    :pswitch_5
    instance-of v2, v0, Ll/ܽۧۚ;

    if-eqz v2, :cond_4

    .line 471
    move-object v2, v0

    check-cast v2, Ll/ܽۧۚ;

    invoke-interface {v2}, Ll/ܽۧۚ;->ᩴ()I

    move-result v2

    goto :goto_3

    .line 473
    :cond_4
    move-object v2, v0

    check-cast v2, Ll/ۤ֫ۚ;

    invoke-interface {v2}, Ll/ۤ֫ۚ;->ᩳ()I

    move-result v2

    .line 164
    :goto_3
    check-cast v0, Ll/ۧۧۚ;

    invoke-interface {v0}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v0

    .line 475
    check-cast v0, Ll/ۚܽۚ;

    .line 476
    invoke-interface {v0}, Ll/ۚܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 477
    invoke-interface {v0}, Ll/ۚܽۚ;->ۘ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ne v3, v7, :cond_6

    aget-object v3, p2, v2

    instance-of v3, v3, Ljava/lang/String;

    if-eqz v3, :cond_6

    .line 479
    new-instance v1, Ll/ۤۜܽ;

    invoke-direct {v1}, Ll/ۤۜܽ;-><init>()V

    .line 480
    invoke-interface {v0}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/᩻ۡᩳ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 481
    invoke-interface {v0}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 482
    invoke-virtual {v1, v7}, Ll/ۤۜܽ;->writeByte(I)V

    .line 483
    invoke-interface {v0}, Ll/ۚܽۚ;->ۘ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    const-string v3, "Ljava/lang/String;"

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/16 v0, 0x8

    goto :goto_4

    :cond_5
    const/16 v0, 0x9

    :goto_4
    invoke-virtual {v1, v0}, Ll/ۤۜܽ;->writeByte(I)V

    .line 485
    aget-object v0, p2, v2

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 486
    iget-object v0, v6, Ll/ܿۡᩳ;->ܽ:Ll/ۙۡᩳ;

    invoke-virtual {v1}, Ll/ۤۜܽ;->᩻()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۙۡᩳ;->֫([B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ll/۬ۢᩳ;->ۧ:Ljava/lang/Integer;

    goto/16 :goto_0

    .line 488
    :cond_6
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v1, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 182
    :pswitch_6
    check-cast v0, Ll/֫ۧۚ;

    invoke-interface {v0}, Ll/֫ۧۚ;->֫()I

    move-result v0

    .line 464
    iget-object v1, p0, Ll/۬ۢᩳ;->ۧ:Ljava/lang/Integer;

    aput-object v1, p2, v0

    goto/16 :goto_0

    .line 182
    :pswitch_7
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    check-cast v0, Ll/᩻ۧۚ;

    invoke-interface {v0}, Ll/᩻ۧۚ;->ܶ()I

    move-result v0

    .line 458
    aget-object v0, p2, v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_8
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    move-object v2, v0

    check-cast v2, Ll/᩻ۧۚ;

    invoke-interface {v2}, Ll/᩻ۧۚ;->ܶ()I

    move-result v2

    .line 190
    check-cast v0, Ll/ܳۧۚ;

    invoke-interface {v0}, Ll/ܳۧۚ;->ᩳ()I

    move-result v0

    .line 445
    aget-object v2, p2, v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 446
    aget-object v0, p2, v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    xor-int/2addr v0, v2

    .line 447
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_9
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    move-object v2, v0

    check-cast v2, Ll/᩻ۧۚ;

    invoke-interface {v2}, Ll/᩻ۧۚ;->ܶ()I

    move-result v2

    .line 190
    check-cast v0, Ll/ܳۧۚ;

    invoke-interface {v0}, Ll/ܳۧۚ;->ᩳ()I

    move-result v0

    .line 433
    aget-object v2, p2, v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 434
    aget-object v0, p2, v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    or-int/2addr v0, v2

    .line 435
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_a
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    move-object v2, v0

    check-cast v2, Ll/᩻ۧۚ;

    invoke-interface {v2}, Ll/᩻ۧۚ;->ܶ()I

    move-result v2

    .line 190
    check-cast v0, Ll/ܳۧۚ;

    invoke-interface {v0}, Ll/ܳۧۚ;->ᩳ()I

    move-result v0

    .line 421
    aget-object v2, p2, v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 422
    aget-object v0, p2, v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    and-int/2addr v0, v2

    .line 423
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_b
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    move-object v2, v0

    check-cast v2, Ll/᩻ۧۚ;

    invoke-interface {v2}, Ll/᩻ۧۚ;->ܶ()I

    move-result v2

    .line 190
    check-cast v0, Ll/ܳۧۚ;

    invoke-interface {v0}, Ll/ܳۧۚ;->ᩳ()I

    move-result v0

    .line 409
    aget-object v2, p2, v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 410
    aget-object v0, p2, v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 411
    rem-int/2addr v2, v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_c
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    move-object v2, v0

    check-cast v2, Ll/᩻ۧۚ;

    invoke-interface {v2}, Ll/᩻ۧۚ;->ܶ()I

    move-result v2

    .line 190
    check-cast v0, Ll/ܳۧۚ;

    invoke-interface {v0}, Ll/ܳۧۚ;->ᩳ()I

    move-result v0

    .line 397
    aget-object v2, p2, v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 398
    aget-object v0, p2, v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 399
    div-int/2addr v2, v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_d
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    move-object v2, v0

    check-cast v2, Ll/᩻ۧۚ;

    invoke-interface {v2}, Ll/᩻ۧۚ;->ܶ()I

    move-result v2

    .line 190
    check-cast v0, Ll/ܳۧۚ;

    invoke-interface {v0}, Ll/ܳۧۚ;->ᩳ()I

    move-result v0

    .line 385
    aget-object v2, p2, v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 386
    aget-object v0, p2, v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    mul-int v0, v0, v2

    .line 387
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_e
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    move-object v2, v0

    check-cast v2, Ll/᩻ۧۚ;

    invoke-interface {v2}, Ll/᩻ۧۚ;->ܶ()I

    move-result v2

    .line 190
    check-cast v0, Ll/ܳۧۚ;

    invoke-interface {v0}, Ll/ܳۧۚ;->ᩳ()I

    move-result v0

    .line 373
    aget-object v2, p2, v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 374
    aget-object v0, p2, v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    sub-int/2addr v2, v0

    .line 375
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_f
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    move-object v2, v0

    check-cast v2, Ll/᩻ۧۚ;

    invoke-interface {v2}, Ll/᩻ۧۚ;->ܶ()I

    move-result v2

    .line 190
    check-cast v0, Ll/ܳۧۚ;

    invoke-interface {v0}, Ll/ܳۧۚ;->ᩳ()I

    move-result v0

    .line 361
    aget-object v2, p2, v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 362
    aget-object v0, p2, v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    add-int/2addr v0, v2

    .line 363
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_10
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    check-cast v0, Ll/᩻ۧۚ;

    invoke-interface {v0}, Ll/᩻ۧۚ;->ܶ()I

    move-result v0

    .line 348
    aget-object v2, p2, v1

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 349
    aget-object v0, p2, v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    xor-int/2addr v0, v2

    .line 350
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_11
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    check-cast v0, Ll/᩻ۧۚ;

    invoke-interface {v0}, Ll/᩻ۧۚ;->ܶ()I

    move-result v0

    .line 337
    aget-object v2, p2, v1

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 338
    aget-object v0, p2, v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    or-int/2addr v0, v2

    .line 339
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_12
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    check-cast v0, Ll/᩻ۧۚ;

    invoke-interface {v0}, Ll/᩻ۧۚ;->ܶ()I

    move-result v0

    .line 326
    aget-object v2, p2, v1

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 327
    aget-object v0, p2, v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    and-int/2addr v0, v2

    .line 328
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_13
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    check-cast v0, Ll/᩻ۧۚ;

    invoke-interface {v0}, Ll/᩻ۧۚ;->ܶ()I

    move-result v0

    .line 315
    aget-object v2, p2, v1

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 316
    aget-object v0, p2, v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 317
    rem-int/2addr v2, v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_14
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    check-cast v0, Ll/᩻ۧۚ;

    invoke-interface {v0}, Ll/᩻ۧۚ;->ܶ()I

    move-result v0

    .line 304
    aget-object v2, p2, v1

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 305
    aget-object v0, p2, v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 306
    div-int/2addr v2, v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_15
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    check-cast v0, Ll/᩻ۧۚ;

    invoke-interface {v0}, Ll/᩻ۧۚ;->ܶ()I

    move-result v0

    .line 293
    aget-object v2, p2, v1

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 294
    aget-object v0, p2, v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    mul-int v0, v0, v2

    .line 295
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_16
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    check-cast v0, Ll/᩻ۧۚ;

    invoke-interface {v0}, Ll/᩻ۧۚ;->ܶ()I

    move-result v0

    .line 282
    aget-object v2, p2, v1

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 283
    aget-object v0, p2, v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    sub-int/2addr v2, v0

    .line 284
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_17
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    check-cast v0, Ll/᩻ۧۚ;

    invoke-interface {v0}, Ll/᩻ۧۚ;->ܶ()I

    move-result v0

    .line 271
    aget-object v2, p2, v1

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 272
    aget-object v0, p2, v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    add-int/2addr v0, v2

    .line 273
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_18
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    move-object v2, v0

    check-cast v2, Ll/᩻ۧۚ;

    invoke-interface {v2}, Ll/᩻ۧۚ;->ܶ()I

    move-result v2

    .line 259
    check-cast v0, Ll/ܰ֫ۚ;

    invoke-interface {v0}, Ll/ܰ֫ۚ;->ۡ()I

    move-result v0

    .line 260
    aget-object v2, p2, v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    ushr-int v0, v2, v0

    .line 261
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_19
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    move-object v2, v0

    check-cast v2, Ll/᩻ۧۚ;

    invoke-interface {v2}, Ll/᩻ۧۚ;->ܶ()I

    move-result v2

    .line 248
    check-cast v0, Ll/ܰ֫ۚ;

    invoke-interface {v0}, Ll/ܰ֫ۚ;->ۡ()I

    move-result v0

    .line 249
    aget-object v2, p2, v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    shr-int v0, v2, v0

    .line 250
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_1a
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    move-object v2, v0

    check-cast v2, Ll/᩻ۧۚ;

    invoke-interface {v2}, Ll/᩻ۧۚ;->ܶ()I

    move-result v2

    .line 237
    check-cast v0, Ll/ܰ֫ۚ;

    invoke-interface {v0}, Ll/ܰ֫ۚ;->ۡ()I

    move-result v0

    .line 238
    aget-object v2, p2, v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    shl-int v0, v2, v0

    .line 239
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_1b
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    move-object v2, v0

    check-cast v2, Ll/᩻ۧۚ;

    invoke-interface {v2}, Ll/᩻ۧۚ;->ܶ()I

    move-result v2

    .line 226
    check-cast v0, Ll/ܰ֫ۚ;

    invoke-interface {v0}, Ll/ܰ֫ۚ;->ۡ()I

    move-result v0

    .line 227
    aget-object v2, p2, v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    xor-int/2addr v0, v2

    .line 228
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_1c
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    move-object v2, v0

    check-cast v2, Ll/᩻ۧۚ;

    invoke-interface {v2}, Ll/᩻ۧۚ;->ܶ()I

    move-result v2

    .line 214
    check-cast v0, Ll/ܰ֫ۚ;

    invoke-interface {v0}, Ll/ܰ֫ۚ;->ۡ()I

    move-result v0

    .line 215
    aget-object v2, p2, v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    or-int/2addr v0, v2

    .line 216
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_1d
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    move-object v2, v0

    check-cast v2, Ll/᩻ۧۚ;

    invoke-interface {v2}, Ll/᩻ۧۚ;->ܶ()I

    move-result v2

    .line 202
    check-cast v0, Ll/ܰ֫ۚ;

    invoke-interface {v0}, Ll/ܰ֫ۚ;->ۡ()I

    move-result v0

    .line 203
    aget-object v2, p2, v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/2addr v0, v2

    .line 204
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_1e
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    move-object v2, v0

    check-cast v2, Ll/᩻ۧۚ;

    invoke-interface {v2}, Ll/᩻ۧۚ;->ܶ()I

    move-result v2

    .line 190
    check-cast v0, Ll/ܰ֫ۚ;

    invoke-interface {v0}, Ll/ܰ֫ۚ;->ۡ()I

    move-result v0

    .line 191
    aget-object v2, p2, v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 192
    rem-int/2addr v2, v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_1f
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    move-object v2, v0

    check-cast v2, Ll/᩻ۧۚ;

    invoke-interface {v2}, Ll/᩻ۧۚ;->ܶ()I

    move-result v2

    .line 178
    check-cast v0, Ll/ܰ֫ۚ;

    invoke-interface {v0}, Ll/ܰ֫ۚ;->ۡ()I

    move-result v0

    .line 179
    aget-object v2, p2, v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 180
    div-int/2addr v2, v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_20
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    move-object v2, v0

    check-cast v2, Ll/᩻ۧۚ;

    invoke-interface {v2}, Ll/᩻ۧۚ;->ܶ()I

    move-result v2

    .line 166
    check-cast v0, Ll/ܰ֫ۚ;

    invoke-interface {v0}, Ll/ܰ֫ۚ;->ۡ()I

    move-result v0

    .line 167
    aget-object v2, p2, v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    mul-int v2, v2, v0

    .line 168
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_21
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    move-object v2, v0

    check-cast v2, Ll/᩻ۧۚ;

    invoke-interface {v2}, Ll/᩻ۧۚ;->ܶ()I

    move-result v2

    .line 154
    check-cast v0, Ll/ܰ֫ۚ;

    invoke-interface {v0}, Ll/ܰ֫ۚ;->ۡ()I

    move-result v0

    .line 155
    aget-object v2, p2, v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    sub-int/2addr v2, v0

    .line 156
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_22
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    move-object v2, v0

    check-cast v2, Ll/᩻ۧۚ;

    invoke-interface {v2}, Ll/᩻ۧۚ;->ܶ()I

    move-result v2

    .line 142
    check-cast v0, Ll/ܰ֫ۚ;

    invoke-interface {v0}, Ll/ܰ֫ۚ;->ۡ()I

    move-result v0

    .line 143
    aget-object v2, p2, v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    add-int/2addr v2, v0

    .line 144
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_23
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 186
    move-object v2, v0

    check-cast v2, Ll/᩻ۧۚ;

    invoke-interface {v2}, Ll/᩻ۧۚ;->ܶ()I

    move-result v2

    .line 190
    check-cast v0, Ll/ܳۧۚ;

    invoke-interface {v0}, Ll/ܳۧۚ;->ᩳ()I

    move-result v0

    .line 129
    aget-object v2, p2, v2

    .line 130
    aget-object v0, p2, v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 131
    invoke-static {v2, v0}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 164
    :pswitch_24
    move-object v1, v0

    check-cast v1, Ll/ۧۧۚ;

    invoke-interface {v1}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v1

    .line 105
    check-cast v1, Ll/ᩴܽۚ;

    .line 106
    invoke-interface {v1}, Ll/ᩴܽۚ;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 109
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 111
    invoke-virtual {v8, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 112
    invoke-virtual {v8, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_5

    .line 114
    :cond_7
    invoke-interface {v1}, Ll/ᩴܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/᩻ۡᩳ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 115
    iget-object v4, v6, Ll/ܿۡᩳ;->ܽ:Ll/ۙۡᩳ;

    invoke-interface {v1}, Ll/ᩴܽۚ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v3, v1}, Ll/ۙۡᩳ;->᩻(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 116
    invoke-virtual {v8, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    :goto_5
    check-cast v0, Ll/֫ۧۚ;

    invoke-interface {v0}, Ll/֫ۧۚ;->֫()I

    move-result v0

    .line 119
    aput-object v1, p2, v0

    goto/16 :goto_0

    .line 107
    :cond_8
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "sget "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v1}, Ll/ᩴܽۚ;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 164
    :pswitch_25
    move-object v1, v0

    check-cast v1, Ll/ۧۧۚ;

    invoke-interface {v1}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v1

    .line 84
    check-cast v1, Ll/ᩴܽۚ;

    .line 85
    invoke-interface {v1}, Ll/ᩴܽۚ;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 88
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 90
    invoke-virtual {v8, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    .line 91
    invoke-virtual {v8, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_6

    .line 93
    :cond_9
    invoke-interface {v1}, Ll/ᩴܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/᩻ۡᩳ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 94
    iget-object v4, v6, Ll/ܿۡᩳ;->ܽ:Ll/ۙۡᩳ;

    invoke-interface {v1}, Ll/ᩴܽۚ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v3, v1}, Ll/ۙۡᩳ;->᩷(Ljava/lang/String;Ljava/lang/String;)[I

    move-result-object v1

    .line 95
    invoke-virtual {v8, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    :goto_6
    check-cast v0, Ll/֫ۧۚ;

    invoke-interface {v0}, Ll/֫ۧۚ;->֫()I

    move-result v0

    .line 98
    aput-object v1, p2, v0

    goto/16 :goto_0

    .line 86
    :cond_a
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "sget-object "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v1}, Ll/ᩴܽۚ;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 182
    :pswitch_26
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 75
    check-cast v0, Ll/ۢۧۚ;

    invoke-interface {v0}, Ll/ۢۧۚ;->᩸()J

    move-result-wide v2

    const-wide v4, 0xffffffffL

    and-long v8, v2, v4

    long-to-int v0, v8

    .line 76
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    add-int/2addr v1, v7

    const/16 v0, 0x20

    ushr-long/2addr v2, v0

    and-long/2addr v2, v4

    long-to-int v0, v2

    .line 77
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_27
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 63
    check-cast v0, Ll/ܰ֫ۚ;

    invoke-interface {v0}, Ll/ܰ֫ۚ;->ۡ()I

    move-result v0

    .line 64
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v1

    goto/16 :goto_0

    .line 182
    :pswitch_28
    move-object v1, v0

    check-cast v1, Ll/֫ۧۚ;

    invoke-interface {v1}, Ll/֫ۧۚ;->֫()I

    move-result v1

    .line 164
    check-cast v0, Ll/ۧۧۚ;

    invoke-interface {v0}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v0

    .line 50
    check-cast v0, Ll/ܶܽۚ;

    .line 51
    invoke-interface {v0}, Ll/ܶܽۚ;->getString()Ljava/lang/String;

    move-result-object v0

    .line 52
    aput-object v0, p2, v1

    goto/16 :goto_0

    :cond_b
    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_28
        :pswitch_28
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_22
        :pswitch_21
        :pswitch_21
        :pswitch_20
        :pswitch_20
        :pswitch_1f
        :pswitch_1f
        :pswitch_1e
        :pswitch_1e
        :pswitch_1d
        :pswitch_1d
        :pswitch_1c
        :pswitch_1c
        :pswitch_1b
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
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
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xb47 -> :sswitch_3
        0xb48 -> :sswitch_2
        0xb4e -> :sswitch_1
        0xb58 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
