.class public final Ll/ۜ᩹ᩴ;
.super Ll/᩷᩹ᩴ;
.source "N673"


# static fields
.field public static final a:Ll/ۜ᩹ᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 59
    new-instance v0, Ll/ۜ᩹ᩴ;

    .line 62
    sget v1, Ll/ܿ᩹ᩴ;->a:I

    const-string v1, "UTF8"

    const-string v2, "unicode-1-1-utf-8"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "UTF-8"

    .line 34
    invoke-direct {v0, v2, v1}, Ljava/nio/charset/Charset;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    .line 59
    sput-object v0, Ll/ۜ᩹ᩴ;->a:Ll/ۜ᩹ᩴ;

    return-void
.end method

.method public static final l(Ljava/nio/Buffer;ILjava/nio/Buffer;I)V
    .locals 1

    .line 79
    invoke-virtual {p0}, Ljava/nio/Buffer;->arrayOffset()I

    move-result v0

    sub-int/2addr p1, v0

    invoke-virtual {p0, p1}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    .line 80
    invoke-virtual {p2}, Ljava/nio/Buffer;->arrayOffset()I

    move-result p0

    sub-int/2addr p3, p0

    invoke-virtual {p2, p3}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    return-void
.end method


# virtual methods
.method public final newDecoder()Ljava/nio/charset/CharsetDecoder;
    .locals 1

    .line 70
    new-instance v0, Ll/ܳ᩹ᩴ;

    invoke-direct {v0, p0}, Ll/ܳ᩹ᩴ;-><init>(Ll/ۜ᩹ᩴ;)V

    return-object v0
.end method

.method public final newEncoder()Ljava/nio/charset/CharsetEncoder;
    .locals 1

    .line 74
    new-instance v0, Ll/᩻᩹ᩴ;

    invoke-direct {v0, p0}, Ll/᩻᩹ᩴ;-><init>(Ll/ۜ᩹ᩴ;)V

    return-object v0
.end method
