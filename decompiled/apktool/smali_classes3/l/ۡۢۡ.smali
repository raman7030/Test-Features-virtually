.class public final Ll/ۡۢۡ;
.super Ll/ۢ۬ۧ;
.source "I5UN"


# instance fields
.field public final synthetic ֫:Ll/ۖۢۡ;


# direct methods
.method public constructor <init>(Ll/ۖۢۡ;)V
    .locals 0

    .line 66
    iput-object p1, p0, Ll/ۡۢۡ;->֫:Ll/ۖۢۡ;

    invoke-direct {p0}, Ll/ۢ۬ۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final onScrollStateChanged(Ll/۬۬ۧ;I)V
    .locals 2

    .line 69
    iget-object p1, p0, Ll/ۡۢۡ;->֫:Ll/ۖۢۡ;

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    .line 70
    invoke-static {p1, p2}, Ll/ۖۢۡ;->֫(Ll/ۖۢۡ;Z)V

    return-void

    .line 72
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Ll/ۖۢۡ;->֫(Ll/ۖۢۡ;J)V

    const/4 p2, 0x0

    .line 73
    invoke-static {p1, p2}, Ll/ۖۢۡ;->֫(Ll/ۖۢۡ;Z)V

    return-void
.end method
