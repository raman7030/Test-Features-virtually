.class public Ll/ۤܳۖ;
.super Ll/۠ᩳۖ;
.source "0B0D"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 471
    invoke-direct {p0}, Ll/۠ᩳۖ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿۜۖ;)Ljava/lang/Object;
    .locals 5

    .line 474
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;

    move-result-object v0

    sget-object v1, Ll/ܳۜۖ;->ۛ:Ll/ܳۜۖ;

    if-ne v0, v1, :cond_0

    .line 475
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۗ()V

    const/4 p1, 0x0

    return-object p1

    .line 478
    :cond_0
    invoke-virtual {p1}, Ll/ܿۜۖ;->۬()Ljava/lang/String;

    move-result-object v0

    .line 480
    :try_start_0
    invoke-static {v0}, Ll/ۜܿۖ;->ۧ(Ljava/lang/String;)Ljava/math/BigDecimal;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v1

    .line 482
    new-instance v2, Ll/ܳᩳۖ;

    const-string v3, "Failed parsing \'"

    const-string v4, "\' as BigDecimal; at path "

    .line 0
    invoke-static {v3, v0, v4}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 483
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۖ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 52
    invoke-direct {v2, p1, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 483
    throw v2
.end method

.method public final ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 0

    .line 471
    check-cast p2, Ljava/math/BigDecimal;

    .line 489
    invoke-virtual {p1, p2}, Ll/᩻ۜۖ;->֫(Ljava/lang/Number;)V

    return-void
.end method
