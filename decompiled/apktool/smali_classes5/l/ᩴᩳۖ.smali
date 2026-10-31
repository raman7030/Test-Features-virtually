.class public final enum Ll/ᩴᩳۖ;
.super Ll/֡ᩳۖ;
.source "Q86R"


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 67
    invoke-direct {p0, p1, p2, v0}, Ll/֡ᩳۖ;-><init>(Ljava/lang/String;ILl/ۖᩳۖ;)V

    return-void
.end method

.method private ֫(Ljava/lang/String;Ll/ܿۜۖ;)Ljava/lang/Number;
    .locals 5

    const-string v0, "; at path "

    const-string v1, "JSON forbids NaN and infinities: "

    .line 84
    :try_start_0
    invoke-static {p1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v2

    .line 85
    invoke-virtual {v2}, Ljava/lang/Double;->isInfinite()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Ljava/lang/Double;->isNaN()Z

    move-result v3

    if-eqz v3, :cond_1

    :cond_0
    invoke-virtual {p2}, Ll/ܿۜۖ;->᩵()Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_1
    return-object v2

    .line 86
    :cond_2
    new-instance v3, Ll/ۜۜۖ;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    invoke-virtual {p2}, Ll/ܿۜۖ;->ۖ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 30
    invoke-direct {v3, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 87
    throw v3
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v1

    .line 91
    new-instance v2, Ll/ۧᩳۖ;

    const-string v3, "Cannot parse "

    .line 0
    invoke-static {v3, p1, v0}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 92
    invoke-virtual {p2}, Ll/ܿۜۖ;->ۖ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 52
    invoke-direct {v2, p1, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 92
    throw v2
.end method


# virtual methods
.method public ֫(Ll/ܿۜۖ;)Ljava/lang/Number;
    .locals 3

    .line 70
    invoke-virtual {p1}, Ll/ܿۜۖ;->۬()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2e

    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-ltz v1, :cond_0

    .line 72
    invoke-direct {p0, v0, p1}, Ll/ᩴᩳۖ;->֫(Ljava/lang/String;Ll/ܿۜۖ;)Ljava/lang/Number;

    move-result-object p1

    return-object p1

    .line 75
    :cond_0
    :try_start_0
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 77
    :catch_0
    invoke-direct {p0, v0, p1}, Ll/ᩴᩳۖ;->֫(Ljava/lang/String;Ll/ܿۜۖ;)Ljava/lang/Number;

    move-result-object p1

    return-object p1
.end method
