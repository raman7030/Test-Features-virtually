.class public final Ll/ܺۖ֫;
.super Ljava/lang/Object;
.source "X32D"


# instance fields
.field public ֫:Z

.field public ۧ:Z

.field public final ܽ:Landroid/content/IntentFilter;

.field public final ᩳ:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p2, p0, Ll/ܺۖ֫;->ܽ:Landroid/content/IntentFilter;

    .line 57
    iput-object p1, p0, Ll/ܺۖ֫;->ᩳ:Landroid/content/BroadcastReceiver;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    const/16 v0, 0x80

    const-string v1, "Receiver{"

    .line 0
    invoke-static {v0, v1}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 64
    iget-object v1, p0, Ll/ܺۖ֫;->ᩳ:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " filter="

    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    iget-object v1, p0, Ll/ܺۖ֫;->ܽ:Landroid/content/IntentFilter;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    iget-boolean v1, p0, Ll/ܺۖ֫;->ۧ:Z

    if-eqz v1, :cond_0

    const-string v1, " DEAD"

    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    const-string v1, "}"

    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
