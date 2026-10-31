.class public final Ll/ۜۤ;
.super Ljava/lang/Thread;
.source "DB1R"


# instance fields
.field public final ᩸:I


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    const-string v0, "fonts-androidx"

    .line 178
    invoke-direct {p0, p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    const/16 p1, 0xa

    .line 179
    iput p1, p0, Ll/ۜۤ;->᩸:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 184
    iget v0, p0, Ll/ۜۤ;->᩸:I

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 185
    invoke-super {p0}, Ljava/lang/Thread;->run()V

    return-void
.end method
