.class public final Ll/ۛ֡ۚ;
.super Ljava/lang/Object;
.source "E1HX"

# interfaces
.implements Ll/ۡ᩹ۚ;


# instance fields
.field public final ᩸:Ljava/lang/Appendable;

.field public final ᩹:Ll/֡֡ۚ;


# direct methods
.method public constructor <init>(Ljava/lang/Appendable;Ll/֡֡ۚ;)V
    .locals 0

    .line 860
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 861
    iput-object p1, p0, Ll/ۛ֡ۚ;->᩸:Ljava/lang/Appendable;

    .line 862
    iput-object p2, p0, Ll/ۛ֡ۚ;->᩹:Ll/֡֡ۚ;

    .line 863
    invoke-virtual {p2}, Ll/֡֡ۚ;->ܳ()Ljava/nio/charset/CharsetEncoder;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۨ֡ۚ;I)V
    .locals 2

    .line 875
    invoke-virtual {p1}, Ll/ۨ֡ۚ;->ܺ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "#text"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 877
    :try_start_0
    iget-object v0, p0, Ll/ۛ֡ۚ;->᩸:Ljava/lang/Appendable;

    iget-object v1, p0, Ll/ۛ֡ۚ;->᩹:Ll/֡֡ۚ;

    invoke-virtual {p1, v0, p2, v1}, Ll/ۨ֡ۚ;->ۧ(Ljava/lang/Appendable;ILl/֡֡ۚ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 879
    new-instance p2, Ll/֫֡ۚ;

    .line 34
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 879
    throw p2

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/ۨ֡ۚ;I)V
    .locals 2

    .line 868
    :try_start_0
    iget-object v0, p0, Ll/ۛ֡ۚ;->᩸:Ljava/lang/Appendable;

    iget-object v1, p0, Ll/ۛ֡ۚ;->᩹:Ll/֡֡ۚ;

    invoke-virtual {p1, v0, p2, v1}, Ll/ۨ֡ۚ;->֫(Ljava/lang/Appendable;ILl/֡֡ۚ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 870
    new-instance p2, Ll/֫֡ۚ;

    .line 34
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 870
    throw p2
.end method
