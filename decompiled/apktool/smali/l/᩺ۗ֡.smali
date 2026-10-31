.class public final Ll/᩺ۗ֡;
.super Ljava/lang/Object;
.source "99SU"


# instance fields
.field public ֡:I

.field public ֫:Ljava/util/ArrayList;

.field public ۖ:Ljava/util/TreeSet;

.field public final ۘ:Ll/ۧ۬֡;

.field public ۜ:Ljava/util/TreeSet;

.field public ۡ:I

.field public ۢ:Ljava/util/ArrayList;

.field public ۧ:Z

.field public ܳ:Ljava/util/Set;

.field public ܺ:Ljava/util/TreeSet;

.field public ܽ:Z

.field public ܿ:Ljava/lang/String;

.field public ᩳ:Ljava/util/ArrayList;

.field public ᩴ:Ljava/util/ArrayList;

.field public ᩵:I

.field public ᩷:Ljava/util/ArrayList;

.field public ᩻:Ljava/util/TreeSet;


# direct methods
.method public constructor <init>(Ll/ۧ۬֡;Ljava/lang/String;I)V
    .locals 1

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩺ۗ֡;->ᩳ:Ljava/util/ArrayList;

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩺ۗ֡;->ۢ:Ljava/util/ArrayList;

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩺ۗ֡;->ᩴ:Ljava/util/ArrayList;

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩺ۗ֡;->᩷:Ljava/util/ArrayList;

    .line 26
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩺ۗ֡;->֫:Ljava/util/ArrayList;

    .line 27
    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    iput-object v0, p0, Ll/᩺ۗ֡;->ۜ:Ljava/util/TreeSet;

    .line 28
    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    iput-object v0, p0, Ll/᩺ۗ֡;->ۖ:Ljava/util/TreeSet;

    .line 29
    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    iput-object v0, p0, Ll/᩺ۗ֡;->ܺ:Ljava/util/TreeSet;

    const/4 v0, -0x1

    .line 34
    iput v0, p0, Ll/᩺ۗ֡;->֡:I

    .line 35
    iput v0, p0, Ll/᩺ۗ֡;->᩵:I

    const/4 v0, 0x0

    .line 104
    iput-boolean v0, p0, Ll/᩺ۗ֡;->ۧ:Z

    .line 38
    iput-object p1, p0, Ll/᩺ۗ֡;->ۘ:Ll/ۧ۬֡;

    .line 39
    iput-object p2, p0, Ll/᩺ۗ֡;->ܿ:Ljava/lang/String;

    .line 40
    iput p3, p0, Ll/᩺ۗ֡;->ۡ:I

    return-void
.end method

