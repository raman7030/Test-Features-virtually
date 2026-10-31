.class public final Ll/۬ۚۘ;
.super Ljava/lang/Object;
.source "E8A6"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:I


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Ll/۬ۚۘ;->֫:Ljava/lang/String;

    .line 32
    iput p2, p0, Ll/۬ۚۘ;->ܽ:I

    .line 33
    iput-object p3, p0, Ll/۬ۚۘ;->ۧ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 53
    :cond_0
    instance-of v1, p1, Ll/۬ۚۘ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 56
    :cond_1
    move-object v1, p1

    check-cast v1, Ll/۬ۚۘ;

    .line 57
    invoke-virtual {p0, p1}, Ll/۬ۚۘ;->ۧ(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 37
    iget p1, p0, Ll/۬ۚۘ;->ܽ:I

    iget v3, v1, Ll/۬ۚۘ;->ܽ:I

    if-ne p1, v3, :cond_2

    .line 41
    iget-object p1, p0, Ll/۬ۚۘ;->ۧ:Ljava/lang/String;

    iget-object v1, v1, Ll/۬ۚۘ;->ۧ:Ljava/lang/String;

    .line 59
    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 4

    .line 31
    invoke-virtual {p0}, Ll/۬ۚۘ;->ܽ()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 37
    iget v1, p0, Ll/۬ۚۘ;->ܽ:I

    .line 46
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v1, 0x1

    iget-object v3, p0, Ll/۬ۚۘ;->ۧ:Ljava/lang/String;

    aput-object v3, v2, v1

    invoke-static {v2}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 65
    invoke-virtual {p0}, Ll/۬ۚۘ;->֫()Ljava/lang/String;

    move-result-object v0

    const-string v1, "null"

    const-string v2, "\""

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    .line 0
    :cond_0
    invoke-static {v2, v0, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 37
    :goto_0
    iget v3, p0, Ll/۬ۚۘ;->ܽ:I

    .line 65
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 53
    iget-object v4, p0, Ll/۬ۚۘ;->ۧ:Ljava/lang/String;

    if-nez v4, :cond_1

    goto :goto_1

    .line 0
    :cond_1
    invoke-static {v2, v4, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_1
    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v3, v2, v0

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const-string v0, "NetShareInfo1{netName: %s, type: %08x, remark: %s}"

    .line 64
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Ll/۬ۚۘ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 46
    :cond_0
    instance-of v0, p1, Ll/۬ۚۘ;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 49
    :cond_1
    check-cast p1, Ll/۬ۚۘ;

    .line 34
    iget-object p1, p1, Ll/۬ۚۘ;->֫:Ljava/lang/String;

    .line 49
    iget-object v0, p0, Ll/۬ۚۘ;->֫:Ljava/lang/String;

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ۧ()I
    .locals 1

    .line 37
    iget v0, p0, Ll/۬ۚۘ;->ܽ:I

    return v0
.end method

.method public final ۧ(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 38
    :cond_0
    instance-of v0, p1, Ll/۬ۚۘ;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 41
    :cond_1
    invoke-virtual {p0, p1}, Ll/۬ۚۘ;->֫(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ܽ()I
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 39
    iget-object v2, p0, Ll/۬ۚۘ;->֫:Ljava/lang/String;

    aput-object v2, v0, v1

    invoke-static {v0}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
