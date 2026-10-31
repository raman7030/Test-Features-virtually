.class public Lpl/droidsonroids/gif/GifIOException;
.super Ljava/io/IOException;
.source "GifIOException.java"


# static fields
.field public static final serialVersionUID:J = 0xbdbbd5fa1b9L


# instance fields
.field public final ᩸:Ljava/lang/String;

.field public final ᩹:Ll/ᩳۢ֨;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 31
    invoke-static {p1}, Ll/ᩳۢ֨;->֫(I)Ll/ᩳۢ֨;

    move-result-object p1

    iput-object p1, p0, Lpl/droidsonroids/gif/GifIOException;->᩹:Ll/ᩳۢ֨;

    .line 32
    iput-object p2, p0, Lpl/droidsonroids/gif/GifIOException;->᩸:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getMessage()Ljava/lang/String;
    .locals 3

    .line 24
    iget-object v0, p0, Lpl/droidsonroids/gif/GifIOException;->᩹:Ll/ᩳۢ֨;

    iget-object v1, p0, Lpl/droidsonroids/gif/GifIOException;->᩸:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 25
    invoke-virtual {v0}, Ll/ᩳۢ֨;->ۧ()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 27
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ll/ᩳۢ֨;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ": "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
