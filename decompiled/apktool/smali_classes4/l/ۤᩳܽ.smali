.class public abstract Ll/ۤᩳܽ;
.super Ljava/lang/Object;
.source "261X"

# interfaces
.implements Ll/֡᩻ܽ;


# instance fields
.field public ۙ:I

.field public ᩶:Ljava/util/BitSet;

.field public final ᩸:Ll/۠ᩳܽ;

.field public ᩹:Ll/ۤ᩻ᩴ;


# direct methods
.method public constructor <init>(Ll/۠ᩳܽ;I)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Ll/ۤᩳܽ;->᩸:Ll/۠ᩳܽ;

    .line 38
    iput p2, p0, Ll/ۤᩳܽ;->ۙ:I

    return-void
.end method


# virtual methods
.method public final getPath()Ljava/lang/String;
    .locals 2

    .line 176
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ۤᩳܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v1

    invoke-interface {v1}, Ll/ۘ᩻ܽ;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۤᩳܽ;->getTypeName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getTypeName()Ljava/lang/String;
    .locals 2

    .line 115
    :try_start_0
    invoke-virtual {p0}, Ll/ۤᩳܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۘ᩻ܽ;->ۜۧ()Ljava/util/List;

    move-result-object v0

    .line 109
    iget v1, p0, Ll/ۤᩳܽ;->ۙ:I

    add-int/lit8 v1, v1, -0x1

    .line 115
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 118
    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ERROR-ID"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 109
    iget v1, p0, Ll/ۤᩳܽ;->ۙ:I

    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 189
    invoke-virtual {p0}, Ll/ۤᩳܽ;->getPath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۛۜܽ;Ll/֫ᩳܽ;)I
    .locals 10

    .line 74
    iget v0, p2, Ll/֫ᩳܽ;->ܽ:I

    int-to-long v1, v0

    iget v3, p2, Ll/֫ᩳܽ;->֫:I

    int-to-long v4, v3

    add-long/2addr v1, v4

    .line 75
    invoke-virtual {p1}, Ll/ۛۜܽ;->ۧ()I

    move-result v4

    int-to-long v4, v4

    invoke-virtual {p1}, Ll/ۛۜܽ;->֫()I

    move-result v6

    int-to-long v6, v6

    add-long/2addr v4, v6

    .line 76
    iget p2, p2, Ll/֫ᩳܽ;->ۧ:I

    const/16 v6, 0x10

    if-lt p2, v6, :cond_3

    if-lt v3, p2, :cond_3

    cmp-long v3, v1, v4

    if-gtz v3, :cond_3

    add-int/lit8 v3, v0, 0x8

    .line 80
    invoke-virtual {p1, v3}, Ll/ۛۜܽ;->ܽ(I)V

    .line 81
    invoke-virtual {p1}, Ll/ۛۜܽ;->ܳ()I

    move-result v3

    iput v3, p0, Ll/ۤᩳܽ;->ۙ:I

    const/4 v3, 0x3

    .line 82
    invoke-virtual {p1, v3}, Ll/ۛۜܽ;->ᩳ(I)V

    .line 83
    invoke-virtual {p1}, Ll/ۛۜܽ;->ᩳ()I

    move-result v3

    int-to-long v4, v0

    int-to-long v6, p2

    add-long/2addr v4, v6

    const-wide/16 v6, 0x4

    int-to-long v8, v3

    mul-long v8, v8, v6

    add-long/2addr v8, v4

    if-ltz v3, :cond_2

    const/high16 v4, 0x10000

    if-gt v3, v4, :cond_2

    cmp-long v4, v8, v1

    if-gtz v4, :cond_2

    add-int/2addr v0, p2

    .line 80
    invoke-virtual {p1, v0}, Ll/ۛۜܽ;->ܽ(I)V

    const/4 p2, 0x0

    :goto_0
    if-ge p2, v3, :cond_1

    .line 90
    invoke-virtual {p1}, Ll/ۛۜܽ;->ᩳ()I

    move-result v0

    const/high16 v1, 0x20000000

    and-int/2addr v1, v0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 91
    :goto_1
    invoke-virtual {p0, p2, v1}, Ll/ۤᩳܽ;->֫(IZ)V

    .line 92
    invoke-virtual {p0}, Ll/ۤᩳܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v1

    invoke-interface {v1}, Ll/ۘ᩻ܽ;->֫ۧ()Ll/ۤܽܽ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۤܽܽ;->֫()I

    move-result v1

    const v2, 0x6003ffff

    or-int/2addr v1, v2

    not-int v1, v1

    and-int/2addr v0, v1

    invoke-virtual {p0, p2, v0}, Ll/ۤᩳܽ;->֫(II)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    return v3

    .line 86
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid typeSpec entry count"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 78
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid typeSpec header"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ֫(Ll/ܶ᩻ܽ;)I
    .locals 7

    .line 157
    invoke-interface {p0}, Ll/֡᩻ܽ;->᩷()I

    move-result v0

    .line 158
    invoke-interface {p0}, Ll/֡᩻ܽ;->ۜ֫()I

    move-result v1

    new-array v2, v1, [Ll/ۜ᩻ܽ;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    .line 160
    invoke-interface {p0, v3}, Ll/֡᩻ܽ;->ܿ(I)Ll/ۜ᩻ܽ;

    move-result-object v4

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_1
    if-ge v3, v0, :cond_3

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v1, :cond_2

    .line 162
    aget-object v5, v2, v4

    .line 163
    invoke-interface {v5, v3}, Ll/ۜ᩻ܽ;->ܺ(I)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 164
    invoke-interface {v5, v3}, Ll/ۜ᩻ܽ;->ܽ(I)Ljava/lang/String;

    move-result-object v4

    .line 165
    invoke-interface {p1, v4}, Ll/ܶ᩻ܽ;->֫(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    return v3

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, -0x1

    return p1
.end method

.method public final ֫(Ll/᩶ܽܽ;)Ljava/lang/String;
    .locals 7

    .line 138
    invoke-interface {p0}, Ll/֡᩻ܽ;->᩷()I

    move-result v0

    .line 139
    invoke-interface {p0}, Ll/֡᩻ܽ;->ۜ֫()I

    move-result v1

    new-array v2, v1, [Ll/ۜ᩻ܽ;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    .line 141
    invoke-interface {p0, v3}, Ll/֡᩻ܽ;->ܿ(I)Ll/ۜ᩻ܽ;

    move-result-object v4

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_1
    if-ge v3, v0, :cond_3

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v1, :cond_2

    .line 143
    aget-object v5, v2, v4

    .line 144
    invoke-interface {v5, v3}, Ll/ۜ᩻ܽ;->ܺ(I)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 145
    invoke-interface {v5, v3}, Ll/ۜ᩻ܽ;->ܽ(I)Ljava/lang/String;

    move-result-object v4

    .line 146
    invoke-virtual {p1, v4}, Ll/᩶ܽܽ;->֫(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    return-object v4

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public ֫()Ll/ۢ᩻ܽ;
    .locals 1

    .line 99
    iget-object v0, p0, Ll/ۤᩳܽ;->᩸:Ll/۠ᩳܽ;

    invoke-interface {v0}, Ll/ۘ᩻ܽ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(II)V
    .locals 2

    .line 61
    invoke-virtual {p0}, Ll/ۤᩳܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۘ᩻ܽ;->֫ۧ()Ll/ۤܽܽ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۤܽܽ;->֫()I

    move-result v0

    const v1, 0x6003ffff

    or-int/2addr v0, v1

    and-int/2addr v0, p2

    if-nez v0, :cond_3

    if-eqz p2, :cond_1

    .line 65
    iget-object v0, p0, Ll/ۤᩳܽ;->᩹:Ll/ۤ᩻ᩴ;

    if-nez v0, :cond_0

    new-instance v0, Ll/ۤ᩻ᩴ;

    invoke-direct {v0}, Ll/ۤ᩻ᩴ;-><init>()V

    iput-object v0, p0, Ll/ۤᩳܽ;->᩹:Ll/ۤ᩻ᩴ;

    .line 66
    :cond_0
    iget-object v0, p0, Ll/ۤᩳܽ;->᩹:Ll/ۤ᩻ᩴ;

    invoke-virtual {v0, p1, p2}, Ll/ۤ᩻ᩴ;->֫(II)I

    return-void

    .line 67
    :cond_1
    iget-object p2, p0, Ll/ۤᩳܽ;->᩹:Ll/ۤ᩻ᩴ;

    if-eqz p2, :cond_2

    .line 68
    invoke-virtual {p2, p1}, Ll/ۤ᩻ᩴ;->remove(I)I

    :cond_2
    return-void

    .line 62
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Extra typeSpec flags contain supported bits"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(IZ)V
    .locals 0

    if-eqz p2, :cond_1

    .line 53
    iget-object p2, p0, Ll/ۤᩳܽ;->᩶:Ljava/util/BitSet;

    if-nez p2, :cond_0

    new-instance p2, Ljava/util/BitSet;

    invoke-direct {p2}, Ljava/util/BitSet;-><init>()V

    iput-object p2, p0, Ll/ۤᩳܽ;->᩶:Ljava/util/BitSet;

    .line 54
    :cond_0
    iget-object p2, p0, Ll/ۤᩳܽ;->᩶:Ljava/util/BitSet;

    invoke-virtual {p2, p1}, Ljava/util/BitSet;->set(I)V

    return-void

    .line 55
    :cond_1
    iget-object p2, p0, Ll/ۤᩳܽ;->᩶:Ljava/util/BitSet;

    if-eqz p2, :cond_2

    .line 56
    invoke-virtual {p2, p1}, Ljava/util/BitSet;->clear(I)V

    :cond_2
    return-void
.end method

.method public final ֫(Ll/۠᩻ܽ;)V
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    .line 195
    check-cast p1, Ll/֡᩻ܽ;

    .line 109
    iget v0, p0, Ll/ۤᩳܽ;->ۙ:I

    .line 196
    invoke-interface {p1}, Ll/֡᩻ܽ;->ۘ֫()I

    move-result v1

    if-ne v0, v1, :cond_3

    .line 201
    invoke-interface {p0}, Ll/֡᩻ܽ;->ۜ֫()I

    move-result v0

    invoke-interface {p1}, Ll/֡᩻ܽ;->ۜ֫()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 203
    invoke-virtual {p0}, Ll/ۤᩳܽ;->getTypeName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 207
    invoke-interface {p0}, Ll/֡᩻ܽ;->ۢ()Ljava/lang/Iterable;

    move-result-object v0

    invoke-static {v0}, Ll/᩶֨ᩴ;->spliterator(Ljava/lang/Iterable;)Ll/ܶ۫ᩴ;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ll/ܳ᩺ᩴ;->stream(Ll/ܶ۫ᩴ;Z)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v2, Ll/ۗᩳܽ;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ll/ۗᩳܽ;-><init>(I)V

    .line 208
    invoke-interface {v0, v2}, Ll/ܿ᩺ᩴ;->sorted(Ljava/util/Comparator;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 209
    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v2

    invoke-interface {v0, v2}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 210
    invoke-interface {p1}, Ll/֡᩻ܽ;->ۢ()Ljava/lang/Iterable;

    move-result-object p1

    invoke-static {p1}, Ll/᩶֨ᩴ;->spliterator(Ljava/lang/Iterable;)Ll/ܶ۫ᩴ;

    move-result-object p1

    invoke-static {p1, v1}, Ll/ܳ᩺ᩴ;->stream(Ll/ܶ۫ᩴ;Z)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v2, Ll/۬ᩳܽ;

    invoke-direct {v2, v3}, Ll/۬ᩳܽ;-><init>(I)V

    .line 211
    invoke-interface {p1, v2}, Ll/ܿ᩺ᩴ;->sorted(Ljava/util/Comparator;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    .line 212
    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v2

    invoke-interface {p1, v2}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 213
    :goto_0
    invoke-interface {p0}, Ll/֡᩻ܽ;->ۜ֫()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 214
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۜ᩻ܽ;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۠᩻ܽ;

    invoke-interface {v2, v3}, Ll/۠᩻ܽ;->֫(Ll/۠᩻ܽ;)V

    .line 215
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "check ok "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۜ᩻ܽ;

    invoke-interface {v4}, Ll/ۜ᩻ܽ;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void

    .line 204
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Ll/ۤᩳܽ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 202
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Ll/ۤᩳܽ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 197
    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Ll/ۤᩳܽ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۘ֫()I
    .locals 1

    .line 109
    iget v0, p0, Ll/ۤᩳܽ;->ۙ:I

    return v0
.end method

.method public ۢ()Ljava/lang/Iterable;
    .locals 1

    .line 286
    invoke-virtual {p0}, Ll/ۤᩳܽ;->ܽ()Ljava/lang/Iterable;

    move-result-object v0

    return-object v0
.end method

.method public ۧ()Ll/ۘ᩻ܽ;
    .locals 1

    .line 104
    iget-object v0, p0, Ll/ۤᩳܽ;->᩸:Ll/۠ᩳܽ;

    return-object v0
.end method

.method public ܳ(I)Z
    .locals 1

    .line 43
    iget-object v0, p0, Ll/ۤᩳܽ;->᩶:Ljava/util/BitSet;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->get(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ()Ljava/lang/Iterable;
    .locals 3

    .line 123
    new-instance v0, Ll/ۨᩳܽ;

    invoke-interface {p0}, Ll/֡᩻ܽ;->ۜ֫()I

    move-result v1

    new-instance v2, Ll/ۙᩳܽ;

    invoke-direct {v2, p0}, Ll/ۙᩳܽ;-><init>(Ll/ۤᩳܽ;)V

    invoke-direct {v0, v1, v2}, Ll/ۨᩳܽ;-><init>(ILl/۬ۜᩴ;)V

    return-object v0
.end method

.method public ܽۧ()Ljava/util/ArrayList;
    .locals 3

    .line 127
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ll/֡᩻ܽ;->ۜ֫()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 128
    invoke-virtual {p0}, Ll/ۤᩳܽ;->ܽ()Ljava/lang/Iterable;

    move-result-object v1

    .line 129
    check-cast v1, Ll/ۨᩳܽ;

    invoke-virtual {v1}, Ll/ۨᩳܽ;->iterator()Ljava/util/Iterator;

    :goto_0
    invoke-virtual {v1}, Ll/ۨᩳܽ;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ll/ۨᩳܽ;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۜ᩻ܽ;

    .line 130
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 132
    :cond_0
    new-instance v1, Ll/᩶ᩳܽ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public ᩷(I)I
    .locals 1

    .line 48
    iget-object v0, p0, Ll/ۤᩳܽ;->᩹:Ll/ۤ᩻ᩴ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {v0, p1}, Ll/ۤ᩻ᩴ;->get(I)I

    move-result p1

    return p1
.end method
