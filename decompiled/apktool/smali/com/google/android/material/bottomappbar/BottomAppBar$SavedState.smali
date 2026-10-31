.class public Lcom/google/android/material/bottomappbar/BottomAppBar$SavedState;
.super Ll/۟֫֫;
.source "BottomAppBar.java"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public fabAlignmentMode:I

.field public fabAttached:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1517
    new-instance v0, Lcom/google/android/material/bottomappbar/BottomAppBar$SavedState$1;

    invoke-direct {v0}, Lcom/google/android/material/bottomappbar/BottomAppBar$SavedState$1;-><init>()V

    sput-object v0, Lcom/google/android/material/bottomappbar/BottomAppBar$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1505
    invoke-direct {p0, p1, p2}, Ll/۟֫֫;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    .line 1506
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    iput p2, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$SavedState;->fabAlignmentMode:I

    .line 1507
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$SavedState;->fabAttached:Z

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcelable;)V
    .locals 0

    .line 1501
    invoke-direct {p0, p1}, Ll/۟֫֫;-><init>(Landroid/os/Parcelable;)V

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1512
    invoke-super {p0, p1, p2}, Ll/۟֫֫;->writeToParcel(Landroid/os/Parcel;I)V

    .line 1513
    iget p2, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$SavedState;->fabAlignmentMode:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1514
    iget-boolean p2, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$SavedState;->fabAttached:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
