.class public final Ll/ۙᩳܳ;
.super Landroid/content/ContentProvider;
.source "J72H"


# static fields
.field public static final ᩸:Ll/ۧۤᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 41
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    sput-object v0, Ll/ۙᩳܳ;->᩸:Ll/ۧۤᩴ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Landroid/net/Uri;
    .locals 2

    .line 102
    new-instance v0, Landroid/net/Uri$Builder;

    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    const-string v1, "content"

    .line 103
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "bin.mt.plus.html-preview"

    .line 104
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "html-preview"

    .line 105
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    .line 106
    invoke-virtual {v0, p0}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p0

    const-string v0, "document.mhtml"

    .line 107
    invoke-virtual {p0, v0}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p0

    .line 108
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ll/֨ۚ᩷;Ll/ܰܺܳ;Ljava/lang/String;Z)Landroid/net/Uri;
    .locals 1

    .line 58
    new-instance v0, Ll/᩶ᩳܳ;

    invoke-direct {v0, p1, p2, p3, p4}, Ll/᩶ᩳܳ;-><init>(Ll/֨ۚ᩷;Ll/ܰܺܳ;Ljava/lang/String;Z)V

    sget-object p1, Ll/ۙᩳܳ;->᩸:Ll/ۧۤᩴ;

    invoke-virtual {p1, p0, v0}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩶ᩳܳ;

    if-eqz p1, :cond_0

    .line 60
    invoke-virtual {p1}, Ll/᩶ᩳܳ;->close()V

    .line 62
    :cond_0
    invoke-static {p0}, Ll/ۙᩳܳ;->֫(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ll/֨ۚ᩷;Ll/ܶ᩵ܿ;)Landroid/net/Uri;
    .locals 1

    .line 71
    new-instance v0, Ll/᩶ᩳܳ;

    invoke-direct {v0, p1, p2}, Ll/᩶ᩳܳ;-><init>(Ll/֨ۚ᩷;Ll/ܶ᩵ܿ;)V

    sget-object p1, Ll/ۙᩳܳ;->᩸:Ll/ۧۤᩴ;

    invoke-virtual {p1, p0, v0}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩶ᩳܳ;

    if-eqz p1, :cond_0

    .line 73
    invoke-virtual {p1}, Ll/᩶ᩳܳ;->close()V

    .line 75
    :cond_0
    invoke-static {p0}, Ll/ۙᩳܳ;->֫(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/net/Uri;)Ll/᩶ᩳܳ;
    .locals 2

    const-string v0, "content"

    .line 157
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "bin.mt.plus.html-preview"

    invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 158
    invoke-virtual {p0}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroid/net/Uri;->getFragment()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 161
    :cond_0
    invoke-virtual {p0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object p0

    .line 162
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "html-preview"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x2

    .line 163
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "document.mhtml"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    .line 166
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    sget-object v0, Ll/ۙᩳܳ;->᩸:Ll/ۧۤᩴ;

    invoke-virtual {v0, p0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩶ᩳܳ;

    return-object p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Landroid/net/Uri;Ljava/lang/String;)Z
    .locals 0

    if-eqz p1, :cond_0

    if-eqz p0, :cond_0

    .line 115
    invoke-static {p1}, Ll/ۙᩳܳ;->֫(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(Ljava/lang/String;)V
    .locals 1

    .line 93
    sget-object v0, Ll/ۙᩳܳ;->᩸:Ll/ۧۤᩴ;

    invoke-virtual {v0, p0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩶ᩳܳ;

    if-eqz p0, :cond_0

    .line 94
    invoke-static {p0}, Ll/᩶ᩳܳ;->֫(Ll/᩶ᩳܳ;)V

    :cond_0
    return-void
.end method

.method public static ܽ(Ljava/lang/String;)V
    .locals 1

    if-nez p0, :cond_0

    goto :goto_0

    .line 85
    :cond_0
    sget-object v0, Ll/ۙᩳܳ;->᩸:Ll/ۧۤᩴ;

    invoke-virtual {v0, p0}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩶ᩳܳ;

    if-eqz p0, :cond_1

    .line 87
    invoke-virtual {p0}, Ll/᩶ᩳܳ;->close()V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 0

    .line 195
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "HTML preview provider is read-only"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 0

    .line 132
    invoke-static {p1}, Ll/ۙᩳܳ;->֫(Landroid/net/Uri;)Ll/᩶ᩳܳ;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string p1, "multipart/related"

    return-object p1
.end method

.method public final insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 0

    .line 186
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "HTML preview provider is read-only"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final onCreate()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final openFile(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .locals 1

    const-string v0, "r"

    .line 142
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 145
    invoke-static {p1}, Ll/ۙᩳܳ;->֫(Landroid/net/Uri;)Ll/᩶ᩳܳ;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 149
    invoke-static {p1}, Ll/᩶ᩳܳ;->ۧ(Ll/᩶ᩳܳ;)Landroid/os/ParcelFileDescriptor;

    move-result-object p1

    return-object p1

    .line 147
    :cond_0
    new-instance p1, Ljava/io/FileNotFoundException;

    const-string p2, "Unknown HTML preview token"

    invoke-direct {p1, p2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 143
    :cond_1
    new-instance p1, Ljava/io/FileNotFoundException;

    const-string p2, "HTML preview provider is read-only"

    invoke-direct {p1, p2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 0

    .line 204
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "HTML preview provider is read-only"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
