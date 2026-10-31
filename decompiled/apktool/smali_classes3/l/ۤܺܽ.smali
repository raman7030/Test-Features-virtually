.class public Ll/ۤܺܽ;
.super Ljava/lang/Object;
.source "S5JT"


# instance fields
.field public final ۗ:Ll/ۙܺܽ;

.field public final ۙ:J

.field public final ۬:J

.field public final ᩶:I

.field public final ᩸:J

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/ۙܺܽ;I)V
    .locals 5

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iget-object v0, p1, Ll/ۙܺܽ;->֫:Ljava/nio/ByteBuffer;

    .line 38
    iput-object p1, p0, Ll/ۤܺܽ;->ۗ:Ll/ۙܺܽ;

    .line 39
    invoke-virtual {v0, p2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    iput v1, p0, Ll/ۤܺܽ;->᩶:I

    add-int/lit8 v1, p2, 0x4

    .line 40
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 42
    iget-boolean p1, p1, Ll/ۙܺܽ;->ۧ:Z

    if-eqz p1, :cond_0

    add-int/lit8 p1, p2, 0x8

    .line 43
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getLong(I)J

    add-int/lit8 p1, p2, 0x10

    .line 44
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getLong(I)J

    add-int/lit8 p1, p2, 0x18

    .line 45
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v1

    iput-wide v1, p0, Ll/ۤܺܽ;->ۙ:J

    add-int/lit8 p1, p2, 0x20

    .line 46
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v1

    iput-wide v1, p0, Ll/ۤܺܽ;->۬:J

    add-int/lit8 p1, p2, 0x28

    .line 47
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    iput p1, p0, Ll/ۤܺܽ;->᩹:I

    add-int/lit8 p1, p2, 0x2c

    .line 48
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    add-int/lit8 p1, p2, 0x30

    .line 49
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getLong(I)J

    add-int/lit8 p2, p2, 0x38

    .line 50
    invoke-virtual {v0, p2}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide p1

    iput-wide p1, p0, Ll/ۤܺܽ;->᩸:J

    return-void

    :cond_0
    add-int/lit8 p1, p2, 0x8

    .line 52
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    add-int/lit8 p1, p2, 0xc

    .line 53
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    add-int/lit8 p1, p2, 0x10

    .line 54
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    int-to-long v1, p1

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    iput-wide v1, p0, Ll/ۤܺܽ;->ۙ:J

    add-int/lit8 p1, p2, 0x14

    .line 55
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    int-to-long v1, p1

    and-long/2addr v1, v3

    iput-wide v1, p0, Ll/ۤܺܽ;->۬:J

    add-int/lit8 p1, p2, 0x18

    .line 56
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    iput p1, p0, Ll/ۤܺܽ;->᩹:I

    add-int/lit8 p1, p2, 0x1c

    .line 57
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    add-int/lit8 p1, p2, 0x20

    .line 58
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    add-int/lit8 p2, p2, 0x24

    .line 59
    invoke-virtual {v0, p2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    int-to-long p1, p1

    iput-wide p1, p0, Ll/ۤܺܽ;->᩸:J

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 109
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 64
    iget-object v1, p0, Ll/ۤܺܽ;->ۗ:Ll/ۙܺܽ;

    iget-object v1, v1, Ll/ۙܺܽ;->ᩳ:Ll/ۛܺܽ;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget v2, p0, Ll/ۤܺܽ;->᩶:I

    invoke-virtual {v1, v2}, Ll/ۛܺܽ;->֫(I)Ljava/lang/String;

    move-result-object v1

    .line 109
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
