.class public final Ll/֡ܳ֨;
.super Ljava/lang/Object;
.source "0BLU"


# instance fields
.field public ֫:Ll/ۚܳ֨;

.field public ۧ:Ljava/lang/String;

.field public ܽ:Ljava/lang/String;

.field public ܿ:Ll/ᩴܳ֨;

.field public final ᩳ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Ll/֡ܳ֨;->֫:Ll/ۚܳ֨;

    .line 3
    iput-object v0, p0, Ll/֡ܳ֨;->ۧ:Ljava/lang/String;

    iput-object v0, p0, Ll/֡ܳ֨;->ܽ:Ljava/lang/String;

    .line 4
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/֡ܳ֨;->ᩳ:Ljava/lang/Object;

    .line 5
    new-instance v0, Ll/ᩴܳ֨;

    invoke-direct {v0, p0}, Ll/ᩴܳ֨;-><init>(Ll/֡ܳ֨;)V

    iput-object v0, p0, Ll/֡ܳ֨;->ܿ:Ll/ᩴܳ֨;

    return-void
.end method

.method public static ۧ(Landroid/content/Context;)Z
    .locals 6

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v1, "com.heytap.openid"

    :try_start_1
    invoke-virtual {p0, v1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    .line 2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    const/4 v3, 0x1

    if-lt v1, v2, :cond_0

    if-eqz p0, :cond_1

    .line 3
    invoke-virtual {p0}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    move-result-wide v1

    const-wide/16 v4, 0x1

    cmp-long p0, v1, v4

    if-ltz p0, :cond_1

    goto :goto_0

    :cond_0
    if-eqz p0, :cond_1

    .line 4
    iget p0, p0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    if-lt p0, v3, :cond_1

    :goto_0
    return v3

    :catch_0
    :cond_1
    return v0
.end method


# virtual methods
.method public final ֫(Landroid/content/Context;)Ljava/lang/String;
    .locals 9

    const-string v0, "OUID"

    .line 1
    iget-object v1, p0, Ll/֡ܳ֨;->ۧ:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/֡ܳ֨;->ۧ:Ljava/lang/String;

    .line 3
    :cond_0
    iget-object v1, p0, Ll/֡ܳ֨;->ܽ:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    .line 4
    iget-object v1, p0, Ll/֡ܳ֨;->ۧ:Ljava/lang/String;

    const/4 v4, 0x0

    .line 5
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const/16 v5, 0x40

    invoke-virtual {p1, v1, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    .line 6
    iget-object p1, p1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object p1, v4

    :goto_0
    if-eqz p1, :cond_2

    .line 8
    array-length v1, p1

    if-lez v1, :cond_2

    aget-object p1, p1, v3

    const-string v1, "SHA1"

    .line 9
    invoke-virtual {p1}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object p1

    .line 10
    :try_start_1
    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 11
    invoke-virtual {v1, p1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p1

    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    array-length v5, p1

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_1

    aget-byte v7, p1, v6

    and-int/lit16 v7, v7, 0xff

    or-int/lit16 v7, v7, 0x100

    .line 14
    invoke-static {v7}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x3

    invoke-virtual {v7, v2, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 15
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4
    :try_end_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_1

    .line 17
    :catch_1
    :cond_2
    iput-object v4, p0, Ll/֡ܳ֨;->ܽ:Ljava/lang/String;

    .line 18
    :cond_3
    iget-object p1, p0, Ll/֡ܳ֨;->֫:Ll/ۚܳ֨;

    iget-object v1, p0, Ll/֡ܳ֨;->ۧ:Ljava/lang/String;

    iget-object v4, p0, Ll/֡ܳ֨;->ܽ:Ljava/lang/String;

    check-cast p1, Ll/ܺܳ֨;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v5

    .line 2
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v6

    const-string v7, "com.heytap.openid.IOpenID"

    .line 3
    :try_start_2
    invoke-virtual {v5, v7}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v5, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v5, v4}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v5, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 7
    iget-object p1, p1, Ll/ܺܳ֨;->ܿ:Landroid/os/IBinder;

    invoke-interface {p1, v2, v5, v6, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 8
    invoke-virtual {v6}, Landroid/os/Parcel;->readException()V

    .line 9
    invoke-virtual {v6}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 10
    invoke-virtual {v6}, Landroid/os/Parcel;->recycle()V

    .line 11
    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    .line 19
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string p1, ""

    :cond_4
    return-object p1

    :catchall_0
    move-exception p1

    .line 12
    invoke-virtual {v6}, Landroid/os/Parcel;->recycle()V

    .line 13
    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    throw p1
.end method
