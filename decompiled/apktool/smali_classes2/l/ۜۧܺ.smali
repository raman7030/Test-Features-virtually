.class public final Ll/ۜۧܺ;
.super Ljava/io/Writer;
.source "3AVF"


# static fields
.field public static final ۗ:[C

.field public static final ۙ:[C

.field public static final ۛ:[C

.field public static final ۤ:[C

.field public static final ۨ:[I

.field public static final ۫:Ljava/lang/ThreadLocal;

.field public static final ۬:[C

.field public static final ܰ:[B

.field public static final ᩺:[B


# instance fields
.field public ᩶:I

.field public ᩸:[C

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 18

    .line 40
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Ll/ۜۧܺ;->۫:Ljava/lang/ThreadLocal;

    const/16 v0, 0xa

    new-array v1, v0, [I

    .line 984
    fill-array-data v1, :array_0

    sput-object v1, Ll/ۜۧܺ;->ۨ:[I

    const/16 v1, 0x24

    new-array v1, v1, [C

    .line 1036
    fill-array-data v1, :array_1

    sput-object v1, Ll/ۜۧܺ;->ۤ:[C

    const/16 v1, 0x64

    new-array v2, v1, [C

    .line 1039
    fill-array-data v2, :array_2

    sput-object v2, Ll/ۜۧܺ;->۬:[C

    new-array v1, v1, [C

    .line 1045
    fill-array-data v1, :array_3

    sput-object v1, Ll/ۜۧܺ;->ۗ:[C

    const/16 v1, 0xa1

    new-array v2, v1, [B

    .line 1059
    sput-object v2, Ll/ۜۧܺ;->᩺:[B

    new-array v1, v1, [B

    .line 1060
    sput-object v1, Ll/ۜۧܺ;->ܰ:[B

    const/16 v3, 0x5d

    new-array v3, v3, [C

    .line 1062
    sput-object v3, Ll/ۜۧܺ;->ۛ:[C

    const/4 v3, 0x0

    const/4 v4, 0x4

    aput-byte v4, v2, v3

    const/4 v5, 0x1

    aput-byte v4, v2, v5

    const/4 v6, 0x2

    aput-byte v4, v2, v6

    const/4 v7, 0x3

    aput-byte v4, v2, v7

    aput-byte v4, v2, v4

    const/4 v8, 0x5

    aput-byte v4, v2, v8

    const/4 v9, 0x6

    aput-byte v4, v2, v9

    const/4 v10, 0x7

    aput-byte v4, v2, v10

    const/16 v11, 0x8

    aput-byte v5, v2, v11

    const/16 v12, 0x9

    aput-byte v5, v2, v12

    aput-byte v5, v2, v0

    const/16 v13, 0xb

    aput-byte v4, v2, v13

    const/16 v14, 0xc

    aput-byte v5, v2, v14

    const/16 v15, 0xd

    aput-byte v5, v2, v15

    const/16 v16, 0x22

    aput-byte v5, v2, v16

    const/16 v17, 0x5c

    aput-byte v5, v2, v17

    aput-byte v4, v1, v3

    aput-byte v4, v1, v5

    aput-byte v4, v1, v6

    aput-byte v4, v1, v7

    aput-byte v4, v1, v4

    aput-byte v4, v1, v8

    aput-byte v4, v1, v9

    aput-byte v4, v1, v10

    aput-byte v5, v1, v11

    aput-byte v5, v1, v12

    aput-byte v5, v1, v0

    aput-byte v4, v1, v13

    aput-byte v5, v1, v14

    aput-byte v5, v1, v15

    aput-byte v5, v1, v17

    const/16 v0, 0x27

    aput-byte v5, v1, v0

    const/16 v1, 0xe

    const/16 v2, 0xa

    :goto_0
    const/16 v0, 0x1f

    if-gt v1, v0, :cond_0

    .line 1099
    sget-object v0, Ll/ۜۧܺ;->᩺:[B

    aput-byte v4, v0, v1

    .line 1100
    sget-object v0, Ll/ۜۧܺ;->ܰ:[B

    aput-byte v4, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/16 v0, 0x7f

    :goto_1
    const/16 v1, 0xa0

    if-ge v0, v1, :cond_1

    .line 1104
    sget-object v1, Ll/ۜۧܺ;->᩺:[B

    aput-byte v4, v1, v0

    .line 1105
    sget-object v1, Ll/ۜۧܺ;->ܰ:[B

    aput-byte v4, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 1108
    :cond_1
    sget-object v0, Ll/ۜۧܺ;->ۛ:[C

    const/16 v1, 0x30

    aput-char v1, v0, v3

    const/16 v1, 0x31

    .line 1109
    aput-char v1, v0, v5

    const/16 v1, 0x32

    .line 1110
    aput-char v1, v0, v6

    const/16 v1, 0x33

    .line 1111
    aput-char v1, v0, v7

    const/16 v1, 0x34

    .line 1112
    aput-char v1, v0, v4

    const/16 v1, 0x35

    .line 1113
    aput-char v1, v0, v8

    const/16 v1, 0x36

    .line 1114
    aput-char v1, v0, v9

    const/16 v1, 0x37

    .line 1115
    aput-char v1, v0, v10

    const/16 v1, 0x62

    .line 1116
    aput-char v1, v0, v11

    const/16 v1, 0x74

    .line 1117
    aput-char v1, v0, v12

    const/16 v1, 0x6e

    .line 1118
    aput-char v1, v0, v2

    const/16 v1, 0x76

    .line 1119
    aput-char v1, v0, v13

    const/16 v1, 0x66

    .line 1120
    aput-char v1, v0, v14

    const/16 v1, 0x72

    .line 1121
    aput-char v1, v0, v15

    .line 1122
    aput-char v16, v0, v16

    const/16 v1, 0x27

    .line 1123
    aput-char v1, v0, v1

    const/16 v1, 0x2f

    .line 1124
    aput-char v1, v0, v1

    .line 1125
    aput-char v17, v0, v17

    const/16 v0, 0x10

    new-array v0, v0, [C

    .line 1128
    fill-array-data v0, :array_4

    sput-object v0, Ll/ۜۧܺ;->ۙ:[C

    return-void

    nop

    :array_0
    .array-data 4
        0x9
        0x63
        0x3e7
        0x270f
        0x1869f
        0xf423f
        0x98967f
        0x5f5e0ff
        0x3b9ac9ff
        0x7fffffff
    .end array-data

    :array_1
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
        0x67s
        0x68s
        0x69s
        0x6as
        0x6bs
        0x6cs
        0x6ds
        0x6es
        0x6fs
        0x70s
        0x71s
        0x72s
        0x73s
        0x74s
        0x75s
        0x76s
        0x77s
        0x78s
        0x79s
        0x7as
    .end array-data

    :array_2
    .array-data 2
        0x30s
        0x30s
        0x30s
        0x30s
        0x30s
        0x30s
        0x30s
        0x30s
        0x30s
        0x30s
        0x31s
        0x31s
        0x31s
        0x31s
        0x31s
        0x31s
        0x31s
        0x31s
        0x31s
        0x31s
        0x32s
        0x32s
        0x32s
        0x32s
        0x32s
        0x32s
        0x32s
        0x32s
        0x32s
        0x32s
        0x33s
        0x33s
        0x33s
        0x33s
        0x33s
        0x33s
        0x33s
        0x33s
        0x33s
        0x33s
        0x34s
        0x34s
        0x34s
        0x34s
        0x34s
        0x34s
        0x34s
        0x34s
        0x34s
        0x34s
        0x35s
        0x35s
        0x35s
        0x35s
        0x35s
        0x35s
        0x35s
        0x35s
        0x35s
        0x35s
        0x36s
        0x36s
        0x36s
        0x36s
        0x36s
        0x36s
        0x36s
        0x36s
        0x36s
        0x36s
        0x37s
        0x37s
        0x37s
        0x37s
        0x37s
        0x37s
        0x37s
        0x37s
        0x37s
        0x37s
        0x38s
        0x38s
        0x38s
        0x38s
        0x38s
        0x38s
        0x38s
        0x38s
        0x38s
        0x38s
        0x39s
        0x39s
        0x39s
        0x39s
        0x39s
        0x39s
        0x39s
        0x39s
        0x39s
        0x39s
    .end array-data

    :array_3
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
    .end array-data

    :array_4
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method public constructor <init>(I[Ll/᩷ۧܺ;)V
    .locals 3

    .line 69
    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    .line 72
    sget-object v0, Ll/ۜۧܺ;->۫:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [C

    iput-object v1, p0, Ll/ۜۧܺ;->᩸:[C

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 77
    :cond_0
    iget-object v0, p0, Ll/ۜۧܺ;->᩸:[C

    if-nez v0, :cond_1

    const/16 v0, 0x400

    new-array v0, v0, [C

    .line 78
    iput-object v0, p0, Ll/ۜۧܺ;->᩸:[C

    .line 81
    :cond_1
    array-length v0, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v2, p2, v1

    .line 82
    iget v2, v2, Ll/᩷ۧܺ;->᩸:I

    or-int/2addr p1, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 84
    :cond_2
    iput p1, p0, Ll/ۜۧܺ;->᩶:I

    return-void
.end method

.method public static ֫(JI[C)V
    .locals 9

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-gez v2, :cond_0

    neg-long p0, p0

    const/16 v0, 0x2d

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-wide/32 v1, 0x7fffffff

    .line 998
    sget-object v3, Ll/ۜۧܺ;->۬:[C

    sget-object v4, Ll/ۜۧܺ;->ۗ:[C

    cmp-long v5, p0, v1

    if-lez v5, :cond_1

    const-wide/16 v1, 0x64

    .line 999
    div-long v1, p0, v1

    const/4 v5, 0x6

    shl-long v5, v1, v5

    const/4 v7, 0x5

    shl-long v7, v1, v7

    add-long/2addr v5, v7

    const/4 v7, 0x2

    shl-long v7, v1, v7

    add-long/2addr v5, v7

    sub-long/2addr p0, v5

    long-to-int p1, p0

    add-int/lit8 p0, p2, -0x1

    .line 1003
    aget-char v4, v4, p1

    aput-char v4, p3, p0

    add-int/lit8 p2, p2, -0x2

    .line 1004
    aget-char p0, v3, p1

    aput-char p0, p3, p2

    move-wide p0, v1

    goto :goto_0

    :cond_1
    long-to-int p1, p0

    :goto_1
    const/high16 p0, 0x10000

    if-lt p1, p0, :cond_2

    .line 1011
    div-int/lit8 p0, p1, 0x64

    shl-int/lit8 v1, p0, 0x6

    shl-int/lit8 v2, p0, 0x5

    add-int/2addr v1, v2

    shl-int/lit8 v2, p0, 0x2

    add-int/2addr v1, v2

    sub-int/2addr p1, v1

    add-int/lit8 v1, p2, -0x1

    .line 1015
    aget-char v2, v4, p1

    aput-char v2, p3, v1

    add-int/lit8 p2, p2, -0x2

    .line 1016
    aget-char p1, v3, p1

    aput-char p1, p3, p2

    move p1, p0

    goto :goto_1

    :cond_2
    :goto_2
    const p0, 0xcccd

    mul-int p0, p0, p1

    ushr-int/lit8 p0, p0, 0x13

    shl-int/lit8 v1, p0, 0x3

    shl-int/lit8 v2, p0, 0x1

    add-int/2addr v1, v2

    sub-int/2addr p1, v1

    add-int/lit8 v1, p2, -0x1

    .line 1024
    sget-object v2, Ll/ۜۧܺ;->ۤ:[C

    aget-char p1, v2, p1

    aput-char p1, p3, v1

    if-nez p0, :cond_4

    if-eqz v0, :cond_3

    add-int/lit8 p2, p2, -0x2

    .line 1029
    aput-char v0, p3, p2

    :cond_3
    return-void

    :cond_4
    move p1, p0

    move p2, v1

    goto :goto_2
.end method


# virtual methods
.method public final append(C)Ljava/io/Writer;
    .locals 0

    .line 244
    invoke-virtual {p0, p1}, Ll/ۜۧܺ;->write(I)V

    return-object p0
.end method

.method public final bridge synthetic append(Ljava/lang/CharSequence;)Ljava/io/Writer;
    .locals 0

    .line 31
    invoke-virtual {p0, p1}, Ll/ۜۧܺ;->append(Ljava/lang/CharSequence;)V

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;II)Ljava/io/Writer;
    .locals 0

    if-nez p1, :cond_0

    const-string p1, "null"

    .line 238
    :cond_0
    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    .line 239
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Ll/ۜۧܺ;->write(Ljava/lang/String;II)V

    return-object p0
.end method

.method public final append(C)Ljava/lang/Appendable;
    .locals 0

    .line 244
    invoke-virtual {p0, p1}, Ll/ۜۧܺ;->write(I)V

    return-object p0
.end method

.method public final bridge synthetic append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    .locals 0

    .line 31
    invoke-virtual {p0, p1}, Ll/ۜۧܺ;->append(Ljava/lang/CharSequence;)V

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
    .locals 0

    if-nez p1, :cond_0

    const-string p1, "null"

    .line 238
    :cond_0
    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    .line 239
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Ll/ۜۧܺ;->write(Ljava/lang/String;II)V

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;)V
    .locals 2

    if-nez p1, :cond_0

    const-string p1, "null"

    goto :goto_0

    .line 232
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    const/4 v0, 0x0

    .line 233
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Ll/ۜۧܺ;->write(Ljava/lang/String;II)V

    return-void
.end method

.method public final close()V
    .locals 3

    .line 276
    iget-object v0, p0, Ll/ۜۧܺ;->᩸:[C

    array-length v1, v0

    const/16 v2, 0x2000

    if-gt v1, v2, :cond_0

    .line 277
    sget-object v1, Ll/ۜۧܺ;->۫:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_0
    const/4 v0, 0x0

    .line 280
    iput-object v0, p0, Ll/ۜۧܺ;->᩸:[C

    return-void
.end method

.method public final flush()V
    .locals 0

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 265
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Ll/ۜۧܺ;->᩸:[C

    const/4 v2, 0x0

    iget v3, p0, Ll/ۜۧܺ;->᩹:I

    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    return-object v0
.end method

.method public final write(I)V
    .locals 3

    .line 116
    iget v0, p0, Ll/ۜۧܺ;->᩹:I

    add-int/lit8 v0, v0, 0x1

    .line 117
    iget-object v1, p0, Ll/ۜۧܺ;->᩸:[C

    array-length v1, v1

    if-le v0, v1, :cond_0

    .line 119
    invoke-virtual {p0, v0}, Ll/ۜۧܺ;->ۧ(I)V

    .line 125
    :cond_0
    iget-object v1, p0, Ll/ۜۧܺ;->᩸:[C

    iget v2, p0, Ll/ۜۧܺ;->᩹:I

    int-to-char p1, p1

    aput-char p1, v1, v2

    .line 126
    iput v0, p0, Ll/ۜۧܺ;->᩹:I

    return-void
.end method

.method public final write(Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    .line 285
    invoke-virtual {p0}, Ll/ۜۧܺ;->֫()V

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 289
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Ll/ۜۧܺ;->write(Ljava/lang/String;II)V

    return-void
.end method

.method public final write(Ljava/lang/String;II)V
    .locals 3

    .line 186
    iget v0, p0, Ll/ۜۧܺ;->᩹:I

    add-int/2addr v0, p3

    .line 187
    iget-object v1, p0, Ll/ۜۧܺ;->᩸:[C

    array-length v1, v1

    if-le v0, v1, :cond_0

    .line 189
    invoke-virtual {p0, v0}, Ll/ۜۧܺ;->ۧ(I)V

    :cond_0
    add-int/2addr p3, p2

    .line 202
    iget-object v1, p0, Ll/ۜۧܺ;->᩸:[C

    iget v2, p0, Ll/ۜۧܺ;->᩹:I

    invoke-virtual {p1, p2, p3, v1, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 203
    iput v0, p0, Ll/ۜۧܺ;->᩹:I

    return-void
.end method

.method public final write([CII)V
    .locals 3

    if-ltz p2, :cond_2

    .line 137
    array-length v0, p1

    if-gt p2, v0, :cond_2

    if-ltz p3, :cond_2

    add-int v0, p2, p3

    array-length v1, p1

    if-gt v0, v1, :cond_2

    if-ltz v0, :cond_2

    if-nez p3, :cond_0

    return-void

    .line 147
    :cond_0
    iget v0, p0, Ll/ۜۧܺ;->᩹:I

    add-int/2addr v0, p3

    .line 148
    iget-object v1, p0, Ll/ۜۧܺ;->᩸:[C

    array-length v1, v1

    if-le v0, v1, :cond_1

    .line 150
    invoke-virtual {p0, v0}, Ll/ۜۧܺ;->ۧ(I)V

    .line 163
    :cond_1
    iget-object v1, p0, Ll/ۜۧܺ;->᩸:[C

    iget v2, p0, Ll/ۜۧܺ;->᩹:I

    invoke-static {p1, p2, v1, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 164
    iput v0, p0, Ll/ۜۧܺ;->᩹:I

    return-void

    .line 142
    :cond_2
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final writeInt(I)V
    .locals 4

    const/high16 v0, -0x80000000

    if-ne p1, v0, :cond_0

    const-string p1, "-2147483648"

    .line 294
    invoke-virtual {p0, p1}, Ll/ۜۧܺ;->write(Ljava/lang/String;)V

    return-void

    :cond_0
    if-gez p1, :cond_1

    neg-int v0, p1

    goto :goto_0

    :cond_1
    move v0, p1

    :goto_0
    const/4 v1, 0x0

    .line 301
    :goto_1
    sget-object v2, Ll/ۜۧܺ;->ۨ:[I

    aget v2, v2, v1

    if-gt v0, v2, :cond_4

    add-int/lit8 v0, v1, 0x1

    if-gez p1, :cond_2

    add-int/lit8 v0, v1, 0x2

    .line 310
    :cond_2
    iget v1, p0, Ll/ۜۧܺ;->᩹:I

    add-int/2addr v1, v0

    .line 311
    iget-object v0, p0, Ll/ۜۧܺ;->᩸:[C

    array-length v0, v0

    if-le v1, v0, :cond_3

    .line 313
    invoke-virtual {p0, v1}, Ll/ۜۧܺ;->ۧ(I)V

    :cond_3
    int-to-long v2, p1

    .line 322
    iget-object p1, p0, Ll/ۜۧܺ;->᩸:[C

    invoke-static {v2, v3, v1, p1}, Ll/ۜۧܺ;->֫(JI[C)V

    .line 324
    iput v1, p0, Ll/ۜۧܺ;->᩹:I

    return-void

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method

.method public final ֫()V
    .locals 1

    const-string v0, "null"

    .line 451
    invoke-virtual {p0, v0}, Ll/ۜۧܺ;->write(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 666
    sget-object v0, Ll/᩷ۧܺ;->֫֫:Ll/᩷ۧܺ;

    iget v0, v0, Ll/᩷ۧܺ;->᩸:I

    iget v1, p0, Ll/ۜۧܺ;->᩶:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    .line 667
    invoke-virtual {p0, p1}, Ll/ۜۧܺ;->ۧ(Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 669
    invoke-virtual {p0, p1, v0, v1}, Ll/ۜۧܺ;->֫(Ljava/lang/String;CZ)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;CZ)V
    .locals 12

    if-nez p1, :cond_1

    .line 456
    invoke-virtual {p0}, Ll/ۜۧܺ;->֫()V

    if-eqz p2, :cond_0

    .line 458
    invoke-virtual {p0, p2}, Ll/ۜۧܺ;->write(I)V

    :cond_0
    return-void

    .line 463
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    .line 464
    iget v1, p0, Ll/ۜۧܺ;->᩹:I

    add-int/2addr v1, v0

    add-int/lit8 v2, v1, 0x2

    if-eqz p2, :cond_2

    add-int/lit8 v2, v1, 0x3

    .line 469
    :cond_2
    iget-object v1, p0, Ll/ۜۧܺ;->᩸:[C

    array-length v1, v1

    if-le v2, v1, :cond_3

    .line 493
    invoke-virtual {p0, v2}, Ll/ۜۧܺ;->ۧ(I)V

    .line 496
    :cond_3
    iget v1, p0, Ll/ۜۧܺ;->᩹:I

    add-int/lit8 v3, v1, 0x1

    add-int v4, v3, v0

    .line 499
    iget-object v5, p0, Ll/ۜۧܺ;->᩸:[C

    const/16 v6, 0x22

    aput-char v6, v5, v1

    const/4 v1, 0x0

    .line 500
    invoke-virtual {p1, v1, v0, v5, v3}, Ljava/lang/String;->getChars(II[CI)V

    .line 502
    iput v2, p0, Ll/ۜۧܺ;->᩹:I

    if-eqz p3, :cond_19

    const/4 p3, -0x1

    const/4 v0, 0x0

    const/4 v5, -0x1

    const/4 v6, -0x1

    move v7, v3

    :goto_0
    const/16 v8, 0x2028

    const/16 v9, 0x2f

    .line 509
    sget-object v10, Ll/ۜۧܺ;->᩺:[B

    if-ge v7, v4, :cond_f

    .line 510
    iget-object v11, p0, Ll/ۜۧܺ;->᩸:[C

    aget-char v11, v11, v7

    if-ne v11, v8, :cond_4

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v2, v2, 0x4

    if-ne v5, p3, :cond_d

    goto :goto_2

    :cond_4
    const/16 v8, 0x5d

    if-lt v11, v8, :cond_6

    const/16 v8, 0x7f

    if-lt v11, v8, :cond_e

    const/16 v8, 0xa0

    if-ge v11, v8, :cond_e

    if-ne v5, p3, :cond_5

    move v5, v7

    :cond_5
    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v2, v2, 0x4

    goto :goto_4

    :cond_6
    const/16 v8, 0x20

    if-ne v11, v8, :cond_7

    goto :goto_5

    :cond_7
    if-ne v11, v9, :cond_8

    .line 542
    sget-object v8, Ll/᩷ۧܺ;->ۡ֫:Ll/᩷ۧܺ;

    iget v8, v8, Ll/᩷ۧܺ;->᩸:I

    iget v9, p0, Ll/ۜۧܺ;->᩶:I

    and-int/2addr v8, v9

    if-eqz v8, :cond_8

    goto :goto_1

    :cond_8
    const/16 v8, 0x23

    if-le v11, v8, :cond_9

    const/16 v8, 0x5c

    if-eq v11, v8, :cond_a

    goto :goto_5

    :cond_9
    const/16 v8, 0x5c

    :cond_a
    const/16 v9, 0x1f

    if-le v11, v9, :cond_b

    if-eq v11, v8, :cond_b

    const/16 v8, 0x22

    if-ne v11, v8, :cond_e

    :cond_b
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 558
    array-length v0, v10

    if-ge v11, v0, :cond_c

    aget-byte v0, v10, v11

    const/4 v6, 0x4

    if-ne v0, v6, :cond_c

    add-int/lit8 v2, v2, 0x4

    :cond_c
    if-ne v5, p3, :cond_d

    :goto_2
    move v5, v7

    move v6, v5

    :goto_3
    move v0, v11

    goto :goto_5

    :cond_d
    :goto_4
    move v6, v7

    goto :goto_3

    :cond_e
    :goto_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_f
    if-lez v1, :cond_19

    add-int/2addr v2, v1

    .line 572
    iget-object p3, p0, Ll/ۜۧܺ;->᩸:[C

    array-length p3, p3

    if-le v2, p3, :cond_10

    .line 573
    invoke-virtual {p0, v2}, Ll/ۜۧܺ;->ۧ(I)V

    .line 575
    :cond_10
    iput v2, p0, Ll/ۜۧܺ;->᩹:I

    .line 577
    sget-object p3, Ll/ۜۧܺ;->ۙ:[C

    sget-object v2, Ll/ۜۧܺ;->ۛ:[C

    const/16 v7, 0x75

    const/4 v11, 0x1

    if-ne v1, v11, :cond_13

    if-ne v0, v8, :cond_11

    add-int/lit8 p1, v6, 0x1

    add-int/lit8 p3, v6, 0x6

    sub-int/2addr v4, v6

    sub-int/2addr v4, v11

    .line 582
    iget-object v0, p0, Ll/ۜۧܺ;->᩸:[C

    invoke-static {v0, p1, v0, p3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 583
    iget-object p3, p0, Ll/ۜۧܺ;->᩸:[C

    const/16 v0, 0x5c

    aput-char v0, p3, v6

    .line 584
    aput-char v7, p3, p1

    add-int/lit8 p1, v6, 0x2

    const/16 v0, 0x32

    .line 585
    aput-char v0, p3, p1

    add-int/lit8 p1, v6, 0x3

    const/16 v1, 0x30

    .line 586
    aput-char v1, p3, p1

    add-int/lit8 p1, v6, 0x4

    .line 587
    aput-char v0, p3, p1

    add-int/lit8 v6, v6, 0x5

    const/16 p1, 0x38

    .line 588
    aput-char p1, p3, v6

    goto/16 :goto_8

    .line 591
    :cond_11
    array-length p1, v10

    if-ge v0, p1, :cond_12

    aget-byte p1, v10, v0

    const/4 v1, 0x4

    if-ne p1, v1, :cond_12

    add-int/lit8 p1, v6, 0x1

    add-int/lit8 v1, v6, 0x6

    sub-int/2addr v4, v6

    add-int/lit8 v4, v4, -0x1

    .line 596
    iget-object v2, p0, Ll/ۜۧܺ;->᩸:[C

    invoke-static {v2, p1, v2, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 599
    iget-object v1, p0, Ll/ۜۧܺ;->᩸:[C

    const/16 v2, 0x5c

    aput-char v2, v1, v6

    add-int/lit8 v2, v6, 0x2

    .line 600
    aput-char v7, v1, p1

    add-int/lit8 p1, v6, 0x3

    ushr-int/lit8 v3, v0, 0xc

    and-int/lit8 v3, v3, 0xf

    .line 601
    aget-char v3, p3, v3

    aput-char v3, v1, v2

    add-int/lit8 v2, v6, 0x4

    ushr-int/lit8 v3, v0, 0x8

    and-int/lit8 v3, v3, 0xf

    .line 602
    aget-char v3, p3, v3

    aput-char v3, v1, p1

    add-int/lit8 v6, v6, 0x5

    ushr-int/lit8 p1, v0, 0x4

    and-int/lit8 p1, p1, 0xf

    .line 603
    aget-char p1, p3, p1

    aput-char p1, v1, v2

    and-int/lit8 p1, v0, 0xf

    .line 604
    aget-char p1, p3, p1

    aput-char p1, v1, v6

    goto/16 :goto_8

    :cond_12
    add-int/lit8 p1, v6, 0x1

    add-int/lit8 p3, v6, 0x2

    sub-int/2addr v4, v6

    add-int/lit8 v4, v4, -0x1

    .line 609
    iget-object v1, p0, Ll/ۜۧܺ;->᩸:[C

    invoke-static {v1, p1, v1, p3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 610
    iget-object p3, p0, Ll/ۜۧܺ;->᩸:[C

    const/16 v1, 0x5c

    aput-char v1, p3, v6

    .line 611
    aget-char v0, v2, v0

    aput-char v0, p3, p1

    goto/16 :goto_8

    :cond_13
    if-le v1, v11, :cond_19

    sub-int v0, v5, v3

    .line 617
    :goto_6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_19

    .line 618
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 620
    array-length v3, v10

    if-ge v1, v3, :cond_14

    aget-byte v3, v10, v1

    if-nez v3, :cond_15

    :cond_14
    if-ne v1, v9, :cond_17

    sget-object v3, Ll/᩷ۧܺ;->ۡ֫:Ll/᩷ۧܺ;

    iget v3, v3, Ll/᩷ۧܺ;->᩸:I

    iget v4, p0, Ll/ۜۧܺ;->᩶:I

    and-int/2addr v3, v4

    if-eqz v3, :cond_17

    .line 623
    :cond_15
    iget-object v3, p0, Ll/ۜۧܺ;->᩸:[C

    add-int/lit8 v4, v5, 0x1

    const/16 v6, 0x5c

    aput-char v6, v3, v5

    .line 624
    aget-byte v6, v10, v1

    const/4 v11, 0x4

    if-ne v6, v11, :cond_16

    add-int/lit8 v6, v5, 0x2

    .line 625
    aput-char v7, v3, v4

    add-int/lit8 v4, v5, 0x3

    ushr-int/lit8 v11, v1, 0xc

    and-int/lit8 v11, v11, 0xf

    .line 626
    aget-char v11, p3, v11

    aput-char v11, v3, v6

    add-int/lit8 v6, v5, 0x4

    ushr-int/lit8 v11, v1, 0x8

    and-int/lit8 v11, v11, 0xf

    .line 627
    aget-char v11, p3, v11

    aput-char v11, v3, v4

    add-int/lit8 v4, v5, 0x5

    ushr-int/lit8 v11, v1, 0x4

    and-int/lit8 v11, v11, 0xf

    .line 628
    aget-char v11, p3, v11

    aput-char v11, v3, v6

    add-int/lit8 v5, v5, 0x6

    and-int/lit8 v1, v1, 0xf

    .line 629
    aget-char v1, p3, v1

    aput-char v1, v3, v4

    goto :goto_7

    :cond_16
    add-int/lit8 v5, v5, 0x2

    .line 632
    aget-char v1, v2, v1

    aput-char v1, v3, v4

    goto :goto_7

    :cond_17
    if-ne v1, v8, :cond_18

    .line 637
    iget-object v3, p0, Ll/ۜۧܺ;->᩸:[C

    add-int/lit8 v4, v5, 0x1

    const/16 v6, 0x5c

    aput-char v6, v3, v5

    add-int/lit8 v6, v5, 0x2

    .line 638
    aput-char v7, v3, v4

    add-int/lit8 v4, v5, 0x3

    ushr-int/lit8 v11, v1, 0xc

    and-int/lit8 v11, v11, 0xf

    .line 639
    aget-char v11, p3, v11

    aput-char v11, v3, v6

    add-int/lit8 v6, v5, 0x4

    ushr-int/lit8 v11, v1, 0x8

    and-int/lit8 v11, v11, 0xf

    .line 640
    aget-char v11, p3, v11

    aput-char v11, v3, v4

    add-int/lit8 v4, v5, 0x5

    ushr-int/lit8 v11, v1, 0x4

    and-int/lit8 v11, v11, 0xf

    .line 641
    aget-char v11, p3, v11

    aput-char v11, v3, v6

    add-int/lit8 v5, v5, 0x6

    and-int/lit8 v1, v1, 0xf

    .line 642
    aget-char v1, p3, v1

    aput-char v1, v3, v4

    goto :goto_7

    .line 645
    :cond_18
    iget-object v3, p0, Ll/ۜۧܺ;->᩸:[C

    add-int/lit8 v4, v5, 0x1

    aput-char v1, v3, v5

    move v5, v4

    :goto_7
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_6

    :cond_19
    :goto_8
    if-eqz p2, :cond_1a

    .line 654
    iget-object p1, p0, Ll/ۜۧܺ;->᩸:[C

    iget p3, p0, Ll/ۜۧܺ;->᩹:I

    add-int/lit8 v0, p3, -0x2

    const/16 v1, 0x22

    aput-char v1, p1, v0

    add-int/lit8 p3, p3, -0x1

    .line 655
    aput-char p2, p1, p3

    return-void

    :cond_1a
    const/16 p1, 0x22

    .line 657
    iget-object p2, p0, Ll/ۜۧܺ;->᩸:[C

    iget p3, p0, Ll/ۜۧܺ;->᩹:I

    add-int/lit8 p3, p3, -0x1

    aput-char p1, p2, p3

    return-void
.end method

.method public final ֫(Ljava/lang/String;Z)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 757
    sget-object v2, Ll/᩷ۧܺ;->֫֫:Ll/᩷ۧܺ;

    iget v2, v2, Ll/᩷ۧܺ;->᩸:I

    iget v3, v0, Ll/ۜۧܺ;->᩶:I

    and-int/2addr v2, v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/16 v6, 0x5c

    sget-object v7, Ll/ۜۧܺ;->ۛ:[C

    const/16 v8, 0x3a

    if-eqz v2, :cond_9

    .line 758
    sget-object v2, Ll/᩷ۧܺ;->ۨ:Ll/᩷ۧܺ;

    iget v2, v2, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    .line 759
    invoke-virtual/range {p0 .. p1}, Ll/ۜۧܺ;->ۧ(Ljava/lang/String;)V

    .line 760
    invoke-virtual {v0, v8}, Ll/ۜۧܺ;->write(I)V

    return-void

    .line 872
    :cond_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v2

    .line 873
    iget v3, v0, Ll/ۜۧܺ;->᩹:I

    add-int/2addr v3, v2

    add-int/2addr v3, v4

    .line 874
    iget-object v9, v0, Ll/ۜۧܺ;->᩸:[C

    array-length v9, v9

    if-le v3, v9, :cond_1

    .line 911
    invoke-virtual {v0, v3}, Ll/ۜۧܺ;->ۧ(I)V

    :cond_1
    const/16 v9, 0x27

    if-nez v2, :cond_3

    .line 915
    iget v1, v0, Ll/ۜۧܺ;->᩹:I

    add-int/lit8 v1, v1, 0x3

    .line 916
    iget-object v2, v0, Ll/ۜۧܺ;->᩸:[C

    array-length v2, v2

    if-le v1, v2, :cond_2

    .line 917
    invoke-virtual {v0, v1}, Ll/ۜۧܺ;->ۧ(I)V

    .line 919
    :cond_2
    iget-object v1, v0, Ll/ۜۧܺ;->᩸:[C

    iget v2, v0, Ll/ۜۧܺ;->᩹:I

    add-int/lit8 v3, v2, 0x1

    iput v3, v0, Ll/ۜۧܺ;->᩹:I

    aput-char v9, v1, v2

    add-int/lit8 v4, v2, 0x2

    .line 920
    iput v4, v0, Ll/ۜۧܺ;->᩹:I

    aput-char v9, v1, v3

    add-int/lit8 v2, v2, 0x3

    .line 921
    iput v2, v0, Ll/ۜۧܺ;->᩹:I

    aput-char v8, v1, v4

    return-void

    .line 925
    :cond_3
    iget v10, v0, Ll/ۜۧܺ;->᩹:I

    add-int v11, v10, v2

    .line 928
    iget-object v12, v0, Ll/ۜۧܺ;->᩸:[C

    invoke-virtual {v1, v5, v2, v12, v10}, Ljava/lang/String;->getChars(II[CI)V

    .line 929
    iput v3, v0, Ll/ۜۧܺ;->᩹:I

    const/4 v1, 0x0

    move v2, v10

    :goto_0
    if-ge v2, v11, :cond_8

    .line 934
    iget-object v12, v0, Ll/ۜۧܺ;->᩸:[C

    aget-char v13, v12, v2

    .line 935
    sget-object v14, Ll/ۜۧܺ;->ܰ:[B

    array-length v15, v14

    if-ge v13, v15, :cond_7

    aget-byte v14, v14, v13

    if-eqz v14, :cond_7

    if-nez v1, :cond_5

    add-int/lit8 v3, v3, 0x3

    .line 938
    array-length v1, v12

    if-le v3, v1, :cond_4

    .line 939
    invoke-virtual {v0, v3}, Ll/ۜۧܺ;->ۧ(I)V

    .line 941
    :cond_4
    iput v3, v0, Ll/ۜۧܺ;->᩹:I

    .line 943
    iget-object v1, v0, Ll/ۜۧܺ;->᩸:[C

    add-int/lit8 v12, v2, 0x1

    add-int/lit8 v14, v2, 0x3

    sub-int v15, v11, v2

    sub-int/2addr v15, v4

    invoke-static {v1, v12, v1, v14, v15}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 944
    iget-object v1, v0, Ll/ۜۧܺ;->᩸:[C

    invoke-static {v1, v5, v1, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 945
    iget-object v1, v0, Ll/ۜۧܺ;->᩸:[C

    aput-char v9, v1, v10

    .line 946
    aput-char v6, v1, v12

    add-int/lit8 v2, v2, 0x2

    .line 947
    aget-char v6, v7, v13

    aput-char v6, v1, v2

    add-int/lit8 v11, v11, 0x2

    .line 949
    iget v6, v0, Ll/ۜۧܺ;->᩹:I

    add-int/lit8 v6, v6, -0x2

    aput-char v9, v1, v6

    const/4 v1, 0x1

    goto :goto_1

    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 954
    array-length v6, v12

    if-le v3, v6, :cond_6

    .line 955
    invoke-virtual {v0, v3}, Ll/ۜۧܺ;->ۧ(I)V

    .line 957
    :cond_6
    iput v3, v0, Ll/ۜۧܺ;->᩹:I

    .line 959
    iget-object v6, v0, Ll/ۜۧܺ;->᩸:[C

    add-int/lit8 v12, v2, 0x1

    add-int/lit8 v14, v2, 0x2

    const/16 v15, 0x5c

    sub-int v9, v11, v2

    invoke-static {v6, v12, v6, v14, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 960
    iget-object v6, v0, Ll/ۜۧܺ;->᩸:[C

    aput-char v15, v6, v2

    .line 961
    aget-char v2, v7, v13

    aput-char v2, v6, v12

    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_7
    :goto_1
    move v12, v2

    :goto_2
    add-int/lit8 v2, v12, 0x1

    const/16 v6, 0x5c

    const/16 v9, 0x27

    goto :goto_0

    .line 967
    :cond_8
    iget-object v1, v0, Ll/ۜۧܺ;->᩸:[C

    sub-int/2addr v3, v4

    aput-char v8, v1, v3

    return-void

    :cond_9
    const/16 v2, 0x5c

    .line 765
    sget-object v6, Ll/᩷ۧܺ;->ۨ:Ll/᩷ۧܺ;

    iget v6, v6, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v3, v6

    if-eqz v3, :cond_a

    move/from16 v3, p2

    .line 766
    invoke-virtual {v0, v1, v8, v3}, Ll/ۜۧܺ;->֫(Ljava/lang/String;CZ)V

    return-void

    .line 774
    :cond_a
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v3

    .line 775
    iget v6, v0, Ll/ۜۧܺ;->᩹:I

    add-int/2addr v6, v3

    add-int/2addr v6, v4

    .line 776
    iget-object v9, v0, Ll/ۜۧܺ;->᩸:[C

    array-length v9, v9

    if-le v6, v9, :cond_b

    .line 812
    invoke-virtual {v0, v6}, Ll/ۜۧܺ;->ۧ(I)V

    :cond_b
    const/16 v9, 0x22

    if-nez v3, :cond_d

    .line 816
    iget v1, v0, Ll/ۜۧܺ;->᩹:I

    add-int/lit8 v1, v1, 0x3

    .line 817
    iget-object v2, v0, Ll/ۜۧܺ;->᩸:[C

    array-length v2, v2

    if-le v1, v2, :cond_c

    .line 818
    invoke-virtual {v0, v1}, Ll/ۜۧܺ;->ۧ(I)V

    .line 820
    :cond_c
    iget-object v1, v0, Ll/ۜۧܺ;->᩸:[C

    iget v2, v0, Ll/ۜۧܺ;->᩹:I

    add-int/lit8 v3, v2, 0x1

    iput v3, v0, Ll/ۜۧܺ;->᩹:I

    aput-char v9, v1, v2

    add-int/lit8 v4, v2, 0x2

    .line 821
    iput v4, v0, Ll/ۜۧܺ;->᩹:I

    aput-char v9, v1, v3

    add-int/lit8 v2, v2, 0x3

    .line 822
    iput v2, v0, Ll/ۜۧܺ;->᩹:I

    aput-char v8, v1, v4

    return-void

    .line 826
    :cond_d
    iget v10, v0, Ll/ۜۧܺ;->᩹:I

    add-int v11, v10, v3

    .line 829
    iget-object v12, v0, Ll/ۜۧܺ;->᩸:[C

    invoke-virtual {v1, v5, v3, v12, v10}, Ljava/lang/String;->getChars(II[CI)V

    .line 830
    iput v6, v0, Ll/ۜۧܺ;->᩹:I

    const/4 v1, 0x0

    move v3, v10

    :goto_3
    if-ge v3, v11, :cond_12

    .line 835
    iget-object v12, v0, Ll/ۜۧܺ;->᩸:[C

    aget-char v13, v12, v3

    .line 836
    sget-object v14, Ll/ۜۧܺ;->᩺:[B

    array-length v15, v14

    if-ge v13, v15, :cond_11

    aget-byte v14, v14, v13

    if-eqz v14, :cond_11

    if-nez v1, :cond_f

    add-int/lit8 v6, v6, 0x3

    .line 839
    array-length v1, v12

    if-le v6, v1, :cond_e

    .line 840
    invoke-virtual {v0, v6}, Ll/ۜۧܺ;->ۧ(I)V

    .line 842
    :cond_e
    iput v6, v0, Ll/ۜۧܺ;->᩹:I

    .line 844
    iget-object v1, v0, Ll/ۜۧܺ;->᩸:[C

    add-int/lit8 v12, v3, 0x1

    add-int/lit8 v14, v3, 0x3

    sub-int v15, v11, v3

    sub-int/2addr v15, v4

    invoke-static {v1, v12, v1, v14, v15}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 845
    iget-object v1, v0, Ll/ۜۧܺ;->᩸:[C

    invoke-static {v1, v5, v1, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 846
    iget-object v1, v0, Ll/ۜۧܺ;->᩸:[C

    aput-char v9, v1, v10

    .line 847
    aput-char v2, v1, v12

    add-int/lit8 v3, v3, 0x2

    .line 848
    aget-char v12, v7, v13

    aput-char v12, v1, v3

    add-int/lit8 v11, v11, 0x2

    .line 850
    iget v12, v0, Ll/ۜۧܺ;->᩹:I

    add-int/lit8 v12, v12, -0x2

    aput-char v9, v1, v12

    const/4 v1, 0x1

    goto :goto_4

    :cond_f
    add-int/lit8 v6, v6, 0x1

    .line 855
    array-length v12, v12

    if-le v6, v12, :cond_10

    .line 856
    invoke-virtual {v0, v6}, Ll/ۜۧܺ;->ۧ(I)V

    .line 858
    :cond_10
    iput v6, v0, Ll/ۜۧܺ;->᩹:I

    .line 860
    iget-object v12, v0, Ll/ۜۧܺ;->᩸:[C

    add-int/lit8 v14, v3, 0x1

    add-int/lit8 v15, v3, 0x2

    sub-int v5, v11, v3

    invoke-static {v12, v14, v12, v15, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 861
    iget-object v5, v0, Ll/ۜۧܺ;->᩸:[C

    aput-char v2, v5, v3

    .line 862
    aget-char v3, v7, v13

    aput-char v3, v5, v14

    add-int/lit8 v11, v11, 0x1

    move v3, v14

    :cond_11
    :goto_4
    add-int/2addr v3, v4

    const/4 v5, 0x0

    goto :goto_3

    .line 868
    :cond_12
    iget-object v1, v0, Ll/ۜۧܺ;->᩸:[C

    iget v2, v0, Ll/ۜۧܺ;->᩹:I

    sub-int/2addr v2, v4

    aput-char v8, v1, v2

    return-void
.end method

.method public final ۧ(I)V
    .locals 5

    .line 168
    iget-object v0, p0, Ll/ۜۧܺ;->᩸:[C

    array-length v1, v0

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x3

    invoke-static {v1, v4, v2, v3}, Ll/᩻ᩳᩴ;->֫(IIII)I

    move-result v1

    if-ge v1, p1, :cond_0

    goto :goto_0

    :cond_0
    move p1, v1

    .line 173
    :goto_0
    new-array p1, p1, [C

    .line 174
    iget v1, p0, Ll/ۜۧܺ;->᩹:I

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 175
    iput-object p1, p0, Ll/ۜۧܺ;->᩸:[C

    return-void
.end method

.method public final ۧ(J)V
    .locals 10

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    const-string p1, "-9223372036854775808"

    .line 411
    invoke-virtual {p0, p1}, Ll/ۜۧܺ;->write(Ljava/lang/String;)V

    return-void

    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gez v2, :cond_1

    neg-long v0, p1

    goto :goto_0

    :cond_1
    move-wide v0, p1

    :goto_0
    const-wide/16 v3, 0xa

    const/4 v5, 0x1

    move-wide v6, v3

    :goto_1
    const/16 v8, 0x13

    if-ge v5, v8, :cond_3

    cmp-long v9, v0, v6

    if-gez v9, :cond_2

    goto :goto_2

    :cond_2
    mul-long v6, v6, v3

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_3
    const/4 v5, 0x0

    :goto_2
    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    move v8, v5

    :goto_3
    if-gez v2, :cond_5

    add-int/lit8 v8, v8, 0x1

    .line 433
    :cond_5
    iget v0, p0, Ll/ۜۧܺ;->᩹:I

    add-int/2addr v0, v8

    .line 434
    iget-object v1, p0, Ll/ۜۧܺ;->᩸:[C

    array-length v1, v1

    if-le v0, v1, :cond_6

    .line 436
    invoke-virtual {p0, v0}, Ll/ۜۧܺ;->ۧ(I)V

    .line 445
    :cond_6
    iget-object v1, p0, Ll/ۜۧܺ;->᩸:[C

    invoke-static {p1, p2, v0, v1}, Ll/ۜۧܺ;->֫(JI[C)V

    .line 447
    iput v0, p0, Ll/ۜۧܺ;->᩹:I

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 13

    const/4 v0, 0x0

    if-nez p1, :cond_1

    .line 675
    iget p1, p0, Ll/ۜۧܺ;->᩹:I

    const/4 v1, 0x4

    add-int/2addr p1, v1

    .line 676
    iget-object v2, p0, Ll/ۜۧܺ;->᩸:[C

    array-length v2, v2

    if-le p1, v2, :cond_0

    .line 677
    invoke-virtual {p0, p1}, Ll/ۜۧܺ;->ۧ(I)V

    .line 679
    :cond_0
    iget-object v2, p0, Ll/ۜۧܺ;->᩸:[C

    iget v3, p0, Ll/ۜۧܺ;->᩹:I

    const-string v4, "null"

    invoke-virtual {v4, v0, v1, v2, v3}, Ljava/lang/String;->getChars(II[CI)V

    .line 680
    iput p1, p0, Ll/ۜۧܺ;->᩹:I

    return-void

    .line 684
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    .line 685
    iget v2, p0, Ll/ۜۧܺ;->᩹:I

    add-int/2addr v2, v1

    add-int/lit8 v2, v2, 0x2

    .line 686
    iget-object v3, p0, Ll/ۜۧܺ;->᩸:[C

    array-length v3, v3

    if-le v2, v3, :cond_2

    .line 702
    invoke-virtual {p0, v2}, Ll/ۜۧܺ;->ۧ(I)V

    .line 705
    :cond_2
    iget v3, p0, Ll/ۜۧܺ;->᩹:I

    add-int/lit8 v4, v3, 0x1

    add-int v5, v4, v1

    .line 708
    iget-object v6, p0, Ll/ۜۧܺ;->᩸:[C

    const/16 v7, 0x27

    aput-char v7, v6, v3

    .line 709
    invoke-virtual {p1, v0, v1, v6, v4}, Ljava/lang/String;->getChars(II[CI)V

    .line 710
    iput v2, p0, Ll/ۜۧܺ;->᩹:I

    const/4 p1, 0x0

    const/4 v1, -0x1

    move v3, v4

    :goto_0
    const/16 v6, 0x2f

    const/16 v8, 0xd

    const/16 v9, 0x5c

    if-ge v3, v5, :cond_5

    .line 716
    iget-object v10, p0, Ll/ۜۧܺ;->᩸:[C

    aget-char v10, v10, v3

    if-le v10, v8, :cond_3

    if-eq v10, v9, :cond_3

    if-eq v10, v7, :cond_3

    if-ne v10, v6, :cond_4

    .line 717
    sget-object v6, Ll/᩷ۧܺ;->ۡ֫:Ll/᩷ۧܺ;

    iget v6, v6, Ll/᩷ۧܺ;->᩸:I

    iget v8, p0, Ll/ۜۧܺ;->᩶:I

    and-int/2addr v6, v8

    if-eqz v6, :cond_4

    :cond_3
    add-int/lit8 v0, v0, 0x1

    move v1, v3

    move p1, v10

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    add-int/2addr v2, v0

    .line 726
    iget-object v3, p0, Ll/ۜۧܺ;->᩸:[C

    array-length v3, v3

    if-le v2, v3, :cond_6

    .line 727
    invoke-virtual {p0, v2}, Ll/ۜۧܺ;->ۧ(I)V

    .line 729
    :cond_6
    iput v2, p0, Ll/ۜۧܺ;->᩹:I

    .line 731
    sget-object v2, Ll/ۜۧܺ;->ۛ:[C

    const/4 v3, 0x1

    if-ne v0, v3, :cond_7

    .line 732
    iget-object v0, p0, Ll/ۜۧܺ;->᩸:[C

    add-int/lit8 v4, v1, 0x1

    add-int/lit8 v6, v1, 0x2

    sub-int/2addr v5, v1

    sub-int/2addr v5, v3

    invoke-static {v0, v4, v0, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 733
    iget-object v0, p0, Ll/ۜۧܺ;->᩸:[C

    aput-char v9, v0, v1

    .line 734
    aget-char p1, v2, p1

    aput-char p1, v0, v4

    goto :goto_2

    :cond_7
    if-le v0, v3, :cond_a

    .line 736
    iget-object v0, p0, Ll/ۜۧܺ;->᩸:[C

    add-int/lit8 v10, v1, 0x1

    add-int/lit8 v11, v1, 0x2

    sub-int v12, v5, v1

    sub-int/2addr v12, v3

    invoke-static {v0, v10, v0, v11, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 737
    iget-object v0, p0, Ll/ۜۧܺ;->᩸:[C

    aput-char v9, v0, v1

    .line 738
    aget-char p1, v2, p1

    aput-char p1, v0, v10

    add-int/2addr v5, v3

    :goto_1
    add-int/lit8 v1, v1, -0x1

    if-lt v1, v4, :cond_a

    .line 741
    iget-object p1, p0, Ll/ۜۧܺ;->᩸:[C

    aget-char v0, p1, v1

    if-le v0, v8, :cond_8

    if-eq v0, v9, :cond_8

    if-eq v0, v7, :cond_8

    if-ne v0, v6, :cond_9

    .line 743
    sget-object v10, Ll/᩷ۧܺ;->ۡ֫:Ll/᩷ۧܺ;

    iget v10, v10, Ll/᩷ۧܺ;->᩸:I

    iget v11, p0, Ll/ۜۧܺ;->᩶:I

    and-int/2addr v10, v11

    if-eqz v10, :cond_9

    :cond_8
    add-int/lit8 v10, v1, 0x1

    add-int/lit8 v11, v1, 0x2

    sub-int v12, v5, v1

    sub-int/2addr v12, v3

    .line 745
    invoke-static {p1, v10, p1, v11, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 746
    iget-object p1, p0, Ll/ۜۧܺ;->᩸:[C

    aput-char v9, p1, v1

    .line 747
    aget-char v0, v2, v0

    aput-char v0, p1, v10

    add-int/lit8 v5, v5, 0x1

    :cond_9
    goto :goto_1

    .line 753
    :cond_a
    :goto_2
    iget-object p1, p0, Ll/ۜۧܺ;->᩸:[C

    iget v0, p0, Ll/ۜۧܺ;->᩹:I

    sub-int/2addr v0, v3

    aput-char v7, p1, v0

    return-void
.end method
