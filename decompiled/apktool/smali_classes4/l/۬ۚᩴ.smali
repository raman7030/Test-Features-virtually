.class public Ll/۬ۚᩴ;
.super Ljava/lang/Object;
.source "AAQM"

# interfaces
.implements Ll/۠ۚᩴ;


# instance fields
.field public ۗ:J

.field public ۙ:I

.field public final ᩶:Ll/۫֡ᩴ;

.field public final ᩸:I

.field public ᩹:Ll/۠ۚᩴ;


# direct methods
.method public constructor <init>(Ll/۫֡ᩴ;JI)V
    .locals 1

    .line 1128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x400

    .line 1118
    iput v0, p0, Ll/۬ۚᩴ;->ۙ:I

    const/4 v0, 0x0

    .line 1120
    iput-object v0, p0, Ll/۬ۚᩴ;->᩹:Ll/۠ۚᩴ;

    .line 1129
    iput-object p1, p0, Ll/۬ۚᩴ;->᩶:Ll/۫֡ᩴ;

    .line 1131
    iput-wide p2, p0, Ll/۬ۚᩴ;->ۗ:J

    and-int/lit16 p1, p4, 0x1000

    if-eqz p1, :cond_0

    .line 1133
    iput p4, p0, Ll/۬ۚᩴ;->᩸:I

    return-void

    :cond_0
    or-int/lit16 p1, p4, 0x4040

    .line 1135
    iput p1, p0, Ll/۬ۚᩴ;->᩸:I

    return-void
.end method


# virtual methods
.method public final characteristics()I
    .locals 1

    .line 1173
    iget v0, p0, Ll/۬ۚᩴ;->᩸:I

    return v0
.end method

.method public final estimateSize()J
    .locals 5

    .line 1164
    iget-object v0, p0, Ll/۬ۚᩴ;->᩹:Ll/۠ۚᩴ;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ll/ܶ۫ᩴ;->estimateSize()J

    move-result-wide v0

    return-wide v0

    .line 1165
    :cond_0
    iget-object v0, p0, Ll/۬ۚᩴ;->᩶:Ll/۫֡ᩴ;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-nez v0, :cond_1

    return-wide v1

    .line 1168
    :cond_1
    iget-wide v3, p0, Ll/۬ۚᩴ;->ۗ:J

    cmp-long v0, v3, v1

    if-ltz v0, :cond_2

    return-wide v3

    :cond_2
    const-wide v0, 0x7fffffffffffffffL

    return-wide v0
.end method

.method public final forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 2

    .line 1154
    iget-object v0, p0, Ll/۬ۚᩴ;->᩹:Ll/۠ۚᩴ;

    if-eqz v0, :cond_0

    .line 1155
    invoke-interface {v0, p1}, Ll/ܶ۫ᩴ;->forEachRemaining(Ljava/util/function/Consumer;)V

    const/4 v0, 0x0

    .line 1156
    iput-object v0, p0, Ll/۬ۚᩴ;->᩹:Ll/۠ۚᩴ;

    .line 1158
    :cond_0
    iget-object v0, p0, Ll/۬ۚᩴ;->᩶:Ll/۫֡ᩴ;

    invoke-static {v0, p1}, Ll/۬۬ᩴ;->forEachRemaining(Ljava/util/Iterator;Ljava/util/function/Consumer;)V

    const-wide/16 v0, 0x0

    .line 1159
    iput-wide v0, p0, Ll/۬ۚᩴ;->ۗ:J

    return-void
.end method

