.class public final Ll/ܰۚ᩻;
.super Ljava/lang/Object;
.source "I9O8"


# instance fields
.field public ֫:J

.field public ۧ:Ljava/lang/String;

.field public ܽ:Ll/ۡܶ᩻;

.field public ᩳ:J


# direct methods
.method public constructor <init>(Ll/ۡܶ᩻;J)V
    .locals 7

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Ll/ܰۚ᩻;->ܽ:Ll/ۡܶ᩻;

    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ll/ۡܶ᩻;->getPartitionName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".img"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    .line 14
    invoke-virtual {p1}, Ll/ۡܶ᩻;->getOperationsList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const-wide/16 v0, 0x0

    move-wide v2, v0

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֫ܶ᩻;

    .line 15
    invoke-virtual {v4}, Ll/֫ܶ᩻;->getDataLength()J

    move-result-wide v5

    add-long/2addr v0, v5

    .line 16
    invoke-virtual {v4}, Ll/֫ܶ᩻;->getDstExtentsList()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۫۠᩻;

    .line 17
    invoke-virtual {v5}, Ll/۫۠᩻;->getNumBlocks()J

    move-result-wide v5

    mul-long v5, v5, p2

    add-long/2addr v2, v5

    goto :goto_0

    .line 20
    :cond_1
    iput-wide v0, p0, Ll/ܰۚ᩻;->֫:J

    .line 21
    iput-wide v2, p0, Ll/ܰۚ᩻;->ᩳ:J

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PayloadEntry{name=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/ܰۚ᩻;->ᩳ:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", cSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/ܰۚ᩻;->֫:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()J
    .locals 2

    .line 29
    iget-wide v0, p0, Ll/ܰۚ᩻;->֫:J

    return-wide v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Ll/ܰۚ᩻;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()J
    .locals 2

    .line 33
    iget-wide v0, p0, Ll/ܰۚ᩻;->ᩳ:J

    return-wide v0
.end method
