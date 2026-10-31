.class public final Ll/ᩴ᩷ۖ;
.super Ljava/lang/Object;
.source "M9PM"

# interfaces
.implements Ll/᩷֡ۖ;


# static fields
.field public static final synthetic ֫:I

.field public static ۧ:Ll/ۖ᩷ۖ;

.field public static final ܽ:Ljava/util/HashSet;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    .line 40
    new-instance v0, Ll/ᩴ᩷ۖ;

    invoke-direct {v0}, Ll/ᩴ᩷ۖ;-><init>()V

    .line 49
    new-instance v0, Ljava/util/HashSet;

    const-string v8, "UnknownFields"

    const-string v9, "CachedSize"

    const-string v1, "Class"

    const-string v2, "DefaultInstanceForType"

    const-string v3, "ParserForType"

    const-string v4, "SerializedSize"

    const-string v5, "AllFields"

    const-string v6, "DescriptorForType"

    const-string v7, "InitializationErrorString"

    filled-new-array/range {v1 .. v9}, [Ljava/lang/String;

    move-result-object v1

    .line 51
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Ll/ᩴ᩷ۖ;->ܽ:Ljava/util/HashSet;

    .line 391
    new-instance v0, Ll/ۖ᩷ۖ;

    invoke-direct {v0}, Ll/ۖ᩷ۖ;-><init>()V

    sput-object v0, Ll/ᩴ᩷ۖ;->ۧ:Ll/ۖ᩷ۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 598
    invoke-static {p0, v0}, Ll/ᩴ᩷ۖ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 4

    .line 646
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    .line 648
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_4

    .line 649
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x5f

    if-ne v2, v3, :cond_0

    goto :goto_1

    .line 652
    :cond_0
    invoke-static {v2}, Ljava/lang/Character;->isDigit(C)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 653
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_1
    const/4 p1, 0x1

    goto :goto_2

    :cond_1
    if-eqz p1, :cond_2

    .line 656
    invoke-static {v2}, Ljava/lang/Character;->toUpperCase(C)C

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 p1, 0x0

    goto :goto_2

    :cond_2
    if-nez v1, :cond_3

    .line 659
    invoke-static {v2}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 661
    :cond_3
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 664
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ֫(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 0

    .line 38
    invoke-static {p0, p1}, Ll/ᩴ᩷ۖ;->ۧ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/֡ۖۖ;)Ll/֨ۘۖ;
    .locals 3

    .line 438
    sget-object v0, Ll/ۢ᩷ۖ;->ۧ:[I

    invoke-virtual {p0}, Ll/֡ۖۖ;->getType()Ll/᩵ۖۖ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 521
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported field type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/֡ۖۖ;->getType()Ll/᩵ۖۖ;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 516
    :pswitch_0
    invoke-virtual {p0}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-nez v0, :cond_0

    .line 517
    sget-object p0, Ll/֨ۘۖ;->᩷ۧ:Ll/֨ۘۖ;

    return-object p0

    .line 519
    :cond_0
    invoke-virtual {p0}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Ll/֨ۘۖ;->ۡۧ:Ll/֨ۘۖ;

    return-object p0

    :cond_1
    sget-object p0, Ll/֨ۘۖ;->ۢۧ:Ll/֨ۘۖ;

    return-object p0

    .line 511
    :pswitch_1
    invoke-virtual {p0}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-nez v0, :cond_2

    .line 512
    sget-object p0, Ll/֨ۘۖ;->ܳۧ:Ll/֨ۘۖ;

    return-object p0

    .line 514
    :cond_2
    invoke-virtual {p0}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result p0

    if-eqz p0, :cond_3

    sget-object p0, Ll/֨ۘۖ;->ۜۧ:Ll/֨ۘۖ;

    return-object p0

    :cond_3
    sget-object p0, Ll/֨ۘۖ;->᩻ۧ:Ll/֨ۘۖ;

    return-object p0

    .line 509
    :pswitch_2
    invoke-virtual {p0}, Ll/֡ۖۖ;->۟֫()Z

    move-result p0

    if-eqz p0, :cond_4

    sget-object p0, Ll/֨ۘۖ;->ܿۧ:Ll/֨ۘۖ;

    return-object p0

    :cond_4
    sget-object p0, Ll/֨ۘۖ;->ᩳۧ:Ll/֨ۘۖ;

    return-object p0

    .line 504
    :pswitch_3
    invoke-virtual {p0}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-nez v0, :cond_5

    .line 505
    sget-object p0, Ll/֨ۘۖ;->֫ۧ:Ll/֨ۘۖ;

    return-object p0

    .line 507
    :cond_5
    invoke-virtual {p0}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result p0

    if-eqz p0, :cond_6

    sget-object p0, Ll/֨ۘۖ;->ܽۧ:Ll/֨ۘۖ;

    return-object p0

    :cond_6
    sget-object p0, Ll/֨ۘۖ;->ۧۧ:Ll/֨ۘۖ;

    return-object p0

    .line 499
    :pswitch_4
    invoke-virtual {p0}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-nez v0, :cond_7

    .line 500
    sget-object p0, Ll/֨ۘۖ;->᩺֫:Ll/֨ۘۖ;

    return-object p0

    .line 502
    :cond_7
    invoke-virtual {p0}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result p0

    if-eqz p0, :cond_8

    sget-object p0, Ll/֨ۘۖ;->۟֫:Ll/֨ۘۖ;

    return-object p0

    :cond_8
    sget-object p0, Ll/֨ۘۖ;->ܰ֫:Ll/֨ۘۖ;

    return-object p0

    .line 494
    :pswitch_5
    invoke-virtual {p0}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-nez v0, :cond_9

    .line 495
    sget-object p0, Ll/֨ۘۖ;->ۤ֫:Ll/֨ۘۖ;

    return-object p0

    .line 497
    :cond_9
    invoke-virtual {p0}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result p0

    if-eqz p0, :cond_a

    sget-object p0, Ll/֨ۘۖ;->ۨ֫:Ll/֨ۘۖ;

    return-object p0

    :cond_a
    sget-object p0, Ll/֨ۘۖ;->ۛ֫:Ll/֨ۘۖ;

    return-object p0

    .line 489
    :pswitch_6
    invoke-virtual {p0}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-nez v0, :cond_b

    .line 490
    sget-object p0, Ll/֨ۘۖ;->ۗ֫:Ll/֨ۘۖ;

    return-object p0

    .line 492
    :cond_b
    invoke-virtual {p0}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result p0

    if-eqz p0, :cond_c

    sget-object p0, Ll/֨ۘۖ;->۫֫:Ll/֨ۘۖ;

    return-object p0

    :cond_c
    sget-object p0, Ll/֨ۘۖ;->۬֫:Ll/֨ۘۖ;

    return-object p0

    .line 484
    :pswitch_7
    invoke-virtual {p0}, Ll/֡ۖۖ;->۬()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 485
    sget-object p0, Ll/֨ۘۖ;->᩹֫:Ll/֨ۘۖ;

    return-object p0

    .line 487
    :cond_d
    invoke-virtual {p0}, Ll/֡ۖۖ;->۟֫()Z

    move-result p0

    if-eqz p0, :cond_e

    sget-object p0, Ll/֨ۘۖ;->ۙ֫:Ll/֨ۘۖ;

    return-object p0

    :cond_e
    sget-object p0, Ll/֨ۘۖ;->᩶֫:Ll/֨ۘۖ;

    return-object p0

    .line 479
    :pswitch_8
    invoke-virtual {p0}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-nez v0, :cond_f

    .line 480
    sget-object p0, Ll/֨ۘۖ;->۠֫:Ll/֨ۘۖ;

    return-object p0

    .line 482
    :cond_f
    invoke-virtual {p0}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result p0

    if-eqz p0, :cond_10

    sget-object p0, Ll/֨ۘۖ;->᩸֫:Ll/֨ۘۖ;

    return-object p0

    :cond_10
    sget-object p0, Ll/֨ۘۖ;->ܶ֫:Ll/֨ۘۖ;

    return-object p0

    .line 474
    :pswitch_9
    invoke-virtual {p0}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-nez v0, :cond_11

    .line 475
    sget-object p0, Ll/֨ۘۖ;->֡֫:Ll/֨ۘۖ;

    return-object p0

    .line 477
    :cond_11
    invoke-virtual {p0}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result p0

    if-eqz p0, :cond_12

    sget-object p0, Ll/֨ۘۖ;->֨֫:Ll/֨ۘۖ;

    return-object p0

    :cond_12
    sget-object p0, Ll/֨ۘۖ;->ۚ֫:Ll/֨ۘۖ;

    return-object p0

    .line 472
    :pswitch_a
    invoke-virtual {p0}, Ll/֡ۖۖ;->۟֫()Z

    move-result p0

    if-eqz p0, :cond_13

    sget-object p0, Ll/֨ۘۖ;->᩵֫:Ll/֨ۘۖ;

    return-object p0

    :cond_13
    sget-object p0, Ll/֨ۘۖ;->ᩴ֫:Ll/֨ۘۖ;

    return-object p0

    .line 467
    :pswitch_b
    invoke-virtual {p0}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-nez v0, :cond_14

    .line 468
    sget-object p0, Ll/֨ۘۖ;->ܺ֫:Ll/֨ۘۖ;

    return-object p0

    .line 470
    :cond_14
    invoke-virtual {p0}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result p0

    if-eqz p0, :cond_15

    sget-object p0, Ll/֨ۘۖ;->ۘ֫:Ll/֨ۘۖ;

    return-object p0

    :cond_15
    sget-object p0, Ll/֨ۘۖ;->ۖ֫:Ll/֨ۘۖ;

    return-object p0

    .line 462
    :pswitch_c
    invoke-virtual {p0}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-nez v0, :cond_16

    .line 463
    sget-object p0, Ll/֨ۘۖ;->᩷֫:Ll/֨ۘۖ;

    return-object p0

    .line 465
    :cond_16
    invoke-virtual {p0}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result p0

    if-eqz p0, :cond_17

    sget-object p0, Ll/֨ۘۖ;->ۡ֫:Ll/֨ۘۖ;

    return-object p0

    :cond_17
    sget-object p0, Ll/֨ۘۖ;->ۢ֫:Ll/֨ۘۖ;

    return-object p0

    .line 457
    :pswitch_d
    invoke-virtual {p0}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-nez v0, :cond_18

    .line 458
    sget-object p0, Ll/֨ۘۖ;->ܳ֫:Ll/֨ۘۖ;

    return-object p0

    .line 460
    :cond_18
    invoke-virtual {p0}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result p0

    if-eqz p0, :cond_19

    sget-object p0, Ll/֨ۘۖ;->ۜ֫:Ll/֨ۘۖ;

    return-object p0

    :cond_19
    sget-object p0, Ll/֨ۘۖ;->᩻֫:Ll/֨ۘۖ;

    return-object p0

    .line 452
    :pswitch_e
    invoke-virtual {p0}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-nez v0, :cond_1a

    .line 453
    sget-object p0, Ll/֨ۘۖ;->ܽ֫:Ll/֨ۘۖ;

    return-object p0

    .line 455
    :cond_1a
    invoke-virtual {p0}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result p0

    if-eqz p0, :cond_1b

    sget-object p0, Ll/֨ۘۖ;->ܿ֫:Ll/֨ۘۖ;

    return-object p0

    :cond_1b
    sget-object p0, Ll/֨ۘۖ;->ᩳ֫:Ll/֨ۘۖ;

    return-object p0

    .line 447
    :pswitch_f
    invoke-virtual {p0}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-nez v0, :cond_1c

    .line 448
    sget-object p0, Ll/֨ۘۖ;->ܰ:Ll/֨ۘۖ;

    return-object p0

    .line 450
    :cond_1c
    invoke-virtual {p0}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result p0

    if-eqz p0, :cond_1d

    sget-object p0, Ll/֨ۘۖ;->֫֫:Ll/֨ۘۖ;

    return-object p0

    :cond_1d
    sget-object p0, Ll/֨ۘۖ;->۟:Ll/֨ۘۖ;

    return-object p0

    .line 445
    :pswitch_10
    invoke-virtual {p0}, Ll/֡ۖۖ;->۟֫()Z

    move-result p0

    if-eqz p0, :cond_1e

    sget-object p0, Ll/֨ۘۖ;->᩺:Ll/֨ۘۖ;

    return-object p0

    :cond_1e
    sget-object p0, Ll/֨ۘۖ;->ۨ:Ll/֨ۘۖ;

    return-object p0

    .line 440
    :pswitch_11
    invoke-virtual {p0}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-nez v0, :cond_1f

    .line 441
    sget-object p0, Ll/֨ۘۖ;->۫:Ll/֨ۘۖ;

    return-object p0

    .line 443
    :cond_1f
    invoke-virtual {p0}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result p0

    if-eqz p0, :cond_20

    sget-object p0, Ll/֨ۘۖ;->ۛ:Ll/֨ۘۖ;

    return-object p0

    :cond_20
    sget-object p0, Ll/֨ۘۖ;->ۤ:Ll/֨ۘۖ;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
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
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    .line 598
    invoke-static {p0, v0}, Ll/ᩴ᩷ۖ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    .line 694
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "get"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 696
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v0, 0x1

    .line 697
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 698
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 3

    .line 539
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 541
    :catch_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unable to find field "

    const-string v2, " in message class "

    .line 0
    invoke-static {v1, p1, v2}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 542
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ܽ(Ljava/lang/Class;)Ll/᩻֡ۖ;
    .locals 3

    :try_start_0
    const-string v0, "getDefaultInstance"

    const/4 v1, 0x0

    .line 90
    invoke-virtual {p0, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 91
    invoke-virtual {v0, v1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩻֡ۖ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 93
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 94
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v2, "Unable to get default instance for message class "

    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public final ֫(Ljava/lang/Class;)Ll/ۜ֡ۖ;
    .locals 18

    move-object/from16 v0, p1

    .line 81
    const-class v1, Ll/ۘᩴۖ;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_1f

    .line 99
    invoke-static/range {p1 .. p1}, Ll/ᩴ᩷ۖ;->ܽ(Ljava/lang/Class;)Ll/᩻֡ۖ;

    move-result-object v1

    invoke-interface {v1}, Ll/ۘ֡ۖ;->getDescriptorForType()Ll/ᩳۖۖ;

    move-result-object v1

    .line 114
    invoke-virtual {v1}, Ll/ᩳۖۖ;->getFields()Ljava/util/List;

    move-result-object v2

    .line 116
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    .line 85
    new-instance v4, Ll/᩹ۚۖ;

    invoke-direct {v4, v3}, Ll/᩹ۚۖ;-><init>(I)V

    .line 117
    invoke-static/range {p1 .. p1}, Ll/ᩴ᩷ۖ;->ܽ(Ljava/lang/Class;)Ll/᩻֡ۖ;

    move-result-object v3

    invoke-virtual {v4, v3}, Ll/᩹ۚۖ;->֫(Ll/᩻֡ۖ;)V

    .line 118
    invoke-virtual {v1}, Ll/ᩳۖۖ;->ۧ()Ll/ۚۖۖ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۚۖۖ;->ᩴ()Ll/ۗ᩷ۖ;

    move-result-object v3

    .line 103
    sget-object v5, Ll/ۢ᩷ۖ;->֫:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v5, v3

    const/4 v5, 0x1

    const/4 v6, 0x2

    if-eq v3, v5, :cond_1

    if-eq v3, v6, :cond_0

    .line 109
    sget-object v3, Ll/ۛ֡ۖ;->᩹:Ll/ۛ֡ۖ;

    goto :goto_0

    .line 107
    :cond_0
    sget-object v3, Ll/ۛ֡ۖ;->ۙ:Ll/ۛ֡ۖ;

    goto :goto_0

    .line 105
    :cond_1
    sget-object v3, Ll/ۛ֡ۖ;->᩶:Ll/ۛ֡ۖ;

    .line 118
    :goto_0
    invoke-virtual {v4, v3}, Ll/᩹ۚۖ;->֫(Ll/ۛ֡ۖ;)V

    .line 119
    invoke-virtual {v1}, Ll/ᩳۖۖ;->۠()Ll/ܽܺۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽܺۖ;->ᩴ()Z

    move-result v1

    invoke-virtual {v4, v1}, Ll/᩹ۚۖ;->֫(Z)V

    .line 121
    new-instance v1, Ll/ۘ᩷ۖ;

    invoke-direct {v1}, Ll/ۘ᩷ۖ;-><init>()V

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    move-object v5, v3

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v16, 0x1

    .line 131
    :goto_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v9

    if-ge v7, v9, :cond_19

    .line 132
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/֡ۖۖ;

    .line 133
    invoke-virtual {v9}, Ll/֡ۖۖ;->᩺()Z

    move-result v14

    .line 136
    invoke-virtual {v9}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v10

    sget-object v11, Ll/ᩴۖۖ;->۬:Ll/ᩴۖۖ;

    if-ne v10, v11, :cond_2

    .line 137
    invoke-virtual {v9}, Ll/֡ۖۖ;->ۨ()Z

    move-result v10

    if-eqz v10, :cond_2

    .line 138
    new-instance v10, Ll/ۜ᩷ۖ;

    invoke-direct {v10, v9}, Ll/ۜ᩷ۖ;-><init>(Ll/֡ۖۖ;)V

    move-object v15, v10

    goto :goto_2

    :cond_2
    move-object v15, v3

    .line 146
    :goto_2
    invoke-virtual {v9}, Ll/֡ۖۖ;->᩹()Ll/ܶۖۖ;

    move-result-object v10

    if-eqz v10, :cond_4

    .line 405
    invoke-virtual {v9}, Ll/֡ۖۖ;->ܺ()Ll/ܶۖۖ;

    move-result-object v6

    invoke-virtual {v1, v0, v6}, Ll/ۘ᩷ۖ;->֫(Ljava/lang/Class;Ll/ܶۖۖ;)Ll/۬֡ۖ;

    move-result-object v12

    .line 406
    invoke-static {v9}, Ll/ᩴ᩷ۖ;->֫(Ll/֡ۖۖ;)Ll/֨ۘۖ;

    move-result-object v11

    .line 414
    sget-object v6, Ll/ۢ᩷ۖ;->ܽ:[I

    invoke-virtual {v11}, Ll/֨ۘۖ;->֫()Ll/ۜ᩵ۖ;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aget v6, v6, v10

    packed-switch v6, :pswitch_data_0

    .line 433
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid type for oneof: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 672
    :pswitch_0
    :try_start_0
    invoke-virtual {v9}, Ll/֡ۖۖ;->getType()Ll/᩵ۖۖ;

    move-result-object v6

    sget-object v10, Ll/᩵ۖۖ;->ۨ:Ll/᩵ۖۖ;

    if-ne v6, v10, :cond_3

    invoke-virtual {v9}, Ll/֡ۖۖ;->᩸()Ll/ᩳۖۖ;

    move-result-object v6

    invoke-virtual {v6}, Ll/ᩳۖۖ;->getName()Ljava/lang/String;

    move-result-object v6

    goto :goto_3

    :cond_3
    invoke-virtual {v9}, Ll/֡ۖۖ;->getName()Ljava/lang/String;

    move-result-object v6

    .line 673
    :goto_3
    invoke-static {v6}, Ll/ᩴ᩷ۖ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    .line 674
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception v0

    .line 676
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 429
    :pswitch_1
    const-class v3, Ljava/lang/String;

    goto :goto_4

    .line 427
    :pswitch_2
    const-class v3, Ljava/lang/Long;

    goto :goto_4

    .line 425
    :pswitch_3
    const-class v3, Ljava/lang/Integer;

    goto :goto_4

    .line 422
    :pswitch_4
    const-class v3, Ljava/lang/Float;

    goto :goto_4

    .line 420
    :pswitch_5
    const-class v3, Ljava/lang/Double;

    goto :goto_4

    .line 418
    :pswitch_6
    const-class v3, Ll/ۛۜۖ;

    goto :goto_4

    .line 416
    :pswitch_7
    const-class v3, Ljava/lang/Boolean;

    :goto_4
    move-object v13, v3

    .line 409
    invoke-virtual {v9}, Ll/֡ۖۖ;->getNumber()I

    move-result v10

    .line 408
    invoke-static/range {v10 .. v15}, Ll/ܺۘۖ;->֫(ILl/֨ۘۖ;Ll/۬֡ۖ;Ljava/lang/Class;ZLl/۫ᩴۖ;)Ll/ܺۘۖ;

    move-result-object v3

    .line 148
    invoke-virtual {v4, v3}, Ll/᩹ۚۖ;->֫(Ll/ܺۘۖ;)V

    move-object/from16 v17, v1

    goto/16 :goto_d

    .line 547
    :cond_4
    invoke-virtual {v9}, Ll/֡ۖۖ;->getType()Ll/᩵ۖۖ;

    move-result-object v3

    sget-object v10, Ll/᩵ۖۖ;->ۨ:Ll/᩵ۖۖ;

    if-ne v3, v10, :cond_5

    .line 548
    invoke-virtual {v9}, Ll/֡ۖۖ;->᩸()Ll/ᩳۖۖ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ᩳۖۖ;->getName()Ljava/lang/String;

    move-result-object v3

    goto :goto_5

    .line 549
    :cond_5
    invoke-virtual {v9}, Ll/֡ۖۖ;->getName()Ljava/lang/String;

    move-result-object v3

    .line 615
    :goto_5
    invoke-static {v3, v6}, Ll/ᩴ᩷ۖ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v6

    .line 557
    sget-object v12, Ll/ᩴ᩷ۖ;->ܽ:Ljava/util/HashSet;

    invoke-virtual {v12, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v6

    const-string v12, "_"

    if-eqz v6, :cond_6

    const-string v6, "__"

    goto :goto_6

    :cond_6
    move-object v6, v12

    .line 577
    :goto_6
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v17, v1

    const/4 v1, 0x0

    .line 598
    invoke-static {v3, v1}, Ll/ᩴ᩷ۖ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    .line 0
    invoke-static {v13, v1, v6}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 530
    invoke-static {v0, v1}, Ll/ᩴ᩷ۖ;->ۧ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 153
    invoke-virtual {v9}, Ll/֡ۖۖ;->getNumber()I

    move-result v3

    .line 154
    invoke-static {v9}, Ll/ᩴ᩷ۖ;->֫(Ll/֡ۖۖ;)Ll/֨ۘۖ;

    move-result-object v6

    .line 157
    invoke-virtual {v9}, Ll/֡ۖۖ;->᩶()Z

    move-result v13

    if-nez v13, :cond_15

    .line 159
    invoke-virtual {v9}, Ll/֡ۖۖ;->۬()Z

    move-result v12

    if-eqz v12, :cond_f

    .line 165
    invoke-virtual {v9}, Ll/֡ۖۖ;->᩸()Ll/ᩳۖۖ;

    move-result-object v6

    const/4 v10, 0x2

    invoke-virtual {v6, v10}, Ll/ᩳۖۖ;->֫(I)Ll/֡ۖۖ;

    move-result-object v6

    .line 166
    invoke-virtual {v6}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v10

    if-ne v10, v11, :cond_7

    .line 167
    invoke-virtual {v6}, Ll/֡ۖۖ;->ۨ()Z

    move-result v10

    if-eqz v10, :cond_7

    .line 168
    new-instance v15, Ll/᩷᩷ۖ;

    invoke-direct {v15, v6}, Ll/᩷᩷ۖ;-><init>(Ll/֡ۖۖ;)V

    .line 180
    :cond_7
    invoke-virtual {v9}, Ll/֡ۖۖ;->getName()Ljava/lang/String;

    move-result-object v6

    sget v9, Ll/ۡۚۖ;->֫:I

    .line 803
    :try_start_1
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 804
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "$"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 820
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v11, 0x0

    const/4 v12, 0x1

    .line 821
    :goto_7
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v13

    if-ge v11, v13, :cond_d

    .line 822
    invoke-virtual {v6, v11}, Ljava/lang/String;->charAt(I)C

    move-result v13

    const/16 v14, 0x61

    if-gt v14, v13, :cond_9

    const/16 v14, 0x7a

    if-gt v13, v14, :cond_9

    if-eqz v12, :cond_8

    add-int/lit8 v13, v13, -0x20

    int-to-char v12, v13

    .line 826
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_8

    .line 828
    :cond_8
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_8

    :cond_9
    const/16 v14, 0x41

    if-gt v14, v13, :cond_b

    const/16 v14, 0x5a

    if-gt v13, v14, :cond_b

    if-nez v11, :cond_a

    if-nez v12, :cond_a

    add-int/lit8 v13, v13, 0x20

    int-to-char v12, v13

    .line 834
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_8

    .line 836
    :cond_a
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_8
    const/4 v12, 0x0

    goto :goto_9

    :cond_b
    const/16 v12, 0x30

    if-gt v12, v13, :cond_c

    const/16 v12, 0x39

    if-gt v13, v12, :cond_c

    .line 840
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_c
    const/4 v12, 0x1

    :goto_9
    add-int/lit8 v11, v11, 0x1

    goto :goto_7

    .line 846
    :cond_d
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 804
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "DefaultEntryHolder"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    .line 805
    invoke-virtual {v9}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v9

    .line 806
    array-length v10, v9

    const/4 v11, 0x1

    if-ne v10, v11, :cond_e

    const/4 v6, 0x0

    .line 813
    aget-object v6, v9, v6

    invoke-static {v6}, Ll/᩸֨ۖ;->֫(Ljava/lang/reflect/Field;)Ljava/lang/Object;

    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 177
    invoke-static {v1, v3, v6, v15}, Ll/ܺۘۖ;->֫(Ljava/lang/reflect/Field;ILjava/lang/Object;Ll/۫ᩴۖ;)Ll/ܺۘۖ;

    move-result-object v1

    goto/16 :goto_b

    .line 807
    :cond_e
    :try_start_2
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to look up map field default entry holder class for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " in "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 811
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v0

    .line 815
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 182
    :cond_f
    invoke-virtual {v9}, Ll/֡ۖۖ;->۟֫()Z

    move-result v11

    if-eqz v11, :cond_11

    invoke-virtual {v9}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v11

    sget-object v12, Ll/ᩴۖۖ;->ۨ:Ll/ᩴۖۖ;

    if-ne v11, v12, :cond_11

    .line 683
    :try_start_3
    invoke-virtual {v9}, Ll/֡ۖۖ;->getType()Ll/᩵ۖۖ;

    move-result-object v11

    if-ne v11, v10, :cond_10

    invoke-virtual {v9}, Ll/֡ۖۖ;->᩸()Ll/ᩳۖۖ;

    move-result-object v9

    invoke-virtual {v9}, Ll/ᩳۖۖ;->getName()Ljava/lang/String;

    move-result-object v9

    goto :goto_a

    :cond_10
    invoke-virtual {v9}, Ll/֡ۖۖ;->getName()Ljava/lang/String;

    move-result-object v9

    .line 684
    :goto_a
    invoke-static {v9}, Ll/ᩴ᩷ۖ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/lang/Class;

    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v12, 0x0

    aput-object v11, v10, v12

    invoke-virtual {v0, v9, v10}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    .line 685
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v9
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 184
    invoke-static {v1, v3, v6, v9}, Ll/ܺۘۖ;->֫(Ljava/lang/reflect/Field;ILl/֨ۘۖ;Ljava/lang/Class;)Ll/ܺۘۖ;

    move-result-object v1

    goto :goto_b

    :catch_1
    move-exception v0

    .line 687
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 186
    :cond_11
    invoke-virtual {v9}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result v10

    if-eqz v10, :cond_13

    const-string v10, "MemoizedSerializedSize"

    if-eqz v15, :cond_12

    .line 581
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9}, Ll/֡ۖۖ;->getName()Ljava/lang/String;

    move-result-object v9

    const/4 v12, 0x0

    .line 598
    invoke-static {v9, v12}, Ll/ᩴ᩷ۖ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v9

    .line 0
    invoke-static {v11, v9, v10}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 534
    invoke-static {v0, v9}, Ll/ᩴ᩷ۖ;->ۧ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v9

    .line 189
    invoke-static {v1, v3, v6, v15, v9}, Ll/ܺۘۖ;->֫(Ljava/lang/reflect/Field;ILl/֨ۘۖ;Ll/۫ᩴۖ;Ljava/lang/reflect/Field;)Ll/ܺۘۖ;

    move-result-object v1

    goto :goto_b

    :cond_12
    const/4 v11, 0x0

    .line 581
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9}, Ll/֡ۖۖ;->getName()Ljava/lang/String;

    move-result-object v9

    .line 598
    invoke-static {v9, v11}, Ll/ᩴ᩷ۖ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v9

    .line 0
    invoke-static {v12, v9, v10}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 534
    invoke-static {v0, v9}, Ll/ᩴ᩷ۖ;->ۧ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v9

    .line 193
    invoke-static {v1, v3, v6, v9}, Ll/ܺۘۖ;->֫(Ljava/lang/reflect/Field;ILl/֨ۘۖ;Ljava/lang/reflect/Field;)Ll/ܺۘۖ;

    move-result-object v1

    goto :goto_b

    :cond_13
    if-eqz v15, :cond_14

    .line 197
    invoke-static {v1, v3, v6, v15}, Ll/ܺۘۖ;->֫(Ljava/lang/reflect/Field;ILl/֨ۘۖ;Ll/۫ᩴۖ;)Ll/ܺۘۖ;

    move-result-object v1

    goto :goto_b

    .line 199
    :cond_14
    invoke-static {v1, v3, v6, v14}, Ll/ܺۘۖ;->֫(Ljava/lang/reflect/Field;ILl/֨ۘۖ;Z)Ll/ܺۘۖ;

    move-result-object v1

    .line 202
    :goto_b
    invoke-virtual {v4, v1}, Ll/᩹ۚۖ;->֫(Ll/ܺۘۖ;)V

    goto :goto_d

    :cond_15
    if-nez v5, :cond_16

    const-string v5, "bitField"

    .line 0
    invoke-static {v8, v5, v12}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 526
    invoke-static {v0, v5}, Ll/ᩴ᩷ۖ;->ۧ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v5

    .line 212
    :cond_16
    invoke-virtual {v9}, Ll/֡ۖۖ;->ۛ()Z

    move-result v9

    if-eqz v9, :cond_17

    move-object v9, v1

    move v10, v3

    move-object v11, v6

    move-object v12, v5

    move/from16 v13, v16

    .line 214
    invoke-static/range {v9 .. v15}, Ll/ܺۘۖ;->ۧ(Ljava/lang/reflect/Field;ILl/֨ۘۖ;Ljava/lang/reflect/Field;IZLl/۫ᩴۖ;)Ll/ܺۘۖ;

    move-result-object v1

    goto :goto_c

    :cond_17
    move-object v9, v1

    move v10, v3

    move-object v11, v6

    move-object v12, v5

    move/from16 v13, v16

    .line 218
    invoke-static/range {v9 .. v15}, Ll/ܺۘۖ;->֫(Ljava/lang/reflect/Field;ILl/֨ۘۖ;Ljava/lang/reflect/Field;IZLl/۫ᩴۖ;)Ll/ܺۘۖ;

    move-result-object v1

    .line 221
    :goto_c
    invoke-virtual {v4, v1}, Ll/᩹ۚۖ;->֫(Ll/ܺۘۖ;)V

    shl-int/lit8 v1, v16, 0x1

    if-nez v1, :cond_18

    add-int/lit8 v8, v8, 0x1

    const/4 v1, 0x0

    const/4 v3, 0x1

    move-object v5, v1

    const/16 v16, 0x1

    goto :goto_d

    :cond_18
    move/from16 v16, v1

    :goto_d
    add-int/lit8 v7, v7, 0x1

    const/4 v6, 0x1

    const/4 v3, 0x0

    move-object/from16 v1, v17

    goto/16 :goto_1

    .line 232
    :cond_19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 233
    :goto_e
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_1c

    .line 234
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡ۖۖ;

    .line 235
    invoke-virtual {v3}, Ll/֡ۖۖ;->ۛ()Z

    move-result v5

    if-nez v5, :cond_1a

    .line 236
    invoke-virtual {v3}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v5

    sget-object v6, Ll/ᩴۖۖ;->ۨ:Ll/ᩴۖۖ;

    if-ne v5, v6, :cond_1b

    .line 237
    invoke-virtual {v3}, Ll/֡ۖۖ;->᩸()Ll/ᩳۖۖ;

    move-result-object v5

    .line 395
    sget-object v6, Ll/ᩴ᩷ۖ;->ۧ:Ll/ۖ᩷ۖ;

    invoke-virtual {v6, v5}, Ll/ۖ᩷ۖ;->֫(Ll/ᩳۖۖ;)Z

    move-result v5

    if-eqz v5, :cond_1b

    .line 238
    :cond_1a
    invoke-virtual {v3}, Ll/֡ۖۖ;->getNumber()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1b
    add-int/lit8 v1, v1, 0x1

    goto :goto_e

    .line 241
    :cond_1c
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v2, v1, [I

    const/4 v3, 0x0

    .line 242
    :goto_f
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v3, v5, :cond_1d

    .line 243
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    aput v5, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_f

    :cond_1d
    if-lez v1, :cond_1e

    .line 246
    invoke-virtual {v4, v2}, Ll/᩹ۚۖ;->֫([I)V

    .line 248
    :cond_1e
    invoke-virtual {v4}, Ll/᩹ۚۖ;->֫()Ll/᩶ۚۖ;

    move-result-object v0

    return-object v0

    .line 82
    :cond_1f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Unsupported message type: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ۧ(Ljava/lang/Class;)Z
    .locals 1

    .line 76
    const-class v0, Ll/ۘᩴۖ;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    return p1
.end method
