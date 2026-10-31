.class public final Ll/ᩳ᩸ۜ;
.super Ljava/lang/Object;
.source "B749"

# interfaces
.implements Ll/᩵ۢۧ;


# instance fields
.field public final ֫:Ll/᩵᩷ۧ;

.field public ۧ:Z

.field public ܽ:Z

.field public ᩳ:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 553
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 554
    new-instance v0, Ll/᩵᩷ۧ;

    invoke-direct {v0}, Ll/᩵᩷ۧ;-><init>()V

    iput-object v0, p0, Ll/ᩳ᩸ۜ;->֫:Ll/᩵᩷ۧ;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 557
    iput-wide v0, p0, Ll/ᩳ᩸ۜ;->ᩳ:J

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩳ᩸ۜ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ᩳ᩸ۜ;->ۧ:Z

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ᩳ᩸ۜ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ᩳ᩸ۜ;->ܽ:Z

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/ᩳ᩸ۜ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ᩳ᩸ۜ;->ᩳ:J

    return-wide v0
.end method


# virtual methods
.method public final ֫(Ll/ۢᩴ֫;IZ)I
    .locals 1

    .line 568
    iget-object v0, p0, Ll/ᩳ᩸ۜ;->֫:Ll/᩵᩷ۧ;

    invoke-virtual {v0, p1, p2, p3}, Ll/᩵᩷ۧ;->ۧ(Ll/ۢᩴ֫;IZ)I

    move-result p1

    return p1
.end method

.method public final ֫(ILl/ᩳ֨֫;)V
    .locals 0

    .line 65
    invoke-virtual {p2, p1}, Ll/ᩳ֨֫;->ܳ(I)V

    return-void
.end method

.method public final synthetic ֫(J)V
    .locals 0

    return-void
.end method

.method public final ֫(JIIILl/ᩴۢۧ;)V
    .locals 4

    .line 580
    iget-wide p4, p0, Ll/ᩳ᩸ۜ;->ᩳ:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v2, 0x1

    cmp-long v3, p4, v0

    if-nez v3, :cond_1

    if-nez p6, :cond_0

    and-int/2addr p3, v2

    if-eqz p3, :cond_0

    .line 582
    iput-wide p1, p0, Ll/ᩳ᩸ۜ;->ᩳ:J

    :cond_0
    return-void

    :cond_1
    if-nez p6, :cond_2

    .line 586
    iput-boolean v2, p0, Ll/ᩳ᩸ۜ;->ۧ:Z

    :cond_2
    return-void
.end method

.method public final ֫(Ll/۠ᩴ֫;)V
    .locals 0

    const/4 p1, 0x1

    .line 561
    iput-boolean p1, p0, Ll/ᩳ᩸ۜ;->ܽ:Z

    .line 562
    iget-object p1, p0, Ll/ᩳ᩸ۜ;->֫:Ll/᩵᩷ۧ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final ֫(Ll/ᩳ֨֫;II)V
    .locals 0

    .line 65
    invoke-virtual {p1, p2}, Ll/ᩳ֨֫;->ܳ(I)V

    return-void
.end method

.method public final ۧ(Ll/ۢᩴ֫;IZ)I
    .locals 1

    .line 568
    iget-object v0, p0, Ll/ᩳ᩸ۜ;->֫:Ll/᩵᩷ۧ;

    invoke-virtual {v0, p1, p2, p3}, Ll/᩵᩷ۧ;->ۧ(Ll/ۢᩴ֫;IZ)I

    move-result p1

    return p1
.end method
