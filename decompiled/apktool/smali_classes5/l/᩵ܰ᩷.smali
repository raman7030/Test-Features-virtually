.class public final Ll/᩵ܰ᩷;
.super Ll/۟ܶۡ;
.source "I1KV"


# instance fields
.field public final synthetic ۜ:Ljava/util/HashSet;

.field public final synthetic ܳ:Ll/᩸ܰ᩷;

.field public final synthetic ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩸ܰ᩷;Ljava/lang/String;Ljava/util/HashSet;)V
    .locals 0

    .line 802
    iput-object p1, p0, Ll/᩵ܰ᩷;->ܳ:Ll/᩸ܰ᩷;

    iput-object p2, p0, Ll/᩵ܰ᩷;->᩻:Ljava/lang/String;

    iput-object p3, p0, Ll/᩵ܰ᩷;->ۜ:Ljava/util/HashSet;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const v0, 0x7f1208d1

    .line 823
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 1

    .line 828
    iget-object v0, p0, Ll/᩵ܰ᩷;->ܳ:Ll/᩸ܰ᩷;

    invoke-static {v0}, Ll/᩸ܰ᩷;->ܳ(Ll/᩸ܰ᩷;)Ll/ۘۛ᩷;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۘۛ᩷;->֫(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 806
    iget-object v0, p0, Ll/᩵ܰ᩷;->ܳ:Ll/᩸ܰ᩷;

    invoke-virtual {v0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v0

    check-cast v0, Ll/ۗܺ᩷;

    const v1, 0x7f1208d2

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 6

    .line 811
    new-instance v0, Ll/ۡܰۡ;

    iget-object v1, p0, Ll/᩵ܰ᩷;->᩻:Ljava/lang/String;

    invoke-direct {v0, v1}, Ll/ۡܰۡ;-><init>(Ljava/lang/String;)V

    .line 812
    :try_start_0
    new-instance v1, Ll/ܰۖܽ;

    new-instance v2, Ljava/io/BufferedOutputStream;

    invoke-virtual {v0}, Ll/ۡܰۡ;->֫()Ljava/io/OutputStream;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {v1, v2}, Ll/ܰۖܽ;-><init>(Ljava/io/OutputStream;)V

    .line 813
    iget-object v2, p0, Ll/᩵ܰ᩷;->ۜ:Ljava/util/HashSet;

    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 814
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ".xml"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ll/ۡܰۡ;->֫(Ljava/lang/String;)V

    .line 815
    iget-object v4, p0, Ll/᩵ܰ᩷;->ܳ:Ll/᩸ܰ᩷;

    invoke-static {v4}, Ll/᩸ܰ᩷;->ᩳ(Ll/᩸ܰ᩷;)Ll/᩵ۨ᩷;

    move-result-object v4

    invoke-virtual {v4, v3}, Ll/᩵ۨ᩷;->᩻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 816
    invoke-virtual {v1}, Ll/ܰۖܽ;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 818
    :cond_0
    invoke-virtual {v0}, Ll/ۡܰۡ;->close()V

    return-void

    :catchall_0
    move-exception v1

    .line 811
    :try_start_1
    invoke-virtual {v0}, Ll/ۡܰۡ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v1
.end method

.method public final ᩳ()V
    .locals 0

    .line 833
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
