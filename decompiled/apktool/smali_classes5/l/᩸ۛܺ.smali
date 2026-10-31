.class public final Ll/᩸ۛܺ;
.super Ll/ۛ۬ܺ;
.source "Q5AZ"


# instance fields
.field public final transient ۙ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ll/ۛ۬ܺ;-><init>()V

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    iput-object p1, p0, Ll/᩸ۛܺ;->ۙ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 52
    iget-object v0, p0, Ll/᩸ۛܺ;->ۙ:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 78
    iget-object v0, p0, Ll/᩸ۛܺ;->ۙ:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 33
    invoke-virtual {p0}, Ll/᩸ۛܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v0

    return-object v0
.end method

.method public final iterator()Ll/᩶ۨܺ;
    .locals 2

    .line 1101
    new-instance v0, Ll/᩶۫ܺ;

    iget-object v1, p0, Ll/᩸ۛܺ;->ۙ:Ljava/lang/Object;

    invoke-direct {v0, v1}, Ll/᩶۫ܺ;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩸ۛܺ;->ۙ:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 1

    .line 92
    invoke-super {p0}, Ll/ۛ۬ܺ;->writeReplace()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I[Ljava/lang/Object;)I
    .locals 1

    .line 72
    iget-object v0, p0, Ll/᩸ۛܺ;->ۙ:Ljava/lang/Object;

    aput-object v0, p2, p1

    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public final ۧ()Ll/ܳ۬ܺ;
    .locals 1

    .line 62
    iget-object v0, p0, Ll/᩸ۛܺ;->ۙ:Ljava/lang/Object;

    invoke-static {v0}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
