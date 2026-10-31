.class public final Ll/ᩳ֫ܿ;
.super Ll/۬ᩴܺ;
.source "S4H6"


# instance fields
.field public final ֫:Ll/ܿ֫ܿ;

.field public final ۧ:Ll/᩻֫ܿ;

.field public final ܽ:Ll/ۢ֫ܿ;


# direct methods
.method public constructor <init>(Ll/ܿ֫ܿ;Ll/ۢ֫ܿ;Ll/᩻֫ܿ;)V
    .locals 0

    .line 599
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳ֫ܿ;->֫:Ll/ܿ֫ܿ;

    iput-object p2, p0, Ll/ᩳ֫ܿ;->ܽ:Ll/ۢ֫ܿ;

    iput-object p3, p0, Ll/ᩳ֫ܿ;->ۧ:Ll/᩻֫ܿ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩳ֫ܿ;)Ll/ܿ֫ܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳ֫ܿ;->֫:Ll/ܿ֫ܿ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ᩳ֫ܿ;)Ll/᩻֫ܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳ֫ܿ;->ۧ:Ll/᩻֫ܿ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ᩳ֫ܿ;)Ll/ۢ֫ܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳ֫ܿ;->ܽ:Ll/ۢ֫ܿ;

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 599
    instance-of v0, p1, Ll/ᩳ֫ܿ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ᩳ֫ܿ;

    iget-object v0, p0, Ll/ᩳ֫ܿ;->֫:Ll/ܿ֫ܿ;

    iget-object v1, p1, Ll/ᩳ֫ܿ;->֫:Ll/ܿ֫ܿ;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ᩳ֫ܿ;->ܽ:Ll/ۢ֫ܿ;

    iget-object v1, p1, Ll/ᩳ֫ܿ;->ܽ:Ll/ۢ֫ܿ;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ᩳ֫ܿ;->ۧ:Ll/᩻֫ܿ;

    iget-object p1, p1, Ll/ᩳ֫ܿ;->ۧ:Ll/᩻֫ܿ;

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 599
    iget-object v0, p0, Ll/ᩳ֫ܿ;->֫:Ll/ܿ֫ܿ;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll/ᩳ֫ܿ;->ܽ:Ll/ۢ֫ܿ;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Ll/ᩳ֫ܿ;->ۧ:Ll/᩻֫ܿ;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 599
    iget-object v2, p0, Ll/ᩳ֫ܿ;->֫:Ll/ܿ֫ܿ;

    aput-object v2, v0, v1

    const/4 v2, 0x1

    iget-object v3, p0, Ll/ᩳ֫ܿ;->ܽ:Ll/ۢ֫ܿ;

    aput-object v3, v0, v2

    const/4 v3, 0x2

    iget-object v4, p0, Ll/ᩳ֫ܿ;->ۧ:Ll/᩻֫ܿ;

    aput-object v4, v0, v3

    const-string v3, "request;store;state"

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_0

    new-array v3, v1, [Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v4, ";"

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "["

    .line 0
    const-class v6, Ll/ᩳ֫ܿ;

    invoke-static {v6, v4, v5}, Ll/ۘ᩺ۘ;->֫(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 599
    :goto_1
    array-length v5, v3

    if-ge v1, v5, :cond_2

    aget-object v5, v3, v1

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v5, v0, v1

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v5, v3

    sub-int/2addr v5, v2

    if-eq v1, v5, :cond_1

    const-string v5, ", "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "]"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
