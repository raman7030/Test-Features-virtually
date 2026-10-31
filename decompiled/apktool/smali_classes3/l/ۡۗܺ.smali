.class public final Ll/ۡۗܺ;
.super Ll/ۘۗܺ;
.source "75HT"


# static fields
.field public static final serialVersionUID:J


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 394
    check-cast p1, Ll/ۘۗܺ;

    invoke-virtual {p0, p1}, Ll/ۘۗܺ;->֫(Ll/ۘۗܺ;)I

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 466
    iget-object v0, p0, Ll/ۘۗܺ;->᩸:Ljava/lang/Comparable;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    not-int v0, v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 471
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۘۗܺ;->᩸:Ljava/lang/Comparable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\\"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩵ۗܺ;)Ll/ۘۗܺ;
    .locals 1

    .line 450
    check-cast p1, Ll/ᩴۗܺ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    iget-object p1, p0, Ll/ۘۗܺ;->᩸:Ljava/lang/Comparable;

    check-cast p1, Ljava/lang/Integer;

    .line 73
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 74
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_1

    .line 310
    new-instance v0, Ll/ۖۗܺ;

    .line 315
    invoke-direct {v0, p1}, Ll/ۘۗܺ;-><init>(Ljava/lang/Comparable;)V

    return-object v0

    .line 224
    :cond_1
    invoke-static {}, Ll/ۢۗܺ;->᩻()Ll/ۢۗܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/StringBuilder;)V
    .locals 1

    const/16 v0, 0x28

    .line 440
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ll/ۘۗܺ;->᩸:Ljava/lang/Comparable;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ֫(Ljava/lang/Comparable;)Z
    .locals 1

    .line 401
    sget v0, Ll/ܰۤܺ;->᩶:I

    .line 702
    iget-object v0, p0, Ll/ۘۗܺ;->᩸:Ljava/lang/Comparable;

    invoke-interface {v0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()Ll/ۘۙܺ;
    .locals 1

    .line 406
    sget-object v0, Ll/ۘۙܺ;->ۙ:Ll/ۘۙܺ;

    return-object v0
.end method

.method public final ۧ(Ljava/lang/StringBuilder;)V
    .locals 1

    .line 445
    iget-object v0, p0, Ll/ۘۗܺ;->᩸:Ljava/lang/Comparable;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x5d

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ܿ()Ll/ۘۙܺ;
    .locals 1

    .line 411
    sget-object v0, Ll/ۘۙܺ;->᩶:Ll/ۘۙܺ;

    return-object v0
.end method
