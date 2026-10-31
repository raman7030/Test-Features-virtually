.class public final Ll/ᩳ۫֫;
.super Ljava/lang/Object;
.source "H8RW"


# static fields
.field public static final ܽ:Ll/ۢ۬ܺ;

.field public static final ܿ:Ll/ܳ۬ܺ;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation
.end field

.field public static final ᩳ:Ll/ᩳ۫֫;


# instance fields
.field public final ֫:Landroid/util/SparseArray;

.field public final ۧ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 68
    new-instance v0, Ll/ᩳ۫֫;

    sget-object v1, Ll/ܽ۫֫;->ᩳ:Ll/ܽ۫֫;

    .line 69
    invoke-static {v1}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ᩳ۫֫;-><init>(Ljava/util/List;)V

    sput-object v0, Ll/ᩳ۫֫;->ᩳ:Ll/ᩳ۫֫;

    const/4 v0, 0x5

    .line 75
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 74
    invoke-static {}, Ll/ܳ۬ܺ;->ۜ()Ll/ܳ۬ܺ;

    move-result-object v2

    sput-object v2, Ll/ᩳ۫֫;->ܿ:Ll/ܳ۬ܺ;

    .line 82
    new-instance v2, Ll/ۜ۬ܺ;

    invoke-direct {v2}, Ll/ۜ۬ܺ;-><init>()V

    .line 84
    invoke-virtual {v2, v0, v1}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    const/16 v0, 0x11

    .line 85
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0, v1}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    const/4 v0, 0x7

    .line 86
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0, v1}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    const/16 v0, 0x1e

    .line 87
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v3, 0xa

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    const/16 v0, 0x12

    .line 88
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0, v1}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    const/16 v0, 0x8

    .line 89
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    .line 90
    invoke-virtual {v2, v0, v0}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    const/16 v1, 0xe

    .line 91
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1, v0}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    .line 92
    invoke-virtual {v2}, Ll/ۜ۬ܺ;->ۧ()Ll/ۢ۬ܺ;

    move-result-object v0

    sput-object v0, Ll/ᩳ۫֫;->ܽ:Ll/ۢ۬ܺ;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;)V
    .locals 0

    .line 0
    invoke-direct {p0, p2}, Ll/ᩳ۫֫;-><init>(Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 5

    .line 232
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 233
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Ll/ᩳ۫֫;->֫:Landroid/util/SparseArray;

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 234
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 235
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽ۫֫;

    .line 236
    iget-object v3, p0, Ll/ᩳ۫֫;->֫:Landroid/util/SparseArray;

    iget v4, v2, Ll/ܽ۫֫;->ۧ:I

    invoke-virtual {v3, v4, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 239
    :goto_1
    iget-object v1, p0, Ll/ᩳ۫֫;->֫:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 240
    iget-object v1, p0, Ll/ᩳ۫֫;->֫:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽ۫֫;

    iget v1, v1, Ll/ܽ۫֫;->ܽ:I

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 242
    :cond_1
    iput p1, p0, Ll/ᩳ۫֫;->ۧ:I

    return-void
.end method

.method public static ֫(I[I)Ll/ܳ۬ܺ;
    .locals 4

    .line 438
    sget v0, Ll/ܳ۬ܺ;->᩹:I

    .line 726
    new-instance v0, Ll/֫۬ܺ;

    invoke-direct {v0}, Ll/֫۬ܺ;-><init>()V

    const/4 v1, 0x0

    if-nez p1, :cond_0

    new-array p1, v1, [I

    .line 442
    :cond_0
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_1

    .line 443
    aget v2, p1, v1

    .line 444
    new-instance v3, Ll/ܽ۫֫;

    invoke-direct {v3, v2, p0}, Ll/ܽ۫֫;-><init>(II)V

    invoke-virtual {v0, v3}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 446
    :cond_1
    invoke-virtual {v0}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/content/Context;Landroid/content/Intent;Ll/ᩳᩴ֫;Ll/ۢ۫֫;)Ll/ᩳ۫֫;
    .locals 5

    .line 147
    invoke-static {p0}, Ll/ۖ֡֫;->֫(Landroid/content/Context;)Landroid/media/AudioManager;

    move-result-object v0

    const/16 v1, 0x21

    if-eqz p3, :cond_0

    goto :goto_0

    .line 151
    :cond_0
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p3, v1, :cond_1

    .line 152
    invoke-static {v0, p2}, Ll/ۧ۫֫;->ۧ(Landroid/media/AudioManager;Ll/ᩳᩴ֫;)Ll/ۢ۫֫;

    move-result-object p3

    goto :goto_0

    :cond_1
    const/4 p3, 0x0

    .line 155
    :goto_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const-string v3, "android.hardware.type.automotive"

    const/16 v4, 0x17

    if-lt v2, v1, :cond_3

    invoke-static {p0}, Ll/ۘ֨֫;->ܽ(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_2

    if-lt v2, v4, :cond_3

    .line 3202
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 159
    :cond_2
    invoke-static {v0, p2}, Ll/ۧ۫֫;->֫(Landroid/media/AudioManager;Ll/ᩳᩴ֫;)Ll/ᩳ۫֫;

    move-result-object p0

    return-object p0

    :cond_3
    if-lt v2, v4, :cond_4

    .line 164
    invoke-static {v0, p3}, Ll/۟۬֫;->֫(Landroid/media/AudioManager;Ll/ۢ۫֫;)Z

    move-result p3

    if-eqz p3, :cond_4

    .line 165
    sget-object p0, Ll/ᩳ۫֫;->ᩳ:Ll/ᩳ۫֫;

    return-object p0

    .line 168
    :cond_4
    new-instance p3, Ll/۫۬ܺ;

    invoke-direct {p3}, Ll/۫۬ܺ;-><init>()V

    const/4 v0, 0x2

    .line 169
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p3, v0}, Ll/۫۬ܺ;->֫(Ljava/lang/Object;)Ll/۫۬ܺ;

    const/16 v0, 0x1d

    const/16 v1, 0xa

    if-lt v2, v0, :cond_6

    .line 175
    invoke-static {p0}, Ll/ۘ֨֫;->ܽ(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_5

    if-lt v2, v4, :cond_6

    .line 3202
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 176
    :cond_5
    invoke-static {p2}, Ll/֫۫֫;->֫(Ll/ᩳᩴ֫;)Ll/ܳ۬ܺ;

    move-result-object p0

    invoke-virtual {p3, p0}, Ll/۫۬ܺ;->֫(Ljava/lang/Iterable;)Ll/۫۬ܺ;

    .line 177
    new-instance p0, Ll/ᩳ۫֫;

    .line 178
    invoke-virtual {p3}, Ll/۫۬ܺ;->֫()Ll/ۛ۬ܺ;

    move-result-object p1

    invoke-static {p1}, Ll/۬᩺ܺ;->֫(Ljava/util/Collection;)[I

    move-result-object p1

    invoke-static {v1, p1}, Ll/ᩳ۫֫;->֫(I[I)Ll/ܳ۬ܺ;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ᩳ۫֫;-><init>(Ljava/util/List;)V

    return-object p0

    .line 181
    :cond_6
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const-string p2, "use_external_surround_sound_flag"

    const/4 v0, 0x0

    .line 183
    invoke-static {p0, p2, v0}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result p2

    const/4 v2, 0x1

    if-ne p2, v2, :cond_7

    const/4 p2, 0x1

    goto :goto_1

    :cond_7
    const/4 p2, 0x0

    :goto_1
    if-nez p2, :cond_8

    .line 374
    sget-object v3, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v4, "Amazon"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    const-string v4, "Xiaomi"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    :cond_8
    const-string v3, "external_surround_sound_enabled"

    .line 185
    invoke-static {p0, v3, v0}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result p0

    if-ne p0, v2, :cond_9

    .line 186
    sget-object p0, Ll/ᩳ۫֫;->ܿ:Ll/ܳ۬ܺ;

    invoke-virtual {p3, p0}, Ll/۫۬ܺ;->֫(Ljava/lang/Iterable;)Ll/۫۬ܺ;

    :cond_9
    if-eqz p1, :cond_b

    if-nez p2, :cond_b

    const-string p0, "android.media.extra.AUDIO_PLUG_STATE"

    .line 191
    invoke-virtual {p1, p0, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p0

    if-ne p0, v2, :cond_b

    const-string p0, "android.media.extra.ENCODINGS"

    .line 192
    invoke-virtual {p1, p0}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I

    move-result-object p0

    if-eqz p0, :cond_a

    .line 194
    invoke-static {p0}, Ll/۬᩺ܺ;->֫([I)Ljava/util/List;

    move-result-object p0

    invoke-virtual {p3, p0}, Ll/۫۬ܺ;->֫(Ljava/lang/Iterable;)Ll/۫۬ܺ;

    .line 196
    :cond_a
    new-instance p0, Ll/ᩳ۫֫;

    .line 198
    invoke-virtual {p3}, Ll/۫۬ܺ;->֫()Ll/ۛ۬ܺ;

    move-result-object p2

    invoke-static {p2}, Ll/۬᩺ܺ;->֫(Ljava/util/Collection;)[I

    move-result-object p2

    const-string p3, "android.media.extra.MAX_CHANNEL_COUNT"

    .line 199
    invoke-virtual {p1, p3, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    .line 197
    invoke-static {p1, p2}, Ll/ᩳ۫֫;->֫(I[I)Ll/ܳ۬ܺ;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ᩳ۫֫;-><init>(Ljava/util/List;)V

    return-object p0

    .line 204
    :cond_b
    new-instance p0, Ll/ᩳ۫֫;

    .line 206
    invoke-virtual {p3}, Ll/۫۬ܺ;->֫()Ll/ۛ۬ܺ;

    move-result-object p1

    invoke-static {p1}, Ll/۬᩺ܺ;->֫(Ljava/util/Collection;)[I

    move-result-object p1

    .line 205
    invoke-static {v1, p1}, Ll/ᩳ۫֫;->֫(I[I)Ll/ܳ۬ܺ;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ᩳ۫֫;-><init>(Ljava/util/List;)V

    return-object p0
.end method

.method public static ֫(Landroid/content/Context;Ll/ᩳᩴ֫;Ll/ۢ۫֫;)Ll/ᩳ۫֫;
    .locals 2

    .line 135
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.media.action.HDMI_AUDIO_PLUG"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 136
    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v0

    .line 138
    invoke-static {p0, v0, p1, p2}, Ll/ᩳ۫֫;->֫(Landroid/content/Context;Landroid/content/Intent;Ll/ᩳᩴ֫;Ll/ۢ۫֫;)Ll/ᩳ۫֫;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    .line 351
    :cond_0
    instance-of v0, p1, Ll/ᩳ۫֫;

    if-nez v0, :cond_1

    goto :goto_1

    .line 354
    :cond_1
    check-cast p1, Ll/ᩳ۫֫;

    .line 355
    iget-object v0, p0, Ll/ᩳ۫֫;->֫:Landroid/util/SparseArray;

    iget-object v1, p1, Ll/ᩳ۫֫;->֫:Landroid/util/SparseArray;

    invoke-static {v0, v1}, Ll/ۘ֨֫;->֫(Landroid/util/SparseArray;Landroid/util/SparseArray;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Ll/ᩳ۫֫;->ۧ:I

    iget p1, p1, Ll/ᩳ۫֫;->ۧ:I

    if-ne v0, p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 361
    iget-object v0, p0, Ll/ᩳ۫֫;->֫:Landroid/util/SparseArray;

    invoke-static {v0}, Ll/ۘ֨֫;->֫(Landroid/util/SparseArray;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/ᩳ۫֫;->ۧ:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 366
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AudioCapabilities[maxChannelCount="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ᩳ۫֫;->ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", audioProfiles="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ᩳ۫֫;->֫:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ᩳᩴ֫;Ll/۠ᩴ֫;)Landroid/util/Pair;
    .locals 7

    .line 297
    iget-object v0, p2, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    iget-object v1, p2, Ll/۠ᩴ֫;->ܳ:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ۢ᩵֫;->ܽ(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 301
    sget-object v1, Ll/ᩳ۫֫;->ܽ:Ll/ۢ۬ܺ;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۢ۬ܺ;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_4

    :cond_0
    const/4 v1, 0x7

    const/4 v2, 0x6

    const/16 v3, 0x8

    const/16 v4, 0x12

    .line 305
    iget-object v5, p0, Ll/ᩳ۫֫;->֫:Landroid/util/SparseArray;

    if-ne v0, v4, :cond_1

    .line 252
    invoke-static {v5, v4}, Ll/ۘ֨֫;->֫(Landroid/util/SparseArray;I)Z

    move-result v6

    if-nez v6, :cond_1

    const/4 v0, 0x6

    goto :goto_0

    :cond_1
    if-ne v0, v3, :cond_2

    invoke-static {v5, v3}, Ll/ۘ֨֫;->֫(Landroid/util/SparseArray;I)Z

    move-result v3

    if-eqz v3, :cond_3

    :cond_2
    const/16 v3, 0x1e

    if-ne v0, v3, :cond_4

    invoke-static {v5, v3}, Ll/ۘ֨֫;->֫(Landroid/util/SparseArray;I)Z

    move-result v3

    if-nez v3, :cond_4

    :cond_3
    const/4 v0, 0x7

    :cond_4
    :goto_0
    invoke-static {v5, v0}, Ll/ۘ֨֫;->֫(Landroid/util/SparseArray;I)Z

    move-result v3

    if-nez v3, :cond_5

    goto/16 :goto_4

    .line 317
    :cond_5
    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܽ۫֫;

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    iget v5, p2, Ll/۠ᩴ֫;->ܿ:I

    const/4 v6, -0x1

    if-eq v5, v6, :cond_8

    if-ne v0, v4, :cond_6

    goto :goto_1

    .line 329
    :cond_6
    iget-object p1, p2, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const-string p2, "audio/vnd.dts.uhd;profile=p2"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x21

    if-ge p1, p2, :cond_7

    const/16 p1, 0xa

    if-le v5, p1, :cond_a

    goto :goto_4

    .line 335
    :cond_7
    invoke-virtual {v3, v5}, Ll/ܽ۫֫;->֫(I)Z

    move-result p1

    if-nez p1, :cond_a

    goto :goto_4

    .line 324
    :cond_8
    :goto_1
    iget p2, p2, Ll/۠ᩴ֫;->ܽ֫:I

    if-eq p2, v6, :cond_9

    goto :goto_2

    :cond_9
    const p2, 0xbb80

    .line 326
    :goto_2
    invoke-virtual {v3, p2, p1}, Ll/ܽ۫֫;->֫(ILl/ᩳᩴ֫;)I

    move-result v5

    .line 378
    :cond_a
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1c

    if-gt p1, p2, :cond_c

    if-ne v5, v1, :cond_b

    const/16 v2, 0x8

    goto :goto_3

    :cond_b
    const/4 p2, 0x3

    if-eq v5, p2, :cond_d

    const/4 p2, 0x4

    if-eq v5, p2, :cond_d

    const/4 p2, 0x5

    if-ne v5, p2, :cond_c

    goto :goto_3

    :cond_c
    move v2, v5

    :cond_d
    :goto_3
    const/16 p2, 0x1a

    if-gt p1, p2, :cond_e

    const-string p1, "fugu"

    .line 392
    sget-object p2, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    const/4 p1, 0x1

    if-ne v2, p1, :cond_e

    const/4 v2, 0x2

    .line 396
    :cond_e
    invoke-static {v2}, Ll/ۘ֨֫;->ۧ(I)I

    move-result p1

    if-nez p1, :cond_f

    :goto_4
    const/4 p1, 0x0

    return-object p1

    .line 343
    :cond_f
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method
