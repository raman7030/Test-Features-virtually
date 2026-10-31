.class public final Ll/ۤۨۘ;
.super Ljava/lang/Object;
.source "Z8WD"


# instance fields
.field public final ֫:Z

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Ll/ۤۨۘ;->ۧ:Ljava/lang/String;

    .line 13
    iput-boolean p3, p0, Ll/ۤۨۘ;->֫:Z

    .line 14
    iput-object p2, p0, Ll/ۤۨۘ;->ܽ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_6

    .line 43
    const-class v2, Ll/ۤۨۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    .line 45
    :cond_1
    check-cast p1, Ll/ۤۨۘ;

    iget-object v2, p1, Ll/ۤۨۘ;->ܽ:Ljava/lang/String;

    iget-object v3, p1, Ll/ۤۨۘ;->ۧ:Ljava/lang/String;

    .line 47
    iget-boolean v4, p0, Ll/ۤۨۘ;->֫:Z

    iget-boolean p1, p1, Ll/ۤۨۘ;->֫:Z

    if-eq v4, p1, :cond_2

    return v1

    .line 48
    :cond_2
    iget-object p1, p0, Ll/ۤۨۘ;->ۧ:Ljava/lang/String;

    if-eqz p1, :cond_3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_3
    if-eqz v3, :cond_4

    :goto_0
    return v1

    .line 50
    :cond_4
    iget-object p1, p0, Ll/ۤۨۘ;->ܽ:Ljava/lang/String;

    if-eqz p1, :cond_5

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_5
    if-nez v2, :cond_6

    return v0

    :cond_6
    :goto_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    .line 55
    iget-object v1, p0, Ll/ۤۨۘ;->ۧ:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    .line 56
    iget-boolean v2, p0, Ll/ۤۨۘ;->֫:Z

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    .line 57
    iget-object v2, p0, Ll/ۤۨۘ;->ܽ:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v0

    :cond_1
    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DataUri{contentType=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۤۨۘ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', base64="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/ۤۨۘ;->֫:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", data=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۤۨۘ;->ܽ:Ljava/lang/String;

    const-string v2, "\'}"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Z
    .locals 1

    .line 23
    iget-boolean v0, p0, Ll/ۤۨۘ;->֫:Z

    return v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Ll/ۤۨۘ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Ll/ۤۨۘ;->ܽ:Ljava/lang/String;

    return-object v0
.end method
