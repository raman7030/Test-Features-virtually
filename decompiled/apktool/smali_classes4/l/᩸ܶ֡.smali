.class public final Ll/᩸ܶ֡;
.super Ljava/lang/Object;
.source "85AW"


# direct methods
.method public static ֫(Ljava/io/Writer;Ll/ۡ֫ۚ;Ll/᩹ܶ֡;)V
    .locals 1

    .line 48
    :try_start_0
    new-instance v0, Ll/֨۠֡;

    invoke-direct {v0, p2, p1}, Ll/֨۠֡;-><init>(Ll/᩹ܶ֡;Ll/ۡ֫ۚ;)V

    .line 49
    instance-of p2, p0, Ll/ۗ᩵ۚ;

    if-eqz p2, :cond_0

    .line 50
    check-cast p0, Ll/ۗ᩵ۚ;

    invoke-virtual {v0, p0}, Ll/֨۠֡;->֫(Ll/ۗ᩵ۚ;)V

    return-void

    .line 52
    :cond_0
    new-instance p2, Ll/ۗ᩵ۚ;

    invoke-direct {p2, p0}, Ll/ۗ᩵ۚ;-><init>(Ljava/io/Writer;)V

    invoke-virtual {v0, p2}, Ll/֨۠֡;->֫(Ll/ۗ᩵ۚ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 54
    invoke-interface {p1}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x1

    .line 0
    invoke-static {p2, p2, p1}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 56
    new-instance p2, Ljava/io/IOException;

    const-string v0, "An error occurred with the class: "

    .line 0
    invoke-static {v0, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 56
    invoke-direct {p2, p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method
