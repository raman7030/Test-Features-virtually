.class public final Ll/ܽᩳۘ;
.super Ljava/io/InputStream;
.source "L9E4"

# interfaces
.implements Ll/ܶ֨ᩴ;


# static fields
.field public static final ۧ֫:Ll/֫᩻֨;


# instance fields
.field public ֫֫:Ll/ᩳ᩺ۖ;

.field public ۗ:I

.field public ۙ:Ll/֫ᩳۘ;

.field public ۛ:J

.field public ۟:J

.field public final ۤ:I

.field public final ۨ:Ljava/util/ArrayDeque;

.field public ۫:Z

.field public ۬:Ll/۟ܽۘ;

.field public final ܰ:J

.field public final ᩶:I

.field public final ᩸:Z

.field public final ᩹:J

.field public ᩺:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 52
    const-class v0, Ll/ܽᩳۘ;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ܽᩳۘ;->ۧ֫:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/۟ܽۘ;IJJJI)V
    .locals 4

    .line 69
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const-wide/16 v0, 0x0

    .line 41
    iput-wide v0, p0, Ll/ܽᩳۘ;->ۛ:J

    .line 42
    iput-wide v0, p0, Ll/ܽᩳۘ;->᩺:J

    const/4 v2, 0x0

    .line 45
    iput v2, p0, Ll/ܽᩳۘ;->ۗ:I

    .line 50
    new-instance v3, Ljava/util/ArrayDeque;

    invoke-direct {v3}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v3, p0, Ll/ܽᩳۘ;->ۨ:Ljava/util/ArrayDeque;

    .line 70
    iput-object p1, p0, Ll/ܽᩳۘ;->۬:Ll/۟ܽۘ;

    .line 71
    iput p2, p0, Ll/ܽᩳۘ;->᩶:I

    .line 73
    iput-wide p3, p0, Ll/ܽᩳۘ;->ܰ:J

    .line 74
    iput-wide p5, p0, Ll/ܽᩳۘ;->ۛ:J

    .line 75
    iput-wide p5, p0, Ll/ܽᩳۘ;->᩺:J

    .line 76
    iput-wide p7, p0, Ll/ܽᩳۘ;->۟:J

    const/4 p1, 0x1

    cmp-long p2, p7, v0

    if-ltz p2, :cond_0

    const/4 v2, 0x1

    .line 77
    :cond_0
    iput-boolean v2, p0, Ll/ܽᩳۘ;->᩸:Z

    const-wide p2, 0x7fffffffffffffffL

    if-eqz v2, :cond_1

    sub-long v0, p2, p5

    cmp-long p4, v0, p7

    if-ltz p4, :cond_1

    add-long p2, p5, p7

    .line 79
    :cond_1
    iput-wide p2, p0, Ll/ܽᩳۘ;->᩹:J

    .line 80
    invoke-static {p1, p9}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Ll/ܽᩳۘ;->ۤ:I

    return-void
.end method

.method private ֫()V
    .locals 2

    .line 235
    :goto_0
    iget-object v0, p0, Ll/ܽᩳۘ;->ۨ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 237
    :try_start_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧᩳۘ;

    invoke-static {v0}, Ll/ۧᩳۘ;->֫(Ll/ۧᩳۘ;)Ljava/util/concurrent/Future;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ܽ()V
    .locals 8

    .line 214
    :cond_0
    :goto_0
    iget-boolean v0, p0, Ll/ܽᩳۘ;->۫:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Ll/ܽᩳۘ;->۬:Ll/۟ܽۘ;

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll/ܽᩳۘ;->ۨ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    move-result v1

    iget v2, p0, Ll/ܽᩳۘ;->ۤ:I

    if-ge v1, v2, :cond_3

    .line 228
    iget-boolean v1, p0, Ll/ܽᩳۘ;->᩸:Z

    if-eqz v1, :cond_1

    iget-wide v2, p0, Ll/ܽᩳۘ;->۟:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-lez v6, :cond_3

    .line 215
    :cond_1
    iget v2, p0, Ll/ܽᩳۘ;->᩶:I

    if-eqz v1, :cond_2

    int-to-long v2, v2

    iget-wide v4, p0, Ll/ܽᩳۘ;->۟:J

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v2, v2

    .line 216
    :cond_2
    new-instance v3, Ll/ۧᩳۘ;

    iget-object v4, p0, Ll/ܽᩳۘ;->۬:Ll/۟ܽۘ;

    iget-wide v5, p0, Ll/ܽᩳۘ;->ۛ:J

    iget-object v7, v4, Ll/ۗܽۘ;->ۙ:Ll/ܰܽۘ;

    iget-object v4, v4, Ll/ۗܽۘ;->᩸:Ll/۫ۛۖ;

    invoke-virtual {v7, v4, v5, v6, v2}, Ll/ۖᩳۘ;->ۧ(Ll/۫ۛۖ;JI)Ll/ۧ۟ۖ;

    move-result-object v4

    invoke-direct {v3, v4, v2}, Ll/ۧᩳۘ;-><init>(Ll/ۧ۟ۖ;I)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 217
    iget-wide v3, p0, Ll/ܽᩳۘ;->ۛ:J

    int-to-long v5, v2

    add-long/2addr v3, v5

    iput-wide v3, p0, Ll/ܽᩳۘ;->ۛ:J

    if-eqz v1, :cond_0

    .line 219
    iget-wide v0, p0, Ll/ܽᩳۘ;->۟:J

    sub-long/2addr v0, v5

    iput-wide v0, p0, Ll/ܽᩳۘ;->۟:J

    goto :goto_0

    :cond_3
    return-void
