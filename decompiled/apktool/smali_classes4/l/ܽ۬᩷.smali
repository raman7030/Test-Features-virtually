.class public final Ll/ܽ۬᩷;
.super Ll/۬ᩴܺ;
.source "U998"


# instance fields
.field public final ֫:I

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:I


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽ۬᩷;->ۧ:Ljava/lang/String;

    iput p2, p0, Ll/ܽ۬᩷;->֫:I

    iput p3, p0, Ll/ܽ۬᩷;->ܽ:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܽ۬᩷;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽ۬᩷;->ۧ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ܽ۬᩷;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܽ۬᩷;->ܽ:I

    return p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 128
    instance-of v0, p1, Ll/ܽ۬᩷;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ܽ۬᩷;

    iget v0, p0, Ll/ܽ۬᩷;->֫:I

    iget v1, p1, Ll/ܽ۬᩷;->֫:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ܽ۬᩷;->ܽ:I

    iget v1, p1, Ll/ܽ۬᩷;->ܽ:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ܽ۬᩷;->ۧ:Ljava/lang/String;

    iget-object p1, p1, Ll/ܽ۬᩷;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 3

    const/16 v0, 0x1f

    .line 128
    iget v1, p0, Ll/ܽ۬᩷;->֫:I

    iget v2, p0, Ll/ܽ۬᩷;->ܽ:I

    invoke-static {v1, v0, v2, v0}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    iget-object v1, p0, Ll/ܽ۬᩷;->ۧ:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 128
    iget v0, p0, Ll/ܽ۬᩷;->֫:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Ll/ܽ۬᩷;->ܽ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Ll/ܽ۬᩷;->ۧ:Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v4, 0x1

    aput-object v0, v2, v4

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const-string v0, "name;colorRes;styleRes"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    new-array v0, v3, [Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "["

    .line 0
    const-class v6, Ll/ܽ۬᩷;

    invoke-static {v6, v1, v5}, Ll/ۘ᩺ۘ;->֫(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 128
    :goto_1
    array-length v5, v0

    if-ge v3, v5, :cond_2

    aget-object v5, v0, v3

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "="

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v5, v2, v3

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v5, v0

    sub-int/2addr v5, v4

    if-eq v3, v5, :cond_1

    const-string v5, ", "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 128
    iget v0, p0, Ll/ܽ۬᩷;->֫:I

    return v0
.end method
