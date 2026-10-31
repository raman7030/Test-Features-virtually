.class public final Ll/ܰ;
.super Ljava/lang/Object;
.source "J622"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public final ۗ:Landroid/net/Uri;

.field public final ۙ:Landroid/graphics/Bitmap;

.field public final ۛ:Ljava/lang/CharSequence;

.field public final ۤ:Ljava/lang/CharSequence;

.field public final ۫:Landroid/net/Uri;

.field public final ۬:Ljava/lang/String;

.field public final ᩶:Landroid/os/Bundle;

.field public final ᩸:Ljava/lang/CharSequence;

.field public ᩹:Landroid/media/MediaDescription;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 432
    new-instance v0, Ll/ۤ;

    .line 433
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 432
    sput-object v0, Ll/ܰ;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/os/Bundle;Landroid/net/Uri;)V
    .locals 0

    .line 195
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 196
    iput-object p1, p0, Ll/ܰ;->۬:Ljava/lang/String;

    .line 197
    iput-object p2, p0, Ll/ܰ;->ۛ:Ljava/lang/CharSequence;

    .line 198
    iput-object p3, p0, Ll/ܰ;->ۤ:Ljava/lang/CharSequence;

    .line 199
    iput-object p4, p0, Ll/ܰ;->᩸:Ljava/lang/CharSequence;

    .line 200
    iput-object p5, p0, Ll/ܰ;->ۙ:Landroid/graphics/Bitmap;

    .line 201
    iput-object p6, p0, Ll/ܰ;->ۗ:Landroid/net/Uri;

    .line 202
    iput-object p7, p0, Ll/ܰ;->᩶:Landroid/os/Bundle;

    .line 203
    iput-object p8, p0, Ll/ܰ;->۫:Landroid/net/Uri;

    return-void
.end method

