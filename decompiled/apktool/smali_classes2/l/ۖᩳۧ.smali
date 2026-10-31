.class public final Ll/ۖᩳۧ;
.super Ljava/lang/Object;
.source "Q8SE"


# instance fields
.field public final ֫:J

.field public final ۧ:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 0

    .line 840
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 841
    iput-wide p1, p0, Ll/ۖᩳۧ;->ۧ:J

    .line 842
    iput-wide p3, p0, Ll/ۖᩳۧ;->֫:J

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 850
    :cond_0
    instance-of v1, p1, Ll/ۖᩳۧ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 853
    :cond_1
    check-cast p1, Ll/ۖᩳۧ;

    .line 854
    iget-wide v3, p0, Ll/ۖᩳۧ;->ۧ:J

    iget-wide v5, p1, Ll/ۖᩳۧ;->ۧ:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-wide v3, p0, Ll/ۖᩳۧ;->֫:J

    iget-wide v5, p1, Ll/ۖᩳۧ;->֫:J

    cmp-long p1, v3, v5

    if-nez p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 4

    .line 859
    iget-wide v0, p0, Ll/ۖᩳۧ;->ۧ:J

    long-to-int v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Ll/ۖᩳۧ;->֫:J

    long-to-int v0, v2

    add-int/2addr v1, v0

    return v1
.end method
