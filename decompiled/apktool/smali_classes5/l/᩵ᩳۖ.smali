.class public final enum Ll/᩵ᩳۖ;
.super Ll/֡ᩳۖ;
.source "Q86R"


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 101
    invoke-direct {p0, p1, p2, v0}, Ll/֡ᩳۖ;-><init>(Ljava/lang/String;ILl/ۖᩳۖ;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic ֫(Ll/ܿۜۖ;)Ljava/lang/Number;
    .locals 0

    .line 101
    invoke-virtual {p0, p1}, Ll/᩵ᩳۖ;->֫(Ll/ܿۜۖ;)Ljava/math/BigDecimal;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Ll/ܿۜۖ;)Ljava/math/BigDecimal;
    .locals 5

    .line 104
    invoke-virtual {p1}, Ll/ܿۜۖ;->۬()Ljava/lang/String;

    move-result-object v0

    .line 106
    :try_start_0
    invoke-static {v0}, Ll/ۜܿۖ;->ۧ(Ljava/lang/String;)Ljava/math/BigDecimal;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v1

    .line 108
    new-instance v2, Ll/ۧᩳۖ;

    const-string v3, "Cannot parse "

    const-string v4, "; at path "

    .line 0
    invoke-static {v3, v0, v4}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 109
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۖ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 52
    invoke-direct {v2, p1, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 109
    throw v2
.end method
