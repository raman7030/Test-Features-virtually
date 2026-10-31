.class public final Ll/ۗۢۘ;
.super Ll/᩶ۢۘ;
.source "W7VC"


# instance fields
.field public ۜ:Ljava/lang/String;

.field public ܳ:I

.field public ܿ:[B

.field public ᩳ:I

.field public ᩷:I

.field public ᩻:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Ll/᩶ۢۘ;-><init>()V

    const-string v0, "vt100"

    .line 30
    iput-object v0, p0, Ll/ۗۢۘ;->ۜ:Ljava/lang/String;

    const/16 v0, 0x50

    .line 31
    iput v0, p0, Ll/ۗۢۘ;->ᩳ:I

    const/16 v0, 0x18

    .line 32
    iput v0, p0, Ll/ۗۢۘ;->᩻:I

    const/16 v0, 0x280

    .line 33
    iput v0, p0, Ll/ۗۢۘ;->᩷:I

    const/16 v0, 0x1e0

    .line 34
    iput v0, p0, Ll/ۗۢۘ;->ܳ:I

    .line 36
    sget-object v0, Ll/᩵ۡۘ;->ܽ:[B

    iput-object v0, p0, Ll/ۗۢۘ;->ܿ:[B

    return-void
.end method


# virtual methods
.method public final ֫(IIII)V
    .locals 0

    .line 49
    iput p1, p0, Ll/ۗۢۘ;->ᩳ:I

    .line 50
    iput p2, p0, Ll/ۗۢۘ;->᩻:I

    .line 51
    iput p3, p0, Ll/ۗۢۘ;->᩷:I

    .line 52
    iput p4, p0, Ll/ۗۢۘ;->ܳ:I

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 41
    iput-object p1, p0, Ll/ۗۢۘ;->ۜ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ll/۟ۢۘ;Ll/᩵᩻ۘ;)V
    .locals 2

    .line 57
    invoke-super {p0, p1, p2}, Ll/᩶ۢۘ;->֫(Ll/۟ۢۘ;Ll/᩵᩻ۘ;)V

    .line 59
    new-instance p1, Ll/ܺ᩻ۘ;

    invoke-direct {p1}, Ll/ܺ᩻ۘ;-><init>()V

    .line 60
    new-instance v0, Ll/۠ۢۘ;

    invoke-direct {v0, p1}, Ll/۠ۢۘ;-><init>(Ll/ܺ᩻ۘ;)V

    .line 62
    invoke-virtual {v0}, Ll/۠ۢۘ;->֫()V

    const/16 v1, 0x62

    .line 63
    invoke-virtual {p1, v1}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 94
    iget p2, p2, Ll/᩵᩻ۘ;->ܺ:I

    .line 64
    invoke-virtual {p1, p2}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 65
    sget-object p2, Ll/᩵ۡۘ;->ܽ:[B

    .line 397
    sget-object p2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v1, "pty-req"

    .line 393
    invoke-virtual {v1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    .line 65
    invoke-virtual {p1, v1}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 66
    invoke-virtual {p0}, Ll/᩶ۢۘ;->֫()Z

    move-result v1

    int-to-byte v1, v1

    invoke-virtual {p1, v1}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 67
    iget-object v1, p0, Ll/ۗۢۘ;->ۜ:Ljava/lang/String;

    .line 397
    invoke-static {v1, p2}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object p2

    .line 67
    invoke-virtual {p1, p2}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 68
    iget p2, p0, Ll/ۗۢۘ;->ᩳ:I

    invoke-virtual {p1, p2}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 69
    iget p2, p0, Ll/ۗۢۘ;->᩻:I

    invoke-virtual {p1, p2}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 70
    iget p2, p0, Ll/ۗۢۘ;->᩷:I

    invoke-virtual {p1, p2}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 71
    iget p2, p0, Ll/ۗۢۘ;->ܳ:I

    invoke-virtual {p1, p2}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 72
    iget-object p2, p0, Ll/ۗۢۘ;->ܿ:[B

    invoke-virtual {p1, p2}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 73
    invoke-virtual {p0, v0}, Ll/᩶ۢۘ;->֫(Ll/۠ۢۘ;)V

    return-void
.end method
