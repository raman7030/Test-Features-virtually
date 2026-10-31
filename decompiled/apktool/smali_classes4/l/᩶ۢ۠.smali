.class public final Ll/᩶ۢ۠;
.super Ljava/lang/Object;
.source "F7KC"


# static fields
.field public static final ۜ:Ljava/util/BitSet;

.field public static final ۡ:Ljava/util/BitSet;

.field public static final ۢ:Ljava/util/BitSet;

.field public static final ܳ:Ljava/util/BitSet;

.field public static final ᩷:Ljava/util/BitSet;

.field public static final ᩻:Ljava/util/BitSet;


# instance fields
.field public final ֫:Ll/ܶ֨۠;

.field public final ۧ:Ll/ۛܶ۠;

.field public ܽ:Ll/᩹ۢ۠;

.field public final ܿ:Ll/᩷ۚ֨;

.field public final ᩳ:Ll/᩶ۜ۠;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 94
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    sput-object v0, Ll/᩶ۢ۠;->ܳ:Ljava/util/BitSet;

    .line 95
    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1}, Ljava/util/BitSet;-><init>()V

    sput-object v1, Ll/᩶ۢ۠;->᩻:Ljava/util/BitSet;

    .line 96
    new-instance v2, Ljava/util/BitSet;

    invoke-direct {v2}, Ljava/util/BitSet;-><init>()V

    sput-object v2, Ll/᩶ۢ۠;->ۜ:Ljava/util/BitSet;

    .line 97
    new-instance v3, Ljava/util/BitSet;

    invoke-direct {v3}, Ljava/util/BitSet;-><init>()V

    sput-object v3, Ll/᩶ۢ۠;->ۢ:Ljava/util/BitSet;

    .line 98
    new-instance v4, Ljava/util/BitSet;

    invoke-direct {v4}, Ljava/util/BitSet;-><init>()V

    sput-object v4, Ll/᩶ۢ۠;->ۡ:Ljava/util/BitSet;

    .line 99
    new-instance v5, Ljava/util/BitSet;

    invoke-direct {v5}, Ljava/util/BitSet;-><init>()V

    sput-object v5, Ll/᩶ۢ۠;->᩷:Ljava/util/BitSet;

    const/4 v6, 0x7

    .line 102
    invoke-virtual {v0, v6}, Ljava/util/BitSet;->set(I)V

    const/4 v0, 0x3

    const/16 v6, 0x9

    .line 103
    invoke-virtual {v1, v0, v6}, Ljava/util/BitSet;->set(II)V

    const/16 v0, 0x13

    .line 104
    invoke-virtual {v2, v0}, Ljava/util/BitSet;->set(I)V

    const/16 v0, 0x14

    .line 105
    invoke-virtual {v3, v0}, Ljava/util/BitSet;->set(I)V

    const/4 v0, 0x1

    .line 106
    invoke-virtual {v4, v0}, Ljava/util/BitSet;->set(I)V

    const/16 v0, 0xc

    .line 107
    invoke-virtual {v5, v0}, Ljava/util/BitSet;->set(I)V

    return-void
.end method

.method public constructor <init>(Ll/᩶ۜ۠;Ll/ܶ֨۠;Ll/ۛܶ۠;Ll/᩷ۚ֨;)V
    .locals 0

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    iput-object p1, p0, Ll/᩶ۢ۠;->ᩳ:Ll/᩶ۜ۠;

    .line 89
    iput-object p2, p0, Ll/᩶ۢ۠;->֫:Ll/ܶ֨۠;

    .line 90
    iput-object p3, p0, Ll/᩶ۢ۠;->ۧ:Ll/ۛܶ۠;

    .line 91
    iput-object p4, p0, Ll/᩶ۢ۠;->ܿ:Ll/᩷ۚ֨;

    return-void
.end method

