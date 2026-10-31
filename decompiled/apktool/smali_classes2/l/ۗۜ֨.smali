.class public final Ll/ۗۜ֨;
.super Ll/ۙۜ֨;
.source "L1RM"


# instance fields
.field public final ܳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 19
    new-instance v0, Ll/ۖۜ֨;

    const-string v1, "XZ Stream or its Index has grown too big"

    .line 20
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 19
    invoke-direct {p0, v0}, Ll/ۙۜ֨;-><init>(Ll/ۖۜ֨;)V

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۗۜ֨;->ܳ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫(JJ)V
    .locals 1

    .line 25
    invoke-super {p0, p1, p2, p3, p4}, Ll/ۙۜ֨;->֫(JJ)V

    .line 26
    new-instance v0, Ll/۫ۜ֨;

    invoke-direct {v0, p1, p2, p3, p4}, Ll/۫ۜ֨;-><init>(JJ)V

    iget-object p1, p0, Ll/ۗۜ֨;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ljava/io/OutputStream;)V
    .locals 7

    .line 30
    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    .line 31
    new-instance v1, Ljava/util/zip/CheckedOutputStream;

    invoke-direct {v1, p1, v0}, Ljava/util/zip/CheckedOutputStream;-><init>(Ljava/io/OutputStream;Ljava/util/zip/Checksum;)V

    const/4 v2, 0x0

    .line 34
    invoke-virtual {v1, v2}, Ljava/util/zip/CheckedOutputStream;->write(I)V

    .line 37
    iget-wide v3, p0, Ll/ۙۜ֨;->ᩳ:J

    invoke-static {v1, v3, v4}, Ll/᩸ۜ֨;->֫(Ljava/io/OutputStream;J)V

    .line 40
    iget-object v3, p0, Ll/ۗۜ֨;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۫ۜ֨;

    .line 41
    iget-wide v5, v4, Ll/۫ۜ֨;->ۧ:J

    invoke-static {v1, v5, v6}, Ll/᩸ۜ֨;->֫(Ljava/io/OutputStream;J)V

    .line 42
    iget-wide v4, v4, Ll/۫ۜ֨;->֫:J

    invoke-static {v1, v4, v5}, Ll/᩸ۜ֨;->֫(Ljava/io/OutputStream;J)V

    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {p0}, Ll/ۙۜ֨;->֫()I

    move-result v3

    :goto_1
    if-lez v3, :cond_1

    .line 47
    invoke-virtual {v1, v2}, Ljava/util/zip/CheckedOutputStream;->write(I)V

    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    .line 50
    :cond_1
    invoke-virtual {v0}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v0

    :goto_2
    const/4 v3, 0x4

    if-ge v2, v3, :cond_2

    mul-int/lit8 v3, v2, 0x8

    ushr-long v3, v0, v3

    long-to-int v4, v3

    int-to-byte v3, v4

    .line 52
    invoke-virtual {p1, v3}, Ljava/io/OutputStream;->write(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final ܽ()J
    .locals 6

    .line 31
    iget-wide v0, p0, Ll/ۙۜ֨;->֫:J

    const-wide/16 v2, 0xc

    add-long/2addr v0, v2

    invoke-virtual {p0}, Ll/ۙۜ֨;->ۧ()J

    move-result-wide v4

    add-long/2addr v4, v0

    add-long/2addr v4, v2

    return-wide v4
.end method