.end method

.method private ᩳ()V
    .locals 10

    .line 162
    iget-boolean v0, p0, Ll/ܽᩳۘ;->۫:Z

    if-eqz v0, :cond_0

    return-void

    .line 166
    :cond_0
    invoke-direct {p0}, Ll/ܽᩳۘ;->ܽ()V

    .line 167
    iget-object v0, p0, Ll/ܽᩳۘ;->ۨ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    .line 168
    iput-boolean v2, p0, Ll/ܽᩳۘ;->۫:Z

    .line 169
    sget-object v0, Ll/֫ᩳۘ;->ۙ:Ll/֫ᩳۘ;

    iput-object v0, p0, Ll/ܽᩳۘ;->ۙ:Ll/֫ᩳۘ;

    return-void

    .line 173
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧᩳۘ;

    .line 174
    invoke-static {v0}, Ll/ۧᩳۘ;->֫(Ll/ۧᩳۘ;)Ljava/util/concurrent/Future;

    move-result-object v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    sget-object v3, Ll/ۖ۟ۖ;->᩸:Ll/ܽ۟ۖ;

    iget-wide v3, p0, Ll/ܽᩳۘ;->ܰ:J

    invoke-static {v3, v4, v1}, Ll/ᩳ۟ۖ;->֫(JLjava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳ᩺ۖ;

    .line 175
    invoke-virtual {v1}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v3

    check-cast v3, Ll/᩻ۨۖ;

    invoke-virtual {v3}, Ll/᩻ۨۖ;->ۡ()J

    move-result-wide v3

    sget-object v5, Ll/۟۫ۖ;->᩹ۧ:Ll/۟۫ۖ;

    invoke-virtual {v5}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v6

    const/4 v8, 0x0

    cmp-long v9, v3, v6

    if-nez v9, :cond_2

    .line 177
    iput-object v1, p0, Ll/ܽᩳۘ;->֫֫:Ll/ᩳ᩺ۖ;

    .line 178
    iput v8, p0, Ll/ܽᩳۘ;->ۗ:I

    .line 179
    iget-wide v3, p0, Ll/ܽᩳۘ;->᩺:J

    invoke-virtual {v1}, Ll/ᩳ᩺ۖ;->᩷()I

    move-result v6

    int-to-long v6, v6

    add-long/2addr v3, v6

    iput-wide v3, p0, Ll/ܽᩳۘ;->᩺:J

    .line 188
    :cond_2
    invoke-virtual {v1}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v3

    check-cast v3, Ll/᩻ۨۖ;

    invoke-virtual {v3}, Ll/᩻ۨۖ;->ۡ()J

    move-result-wide v3

    sget-object v6, Ll/۟۫ۖ;->ܿ֫:Ll/۟۫ۖ;

    invoke-virtual {v6}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v6

    cmp-long v9, v3, v6

    if-eqz v9, :cond_6

    invoke-virtual {v1}, Ll/ᩳ᩺ۖ;->᩷()I

    move-result v3

    if-nez v3, :cond_3

    goto :goto_0

    .line 198
    :cond_3
    invoke-virtual {v1}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v2

    check-cast v2, Ll/᩻ۨۖ;

    invoke-virtual {v2}, Ll/᩻ۨۖ;->ۡ()J

    move-result-wide v2

    invoke-virtual {v5}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v4

    cmp-long v6, v2, v4

    if-nez v6, :cond_5

    .line 202
    iget-boolean v2, p0, Ll/ܽᩳۘ;->᩸:Z

    if-eqz v2, :cond_4

    invoke-virtual {v1}, Ll/ᩳ᩺ۖ;->᩷()I

    move-result v1

    invoke-static {v0}, Ll/ۧᩳۘ;->ۧ(Ll/ۧᩳۘ;)I

    move-result v0

    if-ge v1, v0, :cond_4

    .line 204
    invoke-direct {p0}, Ll/ܽᩳۘ;->֫()V

    const-wide/16 v0, 0x0

    .line 205
    iput-wide v0, p0, Ll/ܽᩳۘ;->۟:J

    .line 207
    :cond_4
    invoke-direct {p0}, Ll/ܽᩳۘ;->ܽ()V

    return-void

    .line 199
    :cond_5
    new-instance v0, Ll/֨ۨۖ;

    invoke-virtual {v1}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v1

    check-cast v1, Ll/᩻ۨۖ;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Read failed for "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ll/֨ۨۖ;-><init>(Ll/᩻ۨۖ;Ljava/lang/String;)V

    throw v0

    .line 189
    :cond_6
    :goto_0
    iget-wide v0, p0, Ll/ܽᩳۘ;->᩺:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ll/ܽᩳۘ;->ۧ֫:Ll/֫᩻֨;

    const-string v3, "EOF, {} bytes read"

    invoke-interface {v1, v0, v3}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    iput-boolean v2, p0, Ll/ܽᩳۘ;->۫:Z

    .line 191
    sget-object v0, Ll/֫ᩳۘ;->ۙ:Ll/֫ᩳۘ;

    iput-object v0, p0, Ll/ܽᩳۘ;->ۙ:Ll/֫ᩳۘ;

    const/4 v0, 0x0

    .line 192
    iput-object v0, p0, Ll/ܽᩳۘ;->֫֫:Ll/ᩳ᩺ۖ;

    .line 193
    iput v8, p0, Ll/ܽᩳۘ;->ۗ:I

    .line 194
    invoke-direct {p0}, Ll/ܽᩳۘ;->֫()V

    return-void
.end method


# virtual methods
.method public final available()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final close()V
    .locals 8

    .line 120
    iget-object v0, p0, Ll/ܽᩳۘ;->ۨ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    .line 121
    invoke-direct {p0}, Ll/ܽᩳۘ;->֫()V

    .line 122
    iget-object v1, p0, Ll/ܽᩳۘ;->ۙ:Ll/֫ᩳۘ;

    const/4 v2, 0x1

    if-nez v1, :cond_5

    .line 123
    iget-object v1, p0, Ll/ܽᩳۘ;->֫֫:Ll/ᩳ᩺ۖ;

    if-eqz v1, :cond_1

    iget v3, p0, Ll/ܽᩳۘ;->ۗ:I

    invoke-virtual {v1}, Ll/ᩳ᩺ۖ;->᩷()I

    move-result v1

    if-lt v3, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 124
    :goto_1
    iget-boolean v3, p0, Ll/ܽᩳۘ;->۫:Z

    if-nez v3, :cond_4

    iget-boolean v3, p0, Ll/ܽᩳۘ;->᩸:Z

    if-eqz v3, :cond_2

    iget-wide v3, p0, Ll/ܽᩳۘ;->۟:J

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-nez v7, :cond_2

    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    if-nez v0, :cond_3

    .line 126
    sget-object v0, Ll/֫ᩳۘ;->᩶:Ll/֫ᩳۘ;

    goto :goto_3

    :cond_3
    sget-object v0, Ll/֫ᩳۘ;->᩹:Ll/֫ᩳۘ;

    goto :goto_3

    .line 125
    :cond_4
    :goto_2
    sget-object v0, Ll/֫ᩳۘ;->ۙ:Ll/֫ᩳۘ;

    .line 126
    :goto_3
    iput-object v0, p0, Ll/ܽᩳۘ;->ۙ:Ll/֫ᩳۘ;

    .line 128
    :cond_5
    iput-boolean v2, p0, Ll/ܽᩳۘ;->۫:Z

    const/4 v0, 0x0

    .line 129
    iput-object v0, p0, Ll/ܽᩳۘ;->۬:Ll/۟ܽۘ;

    .line 130
    iput-object v0, p0, Ll/ܽᩳۘ;->֫֫:Ll/ᩳ᩺ۖ;

    return-void
.end method

.method public final read()I
    .locals 3

    .line 85
    iget-object v0, p0, Ll/ܽᩳۘ;->֫֫:Ll/ᩳ᩺ۖ;

    if-eqz v0, :cond_0

    iget v1, p0, Ll/ܽᩳۘ;->ۗ:I

    invoke-virtual {v0}, Ll/ᩳ᩺ۖ;->᩷()I

    move-result v0

    if-lt v1, v0, :cond_1

    .line 86
    :cond_0
    invoke-direct {p0}, Ll/ܽᩳۘ;->ᩳ()V

    .line 88
    :cond_1
    iget-boolean v0, p0, Ll/ܽᩳۘ;->۫:Z

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    return v0

    .line 91
    :cond_2
    iget-object v0, p0, Ll/ܽᩳۘ;->֫֫:Ll/ᩳ᩺ۖ;

    iget v1, p0, Ll/ܽᩳۘ;->ۗ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ܽᩳۘ;->ۗ:I

    invoke-virtual {v0, v1}, Ll/ᩳ᩺ۖ;->֫(I)B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([B)I
    .locals 2

    const/4 v0, 0x0

    .line 96
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/ܽᩳۘ;->read([BII)I

    move-result p1

    return p1
.end method

.method public final read([BII)I
    .locals 2

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 105
    :cond_0
    iget-object v0, p0, Ll/ܽᩳۘ;->֫֫:Ll/ᩳ᩺ۖ;

    if-eqz v0, :cond_1

    iget v1, p0, Ll/ܽᩳۘ;->ۗ:I

    invoke-virtual {v0}, Ll/ᩳ᩺ۖ;->᩷()I

    move-result v0

    if-lt v1, v0, :cond_2

    .line 106
    :cond_1
    invoke-direct {p0}, Ll/ܽᩳۘ;->ᩳ()V

    .line 108
    :cond_2
    iget-boolean v0, p0, Ll/ܽᩳۘ;->۫:Z

    if-eqz v0, :cond_3

    const/4 p1, -0x1

    return p1

    .line 111
    :cond_3
    iget-object v0, p0, Ll/ܽᩳۘ;->֫֫:Ll/ᩳ᩺ۖ;

    invoke-virtual {v0}, Ll/ᩳ᩺ۖ;->᩷()I

    move-result v0

    iget v1, p0, Ll/ܽᩳۘ;->ۗ:I

    sub-int/2addr v0, v1

    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 112
    iget-object v0, p0, Ll/ܽᩳۘ;->֫֫:Ll/ᩳ᩺ۖ;

    iget v1, p0, Ll/ܽᩳۘ;->ۗ:I

    invoke-virtual {v0, v1, p1, p2, p3}, Ll/ᩳ᩺ۖ;->֫(I[BII)V

    .line 113
    iget p1, p0, Ll/ܽᩳۘ;->ۗ:I

    add-int/2addr p1, p3

    iput p1, p0, Ll/ܽᩳۘ;->ۗ:I

    return p3
.end method

.method public final skip(J)J
    .locals 9

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    return-wide v0

    .line 143
    :cond_0
    iget-object v2, p0, Ll/ܽᩳۘ;->֫֫:Ll/ᩳ᩺ۖ;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ll/ᩳ᩺ۖ;->᩷()I

    move-result v2

    iget v3, p0, Ll/ܽᩳۘ;->ۗ:I

    sub-int/2addr v2, v3

    int-to-long v4, v2

    cmp-long v2, p1, v4

    if-gez v2, :cond_1

    long-to-int v0, p1

    add-int/2addr v3, v0

    .line 145
    iput v3, p0, Ll/ܽᩳۘ;->ۗ:I

    return-wide p1

    .line 148
    :cond_1
    iget-object v2, p0, Ll/ܽᩳۘ;->֫֫:Ll/ᩳ᩺ۖ;

    if-nez v2, :cond_2

    iget-wide v2, p0, Ll/ܽᩳۘ;->᩺:J

    goto :goto_0

    :cond_2
    iget-wide v3, p0, Ll/ܽᩳۘ;->᩺:J

    invoke-virtual {v2}, Ll/ᩳ᩺ۖ;->᩷()I

    move-result v2

    int-to-long v5, v2

    sub-long/2addr v3, v5

    iget v2, p0, Ll/ܽᩳۘ;->ۗ:I

    int-to-long v5, v2

    add-long v2, v3, v5

    :goto_0
    const-wide v4, 0x7fffffffffffffffL

    sub-long v6, v4, v2

    cmp-long v8, v6, p1

    if-ltz v8, :cond_3

    add-long v4, v2, p1

    :cond_3
    const/4 v2, 0x0

    .line 150
    iput-object v2, p0, Ll/ܽᩳۘ;->֫֫:Ll/ᩳ᩺ۖ;

    const/4 v2, 0x0

    .line 151
    iput v2, p0, Ll/ܽᩳۘ;->ۗ:I

    .line 152
    invoke-direct {p0}, Ll/ܽᩳۘ;->֫()V

    .line 153
    iput-wide v4, p0, Ll/ܽᩳۘ;->ۛ:J

    .line 154
    iput-wide v4, p0, Ll/ܽᩳۘ;->᩺:J

    .line 155
    iget-boolean v2, p0, Ll/ܽᩳۘ;->᩸:Z

    if-eqz v2, :cond_4

    .line 156
    iget-wide v2, p0, Ll/ܽᩳۘ;->᩹:J

    sub-long/2addr v2, v4

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ܽᩳۘ;->۟:J

    :cond_4
    return-wide p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
