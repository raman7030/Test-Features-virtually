.class public final Ll/ᩳۤۧ;
.super Ll/۟֫֫;
.source "U6BG"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public ᩸:Z

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1715
    new-instance v0, Ll/ܽۤۧ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ᩳۤۧ;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    const/4 v0, 0x0

    .line 1703
    invoke-direct {p0, p1, v0}, Ll/۟֫֫;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    .line 1704
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Ll/ᩳۤۧ;->᩸:Z

    .line 1705
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Ll/ᩳۤۧ;->᩹:I

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcelable;)V
    .locals 0

    .line 1699
    invoke-direct {p0, p1}, Ll/۟֫֫;-><init>(Landroid/os/Parcelable;)V

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1710
    invoke-super {p0, p1, p2}, Ll/۟֫֫;->writeToParcel(Landroid/os/Parcel;I)V

    .line 1711
    iget-boolean p2, p0, Ll/ᩳۤۧ;->᩸:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1712
    iget p2, p0, Ll/ᩳۤۧ;->᩹:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
