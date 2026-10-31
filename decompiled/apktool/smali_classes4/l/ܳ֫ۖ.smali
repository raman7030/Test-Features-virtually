.class public final Ll/ܳ֫ۖ;
.super Ll/۠֫ۖ;
.source "M7NB"


# instance fields
.field public final ֫:Z

.field public final ۧ:Z

.field public final ܽ:Ll/֨֫ۖ;


# direct methods
.method public constructor <init>(ZZLl/֨֫ۖ;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p1, p0, Ll/ܳ֫ۖ;->֫:Z

    .line 19
    iput-boolean p2, p0, Ll/ܳ֫ۖ;->ۧ:Z

    .line 20
    iput-object p3, p0, Ll/ܳ֫ۖ;->ܽ:Ll/֨֫ۖ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    goto :goto_0

    .line 52
    :cond_0
    instance-of v0, p1, Ll/۠֫ۖ;

    if-eqz v0, :cond_1

    .line 53
    check-cast p1, Ll/۠֫ۖ;

    .line 54
    iget-boolean v0, p0, Ll/ܳ֫ۖ;->֫:Z

    invoke-virtual {p1}, Ll/۠֫ۖ;->֫()Z

    move-result v1

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Ll/ܳ֫ۖ;->ۧ:Z

    .line 55
    invoke-virtual {p1}, Ll/۠֫ۖ;->ۧ()Z

    move-result v1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Ll/ܳ֫ۖ;->ܽ:Ll/֨֫ۖ;

    .line 56
    invoke-virtual {p1}, Ll/۠֫ۖ;->ܽ()Ll/֨֫ۖ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    .locals 4

    .line 65
    iget-boolean v0, p0, Ll/ܳ֫ۖ;->֫:Z

    const/16 v1, 0x4d5

    if-eqz v0, :cond_0

    const/16 v0, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v0, 0x4d5

    :goto_0
    const v2, 0xf4243

    xor-int/2addr v0, v2

    mul-int v0, v0, v2

    .line 67
    iget-boolean v3, p0, Ll/ܳ֫ۖ;->ۧ:Z

    if-eqz v3, :cond_1

    const/16 v1, 0x4cf

    :cond_1
    xor-int/2addr v0, v1

    mul-int v0, v0, v2

    .line 69
    iget-object v1, p0, Ll/ܳ֫ۖ;->ܽ:Ll/֨֫ۖ;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "JavaFormatterOptions{formatJavadoc="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Ll/ܳ֫ۖ;->֫:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", reorderModifiers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/ܳ֫ۖ;->ۧ:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܳ֫ۖ;->ܽ:Ll/֨֫ۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Z
    .locals 1

    .line 25
    iget-boolean v0, p0, Ll/ܳ֫ۖ;->֫:Z

    return v0
.end method

.method public final ۧ()Z
    .locals 1

    .line 30
    iget-boolean v0, p0, Ll/ܳ֫ۖ;->ۧ:Z

    return v0
.end method

.method public final ܽ()Ll/֨֫ۖ;
    .locals 1

    .line 35
    iget-object v0, p0, Ll/ܳ֫ۖ;->ܽ:Ll/֨֫ۖ;

    return-object v0
.end method
