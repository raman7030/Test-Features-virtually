.class public final Ll/ܶ֫ܺ;
.super Ljava/lang/Object;
.source "KAUB"

# interfaces
.implements Ll/ܽۧܺ;
.implements Ll/᩵֫ܺ;


# static fields
.field public static final ֫:Ll/ܶ֫ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 34
    new-instance v0, Ll/ܶ֫ܺ;

    .line 36
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 34
    sput-object v0, Ll/ܶ֫ܺ;->֫:Ll/ܶ֫ܺ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۨ۟ۡ;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 68
    iget-object p3, p1, Ll/ۨ۟ۡ;->ۛ:Ll/۟۟ۡ;

    .line 70
    invoke-virtual {p3}, Ll/۟۟ۡ;->ܶ()I

    move-result v0

    const/4 v1, 0x2

    const/16 v2, 0x10

    .line 71
    const-class v3, Ljava/math/BigInteger;

    if-ne v0, v1, :cond_1

    if-ne p2, v3, :cond_0

    .line 73
    invoke-virtual {p3}, Ll/۟۟ۡ;->ܺ()Ljava/lang/String;

    move-result-object p1

    .line 74
    invoke-virtual {p3, v2}, Ll/۟۟ۡ;->ۧ(I)V

    .line 75
    new-instance p2, Ljava/math/BigInteger;

    const/16 p3, 0xa

    invoke-direct {p2, p1, p3}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    return-object p2

    .line 77
    :cond_0
    invoke-virtual {p3}, Ll/۟۟ۡ;->ܽ()Ljava/math/BigDecimal;

    move-result-object p1

    .line 78
    invoke-virtual {p3, v2}, Ll/۟۟ۡ;->ۧ(I)V

    return-object p1

    :cond_1
    const/4 v1, 0x3

    if-ne v0, v1, :cond_4

    .line 84
    invoke-virtual {p3}, Ll/۟۟ۡ;->ܽ()Ljava/math/BigDecimal;

    move-result-object p1

    .line 85
    invoke-virtual {p3, v2}, Ll/۟۟ۡ;->ۧ(I)V

    if-ne p2, v3, :cond_3

    .line 88
    invoke-virtual {p1}, Ljava/math/BigDecimal;->scale()I

    move-result p2

    const/16 p3, -0x64

    if-lt p2, p3, :cond_2

    const/16 p3, 0x64

    if-gt p2, p3, :cond_2

    .line 92
    invoke-virtual {p1}, Ljava/math/BigDecimal;->toBigInteger()Ljava/math/BigInteger;

    move-result-object p1

    return-object p1

    .line 90
    :cond_2
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-direct {p1}, Ljava/lang/NumberFormatException;-><init>()V

    throw p1

    :cond_3
    return-object p1

    :cond_4
    const/4 p3, 0x0

    .line 1380
    invoke-virtual {p1, p3}, Ll/ۨ۟ۡ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_5

    return-object p3

    :cond_5
    if-ne p2, v3, :cond_6

    .line 105
    invoke-static {p1}, Ll/᩵ۧܺ;->ۧ(Ljava/lang/Object;)Ljava/math/BigInteger;

    move-result-object p1

    return-object p1

    .line 108
    :cond_6
    invoke-static {p1}, Ll/᩵ۧܺ;->֫(Ljava/lang/Object;)Ljava/math/BigDecimal;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۛ֫ܺ;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    .locals 1

    .line 41
    iget-object p1, p1, Ll/ۛ֫ܺ;->ۜ:Ll/ۜۧܺ;

    if-nez p2, :cond_1

    .line 44
    iget p2, p1, Ll/ۜۧܺ;->᩶:I

    sget-object p3, Ll/᩷ۧܺ;->᩷֫:Ll/᩷ۧܺ;

    iget p3, p3, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    const/16 p2, 0x30

    .line 45
    invoke-virtual {p1, p2}, Ll/ۜۧܺ;->write(I)V

    return-void

    .line 47
    :cond_0
    invoke-virtual {p1}, Ll/ۜۧܺ;->֫()V

    return-void

    .line 52
    :cond_1
    instance-of p3, p2, Ljava/math/BigInteger;

    if-eqz p3, :cond_2

    .line 53
    check-cast p2, Ljava/math/BigInteger;

    .line 54
    invoke-virtual {p2}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۜۧܺ;->write(Ljava/lang/String;)V

    return-void

    .line 58
    :cond_2
    check-cast p2, Ljava/math/BigDecimal;

    .line 59
    invoke-virtual {p2}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ll/ۜۧܺ;->write(Ljava/lang/String;)V

    .line 61
    iget p3, p1, Ll/ۜۧܺ;->᩶:I

    sget-object v0, Ll/᩷ۧܺ;->ۧ֫:Ll/᩷ۧܺ;

    iget v0, v0, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr p3, v0

    if-eqz p3, :cond_3

    const-class p3, Ljava/math/BigDecimal;

    if-eq p4, p3, :cond_3

    invoke-virtual {p2}, Ljava/math/BigDecimal;->scale()I

    move-result p2

    if-nez p2, :cond_3

    const/16 p2, 0x2e

    .line 62
    invoke-virtual {p1, p2}, Ll/ۜۧܺ;->write(I)V

    :cond_3
    return-void
.end method
