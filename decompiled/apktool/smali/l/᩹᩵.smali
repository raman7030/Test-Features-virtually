.class public final Ll/᩹᩵;
.super Ljava/lang/Object;
.source "G58P"

# interfaces
.implements Ljava/util/Iterator;
.implements Ljava/util/Map$Entry;


# instance fields
.field public final synthetic ۙ:Ll/ۙ᩵;

.field public ᩶:I

.field public ᩸:I

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/ۙ᩵;)V
    .locals 1

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹᩵;->ۙ:Ll/ۙ᩵;

    const/4 v0, 0x0

    .line 77
    iput-boolean v0, p0, Ll/᩹᩵;->᩹:Z

    .line 80
    invoke-virtual {p1}, Ll/ۙ᩵;->ܽ()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/᩹᩵;->᩸:I

    const/4 p1, -0x1

    .line 81
    iput p1, p0, Ll/᩹᩵;->᩶:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 137
    iget-boolean v0, p0, Ll/᩹᩵;->᩹:Z

    if-eqz v0, :cond_5

    .line 141
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 144
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 145
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    iget v2, p0, Ll/᩹᩵;->᩶:I

    iget-object v3, p0, Ll/᩹᩵;->ۙ:Ll/ۙ᩵;

    invoke-virtual {v3, v2, v1}, Ll/ۙ᩵;->֫(II)Ljava/lang/Object;

    move-result-object v2

    if-eq v0, v2, :cond_2

    if-eqz v0, :cond_1

    .line 41
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    return v1

    .line 146
    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    iget v0, p0, Ll/᩹᩵;->᩶:I

    const/4 v2, 0x1

    invoke-virtual {v3, v0, v2}, Ll/ۙ᩵;->֫(II)Ljava/lang/Object;

    move-result-object v0

    if-eq p1, v0, :cond_4

    if-eqz p1, :cond_3

    .line 41
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    return v1

    :cond_4
    :goto_1
    return v2

    .line 138
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This container does not support retaining Map.Entry objects"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getKey()Ljava/lang/Object;
    .locals 3

    .line 110
    iget-boolean v0, p0, Ll/᩹᩵;->᩹:Z

    if-eqz v0, :cond_0

    .line 114
    iget v0, p0, Ll/᩹᩵;->᩶:I

    const/4 v1, 0x0

    iget-object v2, p0, Ll/᩹᩵;->ۙ:Ll/ۙ᩵;

    invoke-virtual {v2, v0, v1}, Ll/ۙ᩵;->֫(II)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 111
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This container does not support retaining Map.Entry objects"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 3

    .line 119
    iget-boolean v0, p0, Ll/᩹᩵;->᩹:Z

    if-eqz v0, :cond_0

    .line 123
    iget v0, p0, Ll/᩹᩵;->᩶:I

    const/4 v1, 0x1

    iget-object v2, p0, Ll/᩹᩵;->ۙ:Ll/ۙ᩵;

    invoke-virtual {v2, v0, v1}, Ll/ۙ᩵;->֫(II)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 120
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This container does not support retaining Map.Entry objects"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final hasNext()Z
    .locals 2

    .line 86
    iget v0, p0, Ll/᩹᩵;->᩶:I

    iget v1, p0, Ll/᩹᩵;->᩸:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final hashCode()I
    .locals 5

    .line 151
    iget-boolean v0, p0, Ll/᩹᩵;->᩹:Z

    if-eqz v0, :cond_2

    .line 155
    iget v0, p0, Ll/᩹᩵;->᩶:I

    iget-object v1, p0, Ll/᩹᩵;->ۙ:Ll/ۙ᩵;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Ll/ۙ᩵;->֫(II)Ljava/lang/Object;

    move-result-object v0

    .line 156
    iget v3, p0, Ll/᩹᩵;->᩶:I

    const/4 v4, 0x1

    invoke-virtual {v1, v3, v4}, Ll/ۙ᩵;->֫(II)Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 157
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    if-nez v1, :cond_1

    goto :goto_1

    .line 158
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    xor-int/2addr v0, v2

    return v0

    .line 152
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This container does not support retaining Map.Entry objects"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 91
    invoke-virtual {p0}, Ll/᩹᩵;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 92
    iget v0, p0, Ll/᩹᩵;->᩶:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Ll/᩹᩵;->᩶:I

    .line 93
    iput-boolean v1, p0, Ll/᩹᩵;->᩹:Z

    return-object p0

    .line 91
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 2

    .line 99
    iget-boolean v0, p0, Ll/᩹᩵;->᩹:Z

    if-eqz v0, :cond_0

    .line 102
    iget-object v0, p0, Ll/᩹᩵;->ۙ:Ll/ۙ᩵;

    iget v1, p0, Ll/᩹᩵;->᩶:I

    invoke-virtual {v0, v1}, Ll/ۙ᩵;->֫(I)V

    .line 103
    iget v0, p0, Ll/᩹᩵;->᩶:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/᩹᩵;->᩶:I

    .line 104
    iget v0, p0, Ll/᩹᩵;->᩸:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/᩹᩵;->᩸:I

    const/4 v0, 0x0

    .line 105
    iput-boolean v0, p0, Ll/᩹᩵;->᩹:Z

    return-void

    .line 100
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 128
    iget-boolean v0, p0, Ll/᩹᩵;->᩹:Z

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Ll/᩹᩵;->ۙ:Ll/ۙ᩵;

    iget v1, p0, Ll/᩹᩵;->᩶:I

    invoke-virtual {v0, v1, p1}, Ll/ۙ᩵;->֫(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 129
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This container does not support retaining Map.Entry objects"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 163
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/᩹᩵;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/᩹᩵;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
