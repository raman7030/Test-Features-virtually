.class public final Ll/۫֫ܺ;
.super Ljava/lang/Object;
.source "LAUP"

# interfaces
.implements Ll/ܽۧܺ;
.implements Ll/᩵֫ܺ;


# static fields
.field public static ֫:Ll/۫֫ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 34
    new-instance v0, Ll/۫֫ܺ;

    .line 36
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 34
    sput-object v0, Ll/۫֫ܺ;->֫:Ll/۫֫ܺ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۨ۟ۡ;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 79
    iget-object v0, p1, Ll/ۨ۟ۡ;->ۛ:Ll/۟۟ۡ;

    .line 81
    invoke-virtual {v0}, Ll/۟۟ۡ;->ܶ()I

    move-result v1

    const/16 v2, 0x8

    const/4 v3, 0x0

    const/16 v4, 0x10

    if-ne v1, v2, :cond_0

    .line 83
    invoke-virtual {v0, v4}, Ll/۟۟ۡ;->ۧ(I)V

    return-object v3

    :cond_0
    const/4 v2, 0x2

    .line 88
    const-class v5, Ljava/lang/Long;

    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v1, v2, :cond_3

    if-eq p2, v6, :cond_2

    if-ne p2, v5, :cond_1

    goto :goto_0

    .line 94
    :cond_1
    :try_start_0
    invoke-virtual {v0}, Ll/۟۟ۡ;->ܿ()I

    move-result p1

    .line 95
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 97
    new-instance p2, Ll/ܶ۟ۡ;

    const-string v0, "int value overflow, field : "

    .line 0
    invoke-static {p3, v0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 29
    invoke-direct {p2, p3, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 97
    throw p2

    .line 90
    :cond_2
    :goto_0
    invoke-virtual {v0}, Ll/۟۟ۡ;->ۜ()J

    move-result-wide p1

    .line 91
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    .line 100
    :goto_1
    invoke-virtual {v0, v4}, Ll/۟۟ۡ;->ۧ(I)V

    return-object p1

    :cond_3
    const/4 v2, 0x3

    if-ne v1, v2, :cond_6

    .line 102
    invoke-virtual {v0}, Ll/۟۟ۡ;->ܽ()Ljava/math/BigDecimal;

    move-result-object p1

    .line 103
    invoke-virtual {v0, v4}, Ll/۟۟ۡ;->ۧ(I)V

    if-eq p2, v6, :cond_5

    if-ne p2, v5, :cond_4

    goto :goto_2

    .line 107
    :cond_4
    invoke-virtual {p1}, Ljava/math/BigDecimal;->intValueExact()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    .line 105
    :cond_5
    :goto_2
    invoke-virtual {p1}, Ljava/math/BigDecimal;->longValueExact()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    .line 1380
    :cond_6
    invoke-virtual {p1, v3}, Ll/ۨ۟ۡ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eq p2, v6, :cond_8

    if-ne p2, v5, :cond_7

    goto :goto_3

    .line 116
    :cond_7
    :try_start_1
    invoke-static {p1}, Ll/᩵ۧܺ;->ۜ(Ljava/lang/Object;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    .line 114
    :cond_8
    :goto_3
    invoke-static {p1}, Ll/᩵ۧܺ;->᩷(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object p1

    :catch_1
    move-exception p2

    .line 119
    new-instance v0, Ll/ܶ۟ۡ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "cast error, field : "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, ", value "

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 29
    invoke-direct {v0, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 119
    throw v0
.end method

.method public final ֫(Ll/ۛ֫ܺ;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    .locals 4

    .line 41
    iget-object p1, p1, Ll/ۛ֫ܺ;->ۜ:Ll/ۜۧܺ;

    .line 43
    move-object p3, p2

    check-cast p3, Ljava/lang/Number;

    if-nez p3, :cond_1

    .line 46
    iget p2, p1, Ll/ۜۧܺ;->᩶:I

    sget-object p3, Ll/᩷ۧܺ;->᩷֫:Ll/᩷ۧܺ;

    iget p3, p3, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    const/16 p2, 0x30

    .line 47
    invoke-virtual {p1, p2}, Ll/ۜۧܺ;->write(I)V

    return-void

    .line 49
    :cond_0
    invoke-virtual {p1}, Ll/ۜۧܺ;->֫()V

    return-void

    .line 54
    :cond_1
    instance-of p2, p2, Ljava/lang/Long;

    if-eqz p2, :cond_2

    .line 55
    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ll/ۜۧܺ;->ۧ(J)V

    goto :goto_0

    .line 57
    :cond_2
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Ll/ۜۧܺ;->writeInt(I)V

    .line 60
    :goto_0
    iget p2, p1, Ll/ۜۧܺ;->᩶:I

    sget-object v0, Ll/᩷ۧܺ;->ۧ֫:Ll/᩷ۧܺ;

    iget v0, v0, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr p2, v0

    if-eqz p2, :cond_5

    .line 61
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    .line 62
    const-class v0, Ljava/lang/Byte;

    if-ne p2, v0, :cond_3

    const/16 p2, 0x42

    .line 63
    invoke-virtual {p1, p2}, Ll/ۜۧܺ;->write(I)V

    return-void

    .line 64
    :cond_3
    const-class v0, Ljava/lang/Short;

    if-ne p2, v0, :cond_4

    const/16 p2, 0x53

    .line 65
    invoke-virtual {p1, p2}, Ll/ۜۧܺ;->write(I)V

    return-void

    .line 66
    :cond_4
    const-class v0, Ljava/lang/Long;

    if-ne p2, v0, :cond_5

    .line 67
    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    move-result-wide p2

    const-wide/32 v1, 0x7fffffff

    cmp-long v3, p2, v1

    if-gtz v3, :cond_5

    const-wide/32 v1, -0x80000000

    cmp-long v3, p2, v1

    if-ltz v3, :cond_5

    if-eq p4, v0, :cond_5

    const/16 p2, 0x4c

    .line 70
    invoke-virtual {p1, p2}, Ll/ۜۧܺ;->write(I)V

    :cond_5
    return-void
.end method
