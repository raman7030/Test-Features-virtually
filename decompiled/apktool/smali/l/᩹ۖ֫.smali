.class public final Ll/᩹ۖ֫;
.super Ll/ܳۘ֫;
.source "X6AW"


# instance fields
.field public final synthetic ۜ:Landroid/os/Bundle;

.field public final synthetic ܳ:Ll/ۤۖ֫;

.field public final synthetic ܿ:Ll/ܶۘ֫;

.field public final synthetic ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ܶۘ֫;Ljava/lang/Object;Ll/ۤۖ֫;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1755
    iput-object p1, p0, Ll/᩹ۖ֫;->ܿ:Ll/ܶۘ֫;

    iput-object p3, p0, Ll/᩹ۖ֫;->ܳ:Ll/ۤۖ֫;

    iput-object p4, p0, Ll/᩹ۖ֫;->᩻:Ljava/lang/String;

    iput-object p5, p0, Ll/᩹ۖ֫;->ۜ:Landroid/os/Bundle;

    invoke-direct {p0, p2}, Ll/ܳۘ֫;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final ᩳ()V
    .locals 6

    .line 1758
    iget-object v0, p0, Ll/᩹ۖ֫;->ۜ:Landroid/os/Bundle;

    iget-object v1, p0, Ll/᩹ۖ֫;->ܿ:Ll/ܶۘ֫;

    iget-object v1, v1, Ll/ܶۘ֫;->᩸:Ll/ۖ᩵;

    iget-object v2, p0, Ll/᩹ۖ֫;->ܳ:Ll/ۤۖ֫;

    iget-object v3, v2, Ll/ۤۖ֫;->֫:Ll/ۚۘ֫;

    move-object v4, v3

    check-cast v4, Ll/֨ۘ֫;

    .line 1152
    iget-object v4, v4, Ll/֨ۘ֫;->֫:Landroid/os/Messenger;

    invoke-virtual {v4}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    move-result-object v4

    const/4 v5, 0x0

    .line 369
    invoke-virtual {v1, v4, v5}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eq v1, v2, :cond_0

    .line 1759
    sget v0, Ll/ܶۘ֫;->۬:I

    return-void

    .line 1767
    :cond_0
    invoke-virtual {p0}, Ll/ܳۘ֫;->֫()I

    move-result v1

    and-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_1

    .line 1768
    sget v1, Ll/ܶۘ֫;->۬:I

    .line 1770
    :cond_1
    :try_start_0
    iget-object v1, p0, Ll/᩹ۖ֫;->᩻:Ljava/lang/String;

    check-cast v3, Ll/֨ۘ֫;

    invoke-virtual {v3, v1, v5, v0}, Ll/֨ۘ֫;->֫(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
