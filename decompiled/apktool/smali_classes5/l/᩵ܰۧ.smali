.class public final Ll/᩵ܰۧ;
.super Ll/۟֫֫;
.source "Q69A"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public ᩶:I

.field public ᩸:Landroid/os/Parcelable;

.field public ᩹:Ljava/lang/ClassLoader;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1412
    new-instance v0, Ll/ᩴܰۧ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/᩵ܰۧ;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
    .locals 1

    .line 1429
    invoke-direct {p0, p1, p2}, Ll/۟֫֫;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    if-nez p2, :cond_0

    .line 1431
    const-class p2, Ll/᩵ܰۧ;

    invoke-virtual {p2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p2

    .line 1433
    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Ll/᩵ܰۧ;->᩶:I

    .line 1434
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    iput-object p1, p0, Ll/᩵ܰۧ;->᩸:Landroid/os/Parcelable;

    .line 1435
    iput-object p2, p0, Ll/᩵ܰۧ;->᩹:Ljava/lang/ClassLoader;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcelable;)V
    .locals 0

    .line 1395
    invoke-direct {p0, p1}, Ll/۟֫֫;-><init>(Landroid/os/Parcelable;)V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1407
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FragmentPager.SavedState{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1408
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " position="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩵ܰۧ;->᩶:I

    const-string v2, "}"

    .line 0
    invoke-static {v1, v2, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1400
    invoke-super {p0, p1, p2}, Ll/۟֫֫;->writeToParcel(Landroid/os/Parcel;I)V

    .line 1401
    iget v0, p0, Ll/᩵ܰۧ;->᩶:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1402
    iget-object v0, p0, Ll/᩵ܰۧ;->᩸:Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
