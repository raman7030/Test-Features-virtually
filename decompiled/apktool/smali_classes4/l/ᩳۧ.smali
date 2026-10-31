.class public final Ll/ᩳۧ;
.super Ljava/lang/Object;
.source "U6BF"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public ᩸:Landroid/os/ResultReceiver;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 2326
    new-instance v0, Ll/ܽۧ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ᩳۧ;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 2345
    iget-object v0, p0, Ll/ᩳۧ;->᩸:Landroid/os/ResultReceiver;

    invoke-virtual {v0, p1, p2}, Landroid/os/ResultReceiver;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
