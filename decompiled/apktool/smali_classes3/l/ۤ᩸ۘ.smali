.class public final Ll/ۤ᩸ۘ;
.super Ljava/lang/Object;
.source "51RR"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 20
    iput-object v0, p0, Ll/ۤ᩸ۘ;->֫:Ljava/lang/String;

    .line 22
    iput-object v0, p0, Ll/ۤ᩸ۘ;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public static ᩳ()Ll/ۤ᩸ۘ;
    .locals 1

    .line 33
    invoke-static {}, Ll/۫᩸ۘ;->֫()Ll/ۤ᩸ۘ;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Ll/ۤ᩸ۘ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Landroid/content/Context;)V
    .locals 4

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "device_info_file"

    const/4 v1, 0x4

    .line 40
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    .line 41
    iget-object v0, p0, Ll/ۤ᩸ۘ;->ۧ:Ljava/lang/String;

    const-string v1, "openSDK_LOG.DeviceInfoUtils"

    const-string v2, ""

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const-string v0, "build_model"

    .line 42
    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۤ᩸ۘ;->ۧ:Ljava/lang/String;

    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "init, model = "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Ll/ۤ᩸ۘ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    :cond_2
    iget-object v0, p0, Ll/ۤ᩸ۘ;->֫:Ljava/lang/String;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    return-void

    :cond_4
    :goto_1
    const-string v0, "build_device"

    .line 46
    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۤ᩸ۘ;->֫:Ljava/lang/String;

    .line 47
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "init, device = "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Ll/ۤ᩸ۘ;->֫:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    .line 76
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "setBuildModel, model = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "openSDK_LOG.DeviceInfoUtils"

    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "build_model"

    const/4 v2, 0x4

    const-string v3, "device_info_file"

    if-eqz p2, :cond_2

    .line 77
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    .line 84
    :cond_0
    iget-object v4, p0, Ll/ۤ᩸ۘ;->ۧ:Ljava/lang/String;

    if-eqz v4, :cond_1

    invoke-virtual {v4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string p1, "setBuildModel, needn\'t update sp."

    .line 85
    invoke-static {v1, p1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 88
    :cond_1
    iput-object p2, p0, Ll/ۤ᩸ۘ;->ۧ:Ljava/lang/String;

    if-eqz p1, :cond_3

    .line 90
    invoke-virtual {p1, v3, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    .line 91
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    iget-object p2, p0, Ll/ۤ᩸ۘ;->ۧ:Ljava/lang/String;

    invoke-interface {p1, v0, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    const-string p1, "setBuildModel, update sp."

    .line 92
    invoke-static {v1, p1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    :goto_0
    const-string p2, ""

    .line 78
    iput-object p2, p0, Ll/ۤ᩸ۘ;->ۧ:Ljava/lang/String;

    if-eqz p1, :cond_3

    .line 80
    invoke-virtual {p1, v3, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    .line 81
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_3
    return-void
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Ll/ۤ᩸ۘ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 3

    .line 72
    iget-object v0, p0, Ll/ۤ᩸ۘ;->ۧ:Ljava/lang/String;

    .line 1186
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    :try_start_0
    const-string v1, "UTF-8"

    .line 1188
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 1190
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "convert2Base64String exception: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "openSDK_LOG.Util"

    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method
