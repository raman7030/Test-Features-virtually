.class public abstract Ll/ۙܳܳ;
.super Ljava/lang/Object;
.source "27BS"


# static fields
.field public static final ۜ:Ljava/util/regex/Pattern;

.field public static final ۢ:Ljava/util/logging/Logger;

.field public static final ܳ:Ljava/util/regex/Pattern;

.field public static final ᩷:Ljava/util/regex/Pattern;

.field public static final ᩻:Ljava/util/regex/Pattern;


# instance fields
.field public ֫:Ll/᩻ܳܳ;

.field public final ۧ:I

.field public volatile ܽ:Ljava/net/ServerSocket;

.field public ܿ:Ll/᩶ܳܳ;

.field public ᩳ:Ljava/lang/Thread;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "([ |\t]*Content-Disposition[ |\t]*:)(.*)"

    const/4 v1, 0x2

    .line 515
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ۙܳܳ;->᩻:Ljava/util/regex/Pattern;

    const-string v0, "([ |\t]*content-type[ |\t]*:)(.*)"

    .line 519
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ۙܳܳ;->ۜ:Ljava/util/regex/Pattern;

    const-string v0, "[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*[\'|\"]([^\"^\']*)[\'|\"]"

    .line 523
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ۙܳܳ;->ܳ:Ljava/util/regex/Pattern;

    const-string v0, "[-!#$%&\'*+.^_`|~0-9A-Za-z]+"

    .line 525
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ۙܳܳ;->᩷:Ljava/util/regex/Pattern;

    .line 2350
    const-class v0, Ll/ۙܳܳ;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Ll/ۙܳܳ;->ۢ:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 2463
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2465
    iput p1, p0, Ll/ۙܳܳ;->ۧ:I

    .line 2466
    new-instance p1, Ll/ۡܳܳ;

    .line 462
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 2763
    iput-object p1, p0, Ll/ۙܳܳ;->ܿ:Ll/᩶ܳܳ;

    .line 2467
    new-instance p1, Ll/᩻ܳܳ;

    invoke-direct {p1}, Ll/᩻ܳܳ;-><init>()V

    .line 2753
    iput-object p1, p0, Ll/ۙܳܳ;->֫:Ll/᩻ܳܳ;

    return-void
.end method

.method public static ֫(C)I
    .locals 2

    const/16 v0, 0x30

    if-lt p0, v0, :cond_0

    const/16 v1, 0x39

    if-gt p0, v1, :cond_0

    sub-int/2addr p0, v0

    return p0

    :cond_0
    const/16 v0, 0x61

    if-lt p0, v0, :cond_1

    const/16 v0, 0x66

    if-gt p0, v0, :cond_1

    add-int/lit8 p0, p0, -0x57

    return p0

    :cond_1
    const/16 v0, 0x41

    if-lt p0, v0, :cond_2

    const/16 v0, 0x46

    if-gt p0, v0, :cond_2

    add-int/lit8 p0, p0, -0x37

    return p0

    :cond_2
    const/4 p0, -0x1

    return p0
.end method

.method public static bridge synthetic ֫(Ll/ۙܳܳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۙܳܳ;->ۧ:I

    return p0
.end method

.method public static bridge synthetic ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-static {p0, v0}, Ll/ۙܳܳ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 6

    .line 2567
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 2568
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/4 v2, 0x0

    .line 2569
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_5

    .line 2570
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x25

    if-ne v3, v4, :cond_3

    .line 2572
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 2573
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_2

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-ne v3, v4, :cond_2

    add-int/lit8 v3, v2, 0x2

    .line 2574
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v3, v5, :cond_1

    add-int/lit8 v5, v2, 0x1

    .line 2577
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v5}, Ll/ۙܳܳ;->֫(C)I

    move-result v5

    .line 2578
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ll/ۙܳܳ;->֫(C)I

    move-result v3

    if-ltz v5, :cond_0

    if-ltz v3, :cond_0

    shl-int/lit8 v5, v5, 0x4

    add-int/2addr v5, v3

    .line 2582
    invoke-virtual {v1, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V

    add-int/lit8 v2, v2, 0x3

    goto :goto_1

    .line 2580
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid percent encoding"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 2575
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Incomplete percent encoding"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 2585
    :cond_2
    new-instance v3, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v4

    const-string v5, "UTF-8"

    invoke-static {v5}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_3
    const/16 v4, 0x2b

    if-ne v3, v4, :cond_4

    if-eqz p1, :cond_4

    const/16 v3, 0x20

    .line 2587
    :cond_4
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 2591
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/֨ܳܳ;Ljava/io/PipedInputStream;)Ll/۠ܳܳ;
    .locals 7

    .line 2655
    new-instance v6, Ll/۠ܳܳ;

    const-wide/16 v4, -0x1

    const-string v2, "application/zip"

    move-object v0, v6

    move-object v1, p0

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Ll/۠ܳܳ;-><init>(Ll/ۚܳܳ;Ljava/lang/String;Ljava/io/InputStream;J)V

    return-object v6
