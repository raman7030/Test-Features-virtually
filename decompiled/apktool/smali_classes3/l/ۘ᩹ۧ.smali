.class public final Ll/ۘ᩹ۧ;
.super Ll/ۛܶۧ;
.source "D6A1"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public ᩶:I

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 457
    new-instance v0, Ll/ۖ᩹ۧ;

    .line 458
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 457
    sput-object v0, Ll/ۘ᩹ۧ;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Landroid/view/AbsSavedState;->EMPTY_STATE:Landroid/view/AbsSavedState;

    .line 2237
    invoke-direct {p0, v0}, Landroid/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 2233
    invoke-direct {p0, p1}, Landroid/view/AbsSavedState;-><init>(Landroid/os/Parcel;)V

    .line 478
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Ll/ۘ᩹ۧ;->᩶:I

    .line 479
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Ll/ۘ᩹ۧ;->᩹:I

    .line 480
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Ll/ۘ᩹ۧ;->᩸:I

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 489
    invoke-super {p0, p1, p2}, Landroid/view/AbsSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 492
    iget p2, p0, Ll/ۘ᩹ۧ;->᩶:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 493
    iget p2, p0, Ll/ۘ᩹ۧ;->᩹:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 494
    iget p2, p0, Ll/ۘ᩹ۧ;->᩸:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
