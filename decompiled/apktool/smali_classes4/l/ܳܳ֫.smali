.class public final Ll/ܳܳ֫;
.super Ljava/lang/Object;
.source "9AKI"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public final ֫֫:I

.field public final ۗ:[I

.field public final ۙ:Ljava/lang/CharSequence;

.field public final ۛ:[I

.field public final ۟:Ljava/util/ArrayList;

.field public final ۤ:Ljava/lang/String;

.field public final ۨ:[I

.field public final ۫:I

.field public final ۬:Ljava/util/ArrayList;

.field public final ܰ:Ljava/util/ArrayList;

.field public final ᩶:I

.field public final ᩸:I

.field public final ᩹:Ljava/lang/CharSequence;

.field public final ᩺:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 211
    new-instance v0, Ll/ܿܳ֫;

    .line 212
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 211
    sput-object v0, Ll/ܳܳ֫;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Ll/ܳܳ֫;->ۨ:[I

    .line 88
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Ll/ܳܳ֫;->۬:Ljava/util/ArrayList;

    .line 89
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Ll/ܳܳ֫;->ۛ:[I

    .line 90
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Ll/ܳܳ֫;->ۗ:[I

    .line 91
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Ll/ܳܳ֫;->֫֫:I

    .line 92
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܳܳ֫;->ۤ:Ljava/lang/String;

    .line 93
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Ll/ܳܳ֫;->۫:I

    .line 94
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Ll/ܳܳ֫;->᩶:I

    .line 95
    sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    iput-object v1, p0, Ll/ܳܳ֫;->ۙ:Ljava/lang/CharSequence;

    .line 96
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Ll/ܳܳ֫;->᩸:I

    .line 97
    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    iput-object v0, p0, Ll/ܳܳ֫;->᩹:Ljava/lang/CharSequence;

    .line 98
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Ll/ܳܳ֫;->ܰ:Ljava/util/ArrayList;

    .line 99
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Ll/ܳܳ֫;->۟:Ljava/util/ArrayList;

    .line 100
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Ll/ܳܳ֫;->᩺:Z

    return-void
.end method

.method public constructor <init>(Ll/ᩳܳ֫;)V
    .locals 8

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iget-object v0, p1, Ll/ܽ᩷֫;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v1, v0, 0x6

    .line 52
    new-array v1, v1, [I

    iput-object v1, p0, Ll/ܳܳ֫;->ۨ:[I

    .line 54
    iget-boolean v1, p1, Ll/ܽ᩷֫;->֫:Z

    if-eqz v1, :cond_2

    .line 58
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Ll/ܳܳ֫;->۬:Ljava/util/ArrayList;

    .line 59
    new-array v1, v0, [I

    iput-object v1, p0, Ll/ܳܳ֫;->ۛ:[I

    .line 60
    new-array v1, v0, [I

    iput-object v1, p0, Ll/ܳܳ֫;->ۗ:[I

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 63
    iget-object v3, p1, Ll/ܽ᩷֫;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۧ᩷֫;

    .line 64
    iget-object v4, p0, Ll/ܳܳ֫;->ۨ:[I

    add-int/lit8 v5, v2, 0x1

    iget v6, v3, Ll/ۧ᩷֫;->֫:I

    aput v6, v4, v2

    .line 65
    iget-object v4, p0, Ll/ܳܳ֫;->۬:Ljava/util/ArrayList;

    iget-object v6, v3, Ll/ۧ᩷֫;->ܿ:Ll/ۡ᩻֫;

    if-eqz v6, :cond_0

    iget-object v6, v6, Ll/ۡ᩻֫;->mWho:Ljava/lang/String;

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    :goto_1
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    iget-object v4, p0, Ll/ܳܳ֫;->ۨ:[I

    add-int/lit8 v6, v2, 0x2

    iget-boolean v7, v3, Ll/ۧ᩷֫;->ܳ:Z

    aput v7, v4, v5

    add-int/lit8 v5, v2, 0x3

    .line 67
    iget v7, v3, Ll/ۧ᩷֫;->ܽ:I

    aput v7, v4, v6

    add-int/lit8 v6, v2, 0x4

    .line 68
    iget v7, v3, Ll/ۧ᩷֫;->ᩳ:I

    aput v7, v4, v5

    add-int/lit8 v5, v2, 0x5

    .line 69
    iget v7, v3, Ll/ۧ᩷֫;->ۜ:I

    aput v7, v4, v6

    add-int/lit8 v2, v2, 0x6

    .line 70
    iget v6, v3, Ll/ۧ᩷֫;->᩷:I

    aput v6, v4, v5

    .line 71
    iget-object v4, p0, Ll/ܳܳ֫;->ۛ:[I

    iget-object v5, v3, Ll/ۧ᩷֫;->᩻:Ll/ܰۢ֫;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aput v5, v4, v1

    .line 72
    iget-object v4, p0, Ll/ܳܳ֫;->ۗ:[I

    iget-object v3, v3, Ll/ۧ᩷֫;->ۧ:Ll/ܰۢ֫;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v3, v4, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 74
    :cond_1
    iget v0, p1, Ll/ܽ᩷֫;->᩵:I

    iput v0, p0, Ll/ܳܳ֫;->֫֫:I

    .line 75
    iget-object v0, p1, Ll/ܽ᩷֫;->᩷:Ljava/lang/String;

    iput-object v0, p0, Ll/ܳܳ֫;->ۤ:Ljava/lang/String;

    .line 76
    iget v0, p1, Ll/ᩳܳ֫;->ۚ:I

    iput v0, p0, Ll/ܳܳ֫;->۫:I

    .line 77
    iget v0, p1, Ll/ܽ᩷֫;->ܿ:I

    iput v0, p0, Ll/ܳܳ֫;->᩶:I

    .line 78
    iget-object v0, p1, Ll/ܽ᩷֫;->ܳ:Ljava/lang/CharSequence;

    iput-object v0, p0, Ll/ܳܳ֫;->ۙ:Ljava/lang/CharSequence;

    .line 79
    iget v0, p1, Ll/ܽ᩷֫;->ܽ:I

    iput v0, p0, Ll/ܳܳ֫;->᩸:I

    .line 80
    iget-object v0, p1, Ll/ܽ᩷֫;->ᩳ:Ljava/lang/CharSequence;

    iput-object v0, p0, Ll/ܳܳ֫;->᩹:Ljava/lang/CharSequence;

    .line 81
    iget-object v0, p1, Ll/ܽ᩷֫;->ۘ:Ljava/util/ArrayList;

    iput-object v0, p0, Ll/ܳܳ֫;->ܰ:Ljava/util/ArrayList;

    .line 82
    iget-object v0, p1, Ll/ܽ᩷֫;->ᩴ:Ljava/util/ArrayList;

    iput-object v0, p0, Ll/ܳܳ֫;->۟:Ljava/util/ArrayList;

    .line 83
    iget-boolean p1, p1, Ll/ܽ᩷֫;->ۖ:Z

    iput-boolean p1, p0, Ll/ܳܳ֫;->᩺:Z

    return-void

    .line 55
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Not on back stack"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 195
    iget-object p2, p0, Ll/ܳܳ֫;->ۨ:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 196
    iget-object p2, p0, Ll/ܳܳ֫;->۬:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 197
    iget-object p2, p0, Ll/ܳܳ֫;->ۛ:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 198
    iget-object p2, p0, Ll/ܳܳ֫;->ۗ:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 199
    iget p2, p0, Ll/ܳܳ֫;->֫֫:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 200
    iget-object p2, p0, Ll/ܳܳ֫;->ۤ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 201
    iget p2, p0, Ll/ܳܳ֫;->۫:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 202
    iget p2, p0, Ll/ܳܳ֫;->᩶:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 203
    iget-object p2, p0, Ll/ܳܳ֫;->ۙ:Ljava/lang/CharSequence;

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    .line 204
    iget p2, p0, Ll/ܳܳ֫;->᩸:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 205
    iget-object p2, p0, Ll/ܳܳ֫;->᩹:Ljava/lang/CharSequence;

    invoke-static {p2, p1, v0}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    .line 206
    iget-object p2, p0, Ll/ܳܳ֫;->ܰ:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 207
    iget-object p2, p0, Ll/ܳܳ֫;->۟:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 208
    iget-boolean p2, p0, Ll/ܳܳ֫;->᩺:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
