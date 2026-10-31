.class public final Ll/ᩳܺۡ;
.super Ljava/lang/Object;
.source "53XL"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final ᩸:Ll/ۧܺۡ;

.field public ᩹:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Ll/ۧܺۡ;)V
    .locals 1

    .line 180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 181
    iput-object p1, p0, Ll/ᩳܺۡ;->᩸:Ll/ۧܺۡ;

    .line 182
    invoke-interface {p1}, Ll/ۧܺۡ;->֫()Ljava/io/InputStream;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳܺۡ;->᩹:Ljava/io/InputStream;

    const/high16 v0, 0x100000

    .line 183
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->mark(I)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩳܺۡ;)Ljava/io/InputStream;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳܺۡ;->᩹:Ljava/io/InputStream;

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 203
    iget-object v0, p0, Ll/ᩳܺۡ;->᩹:Ljava/io/InputStream;

    const/4 v1, 0x0

    .line 204
    iput-object v1, p0, Ll/ᩳܺۡ;->᩹:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    .line 205
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    :cond_0
    return-void
.end method

.method public final ֫(Z)Ljava/io/InputStream;
    .locals 1

    .line 188
    iget-object v0, p0, Ll/ᩳܺۡ;->᩹:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    .line 190
    :try_start_0
    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 192
    :catch_0
    invoke-virtual {p0}, Ll/ᩳܺۡ;->close()V

    .line 196
    :cond_0
    :goto_0
    iget-object v0, p0, Ll/ᩳܺۡ;->᩹:Ljava/io/InputStream;

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ᩳܺۡ;->᩸:Ll/ۧܺۡ;

    invoke-interface {v0}, Ll/ۧܺۡ;->֫()Ljava/io/InputStream;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳܺۡ;->᩹:Ljava/io/InputStream;

    .line 197
    :cond_1
    iget-object v0, p0, Ll/ᩳܺۡ;->᩹:Ljava/io/InputStream;

    if-eqz p1, :cond_2

    const/high16 p1, 0x100000

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    invoke-virtual {v0, p1}, Ljava/io/InputStream;->mark(I)V

    .line 198
    iget-object p1, p0, Ll/ᩳܺۡ;->᩹:Ljava/io/InputStream;

    return-object p1
.end method
