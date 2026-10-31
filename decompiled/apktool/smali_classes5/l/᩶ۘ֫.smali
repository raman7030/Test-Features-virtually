.class public final Ll/᩶ۘ֫;
.super Ll/ۙۘ֫;
.source "J219"


# direct methods
.method public constructor <init>(Landroid/media/session/MediaSessionManager$RemoteUserInfo;)V
    .locals 2

    .line 75
    invoke-virtual {p1}, Landroid/media/session/MediaSessionManager$RemoteUserInfo;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/media/session/MediaSessionManager$RemoteUserInfo;->getPid()I

    move-result v1

    .line 76
    invoke-virtual {p1}, Landroid/media/session/MediaSessionManager$RemoteUserInfo;->getUid()I

    move-result p1

    .line 75
    invoke-direct {p0, v0, v1, p1}, Ll/ۙۘ֫;-><init>(Ljava/lang/String;II)V

    return-void
.end method

.method public static ֫(Landroid/media/session/MediaSessionManager$RemoteUserInfo;)Ljava/lang/String;
    .locals 0

    .line 82
    invoke-virtual {p0}, Landroid/media/session/MediaSessionManager$RemoteUserInfo;->getPackageName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
