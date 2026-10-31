.class public final Ll/ܰᩴۖ;
.super Ljava/lang/Object;
.source "P4D5"


# static fields
.field public static final ֫:[B

.field public static final ۧ:Ljava/nio/charset/Charset;

.field public static final ܽ:Ljava/nio/charset/Charset;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "US-ASCII"

    .line 35
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    const-string v0, "UTF-8"

    .line 36
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Ll/ܰᩴۖ;->ܽ:Ljava/nio/charset/Charset;

    const-string v0, "ISO-8859-1"

    .line 37
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Ll/ܰᩴۖ;->ۧ:Ljava/nio/charset/Charset;

    const/4 v0, 0x0

    new-array v1, v0, [B

    .line 360
    sput-object v1, Ll/ܰᩴۖ;->֫:[B

    .line 363
    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 117
    invoke-static {v0, v0, v0, v1}, Ll/۟ۜۖ;->֫(ZII[B)Ll/۟ۜۖ;

    return-void
.end method

.method public static ֫(J)I
    .locals 2

    const/16 v0, 0x20

    ushr-long v0, p0, v0

    xor-long/2addr p0, v0

    long-to-int p1, p0

    return p1
.end method

.method public static ֫(Z)I
    .locals 0

    if-eqz p0, :cond_0

    const/16 p0, 0x4cf

    return p0

    :cond_0
    const/16 p0, 0x4d5

    return p0
.end method

.method public static ֫(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    if-eqz p0, :cond_0

    return-void

    .line 50
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
