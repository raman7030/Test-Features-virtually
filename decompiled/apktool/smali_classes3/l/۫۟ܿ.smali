.class public final Ll/۫۟ܿ;
.super Ljava/lang/Object;
.source "X4M8"


# instance fields
.field public final ֫:Ll/ۜܰܿ;

.field public volatile ۧ:Ll/ۗ۟ܿ;

.field public final ܽ:Ll/۬۟ܿ;


# direct methods
.method public constructor <init>(Ll/ۜܰܿ;Ll/۬۟ܿ;)V
    .locals 0

    .line 644
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 645
    iput-object p1, p0, Ll/۫۟ܿ;->֫:Ll/ۜܰܿ;

    .line 646
    iput-object p2, p0, Ll/۫۟ܿ;->ܽ:Ll/۬۟ܿ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۫۟ܿ;Ll/ۗ۟ܿ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/۫۟ܿ;->ۧ:Ll/ۗ۟ܿ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 12

    .line 651
    iget-object v0, p0, Ll/۫۟ܿ;->ۧ:Ll/ۗ۟ܿ;

    if-eqz v0, :cond_3

    .line 652
    iget-object v1, p0, Ll/۫۟ܿ;->֫:Ll/ۜܰܿ;

    .line 197
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 199
    instance-of v2, v1, Ll/ۗܺ᩷;

    if-eqz v2, :cond_1

    .line 198
    check-cast v1, Ll/ۗܺ᩷;

    .line 199
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 655
    :cond_1
    :goto_0
    iget-boolean v1, v0, Ll/ۗ۟ܿ;->ۧ:Z

    if-eqz v1, :cond_2

    .line 656
    iget-object v0, p0, Ll/۫۟ܿ;->ܽ:Ll/۬۟ܿ;

    iget-object v1, p0, Ll/۫۟ܿ;->֫:Ll/ۜܰܿ;

    invoke-virtual {v0, v1}, Ll/۬۟ܿ;->֫(Ll/ۜܰܿ;)Z

    move-result v0

    if-eqz v0, :cond_3

    const v0, 0x7f120a85

    const/4 v1, 0x0

    .line 657
    invoke-static {v0, v1}, Ll/᩸ۚۢ;->ۧ(II)Ll/᩸ۚۢ;

    move-result-object v0

    .line 658
    invoke-virtual {v0}, Ll/᩸ۚۢ;->ۧ()V

    return-void

    .line 662
    :cond_2
    iget-object v2, p0, Ll/۫۟ܿ;->֫:Ll/ۜܰܿ;

    iget-object v3, p0, Ll/۫۟ܿ;->ܽ:Ll/۬۟ܿ;

    if-nez v1, :cond_3

    .line 189
    iget-object v4, v2, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    iget-object v5, v3, Ll/۬۟ܿ;->֫:Ll/ᩳܽܳ;

    iget-wide v6, v0, Ll/ۗ۟ܿ;->֫:J

    iget-wide v8, v3, Ll/۬۟ܿ;->ᩳ:J

    iget v10, v3, Ll/۬۟ܿ;->ܿ:I

    iget v11, v0, Ll/ۗ۟ܿ;->ܽ:I

    .line 190
    invoke-virtual/range {v4 .. v11}, Ll/ۧܰܿ;->֫(Ll/ᩳܽܳ;JJII)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 663
    iget-object v0, p0, Ll/۫۟ܿ;->֫:Ll/ۜܰܿ;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 664
    iget-object v0, p0, Ll/۫۟ܿ;->֫:Ll/ۜܰܿ;

    .line 922
    iget-object v1, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v1}, Ll/ۧܰܿ;->᩷()I

    move-result v1

    .line 664
    invoke-virtual {v0, v1}, Ll/ۜܰܿ;->֫(I)Z

    :cond_3
    return-void
.end method
