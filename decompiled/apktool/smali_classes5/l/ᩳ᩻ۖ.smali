.class public Ll/ᩳ᩻ۖ;
.super Ll/۠ᩳۖ;
.source "0B0D"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 648
    invoke-direct {p0}, Ll/۠ᩳۖ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿۜۖ;)Ljava/lang/Object;
    .locals 5

    .line 651
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;

    move-result-object v0

    sget-object v1, Ll/ܳۜۖ;->ۛ:Ll/ܳۜۖ;

    if-ne v0, v1, :cond_0

    .line 652
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۗ()V

    const/4 p1, 0x0

    return-object p1

    .line 655
    :cond_0
    invoke-virtual {p1}, Ll/ܿۜۖ;->۬()Ljava/lang/String;

    move-result-object v0

    .line 657
    :try_start_0
    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v1

    .line 659
    new-instance v2, Ll/ܳᩳۖ;

    const-string v3, "Failed parsing \'"

    const-string v4, "\' as UUID; at path "

    .line 0
    invoke-static {v3, v0, v4}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 660
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۖ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 52
    invoke-direct {v2, p1, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 660
    throw v2
.end method

.method public final ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 0

    .line 648
    check-cast p2, Ljava/util/UUID;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 666
    :cond_0
    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-virtual {p1, p2}, Ll/᩻ۜۖ;->ۧ(Ljava/lang/String;)V

    return-void
.end method
