.class public final Ll/ۧܽ֡;
.super Ljava/io/IOException;
.source "B4EL"


# instance fields
.field public final ᩸:Ll/ܰ֫֡;


# direct methods
.method public constructor <init>(Ll/ܰ֫֡;)V
    .locals 2

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "stream was reset: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 26
    iput-object p1, p0, Ll/ۧܽ֡;->᩸:Ll/ܰ֫֡;

    return-void
.end method
