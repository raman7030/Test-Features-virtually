.class public Ll/۠ۖ֫;
.super Ljava/lang/Object;
.source "I8UX"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ll/۫᩺ۧ;)Ll/֨ۖ֫;
    .locals 3

    .line 11
    new-instance v0, Ll/֨ۖ֫;

    invoke-direct {v0}, Ll/֨ۖ֫;-><init>()V

    .line 12
    iget-object v1, v0, Ll/֡ۖ֫;->֫:Landroid/media/AudioAttributes;

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, Ll/۫᩺ۧ;->֫(Landroid/os/Parcelable;I)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/media/AudioAttributes;

    iput-object v1, v0, Ll/֡ۖ֫;->֫:Landroid/media/AudioAttributes;

    .line 13
    iget v1, v0, Ll/֡ۖ֫;->ۧ:I

    const/4 v2, 0x2

    invoke-virtual {p0, v1, v2}, Ll/۫᩺ۧ;->֫(II)I

    move-result p0

    iput p0, v0, Ll/֡ۖ֫;->ۧ:I

    return-object v0
.end method

.method public static ֫(Ll/֨ۖ֫;Ll/۫᩺ۧ;)V
    .locals 2

    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    iget-object v0, p0, Ll/֡ۖ֫;->֫:Landroid/media/AudioAttributes;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Ll/۫᩺ۧ;->ۧ(Landroid/os/Parcelable;I)V

    .line 21
    iget p0, p0, Ll/֡ۖ֫;->ۧ:I

    const/4 v0, 0x2

    invoke-virtual {p1, p0, v0}, Ll/۫᩺ۧ;->ۧ(II)V

    return-void
.end method
