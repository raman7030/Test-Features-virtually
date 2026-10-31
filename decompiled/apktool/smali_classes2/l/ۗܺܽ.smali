.class public final Ll/ۗܺܽ;
.super Ljava/lang/Object;
.source "954P"


# instance fields
.field public final ֫:J

.field public final ۧ:J

.field public final ܽ:Ll/ܰܺܽ;


# direct methods
.method public constructor <init>(Ll/ۙܺܽ;Ll/۫ܺܽ;I)V
    .locals 6

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iget-object v0, p1, Ll/ۙܺܽ;->֫:Ljava/nio/ByteBuffer;

    .line 88
    iget-object v1, p2, Ll/ۤܺܽ;->ۗ:Ll/ۙܺܽ;

    iget-object v1, v1, Ll/ۙܺܽ;->ܽ:[Ll/ۤܺܽ;

    iget v2, p2, Ll/ۤܺܽ;->᩹:I

    aget-object v1, v1, v2

    .line 13
    iget-wide v2, p2, Ll/ۤܺܽ;->᩸:J

    check-cast v1, Ll/ܰܺܽ;

    iput-object v1, p0, Ll/ۗܺܽ;->ܽ:Ll/ܰܺܽ;

    .line 15
    iget-boolean p1, p1, Ll/ۙܺܽ;->ۧ:Z

    const-wide/16 v4, 0x0

    if-eqz p1, :cond_1

    .line 16
    invoke-virtual {v0, p3}, Ljava/nio/ByteBuffer;->getLong(I)J

    add-int/lit8 p1, p3, 0x8

    .line 17
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide p1

    iput-wide p1, p0, Ll/ۗܺܽ;->ۧ:J

    const-wide/16 p1, 0x18

    cmp-long v1, v2, p1

    if-ltz v1, :cond_0

    add-int/lit8 p3, p3, 0x10

    .line 18
    invoke-virtual {v0, p3}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v4

    :cond_0
    iput-wide v4, p0, Ll/ۗܺܽ;->֫:J

    return-void

    .line 20
    :cond_1
    invoke-virtual {v0, p3}, Ljava/nio/ByteBuffer;->getInt(I)I

    add-int/lit8 p1, p3, 0x4

    .line 21
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    int-to-long p1, p1

    iput-wide p1, p0, Ll/ۗܺܽ;->ۧ:J

    const-wide/16 p1, 0xc

    cmp-long v1, v2, p1

    if-ltz v1, :cond_2

    add-int/lit8 p3, p3, 0x8

    .line 22
    invoke-virtual {v0, p3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    int-to-long v4, p1

    :cond_2
    iput-wide v4, p0, Ll/ۗܺܽ;->֫:J

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 6

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x20

    .line 31
    iget-wide v2, p0, Ll/ۗܺܽ;->ۧ:J

    ushr-long v4, v2, v1

    long-to-int v1, v4

    iget-object v4, p0, Ll/ۗܺܽ;->ܽ:Ll/ܰܺܽ;

    invoke-virtual {v4, v1}, Ll/ܰܺܽ;->֫(I)Ll/ۨܺܽ;

    move-result-object v1

    .line 52
    iget-object v4, v1, Ll/ۨܺܽ;->ۧ:Ll/ۛܺܽ;

    if-nez v4, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget v1, v1, Ll/ۨܺܽ;->֫:I

    invoke-virtual {v4, v1}, Ll/ۛܺܽ;->֫(I)Ljava/lang/String;

    move-result-object v1

    .line 44
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    long-to-int v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/ۗܺܽ;->֫:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
