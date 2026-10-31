.class public final Ll/᩵ᩴᩴ;
.super Ljava/lang/Object;
.source "W1E0"

# interfaces
.implements Ll/ۗᩴᩴ;
.implements Ljava/util/Map$Entry;
.implements Ll/ܺ᩺ۘ;


# instance fields
.field public ᩸:I

.field public final synthetic ᩹:Ll/۠ᩴᩴ;


# direct methods
.method public constructor <init>(Ll/۠ᩴᩴ;)V
    .locals 0

    .line 144
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ᩴᩴ;->᩹:Ll/۠ᩴᩴ;

    return-void
.end method

.method public constructor <init>(Ll/۠ᩴᩴ;I)V
    .locals 0

    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ᩴᩴ;->᩹:Ll/۠ᩴᩴ;

    .line 148
    iput p2, p0, Ll/᩵ᩴᩴ;->᩸:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 214
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 215
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 216
    iget-object v0, p0, Ll/᩵ᩴᩴ;->᩹:Ll/۠ᩴᩴ;

    iget-object v2, v0, Ll/۠ᩴᩴ;->᩹:[Ljava/lang/Object;

    iget v3, p0, Ll/᩵ᩴᩴ;->᩸:I

    aget-object v2, v2, v3

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v0, v0, Ll/۠ᩴᩴ;->ۗ:[I

    iget v2, p0, Ll/᩵ᩴᩴ;->᩸:I

    aget v0, v0, v2

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final first()Ljava/lang/Object;
    .locals 1

    .line 99
    invoke-virtual {p0}, Ll/᩵ᩴᩴ;->ܽ()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getKey()Ljava/lang/Object;
    .locals 2

    .line 154
    iget-object v0, p0, Ll/᩵ᩴᩴ;->᩹:Ll/۠ᩴᩴ;

    iget-object v0, v0, Ll/۠ᩴᩴ;->᩹:[Ljava/lang/Object;

    iget v1, p0, Ll/᩵ᩴᩴ;->᩸:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 197
    iget-object v0, p0, Ll/᩵ᩴᩴ;->᩹:Ll/۠ᩴᩴ;

    iget-object v0, v0, Ll/۠ᩴᩴ;->ۗ:[I

    iget v1, p0, Ll/᩵ᩴᩴ;->᩸:I

    aget v0, v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    .line 221
    iget-object v0, p0, Ll/᩵ᩴᩴ;->᩹:Ll/۠ᩴᩴ;

    iget-object v1, v0, Ll/۠ᩴᩴ;->᩹:[Ljava/lang/Object;

    iget v2, p0, Ll/᩵ᩴᩴ;->᩸:I

    aget-object v1, v1, v2

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    iget-object v0, v0, Ll/۠ᩴᩴ;->ۗ:[I

    iget v2, p0, Ll/᩵ᩴᩴ;->᩸:I

    aget v0, v0, v2

    xor-int/2addr v0, v1

    return v0
.end method

.method public final setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 140
    check-cast p1, Ljava/lang/Integer;

    .line 208
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 178
    iget-object v0, p0, Ll/᩵ᩴᩴ;->᩹:Ll/۠ᩴᩴ;

    iget-object v0, v0, Ll/۠ᩴᩴ;->ۗ:[I

    iget v1, p0, Ll/᩵ᩴᩴ;->᩸:I

    aget v2, v0, v1

    .line 179
    aput p1, v0, v1

    .line 208
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 226
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/᩵ᩴᩴ;->᩹:Ll/۠ᩴᩴ;

    iget-object v2, v1, Ll/۠ᩴᩴ;->᩹:[Ljava/lang/Object;

    iget v3, p0, Ll/᩵ᩴᩴ;->᩸:I

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "=>"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Ll/۠ᩴᩴ;->ۗ:[I

    iget v2, p0, Ll/᩵ᩴᩴ;->᩸:I

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۚ()I
    .locals 2

    .line 172
    iget-object v0, p0, Ll/᩵ᩴᩴ;->᩹:Ll/۠ᩴᩴ;

    iget-object v0, v0, Ll/۠ᩴᩴ;->ۗ:[I

    iget v1, p0, Ll/᩵ᩴᩴ;->᩸:I

    aget v0, v0, v1

    return v0
.end method

.method public final ܳ()Ljava/lang/Object;
    .locals 1

    .line 38
    invoke-virtual {p0}, Ll/᩵ᩴᩴ;->ۚ()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ljava/lang/Object;
    .locals 2

    .line 160
    iget-object v0, p0, Ll/᩵ᩴᩴ;->᩹:Ll/۠ᩴᩴ;

    iget-object v0, v0, Ll/۠ᩴᩴ;->᩹:[Ljava/lang/Object;

    iget v1, p0, Ll/᩵ᩴᩴ;->᩸:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/Object;
    .locals 1

    .line 72
    invoke-virtual {p0}, Ll/᩵ᩴᩴ;->ۚ()I

    move-result v0

    .line 83
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()I
    .locals 2

    .line 166
    iget-object v0, p0, Ll/᩵ᩴᩴ;->᩹:Ll/۠ᩴᩴ;

    iget-object v0, v0, Ll/۠ᩴᩴ;->ۗ:[I

    iget v1, p0, Ll/᩵ᩴᩴ;->᩸:I

    aget v0, v0, v1

    return v0
.end method
