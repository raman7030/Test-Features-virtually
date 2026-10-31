.class public Ll/ۧۙ;
.super Ljava/lang/Object;
.source "O220"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ll/۫᩺ۧ;)Ll/֫ۙ;
    .locals 3

    .line 11
    new-instance v0, Ll/֫ۙ;

    invoke-direct {v0}, Ll/֫ۙ;-><init>()V

    .line 12
    iget-object v1, v0, Ll/֫ۙ;->ᩳ:Ll/ۙ۬;

    invoke-virtual {p0, v1}, Ll/۫᩺ۧ;->֫(Ll/ۛ᩺ۧ;)Ll/ۛ᩺ۧ;

    move-result-object v1

    check-cast v1, Ll/ۙ۬;

    iput-object v1, v0, Ll/֫ۙ;->ᩳ:Ll/ۙ۬;

    .line 13
    iget-object v1, v0, Ll/֫ۙ;->ܳ:Ljava/lang/CharSequence;

    const/4 v2, 0x2

    invoke-virtual {p0, v2, v1}, Ll/۫᩺ۧ;->֫(ILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    iput-object v1, v0, Ll/֫ۙ;->ܳ:Ljava/lang/CharSequence;

    .line 14
    iget-object v1, v0, Ll/֫ۙ;->ۧ:Ljava/lang/CharSequence;

    const/4 v2, 0x3

    invoke-virtual {p0, v2, v1}, Ll/۫᩺ۧ;->֫(ILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    iput-object v1, v0, Ll/֫ۙ;->ۧ:Ljava/lang/CharSequence;

    .line 15
    iget-object v1, v0, Ll/֫ۙ;->֫:Landroid/app/PendingIntent;

    const/4 v2, 0x4

    invoke-virtual {p0, v1, v2}, Ll/۫᩺ۧ;->֫(Landroid/os/Parcelable;I)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/app/PendingIntent;

    iput-object v1, v0, Ll/֫ۙ;->֫:Landroid/app/PendingIntent;

    .line 16
    iget-boolean v1, v0, Ll/֫ۙ;->ܽ:Z

    const/4 v2, 0x5

    invoke-virtual {p0, v2, v1}, Ll/۫᩺ۧ;->֫(IZ)Z

    move-result v1

    iput-boolean v1, v0, Ll/֫ۙ;->ܽ:Z

    .line 17
    iget-boolean v1, v0, Ll/֫ۙ;->ܿ:Z

    const/4 v2, 0x6

    invoke-virtual {p0, v2, v1}, Ll/۫᩺ۧ;->֫(IZ)Z

    move-result p0

    iput-boolean p0, v0, Ll/֫ۙ;->ܿ:Z

    return-object v0
.end method

.method public static ֫(Ll/֫ۙ;Ll/۫᩺ۧ;)V
    .locals 2

    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    iget-object v0, p0, Ll/֫ۙ;->ᩳ:Ll/ۙ۬;

    invoke-virtual {p1, v0}, Ll/۫᩺ۧ;->ۧ(Ll/ۛ᩺ۧ;)V

    .line 25
    iget-object v0, p0, Ll/֫ۙ;->ܳ:Ljava/lang/CharSequence;

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Ll/۫᩺ۧ;->ۧ(ILjava/lang/CharSequence;)V

    .line 26
    iget-object v0, p0, Ll/֫ۙ;->ۧ:Ljava/lang/CharSequence;

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Ll/۫᩺ۧ;->ۧ(ILjava/lang/CharSequence;)V

    .line 27
    iget-object v0, p0, Ll/֫ۙ;->֫:Landroid/app/PendingIntent;

    const/4 v1, 0x4

    invoke-virtual {p1, v0, v1}, Ll/۫᩺ۧ;->ۧ(Landroid/os/Parcelable;I)V

    .line 28
    iget-boolean v0, p0, Ll/֫ۙ;->ܽ:Z

    const/4 v1, 0x5

    invoke-virtual {p1, v1, v0}, Ll/۫᩺ۧ;->ۧ(IZ)V

    .line 29
    iget-boolean p0, p0, Ll/֫ۙ;->ܿ:Z

    const/4 v0, 0x6

    invoke-virtual {p1, v0, p0}, Ll/۫᩺ۧ;->ۧ(IZ)V

    return-void
.end method
