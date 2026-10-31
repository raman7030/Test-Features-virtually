.class public final Ll/ۡ۟ܿ;
.super Ljava/lang/Object;
.source "M70U"


# instance fields
.field public volatile ֫:Z

.field public volatile ۧ:J

.field public final ܽ:Ll/ۜܰܿ;

.field public volatile ᩳ:Ll/֫ܰܿ;


# direct methods
.method public constructor <init>(Ll/ۜܰܿ;)V
    .locals 0

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 122
    iput-object p1, p0, Ll/ۡ۟ܿ;->ܽ:Ll/ۜܰܿ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۡ۟ܿ;)Ll/֫ܰܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡ۟ܿ;->ᩳ:Ll/֫ܰܿ;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ۡ۟ܿ;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/ۡ۟ܿ;->ۧ:J

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۡ۟ܿ;Ll/֫ܰܿ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۡ۟ܿ;->ᩳ:Ll/֫ܰܿ;

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۡ۟ܿ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/ۡ۟ܿ;->֫:Z

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 127
    iget-object v0, p0, Ll/ۡ۟ܿ;->ᩳ:Ll/֫ܰܿ;

    if-eqz v0, :cond_2

    .line 128
    iget-boolean v1, p0, Ll/ۡ۟ܿ;->֫:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ۡ۟ܿ;->ܽ:Ll/ۜܰܿ;

    .line 109
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 111
    instance-of v2, v1, Ll/ۗܺ᩷;

    if-eqz v2, :cond_1

    .line 110
    check-cast v1, Ll/ۗܺ᩷;

    .line 111
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 128
    :cond_1
    :goto_0
    iget-object v1, p0, Ll/ۡ۟ܿ;->ܽ:Ll/ۜܰܿ;

    iget-object v1, v1, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    iget-wide v2, p0, Ll/ۡ۟ܿ;->ۧ:J

    .line 129
    invoke-virtual {v1, v0, v2, v3}, Ll/ۧܰܿ;->֫(Ll/֫ܰܿ;J)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 130
    iget-object v0, p0, Ll/ۡ۟ܿ;->ܽ:Ll/ۜܰܿ;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 131
    iget-object v0, p0, Ll/ۡ۟ܿ;->ܽ:Ll/ۜܰܿ;

    .line 922
    iget-object v1, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v1}, Ll/ۧܰܿ;->᩷()I

    move-result v1

    .line 131
    invoke-virtual {v0, v1}, Ll/ۜܰܿ;->֫(I)Z

    :cond_2
    return-void
.end method
