.class public final Ll/᩺᩻ᩳ;
.super Ll/֡ܽ;
.source "K5R1"


# instance fields
.field public final synthetic ᩳ:Ll/ۜۜᩳ;


# direct methods
.method public constructor <init>(Ll/ۜۜᩳ;)V
    .locals 0

    .line 77
    iput-object p1, p0, Ll/᩺᩻ᩳ;->ᩳ:Ll/ۜۜᩳ;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ll/֡ܽ;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public final ۧ()V
    .locals 5

    .line 80
    iget-object v0, p0, Ll/᩺᩻ᩳ;->ᩳ:Ll/ۜۜᩳ;

    iget-object v1, v0, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    invoke-virtual {v1}, Ll/᩻ۜᩳ;->ᩳ()Ll/ۙۜᩳ;

    move-result-object v1

    .line 81
    iget-object v2, v0, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-boolean v3, v2, Ll/᩻ۜᩳ;->᩻֫:Z

    if-eqz v3, :cond_2

    sget-object v3, Ll/ۙۜᩳ;->ۨ:Ll/ۙۜᩳ;

    if-eq v1, v3, :cond_0

    sget-object v4, Ll/ۙۜᩳ;->᩹:Ll/ۙۜᩳ;

    if-ne v1, v4, :cond_2

    :cond_0
    const/4 v4, 0x0

    .line 82
    iput-boolean v4, v2, Ll/᩻ۜᩳ;->᩻֫:Z

    if-ne v1, v3, :cond_1

    const v1, 0x7f120a00

    .line 84
    invoke-virtual {v0, v1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    goto :goto_0

    .line 86
    :cond_1
    iget-object v1, v2, Ll/᩻ۜᩳ;->ۙ:Ll/ۖܿܽ;

    invoke-virtual {v1}, Ll/ۜᩳܽ;->ۧۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    .line 87
    :goto_0
    iget-object v0, v0, Ll/ۜۜᩳ;->ᩳۧ:Ll/۫᩵ۘ;

    invoke-virtual {v0}, Ll/ۙ᩵ۘ;->notifyDataSetChanged()V

    return-void

    .line 89
    :cond_2
    invoke-static {v0}, Ll/ۜۜᩳ;->ۧ(Ll/ۜۜᩳ;)V

    return-void
.end method
