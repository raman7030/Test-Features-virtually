.class public final Ll/᩷֡֫;
.super Ljava/lang/Object;
.source "R7UD"


# instance fields
.field public ֫:Ll/ᩳᩴ֫;

.field public ۧ:Landroid/os/Handler;

.field public ܽ:I

.field public ܿ:Z

.field public ᩳ:Landroid/media/AudioManager$OnAudioFocusChangeListener;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 187
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 188
    sget-object v0, Ll/ᩳᩴ֫;->ۧ:Ll/ᩳᩴ֫;

    iput-object v0, p0, Ll/᩷֡֫;->֫:Ll/ᩳᩴ֫;

    .line 189
    iput p1, p0, Ll/᩷֡֫;->ܽ:I

    return-void
.end method

.method public constructor <init>(Ll/ܺ֡֫;)V
    .locals 1

    .line 192
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 193
    invoke-virtual {p1}, Ll/ܺ֡֫;->ܿ()I

    move-result v0

    iput v0, p0, Ll/᩷֡֫;->ܽ:I

    .line 194
    invoke-virtual {p1}, Ll/ܺ֡֫;->ܳ()Landroid/media/AudioManager$OnAudioFocusChangeListener;

    move-result-object v0

    iput-object v0, p0, Ll/᩷֡֫;->ᩳ:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 195
    invoke-virtual {p1}, Ll/ܺ֡֫;->ᩳ()Landroid/os/Handler;

    move-result-object v0

    iput-object v0, p0, Ll/᩷֡֫;->ۧ:Landroid/os/Handler;

    .line 196
    invoke-virtual {p1}, Ll/ܺ֡֫;->ۧ()Ll/ᩳᩴ֫;

    move-result-object v0

    iput-object v0, p0, Ll/᩷֡֫;->֫:Ll/ᩳᩴ֫;

    .line 197
    invoke-virtual {p1}, Ll/ܺ֡֫;->᩻()Z

    move-result p1

    iput-boolean p1, p0, Ll/᩷֡֫;->ܿ:Z

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ܺ֡֫;
    .locals 7

    .line 293
    iget-object v2, p0, Ll/᩷֡֫;->ᩳ:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    if-eqz v2, :cond_0

    .line 297
    new-instance v6, Ll/ܺ֡֫;

    iget-object v3, p0, Ll/᩷֡֫;->ۧ:Landroid/os/Handler;

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    iget-object v4, p0, Ll/᩷֡֫;->֫:Ll/ᩳᩴ֫;

    iget-boolean v5, p0, Ll/᩷֡֫;->ܿ:Z

    iget v1, p0, Ll/᩷֡֫;->ܽ:I

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/ܺ֡֫;-><init>(ILandroid/media/AudioManager$OnAudioFocusChangeListener;Landroid/os/Handler;Ll/ᩳᩴ֫;Z)V

    return-object v6

    .line 294
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t build an AudioFocusRequestCompat instance without a listener"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ll/ܶ᩹֫;Landroid/os/Handler;)V
    .locals 0

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    iput-object p1, p0, Ll/᩷֡֫;->ᩳ:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 249
    iput-object p2, p0, Ll/᩷֡֫;->ۧ:Landroid/os/Handler;

    return-void
.end method

.method public final ֫(Ll/ᩳᩴ֫;)V
    .locals 0

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    iput-object p1, p0, Ll/᩷֡֫;->֫:Ll/ᩳᩴ֫;

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 282
    iput-boolean p1, p0, Ll/᩷֡֫;->ܿ:Z

    return-void
.end method
