.class public final Ll/᩹᩺ܿ;
.super Ljava/lang/Object;
.source "P70J"

# interfaces
.implements Ljava/io/DataInput;


# instance fields
.field public final ᩸:Ll/ܿۖ᩷;

.field public final ᩹:Ljava/io/DataInputStream;


# direct methods
.method public constructor <init>(Ljava/io/DataInputStream;Ll/ܿۖ᩷;)V
    .locals 0

    .line 577
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 578
    iput-object p1, p0, Ll/᩹᩺ܿ;->᩹:Ljava/io/DataInputStream;

    .line 579
    iput-object p2, p0, Ll/᩹᩺ܿ;->᩸:Ll/ܿۖ᩷;

    return-void
.end method


# virtual methods
.method public final readBoolean()Z
    .locals 1

    .line 622
    iget-object v0, p0, Ll/᩹᩺ܿ;->᩸:Ll/ܿۖ᩷;

    invoke-static {v0}, Ll/۫᩺ܿ;->֫(Ll/ܿۖ᩷;)V

    .line 623
    iget-object v0, p0, Ll/᩹᩺ܿ;->᩹:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readBoolean()Z

    move-result v0

    return v0
.end method

.method public final readByte()B
    .locals 1

    .line 628
    iget-object v0, p0, Ll/᩹᩺ܿ;->᩸:Ll/ܿۖ᩷;

    invoke-static {v0}, Ll/۫᩺ܿ;->֫(Ll/ܿۖ᩷;)V

    .line 629
    iget-object v0, p0, Ll/᩹᩺ܿ;->᩹:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readByte()B

    move-result v0

    return v0
.end method

.method public final readChar()C
    .locals 1

    .line 652
    iget-object v0, p0, Ll/᩹᩺ܿ;->᩸:Ll/ܿۖ᩷;

    invoke-static {v0}, Ll/۫᩺ܿ;->֫(Ll/ܿۖ᩷;)V

    .line 653
    iget-object v0, p0, Ll/᩹᩺ܿ;->᩹:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readChar()C

    move-result v0

    return v0
.end method

.method public final readDouble()D
    .locals 2

    .line 676
    iget-object v0, p0, Ll/᩹᩺ܿ;->᩸:Ll/ܿۖ᩷;

    invoke-static {v0}, Ll/۫᩺ܿ;->֫(Ll/ܿۖ᩷;)V

    .line 677
    iget-object v0, p0, Ll/᩹᩺ܿ;->᩹:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readDouble()D

    move-result-wide v0

    return-wide v0
.end method

.method public final readFloat()F
    .locals 1

    .line 670
    iget-object v0, p0, Ll/᩹᩺ܿ;->᩸:Ll/ܿۖ᩷;

    invoke-static {v0}, Ll/۫᩺ܿ;->֫(Ll/ܿۖ᩷;)V

    .line 671
    iget-object v0, p0, Ll/᩹᩺ܿ;->᩹:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readFloat()F

    move-result v0

    return v0
.end method

