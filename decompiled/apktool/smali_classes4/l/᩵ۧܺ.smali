.class public final Ll/᩵ۧܺ;
.super Ljava/lang/Object;
.source "95VI"


# static fields
.field public static final synthetic ֫:I = 0x0

.field public static ۖ:Z = true

.field public static volatile ۜ:Ljava/lang/reflect/Method;

.field public static volatile ۡ:Z

.field public static volatile ۢ:Ljava/lang/Class;

.field public static volatile ۧ:Ljava/util/HashMap;

.field public static volatile ܳ:Ljava/lang/reflect/Constructor;

.field public static final ܺ:Ll/ۧۤᩴ;

.field public static volatile ܽ:Z

.field public static volatile ܿ:Z

.field public static volatile ᩳ:Z

.field public static volatile ᩷:Ljava/lang/reflect/Method;

.field public static volatile ᩻:Ljava/lang/reflect/Method;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    .line 945
    new-instance v0, Ll/ۧۤᩴ;

    const/high16 v1, 0x3f400000    # 0.75f

    const/4 v2, 0x1

    const/16 v3, 0x24

    invoke-direct {v0, v3, v1, v2}, Ll/ۧۤᩴ;-><init>(IFI)V

    sput-object v0, Ll/᩵ۧܺ;->ܺ:Ll/ۧۤᩴ;

    const-string v1, "byte"

    .line 948
    sget-object v2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "short"

    .line 949
    sget-object v2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "int"

    .line 950
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "long"

    .line 951
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "float"

    .line 952
    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "double"

    .line 953
    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "boolean"

    .line 954
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "char"

    .line 955
    sget-object v2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "[byte"

    .line 957
    const-class v2, [B

    invoke-virtual {v0, v1, v2}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "[short"

    .line 958
    const-class v3, [S

    invoke-virtual {v0, v1, v3}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "[int"

    .line 959
    const-class v4, [I

    invoke-virtual {v0, v1, v4}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "[long"

    .line 960
    const-class v5, [J

    invoke-virtual {v0, v1, v5}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "[float"

    .line 961
    const-class v6, [F

    invoke-virtual {v0, v1, v6}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "[double"

    .line 962
    const-class v7, [D

    invoke-virtual {v0, v1, v7}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "[boolean"

    .line 963
    const-class v8, [Z

    invoke-virtual {v0, v1, v8}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "[char"

    .line 964
    const-class v9, [C

    invoke-virtual {v0, v1, v9}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "[B"

    .line 966
    invoke-virtual {v0, v1, v2}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "[S"

    .line 967
    invoke-virtual {v0, v1, v3}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "[I"

    .line 968
    invoke-virtual {v0, v1, v4}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "[J"

    .line 969
    invoke-virtual {v0, v1, v5}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "[F"

    .line 970
    invoke-virtual {v0, v1, v6}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "[D"

    .line 971
    invoke-virtual {v0, v1, v7}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "[C"

    .line 972
    invoke-virtual {v0, v1, v9}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "[Z"

    .line 973
    invoke-virtual {v0, v1, v8}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "java.util.HashMap"

    .line 975
    const-class v2, Ljava/util/HashMap;

    invoke-virtual {v0, v1, v2}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "java.util.TreeMap"

    .line 976
    const-class v2, Ljava/util/TreeMap;

    invoke-virtual {v0, v1, v2}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "java.util.Date"

    .line 977
    const-class v2, Ljava/util/Date;

    invoke-virtual {v0, v1, v2}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "com.alibaba.fastjson.JSONObject"

    .line 978
    const-class v2, Ll/᩸۟ۡ;

    invoke-virtual {v0, v1, v2}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "java.util.concurrent.ConcurrentHashMap"

    .line 979
    const-class v2, Ll/ۧۤᩴ;

    invoke-virtual {v0, v1, v2}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "java.text.SimpleDateFormat"

    .line 980
    const-class v2, Ljava/text/SimpleDateFormat;

    invoke-virtual {v0, v1, v2}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "java.lang.StackTraceElement"

    .line 981
    const-class v2, Ljava/lang/StackTraceElement;

    invoke-virtual {v0, v1, v2}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "java.lang.RuntimeException"

    .line 982
    const-class v2, Ljava/lang/RuntimeException;

    invoke-virtual {v0, v1, v2}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ljava/lang/reflect/Type;)Ljava/lang/Class;
    .locals 3

    .line 1582
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/lang/Class;

    if-ne v0, v1, :cond_0

    .line 1583
    check-cast p0, Ljava/lang/Class;

    return-object p0

    .line 1586
    :cond_0
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_1

    .line 1587
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object p0

    invoke-static {p0}, Ll/᩵ۧܺ;->֫(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p0

    return-object p0

    .line 1590
    :cond_1
    instance-of v0, p0, Ljava/lang/reflect/TypeVariable;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 1591
    check-cast p0, Ljava/lang/reflect/TypeVariable;

    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    move-result-object p0

    aget-object p0, p0, v1

    check-cast p0, Ljava/lang/Class;

    return-object p0

    .line 1594
    :cond_2
    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    if-eqz v0, :cond_3

    .line 1595
    check-cast p0, Ljava/lang/reflect/WildcardType;

    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object p0

    .line 1596
    array-length v0, p0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_3

    .line 1597
    aget-object p0, p0, v1

    invoke-static {p0}, Ll/᩵ۧܺ;->֫(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p0

    return-object p0

    .line 1601
    :cond_3
    const-class p0, Ljava/lang/Object;

    return-object p0
.end method

.method public static ֫(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2

    .line 1729
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 1730
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p0

    return-object p0

    .line 1731
    :cond_0
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_1

    .line 1732
    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p0

    return-object p0

    .line 1733
    :cond_1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_2

    .line 1734
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    .line 1735
    :cond_2
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_3

    const-wide/16 v0, 0x0

    .line 1736
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    .line 1737
    :cond_3
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_4

    const/4 p0, 0x0

    .line 1738
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0

    .line 1739
    :cond_4
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_5

    const-wide/16 v0, 0x0

    .line 1740
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0

    .line 1741
    :cond_5
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_6

    .line 1742
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    .line 1743
    :cond_6
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_7

    const/16 p0, 0x30

    .line 1744
    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p0

    return-object p0

    :cond_7
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final ֫(Ljava/lang/Object;Ljava/lang/Class;Ll/᩻֫ܺ;)Ljava/lang/Object;
    .locals 5

    if-nez p0, :cond_0

    goto/16 :goto_3

    :cond_0
    if-eqz p1, :cond_29

    .line 555
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    if-ne p1, v0, :cond_1

    goto/16 :goto_1

    .line 559
    :cond_1
    instance-of v0, p0, Ljava/util/Map;

    if-eqz v0, :cond_4

    .line 560
    const-class v0, Ljava/util/Map;

    if-ne p1, v0, :cond_2

    goto/16 :goto_1

    .line 564
    :cond_2
    move-object v0, p0

    check-cast v0, Ljava/util/Map;

    .line 565
    const-class v1, Ljava/lang/Object;

    if-ne p1, v1, :cond_3

    const-string v1, "@type"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    .line 569
    :cond_3
    invoke-static {v0, p1, p2}, Ll/᩵ۧܺ;->ۧ(Ljava/util/Map;Ljava/lang/Class;Ll/᩻֫ܺ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 572
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_9

    .line 573
    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_6

    .line 575
    check-cast p0, Ljava/util/Collection;

    .line 577
    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    .line 578
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 579
    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v4

    .line 542
    invoke-static {v3, v4, p2}, Ll/᩵ۧܺ;->֫(Ljava/lang/Object;Ljava/lang/Class;Ll/᩻֫ܺ;)Ljava/lang/Object;

    move-result-object v3

    .line 580
    invoke-static {v0, v2, v3}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    add-int/2addr v2, v1

    goto :goto_0

    :cond_5
    return-object v0

    .line 587
    :cond_6
    const-class p2, [B

    if-ne p1, p2, :cond_9

    .line 489
    instance-of p1, p0, [B

    if-eqz p1, :cond_7

    .line 490
    check-cast p0, [B

    return-object p0

    .line 493
    :cond_7
    instance-of p1, p0, Ljava/lang/String;

    if-eqz p1, :cond_8

    .line 494
    check-cast p0, Ljava/lang/String;

    .line 495
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {v2, p1, p0}, Ll/۟۟ۡ;->֫(IILjava/lang/String;)[B

    move-result-object p0

    return-object p0

    .line 497
    :cond_8
    new-instance p1, Ll/ܶ۟ۡ;

    const-string p2, "can not cast to int, value : "

    .line 0
    invoke-static {p0, p2}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 25
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 497
    throw p1

    .line 592
    :cond_9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-eqz p2, :cond_a

    :goto_1
    return-object p0

    .line 596
    :cond_a
    sget-object p2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-eq p1, p2, :cond_28

    const-class p2, Ljava/lang/Boolean;

    if-ne p1, p2, :cond_b

    goto/16 :goto_a

    .line 600
    :cond_b
    sget-object p2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-eq p1, p2, :cond_27

    const-class p2, Ljava/lang/Byte;

    if-ne p1, p2, :cond_c

    goto/16 :goto_9

    .line 604
    :cond_c
    sget-object p2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-eq p1, p2, :cond_d

    const-class p2, Ljava/lang/Character;

    if-ne p1, p2, :cond_e

    .line 606
    :cond_d
    instance-of p2, p0, Ljava/lang/String;

    if-eqz p2, :cond_e

    .line 607
    move-object p2, p0

    check-cast p2, Ljava/lang/String;

    .line 608
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v0, v1, :cond_e

    .line 609
    invoke-virtual {p2, v2}, Ljava/lang/String;->charAt(I)C

    move-result p0

    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p0

    return-object p0

    .line 614
    :cond_e
    sget-object p2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-eq p1, p2, :cond_26

    const-class p2, Ljava/lang/Short;

    if-ne p1, p2, :cond_f

    goto/16 :goto_8

    .line 618
    :cond_f
    sget-object p2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-eq p1, p2, :cond_25

    const-class p2, Ljava/lang/Integer;

    if-ne p1, p2, :cond_10

    goto/16 :goto_7

    .line 622
    :cond_10
    sget-object p2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-eq p1, p2, :cond_24

    const-class p2, Ljava/lang/Long;

    if-ne p1, p2, :cond_11

    goto/16 :goto_6

    .line 626
    :cond_11
    sget-object p2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-eq p1, p2, :cond_23

    const-class p2, Ljava/lang/Float;

    if-ne p1, p2, :cond_12

    goto/16 :goto_5

    .line 630
    :cond_12
    sget-object p2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-eq p1, p2, :cond_22

    const-class p2, Ljava/lang/Double;

    if-ne p1, p2, :cond_13

    goto/16 :goto_4

    .line 634
    :cond_13
    const-class p2, Ljava/lang/String;

    if-ne p1, p2, :cond_14

    .line 174
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 638
    :cond_14
    const-class p2, Ljava/math/BigDecimal;

    if-ne p1, p2, :cond_15

    .line 639
    invoke-static {p0}, Ll/᩵ۧܺ;->֫(Ljava/lang/Object;)Ljava/math/BigDecimal;

    move-result-object p0

    return-object p0

    .line 642
    :cond_15
    const-class p2, Ljava/math/BigInteger;

    if-ne p1, p2, :cond_16

    .line 643
    invoke-static {p0}, Ll/᩵ۧܺ;->ۧ(Ljava/lang/Object;)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    .line 646
    :cond_16
    const-class p2, Ljava/util/Date;

    if-ne p1, p2, :cond_17

    .line 647
    invoke-static {p0}, Ll/᩵ۧܺ;->ܿ(Ljava/lang/Object;)Ljava/util/Date;

    move-result-object p0

    return-object p0

    .line 650
    :cond_17
    invoke-virtual {p1}, Ljava/lang/Class;->isEnum()Z

    move-result p2

    const-string v0, "can not cast to : "

    if-eqz p2, :cond_1c

    .line 688
    :try_start_0
    instance-of p2, p0, Ljava/lang/String;

    if-eqz p2, :cond_19

    .line 689
    check-cast p0, Ljava/lang/String;

    .line 690
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p2

    if-nez p2, :cond_18

    goto/16 :goto_3

    .line 693
    :cond_18
    invoke-static {p1, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    return-object p0

    .line 695
    :cond_19
    instance-of p2, p0, Ljava/lang/Integer;

    if-nez p2, :cond_1a

    instance-of p2, p0, Ljava/lang/Long;

    if-eqz p2, :cond_1b

    .line 696
    :cond_1a
    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    .line 697
    invoke-virtual {p1}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    move-result-object p2

    .line 698
    array-length v1, p2

    if-ge p0, v1, :cond_1b

    .line 699
    aget-object p0, p2, p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 706
    :cond_1b
    new-instance p0, Ll/ܶ۟ۡ;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 25
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 706
    throw p0

    :catch_0
    move-exception p0

    .line 703
    new-instance p2, Ll/ܶ۟ۡ;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 29
    invoke-direct {p2, p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 703
    throw p2

    .line 654
    :cond_1c
    const-class p2, Ljava/util/Calendar;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_1e

    .line 655
    invoke-static {p0}, Ll/᩵ۧܺ;->ܿ(Ljava/lang/Object;)Ljava/util/Date;

    move-result-object p0

    if-ne p1, p2, :cond_1d

    .line 658
    sget-object p1, Ll/ۚ۟ۡ;->ۗ:Ljava/util/TimeZone;

    sget-object p2, Ll/ۚ۟ۡ;->ۙ:Ljava/util/Locale;

    invoke-static {p1, p2}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object p1

    goto :goto_2

    .line 661
    :cond_1d
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Calendar;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object p1, p2

    .line 666
    :goto_2
    invoke-virtual {p1, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    return-object p1

    :catch_1
    move-exception p0

    .line 663
    new-instance p2, Ll/ܶ۟ۡ;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 29
    invoke-direct {p2, p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 663
    throw p2

    .line 670
    :cond_1e
    instance-of p2, p0, Ljava/lang/String;

    if-eqz p2, :cond_21

    .line 671
    check-cast p0, Ljava/lang/String;

    .line 672
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p2

    if-eqz p2, :cond_20

    const-string p2, "null"

    .line 673
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1f

    goto :goto_3

    .line 677
    :cond_1f
    const-class p2, Ljava/util/Currency;

    if-ne p1, p2, :cond_21

    .line 678
    invoke-static {p0}, Ljava/util/Currency;->getInstance(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object p0

    return-object p0

    :cond_20
    :goto_3
    const/4 p0, 0x0

    return-object p0

    .line 682
    :cond_21
    new-instance p0, Ll/ܶ۟ۡ;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 25
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 682
    throw p0

    .line 631
    :cond_22
    :goto_4
    invoke-static {p0}, Ll/᩵ۧܺ;->ܳ(Ljava/lang/Object;)Ljava/lang/Double;

    move-result-object p0

    return-object p0

    .line 627
    :cond_23
    :goto_5
    invoke-static {p0}, Ll/᩵ۧܺ;->᩻(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object p0

    return-object p0

    .line 623
    :cond_24
    :goto_6
    invoke-static {p0}, Ll/᩵ۧܺ;->᩷(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    .line 619
    :cond_25
    :goto_7
    invoke-static {p0}, Ll/᩵ۧܺ;->ۜ(Ljava/lang/Object;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    .line 615
    :cond_26
    :goto_8
    invoke-static {p0}, Ll/᩵ۧܺ;->ۢ(Ljava/lang/Object;)Ljava/lang/Short;

    move-result-object p0

    return-object p0

    .line 601
    :cond_27
    :goto_9
    invoke-static {p0}, Ll/᩵ۧܺ;->ᩳ(Ljava/lang/Object;)Ljava/lang/Byte;

    move-result-object p0

    return-object p0

    .line 597
    :cond_28
    :goto_a
    invoke-static {p0}, Ll/᩵ۧܺ;->ܽ(Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    .line 552
    :cond_29
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "clazz is null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ֫(Ljava/lang/Object;Ljava/lang/reflect/ParameterizedType;Ll/᩻֫ܺ;)Ljava/lang/Object;
    .locals 8

    if-nez p0, :cond_0

    return-object p0

    .line 744
    :cond_0
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 746
    const-class v1, Ll/᩸۟ۡ;

    const-class v2, Ljava/util/ArrayList;

    const-class v3, Ljava/util/List;

    const/4 v4, 0x0

    if-eq v0, v3, :cond_1

    if-ne v0, v2, :cond_5

    .line 748
    :cond_1
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v5

    aget-object v5, v5, v4

    .line 750
    instance-of v6, p0, Ljava/util/List;

    if-eqz v6, :cond_5

    .line 751
    check-cast p0, Ljava/util/List;

    .line 753
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    .line 754
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    if-ge v4, p1, :cond_4

    .line 757
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    .line 760
    instance-of v3, v5, Ljava/lang/Class;

    if-eqz v3, :cond_3

    if-eqz v2, :cond_2

    .line 761
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-ne v3, v1, :cond_2

    .line 762
    check-cast v2, Ll/᩸۟ۡ;

    move-object v3, v5

    check-cast v3, Ljava/lang/Class;

    invoke-virtual {v2, v3, p2}, Ll/᩸۟ۡ;->֫(Ljava/lang/Class;Ll/᩻֫ܺ;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_1

    .line 764
    :cond_2
    move-object v3, v5

    check-cast v3, Ljava/lang/Class;

    invoke-static {v2, v3, p2}, Ll/᩵ۧܺ;->֫(Ljava/lang/Object;Ljava/lang/Class;Ll/᩻֫ܺ;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_1

    .line 767
    :cond_3
    invoke-static {v2, v5, p2}, Ll/᩵ۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;Ll/᩻֫ܺ;)Ljava/lang/Object;

    move-result-object v2

    .line 770
    :goto_1
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    return-object v0

    .line 777
    :cond_5
    const-class v5, Ljava/util/TreeSet;

    const-class v6, Ljava/util/HashSet;

    const-class v7, Ljava/util/Set;

    if-eq v0, v7, :cond_6

    if-eq v0, v6, :cond_6

    if-eq v0, v5, :cond_6

    if-eq v0, v3, :cond_6

    if-ne v0, v2, :cond_d

    .line 782
    :cond_6
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v2

    aget-object v2, v2, v4

    .line 784
    instance-of v3, p0, Ljava/lang/Iterable;

    if-eqz v3, :cond_d

    if-eq v0, v7, :cond_9

    if-ne v0, v6, :cond_7

    goto :goto_2

    :cond_7
    if-ne v0, v5, :cond_8

    .line 789
    new-instance p1, Ljava/util/TreeSet;

    invoke-direct {p1}, Ljava/util/TreeSet;-><init>()V

    goto :goto_3

    .line 791
    :cond_8
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    goto :goto_3

    .line 787
    :cond_9
    :goto_2
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 794
    :goto_3
    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 795
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 798
    instance-of v3, v2, Ljava/lang/Class;

    if-eqz v3, :cond_b

    if-eqz v0, :cond_a

    .line 799
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-ne v3, v1, :cond_a

    .line 800
    check-cast v0, Ll/᩸۟ۡ;

    move-object v3, v2

    check-cast v3, Ljava/lang/Class;

    invoke-virtual {v0, v3, p2}, Ll/᩸۟ۡ;->֫(Ljava/lang/Class;Ll/᩻֫ܺ;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_5

    .line 802
    :cond_a
    move-object v3, v2

    check-cast v3, Ljava/lang/Class;

    invoke-static {v0, v3, p2}, Ll/᩵ۧܺ;->֫(Ljava/lang/Object;Ljava/lang/Class;Ll/᩻֫ܺ;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_5

    .line 805
    :cond_b
    invoke-static {v0, v2, p2}, Ll/᩵ۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;Ll/᩻֫ܺ;)Ljava/lang/Object;

    move-result-object v0

    .line 808
    :goto_5
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_c
    return-object p1

    .line 815
    :cond_d
    const-class v1, Ljava/util/Map;

    const/4 v2, 0x1

    if-eq v0, v1, :cond_e

    const-class v1, Ljava/util/HashMap;

    if-ne v0, v1, :cond_10

    .line 816
    :cond_e
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v1

    aget-object v1, v1, v4

    .line 817
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v3

    aget-object v3, v3, v2

    .line 819
    instance-of v5, p0, Ljava/util/Map;

    if-eqz v5, :cond_10

    .line 820
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 822
    check-cast p0, Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 823
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v1, p2}, Ll/᩵ۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;Ll/᩻֫ܺ;)Ljava/lang/Object;

    move-result-object v2

    .line 824
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v3, p2}, Ll/᩵ۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;Ll/᩻֫ܺ;)Ljava/lang/Object;

    move-result-object v0

    .line 826
    invoke-virtual {p1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_f
    return-object p1

    .line 833
    :cond_10
    instance-of v1, p0, Ljava/lang/String;

    if-eqz v1, :cond_12

    .line 834
    move-object v1, p0

    check-cast v1, Ljava/lang/String;

    .line 835
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_11

    const-string v3, "null"

    .line 836
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    :cond_11
    const/4 p0, 0x0

    return-object p0

    .line 841
    :cond_12
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v1

    array-length v1, v1

    if-ne v1, v2, :cond_13

    .line 842
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v1

    aget-object v1, v1, v4

    .line 843
    instance-of v1, v1, Ljava/lang/reflect/WildcardType;

    if-eqz v1, :cond_13

    .line 844
    invoke-static {p0, v0, p2}, Ll/᩵ۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;Ll/᩻֫ܺ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 848
    :cond_13
    new-instance p0, Ll/ܶ۟ۡ;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "can not cast to : "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 25
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 848
    throw p0
.end method

.method public static final ֫(Ljava/lang/Object;Ljava/lang/reflect/Type;Ll/᩻֫ܺ;)Ljava/lang/Object;
    .locals 1

    if-nez p0, :cond_0

    goto :goto_0

    .line 715
    :cond_0
    instance-of v0, p1, Ljava/lang/Class;

    if-eqz v0, :cond_1

    .line 716
    check-cast p1, Ljava/lang/Class;

    invoke-static {p0, p1, p2}, Ll/᩵ۧܺ;->֫(Ljava/lang/Object;Ljava/lang/Class;Ll/᩻֫ܺ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 719
    :cond_1
    instance-of v0, p1, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_2

    .line 720
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    invoke-static {p0, p1, p2}, Ll/᩵ۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/ParameterizedType;Ll/᩻֫ܺ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 723
    :cond_2
    instance-of p2, p0, Ljava/lang/String;

    if-eqz p2, :cond_4

    .line 724
    move-object p2, p0

    check-cast p2, Ljava/lang/String;

    .line 725
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "null"

    .line 726
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    :cond_3
    :goto_0
    const/4 p0, 0x0

    return-object p0

    .line 731
    :cond_4
    instance-of p2, p1, Ljava/lang/reflect/TypeVariable;

    if-eqz p2, :cond_5

    return-object p0

    .line 735
    :cond_5
    new-instance p0, Ll/ܶ۟ۡ;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "can not cast to : "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 25
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 735
    throw p0
.end method

.method public static final ֫(Ljava/util/Map;Ljava/lang/Class;Ll/᩻֫ܺ;)Ljava/lang/Object;
    .locals 0

    .line 542
    invoke-static {p0, p1, p2}, Ll/᩵ۧܺ;->֫(Ljava/lang/Object;Ljava/lang/Class;Ll/᩻֫ܺ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    if-eqz p0, :cond_1

    .line 1606
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_1

    .line 1607
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1608
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1613
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    .line 1614
    aget-char v0, p0, v2

    invoke-static {v0}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v0

    aput-char v0, p0, v2

    .line 1615
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p0}, Ljava/lang/String;-><init>([C)V

    return-object v0

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static ֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/reflect/Field;Ljava/util/HashMap;)Ljava/lang/reflect/Field;
    .locals 3

    .line 1650
    invoke-static {p0, p1, p2, p3}, Ll/᩵ۧܺ;->ۧ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/reflect/Field;Ljava/util/HashMap;)Ljava/lang/reflect/Field;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "_"

    .line 0
    invoke-static {v0, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1652
    invoke-static {p0, v0, p2, p3}, Ll/᩵ۧܺ;->ۧ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/reflect/Field;Ljava/util/HashMap;)Ljava/lang/reflect/Field;

    move-result-object v0

    :cond_0
    if-nez v0, :cond_1

    const-string v0, "m_"

    .line 0
    invoke-static {v0, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1656
    invoke-static {p0, v0, p2, p3}, Ll/᩵ۧܺ;->ۧ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/reflect/Field;Ljava/util/HashMap;)Ljava/lang/reflect/Field;

    move-result-object v0

    :cond_1
    if-nez v0, :cond_2

    .line 1660
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "m"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 1661
    invoke-static {p0, p1, p2, p3}, Ll/᩵ۧܺ;->ۧ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/reflect/Field;Ljava/util/HashMap;)Ljava/lang/reflect/Field;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v0
.end method

.method public static final ֫(Ljava/lang/Object;)Ljava/math/BigDecimal;
    .locals 1

    .line 252
    instance-of v0, p0, Ljava/math/BigDecimal;

    if-eqz v0, :cond_0

    .line 253
    check-cast p0, Ljava/math/BigDecimal;

    return-object p0

    .line 256
    :cond_0
    instance-of v0, p0, Ljava/math/BigInteger;

    if-eqz v0, :cond_1

    .line 257
    new-instance v0, Ljava/math/BigDecimal;

    check-cast p0, Ljava/math/BigInteger;

    invoke-direct {v0, p0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    return-object v0

    .line 260
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 261
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "null"

    .line 262
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 266
    :cond_2
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, p0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_3
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ljava/lang/Class;ILl/۫۟ۡ;ZLl/ۙ۟ۡ;)Ljava/util/ArrayList;
    .locals 39

    move-object/from16 v10, p0

    move/from16 v11, p1

    move-object/from16 v12, p2

    move-object/from16 v13, p4

    .line 1076
    new-instance v14, Ljava/util/LinkedHashMap;

    invoke-direct {v14}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1077
    new-instance v15, Ljava/util/HashMap;

    invoke-direct {v15}, Ljava/util/HashMap;-><init>()V

    .line 1079
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v9

    .line 1081
    invoke-static/range {p0 .. p0}, Ll/᩵ۧܺ;->ܽ(Ljava/lang/Class;)Z

    move-result v16

    .line 1083
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v1, v10

    .line 1085
    :goto_0
    const-class v8, Ljava/lang/Object;

    if-eqz v1, :cond_4

    if-eq v1, v8, :cond_4

    .line 1086
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v2

    .line 1087
    array-length v3, v2

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_3

    aget-object v5, v2, v4

    .line 1088
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v6

    and-int/lit8 v7, v6, 0x8

    if-nez v7, :cond_2

    and-int/lit8 v7, v6, 0x2

    if-nez v7, :cond_2

    and-int/lit16 v7, v6, 0x100

    if-nez v7, :cond_2

    and-int/lit8 v6, v6, 0x4

    if-eqz v6, :cond_0

    goto :goto_2

    .line 1097
    :cond_0
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v6

    sget-object v7, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    .line 1098
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v6

    array-length v6, v6

    if-nez v6, :cond_2

    .line 1099
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v6

    const-class v7, Ljava/lang/ClassLoader;

    if-eq v6, v7, :cond_2

    .line 1100
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v6

    if-ne v6, v8, :cond_1

    goto :goto_2

    .line 1105
    :cond_1
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 1085
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    .line 1115
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v17

    const/16 v18, 0x0

    move v7, v11

    move-object v6, v13

    move-object/from16 v0, v18

    move-object v1, v0

    move-object v2, v1

    move-object v3, v2

    :goto_3
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const-class v5, Ll/۬۟ۡ;

    if-eqz v4, :cond_30

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/reflect/Method;

    .line 1116
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v11

    const/16 v19, 0x0

    move-object/from16 v20, v0

    const-string v0, "getMetaClass"

    .line 1119
    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1120
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const/16 v21, 0x1

    move-object/from16 v22, v2

    const-string v2, "groovy.lang.MetaClass"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    move-object/from16 v23, v3

    move-object/from16 v24, v6

    move-object/from16 v25, v8

    move-object/from16 v26, v9

    goto/16 :goto_5

    :cond_5
    move-object/from16 v22, v2

    const/16 v21, 0x1

    .line 1124
    :cond_6
    invoke-virtual {v4, v5}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Ll/۬۟ۡ;

    if-nez v0, :cond_7

    .line 1127
    invoke-static {v4, v10}, Ll/᩵ۧܺ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Class;)Ll/۬۟ۡ;

    move-result-object v0

    :cond_7
    if-eqz v16, :cond_b

    const-string v2, "isEmpty"

    move-object/from16 v23, v3

    const-string v3, "getEndInclusive"

    .line 80
    sget-object v24, Ll/᩵ۧܺ;->ۧ:Ljava/util/HashMap;

    if-nez v24, :cond_8

    sget-boolean v24, Ll/᩵ۧܺ;->ܽ:Z

    if-nez v24, :cond_8

    move-object/from16 v24, v6

    .line 82
    :try_start_0
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v25, v8

    .line 84
    :try_start_1
    const-class v8, Ll/۠᩶᩵;

    sget v26, Ll/۠᩶᩵;->᩶:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object/from16 v26, v9

    .line 85
    :try_start_2
    filled-new-array {v3, v2}, [Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    const-class v8, Ll/ۙ᩶᩵;

    sget v9, Ll/ۙ᩶᩵;->ۙ:I

    .line 88
    filled-new-array {v3, v2}, [Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    const-class v8, Ll/۬᩶᩵;

    .line 91
    filled-new-array {v3, v2}, [Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v8, "l.\u1a78\u1a76\u1a75"

    .line 93
    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    .line 94
    filled-new-array {v3, v2}, [Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v8, "l.\u0736\u1a76\u1a75"

    .line 96
    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    .line 97
    filled-new-array {v3, v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    sput-object v6, Ll/᩵ۧܺ;->ۧ:Ljava/util/HashMap;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_4

    :catchall_0
    move-object/from16 v25, v8

    :catchall_1
    move-object/from16 v26, v9

    .line 101
    :catchall_2
    sput-boolean v21, Ll/᩵ۧܺ;->ܽ:Z

    goto :goto_4

    :cond_8
    move-object/from16 v24, v6

    move-object/from16 v25, v8

    move-object/from16 v26, v9

    .line 105
    :goto_4
    sget-object v2, Ll/᩵ۧܺ;->ۧ:Ljava/util/HashMap;

    if-nez v2, :cond_9

    goto :goto_6

    .line 109
    :cond_9
    sget-object v2, Ll/᩵ۧܺ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v2, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    if-nez v2, :cond_a

    goto :goto_6

    .line 114
    :cond_a
    invoke-static {v2, v11}, Ljava/util/Arrays;->binarySearch([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    if-ltz v2, :cond_c

    :goto_5
    move/from16 v11, p1

    move-object/from16 v0, v20

    move-object/from16 v2, v22

    move-object/from16 v3, v23

    move-object/from16 v6, v24

    move-object/from16 v8, v25

    move-object/from16 v9, v26

    goto/16 :goto_3

    :cond_b
    move-object/from16 v23, v3

    move-object/from16 v24, v6

    move-object/from16 v25, v8

    move-object/from16 v26, v9

    :cond_c
    :goto_6
    const-string v2, "get"

    if-nez v0, :cond_17

    if-eqz v16, :cond_17

    if-nez v1, :cond_10

    .line 1136
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v1

    .line 1137
    array-length v3, v1

    const/4 v6, 0x1

    if-ne v3, v6, :cond_f

    .line 1138
    aget-object v3, v1, v19

    invoke-virtual {v3}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v3

    .line 1139
    invoke-static/range {p0 .. p0}, Ll/᩵ۧܺ;->ۧ(Ljava/lang/Class;)[Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_e

    .line 1142
    array-length v8, v6

    new-array v8, v8, [Ljava/lang/String;

    .line 1143
    array-length v9, v6

    move-object/from16 v19, v0

    const/4 v0, 0x0

    invoke-static {v6, v0, v8, v0, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1144
    invoke-static {v8}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 1146
    array-length v9, v6

    new-array v9, v9, [S

    move-object/from16 v21, v1

    .line 1147
    :goto_7
    array-length v1, v6

    if-ge v0, v1, :cond_d

    .line 1148
    aget-object v1, v6, v0

    invoke-static {v8, v1}, Ljava/util/Arrays;->binarySearch([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    .line 1149
    aput-short v0, v9, v1

    add-int/lit8 v0, v0, 0x1

    int-to-short v0, v0

    goto :goto_7

    :cond_d
    move-object v6, v8

    move-object v0, v9

    move-object/from16 v1, v21

    goto :goto_9

    :cond_e
    move-object/from16 v19, v0

    move-object/from16 v21, v1

    move-object/from16 v0, v20

    goto :goto_9

    :cond_f
    move-object/from16 v19, v0

    move-object/from16 v21, v1

    goto :goto_8

    :cond_10
    move-object/from16 v19, v0

    :goto_8
    move-object/from16 v0, v20

    move-object/from16 v6, v22

    move-object/from16 v3, v23

    :goto_9
    if-eqz v6, :cond_16

    if-eqz v0, :cond_16

    .line 1156
    invoke-virtual {v11, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_16

    const/4 v8, 0x3

    .line 1157
    invoke-virtual {v11, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ll/᩵ۧܺ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 1158
    invoke-static {v6, v8}, Ljava/util/Arrays;->binarySearch([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v9

    if-gez v9, :cond_12

    const/16 v20, 0x0

    move-object/from16 v21, v1

    move/from16 v20, v9

    const/4 v1, 0x0

    .line 1160
    :goto_a
    array-length v9, v6

    if-ge v1, v9, :cond_13

    .line 1161
    aget-object v9, v6, v1

    invoke-virtual {v8, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_11

    move v9, v1

    goto :goto_b

    :cond_11
    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_12
    move-object/from16 v21, v1

    move/from16 v20, v9

    :cond_13
    move/from16 v9, v20

    :goto_b
    if-ltz v9, :cond_15

    .line 1168
    aget-short v1, v0, v9

    .line 1169
    aget-object v1, v3, v1

    if-eqz v1, :cond_15

    .line 1171
    array-length v8, v1

    const/4 v9, 0x0

    :goto_c
    if-ge v9, v8, :cond_15

    move-object/from16 v20, v0

    aget-object v0, v1, v9

    move-object/from16 v22, v1

    .line 1172
    instance-of v1, v0, Ll/۬۟ۡ;

    if-eqz v1, :cond_14

    .line 1173
    check-cast v0, Ll/۬۟ۡ;

    move-object/from16 v23, v0

    move-object/from16 v19, v3

    move-object/from16 v22, v6

    goto :goto_f

    :cond_14
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v0, v20

    move-object/from16 v1, v22

    goto :goto_c

    :cond_15
    move-object/from16 v20, v0

    goto :goto_d

    :cond_16
    move-object/from16 v20, v0

    move-object/from16 v21, v1

    :goto_d
    move-object/from16 v22, v6

    move-object/from16 v0, v20

    move-object/from16 v1, v21

    goto :goto_e

    :cond_17
    move-object/from16 v19, v0

    move-object/from16 v0, v20

    move-object/from16 v3, v23

    :goto_e
    move-object/from16 v20, v0

    move-object/from16 v21, v1

    move-object/from16 v23, v19

    move-object/from16 v19, v3

    :goto_f
    if-eqz v23, :cond_1a

    .line 1184
    invoke-interface/range {v23 .. v23}, Ll/۬۟ۡ;->serialize()Z

    move-result v0

    if-nez v0, :cond_18

    move/from16 v29, v7

    move-object/from16 v28, v24

    move-object/from16 v30, v25

    :goto_10
    move-object/from16 v13, v26

    goto/16 :goto_14

    .line 1188
    :cond_18
    invoke-interface/range {v23 .. v23}, Ll/۬۟ۡ;->ordinal()I

    move-result v6

    .line 1189
    invoke-interface/range {v23 .. v23}, Ll/۬۟ۡ;->serialzeFeatures()[Ll/᩷ۧܺ;

    move-result-object v0

    invoke-static {v0}, Ll/᩷ۧܺ;->֫([Ll/᩷ۧܺ;)I

    move-result v8

    .line 1191
    invoke-interface/range {v23 .. v23}, Ll/۬۟ۡ;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_19

    .line 1192
    invoke-interface/range {v23 .. v23}, Ll/۬۟ۡ;->name()Ljava/lang/String;

    move-result-object v11

    .line 1202
    invoke-static {v10, v4, v7}, Ll/᩵ۧܺ;->֫(Ljava/lang/Class;Ljava/lang/reflect/Member;I)V

    .line 1203
    new-instance v9, Ll/ܺۧܺ;

    const/4 v5, 0x0

    const/16 v27, 0x0

    const/4 v3, 0x0

    move-object v0, v9

    move-object v1, v11

    move-object v2, v4

    move-object/from16 v4, p0

    move-object/from16 v28, v24

    move/from16 v29, v7

    move v7, v8

    move-object/from16 v30, v25

    move-object/from16 v8, v23

    move-object v13, v9

    move-object/from16 v9, v27

    invoke-direct/range {v0 .. v9}, Ll/ܺۧܺ;-><init>(Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/Class;Ljava/lang/reflect/Type;IILl/۬۟ۡ;Ll/۬۟ۡ;)V

    invoke-interface {v14, v11, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_10

    :cond_19
    move/from16 v29, v7

    move-object/from16 v28, v24

    move-object/from16 v30, v25

    goto :goto_11

    :cond_1a
    move/from16 v29, v7

    move-object/from16 v28, v24

    move-object/from16 v30, v25

    const/4 v8, 0x0

    const/4 v6, 0x0

    .line 1209
    :goto_11
    invoke-virtual {v11, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_25

    .line 1210
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-lt v0, v1, :cond_24

    const-string v0, "getClass"

    .line 1211
    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1b

    :goto_12
    goto :goto_10

    :cond_1b
    const/4 v0, 0x3

    .line 1216
    invoke-virtual {v11, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 1219
    invoke-static {v2}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v3

    if-eqz v3, :cond_1c

    .line 1223
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_13

    :cond_1c
    const/16 v0, 0x5f

    if-ne v2, v0, :cond_1d

    .line 1226
    invoke-virtual {v11, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_13

    :cond_1d
    const/16 v0, 0x66

    if-ne v2, v0, :cond_1e

    const/4 v0, 0x3

    .line 1228
    invoke-virtual {v11, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_13

    .line 1229
    :cond_1e
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v2, 0x5

    if-lt v0, v2, :cond_24

    invoke-virtual {v11, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v0

    if-eqz v0, :cond_24

    const/4 v0, 0x3

    .line 1230
    invoke-virtual {v11, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩵ۧܺ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1235
    :goto_13
    invoke-static {v10, v12, v0}, Ll/᩵ۧܺ;->֫(Ljava/lang/Class;Ll/۫۟ۡ;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1f

    goto :goto_12

    :cond_1f
    move-object/from16 v13, v26

    .line 1239
    invoke-static {v10, v0, v13, v15}, Ll/᩵ۧܺ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/reflect/Field;Ljava/util/HashMap;)Ljava/lang/reflect/Field;

    move-result-object v3

    if-eqz v3, :cond_21

    .line 1242
    invoke-virtual {v3, v5}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    check-cast v1, Ll/۬۟ۡ;

    if-eqz v1, :cond_22

    .line 1245
    invoke-interface {v1}, Ll/۬۟ۡ;->serialize()Z

    move-result v2

    if-nez v2, :cond_20

    :goto_14
    move-object v11, v13

    move-object/from16 v6, v28

    move/from16 v7, v29

    move-object/from16 v13, p4

    goto/16 :goto_1b

    .line 1249
    :cond_20
    invoke-interface {v1}, Ll/۬۟ۡ;->ordinal()I

    move-result v6

    .line 1250
    invoke-interface {v1}, Ll/۬۟ۡ;->serialzeFeatures()[Ll/᩷ۧܺ;

    move-result-object v2

    invoke-static {v2}, Ll/᩷ۧܺ;->֫([Ll/᩷ۧܺ;)I

    move-result v8

    .line 1252
    invoke-interface {v1}, Ll/۬۟ۡ;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_22

    .line 1253
    invoke-interface {v1}, Ll/۬۟ۡ;->name()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    goto :goto_15

    :cond_21
    move-object/from16 v1, v18

    :cond_22
    const/4 v2, 0x0

    :goto_15
    move-object v9, v1

    move/from16 v24, v6

    move/from16 v25, v8

    move-object/from16 v8, v28

    if-eqz v8, :cond_23

    if-nez v2, :cond_23

    .line 1267
    invoke-virtual {v8, v0}, Ll/ۙ۟ۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_23
    move-object v8, v0

    move/from16 v7, v29

    .line 1277
    invoke-static {v10, v4, v7}, Ll/᩵ۧܺ;->֫(Ljava/lang/Class;Ljava/lang/reflect/Member;I)V

    .line 1278
    new-instance v7, Ll/ܺۧܺ;

    const/4 v6, 0x0

    const/16 v26, 0x3

    move-object v0, v7

    move-object v1, v8

    move-object v2, v4

    move-object/from16 v31, v4

    move-object/from16 v4, p0

    move-object/from16 v32, v5

    move-object v5, v6

    move/from16 v6, v24

    move-object/from16 v33, v7

    move/from16 v7, v25

    move-object/from16 v34, v8

    move-object/from16 v8, v23

    invoke-direct/range {v0 .. v9}, Ll/ܺۧܺ;-><init>(Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/Class;Ljava/lang/reflect/Type;IILl/۬۟ۡ;Ll/۬۟ۡ;)V

    move-object/from16 v0, v33

    move-object/from16 v1, v34

    invoke-interface {v14, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move/from16 v8, v25

    goto :goto_16

    :cond_24
    move-object/from16 v13, p4

    move-object/from16 v11, v26

    goto/16 :goto_1a

    :cond_25
    move-object/from16 v31, v4

    move-object/from16 v32, v5

    move-object/from16 v13, v26

    const/16 v26, 0x3

    :goto_16
    const/4 v0, 0x3

    const-string v1, "is"

    .line 1283
    invoke-virtual {v11, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2f

    .line 1284
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v1, v0, :cond_26

    goto/16 :goto_19

    :cond_26
    const/4 v1, 0x2

    .line 1288
    invoke-virtual {v11, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 1291
    invoke-static {v2}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v3

    if-eqz v3, :cond_27

    .line 1295
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_17

    :cond_27
    const/16 v3, 0x5f

    if-ne v2, v3, :cond_28

    .line 1298
    invoke-virtual {v11, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_17

    :cond_28
    const/16 v0, 0x66

    if-ne v2, v0, :cond_2f

    .line 1300
    invoke-virtual {v11, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 1305
    :goto_17
    invoke-static {v10, v12, v0}, Ll/᩵ۧܺ;->֫(Ljava/lang/Class;Ll/۫۟ۡ;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_29

    goto/16 :goto_19

    .line 1309
    :cond_29
    invoke-static {v10, v0, v13, v15}, Ll/᩵ۧܺ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/reflect/Field;Ljava/util/HashMap;)Ljava/lang/reflect/Field;

    move-result-object v1

    if-nez v1, :cond_2a

    .line 1312
    invoke-static {v10, v11, v13, v15}, Ll/᩵ۧܺ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/reflect/Field;Ljava/util/HashMap;)Ljava/lang/reflect/Field;

    move-result-object v1

    :cond_2a
    move-object v3, v1

    if-eqz v3, :cond_2d

    move-object/from16 v11, v32

    .line 1317
    invoke-virtual {v3, v11}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    check-cast v1, Ll/۬۟ۡ;

    if-eqz v1, :cond_2c

    .line 1320
    invoke-interface {v1}, Ll/۬۟ۡ;->serialize()Z

    move-result v2

    if-nez v2, :cond_2b

    goto :goto_19

    .line 1324
    :cond_2b
    invoke-interface {v1}, Ll/۬۟ۡ;->ordinal()I

    move-result v6

    .line 1325
    invoke-interface {v1}, Ll/۬۟ۡ;->serialzeFeatures()[Ll/᩷ۧܺ;

    move-result-object v2

    invoke-static {v2}, Ll/᩷ۧܺ;->֫([Ll/᩷ۧܺ;)I

    move-result v8

    .line 1327
    invoke-interface {v1}, Ll/۬۟ۡ;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_2c

    .line 1328
    invoke-interface {v1}, Ll/۬۟ۡ;->name()Ljava/lang/String;

    move-result-object v0

    :cond_2c
    move-object v9, v1

    move v7, v8

    move-object v11, v13

    goto :goto_18

    :cond_2d
    move v7, v8

    move-object v11, v13

    move-object/from16 v9, v18

    :goto_18
    move-object/from16 v13, p4

    if-eqz v13, :cond_2e

    .line 1341
    invoke-virtual {v13, v0}, Ll/ۙ۟ۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_2e
    move/from16 v5, p1

    move-object v8, v0

    .line 1351
    invoke-static {v10, v3, v5}, Ll/᩵ۧܺ;->֫(Ljava/lang/Class;Ljava/lang/reflect/Member;I)V

    move-object/from16 v4, v31

    .line 1352
    invoke-static {v10, v4, v5}, Ll/᩵ۧܺ;->֫(Ljava/lang/Class;Ljava/lang/reflect/Member;I)V

    .line 1353
    new-instance v2, Ll/ܺۧܺ;

    const/16 v24, 0x0

    move-object v0, v2

    move-object v1, v8

    move-object/from16 v35, v2

    move-object v2, v4

    move-object/from16 v4, p0

    move-object/from16 v5, v24

    move-object/from16 v36, v8

    move-object/from16 v8, v23

    invoke-direct/range {v0 .. v9}, Ll/ܺۧܺ;-><init>(Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/Class;Ljava/lang/reflect/Type;IILl/۬۟ۡ;Ll/۬۟ۡ;)V

    move-object/from16 v0, v35

    move-object/from16 v1, v36

    invoke-interface {v14, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1a

    :cond_2f
    :goto_19
    move-object v11, v13

    move-object/from16 v13, p4

    :goto_1a
    move/from16 v7, p1

    move-object v6, v13

    :goto_1b
    move-object v9, v11

    move-object/from16 v3, v19

    move-object/from16 v0, v20

    move-object/from16 v1, v21

    move-object/from16 v2, v22

    move-object/from16 v8, v30

    move/from16 v11, p1

    goto/16 :goto_3

    :cond_30
    move-object v11, v5

    move-object/from16 v30, v8

    move-object v0, v9

    move-object v8, v6

    .line 1362
    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1363
    array-length v2, v0

    const/4 v3, 0x0

    :goto_1c
    if-ge v3, v2, :cond_34

    aget-object v4, v0, v3

    .line 1364
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v5

    and-int/lit8 v5, v5, 0x8

    if-eqz v5, :cond_31

    goto :goto_1d

    .line 1368
    :cond_31
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "this$0"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_32

    goto :goto_1d

    .line 1372
    :cond_32
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v5

    and-int/lit8 v5, v5, 0x1

    if-eqz v5, :cond_33

    .line 1373
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_33
    :goto_1d
    add-int/lit8 v3, v3, 0x1

    goto :goto_1c

    .line 1377
    :cond_34
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    :goto_1e
    if-eqz v0, :cond_38

    move-object/from16 v2, v30

    if-eq v0, v2, :cond_38

    .line 1378
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_1f
    if-ge v5, v4, :cond_37

    aget-object v6, v3, v5

    .line 1379
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v9

    and-int/lit8 v9, v9, 0x8

    if-eqz v9, :cond_35

    goto :goto_20

    .line 1383
    :cond_35
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v9

    and-int/lit8 v9, v9, 0x1

    if-eqz v9, :cond_36

    .line 1384
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_36
    :goto_20
    add-int/lit8 v5, v5, 0x1

    goto :goto_1f

    .line 1377
    :cond_37
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    move-object/from16 v30, v2

    goto :goto_1e

    .line 1390
    :cond_38
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_21
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3e

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/reflect/Field;

    .line 1391
    invoke-virtual {v3, v11}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ll/۬۟ۡ;

    .line 1394
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    if-eqz v9, :cond_3b

    .line 1396
    invoke-interface {v9}, Ll/۬۟ۡ;->serialize()Z

    move-result v1

    if-nez v1, :cond_39

    goto :goto_21

    .line 1400
    :cond_39
    invoke-interface {v9}, Ll/۬۟ۡ;->ordinal()I

    move-result v1

    .line 1401
    invoke-interface {v9}, Ll/۬۟ۡ;->serialzeFeatures()[Ll/᩷ۧܺ;

    move-result-object v2

    invoke-static {v2}, Ll/᩷ۧܺ;->֫([Ll/᩷ۧܺ;)I

    move-result v2

    .line 1403
    invoke-interface {v9}, Ll/۬۟ۡ;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_3a

    .line 1404
    invoke-interface {v9}, Ll/۬۟ۡ;->name()Ljava/lang/String;

    move-result-object v0

    :cond_3a
    move v6, v1

    move v15, v2

    goto :goto_22

    :cond_3b
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v15, 0x0

    :goto_22
    if-eqz v8, :cond_3c

    .line 1416
    invoke-virtual {v8, v0}, Ll/ۙ۟ۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_3c
    move-object v5, v0

    .line 1419
    invoke-interface {v14, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3d

    .line 1420
    invoke-static {v10, v3, v7}, Ll/᩵ۧܺ;->֫(Ljava/lang/Class;Ljava/lang/reflect/Member;I)V

    .line 1421
    new-instance v7, Ll/ܺۧܺ;

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/4 v2, 0x0

    move-object v0, v7

    move-object v1, v5

    move-object/from16 v4, p0

    move-object/from16 v37, v5

    move-object/from16 v5, v16

    move-object/from16 v38, v7

    move v7, v15

    move-object/from16 v24, v8

    move-object/from16 v8, v17

    invoke-direct/range {v0 .. v9}, Ll/ܺۧܺ;-><init>(Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/Class;Ljava/lang/reflect/Type;IILl/۬۟ۡ;Ll/۬۟ۡ;)V

    move-object/from16 v0, v37

    move-object/from16 v1, v38

    invoke-interface {v14, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_23

    :cond_3d
    move-object/from16 v24, v8

    :goto_23
    move/from16 v7, p1

    move-object/from16 v8, v24

    goto :goto_21

    .line 1435
    :cond_3e
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz v12, :cond_42

    .line 1441
    invoke-interface/range {p2 .. p2}, Ll/۫۟ۡ;->orders()[Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_41

    .line 1443
    array-length v2, v1

    invoke-interface {v14}, Ljava/util/Map;->size()I

    move-result v3

    if-ne v2, v3, :cond_41

    .line 1445
    array-length v2, v1

    const/4 v3, 0x0

    :goto_24
    if-ge v3, v2, :cond_40

    aget-object v4, v1, v3

    .line 1446
    invoke-interface {v14, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3f

    goto :goto_25

    :cond_3f
    add-int/lit8 v3, v3, 0x1

    goto :goto_24

    :cond_40
    const/4 v2, 0x1

    goto :goto_26

    :cond_41
    :goto_25
    move-object/from16 v18, v1

    :cond_42
    const/4 v2, 0x0

    move-object/from16 v1, v18

    :goto_26
    if-eqz v2, :cond_43

    .line 1457
    array-length v2, v1

    const/4 v3, 0x0

    :goto_27
    if-ge v3, v2, :cond_45

    aget-object v4, v1, v3

    .line 1458
    invoke-virtual {v14, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܺۧܺ;

    .line 1459
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_27

    .line 1462
    :cond_43
    invoke-virtual {v14}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_28
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_44

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܺۧܺ;

    .line 1463
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_28

    :cond_44
    if-eqz p3, :cond_45

    .line 1467
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    :cond_45
    return-object v0
.end method

.method public static ֫(Ljava/lang/reflect/Method;Ljava/lang/Class;)Ll/۬۟ۡ;
    .locals 13

    .line 1475
    invoke-virtual {p1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    const-class v3, Ll/۬۟ۡ;

    if-ge v2, v1, :cond_6

    aget-object v4, v0, v2

    .line 1476
    invoke-virtual {v4}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_5

    aget-object v7, v4, v6

    .line 1477
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_0

    goto :goto_3

    .line 1481
    :cond_0
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v8

    .line 1482
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v9

    .line 1483
    array-length v10, v8

    array-length v11, v9

    if-eq v10, v11, :cond_1

    goto :goto_3

    :cond_1
    const/4 v10, 0x0

    .line 1488
    :goto_2
    array-length v11, v8

    if-ge v10, v11, :cond_3

    .line 1489
    aget-object v11, v8, v10

    aget-object v12, v9, v10

    invoke-virtual {v11, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    .line 1499
    :cond_3
    invoke-virtual {v7, v3}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v7

    check-cast v7, Ll/۬۟ۡ;

    if-eqz v7, :cond_4

    return-object v7

    :cond_4
    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1506
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p1

    if-nez p1, :cond_7

    goto :goto_7

    .line 1511
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Class;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 1512
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    .line 1514
    invoke-virtual {p1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object p1

    array-length v1, p1

    const/4 v2, 0x0

    :goto_4
    if-ge v2, v1, :cond_d

    aget-object v4, p1, v2

    .line 1515
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v5

    .line 1516
    array-length v6, v5

    array-length v7, v0

    if-eq v6, v7, :cond_8

    goto :goto_6

    .line 1519
    :cond_8
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_9

    goto :goto_6

    :cond_9
    const/4 v6, 0x0

    .line 1523
    :goto_5
    array-length v7, v0

    if-ge v6, v7, :cond_b

    .line 1524
    aget-object v7, v5, v6

    aget-object v8, v0, v6

    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a

    goto :goto_6

    :cond_a
    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    .line 1534
    :cond_b
    invoke-virtual {v4, v3}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v4

    check-cast v4, Ll/۬۟ۡ;

    if-eqz v4, :cond_c

    return-object v4

    :cond_c
    :goto_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_d
    :goto_7
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 1

    .line 1928
    sget-object v0, Ll/᩵ۧܺ;->ܺ:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1, p0}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ljava/lang/Class;Ljava/lang/reflect/Member;I)V
    .locals 2

    if-eqz p1, :cond_3

    .line 1619
    sget-boolean v0, Ll/᩵ۧܺ;->ۖ:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 1625
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p0

    const/4 v0, 0x1

    if-eqz p0, :cond_1

    .line 1627
    const-class v1, Ljava/lang/Object;

    if-ne p0, v1, :cond_2

    .line 1628
    :cond_1
    invoke-interface {p1}, Ljava/lang/reflect/Member;->getModifiers()I

    move-result p0

    and-int/2addr p0, v0

    if-eqz p0, :cond_2

    and-int/lit8 p0, p2, 0x1

    if-eqz p0, :cond_2

    goto :goto_0

    .line 1634
    :cond_2
    check-cast p1, Ljava/lang/reflect/AccessibleObject;

    .line 1637
    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/security/AccessControlException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p0, 0x0

    .line 1640
    sput-boolean p0, Ll/᩵ۧܺ;->ۖ:Z

    :cond_3
    :goto_0
    return-void
.end method

.method public static ֫(Ljava/lang/Class;Ll/۫۟ۡ;Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 1545
    invoke-interface {p1}, Ll/۫۟ۡ;->ignores()[Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 1546
    invoke-interface {p1}, Ll/۫۟ۡ;->ignores()[Ljava/lang/String;

    move-result-object p1

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    .line 1547
    invoke-virtual {p2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1553
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p0

    .line 1554
    const-class p1, Ljava/lang/Object;

    if-eq p0, p1, :cond_2

    if-eqz p0, :cond_2

    const-class p1, Ll/۫۟ۡ;

    .line 1557
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object p1

    check-cast p1, Ll/۫۟ۡ;

    .line 1556
    invoke-static {p0, p1, p2}, Ll/᩵ۧܺ;->֫(Ljava/lang/Class;Ll/۫۟ۡ;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2

    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_2
    return v0
.end method

.method public static ֫([Ljava/lang/reflect/Type;[Ljava/lang/reflect/TypeVariable;[Ljava/lang/reflect/Type;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p2, :cond_5

    .line 1750
    array-length v1, p1

    if-nez v1, :cond_0

    goto :goto_3

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1755
    :goto_0
    array-length v2, p0

    if-ge v0, v2, :cond_4

    .line 1756
    aget-object v2, p0, v0

    .line 1757
    instance-of v3, v2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v3, :cond_1

    .line 1758
    check-cast v2, Ljava/lang/reflect/ParameterizedType;

    .line 1759
    invoke-interface {v2}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v3

    .line 1760
    invoke-static {v3, p1, p2}, Ll/᩵ۧܺ;->֫([Ljava/lang/reflect/Type;[Ljava/lang/reflect/TypeVariable;[Ljava/lang/reflect/Type;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 1762
    new-instance v1, Ll/ᩴۧܺ;

    invoke-interface {v2}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-interface {v2}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-direct {v1, v3, v4, v2}, Ll/ᩴۧܺ;-><init>([Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V

    aput-object v1, p0, v0

    const/4 v1, 0x1

    goto :goto_2

    .line 1765
    :cond_1
    instance-of v3, v2, Ljava/lang/reflect/TypeVariable;

    if-eqz v3, :cond_3

    const/4 v3, 0x0

    .line 1766
    :goto_1
    array-length v4, p1

    if-ge v3, v4, :cond_3

    .line 1767
    aget-object v4, p1, v3

    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 1768
    aget-object v1, p2, v3

    aput-object v1, p0, v0

    const/4 v1, 0x1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return v1

    :cond_5
    :goto_3
    return v0
.end method

.method public static final ۜ(Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 456
    :cond_0
    instance-of v1, p0, Ljava/lang/Integer;

    if-eqz v1, :cond_1

    .line 457
    check-cast p0, Ljava/lang/Integer;

    return-object p0

    .line 460
    :cond_1
    instance-of v1, p0, Ljava/math/BigDecimal;

    if-eqz v1, :cond_3

    .line 461
    check-cast p0, Ljava/math/BigDecimal;

    .line 463
    invoke-virtual {p0}, Ljava/math/BigDecimal;->scale()I

    move-result v0

    const/16 v1, -0x64

    if-lt v0, v1, :cond_2

    const/16 v1, 0x64

    if-gt v0, v1, :cond_2

    .line 465
    invoke-virtual {p0}, Ljava/math/BigDecimal;->intValue()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    .line 468
    :cond_2
    invoke-virtual {p0}, Ljava/math/BigDecimal;->intValueExact()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    .line 471
    :cond_3
    instance-of v1, p0, Ljava/lang/Number;

    if-eqz v1, :cond_4

    .line 472
    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    .line 475
    :cond_4
    instance-of v1, p0, Ljava/lang/String;

    if-eqz v1, :cond_7

    .line 476
    check-cast p0, Ljava/lang/String;

    .line 477
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_6

    const-string v1, "null"

    .line 478
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_0

    .line 482
    :cond_5
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_6
    :goto_0
    return-object v0

    .line 485
    :cond_7
    new-instance v0, Ll/ܶ۟ۡ;

    const-string v1, "can not cast to int, value : "

    .line 0
    invoke-static {p0, v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 25
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 485
    throw v0
.end method

.method public static final ۢ(Ljava/lang/Object;)Ljava/lang/Short;
    .locals 2

    .line 230
    instance-of v0, p0, Ljava/lang/Number;

    if-eqz v0, :cond_0

    .line 231
    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->shortValue()S

    move-result p0

    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p0

    return-object p0

    .line 234
    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 235
    check-cast p0, Ljava/lang/String;

    .line 236
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "null"

    .line 237
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 241
    :cond_1
    invoke-static {p0}, Ljava/lang/Short;->parseShort(Ljava/lang/String;)S

    move-result p0

    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0

    .line 244
    :cond_3
    new-instance v0, Ll/ܶ۟ۡ;

    const-string v1, "can not cast to short, value : "

    .line 0
    invoke-static {p0, v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 25
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 244
    throw v0
.end method

.method public static ۧ(Ljava/lang/String;)J
    .locals 5

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    const-wide v0, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    const/4 v2, 0x0

    .line 1910
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_4

    .line 1911
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x5f

    if-eq v3, v4, :cond_3

    const/16 v4, 0x2d

    if-ne v3, v4, :cond_1

    goto :goto_1

    :cond_1
    const/16 v4, 0x41

    if-lt v3, v4, :cond_2

    const/16 v4, 0x5a

    if-gt v3, v4, :cond_2

    add-int/lit8 v3, v3, 0x20

    int-to-char v3, v3

    :cond_2
    int-to-long v3, v3

    xor-long/2addr v0, v3

    const-wide v3, 0x100000001b3L

    mul-long v0, v0, v3

    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    return-wide v0
.end method

.method public static final ۧ(Ljava/util/Map;Ljava/lang/Class;Ll/᩻֫ܺ;)Ljava/lang/Object;
    .locals 5

    const-string v0, " not found"

    .line 858
    :try_start_0
    const-class v1, Ljava/lang/StackTraceElement;

    const/4 v2, 0x0

    if-ne p1, v1, :cond_2

    const-string p1, "className"

    .line 859
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string p2, "methodName"

    .line 860
    invoke-interface {p0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const-string v0, "fileName"

    .line 861
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "lineNumber"

    .line 864
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    if-nez p0, :cond_0

    goto :goto_0

    .line 867
    :cond_0
    instance-of v1, p0, Ljava/math/BigDecimal;

    if-eqz v1, :cond_1

    .line 868
    check-cast p0, Ljava/math/BigDecimal;

    invoke-virtual {p0}, Ljava/math/BigDecimal;->intValueExact()I

    move-result v2

    goto :goto_0

    .line 870
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 874
    :goto_0
    new-instance p0, Ljava/lang/StackTraceElement;

    invoke-direct {p0, p1, p2, v0, v2}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-object p0

    :cond_2
    const-string v1, "@type"

    .line 878
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 879
    instance-of v3, v1, Ljava/lang/String;

    const/4 v4, 0x0

    if-eqz v3, :cond_5

    .line 880
    check-cast v1, Ljava/lang/String;

    if-nez p2, :cond_3

    .line 883
    sget-object p2, Ll/᩻֫ܺ;->ᩳ:Ll/᩻֫ܺ;

    .line 886
    :cond_3
    invoke-virtual {p2, v1, v2, v4}, Ll/᩻֫ܺ;->֫(Ljava/lang/String;ILjava/lang/Class;)Ljava/lang/Class;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 892
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 893
    invoke-static {p0, v3, p2}, Ll/᩵ۧܺ;->ۧ(Ljava/util/Map;Ljava/lang/Class;Ll/᩻֫ܺ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 889
    :cond_4
    new-instance p0, Ljava/lang/ClassNotFoundException;

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/ClassNotFoundException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 898
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 901
    instance-of v0, p0, Ll/᩸۟ۡ;

    if-eqz v0, :cond_6

    .line 902
    check-cast p0, Ll/᩸۟ۡ;

    goto :goto_1

    .line 904
    :cond_6
    new-instance v0, Ll/᩸۟ۡ;

    invoke-direct {v0, p0}, Ll/᩸۟ۡ;-><init>(Ljava/util/Map;)V

    move-object p0, v0

    :goto_1
    if-nez p2, :cond_7

    .line 197
    sget-object p2, Ll/᩻֫ܺ;->ᩳ:Ll/᩻֫ܺ;

    .line 911
    :cond_7
    invoke-virtual {p2, p1}, Ll/᩻֫ܺ;->֫(Ljava/lang/reflect/Type;)Ll/᩵֫ܺ;

    move-result-object p2

    if-eqz p2, :cond_8

    .line 913
    invoke-static {p0}, Ll/ۚ۟ۡ;->ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 176
    sget-object p2, Ll/᩻֫ܺ;->ᩳ:Ll/᩻֫ܺ;

    sget v0, Ll/ۚ۟ۡ;->᩹:I

    .line 231
    new-instance v1, Ll/ۨ۟ۡ;

    invoke-direct {v1, p0, p2, v0}, Ll/ۨ۟ۡ;-><init>(Ljava/lang/String;Ll/᩻֫ܺ;I)V

    .line 677
    invoke-virtual {v1, v4, p1}, Ll/ۨ۟ۡ;->֫(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p0

    .line 247
    invoke-virtual {v1}, Ll/ۨ۟ۡ;->ᩳ()V

    .line 249
    invoke-virtual {v1}, Ll/ۨ۟ۡ;->close()V

    return-object p0

    .line 917
    :cond_8
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object p2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Class;

    aput-object p1, v0, v2

    invoke-static {p2, v0, p0}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 921
    :cond_9
    const-class v0, Ljava/lang/String;

    if-ne p1, v0, :cond_a

    instance-of v0, p0, Ll/᩸۟ۡ;

    if-eqz v0, :cond_a

    .line 922
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_a
    if-nez p2, :cond_b

    .line 926
    sget-object p2, Ll/᩻֫ܺ;->ᩳ:Ll/᩻֫ܺ;

    .line 930
    :cond_b
    invoke-virtual {p2, p1}, Ll/᩻֫ܺ;->֫(Ljava/lang/reflect/Type;)Ll/᩵֫ܺ;

    move-result-object p1

    .line 931
    instance-of v0, p1, Ll/֫֫ܺ;

    if-eqz v0, :cond_c

    .line 932
    move-object v4, p1

    check-cast v4, Ll/֫֫ܺ;

    :cond_c
    if-eqz v4, :cond_d

    .line 939
    invoke-virtual {v4, p0, p2}, Ll/֫֫ܺ;->֫(Ljava/util/Map;Ll/᩻֫ܺ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 936
    :cond_d
    new-instance p0, Ll/ܶ۟ۡ;

    const-string p1, "can not get javaBeanDeserializer"

    .line 25
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 936
    throw p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    .line 941
    new-instance p1, Ll/ܶ۟ۡ;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    .line 29
    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 941
    throw p1
.end method

.method public static ۧ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/reflect/Field;Ljava/util/HashMap;)Ljava/lang/reflect/Field;
    .locals 7

    .line 1668
    array-length v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v3, p2, v2

    .line 1669
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    .line 1670
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    .line 1675
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v6, 0x2

    if-le v5, v6, :cond_1

    .line 1676
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x61

    if-lt v5, v6, :cond_1

    const/16 v6, 0x7a

    if-gt v5, v6, :cond_1

    const/4 v5, 0x1

    .line 1677
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x41

    if-lt v5, v6, :cond_1

    const/16 v6, 0x5a

    if-gt v5, v6, :cond_1

    .line 1678
    invoke-virtual {p1, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    :goto_1
    return-object v3

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1683
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p0

    if-eqz p0, :cond_5

    .line 1685
    const-class p2, Ljava/lang/Object;

    if-ne p0, p2, :cond_3

    goto :goto_2

    .line 1689
    :cond_3
    invoke-virtual {p3, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/reflect/Field;

    if-nez p2, :cond_4

    .line 1691
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object p2

    .line 1693
    invoke-virtual {p3, p0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1697
    :cond_4
    invoke-static {p0, p1, p2, p3}, Ll/᩵ۧܺ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/reflect/Field;Ljava/util/HashMap;)Ljava/lang/reflect/Field;

    move-result-object p0

    return-object p0

    :cond_5
    :goto_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 4

    .line 1703
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_0

    .line 1704
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object p0

    const/4 v0, 0x0

    aget-object p0, p0, v0

    .line 1706
    instance-of v1, p0, Ljava/lang/reflect/WildcardType;

    if-eqz v1, :cond_2

    .line 1707
    move-object v1, p0

    check-cast v1, Ljava/lang/reflect/WildcardType;

    .line 1708
    invoke-interface {v1}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v1

    .line 1709
    array-length v2, v1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_2

    .line 1710
    aget-object p0, v1, v0

    goto :goto_0

    .line 1715
    :cond_0
    instance-of v0, p0, Ljava/lang/Class;

    if-eqz v0, :cond_1

    check-cast p0, Ljava/lang/Class;

    .line 1716
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "java."

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1717
    invoke-virtual {p0}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object p0

    .line 1718
    invoke-static {p0}, Ll/᩵ۧܺ;->ۧ(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :cond_2
    :goto_0
    if-nez p0, :cond_3

    .line 1722
    const-class p0, Ljava/lang/Object;

    :cond_3
    return-object p0
.end method

.method public static final ۧ(Ljava/lang/Object;)Ljava/math/BigInteger;
    .locals 2

    .line 274
    instance-of v0, p0, Ljava/math/BigInteger;

    if-eqz v0, :cond_0

    .line 275
    check-cast p0, Ljava/math/BigInteger;

    return-object p0

    .line 278
    :cond_0
    instance-of v0, p0, Ljava/lang/Float;

    if-nez v0, :cond_4

    instance-of v0, p0, Ljava/lang/Double;

    if-eqz v0, :cond_1

    goto :goto_1

    .line 282
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 283
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "null"

    .line 284
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 288
    :cond_2
    new-instance v0, Ljava/math/BigInteger;

    invoke-direct {v0, p0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_3
    :goto_0
    const/4 p0, 0x0

    return-object p0

    .line 279
    :cond_4
    :goto_1
    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/Class;)[Ljava/lang/String;
    .locals 6

    .line 118
    sget-object v0, Ll/᩵ۧܺ;->ܳ:Ljava/lang/reflect/Constructor;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_0

    sget-boolean v0, Ll/᩵ۧܺ;->ᩳ:Z

    if-nez v0, :cond_0

    :try_start_0
    const-string v0, "kotlin.reflect.jvm.internal.KClassImpl"

    .line 120
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    new-array v4, v2, [Ljava/lang/Class;

    .line 121
    const-class v5, Ljava/lang/Class;

    aput-object v5, v4, v1

    invoke-virtual {v0, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    sput-object v4, Ll/᩵ۧܺ;->ܳ:Ljava/lang/reflect/Constructor;

    const-string v4, "getConstructors"

    .line 122
    invoke-virtual {v0, v4, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Ll/᩵ۧܺ;->᩻:Ljava/lang/reflect/Method;

    .line 124
    const-class v0, Ll/ۛ᩶᩵;

    const-string v4, "getParameters"

    .line 125
    invoke-virtual {v0, v4, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Ll/᩵ۧܺ;->ۜ:Ljava/lang/reflect/Method;

    .line 127
    const-class v0, Ll/ۨ᩶᩵;

    const-string v4, "getName"

    .line 128
    invoke-virtual {v0, v4, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Ll/᩵ۧܺ;->᩷:Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 130
    :catchall_0
    sput-boolean v2, Ll/᩵ۧܺ;->ᩳ:Z

    .line 134
    :cond_0
    :goto_0
    sget-object v0, Ll/᩵ۧܺ;->ܳ:Ljava/lang/reflect/Constructor;

    if-nez v0, :cond_1

    goto :goto_1

    .line 138
    :cond_1
    sget-boolean v0, Ll/᩵ۧܺ;->ܿ:Z

    if-eqz v0, :cond_2

    :goto_1
    return-object v3

    .line 144
    :cond_2
    :try_start_1
    sget-object v0, Ll/᩵ۧܺ;->ܳ:Ljava/lang/reflect/Constructor;

    new-array v4, v2, [Ljava/lang/Object;

    aput-object p0, v4, v1

    invoke-virtual {v0, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 145
    sget-object v0, Ll/᩵ۧܺ;->᩻:Ljava/lang/reflect/Method;

    invoke-virtual {v0, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 146
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    move-object v0, v3

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    .line 147
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 148
    sget-object v5, Ll/᩵ۧܺ;->ۜ:Ljava/lang/reflect/Method;

    invoke-virtual {v5, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    if-eqz v0, :cond_3

    .line 149
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-nez v5, :cond_3

    goto :goto_3

    :cond_3
    move-object v0, v4

    .line 146
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    goto :goto_2

    .line 155
    :cond_4
    sget-object p0, Ll/᩵ۧܺ;->ۜ:Ljava/lang/reflect/Method;

    invoke-virtual {p0, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    .line 156
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    .line 157
    :goto_4
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_5

    .line 158
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 159
    sget-object v5, Ll/᩵ۧܺ;->᩷:Ljava/lang/reflect/Method;

    invoke-virtual {v5, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    aput-object v4, v0, v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_5
    return-object v0

    .line 163
    :catchall_1
    sput-boolean v2, Ll/᩵ۧܺ;->ܿ:Z

    return-object v3
.end method

.method public static final ܳ(Ljava/lang/Object;)Ljava/lang/Double;
    .locals 2

    .line 318
    instance-of v0, p0, Ljava/lang/Number;

    if-eqz v0, :cond_0

    .line 319
    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0

    .line 322
    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 323
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 324
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "null"

    .line 325
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "NULL"

    .line 326
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 330
    :cond_1
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0

    .line 333
    :cond_3
    new-instance v0, Ll/ܶ۟ۡ;

    const-string v1, "can not cast to double, value : "

    .line 0
    invoke-static {p0, v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 25
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 333
    throw v0
.end method

.method public static final ܽ(Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 505
    :cond_0
    instance-of v1, p0, Ljava/lang/Boolean;

    if-eqz v1, :cond_1

    .line 506
    check-cast p0, Ljava/lang/Boolean;

    return-object p0

    .line 509
    :cond_1
    instance-of v1, p0, Ljava/math/BigDecimal;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    .line 510
    check-cast p0, Ljava/math/BigDecimal;

    invoke-virtual {p0}, Ljava/math/BigDecimal;->intValueExact()I

    move-result p0

    if-ne p0, v3, :cond_2

    const/4 v2, 0x1

    :cond_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    .line 513
    :cond_3
    instance-of v1, p0, Ljava/lang/Number;

    if-eqz v1, :cond_5

    .line 514
    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    if-ne p0, v3, :cond_4

    const/4 v2, 0x1

    :cond_4
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    .line 517
    :cond_5
    instance-of v1, p0, Ljava/lang/String;

    if-eqz v1, :cond_b

    .line 518
    move-object v1, p0

    check-cast v1, Ljava/lang/String;

    .line 519
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_a

    const-string v2, "null"

    .line 520
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_1

    :cond_6
    const-string v0, "true"

    .line 524
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_9

    const-string v0, "1"

    .line 525
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_0

    :cond_7
    const-string v0, "false"

    .line 528
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_8

    const-string v0, "0"

    .line 529
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 530
    :cond_8
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    .line 526
    :cond_9
    :goto_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0

    :cond_a
    :goto_1
    return-object v0

    .line 534
    :cond_b
    new-instance v0, Ll/ܶ۟ۡ;

    const-string v1, "can not cast to int, value : "

    .line 0
    invoke-static {p0, v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 25
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 534
    throw v0
.end method

.method public static ܽ(Ljava/lang/String;)Ljava/lang/Class;
    .locals 1

    .line 986
    sget-object v0, Ll/᩵ۧܺ;->ܺ:Ll/ۧۤᩴ;

    invoke-virtual {v0, p0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Class;

    return-object p0
.end method

.method public static ܽ(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 1

    .line 1576
    instance-of v0, p0, Ljava/lang/Class;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/lang/Class;

    .line 1577
    invoke-virtual {p0}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object p0

    invoke-static {p0}, Ll/᩵ۧܺ;->ܽ(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static ܽ(Ljava/lang/Class;)Z
    .locals 1

    .line 64
    sget-object v0, Ll/᩵ۧܺ;->ۢ:Ljava/lang/Class;

    if-nez v0, :cond_0

    sget-boolean v0, Ll/᩵ۧܺ;->ۡ:Z

    if-nez v0, :cond_0

    .line 66
    :try_start_0
    const-class v0, Ll/ۢ۠᩵;

    sput-object v0, Ll/᩵ۧܺ;->ۢ:Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 v0, 0x1

    .line 68
    sput-boolean v0, Ll/᩵ۧܺ;->ۡ:Z

    .line 72
    :cond_0
    :goto_0
    sget-object v0, Ll/᩵ۧܺ;->ۢ:Ljava/lang/Class;

    if-nez v0, :cond_1

    const/4 p0, 0x0

    return p0

    .line 76
    :cond_1
    sget-object v0, Ll/᩵ۧܺ;->ۢ:Ljava/lang/Class;

    invoke-virtual {p0, v0}, Ljava/lang/Class;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result p0

    return p0
.end method

.method public static final ܿ(Ljava/lang/Object;)Ljava/util/Date;
    .locals 6

    .line 341
    instance-of v0, p0, Ljava/util/Calendar;

    if-eqz v0, :cond_0

    .line 342
    check-cast p0, Ljava/util/Calendar;

    invoke-virtual {p0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p0

    return-object p0

    .line 345
    :cond_0
    instance-of v0, p0, Ljava/util/Date;

    if-eqz v0, :cond_1

    .line 346
    check-cast p0, Ljava/util/Date;

    return-object p0

    .line 351
    :cond_1
    instance-of v0, p0, Ljava/math/BigDecimal;

    const-string v1, "can not cast to Date, value : "

    if-eqz v0, :cond_3

    .line 352
    move-object v0, p0

    check-cast v0, Ljava/math/BigDecimal;

    .line 353
    invoke-virtual {v0}, Ljava/math/BigDecimal;->scale()I

    move-result v2

    const/16 v3, -0x64

    if-lt v2, v3, :cond_2

    const/16 v3, 0x64

    if-gt v2, v3, :cond_2

    .line 355
    invoke-virtual {v0}, Ljava/math/BigDecimal;->longValue()J

    move-result-wide v2

    goto/16 :goto_2

    .line 357
    :cond_2
    invoke-virtual {v0}, Ljava/math/BigDecimal;->longValueExact()J

    move-result-wide v2

    goto/16 :goto_2

    .line 359
    :cond_3
    instance-of v0, p0, Ljava/lang/Number;

    if-eqz v0, :cond_4

    .line 360
    move-object v0, p0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    goto/16 :goto_2

    .line 361
    :cond_4
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_c

    .line 362
    move-object v0, p0

    check-cast v0, Ljava/lang/String;

    const/16 v2, 0x2d

    .line 364
    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_9

    .line 366
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p0

    sget-object v2, Ll/ۚ۟ۡ;->᩶:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-ne p0, v3, :cond_5

    goto :goto_0

    .line 368
    :cond_5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p0

    const/16 v2, 0xa

    if-ne p0, v2, :cond_6

    const-string v2, "yyyy-MM-dd"

    goto :goto_0

    .line 370
    :cond_6
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p0

    const/16 v2, 0x13

    if-ne p0, v2, :cond_7

    const-string v2, "yyyy-MM-dd HH:mm:ss"

    goto :goto_0

    .line 372
    :cond_7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p0

    const/16 v2, 0x1d

    if-ne p0, v2, :cond_8

    const/16 p0, 0x1a

    .line 373
    invoke-virtual {v0, p0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    const/16 v2, 0x3a

    if-ne p0, v2, :cond_8

    const/16 p0, 0x1c

    .line 374
    invoke-virtual {v0, p0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    const/16 v2, 0x30

    if-ne p0, v2, :cond_8

    const-string v2, "yyyy-MM-dd\'T\'HH:mm:ss.SSSXXX"

    goto :goto_0

    :cond_8
    const-string v2, "yyyy-MM-dd HH:mm:ss.SSS"

    .line 380
    :goto_0
    new-instance p0, Ljava/text/SimpleDateFormat;

    sget-object v3, Ll/ۚ۟ۡ;->ۙ:Ljava/util/Locale;

    invoke-direct {p0, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 381
    sget-object v2, Ll/ۚ۟ۡ;->ۗ:Ljava/util/TimeZone;

    invoke-virtual {p0, v2}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 383
    :try_start_0
    invoke-virtual {p0, v0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 385
    :catch_0
    new-instance p0, Ll/ܶ۟ۡ;

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 25
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 385
    throw p0

    .line 389
    :cond_9
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_b

    const-string v2, "null"

    .line 390
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_1

    .line 394
    :cond_a
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    goto :goto_2

    :cond_b
    :goto_1
    const/4 p0, 0x0

    return-object p0

    :cond_c
    const-wide/16 v2, -0x1

    :goto_2
    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-ltz v0, :cond_d

    .line 401
    new-instance p0, Ljava/util/Date;

    invoke-direct {p0, v2, v3}, Ljava/util/Date;-><init>(J)V

    return-object p0

    .line 398
    :cond_d
    new-instance v0, Ll/ܶ۟ۡ;

    .line 0
    invoke-static {p0, v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 25
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 398
    throw v0
.end method

.method public static final ᩳ(Ljava/lang/Object;)Ljava/lang/Byte;
    .locals 2

    .line 182
    instance-of v0, p0, Ljava/lang/Number;

    if-eqz v0, :cond_0

    .line 183
    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->byteValue()B

    move-result p0

    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p0

    return-object p0

    .line 186
    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 187
    check-cast p0, Ljava/lang/String;

    .line 188
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "null"

    .line 189
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 193
    :cond_1
    invoke-static {p0}, Ljava/lang/Byte;->parseByte(Ljava/lang/String;)B

    move-result p0

    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0

    .line 196
    :cond_3
    new-instance v0, Ll/ܶ۟ۡ;

    const-string v1, "can not cast to byte, value : "

    .line 0
    invoke-static {p0, v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 25
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 196
    throw v0
.end method

.method public static ᩳ(Ljava/lang/String;)Ljava/lang/Class;
    .locals 6

    if-eqz p0, :cond_7

    .line 994
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 998
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x100

    if-ge v0, v1, :cond_6

    .line 1002
    sget-object v0, Ll/᩵ۧܺ;->ܺ:Ll/ۧۤᩴ;

    invoke-virtual {v0, p0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    if-eqz v1, :cond_1

    return-object v1

    :cond_1
    const/4 v2, 0x0

    .line 1008
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x5b

    const/4 v5, 0x1

    if-ne v3, v4, :cond_3

    .line 1009
    invoke-virtual {p0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩵ۧܺ;->ᩳ(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    if-nez p0, :cond_2

    goto :goto_0

    .line 1013
    :cond_2
    invoke-static {p0, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    return-object p0

    :cond_3
    const-string v2, "L"

    .line 1016
    invoke-virtual {p0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v2, ";"

    invoke-virtual {p0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 1017
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v5

    invoke-virtual {p0, v5, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 1018
    invoke-static {p0}, Ll/᩵ۧܺ;->ᩳ(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    return-object p0

    .line 1037
    :cond_4
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 1040
    invoke-virtual {v2, p0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 1054
    :catch_0
    :cond_5
    :try_start_1
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 1056
    invoke-virtual {v0, p0, v1}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-object v1

    .line 999
    :cond_6
    new-instance v0, Ll/ܶ۟ۡ;

    const-string v1, "className too long. "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 25
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 999
    throw v0

    :cond_7
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ᩳ(Ljava/lang/reflect/Type;)Z
    .locals 3

    .line 1562
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 1566
    :cond_0
    instance-of v0, p0, Ljava/lang/Class;

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 1567
    check-cast p0, Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object p0

    .line 1568
    const-class v0, Ljava/lang/Object;

    if-eq p0, v0, :cond_1

    .line 1569
    invoke-static {p0}, Ll/᩵ۧܺ;->ᩳ(Ljava/lang/reflect/Type;)Z

    move-result p0

    if-eqz p0, :cond_1

    return v1

    :cond_1
    return v2
.end method

.method public static final ᩷(Ljava/lang/Object;)Ljava/lang/Long;
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 409
    :cond_0
    instance-of v1, p0, Ljava/math/BigDecimal;

    if-eqz v1, :cond_2

    .line 410
    check-cast p0, Ljava/math/BigDecimal;

    .line 411
    invoke-virtual {p0}, Ljava/math/BigDecimal;->scale()I

    move-result v0

    const/16 v1, -0x64

    if-lt v0, v1, :cond_1

    const/16 v1, 0x64

    if-gt v0, v1, :cond_1

    .line 413
    invoke-virtual {p0}, Ljava/math/BigDecimal;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    .line 416
    :cond_1
    invoke-virtual {p0}, Ljava/math/BigDecimal;->longValueExact()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    .line 419
    :cond_2
    instance-of v1, p0, Ljava/lang/Number;

    if-eqz v1, :cond_3

    .line 420
    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    .line 423
    :cond_3
    instance-of v1, p0, Ljava/lang/String;

    if-eqz v1, :cond_7

    .line 424
    move-object v1, p0

    check-cast v1, Ljava/lang/String;

    .line 425
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_6

    const-string v2, "null"

    .line 426
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_0

    .line 431
    :cond_4
    :try_start_0
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    nop

    .line 436
    new-instance v2, Ll/۟۟ۡ;

    invoke-direct {v2, v1}, Ll/۟۟ۡ;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 438
    invoke-virtual {v2, v1}, Ll/۟۟ۡ;->ۧ(Z)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 439
    iget-object v0, v2, Ll/۟۟ۡ;->ۧ:Ljava/util/Calendar;

    .line 441
    :cond_5
    invoke-virtual {v2}, Ll/۟۟ۡ;->ۧ()V

    if-eqz v0, :cond_7

    .line 444
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    :cond_6
    :goto_0
    return-object v0

    .line 448
    :cond_7
    new-instance v0, Ll/ܶ۟ۡ;

    const-string v1, "can not cast to long, value : "

    .line 0
    invoke-static {p0, v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 25
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 448
    throw v0
.end method

.method public static final ᩻(Ljava/lang/Object;)Ljava/lang/Float;
    .locals 2

    .line 296
    instance-of v0, p0, Ljava/lang/Number;

    if-eqz v0, :cond_0

    .line 297
    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0

    .line 300
    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 301
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 302
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "null"

    .line 303
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 307
    :cond_1
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0

    .line 310
    :cond_3
    new-instance v0, Ll/ܶ۟ۡ;

    const-string v1, "can not cast to float, value : "

    .line 0
    invoke-static {p0, v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 25
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 310
    throw v0
.end method
