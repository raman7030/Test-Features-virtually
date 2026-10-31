.class public final Ll/ܽۗ֫;
.super Ljava/lang/Object;
.source "H74H"


# instance fields
.field public final ֫:Ljava/util/ArrayDeque;

.field public final ۧ:Ljava/util/ArrayDeque;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1142
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1143
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ll/ܽۗ֫;->֫:Ljava/util/ArrayDeque;

    .line 1144
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ll/ܽۗ֫;->ۧ:Ljava/util/ArrayDeque;

    return-void
.end method


# virtual methods
.method public final ֫(IIJ)V
    .locals 2

    .line 1195
    iget-object v0, p0, Ll/ܽۗ֫;->֫:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1196
    new-instance v0, Ll/ۧۗ֫;

    .line 1207
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1212
    iput-wide p3, v0, Ll/ۧۗ֫;->ۧ:J

    .line 1213
    iput p1, v0, Ll/ۧۗ֫;->֫:I

    .line 1214
    iput p2, v0, Ll/ۧۗ֫;->ܽ:I

    goto :goto_0

    .line 1197
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧۗ֫;

    .line 1212
    :goto_0
    iput-wide p3, v0, Ll/ۧۗ֫;->ۧ:J

    .line 1213
    iput p1, v0, Ll/ۧۗ֫;->֫:I

    .line 1214
    iput p2, v0, Ll/ۧۗ֫;->ܽ:I

    .line 1157
    iget-object p1, p0, Ll/ܽۗ֫;->ۧ:Ljava/util/ArrayDeque;

    invoke-virtual {p1, v0}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 1190
    iget-object v0, p0, Ll/ܽۗ֫;->ۧ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final ۧ()Ll/ۧۗ֫;
    .locals 1

    .line 1177
    iget-object v0, p0, Ll/ܽۗ֫;->ۧ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧۗ֫;

    return-object v0
.end method

.method public final ܽ()Ll/ۧۗ֫;
    .locals 2

    .line 1165
    iget-object v0, p0, Ll/ܽۗ֫;->ۧ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧۗ֫;

    .line 1166
    iget-object v1, p0, Ll/ܽۗ֫;->֫:Ljava/util/ArrayDeque;

    invoke-virtual {v1, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    return-object v0
.end method
