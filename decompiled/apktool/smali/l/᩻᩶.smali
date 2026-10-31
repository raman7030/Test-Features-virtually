.class public final Ll/᩻᩶;
.super Ljava/lang/Object;
.source "N5WY"


# instance fields
.field public ֫:Landroid/app/PendingIntent;

.field public ۜ:Ljava/lang/CharSequence;

.field public ۧ:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final ܳ:[Ll/ᩳۙ;

.field public ܽ:Z

.field public ܿ:Ll/ۙ۬;

.field public final ᩳ:Landroid/os/Bundle;

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/ۙ۬;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Ll/ᩳۙ;[Ll/ᩳۙ;ZZ)V
    .locals 1

    .line 5722
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p6, 0x1

    .line 5668
    iput-boolean p6, p0, Ll/᩻᩶;->᩻:Z

    .line 5723
    iput-object p1, p0, Ll/᩻᩶;->ܿ:Ll/ۙ۬;

    if-eqz p1, :cond_0

    .line 5724
    invoke-virtual {p1}, Ll/ۙ۬;->ᩳ()I

    move-result p6

    const/4 v0, 0x2

    if-ne p6, v0, :cond_0

    .line 5725
    invoke-virtual {p1}, Ll/ۙ۬;->ۧ()I

    move-result p1

    iput p1, p0, Ll/᩻᩶;->ۧ:I

    .line 5727
    :cond_0
    invoke-static {p2}, Ll/᩷᩶;->ۧ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Ll/᩻᩶;->ۜ:Ljava/lang/CharSequence;

    .line 5728
    iput-object p3, p0, Ll/᩻᩶;->֫:Landroid/app/PendingIntent;

    if-eqz p4, :cond_1

    goto :goto_0

    .line 5729
    :cond_1
    new-instance p4, Landroid/os/Bundle;

    invoke-direct {p4}, Landroid/os/Bundle;-><init>()V

    :goto_0
    iput-object p4, p0, Ll/᩻᩶;->ᩳ:Landroid/os/Bundle;

    .line 5730
    iput-object p5, p0, Ll/᩻᩶;->ܳ:[Ll/ᩳۙ;

    .line 5732
    iput-boolean p7, p0, Ll/᩻᩶;->ܽ:Z

    .line 5734
    iput-boolean p8, p0, Ll/᩻᩶;->᩻:Z

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 1

    .line 5779
    iget-boolean v0, p0, Ll/᩻᩶;->ܽ:Z

    return v0
.end method

.method public final ۧ()Ll/ۙ۬;
    .locals 3

    .line 5753
    iget-object v0, p0, Ll/᩻᩶;->ܿ:Ll/ۙ۬;

    if-nez v0, :cond_0

    iget v0, p0, Ll/᩻᩶;->ۧ:I

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    const-string v2, ""

    .line 5754
    invoke-static {v1, v2, v0}, Ll/ۙ۬;->֫(Landroid/content/res/Resources;Ljava/lang/String;I)Ll/ۙ۬;

    move-result-object v0

    iput-object v0, p0, Ll/᩻᩶;->ܿ:Ll/ۙ۬;

    .line 5756
    :cond_0
    iget-object v0, p0, Ll/᩻᩶;->ܿ:Ll/ۙ۬;

    return-object v0
.end method

.method public final ܽ()[Ll/ᩳۙ;
    .locals 1

    .line 5799
    iget-object v0, p0, Ll/᩻᩶;->ܳ:[Ll/ᩳۙ;

    return-object v0
.end method
