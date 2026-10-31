.class public final Ll/ܳ᩵ܺ;
.super Ljava/lang/Object;
.source "AB81"


# instance fields
.field public final ֫:Ll/ܿ᩵ܺ;

.field public final ۧ:Ll/ܿ᩵ܺ;


# direct methods
.method public constructor <init>(Ll/ܿ᩵ܺ;Ljava/lang/String;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, Ll/ܳ᩵ܺ;->ۧ:Ll/ܿ᩵ܺ;

    .line 63
    invoke-virtual {p1, p2}, Ll/ܿ᩵ܺ;->֫(Ljava/lang/String;)Ll/ܿ᩵ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/ܳ᩵ܺ;->֫:Ll/ܿ᩵ܺ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 37
    :cond_0
    instance-of v1, p1, Ll/ܳ᩵ܺ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 41
    :cond_1
    check-cast p1, Ll/ܳ᩵ܺ;

    .line 42
    iget-object v1, p0, Ll/ܳ᩵ܺ;->ۧ:Ll/ܿ᩵ܺ;

    iget-object v3, p1, Ll/ܳ᩵ܺ;->ۧ:Ll/ܿ᩵ܺ;

    invoke-virtual {v1, v3}, Ll/ܿ᩵ܺ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ܳ᩵ܺ;->֫:Ll/ܿ᩵ܺ;

    iget-object p1, p1, Ll/ܳ᩵ܺ;->֫:Ll/ܿ᩵ܺ;

    invoke-virtual {v1, p1}, Ll/ܿ᩵ܺ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 47
    iget-object v0, p0, Ll/ܳ᩵ܺ;->ۧ:Ll/ܿ᩵ܺ;

    invoke-virtual {v0}, Ll/ܿ᩵ܺ;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 48
    iget-object v1, p0, Ll/ܳ᩵ܺ;->֫:Ll/ܿ᩵ܺ;

    invoke-virtual {v1}, Ll/ܿ᩵ܺ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܳ᩵ܺ;->ۧ:Ll/ܿ᩵ܺ;

    invoke-virtual {v1}, Ll/ܿ᩵ܺ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܳ᩵ܺ;->֫:Ll/ܿ᩵ܺ;

    iget-object v1, v1, Ll/ܿ᩵ܺ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Z
    .locals 2

    .line 83
    iget-object v0, p0, Ll/ܳ᩵ܺ;->ۧ:Ll/ܿ᩵ܺ;

    invoke-virtual {v0}, Ll/ܿ᩵ܺ;->֫()Ll/ᩳ᩵ܺ;

    move-result-object v0

    sget-object v1, Ll/ᩳ᩵ܺ;->᩶:Ll/ᩳ᩵ܺ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
