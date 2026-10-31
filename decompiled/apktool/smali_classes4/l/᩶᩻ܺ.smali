.class public final Ll/᩶᩻ܺ;
.super Ljava/lang/Object;
.source "NB9V"


# instance fields
.field public final ֫:Ll/᩶ܿܺ;

.field public ۧ:I

.field public ܽ:[B

.field public ܿ:Ll/۠ܿܺ;

.field public ᩳ:Ljava/util/TreeMap;


# direct methods
.method public constructor <init>(Ll/᩶ܿܺ;)V
    .locals 1

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    iput-object p1, p0, Ll/᩶᩻ܺ;->֫:Ll/᩶ܿܺ;

    const/4 p1, 0x0

    .line 79
    iput-object p1, p0, Ll/᩶᩻ܺ;->ܿ:Ll/۠ܿܺ;

    .line 80
    iput-object p1, p0, Ll/᩶᩻ܺ;->ܽ:[B

    const/4 v0, 0x0

    .line 81
    iput v0, p0, Ll/᩶᩻ܺ;->ۧ:I

    .line 82
    iput-object p1, p0, Ll/᩶᩻ܺ;->ᩳ:Ljava/util/TreeMap;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 89
    iget-object v0, p0, Ll/᩶᩻ܺ;->ܿ:Ll/۠ܿܺ;

    if-nez v0, :cond_0

    .line 90
    iget-object v0, p0, Ll/᩶᩻ܺ;->֫:Ll/᩶ܿܺ;

    invoke-virtual {v0}, Ll/᩶ܿܺ;->ۧ()Ll/۠ܿܺ;

    move-result-object v0

    iput-object v0, p0, Ll/᩶᩻ܺ;->ܿ:Ll/۠ܿܺ;

    .line 101
    :cond_0
    iget-object v0, p0, Ll/᩶᩻ܺ;->ܿ:Ll/۠ܿܺ;

    invoke-virtual {v0}, Ll/ܿᩴܺ;->size()I

    move-result v0

    return v0
.end method

.method public final ֫(Ll/֫ۜܺ;)V
    .locals 8

    .line 89
    iget-object v0, p0, Ll/᩶᩻ܺ;->ܿ:Ll/۠ܿܺ;

    if-nez v0, :cond_0

    .line 90
    iget-object v0, p0, Ll/᩶᩻ܺ;->֫:Ll/᩶ܿܺ;

    invoke-virtual {v0}, Ll/᩶ܿܺ;->ۧ()Ll/۠ܿܺ;

    move-result-object v0

    iput-object v0, p0, Ll/᩶᩻ܺ;->ܿ:Ll/۠ܿܺ;

    .line 122
    :cond_0
    invoke-virtual {p1}, Ll/֫ۜܺ;->᩵()Ll/ܽ᩷ܺ;

    move-result-object p1

    .line 123
    iget-object v0, p0, Ll/᩶᩻ܺ;->ܿ:Ll/۠ܿܺ;

    invoke-virtual {v0}, Ll/ܿᩴܺ;->size()I

    move-result v0

    .line 125
    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    iput-object v1, p0, Ll/᩶᩻ܺ;->ᩳ:Ljava/util/TreeMap;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 132
    iget-object v2, p0, Ll/᩶᩻ܺ;->ᩳ:Ljava/util/TreeMap;

    iget-object v3, p0, Ll/᩶᩻ܺ;->ܿ:Ll/۠ܿܺ;

    invoke-virtual {v3, v1}, Ll/ܿᩴܺ;->get(I)Ll/֨ܿܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/֨ܿܺ;->ۧ()Ll/ۚܿܺ;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 135
    :cond_1
    iget-object v0, p0, Ll/᩶᩻ܺ;->ᩳ:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    move-result v0

    const v1, 0xffff

    if-gt v0, v1, :cond_6

    .line 140
    new-instance v0, Ll/ᩳᩴܺ;

    invoke-direct {v0}, Ll/ᩳᩴܺ;-><init>()V

    .line 143
    iget-object v1, p0, Ll/᩶᩻ܺ;->ᩳ:Ljava/util/TreeMap;

    .line 144
    invoke-virtual {v1}, Ljava/util/TreeMap;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ᩳᩴܺ;->ۜ(I)I

    move-result v1

    iput v1, p0, Ll/᩶᩻ܺ;->ۧ:I

    .line 148
    iget-object v1, p0, Ll/᩶᩻ܺ;->ᩳ:Ljava/util/TreeMap;

    invoke-virtual {v1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 149
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۚܿܺ;

    .line 150
    invoke-virtual {v3}, Ll/ܿᩴܺ;->size()I

    move-result v4

    .line 151
    invoke-virtual {v3}, Ll/ۚܿܺ;->֨()Z

    move-result v5

    .line 154
    invoke-virtual {v0}, Ll/ᩳᩴܺ;->ܳ()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v5, :cond_3

    add-int/lit8 v2, v4, -0x1

    neg-int v2, v2

    .line 158
    invoke-virtual {v0, v2}, Ll/ᩳᩴܺ;->᩻(I)V

    add-int/lit8 v4, v4, -0x1

    goto :goto_2

    .line 161
    :cond_3
    invoke-virtual {v0, v4}, Ll/ᩳᩴܺ;->᩻(I)V

    :goto_2
    const/4 v2, 0x0

    :goto_3
    if-ge v2, v4, :cond_4

    .line 165
    invoke-virtual {v3, v2}, Ll/ܿᩴܺ;->get(I)Ll/֡ܿܺ;

    move-result-object v6

    .line 167
    invoke-virtual {v6}, Ll/֡ܿܺ;->ܽۧ()Ll/۫ܺܺ;

    move-result-object v7

    invoke-virtual {p1, v7}, Ll/ܽ᩷ܺ;->֫(Ll/۫ܺܺ;)I

    move-result v7

    .line 166
    invoke-virtual {v0, v7}, Ll/ᩳᩴܺ;->ۜ(I)I

    .line 168
    invoke-virtual {v6}, Ll/֡ܿܺ;->֫()I

    move-result v6

    invoke-virtual {v0, v6}, Ll/ᩳᩴܺ;->ۜ(I)I

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_4
    if-eqz v5, :cond_2

    .line 172
    invoke-virtual {v3, v4}, Ll/ܿᩴܺ;->get(I)Ll/֡ܿܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/֡ܿܺ;->֫()I

    move-result v2

    invoke-virtual {v0, v2}, Ll/ᩳᩴܺ;->ۜ(I)I

    goto :goto_1

    .line 176
    :cond_5
    invoke-virtual {v0}, Ll/ᩳᩴܺ;->᩻()[B

    move-result-object p1

    iput-object p1, p0, Ll/᩶᩻ܺ;->ܽ:[B

    return-void

    .line 136
    :cond_6
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "too many catch handlers"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ᩳᩴܺ;)V
    .locals 10

    .line 89
    iget-object v0, p0, Ll/᩶᩻ܺ;->ܿ:Ll/۠ܿܺ;

    iget-object v1, p0, Ll/᩶᩻ܺ;->֫:Ll/᩶ܿܺ;

    if-nez v0, :cond_0

    .line 90
    invoke-virtual {v1}, Ll/᩶ܿܺ;->ۧ()Ll/۠ܿܺ;

    move-result-object v0

    iput-object v0, p0, Ll/᩶᩻ܺ;->ܿ:Ll/۠ܿܺ;

    .line 198
    :cond_0
    invoke-virtual {p1}, Ll/ᩳᩴܺ;->֫()Z

    move-result v0

    const-string v2, ".."

    const/4 v3, 0x0

    if-eqz v0, :cond_7

    .line 89
    iget-object v0, p0, Ll/᩶᩻ܺ;->ܿ:Ll/۠ܿܺ;

    if-nez v0, :cond_1

    .line 90
    invoke-virtual {v1}, Ll/᩶ܿܺ;->ۧ()Ll/۠ܿܺ;

    move-result-object v0

    iput-object v0, p0, Ll/᩶᩻ܺ;->ܿ:Ll/۠ܿܺ;

    .line 239
    :cond_1
    iget-object v0, p0, Ll/᩶᩻ܺ;->ܿ:Ll/۠ܿܺ;

    invoke-virtual {v0}, Ll/ܿᩴܺ;->size()I

    move-result v0

    const-string v1, "  tries:"

    .line 243
    invoke-virtual {p1, v3, v1}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    const/4 v1, 0x0

    :goto_0
    const-string v4, "    "

    if-ge v1, v0, :cond_4

    .line 249
    iget-object v5, p0, Ll/᩶᩻ܺ;->ܿ:Ll/۠ܿܺ;

    invoke-virtual {v5, v1}, Ll/ܿᩴܺ;->get(I)Ll/֨ܿܺ;

    move-result-object v5

    .line 250
    invoke-virtual {v5}, Ll/֨ܿܺ;->ۧ()Ll/ۚܿܺ;

    move-result-object v6

    .line 251
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "    try "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ll/֨ܿܺ;->ܿ()I

    move-result v8

    int-to-char v9, v8

    if-ne v8, v9, :cond_2

    .line 104
    invoke-static {v8}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_1

    .line 106
    :cond_2
    invoke-static {v8}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v8

    .line 251
    :goto_1
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    invoke-virtual {v5}, Ll/֨ܿܺ;->֫()I

    move-result v5

    int-to-char v8, v5

    if-ne v5, v8, :cond_3

    .line 104
    invoke-static {v5}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    .line 106
    :cond_3
    invoke-static {v5}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v5

    .line 252
    :goto_2
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v7, ""

    .line 253
    invoke-virtual {v6, v4, v7}, Ll/ۚܿܺ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x6

    .line 256
    invoke-virtual {p1, v6, v5}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    const/4 v5, 0x2

    .line 257
    invoke-virtual {p1, v5, v4}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    const-string v0, "  handlers:"

    .line 269
    invoke-virtual {p1, v3, v0}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 270
    iget v0, p0, Ll/᩶᩻ܺ;->ۧ:I

    iget-object v1, p0, Ll/᩶᩻ܺ;->ᩳ:Ljava/util/TreeMap;

    .line 271
    invoke-virtual {v1}, Ljava/util/TreeMap;->size()I

    move-result v1

    invoke-static {v1}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v1

    const-string v5, "    size: "

    invoke-virtual {v5, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 270
    invoke-virtual {p1, v0, v1}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 277
    iget-object v0, p0, Ll/᩶᩻ܺ;->ᩳ:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v5, 0x0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const-string v7, ": "

    if-eqz v6, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 278
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۚܿܺ;

    .line 279
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-eqz v1, :cond_5

    sub-int v9, v6, v5

    .line 309
    invoke-static {v5}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Ll/ۚܿܺ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 315
    invoke-virtual {p1, v9, v1}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    :cond_5
    move v5, v6

    move-object v1, v8

    goto :goto_3

    .line 290
    :cond_6
    iget-object v0, p0, Ll/᩶᩻ܺ;->ܽ:[B

    array-length v0, v0

    sub-int/2addr v0, v5

    .line 309
    invoke-static {v5}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Ll/ۚܿܺ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 315
    invoke-virtual {p1, v0, v1}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 202
    :cond_7
    iget-object v0, p0, Ll/᩶᩻ܺ;->ܿ:Ll/۠ܿܺ;

    invoke-virtual {v0}, Ll/ܿᩴܺ;->size()I

    move-result v0

    :goto_4
    if-ge v3, v0, :cond_9

    .line 204
    iget-object v1, p0, Ll/᩶᩻ܺ;->ܿ:Ll/۠ܿܺ;

    invoke-virtual {v1, v3}, Ll/ܿᩴܺ;->get(I)Ll/֨ܿܺ;

    move-result-object v1

    .line 205
    invoke-virtual {v1}, Ll/֨ܿܺ;->ܿ()I

    move-result v4

    .line 206
    invoke-virtual {v1}, Ll/֨ܿܺ;->֫()I

    move-result v5

    sub-int v6, v5, v4

    const/high16 v7, 0x10000

    if-ge v6, v7, :cond_8

    .line 215
    invoke-virtual {p1, v4}, Ll/ᩳᩴܺ;->ܿ(I)V

    .line 216
    invoke-virtual {p1, v6}, Ll/ᩳᩴܺ;->ܳ(I)V

    .line 217
    iget-object v4, p0, Ll/᩶᩻ܺ;->ᩳ:Ljava/util/TreeMap;

    invoke-virtual {v1}, Ll/֨ܿܺ;->ۧ()Ll/ۚܿܺ;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ᩳᩴܺ;->ܳ(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 210
    :cond_8
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "bogus exception range: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 211
    invoke-static {v4}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    invoke-static {v5}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 220
    :cond_9
    iget-object v0, p0, Ll/᩶᩻ܺ;->ܽ:[B

    invoke-virtual {p1, v0}, Ll/ᩳᩴܺ;->֫([B)V

    return-void
.end method

.method public final ۧ()I
    .locals 2

    .line 185
    invoke-virtual {p0}, Ll/᩶᩻ܺ;->֫()I

    move-result v0

    mul-int/lit8 v0, v0, 0x8

    iget-object v1, p0, Ll/᩶᩻ܺ;->ܽ:[B

    array-length v1, v1

    add-int/2addr v0, v1

    return v0
.end method
