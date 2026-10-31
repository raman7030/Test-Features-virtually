.class public final synthetic Lcom/rosan/dhizuku/api/Dhizuku$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "Dhizuku"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final synthetic f$0:Landroid/os/IBinder;


# direct methods
.method public synthetic constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/rosan/dhizuku/api/Dhizuku$$ExternalSyntheticLambda0;->f$0:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/rosan/dhizuku/api/Dhizuku$$ExternalSyntheticLambda0;->f$0:Landroid/os/IBinder;

    invoke-static {v0}, Lcom/rosan/dhizuku/api/Dhizuku;->$r8$lambda$z3A_hi8CXCelVySM6ec6wpPGEd4(Landroid/os/IBinder;)V

    return-void
.end method
