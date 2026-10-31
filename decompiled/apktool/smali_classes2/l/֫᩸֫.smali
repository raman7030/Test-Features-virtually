.class public final Ll/֫᩸֫;
.super Ljava/lang/Object;
.source "A734"


# instance fields
.field public final ֫:Ljava/util/TreeSet;

.field public final ۧ:I

.field public final ܽ:Ljava/lang/String;

.field public ܿ:Ll/ۜ᩸֫;

.field public final ᩳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ll/ۜ᩸֫;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput p1, p0, Ll/֫᩸֫;->ۧ:I

    .line 63
    iput-object p2, p0, Ll/֫᩸֫;->ܽ:Ljava/lang/String;

    .line 64
    iput-object p3, p0, Ll/֫᩸֫;->ܿ:Ll/ۜ᩸֫;

    .line 65
    new-instance p1, Ljava/util/TreeSet;

    invoke-direct {p1}, Ljava/util/TreeSet;-><init>()V

    iput-object p1, p0, Ll/֫᩸֫;->֫:Ljava/util/TreeSet;

    .line 66
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/֫᩸֫;->ᩳ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 272
    const-class v2, Ll/֫᩸֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 275
    :cond_1
    check-cast p1, Ll/֫᩸֫;

    .line 276
    iget v2, p0, Ll/֫᩸֫;->ۧ:I

    iget v3, p1, Ll/֫᩸֫;->ۧ:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll/֫᩸֫;->ܽ:Ljava/lang/String;

    iget-object v3, p1, Ll/֫᩸֫;->ܽ:Ljava/lang/String;

    .line 277
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/֫᩸֫;->֫:Ljava/util/TreeSet;

    iget-object v3, p1, Ll/֫᩸֫;->֫:Ljava/util/TreeSet;

    .line 278
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/֫᩸֫;->ܿ:Ll/ۜ᩸֫;

    iget-object p1, p1, Ll/֫᩸֫;->ܿ:Ll/ۜ᩸֫;

    .line 279
    invoke-virtual {v2, p1}, Ll/ۜ᩸֫;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    .line 262
    iget v0, p0, Ll/֫᩸֫;->ۧ:I

    const/16 v1, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Ll/֫᩸֫;->ܽ:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۧ۬֫;->֫(IILjava/lang/String;)I

    move-result v0

    .line 263
    iget-object v1, p0, Ll/֫᩸֫;->ܿ:Ll/ۜ᩸֫;

    invoke-virtual {v1}, Ll/ۜ᩸֫;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final ֫(JJ)J
    .locals 11

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    cmp-long v4, p1, v2

    if-ltz v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 183
    :goto_0
    invoke-static {v4}, Ll/᩺֡֫;->֫(Z)V

    cmp-long v4, p3, v2

    if-ltz v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 184
    :goto_1
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 185
    invoke-virtual {p0, p1, p2, p3, p4}, Ll/֫᩸֫;->ۧ(JJ)Ll/ۖ᩸֫;

    move-result-object v0

    iget-wide v4, v0, Ll/᩺ܶ֫;->ۗ:J

    .line 88
    iget-boolean v6, v0, Ll/᩺ܶ֫;->᩹:Z

    const-wide v7, 0x7fffffffffffffffL

    if-nez v6, :cond_3

    const-wide/16 p1, -0x1

    cmp-long v0, v4, p1

    if-nez v0, :cond_2

    move-wide v4, v7

    .line 188
    :cond_2
    invoke-static {v4, v5, p3, p4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    neg-long p1, p1

    return-wide p1

    :cond_3
    add-long v9, p1, p3

    cmp-long v6, v9, v2

    if-gez v6, :cond_4

    goto :goto_2

    :cond_4
    move-wide v7, v9

    .line 195
    :goto_2
    iget-wide v2, v0, Ll/᩺ܶ֫;->۬:J

    add-long/2addr v2, v4

    cmp-long v4, v2, v7

    if-gez v4, :cond_7

    .line 197
    iget-object v4, p0, Ll/֫᩸֫;->֫:Ljava/util/TreeSet;

    invoke-virtual {v4, v0, v1}, Ljava/util/TreeSet;->tailSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/NavigableSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖ᩸֫;

    .line 198
    iget-wide v4, v1, Ll/᩺ܶ֫;->۬:J

    cmp-long v6, v4, v2

    if-lez v6, :cond_6

    goto :goto_3

    .line 204
    :cond_6
    iget-wide v9, v1, Ll/᩺ܶ֫;->ۗ:J

    add-long/2addr v4, v9

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    cmp-long v1, v2, v7

    if-ltz v1, :cond_5

    :cond_7
    :goto_3
    sub-long/2addr v2, p1

    .line 211
    invoke-static {v2, v3, p3, p4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final ֫(Ll/ۖ᩸֫;JZ)Ll/ۖ᩸֫;
    .locals 11

    .line 225
    iget-object v0, p0, Ll/֫᩸֫;->֫:Ljava/util/TreeSet;

    invoke-virtual {v0, p1}, Ljava/util/TreeSet;->remove(Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 226
    iget-object v1, p1, Ll/᩺ܶ֫;->᩸:Ljava/io/File;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p4, :cond_1

    .line 228
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v2

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    iget-wide v4, p1, Ll/᩺ܶ֫;->۬:J

    .line 230
    iget v3, p0, Ll/֫᩸֫;->ۧ:I

    move-wide v6, p2

    invoke-static/range {v2 .. v7}, Ll/ۖ᩸֫;->֫(Ljava/io/File;IJJ)Ljava/io/File;

    move-result-object p4

    .line 231
    invoke-virtual {v1, p4}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v10, p4

    goto :goto_0

    .line 234
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to rename "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    :cond_1
    move-object v10, v1

    .line 203
    :goto_0
    iget-boolean p4, p1, Ll/᩺ܶ֫;->᩹:Z

    invoke-static {p4}, Ll/᩺֡֫;->ۧ(Z)V

    .line 204
    new-instance p4, Ll/ۖ᩸֫;

    iget-object v3, p1, Ll/᩺ܶ֫;->᩶:Ljava/lang/String;

    iget-wide v4, p1, Ll/᩺ܶ֫;->۬:J

    iget-wide v6, p1, Ll/᩺ܶ֫;->ۗ:J

    move-object v2, p4

    move-wide v8, p2

    .line 191
    invoke-direct/range {v2 .. v10}, Ll/᩺ܶ֫;-><init>(Ljava/lang/String;JJJLjava/io/File;)V

    .line 239
    invoke-virtual {v0, p4}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    return-object p4
.end method

.method public final ֫()Ll/ۜ᩸֫;
    .locals 1

    .line 71
    iget-object v0, p0, Ll/֫᩸֫;->ܿ:Ll/ۜ᩸֫;

    return-object v0
.end method

.method public final ֫(J)V
    .locals 5

    const/4 v0, 0x0

    .line 130
    :goto_0
    iget-object v1, p0, Ll/֫᩸֫;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 131
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۟ܶ֫;

    iget-wide v2, v2, Ll/۟ܶ֫;->ۧ:J

    cmp-long v4, v2, p1

    if-nez v4, :cond_0

    .line 132
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 136
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final ֫(Ll/ۖ᩸֫;)V
    .locals 1

    .line 141
    iget-object v0, p0, Ll/֫᩸֫;->֫:Ljava/util/TreeSet;

    invoke-virtual {v0, p1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/᩺ܶ֫;)Z
    .locals 1

    .line 250
    iget-object v0, p0, Ll/֫᩸֫;->֫:Ljava/util/TreeSet;

    invoke-virtual {v0, p1}, Ljava/util/TreeSet;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 251
    iget-object p1, p1, Ll/᩺ܶ֫;->᩸:Ljava/io/File;

    if-eqz p1, :cond_0

    .line 252
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/᩻᩸֫;)Z
    .locals 1

    .line 80
    iget-object v0, p0, Ll/֫᩸֫;->ܿ:Ll/ۜ᩸֫;

    .line 81
    invoke-virtual {v0, p1}, Ll/ۜ᩸֫;->֫(Ll/᩻᩸֫;)Ll/ۜ᩸֫;

    move-result-object p1

    iput-object p1, p0, Ll/֫᩸֫;->ܿ:Ll/ۜ᩸֫;

    .line 82
    invoke-virtual {p1, v0}, Ll/ۜ᩸֫;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public final ۧ()Ljava/util/TreeSet;
    .locals 1

    .line 146
    iget-object v0, p0, Ll/֫᩸֫;->֫:Ljava/util/TreeSet;

    return-object v0
.end method

.method public final ۧ(JJ)Ll/ۖ᩸֫;
    .locals 10

    .line 61
    new-instance v9, Ll/ۖ᩸֫;

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v8, 0x0

    .line 191
    iget-object v1, p0, Ll/֫᩸֫;->ܽ:Ljava/lang/String;

    const-wide/16 v4, -0x1

    move-object v0, v9

    move-wide v2, p1

    invoke-direct/range {v0 .. v8}, Ll/᩺ܶ֫;-><init>(Ljava/lang/String;JJJLjava/io/File;)V

    .line 159
    iget-object v0, p0, Ll/֫᩸֫;->֫:Ljava/util/TreeSet;

    invoke-virtual {v0, v9}, Ljava/util/TreeSet;->floor(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖ᩸֫;

    if-eqz v1, :cond_0

    .line 160
    iget-wide v2, v1, Ll/᩺ܶ֫;->۬:J

    iget-wide v4, v1, Ll/᩺ܶ֫;->ۗ:J

    add-long/2addr v2, v4

    cmp-long v4, v2, p1

    if-lez v4, :cond_0

    return-object v1

    .line 163
    :cond_0
    invoke-virtual {v0, v9}, Ljava/util/TreeSet;->ceiling(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖ᩸֫;

    if-eqz v0, :cond_2

    .line 165
    iget-wide v0, v0, Ll/᩺ܶ֫;->۬:J

    sub-long/2addr v0, p1

    const-wide/16 v2, -0x1

    cmp-long v4, p3, v2

    if-nez v4, :cond_1

    move-wide v4, v0

    goto :goto_0

    .line 166
    :cond_1
    invoke-static {v0, v1, p3, p4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p3

    :cond_2
    move-wide v4, p3

    .line 73
    :goto_0
    new-instance p3, Ll/ۖ᩸֫;

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v8, 0x0

    .line 191
    iget-object v1, p0, Ll/֫᩸֫;->ܽ:Ljava/lang/String;

    move-object v0, p3

    move-wide v2, p1

    invoke-direct/range {v0 .. v8}, Ll/᩺ܶ֫;-><init>(Ljava/lang/String;JJJLjava/io/File;)V

    return-object p3
.end method

.method public final ܽ()Z
    .locals 1

    .line 245
    iget-object v0, p0, Ll/֫᩸֫;->֫:Ljava/util/TreeSet;

    invoke-virtual {v0}, Ljava/util/TreeSet;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final ܽ(JJ)Z
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 98
    :goto_0
    iget-object v2, p0, Ll/֫᩸֫;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_3

    .line 99
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۟ܶ֫;

    .line 304
    iget-wide v3, v2, Ll/۟ܶ֫;->ۧ:J

    iget-wide v5, v2, Ll/۟ܶ֫;->֫:J

    const-wide/16 v7, -0x1

    cmp-long v2, v5, v7

    if-nez v2, :cond_0

    cmp-long v2, p1, v3

    if-ltz v2, :cond_2

    goto :goto_1

    :cond_0
    cmp-long v2, p3, v7

    if-nez v2, :cond_1

    goto :goto_2

    :cond_1
    cmp-long v2, v3, p1

    if-gtz v2, :cond_2

    add-long v7, p1, p3

    add-long/2addr v3, v5

    cmp-long v2, v7, v3

    if-gtz v2, :cond_2

    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 87
    iget-object v0, p0, Ll/֫᩸֫;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final ᩳ(JJ)Z
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 114
    :goto_0
    iget-object v2, p0, Ll/֫᩸֫;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_3

    .line 115
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۟ܶ֫;

    .line 322
    iget-wide v3, v2, Ll/۟ܶ֫;->ۧ:J

    const-wide/16 v5, -0x1

    cmp-long v7, v3, p1

    if-gtz v7, :cond_0

    .line 323
    iget-wide v7, v2, Ll/۟ܶ֫;->֫:J

    cmp-long v2, v7, v5

    if-eqz v2, :cond_2

    add-long/2addr v3, v7

    cmp-long v2, v3, p1

    if-lez v2, :cond_1

    goto :goto_1

    :cond_0
    cmp-long v2, p3, v5

    if-eqz v2, :cond_2

    add-long v5, p1, p3

    cmp-long v2, v5, v3

    if-lez v2, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v0

    .line 119
    :cond_3
    new-instance v0, Ll/۟ܶ֫;

    invoke-direct {v0, p1, p2, p3, p4}, Ll/۟ܶ֫;-><init>(JJ)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1
.end method
