.class public final Ll/ۖ᩵ۖ;
.super Ll/᩵ۜۖ;
.source "T9OP"

# interfaces
.implements Ll/ۘ᩵ۖ;
.implements Ljava/util/RandomAccess;


# static fields
.field public static final ᩶:Ll/ۖ᩵ۖ;


# instance fields
.field public final ᩹:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 41
    new-instance v0, Ll/ۖ᩵ۖ;

    invoke-direct {v0}, Ll/ۖ᩵ۖ;-><init>()V

    sput-object v0, Ll/ۖ᩵ۖ;->᩶:Ll/ۖ᩵ۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 64
    invoke-direct {p0, v0}, Ll/᩵ۜۖ;-><init>(Z)V

    .line 65
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ۖ᩵ۖ;->᩹:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-direct {p0, v0}, Ll/ۖ᩵ۖ;-><init>(Ljava/util/ArrayList;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 1

    const/4 v0, 0x1

    .line 32
    invoke-direct {p0, v0}, Ll/᩵ۜۖ;-><init>(Z)V

    .line 82
    iput-object p1, p0, Ll/ۖ᩵ۖ;->᩹:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ll/ۘ᩵ۖ;)V
    .locals 2

    const/4 v0, 0x1

    .line 32
    invoke-direct {p0, v0}, Ll/᩵ۜۖ;-><init>(Z)V

    .line 73
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/ۖ᩵ۖ;->᩹:Ljava/util/List;

    .line 74
    invoke-virtual {p0, p1}, Ll/ۖ᩵ۖ;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public static ܽ()Ll/ۖ᩵ۖ;
    .locals 1

    .line 45
    sget-object v0, Ll/ۖ᩵ۖ;->᩶:Ll/ۖ᩵ۖ;

    return-object v0
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 1

    .line 38
    check-cast p2, Ljava/lang/String;

    .line 131
    invoke-virtual {p0}, Ll/᩵ۜۖ;->ۧ()V

    .line 132
    iget-object v0, p0, Ll/ۖ᩵ۖ;->᩹:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 133
    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 1

    .line 159
    invoke-virtual {p0}, Ll/᩵ۜۖ;->ۧ()V

    .line 163
    instance-of v0, p2, Ll/ۘ᩵ۖ;

    if-eqz v0, :cond_0

    check-cast p2, Ll/ۘ᩵ۖ;

    invoke-interface {p2}, Ll/ۘ᩵ۖ;->ܰ()Ljava/util/List;

    move-result-object p2

    .line 164
    :cond_0
    iget-object v0, p0, Ll/ۖ᩵ۖ;->᩹:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    move-result p1

    .line 165
    iget p2, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Ljava/util/AbstractList;->modCount:I

    return p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    .line 119
    iget-object v0, p0, Ll/ۖ᩵ۖ;->᩹:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 154
    invoke-virtual {p0, v0, p1}, Ll/ۖ᩵ۖ;->addAll(ILjava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final clear()V
    .locals 1

    .line 195
    invoke-virtual {p0}, Ll/᩵ۜۖ;->ۧ()V

    .line 196
    iget-object v0, p0, Ll/ۖ᩵ۖ;->᩹:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 197
    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method

.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 38
    invoke-virtual {p0, p1}, Ll/ۖ᩵ۖ;->get(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final get(I)Ljava/lang/String;
    .locals 4

    .line 97
    iget-object v0, p0, Ll/ۖ᩵ۖ;->᩹:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    .line 98
    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 99
    check-cast v1, Ljava/lang/String;

    return-object v1

    .line 100
    :cond_0
    instance-of v2, v1, Ll/ۛۜۖ;

    if-eqz v2, :cond_2

    .line 101
    check-cast v1, Ll/ۛۜۖ;

    .line 102
    invoke-virtual {v1}, Ll/ۛۜۖ;->ܳ()Ljava/lang/String;

    move-result-object v2

    .line 103
    invoke-virtual {v1}, Ll/ۛۜۖ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 104
    invoke-interface {v0, p1, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v2

    .line 108
    :cond_2
    check-cast v1, [B

    .line 171
    new-instance v2, Ljava/lang/String;

    sget-object v3, Ll/ܰᩴۖ;->ܽ:Ljava/nio/charset/Charset;

    invoke-direct {v2, v1, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 161
    invoke-static {v1}, Ll/۫֨ۖ;->֫([B)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 111
    invoke-interface {v0, p1, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-object v2
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 2

    .line 187
    invoke-virtual {p0}, Ll/᩵ۜۖ;->ۧ()V

    .line 188
    iget-object v0, p0, Ll/ۖ᩵ۖ;->᩹:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    .line 189
    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 260
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 261
    check-cast p1, Ljava/lang/String;

    return-object p1

    .line 262
    :cond_0
    instance-of v0, p1, Ll/ۛۜۖ;

    if-eqz v0, :cond_1

    .line 263
    check-cast p1, Ll/ۛۜۖ;

    invoke-virtual {p1}, Ll/ۛۜۖ;->ܳ()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 265
    :cond_1
    check-cast p1, [B

    .line 171
    new-instance v0, Ljava/lang/String;

    sget-object v1, Ll/ܰᩴۖ;->ܽ:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0
.end method

.method public final bridge synthetic set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 38
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Ll/ۖ᩵ۖ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 119
    iget-object v0, p0, Ll/ۖ᩵ۖ;->᩹:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final ֫(ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 124
    invoke-virtual {p0}, Ll/᩵ۜۖ;->ۧ()V

    .line 125
    iget-object v0, p0, Ll/ۖ᩵ۖ;->᩹:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 260
    instance-of p2, p1, Ljava/lang/String;

    if-eqz p2, :cond_0

    .line 261
    check-cast p1, Ljava/lang/String;

    return-object p1

    .line 262
    :cond_0
    instance-of p2, p1, Ll/ۛۜۖ;

    if-eqz p2, :cond_1

    .line 263
    check-cast p1, Ll/ۛۜۖ;

    invoke-virtual {p1}, Ll/ۛۜۖ;->ܳ()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 265
    :cond_1
    check-cast p1, [B

    .line 171
    new-instance p2, Ljava/lang/String;

    sget-object v0, Ll/ܰᩴۖ;->ܽ:Ljava/nio/charset/Charset;

    invoke-direct {p2, p1, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object p2
.end method

.method public final ֫(I)Ll/ۛۜۖ;
    .locals 5

    .line 221
    iget-object v0, p0, Ll/ۖ᩵ۖ;->᩹:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    .line 270
    instance-of v2, v1, Ll/ۛۜۖ;

    if-eqz v2, :cond_0

    .line 271
    move-object v2, v1

    check-cast v2, Ll/ۛۜۖ;

    goto :goto_0

    .line 272
    :cond_0
    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_1

    .line 273
    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ll/ۛۜۖ;->֫(Ljava/lang/String;)Ll/ۛۜۖ;

    move-result-object v2

    goto :goto_0

    .line 275
    :cond_1
    move-object v2, v1

    check-cast v2, [B

    sget-object v3, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    const/4 v3, 0x0

    .line 412
    array-length v4, v2

    invoke-static {v3, v4, v2}, Ll/ۛۜۖ;->֫(II[B)Ll/ۛۜۖ;

    move-result-object v2

    :goto_0
    if-eq v2, v1, :cond_2

    .line 224
    invoke-interface {v0, p1, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-object v2
.end method

.method public final ֫(Ll/ۛۜۖ;)V
    .locals 1

    .line 202
    invoke-virtual {p0}, Ll/᩵ۜۖ;->ۧ()V

    .line 203
    iget-object v0, p0, Ll/ۖ᩵ۖ;->᩹:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 204
    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method

.method public final ۟ۧ()Ll/ۘ᩵ۖ;
    .locals 1

    .line 38
    invoke-super {p0}, Ll/᩵ۜۖ;->ۤ֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 398
    new-instance v0, Ll/᩵֨ۖ;

    invoke-direct {v0, p0}, Ll/᩵֨ۖ;-><init>(Ll/ۖ᩵ۖ;)V

    return-object v0

    :cond_0
    return-object p0
.end method

.method public final ܰ()Ljava/util/List;
    .locals 1

    .line 291
    iget-object v0, p0, Ll/ۖ᩵ۖ;->᩹:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ᩵(I)Ljava/lang/Object;
    .locals 1

    .line 216
    iget-object v0, p0, Ll/ۖ᩵ۖ;->᩹:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ᩷(I)Ll/᩺ᩴۖ;
    .locals 2

    .line 119
    iget-object v0, p0, Ll/ۖ᩵ۖ;->᩹:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lt p1, v1, :cond_0

    .line 90
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 91
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 92
    new-instance p1, Ll/ۖ᩵ۖ;

    invoke-direct {p1, v1}, Ll/ۖ᩵ۖ;-><init>(Ljava/util/ArrayList;)V

    return-object p1

    .line 88
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method
