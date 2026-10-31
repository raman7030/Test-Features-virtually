.class public Lmoe/shizuku/server/IShizukuService$Stub$Proxy;
.super Ljava/lang/Object;
.source "IShizukuService.java"

# interfaces
.implements Lmoe/shizuku/server/IShizukuService;


# static fields
.field public static sDefaultImpl:Lmoe/shizuku/server/IShizukuService;


# instance fields
.field public mRemote:Landroid/os/IBinder;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 371
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 372
    iput-object p1, p0, Lmoe/shizuku/server/IShizukuService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public addUserService(Lmoe/shizuku/server/IShizukuServiceConnection;Landroid/os/Bundle;)I
    .locals 5

    .line 530
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 531
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_0
    const-string v2, "moe.shizuku.server.IShizukuService"

    .line 534
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 535
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 v2, 0x0

    if-eqz p2, :cond_1

    const/4 v3, 0x1

    .line 537
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 538
    invoke-virtual {p2, v0, v2}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    .line 541
    :cond_1
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 543
    :goto_1
    iget-object v3, p0, Lmoe/shizuku/server/IShizukuService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v4, 0xc

    invoke-interface {v3, v4, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v2

    if-nez v2, :cond_2

    .line 544
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 545
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    invoke-interface {v2, p1, p2}, Lmoe/shizuku/server/IShizukuService;->addUserService(Lmoe/shizuku/server/IShizukuServiceConnection;Landroid/os/Bundle;)I

    move-result p1

    goto :goto_2

    .line 547
    :cond_2
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 548
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 551
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 552
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return p1

    :catchall_0
    move-exception p1

    .line 551
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 552
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 553
    throw p1
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 376
    iget-object v0, p0, Lmoe/shizuku/server/IShizukuService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    return-object v0
.end method

.method public attachApplication(Lmoe/shizuku/server/IShizukuApplication;Landroid/os/Bundle;)V
    .locals 5

    .line 645
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 646
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_0
    const-string v2, "moe.shizuku.server.IShizukuService"

    .line 648
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 649
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 v2, 0x0

    if-eqz p2, :cond_1

    const/4 v3, 0x1

    .line 651
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 652
    invoke-virtual {p2, v0, v2}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    .line 655
    :cond_1
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 657
    :goto_1
    iget-object v3, p0, Lmoe/shizuku/server/IShizukuService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v4, 0x12

    invoke-interface {v3, v4, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v2

    if-nez v2, :cond_2

    .line 658
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 659
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    invoke-interface {v2, p1, p2}, Lmoe/shizuku/server/IShizukuService;->attachApplication(Lmoe/shizuku/server/IShizukuApplication;Landroid/os/Bundle;)V

    goto :goto_2

    .line 662
    :cond_2
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 665
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 666
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    .line 665
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 666
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 667
    throw p1
.end method

.method public attachUserService(Landroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 5

    .line 689
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 690
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_0
    const-string v2, "moe.shizuku.server.IShizukuService"

    .line 692
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 693
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    const/4 v3, 0x1

    .line 695
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 696
    invoke-virtual {p2, v0, v2}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 699
    :cond_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 701
    :goto_0
    iget-object v3, p0, Lmoe/shizuku/server/IShizukuService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v4, 0x66

    invoke-interface {v3, v4, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v2

    if-nez v2, :cond_1

    .line 702
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 703
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    invoke-interface {v2, p1, p2}, Lmoe/shizuku/server/IShizukuService;->attachUserService(Landroid/os/IBinder;Landroid/os/Bundle;)V

    goto :goto_1

    .line 706
    :cond_1
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 709
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 710
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    .line 709
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 710
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 711
    throw p1
.end method

.method public checkPermission(Ljava/lang/String;)I
    .locals 5

    .line 424
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 425
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_0
    const-string v2, "moe.shizuku.server.IShizukuService"

    .line 428
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 429
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 430
    iget-object v2, p0, Lmoe/shizuku/server/IShizukuService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v3, 0x5

    const/4 v4, 0x0

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v2

    if-nez v2, :cond_0

    .line 431
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 432
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    invoke-interface {v2, p1}, Lmoe/shizuku/server/IShizukuService;->checkPermission(Ljava/lang/String;)I

    move-result p1

    goto :goto_0

    .line 434
    :cond_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 435
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 438
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 439
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return p1

    :catchall_0
    move-exception p1

    .line 438
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 439
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 440
    throw p1
.end method

.method public checkSelfPermission()Z
    .locals 5

    .line 605
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 606
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_0
    const-string v2, "moe.shizuku.server.IShizukuService"

    .line 609
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 610
    iget-object v2, p0, Lmoe/shizuku/server/IShizukuService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0x10

    const/4 v4, 0x0

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v2

    if-nez v2, :cond_0

    .line 611
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 612
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    invoke-interface {v2}, Lmoe/shizuku/server/IShizukuService;->checkSelfPermission()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 618
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 619
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v2

    .line 614
    :cond_0
    :try_start_1
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 615
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_1

    const/4 v4, 0x1

    .line 618
    :cond_1
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 619
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v4

    :catchall_0
    move-exception v2

    .line 618
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 619
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 620
    throw v2
.end method

.method public dispatchPackageChanged(Landroid/content/Intent;)V
    .locals 5

    .line 715
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    :try_start_0
    const-string v1, "moe.shizuku.server.IShizukuService"

    .line 717
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p1, :cond_0

    .line 719
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 720
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 723
    :cond_0
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 725
    :goto_0
    iget-object v1, p0, Lmoe/shizuku/server/IShizukuService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0x67

    const/4 v4, 0x0

    invoke-interface {v1, v3, v0, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 726
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 727
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v1

    invoke-interface {v1, p1}, Lmoe/shizuku/server/IShizukuService;->dispatchPackageChanged(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 732
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 733
    throw p1
.end method

.method public dispatchPermissionConfirmationResult(IIILandroid/os/Bundle;)V
    .locals 5

    .line 758
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    :try_start_0
    const-string v1, "moe.shizuku.server.IShizukuService"

    .line 760
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 761
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 762
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 763
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p4, :cond_0

    .line 765
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 766
    invoke-virtual {p4, v0, v1}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 769
    :cond_0
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 771
    :goto_0
    iget-object v1, p0, Lmoe/shizuku/server/IShizukuService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0x69

    const/4 v4, 0x0

    invoke-interface {v1, v3, v0, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 772
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 773
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3, p4}, Lmoe/shizuku/server/IShizukuService;->dispatchPermissionConfirmationResult(IIILandroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 778
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 779
    throw p1
.end method

.method public exit()V
    .locals 5

    .line 671
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 672
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_0
    const-string v2, "moe.shizuku.server.IShizukuService"

    .line 674
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 675
    iget-object v2, p0, Lmoe/shizuku/server/IShizukuService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0x65

    const/4 v4, 0x0

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v2

    if-nez v2, :cond_0

    .line 676
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 677
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    invoke-interface {v2}, Lmoe/shizuku/server/IShizukuService;->exit()V

    goto :goto_0

    .line 680
    :cond_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 683
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 684
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception v2

    .line 683
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 684
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 685
    throw v2
.end method

.method public getFlagsForUid(II)I
    .locals 5

    .line 783
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 784
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_0
    const-string v2, "moe.shizuku.server.IShizukuService"

    .line 787
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 788
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 789
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 790
    iget-object v2, p0, Lmoe/shizuku/server/IShizukuService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0x6a

    const/4 v4, 0x0

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v2

    if-nez v2, :cond_0

    .line 791
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 792
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    invoke-interface {v2, p1, p2}, Lmoe/shizuku/server/IShizukuService;->getFlagsForUid(II)I

    move-result p1

    goto :goto_0

    .line 794
    :cond_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 795
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 798
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 799
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return p1

    :catchall_0
    move-exception p1

    .line 798
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 799
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 800
    throw p1
.end method

.method public getInterfaceDescriptor()Ljava/lang/String;
    .locals 1

    const-string v0, "moe.shizuku.server.IShizukuService"

    return-object v0
.end method

.method public getSELinuxContext()Ljava/lang/String;
    .locals 5

    .line 468
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 469
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_0
    const-string v2, "moe.shizuku.server.IShizukuService"

    .line 472
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 473
    iget-object v2, p0, Lmoe/shizuku/server/IShizukuService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0x9

    const/4 v4, 0x0

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v2

    if-nez v2, :cond_0

    .line 474
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 475
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    invoke-interface {v2}, Lmoe/shizuku/server/IShizukuService;->getSELinuxContext()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 477
    :cond_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 478
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 481
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 482
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object v2

    :catchall_0
    move-exception v2

    .line 481
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 482
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 483
    throw v2
.end method

.method public getSystemProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 488
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 489
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_0
    const-string v2, "moe.shizuku.server.IShizukuService"

    .line 492
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 493
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 494
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 495
    iget-object v2, p0, Lmoe/shizuku/server/IShizukuService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0xa

    const/4 v4, 0x0

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v2

    if-nez v2, :cond_0

    .line 496
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 497
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    invoke-interface {v2, p1, p2}, Lmoe/shizuku/server/IShizukuService;->getSystemProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 499
    :cond_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 500
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 503
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 504
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object p1

    :catchall_0
    move-exception p1

    .line 503
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 504
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 505
    throw p1
.end method

.method public getUid()I
    .locals 5

    .line 404
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 405
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_0
    const-string v2, "moe.shizuku.server.IShizukuService"

    .line 408
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 409
    iget-object v2, p0, Lmoe/shizuku/server/IShizukuService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v3, 0x4

    const/4 v4, 0x0

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v2

    if-nez v2, :cond_0

    .line 410
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 411
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    invoke-interface {v2}, Lmoe/shizuku/server/IShizukuService;->getUid()I

    move-result v2

    goto :goto_0

    .line 413
    :cond_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 414
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 417
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 418
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v2

    :catchall_0
    move-exception v2

    .line 417
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 418
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 419
    throw v2
.end method

.method public getVersion()I
    .locals 5

    .line 384
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 385
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_0
    const-string v2, "moe.shizuku.server.IShizukuService"

    .line 388
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 389
    iget-object v2, p0, Lmoe/shizuku/server/IShizukuService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v3, 0x3

    const/4 v4, 0x0

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v2

    if-nez v2, :cond_0

    .line 390
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 391
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    invoke-interface {v2}, Lmoe/shizuku/server/IShizukuService;->getVersion()I

    move-result v2

    goto :goto_0

    .line 393
    :cond_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 394
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 397
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 398
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v2

    :catchall_0
    move-exception v2

    .line 397
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 398
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 399
    throw v2
.end method

.method public isHidden(I)Z
    .locals 5

    .line 737
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 738
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_0
    const-string v2, "moe.shizuku.server.IShizukuService"

    .line 741
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 742
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 743
    iget-object v2, p0, Lmoe/shizuku/server/IShizukuService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0x68

    const/4 v4, 0x0

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v2

    if-nez v2, :cond_0

    .line 744
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 745
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    invoke-interface {v2, p1}, Lmoe/shizuku/server/IShizukuService;->isHidden(I)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 751
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 752
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return p1

    .line 747
    :cond_0
    :try_start_1
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 748
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_1

    const/4 v4, 0x1

    .line 751
    :cond_1
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 752
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v4

    :catchall_0
    move-exception p1

    .line 751
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 752
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 753
    throw p1
.end method

.method public newProcess([Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Lmoe/shizuku/server/IRemoteProcess;
    .locals 5

    .line 445
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 446
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_0
    const-string v2, "moe.shizuku.server.IShizukuService"

    .line 449
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 450
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 451
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 452
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 453
    iget-object v2, p0, Lmoe/shizuku/server/IShizukuService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0x8

    const/4 v4, 0x0

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v2

    if-nez v2, :cond_0

    .line 454
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 455
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    invoke-interface {v2, p1, p2, p3}, Lmoe/shizuku/server/IShizukuService;->newProcess([Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Lmoe/shizuku/server/IRemoteProcess;

    move-result-object p1

    goto :goto_0

    .line 457
    :cond_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 458
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lmoe/shizuku/server/IRemoteProcess$Stub;->asInterface(Landroid/os/IBinder;)Lmoe/shizuku/server/IRemoteProcess;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 461
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 462
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object p1

    :catchall_0
    move-exception p1

    .line 461
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 462
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 463
    throw p1
.end method

.method public removeUserService(Lmoe/shizuku/server/IShizukuServiceConnection;Landroid/os/Bundle;)I
    .locals 5

    .line 558
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 559
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_0
    const-string v2, "moe.shizuku.server.IShizukuService"

    .line 562
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 563
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 v2, 0x0

    if-eqz p2, :cond_1

    const/4 v3, 0x1

    .line 565
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 566
    invoke-virtual {p2, v0, v2}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    .line 569
    :cond_1
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 571
    :goto_1
    iget-object v3, p0, Lmoe/shizuku/server/IShizukuService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v4, 0xd

    invoke-interface {v3, v4, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v2

    if-nez v2, :cond_2

    .line 572
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 573
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    invoke-interface {v2, p1, p2}, Lmoe/shizuku/server/IShizukuService;->removeUserService(Lmoe/shizuku/server/IShizukuServiceConnection;Landroid/os/Bundle;)I

    move-result p1

    goto :goto_2

    .line 575
    :cond_2
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 576
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 579
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 580
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return p1

    :catchall_0
    move-exception p1

    .line 579
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 580
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 581
    throw p1
.end method

.method public requestPermission(I)V
    .locals 5

    .line 586
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 587
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_0
    const-string v2, "moe.shizuku.server.IShizukuService"

    .line 589
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 590
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 591
    iget-object v2, p0, Lmoe/shizuku/server/IShizukuService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0xf

    const/4 v4, 0x0

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v2

    if-nez v2, :cond_0

    .line 592
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 593
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    invoke-interface {v2, p1}, Lmoe/shizuku/server/IShizukuService;->requestPermission(I)V

    goto :goto_0

    .line 596
    :cond_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 599
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 600
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    .line 599
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 600
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 601
    throw p1
.end method

.method public setSystemProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 510
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 511
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_0
    const-string v2, "moe.shizuku.server.IShizukuService"

    .line 513
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 514
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 515
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 516
    iget-object v2, p0, Lmoe/shizuku/server/IShizukuService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0xb

    const/4 v4, 0x0

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v2

    if-nez v2, :cond_0

    .line 517
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 518
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    invoke-interface {v2, p1, p2}, Lmoe/shizuku/server/IShizukuService;->setSystemProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 521
    :cond_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 524
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 525
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    .line 524
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 525
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 526
    throw p1
.end method

.method public shouldShowRequestPermissionRationale()Z
    .locals 5

    .line 625
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 626
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_0
    const-string v2, "moe.shizuku.server.IShizukuService"

    .line 629
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 630
    iget-object v2, p0, Lmoe/shizuku/server/IShizukuService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0x11

    const/4 v4, 0x0

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v2

    if-nez v2, :cond_0

    .line 631
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 632
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    invoke-interface {v2}, Lmoe/shizuku/server/IShizukuService;->shouldShowRequestPermissionRationale()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 638
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 639
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v2

    .line 634
    :cond_0
    :try_start_1
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 635
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_1

    const/4 v4, 0x1

    .line 638
    :cond_1
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 639
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v4

    :catchall_0
    move-exception v2

    .line 638
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 639
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 640
    throw v2
.end method

.method public updateFlagsForUid(III)V
    .locals 5

    .line 805
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 806
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_0
    const-string v2, "moe.shizuku.server.IShizukuService"

    .line 808
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 809
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 810
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 811
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    .line 812
    iget-object v2, p0, Lmoe/shizuku/server/IShizukuService$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/16 v3, 0x6b

    const/4 v4, 0x0

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v2

    if-nez v2, :cond_0

    .line 813
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 814
    invoke-static {}, Lmoe/shizuku/server/IShizukuService$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuService;

    move-result-object v2

    invoke-interface {v2, p1, p2, p3}, Lmoe/shizuku/server/IShizukuService;->updateFlagsForUid(III)V

    goto :goto_0

    .line 817
    :cond_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 820
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 821
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    .line 820
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 821
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 822
    throw p1
.end method
