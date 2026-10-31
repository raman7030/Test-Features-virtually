.class public final Ll/ܺ᩷ۧ;
.super Ljava/lang/Object;
.source "C8NH"

# interfaces
.implements Ll/۠᩷ۧ;


# instance fields
.field public final ֫:Ll/ۢᩴ֫;

.field public ۧ:[B

.field public final ܳ:[B

.field public ܽ:I

.field public ܿ:J

.field public ᩳ:I

.field public final ᩻:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "media3.extractor"

    .line 36
    invoke-static {v0}, Ll/ܽ᩵֫;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ll/ۢᩴ֫;JJ)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Ll/ܺ᩷ۧ;->֫:Ll/ۢᩴ֫;

    .line 59
    iput-wide p2, p0, Ll/ܺ᩷ۧ;->ܿ:J

    .line 60
    iput-wide p4, p0, Ll/ܺ᩷ۧ;->᩻:J

    const/high16 p1, 0x10000

    new-array p1, p1, [B

    .line 61
    iput-object p1, p0, Ll/ܺ᩷ۧ;->ۧ:[B

    const/16 p1, 0x1000

    new-array p1, p1, [B

    .line 62
    iput-object p1, p0, Ll/ܺ᩷ۧ;->ܳ:[B

    return-void
.end method

.method private ֫(ZI[BII)I
    .locals 1

    .line 295
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_2

    add-int/2addr p2, p5

    sub-int/2addr p4, p5

    .line 298
    iget-object v0, p0, Ll/ܺ᩷ۧ;->֫:Ll/ۢᩴ֫;

    invoke-interface {v0, p3, p2, p4}, Ll/ۢᩴ֫;->read([BII)I

    move-result p2

    const/4 p3, -0x1

    if-ne p2, p3, :cond_1

    if-nez p5, :cond_0

    if-eqz p1, :cond_0

    return p3

    .line 303
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_1
    add-int/2addr p5, p2

    return p5

    .line 296
    :cond_2
    new-instance p1, Ljava/io/InterruptedIOException;

    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    throw p1
.end method

.method private ܿ(I)V
    .locals 5

    .line 265
    iget v0, p0, Ll/ܺ᩷ۧ;->ܽ:I

    sub-int/2addr v0, p1

    iput v0, p0, Ll/ܺ᩷ۧ;->ܽ:I

    const/4 v1, 0x0

    .line 266
    iput v1, p0, Ll/ܺ᩷ۧ;->ᩳ:I

    .line 267
    iget-object v2, p0, Ll/ܺ᩷ۧ;->ۧ:[B

    .line 268
    array-length v3, v2

    const/high16 v4, 0x80000

    sub-int/2addr v3, v4

    if-ge v0, v3, :cond_0

    const/high16 v3, 0x10000

    add-int/2addr v3, v0

    .line 269
    new-array v3, v3, [B

    goto :goto_0

    :cond_0
    move-object v3, v2

    .line 271
    :goto_0
    invoke-static {v2, p1, v3, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 272
    iput-object v3, p0, Ll/ܺ᩷ۧ;->ۧ:[B

    return-void
.end method

.method private ᩳ(I)V
    .locals 3

    .line 218
    iget v0, p0, Ll/ܺ᩷ۧ;->ᩳ:I

    add-int/2addr v0, p1

    .line 219
    iget-object p1, p0, Ll/ܺ᩷ۧ;->ۧ:[B

    array-length v1, p1

    if-le v0, v1, :cond_0

    .line 220
    array-length p1, p1

    mul-int/lit8 p1, p1, 0x2

    const/high16 v1, 0x10000

    add-int/2addr v1, v0

    const/high16 v2, 0x80000

    add-int/2addr v0, v2

    .line 221
    invoke-static {p1, v1, v0}, Ll/ۘ֨֫;->֫(III)I

    move-result p1

    .line 225
    iget-object v0, p0, Ll/ܺ᩷ۧ;->ۧ:[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Ll/ܺ᩷ۧ;->ۧ:[B

    :cond_0
    return-void
.end method


# virtual methods
.method public final getLength()J
    .locals 2

    .line 198
    iget-wide v0, p0, Ll/ܺ᩷ۧ;->᩻:J

    return-wide v0
.end method

.method public final getPosition()J
    .locals 2

    .line 193
    iget-wide v0, p0, Ll/ܺ᩷ۧ;->ܿ:J

    return-wide v0
.end method

.method public final read([BII)I
    .locals 8

    .line 250
    iget v0, p0, Ll/ܺ᩷ۧ;->ܽ:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    .line 253
    :cond_0
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 254
    iget-object v2, p0, Ll/ܺ᩷ۧ;->ۧ:[B

    invoke-static {v2, v1, p1, p2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 255
    invoke-direct {p0, v0}, Ll/ܺ᩷ۧ;->ܿ(I)V

    move v1, v0

    :goto_0
    if-nez v1, :cond_1

    const/4 v7, 0x0

    const/4 v3, 0x1

    move-object v2, p0

    move v4, p2

    move-object v5, p1

    move v6, p3

    .line 70
    invoke-direct/range {v2 .. v7}, Ll/ܺ᩷ۧ;->֫(ZI[BII)I

    move-result v1

    :cond_1
    const/4 p1, -0x1

    if-eq v1, p1, :cond_2

    .line 315
    iget-wide p1, p0, Ll/ܺ᩷ۧ;->ܿ:J

    int-to-long v2, v1

    add-long/2addr p1, v2

    iput-wide p1, p0, Ll/ܺ᩷ۧ;->ܿ:J

    :cond_2
    return v1
.end method

.method public final readFully([BII)V
    .locals 1

    const/4 v0, 0x0

    .line 90
    invoke-virtual {p0, v0, p2, p3, p1}, Ll/ܺ᩷ۧ;->֫(ZII[B)Z

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    const/4 v0, 0x0

    .line 178
    invoke-virtual {p0, p1, v0}, Ll/ܺ᩷ۧ;->ۧ(IZ)Z

    return-void
.end method

.method public final ֫(II[B)V
    .locals 1

    const/4 v0, 0x0

    .line 157
    invoke-virtual {p0, v0, p1, p2, p3}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    return-void
.end method

.method public final ֫(IZ)Z
    .locals 7

    .line 236
    iget v0, p0, Ll/ܺ᩷ۧ;->ܽ:I

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 237
    invoke-direct {p0, v0}, Ll/ܺ᩷ۧ;->ܿ(I)V

    move v6, v0

    :goto_0
    const/4 v0, -0x1

    if-ge v6, p1, :cond_0

    if-eq v6, v0, :cond_0

    .line 107
    iget-object v4, p0, Ll/ܺ᩷ۧ;->ܳ:[B

    array-length v0, v4

    add-int/2addr v0, v6

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result v5

    neg-int v3, v6

    move-object v1, p0

    move v2, p2

    .line 109
    invoke-direct/range {v1 .. v6}, Ll/ܺ᩷ۧ;->֫(ZI[BII)I

    move-result v6

    goto :goto_0

    :cond_0
    if-eq v6, v0, :cond_1

    .line 315
    iget-wide p1, p0, Ll/ܺ᩷ۧ;->ܿ:J

    int-to-long v1, v6

    add-long/2addr p1, v1

    iput-wide p1, p0, Ll/ܺ᩷ۧ;->ܿ:J

    :cond_1
    if-eq v6, v0, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(ZII[B)Z
    .locals 8

    .line 250
    iget v0, p0, Ll/ܺ᩷ۧ;->ܽ:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 253
    :cond_0
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 254
    iget-object v2, p0, Ll/ܺ᩷ۧ;->ۧ:[B

    invoke-static {v2, v1, p4, p2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 255
    invoke-direct {p0, v0}, Ll/ܺ᩷ۧ;->ܿ(I)V

    :goto_0
    move v7, v0

    :goto_1
    const/4 v0, -0x1

    if-ge v7, p3, :cond_1

    if-eq v7, v0, :cond_1

    move-object v2, p0

    move v3, p1

    move v4, p2

    move-object v5, p4

    move v6, p3

    .line 82
    invoke-direct/range {v2 .. v7}, Ll/ܺ᩷ۧ;->֫(ZI[BII)I

    move-result v7

    goto :goto_1

    :cond_1
    if-eq v7, v0, :cond_2

    .line 315
    iget-wide p1, p0, Ll/ܺ᩷ۧ;->ܿ:J

    int-to-long p3, v7

    add-long/2addr p1, p3

    iput-wide p1, p0, Ll/ܺ᩷ۧ;->ܿ:J

    :cond_2
    if-eq v7, v0, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    return v1
.end method

.method public final ۧ(I)I
    .locals 7

    .line 236
    iget v0, p0, Ll/ܺ᩷ۧ;->ܽ:I

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 237
    invoke-direct {p0, v0}, Ll/ܺ᩷ۧ;->ܿ(I)V

    if-nez v0, :cond_0

    .line 97
    iget-object v4, p0, Ll/ܺ᩷ۧ;->ܳ:[B

    array-length v0, v4

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result v5

    const/4 v6, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Ll/ܺ᩷ۧ;->֫(ZI[BII)I

    move-result v0

    :cond_0
    const/4 p1, -0x1

    if-eq v0, p1, :cond_1

    .line 315
    iget-wide v1, p0, Ll/ܺ᩷ۧ;->ܿ:J

    int-to-long v3, v0

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/ܺ᩷ۧ;->ܿ:J

    :cond_1
    return v0
.end method

.method public final ۧ(II[B)I
    .locals 7

    .line 122
    invoke-direct {p0, p2}, Ll/ܺ᩷ۧ;->ᩳ(I)V

    .line 123
    iget v0, p0, Ll/ܺ᩷ۧ;->ܽ:I

    iget v3, p0, Ll/ܺ᩷ۧ;->ᩳ:I

    sub-int/2addr v0, v3

    if-nez v0, :cond_1

    .line 126
    iget-object v4, p0, Ll/ܺ᩷ۧ;->ۧ:[B

    const/4 v6, 0x0

    const/4 v2, 0x1

    move-object v1, p0

    move v5, p2

    .line 127
    invoke-direct/range {v1 .. v6}, Ll/ܺ᩷ۧ;->֫(ZI[BII)I

    move-result p2

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    return v0

    .line 136
    :cond_0
    iget v0, p0, Ll/ܺ᩷ۧ;->ܽ:I

    add-int/2addr v0, p2

    iput v0, p0, Ll/ܺ᩷ۧ;->ܽ:I

    goto :goto_0

    .line 138
    :cond_1
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 140
    :goto_0
    iget-object v0, p0, Ll/ܺ᩷ۧ;->ۧ:[B

    iget v1, p0, Ll/ܺ᩷ۧ;->ᩳ:I

    invoke-static {v0, v1, p3, p1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 141
    iget p1, p0, Ll/ܺ᩷ۧ;->ᩳ:I

    add-int/2addr p1, p2

    iput p1, p0, Ll/ܺ᩷ۧ;->ᩳ:I

    return p2
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x0

    .line 183
    iput v0, p0, Ll/ܺ᩷ۧ;->ᩳ:I

    return-void
.end method

.method public final ۧ(IZ)Z
    .locals 7

    .line 162
    invoke-direct {p0, p1}, Ll/ܺ᩷ۧ;->ᩳ(I)V

    .line 163
    iget v0, p0, Ll/ܺ᩷ۧ;->ܽ:I

    iget v1, p0, Ll/ܺ᩷ۧ;->ᩳ:I

    sub-int/2addr v0, v1

    move v6, v0

    :goto_0
    if-ge v6, p1, :cond_1

    .line 165
    iget-object v4, p0, Ll/ܺ᩷ۧ;->ۧ:[B

    iget v3, p0, Ll/ܺ᩷ۧ;->ᩳ:I

    move-object v1, p0

    move v2, p2

    move v5, p1

    .line 166
    invoke-direct/range {v1 .. v6}, Ll/ܺ᩷ۧ;->֫(ZI[BII)I

    move-result v6

    const/4 v0, -0x1

    if-ne v6, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 170
    :cond_0
    iget v0, p0, Ll/ܺ᩷ۧ;->ᩳ:I

    add-int/2addr v0, v6

    iput v0, p0, Ll/ܺ᩷ۧ;->ܽ:I

    goto :goto_0

    .line 172
    :cond_1
    iget p2, p0, Ll/ܺ᩷ۧ;->ᩳ:I

    add-int/2addr p2, p1

    iput p2, p0, Ll/ܺ᩷ۧ;->ᩳ:I

    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ(ZII[B)Z
    .locals 1

    .line 148
    invoke-virtual {p0, p3, p1}, Ll/ܺ᩷ۧ;->ۧ(IZ)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 151
    :cond_0
    iget-object p1, p0, Ll/ܺ᩷ۧ;->ۧ:[B

    iget v0, p0, Ll/ܺ᩷ۧ;->ᩳ:I

    sub-int/2addr v0, p3

    invoke-static {p1, v0, p4, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ܽ()J
    .locals 4

    .line 188
    iget-wide v0, p0, Ll/ܺ᩷ۧ;->ܿ:J

    iget v2, p0, Ll/ܺ᩷ۧ;->ᩳ:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final ܽ(I)V
    .locals 1

    const/4 v0, 0x0

    .line 117
    invoke-virtual {p0, p1, v0}, Ll/ܺ᩷ۧ;->֫(IZ)Z

    return-void
.end method
