.class public final Ll/ܿۙܽ;
.super Ll/۟ܶۡ;
.source "28VT"


# instance fields
.field public ۜ:Ljava/util/List;

.field public final synthetic ۢ:Ll/᩹ۙܽ;

.field public ܳ:Ljava/util/ArrayList;

.field public ᩷:Ljava/util/List;

.field public ᩻:Ll/ܿۙۧ;


# direct methods
.method public constructor <init>(Ll/᩹ۙܽ;)V
    .locals 0

    .line 143
    iput-object p1, p0, Ll/ܿۙܽ;->ۢ:Ll/᩹ۙܽ;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 223
    iget-object v0, p0, Ll/ܿۙܽ;->᩷:Ljava/util/List;

    iget-object v1, p0, Ll/ܿۙܽ;->ۢ:Ll/᩹ۙܽ;

    invoke-static {v1, v0}, Ll/᩹ۙܽ;->ۧ(Ll/᩹ۙܽ;Ljava/util/List;)V

    .line 224
    iget-object v0, p0, Ll/ܿۙܽ;->ۜ:Ljava/util/List;

    invoke-static {v1, v0}, Ll/᩹ۙܽ;->֫(Ll/᩹ۙܽ;Ljava/util/List;)V

    .line 225
    iget-object v0, p0, Ll/ܿۙܽ;->ܳ:Ljava/util/ArrayList;

    invoke-static {v1, v0}, Ll/᩹ۙܽ;->֫(Ll/᩹ۙܽ;Ljava/util/ArrayList;)V

    .line 226
    invoke-static {v1}, Ll/᩹ۙܽ;->֫(Ll/᩹ۙܽ;)Ll/᩻ۙܽ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 227
    invoke-static {v1}, Ll/᩹ۙܽ;->֫(Ll/᩹ۙܽ;)Ll/᩻ۙܽ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩻ۙܽ;->֫()V

    .line 228
    iget-object v0, p0, Ll/ܿۙܽ;->᩻:Ll/ܿۙۧ;

    if-eqz v0, :cond_0

    .line 229
    invoke-static {v1}, Ll/᩹ۙܽ;->֫(Ll/᩹ۙܽ;)Ll/᩻ۙܽ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܿۙۧ;->֫(Ll/᩶ۗۧ;)V

    return-void

    .line 231
    :cond_0
    invoke-static {v1}, Ll/᩹ۙܽ;->֫(Ll/᩹ۙܽ;)Ll/᩻ۙܽ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    :cond_1
    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 238
    iget-object v0, p0, Ll/ܿۙܽ;->ۢ:Ll/᩹ۙܽ;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 151
    iget-object v0, p0, Ll/ܿۙܽ;->ۢ:Ll/᩹ۙܽ;

    invoke-static {v0}, Ll/᩹ۙܽ;->ۢ(Ll/᩹ۙܽ;)Ll/۫ۤۧ;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/۫ۤۧ;->֫(Z)V

    return-void
.end method

.method public final ܿ()V
    .locals 9

    .line 156
    invoke-static {}, Ll/ۡۨܽ;->ۧ()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ܿۙܽ;->᩷:Ljava/util/List;

    .line 157
    invoke-static {}, Ll/ܽ֡ܿ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v0

    const-string v1, "keystore"

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    const/4 v1, 0x1

    .line 413
    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v0

    .line 158
    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ܽۙܽ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ۚ᩸ܽ;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/ۚ᩸ܽ;-><init>(I)V

    .line 165
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->sorted(Ljava/util/Comparator;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 166
    invoke-static {}, Ll/᩺ۨᩴ;->toUnmodifiableList()Ll/ۨۨᩴ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Ll/ܿۙܽ;->ۜ:Ljava/util/List;

    .line 167
    iget-object v0, p0, Ll/ܿۙܽ;->ۢ:Ll/᩹ۙܽ;

    invoke-static {v0}, Ll/᩹ۙܽ;->ۧ(Ll/᩹ۙܽ;)Ljava/util/List;

    move-result-object v1

    .line 168
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const-string v3, "h1"

    .line 169
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    iget-object v3, p0, Ll/ܿۙܽ;->᩷:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    const-string v4, "/"

    if-eqz v3, :cond_0

    const-string v3, "e1"

    .line 171
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 173
    :cond_0
    iget-object v3, p0, Ll/ܿۙܽ;->᩷:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۬ܿᩳ;

    .line 174
    invoke-virtual {v5}, Ll/۬ܿᩳ;->ۢ()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0}, Ll/᩹ۙܽ;->ᩳ(Ll/᩹ۙܽ;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const-string v7, "k"

    if-eqz v6, :cond_1

    .line 175
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ll/۬ܿᩳ;->ۘ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 177
    :cond_1
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ll/۬ܿᩳ;->ۘ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    :goto_1
    const-string v3, "h2"

    .line 181
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 182
    iget-object v3, p0, Ll/ܿۙܽ;->ۜ:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v3, "e2"

    .line 183
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 185
    :cond_3
    iget-object v3, p0, Ll/ܿۙܽ;->ۜ:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܶ᩵ܿ;

    .line 186
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0}, Ll/᩹ۙܽ;->ܿ(Ll/᩹ۙܽ;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const-string v7, "f"

    if-eqz v6, :cond_4

    .line 187
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 189
    :cond_4
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 193
    :cond_5
    :goto_3
    iput-object v2, p0, Ll/ܿۙܽ;->ܳ:Ljava/util/ArrayList;

    .line 194
    invoke-static {v0}, Ll/᩹ۙܽ;->֫(Ll/᩹ۙܽ;)Ll/᩻ۙܽ;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 195
    new-instance v0, Ll/ᩳۙܽ;

    invoke-direct {v0, v1, v2}, Ll/ᩳۙܽ;-><init>(Ljava/util/List;Ljava/util/ArrayList;)V

    invoke-static {v0}, Ll/᩷ۙۧ;->֫(Ll/ۧۙۧ;)Ll/ܿۙۧ;

    move-result-object v0

    iput-object v0, p0, Ll/ܿۙܽ;->᩻:Ll/ܿۙۧ;

    :cond_6
    return-void
.end method

.method public final ᩳ()V
    .locals 2

    .line 243
    iget-object v0, p0, Ll/ܿۙܽ;->ۢ:Ll/᩹ۙܽ;

    invoke-static {v0}, Ll/᩹ۙܽ;->ۢ(Ll/᩹ۙܽ;)Ll/۫ۤۧ;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/۫ۤۧ;->֫(Z)V

    return-void
.end method
