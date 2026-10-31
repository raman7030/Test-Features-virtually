.class public final Ll/ۜۚۜ;
.super Ljava/lang/Object;
.source "V6KB"

# interfaces
.implements Ll/ۘۢۧ;
.implements Ll/ۖۢܽ;
.implements Ll/᩹֡ۘ;
.implements Ll/۟ܳ֨;


# direct methods
.method public static ֫(ILjava/lang/String;)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, p0, :cond_1

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 p0, p0, -0x1

    const/4 v1, 0x0

    invoke-virtual {p1, v1, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\u2026"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    return-object p1
.end method

.method public static ֫(Ll/ᩳۜܳ;)Z
    .locals 2

    if-eqz p0, :cond_0

    .line 10
    invoke-interface {p0}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ll/ᩳۜܳ;->۠֫()Ljava/lang/String;

    move-result-object v0

    const-string v1, "video/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 11
    invoke-interface {p0}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۤۙۜ;->ۧ(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(ILjava/lang/String;)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 19
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, p0, :cond_1

    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\u2026"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, p0

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    return-object p1
.end method


# virtual methods
.method public ֫(FLjava/lang/Float;Ljava/lang/Float;)Ljava/lang/Object;
    .locals 0

    .line 39
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    .line 40
    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    move-result p3

    sub-float/2addr p3, p2

    mul-float p3, p3, p1

    add-float/2addr p3, p2

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Ljava/lang/String;)Ll/֫᩻֨;
    .locals 0

    .line 45
    sget-object p1, Ll/ۜ᩻֨;->᩸:Ll/ۜ᩻֨;

    return-object p1
.end method

.method public ֫(Ll/ܺܺܽ;)V
    .locals 5

    .line 15
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ᩷ܽ;

    invoke-virtual {v0}, Ll/ۨ᩷ܽ;->ۜ()I

    move-result v0

    .line 16
    new-instance v1, Ljava/util/Random;

    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 18
    invoke-virtual {v1}, Ljava/util/Random;->nextInt()I

    move-result v3

    and-int/lit16 v3, v3, 0xff

    rem-int/lit8 v3, v3, 0x9

    const/4 v4, 0x1

    add-int/2addr v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_0
    if-ge v4, v0, :cond_0

    .line 20
    invoke-virtual {v1}, Ljava/util/Random;->nextInt()I

    move-result v3

    and-int/lit16 v3, v3, 0xff

    rem-int/lit8 v3, v3, 0xa

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 21
    :cond_0
    new-instance v0, Ll/ۨ᩷ܽ;

    invoke-direct {v0}, Ll/ۨ᩷ܽ;-><init>()V

    .line 22
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۨ᩷ܽ;->֫(Ljava/lang/String;)V

    .line 23
    invoke-virtual {p1, v0}, Ll/ܺܺܽ;->֫(Ll/ۨ᩷ܽ;)V

    return-void
.end method
