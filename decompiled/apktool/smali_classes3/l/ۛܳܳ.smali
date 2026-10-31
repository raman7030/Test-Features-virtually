.class public Ll/ۛܳܳ;
.super Lbin/mt/json/JSONValue;
.source "S7O6"


# instance fields
.field public final ۙ:Ljava/lang/String;

.field public final ᩶:Z

.field public final ᩸:Z

.field public final ᩹:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 35
    invoke-direct {p0}, Lbin/mt/json/JSONValue;-><init>()V

    .line 36
    iput-object p1, p0, Ll/ۛܳܳ;->ۙ:Ljava/lang/String;

    const-string v0, "null"

    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۛܳܳ;->᩹:Z

    const-string v0, "true"

    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۛܳܳ;->᩶:Z

    const-string v0, "false"

    .line 39
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    iput-boolean p1, p0, Ll/ۛܳܳ;->᩸:Z

    return-void
.end method


# virtual methods
.method public asBoolean()Z
    .locals 1

    .line 80
    iget-boolean v0, p0, Ll/ۛܳܳ;->᩹:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result v0

    return v0

    :cond_0
    iget-boolean v0, p0, Ll/ۛܳܳ;->᩶:Z

    return v0
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

    .line 91
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_2

    return v0

    .line 94
    :cond_2
    check-cast p1, Ll/ۛܳܳ;

    .line 95
    iget-object v0, p0, Ll/ۛܳܳ;->ۙ:Ljava/lang/String;

    iget-object p1, p1, Ll/ۛܳܳ;->ۙ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 55
    iget-object v0, p0, Ll/ۛܳܳ;->ۙ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public isBoolean()Z
    .locals 1

    .line 75
    iget-boolean v0, p0, Ll/ۛܳܳ;->᩶:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/ۛܳܳ;->᩸:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public isFalse()Z
    .locals 1

    .line 70
    iget-boolean v0, p0, Ll/ۛܳܳ;->᩸:Z

    return v0
.end method

.method public isNull()Z
    .locals 1

    .line 60
    iget-boolean v0, p0, Ll/ۛܳܳ;->᩹:Z

    return v0
.end method

.method public isTrue()Z
    .locals 1

    .line 65
    iget-boolean v0, p0, Ll/ۛܳܳ;->᩶:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Ll/ۛܳܳ;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public write(Ll/֫᩻ܳ;)V
    .locals 1

    .line 44
    iget-object v0, p0, Ll/ۛܳܳ;->ۙ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/֫᩻ܳ;->ۧ(Ljava/lang/String;)V

    return-void
.end method
