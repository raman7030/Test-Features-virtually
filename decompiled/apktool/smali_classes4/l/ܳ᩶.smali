.class public final Ll/ܳ᩶;
.super Ljava/lang/Object;
.source "N5WY"


# instance fields
.field public ֫:Z

.field public final ۧ:Landroid/os/Bundle;

.field public final ܽ:Ll/ۙ۬;

.field public final ܿ:Ljava/lang/CharSequence;

.field public ᩳ:Z


# direct methods
.method public constructor <init>(Ll/ۙ۬;Landroid/text/SpannableStringBuilder;)V
    .locals 2

    .line 5913
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 5951
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    .line 5851
    iput-boolean v1, p0, Ll/ܳ᩶;->֫:Z

    .line 5855
    iput-boolean v1, p0, Ll/ܳ᩶;->ᩳ:Z

    .line 5952
    iput-object p1, p0, Ll/ܳ᩶;->ܽ:Ll/ۙ۬;

    .line 5953
    invoke-static {p2}, Ll/᩷᩶;->ۧ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Ll/ܳ᩶;->ܿ:Ljava/lang/CharSequence;

    .line 5955
    iput-object v0, p0, Ll/ܳ᩶;->ۧ:Landroid/os/Bundle;

    .line 5958
    iput-boolean v1, p0, Ll/ܳ᩶;->֫:Z

    .line 5960
    iput-boolean v1, p0, Ll/ܳ᩶;->ᩳ:Z

    return-void
.end method


# virtual methods
.method public final ֫()Ll/᩻᩶;
    .locals 13

    .line 6102
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6103
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6113
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v10, v3

    goto :goto_0

    .line 6114
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v2, v2, [Ll/ᩳۙ;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ᩳۙ;

    move-object v10, v0

    .line 6115
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_1
    move-object v9, v3

    goto :goto_2

    .line 6116
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Ll/ᩳۙ;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, [Ll/ᩳۙ;

    goto :goto_1

    .line 6117
    :goto_2
    new-instance v0, Ll/᩻᩶;

    iget-boolean v11, p0, Ll/ܳ᩶;->֫:Z

    iget-boolean v12, p0, Ll/ܳ᩶;->ᩳ:Z

    iget-object v5, p0, Ll/ܳ᩶;->ܽ:Ll/ۙ۬;

    iget-object v6, p0, Ll/ܳ᩶;->ܿ:Ljava/lang/CharSequence;

    const/4 v7, 0x0

    iget-object v8, p0, Ll/ܳ᩶;->ۧ:Landroid/os/Bundle;

    move-object v4, v0

    invoke-direct/range {v4 .. v12}, Ll/᩻᩶;-><init>(Ll/ۙ۬;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Ll/ᩳۙ;[Ll/ᩳۙ;ZZ)V

    return-object v0
.end method
