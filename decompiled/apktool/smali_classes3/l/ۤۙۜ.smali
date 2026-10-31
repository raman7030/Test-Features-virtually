.class public final Ll/ۤۙۜ;
.super Ll/۬ᩴܺ;
.source "775Q"


# instance fields
.field public final ֫:Ll/ܳۙۜ;

.field public final ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/ܳۙۜ;)V
    .locals 2

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 30
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    invoke-static {p1}, Ll/ۤۙۜ;->ܿ(Ljava/lang/String;)Ll/۫ۙۜ;

    move-result-object v0

    sget-object v1, Ll/۫ۙۜ;->ۙ:Ll/۫ۙۜ;

    if-ne v0, v1, :cond_0

    .line 28
    iput-object p1, p0, Ll/ۤۙۜ;->ۧ:Ljava/lang/String;

    iput-object p2, p0, Ll/ۤۙۜ;->֫:Ll/ܳۙۜ;

    return-void

    .line 32
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid media URL"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ۧ(Ljava/lang/String;)Z
    .locals 1

    if-eqz p0, :cond_0

    .line 153
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, ".m3u8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ܿ(Ljava/lang/String;)Ll/۫ۙۜ;
    .locals 2

    if-nez p0, :cond_0

    .line 47
    sget-object p0, Ll/۫ۙۜ;->᩹:Ll/۫ۙۜ;

    return-object p0

    .line 49
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 50
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 51
    sget-object p0, Ll/۫ۙۜ;->᩹:Ll/۫ۙۜ;

    return-object p0

    .line 54
    :cond_1
    :try_start_0
    new-instance v0, Ljava/net/URI;

    invoke-direct {v0, p0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 55
    invoke-virtual {v0}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_6

    const-string v1, "http"

    .line 57
    invoke-virtual {p0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "https"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_6

    .line 58
    :cond_2
    invoke-virtual {v0}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_6

    .line 59
    invoke-virtual {v0}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_6

    .line 60
    invoke-virtual {v0}, Ljava/net/URI;->getRawUserInfo()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_3

    goto :goto_1

    .line 63
    :cond_3
    invoke-virtual {v0}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object p0

    const-string v0, ".mpd"

    if-eqz p0, :cond_4

    .line 153
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_4

    const/4 p0, 0x1

    goto :goto_0

    :cond_4
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_5

    .line 63
    sget-object p0, Ll/۫ۙۜ;->᩶:Ll/۫ۙۜ;

    return-object p0

    :cond_5
    sget-object p0, Ll/۫ۙۜ;->ۙ:Ll/۫ۙۜ;

    return-object p0

    .line 61
    :cond_6
    :goto_1
    sget-object p0, Ll/۫ۙۜ;->᩹:Ll/۫ۙۜ;
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 65
    :catch_0
    sget-object p0, Ll/۫ۙۜ;->᩹:Ll/۫ۙۜ;

    return-object p0
.end method

.method public static ᩳ(Ljava/lang/String;)V
    .locals 1

    if-eqz p0, :cond_0

    const-string v0, "VideoPlayerUrlArguments:"

    .line 149
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 98
    invoke-static {p0}, Ll/ۗۖ᩷;->ۧ(Ljava/lang/String;)Ljava/lang/Object;

    :cond_0
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 21
    instance-of v0, p1, Ll/ۤۙۜ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۤۙۜ;

    iget-object v0, p0, Ll/ۤۙۜ;->ۧ:Ljava/lang/String;

    iget-object v1, p1, Ll/ۤۙۜ;->ۧ:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۤۙۜ;->֫:Ll/ܳۙۜ;

    iget-object p1, p1, Ll/ۤۙۜ;->֫:Ll/ܳۙۜ;

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 21
    iget-object v0, p0, Ll/ۤۙۜ;->ۧ:Ljava/lang/String;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll/ۤۙۜ;->֫:Ll/ܳۙۜ;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 21
    iget-object v2, p0, Ll/ۤۙۜ;->ۧ:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v2, 0x1

    iget-object v3, p0, Ll/ۤۙۜ;->֫:Ll/ܳۙۜ;

    aput-object v3, v0, v2

    const-string v3, "url;requestConfig"

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_0

    new-array v3, v1, [Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v4, ";"

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "UrlMediaArguments["

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    :goto_1
    array-length v5, v3

    if-ge v1, v5, :cond_2

    aget-object v5, v3, v1

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v5, v0, v1

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v5, v3

    sub-int/2addr v5, v2

    if-eq v1, v5, :cond_1

    const-string v5, ", "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "]"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 117
    iget-object v0, p0, Ll/ۤۙۜ;->ۧ:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 118
    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 119
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    return-object v1

    .line 122
    :cond_0
    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 123
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    :goto_0
    return-object p1
.end method

.method public final ֫()Z
    .locals 2

    .line 130
    iget-object v0, p0, Ll/ۤۙۜ;->ۧ:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 137
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 153
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ".m3u8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Ll/ۤۙۜ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 2

    .line 107
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v0

    .line 108
    iget-object v1, p0, Ll/ۤۙۜ;->ۧ:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ܳۤۡ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 109
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v0

    const-string v1, "url:"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ll/ܳۙۜ;
    .locals 1

    .line 21
    iget-object v0, p0, Ll/ۤۙۜ;->֫:Ll/ܳۙۜ;

    return-object v0
.end method
