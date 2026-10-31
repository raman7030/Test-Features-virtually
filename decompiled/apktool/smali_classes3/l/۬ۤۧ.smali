.class public final Ll/۬ۤۧ;
.super Landroid/view/View$BaseSavedState;
.source "85MM"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public final ᩸:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 275
    new-instance v0, Ll/ۗۤۧ;

    .line 276
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 275
    sput-object v0, Ll/۬ۤۧ;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 265
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 266
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Ll/۬ۤۧ;->᩸:Z

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcelable;Z)V
    .locals 0

    .line 257
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 258
    iput-boolean p2, p0, Ll/۬ۤۧ;->᩸:Z

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 271
    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 272
    iget-boolean p2, p0, Ll/۬ۤۧ;->᩸:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    return-void
.end method
