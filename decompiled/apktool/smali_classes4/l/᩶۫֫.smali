.class public final Ll/᩶۫֫;
.super Ljava/lang/Exception;
.source "E8QX"


# instance fields
.field public final ᩶:Z

.field public final ᩸:I

.field public final ᩹:Ll/۠ᩴ֫;


# direct methods
.method public constructor <init>(ILl/۠ᩴ֫;Z)V
    .locals 1

    const-string v0, "AudioTrack write failed: "

    .line 0
    invoke-static {p1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 339
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 340
    iput-boolean p3, p0, Ll/᩶۫֫;->᩶:Z

    .line 341
    iput p1, p0, Ll/᩶۫֫;->᩸:I

    .line 342
    iput-object p2, p0, Ll/᩶۫֫;->᩹:Ll/۠ᩴ֫;

    return-void
.end method
