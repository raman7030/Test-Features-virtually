.class public final Ll/ᩳ۫ۧ;
.super Ljava/lang/Object;
.source "8539"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 3

    .line 3109
    new-instance v0, Ll/ܿ۫ۧ;

    .line 3059
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 3060
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Ll/ܿ۫ۧ;->ۙ:I

    .line 3061
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Ll/ܿ۫ۧ;->᩸:I

    .line 3062
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iput-boolean v2, v0, Ll/ܿ۫ۧ;->᩶:Z

    .line 3063
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-lez v1, :cond_1

    .line 3065
    new-array v1, v1, [I

    iput-object v1, v0, Ll/ܿ۫ۧ;->᩹:[I

    .line 3066
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readIntArray([I)V

    :cond_1
    return-object v0
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 3114
    new-array p1, p1, [Ll/ܿ۫ۧ;

    return-object p1
.end method