.method public synthetic getComparator()Ljava/util/Comparator;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/ۖ۫ᩴ;->$default$getComparator(Ll/ܶ۫ᩴ;)Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public synthetic getExactSizeIfKnown()J
    .locals 2

    .line 0
    invoke-static {p0}, Ll/ۖ۫ᩴ;->$default$getExactSizeIfKnown(Ll/ܶ۫ᩴ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic hasCharacteristics(I)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۖ۫ᩴ;->$default$hasCharacteristics(Ll/ܶ۫ᩴ;I)Z

    move-result p1

    return p1
.end method

.method public final tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 5

    .line 1141
    iget-object v0, p0, Ll/۬ۚᩴ;->᩹:Ll/۠ۚᩴ;

    if-eqz v0, :cond_1

    .line 1142
    invoke-interface {v0, p1}, Ll/ܶ۫ᩴ;->tryAdvance(Ljava/util/function/Consumer;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    .line 1143
    iput-object v0, p0, Ll/۬ۚᩴ;->᩹:Ll/۠ۚᩴ;

    :cond_0
    return p1

    .line 1146
    :cond_1
    iget-object v0, p0, Ll/۬ۚᩴ;->᩶:Ll/۫֡ᩴ;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_2

    const/4 p1, 0x0

    return p1

    .line 1147
    :cond_2
    iget-wide v1, p0, Ll/۬ۚᩴ;->ۗ:J

    const-wide/16 v3, 0x1

    sub-long/2addr v1, v3

    iput-wide v1, p0, Ll/۬ۚᩴ;->ۗ:J

    .line 1148
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final trySplit()Ll/ܶ۫ᩴ;
    .locals 9

    .line 1182
    iget-object v0, p0, Ll/۬ۚᩴ;->᩶:Ll/۫֡ᩴ;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    goto/16 :goto_3

    .line 1183
    :cond_0
    iget-wide v1, p0, Ll/۬ۚᩴ;->ۗ:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_1

    iget v3, p0, Ll/۬ۚᩴ;->ۙ:I

    int-to-long v3, v3

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v2, v1

    goto :goto_0

    :cond_1
    iget v2, p0, Ll/۬ۚᩴ;->ۙ:I

    .line 1185
    :goto_0
    new-array v1, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    :goto_1
    const-wide/16 v4, 0x1

    if-ge v3, v2, :cond_2

    .line 1187
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    add-int/lit8 v6, v3, 0x1

    .line 1188
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    aput-object v7, v1, v3

    .line 1189
    iget-wide v7, p0, Ll/۬ۚᩴ;->ۗ:J

    sub-long/2addr v7, v4

    iput-wide v7, p0, Ll/۬ۚᩴ;->ۗ:J

    move v3, v6

    goto :goto_1

    .line 1193
    :cond_2
    iget v6, p0, Ll/۬ۚᩴ;->ۙ:I

    if-ge v2, v6, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 1194
    iget v2, p0, Ll/۬ۚᩴ;->ۙ:I

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    .line 1195
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    iget v2, p0, Ll/۬ۚᩴ;->ۙ:I

    if-ge v3, v2, :cond_3

    add-int/lit8 v2, v3, 0x1

    .line 1196
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    aput-object v6, v1, v3

    .line 1197
    iget-wide v6, p0, Ll/۬ۚᩴ;->ۗ:J

    sub-long/2addr v6, v4

    iput-wide v6, p0, Ll/۬ۚᩴ;->ۗ:J

    move v3, v2

    goto :goto_2

    .line 1200
    :cond_3
    iget v2, p0, Ll/۬ۚᩴ;->ۙ:I

    add-int/lit16 v2, v2, 0x400

    const/high16 v4, 0x2000000

    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    iput v2, p0, Ll/۬ۚᩴ;->ۙ:I

    .line 1202
    invoke-virtual {p0, v3, v1}, Ll/۬ۚᩴ;->֫(I[Ljava/lang/Object;)Ll/۠ۚᩴ;

    move-result-object v1

    .line 1203
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_4

    .line 1204
    iput-object v1, p0, Ll/۬ۚᩴ;->᩹:Ll/۠ۚᩴ;

    .line 1205
    check-cast v1, Ll/᩸ۚᩴ;

    invoke-virtual {v1}, Ll/᩸ۚᩴ;->trySplit()Ll/۠ۚᩴ;

    move-result-object v0

    goto :goto_3

    :cond_4
    move-object v0, v1

    :goto_3
    return-object v0
.end method

.method public ֫(I[Ljava/lang/Object;)Ll/۠ۚᩴ;
    .locals 3

    .line 361
    array-length v0, p2

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Ll/ۢ᩹ۡ;->ۧ(III)V

    .line 367
    new-instance v0, Ll/᩸ۚᩴ;

    iget v2, p0, Ll/۬ۚᩴ;->᩸:I

    invoke-direct {v0, v1, p1, v2, p2}, Ll/᩸ۚᩴ;-><init>(III[Ljava/lang/Object;)V

    return-object v0
.end method
