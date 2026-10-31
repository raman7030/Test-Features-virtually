.class public final synthetic Ll/ܿۛܳ;
.super Ljava/lang/Object;
.source "HAIH"

# interfaces
.implements Lnet/sf/sevenzipjbinding/ISequentialOutStream;


# instance fields
.field public final synthetic ᩸:Ll/ᩳۛܳ;

.field public final synthetic ᩹:Ll/ۤܽ֡;


# direct methods
.method public synthetic constructor <init>(Ll/ᩳۛܳ;Ll/ۤܽ֡;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿۛܳ;->᩸:Ll/ᩳۛܳ;

    iput-object p2, p0, Ll/ܿۛܳ;->᩹:Ll/ۤܽ֡;

    return-void
.end method


# virtual methods
.method public final write(Ljava/nio/ByteBuffer;)I
    .locals 3

    .line 2
    iget-object v0, p0, Ll/ܿۛܳ;->᩸:Ll/ᩳۛܳ;

    .line 4
    iget-object v1, p0, Ll/ܿۛܳ;->᩹:Ll/ۤܽ֡;

    const/4 v2, 0x1

    .line 265
    :try_start_0
    iput-boolean v2, v0, Ll/ᩳۛܳ;->ᩳ:Z

    .line 266
    invoke-interface {v1, p1}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 268
    new-instance v0, Lnet/sf/sevenzipjbinding/SevenZipException;

    invoke-direct {v0, p1}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method
