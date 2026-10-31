.class public final Ll/᩻۠֫;
.super Ljava/lang/Object;
.source "E7TQ"


# instance fields
.field public ֫:Ll/ܿ۠֫;

.field public final ۧ:Ll/ܳ۠֫;

.field public final ܳ:Ljava/util/ArrayDeque;

.field public final ܽ:Ljava/util/PriorityQueue;

.field public final ܿ:Ljava/util/ArrayDeque;

.field public ᩳ:I


# direct methods
.method public constructor <init>(Ll/ܳ۠֫;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-object p1, p0, Ll/᩻۠֫;->ۧ:Ll/ܳ۠֫;

    .line 66
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Ll/᩻۠֫;->ܳ:Ljava/util/ArrayDeque;

    .line 67
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Ll/᩻۠֫;->ܿ:Ljava/util/ArrayDeque;

    .line 68
    new-instance p1, Ljava/util/PriorityQueue;

    invoke-direct {p1}, Ljava/util/PriorityQueue;-><init>()V

    iput-object p1, p0, Ll/᩻۠֫;->ܽ:Ljava/util/PriorityQueue;

    const/4 p1, -0x1

    .line 69
    iput p1, p0, Ll/᩻۠֫;->ᩳ:I

    return-void
.end method

.method private ۧ(I)V
    .locals 7

    .line 178
    :goto_0
    iget-object v0, p0, Ll/᩻۠֫;->ܽ:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->size()I

    move-result v1

    if-le v1, p1, :cond_2

    .line 179
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿ۠֫;

    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const/4 v1, 0x0

    .line 180
    :goto_1
    iget-object v2, v0, Ll/ܿ۠֫;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_0

    .line 181
    iget-wide v3, v0, Ll/ܿ۠֫;->᩹:J

    .line 182
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳ֨֫;

    .line 181
    iget-object v6, p0, Ll/᩻۠֫;->ۧ:Ll/ܳ۠֫;

    invoke-interface {v6, v3, v4, v5}, Ll/ܳ۠֫;->֫(JLl/ᩳ֨֫;)V

    .line 183
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳ֨֫;

    iget-object v3, p0, Ll/᩻۠֫;->ܳ:Ljava/util/ArrayDeque;

    invoke-virtual {v3, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 185
    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 186
    iget-object v1, p0, Ll/᩻۠֫;->֫:Ll/ܿ۠֫;

    if-eqz v1, :cond_1

    iget-wide v1, v1, Ll/ܿ۠֫;->᩹:J

    iget-wide v3, v0, Ll/ܿ۠֫;->᩹:J

    cmp-long v5, v1, v3

    if-nez v5, :cond_1

    const/4 v1, 0x0

    .line 188
    iput-object v1, p0, Ll/᩻۠֫;->֫:Ll/ܿ۠֫;

    .line 190
    :cond_1
    iget-object v1, p0, Ll/᩻۠֫;->ܿ:Ljava/util/ArrayDeque;

    invoke-virtual {v1, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 166
    iget-object v0, p0, Ll/᩻۠֫;->ܽ:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->clear()V

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    if-ltz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 90
    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 91
    iput p1, p0, Ll/᩻۠֫;->ᩳ:I

    .line 92
    invoke-direct {p0, p1}, Ll/᩻۠֫;->ۧ(I)V

    return-void
.end method

.method public final ֫(JLl/ᩳ֨֫;)V
    .locals 8

    .line 119
    iget v0, p0, Ll/᩻۠֫;->ᩳ:I

    if-eqz v0, :cond_6

    const/4 v1, -0x1

    iget-object v2, p0, Ll/᩻۠֫;->ܽ:Ljava/util/PriorityQueue;

    if-eq v0, v1, :cond_0

    .line 121
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->size()I

    move-result v0

    iget v3, p0, Ll/᩻۠֫;->ᩳ:I

    if-lt v0, v3, :cond_0

    .line 122
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿ۠֫;

    sget-object v3, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    iget-wide v3, v0, Ll/ܿ۠֫;->᩹:J

    cmp-long v0, p1, v3

    if-gez v0, :cond_0

    goto/16 :goto_2

    .line 151
    :cond_0
    iget-object v0, p0, Ll/᩻۠֫;->ܳ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 152
    new-instance v0, Ll/ᩳ֨֫;

    invoke-direct {v0}, Ll/ᩳ֨֫;-><init>()V

    goto :goto_0

    .line 153
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳ֨֫;

    .line 154
    :goto_0
    invoke-virtual {p3}, Ll/ᩳ֨֫;->֫()I

    move-result v3

    invoke-virtual {v0, v3}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 156
    invoke-virtual {p3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    .line 157
    invoke-virtual {p3}, Ll/ᩳ֨֫;->ᩳ()I

    move-result p3

    .line 158
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v4

    .line 160
    invoke-virtual {v0}, Ll/ᩳ֨֫;->֫()I

    move-result v5

    const/4 v6, 0x0

    .line 155
    invoke-static {v3, p3, v4, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 129
    iget-object p3, p0, Ll/᩻۠֫;->֫:Ll/ܿ۠֫;

    if-eqz p3, :cond_2

    iget-wide v3, p3, Ll/ܿ۠֫;->᩹:J

    cmp-long v5, p1, v3

    if-nez v5, :cond_2

    .line 130
    iget-object p1, p3, Ll/ܿ۠֫;->᩸:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 134
    :cond_2
    iget-object p3, p0, Ll/᩻۠֫;->ܿ:Ljava/util/ArrayDeque;

    invoke-virtual {p3}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 135
    new-instance p3, Ll/ܿ۠֫;

    invoke-direct {p3}, Ll/ܿ۠֫;-><init>()V

    goto :goto_1

    .line 136
    :cond_3
    invoke-virtual {p3}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ܿ۠֫;

    .line 206
    :goto_1
    iget-object v3, p3, Ll/ܿ۠֫;->᩸:Ljava/util/ArrayList;

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v7, p1, v4

    if-eqz v7, :cond_4

    const/4 v6, 0x1

    :cond_4
    invoke-static {v6}, Ll/᩺֡֫;->֫(Z)V

    .line 207
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    invoke-static {v4}, Ll/᩺֡֫;->ۧ(Z)V

    .line 208
    iput-wide p1, p3, Ll/ܿ۠֫;->᩹:J

    .line 209
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 138
    invoke-virtual {v2, p3}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 139
    iput-object p3, p0, Ll/᩻۠֫;->֫:Ll/ܿ۠֫;

    .line 140
    iget p1, p0, Ll/᩻۠֫;->ᩳ:I

    if-eq p1, v1, :cond_5

    .line 141
    invoke-direct {p0, p1}, Ll/᩻۠֫;->ۧ(I)V

    :cond_5
    return-void

    .line 123
    :cond_6
    :goto_2
    iget-object v0, p0, Ll/᩻۠֫;->ۧ:Ll/ܳ۠֫;

    invoke-interface {v0, p1, p2, p3}, Ll/ܳ۠֫;->֫(JLl/ᩳ֨֫;)V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x0

    .line 174
    invoke-direct {p0, v0}, Ll/᩻۠֫;->ۧ(I)V

    return-void
.end method

.method public final ܽ()I
    .locals 1

    .line 101
    iget v0, p0, Ll/᩻۠֫;->ᩳ:I

    return v0
.end method
