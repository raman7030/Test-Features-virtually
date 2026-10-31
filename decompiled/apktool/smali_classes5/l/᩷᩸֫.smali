.class public final Ll/᩷᩸֫;
.super Ljava/lang/Object;
.source "Q74C"

# interfaces
.implements Ll/۫ܶ֫;


# instance fields
.field public ֫:J

.field public final ۧ:Ljava/util/TreeSet;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, Ljava/util/TreeSet;

    new-instance v1, Ll/۟ᩳܽ;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/۟ᩳܽ;-><init>(I)V

    invoke-direct {v0, v1}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    iput-object v0, p0, Ll/᩷᩸֫;->ۧ:Ljava/util/TreeSet;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܺ᩸֫;J)V
    .locals 5

    const-wide/16 v0, -0x1

    cmp-long v2, p2, v0

    if-eqz v2, :cond_0

    .line 73
    :goto_0
    iget-wide v0, p0, Ll/᩷᩸֫;->֫:J

    add-long/2addr v0, p2

    const-wide/32 v2, 0xc800000

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    iget-object v0, p0, Ll/᩷᩸֫;->ۧ:Ljava/util/TreeSet;

    invoke-virtual {v0}, Ljava/util/TreeSet;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 74
    invoke-virtual {v0}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ܶ֫;

    invoke-virtual {p1, v0}, Ll/ܺ᩸֫;->ۧ(Ll/᩺ܶ֫;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ܺ᩸֫;Ll/᩺ܶ֫;)V
    .locals 5

    .line 55
    iget-object v0, p0, Ll/᩷᩸֫;->ۧ:Ljava/util/TreeSet;

    invoke-virtual {v0, p2}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 56
    iget-wide v1, p0, Ll/᩷᩸֫;->֫:J

    iget-wide v3, p2, Ll/᩺ܶ֫;->ۗ:J

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/᩷᩸֫;->֫:J

    .line 73
    :goto_0
    iget-wide v1, p0, Ll/᩷᩸֫;->֫:J

    const-wide/32 v3, 0xc800000

    cmp-long p2, v1, v3

    if-lez p2, :cond_0

    invoke-virtual {v0}, Ljava/util/TreeSet;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    .line 74
    invoke-virtual {v0}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩺ܶ֫;

    invoke-virtual {p1, p2}, Ll/ܺ᩸֫;->ۧ(Ll/᩺ܶ֫;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ܺ᩸֫;Ll/᩺ܶ֫;Ll/᩺ܶ֫;)V
    .locals 0

    .line 68
    invoke-virtual {p0, p2}, Ll/᩷᩸֫;->֫(Ll/᩺ܶ֫;)V

    .line 69
    invoke-virtual {p0, p1, p3}, Ll/᩷᩸֫;->֫(Ll/ܺ᩸֫;Ll/᩺ܶ֫;)V

    return-void
.end method

.method public final ֫(Ll/᩺ܶ֫;)V
    .locals 4

    .line 62
    iget-object v0, p0, Ll/᩷᩸֫;->ۧ:Ljava/util/TreeSet;

    invoke-virtual {v0, p1}, Ljava/util/TreeSet;->remove(Ljava/lang/Object;)Z

    .line 63
    iget-wide v0, p0, Ll/᩷᩸֫;->֫:J

    iget-wide v2, p1, Ll/᩺ܶ֫;->ۗ:J

    sub-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩷᩸֫;->֫:J

    return-void
.end method
