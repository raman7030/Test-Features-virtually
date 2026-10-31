.class public final Ll/᩵ۧ;
.super Ljava/lang/Object;
.source "E5FU"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public final ۗ:I

.field public ۙ:Ljava/util/ArrayList;

.field public final ۛ:F

.field public final ۤ:J

.field public final ۨ:I

.field public final ۫:Landroid/os/Bundle;

.field public final ۬:Ljava/lang/CharSequence;

.field public final ܰ:J

.field public final ᩶:J

.field public final ᩸:J

.field public final ᩹:J

.field public ᩺:Landroid/media/session/PlaybackState;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 868
    new-instance v0, Ll/ۢۧ;

    .line 869
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 868
    sput-object v0, Ll/᩵ۧ;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IJJFJILjava/lang/CharSequence;JLjava/util/ArrayList;JLandroid/os/Bundle;)V
    .locals 3

    move-object v0, p0

    .line 561
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move v1, p1

    .line 562
    iput v1, v0, Ll/᩵ۧ;->ۨ:I

    move-wide v1, p2

    .line 563
    iput-wide v1, v0, Ll/᩵ۧ;->ۤ:J

    move-wide v1, p4

    .line 564
    iput-wide v1, v0, Ll/᩵ۧ;->᩶:J

    move v1, p6

    .line 565
    iput v1, v0, Ll/᩵ۧ;->ۛ:F

    move-wide v1, p7

    .line 566
    iput-wide v1, v0, Ll/᩵ۧ;->᩸:J

    move v1, p9

    .line 567
    iput v1, v0, Ll/᩵ۧ;->ۗ:I

    move-object v1, p10

    .line 568
    iput-object v1, v0, Ll/᩵ۧ;->۬:Ljava/lang/CharSequence;

    move-wide v1, p11

    .line 569
    iput-wide v1, v0, Ll/᩵ۧ;->ܰ:J

    .line 570
    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 v2, p13

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, v0, Ll/᩵ۧ;->ۙ:Ljava/util/ArrayList;

    move-wide/from16 v1, p14

    .line 571
    iput-wide v1, v0, Ll/᩵ۧ;->᩹:J

    move-object/from16 v1, p16

    .line 572
    iput-object v1, v0, Ll/᩵ۧ;->۫:Landroid/os/Bundle;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 575
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 576
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Ll/᩵ۧ;->ۨ:I

    .line 577
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩵ۧ;->ۤ:J

    .line 578
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Ll/᩵ۧ;->ۛ:F

    .line 579
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩵ۧ;->ܰ:J

    .line 580
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩵ۧ;->᩶:J

    .line 581
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩵ۧ;->᩸:J

    .line 582
    sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    iput-object v0, p0, Ll/᩵ۧ;->۬:Ljava/lang/CharSequence;

    .line 583
    sget-object v0, Ll/ᩴۧ;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Ll/᩵ۧ;->ۙ:Ljava/util/ArrayList;

    .line 584
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩵ۧ;->᩹:J

    .line 585
    const-class v0, Ll/᩻ۧ;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Ll/᩵ۧ;->۫:Landroid/os/Bundle;

    .line 587
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Ll/᩵ۧ;->ۗ:I

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 592
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PlaybackState {state="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 593
    iget v1, p0, Ll/᩵ۧ;->ۨ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", position="

    .line 594
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/᩵ۧ;->ۤ:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", buffered position="

    .line 595
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/᩵ۧ;->᩶:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", speed="

    .line 596
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩵ۧ;->ۛ:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", updated="

    .line 597
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/᩵ۧ;->ܰ:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", actions="

    .line 598
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/᩵ۧ;->᩸:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", error code="

    .line 599
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩵ۧ;->ۗ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", error message="

    .line 600
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩵ۧ;->۬:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const-string v1, ", custom actions="

    .line 601
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩵ۧ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", active item id="

    .line 602
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/᩵ۧ;->᩹:J

    const-string v3, "}"

    .line 0
    invoke-static {v0, v1, v2, v3}, Ll/ܺ۫᩷;->֫(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 614
    iget v0, p0, Ll/᩵ۧ;->ۨ:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 615
    iget-wide v0, p0, Ll/᩵ۧ;->ۤ:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 616
    iget v0, p0, Ll/᩵ۧ;->ۛ:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 617
    iget-wide v0, p0, Ll/᩵ۧ;->ܰ:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 618
    iget-wide v0, p0, Ll/᩵ۧ;->᩶:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 619
    iget-wide v0, p0, Ll/᩵ۧ;->᩸:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 620
    iget-object v0, p0, Ll/᩵ۧ;->۬:Ljava/lang/CharSequence;

    invoke-static {v0, p1, p2}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    .line 621
    iget-object p2, p0, Ll/᩵ۧ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 622
    iget-wide v0, p0, Ll/᩵ۧ;->᩹:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 623
    iget-object p2, p0, Ll/᩵ۧ;->۫:Landroid/os/Bundle;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 625
    iget p2, p0, Ll/᩵ۧ;->ۗ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

.method public final ֫()Landroid/media/session/PlaybackState;
    .locals 8

    .line 849
    iget-object v0, p0, Ll/᩵ۧ;->᩺:Landroid/media/session/PlaybackState;

    if-nez v0, :cond_2

    .line 850
    invoke-static {}, Ll/ۡۧ;->֫()Landroid/media/session/PlaybackState$Builder;

    move-result-object v0

    .line 851
    iget v5, p0, Ll/᩵ۧ;->ۛ:F

    iget-wide v6, p0, Ll/᩵ۧ;->ܰ:J

    iget v2, p0, Ll/᩵ۧ;->ۨ:I

    iget-wide v3, p0, Ll/᩵ۧ;->ۤ:J

    move-object v1, v0

    invoke-static/range {v1 .. v7}, Ll/ۡۧ;->֫(Landroid/media/session/PlaybackState$Builder;IJFJ)V

    .line 852
    iget-wide v1, p0, Ll/᩵ۧ;->᩶:J

    invoke-static {v0, v1, v2}, Ll/ۡۧ;->ܽ(Landroid/media/session/PlaybackState$Builder;J)V

    .line 853
    iget-wide v1, p0, Ll/᩵ۧ;->᩸:J

    invoke-static {v0, v1, v2}, Ll/ۡۧ;->֫(Landroid/media/session/PlaybackState$Builder;J)V

    .line 854
    iget-object v1, p0, Ll/᩵ۧ;->۬:Ljava/lang/CharSequence;

    invoke-static {v0, v1}, Ll/ۡۧ;->֫(Landroid/media/session/PlaybackState$Builder;Ljava/lang/CharSequence;)V

    .line 855
    iget-object v1, p0, Ll/᩵ۧ;->ۙ:Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩴۧ;

    .line 857
    invoke-virtual {v2}, Ll/ᩴۧ;->֫()Landroid/media/session/PlaybackState$CustomAction;

    move-result-object v2

    .line 856
    invoke-static {v0, v2}, Ll/ۡۧ;->֫(Landroid/media/session/PlaybackState$Builder;Landroid/media/session/PlaybackState$CustomAction;)V

    goto :goto_0

    .line 859
    :cond_0
    iget-wide v1, p0, Ll/᩵ۧ;->᩹:J

    invoke-static {v0, v1, v2}, Ll/ۡۧ;->ۧ(Landroid/media/session/PlaybackState$Builder;J)V

    .line 860
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x16

    if-lt v1, v2, :cond_1

    .line 861
    iget-object v1, p0, Ll/᩵ۧ;->۫:Landroid/os/Bundle;

    invoke-static {v0, v1}, Ll/ܺۧ;->֫(Landroid/media/session/PlaybackState$Builder;Landroid/os/Bundle;)V

    .line 863
    :cond_1
    invoke-static {v0}, Ll/ۡۧ;->֫(Landroid/media/session/PlaybackState$Builder;)Landroid/media/session/PlaybackState;

    move-result-object v0

    iput-object v0, p0, Ll/᩵ۧ;->᩺:Landroid/media/session/PlaybackState;

    .line 865
    :cond_2
    iget-object v0, p0, Ll/᩵ۧ;->᩺:Landroid/media/session/PlaybackState;

    return-object v0
.end method
