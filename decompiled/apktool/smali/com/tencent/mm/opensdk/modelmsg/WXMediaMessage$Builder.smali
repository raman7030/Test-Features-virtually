.class public Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$Builder;
.super Ljava/lang/Object;


# static fields
.field public static final KEY_IDENTIFIER:Ljava/lang/String; = "_wxobject_identifier_"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static fromBundle(Landroid/os/Bundle;)Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    .locals 4

    .line 2
    new-instance v0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;

    .line 5
    invoke-direct {v0}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;-><init>()V

    const-string v1, "_wxobject_sdkVer"

    .line 10
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v1

    .line 13
    iput v1, v0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->sdkVer:I

    const-string v1, "_wxobject_title"

    .line 18
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 21
    iput-object v1, v0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->title:Ljava/lang/String;

    const-string v1, "_wxobject_description"

    .line 26
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 29
    iput-object v1, v0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->description:Ljava/lang/String;

    const-string v1, "_wxobject_thumbdata"

    .line 34
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v1

    .line 37
    iput-object v1, v0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->thumbData:[B

    const-string v1, "_wxobject_mediatagname"

    .line 42
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 45
    iput-object v1, v0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->mediaTagName:Ljava/lang/String;

    const-string v1, "_wxobject_message_action"

    .line 50
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 53
    iput-object v1, v0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->messageAction:Ljava/lang/String;

    const-string v1, "_wxobject_message_ext"

    .line 58
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 61
    iput-object v1, v0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->messageExt:Ljava/lang/String;

    const-string v1, "_wxobject_msgsignature"

    .line 66
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 69
    iput-object v1, v0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->msgSignature:Ljava/lang/String;

    const-string v1, "_wxobject_thumbdatadash"

    .line 74
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 77
    iput-object v1, v0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->thumbDataHash:Ljava/lang/String;

    const-string v1, "_wxobject_identifier_"

    .line 82
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 86
    invoke-static {v1}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$Builder;->pathOldToNew(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 92
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-gtz v2, :cond_0

    goto :goto_0

    .line 99
    :cond_0
    :try_start_0
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    .line 103
    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v2

    .line 106
    check-cast v2, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;

    .line 108
    iput-object v2, v0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;

    .line 111
    invoke-interface {v2, p0}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;->unserialize(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    const-string v2, "get media object from bundle failed: unknown ident "

    const-string v3, ", ex = "

    .line 0
    invoke-static {v2, v1, v3}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "MicroMsg.SDK.WXMediaMessage"

    invoke-static {p0, v1, v2}, Ll/ۡܶ֫;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static pathNewToOld(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_1

    .line 0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "com.tencent.mm.opensdk.modelmsg"

    const-string v1, "com.tencent.mm.sdk.openapi"

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const-string v0, "MicroMsg.SDK.WXMediaMessage"

    const-string v1, "pathNewToOld fail, newPath is null"

    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public static pathOldToNew(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "pathOldToNew, oldPath = "

    .line 5
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "MicroMsg.SDK.WXMediaMessage"

    .line 15
    invoke-static {v1, v0}, Lcom/tencent/mm/opensdk/utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p0, :cond_2

    .line 20
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x2e

    .line 29
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    const-string v0, "pathOldToNew fail, invalid pos, oldPath = "

    .line 38
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 42
    invoke-static {v1, v0}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0

    .line 45
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "com.tencent.mm.opensdk.modelmsg"

    .line 50
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v0, p0, v1}, Ll/᩶ۢۢ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_0
    const-string v0, "pathOldToNew fail, oldPath is null"

    invoke-static {v1, v0}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public static toBundle(Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;)Landroid/os/Bundle;
    .locals 3

    .line 0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "_wxobject_sdkVer"

    iget v2, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->sdkVer:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "_wxobject_title"

    iget-object v2, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->title:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "_wxobject_description"

    iget-object v2, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->description:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "_wxobject_thumbdata"

    iget-object v2, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->thumbData:[B

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    iget-object v1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$Builder;->pathNewToOld(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "_wxobject_identifier_"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;

    invoke-interface {v1, v0}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;->serialize(Landroid/os/Bundle;)V

    :cond_0
    const-string v1, "_wxobject_mediatagname"

    iget-object v2, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->mediaTagName:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "_wxobject_message_action"

    iget-object v2, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->messageAction:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "_wxobject_message_ext"

    iget-object v2, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->messageExt:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "_wxobject_msgsignature"

    iget-object v2, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->msgSignature:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "_wxobject_thumbdatadash"

    iget-object p0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->thumbDataHash:Ljava/lang/String;

    invoke-virtual {v0, v1, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
