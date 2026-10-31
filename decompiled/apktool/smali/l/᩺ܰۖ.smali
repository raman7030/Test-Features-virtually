.class public abstract Ll/᩺ܰۖ;
.super Ljava/lang/Object;
.source "V9HU"


# static fields
.field public static final ֫:Ll/᩺ܰۖ;

.field public static final ۧ:Ll/᩺ܰۖ;

.field public static final ܽ:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [B

    .line 27
    fill-array-data v0, :array_0

    sput-object v0, Ll/᩺ܰۖ;->ܽ:[B

    .line 29
    new-instance v0, Ll/ۨܰۖ;

    .line 26
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 29
    sput-object v0, Ll/᩺ܰۖ;->ۧ:Ll/᩺ܰۖ;

    .line 30
    new-instance v0, Ll/ۛܰۖ;

    .line 26
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 30
    sput-object v0, Ll/᩺ܰۖ;->֫:Ll/᩺ܰۖ;

    return-void

    nop

    :array_0
    .array-data 1
        0x0t
        0x0t
    .end array-data
.end method

.method public static ֫(Ll/ۤܰۖ;ILjava/nio/charset/Charset;)Ljava/lang/String;
    .locals 1

    mul-int/lit8 p1, p1, 0x2

    .line 44
    new-array v0, p1, [B

    .line 293
    invoke-virtual {p0, p1, v0}, Ll/ۤܰۖ;->ۧ(I[B)V

    .line 46
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v0, p2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object p0
.end method

.method public static ֫(Ll/ۤܰۖ;Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 5

    .line 33
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/4 v1, 0x2

    new-array v2, v1, [B

    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    :goto_0
    invoke-virtual {p0, v1, v2}, Ll/ۤܰۖ;->ۧ(I[B)V

    const/4 v3, 0x0

    .line 36
    aget-byte v4, v2, v3

    if-nez v4, :cond_1

    const/4 v4, 0x1

    aget-byte v4, v2, v4

    if-eqz v4, :cond_0

    goto :goto_1

    .line 40
    :cond_0
    new-instance p0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-direct {p0, v0, p1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object p0

    .line 37
    :cond_1
    :goto_1
    invoke-virtual {v0, v2, v3, v1}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0
.end method


# virtual methods
.method public abstract ֫(Ll/ۤܰۖ;)J
.end method

.method public final ֫(Ll/֡֫ۘ;Ljava/lang/String;)V
    .locals 1

    .line 50
    invoke-virtual {p0, p1, p2}, Ll/᩺ܰۖ;->֫(Ll/ۤܰۖ;Ljava/lang/String;)V

    .line 51
    sget-object p2, Ll/᩺ܰۖ;->ܽ:[B

    const/4 v0, 0x2

    .line 318
    invoke-virtual {p1, v0, p2}, Ll/ۤܰۖ;->֫(I[B)V

    return-void
.end method

.method public abstract ֫(Ll/ۤܰۖ;J)V
.end method

.method public abstract ֫(Ll/ۤܰۖ;Ljava/lang/String;)V
.end method

.method public abstract ۧ(Ll/ۤܰۖ;)J
.end method
