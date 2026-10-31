.class public final Ll/ۧܿ᩻;
.super Ljava/lang/Object;
.source "195F"

# interfaces
.implements Ll/֫ܿ᩻;


# instance fields
.field public final ֫:Ljava/nio/charset/Charset;

.field public ۜ:Ljava/io/BufferedWriter;

.field public final ۧ:Ljava/lang/String;

.field public ܳ:Ljava/io/OutputStream;

.field public final ܽ:I

.field public final ܿ:[B

.field public final ᩳ:Ll/ܰᩳ᩻;

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/ܰᩳ᩻;ILjava/nio/charset/Charset;[BLjava/lang/String;)V
    .locals 1

    .line 1529
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 1525
    iput v0, p0, Ll/ۧܿ᩻;->᩻:I

    .line 1530
    iput-object p1, p0, Ll/ۧܿ᩻;->ᩳ:Ll/ܰᩳ᩻;

    .line 1531
    iput p2, p0, Ll/ۧܿ᩻;->ܽ:I

    .line 1532
    iput-object p3, p0, Ll/ۧܿ᩻;->֫:Ljava/nio/charset/Charset;

    .line 1533
    iput-object p4, p0, Ll/ۧܿ᩻;->ܿ:[B

    .line 1534
    iput-object p5, p0, Ll/ۧܿ᩻;->ۧ:Ljava/lang/String;

    return-void
.end method

.method private ܳ()V
    .locals 4

    .line 1590
    iget-object v0, p0, Ll/ۧܿ᩻;->ۜ:Ljava/io/BufferedWriter;

    if-eqz v0, :cond_0

    return-void

    .line 1593
    :cond_0
    iget v0, p0, Ll/ۧܿ᩻;->᩻:I

    iget v1, p0, Ll/ۧܿ᩻;->ܽ:I

    iget-object v2, p0, Ll/ۧܿ᩻;->ᩳ:Ll/ܰᩳ᩻;

    invoke-virtual {v2, v0, v1}, Ll/ܰᩳ᩻;->֫(II)Ljava/io/OutputStream;

    move-result-object v0

    iput-object v0, p0, Ll/ۧܿ᩻;->ܳ:Ljava/io/OutputStream;

    .line 1594
    iget v1, p0, Ll/ۧܿ᩻;->᩻:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Ll/ۧܿ᩻;->ܿ:[B

    if-eqz v1, :cond_1

    .line 1595
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 1597
    :cond_1
    new-instance v0, Ljava/io/BufferedWriter;

    new-instance v1, Ljava/io/OutputStreamWriter;

    iget-object v2, p0, Ll/ۧܿ᩻;->ܳ:Ljava/io/OutputStream;

    iget-object v3, p0, Ll/ۧܿ᩻;->֫:Ljava/nio/charset/Charset;

    invoke-direct {v1, v2, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    iput-object v0, p0, Ll/ۧܿ᩻;->ۜ:Ljava/io/BufferedWriter;

    return-void
.end method

.method private ܿ()V
    .locals 2

    .line 1612
    iget-object v0, p0, Ll/ۧܿ᩻;->ۜ:Ljava/io/BufferedWriter;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 1613
    invoke-virtual {v0}, Ljava/io/Writer;->close()V

    .line 1614
    iput-object v1, p0, Ll/ۧܿ᩻;->ۜ:Ljava/io/BufferedWriter;

    .line 1615
    iput-object v1, p0, Ll/ۧܿ᩻;->ܳ:Ljava/io/OutputStream;

    return-void

    .line 1616
    :cond_0
    iget-object v0, p0, Ll/ۧܿ᩻;->ܳ:Ljava/io/OutputStream;

    if-eqz v0, :cond_1

    .line 1617
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 1618
    iput-object v1, p0, Ll/ۧܿ᩻;->ܳ:Ljava/io/OutputStream;

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 1563
    invoke-direct {p0}, Ll/ۧܿ᩻;->ܳ()V

    .line 1564
    invoke-direct {p0}, Ll/ۧܿ᩻;->ܿ()V

    .line 1565
    iget-object v0, p0, Ll/ۧܿ᩻;->ᩳ:Ll/ܰᩳ᩻;

    invoke-virtual {v0}, Ll/ܰᩳ᩻;->ۧ()V

    .line 1566
    iget v0, p0, Ll/ۧܿ᩻;->᩻:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۧܿ᩻;->᩻:I

    return-void
.end method

.method public final ֫(C)V
    .locals 1

    .line 1547
    invoke-direct {p0}, Ll/ۧܿ᩻;->ܳ()V

    const/16 v0, 0xa

    if-ne p1, v0, :cond_0

    .line 1605
    iget-object p1, p0, Ll/ۧܿ᩻;->ۜ:Ljava/io/BufferedWriter;

    iget-object v0, p0, Ll/ۧܿ᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void

    .line 1607
    :cond_0
    iget-object v0, p0, Ll/ۧܿ᩻;->ۜ:Ljava/io/BufferedWriter;

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(I)V

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    .line 1553
    invoke-direct {p0}, Ll/ۧܿ᩻;->ܳ()V

    const/16 v0, 0xa

    if-ne p1, v0, :cond_0

    .line 1555
    iget-object p1, p0, Ll/ۧܿ᩻;->ۜ:Ljava/io/BufferedWriter;

    iget-object v0, p0, Ll/ۧܿ᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void

    .line 1557
    :cond_0
    iget-object v0, p0, Ll/ۧܿ᩻;->ۜ:Ljava/io/BufferedWriter;

    invoke-static {p1}, Ljava/lang/Character;->toChars(I)[C

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write([C)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 3

    .line 1539
    invoke-direct {p0}, Ll/ۧܿ᩻;->ܳ()V

    const/4 v0, 0x0

    .line 1540
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 1541
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0xa

    if-ne v1, v2, :cond_0

    .line 1605
    iget-object v1, p0, Ll/ۧܿ᩻;->ۜ:Ljava/io/BufferedWriter;

    iget-object v2, p0, Ll/ۧܿ᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_1

    .line 1607
    :cond_0
    iget-object v2, p0, Ll/ۧܿ᩻;->ۜ:Ljava/io/BufferedWriter;

    invoke-virtual {v2, v1}, Ljava/io/Writer;->write(I)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 1571
    iget v0, p0, Ll/ۧܿ᩻;->᩻:I

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final ܽ()V
    .locals 1

    .line 1581
    :try_start_0
    invoke-direct {p0}, Ll/ۧܿ᩻;->ܿ()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1576
    :catch_0
    iget-object v0, p0, Ll/ۧܿ᩻;->ᩳ:Ll/ܰᩳ᩻;

    invoke-virtual {v0}, Ll/ܰᩳ᩻;->֫()V

    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 1581
    :try_start_0
    invoke-direct {p0}, Ll/ۧܿ᩻;->ܿ()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
