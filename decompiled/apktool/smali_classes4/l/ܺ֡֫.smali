.class public final Ll/ܺ֡֫;
.super Ljava/lang/Object;
.source "R7UD"


# instance fields
.field public final ֫:Ll/ᩳᩴ֫;

.field public final ۧ:Landroid/os/Handler;

.field public final ܳ:Z

.field public final ܽ:I

.field public final ܿ:Landroid/media/AudioManager$OnAudioFocusChangeListener;

.field public final ᩳ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILandroid/media/AudioManager$OnAudioFocusChangeListener;Landroid/os/Handler;Ll/ᩳᩴ֫;Z)V
    .locals 3

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput p1, p0, Ll/ܺ֡֫;->ܽ:I

    .line 55
    iput-object p3, p0, Ll/ܺ֡֫;->ۧ:Landroid/os/Handler;

    .line 56
    iput-object p4, p0, Ll/ܺ֡֫;->֫:Ll/ᩳᩴ֫;

    .line 57
    iput-boolean p5, p0, Ll/ܺ֡֫;->ܳ:Z

    .line 59
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_0

    .line 60
    new-instance v2, Ll/ۡ֡֫;

    invoke-direct {v2, p2, p3}, Ll/ۡ֡֫;-><init>(Landroid/media/AudioManager$OnAudioFocusChangeListener;Landroid/os/Handler;)V

    iput-object v2, p0, Ll/ܺ֡֫;->ܿ:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    goto :goto_0

    .line 64
    :cond_0
    iput-object p2, p0, Ll/ܺ֡֫;->ܿ:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    :goto_0
    if-lt v0, v1, :cond_1

    .line 68
    new-instance v0, Landroid/media/AudioFocusRequest$Builder;

    invoke-direct {v0, p1}, Landroid/media/AudioFocusRequest$Builder;-><init>(I)V

    .line 70
    invoke-virtual {p4}, Ll/ᩳᩴ֫;->֫()Ll/ܽᩴ֫;

    move-result-object p1

    iget-object p1, p1, Ll/ܽᩴ֫;->֫:Landroid/media/AudioAttributes;

    invoke-virtual {v0, p1}, Landroid/media/AudioFocusRequest$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/AudioFocusRequest$Builder;

    move-result-object p1

    .line 71
    invoke-virtual {p1, p5}, Landroid/media/AudioFocusRequest$Builder;->setWillPauseWhenDucked(Z)Landroid/media/AudioFocusRequest$Builder;

    move-result-object p1

    .line 72
    invoke-virtual {p1, p2, p3}, Landroid/media/AudioFocusRequest$Builder;->setOnAudioFocusChangeListener(Landroid/media/AudioManager$OnAudioFocusChangeListener;Landroid/os/Handler;)Landroid/media/AudioFocusRequest$Builder;

    move-result-object p1

    .line 73
    invoke-virtual {p1}, Landroid/media/AudioFocusRequest$Builder;->build()Landroid/media/AudioFocusRequest;

    move-result-object p1

    iput-object p1, p0, Ll/ܺ֡֫;->ᩳ:Ljava/lang/Object;

    return-void

    :cond_1
    const/4 p1, 0x0

    .line 75
    iput-object p1, p0, Ll/ܺ֡֫;->ᩳ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 131
    :cond_0
    instance-of v1, p1, Ll/ܺ֡֫;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 134
    :cond_1
    check-cast p1, Ll/ܺ֡֫;

    .line 135
    iget v1, p0, Ll/ܺ֡֫;->ܽ:I

    iget v3, p1, Ll/ܺ֡֫;->ܽ:I

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Ll/ܺ֡֫;->ܳ:Z

    iget-boolean v3, p1, Ll/ܺ֡֫;->ܳ:Z

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Ll/ܺ֡֫;->ܿ:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    iget-object v3, p1, Ll/ܺ֡֫;->ܿ:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 137
    invoke-static {v1, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ܺ֡֫;->ۧ:Landroid/os/Handler;

    iget-object v3, p1, Ll/ܺ֡֫;->ۧ:Landroid/os/Handler;

    .line 138
    invoke-static {v1, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ܺ֡֫;->֫:Ll/ᩳᩴ֫;

    iget-object p1, p1, Ll/ܺ֡֫;->֫:Ll/ᩳᩴ֫;

    .line 139
    invoke-static {v1, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 4

    .line 144
    iget v0, p0, Ll/ܺ֡֫;->ܽ:I

    .line 145
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-boolean v1, p0, Ll/ܺ֡֫;->ܳ:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x5

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    iget-object v3, p0, Ll/ܺ֡֫;->ܿ:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    aput-object v3, v2, v0

    const/4 v0, 0x2

    iget-object v3, p0, Ll/ܺ֡֫;->ۧ:Landroid/os/Handler;

    aput-object v3, v2, v0

    const/4 v0, 0x3

    iget-object v3, p0, Ll/ܺ֡֫;->֫:Ll/ᩳᩴ֫;

    aput-object v3, v2, v0

    const/4 v0, 0x4

    aput-object v1, v2, v0

    .line 144
    invoke-static {v2}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final ֫()Ll/᩷֡֫;
    .locals 1

    .line 123
    new-instance v0, Ll/᩷֡֫;

    invoke-direct {v0, p0}, Ll/᩷֡֫;-><init>(Ll/ܺ֡֫;)V

    return-object v0
.end method

.method public final ۧ()Ll/ᩳᩴ֫;
    .locals 1

    .line 92
    iget-object v0, p0, Ll/ܺ֡֫;->֫:Ll/ᩳᩴ֫;

    return-object v0
.end method

.method public final ܳ()Landroid/media/AudioManager$OnAudioFocusChangeListener;
    .locals 1

    .line 111
    iget-object v0, p0, Ll/ܺ֡֫;->ܿ:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    return-object v0
.end method

.method public final ܽ()Landroid/media/AudioFocusRequest;
    .locals 1

    .line 155
    iget-object v0, p0, Ll/ܺ֡֫;->ᩳ:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    check-cast v0, Landroid/media/AudioFocusRequest;

    return-object v0
.end method

.method public final ܿ()I
    .locals 1

    .line 84
    iget v0, p0, Ll/ܺ֡֫;->ܽ:I

    return v0
.end method

.method public final ᩳ()Landroid/os/Handler;
    .locals 1

    .line 118
    iget-object v0, p0, Ll/ܺ֡֫;->ۧ:Landroid/os/Handler;

    return-object v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 101
    iget-boolean v0, p0, Ll/ܺ֡֫;->ܳ:Z

    return v0
.end method
