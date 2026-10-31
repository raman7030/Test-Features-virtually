.class public final Ll/۟ۢܺ;
.super Ljava/lang/Object;
.source "SB9X"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ᩸:Ll/۬ܺܺ;

.field public final ᩹:Ll/ܰۡܺ;


# direct methods
.method public constructor <init>(Ll/۬ܺܺ;Ll/ܰۡܺ;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 51
    iput-object p1, p0, Ll/۟ۢܺ;->᩸:Ll/۬ܺܺ;

    .line 52
    iput-object p2, p0, Ll/۟ۢܺ;->᩹:Ll/ܰۡܺ;

    return-void

    .line 48
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "name == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 25
    check-cast p1, Ll/۟ۢܺ;

    invoke-virtual {p0, p1}, Ll/۟ۢܺ;->֫(Ll/۟ۢܺ;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 76
    instance-of v0, p1, Ll/۟ۢܺ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 80
    :cond_0
    check-cast p1, Ll/۟ۢܺ;

    .line 82
    iget-object v0, p0, Ll/۟ۢܺ;->᩸:Ll/۬ܺܺ;

    iget-object v2, p1, Ll/۟ۢܺ;->᩸:Ll/۬ܺܺ;

    invoke-virtual {v0, v2}, Ll/۬ܺܺ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/۟ۢܺ;->᩹:Ll/ܰۡܺ;

    iget-object p1, p1, Ll/۟ۢܺ;->᩹:Ll/ܰۡܺ;

    .line 83
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final getName()Ll/۬ܺܺ;
    .locals 1

    .line 109
    iget-object v0, p0, Ll/۟ۢܺ;->᩸:Ll/۬ܺܺ;

    return-object v0
.end method

.method public final getValue()Ll/ܰۡܺ;
    .locals 1

    .line 118
    iget-object v0, p0, Ll/۟ۢܺ;->᩹:Ll/ܰۡܺ;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    .line 68
    iget-object v0, p0, Ll/۟ۢܺ;->᩸:Ll/۬ܺܺ;

    invoke-virtual {v0}, Ll/۬ܺܺ;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll/۟ۢܺ;->᩹:Ll/ܰۡܺ;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/۟ۢܺ;->᩸:Ll/۬ܺܺ;

    invoke-virtual {v1}, Ll/۬ܺܺ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۟ۢܺ;->᩹:Ll/ܰۡܺ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/۟ۢܺ;)I
    .locals 2

    .line 94
    iget-object v0, p0, Ll/۟ۢܺ;->᩸:Ll/۬ܺܺ;

    iget-object v1, p1, Ll/۟ۢܺ;->᩸:Ll/۬ܺܺ;

    invoke-virtual {v0, v1}, Ll/ܰۡܺ;->֫(Ll/ܰۡܺ;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 100
    :cond_0
    iget-object v0, p0, Ll/۟ۢܺ;->᩹:Ll/ܰۡܺ;

    iget-object p1, p1, Ll/۟ۢܺ;->᩹:Ll/ܰۡܺ;

    invoke-virtual {v0, p1}, Ll/ܰۡܺ;->֫(Ll/ܰۡܺ;)I

    move-result p1

    return p1
.end method
