.class public final Ll/ۙۖ᩵;
.super Ljava/lang/Object;
.source "FA1X"

# interfaces
.implements Ll/᩹ۖ᩵;


# instance fields
.field public ᩸:Ljava/lang/String;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Ll/ۙۖ᩵;->᩸:Ljava/lang/String;

    const/4 p1, 0x0

    .line 49
    iput-boolean p1, p0, Ll/ۙۖ᩵;->᩹:Z

    return-void
.end method


# virtual methods
.method public final size()I
    .locals 1

    .line 106
    iget-object v0, p0, Ll/ۙۖ᩵;->᩸:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x14

    return v0
.end method

.method public final ֫(II[B)I
    .locals 3

    .line 61
    aget-byte p2, p3, p1

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Ll/ۙۖ᩵;->᩹:Z

    add-int/lit8 p2, p1, 0x10

    .line 65
    invoke-static {p2, p3}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result p2

    add-int/lit8 v1, p1, 0x14

    .line 67
    new-array v2, p2, [B

    .line 68
    invoke-static {p3, v1, v2, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v1, p2

    .line 70
    new-instance p2, Ljava/lang/String;

    sget-object p3, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    invoke-direct {p2, v2, p3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    iput-object p2, p0, Ll/ۙۖ᩵;->᩸:Ljava/lang/String;

    sub-int/2addr v1, p1

    return v1
.end method

.method public final ֫(I[B)I
    .locals 4

    .line 83
    iget-boolean v0, p0, Ll/ۙۖ᩵;->᩹:Z

    int-to-byte v0, v0

    aput-byte v0, p2, p1

    add-int/lit8 v0, p1, 0x10

    .line 87
    iget-object v1, p0, Ll/ۙۖ᩵;->᩸:Ljava/lang/String;

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    .line 89
    array-length v2, v1

    int-to-long v2, v2

    invoke-static {v2, v3, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v0, p1, 0x14

    const/4 v2, 0x0

    .line 92
    array-length v3, v1

    invoke-static {v1, v2, p2, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 93
    array-length p2, v1

    add-int/2addr v0, p2

    sub-int/2addr v0, p1

    return v0
.end method

.method public final ۧ()B
    .locals 1

    const/16 v0, 0xa

    return v0
.end method
