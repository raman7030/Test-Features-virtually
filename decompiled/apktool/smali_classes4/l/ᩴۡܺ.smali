.class public final Ll/ᩴۡܺ;
.super Ljava/lang/Object;
.source "K250"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ᩸:Ll/۬ܺܺ;

.field public final ᩹:Ll/۬ܺܺ;


# direct methods
.method public constructor <init>(Ll/۬ܺܺ;Ll/۬ܺܺ;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Ll/ᩴۡܺ;->᩸:Ll/۬ܺܺ;

    .line 60
    iput-object p2, p0, Ll/ᩴۡܺ;->᩹:Ll/۬ܺܺ;

    return-void
.end method

.method public static ֫(Ll/۬ܺܺ;Ll/۬ܺܺ;)Ll/ᩴۡܺ;
    .locals 1

    if-nez p0, :cond_0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 49
    :cond_0
    new-instance v0, Ll/ᩴۡܺ;

    invoke-direct {v0, p0, p1}, Ll/ᩴۡܺ;-><init>(Ll/۬ܺܺ;Ll/۬ܺܺ;)V

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 24
    check-cast p1, Ll/ᩴۡܺ;

    invoke-virtual {p0, p1}, Ll/ᩴۡܺ;->֫(Ll/ᩴۡܺ;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 68
    instance-of v0, p1, Ll/ᩴۡܺ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 72
    :cond_0
    check-cast p1, Ll/ᩴۡܺ;

    .line 74
    invoke-virtual {p0, p1}, Ll/ᩴۡܺ;->֫(Ll/ᩴۡܺ;)I

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final getName()Ll/۬ܺܺ;
    .locals 1

    .line 145
    iget-object v0, p0, Ll/ᩴۡܺ;->᩸:Ll/۬ܺܺ;

    return-object v0
.end method

.method public final getSignature()Ll/۬ܺܺ;
    .locals 1

    .line 154
    iget-object v0, p0, Ll/ᩴۡܺ;->᩹:Ll/۬ܺܺ;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    .line 120
    iget-object v1, p0, Ll/ᩴۡܺ;->᩸:Ll/۬ܺܺ;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ll/۬ܺܺ;->hashCode()I

    move-result v1

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    .line 121
    iget-object v2, p0, Ll/ᩴۡܺ;->᩹:Ll/۬ܺܺ;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ll/۬ܺܺ;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 129
    iget-object v0, p0, Ll/ᩴۡܺ;->᩹:Ll/۬ܺܺ;

    iget-object v1, p0, Ll/ᩴۡܺ;->᩸:Ll/۬ܺܺ;

    if-eqz v1, :cond_0

    if-nez v0, :cond_0

    .line 130
    invoke-virtual {v1}, Ll/۬ܺܺ;->ۚ()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v2, ""

    if-nez v1, :cond_1

    if-nez v0, :cond_1

    return-object v2

    .line 135
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "["

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-nez v1, :cond_2

    move-object v1, v2

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Ll/۬ܺܺ;->ۚ()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "|"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v0, :cond_3

    goto :goto_1

    .line 136
    :cond_3
    invoke-virtual {v0}, Ll/۬ܺܺ;->ۚ()Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ᩴۡܺ;)I
    .locals 5

    .line 103
    iget-object v0, p1, Ll/ᩴۡܺ;->᩸:Ll/۬ܺܺ;

    const/4 v1, 0x1

    const/4 v2, -0x1

    const/4 v3, 0x0

    .line 85
    iget-object v4, p0, Ll/ᩴۡܺ;->᩸:Ll/۬ܺܺ;

    if-ne v4, v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    if-nez v4, :cond_1

    const/4 v0, -0x1

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    .line 92
    :cond_2
    invoke-virtual {v4, v0}, Ll/ܰۡܺ;->֫(Ll/ܰۡܺ;)I

    move-result v0

    :goto_0
    if-eqz v0, :cond_3

    return v0

    .line 109
    :cond_3
    iget-object p1, p1, Ll/ᩴۡܺ;->᩹:Ll/۬ܺܺ;

    .line 85
    iget-object v0, p0, Ll/ᩴۡܺ;->᩹:Ll/۬ܺܺ;

    if-ne v0, p1, :cond_4

    return v3

    :cond_4
    if-nez v0, :cond_5

    return v2

    :cond_5
    if-nez p1, :cond_6

    return v1

    .line 92
    :cond_6
    invoke-virtual {v0, p1}, Ll/ܰۡܺ;->֫(Ll/ܰۡܺ;)I

    move-result p1

    return p1
.end method
