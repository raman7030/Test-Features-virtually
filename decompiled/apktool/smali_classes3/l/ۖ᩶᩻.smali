.class public final Ll/ۖ᩶᩻;
.super Ljava/lang/Object;
.source "V8BV"

# interfaces
.implements Ll/᩺ܺܳ;


# instance fields
.field public final synthetic ۙ:Ll/ۡܰۡ;

.field public final synthetic ᩶:Ljava/util/HashMap;

.field public final synthetic ᩸:Ll/ᩴ᩶᩻;

.field public final synthetic ᩹:[Ljava/io/IOException;


# direct methods
.method public constructor <init>(Ll/ᩴ᩶᩻;Ljava/util/HashMap;Ll/ۡܰۡ;[Ljava/io/IOException;)V
    .locals 0

    .line 180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖ᩶᩻;->᩸:Ll/ᩴ᩶᩻;

    iput-object p2, p0, Ll/ۖ᩶᩻;->᩶:Ljava/util/HashMap;

    iput-object p3, p0, Ll/ۖ᩶᩻;->ۙ:Ll/ۡܰۡ;

    iput-object p4, p0, Ll/ۖ᩶᩻;->᩹:[Ljava/io/IOException;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ᩳۜܳ;Ljava/io/InputStream;)V
    .locals 5

    .line 183
    iget-object v0, p0, Ll/ۖ᩶᩻;->᩸:Ll/ᩴ᩶᩻;

    invoke-static {v0}, Ll/ᩴ᩶᩻;->ۧ(Ll/ᩴ᩶᩻;)Ll/ܶ۬ܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩷۫ܳ;->᩷()V

    if-nez p2, :cond_0

    goto :goto_0

    .line 187
    :cond_0
    iget-object v1, p0, Ll/ۖ᩶᩻;->᩶:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚ۬ܳ;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    invoke-static {v0}, Ll/ᩴ᩶᩻;->֫(Ll/ᩴ᩶᩻;)Ll/ۘ᩶᩻;

    move-result-object v2

    invoke-static {v0}, Ll/ᩴ᩶᩻;->ۧ(Ll/ᩴ᩶᩻;)Ll/ܶ۬ܳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩷۫ܳ;->ᩳ()I

    invoke-static {v0}, Ll/ᩴ᩶᩻;->ۧ(Ll/ᩴ᩶᩻;)Ll/ܶ۬ܳ;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v2, v1}, Ll/ۘ᩶᩻;->֫(Ll/֨۬ܳ;)V

    .line 190
    invoke-static {v0}, Ll/ᩴ᩶᩻;->֫(Ll/ᩴ᩶᩻;)Ll/ۘ᩶᩻;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    invoke-static {v0}, Ll/ᩴ᩶᩻;->֫(Ll/ᩴ᩶᩻;)Ll/ۘ᩶᩻;

    move-result-object v2

    invoke-static {v0}, Ll/ᩴ᩶᩻;->ۧ(Ll/ᩴ᩶᩻;)Ll/ܶ۬ܳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩷۫ܳ;->ܽ()I

    move-result v3

    invoke-interface {v2, v3}, Ll/ۘ᩶᩻;->setProgress(I)V

    .line 193
    new-instance v2, Ll/ۗ᩺ۡ;

    invoke-virtual {v1}, Ll/֨۬ܳ;->ܺ()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ll/ۗ᩺ۡ;-><init>(Ljava/lang/String;)V

    .line 194
    invoke-virtual {v1}, Ll/֨۬ܳ;->ۖ()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ll/ۗ᩺ۡ;->setTime(J)V

    .line 195
    invoke-static {v2, v1}, Ll/ᩴ᩶᩻;->֫(Ll/ۗ᩺ۡ;Ll/֨۬ܳ;)V

    .line 196
    iget-object v3, p0, Ll/ۖ᩶᩻;->ۙ:Ll/ۡܰۡ;

    invoke-virtual {v3, v2}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;)V

    .line 198
    :try_start_0
    invoke-virtual {v3}, Ll/ۡܰۡ;->֫()Ljava/io/OutputStream;

    move-result-object v2

    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v3

    new-instance p1, Ll/ܺ᩶᩻;

    invoke-direct {p1, p0}, Ll/ܺ᩶᩻;-><init>(Ll/ۖ᩶᩻;)V

    invoke-static {p2, v2, v3, v4, p1}, Ll/ܳ֡ܿ;->֫(Ljava/io/InputStream;Ljava/io/OutputStream;JLl/ۚ᩸ܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 210
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    .line 211
    invoke-static {v0}, Ll/ᩴ᩶᩻;->֫(Ll/ᩴ᩶᩻;)Ll/ۘ᩶᩻;

    move-result-object p1

    invoke-interface {p1}, Ll/ܿۖ᩷;->᩻()Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    return-void

    .line 214
    :cond_1
    invoke-static {v0}, Ll/ᩴ᩶᩻;->ۧ(Ll/ᩴ᩶᩻;)Ll/ܶ۬ܳ;

    move-result-object p1

    invoke-virtual {v1}, Ll/֨۬ܳ;->᩻()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ll/᩷۫ܳ;->֫(J)V

    return-void

    :catchall_0
    move-exception p1

    .line 197
    :try_start_1
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
.end method

.method public final ֫(Ljava/io/IOException;)Z
    .locals 2

    .line 219
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "onError"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 221
    iget-object v0, p0, Ll/ۖ᩶᩻;->᩹:[Ljava/io/IOException;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    return v1
.end method

.method public final ᩻()Z
    .locals 1

    .line 227
    iget-object v0, p0, Ll/ۖ᩶᩻;->᩸:Ll/ᩴ᩶᩻;

    invoke-static {v0}, Ll/ᩴ᩶᩻;->֫(Ll/ᩴ᩶᩻;)Ll/ۘ᩶᩻;

    move-result-object v0

    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    return v0
.end method
