.class public Ll/ۨܳܳ;
.super Lbin/mt/json/JSONValue;
.source "17N1"


# instance fields
.field public final ᩸:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 32
    invoke-direct {p0}, Lbin/mt/json/JSONValue;-><init>()V

    if-eqz p1, :cond_0

    .line 36
    iput-object p1, p0, Ll/ۨܳܳ;->᩸:Ljava/lang/String;

    return-void

    .line 34
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "string is null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public asDouble()D
    .locals 2

    .line 72
    iget-object v0, p0, Ll/ۨܳܳ;->᩸:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    return-wide v0
.end method

.method public asFloat()F
    .locals 1

    .line 67
    iget-object v0, p0, Ll/ۨܳܳ;->᩸:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    return v0
.end method

.method public asInt()I
    .locals 2

    .line 57
    iget-object v0, p0, Ll/ۨܳܳ;->᩸:Ljava/lang/String;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public asLong()J
    .locals 2

    .line 62
    iget-object v0, p0, Ll/ۨܳܳ;->᩸:Ljava/lang/String;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    .line 88
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_2

    return v0

    .line 91
    :cond_2
    check-cast p1, Ll/ۨܳܳ;

    .line 92
    iget-object v0, p0, Ll/ۨܳܳ;->᩸:Ljava/lang/String;

    iget-object p1, p1, Ll/ۨܳܳ;->᩸:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 77
    iget-object v0, p0, Ll/ۨܳܳ;->᩸:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public isNumber()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Ll/ۨܳܳ;->᩸:Ljava/lang/String;

    return-object v0
.end method

.method public write(Ll/֫᩻ܳ;)V
    .locals 1

    .line 47
    iget-object v0, p0, Ll/ۨܳܳ;->᩸:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/֫᩻ܳ;->ᩳ(Ljava/lang/String;)V

    return-void
.end method
