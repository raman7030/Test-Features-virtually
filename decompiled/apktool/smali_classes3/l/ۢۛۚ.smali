.class public final Ll/ۢۛۚ;
.super Ll/ۖۤۚ;
.source "K3OA"


# direct methods
.method public constructor <init>(Ljava/lang/Integer;)V
    .locals 1

    .line 680
    sget-object v0, Ll/ۧۤۚ;->ۡ֫:Ll/ۧۤۚ;

    invoke-direct {p0, v0, p1}, Ll/ۖۤۚ;-><init>(Ll/ۧۤۚ;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֡۫ۚ;)V
    .locals 1

    .line 685
    invoke-super {p0, p1}, Ll/ۖۤۚ;->֫(Ll/֡۫ۚ;)V

    .line 686
    iget-object v0, p0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ۧ(I)V

    return-void
.end method
