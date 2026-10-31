.class public final Ll/ۡ۟ۧ;
.super Landroid/view/View$BaseSavedState;
.source "F1OQ"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public ᩶:I

.field public ᩸:Landroid/os/Parcelable;

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 420
    new-instance v0, Ll/ۢ۟ۧ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۡ۟ۧ;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
    .locals 1

    .line 392
    invoke-direct {p0, p1, p2}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    .line 407
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Ll/ۡ۟ۧ;->᩶:I

    .line 408
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Ll/ۡ۟ۧ;->᩹:I

    .line 409
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    iput-object p1, p0, Ll/ۡ۟ۧ;->᩸:Landroid/os/Parcelable;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 414
    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 415
    iget v0, p0, Ll/ۡ۟ۧ;->᩶:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 416
    iget v0, p0, Ll/ۡ۟ۧ;->᩹:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 417
    iget-object v0, p0, Ll/ۡ۟ۧ;->᩸:Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
