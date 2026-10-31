.class public final Ll/ܿ᩶ܺ;
.super Ljava/lang/Object;
.source "E3QI"

# interfaces
.implements Ljava/util/Map$Entry;


# instance fields
.field public ᩶:Ljava/lang/Object;

.field public final ᩸:Ljava/lang/Object;

.field public final synthetic ᩹:Ll/ܳ᩶ܺ;


# direct methods
.method public constructor <init>(Ll/ܳ᩶ܺ;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 4339
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿ᩶ܺ;->᩹:Ll/ܳ᩶ܺ;

    .line 4340
    iput-object p2, p0, Ll/ܿ᩶ܺ;->᩸:Ljava/lang/Object;

    .line 4341
    iput-object p3, p0, Ll/ܿ᩶ܺ;->᩶:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 4357
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 4358
    check-cast p1, Ljava/util/Map$Entry;

    .line 4359
    iget-object v0, p0, Ll/ܿ᩶ܺ;->᩸:Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܿ᩶ܺ;->᩶:Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final getKey()Ljava/lang/Object;
    .locals 1

    .line 4346
    iget-object v0, p0, Ll/ܿ᩶ܺ;->᩸:Ljava/lang/Object;

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    .line 4351
    iget-object v0, p0, Ll/ܿ᩶ܺ;->᩶:Ljava/lang/Object;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    .line 4367
    iget-object v0, p0, Ll/ܿ᩶ܺ;->᩸:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Ll/ܿ᩶ܺ;->᩶:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 4372
    iget-object v0, p0, Ll/ܿ᩶ܺ;->᩹:Ll/ܳ᩶ܺ;

    iget-object v1, p0, Ll/ܿ᩶ܺ;->᩸:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, Ll/ܳ᩶ܺ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 4373
    iput-object p1, p0, Ll/ܿ᩶ܺ;->᩶:Ljava/lang/Object;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 4379
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4346
    iget-object v1, p0, Ll/ܿ᩶ܺ;->᩸:Ljava/lang/Object;

    .line 4379
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4351
    iget-object v1, p0, Ll/ܿ᩶ܺ;->᩶:Ljava/lang/Object;

    .line 4379
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
