.class public final Ll/۬ۜ֫;
.super Ljava/lang/Object;
.source "65PU"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public final ۗ:I

.field public final ۙ:Z

.field public final ۛ:Z

.field public final ۟:Ljava/lang/String;

.field public final ۤ:I

.field public final ۨ:Z

.field public final ۫:Z

.field public final ۬:Z

.field public final ܰ:Ljava/lang/String;

.field public final ᩶:I

.field public final ᩸:Landroid/os/Bundle;

.field public final ᩹:Ljava/lang/String;

.field public ᩺:Landroid/os/Bundle;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 165
    new-instance v0, Ll/ۗۜ֫;

    .line 166
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 165
    sput-object v0, Ll/۬ۜ֫;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/۬ۜ֫;->᩹:Ljava/lang/String;

    .line 61
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/۬ۜ֫;->۟:Ljava/lang/String;

    .line 62
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Ll/۬ۜ֫;->۬:Z

    .line 63
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Ll/۬ۜ֫;->ۗ:I

    .line 64
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Ll/۬ۜ֫;->᩶:I

    .line 65
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/۬ۜ֫;->ܰ:Ljava/lang/String;

    .line 66
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Ll/۬ۜ֫;->ۨ:Z

    .line 67
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    iput-boolean v0, p0, Ll/۬ۜ֫;->ۛ:Z

    .line 68
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    iput-boolean v0, p0, Ll/۬ۜ֫;->ۙ:Z

    .line 69
    invoke-virtual {p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Ll/۬ۜ֫;->᩸:Landroid/os/Bundle;

    .line 70
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    :cond_4
    iput-boolean v1, p0, Ll/۬ۜ֫;->۫:Z

    .line 71
    invoke-virtual {p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Ll/۬ۜ֫;->᩺:Landroid/os/Bundle;

    .line 72
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Ll/۬ۜ֫;->ۤ:I

    return-void
.end method

.method public constructor <init>(Ll/ۡ᩻֫;)V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/۬ۜ֫;->᩹:Ljava/lang/String;

    .line 46
    iget-object v0, p1, Ll/ۡ᩻֫;->mWho:Ljava/lang/String;

    iput-object v0, p0, Ll/۬ۜ֫;->۟:Ljava/lang/String;

    .line 47
    iget-boolean v0, p1, Ll/ۡ᩻֫;->mFromLayout:Z

    iput-boolean v0, p0, Ll/۬ۜ֫;->۬:Z

    .line 48
    iget v0, p1, Ll/ۡ᩻֫;->mFragmentId:I

    iput v0, p0, Ll/۬ۜ֫;->ۗ:I

    .line 49
    iget v0, p1, Ll/ۡ᩻֫;->mContainerId:I

    iput v0, p0, Ll/۬ۜ֫;->᩶:I

    .line 50
    iget-object v0, p1, Ll/ۡ᩻֫;->mTag:Ljava/lang/String;

    iput-object v0, p0, Ll/۬ۜ֫;->ܰ:Ljava/lang/String;

    .line 51
    iget-boolean v0, p1, Ll/ۡ᩻֫;->mRetainInstance:Z

    iput-boolean v0, p0, Ll/۬ۜ֫;->ۨ:Z

    .line 52
    iget-boolean v0, p1, Ll/ۡ᩻֫;->mRemoving:Z

    iput-boolean v0, p0, Ll/۬ۜ֫;->ۛ:Z

    .line 53
    iget-boolean v0, p1, Ll/ۡ᩻֫;->mDetached:Z

    iput-boolean v0, p0, Ll/۬ۜ֫;->ۙ:Z

    .line 54
    iget-object v0, p1, Ll/ۡ᩻֫;->mArguments:Landroid/os/Bundle;

    iput-object v0, p0, Ll/۬ۜ֫;->᩸:Landroid/os/Bundle;

    .line 55
    iget-boolean v0, p1, Ll/ۡ᩻֫;->mHidden:Z

    iput-boolean v0, p0, Ll/۬ۜ֫;->۫:Z

    .line 56
    iget-object p1, p1, Ll/ۡ᩻֫;->mMaxState:Ll/ܰۢ֫;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    iput p1, p0, Ll/۬ۜ֫;->ۤ:I

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const/16 v0, 0x80

    const-string v1, "FragmentState{"

    .line 0
    invoke-static {v0, v1}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 113
    iget-object v1, p0, Ll/۬ۜ֫;->᩹:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    iget-object v1, p0, Ll/۬ۜ֫;->۟:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")}:"

    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    iget-boolean v1, p0, Ll/۬ۜ֫;->۬:Z

    if-eqz v1, :cond_0

    const-string v1, " fromLayout"

    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    :cond_0
    iget v1, p0, Ll/۬ۜ֫;->᩶:I

    if-eqz v1, :cond_1

    const-string v2, " id=0x"

    .line 121
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    :cond_1
    iget-object v1, p0, Ll/۬ۜ֫;->ܰ:Ljava/lang/String;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, " tag="

    .line 125
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    :cond_2
    iget-boolean v1, p0, Ll/۬ۜ֫;->ۨ:Z

    if-eqz v1, :cond_3

    const-string v1, " retainInstance"

    .line 129
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    :cond_3
    iget-boolean v1, p0, Ll/۬ۜ֫;->ۛ:Z

    if-eqz v1, :cond_4

    const-string v1, " removing"

    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    :cond_4
    iget-boolean v1, p0, Ll/۬ۜ֫;->ۙ:Z

    if-eqz v1, :cond_5

    const-string v1, " detached"

    .line 135
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    :cond_5
    iget-boolean v1, p0, Ll/۬ۜ֫;->۫:Z

    if-eqz v1, :cond_6

    const-string v1, " hidden"

    .line 138
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    :cond_6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 150
    iget-object p2, p0, Ll/۬ۜ֫;->᩹:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 151
    iget-object p2, p0, Ll/۬ۜ֫;->۟:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 152
    iget-boolean p2, p0, Ll/۬ۜ֫;->۬:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 153
    iget p2, p0, Ll/۬ۜ֫;->ۗ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 154
    iget p2, p0, Ll/۬ۜ֫;->᩶:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 155
    iget-object p2, p0, Ll/۬ۜ֫;->ܰ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 156
    iget-boolean p2, p0, Ll/۬ۜ֫;->ۨ:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 157
    iget-boolean p2, p0, Ll/۬ۜ֫;->ۛ:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 158
    iget-boolean p2, p0, Ll/۬ۜ֫;->ۙ:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 159
    iget-object p2, p0, Ll/۬ۜ֫;->᩸:Landroid/os/Bundle;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 160
    iget-boolean p2, p0, Ll/۬ۜ֫;->۫:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 161
    iget-object p2, p0, Ll/۬ۜ֫;->᩺:Landroid/os/Bundle;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 162
    iget p2, p0, Ll/۬ۜ֫;->ۤ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
