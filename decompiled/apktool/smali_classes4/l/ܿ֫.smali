.class public final Ll/ܿ֫;
.super Ljava/lang/Object;
.source "757I"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public final ᩸:I

.field public final ᩹:F


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 131
    new-instance v0, Ll/ܽ֫;

    .line 132
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 131
    sput-object v0, Ll/ܿ֫;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(FI)V
    .locals 0

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    iput p2, p0, Ll/ܿ֫;->᩸:I

    .line 111
    iput p1, p0, Ll/ܿ֫;->᩹:F

    return-void
.end method

.method public static ֫(Landroid/media/Rating;)Ll/ܿ֫;
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_9

    .line 334
    invoke-static {p0}, Ll/ᩳ֫;->ۧ(Landroid/media/Rating;)I

    move-result v1

    .line 336
    invoke-static {p0}, Ll/ᩳ֫;->ܿ(Landroid/media/Rating;)Z

    move-result v2

    if-eqz v2, :cond_7

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_4

    .line 352
    :pswitch_0
    invoke-static {p0}, Ll/ᩳ֫;->֫(Landroid/media/Rating;)F

    move-result p0

    cmpg-float v1, p0, v3

    if-ltz v1, :cond_8

    const/high16 v1, 0x42c80000    # 100.0f

    cmpl-float v1, p0, v1

    if-lez v1, :cond_0

    goto :goto_3

    .line 242
    :cond_0
    new-instance v0, Ll/ܿ֫;

    const/4 v1, 0x6

    invoke-direct {v0, p0, v1}, Ll/ܿ֫;-><init>(FI)V

    goto :goto_3

    .line 348
    :pswitch_1
    invoke-static {p0}, Ll/ᩳ֫;->ܽ(Landroid/media/Rating;)F

    move-result p0

    const/4 v2, 0x3

    if-eq v1, v2, :cond_3

    const/4 v2, 0x4

    if-eq v1, v2, :cond_2

    const/4 v2, 0x5

    if-eq v1, v2, :cond_1

    goto :goto_3

    :cond_1
    const/high16 v2, 0x40a00000    # 5.0f

    goto :goto_0

    :cond_2
    const/high16 v2, 0x40800000    # 4.0f

    goto :goto_0

    :cond_3
    const/high16 v2, 0x40400000    # 3.0f

    :goto_0
    cmpg-float v3, p0, v3

    if-ltz v3, :cond_8

    cmpl-float v2, p0, v2

    if-lez v2, :cond_4

    goto :goto_3

    .line 227
    :cond_4
    new-instance v0, Ll/ܿ֫;

    invoke-direct {v0, p0, v1}, Ll/ܿ֫;-><init>(FI)V

    goto :goto_3

    .line 342
    :pswitch_2
    invoke-static {p0}, Ll/ᩳ֫;->ܳ(Landroid/media/Rating;)Z

    move-result p0

    .line 191
    new-instance v0, Ll/ܿ֫;

    if-eqz p0, :cond_5

    goto :goto_1

    :cond_5
    const/4 v2, 0x0

    :goto_1
    const/4 p0, 0x2

    invoke-direct {v0, v2, p0}, Ll/ܿ֫;-><init>(FI)V

    goto :goto_3

    .line 339
    :pswitch_3
    invoke-static {p0}, Ll/ᩳ֫;->ᩳ(Landroid/media/Rating;)Z

    move-result p0

    .line 180
    new-instance v0, Ll/ܿ֫;

    if-eqz p0, :cond_6

    goto :goto_2

    :cond_6
    const/4 v2, 0x0

    :goto_2
    const/4 p0, 0x1

    invoke-direct {v0, v2, p0}, Ll/ܿ֫;-><init>(FI)V

    goto :goto_3

    :cond_7
    packed-switch v1, :pswitch_data_1

    goto :goto_3

    .line 166
    :pswitch_4
    new-instance p0, Ll/ܿ֫;

    const/high16 v0, -0x40800000    # -1.0f

    invoke-direct {p0, v0, v1}, Ll/ܿ֫;-><init>(FI)V

    move-object v0, p0

    .line 360
    :cond_8
    :goto_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_9
    :goto_4
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    .line 122
    iget v0, p0, Ll/ܿ֫;->᩸:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 116
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Rating:style="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ܿ֫;->᩸:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " rating="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    .line 117
    iget v2, p0, Ll/ܿ֫;->᩹:F

    cmpg-float v1, v2, v1

    if-gez v1, :cond_0

    const-string v1, "unrated"

    goto :goto_0

    :cond_0
    invoke-static {v2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 127
    iget p2, p0, Ll/ܿ֫;->᩸:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 128
    iget p2, p0, Ll/ܿ֫;->᩹:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    return-void
.end method
