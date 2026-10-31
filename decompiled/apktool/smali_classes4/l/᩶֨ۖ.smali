.class public abstract Ll/᩶֨ۖ;
.super Ljava/lang/Object;
.source "Y3NK"


# direct methods
.method public static ۧ(Ljava/nio/ByteBuffer;II)Ljava/lang/String;
    .locals 9

    or-int v0, p1, p2

    .line 624
    invoke-virtual {p0}, Ljava/nio/Buffer;->limit()I

    move-result v1

    sub-int/2addr v1, p1

    sub-int/2addr v1, p2

    or-int/2addr v0, v1

    const/4 v1, 0x0

    if-ltz v0, :cond_9

    add-int v0, p1, p2

    .line 634
    new-array p2, p2, [C

    const/4 v2, 0x0

    :goto_0
    if-ge p1, v0, :cond_0

    .line 640
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v3

    if-ltz v3, :cond_0

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 v4, v2, 0x1

    int-to-char v3, v3

    .line 1861
    aput-char v3, p2, v2

    move v2, v4

    goto :goto_0

    :cond_0
    move v8, v2

    :cond_1
    :goto_1
    if-ge p1, v0, :cond_8

    add-int/lit8 v2, p1, 0x1

    .line 649
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v3

    if-ltz v3, :cond_2

    add-int/lit8 p1, v8, 0x1

    int-to-char v3, v3

    .line 1861
    aput-char v3, p2, v8

    move v8, p1

    move p1, v2

    :goto_2
    if-ge p1, v0, :cond_1

    .line 655
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    if-ltz v2, :cond_1

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 v3, v8, 0x1

    int-to-char v2, v2

    .line 1861
    aput-char v2, p2, v8

    move v8, v3

    goto :goto_2

    :cond_2
    const/16 v4, -0x20

    if-ge v3, v4, :cond_4

    if-ge v2, v0, :cond_3

    add-int/lit8 p1, p1, 0x2

    .line 667
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    add-int/lit8 v4, v8, 0x1

    .line 666
    invoke-static {v3, v2, p2, v8}, Ll/᩹֨ۖ;->֫(BB[CI)V

    move v8, v4

    goto :goto_1

    .line 664
    :cond_3
    invoke-static {}, Ll/֫᩵ۖ;->ᩳ()Ll/֫᩵ۖ;

    move-result-object p0

    throw p0

    :cond_4
    const/16 v4, -0x10

    if-ge v3, v4, :cond_6

    add-int/lit8 v4, v0, -0x1

    if-ge v2, v4, :cond_5

    add-int/lit8 v4, p1, 0x2

    .line 674
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    add-int/lit8 p1, p1, 0x3

    .line 675
    invoke-virtual {p0, v4}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v4

    add-int/lit8 v5, v8, 0x1

    .line 672
    invoke-static {v3, v2, v4, p2, v8}, Ll/᩹֨ۖ;->֫(BBB[CI)V

    move v8, v5

    goto :goto_1

    .line 670
    :cond_5
    invoke-static {}, Ll/֫᩵ۖ;->ᩳ()Ll/֫᩵ۖ;

    move-result-object p0

    throw p0

    :cond_6
    add-int/lit8 v4, v0, -0x2

    if-ge v2, v4, :cond_7

    add-int/lit8 v4, p1, 0x2

    .line 684
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    add-int/lit8 v2, p1, 0x3

    .line 685
    invoke-virtual {p0, v4}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v4

    add-int/lit8 p1, p1, 0x4

    .line 686
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v6

    move v2, v3

    move v3, v5

    move v5, v6

    move-object v6, p2

    move v7, v8

    .line 682
    invoke-static/range {v2 .. v7}, Ll/᩹֨ۖ;->֫(BBBB[CI)V

    add-int/lit8 v8, v8, 0x2

    goto :goto_1

    .line 680
    :cond_7
    invoke-static {}, Ll/֫᩵ۖ;->ᩳ()Ll/֫᩵ۖ;

    move-result-object p0

    throw p0

    .line 694
    :cond_8
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, p2, v1, v8}, Ljava/lang/String;-><init>([CII)V

    return-object p0

    .line 625
    :cond_9
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 626
    invoke-virtual {p0}, Ljava/nio/Buffer;->limit()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p0, v2, v1

    const/4 p0, 0x1

    aput-object p1, v2, p0

    const/4 p0, 0x2

    aput-object p2, v2, p0

    const-string p0, "buffer limit=%d, index=%d, limit=%d"

    invoke-static {p0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public abstract ֫(IILjava/lang/String;[B)I
.end method

.method public abstract ֫(I[BII)I
.end method

.method public abstract ֫(II[B)Ljava/lang/String;
.end method

.method public abstract ֫(Ljava/nio/ByteBuffer;II)Ljava/lang/String;
.end method
