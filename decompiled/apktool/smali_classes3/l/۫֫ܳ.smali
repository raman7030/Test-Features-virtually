.class public final Ll/۫֫ܳ;
.super Ljava/lang/Object;
.source "A70P"


# instance fields
.field public final ֫:Z

.field public final ۜ:Ll/۫֫ܳ;

.field public final ۧ:[J

.field public final ܳ:I

.field public final ܽ:J

.field public final ܿ:Ll/۫֫ܳ;

.field public final ᩳ:I

.field public final ᩷:Z

.field public final ᩻:J


# direct methods
.method public constructor <init>(Ll/۫֫ܳ;Ll/۫֫ܳ;[JIIZZ)V
    .locals 2

    .line 902
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 903
    iput-object p1, p0, Ll/۫֫ܳ;->ܿ:Ll/۫֫ܳ;

    .line 904
    iput-object p2, p0, Ll/۫֫ܳ;->ۜ:Ll/۫֫ܳ;

    .line 905
    iput-object p3, p0, Ll/۫֫ܳ;->ۧ:[J

    .line 906
    iput p4, p0, Ll/۫֫ܳ;->ܳ:I

    .line 907
    iput p5, p0, Ll/۫֫ܳ;->ᩳ:I

    .line 908
    iput-boolean p6, p0, Ll/۫֫ܳ;->᩷:Z

    .line 909
    iput-boolean p7, p0, Ll/۫֫ܳ;->֫:Z

    const-wide/16 p4, 0x30

    if-eqz p3, :cond_0

    .line 911
    array-length p1, p3

    int-to-long p1, p1

    const-wide/16 p6, 0x8

    mul-long p1, p1, p6

    iput-wide p1, p0, Ll/۫֫ܳ;->ܽ:J

    add-long/2addr p1, p4

    .line 912
    iput-wide p1, p0, Ll/۫֫ܳ;->᩻:J

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 914
    iget-wide p6, p1, Ll/۫֫ܳ;->ܽ:J

    iget-wide v0, p2, Ll/۫֫ܳ;->ܽ:J

    invoke-static {p6, p7, v0, v1}, Ll/ܰ֫ܳ;->֫(JJ)J

    move-result-wide p6

    iput-wide p6, p0, Ll/۫֫ܳ;->ܽ:J

    .line 915
    iget-wide p6, p1, Ll/۫֫ܳ;->᩻:J

    iget-wide p1, p2, Ll/۫֫ܳ;->᩻:J

    .line 916
    invoke-static {p6, p7, p1, p2}, Ll/ܰ֫ܳ;->֫(JJ)J

    move-result-wide p1

    .line 915
    invoke-static {p4, p5, p1, p2}, Ll/ܰ֫ܳ;->֫(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Ll/۫֫ܳ;->᩻:J

    return-void

    :cond_1
    const-wide/16 p1, 0x0

    .line 918
    iput-wide p1, p0, Ll/۫֫ܳ;->ܽ:J

    .line 919
    iput-wide p4, p0, Ll/۫֫ܳ;->᩻:J

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 1

    .line 928
    iget-object v0, p0, Ll/۫֫ܳ;->ۧ:[J

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()Z
    .locals 1

    .line 924
    iget-object v0, p0, Ll/۫֫ܳ;->ܿ:Ll/۫֫ܳ;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 932
    invoke-virtual {p0}, Ll/۫֫ܳ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۫֫ܳ;->ۧ:[J

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
