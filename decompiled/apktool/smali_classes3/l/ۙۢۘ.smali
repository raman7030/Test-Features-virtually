.class public final Ll/ۙۢۘ;
.super Ll/᩶ۢۘ;
.source "97YR"


# instance fields
.field public ᩳ:[B


# direct methods
.method public constructor <init>([B)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ll/᩶ۢۘ;-><init>()V

    .line 33
    iput-object p1, p0, Ll/ۙۢۘ;->ᩳ:[B

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۟ۢۘ;Ll/᩵᩻ۘ;)V
    .locals 2

    .line 38
    invoke-super {p0, p1, p2}, Ll/᩶ۢۘ;->֫(Ll/۟ۢۘ;Ll/᩵᩻ۘ;)V

    .line 40
    new-instance p1, Ll/ܺ᩻ۘ;

    invoke-direct {p1}, Ll/ܺ᩻ۘ;-><init>()V

    .line 41
    new-instance v0, Ll/۠ۢۘ;

    invoke-direct {v0, p1}, Ll/۠ۢۘ;-><init>(Ll/ܺ᩻ۘ;)V

    .line 49
    invoke-virtual {v0}, Ll/۠ۢۘ;->֫()V

    const/16 v1, 0x62

    .line 50
    invoke-virtual {p1, v1}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 94
    iget p2, p2, Ll/᩵᩻ۘ;->ܺ:I

    .line 51
    invoke-virtual {p1, p2}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 52
    sget-object p2, Ll/᩵ۡۘ;->ܽ:[B

    .line 397
    sget-object p2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v1, "exec"

    .line 393
    invoke-virtual {v1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2

    .line 52
    invoke-virtual {p1, p2}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 53
    invoke-virtual {p0}, Ll/᩶ۢۘ;->֫()Z

    move-result p2

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 54
    iget-object p2, p0, Ll/ۙۢۘ;->ᩳ:[B

    array-length p2, p2

    add-int/lit8 p2, p2, 0x4

    invoke-virtual {p1, p2}, Ll/ܺ᩻ۘ;->֫(I)V

    .line 55
    iget-object p2, p0, Ll/ۙۢۘ;->ᩳ:[B

    invoke-virtual {p1, p2}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 56
    invoke-virtual {p0, v0}, Ll/᩶ۢۘ;->֫(Ll/۠ۢۘ;)V

    return-void
.end method
