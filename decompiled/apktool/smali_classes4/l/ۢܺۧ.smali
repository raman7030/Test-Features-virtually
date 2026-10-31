.class public final Ll/ۢܺۧ;
.super Ll/ܳܺۧ;
.source "V8SO"


# instance fields
.field public final ۧ:Ljava/lang/String;

.field public final ܽ:[B


# direct methods
.method public constructor <init>(Ljava/lang/String;[B)V
    .locals 1

    const-string v0, "PRIV"

    .line 33
    invoke-direct {p0, v0}, Ll/ܳܺۧ;-><init>(Ljava/lang/String;)V

    .line 34
    iput-object p1, p0, Ll/ۢܺۧ;->ۧ:Ljava/lang/String;

    .line 35
    iput-object p2, p0, Ll/ۢܺۧ;->ܽ:[B

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

    .line 43
    const-class v2, Ll/ۢܺۧ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 46
    :cond_1
    check-cast p1, Ll/ۢܺۧ;

    .line 47
    iget-object v2, p0, Ll/ۢܺۧ;->ۧ:Ljava/lang/String;

    iget-object v3, p1, Ll/ۢܺۧ;->ۧ:Ljava/lang/String;

    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/ۢܺۧ;->ܽ:[B

    iget-object p1, p1, Ll/ۢܺۧ;->ܽ:[B

    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 53
    iget-object v0, p0, Ll/ۢܺۧ;->ۧ:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    .line 54
    iget-object v1, p0, Ll/ۢܺۧ;->ܽ:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܳܺۧ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": owner="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۢܺۧ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
