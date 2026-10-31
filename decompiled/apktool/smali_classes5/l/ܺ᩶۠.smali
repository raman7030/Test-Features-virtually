.class public abstract Ll/ܺ᩶۠;
.super Ljava/lang/Object;
.source "07KX"

# interfaces
.implements Ll/᩷۠ᩴ;


# instance fields
.field public final ᩸:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 18
    invoke-static {p1}, Ll/ܺ᩶۠;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܺ᩶۠;->᩸:Ljava/lang/String;

    return-void

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Path cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 30
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    const-string v0, "/+"

    const-string v1, "/"

    .line 35
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 38
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v2, 0x1

    if-le v0, v2, :cond_1

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 0
    invoke-static {v2, v0, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_1
    return-object p0
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 10
    check-cast p1, Ll/᩷۠ᩴ;

    invoke-virtual {p0, p1}, Ll/ܺ᩶۠;->compareTo(Ll/᩷۠ᩴ;)I

    move-result p1

    return p1
.end method

.method public compareTo(Ll/᩷۠ᩴ;)I
    .locals 1

    .line 503
    iget-object v0, p0, Ll/ܺ᩶۠;->᩸:Ljava/lang/String;

    invoke-interface {p1}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public endsWith(Ljava/lang/String;)Z
    .locals 3

    if-nez p1, :cond_0

    goto :goto_0

    .line 207
    :cond_0
    invoke-static {p1}, Ll/ܺ᩶۠;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "/"

    .line 209
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    iget-object v2, p0, Ll/ܺ᩶۠;->᩸:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 211
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 214
    :cond_1
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 215
    invoke-virtual {v2, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_3
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public endsWith(Ll/᩷۠ᩴ;)Z
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 198
    :cond_0
    invoke-interface {p1}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܺ᩶۠;->endsWith(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 492
    :cond_0
    instance-of v1, p1, Ll/۠᩶۠;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Ll/۠᩶۠;

    .line 493
    move-object v1, p0

    check-cast v1, Ll/۠᩶۠;

    invoke-virtual {v1}, Ll/۠᩶۠;->getFileSystem()Ll/۟֨ᩴ;

    move-result-object v1

    invoke-virtual {p1}, Ll/۠᩶۠;->getFileSystem()Ll/ۚ᩶۠;

    move-result-object v3

    invoke-static {v1, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/ܺ᩶۠;->᩸:Ljava/lang/String;

    iget-object p1, p1, Ll/ܺ᩶۠;->᩸:Ljava/lang/String;

    invoke-static {v1, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public getFileName()Ll/᩷۠ᩴ;
    .locals 3

    .line 60
    iget-object v0, p0, Ll/ܺ᩶۠;->᩸:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v1, 0x2f

    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    .line 66
    invoke-virtual {p0, v0}, Ll/ܺ᩶۠;->֫(Ljava/lang/String;)Ll/۠᩶۠;

    move-result-object v0

    return-object v0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 70
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v0}, Ll/ܺ᩶۠;->֫(Ljava/lang/String;)Ll/۠᩶۠;

    move-result-object v0

    return-object v0

    :cond_3
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getName(I)Ll/᩷۠ᩴ;
    .locals 6

    .line 107
    invoke-virtual {p0}, Ll/ܺ᩶۠;->getNameCount()I

    move-result v0

    const-string v1, "Index out of bounds: "

    if-ltz p1, :cond_3

    if-ge p1, v0, :cond_3

    .line 113
    invoke-virtual {p0}, Ll/ܺ᩶۠;->isAbsolute()Z

    move-result v0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, -0x1

    const/16 v4, 0x2f

    .line 114
    iget-object v5, p0, Ll/ܺ᩶۠;->᩸:Ljava/lang/String;

    if-ge v2, p1, :cond_1

    .line 115
    invoke-virtual {v5, v4, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    if-eq v0, v3, :cond_0

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 117
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 117
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 123
    :cond_1
    invoke-virtual {v5, v4, v0}, Ljava/lang/String;->indexOf(II)I

    move-result p1

    if-ne p1, v3, :cond_2

    .line 125
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result p1

    .line 128
    :cond_2
    invoke-virtual {v5, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܺ᩶۠;->֫(Ljava/lang/String;)Ll/۠᩶۠;

    move-result-object p1

    return-object p1

    .line 109
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 109
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getNameCount()I
    .locals 4

    .line 93
    iget-object v0, p0, Ll/ܺ᩶۠;->᩸:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 96
    :cond_0
    invoke-virtual {p0}, Ll/ܺ᩶۠;->isAbsolute()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    :goto_0
    const/16 v3, 0x2f

    .line 98
    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1

    :cond_2
    :goto_1
    return v2
.end method

.method public getParent()Ll/᩷۠ᩴ;
    .locals 4

    .line 75
    iget-object v0, p0, Ll/ܺ᩶۠;->᩸:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/16 v2, 0x2f

    .line 79
    invoke-virtual {v0, v2}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    goto :goto_0

    :cond_1
    if-nez v2, :cond_2

    .line 85
    invoke-virtual {p0, v1}, Ll/ܺ᩶۠;->֫(Ljava/lang/String;)Ll/۠᩶۠;

    move-result-object v0

    return-object v0

    :cond_2
    const/4 v1, 0x0

    .line 88
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ܺ᩶۠;->֫(Ljava/lang/String;)Ll/۠᩶۠;

    move-result-object v0

    return-object v0

    :cond_3
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getRoot()Ll/᩷۠ᩴ;
    .locals 1

    .line 52
    invoke-virtual {p0}, Ll/ܺ᩶۠;->isAbsolute()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "/"

    .line 53
    invoke-virtual {p0, v0}, Ll/ܺ᩶۠;->֫(Ljava/lang/String;)Ll/۠᩶۠;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 498
    move-object v0, p0

    check-cast v0, Ll/۠᩶۠;

    invoke-virtual {v0}, Ll/۠᩶۠;->getFileSystem()Ll/۟֨ᩴ;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v0, 0x1

    iget-object v2, p0, Ll/ܺ᩶۠;->᩸:Ljava/lang/String;

    aput-object v2, v1, v0

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public isAbsolute()Z
    .locals 2

    .line 47
    iget-object v0, p0, Ll/ܺ᩶۠;->᩸:Ljava/lang/String;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2

    .line 464
    invoke-virtual {p0}, Ll/ܺ᩶۠;->getNameCount()I

    move-result v0

    .line 465
    new-instance v1, Ll/ۡ᩶۠;

    invoke-direct {v1, p0, v0}, Ll/ۡ᩶۠;-><init>(Ll/ܺ᩶۠;I)V

    return-object v1
.end method

.method public normalize()Ll/᩷۠ᩴ;
    .locals 7

    .line 220
    iget-object v0, p0, Ll/ܺ᩶۠;->᩸:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p0

    .line 224
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 230
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    const-string v5, "."

    if-ge v3, v4, :cond_6

    const/16 v4, 0x2f

    .line 231
    invoke-virtual {v0, v4, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v4

    const/4 v6, -0x1

    if-ne v4, v6, :cond_1

    .line 233
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    :cond_1
    if-le v4, v3, :cond_5

    .line 237
    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 240
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_1

    :cond_2
    const-string v5, ".."

    .line 242
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 243
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    const/4 v3, 0x1

    .line 0
    invoke-static {v1, v3}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v6

    .line 243
    check-cast v6, Ljava/lang/String;

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    .line 0
    invoke-static {v1, v3}, Ll/ᩴۖܽ;->֫(Ljava/util/ArrayList;I)V

    goto :goto_1

    .line 245
    :cond_3
    invoke-virtual {p0}, Ll/ܺ᩶۠;->isAbsolute()Z

    move-result v3

    if-nez v3, :cond_5

    .line 246
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 249
    :cond_4
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    :goto_1
    add-int/lit8 v3, v4, 0x1

    goto :goto_0

    .line 256
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 257
    invoke-virtual {p0}, Ll/ܺ᩶۠;->isAbsolute()Z

    move-result v3

    const-string v4, "/"

    if-eqz v3, :cond_7

    .line 258
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    :cond_7
    :goto_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_9

    if-lez v2, :cond_8

    .line 263
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    :cond_8
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 268
    :cond_9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 269
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {p0}, Ll/ܺ᩶۠;->isAbsolute()Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_3

    :cond_a
    move-object v5, v0

    .line 273
    :goto_3
    invoke-virtual {p0, v5}, Ll/ܺ᩶۠;->֫(Ljava/lang/String;)Ll/۠᩶۠;

    move-result-object v0

    return-object v0
.end method

.method public relativize(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;
    .locals 10

    if-eqz p1, :cond_e

    .line 339
    invoke-interface {p1}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v0

    .line 342
    invoke-virtual {p0}, Ll/ܺ᩶۠;->isAbsolute()Z

    move-result v1

    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-ne v1, v0, :cond_d

    .line 346
    invoke-virtual {p0}, Ll/ܺ᩶۠;->normalize()Ll/᩷۠ᩴ;

    move-result-object v0

    .line 347
    invoke-interface {p1}, Ll/᩷۠ᩴ;->normalize()Ll/᩷۠ᩴ;

    move-result-object p1

    .line 349
    check-cast v0, Ll/۠᩶۠;

    .line 486
    iget-object v0, v0, Ll/ܺ᩶۠;->᩸:Ljava/lang/String;

    .line 350
    invoke-interface {p1}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object p1

    .line 352
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v3, ""

    if-eqz v1, :cond_0

    .line 353
    invoke-virtual {p0, v3}, Ll/ܺ᩶۠;->֫(Ljava/lang/String;)Ll/۠᩶۠;

    move-result-object p1

    return-object p1

    .line 413
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v5, v1, :cond_1

    .line 417
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-ne v7, v8, :cond_1

    add-int/lit8 v6, v6, 0x1

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    const/16 v1, 0x2f

    if-lez v6, :cond_2

    .line 361
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v6, v5, :cond_2

    .line 362
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v6, v5, :cond_2

    .line 363
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-eq v5, v1, :cond_2

    .line 364
    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-eq v5, v1, :cond_2

    add-int/lit8 v6, v6, -0x1

    goto :goto_1

    .line 369
    :cond_2
    invoke-virtual {v0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 370
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    const/4 v7, 0x1

    if-eqz v5, :cond_3

    .line 371
    invoke-virtual {v0, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 375
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_5

    const/4 v5, 0x0

    const/4 v8, 0x1

    .line 377
    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v9

    if-ge v5, v9, :cond_6

    .line 378
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-ne v9, v1, :cond_4

    add-int/lit8 v8, v8, 0x1

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_5
    const/4 v8, 0x0

    .line 385
    :cond_6
    invoke-virtual {p1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 386
    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 387
    invoke-virtual {p1, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 391
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    :goto_3
    if-ge v4, v8, :cond_9

    if-lez v4, :cond_8

    .line 394
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    const-string v1, ".."

    .line 396
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 399
    :cond_9
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_b

    .line 400
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-lez v1, :cond_a

    .line 401
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    :cond_a
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    :cond_b
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result p1

    if-nez p1, :cond_c

    goto :goto_4

    :cond_c
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_4
    invoke-virtual {p0, v3}, Ll/ܺ᩶۠;->֫(Ljava/lang/String;)Ll/۠᩶۠;

    move-result-object p1

    return-object p1

    .line 343
    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot relativize absolute and relative paths"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 336
    :cond_e
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Other path cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;
    .locals 3

    if-eqz p1, :cond_4

    .line 290
    invoke-static {p1}, Ll/ܺ᩶۠;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 292
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    const-string v0, "/"

    .line 296
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 297
    invoke-virtual {p0, p1}, Ll/ܺ᩶۠;->֫(Ljava/lang/String;)Ll/۠᩶۠;

    move-result-object p1

    return-object p1

    .line 300
    :cond_1
    iget-object v1, p0, Ll/ܺ᩶۠;->᩸:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 301
    invoke-virtual {p0, p1}, Ll/ܺ᩶۠;->֫(Ljava/lang/String;)Ll/۠᩶۠;

    move-result-object p1

    return-object p1

    .line 304
    :cond_2
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 305
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܺ᩶۠;->֫(Ljava/lang/String;)Ll/۠᩶۠;

    move-result-object p1

    return-object p1

    .line 0
    :cond_3
    invoke-static {v1, v0, p1}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 308
    invoke-virtual {p0, p1}, Ll/ܺ᩶۠;->֫(Ljava/lang/String;)Ll/۠᩶۠;

    move-result-object p1

    return-object p1

    .line 287
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Other path cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public resolve(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;
    .locals 1

    if-eqz p1, :cond_0

    .line 281
    invoke-interface {p1}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܺ᩶۠;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p1

    return-object p1

    .line 279
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Other path cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public resolveSibling(Ljava/lang/String;)Ll/᩷۠ᩴ;
    .locals 1

    if-eqz p1, :cond_1

    .line 325
    invoke-virtual {p0}, Ll/ܺ᩶۠;->getParent()Ll/᩷۠ᩴ;

    move-result-object v0

    if-nez v0, :cond_0

    .line 327
    invoke-static {p1}, Ll/ܺ᩶۠;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܺ᩶۠;->֫(Ljava/lang/String;)Ll/۠᩶۠;

    move-result-object p1

    return-object p1

    .line 330
    :cond_0
    check-cast v0, Ll/۠᩶۠;

    invoke-virtual {v0, p1}, Ll/ܺ᩶۠;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p1

    return-object p1

    .line 322
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Other path cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public resolveSibling(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;
    .locals 1

    if-eqz p1, :cond_0

    .line 316
    invoke-interface {p1}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܺ᩶۠;->resolveSibling(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p1

    return-object p1

    .line 314
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Other path cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public startsWith(Ljava/lang/String;)Z
    .locals 3

    if-nez p1, :cond_0

    goto :goto_0

    .line 178
    :cond_0
    invoke-static {p1}, Ll/ܺ᩶۠;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 181
    invoke-virtual {p0}, Ll/ܺ᩶۠;->isAbsolute()Z

    move-result v0

    const-string v1, "/"

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eq v0, v2, :cond_1

    goto :goto_0

    .line 185
    :cond_1
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Ll/ܺ᩶۠;->isAbsolute()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    .line 189
    :cond_2
    iget-object v0, p0, Ll/ܺ᩶۠;->᩸:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 190
    invoke-virtual {v0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_4
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public startsWith(Ll/᩷۠ᩴ;)Z
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 169
    :cond_0
    invoke-interface {p1}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܺ᩶۠;->startsWith(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public subpath(II)Ll/᩷۠ᩴ;
    .locals 7

    .line 133
    invoke-virtual {p0}, Ll/ܺ᩶۠;->getNameCount()I

    move-result v0

    if-ltz p1, :cond_4

    if-gt p2, v0, :cond_4

    if-ge p1, p2, :cond_4

    .line 138
    invoke-virtual {p0}, Ll/ܺ᩶۠;->isAbsolute()Z

    move-result v1

    iget-object v2, p0, Ll/ܺ᩶۠;->᩸:Ljava/lang/String;

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    :cond_0
    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    const/16 v6, 0x2f

    if-ge v4, p1, :cond_1

    .line 143
    invoke-virtual {v2, v6, v5}, Ljava/lang/String;->indexOf(II)I

    move-result v5

    add-int/2addr v5, v3

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 148
    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result p1

    if-ge p2, v0, :cond_3

    const/4 v0, 0x0

    :goto_1
    if-ge v1, p2, :cond_3

    .line 152
    invoke-virtual {v2, v6, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    add-int/lit8 v3, p2, -0x1

    if-ne v1, v3, :cond_2

    move p1, v0

    goto :goto_2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 161
    :cond_3
    :goto_2
    invoke-virtual {v2, v5, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܺ᩶۠;->֫(Ljava/lang/String;)Ll/۠᩶۠;

    move-result-object p1

    return-object p1

    .line 135
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid subpath indices"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toAbsolutePath()Ll/᩷۠ᩴ;
    .locals 2

    .line 430
    invoke-virtual {p0}, Ll/ܺ᩶۠;->isAbsolute()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 433
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܺ᩶۠;->᩸:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ܺ᩶۠;->֫(Ljava/lang/String;)Ll/۠᩶۠;

    move-result-object v0

    return-object v0
.end method

.method public abstract ֫(Ljava/lang/String;)Ll/۠᩶۠;
.end method
