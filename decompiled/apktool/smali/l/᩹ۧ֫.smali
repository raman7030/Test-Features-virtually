.class public final Ll/᩹ۧ֫;
.super Ll/۟֫֫;
.source "O607"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public ۗ:I

.field public ۙ:I

.field public ᩶:I

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 2199
    new-instance v0, Ll/᩸ۧ֫;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/᩹ۧ֫;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
    .locals 0

    .line 2177
    invoke-direct {p0, p1, p2}, Ll/۟֫֫;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    const/4 p2, 0x0

    .line 2170
    iput p2, p0, Ll/᩹ۧ֫;->ۗ:I

    .line 2178
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    iput p2, p0, Ll/᩹ۧ֫;->ۗ:I

    .line 2179
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    iput p2, p0, Ll/᩹ۧ֫;->᩹:I

    .line 2180
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    iput p2, p0, Ll/᩹ۧ֫;->᩶:I

    .line 2181
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    iput p2, p0, Ll/᩹ۧ֫;->ۙ:I

    .line 2182
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Ll/᩹ۧ֫;->᩸:I

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcelable;)V
    .locals 0

    .line 2186
    invoke-direct {p0, p1}, Ll/۟֫֫;-><init>(Landroid/os/Parcelable;)V

    const/4 p1, 0x0

    .line 2170
    iput p1, p0, Ll/᩹ۧ֫;->ۗ:I

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 2191
    invoke-super {p0, p1, p2}, Ll/۟֫֫;->writeToParcel(Landroid/os/Parcel;I)V

    .line 2192
    iget p2, p0, Ll/᩹ۧ֫;->ۗ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 2193
    iget p2, p0, Ll/᩹ۧ֫;->᩹:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 2194
    iget p2, p0, Ll/᩹ۧ֫;->᩶:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 2195
    iget p2, p0, Ll/᩹ۧ֫;->ۙ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 2196
    iget p2, p0, Ll/᩹ۧ֫;->᩸:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
