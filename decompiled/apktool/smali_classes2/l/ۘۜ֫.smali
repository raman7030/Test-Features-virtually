.class public final Ll/ۘۜ֫;
.super Ljava/lang/Object;
.source "O5NM"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public ᩸:I

.field public ᩹:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 3539
    new-instance v0, Ll/ۖۜ֫;

    .line 3540
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 3539
    sput-object v0, Ll/ۘۜ֫;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 3518
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3519
    iput-object p1, p0, Ll/ۘۜ֫;->᩹:Ljava/lang/String;

    .line 3520
    iput p2, p0, Ll/ۘۜ֫;->᩸:I

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

    .line 3535
    iget-object p2, p0, Ll/ۘۜ֫;->᩹:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 3536
    iget p2, p0, Ll/ۘۜ֫;->᩸:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
