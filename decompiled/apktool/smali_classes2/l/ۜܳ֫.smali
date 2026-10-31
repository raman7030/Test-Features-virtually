.class public final Ll/ۜܳ֫;
.super Ljava/lang/Object;
.source "G20T"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public final ᩸:Ljava/util/ArrayList;

.field public final ᩹:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 88
    new-instance v0, Ll/᩻ܳ֫;

    .line 89
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 88
    sput-object v0, Ll/ۜܳ֫;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Ll/ۜܳ֫;->᩸:Ljava/util/ArrayList;

    .line 43
    sget-object v0, Ll/ܳܳ֫;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Ll/ۜܳ֫;->᩹:Ljava/util/ArrayList;

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

    .line 84
    iget-object p2, p0, Ll/ۜܳ֫;->᩸:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 85
    iget-object p2, p0, Ll/ۜܳ֫;->᩹:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    return-void
.end method
