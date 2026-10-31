.class public final Ll/ۤۛ᩷;
.super Ljava/lang/Object;
.source "W52J"


# instance fields
.field public volatile ֫:Z

.field public volatile ۧ:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 2

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Ll/ۤۛ᩷;->ۧ:Z

    .line 14
    invoke-static {}, Ll/ۧۨۡ;->ܽ()V

    .line 15
    new-instance v0, Ll/۠᩷ܳ;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0, p1}, Ll/۠᩷ܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۤۛ᩷;)V
    .locals 1

    const/4 v0, 0x0

    .line 24
    iput-boolean v0, p0, Ll/ۤۛ᩷;->ۧ:Z

    .line 25
    iput-boolean v0, p0, Ll/ۤۛ᩷;->֫:Z

    return-void
.end method

.method public static synthetic ۧ(Ll/ۤۛ᩷;)V
    .locals 1

    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Ll/ۤۛ᩷;->ۧ:Z

    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, Ll/ۤۛ᩷;->֫:Z

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 2

    .line 31
    invoke-static {}, Ll/ۧۨۡ;->ܽ()V

    .line 32
    :goto_0
    iget-boolean v0, p0, Ll/ۤۛ᩷;->ۧ:Z

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x64

    .line 33
    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    goto :goto_0

    .line 35
    :cond_0
    iget-boolean v0, p0, Ll/ۤۛ᩷;->֫:Z

    return v0
.end method
