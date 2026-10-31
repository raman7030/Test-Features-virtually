.class public final Ll/ۙܺܺ;
.super Ll/ۛܺܺ;
.source "2BAP"


# instance fields
.field public final ᩸:Ll/᩺ܺܺ;


# direct methods
.method public constructor <init>(Ll/᩺ܺܺ;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ll/ۛܺܺ;-><init>()V

    .line 32
    iput-object p1, p0, Ll/ۙܺܺ;->᩸:Ll/᩺ܺܺ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 52
    instance-of v0, p1, Ll/ۙܺܺ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 55
    :cond_0
    check-cast p1, Ll/ۙܺܺ;

    .line 106
    iget-object v0, p0, Ll/ۙܺܺ;->᩸:Ll/᩺ܺܺ;

    iget-object p1, p1, Ll/ۙܺܺ;->᩸:Ll/᩺ܺܺ;

    .line 56
    invoke-virtual {v0, p1}, Ll/᩺ܺܺ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final getType()Ll/۟ܺܺ;
    .locals 1

    .line 111
    sget-object v0, Ll/۟ܺܺ;->۠֫:Ll/۟ܺܺ;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 61
    iget-object v0, p0, Ll/ۙܺܺ;->᩸:Ll/᩺ܺܺ;

    invoke-virtual {v0}, Ll/᩺ܺܺ;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 102
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "proto{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    iget-object v1, p0, Ll/ۙܺܺ;->᩸:Ll/᩺ܺܺ;

    invoke-virtual {v1}, Ll/᩺ܺܺ;->֫()Ljava/lang/String;

    move-result-object v1

    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 94
    iget-object v0, p0, Ll/ۙܺܺ;->᩸:Ll/᩺ܺܺ;

    invoke-virtual {v0}, Ll/᩺ܺܺ;->֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/ܰۡܺ;)I
    .locals 1

    .line 85
    check-cast p1, Ll/ۙܺܺ;

    .line 86
    iget-object v0, p0, Ll/ۙܺܺ;->᩸:Ll/᩺ܺܺ;

    .line 106
    iget-object p1, p1, Ll/ۙܺܺ;->᩸:Ll/᩺ܺܺ;

    .line 86
    invoke-virtual {v0, p1}, Ll/᩺ܺܺ;->֫(Ll/᩺ܺܺ;)I

    move-result p1

    return p1
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ܺ()Ll/᩺ܺܺ;
    .locals 1

    .line 106
    iget-object v0, p0, Ll/ۙܺܺ;->᩸:Ll/᩺ܺܺ;

    return-object v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    const-string v0, "proto"

    return-object v0
.end method
