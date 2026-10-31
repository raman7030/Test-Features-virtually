.class public final Ll/ۡ֨ۢ;
.super Ljava/lang/Object;
.source "D98Y"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ᩸:Ljava/io/InputStream;

.field public final ᩹:Ljava/io/ByteArrayOutputStream;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;)V
    .locals 0

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 124
    iput-object p1, p0, Ll/ۡ֨ۢ;->᩸:Ljava/io/InputStream;

    .line 125
    iput-object p2, p0, Ll/ۡ֨ۢ;->᩹:Ljava/io/ByteArrayOutputStream;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    const/16 v0, 0x400

    new-array v0, v0, [B

    .line 133
    :goto_0
    :try_start_0
    iget-object v1, p0, Ll/ۡ֨ۢ;->᩸:Ljava/io/InputStream;

    invoke-virtual {v1, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    .line 134
    iget-object v2, p0, Ll/ۡ֨ۢ;->᩹:Ljava/io/ByteArrayOutputStream;

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3, v1}, Ljava/io/OutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    return-void
.end method
