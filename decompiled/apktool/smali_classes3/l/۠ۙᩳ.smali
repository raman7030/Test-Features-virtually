.class public final Ll/۠ۙᩳ;
.super Ljava/io/Reader;
.source "H6MY"


# instance fields
.field public final ᩸:Ll/ۘۙᩳ;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;Ll/֨۬ᩳ;)V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/io/Reader;-><init>()V

    .line 15
    new-instance v0, Ll/ۘۙᩳ;

    invoke-static {p1, p2, p3}, Ll/ۨ᩶ᩳ;->֫(Ljava/io/InputStream;Ljava/nio/charset/Charset;Ll/֨۬ᩳ;)Ll/ۨ᩶ᩳ;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ۘۙᩳ;-><init>(Ljava/io/Reader;)V

    iput-object v0, p0, Ll/۠ۙᩳ;->᩸:Ll/ۘۙᩳ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 27
    iget-object v0, p0, Ll/۠ۙᩳ;->᩸:Ll/ۘۙᩳ;

    invoke-virtual {v0}, Ll/ۘۙᩳ;->close()V

    return-void
.end method

.method public final read([CII)I
    .locals 1

    .line 26
    iget-object v0, p0, Ll/۠ۙᩳ;->᩸:Ll/ۘۙᩳ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۘۙᩳ;->read([CII)I

    move-result p1

    return p1
.end method

.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 19
    iget-object v0, p0, Ll/۠ۙᩳ;->᩸:Ll/ۘۙᩳ;

    invoke-virtual {v0}, Ll/ۘۙᩳ;->֫()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const-string v0, "\n"

    return-object v0

    :cond_0
    const-string v0, "\r\n"

    return-object v0

    :cond_1
    const-string v0, "\r"

    return-object v0
.end method
