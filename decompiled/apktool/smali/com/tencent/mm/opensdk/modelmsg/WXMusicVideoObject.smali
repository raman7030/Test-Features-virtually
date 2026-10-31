.class public Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;


# static fields
.field public static final HD_ALBUM_FILE_LENGTH:I = 0xa00000

.field public static final LYRIC_LENGTH_LIMIT:I = 0x8000

.field public static final STRING_LIMIT:I = 0x400

.field public static final TAG:Ljava/lang/String; = "MicroMsg.SDK.WXMusicVideoObject"

.field public static final URL_LENGTH_LIMIT:I = 0x2800


# instance fields
.field public albumName:Ljava/lang/String;

.field public duration:I

.field public hdAlbumThumbFileHash:Ljava/lang/String;

.field public hdAlbumThumbFilePath:Ljava/lang/String;

.field public identification:Ljava/lang/String;

.field public issueDate:J

.field public musicDataUrl:Ljava/lang/String;

.field public musicGenre:Ljava/lang/String;

.field public musicOperationUrl:Ljava/lang/String;

.field public musicUrl:Ljava/lang/String;

.field public musicVipInfo:Lcom/tencent/mm/opensdk/modelmsg/WXMusicVipInfo;

.field public singerName:Ljava/lang/String;

.field public songLyric:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private getFileSize(Ljava/lang/String;)I
    .locals 0

    .line 0
    invoke-static {p1}, Lcom/tencent/mm/opensdk/utils/d;->getFileSize(Ljava/lang/String;)I

    move-result p1

    return p1
.end method


