.class public final Ll/ܽ۟᩷;
.super Ll/۟ܶۡ;
.source "M1KQ"


# instance fields
.field public final synthetic ۜ:Ll/ܿۛ᩷;

.field public ܳ:Ljava/util/ArrayList;

.field public final synthetic ᩷:I

.field public final synthetic ᩻:Ll/᩵۟᩷;


# direct methods
.method public constructor <init>(Ll/᩵۟᩷;Ll/ܿۛ᩷;I)V
    .locals 0

    .line 122
    iput-object p1, p0, Ll/ܽ۟᩷;->᩻:Ll/᩵۟᩷;

    iput-object p2, p0, Ll/ܽ۟᩷;->ۜ:Ll/ܿۛ᩷;

    iput p3, p0, Ll/ܽ۟᩷;->᩷:I

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 148
    iget-object v0, p0, Ll/ܽ۟᩷;->ܳ:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ܽ۟᩷;->᩻:Ll/᩵۟᩷;

    invoke-static {v1, v0}, Ll/᩵۟᩷;->֫(Ll/᩵۟᩷;Ljava/util/List;)V

    .line 149
    invoke-static {v1}, Ll/᩵۟᩷;->ܽ(Ll/᩵۟᩷;)Ll/ܺ۟᩷;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 7

    .line 154
    iget-object v0, p0, Ll/ܽ۟᩷;->᩻:Ll/᩵۟᩷;

    invoke-static {v0}, Ll/᩵۟᩷;->ۡ(Ll/᩵۟᩷;)Ll/ۘۛ᩷;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/ۘۛ᩷;->֫(Ljava/lang/Throwable;)V

    .line 155
    instance-of v1, p1, Ll/ۚ᩺᩷;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 156
    move-object v3, p1

    check-cast v3, Ll/ۚ᩺᩷;

    .line 157
    iget v4, v3, Ll/ۚ᩺᩷;->᩹:I

    iget v5, v3, Ll/ۚ᩺᩷;->᩸:I

    invoke-static {v4, v5}, Ll/᩵ۛ᩷;->֫(II)Ll/᩵ۛ᩷;

    move-result-object v4

    .line 158
    iput-boolean v2, v4, Ll/᩵ۛ᩷;->ۛ:Z

    .line 159
    iget-object v5, p0, Ll/ܽ۟᩷;->ۜ:Ll/ܿۛ᩷;

    invoke-virtual {v3}, Ll/ۚ᩺᩷;->֫()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6, v4}, Ll/ܿۛ᩷;->ۧ(Ljava/lang/String;Ll/᩵ۛ᩷;)V

    .line 160
    invoke-static {v0}, Ll/᩵۟᩷;->ᩳ(Ll/᩵۟᩷;)Ll/᩵ۨ᩷;

    move-result-object v4

    invoke-virtual {v3}, Ll/ۚ᩺᩷;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ll/᩵ۨ᩷;->֫(Ljava/lang/String;)V

    :cond_0
    if-nez v1, :cond_1

    .line 162
    instance-of p1, p1, Ll/֫ۘܽ;

    if-eqz p1, :cond_2

    :cond_1
    const p1, 0x7f1201cf

    .line 163
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 165
    :cond_2
    invoke-static {v0}, Ll/᩵۟᩷;->ܳ(Ll/᩵۟᩷;)Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_3

    .line 166
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-static {v0, p1}, Ll/᩵۟᩷;->֫(Ll/᩵۟᩷;Ljava/util/List;)V

    .line 167
    invoke-static {v0, v2}, Ll/᩵۟᩷;->ۧ(Ll/᩵۟᩷;Z)V

    .line 168
    invoke-static {v0, v2}, Ll/᩵۟᩷;->֫(Ll/᩵۟᩷;Z)V

    .line 169
    invoke-static {v0}, Ll/᩵۟᩷;->ܽ(Ll/᩵۟᩷;)Ll/ܺ۟᩷;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    :cond_3
    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 127
    iget-object v0, p0, Ll/ܽ۟᩷;->ۜ:Ll/ܿۛ᩷;

    iget v1, p0, Ll/ܽ۟᩷;->᩷:I

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 5

    .line 132
    :goto_0
    iget-object v0, p0, Ll/ܽ۟᩷;->᩻:Ll/᩵۟᩷;

    invoke-static {v0}, Ll/᩵۟᩷;->ᩳ(Ll/᩵۟᩷;)Ll/᩵ۨ᩷;

    move-result-object v1

    if-nez v1, :cond_0

    const-wide/16 v0, 0xa

    .line 133
    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    goto :goto_0

    .line 135
    :cond_0
    invoke-static {v0}, Ll/᩵۟᩷;->ᩳ(Ll/᩵۟᩷;)Ll/᩵ۨ᩷;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩵ۨ᩷;->᩻()Ljava/util/Collection;

    move-result-object v1

    .line 136
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v2, p0, Ll/ܽ۟᩷;->ܳ:Ljava/util/ArrayList;

    .line 137
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 138
    iget-object v3, p0, Ll/ܽ۟᩷;->ܳ:Ljava/util/ArrayList;

    new-instance v4, Ll/᩻۟᩷;

    invoke-direct {v4, v2}, Ll/᩻۟᩷;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    .line 140
    invoke-static {v0, v1}, Ll/᩵۟᩷;->ۧ(Ll/᩵۟᩷;Z)V

    .line 141
    invoke-static {v0, v1}, Ll/᩵۟᩷;->֫(Ll/᩵۟᩷;Z)V

    .line 142
    iget-object v1, p0, Ll/ܽ۟᩷;->ܳ:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Ll/᩵۟᩷;->֫(Ll/᩵۟᩷;Ljava/util/ArrayList;)V

    .line 143
    invoke-static {v0}, Ll/᩵۟᩷;->ۖ(Ll/᩵۟᩷;)V

    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 175
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
