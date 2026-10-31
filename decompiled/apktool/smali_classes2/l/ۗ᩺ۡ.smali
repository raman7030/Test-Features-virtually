.class public final Ll/ۗ᩺ۡ;
.super Ljava/lang/Object;
.source "466O"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public ֫֫:I

.field public ۗ:[B

.field public ۙ:Ljava/lang/String;

.field public ۛ:I

.field public ۜ֫:J

.field public ۟:Ll/ۗ᩺ۡ;

.field public ۤ:J

.field public ۧ֫:[B

.field public ۨ:I

.field public ۫:I

.field public ۬:J

.field public ܰ:J

.field public ܳ֫:Ljava/lang/String;

.field public ܽ֫:I

.field public ܿ֫:[B

.field public ᩳ֫:Ljava/lang/String;

.field public ᩶:Ljava/util/ArrayList;

.field public ᩷֫:J

.field public ᩸:Ll/۠᩺ۡ;

.field public ᩹:[B

.field public ᩺:I

.field public ᩻֫:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 22
    iput v0, p0, Ll/ۗ᩺ۡ;->᩻֫:I

    const-wide/16 v1, -0x1

    .line 27
    iput-wide v1, p0, Ll/ۗ᩺ۡ;->۬:J

    .line 28
    iput-wide v1, p0, Ll/ۗ᩺ۡ;->ۜ֫:J

    .line 34
    iput v0, p0, Ll/ۗ᩺ۡ;->֫֫:I

    .line 35
    iput v0, p0, Ll/ۗ᩺ۡ;->ۨ:I

    .line 36
    iput-wide v1, p0, Ll/ۗ᩺ۡ;->ܰ:J

    .line 37
    iput-wide v1, p0, Ll/ۗ᩺ۡ;->ۤ:J

    const/4 v0, -0x1

    .line 44
    iput v0, p0, Ll/ۗ᩺ۡ;->ۛ:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 22
    iput v0, p0, Ll/ۗ᩺ۡ;->᩻֫:I

    const-wide/16 v1, -0x1

    .line 27
    iput-wide v1, p0, Ll/ۗ᩺ۡ;->۬:J

    .line 28
    iput-wide v1, p0, Ll/ۗ᩺ۡ;->ۜ֫:J

    .line 34
    iput v0, p0, Ll/ۗ᩺ۡ;->֫֫:I

    .line 35
    iput v0, p0, Ll/ۗ᩺ۡ;->ۨ:I

    .line 36
    iput-wide v1, p0, Ll/ۗ᩺ۡ;->ܰ:J

    .line 37
    iput-wide v1, p0, Ll/ۗ᩺ۡ;->ۤ:J

    const/4 v0, -0x1

    .line 44
    iput v0, p0, Ll/ۗ᩺ۡ;->ۛ:I

    .line 51
    invoke-virtual {p0, p1}, Ll/ۗ᩺ۡ;->ۧ(Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Ll/۠᩺ۡ;[B)Ljava/lang/String;
    .locals 5

    if-eqz p0, :cond_4

    if-nez p1, :cond_0

    goto :goto_0

    .line 336
    :cond_0
    invoke-virtual {p0}, Ll/۠᩺ۡ;->֫()[B

    move-result-object v0

    .line 337
    array-length v1, v0

    const/4 v2, 0x5

    if-ge v1, v2, :cond_1

    goto :goto_0

    .line 340
    :cond_1
    invoke-virtual {p0}, Ll/۠᩺ۡ;->ᩳ()I

    move-result v3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_2

    goto :goto_0

    .line 344
    :cond_2
    invoke-virtual {p0}, Ll/۠᩺ۡ;->ܽ()I

    move-result p0

    .line 345
    new-instance v3, Ljava/util/zip/CRC32;

    invoke-direct {v3}, Ljava/util/zip/CRC32;-><init>()V

    .line 346
    invoke-virtual {v3, p1}, Ljava/util/zip/CRC32;->update([B)V

    .line 347
    invoke-virtual {v3}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v3

    long-to-int p1, v3

    if-eq p0, p1, :cond_3

    goto :goto_0

    .line 349
    :cond_3
    new-instance p0, Ljava/lang/String;

    sub-int/2addr v1, v2

    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {p0, v0, v2, v1, p1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    return-object p0

    :cond_4
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private ۟()V
    .locals 3

    .line 417
    iget-object v0, p0, Ll/ۗ᩺ۡ;->۟:Ll/ۗ᩺ۡ;

    if-eqz v0, :cond_1

    .line 419
    iget-object v1, v0, Ll/ۗ᩺ۡ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 420
    iget-object v1, v0, Ll/ۗ᩺ۡ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 421
    iput-object v2, v0, Ll/ۗ᩺ۡ;->᩶:Ljava/util/ArrayList;

    .line 423
    :cond_0
    iput-object v2, p0, Ll/ۗ᩺ۡ;->۟:Ll/ۗ᩺ۡ;

    :cond_1
    return-void
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 20
    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->clone()Ll/ۗ᩺ۡ;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ll/ۗ᩺ۡ;
    .locals 2

    .line 432
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗ᩺ۡ;

    .line 433
    iget-object v1, p0, Ll/ۗ᩺ۡ;->᩸:Ll/۠᩺ۡ;

    if-eqz v1, :cond_0

    .line 434
    invoke-virtual {v1}, Ll/۠᩺ۡ;->clone()Ll/۠᩺ۡ;

    move-result-object v1

    iput-object v1, v0, Ll/ۗ᩺ۡ;->᩸:Ll/۠᩺ۡ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object v0

    :catch_0
    move-exception v0

    .line 437
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 124
    iget-object v0, p0, Ll/ۗ᩺ۡ;->ᩳ֫:Ljava/lang/String;

    return-object v0
.end method

.method public final getParent()Ljava/lang/String;
    .locals 4

    .line 375
    iget-object v0, p0, Ll/ۗ᩺ۡ;->ᩳ֫:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 377
    :cond_0
    iget-object v0, p0, Ll/ۗ᩺ۡ;->ᩳ֫:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    .line 378
    iget-object v2, p0, Ll/ۗ᩺ۡ;->ᩳ֫:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x2f

    if-ne v2, v3, :cond_1

    add-int/lit8 v1, v0, -0x2

    .line 380
    :cond_1
    iget-object v0, p0, Ll/ۗ᩺ۡ;->ᩳ֫:Ljava/lang/String;

    invoke-virtual {v0, v3, v1}, Ljava/lang/String;->lastIndexOf(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_2

    const-string v0, ""

    return-object v0

    .line 383
    :cond_2
    iget-object v1, p0, Ll/ۗ᩺ۡ;->ᩳ֫:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getSize()J
    .locals 2

    .line 112
    iget-wide v0, p0, Ll/ۗ᩺ۡ;->ۜ֫:J

    return-wide v0
.end method

.method public final getTime()J
    .locals 2

    .line 83
    iget-wide v0, p0, Ll/ۗ᩺ۡ;->᩷֫:J

    return-wide v0
.end method

.method public final isDirectory()Z
    .locals 2

    .line 124
    iget-object v0, p0, Ll/ۗ᩺ۡ;->ᩳ֫:Ljava/lang/String;

    const-string v1, "/"

    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final setTime(J)V
    .locals 0

    .line 87
    iput-wide p1, p0, Ll/ۗ᩺ۡ;->᩷֫:J

    .line 88
    invoke-direct {p0}, Ll/ۗ᩺ۡ;->۟()V

    return-void
.end method

.method public final ֡()[B
    .locals 1

    .line 157
    iget-object v0, p0, Ll/ۗ᩺ۡ;->ۧ֫:[B

    return-object v0
.end method

.method public final ֨()I
    .locals 1

    .line 71
    iget v0, p0, Ll/ۗ᩺ۡ;->ܽ֫:I

    return v0
.end method

.method public final ֫()I
    .locals 2

    .line 256
    iget-object v0, p0, Ll/ۗ᩺ۡ;->᩸:Ll/۠᩺ۡ;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ll/۠᩺ۡ;->֫()[B

    move-result-object v0

    const/4 v1, 0x4

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 100
    iput p1, p0, Ll/ۗ᩺ۡ;->۫:I

    return-void
.end method

.method public final ֫(J)V
    .locals 0

    .line 108
    iput-wide p1, p0, Ll/ۗ᩺ۡ;->۬:J

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 152
    iput-object p1, p0, Ll/ۗ᩺ۡ;->ۙ:Ljava/lang/String;

    .line 153
    invoke-direct {p0}, Ll/ۗ᩺ۡ;->۟()V

    return-void
.end method

.method public final ֫(Ljava/nio/charset/Charset;ZZ)V
    .locals 5

    .line 300
    iget-object v0, p0, Ll/ۗ᩺ۡ;->ۧ֫:[B

    if-eqz v0, :cond_0

    array-length v1, v0

    if-nez v1, :cond_1

    :cond_0
    const/4 p2, 0x0

    :cond_1
    const/4 v1, 0x0

    if-eqz p2, :cond_2

    const/16 v2, 0x7075

    .line 306
    invoke-static {v2, v0}, Ll/۠᩺ۡ;->֫(I[B)Ll/۠᩺ۡ;

    move-result-object v0

    iget-object v2, p0, Ll/ۗ᩺ۡ;->ܿ֫:[B

    invoke-static {v0, v2}, Ll/ۗ᩺ۡ;->֫(Ll/۠᩺ۡ;[B)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_3

    .line 309
    new-instance v0, Ljava/lang/String;

    iget-object v2, p0, Ll/ۗ᩺ۡ;->ܿ֫:[B

    invoke-direct {v0, v2, p1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    :cond_3
    if-nez p3, :cond_4

    const/16 p3, 0x5c

    .line 310
    invoke-virtual {v0, p3}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_4

    const/16 v2, 0x2f

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-ne v4, v3, :cond_4

    .line 311
    invoke-virtual {v0, p3, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Ll/ۗ᩺ۡ;->ᩳ֫:Ljava/lang/String;

    .line 312
    iput-object v0, p0, Ll/ۗ᩺ۡ;->ܳ֫:Ljava/lang/String;

    goto :goto_1

    .line 314
    :cond_4
    iput-object v0, p0, Ll/ۗ᩺ۡ;->ᩳ֫:Ljava/lang/String;

    .line 315
    iput-object v1, p0, Ll/ۗ᩺ۡ;->ܳ֫:Ljava/lang/String;

    .line 317
    :goto_1
    iput-object v1, p0, Ll/ۗ᩺ۡ;->ܿ֫:[B

    .line 319
    iget-object p3, p0, Ll/ۗ᩺ۡ;->ۗ:[B

    if-nez p3, :cond_5

    return-void

    :cond_5
    if-eqz p2, :cond_6

    .line 325
    iget-object p2, p0, Ll/ۗ᩺ۡ;->ۧ֫:[B

    const/16 p3, 0x6375

    invoke-static {p3, p2}, Ll/۠᩺ۡ;->֫(I[B)Ll/۠᩺ۡ;

    move-result-object p2

    iget-object p3, p0, Ll/ۗ᩺ۡ;->ۗ:[B

    invoke-static {p2, p3}, Ll/ۗ᩺ۡ;->֫(Ll/۠᩺ۡ;[B)Ljava/lang/String;

    move-result-object p2

    goto :goto_2

    :cond_6
    move-object p2, v1

    :goto_2
    if-nez p2, :cond_7

    .line 328
    new-instance p2, Ljava/lang/String;

    iget-object p3, p0, Ll/ۗ᩺ۡ;->ۗ:[B

    invoke-direct {p2, p3, p1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 329
    :cond_7
    invoke-virtual {p0, p2}, Ll/ۗ᩺ۡ;->֫(Ljava/lang/String;)V

    .line 330
    iput-object v1, p0, Ll/ۗ᩺ۡ;->ۗ:[B

    return-void
.end method

.method public final ֫(Ll/ۗ᩺ۡ;)V
    .locals 3

    .line 389
    iput-object p1, p0, Ll/ۗ᩺ۡ;->۟:Ll/ۗ᩺ۡ;

    .line 390
    iget-object v0, p1, Ll/ۗ᩺ۡ;->᩶:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 391
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p1, Ll/ۗ᩺ۡ;->᩶:Ljava/util/ArrayList;

    .line 393
    :cond_0
    iget-object v0, p1, Ll/ۗ᩺ۡ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 394
    iget-object v0, p0, Ll/ۗ᩺ۡ;->᩶:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 396
    iput-object v1, p0, Ll/ۗ᩺ۡ;->᩶:Ljava/util/ArrayList;

    .line 397
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗ᩺ۡ;

    .line 398
    iput-object v1, v2, Ll/ۗ᩺ۡ;->۟:Ll/ۗ᩺ۡ;

    .line 399
    invoke-virtual {v2, p1}, Ll/ۗ᩺ۡ;->֫(Ll/ۗ᩺ۡ;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ֫(Ll/۠᩺ۡ;)V
    .locals 0

    .line 269
    iput-object p1, p0, Ll/ۗ᩺ۡ;->᩸:Ll/۠᩺ۡ;

    return-void
.end method

.method public final ֫(Ll/ܶ᩺ۡ;)V
    .locals 2

    .line 157
    iget-object v0, p0, Ll/ۗ᩺ۡ;->ۧ֫:[B

    const/16 v1, 0x4d54

    .line 223
    invoke-virtual {p1}, Ll/ܶ᩺ۡ;->֫()[B

    move-result-object p1

    invoke-static {v1, v0, p1}, Ll/۠᩺ۡ;->֫(I[B[B)[B

    move-result-object p1

    .line 165
    iput-object p1, p0, Ll/ۗ᩺ۡ;->ۧ֫:[B

    return-void
.end method

.method public final ֫([B)V
    .locals 0

    .line 169
    iput-object p1, p0, Ll/ۗ᩺ۡ;->᩹:[B

    return-void
.end method

.method public final ۖ()J
    .locals 2

    .line 240
    iget-wide v0, p0, Ll/ۗ᩺ۡ;->ܰ:J

    return-wide v0
.end method

.method public final ۗ()I
    .locals 2

    .line 208
    iget v0, p0, Ll/ۗ᩺ۡ;->᩻֫:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 181
    :cond_0
    iget v0, p0, Ll/ۗ᩺ۡ;->ۨ:I

    shr-int/lit8 v0, v0, 0x10

    const v1, 0xffff

    and-int/2addr v0, v1

    return v0
.end method

.method public final ۘ()Ll/ۗ᩺ۡ;
    .locals 1

    .line 413
    iget-object v0, p0, Ll/ۗ᩺ۡ;->۟:Ll/ۗ᩺ۡ;

    return-object v0
.end method

.method public final ۚ()Ll/ܶ᩺ۡ;
    .locals 2

    .line 157
    iget-object v0, p0, Ll/ۗ᩺ۡ;->ۧ֫:[B

    const/16 v1, 0x4d54

    .line 213
    invoke-static {v1, v0}, Ll/۠᩺ۡ;->֫(I[B)Ll/۠᩺ۡ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 215
    new-instance v1, Ll/ܶ᩺ۡ;

    .line 8
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 216
    invoke-virtual {v0}, Ll/۠᩺ۡ;->֫()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ܶ᩺ۡ;->֫([B)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۛ()Z
    .locals 1

    .line 405
    iget-object v0, p0, Ll/ۗ᩺ۡ;->᩶:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۜ()I
    .locals 1

    .line 92
    iget v0, p0, Ll/ۗ᩺ۡ;->۫:I

    return v0
.end method

.method public final ۠()Ljava/lang/String;
    .locals 3

    .line 136
    iget-object v0, p0, Ll/ۗ᩺ۡ;->ᩳ֫:Ljava/lang/String;

    const-string v1, "[:\\\\*?<>\"|]"

    const-string v2, "_"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\s"

    const-string v2, " "

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۡ()I
    .locals 1

    .line 181
    iget v0, p0, Ll/ۗ᩺ۡ;->ۨ:I

    return v0
.end method

.method public final ۢ()I
    .locals 1

    .line 227
    iget v0, p0, Ll/ۗ᩺ۡ;->ۛ:I

    return v0
.end method

.method public final ۤ()Z
    .locals 1

    .line 63
    iget v0, p0, Ll/ۗ᩺ۡ;->᩺:I

    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ(J)V
    .locals 0

    .line 252
    iput-wide p1, p0, Ll/ۗ᩺ۡ;->ۤ:J

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    if-nez p1, :cond_0

    const-string p1, ""

    .line 142
    :cond_0
    iput-object p1, p0, Ll/ۗ᩺ۡ;->ᩳ֫:Ljava/lang/String;

    const/4 p1, 0x0

    .line 143
    iput-object p1, p0, Ll/ۗ᩺ۡ;->ܳ֫:Ljava/lang/String;

    .line 144
    invoke-direct {p0}, Ll/ۗ᩺ۡ;->۟()V

    return-void
.end method

.method public final ۧ([B)V
    .locals 0

    .line 357
    iput-object p1, p0, Ll/ۗ᩺ۡ;->ۗ:[B

    return-void
.end method

.method public final ۨ()Z
    .locals 1

    .line 409
    iget-object v0, p0, Ll/ۗ᩺ۡ;->۟:Ll/ۗ᩺ۡ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۫()J
    .locals 4

    .line 96
    iget v0, p0, Ll/ۗ᩺ۡ;->۫:I

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    return-wide v0
.end method

.method public final ܰ()Z
    .locals 1

    .line 232
    iget v0, p0, Ll/ۗ᩺ۡ;->ۛ:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܳ()J
    .locals 2

    .line 104
    iget-wide v0, p0, Ll/ۗ᩺ۡ;->۬:J

    return-wide v0
.end method

.method public final ܳ(I)V
    .locals 0

    .line 177
    iput p1, p0, Ll/ۗ᩺ۡ;->֫֫:I

    return-void
.end method

.method public final ܶ()I
    .locals 1

    .line 55
    iget v0, p0, Ll/ۗ᩺ۡ;->᩻֫:I

    return v0
.end method

.method public final ܺ()I
    .locals 1

    .line 63
    iget v0, p0, Ll/ۗ᩺ۡ;->᩺:I

    return v0
.end method

.method public final ܽ()I
    .locals 4

    .line 261
    iget-object v0, p0, Ll/ۗ᩺ۡ;->᩸:Ll/۠᩺ۡ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/۠᩺ۡ;->֫()[B

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_0

    .line 264
    iget-object v0, p0, Ll/ۗ᩺ۡ;->᩸:Ll/۠᩺ۡ;

    invoke-virtual {v0}, Ll/۠᩺ۡ;->֫()[B

    move-result-object v0

    const/4 v1, 0x0

    .line 265
    aget-byte v1, v0, v1

    and-int/lit16 v1, v1, 0xff

    const/4 v2, 0x1

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    or-int/2addr v0, v1

    return v0

    .line 262
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Missing or invalid AES extra data ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    iget-object v2, p0, Ll/ۗ᩺ۡ;->ᩳ֫:Ljava/lang/String;

    const-string v3, ")"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 262
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ(I)V
    .locals 0

    .line 236
    iput p1, p0, Ll/ۗ᩺ۡ;->ۛ:I

    return-void
.end method

.method public final ܽ(J)V
    .locals 0

    .line 244
    iput-wide p1, p0, Ll/ۗ᩺ۡ;->ܰ:J

    return-void
.end method

.method public final ܽ([B)V
    .locals 0

    .line 165
    iput-object p1, p0, Ll/ۗ᩺ۡ;->ۧ֫:[B

    return-void
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 148
    iget-object v0, p0, Ll/ۗ᩺ۡ;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܿ(I)V
    .locals 0

    .line 67
    iput p1, p0, Ll/ۗ᩺ۡ;->᩺:I

    return-void
.end method

.method public final ܿ([B)Z
    .locals 7

    const/4 v0, 0x1

    .line 273
    invoke-static {v0, p1}, Ll/۠᩺ۡ;->֫(I[B)Ll/۠᩺ۡ;

    move-result-object v1

    const/4 v2, 0x0

    const-wide v3, 0xffffffffL

    if-nez v1, :cond_1

    .line 275
    iget-wide v0, p0, Ll/ۗ᩺ۡ;->۬:J

    cmp-long v5, v0, v3

    if-eqz v5, :cond_0

    iget-wide v0, p0, Ll/ۗ᩺ۡ;->ۜ֫:J

    cmp-long v5, v0, v3

    if-eqz v5, :cond_0

    iget-wide v0, p0, Ll/ۗ᩺ۡ;->ܰ:J

    cmp-long v5, v0, v3

    if-eqz v5, :cond_0

    return v2

    .line 278
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "File contains no zip64 extended information: name="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/lang/String;

    iget-object v3, p0, Ll/ۗ᩺ۡ;->ܿ֫:[B

    invoke-direct {v2, v3}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", compressedSize="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Ll/ۗ᩺ۡ;->۬:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", size="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Ll/ۗ᩺ۡ;->ۜ֫:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", headerOffset="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Ll/ۗ᩺ۡ;->ܰ:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", extra="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    invoke-static {p1}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 285
    :cond_1
    iget-wide v5, p0, Ll/ۗ᩺ۡ;->ۜ֫:J

    cmp-long p1, v5, v3

    if-nez p1, :cond_2

    .line 286
    invoke-virtual {v1, v2}, Ll/۠᩺ۡ;->֫(I)J

    move-result-wide v5

    iput-wide v5, p0, Ll/ۗ᩺ۡ;->ۜ֫:J

    const/16 v2, 0x8

    .line 289
    :cond_2
    iget-wide v5, p0, Ll/ۗ᩺ۡ;->۬:J

    cmp-long p1, v5, v3

    if-nez p1, :cond_3

    .line 290
    invoke-virtual {v1, v2}, Ll/۠᩺ۡ;->֫(I)J

    move-result-wide v5

    iput-wide v5, p0, Ll/ۗ᩺ۡ;->۬:J

    add-int/lit8 v2, v2, 0x8

    .line 293
    :cond_3
    iget-wide v5, p0, Ll/ۗ᩺ۡ;->ܰ:J

    cmp-long p1, v5, v3

    if-nez p1, :cond_4

    .line 294
    invoke-virtual {v1, v2}, Ll/۠᩺ۡ;->֫(I)J

    move-result-wide v1

    iput-wide v1, p0, Ll/ۗ᩺ۡ;->ܰ:J

    :cond_4
    return v0
.end method

.method public final ᩳ(I)V
    .locals 0

    .line 185
    iput p1, p0, Ll/ۗ᩺ۡ;->ۨ:I

    return-void
.end method

.method public final ᩳ(J)V
    .locals 0

    .line 116
    iput-wide p1, p0, Ll/ۗ᩺ۡ;->ۜ֫:J

    return-void
.end method

.method public final ᩳ([B)V
    .locals 0

    .line 353
    iput-object p1, p0, Ll/ۗ᩺ۡ;->ܿ֫:[B

    return-void
.end method

.method public final ᩳ()[B
    .locals 1

    .line 161
    iget-object v0, p0, Ll/ۗ᩺ۡ;->᩹:[B

    return-object v0
.end method

.method public final ᩴ()Z
    .locals 2

    .line 79
    iget v0, p0, Ll/ۗ᩺ۡ;->᩺:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩵()I
    .locals 1

    .line 173
    iget v0, p0, Ll/ۗ᩺ۡ;->֫֫:I

    return v0
.end method

.method public final ᩶()Ljava/lang/String;
    .locals 4

    .line 365
    iget-object v0, p0, Ll/ۗ᩺ۡ;->ᩳ֫:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    return-object v0

    .line 367
    :cond_0
    iget-object v0, p0, Ll/ۗ᩺ۡ;->ᩳ֫:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    .line 368
    iget-object v2, p0, Ll/ۗ᩺ۡ;->ᩳ֫:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x2f

    if-ne v2, v3, :cond_1

    add-int/lit8 v1, v0, -0x2

    .line 370
    :cond_1
    iget-object v0, p0, Ll/ۗ᩺ۡ;->ᩳ֫:Ljava/lang/String;

    invoke-virtual {v0, v3, v1}, Ljava/lang/String;->lastIndexOf(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 371
    iget-object v2, p0, Ll/ۗ᩺ۡ;->ᩳ֫:Ljava/lang/String;

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()J
    .locals 2

    .line 248
    iget-wide v0, p0, Ll/ۗ᩺ۡ;->ۤ:J

    return-wide v0
.end method

.method public final ᩷(I)V
    .locals 0

    .line 59
    iput p1, p0, Ll/ۗ᩺ۡ;->᩻֫:I

    return-void
.end method

.method public final ᩹()Ljava/lang/String;
    .locals 1

    .line 128
    iget-object v0, p0, Ll/ۗ᩺ۡ;->ܳ֫:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 130
    iget-object v0, p0, Ll/ۗ᩺ۡ;->ᩳ֫:Ljava/lang/String;

    :cond_0
    return-object v0
.end method

.method public final ᩻(I)V
    .locals 0

    .line 75
    iput p1, p0, Ll/ۗ᩺ۡ;->ܽ֫:I

    return-void
.end method