.method private ֫(ILjava/util/HashSet;Ljava/util/HashSet;)V
    .locals 3

    .line 186
    invoke-virtual {p3, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 189
    :cond_0
    iget-object v0, p0, Ll/᩺ۗ֡;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺ۗ֡;

    .line 190
    iget-object v2, v1, Ll/᩺ۗ֡;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 191
    invoke-direct {v1, p1, p2, p3}, Ll/᩺ۗ֡;->ۧ(ILjava/util/HashSet;Ljava/util/HashSet;)V

    goto :goto_0

    .line 193
    :cond_1
    invoke-direct {v1, p1, p2, p3}, Ll/᩺ۗ֡;->֫(ILjava/util/HashSet;Ljava/util/HashSet;)V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method private ۧ(ILjava/util/HashSet;Ljava/util/HashSet;)V
    .locals 6

    .line 199
    invoke-virtual {p3, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    .line 202
    :cond_0
    new-instance v0, Ll/ۨۗ֡;

    .line 239
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 240
    iput p1, v0, Ll/ۨۗ֡;->ۧ:I

    .line 203
    iget-object v1, p0, Ll/᩺ۗ֡;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    :cond_1
    :goto_0
    add-int/lit8 v2, v2, -0x1

    if-ltz v2, :cond_2

    .line 204
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۟۬֡;

    const/4 v4, 0x0

    .line 16
    invoke-static {v3, v4, v0}, Ll/۬ۗ֡;->֫(Ll/᩺֫ۚ;ZLl/ۗۗ֡;)V

    .line 206
    iget-boolean v5, v0, Ll/ۨۗ֡;->֫:Z

    if-eqz v5, :cond_1

    .line 207
    sget-object p1, Ll/ۛۗ֡;->֫:[I

    invoke-virtual {v3}, Ll/۟۬֡;->ۢ()Ll/֨ۗ֡;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget p1, p1, v5

    packed-switch p1, :pswitch_data_0

    .line 221
    invoke-virtual {p2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void

    .line 217
    :pswitch_0
    iput-boolean v4, v0, Ll/ۨۗ֡;->֫:Z

    .line 218
    check-cast v3, Ll/᩻ۧۚ;

    invoke-interface {v3}, Ll/᩻ۧۚ;->ܶ()I

    move-result p1

    iput p1, v0, Ll/ۨۗ֡;->ۧ:I

    goto :goto_0

    .line 226
    :cond_2
    iget-object v0, p0, Ll/᩺ۗ֡;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺ۗ֡;

    .line 227
    iget-object v2, v1, Ll/᩺ۗ֡;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 228
    invoke-direct {v1, p1, p2, p3}, Ll/᩺ۗ֡;->ۧ(ILjava/util/HashSet;Ljava/util/HashSet;)V

    goto :goto_1

    .line 230
    :cond_3
    invoke-direct {v1, p1, p2, p3}, Ll/᩺ۗ֡;->֫(ILjava/util/HashSet;Ljava/util/HashSet;)V

    goto :goto_1

    :cond_4
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private ܳ()Ljava/util/Set;
    .locals 9

    .line 110
    iget-object v0, p0, Ll/᩺ۗ֡;->ܳ:Ljava/util/Set;

    if-eqz v0, :cond_0

    return-object v0

    .line 113
    :cond_0
    iget-boolean v0, p0, Ll/᩺ۗ֡;->ۧ:Z

    if-eqz v0, :cond_1

    .line 114
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    return-object v0

    .line 117
    :cond_1
    iget-object v0, p0, Ll/᩺ۗ֡;->ۘ:Ll/ۧ۬֡;

    iget v1, v0, Ll/ۧ۬֡;->ܽ:I

    const/16 v2, 0x3c

    const/4 v3, 0x0

    if-gt v1, v2, :cond_7

    iget v1, v0, Ll/ۧ۬֡;->ۧ:I

    const/16 v2, 0x19

    if-le v1, v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x1

    .line 128
    iput-boolean v2, p0, Ll/᩺ۗ֡;->ۧ:Z

    add-int/2addr v1, v2

    .line 129
    iput v1, v0, Ll/ۧ۬֡;->ۧ:I

    .line 131
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 135
    iget v4, v0, Ll/ۧ۬֡;->ܽ:I

    iget-object v5, p0, Ll/᩺ۗ֡;->ᩴ:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    add-int/2addr v6, v4

    iput v6, v0, Ll/ۧ۬֡;->ܽ:I

    .line 136
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v6, 0x1

    :cond_3
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩺ۗ֡;

    .line 137
    invoke-direct {v7}, Ll/᩺ۗ֡;->ܳ()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v1, v8}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    if-eqz v6, :cond_3

    .line 138
    iget-object v7, v7, Ll/᩺ۗ֡;->ܳ:Ljava/util/Set;

    if-nez v7, :cond_3

    const/4 v6, 0x0

    goto :goto_0

    .line 141
    :cond_4
    iget v4, v0, Ll/ۧ۬֡;->ܽ:I

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    sub-int/2addr v4, v5

    iput v4, v0, Ll/ۧ۬֡;->ܽ:I

    .line 143
    iget-object v4, p0, Ll/᩺ۗ֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_5

    .line 145
    iget-object v4, p0, Ll/᩺ۗ֡;->ۖ:Ljava/util/TreeSet;

    invoke-interface {v1, v4}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 146
    :cond_5
    iget-object v4, p0, Ll/᩺ۗ֡;->ۜ:Ljava/util/TreeSet;

    invoke-interface {v1, v4}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    if-eqz v6, :cond_6

    .line 148
    iput-object v1, p0, Ll/᩺ۗ֡;->ܳ:Ljava/util/Set;

    .line 151
    :cond_6
    iput-boolean v3, p0, Ll/᩺ۗ֡;->ۧ:Z

    .line 152
    iget v3, v0, Ll/ۧ۬֡;->ۧ:I

    sub-int/2addr v3, v2

    iput v3, v0, Ll/ۧ۬֡;->ۧ:I

    return-object v1

    .line 118
    :cond_7
    :goto_1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 120
    :goto_2
    iget v1, p0, Ll/᩺ۗ֡;->ۡ:I

    if-ge v3, v1, :cond_9

    .line 121
    iget-object v1, p0, Ll/᩺ۗ֡;->ܺ:Ljava/util/TreeSet;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/TreeSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    .line 122
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_8
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 124
    :cond_9
    iput-object v0, p0, Ll/᩺ۗ֡;->ܳ:Ljava/util/Set;

    return-object v0
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 160
    iget-object v0, p0, Ll/᩺ۗ֡;->᩻:Ljava/util/TreeSet;

    if-eqz v0, :cond_0

    goto :goto_1

    .line 162
    :cond_0
    invoke-virtual {p0}, Ll/᩺ۗ֡;->ܿ()Ljava/util/Set;

    .line 163
    iget-object v0, p0, Ll/᩺ۗ֡;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺ۗ֡;

    .line 164
    invoke-virtual {v1}, Ll/᩺ۗ֡;->֫()V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final ֫(ILjava/util/HashSet;)V
    .locals 1

    .line 182
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Ll/᩺ۗ֡;->֫(ILjava/util/HashSet;Ljava/util/HashSet;)V

    return-void
.end method

.method public final ֫(Ll/᩺ۗ֡;)V
    .locals 2

    .line 44
    iget-object v0, p0, Ll/᩺ۗ֡;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 45
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final ֫(Ll/᩺ۗ֡;Z)V
    .locals 2

    if-ne p1, p0, :cond_0

    goto :goto_0

    .line 53
    :cond_0
    iget-object v0, p0, Ll/᩺ۗ֡;->ᩴ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 54
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    if-eqz p2, :cond_2

    .line 57
    iget-object p2, p0, Ll/᩺ۗ֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 58
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 61
    :cond_2
    iget-object p2, p0, Ll/᩺ۗ֡;->᩷:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 62
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_0
    return-void
.end method

.method public final ۧ()Ll/۟۬֡;
    .locals 2

    .line 269
    iget-object v0, p0, Ll/᩺ۗ֡;->ᩳ:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۟۬֡;

    return-object v0
.end method

.method public final ܽ()Ljava/util/ArrayList;
    .locals 1

    .line 277
    iget-object v0, p0, Ll/᩺ۗ֡;->ᩳ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ܿ()Ljava/util/Set;
    .locals 3

    .line 170
    iget-object v0, p0, Ll/᩺ۗ֡;->᩻:Ljava/util/TreeSet;

    if-eqz v0, :cond_0

    return-object v0

    .line 174
    :cond_0
    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    .line 175
    iget-object v1, p0, Ll/᩺ۗ֡;->ᩴ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩺ۗ֡;

    .line 176
    invoke-virtual {v2}, Ll/᩺ۗ֡;->ᩳ()Ljava/util/Set;

    move-result-object v2

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v2}, Ljava/util/TreeSet;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 178
    :cond_1
    iput-object v0, p0, Ll/᩺ۗ֡;->᩻:Ljava/util/TreeSet;

    return-object v0
.end method

.method public final ᩳ()Ljava/util/Set;
    .locals 1

    .line 97
    iget-object v0, p0, Ll/᩺ۗ֡;->ܳ:Ljava/util/Set;

    if-eqz v0, :cond_0

    return-object v0

    .line 100
    :cond_0
    invoke-direct {p0}, Ll/᩺ۗ֡;->ܳ()Ljava/util/Set;

    move-result-object v0

    .line 101
    iput-object v0, p0, Ll/᩺ۗ֡;->ܳ:Ljava/util/Set;

    return-object v0
.end method
