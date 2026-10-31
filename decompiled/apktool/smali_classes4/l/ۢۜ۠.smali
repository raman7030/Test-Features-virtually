.class public final Ll/ۢۜ۠;
.super Ll/ۡۘ֨;
.source "Z5U8"


# instance fields
.field public ۧ:Ll/ۙ֨֨;


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1843
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "/*proxy class*/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۢۜ۠;->ۧ:Ll/ۙ֨֨;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".class"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۢۘ֨;)V
    .locals 0

    .line 1840
    check-cast p1, Ll/֨ۜ۠;

    invoke-interface {p1, p0}, Ll/֨ۜ۠;->֫(Ll/ۢۜ۠;)V

    return-void
.end method
