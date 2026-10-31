.class public final Ll/ۧ֫;
.super Ljava/lang/Object;
.source "N5RR"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;

.field public static final ᩶:Ll/ۖ᩵;


# instance fields
.field public final ᩸:Landroid/os/Bundle;

.field public ᩹:Landroid/media/MediaMetadata;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 300
    new-instance v0, Ll/ۖ᩵;

    invoke-direct {v0}, Ll/ۖ᩵;-><init>()V

    sput-object v0, Ll/ۧ֫;->᩶:Ll/ۖ᩵;

    const/4 v1, 0x1

    .line 301
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "android.media.metadata.TITLE"

    invoke-virtual {v0, v2, v1}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "android.media.metadata.ARTIST"

    .line 302
    invoke-virtual {v0, v2, v1}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x0

    .line 303
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "android.media.metadata.DURATION"

    invoke-virtual {v0, v3, v2}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "android.media.metadata.ALBUM"

    .line 304
    invoke-virtual {v0, v3, v1}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "android.media.metadata.AUTHOR"

    .line 305
    invoke-virtual {v0, v3, v1}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "android.media.metadata.WRITER"

    .line 306
    invoke-virtual {v0, v3, v1}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "android.media.metadata.COMPOSER"

    .line 307
    invoke-virtual {v0, v3, v1}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "android.media.metadata.COMPILATION"

    .line 308
    invoke-virtual {v0, v3, v1}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "android.media.metadata.DATE"

    .line 309
    invoke-virtual {v0, v3, v1}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "android.media.metadata.YEAR"

    .line 310
    invoke-virtual {v0, v3, v2}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "android.media.metadata.GENRE"

    .line 311
    invoke-virtual {v0, v3, v1}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "android.media.metadata.TRACK_NUMBER"

    .line 312
    invoke-virtual {v0, v3, v2}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "android.media.metadata.NUM_TRACKS"

    .line 313
    invoke-virtual {v0, v3, v2}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "android.media.metadata.DISC_NUMBER"

    .line 314
    invoke-virtual {v0, v3, v2}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "android.media.metadata.ALBUM_ARTIST"

    .line 315
    invoke-virtual {v0, v3, v1}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x2

    .line 316
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "android.media.metadata.ART"

    invoke-virtual {v0, v4, v3}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "android.media.metadata.ART_URI"

    .line 317
    invoke-virtual {v0, v4, v1}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "android.media.metadata.ALBUM_ART"

    .line 318
    invoke-virtual {v0, v4, v3}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "android.media.metadata.ALBUM_ART_URI"

    .line 319
    invoke-virtual {v0, v4, v1}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v4, 0x3

    .line 320
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "android.media.metadata.USER_RATING"

    invoke-virtual {v0, v5, v4}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "android.media.metadata.RATING"

    .line 321
    invoke-virtual {v0, v5, v4}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "android.media.metadata.DISPLAY_TITLE"

    .line 322
    invoke-virtual {v0, v4, v1}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "android.media.metadata.DISPLAY_SUBTITLE"

    .line 323
    invoke-virtual {v0, v4, v1}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "android.media.metadata.DISPLAY_DESCRIPTION"

    .line 324
    invoke-virtual {v0, v4, v1}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "android.media.metadata.DISPLAY_ICON"

    .line 325
    invoke-virtual {v0, v4, v3}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "android.media.metadata.DISPLAY_ICON_URI"

    .line 326
    invoke-virtual {v0, v3, v1}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "android.media.metadata.MEDIA_ID"

    .line 327
    invoke-virtual {v0, v3, v1}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "android.media.metadata.BT_FOLDER_TYPE"

    .line 328
    invoke-virtual {v0, v3, v2}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "android.media.metadata.MEDIA_URI"

    .line 329
    invoke-virtual {v0, v3, v1}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "android.media.metadata.ADVERTISEMENT"

    .line 330
    invoke-virtual {v0, v1, v2}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "android.media.metadata.DOWNLOAD_STATUS"

    .line 331
    invoke-virtual {v0, v1, v2}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 668
    new-instance v0, Ll/۟;

    .line 669
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 668
    sput-object v0, Ll/ۧ֫;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 1

    .line 360
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 361
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    iput-object v0, p0, Ll/ۧ֫;->᩸:Landroid/os/Bundle;

    .line 362
    invoke-static {v0}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 365
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 366
    const-class v0, Ll/᩻ۧ;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, p0, Ll/ۧ֫;->᩸:Landroid/os/Bundle;

    return-void
.end method

.method public static ֫(Landroid/media/MediaMetadata;)V
    .locals 2

    if-eqz p0, :cond_0

    .line 602
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    const/4 v1, 0x0

    .line 603
    invoke-virtual {p0, v0, v1}, Landroid/media/MediaMetadata;->writeToParcel(Landroid/os/Parcel;I)V

    .line 604
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 605
    sget-object v1, Ll/ۧ֫;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧ֫;

    .line 606
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 607
    iput-object p0, v1, Ll/ۧ֫;->᩹:Landroid/media/MediaMetadata;

    :cond_0
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

    .line 556
    iget-object p2, p0, Ll/ۧ֫;->᩸:Landroid/os/Bundle;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    return-void