.method public static ֫(Ljava/lang/Object;)Ll/ܰ;
    .locals 9

    const/4 v0, 0x0

    if-eqz p0, :cond_6

    .line 386
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 387
    new-instance v2, Ll/᩺;

    .line 465
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 388
    check-cast p0, Landroid/media/MediaDescription;

    .line 389
    invoke-static {p0}, Ll/ۛ;->ܿ(Landroid/media/MediaDescription;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/᩺;->֫(Ljava/lang/String;)V

    .line 390
    invoke-static {p0}, Ll/ۛ;->᩻(Landroid/media/MediaDescription;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/᩺;->ܽ(Ljava/lang/CharSequence;)V

    .line 391
    invoke-static {p0}, Ll/ۛ;->ܳ(Landroid/media/MediaDescription;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/᩺;->ۧ(Ljava/lang/CharSequence;)V

    .line 392
    invoke-static {p0}, Ll/ۛ;->֫(Landroid/media/MediaDescription;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/᩺;->֫(Ljava/lang/CharSequence;)V

    .line 393
    invoke-static {p0}, Ll/ۛ;->ܽ(Landroid/media/MediaDescription;)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/᩺;->֫(Landroid/graphics/Bitmap;)V

    .line 394
    invoke-static {p0}, Ll/ۛ;->ᩳ(Landroid/media/MediaDescription;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/᩺;->֫(Landroid/net/Uri;)V

    .line 395
    invoke-static {p0}, Ll/ۛ;->ۧ(Landroid/media/MediaDescription;)Landroid/os/Bundle;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 1056
    invoke-static {v3}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    .line 1058
    :try_start_0
    invoke-virtual {v3}, Landroid/os/BaseBundle;->isEmpty()Z
    :try_end_0
    .catch Landroid/os/BadParcelableException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v3, v0

    :cond_0
    :goto_0
    const-string v4, "android.support.v4.media.description.MEDIA_URI"

    if-eqz v3, :cond_1

    .line 401
    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, Landroid/net/Uri;

    goto :goto_1

    :cond_1
    move-object v5, v0

    :goto_1
    if-eqz v5, :cond_3

    const-string v6, "android.support.v4.media.description.NULL_BUNDLE_FLAG"

    .line 404
    invoke-virtual {v3, v6}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {v3}, Landroid/os/BaseBundle;->size()I

    move-result v7

    const/4 v8, 0x2

    if-ne v7, v8, :cond_2

    goto :goto_2

    .line 413
    :cond_2
    invoke-virtual {v3, v4}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 414
    invoke-virtual {v3, v6}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    :cond_3
    move-object v0, v3

    .line 417
    :goto_2
    invoke-virtual {v2, v0}, Ll/᩺;->֫(Landroid/os/Bundle;)V

    if-eqz v5, :cond_4

    .line 419
    invoke-virtual {v2, v5}, Ll/᩺;->ۧ(Landroid/net/Uri;)V

    goto :goto_3

    :cond_4
    const/16 v0, 0x17

    if-lt v1, v0, :cond_5

    .line 421
    invoke-static {p0}, Ll/ۨ;->֫(Landroid/media/MediaDescription;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v2, v0}, Ll/᩺;->ۧ(Landroid/net/Uri;)V

    .line 423
    :cond_5
    :goto_3
    invoke-virtual {v2}, Ll/᩺;->֫()Ll/ܰ;

    move-result-object v0

    .line 424
    iput-object p0, v0, Ll/ܰ;->᩹:Landroid/media/MediaDescription;

    :cond_6
    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 322
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܰ;->ۛ:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ܰ;->ۤ:Ljava/lang/CharSequence;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܰ;->᩸:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 7

    .line 306
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 337
    iget-object v1, p0, Ll/ܰ;->᩹:Landroid/media/MediaDescription;

    if-nez v1, :cond_3

    .line 340
    invoke-static {}, Ll/ۛ;->֫()Landroid/media/MediaDescription$Builder;

    move-result-object v1

    .line 341
    iget-object v2, p0, Ll/ܰ;->۬:Ljava/lang/String;

    invoke-static {v1, v2}, Ll/ۛ;->֫(Landroid/media/MediaDescription$Builder;Ljava/lang/String;)V

    .line 342
    iget-object v2, p0, Ll/ܰ;->ۛ:Ljava/lang/CharSequence;

    invoke-static {v1, v2}, Ll/ۛ;->ܽ(Landroid/media/MediaDescription$Builder;Ljava/lang/CharSequence;)V

    .line 343
    iget-object v2, p0, Ll/ܰ;->ۤ:Ljava/lang/CharSequence;

    invoke-static {v1, v2}, Ll/ۛ;->ۧ(Landroid/media/MediaDescription$Builder;Ljava/lang/CharSequence;)V

    .line 344
    iget-object v2, p0, Ll/ܰ;->᩸:Ljava/lang/CharSequence;

    invoke-static {v1, v2}, Ll/ۛ;->֫(Landroid/media/MediaDescription$Builder;Ljava/lang/CharSequence;)V

    .line 345
    iget-object v2, p0, Ll/ܰ;->ۙ:Landroid/graphics/Bitmap;

    invoke-static {v1, v2}, Ll/ۛ;->֫(Landroid/media/MediaDescription$Builder;Landroid/graphics/Bitmap;)V

    .line 346
    iget-object v2, p0, Ll/ܰ;->ۗ:Landroid/net/Uri;

    invoke-static {v1, v2}, Ll/ۛ;->֫(Landroid/media/MediaDescription$Builder;Landroid/net/Uri;)V

    const/16 v2, 0x17

    .line 351
    iget-object v3, p0, Ll/ܰ;->᩶:Landroid/os/Bundle;

    iget-object v4, p0, Ll/ܰ;->۫:Landroid/net/Uri;

    if-ge v0, v2, :cond_1

    if-eqz v4, :cond_1

    if-nez v3, :cond_0

    .line 354
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v5, "android.support.v4.media.description.NULL_BUNDLE_FLAG"

    const/4 v6, 0x1

    .line 355
    invoke-virtual {v3, v5, v6}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_0

    .line 357
    :cond_0
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5, v3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    move-object v3, v5

    :goto_0
    const-string v5, "android.support.v4.media.description.MEDIA_URI"

    .line 359
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 360
    invoke-static {v1, v3}, Ll/ۛ;->֫(Landroid/media/MediaDescription$Builder;Landroid/os/Bundle;)V

    goto :goto_1

    .line 362
    :cond_1
    invoke-static {v1, v3}, Ll/ۛ;->֫(Landroid/media/MediaDescription$Builder;Landroid/os/Bundle;)V

    :goto_1
    if-lt v0, v2, :cond_2

    .line 365
    invoke-static {v1, v4}, Ll/ۨ;->֫(Landroid/media/MediaDescription$Builder;Landroid/net/Uri;)V

    .line 367
    :cond_2
    invoke-static {v1}, Ll/ۛ;->֫(Landroid/media/MediaDescription$Builder;)Landroid/media/MediaDescription;

    move-result-object v1

    iput-object v1, p0, Ll/ܰ;->᩹:Landroid/media/MediaDescription;

    .line 316
    :cond_3
    invoke-virtual {v1, p1, p2}, Landroid/media/MediaDescription;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 226
    iget-object v0, p0, Ll/ܰ;->۬:Ljava/lang/String;

    return-object v0
.end method
