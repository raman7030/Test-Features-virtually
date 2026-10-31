.class public final Ll/ۧᩳܺ;
.super Ljava/lang/Object;
.source "BBDP"

# interfaces
.implements Ll/֫ۖܺ;


# instance fields
.field public final ᩸:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p1, :cond_0

    .line 47
    iput p1, p0, Ll/ۧᩳܺ;->᩸:I

    return-void

    .line 44
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "subroutineAddress < 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 111
    instance-of v0, p1, Ll/ۧᩳܺ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 115
    :cond_0
    check-cast p1, Ll/ۧᩳܺ;

    iget p1, p1, Ll/ۧᩳܺ;->᩸:I

    iget v0, p0, Ll/ۧᩳܺ;->᩸:I

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final getType()Ll/۟ܺܺ;
    .locals 1

    .line 71
    sget-object v0, Ll/۟ܺܺ;->᩹֫:Ll/۟ܺܺ;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 123
    iget v0, p0, Ll/ۧᩳܺ;->᩸:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<addr:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ۧᩳܺ;->᩸:I

    invoke-static {v1}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 63
    invoke-virtual {p0}, Ll/ۧᩳܺ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۡ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۢ()Ll/֫ۖܺ;
    .locals 0

    return-object p0
.end method

.method public final ۧ()I
    .locals 1

    .line 132
    iget v0, p0, Ll/ۧᩳܺ;->᩸:I

    return v0
.end method

.method public final ܿ()I
    .locals 1

    .line 87
    sget-object v0, Ll/۟ܺܺ;->᩹֫:Ll/۟ܺܺ;

    invoke-virtual {v0}, Ll/۟ܺܺ;->ܿ()I

    move-result v0

    return v0
.end method

.method public final ᩷()I
    .locals 1

    .line 95
    sget-object v0, Ll/۟ܺܺ;->᩹֫:Ll/۟ܺܺ;

    invoke-virtual {v0}, Ll/۟ܺܺ;->᩷()I

    move-result v0

    return v0
.end method
