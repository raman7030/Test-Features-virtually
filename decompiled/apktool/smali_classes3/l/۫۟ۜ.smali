.class public final Ll/۫۟ۜ;
.super Ljava/lang/Object;
.source "C9LQ"


# instance fields
.field public ֫:[I

.field public ۧ:Landroid/graphics/Rect;

.field public ܽ:Ljava/util/ArrayList;

.field public ᩳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۫۟ۜ;->ܽ:Ljava/util/ArrayList;

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۫۟ۜ;->ᩳ:Ljava/util/ArrayList;

    .line 33
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/۫۟ۜ;->ۧ:Landroid/graphics/Rect;

    return-void
.end method

.method public static ֫(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Landroid/graphics/Rect;
    .locals 4

    .line 196
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 197
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    .line 198
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ۟ۜ;

    iget v1, v1, Ll/ۙ۟ۜ;->᩹:I

    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 0
    invoke-static {p0, v2}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object p0

    .line 199
    check-cast p0, Ll/ۙ۟ۜ;

    iget p0, p0, Ll/ۙ۟ۜ;->᩸:I

    sub-int/2addr p2, p0

    iput p2, v0, Landroid/graphics/Rect;->right:I

    .line 201
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_1

    .line 202
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۙ۟ۜ;

    iget p0, p0, Ll/ۙ۟ۜ;->᩹:I

    iput p0, v0, Landroid/graphics/Rect;->top:I

    .line 0
    invoke-static {p1, v2}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object p0

    .line 203
    check-cast p0, Ll/ۙ۟ۜ;

    iget p0, p0, Ll/ۙ۟ۜ;->᩸:I

    sub-int/2addr p3, p0

    iput p3, v0, Landroid/graphics/Rect;->bottom:I

    :cond_1
    return-object v0
.end method

.method public static ֫(Ljava/util/ArrayList;I)Ljava/util/ArrayList;
    .locals 7

    .line 157
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p0, :cond_4

    .line 158
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 161
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_4

    .line 162
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۙ۟ۜ;

    if-nez v2, :cond_1

    .line 163
    iget v4, v3, Ll/ۙ۟ۜ;->᩹:I

    if-eqz v4, :cond_1

    .line 164
    new-instance v5, Ll/ۙ۟ۜ;

    invoke-direct {v5, v1, v4}, Ll/ۙ۟ۜ;-><init>(II)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    if-lez v2, :cond_2

    .line 166
    new-instance v4, Ll/ۙ۟ۜ;

    add-int/lit8 v5, v2, -0x1

    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۙ۟ۜ;

    iget v5, v5, Ll/ۙ۟ۜ;->᩸:I

    iget v6, v3, Ll/ۙ۟ۜ;->᩹:I

    invoke-direct {v4, v5, v6}, Ll/ۙ۟ۜ;-><init>(II)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    :cond_2
    :goto_1
    new-instance v4, Ll/ۙ۟ۜ;

    iget v5, v3, Ll/ۙ۟ۜ;->᩹:I

    iget v6, v3, Ll/ۙ۟ۜ;->᩸:I

    invoke-direct {v4, v5, v6}, Ll/ۙ۟ۜ;-><init>(II)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 169
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-ne v2, v4, :cond_3

    iget v3, v3, Ll/ۙ۟ۜ;->᩸:I

    if-ge v3, p1, :cond_3

    .line 170
    new-instance v4, Ll/ۙ۟ۜ;

    invoke-direct {v4, v3, p1}, Ll/ۙ۟ۜ;-><init>(II)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    return-object v0
.end method

.method public static ۧ(Ljava/util/ArrayList;I)V
    .locals 5

    .line 103
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :cond_0
    :goto_0
    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    if-ltz v0, :cond_3

    .line 104
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙ۟ۜ;

    .line 105
    iget v3, v2, Ll/ۙ۟ۜ;->᩹:I

    iget v4, v2, Ll/ۙ۟ۜ;->᩸:I

    if-lt v3, v4, :cond_1

    .line 106
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    if-gez v3, :cond_2

    .line 110
    iput v1, v2, Ll/ۙ۟ۜ;->᩹:I

    :cond_2
    if-le v4, p1, :cond_0

    .line 113
    iput p1, v2, Ll/ۙ۟ۜ;->᩸:I

    goto :goto_0

    .line 116
    :cond_3
    invoke-static {p0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 118
    :goto_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    if-ge v1, p1, :cond_5

    .line 119
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۙ۟ۜ;

    add-int/lit8 v0, v1, 0x1

    .line 120
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙ۟ۜ;

    .line 121
    iget v3, v2, Ll/ۙ۟ۜ;->᩹:I

    iget v4, p1, Ll/ۙ۟ۜ;->᩸:I

    if-gt v3, v4, :cond_4

    .line 122
    iget v2, v2, Ll/ۙ۟ۜ;->᩸:I

    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    iput v2, p1, Ll/ۙ۟ۜ;->᩸:I

    .line 123
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    move v1, v0

    goto :goto_1

    :cond_5
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 211
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "NinePatchChunk{xDivs="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/۫۟ۜ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", yDivs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۫۟ۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", padding="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۫۟ۜ;->ۧ:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", colors="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۫۟ۜ;->֫:[I

    .line 215
    invoke-static {v1}, Ll/᩹۬ᩴ;->stream([I)Ll/ۧ᩺ᩴ;

    move-result-object v1

    new-instance v2, Ll/ܰᩳܽ;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Ll/ܰᩳܽ;-><init>(I)V

    invoke-interface {v1, v2}, Ll/ۧ᩺ᩴ;->mapToObj(Ljava/util/function/IntFunction;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Landroid/graphics/Bitmap;)V
    .locals 2

    .line 98
    iget-object v0, p0, Ll/۫۟ۜ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-static {v0, v1}, Ll/۫۟ۜ;->ۧ(Ljava/util/ArrayList;I)V

    .line 99
    iget-object v0, p0, Ll/۫۟ۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    invoke-static {v0, p1}, Ll/۫۟ۜ;->ۧ(Ljava/util/ArrayList;I)V

    return-void
.end method

.method public final ֫()[B
    .locals 7

    .line 66
    iget-object v0, p0, Ll/۫۟ۜ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x8

    const/16 v2, 0x20

    add-int/2addr v1, v2

    iget-object v3, p0, Ll/۫۟ۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    mul-int/lit8 v4, v4, 0x8

    add-int/2addr v4, v1

    iget-object v1, p0, Ll/۫۟ۜ;->֫:[I

    array-length v1, v1

    mul-int/lit8 v1, v1, 0x4

    add-int/2addr v1, v4

    .line 67
    new-instance v4, Ll/ۤۜܽ;

    invoke-direct {v4, v1}, Ll/ۤۜܽ;-><init>(I)V

    const/4 v1, 0x0

    .line 68
    invoke-virtual {v4, v1}, Ll/ۤۜܽ;->writeByte(I)V

    .line 69
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    mul-int/lit8 v5, v5, 0x2

    invoke-virtual {v4, v5}, Ll/ۤۜܽ;->writeByte(I)V

    .line 70
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v5

    mul-int/lit8 v5, v5, 0x2

    invoke-virtual {v4, v5}, Ll/ۤۜܽ;->writeByte(I)V

    .line 71
    iget-object v5, p0, Ll/۫۟ۜ;->֫:[I

    array-length v5, v5

    invoke-virtual {v4, v5}, Ll/ۤۜܽ;->writeByte(I)V

    .line 73
    invoke-virtual {v4, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 74
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    mul-int/lit8 v5, v5, 0x8

    add-int/2addr v5, v2

    invoke-virtual {v4, v5}, Ll/ۤۜܽ;->writeInt(I)V

    .line 75
    iget-object v5, p0, Ll/۫۟ۜ;->ۧ:Landroid/graphics/Rect;

    iget v6, v5, Landroid/graphics/Rect;->left:I

    invoke-virtual {v4, v6}, Ll/ۤۜܽ;->ۧ(I)V

    .line 76
    iget v6, v5, Landroid/graphics/Rect;->right:I

    invoke-virtual {v4, v6}, Ll/ۤۜܽ;->ۧ(I)V

    .line 77
    iget v6, v5, Landroid/graphics/Rect;->top:I

    invoke-virtual {v4, v6}, Ll/ۤۜܽ;->ۧ(I)V

    .line 78
    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v4, v5}, Ll/ۤۜܽ;->ۧ(I)V

    .line 79
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    mul-int/lit8 v5, v5, 0x8

    add-int/2addr v5, v2

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    mul-int/lit8 v2, v2, 0x8

    add-int/2addr v2, v5

    invoke-virtual {v4, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 81
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙ۟ۜ;

    .line 82
    iget v5, v2, Ll/ۙ۟ۜ;->᩹:I

    invoke-virtual {v4, v5}, Ll/ۤۜܽ;->ۧ(I)V

    .line 83
    iget v2, v2, Ll/ۙ۟ۜ;->᩸:I

    invoke-virtual {v4, v2}, Ll/ۤۜܽ;->ۧ(I)V

    goto :goto_0

    .line 85
    :cond_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙ۟ۜ;

    .line 86
    iget v3, v2, Ll/ۙ۟ۜ;->᩹:I

    invoke-virtual {v4, v3}, Ll/ۤۜܽ;->ۧ(I)V

    .line 87
    iget v2, v2, Ll/ۙ۟ۜ;->᩸:I

    invoke-virtual {v4, v2}, Ll/ۤۜܽ;->ۧ(I)V

    goto :goto_1

    .line 89
    :cond_1
    iget-object v0, p0, Ll/۫۟ۜ;->֫:[I

    array-length v2, v0

    :goto_2
    if-ge v1, v2, :cond_2

    aget v3, v0, v1

    .line 90
    invoke-virtual {v4, v3}, Ll/ۤۜܽ;->ۧ(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 94
    :cond_2
    invoke-virtual {v4}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Landroid/graphics/Bitmap;)V
    .locals 14

    .line 135
    iget-object v0, p0, Ll/۫۟ۜ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-static {v0, v1}, Ll/۫۟ۜ;->֫(Ljava/util/ArrayList;I)Ljava/util/ArrayList;

    move-result-object v0

    .line 136
    iget-object v1, p0, Ll/۫۟ۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    invoke-static {v1, v2}, Ll/۫۟ۜ;->֫(Ljava/util/ArrayList;I)Ljava/util/ArrayList;

    move-result-object v1

    .line 137
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    mul-int v3, v3, v2

    new-array v2, v3, [I

    .line 139
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v3, 0x0

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۙ۟ۜ;

    .line 140
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۙ۟ۜ;

    .line 141
    iget v7, v6, Ll/ۙ۟ۜ;->᩹:I

    iget v8, v6, Ll/ۙ۟ۜ;->᩸:I

    iget v9, v4, Ll/ۙ۟ۜ;->᩹:I

    iget v10, v4, Ll/ۙ۟ۜ;->᩸:I

    .line 177
    invoke-virtual {p1, v7, v9}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v11

    :goto_1
    if-ge v7, v8, :cond_3

    move v12, v9

    :goto_2
    if-ge v12, v10, :cond_2

    .line 180
    invoke-virtual {p1, v7, v12}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v13

    if-eq v11, v13, :cond_1

    const/4 v6, 0x1

    .line 148
    aput v6, v2, v3

    goto :goto_3

    :cond_1
    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 142
    :cond_3
    iget v6, v6, Ll/ۙ۟ۜ;->᩹:I

    iget v7, v4, Ll/ۙ۟ۜ;->᩹:I

    invoke-virtual {p1, v6, v7}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v6

    .line 143
    invoke-static {v6}, Landroid/graphics/Color;->alpha(I)I

    move-result v7

    if-nez v7, :cond_4

    const/4 v6, 0x0

    .line 146
    :cond_4
    aput v6, v2, v3

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 131
    :cond_5
    iput-object v2, p0, Ll/۫۟ۜ;->֫:[I

    return-void
.end method
