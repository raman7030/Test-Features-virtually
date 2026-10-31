.class public final Ll/ۘۙ᩻;
.super Ljava/io/FilterInputStream;
.source "9AHU"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ۙ:Z

.field public final synthetic ᩶:Z

.field public final synthetic ᩸:Ll/᩵ۙ᩻;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩵ۙ᩻;Ljava/io/BufferedInputStream;Ljava/lang/String;Z)V
    .locals 0

    .line 269
    iput-object p1, p0, Ll/ۘۙ᩻;->᩸:Ll/᩵ۙ᩻;

    iput-object p3, p0, Ll/ۘۙ᩻;->᩹:Ljava/lang/String;

    iput-boolean p4, p0, Ll/ۘۙ᩻;->᩶:Z

    invoke-direct {p0, p2}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    return-void
.end method


# virtual methods
.method public final read()I
    .locals 4

    .line 275
    iget-object v0, p0, Ll/ۘۙ᩻;->᩹:Ljava/lang/String;

    iget-object v1, p0, Ll/ۘۙ᩻;->᩸:Ll/᩵ۙ᩻;

    :try_start_0
    invoke-super {p0}, Ljava/io/FilterInputStream;->read()I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    .line 297
    iget-boolean v3, p0, Ll/ۘۙ᩻;->ۙ:Z

    if-nez v3, :cond_0

    const/4 v3, 0x1

    .line 298
    iput-boolean v3, p0, Ll/ۘۙ᩻;->ۙ:Z

    .line 299
    invoke-static {v1}, Ll/᩵ۙ᩻;->֫(Ll/᩵ۙ᩻;)Ll/ܶ᩵ܿ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Ll/ۤܺܳ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ll/ۘܰۡ; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return v2

    :catch_0
    move-exception v2

    .line 304
    invoke-static {v1}, Ll/᩵ۙ᩻;->֫(Ll/᩵ۙ᩻;)Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ll/ۤܺܳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    iget-boolean v0, p0, Ll/ۘۙ᩻;->᩶:Z

    if-eqz v0, :cond_1

    .line 306
    invoke-static {}, Ll/᩹᩶᩻;->֫()V

    .line 280
    :cond_1
    throw v2
.end method

.method public final read([BII)I
    .locals 2

    .line 287
    iget-object v0, p0, Ll/ۘۙ᩻;->᩹:Ljava/lang/String;

    iget-object v1, p0, Ll/ۘۙ᩻;->᩸:Ll/᩵ۙ᩻;

    :try_start_0
    invoke-super {p0, p1, p2, p3}, Ljava/io/FilterInputStream;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    .line 297
    iget-boolean p2, p0, Ll/ۘۙ᩻;->ۙ:Z

    if-nez p2, :cond_0

    const/4 p2, 0x1

    .line 298
    iput-boolean p2, p0, Ll/ۘۙ᩻;->ۙ:Z

    .line 299
    invoke-static {v1}, Ll/᩵ۙ᩻;->֫(Ll/᩵ۙ᩻;)Ll/ܶ᩵ܿ;

    move-result-object p2

    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v0}, Ll/ۤܺܳ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ll/ۘܰۡ; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return p1

    :catch_0
    move-exception p1

    .line 304
    invoke-static {v1}, Ll/᩵ۙ᩻;->֫(Ll/᩵ۙ᩻;)Ll/ܶ᩵ܿ;

    move-result-object p2

    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v0}, Ll/ۤܺܳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    iget-boolean p2, p0, Ll/ۘۙ᩻;->᩶:Z

    if-eqz p2, :cond_1

    .line 306
    invoke-static {}, Ll/᩹᩶᩻;->֫()V

    .line 292
    :cond_1
    throw p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
