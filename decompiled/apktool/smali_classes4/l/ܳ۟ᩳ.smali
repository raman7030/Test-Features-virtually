.class public final Ll/ܳ۟ᩳ;
.super Ll/۬ᩴܺ;
.source "Z6PS"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(IIII)V
    .locals 0

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/ܳ۟ᩳ;->ᩳ:I

    iput p2, p0, Ll/ܳ۟ᩳ;->֫:I

    iput p3, p0, Ll/ܳ۟ᩳ;->ܽ:I

    iput p4, p0, Ll/ܳ۟ᩳ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 72
    instance-of v0, p1, Ll/ܳ۟ᩳ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ܳ۟ᩳ;

    iget v0, p0, Ll/ܳ۟ᩳ;->ᩳ:I

    iget v1, p1, Ll/ܳ۟ᩳ;->ᩳ:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ܳ۟ᩳ;->֫:I

    iget v1, p1, Ll/ܳ۟ᩳ;->֫:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ܳ۟ᩳ;->ܽ:I

    iget v1, p1, Ll/ܳ۟ᩳ;->ܽ:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ܳ۟ᩳ;->ۧ:I

    iget p1, p1, Ll/ܳ۟ᩳ;->ۧ:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 72
    iget v0, p0, Ll/ܳ۟ᩳ;->ᩳ:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/ܳ۟ᩳ;->֫:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/ܳ۟ᩳ;->ܽ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/ܳ۟ᩳ;->ۧ:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 72
    iget v0, p0, Ll/ܳ۟ᩳ;->ᩳ:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Ll/ܳ۟ᩳ;->֫:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Ll/ܳ۟ᩳ;->ܽ:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p0, Ll/ܳ۟ᩳ;->ۧ:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v1, 0x2

    aput-object v2, v4, v1

    const/4 v1, 0x3

    aput-object v3, v4, v1

    const-string v1, "start;end;selectionStart;selectionEnd"

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_0

    new-array v1, v5, [Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v2, ";"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "["

    .line 0
    const-class v6, Ll/ܳ۟ᩳ;

    invoke-static {v6, v2, v3}, Ll/ۘ᩺ۘ;->֫(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 72
    :goto_1
    array-length v3, v1

    if-ge v5, v3, :cond_2

    aget-object v3, v1, v5

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v3, v4, v5

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v3, v1

    sub-int/2addr v3, v0

    if-eq v5, v3, :cond_1

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 72
    iget v0, p0, Ll/ܳ۟ᩳ;->֫:I

    return v0
.end method

.method public final ֫(I)Z
    .locals 1

    .line 74
    iget v0, p0, Ll/ܳ۟ᩳ;->ᩳ:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Ll/ܳ۟ᩳ;->֫:I

    if-lt p1, v0, :cond_2

    :cond_0
    iget v0, p0, Ll/ܳ۟ᩳ;->ܽ:I

    if-eq p1, v0, :cond_2

    iget v0, p0, Ll/ܳ۟ᩳ;->ۧ:I

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final ܳ()I
    .locals 1

    .line 72
    iget v0, p0, Ll/ܳ۟ᩳ;->ᩳ:I

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 72
    iget v0, p0, Ll/ܳ۟ᩳ;->ۧ:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 72
    iget v0, p0, Ll/ܳ۟ᩳ;->ܽ:I

    return v0
.end method
