.class public Ll/ۤܶۖ;
.super Ll/֨ܶۖ;
.source "U5VI"


# virtual methods
.method public ֫(Ll/᩵᩸ۖ;Ll/ܶ᩶ۚ;Ll/ۚܶۖ;)V
    .locals 6

    .line 34
    invoke-static {p2}, Ll/֫᩶ۚ;->֫(Ll/ܶ᩶ۚ;)Ll/ܶ᩶ۚ;

    move-result-object v0

    .line 35
    new-instance v1, Ll/ۨۙۚ;

    iget v2, p1, Ll/᩵᩸ۖ;->᩸:I

    iget-object v3, p1, Ll/᩵᩸ۖ;->ۙ:Ll/۟۠ۖ;

    invoke-virtual {v3}, Ll/۟۠ۖ;->ۧ()Ljava/lang/String;

    move-result-object v4

    .line 36
    invoke-virtual {v3}, Ll/۟۠ۖ;->֫()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v2, v4, v5}, Ll/ۨۙۚ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 38
    :try_start_0
    invoke-super {p0, p1, v1, p3}, Ll/֨ܶۖ;->֫(Ll/᩵᩸ۖ;Ll/ܶ᩶ۚ;Ll/ۚܶۖ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 43
    invoke-virtual {v1, p2}, Ll/ۨۙۚ;->֫(Ll/ܶ᩶ۚ;)V

    if-eqz v0, :cond_0

    .line 46
    :try_start_1
    invoke-static {v0}, Ll/֫᩶ۚ;->ۧ(Ll/ܶ᩶ۚ;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 48
    iget-object p2, v1, Ll/ۨۙۚ;->ۜ:Ll/ۚۙۚ;

    invoke-virtual {p2}, Ll/ۚۙۚ;->clear()V

    .line 49
    iget-object p2, v1, Ll/ۨۙۚ;->֨:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->clear()V

    .line 59
    new-instance p2, Ljava/io/StringWriter;

    invoke-direct {p2}, Ljava/io/StringWriter;-><init>()V

    const-string p3, "d2j fail translate: "

    .line 60
    invoke-virtual {p2, p3}, Ljava/io/StringWriter;->append(Ljava/lang/CharSequence;)Ljava/io/StringWriter;

    .line 61
    new-instance p3, Ljava/io/PrintWriter;

    invoke-direct {p3, p2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-virtual {p1, p3}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 62
    invoke-virtual {p2}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    const/16 p2, 0xbb

    const-string p3, "java/lang/RuntimeException"

    .line 63
    invoke-virtual {v1, p2, p3}, Ll/ۨۙۚ;->ܽ(ILjava/lang/String;)V

    const/16 p2, 0x59

    .line 64
    invoke-virtual {v1, p2}, Ll/ۨۙۚ;->֫(I)V

    .line 65
    invoke-virtual {v1, p1}, Ll/ۨۙۚ;->֫(Ljava/lang/Object;)V

    const-string p1, "<init>"

    const-string p2, "(Ljava/lang/String;)V"

    const/16 v2, 0xb7

    .line 66
    invoke-virtual {v1, p3, v2, p1, p2}, Ll/ܶ᩶ۚ;->ۧ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0xbf

    .line 67
    invoke-virtual {v1, p1}, Ll/ۨۙۚ;->֫(I)V

    .line 51
    invoke-static {v0, v1}, Ll/֫᩶ۚ;->֫(Ll/ܶ᩶ۚ;Ll/ۨۙۚ;)V

    :cond_0
    return-void

    :catch_1
    move-exception p1

    .line 40
    new-instance p2, Ll/ۛ۠ۖ;

    const/4 p3, 0x1

    new-array p3, p3, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object v3, p3, v0

    const-string v0, "Failed to convert code for %s"

    invoke-direct {p2, p1, v0, p3}, Ll/ۛ۠ۖ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    throw p2
.end method
