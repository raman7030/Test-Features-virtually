.class public Ll/۬ܳۖ;
.super Ll/۠ᩳۖ;
.source "0B0D"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 424
    invoke-direct {p0}, Ll/۠ᩳۖ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿۜۖ;)Ljava/lang/Object;
    .locals 4

    .line 427
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;

    move-result-object v0

    sget-object v1, Ll/ܳۜۖ;->ۛ:Ll/ܳۜۖ;

    if-ne v0, v1, :cond_0

    .line 428
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۗ()V

    const/4 p1, 0x0

    return-object p1

    .line 431
    :cond_0
    invoke-virtual {p1}, Ll/ܿۜۖ;->۬()Ljava/lang/String;

    move-result-object v0

    .line 432
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    const/4 p1, 0x0

    .line 436
    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    return-object p1

    .line 433
    :cond_1
    new-instance v1, Ll/ܳᩳۖ;

    const-string v2, "Expecting character, got: "

    const-string v3, "; at "

    .line 0
    invoke-static {v2, v0, v3}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 434
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۖ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 42
    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 434
    throw v1
.end method

.method public final ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 0

    .line 424
    check-cast p2, Ljava/lang/Character;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 441
    :cond_0
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-virtual {p1, p2}, Ll/᩻ۜۖ;->ۧ(Ljava/lang/String;)V

    return-void
.end method
