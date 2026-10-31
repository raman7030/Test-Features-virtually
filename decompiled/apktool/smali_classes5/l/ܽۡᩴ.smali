.class public final Ll/ܽۡᩴ;
.super Ljava/lang/Object;
.source "GAOL"

# interfaces
.implements Ll/ᩳۡᩴ;
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public final ᩸:I

.field public final ᩹:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput p1, p0, Ll/ܽۡᩴ;->᩸:I

    .line 36
    iput p2, p0, Ll/ܽۡᩴ;->᩹:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    if-nez p1, :cond_0

    goto :goto_1

    .line 66
    :cond_0
    instance-of v0, p1, Ll/ᩳۡᩴ;

    iget v1, p0, Ll/ܽۡᩴ;->᩹:I

    iget v2, p0, Ll/ܽۡᩴ;->᩸:I

    if-eqz v0, :cond_1

    .line 67
    check-cast p1, Ll/ᩳۡᩴ;

    invoke-interface {p1}, Ll/ᩳۡᩴ;->۠()I

    move-result v0

    if-ne v2, v0, :cond_2

    invoke-interface {p1}, Ll/ᩳۡᩴ;->ۚ()I

    move-result p1

    if-ne v1, p1, :cond_2

    goto :goto_0

    .line 69
    :cond_1
    instance-of v0, p1, Ll/ܺ᩺ۘ;

    if-eqz v0, :cond_2

    .line 70
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    check-cast p1, Ll/ܺ᩺ۘ;

    invoke-interface {p1}, Ll/ܺ᩺ۘ;->ܽ()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1}, Ll/ܺ᩺ۘ;->ܳ()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final first()Ljava/lang/Object;
    .locals 1

    .line 83
    invoke-virtual {p0}, Ll/ܽۡᩴ;->֡()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    .line 77
    iget v0, p0, Ll/ܽۡᩴ;->᩸:I

    mul-int/lit8 v0, v0, 0x13

    iget v1, p0, Ll/ܽۡᩴ;->᩹:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    iget v1, p0, Ll/ܽۡᩴ;->᩸:I

    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    iget v1, p0, Ll/ܽۡᩴ;->᩹:I

    const-string v2, ">"

    .line 0
    invoke-static {v1, v2, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()I
    .locals 1

    .line 72
    invoke-virtual {p0}, Ll/ܽۡᩴ;->۠()I

    move-result v0

    return v0
.end method

.method public final ֨()I
    .locals 1

    .line 197
    invoke-virtual {p0}, Ll/ܽۡᩴ;->ۚ()I

    move-result v0

    return v0
.end method

.method public final ۚ()I
    .locals 1

    .line 59
    iget v0, p0, Ll/ܽۡᩴ;->᩹:I

    return v0
.end method

.method public final ۠()I
    .locals 1

    .line 54
    iget v0, p0, Ll/ܽۡᩴ;->᩸:I

    return v0
.end method

.method public final ܳ()Ljava/lang/Object;
    .locals 1

    .line 163
    invoke-virtual {p0}, Ll/ܽۡᩴ;->ۚ()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ljava/lang/Object;
    .locals 1

    .line 38
    invoke-virtual {p0}, Ll/ܽۡᩴ;->۠()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/Object;
    .locals 1

    .line 208
    invoke-virtual {p0}, Ll/ܽۡᩴ;->֨()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
