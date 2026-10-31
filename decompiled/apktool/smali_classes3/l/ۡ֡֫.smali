.class public final Ll/ۡ֡֫;
.super Ljava/lang/Object;
.source "R7UD"

# interfaces
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;


# instance fields
.field public final ֫:Landroid/os/Handler;

.field public final ۧ:Landroid/media/AudioManager$OnAudioFocusChangeListener;


# direct methods
.method public constructor <init>(Landroid/media/AudioManager$OnAudioFocusChangeListener;Landroid/os/Handler;)V
    .locals 1

    .line 335
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 336
    iput-object p1, p0, Ll/ۡ֡֫;->ۧ:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 337
    invoke-virtual {p2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object p1

    sget-object p2, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 783
    new-instance p2, Landroid/os/Handler;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 337
    iput-object p2, p0, Ll/ۡ֡֫;->֫:Landroid/os/Handler;

    return-void
.end method

.method public static synthetic ֫(Ll/ۡ֡֫;I)V
    .locals 0

    .line 342
    iget-object p0, p0, Ll/ۡ֡֫;->ۧ:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    invoke-interface {p0, p1}, Landroid/media/AudioManager$OnAudioFocusChangeListener;->onAudioFocusChange(I)V

    return-void
.end method


# virtual methods
.method public final onAudioFocusChange(I)V
    .locals 1

    .line 342
    new-instance v0, Ll/ۢ֡֫;

    invoke-direct {v0, p0, p1}, Ll/ۢ֡֫;-><init>(Ll/ۡ֡֫;I)V

    iget-object p1, p0, Ll/ۡ֡֫;->֫:Landroid/os/Handler;

    invoke-static {p1, v0}, Ll/ۘ֨֫;->֫(Landroid/os/Handler;Ljava/lang/Runnable;)V

    return-void
.end method
