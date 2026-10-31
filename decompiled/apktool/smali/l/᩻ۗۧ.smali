.class public final Ll/᩻ۗۧ;
.super Ljava/lang/Object;
.source "K4ND"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public ᩶:I

.field public ᩸:Z

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 2491
    new-instance v0, Ll/ܳۗۧ;

    .line 2492
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2491
    sput-object v0, Ll/᩻ۗۧ;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 2486
    iget p2, p0, Ll/᩻ۗۧ;->᩶:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 2487
    iget p2, p0, Ll/᩻ۗۧ;->᩹:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 2488
    iget-boolean p2, p0, Ll/᩻ۗۧ;->᩸:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
