.class public final synthetic Lcom/rosan/dhizuku/api/DhizukuServiceConnections$1$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "DhizukuServiceConnections"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final synthetic f$0:Lcom/rosan/dhizuku/api/DhizukuServiceConnections$1;

.field public final synthetic f$1:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lcom/rosan/dhizuku/api/DhizukuServiceConnections$1;Landroid/os/Bundle;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/rosan/dhizuku/api/DhizukuServiceConnections$1$$ExternalSyntheticLambda0;->f$0:Lcom/rosan/dhizuku/api/DhizukuServiceConnections$1;

    iput-object p2, p0, Lcom/rosan/dhizuku/api/DhizukuServiceConnections$1$$ExternalSyntheticLambda0;->f$1:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuServiceConnections$1$$ExternalSyntheticLambda0;->f$0:Lcom/rosan/dhizuku/api/DhizukuServiceConnections$1;

    iget-object v1, p0, Lcom/rosan/dhizuku/api/DhizukuServiceConnections$1$$ExternalSyntheticLambda0;->f$1:Landroid/os/Bundle;

    invoke-static {v0, v1}, Lcom/rosan/dhizuku/api/DhizukuServiceConnections$1;->$r8$lambda$vihHVB2iNk6slHNSBB6__-ARulQ(Lcom/rosan/dhizuku/api/DhizukuServiceConnections$1;Landroid/os/Bundle;)V

    return-void
.end method
