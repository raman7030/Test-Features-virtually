.class public final Ll/۠ۜ۠;
.super Ljava/lang/Object;
.source "Z5U8"

# interfaces
.implements Ll/ᩳ᩶۠;


# instance fields
.field public final ֫:Ll/ۤܶ۠;


# direct methods
.method public constructor <init>(Ll/ۤܶ۠;)V
    .locals 0

    .line 2758
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2759
    iput-object p1, p0, Ll/۠ۜ۠;->֫:Ll/ۤܶ۠;

    return-void
.end method


# virtual methods
.method public final delete()Z
    .locals 1

    .line 2813
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 2842
    :cond_0
    instance-of v1, p1, Ll/۠ۜ۠;

    if-eqz v1, :cond_1

    .line 2841
    check-cast p1, Ll/۠ۜ۠;

    iget-object v1, p0, Ll/۠ۜ۠;->֫:Ll/ۤܶ۠;

    iget-object p1, p1, Ll/۠ۜ۠;->֫:Ll/ۤܶ۠;

    .line 2842
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 2773
    iget-object v0, p0, Ll/۠ۜ۠;->֫:Ll/ۤܶ۠;

    invoke-virtual {v0}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 2847
    iget-object v0, p0, Ll/۠ۜ۠;->֫:Ll/ۤܶ۠;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toUri()Ljava/net/URI;
    .locals 4

    .line 2765
    iget-object v0, p0, Ll/۠ۜ۠;->֫:Ll/ۤܶ۠;

    :try_start_0
    new-instance v1, Ljava/net/URI;

    invoke-virtual {v0}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v3, v2, v3}, Ljava/net/URI;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v1

    .line 2767
    new-instance v2, Ll/᩶ܳ۠;

    invoke-virtual {v0}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v0

    .line 551
    invoke-direct {v2, v0, v1}, Ljava/lang/Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2767
    throw v2
.end method

.method public final ֫(Z)Ljava/lang/CharSequence;
    .locals 0

    .line 2793
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫()Ll/ܽ᩶۠;
    .locals 1

    .line 2773
    iget-object v0, p0, Ll/۠ۜ۠;->֫:Ll/ۤܶ۠;

    invoke-virtual {v0}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2778
    invoke-static {v0}, Ll/᩷ܿ۠;->ۧ(Ljava/lang/String;)Ll/ܽ᩶۠;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;Ll/ܽ᩶۠;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ()Ljava/io/InputStream;
    .locals 1

    .line 2783
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final ܽ()Ljava/io/Writer;
    .locals 1

    .line 2803
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final ܿ()Ljava/io/OutputStream;
    .locals 1

    .line 2788
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final ᩳ()J
    .locals 1

    .line 2808
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
