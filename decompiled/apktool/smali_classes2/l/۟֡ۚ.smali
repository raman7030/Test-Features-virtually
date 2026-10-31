.class public final Ll/۟֡ۚ;
.super Ljava/lang/Object;
.source "X4TD"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 120
    iput p1, p0, Ll/۟֡ۚ;->ܽ:I

    .line 121
    iput p2, p0, Ll/۟֡ۚ;->ۧ:I

    .line 122
    iput p3, p0, Ll/۟֡ۚ;->֫:I

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

    if-eqz p1, :cond_4

    .line 171
    const-class v2, Ll/۟֡ۚ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 172
    :cond_1
    check-cast p1, Ll/۟֡ۚ;

    .line 173
    iget v2, p0, Ll/۟֡ۚ;->ܽ:I

    iget v3, p1, Ll/۟֡ۚ;->ܽ:I

    if-eq v2, v3, :cond_2

    return v1

    .line 174
    :cond_2
    iget v2, p0, Ll/۟֡ۚ;->ۧ:I

    iget v3, p1, Ll/۟֡ۚ;->ۧ:I

    if-eq v2, v3, :cond_3

    return v1

    .line 175
    :cond_3
    iget v2, p0, Ll/۟֡ۚ;->֫:I

    iget p1, p1, Ll/۟֡ۚ;->֫:I

    if-ne v2, p1, :cond_4

    return v0

    :cond_4
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 181
    iget v0, p0, Ll/۟֡ۚ;->ܽ:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/۟֡ۚ;->ۧ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 182
    iget v1, p0, Ll/۟֡ۚ;->֫:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 165
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Ll/۟֡ۚ;->ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/۟֡ۚ;->֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/۟֡ۚ;->ܽ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 131
    iget v0, p0, Ll/۟֡ۚ;->ܽ:I

    return v0
.end method
