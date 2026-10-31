.class public final Ll/ۘۛۚ;
.super Ll/ۖۤۚ;
.source "K3OA"


# direct methods
.method public constructor <init>(Ljava/lang/Long;)V
    .locals 1

    .line 696
    sget-object v0, Ll/ۧۤۚ;->֡֫:Ll/ۧۤۚ;

    invoke-direct {p0, v0, p1}, Ll/ۖۤۚ;-><init>(Ll/ۧۤۚ;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֡۫ۚ;)V
    .locals 2

    .line 706
    invoke-super {p0, p1}, Ll/ۖۤۚ;->֫(Ll/֡۫ۚ;)V

    .line 707
    iget-object v0, p0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0, v1}, Ll/ۛ۫ۚ;->֫(J)V

    return-void
.end method

.method public final ۧ()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method
