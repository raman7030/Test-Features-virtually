.class public final Ll/ۚۙۡ;
.super Ll/۬ᩴܺ;
.source "Z99H"


# instance fields
.field public final ֫:Ll/ܽۙۡ;

.field public final ۧ:Z

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/ܽۙۡ;Z)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚۙۡ;->ܽ:Ljava/lang/String;

    iput-object p2, p0, Ll/ۚۙۡ;->֫:Ll/ܽۙۡ;

    iput-boolean p3, p0, Ll/ۚۙۡ;->ۧ:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_4

    .line 31
    const-class v0, Ll/ۚۙۡ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 33
    :cond_1
    check-cast p1, Ll/ۚۙۡ;

    .line 35
    iget-boolean v0, p0, Ll/ۚۙۡ;->ۧ:Z

    iget-boolean v1, p1, Ll/ۚۙۡ;->ۧ:Z

    if-eq v0, v1, :cond_2

    goto :goto_0

    .line 36
    :cond_2
    iget-object v0, p0, Ll/ۚۙۡ;->ܽ:Ljava/lang/String;

    iget-object v1, p1, Ll/ۚۙۡ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    .line 37
    :cond_3
    iget-object v0, p0, Ll/ۚۙۡ;->֫:Ll/ܽۙۡ;

    iget-object p1, p1, Ll/ۚۙۡ;->֫:Ll/ܽۙۡ;

    invoke-virtual {v0, p1}, Ll/ܽۙۡ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 42
    iget-object v0, p0, Ll/ۚۙۡ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 43
    iget-object v1, p0, Ll/ۚۙۡ;->֫:Ll/ܽۙۡ;

    invoke-virtual {v1}, Ll/ܽۙۡ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 44
    iget-boolean v0, p0, Ll/ۚۙۡ;->ۧ:Z

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 10
    iget-boolean v0, p0, Ll/ۚۙۡ;->ۧ:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Ll/ۚۙۡ;->ܽ:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v3, 0x1

    iget-object v4, p0, Ll/ۚۙۡ;->֫:Ll/ܽۙۡ;

    aput-object v4, v1, v3

    const/4 v4, 0x2

    aput-object v0, v1, v4

    const-string v0, "name;descriptor;isMethod"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_0

    new-array v0, v2, [Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v4, ";"

    invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "NameDescriptorKey["

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    :goto_1
    array-length v5, v0

    if-ge v2, v5, :cond_2

    aget-object v5, v0, v2

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v5, v1, v2

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v5, v0

    sub-int/2addr v5, v3

    if-eq v2, v5, :cond_1

    const-string v5, ", "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "]"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Z
    .locals 1

    .line 10
    iget-boolean v0, p0, Ll/ۚۙۡ;->ۧ:Z

    return v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 10
    iget-object v0, p0, Ll/ۚۙۡ;->ܽ:Ljava/lang/String;

    return-object v0
.end method
