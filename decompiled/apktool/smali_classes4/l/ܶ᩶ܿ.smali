.class public final Ll/ܶ᩶ܿ;
.super Ljava/lang/Object;
.source "N17O"

# interfaces
.implements Ll/ۖۖܽ;


# instance fields
.field public final ۙ:Ll/ۚ᩶ܿ;

.field public final ᩶:Ljava/lang/String;

.field public ᩸:Z

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۚ᩶ܿ;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 200
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 198
    iput-boolean v0, p0, Ll/ܶ᩶ܿ;->᩸:Z

    .line 201
    iput-object p1, p0, Ll/ܶ᩶ܿ;->ۙ:Ll/ۚ᩶ܿ;

    .line 202
    iput-object p2, p0, Ll/ܶ᩶ܿ;->᩶:Ljava/lang/String;

    .line 203
    iput-object p3, p0, Ll/ܶ᩶ܿ;->᩹:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 283
    iget-boolean v0, p0, Ll/ܶ᩶ܿ;->᩸:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 286
    iput-boolean v0, p0, Ll/ܶ᩶ܿ;->᩸:Z

    .line 287
    iget-object v0, p0, Ll/ܶ᩶ܿ;->᩹:Ljava/lang/String;

    const-string v1, "r"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Ll/ܶ᩶ܿ;->ۙ:Ll/ۚ᩶ܿ;

    if-eqz v0, :cond_1

    .line 289
    :try_start_0
    invoke-virtual {v1}, Ll/ۚ᩶ܿ;->֫()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void

    .line 294
    :cond_1
    invoke-virtual {v1}, Ll/ۚ᩶ܿ;->֫()V

    return-void
.end method

.method public final getName()Ljava/lang/String;
    .locals 2

    .line 261
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Ll/ܶ᩶ܿ;->᩶:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final isClosed()Z
    .locals 1

    .line 278
    iget-boolean v0, p0, Ll/ܶ᩶ܿ;->᩸:Z

    return v0
.end method

.method public final length()J
    .locals 2

    .line 235
    iget-object v0, p0, Ll/ܶ᩶ܿ;->ۙ:Ll/ۚ᩶ܿ;

    invoke-virtual {v0}, Ll/ۚ᩶ܿ;->ۧ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final position()J
    .locals 2

    .line 240
    iget-object v0, p0, Ll/ܶ᩶ܿ;->ۙ:Ll/ۚ᩶ܿ;

    invoke-virtual {v0}, Ll/ۚ᩶ܿ;->ᩳ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final read([BII)I
    .locals 1

    .line 220
    iget-object v0, p0, Ll/ܶ᩶ܿ;->ۙ:Ll/ۚ᩶ܿ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۚ᩶ܿ;->֫([BII)I

    move-result p1

    return p1
.end method

.method public final seek(J)V
    .locals 1

    .line 211
    iget-object v0, p0, Ll/ܶ᩶ܿ;->ۙ:Ll/ۚ᩶ܿ;

    invoke-virtual {v0, p1, p2}, Ll/ۚ᩶ܿ;->֫(J)V

    return-void
.end method

.method public final setLength(J)V
    .locals 1

    .line 251
    iget-object v0, p0, Ll/ܶ᩶ܿ;->ۙ:Ll/ۚ᩶ܿ;

    invoke-virtual {v0, p1, p2}, Ll/ۚ᩶ܿ;->ۧ(J)V

    return-void
.end method

.method public final write([BII)V
    .locals 1

    .line 226
    iget-object v0, p0, Ll/ܶ᩶ܿ;->ۙ:Ll/ۚ᩶ܿ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۚ᩶ܿ;->ۧ([BII)V

    return-void
.end method

.method public final synthetic ֫ܽ()Ljava/nio/channels/FileChannel;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۡ()Ll/ۖۖܽ;
    .locals 3

    .line 273
    iget-object v0, p0, Ll/ܶ᩶ܿ;->ۙ:Ll/ۚ᩶ܿ;

    invoke-static {v0}, Ll/ۚ᩶ܿ;->֫(Ll/ۚ᩶ܿ;)Ll/᩵᩶ܿ;

    move-result-object v0

    iget-boolean v0, v0, Ll/᩵᩶ܿ;->ۙ:Z

    invoke-static {v0}, Ll/ۗ᩶ܿ;->֫(Z)Ll/᩵᩶ܿ;

    move-result-object v0

    iget-object v1, p0, Ll/ܶ᩶ܿ;->᩶:Ljava/lang/String;

    iget-object v2, p0, Ll/ܶ᩶ܿ;->᩹:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ll/᩵᩶ܿ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)Ll/ۖۖܽ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic ۧ(JJ)Ll/ۖۖܽ;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2, p3, p4}, Ll/ܺۖܽ;->ۧ(Ll/ۖۖܽ;JJ)Ll/ۖۖܽ;

    move-result-object p1

    return-object p1
.end method

.method public final ܺ()V
    .locals 1

    .line 256
    iget-object v0, p0, Ll/ܶ᩶ܿ;->ۙ:Ll/ۚ᩶ܿ;

    invoke-virtual {v0}, Ll/ۚ᩶ܿ;->ܽ()V

    return-void
.end method

.method public final synthetic ܽ(JJ)Ll/ۖۖܽ;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2, p3, p4}, Ll/ܺۖܽ;->֫(Ll/ۖۖܽ;JJ)Ll/ۖۖܽ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic ᩻ܽ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
