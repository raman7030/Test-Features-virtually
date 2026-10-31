.class public Ll/۬۠ܺ;
.super Ll/ۨ۠ܺ;
.source "532I"


# instance fields
.field public final ᩸:Ll/ۨ۠ܺ;


# direct methods
.method public constructor <init>(Ll/ۨ۠ܺ;)V
    .locals 0

    .line 1505
    invoke-direct {p0}, Ll/ۨ۠ܺ;-><init>()V

    .line 1506
    iput-object p1, p0, Ll/۬۠ܺ;->᩸:Ll/ۨ۠ܺ;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1501
    check-cast p1, Ljava/lang/Character;

    .line 918
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    invoke-virtual {p0, p1}, Ll/۬۠ܺ;->֫(C)Z

    move-result p1

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1545
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/۬۠ܺ;->᩸:Ll/ۨ۠ܺ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".negate()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/CharSequence;)I
    .locals 2

    .line 1526
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    iget-object v1, p0, Ll/۬۠ܺ;->᩸:Ll/ۨ۠ܺ;

    invoke-virtual {v1, p1}, Ll/ۨ۠ܺ;->֫(Ljava/lang/CharSequence;)I

    move-result p1

    sub-int/2addr v0, p1

    return v0
.end method

.method public final ֫()Ll/ۨ۠ܺ;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final ֫(C)Z
    .locals 1

    .line 1511
    iget-object v0, p0, Ll/۬۠ܺ;->᩸:Ll/ۨ۠ܺ;

    invoke-virtual {v0, p1}, Ll/ۨ۠ܺ;->֫(C)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public final ܽ(Ljava/lang/CharSequence;)Z
    .locals 1

    .line 1516
    iget-object v0, p0, Ll/۬۠ܺ;->᩸:Ll/ۨ۠ܺ;

    invoke-virtual {v0, p1}, Ll/ۨ۠ܺ;->ᩳ(Ljava/lang/CharSequence;)Z

    move-result p1

    return p1
.end method

.method public final ᩳ(Ljava/lang/CharSequence;)Z
    .locals 1

    .line 1521
    iget-object v0, p0, Ll/۬۠ܺ;->᩸:Ll/ۨ۠ܺ;

    invoke-virtual {v0, p1}, Ll/ۨ۠ܺ;->ܽ(Ljava/lang/CharSequence;)Z

    move-result p1

    return p1
.end method
