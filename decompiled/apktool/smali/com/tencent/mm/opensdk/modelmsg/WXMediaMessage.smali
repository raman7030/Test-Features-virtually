.class public final Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
.super Ljava/lang/Object;


# static fields
.field public static final ACTION_WXAPPMESSAGE:Ljava/lang/String; = "com.tencent.mm.sdk.openapi.Intent.ACTION_WXAPPMESSAGE"

.field public static final DESCRIPTION_LENGTH_LIMIT:I = 0x400

.field public static final MEDIA_TAG_NAME_LENGTH_LIMIT:I = 0x40

.field public static final MESSAGE_ACTION_LENGTH_LIMIT:I = 0x800

.field public static final MESSAGE_EXT_LENGTH_LIMIT:I = 0x800

.field public static final MINI_PROGRAM__THUMB_LENGHT:I = 0x20000

.field public static final NATIVE_GAME__THUMB_LIMIT:I = 0x40000

.field public static final TAG:Ljava/lang/String; = "MicroMsg.SDK.WXMediaMessage"

.field public static final THUMB_LENGTH_LIMIT:I = 0x10000

.field public static final TITLE_LENGTH_LIMIT:I = 0x200


# instance fields
.field public description:Ljava/lang/String;

.field public mediaObject:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;

.field public mediaTagName:Ljava/lang/String;

.field public messageAction:Ljava/lang/String;

.field public messageExt:Ljava/lang/String;

.field public msgSignature:Ljava/lang/String;

.field public sdkVer:I

.field public thumbData:[B

.field public thumbDataHash:Ljava/lang/String;

.field public title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-direct {p0, v0}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;-><init>(Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;)V

    return-void
.end method

.method public constructor <init>(Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;

    return-void
.end method


# virtual methods
.method public final checkArgs()Z
    .locals 4

    .line 0
    invoke-virtual {p0}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->getType()I

    move-result v0

    const/16 v1, 0x8

    const/4 v2, 0x0

    const-string v3, "MicroMsg.SDK.WXMediaMessage"

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->thumbData:[B

    if-eqz v0, :cond_0

    array-length v0, v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, "checkArgs fail, thumbData should not be null when send emoji"

    goto/16 :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->getType()I

    move-result v0

    const/16 v1, 0x4c

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->title:Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/mm/opensdk/utils/d;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "checkArgs fail, Type = Music Video, but title == null"

    goto/16 :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->getType()I

    move-result v0

    invoke-static {v0}, Lcom/tencent/mm/opensdk/utils/d;->a(I)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->thumbData:[B

    if-eqz v0, :cond_3

    array-length v0, v0

    const/high16 v1, 0x20000

    if-le v0, v1, :cond_4

    :cond_3
    const-string v0, "checkArgs fail, thumbData should not be null or exceed 128kb"

    goto/16 :goto_1

    :cond_4
    invoke-virtual {p0}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->getType()I

    move-result v0

    invoke-static {v0}, Lcom/tencent/mm/opensdk/utils/d;->b(I)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->thumbData:[B

    if-eqz v0, :cond_5

    array-length v0, v0

    const/high16 v1, 0x40000

    if-le v0, v1, :cond_6

    :cond_5
    const-string v0, "checkArgs fail, thumbData should not be null or exceed 256KB"

    goto/16 :goto_1

    :cond_6
    invoke-virtual {p0}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->getType()I

    move-result v0

    invoke-static {v0}, Lcom/tencent/mm/opensdk/utils/d;->a(I)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {p0}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->getType()I

    move-result v0

    invoke-static {v0}, Lcom/tencent/mm/opensdk/utils/d;->b(I)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_0

    :cond_7
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->thumbData:[B

    if-eqz v0, :cond_8

    array-length v0, v0

    const/high16 v1, 0x10000

    if-le v0, v1, :cond_8

    const-string v0, "checkArgs fail, thumbData is invalid"

    goto :goto_1

    :cond_8
    :goto_0
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->title:Ljava/lang/String;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x200

    if-le v0, v1, :cond_9

    const-string v0, "checkArgs fail, title is invalid"

    goto :goto_1

    :cond_9
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->description:Ljava/lang/String;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x400

    if-le v0, v1, :cond_a

    const-string v0, "checkArgs fail, description is invalid"

    goto :goto_1

    :cond_a
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;

    if-nez v0, :cond_b

    const-string v0, "checkArgs fail, mediaObject is null"

    goto :goto_1

    :cond_b
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->mediaTagName:Ljava/lang/String;

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x40

    if-le v0, v1, :cond_c

    const-string v0, "checkArgs fail, mediaTagName is too long"

    goto :goto_1

    :cond_c
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->messageAction:Ljava/lang/String;

    const/16 v1, 0x800

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v1, :cond_d

    const-string v0, "checkArgs fail, messageAction is too long"

    goto :goto_1

    :cond_d
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->messageExt:Ljava/lang/String;

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v1, :cond_e

    const-string v0, "checkArgs fail, messageExt is too long"

    :goto_1
    invoke-static {v3, v0}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v2

    :cond_e
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;

    invoke-interface {v0}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;->checkArgs()Z

    move-result v0

    return v0
.end method

.method public final getType()I
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-interface {v0}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;->type()I

    move-result v0

    return v0
.end method

.method public final setThumbImage(Landroid/graphics/Bitmap;)V
    .locals 3

    .line 2
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 5
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 7
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v2, 0x55

    .line 12
    invoke-virtual {p1, v1, v2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 15
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    .line 18
    iput-object p1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->thumbData:[B

    .line 21
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "setThumbImage exception:"

    .line 31
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "MicroMsg.SDK.WXMediaMessage"

    .line 0
    invoke-static {p1, v0, v1}, Ll/ۡܶ֫;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    return-void
.end method