.method public static ֫(Ll/᩶ۢ۠;Ll/ܶ֨۠;II)Ljava/lang/Object;
    .locals 6

    .line 205
    iget-object v0, p0, Ll/᩶ۢ۠;->ۧ:Ll/ۛܶ۠;

    iget-object v1, p0, Ll/᩶ۢ۠;->ܿ:Ll/᩷ۚ֨;

    iget-object v2, p0, Ll/᩶ۢ۠;->ᩳ:Ll/᩶ۜ۠;

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eq p2, v4, :cond_3

    const/16 v5, 0xc

    if-eq p2, v5, :cond_2

    const/16 v5, 0x13

    if-eq p2, v5, :cond_1

    const/16 v5, 0x14

    if-eq p2, v5, :cond_0

    const/16 v5, 0x8

    packed-switch p2, :pswitch_data_0

    .line 240
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p0

    sub-int/2addr p3, v4

    .line 241
    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    new-array p2, v3, [Ljava/lang/Object;

    const/4 p3, 0x0

    aput-object p0, p2, p3

    aput-object p1, p2, v4

    const-string p0, "unexpected.const.pool.tag.at"

    .line 239
    invoke-virtual {v2, p0, p2}, Ll/᩶ۜ۠;->֫(Ljava/lang/String;[Ljava/lang/Object;)Ll/᩸ۘ֨;

    move-result-object p0

    throw p0

    .line 229
    :pswitch_0
    invoke-virtual {p1, p3}, Ll/ܶ֨۠;->ᩳ(I)C

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩶ۢ۠;->ᩳ(I)Ll/ۤܶ۠;

    move-result-object p0

    invoke-virtual {p0}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 211
    :pswitch_1
    invoke-virtual {p1, p3}, Ll/ܶ֨۠;->ᩳ(I)C

    move-result p1

    .line 212
    invoke-virtual {p0, p1}, Ll/᩶ۢ۠;->ᩳ(I)Ll/ۤܶ۠;

    move-result-object p0

    .line 203
    invoke-virtual {p0}, Ll/ۤܶ۠;->֫()[B

    move-result-object p1

    invoke-virtual {p0}, Ll/ۤܶ۠;->ᩳ()I

    move-result p2

    invoke-virtual {p0}, Ll/ۤܶ۠;->ۧ()I

    move-result p0

    invoke-static {p2, p0, p1}, Ll/ᩳ᩻۠;->֫(II[B)[B

    move-result-object p0

    .line 212
    invoke-virtual {v0, p0}, Ll/ۛܶ۠;->֫([B)Ll/ۤܶ۠;

    move-result-object p0

    .line 213
    iget-object p1, v2, Ll/᩶ۜ۠;->᩷:Ll/֡֡֨;

    invoke-virtual {v1, p1, p0}, Ll/᩷ۚ֨;->֫(Ll/֡֡֨;Ll/ۤܶ۠;)Ll/ܳ֡֨;

    move-result-object p0

    return-object p0

    .line 227
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    new-instance p0, Ljava/io/DataInputStream;

    new-instance p2, Ljava/io/ByteArrayInputStream;

    iget-object p1, p1, Ll/ܶ֨۠;->֫:[B

    invoke-direct {p2, p1, p3, v5}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    invoke-direct {p0, p2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 217
    :try_start_0
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readDouble()D

    move-result-wide p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 227
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    .line 219
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    .line 225
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    new-instance p0, Ljava/io/DataInputStream;

    new-instance p2, Ljava/io/ByteArrayInputStream;

    iget-object p1, p1, Ll/ܶ֨۠;->֫:[B

    invoke-direct {p2, p1, p3, v5}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    invoke-direct {p0, p2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 193
    :try_start_1
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readLong()J

    move-result-wide p0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 225
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    :catch_1
    move-exception p0

    .line 195
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    .line 223
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    new-instance p0, Ljava/io/DataInputStream;

    new-instance p2, Ljava/io/ByteArrayInputStream;

    iget-object p1, p1, Ll/ܶ֨۠;->֫:[B

    const/4 v0, 0x4

    invoke-direct {p2, p1, p3, v0}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    invoke-direct {p0, p2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 205
    :try_start_2
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readFloat()F

    move-result p0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 223
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0

    :catch_2
    move-exception p0

    .line 207
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    .line 221
    :pswitch_5
    invoke-virtual {p1, p3}, Ll/ܶ֨۠;->ܿ(I)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    .line 231
    :cond_0
    invoke-virtual {p1, p3}, Ll/ܶ֨۠;->ᩳ(I)C

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩶ۢ۠;->ᩳ(I)Ll/ۤܶ۠;

    move-result-object p0

    .line 232
    iget-object p1, v2, Ll/᩶ۜ۠;->᩷:Ll/֡֡֨;

    .line 165
    invoke-virtual {p0}, Ll/ۤܶ۠;->֫()[B

    move-result-object p2

    invoke-virtual {p0}, Ll/ۤܶ۠;->ᩳ()I

    move-result p3

    invoke-virtual {p0}, Ll/ۤܶ۠;->ۧ()I

    move-result p0

    invoke-static {p3, p0, p2}, Ll/ᩳ᩻۠;->֫(II[B)[B

    move-result-object p0

    .line 232
    invoke-virtual {v0, p0}, Ll/ۛܶ۠;->֫([B)Ll/ۤܶ۠;

    move-result-object p0

    invoke-virtual {v1, p1, p0}, Ll/᩷ۚ֨;->ۧ(Ll/֡֡֨;Ll/ۤܶ۠;)Ll/۠֡֨;

    move-result-object p0

    return-object p0

    .line 235
    :cond_1
    invoke-virtual {p1, p3}, Ll/ܶ֨۠;->ᩳ(I)C

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩶ۢ۠;->ᩳ(I)Ll/ۤܶ۠;

    move-result-object p0

    .line 236
    invoke-virtual {v1, p0}, Ll/᩷ۚ֨;->֫(Ll/ۤܶ۠;)Ll/֡֡֨;

    move-result-object p0

    return-object p0

    .line 216
    :cond_2
    invoke-virtual {p1, p3}, Ll/ܶ֨۠;->ᩳ(I)C

    move-result p2

    invoke-virtual {p0, p2}, Ll/᩶ۢ۠;->ᩳ(I)Ll/ۤܶ۠;

    move-result-object p2

    add-int/2addr p3, v3

    .line 217
    invoke-virtual {p1, p3}, Ll/ܶ֨۠;->ᩳ(I)C

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩶ۢ۠;->᩻(I)Ll/ۙ֨֨;

    move-result-object p0

    .line 218
    new-instance p1, Ll/ܶۢ۠;

    invoke-direct {p1, p2, p0}, Ll/ܶۢ۠;-><init>(Ll/ۤܶ۠;Ll/ۙ֨֨;)V

    return-object p1

    .line 207
    :cond_3
    invoke-virtual {p1, p3}, Ll/ܶ֨۠;->ᩳ(I)C

    move-result p0

    .line 208
    iget-object p1, p1, Ll/ܶ֨۠;->֫:[B

    add-int/2addr p3, v3

    .line 422
    iget-object p2, v0, Ll/ۛܶ۠;->ᩴܽ:Ll/۫ܶ۠;

    invoke-virtual {p2, p3, p0, p1}, Ll/۫ܶ۠;->֫(II[B)Ll/ۤܶ۠;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static bridge synthetic ֫(Ll/᩶ۢ۠;)Ll/᩶ۜ۠;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶ۢ۠;->ᩳ:Ll/᩶ۜ۠;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ܶ֨۠;I)I
    .locals 7

    .line 253
    invoke-virtual {p1, p2}, Ll/ܶ֨۠;->ᩳ(I)C

    move-result v0

    const/4 v1, 0x2

    add-int/2addr p2, v1

    .line 256
    new-array v2, v0, [I

    const/4 v3, 0x1

    const/4 v4, 0x1

    :goto_0
    if-ge v4, v0, :cond_1

    add-int/lit8 v5, p2, 0x1

    .line 231
    iget-object v6, p1, Ll/ܶ֨۠;->֫:[B

    aget-byte v6, v6, p2

    .line 259
    aput v5, v2, v4

    packed-switch v6, :pswitch_data_0

    .line 292
    :pswitch_0
    invoke-static {v6}, Ljava/lang/Byte;->toString(B)Ljava/lang/String;

    move-result-object p1

    .line 293
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p2

    new-array v0, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    aput-object p2, v0, v3

    .line 291
    iget-object p1, p0, Ll/᩶ۢ۠;->ᩳ:Ll/᩶ۜ۠;

    const-string p2, "bad.const.pool.tag.at"

    invoke-virtual {p1, p2, v0}, Ll/᩶ۜ۠;->֫(Ljava/lang/String;[Ljava/lang/Object;)Ll/᩸ۘ֨;

    move-result-object p1

    throw p1

    :pswitch_1
    add-int/lit8 p2, p2, 0x4

    goto :goto_1

    :pswitch_2
    add-int/lit8 p2, p2, 0x3

    goto :goto_1

    :pswitch_3
    add-int/lit8 p2, p2, 0x9

    goto :goto_1

    :pswitch_4
    add-int/lit8 p2, p2, 0x5

    goto :goto_1

    .line 262
    :pswitch_5
    invoke-virtual {p1, v5}, Ll/ܶ֨۠;->ᩳ(I)C

    move-result p2

    add-int/2addr p2, v1

    add-int/2addr p2, v5

    :goto_1
    const/4 v5, 0x5

    if-eq v6, v5, :cond_0

    const/4 v5, 0x6

    if-eq v6, v5, :cond_0

    const/4 v5, 0x1

    goto :goto_2

    :cond_0
    const/4 v5, 0x2

    :goto_2
    add-int/2addr v4, v5

    goto :goto_0

    .line 297
    :cond_1
    new-instance v0, Ll/᩹ۢ۠;

    invoke-direct {v0, p0, p1, v2}, Ll/᩹ۢ۠;-><init>(Ll/᩶ۢ۠;Ll/ܶ֨۠;[I)V

    iput-object v0, p0, Ll/᩶ۢ۠;->ܽ:Ll/᩹ۢ۠;

    return p2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public final ֫(ILl/۬ܶ۠;)Ljava/lang/Object;
    .locals 1

    .line 121
    iget-object v0, p0, Ll/᩶ۢ۠;->ܽ:Ll/᩹ۢ۠;

    invoke-virtual {v0, p1}, Ll/᩹ۢ۠;->֫(I)I

    move-result p1

    iget-object v0, p0, Ll/᩶ۢ۠;->֫:Ll/ܶ֨۠;

    invoke-virtual {v0, p1}, Ll/ܶ֨۠;->ᩳ(I)C

    move-result p1

    invoke-virtual {p0, p1, p2}, Ll/᩶ۢ۠;->ܽ(ILl/۬ܶ۠;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(I)Ll/ܳ֡֨;
    .locals 2

    .line 114
    iget-object v0, p0, Ll/᩶ۢ۠;->ܽ:Ll/᩹ۢ۠;

    sget-object v1, Ll/᩶ۢ۠;->ܳ:Ljava/util/BitSet;

    invoke-virtual {v0, v1, p1}, Ll/᩹ۢ۠;->֫(Ljava/util/BitSet;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܳ֡֨;

    return-object p1
.end method

.method public final ۧ(I)Ljava/lang/Object;
    .locals 2

    .line 184
    iget-object v0, p0, Ll/᩶ۢ۠;->ܽ:Ll/᩹ۢ۠;

    sget-object v1, Ll/᩶ۢ۠;->᩻:Ljava/util/BitSet;

    invoke-virtual {v0, v1, p1}, Ll/᩹ۢ۠;->֫(Ljava/util/BitSet;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(ILl/۬ܶ۠;)Ljava/lang/Object;
    .locals 1

    .line 135
    iget-object v0, p0, Ll/᩶ۢ۠;->ܽ:Ll/᩹ۢ۠;

    invoke-virtual {v0, p1}, Ll/᩹ۢ۠;->֫(I)I

    move-result p1

    iget-object v0, p0, Ll/᩶ۢ۠;->֫:Ll/ܶ֨۠;

    invoke-virtual {v0, p1}, Ll/ܶ֨۠;->ᩳ(I)C

    move-result p1

    invoke-virtual {p0, p1, p2}, Ll/᩶ۢ۠;->ܽ(ILl/۬ܶ۠;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ܳ(I)Ll/۠֡֨;
    .locals 2

    .line 149
    iget-object v0, p0, Ll/᩶ۢ۠;->ܽ:Ll/᩹ۢ۠;

    sget-object v1, Ll/᩶ۢ۠;->ۢ:Ljava/util/BitSet;

    invoke-virtual {v0, v1, p1}, Ll/᩹ۢ۠;->֫(Ljava/util/BitSet;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۠֡֨;

    return-object p1
.end method

.method public final ܽ(ILl/۬ܶ۠;)Ljava/lang/Object;
    .locals 3

    .line 192
    iget-object v0, p0, Ll/᩶ۢ۠;->ܽ:Ll/᩹ۢ۠;

    invoke-virtual {v0, p1}, Ll/᩹ۢ۠;->ۧ(I)I

    move-result v0

    .line 193
    iget-object v1, p0, Ll/᩶ۢ۠;->ܽ:Ll/᩹ۢ۠;

    invoke-virtual {v1, p1}, Ll/᩹ۢ۠;->֫(I)I

    move-result p1

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    .line 195
    iget-object v0, p0, Ll/᩶ۢ۠;->ܽ:Ll/᩹ۢ۠;

    iget-object v0, v0, Ll/᩹ۢ۠;->ۧ:Ll/ܶ֨۠;

    invoke-virtual {v0, p1}, Ll/ܶ֨۠;->ᩳ(I)C

    move-result v0

    .line 196
    iget-object v2, p0, Ll/᩶ۢ۠;->ܽ:Ll/᩹ۢ۠;

    iget-object v2, v2, Ll/᩹ۢ۠;->ۧ:Ll/ܶ֨۠;

    iget-object v2, v2, Ll/ܶ֨۠;->֫:[B

    add-int/2addr p1, v1

    invoke-interface {p2, p1, v0, v2}, Ll/۬ܶ۠;->֫(II[B)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 199
    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p2

    sub-int/2addr p1, v2

    .line 200
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    new-array v0, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    aput-object p1, v0, v2

    .line 198
    iget-object p1, p0, Ll/᩶ۢ۠;->ᩳ:Ll/᩶ۜ۠;

    const-string p2, "unexpected.const.pool.tag.at"

    invoke-virtual {p1, p2, v0}, Ll/᩶ۜ۠;->֫(Ljava/lang/String;[Ljava/lang/Object;)Ll/᩸ۘ֨;

    move-result-object p1

    throw p1
.end method

.method public final ܽ(I)Ll/֡֡֨;
    .locals 2

    .line 142
    iget-object v0, p0, Ll/᩶ۢ۠;->ܽ:Ll/᩹ۢ۠;

    sget-object v1, Ll/᩶ۢ۠;->ۜ:Ljava/util/BitSet;

    invoke-virtual {v0, v1, p1}, Ll/᩹ۢ۠;->֫(Ljava/util/BitSet;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֡֡֨;

    return-object p1
.end method

.method public final ܿ(I)Ll/ܶۢ۠;
    .locals 2

    .line 177
    iget-object v0, p0, Ll/᩶ۢ۠;->ܽ:Ll/᩹ۢ۠;

    sget-object v1, Ll/᩶ۢ۠;->᩷:Ljava/util/BitSet;

    invoke-virtual {v0, v1, p1}, Ll/᩹ۢ۠;->֫(Ljava/util/BitSet;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܶۢ۠;

    return-object p1
.end method

.method public final ᩳ(I)Ll/ۤܶ۠;
    .locals 2

    .line 163
    iget-object v0, p0, Ll/᩶ۢ۠;->ܽ:Ll/᩹ۢ۠;

    sget-object v1, Ll/᩶ۢ۠;->ۡ:Ljava/util/BitSet;

    invoke-virtual {v0, v1, p1}, Ll/᩹ۢ۠;->֫(Ljava/util/BitSet;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۤܶ۠;

    return-object p1
.end method

.method public final ᩻(I)Ll/ۙ֨֨;
    .locals 3

    .line 170
    invoke-virtual {p0, p1}, Ll/᩶ۢ۠;->ᩳ(I)Ll/ۤܶ۠;

    move-result-object p1

    iget-object v0, p0, Ll/᩶ۢ۠;->ᩳ:Ll/᩶ۜ۠;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    invoke-virtual {p1}, Ll/ۤܶ۠;->֫()[B

    move-result-object v1

    invoke-virtual {p1}, Ll/ۤܶ۠;->ᩳ()I

    move-result v2

    invoke-virtual {p1}, Ll/ۤܶ۠;->ۧ()I

    move-result p1

    .line 425
    iput-object v1, v0, Ll/᩶ۜ۠;->ܽ֫:[B

    .line 426
    iput v2, v0, Ll/᩶ۜ۠;->ܿ֫:I

    add-int/2addr v2, p1

    .line 427
    iput v2, v0, Ll/᩶ۜ۠;->ۧ֫:I

    .line 428
    invoke-virtual {v0}, Ll/᩶ۜ۠;->᩻()Ll/ۙ֨֨;

    move-result-object p1

    return-object p1
.end method
