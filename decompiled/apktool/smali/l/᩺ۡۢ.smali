.class public final Ll/᩺ۡۢ;
.super Ll/۟ܶۡ;
.source "31PG"


# instance fields
.field public final synthetic ܳ:Ll/ܰۡۢ;


# direct methods
.method public constructor <init>(Ll/ܰۡۢ;)V
    .locals 0

    .line 1082
    iput-object p1, p0, Ll/᩺ۡۢ;->ܳ:Ll/ܰۡۢ;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 5

    .line 1099
    iget-object v0, p0, Ll/᩺ۡۢ;->ܳ:Ll/ܰۡۢ;

    iget-object v1, v0, Ll/ܰۡۢ;->۬:Ll/۟ۡۢ;

    iget-object v2, v0, Ll/ܰۡۢ;->ۗ:Ll/ܽܺۢ;

    iget v3, v2, Ll/ܽܺۢ;->ۙ:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_1

    .line 1100
    sget-object v3, Ll/ۡܺۢ;->ۤ:Ll/ᩴ᩵;

    iget-object v2, v2, Ll/ܽܺۢ;->ۤ:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ll/ᩴ᩵;->add(Ljava/lang/Object;)Z

    .line 1101
    invoke-static {v1}, Ll/۟ۡۢ;->ܿ(Ll/۟ۡۢ;)Ljava/util/List;

    move-result-object v2

    iget-object v0, v0, Ll/ܰۡۢ;->ۗ:Ll/ܽܺۢ;

    invoke-interface {v2, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    if-ne v0, v4, :cond_0

    .line 225
    new-instance v0, Ll/ܰۢۢ;

    invoke-direct {v0, v1}, Ll/ܰۢۢ;-><init>(Ll/۟ۡۢ;)V

    .line 280
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    return-void

    .line 1105
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v1}, Ll/۟ۡۢ;->ܿ(Ll/۟ۡۢ;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1106
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1107
    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-static {v1, v2}, Ll/۟ۡۢ;->֫(Ll/۟ۡۢ;Ljava/util/List;)V

    .line 1108
    invoke-static {v1}, Ll/۟ۡۢ;->ۧ(Ll/۟ۡۢ;)Ll/ܺۡۢ;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/᩶ۗۧ;->notifyItemRemoved(I)V

    return-void

    .line 1111
    :cond_1
    invoke-static {v1}, Ll/۟ۡۢ;->᩷(Ll/۟ۡۢ;)Ljava/util/List;

    move-result-object v2

    iget-object v0, v0, Ll/ܰۡۢ;->ۗ:Ll/ܽܺۢ;

    invoke-interface {v2, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    if-ne v0, v4, :cond_2

    .line 225
    new-instance v0, Ll/ܰۢۢ;

    invoke-direct {v0, v1}, Ll/ܰۢۢ;-><init>(Ll/۟ۡۢ;)V

    .line 280
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    return-void

    .line 1115
    :cond_2
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v1}, Ll/۟ۡۢ;->᩷(Ll/۟ۡۢ;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1116
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1117
    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-static {v1, v2}, Ll/۟ۡۢ;->ۧ(Ll/۟ۡۢ;Ljava/util/List;)V

    .line 1118
    invoke-static {v1}, Ll/۟ۡۢ;->ۧ(Ll/۟ۡۢ;)Ll/ܺۡۢ;

    move-result-object v2

    invoke-static {v1}, Ll/۟ۡۢ;->ܿ(Ll/۟ۡۢ;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {v2, v3}, Ll/᩶ۗۧ;->notifyItemRemoved(I)V

    .line 1119
    new-instance v0, Ll/᩵ۡۢ;

    invoke-direct {v0, v1}, Ll/᩵ۡۢ;-><init>(Ll/۟ۡۢ;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 1126
    instance-of v0, p1, Ll/֫ۛۡ;

    if-nez v0, :cond_1

    instance-of v0, p1, Ll/᩵ۤۡ;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1129
    :cond_0
    iget-object v0, p0, Ll/᩺ۡۢ;->ܳ:Ll/ܰۡۢ;

    iget-object v0, v0, Ll/ܰۡۢ;->۬:Ll/۟ۡۢ;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void

    .line 1127
    :cond_1
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 1086
    iget-object v0, p0, Ll/᩺ۡۢ;->ܳ:Ll/ܰۡۢ;

    iget-object v0, v0, Ll/ܰۡۢ;->۬:Ll/۟ۡۢ;

    const v1, 0x7f12087c

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 4

    .line 1091
    iget-object v0, p0, Ll/᩺ۡۢ;->ܳ:Ll/ܰۡۢ;

    iget-object v1, v0, Ll/ܰۡۢ;->ۗ:Ll/ܽܺۢ;

    iget v2, v1, Ll/ܽܺۢ;->ۙ:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_3

    .line 1092
    sget v2, Ll/֫ܺۢ;->֫:I

    .line 125
    invoke-static {}, Ll/ܺܰۡ;->ۜ()Z

    move-result v2

    const v3, 0x7f120520

    if-nez v2, :cond_2

    .line 127
    invoke-static {}, Ll/ܺܰۡ;->᩻()Z

    move-result v2

    if-nez v2, :cond_1

    const/16 v2, 0x1047

    .line 130
    invoke-static {v2}, Ll/ᩳᩴۡ;->ᩳ(I)Ll/ᩳᩴۡ;

    move-result-object v2

    iget v1, v1, Ll/ܽܺۢ;->ۙ:I

    .line 131
    invoke-virtual {v2, v1}, Ll/ᩳᩴۡ;->ۧ(I)V

    .line 132
    invoke-virtual {v2}, Ll/ᩳᩴۡ;->ᩳ()Ll/᩻ᩴۡ;

    move-result-object v1

    .line 133
    invoke-virtual {v1}, Ll/᩻ᩴۡ;->ܳ()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 134
    :cond_0
    new-instance v0, Ll/֫ۛۡ;

    .line 232
    invoke-static {v1, v3}, Ll/֫ۘۡ;->֫(Ll/᩻ᩴۡ;I)Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 134
    throw v0

    .line 128
    :cond_1
    new-instance v0, Ll/֫ۛۡ;

    new-instance v1, Ll/᩻ᩴۡ;

    const/16 v2, 0x6a6

    invoke-direct {v1, v2}, Ll/᩻ᩴۡ;-><init>(I)V

    .line 232
    invoke-static {v1, v3}, Ll/֫ۘۡ;->֫(Ll/᩻ᩴۡ;I)Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 128
    throw v0

    .line 126
    :cond_2
    new-instance v0, Ll/֫ۛۡ;

    new-instance v1, Ll/᩻ᩴۡ;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ll/᩻ᩴۡ;-><init>(I)V

    .line 232
    invoke-static {v1, v3}, Ll/֫ۘۡ;->֫(Ll/᩻ᩴۡ;I)Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 126
    throw v0

    .line 1094
    :cond_3
    :goto_0
    iget-object v0, v0, Ll/ܰۡۢ;->ۗ:Ll/ܽܺۢ;

    invoke-static {v0}, Ll/ܿܺۢ;->ۧ(Ll/ܽܺۢ;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 1135
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
