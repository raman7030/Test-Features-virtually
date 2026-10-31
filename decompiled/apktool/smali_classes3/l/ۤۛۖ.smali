.class public final Ll/ۤۛۖ;
.super Ljava/lang/Object;
.source "39GC"


# static fields
.field public static final ֫:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    .line 21
    sput-object v0, Ll/ۤۛۖ;->֫:[B

    return-void
.end method

.method public static ֫(Ljava/lang/String;)[B
    .locals 1

    if-nez p0, :cond_0

    .line 25
    sget-object p0, Ll/ۤۛۖ;->֫:[B

    return-object p0

    .line 27
    :cond_0
    sget-object v0, Ll/۠ܰۖ;->ᩳ:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    return-object p0
.end method
