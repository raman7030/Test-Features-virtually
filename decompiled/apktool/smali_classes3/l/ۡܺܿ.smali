.class public final Ll/ۡܺܿ;
.super Ll/۬ᩴܺ;
.source "M97E"


# instance fields
.field public final ֫:I

.field public final ۧ:Ll/ۢܺܿ;


# direct methods
.method public constructor <init>(ILl/ۢܺܿ;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/ۡܺܿ;->֫:I

    iput-object p2, p0, Ll/ۡܺܿ;->ۧ:Ll/ۢܺܿ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 3
    instance-of v0, p1, Ll/ۡܺܿ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۡܺܿ;

    iget v0, p0, Ll/ۡܺܿ;->֫:I

    iget v1, p1, Ll/ۡܺܿ;->֫:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ۡܺܿ;->ۧ:Ll/ۢܺܿ;

    iget-object p1, p1, Ll/ۡܺܿ;->ۧ:Ll/ۢܺܿ;

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

    .line 3
    iget v0, p0, Ll/ۡܺܿ;->֫:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll/ۡܺܿ;->ۧ:Ll/ۢܺܿ;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 3
    iget v0, p0, Ll/ۡܺܿ;->֫:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v0, 0x1

    iget-object v3, p0, Ll/ۡܺܿ;->ۧ:Ll/ۢܺܿ;

    aput-object v3, v1, v0

    const-string v3, "group;syntaxItem"

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_0

    new-array v3, v2, [Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v4, ";"

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "SyntaxItemMark["

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    :goto_1
    array-length v5, v3

    if-ge v2, v5, :cond_2

    aget-object v5, v3, v2

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v5, v1, v2

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v5, v3

    sub-int/2addr v5, v0

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

.method public final ֫()I
    .locals 1

    .line 3
    iget v0, p0, Ll/ۡܺܿ;->֫:I

    return v0
.end method

.method public final ֫(Ll/ۢܺܿ;)Ll/ۡܺܿ;
    .locals 2

    .line 6
    new-instance v0, Ll/ۡܺܿ;

    iget-object v1, p0, Ll/ۡܺܿ;->ۧ:Ll/ۢܺܿ;

    invoke-virtual {v1, p1}, Ll/ۢܺܿ;->֫(Ll/ۢܺܿ;)Ll/ۢܺܿ;

    move-result-object p1

    iget v1, p0, Ll/ۡܺܿ;->֫:I

    invoke-direct {v0, v1, p1}, Ll/ۡܺܿ;-><init>(ILl/ۢܺܿ;)V

    return-object v0
.end method

.method public final ܽ()Ll/ۢܺܿ;
    .locals 1

    .line 3
    iget-object v0, p0, Ll/ۡܺܿ;->ۧ:Ll/ۢܺܿ;

    return-object v0
.end method
