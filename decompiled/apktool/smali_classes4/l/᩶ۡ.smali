.class public final Ll/᩶ۡ;
.super Landroid/view/View$BaseSavedState;
.source "N5WL"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public ᩸:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 661
    new-instance v0, Ll/᩹ۡ;

    .line 662
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 661
    sput-object v0, Ll/᩶ۡ;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 657
    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 658
    iget-boolean p2, p0, Ll/᩶ۡ;->᩸:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    return-void
.end method