# virtual methods
.method public checkArgs()Z
    .locals 6

    .line 0
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->musicUrl:Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/mm/opensdk/utils/d;->b(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "MicroMsg.SDK.WXMusicVideoObject"

    if-nez v0, :cond_b

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->musicUrl:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v3, 0x2800

    if-le v0, v3, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->musicDataUrl:Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/mm/opensdk/utils/d;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_a

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->musicDataUrl:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v3, :cond_1

    goto/16 :goto_1

    :cond_1
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->singerName:Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/mm/opensdk/utils/d;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->singerName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v4, 0x400

    if-le v0, v4, :cond_2

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->songLyric:Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/mm/opensdk/utils/d;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->songLyric:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const v5, 0x8000

    if-le v0, v5, :cond_3

    const-string v0, "songLyric.length exceeds the limit"

    goto/16 :goto_3

    :cond_3
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->hdAlbumThumbFilePath:Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/mm/opensdk/utils/d;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->hdAlbumThumbFilePath:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v4, :cond_4

    const-string v0, "hdAlbumThumbFilePath.length exceeds the limit"

    goto :goto_3

    :cond_4
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->hdAlbumThumbFilePath:Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/mm/opensdk/utils/d;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->hdAlbumThumbFilePath:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->getFileSize(Ljava/lang/String;)I

    move-result v0

    const/high16 v5, 0xa00000

    if-le v0, v5, :cond_5

    const-string v0, "hdAlbumThumbFilePath file length exceeds the limit"

    goto :goto_3

    :cond_5
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->musicGenre:Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/mm/opensdk/utils/d;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->musicGenre:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v4, :cond_6

    const-string v0, "musicGenre.length exceeds the limit"

    goto :goto_3

    :cond_6
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->identification:Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/mm/opensdk/utils/d;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->identification:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v4, :cond_7

    const-string v0, "identification.length exceeds the limit"

    goto :goto_3

    :cond_7
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->musicOperationUrl:Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/mm/opensdk/utils/d;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->musicOperationUrl:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v3, :cond_8

    const-string v0, "musicOperationUrl.length exceeds the limit"

    goto :goto_3

    :cond_8
    const/4 v0, 0x1

    return v0

    :cond_9
    :goto_0
    const-string v0, "singerName.length exceeds the limit"

    goto :goto_3

    :cond_a
    :goto_1
    const-string v0, "musicDataUrl.length exceeds the limit"

    goto :goto_3

    :cond_b
    :goto_2
    const-string v0, "musicUrl.length exceeds the limit"

    :goto_3
    invoke-static {v2, v0}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v1
.end method

.method public serialize(Landroid/os/Bundle;)V
    .locals 3

    const-string v0, "_wxmusicvideoobject_musicUrl"

    .line 0
    iget-object v1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->musicUrl:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "_wxmusicvideoobject_musicDataUrl"

    iget-object v1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->musicDataUrl:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "_wxmusicvideoobject_singerName"

    iget-object v1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->singerName:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "_wxmusicvideoobject_songLyric"

    iget-object v1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->songLyric:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "_wxmusicvideoobject_hdAlbumThumbFilePath"

    iget-object v1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->hdAlbumThumbFilePath:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "_wxmusicvideoobject_albumName"

    iget-object v1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->albumName:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "_wxmusicvideoobject_musicGenre"

    iget-object v1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->musicGenre:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "_wxmusicvideoobject_issueDate"

    iget-wide v1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->issueDate:J

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "_wxmusicvideoobject_identification"

    iget-object v1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->identification:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "_wxmusicvideoobject_duration"

    iget v1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->duration:I

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "_wxmusicvideoobject_musicOperationUrl"

    iget-object v1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->musicOperationUrl:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->musicVipInfo:Lcom/tencent/mm/opensdk/modelmsg/WXMusicVipInfo;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "_wxmusicvideoobject_musicVipInfo"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->musicVipInfo:Lcom/tencent/mm/opensdk/modelmsg/WXMusicVipInfo;

    invoke-virtual {v0, p1}, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVipInfo;->serialize(Landroid/os/Bundle;)V

    :cond_0
    const-string v0, "_wxmusicvideoobject_hdAlbumThumbFileHash"

    iget-object v1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->hdAlbumThumbFileHash:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public type()I
    .locals 1

    const/16 v0, 0x4c

    return v0
.end method

.method public unserialize(Landroid/os/Bundle;)V
    .locals 4

    const-string v0, "_wxmusicvideoobject_musicUrl"

    .line 5
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->musicUrl:Ljava/lang/String;

    const-string v0, "_wxmusicvideoobject_musicDataUrl"

    .line 13
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->musicDataUrl:Ljava/lang/String;

    const-string v0, "_wxmusicvideoobject_singerName"

    .line 21
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 24
    iput-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->singerName:Ljava/lang/String;

    const-string v0, "_wxmusicvideoobject_songLyric"

    .line 29
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 32
    iput-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->songLyric:Ljava/lang/String;

    const-string v0, "_wxmusicvideoobject_hdAlbumThumbFilePath"

    .line 37
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 40
    iput-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->hdAlbumThumbFilePath:Ljava/lang/String;

    const-string v0, "_wxmusicvideoobject_albumName"

    .line 45
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 48
    iput-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->albumName:Ljava/lang/String;

    const-string v0, "_wxmusicvideoobject_musicGenre"

    .line 53
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 56
    iput-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->musicGenre:Ljava/lang/String;

    const-string v0, "_wxmusicvideoobject_issueDate"

    const-wide/16 v1, 0x0

    .line 63
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    .line 66
    iput-wide v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->issueDate:J

    const-string v0, "_wxmusicvideoobject_identification"

    .line 71
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 74
    iput-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->identification:Ljava/lang/String;

    const-string v0, "_wxmusicvideoobject_duration"

    const/4 v1, 0x0

    .line 80
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 83
    iput v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->duration:I

    const-string v0, "_wxmusicvideoobject_musicOperationUrl"

    .line 88
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 91
    iput-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->musicOperationUrl:Ljava/lang/String;

    const-string v0, "_wxmusicvideoobject_musicVipInfo"

    .line 96
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 102
    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 106
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    .line 109
    check-cast v1, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVipInfo;

    .line 111
    iput-object v1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->musicVipInfo:Lcom/tencent/mm/opensdk/modelmsg/WXMusicVipInfo;

    .line 114
    invoke-virtual {v1, p1}, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVipInfo;->unserialize(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "get WXSceneDataObject from bundle failed: unknown vipInfoObjectStr "

    const-string v3, ", ex = "

    .line 0
    invoke-static {v2, v0, v3}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "MicroMsg.SDK.WXMusicVideoObject"

    invoke-static {v1, v0, v2}, Ll/ۡܶ֫;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    :cond_0
    :goto_0
    const-string v0, "_wxmusicvideoobject_hdAlbumThumbFileHash"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMusicVideoObject;->hdAlbumThumbFileHash:Ljava/lang/String;

    return-void
.end method
