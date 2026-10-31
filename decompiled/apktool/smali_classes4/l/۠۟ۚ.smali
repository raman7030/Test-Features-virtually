.class public final Ll/۠۟ۚ;
.super Ll/ܽ۫ۚ;
.source "57DZ"


# instance fields
.field public ۗ:Ll/ᩳ֫֨;

.field public ۙ:Ll/ܰ۟ۚ;

.field public ۬:Ll/֫֫֨;


# direct methods
.method public constructor <init>(Ll/ܺۤۚ;Z)V
    .locals 0

    .line 66
    invoke-direct {p0, p1, p2}, Ll/ܽ۫ۚ;-><init>(Ll/ܺۤۚ;Z)V

    .line 67
    new-instance p1, Ll/֫֫֨;

    invoke-direct {p1}, Ll/֫֫֨;-><init>()V

    iput-object p1, p0, Ll/۠۟ۚ;->۬:Ll/֫֫֨;

    return-void
.end method


# virtual methods
.method public final getLength()I
    .locals 2

    .line 73
    invoke-super {p0}, Ll/ܽ۫ۚ;->getLength()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Ll/۠۟ۚ;->ۙ:Ll/ܰ۟ۚ;

    invoke-interface {v1}, Ll/֫ۨۚ;->getLength()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Ll/۠۟ۚ;->۬:Ll/֫֫֨;

    invoke-virtual {v1}, Ll/֫֫֨;->getLength()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 90
    iget-object v0, p0, Ll/۠۟ۚ;->ۗ:Ll/ᩳ֫֨;

    invoke-virtual {v0}, Ll/ᩳ֫֨;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/۠۟ۚ;->ۙ:Ll/ܰ۟ۚ;

    invoke-virtual {v1}, Ll/ܰ۟ۚ;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ll/۠۟ۚ;->۬:Ll/֫֫֨;

    invoke-virtual {v2}, Ll/֫֫֨;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 1

    .line 78
    iget-object v0, p0, Ll/۠۟ۚ;->ۗ:Ll/ᩳ֫֨;

    iget v0, v0, Ll/ᩳ֫֨;->ۙ:I

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->֫(I)V

    .line 79
    iget-object v0, p0, Ll/۠۟ۚ;->ۙ:Ll/ܰ۟ۚ;

    invoke-interface {v0, p1}, Ll/֫ۨۚ;->֫(Ll/֡۫ۚ;)V

    .line 80
    iget-object v0, p0, Ll/۠۟ۚ;->۬:Ll/֫֫֨;

    invoke-virtual {v0, p1}, Ll/֫֫֨;->֫(Ll/֡۫ۚ;)V

    .line 81
    invoke-super {p0, p1}, Ll/ܽ۫ۚ;->֫(Ll/֡۫ۚ;)V

    return-void
.end method
