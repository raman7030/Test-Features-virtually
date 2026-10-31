.class public final Ll/᩻֫ۖ;
.super Ll/ۡۧۖ;
.source "U7ND"


# instance fields
.field public final ֫:Ll/ܳ۬ܺ;

.field public final ۧ:Ll/ܳ۬ܺ;


# direct methods
.method public constructor <init>(Ll/ܳ۬ܺ;Ll/ܳ۬ܺ;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ll/ۡۧۖ;-><init>()V

    if-eqz p1, :cond_1

    .line 22
    iput-object p1, p0, Ll/᩻֫ۖ;->֫:Ll/ܳ۬ܺ;

    if-eqz p2, :cond_0

    .line 26
    iput-object p2, p0, Ll/᩻֫ۖ;->ۧ:Ll/ܳ۬ܺ;

    return-void

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null typeAnnotations"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 20
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null declarationModifiers"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    goto :goto_0

    .line 52
    :cond_0
    instance-of v0, p1, Ll/ۡۧۖ;

    if-eqz v0, :cond_1

    .line 53
    check-cast p1, Ll/ۡۧۖ;

    .line 54
    iget-object v0, p0, Ll/᩻֫ۖ;->֫:Ll/ܳ۬ܺ;

    invoke-virtual {p1}, Ll/ۡۧۖ;->֫()Ll/ܳ۬ܺ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܳ۬ܺ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/᩻֫ۖ;->ۧ:Ll/ܳ۬ܺ;

    .line 55
    invoke-virtual {p1}, Ll/ۡۧۖ;->ܽ()Ll/ܳ۬ܺ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܳ۬ܺ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 64
    iget-object v0, p0, Ll/᩻֫ۖ;->֫:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ll/ܳ۬ܺ;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 66
    iget-object v1, p0, Ll/᩻֫ۖ;->ۧ:Ll/ܳ۬ܺ;

    invoke-virtual {v1}, Ll/ܳ۬ܺ;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DeclarationModifiersAndTypeAnnotations{declarationModifiers="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩻֫ۖ;->֫:Ll/ܳ۬ܺ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", typeAnnotations="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩻֫ۖ;->ۧ:Ll/ܳ۬ܺ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ܳ۬ܺ;
    .locals 1

    .line 31
    iget-object v0, p0, Ll/᩻֫ۖ;->֫:Ll/ܳ۬ܺ;

    return-object v0
.end method

.method public final ܽ()Ll/ܳ۬ܺ;
    .locals 1

    .line 36
    iget-object v0, p0, Ll/᩻֫ۖ;->ۧ:Ll/ܳ۬ܺ;

    return-object v0
.end method
