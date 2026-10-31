.class public final Ll/֫᩸ۜ;
.super Ljava/lang/Object;
.source "B749"

# interfaces
.implements Ll/ۢᩴ֫;


# instance fields
.field public final ֫:Ll/ܰܶۜ;

.field public final ۧ:[B

.field public final ܳ:Ll/ۢᩴ֫;

.field public ܽ:I

.field public final ܿ:J

.field public final ᩳ:I

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/ۢᩴ֫;[BIJLl/ܰܶۜ;)V
    .locals 0

    .line 456
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 457
    iput-object p1, p0, Ll/֫᩸ۜ;->ܳ:Ll/ۢᩴ֫;

    .line 458
    iput-object p2, p0, Ll/֫᩸ۜ;->ۧ:[B

    .line 459
    iput p3, p0, Ll/֫᩸ۜ;->ᩳ:I

    .line 460
    iput-wide p4, p0, Ll/֫᩸ۜ;->ܿ:J

    .line 461
    iput-object p6, p0, Ll/֫᩸ۜ;->֫:Ll/ܰܶۜ;

    return-void
.end method


# virtual methods
.method public final read([BII)I
    .locals 7

    .line 466
    iget-object v0, p0, Ll/֫᩸ۜ;->֫:Ll/ܰܶۜ;

    invoke-virtual {v0}, Ll/ܰܶۜ;->֫()V

    const/4 v1, 0x0

    if-nez p3, :cond_0

    goto :goto_1

    .line 470
    :cond_0
    iget v2, p0, Ll/֫᩸ۜ;->ܽ:I

    iget-wide v3, p0, Ll/֫᩸ۜ;->ܿ:J

    iget v5, p0, Ll/֫᩸ۜ;->ᩳ:I

    const/4 v6, -0x1

    if-ne v2, v5, :cond_2

    int-to-long p1, v2

    cmp-long p3, p1, v3

    if-ltz p3, :cond_1

    goto :goto_0

    .line 472
    :cond_1
    new-instance p1, Ll/ܽ᩸ۜ;

    const-string p2, "MPEG-TS preview scan budget was exhausted: "

    .line 0
    invoke-static {v5, p2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 438
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 472
    throw p1

    :cond_2
    sub-int/2addr v5, v2

    .line 476
    invoke-static {p3, v5}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 477
    iget-object v2, p0, Ll/֫᩸ۜ;->ܳ:Ll/ۢᩴ֫;

    invoke-interface {v2, p1, p2, p3}, Ll/ۢᩴ֫;->read([BII)I

    move-result v2

    if-ne v2, v6, :cond_4

    .line 479
    iget p1, p0, Ll/֫᩸ۜ;->ܽ:I

    int-to-long p1, p1

    cmp-long p3, p1, v3

    if-ltz p3, :cond_3

    :goto_0
    return v6

    .line 480
    :cond_3
    new-instance p1, Ljava/io/EOFException;

    const-string p2, "MPEG-TS preview source ended before declared length"

    invoke-direct {p1, p2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    if-ltz v2, :cond_7

    if-gt v2, p3, :cond_7

    if-nez v2, :cond_6

    .line 488
    iget p1, p0, Ll/֫᩸ۜ;->᩻:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/֫᩸ۜ;->᩻:I

    const/16 p2, 0x10

    if-ge p1, p2, :cond_5

    :goto_1
    return v1

    .line 489
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string p2, "MPEG-TS data source returned too many zero-byte reads"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 493
    :cond_6
    iput v1, p0, Ll/֫᩸ۜ;->᩻:I

    .line 494
    iget-object p3, p0, Ll/֫᩸ۜ;->ۧ:[B

    iget v1, p0, Ll/֫᩸ۜ;->ܽ:I

    invoke-static {p1, p2, p3, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 495
    iget p1, p0, Ll/֫᩸ۜ;->ܽ:I

    add-int/2addr p1, v2

    iput p1, p0, Ll/֫᩸ۜ;->ܽ:I

    .line 496
    invoke-virtual {v0}, Ll/ܰܶۜ;->֫()V

    return v2

    .line 485
    :cond_7
    new-instance p1, Ljava/io/IOException;

    const-string p2, "MPEG-TS data source returned an invalid read result"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܳ()I
    .locals 1

    .line 501
    iget v0, p0, Ll/֫᩸ۜ;->ܽ:I

    return v0
.end method
