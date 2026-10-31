.class public final enum Ll/ۚܺ۠;
.super Ll/֡ۖ۠;
.source "H7RN"


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;)V
    .locals 9

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    .line 549
    invoke-direct/range {v0 .. v8}, Ll/֡ۖ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ᩴۖ۠;Ll/ۘۖ۠;)V
    .locals 8

    const-string v4, "opt.arg.file"

    const-string v5, "opt.Xstdout"

    const-string v1, "XSTDOUT"

    const/16 v2, 0x39

    const-string v3, "-Xstdout"

    move-object v0, p0

    move-object v6, p1

    move-object v7, p2

    .line 0
    invoke-direct/range {v0 .. v7}, Ll/ۚܺ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/֨ۖ۠;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x1

    .line 553
    :try_start_0
    invoke-virtual {p1}, Ll/֨ۖ۠;->֫()Ll/᩹ܶ۠;

    move-result-object v1

    .line 554
    new-instance v2, Ljava/io/PrintWriter;

    new-instance v3, Ljava/io/FileWriter;

    invoke-direct {v3, p3}, Ljava/io/FileWriter;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v3, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;Z)V

    invoke-virtual {v1, v2}, Ll/᩹ܶ۠;->֫(Ljava/io/PrintWriter;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 558
    invoke-super {p0, p1, p2, p3}, Ll/֡ۖ۠;->֫(Ll/֨ۖ۠;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :catch_0
    move-exception p2

    .line 556
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    sget-object v1, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 1374
    new-instance v1, Ll/۫۠۠;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p3, v2, v3

    aput-object p2, v2, v0

    const-string p2, "compiler"

    const-string p3, "error.writing.file"

    invoke-direct {v1, p2, p3, v2}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 556
    invoke-virtual {p1, v1}, Ll/֨ۖ۠;->֫(Ll/۫۠۠;)Ll/ۖۖ۠;

    move-result-object p1

    throw p1
.end method