.method public final readFully([B)V
    .locals 2

    const/4 v0, 0x0

    .line 584
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/᩹᩺ܿ;->readFully([BII)V

    return-void
.end method

.method public final readFully([BII)V
    .locals 5

    if-ltz p2, :cond_1

    if-ltz p3, :cond_1

    int-to-long v0, p2

    int-to-long v2, p3

    add-long/2addr v0, v2

    .line 589
    array-length v2, p1

    int-to-long v2, v2

    cmp-long v4, v0, v2

    if-gtz v4, :cond_1

    .line 592
    iget-object v0, p0, Ll/᩹᩺ܿ;->᩸:Ll/ܿۖ᩷;

    invoke-static {v0}, Ll/۫᩺ܿ;->֫(Ll/ܿۖ᩷;)V

    add-int/2addr p3, p2

    :goto_0
    if-ge p2, p3, :cond_0

    const/high16 v1, 0x10000

    sub-int v2, p3, p2

    .line 595
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 596
    iget-object v2, p0, Ll/᩹᩺ܿ;->᩹:Ljava/io/DataInputStream;

    invoke-virtual {v2, p1, p2, v1}, Ljava/io/DataInputStream;->readFully([BII)V

    add-int/2addr p2, v1

    .line 598
    invoke-static {v0}, Ll/۫᩺ܿ;->֫(Ll/ܿۖ᩷;)V

    goto :goto_0

    :cond_0
    return-void

    .line 590
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "Invalid checkpoint input range"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final readInt()I
    .locals 1

    .line 658
    iget-object v0, p0, Ll/᩹᩺ܿ;->᩸:Ll/ܿۖ᩷;

    invoke-static {v0}, Ll/۫᩺ܿ;->֫(Ll/ܿۖ᩷;)V

    .line 659
    iget-object v0, p0, Ll/᩹᩺ܿ;->᩹:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v0

    return v0
.end method

.method public final readLine()Ljava/lang/String;
    .locals 2

    .line 682
    iget-object v0, p0, Ll/᩹᩺ܿ;->᩸:Ll/ܿۖ᩷;

    invoke-static {v0}, Ll/۫᩺ܿ;->֫(Ll/ܿۖ᩷;)V

    .line 683
    iget-object v1, p0, Ll/᩹᩺ܿ;->᩹:Ljava/io/DataInputStream;

    invoke-virtual {v1}, Ljava/io/DataInputStream;->readLine()Ljava/lang/String;

    move-result-object v1

    .line 684
    invoke-static {v0}, Ll/۫᩺ܿ;->֫(Ll/ܿۖ᩷;)V

    return-object v1
.end method

.method public final readLong()J
    .locals 2

    .line 664
    iget-object v0, p0, Ll/᩹᩺ܿ;->᩸:Ll/ܿۖ᩷;

    invoke-static {v0}, Ll/۫᩺ܿ;->֫(Ll/ܿۖ᩷;)V

    .line 665
    iget-object v0, p0, Ll/᩹᩺ܿ;->᩹:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readLong()J

    move-result-wide v0

    return-wide v0
.end method

.method public final readShort()S
    .locals 1

    .line 640
    iget-object v0, p0, Ll/᩹᩺ܿ;->᩸:Ll/ܿۖ᩷;

    invoke-static {v0}, Ll/۫᩺ܿ;->֫(Ll/ܿۖ᩷;)V

    .line 641
    iget-object v0, p0, Ll/᩹᩺ܿ;->᩹:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readShort()S

    move-result v0

    return v0
.end method

.method public final readUTF()Ljava/lang/String;
    .locals 2

    .line 690
    iget-object v0, p0, Ll/᩹᩺ܿ;->᩸:Ll/ܿۖ᩷;

    invoke-static {v0}, Ll/۫᩺ܿ;->֫(Ll/ܿۖ᩷;)V

    .line 691
    iget-object v1, p0, Ll/᩹᩺ܿ;->᩹:Ljava/io/DataInputStream;

    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v1

    .line 692
    invoke-static {v0}, Ll/۫᩺ܿ;->֫(Ll/ܿۖ᩷;)V

    return-object v1
.end method

.method public final readUnsignedByte()I
    .locals 1

    .line 634
    iget-object v0, p0, Ll/᩹᩺ܿ;->᩸:Ll/ܿۖ᩷;

    invoke-static {v0}, Ll/۫᩺ܿ;->֫(Ll/ܿۖ᩷;)V

    .line 635
    iget-object v0, p0, Ll/᩹᩺ܿ;->᩹:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v0

    return v0
.end method

.method public final readUnsignedShort()I
    .locals 1

    .line 646
    iget-object v0, p0, Ll/᩹᩺ܿ;->᩸:Ll/ܿۖ᩷;

    invoke-static {v0}, Ll/۫᩺ܿ;->֫(Ll/ܿۖ᩷;)V

    .line 647
    iget-object v0, p0, Ll/᩹᩺ܿ;->᩹:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v0

    return v0
.end method

.method public final skipBytes(I)I
    .locals 4

    const/4 v0, 0x0

    if-gez p1, :cond_0

    return v0

    .line 608
    :cond_0
    :goto_0
    iget-object v1, p0, Ll/᩹᩺ܿ;->᩸:Ll/ܿۖ᩷;

    if-ge v0, p1, :cond_2

    .line 609
    invoke-static {v1}, Ll/۫᩺ܿ;->֫(Ll/ܿۖ᩷;)V

    const/high16 v2, 0x10000

    sub-int v3, p1, v0

    .line 610
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget-object v3, p0, Ll/᩹᩺ܿ;->᩹:Ljava/io/DataInputStream;

    invoke-virtual {v3, v2}, Ljava/io/DataInputStream;->skipBytes(I)I

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    add-int/2addr v0, v2

    goto :goto_0

    .line 616
    :cond_2
    :goto_1
    invoke-static {v1}, Ll/۫᩺ܿ;->֫(Ll/ܿۖ᩷;)V

    return v0
.end method
