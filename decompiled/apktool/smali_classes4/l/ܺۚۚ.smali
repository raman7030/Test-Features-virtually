.class public final enum Ll/ܺۚۚ;
.super Ll/᩺ۚۚ;
.source "UBJ4"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "InSelect"

    const/16 v1, 0xf

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ܺۚۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1401
    invoke-direct {p0, p1, p2, v0}, Ll/᩺ۚۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method

.method private ۧ(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z
    .locals 0

    .line 1493
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public ֫(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z
    .locals 9

    .line 1403
    sget-object v0, Ll/᩸ۚۚ;->֫:[I

    iget-object v1, p1, Ll/ۖ֨ۚ;->ܽ:Ll/ܺ֨ۚ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const-string v2, "template"

    const-string v3, "html"

    const-string v4, "select"

    const/4 v5, 0x0

    const-string v6, "optgroup"

    const-string v7, "option"

    packed-switch v0, :pswitch_data_0

    .line 1487
    invoke-direct {p0, p1, p2}, Ll/ܺۚۚ;->ۧ(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1

    .line 1483
    :pswitch_0
    invoke-virtual {p2, v3}, Ll/֡ܶۚ;->֫(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_14

    .line 1484
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    goto/16 :goto_2

    .line 486
    :pswitch_1
    check-cast p1, Ll/ܿ֨ۚ;

    .line 1406
    invoke-virtual {p1}, Ll/ܿ֨ۚ;->᩷()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ll/᩺ۚۚ;->ۧ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1407
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    return v5

    .line 1410
    :cond_0
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ܿ֨ۚ;)V

    goto/16 :goto_2

    .line 466
    :pswitch_2
    move-object v0, p1

    check-cast v0, Ll/᩷֨ۚ;

    .line 194
    iget-object v0, v0, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    .line 1452
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v8, -0x1

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v8, 0x3

    goto :goto_0

    :sswitch_1
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v8, 0x2

    goto :goto_0

    :sswitch_2
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    const/4 v8, 0x1

    goto :goto_0

    :sswitch_3
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_0

    :cond_4
    const/4 v8, 0x0

    :goto_0
    packed-switch v8, :pswitch_data_1

    .line 1479
    invoke-direct {p0, p1, p2}, Ll/ܺۚۚ;->ۧ(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1

    .line 1454
    :pswitch_3
    invoke-virtual {p2, v7}, Ll/֡ܶۚ;->֫(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {p2}, Ll/֡ܶۚ;->֫()Ll/᩶֡ۚ;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/᩶֡ۚ;)Ll/᩶֡ۚ;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p2}, Ll/֡ܶۚ;->֫()Ll/᩶֡ۚ;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/᩶֡ۚ;)Ll/᩶֡ۚ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩶֡ۚ;->ᩳ֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 1455
    invoke-virtual {p2, v7}, Ll/֡ܶۚ;->ܽ(Ljava/lang/String;)Z

    .line 1456
    :cond_5
    invoke-virtual {p2, v6}, Ll/֡ܶۚ;->֫(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 1457
    invoke-virtual {p2}, Ll/ܿۚۚ;->ۚ()V

    goto/16 :goto_2

    .line 1459
    :cond_6
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    goto/16 :goto_2

    .line 1468
    :pswitch_4
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ۡ(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_7

    .line 1469
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    return v5

    .line 1472
    :cond_7
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ۘ(Ljava/lang/String;)V

    .line 1473
    invoke-virtual {p2}, Ll/ܿۚۚ;->᩸()Z

    goto/16 :goto_2

    .line 1462
    :pswitch_5
    invoke-virtual {p2, v7}, Ll/֡ܶۚ;->֫(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 1463
    invoke-virtual {p2}, Ll/ܿۚۚ;->ۚ()V

    goto/16 :goto_2

    .line 1465
    :cond_8
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    goto/16 :goto_2

    .line 1477
    :pswitch_6
    sget-object v0, Ll/᩺ۚۚ;->ۧ֫:Ll/᩺ۚۚ;

    .line 171
    iput-object p1, p2, Ll/֡ܶۚ;->ۧ:Ll/ۖ֨ۚ;

    .line 172
    invoke-virtual {v0, p1, p2}, Ll/᩺ۚۚ;->֫(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1

    .line 458
    :pswitch_7
    move-object v0, p1

    check-cast v0, Ll/ۢ֨ۚ;

    .line 194
    iget-object v8, v0, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    .line 1422
    invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    .line 1423
    sget-object p1, Ll/᩺ۚۚ;->ۨ:Ll/᩺ۚۚ;

    .line 171
    iput-object v0, p2, Ll/֡ܶۚ;->ۧ:Ll/ۖ֨ۚ;

    .line 172
    invoke-virtual {p1, v0, p2}, Ll/᩺ۚۚ;->֫(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1

    .line 1424
    :cond_9
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 1425
    invoke-virtual {p2, v7}, Ll/֡ܶۚ;->֫(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 1426
    invoke-virtual {p2, v7}, Ll/֡ܶۚ;->ܽ(Ljava/lang/String;)Z

    .line 1427
    :cond_a
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->֫(Ll/ۢ֨ۚ;)Ll/᩶֡ۚ;

    goto :goto_2

    .line 1428
    :cond_b
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_e

    .line 1429
    invoke-virtual {p2, v7}, Ll/֡ܶۚ;->֫(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_c

    .line 1430
    invoke-virtual {p2, v7}, Ll/֡ܶۚ;->ܽ(Ljava/lang/String;)Z

    .line 1431
    :cond_c
    invoke-virtual {p2, v6}, Ll/֡ܶۚ;->֫(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_d

    .line 1432
    invoke-virtual {p2, v6}, Ll/֡ܶۚ;->ܽ(Ljava/lang/String;)Z

    .line 1433
    :cond_d
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->֫(Ll/ۢ֨ۚ;)Ll/᩶֡ۚ;

    goto :goto_2

    .line 1434
    :cond_e
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    .line 1435
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    .line 1436
    invoke-virtual {p2, v4}, Ll/֡ܶۚ;->ܽ(Ljava/lang/String;)Z

    move-result p1

    return p1

    .line 1437
    :cond_f
    sget-object v1, Ll/ۨۚۚ;->۬:[Ljava/lang/String;

    invoke-static {v8, v1}, Ll/᩷֡ۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_11

    .line 1438
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    .line 1439
    invoke-virtual {p2, v4}, Ll/ܿۚۚ;->ۡ(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_10

    return v5

    .line 1441
    :cond_10
    invoke-virtual {p2, v4}, Ll/֡ܶۚ;->ܽ(Ljava/lang/String;)Z

    .line 1442
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result p1

    return p1

    :cond_11
    const-string v0, "script"

    .line 1443
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    invoke-virtual {v8, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    goto :goto_1

    .line 1446
    :cond_12
    invoke-direct {p0, p1, p2}, Ll/ܺۚۚ;->ۧ(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1

    .line 1444
    :cond_13
    :goto_1
    sget-object v0, Ll/᩺ۚۚ;->ۧ֫:Ll/᩺ۚۚ;

    .line 171
    iput-object p1, p2, Ll/֡ܶۚ;->ۧ:Ll/ۖ֨ۚ;

    .line 172
    invoke-virtual {v0, p1, p2}, Ll/᩺ۚۚ;->֫(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1

    .line 1417
    :pswitch_8
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    return v5

    .line 474
    :pswitch_9
    check-cast p1, Ll/ܳ֨ۚ;

    .line 1414
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ܳ֨ۚ;)V

    :cond_14
    :goto_2
    return v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x4ec53386 -> :sswitch_3
        -0x3c35778b -> :sswitch_2
        -0x3600cb04 -> :sswitch_1
        -0x4d08054 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method
