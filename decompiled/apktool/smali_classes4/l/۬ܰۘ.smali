.class public final Ll/۬ܰۘ;
.super Ljava/lang/Object;
.source "YCK3"

# interfaces
.implements Ll/ܽ۟ۘ;
.implements Ljava/util/Map$Entry;
.implements Ll/ܺ᩺ۘ;


# instance fields
.field public ᩸:I

.field public final synthetic ᩹:Ll/ۨܰۘ;


# direct methods
.method public constructor <init>(Ll/ۨܰۘ;)V
    .locals 0

    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬ܰۘ;->᩹:Ll/ۨܰۘ;

    return-void
.end method

.method public constructor <init>(Ll/ۨܰۘ;I)V
    .locals 0

    .line 148
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬ܰۘ;->᩹:Ll/ۨܰۘ;

    .line 149
    iput p2, p0, Ll/۬ܰۘ;->᩸:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 226
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 227
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 228
    iget-object v0, p0, Ll/۬ܰۘ;->᩹:Ll/ۨܰۘ;

    iget-object v2, v0, Ll/ۨܰۘ;->᩹:[C

    iget v3, p0, Ll/۬ܰۘ;->᩸:I

    aget-char v2, v2, v3

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Character;

    invoke-virtual {v3}, Ljava/lang/Character;->charValue()C

    move-result v3

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Ll/ۨܰۘ;->ۗ:[C

    iget v2, p0, Ll/۬ܰۘ;->᩸:I

    aget-char v0, v0, v2

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final first()Ljava/lang/Object;
    .locals 2

    .line 161
    iget-object v0, p0, Ll/۬ܰۘ;->᩹:Ll/ۨܰۘ;

    iget-object v0, v0, Ll/ۨܰۘ;->᩹:[C

    iget v1, p0, Ll/۬ܰۘ;->᩸:I

    aget-char v0, v0, v1

    .line 83
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    return-object v0
.end method

.method public final getKey()Ljava/lang/Object;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 198
    iget-object v0, p0, Ll/۬ܰۘ;->᩹:Ll/ۨܰۘ;

    iget-object v0, v0, Ll/ۨܰۘ;->᩹:[C

    iget v1, p0, Ll/۬ܰۘ;->᩸:I

    aget-char v0, v0, v1

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 209
    iget-object v0, p0, Ll/۬ܰۘ;->᩹:Ll/ۨܰۘ;

    iget-object v0, v0, Ll/ۨܰۘ;->ۗ:[C

    iget v1, p0, Ll/۬ܰۘ;->᩸:I

    aget-char v0, v0, v1

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    .line 233
    iget-object v0, p0, Ll/۬ܰۘ;->᩹:Ll/ۨܰۘ;

    iget-object v1, v0, Ll/ۨܰۘ;->᩹:[C

    iget v2, p0, Ll/۬ܰۘ;->᩸:I

    aget-char v1, v1, v2

    iget-object v0, v0, Ll/ۨܰۘ;->ۗ:[C

    aget-char v0, v0, v2

    xor-int/2addr v0, v1

    return v0
.end method

.method public final setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 141
    check-cast p1, Ljava/lang/Character;

    .line 220
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    .line 179
    iget-object v0, p0, Ll/۬ܰۘ;->᩹:Ll/ۨܰۘ;

    iget-object v0, v0, Ll/ۨܰۘ;->ۗ:[C

    iget v1, p0, Ll/۬ܰۘ;->᩸:I

    aget-char v2, v0, v1

    .line 180
    aput-char p1, v0, v1

    .line 220
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 238
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/۬ܰۘ;->᩹:Ll/ۨܰۘ;

    iget-object v2, v1, Ll/ۨܰۘ;->᩹:[C

    iget v3, p0, Ll/۬ܰۘ;->᩸:I

    aget-char v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "=>"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Ll/ۨܰۘ;->ۗ:[C

    iget v2, p0, Ll/۬ܰۘ;->᩸:I

    aget-char v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۡ()C
    .locals 2

    .line 167
    iget-object v0, p0, Ll/۬ܰۘ;->᩹:Ll/ۨܰۘ;

    iget-object v0, v0, Ll/ۨܰۘ;->ۗ:[C

    iget v1, p0, Ll/۬ܰۘ;->᩸:I

    aget-char v0, v0, v1

    return v0
.end method

.method public final ܳ()Ljava/lang/Object;
    .locals 2

    .line 173
    iget-object v0, p0, Ll/۬ܰۘ;->᩹:Ll/ۨܰۘ;

    iget-object v0, v0, Ll/ۨܰۘ;->ۗ:[C

    iget v1, p0, Ll/۬ܰۘ;->᩸:I

    aget-char v0, v0, v1

    .line 163
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ljava/lang/Object;
    .locals 2

    .line 161
    iget-object v0, p0, Ll/۬ܰۘ;->᩹:Ll/ۨܰۘ;

    iget-object v0, v0, Ll/ۨܰۘ;->᩹:[C

    iget v1, p0, Ll/۬ܰۘ;->᩸:I

    aget-char v0, v0, v1

    .line 38
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()C
    .locals 2

    .line 155
    iget-object v0, p0, Ll/۬ܰۘ;->᩹:Ll/ۨܰۘ;

    iget-object v0, v0, Ll/ۨܰۘ;->᩹:[C

    iget v1, p0, Ll/۬ܰۘ;->᩸:I

    aget-char v0, v0, v1

    return v0
.end method

.method public final ᩳ()Ljava/lang/Object;
    .locals 2

    .line 173
    iget-object v0, p0, Ll/۬ܰۘ;->᩹:Ll/ۨܰۘ;

    iget-object v0, v0, Ll/ۨܰۘ;->ۗ:[C

    iget v1, p0, Ll/۬ܰۘ;->᩸:I

    aget-char v0, v0, v1

    .line 208
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    return-object v0
.end method
