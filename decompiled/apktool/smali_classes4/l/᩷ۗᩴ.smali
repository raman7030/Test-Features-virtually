.class public final Ll/᩷ۗᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/io/Externalizable;


# static fields
.field public static final serialVersionUID:J = -0x6aa27b45e4ddb74eL


# instance fields
.field public a:B

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(BLjava/lang/Object;)V
    .locals 0

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 129
    iput-byte p1, p0, Ll/᩷ۗᩴ;->a:B

    .line 130
    iput-object p2, p0, Ll/᩷ۗᩴ;->b:Ljava/lang/Object;

    return-void
.end method

.method public static a(BLjava/io/ObjectInput;)Ljava/lang/Object;
    .locals 3

    packed-switch p0, :pswitch_data_0

    .line 271
    new-instance p0, Ljava/io/StreamCorruptedException;

    const-string p1, "Unknown serialized type"

    invoke-direct {p0, p1}, Ljava/io/StreamCorruptedException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 269
    :pswitch_0
    sget-object p0, Ll/ۜۗᩴ;->d:Ll/ۜۗᩴ;

    .line 1080
    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    move-result p0

    .line 1081
    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    move-result v0

    .line 1082
    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    move-result p1

    .line 234
    invoke-static {p0, v0, p1}, Ll/ۜۗᩴ;->a(III)Ll/ۜۗᩴ;

    move-result-object p0

    return-object p0

    .line 268
    :pswitch_1
    sget p0, Ll/ᩳۗᩴ;->c:I

    .line 787
    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    move-result p0

    .line 788
    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    move-result p1

    .line 244
    invoke-static {p0}, Ll/ۧۗᩴ;->Y(I)Ll/ۧۗᩴ;

    move-result-object p0

    const-string v0, "month"

    .line 218
    invoke-static {p0, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 219
    sget-object v0, Ll/ᩴۗᩴ;->DAY_OF_MONTH:Ll/ᩴۗᩴ;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Ll/ᩴۗᩴ;->T(J)V

    .line 220
    invoke-virtual {p0}, Ll/ۧۗᩴ;->X()I

    move-result v0

    if-gt p1, v0, :cond_0

    .line 224
    new-instance v0, Ll/ᩳۗᩴ;

    invoke-virtual {p0}, Ll/ۧۗᩴ;->getValue()I

    move-result p0

    invoke-direct {v0, p0, p1}, Ll/ᩳۗᩴ;-><init>(II)V

    return-object v0

    .line 221
    :cond_0
    new-instance v0, Ll/ܺ᩹ᩴ;

    .line 222
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Illegal value for DayOfMonth field, value "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is not valid for month "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw v0

    .line 267
    :pswitch_2
    sget p0, Ll/ܽ۬ᩴ;->c:I

    .line 1245
    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    move-result p0

    .line 1246
    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    move-result p1

    .line 226
    sget-object v0, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    int-to-long v1, p0

    invoke-virtual {v0, v1, v2}, Ll/ᩴۗᩴ;->T(J)V

    .line 227
    sget-object v0, Ll/ᩴۗᩴ;->MONTH_OF_YEAR:Ll/ᩴۗᩴ;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Ll/ᩴۗᩴ;->T(J)V

    .line 228
    new-instance v0, Ll/ܽ۬ᩴ;

    invoke-direct {v0, p0, p1}, Ll/ܽ۬ᩴ;-><init>(II)V

    return-object v0

    .line 266
    :pswitch_3
    sget p0, Ll/֫۬ᩴ;->b:I

    .line 1119
    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    move-result p0

    invoke-static {p0}, Ll/֫۬ᩴ;->V(I)Ll/֫۬ᩴ;

    move-result-object p0

    return-object p0

    .line 265
    :pswitch_4
    sget p0, Ll/᩵᩹ᩴ;->c:I

    .line 2008
    sget-object p0, Ll/ᩴ᩹ᩴ;->d:Ll/ᩴ᩹ᩴ;

    .line 2224
    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    move-result p0

    .line 2225
    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    move-result v0

    .line 2226
    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    move-result v1

    .line 2227
    invoke-static {p0, v0, v1}, Ll/ᩴ᩹ᩴ;->h0(III)Ll/ᩴ᩹ᩴ;

    move-result-object p0

    .line 2009
    invoke-static {p1}, Ll/۟ۙᩴ;->g0(Ljava/io/DataInput;)Ll/۟ۙᩴ;

    move-result-object v0

    .line 2010
    invoke-static {p0, v0}, Ll/᩺ۙᩴ;->Y(Ll/ᩴ᩹ᩴ;Ll/۟ۙᩴ;)Ll/᩺ۙᩴ;

    move-result-object p0

    .line 1949
    invoke-static {p1}, Ll/ᩳ۬ᩴ;->g0(Ljava/io/DataInput;)Ll/ᩳ۬ᩴ;

    move-result-object p1

    .line 276
    new-instance v0, Ll/᩵᩹ᩴ;

    invoke-direct {v0, p0, p1}, Ll/᩵᩹ᩴ;-><init>(Ll/᩺ۙᩴ;Ll/ᩳ۬ᩴ;)V

    return-object v0

    .line 264
    :pswitch_5
    sget p0, Ll/᩻ۗᩴ;->c:I

    .line 1433
    invoke-static {p1}, Ll/۟ۙᩴ;->g0(Ljava/io/DataInput;)Ll/۟ۙᩴ;

    move-result-object p0

    .line 1434
    invoke-static {p1}, Ll/ᩳ۬ᩴ;->g0(Ljava/io/DataInput;)Ll/ᩳ۬ᩴ;

    move-result-object p1

    .line 213
    new-instance v0, Ll/᩻ۗᩴ;

    invoke-direct {v0, p0, p1}, Ll/᩻ۗᩴ;-><init>(Ll/۟ۙᩴ;Ll/ᩳ۬ᩴ;)V

    return-object v0

    .line 262
    :pswitch_6
    invoke-static {p1}, Ll/ᩳ۬ᩴ;->g0(Ljava/io/DataInput;)Ll/ᩳ۬ᩴ;

    move-result-object p0

    return-object p0

    .line 263
    :pswitch_7
    sget p0, Ll/ܿ۬ᩴ;->d:I

    .line 217
    invoke-interface {p1}, Ljava/io/DataInput;->readUTF()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    .line 218
    invoke-static {p0, p1}, Ll/ۚ᩹ᩴ;->X(Ljava/lang/String;Z)Ll/ۚ᩹ᩴ;

    move-result-object p0

    return-object p0

    .line 2259
    :pswitch_8
    sget-object p0, Ll/᩺ۙᩴ;->c:Ll/᩺ۙᩴ;

    .line 2008
    sget-object p0, Ll/ᩴ᩹ᩴ;->d:Ll/ᩴ᩹ᩴ;

    .line 2224
    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    move-result p0

    .line 2225
    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    move-result v0

    .line 2226
    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    move-result v1

    .line 2227
    invoke-static {p0, v0, v1}, Ll/ᩴ᩹ᩴ;->h0(III)Ll/ᩴ᩹ᩴ;

    move-result-object p0

    .line 2009
    invoke-static {p1}, Ll/۟ۙᩴ;->g0(Ljava/io/DataInput;)Ll/۟ۙᩴ;

    move-result-object v0

    .line 2010
    invoke-static {p0, v0}, Ll/᩺ۙᩴ;->Y(Ll/ᩴ᩹ᩴ;Ll/۟ۙᩴ;)Ll/᩺ۙᩴ;

    move-result-object p0

    .line 2260
    invoke-static {p1}, Ll/ᩳ۬ᩴ;->g0(Ljava/io/DataInput;)Ll/ᩳ۬ᩴ;

    move-result-object v0

    .line 250
    invoke-interface {p1}, Ljava/io/ObjectInput;->readByte()B

    move-result v1

    .line 251
    invoke-static {v1, p1}, Ll/᩷ۗᩴ;->a(BLjava/io/ObjectInput;)Ljava/lang/Object;

    move-result-object p1

    .line 2261
    check-cast p1, Ll/ۚ᩹ᩴ;

    const-string v1, "localDateTime"

    .line 517
    invoke-static {p0, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v1, "offset"

    .line 518
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v1, "zone"

    .line 519
    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 520
    instance-of v1, p1, Ll/ᩳ۬ᩴ;

    if-eqz v1, :cond_2

    invoke-virtual {v0, p1}, Ll/ᩳ۬ᩴ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 521
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "ZoneId must match ZoneOffset"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 523
    :cond_2
    :goto_0
    new-instance v1, Ll/֨᩹ᩴ;

    invoke-direct {v1, p0, p1, v0}, Ll/֨᩹ᩴ;-><init>(Ll/᩺ۙᩴ;Ll/ۚ᩹ᩴ;Ll/ᩳ۬ᩴ;)V

    return-object v1

    .line 259
    :pswitch_9
    sget-object p0, Ll/᩺ۙᩴ;->c:Ll/᩺ۙᩴ;

    .line 2008
    sget-object p0, Ll/ᩴ᩹ᩴ;->d:Ll/ᩴ᩹ᩴ;

    .line 2224
    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    move-result p0

    .line 2225
    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    move-result v0

    .line 2226
    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    move-result v1

    .line 2227
    invoke-static {p0, v0, v1}, Ll/ᩴ᩹ᩴ;->h0(III)Ll/ᩴ᩹ᩴ;

    move-result-object p0

    .line 2009
    invoke-static {p1}, Ll/۟ۙᩴ;->g0(Ljava/io/DataInput;)Ll/۟ۙᩴ;

    move-result-object p1

    .line 2010
    invoke-static {p0, p1}, Ll/᩺ۙᩴ;->Y(Ll/ᩴ᩹ᩴ;Ll/۟ۙᩴ;)Ll/᩺ۙᩴ;

    move-result-object p0

    return-object p0

    .line 260
    :pswitch_a
    invoke-static {p1}, Ll/۟ۙᩴ;->g0(Ljava/io/DataInput;)Ll/۟ۙᩴ;

    move-result-object p0

    return-object p0

    .line 258
    :pswitch_b
    sget-object p0, Ll/ᩴ᩹ᩴ;->d:Ll/ᩴ᩹ᩴ;

    .line 2224
    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    move-result p0

    .line 2225
    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    move-result v0

    .line 2226
    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    move-result p1

    .line 2227
    invoke-static {p0, v0, p1}, Ll/ᩴ᩹ᩴ;->h0(III)Ll/ᩴ᩹ᩴ;

    move-result-object p0

    return-object p0

    .line 257
    :pswitch_c
    sget-object p0, Ll/ۘ᩹ᩴ;->EPOCH:Ll/ۘ᩹ᩴ;

    .line 1366
    invoke-interface {p1}, Ljava/io/DataInput;->readLong()J

    move-result-wide v0

    .line 1367
    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    move-result p0

    int-to-long p0, p0

    .line 1368
    invoke-static {v0, v1, p0, p1}, Ll/ۘ᩹ᩴ;->ofEpochSecond(JJ)Ll/ۘ᩹ᩴ;

    move-result-object p0

    return-object p0

    .line 256
    :pswitch_d
    sget-object p0, Ll/ۖ᩹ᩴ;->ZERO:Ll/ۖ᩹ᩴ;

    .line 1552
    invoke-interface {p1}, Ljava/io/DataInput;->readLong()J

    move-result-wide v0

    .line 1553
    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    move-result p0

    int-to-long p0, p0

    .line 1554
    invoke-static {v0, v1, p0, p1}, Ll/ۖ᩹ᩴ;->s(JJ)Ll/ۖ᩹ᩴ;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1

    .line 281
    iget-object v0, p0, Ll/᩷ۗᩴ;->b:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public final readExternal(Ljava/io/ObjectInput;)V
    .locals 1

    .line 245
    invoke-interface {p1}, Ljava/io/ObjectInput;->readByte()B

    move-result v0

    iput-byte v0, p0, Ll/᩷ۗᩴ;->a:B

    .line 246
    invoke-static {v0, p1}, Ll/᩷ۗᩴ;->a(BLjava/io/ObjectInput;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۗᩴ;->b:Ljava/lang/Object;

    return-void
.end method

.method public final writeExternal(Ljava/io/ObjectOutput;)V
    .locals 4

    .line 162
    iget-byte v0, p0, Ll/᩷ۗᩴ;->a:B

    iget-object v1, p0, Ll/᩷ۗᩴ;->b:Ljava/lang/Object;

    .line 166
    invoke-interface {p1, v0}, Ljava/io/ObjectOutput;->writeByte(I)V

    packed-switch v0, :pswitch_data_0

    .line 211
    new-instance p1, Ljava/io/InvalidClassException;

    const-string v0, "Unknown serialized type"

    invoke-direct {p1, v0}, Ljava/io/InvalidClassException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 208
    :pswitch_0
    check-cast v1, Ll/ۜۗᩴ;

    .line 1074
    iget v0, v1, Ll/ۜۗᩴ;->a:I

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeInt(I)V

    .line 1075
    iget v0, v1, Ll/ۜۗᩴ;->b:I

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeInt(I)V

    .line 1076
    iget v0, v1, Ll/ۜۗᩴ;->c:I

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeInt(I)V

    return-void

    .line 205
    :pswitch_1
    check-cast v1, Ll/ᩳۗᩴ;

    .line 782
    iget v0, v1, Ll/ᩳۗᩴ;->a:I

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 783
    iget v0, v1, Ll/ᩳۗᩴ;->b:I

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    return-void

    .line 202
    :pswitch_2
    check-cast v1, Ll/ܽ۬ᩴ;

    .line 1240
    iget v0, v1, Ll/ܽ۬ᩴ;->a:I

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeInt(I)V

    .line 1241
    iget v0, v1, Ll/ܽ۬ᩴ;->b:I

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    return-void

    .line 199
    :pswitch_3
    check-cast v1, Ll/֫۬ᩴ;

    .line 1115
    iget v0, v1, Ll/֫۬ᩴ;->a:I

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeInt(I)V

    return-void

    .line 196
    :pswitch_4
    check-cast v1, Ll/᩵᩹ᩴ;

    .line 1943
    iget-object v0, v1, Ll/᩵᩹ᩴ;->a:Ll/᩺ۙᩴ;

    .line 2003
    iget-object v2, v0, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    .line 2218
    iget v3, v2, Ll/ᩴ᩹ᩴ;->a:I

    invoke-interface {p1, v3}, Ljava/io/DataOutput;->writeInt(I)V

    .line 2219
    iget-short v3, v2, Ll/ᩴ᩹ᩴ;->b:S

    invoke-interface {p1, v3}, Ljava/io/DataOutput;->writeByte(I)V

    .line 2220
    iget-short v2, v2, Ll/ᩴ᩹ᩴ;->c:S

    invoke-interface {p1, v2}, Ljava/io/DataOutput;->writeByte(I)V

    .line 2004
    iget-object v0, v0, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {v0, p1}, Ll/۟ۙᩴ;->l0(Ljava/io/DataOutput;)V

    .line 1944
    iget-object v0, v1, Ll/᩵᩹ᩴ;->b:Ll/ᩳ۬ᩴ;

    invoke-virtual {v0, p1}, Ll/ᩳ۬ᩴ;->h0(Ljava/io/DataOutput;)V

    return-void

    .line 193
    :pswitch_5
    check-cast v1, Ll/᩻ۗᩴ;

    .line 1428
    iget-object v0, v1, Ll/᩻ۗᩴ;->a:Ll/۟ۙᩴ;

    invoke-virtual {v0, p1}, Ll/۟ۙᩴ;->l0(Ljava/io/DataOutput;)V

    .line 1429
    iget-object v0, v1, Ll/᩻ۗᩴ;->b:Ll/ᩳ۬ᩴ;

    invoke-virtual {v0, p1}, Ll/ᩳ۬ᩴ;->h0(Ljava/io/DataOutput;)V

    return-void

    .line 187
    :pswitch_6
    check-cast v1, Ll/ᩳ۬ᩴ;

    invoke-virtual {v1, p1}, Ll/ᩳ۬ᩴ;->h0(Ljava/io/DataOutput;)V

    return-void

    .line 184
    :pswitch_7
    check-cast v1, Ll/ܿ۬ᩴ;

    .line 213
    iget-object v0, v1, Ll/ܿ۬ᩴ;->b:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeUTF(Ljava/lang/String;)V

    return-void

    .line 190
    :pswitch_8
    check-cast v1, Ll/֨᩹ᩴ;

    .line 2253
    iget-object v0, v1, Ll/֨᩹ᩴ;->a:Ll/᩺ۙᩴ;

    .line 2003
    iget-object v2, v0, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    .line 2218
    iget v3, v2, Ll/ᩴ᩹ᩴ;->a:I

    invoke-interface {p1, v3}, Ljava/io/DataOutput;->writeInt(I)V

    .line 2219
    iget-short v3, v2, Ll/ᩴ᩹ᩴ;->b:S

    invoke-interface {p1, v3}, Ljava/io/DataOutput;->writeByte(I)V

    .line 2220
    iget-short v2, v2, Ll/ᩴ᩹ᩴ;->c:S

    invoke-interface {p1, v2}, Ljava/io/DataOutput;->writeByte(I)V

    .line 2004
    iget-object v0, v0, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {v0, p1}, Ll/۟ۙᩴ;->l0(Ljava/io/DataOutput;)V

    .line 2254
    iget-object v0, v1, Ll/֨᩹ᩴ;->b:Ll/ᩳ۬ᩴ;

    invoke-virtual {v0, p1}, Ll/ᩳ۬ᩴ;->h0(Ljava/io/DataOutput;)V

    .line 2255
    iget-object v0, v1, Ll/֨᩹ᩴ;->c:Ll/ۚ᩹ᩴ;

    invoke-virtual {v0, p1}, Ll/ۚ᩹ᩴ;->a0(Ljava/io/DataOutput;)V

    return-void

    .line 178
    :pswitch_9
    check-cast v1, Ll/᩺ۙᩴ;

    .line 2003
    iget-object v0, v1, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    .line 2218
    iget v2, v0, Ll/ᩴ᩹ᩴ;->a:I

    invoke-interface {p1, v2}, Ljava/io/DataOutput;->writeInt(I)V

    .line 2219
    iget-short v2, v0, Ll/ᩴ᩹ᩴ;->b:S

    invoke-interface {p1, v2}, Ljava/io/DataOutput;->writeByte(I)V

    .line 2220
    iget-short v0, v0, Ll/ᩴ᩹ᩴ;->c:S

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 2004
    iget-object v0, v1, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {v0, p1}, Ll/۟ۙᩴ;->l0(Ljava/io/DataOutput;)V

    return-void

    .line 181
    :pswitch_a
    check-cast v1, Ll/۟ۙᩴ;

    invoke-virtual {v1, p1}, Ll/۟ۙᩴ;->l0(Ljava/io/DataOutput;)V

    return-void

    .line 175
    :pswitch_b
    check-cast v1, Ll/ᩴ᩹ᩴ;

    .line 2218
    iget v0, v1, Ll/ᩴ᩹ᩴ;->a:I

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeInt(I)V

    .line 2219
    iget-short v0, v1, Ll/ᩴ᩹ᩴ;->b:S

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 2220
    iget-short v0, v1, Ll/ᩴ᩹ᩴ;->c:S

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    return-void

    .line 172
    :pswitch_c
    check-cast v1, Ll/ۘ᩹ᩴ;

    .line 1361
    iget-wide v2, v1, Ll/ۘ᩹ᩴ;->a:J

    invoke-interface {p1, v2, v3}, Ljava/io/DataOutput;->writeLong(J)V

    .line 1362
    iget v0, v1, Ll/ۘ᩹ᩴ;->b:I

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeInt(I)V

    return-void

    .line 169
    :pswitch_d
    check-cast v1, Ll/ۖ᩹ᩴ;

    .line 1547
    iget-wide v2, v1, Ll/ۖ᩹ᩴ;->a:J

    invoke-interface {p1, v2, v3}, Ljava/io/DataOutput;->writeLong(J)V

    .line 1548
    iget v0, v1, Ll/ۖ᩹ᩴ;->b:I

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeInt(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
