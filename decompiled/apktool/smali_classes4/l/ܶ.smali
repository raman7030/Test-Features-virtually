.class public Ll/ܶ;
.super Ljava/lang/Object;
.source "95XT"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public final ᩸:Ll/ܰ;

.field public final ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 584
    new-instance v0, Ll/۠;

    .line 585
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 584
    sput-object v0, Ll/ܶ;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 558
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 559
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Ll/ܶ;->᩹:I

    .line 560
    sget-object v0, Ll/ܰ;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܰ;

    iput-object p1, p0, Ll/ܶ;->᩸:Ll/ܰ;

    return-void
.end method

.method public constructor <init>(Ll/ܰ;I)V
    .locals 1

    .line 544
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    .line 548
    invoke-virtual {p1}, Ll/ܰ;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 551
    iput p2, p0, Ll/ܶ;->᩹:I

    .line 552
    iput-object p1, p0, Ll/ܶ;->᩸:Ll/ܰ;

    return-void

    .line 549
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "description must have a non-empty media id"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 546
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "description cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ljava/util/List;)V
    .locals 4

    if-eqz p0, :cond_1

    .line 531
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 532
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 510
    check-cast v1, Landroid/media/browse/MediaBrowser$MediaItem;

    .line 511
    invoke-static {v1}, Ll/ۢ;->ۧ(Landroid/media/browse/MediaBrowser$MediaItem;)I

    move-result v2

    .line 513
    invoke-static {v1}, Ll/ۢ;->֫(Landroid/media/browse/MediaBrowser$MediaItem;)Landroid/media/MediaDescription;

    move-result-object v1

    invoke-static {v1}, Ll/ܰ;->֫(Ljava/lang/Object;)Ll/ܰ;

    move-result-object v1

    .line 514
    new-instance v3, Ll/ܶ;

    invoke-direct {v3, v1, v2}, Ll/ܶ;-><init>(Ll/ܰ;I)V

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    .line 533
    :goto_1
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 577
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MediaItem{mFlags="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 578
    iget v1, p0, Ll/ܶ;->᩹:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDescription="

    .line 579
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܶ;->᩸:Ll/ܰ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    .line 580
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 581
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 570
    iget v0, p0, Ll/ܶ;->᩹:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 571
    iget-object v0, p0, Ll/ܶ;->᩸:Ll/ܰ;

    invoke-virtual {v0, p1, p2}, Ll/ܰ;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
