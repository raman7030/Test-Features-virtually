.class public final Ll/᩸ۨۡ;
.super Ljava/lang/Object;
.source "FATD"


# static fields
.field public static final ֫:Ll/ۧ֫֡;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 20
    sget-object v0, Ll/ܽ֡ܿ;->֫:Ll/ܶ᩵ܿ;

    const-string v1, "axmls"

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 21
    new-instance v1, Ljava/io/File;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x1

    const-wide/32 v2, 0x200000

    const v4, 0x18e4545

    invoke-static {v1, v4, v0, v2, v3}, Ll/ۧ֫֡;->֫(Ljava/io/File;IIJ)Ll/ۧ֫֡;

    move-result-object v0

    sput-object v0, Ll/᩸ۨۡ;->֫:Ll/ۧ֫֡;

    return-void
.end method

.method public static ֫(Ljava/lang/String;[B)V
    .locals 2

    const/4 v0, 0x0

    .line 40
    :try_start_0
    sget-object v1, Ll/᩸ۨۡ;->֫:Ll/ۧ֫֡;

    invoke-virtual {v1, p0}, Ll/ۧ֫֡;->֫(Ljava/lang/String;)Ll/ܰ۟᩵;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 43
    invoke-virtual {v0, p0}, Ll/ܰ۟᩵;->֫(I)Ll/ۚᩳ֡;

    move-result-object p0

    invoke-static {p0}, Ll/᩻ᩳ֡;->֫(Ll/ۚᩳ֡;)Ll/ۤܽ֡;

    move-result-object p0

    .line 44
    invoke-interface {p0, p1}, Ll/ۤܽ֡;->write([B)Ll/ۤܽ֡;

    .line 45
    invoke-interface {p0}, Ll/ۚᩳ֡;->close()V

    .line 46
    invoke-virtual {v0}, Ll/ܰ۟᩵;->ۧ()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    nop

    if-eqz v0, :cond_1

    .line 51
    :try_start_1
    invoke-virtual {v0}, Ll/ܰ۟᩵;->֫()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_1
    :goto_0
    return-void
.end method

.method public static ֫(Ljava/lang/String;)[B
    .locals 1

    .line 27
    :try_start_0
    sget-object v0, Ll/᩸ۨۡ;->֫:Ll/ۧ֫֡;

    invoke-virtual {v0, p0}, Ll/ۧ֫֡;->ۧ(Ljava/lang/String;)Ll/֫֫֡;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 v0, 0x0

    .line 29
    invoke-virtual {p0, v0}, Ll/֫֫֡;->֫(I)Ll/֨ᩳ֡;

    move-result-object p0

    invoke-static {p0}, Ll/᩻ᩳ֡;->֫(Ll/֨ᩳ֡;)Ll/ۛܽ֡;

    move-result-object p0

    invoke-interface {p0}, Ll/ۛܽ֡;->ۜۧ()[B

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
