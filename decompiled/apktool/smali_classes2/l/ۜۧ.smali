.class public final Ll/ۜۧ;
.super Ljava/lang/Object;
.source "X5H0"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    .line 71
    new-instance v0, Ll/᩷ۧ;

    .line 44
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 45
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Ll/᩷ۧ;->ۗ:I

    .line 46
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Ll/᩷ۧ;->᩹:I

    .line 47
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Ll/᩷ۧ;->ۙ:I

    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Ll/᩷ۧ;->᩶:I

    .line 49
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, v0, Ll/᩷ۧ;->᩸:I

    return-object v0
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 76
    new-array p1, p1, [Ll/᩷ۧ;

    return-object p1
.end method
