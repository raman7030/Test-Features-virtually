.class public final Ll/ܶ۫֫;
.super Ljava/lang/Exception;
.source "E8QX"


# instance fields
.field public final ᩶:Z

.field public final ᩸:I

.field public final ᩹:Ll/۠ᩴ֫;


# direct methods
.method public constructor <init>(IIIIILl/۠ᩴ֫;ZLjava/lang/RuntimeException;)V
    .locals 3

    const-string v0, "AudioTrack init failed "

    const-string v1, " Config("

    const-string v2, ", "

    .line 0
    invoke-static {v0, p1, v1, v2, p2}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-static {p2, p3, v2, p4, v2}, Ll/ۛۙܽ;->֫(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 291
    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ") "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    if-eqz p7, :cond_0

    const-string p3, " (recoverable)"

    goto :goto_0

    :cond_0
    const-string p3, ""

    .line 306
    :goto_0
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 264
    invoke-direct {p0, p2, p8}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 265
    iput p1, p0, Ll/ܶ۫֫;->᩸:I

    .line 266
    iput-boolean p7, p0, Ll/ܶ۫֫;->᩶:Z

    .line 267
    iput-object p6, p0, Ll/ܶ۫֫;->᩹:Ll/۠ᩴ֫;

    return-void
.end method