.end method

.method public final ֫()Z
    .locals 2

    const-string v0, "android.media.metadata.DURATION"

    .line 376
    iget-object v1, p0, Ll/ۧ֫;->᩸:Landroid/os/Bundle;

    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final ۧ()J
    .locals 4

    .line 415
    iget-object v0, p0, Ll/ۧ֫;->᩸:Landroid/os/Bundle;

    const-wide/16 v1, 0x0

    const-string v3, "android.media.metadata.DURATION"

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ܽ()Landroid/media/MediaMetadata;
    .locals 6

    .line 626
    iget-object v0, p0, Ll/ۧ֫;->᩹:Landroid/media/MediaMetadata;

    if-nez v0, :cond_b

    .line 627
    new-instance v0, Landroid/media/MediaMetadata$Builder;

    invoke-direct {v0}, Landroid/media/MediaMetadata$Builder;-><init>()V

    .line 628
    iget-object v1, p0, Ll/ۧ֫;->᩸:Landroid/os/Bundle;

    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 629
    sget-object v4, Ll/ۧ֫;->᩶:Ll/ۖ᩵;

    const/4 v5, 0x0

    .line 369
    invoke-virtual {v4, v3, v5}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 629
    check-cast v4, Ljava/lang/Integer;

    if-nez v4, :cond_1

    const/4 v4, -0x1

    .line 631
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 633
    :cond_1
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-eqz v4, :cond_9

    const/4 v5, 0x1

    if-eq v4, v5, :cond_8

    const/4 v5, 0x2

    if-eq v4, v5, :cond_7

    const/4 v5, 0x3

    if-eq v4, v5, :cond_6

    .line 648
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_5

    .line 649
    instance-of v5, v4, Ljava/lang/CharSequence;

    if-eqz v5, :cond_2

    goto :goto_1

    .line 651
    :cond_2
    instance-of v5, v4, Ljava/lang/Long;

    if-eqz v5, :cond_3

    .line 652
    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v0, v3, v4, v5}, Landroid/media/MediaMetadata$Builder;->putLong(Ljava/lang/String;J)Landroid/media/MediaMetadata$Builder;

    goto :goto_0

    .line 653
    :cond_3
    instance-of v5, v4, Landroid/graphics/Bitmap;

    if-eqz v5, :cond_4

    .line 654
    check-cast v4, Landroid/graphics/Bitmap;

    invoke-virtual {v0, v3, v4}, Landroid/media/MediaMetadata$Builder;->putBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/media/MediaMetadata$Builder;

    goto :goto_0

    .line 655
    :cond_4
    instance-of v5, v4, Landroid/media/Rating;

    if-eqz v5, :cond_0

    .line 656
    check-cast v4, Landroid/media/Rating;

    invoke-virtual {v0, v3, v4}, Landroid/media/MediaMetadata$Builder;->putRating(Ljava/lang/String;Landroid/media/Rating;)Landroid/media/MediaMetadata$Builder;

    goto :goto_0

    .line 650
    :cond_5
    :goto_1
    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v0, v3, v4}, Landroid/media/MediaMetadata$Builder;->putText(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/media/MediaMetadata$Builder;

    goto :goto_0

    .line 644
    :cond_6
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Landroid/media/Rating;

    invoke-virtual {v0, v3, v4}, Landroid/media/MediaMetadata$Builder;->putRating(Ljava/lang/String;Landroid/media/Rating;)Landroid/media/MediaMetadata$Builder;

    goto :goto_0

    .line 641
    :cond_7
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Landroid/graphics/Bitmap;

    invoke-virtual {v0, v3, v4}, Landroid/media/MediaMetadata$Builder;->putBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/media/MediaMetadata$Builder;

    goto :goto_0

    .line 635
    :cond_8
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Landroid/media/MediaMetadata$Builder;->putText(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/media/MediaMetadata$Builder;

    goto :goto_0

    :cond_9
    const-wide/16 v4, 0x0

    .line 638
    invoke-virtual {v1, v3, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    invoke-virtual {v0, v3, v4, v5}, Landroid/media/MediaMetadata$Builder;->putLong(Ljava/lang/String;J)Landroid/media/MediaMetadata$Builder;

    goto/16 :goto_0

    .line 663
    :cond_a
    invoke-virtual {v0}, Landroid/media/MediaMetadata$Builder;->build()Landroid/media/MediaMetadata;

    move-result-object v0

    iput-object v0, p0, Ll/ۧ֫;->᩹:Landroid/media/MediaMetadata;

    .line 665
    :cond_b
    iget-object v0, p0, Ll/ۧ֫;->᩹:Landroid/media/MediaMetadata;

    return-object v0
.end method
