.class public Ll/۟ܳܳ;
.super Lbin/mt/json/JSONValue;
.source "LAGN"


# instance fields
.field public final ᩸:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 30
    invoke-direct {p0}, Lbin/mt/json/JSONValue;-><init>()V

    if-eqz p1, :cond_0

    .line 34
    iput-object p1, p0, Ll/۟ܳܳ;->᩸:Ljava/lang/String;

    return-void

    .line 32
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "string is null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public asString()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Ll/۟ܳܳ;->᩸:Ljava/lang/String;

    return-object v0
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

    .line 65
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_2

    return v0

    .line 68
    :cond_2
    check-cast p1, Ll/۟ܳܳ;

    .line 69
    iget-object v0, p0, Ll/۟ܳܳ;->᩸:Ljava/lang/String;

    iget-object p1, p1, Ll/۟ܳܳ;->᩸:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 54
    iget-object v0, p0, Ll/۟ܳܳ;->᩸:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public isString()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public write(Ll/֫᩻ܳ;)V
    .locals 1

    .line 39
    iget-object v0, p0, Ll/۟ܳܳ;->᩸:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/֫᩻ܳ;->ܿ(Ljava/lang/String;)V

    return-void
.end method
