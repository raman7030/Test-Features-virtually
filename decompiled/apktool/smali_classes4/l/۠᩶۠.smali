.class public final Ll/۠᩶۠;
.super Ll/ܺ᩶۠;
.source "C7KL"


# instance fields
.field public final ᩹:Ll/ۚ᩶۠;


# direct methods
.method public constructor <init>(Ll/ۚ᩶۠;Ljava/lang/String;)V
    .locals 0

    .line 9
    invoke-direct {p0, p2}, Ll/ܺ᩶۠;-><init>(Ljava/lang/String;)V

    .line 10
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/۠᩶۠;->᩹:Ll/ۚ᩶۠;

    return-void
.end method


# virtual methods
.method public final getFileSystem()Ll/ۚ᩶۠;
    .locals 1

    .line 15
    iget-object v0, p0, Ll/۠᩶۠;->᩹:Ll/ۚ᩶۠;

    return-object v0
.end method

.method public final getFileSystem()Ll/۟֨ᩴ;
    .locals 1

    .line 15
    iget-object v0, p0, Ll/۠᩶۠;->᩹:Ll/ۚ᩶۠;

    return-object v0
.end method

.method public final register(Ll/ۚ۠ᩴ;[Ll/ᩴ۠ᩴ;)Ll/֡۠ᩴ;
    .locals 0

    .line 458
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final register(Ll/ۚ۠ᩴ;[Ll/ᩴ۠ᩴ;[Ll/᩵۠ᩴ;)Ll/֡۠ᩴ;
    .locals 0

    .line 453
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final toFile()Ljava/io/File;
    .locals 1

    .line 448
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final toRealPath([Ll/ܳ۠ᩴ;)Ll/᩷۠ᩴ;
    .locals 0

    .line 5
    invoke-super {p0}, Ll/ܺ᩶۠;->toAbsolutePath()Ll/᩷۠ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 486
    iget-object v0, p0, Ll/ܺ᩶۠;->᩸:Ljava/lang/String;

    return-object v0
.end method

.method public final toUri()Ljava/net/URI;
    .locals 1

    .line 443
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final ֫(Ljava/lang/String;)Ll/۠᩶۠;
    .locals 2

    .line 20
    new-instance v0, Ll/۠᩶۠;

    iget-object v1, p0, Ll/۠᩶۠;->᩹:Ll/ۚ᩶۠;

    invoke-direct {v0, v1, p1}, Ll/۠᩶۠;-><init>(Ll/ۚ᩶۠;Ljava/lang/String;)V

    return-object v0
.end method
