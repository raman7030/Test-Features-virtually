.class public final Ll/ܶ᩵֫;
.super Ljava/lang/Object;
.source "08RH"

# interfaces
.implements Ljava/lang/Comparable;
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public final ᩶:I

.field public final ᩸:I

.field public final ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 136
    new-instance v0, Ll/۠᩵֫;

    .line 137
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 136
    sput-object v0, Ll/ܶ᩵֫;->CREATOR:Landroid/os/Parcelable$Creator;

    const/4 v0, 0x0

    .line 150
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x1

    .line 151
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x2

    .line 152
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Ll/ܶ᩵֫;->᩹:I

    .line 76
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Ll/ܶ᩵֫;->᩸:I

    .line 77
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Ll/ܶ᩵֫;->᩶:I

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 39
    check-cast p1, Ll/ܶ᩵֫;

    .line 112
    iget v0, p0, Ll/ܶ᩵֫;->᩹:I

    iget v1, p1, Ll/ܶ᩵֫;->᩹:I

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    .line 114
    iget v0, p0, Ll/ܶ᩵֫;->᩸:I

    iget v1, p1, Ll/ܶ᩵֫;->᩸:I

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    .line 116
    iget v0, p0, Ll/ܶ᩵֫;->᩶:I

    iget p1, p1, Ll/ܶ᩵֫;->᩶:I

    sub-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 90
    const-class v2, Ll/ܶ᩵֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 94
    :cond_1
    check-cast p1, Ll/ܶ᩵֫;

    .line 95
    iget v2, p0, Ll/ܶ᩵֫;->᩹:I

    iget v3, p1, Ll/ܶ᩵֫;->᩹:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ll/ܶ᩵֫;->᩸:I

    iget v3, p1, Ll/ܶ᩵֫;->᩸:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ll/ܶ᩵֫;->᩶:I

    iget p1, p1, Ll/ܶ᩵֫;->᩶:I

    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 103
    iget v0, p0, Ll/ܶ᩵֫;->᩹:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/ܶ᩵֫;->᩸:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 104
    iget v1, p0, Ll/ܶ᩵֫;->᩶:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Ll/ܶ᩵֫;->᩹:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ܶ᩵֫;->᩸:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ܶ᩵֫;->᩶:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 131
    iget p2, p0, Ll/ܶ᩵֫;->᩹:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 132
    iget p2, p0, Ll/ܶ᩵֫;->᩸:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 133
    iget p2, p0, Ll/ܶ᩵֫;->᩶:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
