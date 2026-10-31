.class public final Ll/ܳۤܳ;
.super Ljava/lang/Object;
.source "3AN5"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Landroid/os/Handler;

.field public static final ܽ:Ll/۟֡ᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 31
    new-instance v0, Ll/ᩳۤܳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 187
    new-instance v1, Ll/۟֡ᩴ;

    invoke-direct {v1, v0}, Ll/۟֡ᩴ;-><init>(Ll/ۡ᩺ۘ;)V

    .line 42
    sput-object v1, Ll/ܳۤܳ;->ܽ:Ll/۟֡ᩴ;

    .line 43
    new-instance v0, Ll/ܿۤܳ;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Ll/ܳۤܳ;->ۧ:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ll/ܽۤܳ;Z)Ljava/lang/String;
    .locals 1

    .line 141
    invoke-static {p0}, Ll/ܳۤܳ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 142
    sget-object v0, Ll/ܽۤܳ;->᩶:Ll/ܽۤܳ;

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 145
    :cond_0
    sget-object v0, Ll/ܽۤܳ;->᩹:Ll/ܽۤܳ;

    if-ne p1, v0, :cond_1

    if-eqz p2, :cond_1

    invoke-static {p0}, Ll/ܳۤܳ;->ۧ(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    .line 148
    :cond_1
    invoke-static {p0}, Ll/ܳۤܳ;->ܳ(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_0

    .line 151
    :cond_2
    sget-object p2, Ll/ܽۤܳ;->ۙ:Ll/ܽۤܳ;

    if-ne p1, p2, :cond_5

    .line 180
    invoke-static {p0}, Ll/ܳۤܳ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "/sdcard"

    invoke-static {p2}, Ll/ܳۤܳ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    .line 172
    :cond_3
    sget-object p1, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ܳۤܳ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 180
    invoke-static {p0}, Ll/ܳۤܳ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1}, Ll/ܳۤܳ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_0

    .line 175
    :cond_4
    invoke-static {p0}, Ll/᩵᩸ܿ;->֫(Ljava/lang/String;)Ll/ۘ᩸ܿ;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 176
    iget-object p1, p1, Ll/ۘ᩸ܿ;->ܽ:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ܳۤܳ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 180
    invoke-static {p0}, Ll/ܳۤܳ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1}, Ll/ܳۤܳ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    :goto_0
    const/4 p0, 0x0

    :cond_5
    return-object p0
.end method

.method public static bridge synthetic ֫()Ll/۟֡ᩴ;
    .locals 1

    .line 0
    sget-object v0, Ll/ܳۤܳ;->ܽ:Ll/۟֡ᩴ;

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)V
    .locals 4

    if-nez p0, :cond_0

    return-void

    .line 84
    :cond_0
    const-class v0, Ll/ܳۤܳ;

    monitor-enter v0

    .line 85
    :try_start_0
    sget-object v1, Ll/ܳۤܳ;->ܽ:Ll/۟֡ᩴ;

    .line 197
    invoke-virtual {v1, p0}, Ll/۟֡ᩴ;->remove(Ljava/lang/Object;)Z

    .line 198
    invoke-virtual {v1, p0}, Ll/۟֡ᩴ;->add(Ljava/lang/Object;)Z

    .line 86
    sget-object p0, Ll/ܳۤܳ;->ۧ:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v2

    if-nez v2, :cond_1

    const-wide/16 v2, 0x7d0

    .line 87
    invoke-virtual {p0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 89
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ֫(Ljava/lang/String;Z)V
    .locals 1

    .line 127
    invoke-static {p0}, Ll/ܳۤܳ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 128
    invoke-static {p0}, Ll/ܳۤܳ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 131
    :cond_0
    invoke-static {p0}, Ll/ܳۤܳ;->ܳ(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    :goto_0
    move-object p0, v0

    .line 74
    :cond_1
    invoke-static {p0}, Ll/ܳۤܳ;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Ll/ܶ᩵ܿ;)V
    .locals 1

    .line 213
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x1

    .line 217
    invoke-static {p0, v0}, Ll/ܳۤܳ;->֫(Ljava/lang/String;Z)V

    return-void
.end method

.method public static ۧ(Ljava/lang/String;)Z
    .locals 2

    .line 158
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "download"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 161
    :cond_0
    invoke-static {p0}, Ll/ۖ֨ܿ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2

    const-string v0, "image"

    .line 162
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "video"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "audio"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static ܳ(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "/system/"

    .line 61
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "/data/"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 64
    :cond_0
    invoke-static {p0}, Ll/ܿ֡ܿ;->ᩳ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 573
    invoke-static {p0}, Ll/᩵᩸ܿ;->֫(Ljava/lang/String;)Ll/ۘ᩸ܿ;

    move-result-object p0

    if-eqz p0, :cond_2

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ܽ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 116
    invoke-static {p0}, Ll/ܽ᩷ܳ;->᩻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 117
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    const-string v0, "/"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 0
    invoke-static {v1, v0, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public static ܿ(Ljava/lang/String;)V
    .locals 2

    .line 240
    sget-object v0, Ll/ܽۤܳ;->ۙ:Ll/ܽۤܳ;

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Ll/ܳۤܳ;->֫(Ljava/lang/String;Ll/ܽۤܳ;Z)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ܳۤܳ;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public static ᩳ(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x1

    .line 233
    sget-object v1, Ll/ܽۤܳ;->᩹:Ll/ܽۤܳ;

    invoke-static {p0, v1, v0}, Ll/ܳۤܳ;->֫(Ljava/lang/String;Ll/ܽۤܳ;Z)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ܳۤܳ;->֫(Ljava/lang/String;)V

    return-void
.end method