.end method

.method public static ֫(Ll/ۚܳܳ;Ljava/lang/String;Ljava/io/InputStream;J)Ll/۠ܳܳ;
    .locals 7

    .line 2662
    new-instance v6, Ll/۠ܳܳ;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Ll/۠ܳܳ;-><init>(Ll/ۚܳܳ;Ljava/lang/String;Ljava/io/InputStream;J)V

    return-object v6
.end method

.method public static ֫(Ll/ۚܳܳ;Ljava/lang/String;Ljava/lang/String;)Ll/۠ܳܳ;
    .locals 8

    .line 2669
    new-instance v0, Ll/ᩳܳܳ;

    invoke-direct {v0, p1}, Ll/ᩳܳܳ;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-nez p2, :cond_0

    .line 2671
    new-instance v5, Ljava/io/ByteArrayInputStream;

    new-array p2, v1, [B

    invoke-direct {v5, p2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 2662
    new-instance p2, Ll/۠ܳܳ;

    const-wide/16 v6, 0x0

    move-object v2, p2

    move-object v3, p0

    move-object v4, p1

    invoke-direct/range {v2 .. v7}, Ll/۠ܳܳ;-><init>(Ll/ۚܳܳ;Ljava/lang/String;Ljava/io/InputStream;J)V

    return-object p2

    .line 2675
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Ll/ᩳܳܳ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    move-result-object p1

    .line 2676
    invoke-virtual {p1, p2}, Ljava/nio/charset/CharsetEncoder;->canEncode(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 2677
    invoke-virtual {v0}, Ll/ᩳܳܳ;->ܳ()Ll/ᩳܳܳ;

    move-result-object v0

    .line 2679
    :cond_1
    invoke-virtual {v0}, Ll/ᩳܳܳ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 2681
    sget-object p2, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    const-string v2, "encoding problem, responding nothing"

    sget-object v3, Ll/ۙܳܳ;->ۢ:Ljava/util/logging/Logger;

    invoke-virtual {v3, p2, v2, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-array p1, v1, [B

    .line 2684
    :goto_0
    invoke-virtual {v0}, Ll/ᩳܳܳ;->ܽ()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/io/ByteArrayInputStream;

    invoke-direct {v4, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    array-length p1, p1

    int-to-long v5, p1

    .line 2662
    new-instance p1, Ll/۠ܳܳ;

    move-object v1, p1

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Ll/۠ܳܳ;-><init>(Ll/ۚܳܳ;Ljava/lang/String;Ljava/io/InputStream;J)V

    return-object p1
.end method

.method public static bridge synthetic ֫(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۙܳܳ;->ۧ(Ljava/lang/Object;)V

    return-void
.end method

.method public static bridge synthetic ۜ()Ljava/util/regex/Pattern;
    .locals 1

    .line 0
    sget-object v0, Ll/ۙܳܳ;->ۜ:Ljava/util/regex/Pattern;

    return-object v0
.end method

.method public static bridge synthetic ۢ()Ljava/util/logging/Logger;
    .locals 1

    .line 0
    sget-object v0, Ll/ۙܳܳ;->ۢ:Ljava/util/logging/Logger;

    return-object v0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    .line 2560
    invoke-static {p0, v0}, Ll/ۙܳܳ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۙܳܳ;)Ljava/net/ServerSocket;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۙܳܳ;->ܽ:Ljava/net/ServerSocket;

    return-object p0
.end method

.method public static final ۧ(Ljava/lang/Object;)V
    .locals 3

    if-eqz p0, :cond_3

    .line 2410
    :try_start_0
    instance-of v0, p0, Ljava/io/Closeable;

    if-eqz v0, :cond_0

    .line 2411
    check-cast p0, Ljava/io/Closeable;

    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    return-void

    .line 2412
    :cond_0
    instance-of v0, p0, Ljava/net/Socket;

    if-eqz v0, :cond_1

    .line 2413
    check-cast p0, Ljava/net/Socket;

    invoke-virtual {p0}, Ljava/net/Socket;->close()V

    return-void

    .line 2414
    :cond_1
    instance-of v0, p0, Ljava/net/ServerSocket;

    if-eqz v0, :cond_2

    .line 2415
    check-cast p0, Ljava/net/ServerSocket;

    invoke-virtual {p0}, Ljava/net/ServerSocket;->close()V

    return-void

    .line 2417
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown object to close"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    .line 2421
    sget-object v0, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    const-string v1, "Could not close"

    sget-object v2, Ll/ۙܳܳ;->ۢ:Ljava/util/logging/Logger;

    invoke-virtual {v2, v0, v1, p0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    return-void
.end method

.method public static bridge synthetic ܳ()Ljava/util/regex/Pattern;
    .locals 1

    .line 0
    sget-object v0, Ll/ۙܳܳ;->ܳ:Ljava/util/regex/Pattern;

    return-object v0
.end method

.method public static bridge synthetic ܽ(Ll/ۙܳܳ;)Ll/᩶ܳܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۙܳܳ;->ܿ:Ll/᩶ܳܳ;

    return-object p0
.end method

.method public static bridge synthetic ᩷()Ljava/util/regex/Pattern;
    .locals 1

    .line 0
    sget-object v0, Ll/ۙܳܳ;->᩷:Ljava/util/regex/Pattern;

    return-object v0
.end method

.method public static bridge synthetic ᩻()Ljava/util/regex/Pattern;
    .locals 1

    .line 0
    sget-object v0, Ll/ۙܳܳ;->᩻:Ljava/util/regex/Pattern;

    return-object v0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 2621
    iget-object v0, p0, Ll/ۙܳܳ;->ܽ:Ljava/net/ServerSocket;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    iget-object v0, p0, Ll/ۙܳܳ;->ܽ:Ljava/net/ServerSocket;

    invoke-virtual {v0}, Ljava/net/ServerSocket;->getLocalPort()I

    move-result v0

    return v0
.end method

.method public ֫(Ll/ܺܳܳ;)Ll/۠ܳܳ;
    .locals 4

    .line 2706
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 2707
    invoke-virtual {p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v1

    .line 2708
    sget-object v2, Ll/ۘܳܳ;->ۧ֫:Ll/ۘܳܳ;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "text/plain"

    if-nez v2, :cond_0

    sget-object v2, Ll/ۘܳܳ;->ܰ:Ll/ۘܳܳ;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2710
    :cond_0
    :try_start_0
    invoke-virtual {p1, v0}, Ll/ܺܳܳ;->֫(Ljava/util/HashMap;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/ܶܳܳ; {:try_start_0 .. :try_end_0} :catch_0

    .line 2718
    :cond_1
    invoke-virtual {p1}, Ll/ܺܳܳ;->ۜ()Ljava/util/HashMap;

    move-result-object v0

    const-string v1, "NanoHttpd.QUERY_STRING"

    .line 2719
    invoke-virtual {p1}, Ll/ܺܳܳ;->᩷()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2743
    sget-object p1, Ll/֨ܳܳ;->ᩳ֫:Ll/֨ܳܳ;

    const-string v0, "Not Found"

    invoke-static {p1, v3, v0}, Ll/ۙܳܳ;->֫(Ll/ۚܳܳ;Ljava/lang/String;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 2714
    invoke-virtual {p1}, Ll/ܶܳܳ;->֫()Ll/֨ܳܳ;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v3, p1}, Ll/ۙܳܳ;->֫(Ll/ۚܳܳ;Ljava/lang/String;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    :catch_1
    move-exception p1

    .line 2712
    sget-object v0, Ll/֨ܳܳ;->ܰ:Ll/֨ܳܳ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SERVER INTERNAL ERROR: IOException: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v3, p1}, Ll/ۙܳܳ;->֫(Ll/ۚܳܳ;Ljava/lang/String;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Ll/۠ܳܳ;)Z
    .locals 2

    .line 2617
    invoke-virtual {p1}, Ll/۠ܳܳ;->ܽ()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ll/۠ܳܳ;->ܽ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "text/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ll/۠ܳܳ;->ܽ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const-string v0, "/json"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()Z
    .locals 1

    .line 2625
    invoke-virtual {p0}, Ll/ۙܳܳ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۙܳܳ;->ܽ:Ljava/net/ServerSocket;

    invoke-virtual {v0}, Ljava/net/ServerSocket;->isClosed()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۙܳܳ;->ᩳ:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()V
    .locals 3

    .line 477
    new-instance v0, Ljava/net/ServerSocket;

    invoke-direct {v0}, Ljava/net/ServerSocket;-><init>()V

    .line 2794
    iput-object v0, p0, Ll/ۙܳܳ;->ܽ:Ljava/net/ServerSocket;

    .line 2795
    iget-object v0, p0, Ll/ۙܳܳ;->ܽ:Ljava/net/ServerSocket;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/net/ServerSocket;->setReuseAddress(Z)V

    .line 2500
    new-instance v0, Ll/᩸ܳܳ;

    invoke-direct {v0, p0}, Ll/᩸ܳܳ;-><init>(Ll/ۙܳܳ;)V

    .line 2798
    new-instance v2, Ljava/lang/Thread;

    invoke-direct {v2, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object v2, p0, Ll/ۙܳܳ;->ᩳ:Ljava/lang/Thread;

    .line 2799
    invoke-virtual {v2, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 2800
    iget-object v1, p0, Ll/ۙܳܳ;->ᩳ:Ljava/lang/Thread;

    const-string v2, "NanoHttpd Main Listener"

    invoke-virtual {v1, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 2801
    iget-object v1, p0, Ll/ۙܳܳ;->ᩳ:Ljava/lang/Thread;

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 2802
    :goto_0
    invoke-static {v0}, Ll/᩸ܳܳ;->ۧ(Ll/᩸ܳܳ;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ll/᩸ܳܳ;->֫(Ll/᩸ܳܳ;)Ljava/io/IOException;

    move-result-object v1

    if-nez v1, :cond_0

    const-wide/16 v1, 0xa

    .line 2804
    :try_start_0
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    nop

    goto :goto_0

    .line 2811
    :cond_0
    invoke-static {v0}, Ll/᩸ܳܳ;->֫(Ll/᩸ܳܳ;)Ljava/io/IOException;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    .line 2812
    :cond_1
    invoke-static {v0}, Ll/᩸ܳܳ;->֫(Ll/᩸ܳܳ;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 2832
    iget-object v0, p0, Ll/ۙܳܳ;->ܽ:Ljava/net/ServerSocket;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۙܳܳ;->ᩳ:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ᩳ()V
    .locals 4

    .line 2821
    :try_start_0
    iget-object v0, p0, Ll/ۙܳܳ;->ܽ:Ljava/net/ServerSocket;

    invoke-static {v0}, Ll/ۙܳܳ;->ۧ(Ljava/lang/Object;)V

    .line 2822
    iget-object v0, p0, Ll/ۙܳܳ;->֫:Ll/᩻ܳܳ;

    invoke-virtual {v0}, Ll/᩻ܳܳ;->֫()V

    .line 2823
    iget-object v0, p0, Ll/ۙܳܳ;->ᩳ:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    .line 2824
    invoke-virtual {v0}, Ljava/lang/Thread;->join()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    .line 2827
    sget-object v1, Ll/ۙܳܳ;->ۢ:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    const-string v3, "Could not stop all connections"

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
