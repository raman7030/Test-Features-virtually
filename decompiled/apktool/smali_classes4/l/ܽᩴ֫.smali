.class public final Ll/ܽᩴ֫;
.super Ljava/lang/Object;
.source "L8MG"


# instance fields
.field public final ֫:Landroid/media/AudioAttributes;


# direct methods
.method public constructor <init>(Ll/ᩳᩴ֫;)V
    .locals 2

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance p1, Landroid/media/AudioAttributes$Builder;

    invoke-direct {p1}, Landroid/media/AudioAttributes$Builder;-><init>()V

    const/4 v0, 0x0

    .line 49
    invoke-virtual {p1, v0}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p1

    .line 50
    invoke-virtual {p1, v0}, Landroid/media/AudioAttributes$Builder;->setFlags(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p1

    const/4 v0, 0x1

    .line 51
    invoke-virtual {p1, v0}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p1

    .line 52
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    .line 53
    invoke-static {p1}, Ll/֫ᩴ֫;->֫(Landroid/media/AudioAttributes$Builder;)V

    :cond_0
    const/16 v1, 0x20

    if-lt v0, v1, :cond_1

    .line 56
    invoke-static {p1}, Ll/ۧᩴ֫;->ۧ(Landroid/media/AudioAttributes$Builder;)V

    .line 57
    invoke-static {p1}, Ll/ۧᩴ֫;->֫(Landroid/media/AudioAttributes$Builder;)V

    .line 59
    :cond_1
    invoke-virtual {p1}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object p1

    iput-object p1, p0, Ll/ܽᩴ֫;->֫:Landroid/media/AudioAttributes;

    return-void
.end method
