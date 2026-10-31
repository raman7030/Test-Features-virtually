.class public final Ll/֫ۧ֡;
.super Ljava/lang/Object;
.source "04FP"


# instance fields
.field public ֫:[Ll/۟֫֡;

.field public final ۜ:Ll/ۛܽ֡;

.field public ۧ:I

.field public ܳ:I

.field public ܽ:I

.field public final ܿ:I

.field public final ᩳ:Ljava/util/ArrayList;

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/֨ᩳ֡;)V
    .locals 1

    .line 134
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 117
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֫ۧ֡;->ᩳ:Ljava/util/ArrayList;

    const/16 v0, 0x8

    new-array v0, v0, [Ll/۟֫֡;

    .line 124
    iput-object v0, p0, Ll/֫ۧ֡;->֫:[Ll/۟֫֡;

    const/4 v0, 0x7

    .line 126
    iput v0, p0, Ll/֫ۧ֡;->᩻:I

    const/4 v0, 0x0

    .line 127
    iput v0, p0, Ll/֫ۧ֡;->ܽ:I

    .line 128
    iput v0, p0, Ll/֫ۧ֡;->ۧ:I

    const/16 v0, 0x1000

    .line 135
    iput v0, p0, Ll/֫ۧ֡;->ܿ:I

    .line 136
    iput v0, p0, Ll/֫ۧ֡;->ܳ:I

    .line 137
    invoke-static {p1}, Ll/᩻ᩳ֡;->֫(Ll/֨ᩳ֡;)Ll/ۛܽ֡;

    move-result-object p1

    iput-object p1, p0, Ll/֫ۧ֡;->ۜ:Ll/ۛܽ֡;

    return-void
.end method

.method private ֫(I)I
    .locals 4

    const/4 v0, 0x0

    if-lez p1, :cond_1

    .line 166
    iget-object v1, p0, Ll/֫ۧ֡;->֫:[Ll/۟֫֡;

    array-length v1, v1

    :goto_0
    add-int/lit8 v1, v1, -0x1

    iget v2, p0, Ll/֫ۧ֡;->᩻:I

    if-lt v1, v2, :cond_0

    if-lez p1, :cond_0

    .line 167
    iget-object v2, p0, Ll/֫ۧ֡;->֫:[Ll/۟֫֡;

    aget-object v2, v2, v1

    iget v2, v2, Ll/۟֫֡;->֫:I

    sub-int/2addr p1, v2

    .line 168
    iget v3, p0, Ll/֫ۧ֡;->ۧ:I

    sub-int/2addr v3, v2

    iput v3, p0, Ll/֫ۧ֡;->ۧ:I

    .line 169
    iget v2, p0, Ll/֫ۧ֡;->ܽ:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/֫ۧ֡;->ܽ:I

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 172
    :cond_0
    iget-object p1, p0, Ll/֫ۧ֡;->֫:[Ll/۟֫֡;

    add-int/lit8 v1, v2, 0x1

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v2, v0

    iget v3, p0, Ll/֫ۧ֡;->ܽ:I

    invoke-static {p1, v1, p1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 174
    iget p1, p0, Ll/֫ۧ֡;->᩻:I

    add-int/2addr p1, v0

    iput p1, p0, Ll/֫ۧ֡;->᩻:I

    :cond_1
    return v0
.end method

.method private ֫(Ll/۟֫֡;)V
    .locals 6

    .line 280
    iget-object v0, p0, Ll/֫ۧ֡;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 282
    iget v0, p1, Ll/۟֫֡;->֫:I

    .line 288
    iget v1, p0, Ll/֫ۧ֡;->ܳ:I

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    .line 155
    iget-object p1, p0, Ll/֫ۧ֡;->֫:[Ll/۟֫֡;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 156
    iget-object p1, p0, Ll/֫ۧ֡;->֫:[Ll/۟֫֡;

    array-length p1, p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/֫ۧ֡;->᩻:I

    .line 157
    iput v2, p0, Ll/֫ۧ֡;->ܽ:I

    .line 158
    iput v2, p0, Ll/֫ۧ֡;->ۧ:I

    return-void

    .line 294
    :cond_0
    iget v3, p0, Ll/֫ۧ֡;->ۧ:I

    add-int/2addr v3, v0

    sub-int/2addr v3, v1

    .line 295
    invoke-direct {p0, v3}, Ll/֫ۧ֡;->֫(I)I

    .line 298
    iget v1, p0, Ll/֫ۧ֡;->ܽ:I

    add-int/lit8 v1, v1, 0x1

    iget-object v3, p0, Ll/֫ۧ֡;->֫:[Ll/۟֫֡;

    array-length v4, v3

    if-le v1, v4, :cond_1

    .line 299
    array-length v1, v3

    mul-int/lit8 v1, v1, 0x2

    new-array v1, v1, [Ll/۟֫֡;

    .line 300
    array-length v4, v3

    array-length v5, v3

    invoke-static {v3, v2, v1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 301
    iget-object v2, p0, Ll/֫ۧ֡;->֫:[Ll/۟֫֡;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/֫ۧ֡;->᩻:I

    .line 302
    iput-object v1, p0, Ll/֫ۧ֡;->֫:[Ll/۟֫֡;

    .line 304
    :cond_1
    iget v1, p0, Ll/֫ۧ֡;->᩻:I

    add-int/lit8 v2, v1, -0x1

    iput v2, p0, Ll/֫ۧ֡;->᩻:I

    .line 305
    iget-object v2, p0, Ll/֫ۧ֡;->֫:[Ll/۟֫֡;

    aput-object p1, v2, v1

    .line 306
    iget p1, p0, Ll/֫ۧ֡;->ܽ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/֫ۧ֡;->ܽ:I

    .line 311
    iget p1, p0, Ll/֫ۧ֡;->ۧ:I

    add-int/2addr p1, v0

    iput p1, p0, Ll/֫ۧ֡;->ۧ:I

    return-void
.end method

.method private ۧ(I)Ll/ۨܽ֡;
    .locals 3

    if-ltz p1, :cond_0

    .line 275
    sget-object v0, Ll/ܽۧ֡;->ۧ:[Ll/۟֫֡;

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    if-gt p1, v1, :cond_0

    .line 263
    aget-object p1, v0, p1

    iget-object p1, p1, Ll/۟֫֡;->ۧ:Ll/ۨܽ֡;

    return-object p1

    .line 265
    :cond_0
    sget-object v0, Ll/ܽۧ֡;->ۧ:[Ll/۟֫֡;

    array-length v0, v0

    sub-int v0, p1, v0

    .line 233
    iget v1, p0, Ll/֫ۧ֡;->᩻:I

    add-int/lit8 v1, v1, 0x1

    add-int/2addr v1, v0

    if-ltz v1, :cond_1

    .line 266
    iget-object v0, p0, Ll/֫ۧ֡;->֫:[Ll/۟֫֡;

    array-length v2, v0

    if-ge v1, v2, :cond_1

    .line 270
    aget-object p1, v0, v1

    iget-object p1, p1, Ll/۟֫֡;->ۧ:Ll/ۨܽ֡;

    return-object p1

    .line 267
    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Header index too large "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final ֫(II)I
    .locals 3

    and-int/2addr p1, p2

    if-ge p1, p2, :cond_0

    return p1

    :cond_0
    const/4 p1, 0x0

    .line 315
    :goto_0
    iget-object v0, p0, Ll/֫ۧ֡;->ۜ:Ll/ۛܽ֡;

    invoke-interface {v0}, Ll/ۛܽ֡;->readByte()B

    move-result v0

    and-int/lit16 v1, v0, 0xff

    and-int/lit16 v2, v0, 0x80

    if-eqz v2, :cond_1

    and-int/lit8 v0, v0, 0x7f

    shl-int/2addr v0, p1

    add-int/2addr p2, v0

    add-int/lit8 p1, p1, 0x7

    goto :goto_0

    :cond_1
    shl-int p1, v1, p1

    add-int/2addr p2, p1

    return p2
.end method

.method public final ֫()Ljava/util/ArrayList;
    .locals 2

    .line 213
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/֫ۧ֡;->ᩳ:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 214
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    return-object v0
.end method

.method public final ۧ()Ll/ۨܽ֡;
    .locals 4

    .line 315
    iget-object v0, p0, Ll/֫ۧ֡;->ۜ:Ll/ۛܽ֡;

    invoke-interface {v0}, Ll/ۛܽ֡;->readByte()B

    move-result v1

    and-int/lit16 v2, v1, 0xff

    const/16 v3, 0x80

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/16 v3, 0x7f

    .line 344
    invoke-virtual {p0, v2, v3}, Ll/֫ۧ֡;->֫(II)I

    move-result v2

    if-eqz v1, :cond_1

    .line 347
    invoke-static {}, Ll/᩺ۧ֡;->֫()Ll/᩺ۧ֡;

    move-result-object v1

    int-to-long v2, v2

    invoke-interface {v0, v2, v3}, Ll/ۛܽ֡;->ܽ(J)[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/᩺ۧ֡;->֫([B)[B

    move-result-object v0

    invoke-static {v0}, Ll/ۨܽ֡;->֫([B)Ll/ۨܽ֡;

    move-result-object v0

    return-object v0

    :cond_1
    int-to-long v1, v2

    .line 349
    invoke-interface {v0, v1, v2}, Ll/ۛܽ֡;->ۜ(J)Ll/ۨܽ֡;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()V
    .locals 5

    .line 184
    :cond_0
    :goto_0
    iget-object v0, p0, Ll/֫ۧ֡;->ۜ:Ll/ۛܽ֡;

    invoke-interface {v0}, Ll/ۛܽ֡;->ۢۧ()Z

    move-result v1

    if-nez v1, :cond_c

    .line 185
    invoke-interface {v0}, Ll/ۛܽ֡;->readByte()B

    move-result v0

    and-int/lit16 v1, v0, 0xff

    const/16 v2, 0x80

    if-eq v1, v2, :cond_b

    and-int/lit16 v3, v0, 0x80

    .line 188
    iget-object v4, p0, Ll/֫ۧ֡;->ᩳ:Ljava/util/ArrayList;

    if-ne v3, v2, :cond_3

    const/16 v0, 0x7f

    .line 189
    invoke-virtual {p0, v1, v0}, Ll/֫ۧ֡;->֫(II)I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    if-ltz v1, :cond_1

    .line 275
    sget-object v2, Ll/ܽۧ֡;->ۧ:[Ll/۟֫֡;

    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-gt v1, v3, :cond_1

    .line 220
    aget-object v0, v2, v1

    .line 221
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 223
    :cond_1
    sget-object v2, Ll/ܽۧ֡;->ۧ:[Ll/۟֫֡;

    array-length v2, v2

    sub-int/2addr v1, v2

    .line 233
    iget v2, p0, Ll/֫ۧ֡;->᩻:I

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v2, v1

    if-ltz v2, :cond_2

    .line 224
    iget-object v1, p0, Ll/֫ۧ֡;->֫:[Ll/۟֫֡;

    array-length v3, v1

    if-ge v2, v3, :cond_2

    .line 227
    aget-object v0, v1, v2

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 225
    :cond_2
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Header index too large "

    .line 0
    invoke-static {v0, v2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 225
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    const/16 v2, 0x40

    if-ne v1, v2, :cond_4

    .line 256
    invoke-virtual {p0}, Ll/֫ۧ֡;->ۧ()Ll/ۨܽ֡;

    move-result-object v0

    invoke-static {v0}, Ll/ܽۧ֡;->֫(Ll/ۨܽ֡;)V

    .line 257
    invoke-virtual {p0}, Ll/֫ۧ֡;->ۧ()Ll/ۨܽ֡;

    move-result-object v1

    .line 258
    new-instance v2, Ll/۟֫֡;

    invoke-direct {v2, v0, v1}, Ll/۟֫֡;-><init>(Ll/ۨܽ֡;Ll/ۨܽ֡;)V

    invoke-direct {p0, v2}, Ll/֫ۧ֡;->֫(Ll/۟֫֡;)V

    goto :goto_0

    :cond_4
    and-int/lit8 v3, v0, 0x40

    if-ne v3, v2, :cond_5

    const/16 v0, 0x3f

    .line 194
    invoke-virtual {p0, v1, v0}, Ll/֫ۧ֡;->֫(II)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 250
    invoke-direct {p0, v0}, Ll/֫ۧ֡;->ۧ(I)Ll/ۨܽ֡;

    move-result-object v0

    .line 251
    invoke-virtual {p0}, Ll/֫ۧ֡;->ۧ()Ll/ۨܽ֡;

    move-result-object v1

    .line 252
    new-instance v2, Ll/۟֫֡;

    invoke-direct {v2, v0, v1}, Ll/۟֫֡;-><init>(Ll/ۨܽ֡;Ll/ۨܽ֡;)V

    invoke-direct {p0, v2}, Ll/֫ۧ֡;->֫(Ll/۟֫֡;)V

    goto/16 :goto_0

    :cond_5
    and-int/lit8 v0, v0, 0x20

    const/16 v2, 0x20

    if-ne v0, v2, :cond_8

    const/16 v0, 0x1f

    .line 197
    invoke-virtual {p0, v1, v0}, Ll/֫ۧ֡;->֫(II)I

    move-result v0

    iput v0, p0, Ll/֫ۧ֡;->ܳ:I

    if-ltz v0, :cond_7

    .line 198
    iget v1, p0, Ll/֫ۧ֡;->ܿ:I

    if-gt v0, v1, :cond_7

    .line 145
    iget v1, p0, Ll/֫ۧ֡;->ۧ:I

    if-ge v0, v1, :cond_0

    if-nez v0, :cond_6

    .line 155
    iget-object v0, p0, Ll/֫ۧ֡;->֫:[Ll/۟֫֡;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 156
    iget-object v0, p0, Ll/֫ۧ֡;->֫:[Ll/۟֫֡;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/֫ۧ֡;->᩻:I

    const/4 v0, 0x0

    .line 157
    iput v0, p0, Ll/֫ۧ֡;->ܽ:I

    .line 158
    iput v0, p0, Ll/֫ۧ֡;->ۧ:I

    goto/16 :goto_0

    :cond_6
    sub-int/2addr v1, v0

    .line 149
    invoke-direct {p0, v1}, Ll/֫ۧ֡;->֫(I)I

    goto/16 :goto_0

    .line 200
    :cond_7
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid dynamic table size update "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ll/֫ۧ֡;->ܳ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    const/16 v0, 0x10

    if-eq v1, v0, :cond_a

    if-nez v1, :cond_9

    goto :goto_1

    :cond_9
    const/16 v0, 0xf

    .line 206
    invoke-virtual {p0, v1, v0}, Ll/֫ۧ֡;->֫(II)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 237
    invoke-direct {p0, v0}, Ll/֫ۧ֡;->ۧ(I)Ll/ۨܽ֡;

    move-result-object v0

    .line 238
    invoke-virtual {p0}, Ll/֫ۧ֡;->ۧ()Ll/ۨܽ֡;

    move-result-object v1

    .line 239
    new-instance v2, Ll/۟֫֡;

    invoke-direct {v2, v0, v1}, Ll/۟֫֡;-><init>(Ll/ۨܽ֡;Ll/ۨܽ֡;)V

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 243
    :cond_a
    :goto_1
    invoke-virtual {p0}, Ll/֫ۧ֡;->ۧ()Ll/ۨܽ֡;

    move-result-object v0

    invoke-static {v0}, Ll/ܽۧ֡;->֫(Ll/ۨܽ֡;)V

    .line 244
    invoke-virtual {p0}, Ll/֫ۧ֡;->ۧ()Ll/ۨܽ֡;

    move-result-object v1

    .line 245
    new-instance v2, Ll/۟֫֡;

    invoke-direct {v2, v0, v1}, Ll/۟֫֡;-><init>(Ll/ۨܽ֡;Ll/ۨܽ֡;)V

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 187
    :cond_b
    new-instance v0, Ljava/io/IOException;

    const-string v1, "index == 0"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    return-void
.end method
