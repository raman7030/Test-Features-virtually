.class public final Ll/ۖ᩶۠;
.super Ljava/lang/Object;
.source "R7K0"

# interfaces
.implements Ll/ܶ۠ᩴ;


# instance fields
.field public final ֫:Ll/ۗ᩺ۡ;

.field public final ۧ:Ll/ۙ۠ᩴ;


# direct methods
.method public constructor <init>(Ll/ۗ᩺ۡ;)V
    .locals 2

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Ll/ۖ᩶۠;->֫:Ll/ۗ᩺ۡ;

    .line 18
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->getTime()J

    move-result-wide v0

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, p1}, Ll/ۙ۠ᩴ;->from(JLjava/util/concurrent/TimeUnit;)Ll/ۙ۠ᩴ;

    move-result-object p1

    iput-object p1, p0, Ll/ۖ᩶۠;->ۧ:Ll/ۙ۠ᩴ;

    return-void
.end method


# virtual methods
.method public final creationTime()Ll/ۙ۠ᩴ;
    .locals 1

    .line 33
    iget-object v0, p0, Ll/ۖ᩶۠;->ۧ:Ll/ۙ۠ᩴ;

    return-object v0
.end method

.method public final fileKey()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final isDirectory()Z
    .locals 1

    .line 43
    iget-object v0, p0, Ll/ۖ᩶۠;->֫:Ll/ۗ᩺ۡ;

    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v0

    return v0
.end method

.method public final isOther()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final isRegularFile()Z
    .locals 1

    .line 38
    iget-object v0, p0, Ll/ۖ᩶۠;->֫:Ll/ۗ᩺ۡ;

    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final isSymbolicLink()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final lastAccessTime()Ll/ۙ۠ᩴ;
    .locals 1

    .line 28
    iget-object v0, p0, Ll/ۖ᩶۠;->ۧ:Ll/ۙ۠ᩴ;

    return-object v0
.end method

.method public final lastModifiedTime()Ll/ۙ۠ᩴ;
    .locals 1

    .line 23
    iget-object v0, p0, Ll/ۖ᩶۠;->ۧ:Ll/ۙ۠ᩴ;

    return-object v0
.end method

.method public final size()J
    .locals 2

    .line 58
    iget-object v0, p0, Ll/ۖ᩶۠;->֫:Ll/ۗ᩺ۡ;

    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v0

    return-wide v0
.end method
