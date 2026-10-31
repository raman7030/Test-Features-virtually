.class public final Ll/ۧۧ;
.super Ljava/lang/Object;
.source "U6BF"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public final ᩸:Ll/ܰ;

.field public final ᩹:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 2266
    new-instance v0, Ll/۟֫;

    .line 2267
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2266
    sput-object v0, Ll/ۧۧ;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 2173
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2174
    sget-object v0, Ll/ܰ;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܰ;

    iput-object v0, p0, Ll/ۧۧ;->᩸:Ll/ܰ;

    .line 2175
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۧۧ;->᩹:J

    return-void
.end method

.method public constructor <init>(Ll/ܰ;J)V
    .locals 3

    .line 2161
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    const-wide/16 v0, -0x1

    cmp-long v2, p2, v0

    if-eqz v2, :cond_0

    .line 2168
    iput-object p1, p0, Ll/ۧۧ;->᩸:Ll/ܰ;

    .line 2169
    iput-wide p2, p0, Ll/ۧۧ;->᩹:J

    return-void

    .line 2166
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Id cannot be QueueItem.UNKNOWN_ID"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 2163
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Description cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ljava/util/List;)V
    .locals 5

    if-eqz p0, :cond_1

    .line 2259
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 2260
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2237
    check-cast v1, Landroid/media/session/MediaSession$QueueItem;

    .line 2238
    invoke-static {v1}, Ll/֫ۧ;->֫(Landroid/media/session/MediaSession$QueueItem;)Landroid/media/MediaDescription;

    move-result-object v2

    .line 2239
    invoke-static {v2}, Ll/ܰ;->֫(Ljava/lang/Object;)Ll/ܰ;

    move-result-object v2

    .line 2241
    invoke-static {v1}, Ll/֫ۧ;->ۧ(Landroid/media/session/MediaSession$QueueItem;)J

    move-result-wide v3

    .line 2242
    new-instance v1, Ll/ۧۧ;

    invoke-direct {v1, v2, v3, v4}, Ll/ۧۧ;-><init>(Ll/ܰ;J)V

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 2261
    :goto_1
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

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
    .locals 4

    .line 2282
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MediaSession.QueueItem {Description="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۧۧ;->᩸:Ll/ܰ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", Id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/ۧۧ;->᩹:J

    const-string v3, " }"

    .line 0
    invoke-static {v0, v1, v2, v3}, Ll/ܺ۫᩷;->֫(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 2194
    iget-object v0, p0, Ll/ۧۧ;->᩸:Ll/ܰ;

    invoke-virtual {v0, p1, p2}, Ll/ܰ;->writeToParcel(Landroid/os/Parcel;I)V

    .line 2195
    iget-wide v0, p0, Ll/ۧۧ;->᩹:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    return-void
.end method
