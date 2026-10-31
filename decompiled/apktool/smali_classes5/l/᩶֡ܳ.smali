.class public final Ll/᩶֡ܳ;
.super Ll/֡۬ܿ;
.source "XAJ9"


# instance fields
.field public final ۬:[B


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/ۙ֡ܳ;)V
    .locals 7

    .line 426
    new-instance v0, Ll/ۤۜܽ;

    invoke-direct {v0}, Ll/ۤۜܽ;-><init>()V

    const/16 v1, 0x4d

    .line 427
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    const/16 v1, 0x54

    .line 428
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    const/4 v1, 0x0

    .line 429
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    const/16 v1, 0x53

    .line 430
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    const/16 v1, 0x50

    .line 431
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    const/16 v1, 0x45

    .line 432
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    const/16 v1, 0x43

    .line 433
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    const/16 v1, 0x49

    .line 434
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    const/16 v1, 0x41

    .line 435
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    const/16 v1, 0x4c

    .line 436
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    const/4 v1, 0x1

    .line 437
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    .line 438
    iget-char v1, p2, Ll/ۙ֡ܳ;->֫:C

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    const/4 v2, 0x2

    .line 439
    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->writeByte(I)V

    .line 440
    iget-wide v2, p2, Ll/ۙ֡ܳ;->ۧ:J

    invoke-virtual {v0, v2, v3}, Ll/ۤۜܽ;->ۧ(J)V

    .line 441
    invoke-virtual {v0}, Ll/ۤۜܽ;->᩻()[B

    move-result-object p2

    .line 563
    array-length v0, p2

    int-to-long v4, v0

    const/16 v0, 0x62

    if-eq v1, v0, :cond_1

    const/16 v0, 0x63

    if-ne v1, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "special-path:"

    .line 0
    invoke-static {v0, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 449
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v6, "special-content:"

    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 563
    :goto_1
    invoke-direct {p0, p1, v4, v5, v0}, Ll/֡۬ܿ;-><init>(Ljava/lang/String;JLjava/lang/Object;)V

    .line 564
    iput-object p2, p0, Ll/᩶֡ܳ;->۬:[B

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/io/InputStream;
    .locals 2

    .line 569
    new-instance v0, Ljava/io/ByteArrayInputStream;

    iget-object v1, p0, Ll/᩶֡ܳ;->۬:[B

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object v0
.end method
