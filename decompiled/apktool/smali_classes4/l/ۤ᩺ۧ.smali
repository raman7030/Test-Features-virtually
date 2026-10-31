.class public final Ll/ۤ᩺ۧ;
.super Ll/۫᩺ۧ;
.source "122L"


# instance fields
.field public final ۜ:I

.field public final ۡ:Ljava/lang/String;

.field public final ۢ:Landroid/util/SparseIntArray;

.field public ܳ:I

.field public final ܿ:I

.field public ᩳ:I

.field public final ᩷:Landroid/os/Parcel;

.field public ᩻:I


# direct methods
.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 8

    .line 51
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    invoke-virtual {p1}, Landroid/os/Parcel;->dataSize()I

    move-result v3

    new-instance v5, Ll/ۖ᩵;

    invoke-direct {v5}, Ll/ۖ᩵;-><init>()V

    new-instance v6, Ll/ۖ᩵;

    invoke-direct {v6}, Ll/ۖ᩵;-><init>()V

    new-instance v7, Ll/ۖ᩵;

    invoke-direct {v7}, Ll/ۖ᩵;-><init>()V

    const-string v4, ""

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v7}, Ll/ۤ᩺ۧ;-><init>(Landroid/os/Parcel;IILjava/lang/String;Ll/ۖ᩵;Ll/ۖ᩵;Ll/ۖ᩵;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;IILjava/lang/String;Ll/ۖ᩵;Ll/ۖ᩵;Ll/ۖ᩵;)V
    .locals 0

    .line 60
    invoke-direct {p0, p5, p6, p7}, Ll/۫᩺ۧ;-><init>(Ll/ۖ᩵;Ll/ۖ᩵;Ll/ۖ᩵;)V

    .line 41
    new-instance p5, Landroid/util/SparseIntArray;

    invoke-direct {p5}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p5, p0, Ll/ۤ᩺ۧ;->ۢ:Landroid/util/SparseIntArray;

    const/4 p5, -0x1

    .line 46
    iput p5, p0, Ll/ۤ᩺ۧ;->ᩳ:I

    .line 48
    iput p5, p0, Ll/ۤ᩺ۧ;->ܳ:I

    .line 61
    iput-object p1, p0, Ll/ۤ᩺ۧ;->᩷:Landroid/os/Parcel;

    .line 62
    iput p2, p0, Ll/ۤ᩺ۧ;->ۜ:I

    .line 63
    iput p3, p0, Ll/ۤ᩺ۧ;->ܿ:I

    .line 64
    iput p2, p0, Ll/ۤ᩺ۧ;->᩻:I

    .line 65
    iput-object p4, p0, Ll/ۤ᩺ۧ;->ۡ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 99
    iget v0, p0, Ll/ۤ᩺ۧ;->ᩳ:I

    if-ltz v0, :cond_0

    .line 100
    iget-object v1, p0, Ll/ۤ᩺ۧ;->ۢ:Landroid/util/SparseIntArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseIntArray;->get(I)I

    move-result v0

    .line 101
    iget-object v1, p0, Ll/ۤ᩺ۧ;->᩷:Landroid/os/Parcel;

    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    sub-int v3, v2, v0

    .line 107
    invoke-virtual {v1, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 108
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 109
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->setDataPosition(I)V

    :cond_0
    return-void
.end method

.method public final ֫(Landroid/os/Parcelable;)V
    .locals 2

    .line 176
    iget-object v0, p0, Ll/ۤ᩺ۧ;->᩷:Landroid/os/Parcel;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method

.method public final ֫(Ljava/lang/CharSequence;)V
    .locals 2

    .line 196
    iget-object v0, p0, Ll/ۤ᩺ۧ;->᩷:Landroid/os/Parcel;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 166
    iget-object v0, p0, Ll/ۤ᩺ۧ;->᩷:Landroid/os/Parcel;

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 181
    iget-object v0, p0, Ll/ۤ᩺ۧ;->᩷:Landroid/os/Parcel;

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

.method public final ֫(I)Z
    .locals 2

    .line 70
    :goto_0
    iget v0, p0, Ll/ۤ᩺ۧ;->᩻:I

    iget v1, p0, Ll/ۤ᩺ۧ;->ܿ:I

    if-ge v0, v1, :cond_2

    .line 71
    iget v0, p0, Ll/ۤ᩺ۧ;->ܳ:I

    if-ne v0, p1, :cond_0

    goto :goto_1

    .line 74
    :cond_0
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_1

    goto :goto_2

    .line 77
    :cond_1
    iget v0, p0, Ll/ۤ᩺ۧ;->᩻:I

    iget-object v1, p0, Ll/ۤ᩺ۧ;->᩷:Landroid/os/Parcel;

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 78
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 79
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Ll/ۤ᩺ۧ;->ܳ:I

    .line 82
    iget v1, p0, Ll/ۤ᩺ۧ;->᩻:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/ۤ᩺ۧ;->᩻:I

    goto :goto_0

    .line 84
    :cond_2
    iget v0, p0, Ll/ۤ᩺ۧ;->ܳ:I

    if-ne v0, p1, :cond_3

    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_2
    const/4 p1, 0x0

    return p1
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 1

    .line 226
    iget-object v0, p0, Ll/ۤ᩺ۧ;->᩷:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ll/۫᩺ۧ;
    .locals 9

    .line 119
    new-instance v8, Ll/ۤ᩺ۧ;

    iget-object v1, p0, Ll/ۤ᩺ۧ;->᩷:Landroid/os/Parcel;

    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    iget v0, p0, Ll/ۤ᩺ۧ;->᩻:I

    iget v3, p0, Ll/ۤ᩺ۧ;->ۜ:I

    if-ne v0, v3, :cond_0

    iget v0, p0, Ll/ۤ᩺ۧ;->ܿ:I

    :cond_0
    move v3, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Ll/ۤ᩺ۧ;->ۡ:Ljava/lang/String;

    const-string v5, "  "

    .line 0
    invoke-static {v0, v4, v5}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 119
    iget-object v6, p0, Ll/۫᩺ۧ;->ܽ:Ll/ۖ᩵;

    iget-object v7, p0, Ll/۫᩺ۧ;->֫:Ll/ۖ᩵;

    iget-object v5, p0, Ll/۫᩺ۧ;->ۧ:Ll/ۖ᩵;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Ll/ۤ᩺ۧ;-><init>(Landroid/os/Parcel;IILjava/lang/String;Ll/ۖ᩵;Ll/ۖ᩵;Ll/ۖ᩵;)V

    return-object v8
.end method

.method public final ۧ(I)V
    .locals 2

    .line 89
    invoke-virtual {p0}, Ll/ۤ᩺ۧ;->֫()V

    .line 90
    iput p1, p0, Ll/ۤ᩺ۧ;->ᩳ:I

    .line 91
    iget-object v0, p0, Ll/ۤ᩺ۧ;->᩷:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    move-result v0

    iget-object v1, p0, Ll/ۤ᩺ۧ;->ۢ:Landroid/util/SparseIntArray;

    invoke-virtual {v1, p1, v0}, Landroid/util/SparseIntArray;->put(II)V

    const/4 v0, 0x0

    .line 93
    invoke-virtual {p0, v0}, Ll/ۤ᩺ۧ;->ܽ(I)V

    .line 94
    invoke-virtual {p0, p1}, Ll/ۤ᩺ۧ;->ܽ(I)V

    return-void
.end method

.method public final ۧ([B)V
    .locals 2

    .line 126
    iget-object v0, p0, Ll/ۤ᩺ۧ;->᩷:Landroid/os/Parcel;

    if-eqz p1, :cond_0

    .line 127
    array-length v1, p1

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 128
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeByteArray([B)V

    return-void

    :cond_0
    const/4 p1, -0x1

    .line 130
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

.method public final ܳ()I
    .locals 1

    .line 206
    iget-object v0, p0, Ll/ۤ᩺ۧ;->᩷:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    return v0
.end method

.method public final ܽ(I)V
    .locals 1

    .line 146
    iget-object v0, p0, Ll/ۤ᩺ۧ;->᩷:Landroid/os/Parcel;

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 258
    iget-object v0, p0, Ll/ۤ᩺ۧ;->᩷:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܿ()Ljava/lang/CharSequence;
    .locals 2

    .line 201
    sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    iget-object v1, p0, Ll/ۤ᩺ۧ;->᩷:Landroid/os/Parcel;

    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final ᩳ()[B
    .locals 2

    .line 236
    iget-object v0, p0, Ll/ۤ᩺ۧ;->᩷:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-gez v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 240
    :cond_0
    new-array v1, v1, [B

    .line 241
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->readByteArray([B)V

    return-object v1
.end method

.method public final ᩻()Landroid/os/Parcelable;
    .locals 2

    .line 248
    const-class v0, Ll/ۤ᩺ۧ;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    iget-object v1, p0, Ll/ۤ᩺ۧ;->᩷:Landroid/os/Parcel;

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    return-object v0
.end method
