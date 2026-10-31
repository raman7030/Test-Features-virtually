.class public Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;
.super Ljava/lang/Object;
.source "DhizukuUserServiceArgs.java"


# instance fields
.field public final bundle:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroid/content/ComponentName;)V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;->bundle:Landroid/os/Bundle;

    .line 18
    invoke-virtual {p0, p1}, Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;->setComponentName(Landroid/content/ComponentName;)Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;->bundle:Landroid/os/Bundle;

    return-void
.end method

.method public constructor <init>(Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;)V
    .locals 0

    .line 13
    iget-object p1, p1, Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;->bundle:Landroid/os/Bundle;

    invoke-direct {p0, p1}, Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;-><init>(Landroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public build()Landroid/os/Bundle;
    .locals 2

    .line 37
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 38
    iget-object v1, p0, Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;->bundle:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public flattenToShortString()Ljava/lang/String;
    .locals 1

    .line 43
    invoke-virtual {p0}, Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;->getComponentName()Landroid/content/ComponentName;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getComponentName()Landroid/content/ComponentName;
    .locals 3

    .line 31
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    const-string v2, "component"

    if-lt v0, v1, :cond_0

    .line 32
    iget-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;->bundle:Landroid/os/Bundle;

    const-class v1, Landroid/content/ComponentName;

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ComponentName;

    return-object v0

    .line 33
    :cond_0
    iget-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;->bundle:Landroid/os/Bundle;

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/content/ComponentName;

    return-object v0
.end method

.method public setComponentName(Landroid/content/ComponentName;)Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;
    .locals 2

    .line 26
    iget-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;->bundle:Landroid/os/Bundle;

    const-string v1, "component"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-object p0
.end method
