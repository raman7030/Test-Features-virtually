.class public final Ll/ܳ֫᩷;
.super Ljava/lang/Object;
.source "R9L1"


# instance fields
.field public ֫:I

.field public ۧ:[B

.field public ܽ:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [B

    const/4 v1, 0x0

    .line 36
    iget v2, p0, Ll/ܳ֫᩷;->ܽ:I

    invoke-static {v1, v2, v0}, Ll/ܺܰۡ;->֫(II[B)V

    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " dataLen="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ll/ܳ֫᩷;->ۧ:[B

    array-length v0, v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()V
    .locals 2

    .line 23
    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    .line 24
    iget v1, p0, Ll/ܳ֫᩷;->ܽ:I

    and-int/lit16 v1, v1, 0xff

    invoke-virtual {v0, v1}, Ljava/util/zip/CRC32;->update(I)V

    .line 25
    iget v1, p0, Ll/ܳ֫᩷;->ܽ:I

    ushr-int/lit8 v1, v1, 0x8

    and-int/lit16 v1, v1, 0xff

    invoke-virtual {v0, v1}, Ljava/util/zip/CRC32;->update(I)V

    .line 26
    iget v1, p0, Ll/ܳ֫᩷;->ܽ:I

    ushr-int/lit8 v1, v1, 0x10

    and-int/lit16 v1, v1, 0xff

    invoke-virtual {v0, v1}, Ljava/util/zip/CRC32;->update(I)V

    .line 27
    iget v1, p0, Ll/ܳ֫᩷;->ܽ:I

    ushr-int/lit8 v1, v1, 0x18

    and-int/lit16 v1, v1, 0xff

    invoke-virtual {v0, v1}, Ljava/util/zip/CRC32;->update(I)V

    .line 28
    iget-object v1, p0, Ll/ܳ֫᩷;->ۧ:[B

    invoke-virtual {v0, v1}, Ljava/util/zip/CRC32;->update([B)V

    .line 29
    invoke-virtual {v0}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v0

    long-to-int v1, v0

    .line 19
    iput v1, p0, Ll/ܳ֫᩷;->֫:I

    return-void
.end method
