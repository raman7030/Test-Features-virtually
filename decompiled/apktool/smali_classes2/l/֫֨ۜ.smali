.class public final enum Ll/֫֨ۜ;
.super Ll/ܽ֨ۜ;
.source "I749"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "HTTP"

    const/4 v1, 0x0

    .line 0
    invoke-direct {p0, v0, v1}, Ll/֫֨ۜ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 911
    invoke-direct {p0, p1, p2, v0}, Ll/ܽ֨ۜ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫()J
    .locals 2

    const-wide/16 v0, 0x2

    return-wide v0
.end method

.method public ֫(Landroid/net/Uri;)Z
    .locals 2

    .line 921
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "http"

    .line 923
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "https"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 924
    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public ֫(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "http:"

    .line 917
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
