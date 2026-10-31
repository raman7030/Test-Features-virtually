.class public final Ll/۫᩶ᩳ;
.super Ljava/lang/Object;
.source "T6SQ"


# instance fields
.field public final ֫:Ljava/util/UUID;

.field public final ۧ:[B

.field public final ܽ:J

.field public final ᩳ:[B


# direct methods
.method public constructor <init>(Ljava/util/UUID;J[B[B)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Ll/۫᩶ᩳ;->֫:Ljava/util/UUID;

    iput-wide p2, p0, Ll/۫᩶ᩳ;->ܽ:J

    if-nez p4, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p4}, [B->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    :goto_0
    iput-object p1, p0, Ll/۫᩶ᩳ;->ۧ:[B

    .line 32
    invoke-virtual {p5}, [B->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Ll/۫᩶ᩳ;->ᩳ:[B

    return-void
.end method

.method public static ۧ([B)Ll/۫᩶ᩳ;
    .locals 13

    .line 60
    array-length v0, p0

    const/16 v1, 0x50

    if-lt v0, v1, :cond_6

    array-length v0, p0

    const/16 v2, 0x2000

    if-gt v0, v2, :cond_6

    .line 61
    new-instance v0, Ll/۬ۜܽ;

    invoke-direct {v0, p0}, Ll/۬ۜܽ;-><init>([B)V

    .line 62
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    const v3, 0x4d324d47    # 1.86963056E8f

    if-ne v2, v3, :cond_5

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_5

    .line 63
    new-instance v5, Ljava/util/UUID;

    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v6

    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v8

    invoke-direct {v5, v6, v7, v8, v9}, Ljava/util/UUID;-><init>(JJ)V

    .line 64
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v4

    .line 65
    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v6

    const/16 v8, 0x20

    new-array v9, v8, [B

    .line 212
    invoke-virtual {v0, v8, v9}, Ll/۬ۜܽ;->֫(I[B)V

    .line 67
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v10

    if-eqz v2, :cond_0

    if-ne v2, v3, :cond_4

    :cond_0
    if-nez v4, :cond_4

    const-wide/16 v3, 0x0

    cmp-long v11, v6, v3

    if-ltz v11, :cond_4

    const-wide/32 v3, 0x7fffffff

    cmp-long v12, v6, v3

    if-gtz v12, :cond_4

    .line 68
    array-length v3, p0

    sub-int/2addr v3, v1

    if-ne v10, v3, :cond_4

    if-nez v2, :cond_1

    if-nez v11, :cond_4

    new-array v1, v8, [B

    .line 69
    invoke-static {v9, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 211
    :cond_1
    new-array v1, v10, [B

    .line 212
    invoke-virtual {v0, v10, v1}, Ll/۬ۜܽ;->֫(I[B)V

    .line 73
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    array-length v3, p0

    add-int/lit8 v3, v3, -0x4

    const/4 v4, 0x0

    invoke-static {v4, v3, p0}, Ll/֫۫ᩳ;->֫(II[B)I

    move-result p0

    if-ne v0, p0, :cond_3

    .line 74
    new-instance p0, Ll/۫᩶ᩳ;

    if-nez v2, :cond_2

    const/4 v0, 0x0

    move-object v8, v0

    goto :goto_0

    :cond_2
    move-object v8, v9

    :goto_0
    move-object v4, p0

    move-object v9, v1

    invoke-direct/range {v4 .. v9}, Ll/۫᩶ᩳ;-><init>(Ljava/util/UUID;J[B[B)V

    return-object p0

    .line 73
    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid migration metadata checksum"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 70
    :cond_4
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid migration metadata fields"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 62
    :cond_5
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Unsupported migration metadata"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 60
    :cond_6
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid migration metadata length"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ܽ([B)[B
    .locals 4

    .line 46
    array-length v0, p1

    const/16 v1, 0x1fb0

    if-gt v0, v1, :cond_1

    .line 47
    new-instance v0, Ll/ۤۜܽ;

    array-length v1, p1

    add-int/lit8 v1, v1, 0x50

    invoke-direct {v0, v1}, Ll/ۤۜܽ;-><init>(I)V

    const v1, 0x4d324d47    # 1.86963056E8f

    .line 48
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 49
    iget-object v1, p0, Ll/۫᩶ᩳ;->֫:Ljava/util/UUID;

    invoke-virtual {v1}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ll/ۤۜܽ;->ۧ(J)V

    invoke-virtual {v1}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ۤۜܽ;->ۧ(J)V

    .line 50
    invoke-virtual {p0}, Ll/۫᩶ᩳ;->ۧ()Z

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 51
    iget-wide v2, p0, Ll/۫᩶ᩳ;->ܽ:J

    invoke-virtual {v0, v2, v3}, Ll/ۤۜܽ;->ۧ(J)V

    .line 52
    invoke-virtual {p0}, Ll/۫᩶ᩳ;->ۧ()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Ll/۫᩶ᩳ;->ۧ:[B

    goto :goto_0

    :cond_0
    const/16 v2, 0x20

    new-array v2, v2, [B

    :goto_0
    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->write([B)V

    .line 53
    array-length v2, p1

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 44
    array-length v2, p1

    invoke-virtual {v0, p1, v1, v2}, Ll/ۤۜܽ;->write([BII)V

    .line 54
    invoke-virtual {v0}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object p1

    invoke-virtual {v0}, Ll/ۤۜܽ;->size()I

    move-result v2

    invoke-static {v1, v2, p1}, Ll/֫۫ᩳ;->֫(II[B)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 55
    invoke-virtual {v0}, Ll/ۤۜܽ;->᩻()[B

    move-result-object p1

    return-object p1

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Migration user metadata is too large"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;)Ljava/io/InputStream;
    .locals 1

    .line 82
    invoke-virtual {p0}, Ll/۫᩶ᩳ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 83
    invoke-static {p1, p0, p2, v0}, Ll/ۛ᩶ᩳ;->֫(Ll/᩷۠ᩴ;Ll/۫᩶ᩳ;Ll/֨۬ᩳ;Ll/᩺۬ᩳ;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1

    .line 82
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Migration has no external state"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()[B
    .locals 1

    .line 43
    iget-object v0, p0, Ll/۫᩶ᩳ;->ᩳ:[B

    invoke-direct {p0, v0}, Ll/۫᩶ᩳ;->ܽ([B)[B

    move-result-object v0

    return-object v0
.end method

.method public final ֫([B)[B
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Ll/۫᩶ᩳ;->ܽ([B)[B

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;)V
    .locals 2

    .line 87
    invoke-virtual {p0}, Ll/۫᩶ᩳ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    sget-object v0, Ll/᩺۬ᩳ;->֫:Ll/᩺۬ᩳ;

    invoke-static {p1, p0, p2, v0}, Ll/ۛ᩶ᩳ;->֫(Ll/᩷۠ᩴ;Ll/۫᩶ᩳ;Ll/֨۬ᩳ;Ll/᩺۬ᩳ;)Ljava/io/InputStream;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    return-void

    :cond_0
    const-string p2, "migration-state.bin"

    .line 89
    invoke-interface {p1, p2}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p1

    const/4 p2, 0x1

    new-array p2, p2, [Ll/ܳ۠ᩴ;

    sget-object v0, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    const/4 v1, 0x0

    aput-object v0, p2, v1

    invoke-static {p1, p2}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result p1

    if-nez p1, :cond_1

    return-void

    .line 90
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Migration state file is not bound to its commit"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()Z
    .locals 1

    .line 36
    iget-object v0, p0, Ll/۫᩶ᩳ;->ۧ:[B

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Ljava/util/UUID;
    .locals 1

    .line 35
    iget-object v0, p0, Ll/۫᩶ᩳ;->֫:Ljava/util/UUID;

    return-object v0
.end method

.method public final ܿ()[B
    .locals 1

    .line 38
    iget-object v0, p0, Ll/۫᩶ᩳ;->ᩳ:[B

    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method

.method public final ᩳ()J
    .locals 2

    .line 37
    iget-wide v0, p0, Ll/۫᩶ᩳ;->ܽ:J

    return-wide v0
.end method
