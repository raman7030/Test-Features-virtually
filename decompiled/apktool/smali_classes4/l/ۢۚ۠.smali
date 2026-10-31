.class public final Ll/ۢۚ۠;
.super Ll/ۨ֡۠;
.source "H44W"

# interfaces
.implements Ll/֫ۖ֨;


# instance fields
.field public ۗ:Z

.field public ۛ:Ll/۫᩵۠;

.field public ۤ:Ll/ۤܶ۠;

.field public ۨ:I

.field public ۫:Ll/ۖ֡۠;

.field public ۬:Ll/۫᩵۠;

.field public ܰ:Ll/۫᩵۠;

.field public ᩺:Ll/۫֡֨;


# direct methods
.method public constructor <init>(Ll/ۖ֡۠;Ll/ۤܶ۠;Ll/۫᩵۠;Ll/۫᩵۠;Ll/۫֡֨;Z)V
    .locals 1

    .line 1003
    invoke-direct {p0}, Ll/ۨ֡۠;-><init>()V

    const/4 v0, -0x1

    .line 986
    iput v0, p0, Ll/ۢۚ۠;->ۨ:I

    .line 1004
    iput-object p1, p0, Ll/ۢۚ۠;->۫:Ll/ۖ֡۠;

    .line 1005
    iput-object p2, p0, Ll/ۢۚ۠;->ۤ:Ll/ۤܶ۠;

    .line 1006
    iput-object p3, p0, Ll/ۢۚ۠;->ܰ:Ll/۫᩵۠;

    .line 1007
    iput-object p4, p0, Ll/ۢۚ۠;->۬:Ll/۫᩵۠;

    .line 1008
    iput-object p5, p0, Ll/ۢۚ۠;->᩺:Ll/۫֡֨;

    .line 1009
    iput-boolean p6, p0, Ll/ۢۚ۠;->ۗ:Z

    return-void
.end method


# virtual methods
.method public final getName()Ll/ۤܶ۠;
    .locals 1

    .line 1041
    iget-object v0, p0, Ll/ۢۚ۠;->ۤ:Ll/ۤܶ۠;

    return-object v0
.end method

.method public final getType()Ll/۬ܺ֨;
    .locals 1

    .line 1045
    iget-object v0, p0, Ll/ۢۚ۠;->ܰ:Ll/۫᩵۠;

    return-object v0
.end method

.method public final ֫(Ll/۫ܺ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1052
    invoke-interface {p1, p0, p2}, Ll/۫ܺ֨;->֫(Ll/ۢۚ۠;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/ۗܺ֨;
    .locals 1

    .line 1037
    sget-object v0, Ll/ۗܺ֨;->᩺ܽ:Ll/ۗܺ֨;

    return-object v0
.end method

.method public final ֫(Ll/֡ۚ۠;)V
    .locals 0

    .line 1034
    invoke-virtual {p1, p0}, Ll/֡ۚ۠;->֫(Ll/ۢۚ۠;)V

    return-void
.end method

.method public final ۤ()Ll/۫᩵۠;
    .locals 1

    .line 1048
    iget-object v0, p0, Ll/ۢۚ۠;->۬:Ll/۫᩵۠;

    return-object v0
.end method

.method public final ܳ()Ll/ۖ֡۠;
    .locals 1

    .line 1039
    iget-object v0, p0, Ll/ۢۚ۠;->۫:Ll/ۖ֡۠;

    return-object v0
.end method

.method public final ܳ֫()Z
    .locals 1

    .line 1026
    iget-object v0, p0, Ll/ۢۚ۠;->ܰ:Ll/۫᩵۠;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ֫()Ll/ᩴۚ۠;
    .locals 1

    .line 1057
    sget-object v0, Ll/ᩴۚ۠;->᩹ܽ:Ll/ᩴۚ۠;

    return-object v0
.end method

.method public final ܿ֫()Z
    .locals 1

    .line 1030
    iget-boolean v0, p0, Ll/ۢۚ۠;->ۗ:Z

    return v0
.end method

.method public final ᩶()Ll/۫᩵۠;
    .locals 1

    .line 1043
    iget-object v0, p0, Ll/ۢۚ۠;->ۛ:Ll/۫᩵۠;

    return-object v0
.end method
