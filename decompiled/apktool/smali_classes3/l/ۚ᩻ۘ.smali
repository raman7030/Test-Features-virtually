.class public final Ll/ۚ᩻ۘ;
.super Ll/۠᩻ۘ;
.source "87V9"


# static fields
.field public static final ۙ:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 15
    sget-object v0, Ll/᩵ۡۘ;->ܽ:[B

    .line 397
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v1, "direct-streamlocal@openssh.com"

    invoke-static {v1, v0}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 15
    sput-object v0, Ll/ۚ᩻ۘ;->ۙ:[B

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Ll/۠᩻ۘ;-><init>()V

    .line 21
    sget-object v0, Ll/ۚ᩻ۘ;->ۙ:[B

    iput-object v0, p0, Ll/᩵᩻ۘ;->ۚ:[B

    const/high16 v0, 0x20000

    .line 22
    iput v0, p0, Ll/᩵᩻ۘ;->᩷:I

    .line 23
    iput v0, p0, Ll/᩵᩻ۘ;->ۜ:I

    const/16 v0, 0x4000

    .line 24
    iput v0, p0, Ll/᩵᩻ۘ;->᩻:I

    return-void
.end method


# virtual methods
.method public final ܿ()Ll/۠ۢۘ;
    .locals 2

    .line 31
    iget-object v0, p0, Ll/᩵᩻ۘ;->᩵:Ll/۟ۢۘ;

    .line 3560
    iget-object v0, v0, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v0}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "socketPath must be set"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
