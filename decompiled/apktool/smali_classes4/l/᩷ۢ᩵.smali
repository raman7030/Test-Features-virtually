.class public final Ll/᩷ۢ᩵;
.super Ljava/lang/Object;
.source "QA30"

# interfaces
.implements Ljava/util/Map$Entry;
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final serialVersionUID:J = 0x7f841f4555d499daL


# instance fields
.field public final ᩸:Ljava/lang/String;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, ""

    .line 134
    :goto_0
    iput-object p1, p0, Ll/᩷ۢ᩵;->᩹:Ljava/lang/String;

    .line 135
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۢ᩵;->᩸:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 171
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 174
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Ll/᩷ۢ᩵;->᩸:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 151
    iget-object v0, p0, Ll/᩷ۢ᩵;->᩹:Ljava/lang/String;

    .line 174
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final getKey()Ljava/lang/Object;
    .locals 1

    .line 143
    iget-object v0, p0, Ll/᩷ۢ᩵;->᩸:Ljava/lang/String;

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    .line 151
    iget-object v0, p0, Ll/᩷ۢ᩵;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    .line 182
    iget-object v1, p0, Ll/᩷ۢ᩵;->᩸:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    iget-object v2, p0, Ll/᩷ۢ᩵;->᩹:Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_1
    xor-int/2addr v0, v1

    return v0
.end method

.method public final setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 125
    check-cast p1, Ljava/lang/String;

    .line 163
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 200
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/᩷ۢ᩵;->᩸:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩷ۢ᩵;->᩹:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
