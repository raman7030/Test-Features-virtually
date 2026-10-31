.class public final Ll/ۜܺۧ;
.super Ll/ܳܺۧ;
.source "W8IW"


# instance fields
.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Ljava/lang/String;

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "----"

    .line 33
    invoke-direct {p0, v0}, Ll/ܳܺۧ;-><init>(Ljava/lang/String;)V

    .line 34
    iput-object p1, p0, Ll/ۜܺۧ;->ܽ:Ljava/lang/String;

    .line 35
    iput-object p2, p0, Ll/ۜܺۧ;->ۧ:Ljava/lang/String;

    .line 36
    iput-object p3, p0, Ll/ۜܺۧ;->ᩳ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 44
    const-class v2, Ll/ۜܺۧ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 47
    :cond_1
    check-cast p1, Ll/ۜܺۧ;

    .line 48
    iget-object v2, p0, Ll/ۜܺۧ;->ۧ:Ljava/lang/String;

    iget-object v3, p1, Ll/ۜܺۧ;->ۧ:Ljava/lang/String;

    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/ۜܺۧ;->ܽ:Ljava/lang/String;

    iget-object v3, p1, Ll/ۜܺۧ;->ܽ:Ljava/lang/String;

    .line 49
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/ۜܺۧ;->ᩳ:Ljava/lang/String;

    iget-object p1, p1, Ll/ۜܺۧ;->ᩳ:Ljava/lang/String;

    .line 50
    invoke-static {v2, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    .line 56
    iget-object v1, p0, Ll/ۜܺۧ;->ܽ:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/lit16 v1, v1, 0x20f

    mul-int/lit8 v1, v1, 0x1f

    .line 57
    iget-object v2, p0, Ll/ۜܺۧ;->ۧ:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    .line 58
    iget-object v2, p0, Ll/ۜܺۧ;->ᩳ:Ljava/lang/String;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v0

    :cond_2
    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܳܺۧ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": domain="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۜܺۧ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۜܺۧ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
