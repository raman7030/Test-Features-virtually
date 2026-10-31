.class public final Ll/ۘܰᩳ;
.super Landroid/os/ResultReceiver;
.source "C2CV"


# static fields
.field public static ᩹:I


# instance fields
.field public volatile ᩸:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 12
    invoke-direct {p0, v0}, Landroid/os/ResultReceiver;-><init>(Landroid/os/Handler;)V

    const/4 v0, -0x1

    .line 9
    iput v0, p0, Ll/ۘܰᩳ;->᩸:I

    return-void
.end method


# virtual methods
.method public final onReceiveResult(ILandroid/os/Bundle;)V
    .locals 0

    .line 21
    iput p1, p0, Ll/ۘܰᩳ;->᩸:I

    return-void
.end method

.method public final ֫()I
    .locals 5

    .line 25
    sget v0, Ll/ۘܰᩳ;->᩹:I

    const/16 v1, 0xa

    const/4 v2, -0x1

    if-le v0, v1, :cond_0

    return v2

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 28
    :goto_0
    iget v3, p0, Ll/ۘܰᩳ;->᩸:I

    if-ne v3, v2, :cond_1

    const/16 v3, 0x3c

    if-ge v1, v3, :cond_1

    const-wide/16 v3, 0x5

    .line 29
    invoke-static {v3, v4}, Landroid/os/SystemClock;->sleep(J)V

    add-int/lit8 v1, v1, 0x5

    goto :goto_0

    .line 32
    :cond_1
    iget v1, p0, Ll/ۘܰᩳ;->᩸:I

    if-ne v1, v2, :cond_2

    .line 33
    sget v0, Ll/ۘܰᩳ;->᩹:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Ll/ۘܰᩳ;->᩹:I

    goto :goto_1

    .line 35
    :cond_2
    sput v0, Ll/ۘܰᩳ;->᩹:I

    .line 36
    :goto_1
    iget v0, p0, Ll/ۘܰᩳ;->᩸:I

    return v0
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, -0x1

    .line 16
    iput v0, p0, Ll/ۘܰᩳ;->᩸:I

    return-void
.end method
