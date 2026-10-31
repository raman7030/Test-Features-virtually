.class public final Ll/ܳۧۘ;
.super Ljava/lang/Object;
.source "84DG"

# interfaces
.implements Ll/ۢ۟ۖ;


# instance fields
.field public ֫:[Ll/ۢ۟ۖ;


# direct methods
.method public varargs constructor <init>([Ll/ۢ۟ۖ;)V
    .locals 0

    .line 423
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 424
    iput-object p1, p0, Ll/ܳۧۘ;->֫:[Ll/ۢ۟ۖ;

    return-void
.end method


# virtual methods
.method public final read([B)Ll/ۚܰۖ;
    .locals 3

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x4

    if-ge v0, v1, :cond_1

    .line 429
    iget-object v1, p0, Ll/ܳۧۘ;->֫:[Ll/ۢ۟ۖ;

    aget-object v1, v1, v0

    .line 430
    invoke-interface {v1, p1}, Ll/ۢ۟ۖ;->֫([B)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 431
    invoke-interface {v1, p1}, Ll/ۢ۟ۖ;->read([B)Ll/ۚܰۖ;

    move-result-object p1

    check-cast p1, Ll/۠֫ۘ;

    return-object p1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 434
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Unknown packet format received."

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫([B)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x4

    if-ge v1, v2, :cond_1

    .line 439
    iget-object v2, p0, Ll/ܳۧۘ;->֫:[Ll/ۢ۟ۖ;

    aget-object v2, v2, v1

    .line 440
    invoke-interface {v2, p1}, Ll/ۢ۟ۖ;->֫([B)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method
