.class public final Ll/᩺᩺֫;
.super Ljava/lang/Object;
.source "97LV"

# interfaces
.implements Ll/ܺܳۧ;


# static fields
.field public static final ֡:Ljava/util/regex/Pattern;

.field public static final ֡֫:Ljava/util/regex/Pattern;

.field public static final ֨:Ljava/util/regex/Pattern;

.field public static final ֨֫:Ljava/util/regex/Pattern;

.field public static final ֫֫:Ljava/util/regex/Pattern;

.field public static final ֫ۧ:Ljava/util/regex/Pattern;

.field public static final ۖ:Ljava/util/regex/Pattern;

.field public static final ۖ֫:Ljava/util/regex/Pattern;

.field public static final ۗ:Ljava/util/regex/Pattern;

.field public static final ۗ֫:Ljava/util/regex/Pattern;

.field public static final ۘ:Ljava/util/regex/Pattern;

.field public static final ۘ֫:Ljava/util/regex/Pattern;

.field public static final ۙ:Ljava/util/regex/Pattern;

.field public static final ۙ֫:Ljava/util/regex/Pattern;

.field public static final ۚ:Ljava/util/regex/Pattern;

.field public static final ۚ֫:Ljava/util/regex/Pattern;

.field public static final ۛ:Ljava/util/regex/Pattern;

.field public static final ۛ֫:Ljava/util/regex/Pattern;

.field public static final ۜ:Ljava/util/regex/Pattern;

.field public static final ۜ֫:Ljava/util/regex/Pattern;

.field public static final ۟:Ljava/util/regex/Pattern;

.field public static final ۟֫:Ljava/util/regex/Pattern;

.field public static final ۠:Ljava/util/regex/Pattern;

.field public static final ۠֫:Ljava/util/regex/Pattern;

.field public static final ۡ:Ljava/util/regex/Pattern;

.field public static final ۡ֫:Ljava/util/regex/Pattern;

.field public static final ۢ:Ljava/util/regex/Pattern;

.field public static final ۢ֫:Ljava/util/regex/Pattern;

.field public static final ۤ:Ljava/util/regex/Pattern;

.field public static final ۤ֫:Ljava/util/regex/Pattern;

.field public static final ۧ֫:Ljava/util/regex/Pattern;

.field public static final ۧۧ:Ljava/util/regex/Pattern;

.field public static final ۨ:Ljava/util/regex/Pattern;

.field public static final ۨ֫:Ljava/util/regex/Pattern;

.field public static final ۫:Ljava/util/regex/Pattern;

.field public static final ۫֫:Ljava/util/regex/Pattern;

.field public static final ۬:Ljava/util/regex/Pattern;

.field public static final ۬֫:Ljava/util/regex/Pattern;

.field public static final ܰ:Ljava/util/regex/Pattern;

.field public static final ܰ֫:Ljava/util/regex/Pattern;

.field public static final ܳ:Ljava/util/regex/Pattern;

.field public static final ܳ֫:Ljava/util/regex/Pattern;

.field public static final ܳۧ:Ljava/util/regex/Pattern;

.field public static final ܶ:Ljava/util/regex/Pattern;

.field public static final ܶ֫:Ljava/util/regex/Pattern;

.field public static final ܺ:Ljava/util/regex/Pattern;

.field public static final ܺ֫:Ljava/util/regex/Pattern;

.field public static final ܽ:Ljava/util/regex/Pattern;

.field public static final ܽ֫:Ljava/util/regex/Pattern;

.field public static final ܽۧ:Ljava/util/regex/Pattern;

.field public static final ܿ:Ljava/util/regex/Pattern;

.field public static final ܿ֫:Ljava/util/regex/Pattern;

.field public static final ܿۧ:Ljava/util/regex/Pattern;

.field public static final ᩳ:Ljava/util/regex/Pattern;

.field public static final ᩳ֫:Ljava/util/regex/Pattern;

.field public static final ᩳۧ:Ljava/util/regex/Pattern;

.field public static final ᩴ:Ljava/util/regex/Pattern;

.field public static final ᩴ֫:Ljava/util/regex/Pattern;

.field public static final ᩵:Ljava/util/regex/Pattern;

.field public static final ᩵֫:Ljava/util/regex/Pattern;

.field public static final ᩶:Ljava/util/regex/Pattern;

.field public static final ᩶֫:Ljava/util/regex/Pattern;

.field public static final ᩷:Ljava/util/regex/Pattern;

.field public static final ᩷֫:Ljava/util/regex/Pattern;

.field public static final ᩸:Ljava/util/regex/Pattern;

.field public static final ᩸֫:Ljava/util/regex/Pattern;

.field public static final ᩹:Ljava/util/regex/Pattern;

.field public static final ᩹֫:Ljava/util/regex/Pattern;

.field public static final ᩺:Ljava/util/regex/Pattern;

.field public static final ᩺֫:Ljava/util/regex/Pattern;

.field public static final ᩻:Ljava/util/regex/Pattern;

.field public static final ᩻֫:Ljava/util/regex/Pattern;


# instance fields
.field public final ֫:Ll/۫᩺֫;

.field public final ۧ:Ll/ۙ᩺֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "AVERAGE-BANDWIDTH=(\\d+)\\b"

    .line 146
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ۢ:Ljava/util/regex/Pattern;

    const-string v0, "VIDEO=\"((?:.|\u000c)+?)\""

    .line 148
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ܿۧ:Ljava/util/regex/Pattern;

    const-string v0, "AUDIO=\"((?:.|\u000c)+?)\""

    .line 150
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ۜ:Ljava/util/regex/Pattern;

    const-string v0, "SUBTITLES=\"((?:.|\u000c)+?)\""

    .line 152
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->۫֫:Ljava/util/regex/Pattern;

    const-string v0, "CLOSED-CAPTIONS=\"((?:.|\u000c)+?)\""

    .line 154
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->᩸:Ljava/util/regex/Pattern;

    const-string v0, "[^-]BANDWIDTH=(\\d+)\\b"

    .line 155
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ۡ:Ljava/util/regex/Pattern;

    const-string v0, "CHANNELS=\"((?:.|\u000c)+?)\""

    .line 157
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ۚ:Ljava/util/regex/Pattern;

    const-string v0, "VIDEO-RANGE=(SDR|PQ|HLG)"

    .line 158
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ܳۧ:Ljava/util/regex/Pattern;

    const-string v0, "CODECS=\"((?:.|\u000c)+?)\""

    .line 160
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->᩹:Ljava/util/regex/Pattern;

    const-string v0, "SUPPLEMENTAL-CODECS=\"((?:.|\u000c)+?)\""

    .line 162
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ۤ֫:Ljava/util/regex/Pattern;

    const-string v0, "RESOLUTION=(\\d+x\\d+)"

    .line 163
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->᩸֫:Ljava/util/regex/Pattern;

    const-string v0, "FRAME-RATE=([\\d\\.]+)\\b"

    .line 164
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ۛ:Ljava/util/regex/Pattern;

    const-string v0, "#EXT-X-TARGETDURATION:(\\d+)\\b"

    .line 166
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ۛ֫:Ljava/util/regex/Pattern;

    const-string v0, "DURATION=([\\d\\.]+)\\b"

    .line 167
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ܳ:Ljava/util/regex/Pattern;

    const-string v0, "[:,]DURATION=([\\d\\.]+)\\b"

    .line 169
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->᩻:Ljava/util/regex/Pattern;

    const-string v0, "PART-TARGET=([\\d\\.]+)\\b"

    .line 171
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->᩵֫:Ljava/util/regex/Pattern;

    const-string v0, "#EXT-X-VERSION:(\\d+)\\b"

    .line 172
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ᩳۧ:Ljava/util/regex/Pattern;

    const-string v0, "#EXT-X-PLAYLIST-TYPE:(.+)\\b"

    .line 174
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ۚ֫:Ljava/util/regex/Pattern;

    const-string v0, "CAN-SKIP-UNTIL=([\\d\\.]+)\\b"

    .line 176
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->֡:Ljava/util/regex/Pattern;

    const-string v0, "CAN-SKIP-DATERANGES"

    .line 178
    invoke-static {v0}, Ll/᩺᩺֫;->֫(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->᩵:Ljava/util/regex/Pattern;

    const-string v0, "SKIPPED-SEGMENTS=(\\d+)\\b"

    .line 180
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ۙ֫:Ljava/util/regex/Pattern;

    const-string v0, "[:|,]HOLD-BACK=([\\d\\.]+)\\b"

    .line 181
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ܰ:Ljava/util/regex/Pattern;

    const-string v0, "PART-HOLD-BACK=([\\d\\.]+)\\b"

    .line 183
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ᩴ֫:Ljava/util/regex/Pattern;

    const-string v0, "CAN-BLOCK-RELOAD"

    .line 185
    invoke-static {v0}, Ll/᩺᩺֫;->֫(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ᩴ:Ljava/util/regex/Pattern;

    const-string v0, "#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b"

    .line 187
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ۡ֫:Ljava/util/regex/Pattern;

    const-string v0, "#EXTINF:([\\d\\.]+)\\b"

    .line 189
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ۢ֫:Ljava/util/regex/Pattern;

    const-string v0, "#EXTINF:[\\d\\.]+\\b,(.+)"

    .line 191
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ܺ֫:Ljava/util/regex/Pattern;

    const-string v0, "LAST-MSN=(\\d+)\\b"

    .line 192
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ۜ֫:Ljava/util/regex/Pattern;

    const-string v0, "LAST-PART=(\\d+)\\b"

    .line 193
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->᩷֫:Ljava/util/regex/Pattern;

    const-string v0, "TIME-OFFSET=(-?[\\d\\.]+)\\b"

    .line 194
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ܰ֫:Ljava/util/regex/Pattern;

    const-string v0, "#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b"

    .line 196
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ܺ:Ljava/util/regex/Pattern;

    const-string v0, "BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\""

    .line 198
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ܿ:Ljava/util/regex/Pattern;

    const-string v0, "BYTERANGE-START=(\\d+)\\b"

    .line 199
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ۘ:Ljava/util/regex/Pattern;

    const-string v0, "BYTERANGE-LENGTH=(\\d+)\\b"

    .line 201
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ۖ:Ljava/util/regex/Pattern;

    const-string v0, "METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)"

    .line 203
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ۖ֫:Ljava/util/regex/Pattern;

    const-string v0, "KEYFORMAT=\"((?:.|\u000c)+?)\""

    .line 217
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ܿ֫:Ljava/util/regex/Pattern;

    const-string v0, "KEYFORMATVERSIONS=\"((?:.|\u000c)+?)\""

    .line 219
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ܳ֫:Ljava/util/regex/Pattern;

    const-string v0, "URI=\"((?:.|\u000c)+?)\""

    .line 221
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->֫ۧ:Ljava/util/regex/Pattern;

    const-string v0, "IV=([^,.*]+)"

    .line 222
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ᩳ֫:Ljava/util/regex/Pattern;

    const-string v0, "TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)"

    .line 224
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->۟֫:Ljava/util/regex/Pattern;

    const-string v0, "TYPE=(PART|MAP)"

    .line 235
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ܶ֫:Ljava/util/regex/Pattern;

    const-string v0, "LANGUAGE=\"((?:.|\u000c)+?)\""

    .line 237
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->᩻֫:Ljava/util/regex/Pattern;

    const-string v0, "NAME=\"((?:.|\u000c)+?)\""

    .line 239
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ۘ֫:Ljava/util/regex/Pattern;

    const-string v0, "GROUP-ID=\"((?:.|\u000c)+?)\""

    .line 241
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->᩺:Ljava/util/regex/Pattern;

    const-string v0, "CHARACTERISTICS=\"((?:.|\u000c)+?)\""

    .line 243
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->֨:Ljava/util/regex/Pattern;

    const-string v0, "INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\""

    .line 245
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ܽ֫:Ljava/util/regex/Pattern;

    const-string v0, "AUTOSELECT"

    .line 246
    invoke-static {v0}, Ll/᩺᩺֫;->֫(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->᩷:Ljava/util/regex/Pattern;

    const-string v0, "DEFAULT"

    .line 247
    invoke-static {v0}, Ll/᩺᩺֫;->֫(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ۗ:Ljava/util/regex/Pattern;

    const-string v0, "FORCED"

    .line 248
    invoke-static {v0}, Ll/᩺᩺֫;->֫(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ۤ:Ljava/util/regex/Pattern;

    const-string v0, "INDEPENDENT"

    .line 249
    invoke-static {v0}, Ll/᩺᩺֫;->֫(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ۧ֫:Ljava/util/regex/Pattern;

    const-string v0, "GAP"

    .line 250
    invoke-static {v0}, Ll/᩺᩺֫;->֫(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ۨ:Ljava/util/regex/Pattern;

    const-string v0, "PRECISE"

    .line 251
    invoke-static {v0}, Ll/᩺᩺֫;->֫(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->۠֫:Ljava/util/regex/Pattern;

    const-string v0, "VALUE=\"((?:.|\u000c)+?)\""

    .line 253
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ۧۧ:Ljava/util/regex/Pattern;

    const-string v0, "IMPORT=\"((?:.|\u000c)+?)\""

    .line 255
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->֫֫:Ljava/util/regex/Pattern;

    const-string v0, "[:,]ID=\"((?:.|\u000c)+?)\""

    .line 257
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->۟:Ljava/util/regex/Pattern;

    const-string v0, "CLASS=\"((?:.|\u000c)+?)\""

    .line 259
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->۠:Ljava/util/regex/Pattern;

    const-string v0, "START-DATE=\"((?:.|\u000c)+?)\""

    .line 261
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->۬֫:Ljava/util/regex/Pattern;

    const-string v0, "CUE=\"((?:.|\u000c)+?)\""

    .line 263
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ۙ:Ljava/util/regex/Pattern;

    const-string v0, "END-DATE=\"((?:.|\u000c)+?)\""

    .line 265
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->۬:Ljava/util/regex/Pattern;

    const-string v0, "PLANNED-DURATION=([\\d\\.]+)\\b"

    .line 267
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->֡֫:Ljava/util/regex/Pattern;

    const-string v0, "END-ON-NEXT"

    .line 268
    invoke-static {v0}, Ll/᩺᩺֫;->֫(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->۫:Ljava/util/regex/Pattern;

    const-string v0, "X-ASSET-URI=\"((?:.|\u000c)+?)\""

    .line 270
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ᩳ:Ljava/util/regex/Pattern;

    const-string v0, "X-ASSET-LIST=\"((?:.|\u000c)+?)\""

    .line 272
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ܽ:Ljava/util/regex/Pattern;

    const-string v0, "X-RESUME-OFFSET=(-?[\\d\\.]+)\\b"

    .line 274
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->᩶֫:Ljava/util/regex/Pattern;

    const-string v0, "X-PLAYOUT-LIMIT=([\\d\\.]+)\\b"

    .line 276
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->֨֫:Ljava/util/regex/Pattern;

    const-string v0, "X-SNAP=\"((?:.|\u000c)+?)\""

    .line 278
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ۗ֫:Ljava/util/regex/Pattern;

    const-string v0, "X-RESTRICT=\"((?:.|\u000c)+?)\""

    .line 280
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->᩹֫:Ljava/util/regex/Pattern;

    const-string v0, "X-CONTENT-MAY-VARY=\"((?:.|\u000c)+?)\""

    .line 282
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->᩶:Ljava/util/regex/Pattern;

    const-string v0, "X-TIMELINE-OCCUPIES=\"((?:.|\u000c)+?)\""

    .line 284
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ۨ֫:Ljava/util/regex/Pattern;

    const-string v0, "X-TIMELINE-STYLE=\"((?:.|\u000c)+?)\""

    .line 286
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->᩺֫:Ljava/util/regex/Pattern;

    const-string v0, "\\{\\$([a-zA-Z0-9\\-_]+)\\}"

    .line 288
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ܽۧ:Ljava/util/regex/Pattern;

    const-string v0, "\\b(X-[A-Z0-9-]+)="

    .line 290
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺᩺֫;->ܶ:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 302
    sget-object v0, Ll/۫᩺֫;->ۘ:Ll/۫᩺֫;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Ll/᩺᩺֫;-><init>(Ll/۫᩺֫;Ll/ۙ᩺֫;)V

    return-void
.end method

.method public constructor <init>(Ll/۫᩺֫;Ll/ۙ᩺֫;)V
    .locals 0

    .line 316
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 317
    iput-object p1, p0, Ll/᩺᩺֫;->֫:Ll/۫᩺֫;

    .line 318
    iput-object p2, p0, Ll/᩺᩺֫;->ۧ:Ll/ۙ᩺֫;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/util/regex/Pattern;D)D
    .locals 0

    .line 1550
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 1551
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 1552
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    .line 155
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1552
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide p0

    return-wide p0

    :cond_0
    return-wide p2
.end method

.method public static ֫(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 3

    .line 1588
    sget-object v0, Ll/᩺᩺֫;->ܽۧ:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 1590
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 1591
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    .line 1592
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    .line 1593
    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1595
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/util/regex/Matcher;->quoteReplacement(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1594
    invoke-virtual {p0, v0, v1}, Ljava/util/regex/Matcher;->appendReplacement(Ljava/lang/StringBuffer;Ljava/lang/String;)Ljava/util/regex/Matcher;

    goto :goto_0

    .line 1600
    :cond_1
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->appendTail(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    .line 1601
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 0

    .line 1542
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 1543
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p2

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1544
    :cond_0
    invoke-interface {p3}, Ljava/util/Map;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_2

    if-nez p2, :cond_1

    goto :goto_0

    .line 1546
    :cond_1
    invoke-static {p2, p3}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_0
    return-object p2
.end method

.method public static ֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 1534
    invoke-static {p0, p1, v0, p2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    return-object p2

    .line 1526
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Couldn\'t match "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1527
    invoke-virtual {p1}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " in "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 1526
    invoke-static {p0}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/util/regex/Pattern;
    .locals 1

    const-string v0, "=(NO|YES)"

    .line 1614
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/۫᩺֫;Ll/ۙ᩺֫;Ll/ۨ᩺֫;Ljava/lang/String;)Ll/ۙ᩺֫;
    .locals 98

    move-object/from16 v0, p0

    .line 757
    iget-boolean v1, v0, Ll/ۤ᩺֫;->ۧ:Z

    .line 760
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 761
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 762
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 763
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 765
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 766
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 767
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 784
    new-instance v8, Ll/᩶᩺֫;

    const-wide v22, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v24, 0x0

    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v19, 0x0

    const-wide v20, -0x7fffffffffffffffL    # -4.9E-324

    move-object/from16 v16, v8

    invoke-direct/range {v16 .. v24}, Ll/᩶᩺֫;-><init>(JZJJZ)V

    .line 795
    new-instance v9, Ljava/util/TreeMap;

    invoke-direct {v9}, Ljava/util/TreeMap;-><init>()V

    const-string v14, ""

    const-wide/16 v16, -0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x1

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    move-object/from16 v11, p1

    move-object v10, v0

    move/from16 v32, v1

    move-object/from16 v62, v4

    move-object/from16 v63, v8

    move-object/from16 v48, v14

    move-wide/from16 v36, v16

    move-object/from16 v4, v18

    move-object/from16 v8, v19

    move-object/from16 v44, v20

    move-object/from16 v33, v22

    move-object/from16 v35, v28

    move-object/from16 v83, v30

    const/4 v1, 0x1

    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v24, 0x0

    const-wide v28, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v30, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v38, 0x0

    const/16 v43, 0x0

    const/16 v45, 0x0

    const-wide/16 v46, 0x0

    const-wide/16 v49, 0x0

    const/16 v61, 0x0

    const/16 v82, 0x0

    const/16 v84, 0x0

    const-wide/16 v85, 0x0

    const-wide/16 v87, 0x0

    const-wide/16 v89, 0x0

    move-object/from16 v22, v21

    const-wide/16 v20, 0x0

    .line 800
    :cond_0
    :goto_0
    invoke-virtual/range {p2 .. p2}, Ll/ۨ᩺֫;->֫()Z

    move-result v40

    if-eqz v40, :cond_78

    .line 801
    invoke-virtual/range {p2 .. p2}, Ll/ۨ᩺֫;->ۧ()Ljava/lang/String;

    move-result-object v12

    const-string v13, "#EXT"

    .line 803
    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_1

    .line 805
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    const-string v13, "#EXT-X-PLAYLIST-TYPE"

    .line 808
    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_3

    .line 809
    sget-object v13, Ll/᩺᩺֫;->ۚ֫:Ljava/util/regex/Pattern;

    invoke-static {v12, v13, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "VOD"

    .line 810
    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_2

    const/16 v23, 0x1

    goto :goto_0

    :cond_2
    const-string v13, "EVENT"

    .line 812
    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_0

    const/16 v23, 0x2

    goto :goto_0

    :cond_3
    const-string v13, "#EXT-X-I-FRAMES-ONLY"

    .line 815
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    const/16 v84, 0x1

    goto :goto_0

    :cond_4
    const-string v13, "#EXT-X-START"

    .line 817
    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    const-wide v40, 0x412e848000000000L    # 1000000.0

    if-eqz v13, :cond_5

    .line 818
    sget-object v13, Ll/᩺᩺֫;->ܰ֫:Ljava/util/regex/Pattern;

    .line 1516
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-static {v12, v13, v0}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v18

    move/from16 v91, v1

    mul-double v0, v18, v40

    double-to-long v0, v0

    .line 819
    sget-object v13, Ll/᩺᩺֫;->۠֫:Ljava/util/regex/Pattern;

    .line 820
    invoke-static {v13, v12}, Ll/᩺᩺֫;->֫(Ljava/util/regex/Pattern;Ljava/lang/String;)Z

    move-result v34

    move-wide/from16 v18, v0

    move-object v13, v6

    move-object v1, v7

    goto/16 :goto_4

    :cond_5
    move/from16 v91, v1

    const-string v0, "#EXT-X-SERVER-CONTROL"

    .line 821
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 1454
    sget-object v0, Ll/᩺᩺֫;->֡:Ljava/util/regex/Pattern;

    move-object v13, v6

    move-object v1, v7

    const-wide/high16 v6, -0x3c20000000000000L    # -9.223372036854776E18

    invoke-static {v12, v0, v6, v7}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    move-result-wide v51

    cmpl-double v0, v51, v6

    if-nez v0, :cond_6

    const-wide v52, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_1

    :cond_6
    mul-double v6, v51, v40

    double-to-long v6, v6

    move-wide/from16 v52, v6

    .line 1459
    :goto_1
    sget-object v0, Ll/᩺᩺֫;->᩵:Ljava/util/regex/Pattern;

    .line 1460
    invoke-static {v0, v12}, Ll/᩺᩺֫;->֫(Ljava/util/regex/Pattern;Ljava/lang/String;)Z

    move-result v54

    .line 1461
    sget-object v0, Ll/᩺᩺֫;->ܰ:Ljava/util/regex/Pattern;

    const-wide/high16 v6, -0x3c20000000000000L    # -9.223372036854776E18

    .line 1462
    invoke-static {v12, v0, v6, v7}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    move-result-wide v55

    cmpl-double v0, v55, v6

    if-nez v0, :cond_7

    const-wide v55, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_2

    :cond_7
    mul-double v6, v55, v40

    double-to-long v6, v6

    move-wide/from16 v55, v6

    .line 1467
    :goto_2
    sget-object v0, Ll/᩺᩺֫;->ᩴ֫:Ljava/util/regex/Pattern;

    const-wide/high16 v6, -0x3c20000000000000L    # -9.223372036854776E18

    invoke-static {v12, v0, v6, v7}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    move-result-wide v57

    cmpl-double v0, v57, v6

    if-nez v0, :cond_8

    const-wide v57, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_3

    :cond_8
    mul-double v6, v57, v40

    double-to-long v6, v6

    move-wide/from16 v57, v6

    .line 1472
    :goto_3
    sget-object v0, Ll/᩺᩺֫;->ᩴ:Ljava/util/regex/Pattern;

    .line 1473
    invoke-static {v0, v12}, Ll/᩺᩺֫;->֫(Ljava/util/regex/Pattern;Ljava/lang/String;)Z

    move-result v59

    .line 1475
    new-instance v63, Ll/᩶᩺֫;

    move-object/from16 v51, v63

    invoke-direct/range {v51 .. v59}, Ll/᩶᩺֫;-><init>(JZJJZ)V

    goto :goto_4

    :cond_9
    move-object v13, v6

    move-object v1, v7

    const-string v0, "#EXT-X-PART-INF"

    .line 823
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 824
    sget-object v0, Ll/᩺᩺֫;->᩵֫:Ljava/util/regex/Pattern;

    .line 1516
    sget-object v6, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-static {v12, v0, v6}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v6

    mul-double v6, v6, v40

    double-to-long v6, v6

    move-wide/from16 v30, v6

    :goto_4
    move-object/from16 v0, p0

    move-object v7, v1

    move-object v6, v13

    :goto_5
    move/from16 v1, v91

    goto/16 :goto_0

    :cond_a
    const-string v0, "#EXT-X-MAP"

    .line 826
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    sget-object v6, Ll/᩺᩺֫;->ܿ:Ljava/util/regex/Pattern;

    const-string v7, "@"

    move-object/from16 v51, v13

    sget-object v13, Ll/᩺᩺֫;->֫ۧ:Ljava/util/regex/Pattern;

    if-eqz v0, :cond_10

    .line 827
    invoke-static {v12, v13, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const/4 v13, 0x0

    .line 1534
    invoke-static {v12, v6, v13, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_b

    .line 830
    sget-object v12, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const/4 v12, -0x1

    .line 1090
    invoke-virtual {v6, v7, v12}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v6

    .line 831
    aget-object v7, v6, v45

    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v36

    .line 832
    array-length v7, v6

    const/4 v12, 0x1

    if-le v7, v12, :cond_b

    .line 833
    aget-object v6, v6, v12

    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v38

    :cond_b
    move-wide/from16 v6, v36

    cmp-long v12, v6, v16

    if-nez v12, :cond_c

    const-wide/16 v52, 0x0

    goto :goto_6

    :cond_c
    move-wide/from16 v52, v38

    :goto_6
    if-eqz v83, :cond_e

    if-eqz v22, :cond_d

    goto :goto_7

    :cond_d
    const-string v0, "The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128."

    .line 842
    invoke-static {v0}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    .line 847
    :cond_e
    :goto_7
    new-instance v13, Ll/᩸᩺֫;

    move-object/from16 v35, v13

    move-object/from16 v36, v0

    move-wide/from16 v37, v52

    move-wide/from16 v39, v6

    move-object/from16 v41, v83

    move-object/from16 v42, v22

    invoke-direct/range {v35 .. v42}, Ll/᩸᩺֫;-><init>(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V

    if-eqz v12, :cond_f

    add-long v52, v52, v6

    :cond_f
    move-wide/from16 v38, v52

    move-object/from16 v0, p0

    move-object v7, v1

    move-object/from16 v35, v13

    move-wide/from16 v36, v16

    move-object/from16 v6, v51

    goto :goto_5

    :cond_10
    const-string v0, "#EXT-X-TARGETDURATION"

    .line 858
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    move-object/from16 v42, v3

    move-object/from16 v92, v4

    const-wide/32 v3, 0xf4240

    if-eqz v0, :cond_11

    .line 859
    sget-object v0, Ll/᩺᩺֫;->ۛ֫:Ljava/util/regex/Pattern;

    .line 1486
    sget-object v6, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-static {v12, v0, v6}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    int-to-long v6, v0

    mul-long v28, v6, v3

    :goto_8
    move-object/from16 v93, v8

    move-object v0, v10

    goto :goto_9

    :cond_11
    const-string v0, "#EXT-X-MEDIA-SEQUENCE"

    .line 860
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 861
    sget-object v0, Ll/᩺᩺֫;->ۡ֫:Ljava/util/regex/Pattern;

    .line 1498
    sget-object v3, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-static {v12, v0, v3}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v24

    move-object/from16 v93, v8

    move-object v0, v10

    move-wide/from16 v49, v24

    :goto_9
    move-object v10, v9

    goto/16 :goto_19

    :cond_12
    const-string v0, "#EXT-X-VERSION"

    .line 863
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 864
    sget-object v0, Ll/᩺᩺֫;->ᩳۧ:Ljava/util/regex/Pattern;

    .line 1486
    sget-object v3, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-static {v12, v0, v3}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move/from16 v91, v0

    goto :goto_8

    :cond_13
    const-string v0, "#EXT-X-DEFINE"

    .line 865
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 866
    sget-object v0, Ll/᩺᩺֫;->֫֫:Ljava/util/regex/Pattern;

    const/4 v3, 0x0

    .line 1534
    invoke-static {v12, v0, v3, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_14

    .line 868
    iget-object v3, v10, Ll/۫᩺֫;->ۡ:Ljava/util/Map;

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_15

    .line 870
    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    .line 875
    :cond_14
    sget-object v0, Ll/᩺᩺֫;->ۘ֫:Ljava/util/regex/Pattern;

    .line 876
    invoke-static {v12, v0, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    sget-object v3, Ll/᩺᩺֫;->ۧۧ:Ljava/util/regex/Pattern;

    .line 877
    invoke-static {v12, v3, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    .line 875
    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_15
    :goto_a
    move-object/from16 v93, v8

    move-object v10, v9

    goto/16 :goto_1b

    :cond_16
    const-string v0, "#EXTINF"

    .line 879
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 880
    sget-object v0, Ll/᩺᩺֫;->ۢ֫:Ljava/util/regex/Pattern;

    .line 1510
    sget-object v6, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-static {v12, v0, v6}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .line 1511
    new-instance v6, Ljava/math/BigDecimal;

    invoke-direct {v6, v0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 1512
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, v3, v4}, Ljava/math/BigDecimal;-><init>(J)V

    invoke-virtual {v6, v0}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->longValue()J

    move-result-wide v87

    .line 881
    sget-object v0, Ll/᩺᩺֫;->ܺ֫:Ljava/util/regex/Pattern;

    invoke-static {v12, v0, v14, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v48

    goto/16 :goto_8

    :cond_17
    const-string v0, "#EXT-X-SKIP"

    .line 882
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_20

    .line 883
    sget-object v0, Ll/᩺᩺֫;->ۙ֫:Ljava/util/regex/Pattern;

    .line 1486
    sget-object v6, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-static {v12, v0, v6}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-eqz v11, :cond_18

    .line 884
    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_18

    const/4 v6, 0x1

    goto :goto_b

    :cond_18
    const/4 v6, 0x0

    :goto_b
    invoke-static {v6}, Ll/᩺֡֫;->ۧ(Z)V

    .line 885
    sget-object v6, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    iget-wide v6, v11, Ll/ۙ᩺֫;->ۡ:J

    iget-object v10, v11, Ll/ۙ᩺֫;->֡:Ll/ܳ۬ܺ;

    sub-long v6, v24, v6

    long-to-int v7, v6

    add-int/2addr v0, v7

    if-ltz v7, :cond_1f

    .line 887
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v6

    if-gt v0, v6, :cond_1f

    :goto_c
    if-ge v7, v0, :cond_1e

    .line 892
    invoke-interface {v10, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩸᩺֫;

    .line 893
    iget-wide v12, v11, Ll/ۙ᩺֫;->ۡ:J

    cmp-long v33, v24, v12

    if-eqz v33, :cond_1a

    .line 897
    iget v11, v11, Ll/ۙ᩺֫;->ᩳ:I

    sub-int v11, v11, v27

    iget v12, v6, Ll/᩹᩺֫;->ۛ:I

    add-int/2addr v11, v12

    .line 193
    iget-object v12, v6, Ll/᩸᩺֫;->ܰ:Ll/ܳ۬ܺ;

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    const/16 v33, 0x0

    move-wide/from16 v40, v85

    const/4 v3, 0x0

    .line 195
    :goto_d
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_19

    .line 196
    invoke-interface {v12, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۠᩺֫;

    move/from16 v54, v0

    .line 274
    new-instance v0, Ll/۠᩺֫;

    move-object/from16 v64, v0

    move-object/from16 v55, v10

    iget-object v10, v4, Ll/᩹᩺֫;->᩺:Ljava/lang/String;

    move-object/from16 v65, v10

    iget-object v10, v4, Ll/᩹᩺֫;->ۤ:Ll/᩸᩺֫;

    move-object/from16 v66, v10

    move-object/from16 v93, v8

    move-object v10, v9

    iget-wide v8, v4, Ll/᩹᩺֫;->ۙ:J

    move-wide/from16 v67, v8

    iget-object v8, v4, Ll/᩹᩺֫;->᩶:Ll/᩵ᩴ֫;

    move-object/from16 v72, v8

    iget-object v8, v4, Ll/᩹᩺֫;->۬:Ljava/lang/String;

    move-object/from16 v73, v8

    iget-object v8, v4, Ll/᩹᩺֫;->ۗ:Ljava/lang/String;

    move-object/from16 v74, v8

    iget-wide v8, v4, Ll/᩹᩺֫;->᩹:J

    move-wide/from16 v75, v8

    iget-wide v8, v4, Ll/᩹᩺֫;->᩸:J

    move-wide/from16 v77, v8

    iget-boolean v8, v4, Ll/᩹᩺֫;->۫:Z

    move/from16 v79, v8

    iget-boolean v8, v4, Ll/۠᩺֫;->ܰ:Z

    move/from16 v80, v8

    iget-boolean v8, v4, Ll/۠᩺֫;->۟:Z

    move/from16 v81, v8

    move/from16 v69, v11

    move-wide/from16 v70, v40

    invoke-direct/range {v64 .. v81}, Ll/۠᩺֫;-><init>(Ljava/lang/String;Ll/᩸᩺֫;JIJLl/᩵ᩴ֫;Ljava/lang/String;Ljava/lang/String;JJZZZ)V

    .line 197
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    iget-wide v8, v4, Ll/᩹᩺֫;->ۙ:J

    add-long v40, v40, v8

    add-int/lit8 v3, v3, 0x1

    move-object v9, v10

    move/from16 v0, v54

    move-object/from16 v10, v55

    move-object/from16 v8, v93

    goto :goto_d

    :cond_19
    move/from16 v54, v0

    move-object/from16 v93, v8

    move-object/from16 v55, v10

    move-object v10, v9

    .line 200
    new-instance v0, Ll/᩸᩺֫;

    move-object/from16 v64, v0

    iget-object v3, v6, Ll/᩹᩺֫;->᩺:Ljava/lang/String;

    move-object/from16 v65, v3

    iget-object v3, v6, Ll/᩹᩺֫;->ۤ:Ll/᩸᩺֫;

    move-object/from16 v66, v3

    iget-object v3, v6, Ll/᩸᩺֫;->۟:Ljava/lang/String;

    move-object/from16 v67, v3

    iget-wide v3, v6, Ll/᩹᩺֫;->ۙ:J

    move-wide/from16 v68, v3

    iget-object v3, v6, Ll/᩹᩺֫;->᩶:Ll/᩵ᩴ֫;

    move-object/from16 v73, v3

    iget-object v3, v6, Ll/᩹᩺֫;->۬:Ljava/lang/String;

    move-object/from16 v74, v3

    iget-object v3, v6, Ll/᩹᩺֫;->ۗ:Ljava/lang/String;

    move-object/from16 v75, v3

    iget-wide v3, v6, Ll/᩹᩺֫;->᩹:J

    move-wide/from16 v76, v3

    iget-wide v3, v6, Ll/᩹᩺֫;->᩸:J

    move-wide/from16 v78, v3

    iget-boolean v3, v6, Ll/᩹᩺֫;->۫:Z

    move/from16 v80, v3

    move/from16 v70, v11

    move-wide/from16 v71, v85

    move-object/from16 v81, v13

    invoke-direct/range {v64 .. v81}, Ll/᩸᩺֫;-><init>(Ljava/lang/String;Ll/᩸᩺֫;Ljava/lang/String;JIJLl/᩵ᩴ֫;Ljava/lang/String;Ljava/lang/String;JJZLjava/util/List;)V

    move-object v6, v0

    goto :goto_e

    :cond_1a
    move/from16 v54, v0

    move-object/from16 v93, v8

    move-object/from16 v55, v10

    move-object v10, v9

    .line 903
    :goto_e
    invoke-virtual {v15, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 904
    iget-wide v3, v6, Ll/᩹᩺֫;->ۙ:J

    iget-object v0, v6, Ll/᩹᩺֫;->ۗ:Ljava/lang/String;

    add-long v85, v85, v3

    .line 906
    iget-wide v3, v6, Ll/᩹᩺֫;->᩸:J

    cmp-long v8, v3, v16

    if-eqz v8, :cond_1b

    .line 907
    iget-wide v8, v6, Ll/᩹᩺֫;->᩹:J

    add-long/2addr v8, v3

    move-wide/from16 v38, v8

    .line 909
    :cond_1b
    iget v3, v6, Ll/᩹᩺֫;->ۛ:I

    .line 910
    iget-object v4, v6, Ll/᩹᩺֫;->ۤ:Ll/᩸᩺֫;

    .line 911
    iget-object v8, v6, Ll/᩹᩺֫;->᩶:Ll/᩵ᩴ֫;

    .line 912
    iget-object v6, v6, Ll/᩹᩺֫;->۬:Ljava/lang/String;

    if-eqz v0, :cond_1c

    .line 914
    invoke-static/range {v49 .. v50}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1d

    :cond_1c
    move-object/from16 v22, v0

    :cond_1d
    const-wide/16 v11, 0x1

    add-long v49, v49, v11

    add-int/lit8 v7, v7, 0x1

    move-object/from16 v11, p1

    move/from16 v82, v3

    move-object/from16 v35, v4

    move-object/from16 v83, v6

    move-object/from16 v33, v8

    move-object v9, v10

    move/from16 v0, v54

    move-object/from16 v10, v55

    move-wide/from16 v46, v85

    move-object/from16 v8, v93

    goto/16 :goto_c

    :cond_1e
    move-object/from16 v93, v8

    move-object/from16 v0, p0

    move-object v10, v0

    move-object/from16 v11, p1

    move-object v7, v1

    move-object/from16 v3, v42

    move-object/from16 v6, v51

    move/from16 v1, v91

    :goto_f
    move-object/from16 v4, v92

    goto/16 :goto_0

    .line 889
    :cond_1f
    new-instance v0, Ll/ۛ᩺֫;

    .line 80
    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    .line 889
    throw v0

    :cond_20
    move-object/from16 v93, v8

    move-object v10, v9

    const-string v0, "#EXT-X-KEY"

    .line 919
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_28

    .line 920
    sget-object v0, Ll/᩺᩺֫;->ۖ֫:Ljava/util/regex/Pattern;

    invoke-static {v12, v0, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .line 921
    sget-object v3, Ll/᩺᩺֫;->ܿ֫:Ljava/util/regex/Pattern;

    const-string v4, "identity"

    .line 922
    invoke-static {v12, v3, v4, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    const-string v6, "NONE"

    .line 925
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_21

    .line 926
    invoke-virtual {v10}, Ljava/util/TreeMap;->clear()V

    const/4 v0, 0x0

    move-object/from16 v8, v93

    goto :goto_13

    .line 929
    :cond_21
    sget-object v6, Ll/᩺᩺֫;->ᩳ֫:Ljava/util/regex/Pattern;

    const/4 v7, 0x0

    .line 1534
    invoke-static {v12, v6, v7, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    .line 930
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_23

    const-string v3, "AES-128"

    .line 931
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_22

    .line 933
    invoke-static {v12, v13, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v8, v93

    goto :goto_15

    :cond_22
    move-object/from16 v8, v93

    goto :goto_14

    :cond_23
    if-nez v93, :cond_26

    const-string v4, "SAMPLE-AES-CENC"

    .line 1480
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_25

    const-string v4, "SAMPLE-AES-CTR"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_24

    goto :goto_10

    :cond_24
    const-string v0, "cbcs"

    goto :goto_11

    :cond_25
    :goto_10
    const-string v0, "cenc"

    :goto_11
    move-object v8, v0

    goto :goto_12

    :cond_26
    move-object/from16 v8, v93

    .line 942
    :goto_12
    invoke-static {v12, v3, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)Ll/ᩴᩴ֫;

    move-result-object v0

    if-eqz v0, :cond_27

    .line 945
    invoke-virtual {v10, v3, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, v6

    :goto_13
    const/16 v33, 0x0

    move-object v6, v0

    :cond_27
    :goto_14
    const/4 v0, 0x0

    :goto_15
    move-object/from16 v11, p1

    move-object/from16 v83, v0

    move-object/from16 v22, v6

    move-object/from16 v0, p0

    goto/16 :goto_1a

    :cond_28
    const-string v0, "#EXT-X-BYTERANGE"

    .line 949
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_29

    .line 950
    sget-object v0, Ll/᩺᩺֫;->ܺ:Ljava/util/regex/Pattern;

    invoke-static {v12, v0, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .line 951
    sget-object v3, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const/4 v3, -0x1

    .line 1090
    invoke-virtual {v0, v7, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    .line 952
    aget-object v3, v0, v45

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v36

    .line 953
    array-length v3, v0

    const/4 v4, 0x1

    if-le v3, v4, :cond_2c

    .line 954
    aget-object v0, v0, v4

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v38

    goto :goto_18

    :cond_29
    const-string v0, "#EXT-X-DISCONTINUITY-SEQUENCE"

    .line 956
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/16 v3, 0x3a

    if-eqz v0, :cond_2a

    .line 958
    invoke-virtual {v12, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v12, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v27

    const/16 v26, 0x1

    :goto_16
    move-object/from16 v0, p0

    move-object/from16 v11, p1

    move-object v7, v1

    move-object v9, v10

    move-object/from16 v3, v42

    move-object/from16 v6, v51

    move/from16 v1, v91

    move-object/from16 v4, v92

    move-object/from16 v8, v93

    :goto_17
    move-object v10, v0

    goto/16 :goto_0

    :cond_2a
    const-string v0, "#EXT-X-DISCONTINUITY"

    .line 959
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2b

    add-int/lit8 v82, v82, 0x1

    goto :goto_18

    :cond_2b
    const-string v0, "#EXT-X-PROGRAM-DATE-TIME"

    .line 961
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2e

    const-wide/16 v8, 0x0

    cmp-long v0, v20, v8

    if-nez v0, :cond_2d

    .line 964
    invoke-virtual {v12, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v12, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۘ֨֫;->ᩳ(Ljava/lang/String;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v3

    sub-long v20, v3, v85

    :cond_2c
    :goto_18
    move-object/from16 v0, p0

    move-object/from16 v11, p1

    :goto_19
    move-object/from16 v8, v93

    :goto_1a
    move-object v7, v1

    move-object v9, v10

    move-object/from16 v3, v42

    move-object/from16 v6, v51

    move/from16 v1, v91

    move-object/from16 v4, v92

    move-object v10, v0

    move-object/from16 v0, p0

    goto/16 :goto_0

    :cond_2d
    :goto_1b
    move-object/from16 v8, p3

    goto/16 :goto_1d

    :cond_2e
    const-string v0, "#EXT-X-GAP"

    .line 967
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2f

    const/16 v61, 0x1

    goto :goto_16

    :cond_2f
    const-string v0, "#EXT-X-INDEPENDENT-SEGMENTS"

    .line 969
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_30

    const/16 v32, 0x1

    goto :goto_16

    :cond_30
    const-string v0, "#EXT-X-ENDLIST"

    .line 971
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_31

    const/16 v43, 0x1

    goto :goto_16

    :cond_31
    const-string v0, "#EXT-X-RENDITION-REPORT"

    .line 973
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_33

    .line 974
    sget-object v0, Ll/᩺᩺֫;->ۜ֫:Ljava/util/regex/Pattern;

    invoke-static {v0, v12}, Ll/᩺᩺֫;->ۧ(Ljava/util/regex/Pattern;Ljava/lang/String;)J

    move-result-wide v3

    .line 975
    sget-object v0, Ll/᩺᩺֫;->᩷֫:Ljava/util/regex/Pattern;

    .line 1490
    invoke-virtual {v0, v12}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 1491
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v6

    if-eqz v6, :cond_32

    const/4 v6, 0x1

    .line 1492
    invoke-virtual {v0, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1492
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    goto :goto_1c

    :cond_32
    const/4 v0, -0x1

    .line 976
    :goto_1c
    invoke-static {v12, v13, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v8, p3

    .line 977
    invoke-static {v8, v6}, Ll/ۡ֨֫;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    .line 978
    new-instance v7, Ll/ܶ᩺֫;

    invoke-direct {v7, v6, v3, v4, v0}, Ll/ܶ᩺֫;-><init>(Landroid/net/Uri;JI)V

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1d

    :cond_33
    move-object/from16 v8, p3

    const-string v0, "#EXT-X-PRELOAD-HINT"

    .line 979
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3d

    if-eqz v92, :cond_34

    goto :goto_1d

    .line 983
    :cond_34
    sget-object v0, Ll/᩺᩺֫;->ܶ֫:Ljava/util/regex/Pattern;

    invoke-static {v12, v0, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "PART"

    .line 984
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_35

    :goto_1d
    move-object/from16 v66, v1

    move-object/from16 v67, v5

    move-object/from16 v41, v10

    move-object/from16 v64, v14

    move-object v0, v15

    move-object/from16 v3, v42

    move-object/from16 v4, v51

    move-object/from16 v40, v62

    goto/16 :goto_4b

    .line 987
    :cond_35
    invoke-static {v12, v13, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v65

    .line 988
    sget-object v0, Ll/᩺᩺֫;->ۘ:Ljava/util/regex/Pattern;

    .line 989
    invoke-static {v0, v12}, Ll/᩺᩺֫;->ۧ(Ljava/util/regex/Pattern;Ljava/lang/String;)J

    move-result-wide v3

    .line 990
    sget-object v0, Ll/᩺᩺֫;->ۖ:Ljava/util/regex/Pattern;

    .line 991
    invoke-static {v0, v12}, Ll/᩺᩺֫;->ۧ(Ljava/util/regex/Pattern;Ljava/lang/String;)J

    move-result-wide v77

    if-nez v83, :cond_36

    const/4 v0, 0x0

    :goto_1e
    move-object/from16 v74, v0

    goto :goto_1f

    :cond_36
    if-eqz v22, :cond_37

    move-object/from16 v74, v22

    goto :goto_1f

    .line 1388
    :cond_37
    invoke-static/range {v49 .. v50}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_1e

    :goto_1f
    if-nez v33, :cond_39

    .line 996
    invoke-virtual {v10}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_39

    .line 997
    invoke-virtual {v10}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    const/4 v6, 0x0

    new-array v6, v6, [Ll/ᩴᩴ֫;

    invoke-interface {v0, v6}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ᩴᩴ֫;

    .line 998
    new-instance v6, Ll/᩵ᩴ֫;

    move-object/from16 v9, v93

    invoke-direct {v6, v9, v0}, Ll/᩵ᩴ֫;-><init>(Ljava/lang/String;[Ll/ᩴᩴ֫;)V

    if-nez v44, :cond_38

    .line 1000
    invoke-static {v9, v0}, Ll/᩺᩺֫;->֫(Ljava/lang/String;[Ll/ᩴᩴ֫;)Ll/᩵ᩴ֫;

    move-result-object v44

    :cond_38
    move-object/from16 v33, v6

    goto :goto_20

    :cond_39
    move-object/from16 v9, v93

    :goto_20
    cmp-long v0, v3, v16

    if-eqz v0, :cond_3b

    cmp-long v6, v77, v16

    if-eqz v6, :cond_3a

    goto :goto_21

    :cond_3a
    move-object/from16 v4, v92

    goto :goto_23

    .line 1005
    :cond_3b
    :goto_21
    new-instance v6, Ll/۠᩺֫;

    if-eqz v0, :cond_3c

    move-wide/from16 v75, v3

    goto :goto_22

    :cond_3c
    const-wide/16 v75, 0x0

    :goto_22
    const/16 v80, 0x0

    const/16 v81, 0x1

    const-wide/16 v67, 0x0

    const/16 v79, 0x0

    move-object/from16 v64, v6

    move-object/from16 v66, v35

    move/from16 v69, v82

    move-wide/from16 v70, v46

    move-object/from16 v72, v33

    move-object/from16 v73, v83

    .line 1015
    invoke-direct/range {v64 .. v81}, Ll/۠᩺֫;-><init>(Ljava/lang/String;Ll/᩸᩺֫;JIJLl/᩵ᩴ֫;Ljava/lang/String;Ljava/lang/String;JJZZZ)V

    move-object v4, v6

    :goto_23
    const/4 v0, 0x0

    move-object/from16 v13, v62

    :goto_24
    const/16 v45, 0x0

    goto/16 :goto_29

    :cond_3d
    move-object/from16 v9, v93

    const-string v0, "#EXT-X-PART"

    .line 1021
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_47

    if-nez v83, :cond_3e

    const/4 v0, 0x0

    :goto_25
    move-object/from16 v74, v0

    goto :goto_26

    :cond_3e
    if-eqz v22, :cond_3f

    move-object/from16 v74, v22

    goto :goto_26

    .line 1388
    :cond_3f
    invoke-static/range {v49 .. v50}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_25

    .line 1026
    :goto_26
    invoke-static {v12, v13, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v65

    .line 1027
    sget-object v0, Ll/᩺᩺֫;->ܳ:Ljava/util/regex/Pattern;

    .line 1516
    sget-object v3, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-static {v12, v0, v3}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v3

    mul-double v3, v3, v40

    double-to-long v3, v3

    .line 1029
    sget-object v0, Ll/᩺᩺֫;->ۧ֫:Ljava/util/regex/Pattern;

    .line 1030
    invoke-static {v0, v12}, Ll/᩺᩺֫;->֫(Ljava/util/regex/Pattern;Ljava/lang/String;)Z

    move-result v0

    if-eqz v32, :cond_40

    .line 1032
    invoke-interface/range {v62 .. v62}, Ljava/util/List;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_40

    const/4 v11, 0x1

    goto :goto_27

    :cond_40
    const/4 v11, 0x0

    :goto_27
    or-int v80, v0, v11

    .line 1033
    sget-object v0, Ll/᩺᩺֫;->ۨ:Ljava/util/regex/Pattern;

    invoke-static {v0, v12}, Ll/᩺᩺֫;->֫(Ljava/util/regex/Pattern;Ljava/lang/String;)Z

    move-result v79

    const/4 v0, 0x0

    .line 1534
    invoke-static {v12, v6, v0, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_41

    .line 1038
    sget-object v6, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const/4 v6, -0x1

    .line 1090
    invoke-virtual {v0, v7, v6}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    const/4 v6, 0x0

    .line 1039
    aget-object v6, v0, v6

    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    .line 1040
    array-length v11, v0

    const/4 v12, 0x1

    if-le v11, v12, :cond_42

    .line 1041
    aget-object v0, v0, v12

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v89

    goto :goto_28

    :cond_41
    move-wide/from16 v6, v16

    :cond_42
    :goto_28
    cmp-long v0, v6, v16

    if-nez v0, :cond_43

    const-wide/16 v89, 0x0

    :cond_43
    if-nez v33, :cond_45

    .line 1047
    invoke-virtual {v10}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_45

    .line 1048
    invoke-virtual {v10}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v11

    const/4 v12, 0x0

    new-array v12, v12, [Ll/ᩴᩴ֫;

    invoke-interface {v11, v12}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v11

    check-cast v11, [Ll/ᩴᩴ֫;

    .line 1049
    new-instance v12, Ll/᩵ᩴ֫;

    invoke-direct {v12, v9, v11}, Ll/᩵ᩴ֫;-><init>(Ljava/lang/String;[Ll/ᩴᩴ֫;)V

    if-nez v44, :cond_44

    .line 1051
    invoke-static {v9, v11}, Ll/᩺᩺֫;->֫(Ljava/lang/String;[Ll/ᩴᩴ֫;)Ll/᩵ᩴ֫;

    move-result-object v44

    :cond_44
    move-object/from16 v33, v12

    .line 1054
    :cond_45
    new-instance v11, Ll/۠᩺֫;

    move-object/from16 v64, v11

    const/16 v81, 0x0

    move-object/from16 v66, v35

    move-wide/from16 v67, v3

    move/from16 v69, v82

    move-wide/from16 v70, v46

    move-object/from16 v72, v33

    move-object/from16 v73, v83

    move-wide/from16 v75, v89

    move-wide/from16 v77, v6

    invoke-direct/range {v64 .. v81}, Ll/۠᩺֫;-><init>(Ljava/lang/String;Ll/᩸᩺֫;JIJLl/᩵ᩴ֫;Ljava/lang/String;Ljava/lang/String;JJZZZ)V

    move-object/from16 v13, v62

    invoke-interface {v13, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-long v46, v46, v3

    if-eqz v0, :cond_46

    add-long v89, v89, v6

    :cond_46
    const/4 v0, 0x0

    move-object/from16 v4, v92

    goto/16 :goto_24

    :goto_29
    move-object/from16 v0, p0

    move-object/from16 v11, p1

    move-object v7, v1

    move-object v8, v9

    move-object v9, v10

    move-object/from16 v62, v13

    move-object/from16 v3, v42

    move-object/from16 v6, v51

    move/from16 v1, v91

    goto/16 :goto_17

    :cond_47
    move-object/from16 v13, v62

    const-string v0, "#EXT-X-DATERANGE"

    .line 1073
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6e

    sget-object v0, Ll/᩺᩺֫;->۠:Ljava/util/regex/Pattern;

    .line 1074
    invoke-static {v12, v0, v14, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "com.apple.hls.interstitial"

    .line 1075
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6e

    .line 1076
    sget-object v0, Ll/᩺᩺֫;->۟:Ljava/util/regex/Pattern;

    invoke-static {v12, v0, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .line 1078
    sget-object v3, Ll/᩺᩺֫;->ᩳ:Ljava/util/regex/Pattern;

    const/4 v4, 0x0

    .line 1534
    invoke-static {v12, v3, v4, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_48

    .line 1080
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    goto :goto_2a

    :cond_48
    move-object v3, v4

    .line 1083
    :goto_2a
    sget-object v6, Ll/᩺᩺֫;->ܽ:Ljava/util/regex/Pattern;

    .line 1534
    invoke-static {v12, v6, v4, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_49

    .line 1086
    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    goto :goto_2b

    :cond_49
    move-object v6, v4

    .line 1090
    :goto_2b
    sget-object v7, Ll/᩺᩺֫;->۬֫:Ljava/util/regex/Pattern;

    .line 1534
    invoke-static {v12, v7, v4, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_4a

    .line 1093
    invoke-static {v7}, Ll/ۘ֨֫;->ᩳ(Ljava/lang/String;)J

    move-result-wide v52

    invoke-static/range {v52 .. v53}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v52

    move-wide/from16 v94, v52

    goto :goto_2c

    :cond_4a
    const-wide v94, -0x7fffffffffffffffL    # -4.9E-324

    .line 1097
    :goto_2c
    sget-object v7, Ll/᩺᩺֫;->۬:Ljava/util/regex/Pattern;

    .line 1534
    invoke-static {v12, v7, v4, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_4b

    .line 1100
    invoke-static {v7}, Ll/ۘ֨֫;->ᩳ(Ljava/lang/String;)J

    move-result-wide v52

    invoke-static/range {v52 .. v53}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v52

    move-wide/from16 v96, v52

    goto :goto_2d

    :cond_4b
    const-wide v96, -0x7fffffffffffffffL    # -4.9E-324

    .line 1102
    :goto_2d
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1103
    sget-object v11, Ll/᩺᩺֫;->ۙ:Ljava/util/regex/Pattern;

    .line 1534
    invoke-static {v12, v11, v4, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    const-string v11, ","

    if-eqz v4, :cond_4f

    .line 1105
    sget-object v45, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const/4 v8, -0x1

    .line 1090
    invoke-virtual {v4, v11, v8}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v4

    .line 1106
    array-length v8, v4

    const/16 v45, 0x0

    move-object/from16 v64, v14

    const/4 v14, 0x0

    :goto_2e
    if-ge v14, v8, :cond_50

    aget-object v45, v4, v14

    move-object/from16 v52, v4

    .line 1107
    invoke-virtual/range {v45 .. v45}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 1108
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v45

    sparse-switch v45, :sswitch_data_0

    move/from16 v45, v8

    goto :goto_2f

    :sswitch_0
    move/from16 v45, v8

    const-string v8, "POST"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4c

    goto :goto_2f

    :cond_4c
    const/4 v8, 0x2

    goto :goto_30

    :sswitch_1
    move/from16 v45, v8

    const-string v8, "ONCE"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4d

    goto :goto_2f

    :cond_4d
    const/4 v8, 0x1

    goto :goto_30

    :sswitch_2
    move/from16 v45, v8

    const-string v8, "PRE"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4e

    goto :goto_2f

    :cond_4e
    const/4 v8, 0x0

    goto :goto_30

    :goto_2f
    const/4 v8, -0x1

    :goto_30
    packed-switch v8, :pswitch_data_0

    goto :goto_31

    .line 1112
    :pswitch_0
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_31
    add-int/lit8 v14, v14, 0x1

    move/from16 v8, v45

    move-object/from16 v4, v52

    goto :goto_2e

    :cond_4f
    move-object/from16 v64, v14

    .line 1119
    :cond_50
    sget-object v4, Ll/᩺᩺֫;->᩻:Ljava/util/regex/Pattern;

    move-object/from16 v65, v15

    const-wide/high16 v14, -0x4010000000000000L    # -1.0

    invoke-static {v12, v4, v14, v15}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    move-result-wide v14

    const-wide/16 v52, 0x0

    cmpl-double v4, v14, v52

    if-ltz v4, :cond_51

    mul-double v14, v14, v40

    double-to-long v14, v14

    goto :goto_32

    :cond_51
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 1124
    :goto_32
    sget-object v4, Ll/᩺᩺֫;->֡֫:Ljava/util/regex/Pattern;

    move-object/from16 v93, v9

    const-wide/high16 v8, -0x4010000000000000L    # -1.0

    invoke-static {v12, v4, v8, v9}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    move-result-wide v8

    cmpl-double v4, v8, v52

    if-ltz v4, :cond_52

    mul-double v8, v8, v40

    double-to-long v8, v8

    goto :goto_33

    :cond_52
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 1129
    :goto_33
    sget-object v4, Ll/᩺᩺֫;->۫:Ljava/util/regex/Pattern;

    invoke-static {v4, v12}, Ll/᩺᩺֫;->֫(Ljava/util/regex/Pattern;Ljava/lang/String;)Z

    move-result v4

    move-object/from16 v66, v1

    .line 1130
    sget-object v1, Ll/᩺᩺֫;->᩶֫:Ljava/util/regex/Pattern;

    move/from16 v45, v4

    move-object/from16 v67, v5

    const-wide/16 v4, 0x1

    .line 1131
    invoke-static {v12, v1, v4, v5}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    move-result-wide v54

    cmpl-double v1, v54, v4

    if-eqz v1, :cond_53

    mul-double v4, v54, v40

    double-to-long v4, v4

    goto :goto_34

    :cond_53
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 1136
    :goto_34
    sget-object v1, Ll/᩺᩺֫;->֨֫:Ljava/util/regex/Pattern;

    move-wide/from16 v54, v4

    const-wide/high16 v4, -0x4010000000000000L    # -1.0

    invoke-static {v12, v1, v4, v5}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    move-result-wide v4

    cmpl-double v1, v4, v52

    if-ltz v1, :cond_54

    mul-double v4, v4, v40

    double-to-long v4, v4

    goto :goto_35

    :cond_54
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 1141
    :goto_35
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v40, v13

    .line 1142
    sget-object v13, Ll/᩺᩺֫;->ۗ֫:Ljava/util/regex/Pattern;

    move-object/from16 v41, v10

    const/4 v10, 0x0

    .line 1534
    invoke-static {v12, v13, v10, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_56

    .line 1144
    sget-object v13, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const/4 v13, -0x1

    .line 1090
    invoke-virtual {v10, v11, v13}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v10

    .line 1145
    array-length v13, v10

    const/16 v52, 0x0

    move-wide/from16 v56, v4

    const/4 v4, 0x0

    :goto_36
    if-ge v4, v13, :cond_57

    aget-object v5, v10, v4

    .line 1146
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    .line 1147
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v52, v10

    const-string v10, "IN"

    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_55

    const-string v10, "OUT"

    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_55

    goto :goto_37

    .line 1150
    :cond_55
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_37
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v10, v52

    goto :goto_36

    :cond_56
    move-wide/from16 v56, v4

    .line 1157
    :cond_57
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1158
    sget-object v5, Ll/᩺᩺֫;->᩹֫:Ljava/util/regex/Pattern;

    const/4 v10, 0x0

    .line 1534
    invoke-static {v12, v5, v10, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_59

    .line 1161
    sget-object v10, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const/4 v10, -0x1

    .line 1090
    invoke-virtual {v5, v11, v10}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v5

    .line 1162
    array-length v10, v5

    const/4 v11, 0x0

    :goto_38
    if-ge v11, v10, :cond_59

    aget-object v13, v5, v11

    .line 1163
    invoke-virtual {v13}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v13

    .line 1164
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v52, v5

    const-string v5, "JUMP"

    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_58

    const-string v5, "SKIP"

    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_58

    goto :goto_39

    .line 1167
    :cond_58
    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_39
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v5, v52

    goto :goto_38

    .line 1176
    :cond_59
    sget-object v5, Ll/᩺᩺֫;->᩶:Ljava/util/regex/Pattern;

    const/4 v10, 0x0

    .line 1534
    invoke-static {v12, v5, v10, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_5a

    const-string v11, "NO"

    .line 1179
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    xor-int/lit8 v5, v5, 0x1

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    goto :goto_3a

    :cond_5a
    move-object v5, v10

    .line 1183
    :goto_3a
    sget-object v11, Ll/᩺᩺֫;->ۨ֫:Ljava/util/regex/Pattern;

    .line 1534
    invoke-static {v12, v11, v10, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_5c

    const-string v11, "RANGE"

    .line 1186
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_5b

    goto :goto_3b

    :cond_5b
    const-string v11, "POINT"

    .line 1188
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5c

    goto :goto_3b

    :cond_5c
    const/4 v11, 0x0

    .line 1194
    :goto_3b
    sget-object v10, Ll/᩺᩺֫;->᩺֫:Ljava/util/regex/Pattern;

    const/4 v13, 0x0

    .line 1534
    invoke-static {v12, v10, v13, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_5e

    const-string v13, "PRIMARY"

    .line 1197
    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v52

    if-eqz v52, :cond_5d

    goto :goto_3c

    :cond_5d
    const-string v13, "HIGHLIGHT"

    .line 1199
    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5e

    goto :goto_3c

    :cond_5e
    const/4 v13, 0x0

    .line 1204
    :goto_3c
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v52, v13

    const/16 v13, 0x11

    .line 1205
    invoke-virtual {v12, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v12

    .line 1206
    sget-object v13, Ll/᩺᩺֫;->ܶ:Ljava/util/regex/Pattern;

    invoke-virtual {v13, v12}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v13

    .line 1207
    :goto_3d
    invoke-virtual {v13}, Ljava/util/regex/Matcher;->find()Z

    move-result v53

    if-eqz v53, :cond_6c

    move-object/from16 v53, v11

    .line 1208
    invoke-virtual {v13}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v11

    .line 1209
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    move-result v58

    sparse-switch v58, :sswitch_data_1

    move-object/from16 v58, v13

    goto/16 :goto_3e

    :sswitch_3
    move-object/from16 v58, v13

    const-string v13, "X-ASSET-URI="

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_5f

    goto/16 :goto_3e

    :cond_5f
    const/16 v13, 0x8

    goto/16 :goto_3f

    :sswitch_4
    move-object/from16 v58, v13

    const-string v13, "X-RESUME-OFFSET="

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_60

    goto/16 :goto_3e

    :cond_60
    const/4 v13, 0x7

    goto/16 :goto_3f

    :sswitch_5
    move-object/from16 v58, v13

    const-string v13, "X-RESTRICT="

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_61

    goto :goto_3e

    :cond_61
    const/4 v13, 0x6

    goto :goto_3f

    :sswitch_6
    move-object/from16 v58, v13

    const-string v13, "X-TIMELINE-OCCUPIES="

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_62

    goto :goto_3e

    :cond_62
    const/4 v13, 0x5

    goto :goto_3f

    :sswitch_7
    move-object/from16 v58, v13

    const-string v13, "X-ASSET-LIST="

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_63

    goto :goto_3e

    :cond_63
    const/4 v13, 0x4

    goto :goto_3f

    :sswitch_8
    move-object/from16 v58, v13

    const-string v13, "X-TIMELINE-STYLE="

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_64

    goto :goto_3e

    :cond_64
    const/4 v13, 0x3

    goto :goto_3f

    :sswitch_9
    move-object/from16 v58, v13

    const-string v13, "X-PLAYOUT-LIMIT="

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_65

    goto :goto_3e

    :cond_65
    const/4 v13, 0x2

    goto :goto_3f

    :sswitch_a
    move-object/from16 v58, v13

    const-string v13, "X-CONTENT-MAY-VARY="

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_66

    goto :goto_3e

    :cond_66
    const/4 v13, 0x1

    goto :goto_3f

    :sswitch_b
    move-object/from16 v58, v13

    const-string v13, "X-SNAP="

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_67

    goto :goto_3e

    :cond_67
    const/4 v13, 0x0

    goto :goto_3f

    :goto_3e
    const/4 v13, -0x1

    :goto_3f
    packed-switch v13, :pswitch_data_1

    const/4 v13, 0x1

    move-object/from16 v59, v5

    const/4 v5, 0x0

    .line 0
    invoke-static {v13, v5, v11}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v11, "="

    invoke-static {v5, v11}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 1561
    invoke-virtual {v12, v11}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v13

    .line 1562
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v11

    add-int/2addr v11, v13

    .line 1563
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v13

    move-object/from16 v60, v4

    add-int/lit8 v4, v11, 0x1

    if-ne v13, v4, :cond_68

    const/4 v4, 0x1

    goto :goto_40

    :pswitch_1
    move-object/from16 v60, v4

    move-object/from16 v59, v5

    move-object v13, v7

    move-wide/from16 v68, v8

    goto/16 :goto_43

    :cond_68
    const/4 v4, 0x2

    :goto_40
    add-int/2addr v4, v11

    .line 1565
    invoke-virtual {v12, v11, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    const-string v11, "\""

    .line 1566
    invoke-virtual {v4, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_69

    .line 1568
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "=\"((?:.|\u000c)+?)\""

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v4

    .line 1569
    invoke-static {v12, v4, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    .line 1570
    new-instance v11, Ll/֡᩺֫;

    const/4 v13, 0x0

    invoke-direct {v11, v13, v5, v4}, Ll/֡᩺֫;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object v13, v7

    move-wide/from16 v68, v8

    goto :goto_42

    :cond_69
    const-string v11, "0x"

    .line 1572
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_6b

    const-string v11, "0X"

    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6a

    goto :goto_41

    .line 1580
    :cond_6a
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "=([\\d\\.]+)\\b"

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v4

    .line 1581
    new-instance v11, Ll/֡᩺֫;

    .line 1516
    sget-object v13, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-static {v12, v4, v13}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    move-object v13, v7

    move-wide/from16 v68, v8

    invoke-static {v4}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v7

    .line 1582
    invoke-direct {v11, v5, v7, v8}, Ll/֡᩺֫;-><init>(Ljava/lang/String;D)V

    goto :goto_42

    :cond_6b
    :goto_41
    move-object v13, v7

    move-wide/from16 v68, v8

    .line 1574
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "=(0[xX][A-F0-9]+)"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v4

    .line 1575
    invoke-static {v12, v4, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    .line 1576
    new-instance v11, Ll/֡᩺֫;

    const/4 v7, 0x1

    invoke-direct {v11, v7, v5, v4}, Ll/֡᩺֫;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 1222
    :goto_42
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_43
    move-object v7, v13

    move-object/from16 v11, v53

    move-object/from16 v13, v58

    move-object/from16 v5, v59

    move-object/from16 v4, v60

    move-wide/from16 v8, v68

    goto/16 :goto_3d

    :cond_6c
    move-object/from16 v60, v4

    move-object/from16 v59, v5

    move-object v13, v7

    move-wide/from16 v68, v8

    move-object/from16 v53, v11

    move-object/from16 v4, v51

    .line 1232
    invoke-virtual {v4, v0}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6d

    .line 1233
    invoke-virtual {v4, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۚ᩺֫;

    goto :goto_44

    .line 1234
    :cond_6d
    new-instance v5, Ll/ۚ᩺֫;

    invoke-direct {v5, v0}, Ll/ۚ᩺֫;-><init>(Ljava/lang/String;)V

    .line 1235
    :goto_44
    invoke-virtual {v5, v3}, Ll/ۚ᩺֫;->ۧ(Landroid/net/Uri;)V

    .line 1236
    invoke-virtual {v5, v6}, Ll/ۚ᩺֫;->֫(Landroid/net/Uri;)V

    move-wide/from16 v6, v94

    .line 1237
    invoke-virtual {v5, v6, v7}, Ll/ۚ᩺֫;->ܳ(J)V

    move-wide/from16 v6, v96

    .line 1238
    invoke-virtual {v5, v6, v7}, Ll/ۚ᩺֫;->ۧ(J)V

    .line 1239
    invoke-virtual {v5, v14, v15}, Ll/ۚ᩺֫;->֫(J)V

    move-wide/from16 v8, v68

    .line 1240
    invoke-virtual {v5, v8, v9}, Ll/ۚ᩺֫;->ܽ(J)V

    move-object v3, v13

    .line 1241
    invoke-virtual {v5, v3}, Ll/ۚ᩺֫;->ۧ(Ljava/util/ArrayList;)V

    move/from16 v3, v45

    .line 1242
    invoke-virtual {v5, v3}, Ll/ۚ᩺֫;->֫(Z)V

    move-wide/from16 v6, v54

    .line 1243
    invoke-virtual {v5, v6, v7}, Ll/ۚ᩺֫;->ܿ(J)V

    move-wide/from16 v6, v56

    .line 1244
    invoke-virtual {v5, v6, v7}, Ll/ۚ᩺֫;->ᩳ(J)V

    .line 1245
    invoke-virtual {v5, v1}, Ll/ۚ᩺֫;->ᩳ(Ljava/util/ArrayList;)V

    move-object/from16 v1, v60

    .line 1246
    invoke-virtual {v5, v1}, Ll/ۚ᩺֫;->ܽ(Ljava/util/ArrayList;)V

    .line 1247
    invoke-virtual {v5, v10}, Ll/ۚ᩺֫;->֫(Ljava/util/ArrayList;)V

    move-object/from16 v10, v59

    .line 1248
    invoke-virtual {v5, v10}, Ll/ۚ᩺֫;->֫(Ljava/lang/Boolean;)V

    move-object/from16 v11, v53

    .line 1249
    invoke-virtual {v5, v11}, Ll/ۚ᩺֫;->֫(Ljava/lang/String;)V

    move-object/from16 v13, v52

    .line 1250
    invoke-virtual {v5, v13}, Ll/ۚ᩺֫;->ۧ(Ljava/lang/String;)V

    .line 1251
    invoke-virtual {v4, v0, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_4a

    :cond_6e
    move-object/from16 v66, v1

    move-object/from16 v67, v5

    move-object/from16 v93, v9

    move-object/from16 v41, v10

    move-object/from16 v40, v13

    move-object/from16 v64, v14

    move-object/from16 v65, v15

    move-object/from16 v4, v51

    const-string v0, "#"

    .line 1252
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_77

    if-nez v83, :cond_6f

    const/4 v0, 0x0

    :goto_45
    const-wide/16 v5, 0x1

    goto :goto_46

    :cond_6f
    if-eqz v22, :cond_70

    move-object/from16 v0, v22

    goto :goto_45

    .line 1388
    :cond_70
    invoke-static/range {v49 .. v50}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_45

    :goto_46
    add-long v5, v49, v5

    .line 1258
    invoke-static {v12, v2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v3, v42

    .line 1259
    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩸᩺֫;

    cmp-long v8, v36, v16

    if-nez v8, :cond_71

    const-wide/16 v38, 0x0

    goto :goto_47

    :cond_71
    if-eqz v84, :cond_72

    if-nez v35, :cond_72

    if-nez v7, :cond_72

    .line 1269
    new-instance v7, Ll/᩸᩺֫;

    const/16 v55, 0x0

    const/16 v56, 0x0

    const-wide/16 v51, 0x0

    move-object/from16 v49, v7

    move-object/from16 v50, v1

    move-wide/from16 v53, v38

    invoke-direct/range {v49 .. v56}, Ll/᩸᩺֫;-><init>(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V

    .line 1276
    invoke-virtual {v3, v1, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_72
    :goto_47
    if-nez v33, :cond_74

    .line 1279
    invoke-virtual/range {v41 .. v41}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_74

    .line 1280
    invoke-virtual/range {v41 .. v41}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v9

    const/4 v10, 0x0

    new-array v10, v10, [Ll/ᩴᩴ֫;

    invoke-interface {v9, v10}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v9

    check-cast v9, [Ll/ᩴᩴ֫;

    .line 1281
    new-instance v10, Ll/᩵ᩴ֫;

    move-object/from16 v11, v93

    invoke-direct {v10, v11, v9}, Ll/᩵ᩴ֫;-><init>(Ljava/lang/String;[Ll/ᩴᩴ֫;)V

    if-nez v44, :cond_73

    .line 1283
    invoke-static {v11, v9}, Ll/᩺᩺֫;->֫(Ljava/lang/String;[Ll/ᩴᩴ֫;)Ll/᩵ᩴ֫;

    move-result-object v44

    :cond_73
    move-object/from16 v33, v10

    goto :goto_48

    :cond_74
    move-object/from16 v11, v93

    .line 1287
    :goto_48
    new-instance v9, Ll/᩸᩺֫;

    if-eqz v35, :cond_75

    move-object/from16 v47, v35

    goto :goto_49

    :cond_75
    move-object/from16 v47, v7

    :goto_49
    move-object/from16 v45, v9

    move-object/from16 v46, v1

    move-wide/from16 v49, v87

    move/from16 v51, v82

    move-wide/from16 v52, v85

    move-object/from16 v54, v33

    move-object/from16 v55, v83

    move-object/from16 v56, v0

    move-wide/from16 v57, v38

    move-wide/from16 v59, v36

    move-object/from16 v62, v40

    .line 1290
    invoke-direct/range {v45 .. v62}, Ll/᩸᩺֫;-><init>(Ljava/lang/String;Ll/᩸᩺֫;Ljava/lang/String;JIJLl/᩵ᩴ֫;Ljava/lang/String;Ljava/lang/String;JJZLjava/util/List;)V

    move-object/from16 v0, v65

    .line 1287
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-long v85, v85, v87

    .line 1306
    new-instance v62, Ljava/util/ArrayList;

    invoke-direct/range {v62 .. v62}, Ljava/util/ArrayList;-><init>()V

    if-eqz v8, :cond_76

    add-long v38, v38, v36

    :cond_76
    const/16 v45, 0x0

    const/16 v61, 0x0

    move-object/from16 v10, p0

    move-object v15, v0

    move-wide/from16 v49, v5

    move-object v8, v11

    move-wide/from16 v36, v16

    move-object/from16 v9, v41

    move-object/from16 v14, v64

    move-object/from16 v48, v14

    move-object/from16 v7, v66

    move-object/from16 v5, v67

    move-wide/from16 v46, v85

    move/from16 v1, v91

    const-wide/16 v87, 0x0

    move-object v0, v10

    move-object/from16 v11, p1

    move-object v6, v4

    goto/16 :goto_f

    :cond_77
    :goto_4a
    move-object/from16 v3, v42

    move-object/from16 v0, v65

    :goto_4b
    move-object/from16 v11, v93

    const/16 v45, 0x0

    move-object/from16 v10, p0

    move-object v15, v0

    move-object v6, v4

    move-object v8, v11

    move-object/from16 v62, v40

    move-object/from16 v9, v41

    move-object/from16 v14, v64

    move-object/from16 v7, v66

    move-object/from16 v5, v67

    move/from16 v1, v91

    move-object/from16 v4, v92

    move-object v0, v10

    move-object/from16 v11, p1

    goto/16 :goto_0

    :cond_78
    move/from16 v91, v1

    move-object/from16 v92, v4

    move-object/from16 v67, v5

    move-object v4, v6

    move-object/from16 v66, v7

    move-object v0, v15

    move-object/from16 v40, v62

    .line 1315
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x0

    .line 1316
    :goto_4c
    invoke-virtual/range {v67 .. v67}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_7d

    move-object/from16 v3, v67

    .line 1317
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܶ᩺֫;

    .line 1318
    iget-wide v6, v5, Ll/ܶ᩺֫;->֫:J

    cmp-long v8, v6, v16

    if-nez v8, :cond_79

    .line 1320
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    int-to-long v6, v6

    add-long v6, v24, v6

    invoke-interface/range {v40 .. v40}, Ljava/util/List;->isEmpty()Z

    move-result v8

    int-to-long v8, v8

    sub-long/2addr v6, v8

    .line 1322
    :cond_79
    iget v8, v5, Ll/ܶ᩺֫;->ۧ:I

    const/4 v9, -0x1

    if-ne v8, v9, :cond_7b

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v11, v30, v9

    if-eqz v11, :cond_7c

    .line 1325
    invoke-interface/range {v40 .. v40}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_7a

    invoke-static {v0}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩸᩺֫;

    iget-object v8, v8, Ll/᩸᩺֫;->ܰ:Ll/ܳ۬ܺ;

    move-object/from16 v62, v8

    goto :goto_4d

    :cond_7a
    move-object/from16 v62, v40

    .line 1326
    :goto_4d
    invoke-interface/range {v62 .. v62}, Ljava/util/List;->size()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    goto :goto_4e

    :cond_7b
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 1328
    :cond_7c
    :goto_4e
    iget-object v5, v5, Ll/ܶ᩺֫;->ܽ:Landroid/net/Uri;

    new-instance v11, Ll/ܶ᩺֫;

    invoke-direct {v11, v5, v6, v7, v8}, Ll/ܶ᩺֫;-><init>(Landroid/net/Uri;JI)V

    invoke-virtual {v1, v5, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    move-object/from16 v67, v3

    goto :goto_4c

    :cond_7d
    move-object/from16 v13, v40

    if-eqz v92, :cond_7e

    move-object/from16 v2, v92

    .line 1334
    invoke-interface {v13, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1337
    :cond_7e
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1338
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_7f
    :goto_4f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_80

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۚ᩺֫;

    .line 1339
    invoke-virtual {v4}, Ll/ۚ᩺֫;->֫()Ll/֨᩺֫;

    move-result-object v4

    if-eqz v4, :cond_7f

    .line 1341
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4f

    .line 1345
    :cond_80
    new-instance v3, Ll/ۙ᩺֫;

    const-wide/16 v4, 0x0

    cmp-long v6, v20, v4

    if-eqz v6, :cond_81

    const/4 v4, 0x1

    const/16 v33, 0x1

    goto :goto_50

    :cond_81
    const/4 v4, 0x0

    const/16 v33, 0x0

    :goto_50
    move-object v4, v3

    move/from16 v5, v23

    move-object/from16 v6, p3

    move-object/from16 v7, v66

    move-wide/from16 v8, v18

    move/from16 v10, v34

    move-wide/from16 v11, v20

    move-object/from16 v62, v13

    move/from16 v13, v26

    move/from16 v14, v27

    move-wide/from16 v15, v24

    move/from16 v17, v91

    move-wide/from16 v18, v28

    move-wide/from16 v20, v30

    move/from16 v22, v32

    move/from16 v23, v43

    move/from16 v24, v33

    move-object/from16 v25, v44

    move-object/from16 v26, v0

    move-object/from16 v27, v62

    move-object/from16 v28, v63

    move-object/from16 v29, v1

    move-object/from16 v30, v2

    invoke-direct/range {v4 .. v30}, Ll/ۙ᩺֫;-><init>(ILjava/lang/String;Ljava/util/List;JZJZIJIJJZZZLl/᩵ᩴ֫;Ljava/util/List;Ljava/util/List;Ll/᩶᩺֫;Ljava/util/Map;Ljava/util/List;)V

    return-object v3

    nop

    :sswitch_data_0
    .sparse-switch
        0x13683 -> :sswitch_2
        0x251681 -> :sswitch_1
        0x2590a0 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x7f5b7c02 -> :sswitch_b
        -0x6ddab8e6 -> :sswitch_a
        -0x8e0f436 -> :sswitch_9
        -0x22a979d -> :sswitch_8
        0x17ad642d -> :sswitch_7
        0x32acec39 -> :sswitch_6
        0x57c501cc -> :sswitch_5
        0x6837ce7f -> :sswitch_4
        0x6c2295e3 -> :sswitch_3
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static ֫(Ll/ۨ᩺֫;Ljava/lang/String;)Ll/۫᩺֫;
    .locals 41

    move-object/from16 v1, p1

    .line 418
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 419
    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 420
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 421
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 422
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 423
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 424
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 425
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 426
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 427
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 434
    :goto_0
    invoke-virtual/range {p0 .. p0}, Ll/ۨ᩺֫;->֫()Z

    move-result v13

    const-string v14, "application/x-mpegURL"

    sget-object v15, Ll/᩺᩺֫;->֫ۧ:Ljava/util/regex/Pattern;

    move/from16 v17, v10

    const-string v10, "/"

    move-object/from16 v18, v7

    sget-object v7, Ll/᩺᩺֫;->ۘ֫:Ljava/util/regex/Pattern;

    move-object/from16 v19, v6

    const-string v6, ","

    if-eqz v13, :cond_29

    .line 435
    invoke-virtual/range {p0 .. p0}, Ll/ۨ᩺֫;->ۧ()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v20, v5

    const-string v5, "#EXT"

    .line 437
    invoke-virtual {v13, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 439
    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    const-string v5, "#EXT-X-I-FRAME-STREAM-INF"

    .line 441
    invoke-virtual {v13, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    move-object/from16 v21, v8

    const-string v8, "#EXT-X-DEFINE"

    .line 443
    invoke-virtual {v13, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 445
    invoke-static {v13, v7, v11}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Ll/᩺᩺֫;->ۧۧ:Ljava/util/regex/Pattern;

    .line 446
    invoke-static {v13, v6, v11}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    .line 444
    invoke-virtual {v11, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_3

    :cond_1
    const-string v7, "#EXT-X-INDEPENDENT-SEGMENTS"

    .line 447
    invoke-virtual {v13, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/4 v10, 0x1

    move-object/from16 v32, v3

    move-object/from16 v31, v4

    move-object/from16 v30, v12

    goto/16 :goto_13

    :cond_2
    const-string v7, "#EXT-X-MEDIA"

    .line 449
    invoke-virtual {v13, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 452
    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    const-string v7, "#EXT-X-SESSION-KEY"

    .line 453
    invoke-virtual {v13, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 454
    sget-object v5, Ll/᩺᩺֫;->ܿ֫:Ljava/util/regex/Pattern;

    const-string v6, "identity"

    .line 455
    invoke-static {v13, v5, v6, v11}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v5

    .line 456
    invoke-static {v13, v5, v11}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)Ll/ᩴᩴ֫;

    move-result-object v5

    if-eqz v5, :cond_7

    .line 458
    sget-object v6, Ll/᩺᩺֫;->ۖ֫:Ljava/util/regex/Pattern;

    invoke-static {v13, v6, v11}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "SAMPLE-AES-CENC"

    .line 1480
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    const-string v7, "SAMPLE-AES-CTR"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    goto :goto_1

    :cond_4
    const-string v6, "cbcs"

    goto :goto_2

    :cond_5
    :goto_1
    const-string v6, "cenc"

    .line 460
    :goto_2
    new-instance v7, Ll/᩵ᩴ֫;

    const/4 v8, 0x1

    new-array v8, v8, [Ll/ᩴᩴ֫;

    const/4 v10, 0x0

    aput-object v5, v8, v10

    invoke-direct {v7, v6, v8}, Ll/᩵ᩴ֫;-><init>(Ljava/lang/String;[Ll/ᩴᩴ֫;)V

    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    const-string v7, "#EXT-X-STREAM-INF"

    .line 462
    invoke-virtual {v13, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_8

    if-eqz v5, :cond_7

    goto :goto_4

    :cond_7
    :goto_3
    move-object/from16 v32, v3

    move-object/from16 v31, v4

    move-object/from16 v30, v12

    goto/16 :goto_12

    :cond_8
    :goto_4
    const-string v7, "CLOSED-CAPTIONS=NONE"

    .line 463
    invoke-virtual {v13, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    or-int/2addr v9, v7

    if-eqz v5, :cond_9

    const/16 v7, 0x4000

    goto :goto_5

    :cond_9
    const/4 v7, 0x0

    .line 465
    :goto_5
    sget-object v8, Ll/᩺᩺֫;->ۡ:Ljava/util/regex/Pattern;

    move/from16 v22, v9

    .line 1486
    sget-object v9, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-static {v13, v8, v9}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    .line 466
    sget-object v9, Ll/᩺᩺֫;->ۢ:Ljava/util/regex/Pattern;

    .line 1490
    invoke-virtual {v9, v13}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v9

    .line 1491
    invoke-virtual {v9}, Ljava/util/regex/Matcher;->find()Z

    move-result v23

    if-eqz v23, :cond_a

    move-object/from16 v30, v12

    const/4 v12, 0x1

    .line 1492
    invoke-virtual {v9, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v9

    .line 155
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1492
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    goto :goto_6

    :cond_a
    move-object/from16 v30, v12

    const/4 v9, -0x1

    .line 467
    :goto_6
    sget-object v12, Ll/᩺᩺֫;->ܳۧ:Ljava/util/regex/Pattern;

    move-object/from16 v31, v4

    const/4 v4, 0x0

    .line 1534
    invoke-static {v13, v12, v4, v11}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v32, v3

    .line 468
    sget-object v3, Ll/᩺᩺֫;->᩹:Ljava/util/regex/Pattern;

    .line 1534
    invoke-static {v13, v3, v4, v11}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v33, v0

    .line 469
    sget-object v0, Ll/᩺᩺֫;->ۤ֫:Ljava/util/regex/Pattern;

    .line 1534
    invoke-static {v13, v0, v4, v11}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 474
    sget-object v4, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const/4 v4, 0x2

    .line 1105
    invoke-virtual {v0, v6, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x0

    .line 476
    aget-object v0, v0, v4

    move/from16 v23, v7

    const/4 v7, -0x1

    .line 1090
    invoke-virtual {v0, v10, v7}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    .line 477
    aget-object v7, v0, v4

    .line 478
    array-length v4, v0

    const/4 v10, 0x1

    if-le v4, v10, :cond_b

    .line 479
    aget-object v0, v0, v10

    const/4 v4, 0x2

    goto :goto_8

    :cond_b
    const/4 v0, 0x2

    goto :goto_7

    :cond_c
    move/from16 v23, v7

    const/4 v0, 0x2

    const/4 v7, 0x0

    :goto_7
    const/4 v4, 0x2

    const/4 v0, 0x0

    .line 482
    :goto_8
    invoke-static {v4, v3}, Ll/ۘ֨֫;->ۧ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 397
    sget v10, Ll/ۢ᩵֫;->֫:I

    if-nez v4, :cond_d

    move/from16 v25, v8

    goto/16 :goto_f

    :cond_d
    const-string v10, "dvhe"

    .line 598
    invoke-virtual {v4, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v24

    if-nez v24, :cond_14

    move/from16 v25, v8

    const-string v8, "dvh1"

    invoke-virtual {v4, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v24

    if-eqz v24, :cond_e

    goto :goto_9

    :cond_e
    if-nez v7, :cond_f

    goto/16 :goto_f

    .line 606
    :cond_f
    invoke-virtual {v7, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_10

    const-string v10, "hev1"

    invoke-virtual {v4, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_15

    .line 607
    :cond_10
    invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_11

    const-string v8, "hvc1"

    invoke-virtual {v4, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_15

    :cond_11
    const-string v8, "dvav"

    .line 608
    invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_12

    const-string v8, "avc3"

    invoke-virtual {v4, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_15

    :cond_12
    const-string v8, "dva1"

    .line 609
    invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_13

    const-string v8, "avc1"

    invoke-virtual {v4, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_15

    :cond_13
    const-string v8, "dav1"

    .line 610
    invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_22

    const-string v8, "av01"

    invoke-virtual {v4, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_22

    goto :goto_9

    :cond_14
    move/from16 v25, v8

    :cond_15
    :goto_9
    if-nez v7, :cond_16

    goto :goto_a

    :cond_16
    if-eqz v12, :cond_22

    if-nez v0, :cond_17

    goto/16 :goto_f

    :cond_17
    const-string v8, "PQ"

    .line 408
    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_18

    const-string v8, "db1p"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_22

    :cond_18
    const-string v8, "SDR"

    .line 409
    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_19

    const-string v8, "db2g"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_22

    :cond_19
    const-string v8, "HLG"

    .line 410
    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1a

    const-string v8, "db4"

    invoke-virtual {v0, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1a

    goto :goto_f

    :cond_1a
    :goto_a
    if-eqz v7, :cond_1b

    goto :goto_b

    :cond_1b
    move-object v7, v4

    .line 2169
    :goto_b
    invoke-static {v3}, Ll/ۘ֨֫;->ܿ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 2170
    array-length v3, v0

    if-nez v3, :cond_1c

    goto :goto_d

    .line 2173
    :cond_1c
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 2174
    array-length v4, v0

    const/4 v8, 0x0

    :goto_c
    if-ge v8, v4, :cond_1f

    aget-object v10, v0, v8

    .line 703
    invoke-static {v10}, Ll/ۢ᩵֫;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ll/ۢ᩵֫;->ܿ(Ljava/lang/String;)I

    move-result v12

    move-object/from16 v24, v0

    const/4 v0, 0x2

    if-eq v0, v12, :cond_1e

    .line 2176
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_1d

    .line 2177
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2179
    :cond_1d
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1e
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v0, v24

    goto :goto_c

    .line 2182
    :cond_1f
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_20

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_e

    :cond_20
    :goto_d
    const/4 v0, 0x0

    :goto_e
    if-eqz v0, :cond_21

    .line 0
    invoke-static {v7, v6, v0}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_f

    :cond_21
    move-object v3, v7

    .line 490
    :cond_22
    :goto_f
    sget-object v0, Ll/᩺᩺֫;->᩸֫:Ljava/util/regex/Pattern;

    const/4 v4, 0x0

    .line 1534
    invoke-static {v13, v0, v4, v11}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_23

    const-string v4, "x"

    const/4 v6, -0x1

    .line 1090
    invoke-virtual {v0, v4, v6}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x0

    .line 496
    aget-object v4, v0, v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    const/4 v6, 0x1

    .line 497
    aget-object v0, v0, v6

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-lez v4, :cond_23

    if-gtz v0, :cond_24

    :cond_23
    const/4 v0, -0x1

    const/4 v4, -0x1

    .line 508
    :cond_24
    sget-object v6, Ll/᩺᩺֫;->ۛ:Ljava/util/regex/Pattern;

    const/4 v7, 0x0

    .line 1534
    invoke-static {v13, v6, v7, v11}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_25

    .line 511
    invoke-static {v6}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v6

    goto :goto_10

    :cond_25
    const/high16 v6, -0x40800000    # -1.0f

    .line 513
    :goto_10
    sget-object v8, Ll/᩺᩺֫;->ܿۧ:Ljava/util/regex/Pattern;

    .line 1534
    invoke-static {v13, v8, v7, v11}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v26

    .line 514
    sget-object v8, Ll/᩺᩺֫;->ۜ:Ljava/util/regex/Pattern;

    .line 1534
    invoke-static {v13, v8, v7, v11}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v27

    .line 515
    sget-object v8, Ll/᩺᩺֫;->۫֫:Ljava/util/regex/Pattern;

    .line 1534
    invoke-static {v13, v8, v7, v11}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v28

    .line 517
    sget-object v8, Ll/᩺᩺֫;->᩸:Ljava/util/regex/Pattern;

    .line 1534
    invoke-static {v13, v8, v7, v11}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v29

    if-eqz v5, :cond_26

    .line 522
    invoke-static {v13, v15, v11}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Ll/ۡ֨֫;->ۧ(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    goto :goto_11

    .line 523
    :cond_26
    invoke-virtual/range {p0 .. p0}, Ll/ۨ᩺֫;->֫()Z

    move-result v5

    if-eqz v5, :cond_28

    .line 528
    invoke-virtual/range {p0 .. p0}, Ll/ۨ᩺֫;->ۧ()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v11}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v5

    .line 529
    invoke-static {v1, v5}, Ll/ۡ֨֫;->ۧ(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    .line 532
    :goto_11
    new-instance v7, Ll/֨ᩴ֫;

    invoke-direct {v7}, Ll/֨ᩴ֫;-><init>()V

    .line 534
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v8

    invoke-virtual {v7, v8}, Ll/֨ᩴ֫;->ܺ(I)V

    .line 535
    invoke-virtual {v7, v14}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    .line 536
    invoke-virtual {v7, v3}, Ll/֨ᩴ֫;->֫(Ljava/lang/String;)V

    .line 537
    invoke-virtual {v7, v9}, Ll/֨ᩴ֫;->ܽ(I)V

    move/from16 v3, v25

    .line 538
    invoke-virtual {v7, v3}, Ll/֨ᩴ֫;->֡(I)V

    .line 539
    invoke-virtual {v7, v4}, Ll/֨ᩴ֫;->ۙ(I)V

    .line 540
    invoke-virtual {v7, v0}, Ll/֨ᩴ֫;->ۡ(I)V

    .line 541
    invoke-virtual {v7, v6}, Ll/֨ᩴ֫;->֫(F)V

    move/from16 v0, v23

    .line 542
    invoke-virtual {v7, v0}, Ll/֨ᩴ֫;->ۚ(I)V

    .line 543
    invoke-virtual {v7}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v36

    .line 544
    new-instance v0, Ll/۬᩺֫;

    move-object/from16 v34, v0

    move-object/from16 v35, v5

    move-object/from16 v37, v26

    move-object/from16 v38, v27

    move-object/from16 v39, v28

    move-object/from16 v40, v29

    invoke-direct/range {v34 .. v40}, Ll/۬᩺֫;-><init>(Landroid/net/Uri;Ll/۠ᩴ֫;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 547
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, v33

    .line 548
    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    if-nez v4, :cond_27

    .line 550
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 551
    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 553
    :cond_27
    new-instance v5, Ll/ܳ᩺֫;

    move-object/from16 v23, v5

    move/from16 v24, v9

    move/from16 v25, v3

    invoke-direct/range {v23 .. v29}, Ll/ܳ᩺֫;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v9, v22

    :goto_12
    move/from16 v10, v17

    :goto_13
    move-object/from16 v7, v18

    move-object/from16 v6, v19

    move-object/from16 v5, v20

    move-object/from16 v8, v21

    move-object/from16 v12, v30

    move-object/from16 v4, v31

    move-object/from16 v3, v32

    goto/16 :goto_0

    :cond_28
    const-string v0, "#EXT-X-STREAM-INF must be followed by another line"

    .line 524
    invoke-static {v0}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :cond_29
    move-object/from16 v32, v3

    move-object/from16 v31, v4

    move-object/from16 v20, v5

    move-object/from16 v21, v8

    move-object/from16 v30, v12

    .line 565
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 566
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    const/4 v5, 0x0

    .line 567
    :goto_14
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v5, v8, :cond_2c

    .line 568
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/۬᩺֫;

    .line 569
    iget-object v12, v8, Ll/۬᩺֫;->ܿ:Landroid/net/Uri;

    iget-object v13, v8, Ll/۬᩺֫;->ܽ:Ll/۠ᩴ֫;

    invoke-virtual {v4, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_2b

    .line 570
    iget-object v12, v13, Ll/۠ᩴ֫;->ۤ:Ll/᩻᩵֫;

    if-nez v12, :cond_2a

    const/4 v12, 0x1

    goto :goto_15

    :cond_2a
    const/4 v12, 0x0

    :goto_15
    invoke-static {v12}, Ll/᩺֡֫;->ۧ(Z)V

    .line 571
    new-instance v12, Ll/᩻᩺֫;

    move-object/from16 p0, v4

    iget-object v4, v8, Ll/۬᩺֫;->ܿ:Landroid/net/Uri;

    .line 575
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    .line 155
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v33, v0

    const/4 v0, 0x0

    .line 575
    invoke-direct {v12, v0, v0, v4}, Ll/᩻᩺֫;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 576
    new-instance v0, Ll/᩻᩵֫;

    const/4 v4, 0x1

    new-array v4, v4, [Ll/ܳ᩵֫;

    const/16 v16, 0x0

    aput-object v12, v4, v16

    invoke-direct {v0, v4}, Ll/᩻᩵֫;-><init>([Ll/ܳ᩵֫;)V

    .line 577
    invoke-virtual {v13}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object v4

    invoke-virtual {v4, v0}, Ll/֨ᩴ֫;->֫(Ll/᩻᩵֫;)V

    invoke-virtual {v4}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v24

    .line 119
    new-instance v0, Ll/۬᩺֫;

    iget-object v4, v8, Ll/۬᩺֫;->ܿ:Landroid/net/Uri;

    iget-object v12, v8, Ll/۬᩺֫;->ܳ:Ljava/lang/String;

    iget-object v13, v8, Ll/۬᩺֫;->֫:Ljava/lang/String;

    move/from16 v29, v9

    iget-object v9, v8, Ll/۬᩺֫;->ᩳ:Ljava/lang/String;

    iget-object v8, v8, Ll/۬᩺֫;->ۧ:Ljava/lang/String;

    move-object/from16 v22, v0

    move-object/from16 v23, v4

    move-object/from16 v25, v12

    move-object/from16 v26, v13

    move-object/from16 v27, v9

    move-object/from16 v28, v8

    invoke-direct/range {v22 .. v28}, Ll/۬᩺֫;-><init>(Landroid/net/Uri;Ll/۠ᩴ֫;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 578
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_16

    :cond_2b
    move-object/from16 v33, v0

    move-object/from16 p0, v4

    move/from16 v29, v9

    :goto_16
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v4, p0

    move/from16 v9, v29

    move-object/from16 v0, v33

    goto :goto_14

    :cond_2c
    move/from16 v29, v9

    const/4 v0, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v8, v5

    .line 582
    :goto_17
    invoke-virtual/range {v32 .. v32}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v0, v5, :cond_4b

    move-object/from16 v5, v32

    .line 583
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 584
    sget-object v12, Ll/᩺᩺֫;->᩺:Ljava/util/regex/Pattern;

    invoke-static {v9, v12, v11}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v12

    .line 585
    invoke-static {v9, v7, v11}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v13

    .line 586
    new-instance v5, Ll/֨ᩴ֫;

    invoke-direct {v5}, Ll/֨ᩴ֫;-><init>()V

    move-object/from16 v22, v7

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 p0, v8

    const-string v8, ":"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 588
    invoke-virtual {v5, v7}, Ll/֨ᩴ֫;->ܽ(Ljava/lang/String;)V

    .line 589
    invoke-virtual {v5, v13}, Ll/֨ᩴ֫;->ᩳ(Ljava/lang/String;)V

    .line 590
    invoke-virtual {v5, v14}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    .line 1393
    sget-object v7, Ll/᩺᩺֫;->ۗ:Ljava/util/regex/Pattern;

    invoke-static {v7, v9}, Ll/᩺᩺֫;->֫(Ljava/util/regex/Pattern;Ljava/lang/String;)Z

    move-result v7

    .line 1396
    sget-object v8, Ll/᩺᩺֫;->ۤ:Ljava/util/regex/Pattern;

    invoke-static {v8, v9}, Ll/᩺᩺֫;->֫(Ljava/util/regex/Pattern;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_2d

    or-int/lit8 v7, v7, 0x2

    .line 1399
    :cond_2d
    sget-object v8, Ll/᩺᩺֫;->᩷:Ljava/util/regex/Pattern;

    invoke-static {v8, v9}, Ll/᩺᩺֫;->֫(Ljava/util/regex/Pattern;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_2e

    or-int/lit8 v7, v7, 0x4

    .line 591
    :cond_2e
    invoke-virtual {v5, v7}, Ll/֨ᩴ֫;->ܶ(I)V

    .line 1407
    sget-object v7, Ll/᩺᩺֫;->֨:Ljava/util/regex/Pattern;

    const/4 v8, 0x0

    .line 1534
    invoke-static {v9, v7, v8, v11}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v7

    .line 1409
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_2f

    const/4 v7, 0x0

    move-object/from16 v23, v6

    goto :goto_1a

    .line 1412
    :cond_2f
    sget-object v8, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const/4 v8, -0x1

    .line 1090
    invoke-virtual {v7, v6, v8}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v7

    const-string v8, "public.accessibility.describes-video"

    .line 1414
    invoke-static {v8, v7}, Ll/ۘ֨֫;->֫(Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_30

    const/16 v8, 0x200

    goto :goto_18

    :cond_30
    const/4 v8, 0x0

    :goto_18
    move-object/from16 v23, v6

    const-string v6, "public.accessibility.transcribes-spoken-dialog"

    .line 1417
    invoke-static {v6, v7}, Ll/ۘ֨֫;->֫(Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_31

    or-int/lit16 v8, v8, 0x1000

    :cond_31
    const-string v6, "public.accessibility.describes-music-and-sound"

    .line 1420
    invoke-static {v6, v7}, Ll/ۘ֨֫;->֫(Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_32

    or-int/lit16 v6, v8, 0x400

    goto :goto_19

    :cond_32
    move v6, v8

    :goto_19
    const-string v8, "public.easy-to-read"

    .line 1423
    invoke-static {v8, v7}, Ll/ۘ֨֫;->֫(Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_33

    or-int/lit16 v7, v6, 0x2000

    goto :goto_1a

    :cond_33
    move v7, v6

    .line 592
    :goto_1a
    invoke-virtual {v5, v7}, Ll/֨ᩴ֫;->ۚ(I)V

    sget-object v6, Ll/᩺᩺֫;->᩻֫:Ljava/util/regex/Pattern;

    const/4 v7, 0x0

    .line 1534
    invoke-static {v9, v6, v7, v11}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    .line 593
    invoke-virtual {v5, v6}, Ll/֨ᩴ֫;->ܿ(Ljava/lang/String;)V

    .line 1534
    invoke-static {v9, v15, v7, v11}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_34

    const/4 v6, 0x0

    goto :goto_1b

    .line 596
    :cond_34
    invoke-static {v1, v6}, Ll/ۡ֨֫;->ۧ(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    .line 597
    :goto_1b
    new-instance v7, Ll/᩻᩵֫;

    new-instance v8, Ll/᩻᩺֫;

    .line 598
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {v8, v12, v13, v1}, Ll/᩻᩺֫;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    const/4 v1, 0x1

    new-array v1, v1, [Ll/ܳ᩵֫;

    const/16 v16, 0x0

    aput-object v8, v1, v16

    invoke-direct {v7, v1}, Ll/᩻᩵֫;-><init>([Ll/ܳ᩵֫;)V

    .line 599
    sget-object v1, Ll/᩺᩺֫;->۟֫:Ljava/util/regex/Pattern;

    invoke-static {v9, v1, v11}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v8

    sparse-switch v8, :sswitch_data_0

    goto :goto_1c

    :sswitch_0
    const-string v8, "VIDEO"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_35

    goto :goto_1c

    :cond_35
    const/4 v1, 0x3

    goto :goto_1d

    :sswitch_1
    const-string v8, "AUDIO"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_36

    goto :goto_1c

    :cond_36
    const/4 v1, 0x2

    goto :goto_1d

    :sswitch_2
    const-string v8, "CLOSED-CAPTIONS"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_37

    goto :goto_1c

    :cond_37
    const/4 v1, 0x1

    goto :goto_1d

    :sswitch_3
    const-string v8, "SUBTITLES"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_38

    goto :goto_1c

    :cond_38
    const/4 v1, 0x0

    goto :goto_1d

    :goto_1c
    const/4 v1, -0x1

    :goto_1d
    packed-switch v1, :pswitch_data_0

    :goto_1e
    move-object/from16 v24, v14

    move-object/from16 v25, v15

    move-object/from16 v6, v19

    move-object/from16 v9, v20

    move-object/from16 v8, v31

    goto/16 :goto_2a

    :pswitch_0
    const/4 v1, 0x0

    .line 725
    :goto_1f
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v1, v8, :cond_3a

    .line 726
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/۬᩺֫;

    .line 727
    iget-object v9, v8, Ll/۬᩺֫;->ܳ:Ljava/lang/String;

    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_39

    goto :goto_20

    :cond_39
    add-int/lit8 v1, v1, 0x1

    goto :goto_1f

    :cond_3a
    const/4 v8, 0x0

    :goto_20
    if-eqz v8, :cond_3b

    .line 603
    iget-object v1, v8, Ll/۬᩺֫;->ܽ:Ll/۠ᩴ֫;

    .line 605
    iget-object v8, v1, Ll/۠ᩴ֫;->ܳ:Ljava/lang/String;

    const/4 v9, 0x2

    invoke-static {v9, v8}, Ll/ۘ֨֫;->ۧ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 607
    invoke-virtual {v5, v8}, Ll/֨ᩴ֫;->֫(Ljava/lang/String;)V

    .line 608
    invoke-static {v8}, Ll/ۢ᩵֫;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    iget v8, v1, Ll/۠ᩴ֫;->᩷֫:I

    .line 609
    invoke-virtual {v5, v8}, Ll/֨ᩴ֫;->ۙ(I)V

    iget v8, v1, Ll/۠ᩴ֫;->۠:I

    .line 610
    invoke-virtual {v5, v8}, Ll/֨ᩴ֫;->ۡ(I)V

    iget v1, v1, Ll/۠ᩴ֫;->֡:F

    .line 611
    invoke-virtual {v5, v1}, Ll/֨ᩴ֫;->֫(F)V

    :cond_3b
    if-nez v6, :cond_3c

    goto :goto_1e

    .line 616
    :cond_3c
    invoke-virtual {v5, v7}, Ll/֨ᩴ֫;->֫(Ll/᩻᩵֫;)V

    .line 617
    new-instance v1, Ll/ۗ᩺֫;

    invoke-virtual {v5}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v5

    invoke-direct {v1, v6, v5, v13}, Ll/ۗ᩺֫;-><init>(Landroid/net/Uri;Ll/۠ᩴ֫;Ljava/lang/String;)V

    move-object/from16 v8, v31

    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v24, v14

    move-object/from16 v25, v15

    move-object/from16 v6, v19

    move-object/from16 v9, v20

    goto/16 :goto_2a

    :pswitch_1
    move-object/from16 v8, v31

    const/4 v1, 0x0

    move-object/from16 v24, v14

    .line 714
    :goto_21
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v14

    if-ge v1, v14, :cond_3e

    .line 715
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/۬᩺֫;

    move-object/from16 v25, v15

    .line 716
    iget-object v15, v14, Ll/۬᩺֫;->֫:Ljava/lang/String;

    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_3d

    goto :goto_22

    :cond_3d
    add-int/lit8 v1, v1, 0x1

    move-object/from16 v15, v25

    goto :goto_21

    :cond_3e
    move-object/from16 v25, v15

    const/4 v14, 0x0

    :goto_22
    if-eqz v14, :cond_3f

    .line 625
    iget-object v1, v14, Ll/۬᩺֫;->ܽ:Ll/۠ᩴ֫;

    iget-object v1, v1, Ll/۠ᩴ֫;->ܳ:Ljava/lang/String;

    const/4 v12, 0x1

    invoke-static {v12, v1}, Ll/ۘ֨֫;->ۧ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 626
    invoke-virtual {v5, v1}, Ll/֨ᩴ֫;->֫(Ljava/lang/String;)V

    .line 627
    invoke-static {v1}, Ll/ۢ᩵֫;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_23

    :cond_3f
    const/4 v1, 0x0

    .line 630
    :goto_23
    sget-object v12, Ll/᩺᩺֫;->ۚ:Ljava/util/regex/Pattern;

    const/4 v15, 0x0

    .line 1534
    invoke-static {v9, v12, v15, v11}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_40

    .line 633
    sget-object v12, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const/4 v12, 0x2

    .line 1105
    invoke-virtual {v9, v10, v12}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v12

    const/4 v15, 0x0

    .line 633
    aget-object v12, v12, v15

    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v12

    .line 634
    invoke-virtual {v5, v12}, Ll/֨ᩴ֫;->ᩳ(I)V

    const-string v12, "audio/eac3"

    .line 635
    invoke-virtual {v12, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_41

    const-string v12, "/JOC"

    invoke-virtual {v9, v12}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_41

    const-string v1, "ec+3"

    .line 637
    invoke-virtual {v5, v1}, Ll/֨ᩴ֫;->֫(Ljava/lang/String;)V

    const-string v1, "audio/eac3-joc"

    goto :goto_24

    :cond_40
    const/4 v15, 0x0

    .line 640
    :cond_41
    :goto_24
    invoke-virtual {v5, v1}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    if-eqz v6, :cond_43

    .line 642
    invoke-virtual {v5, v7}, Ll/֨ᩴ֫;->֫(Ll/᩻᩵֫;)V

    .line 643
    new-instance v1, Ll/ۗ᩺֫;

    invoke-virtual {v5}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v5

    invoke-direct {v1, v6, v5, v13}, Ll/ۗ᩺֫;-><init>(Landroid/net/Uri;Ll/۠ᩴ֫;Ljava/lang/String;)V

    move-object/from16 v6, v20

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_42
    move-object v9, v6

    move-object/from16 v6, v19

    goto/16 :goto_2a

    :cond_43
    move-object/from16 v6, v20

    if-eqz v14, :cond_42

    .line 646
    invoke-virtual {v5}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v1

    goto :goto_26

    :pswitch_2
    move-object/from16 v24, v14

    move-object/from16 v25, v15

    move-object/from16 v6, v20

    move-object/from16 v8, v31

    const/4 v15, 0x0

    .line 669
    sget-object v1, Ll/᩺᩺֫;->ܽ֫:Ljava/util/regex/Pattern;

    invoke-static {v9, v1, v11}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "CC"

    .line 671
    invoke-virtual {v1, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_44

    const/4 v7, 0x2

    .line 673
    invoke-virtual {v1, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    const-string v7, "application/cea-608"

    goto :goto_25

    :cond_44
    const/4 v7, 0x7

    .line 676
    invoke-virtual {v1, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    const-string v7, "application/cea-708"

    :goto_25
    if-nez v4, :cond_45

    .line 679
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 682
    :cond_45
    invoke-virtual {v5, v7}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 683
    invoke-virtual {v5, v1}, Ll/֨ᩴ֫;->֫(I)V

    .line 684
    invoke-virtual {v5}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v1

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p0

    :goto_26
    move-object v9, v6

    move-object/from16 v6, v19

    goto :goto_2b

    :pswitch_3
    move-object/from16 v24, v14

    move-object/from16 v25, v15

    move-object/from16 v9, v20

    move-object/from16 v8, v31

    const/4 v15, 0x0

    const/4 v1, 0x0

    .line 736
    :goto_27
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v14

    if-ge v1, v14, :cond_47

    .line 737
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/۬᩺֫;

    .line 738
    iget-object v15, v14, Ll/۬᩺֫;->ᩳ:Ljava/lang/String;

    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_46

    goto :goto_28

    :cond_46
    add-int/lit8 v1, v1, 0x1

    const/4 v15, 0x0

    goto :goto_27

    :cond_47
    const/4 v14, 0x0

    :goto_28
    if-eqz v14, :cond_48

    .line 654
    iget-object v1, v14, Ll/۬᩺֫;->ܽ:Ll/۠ᩴ֫;

    iget-object v1, v1, Ll/۠ᩴ֫;->ܳ:Ljava/lang/String;

    const/4 v12, 0x3

    invoke-static {v12, v1}, Ll/ۘ֨֫;->ۧ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 655
    invoke-virtual {v5, v1}, Ll/֨ᩴ֫;->֫(Ljava/lang/String;)V

    .line 656
    invoke-static {v1}, Ll/ۢ᩵֫;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_29

    :cond_48
    const/4 v1, 0x0

    :goto_29
    if-nez v1, :cond_49

    const-string v1, "text/vtt"

    .line 661
    :cond_49
    invoke-virtual {v5, v1}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    invoke-virtual {v5, v7}, Ll/֨ᩴ֫;->֫(Ll/᩻᩵֫;)V

    if-eqz v6, :cond_4a

    .line 663
    new-instance v1, Ll/ۗ᩺֫;

    invoke-virtual {v5}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v5

    invoke-direct {v1, v6, v5, v13}, Ll/ۗ᩺֫;-><init>(Landroid/net/Uri;Ll/۠ᩴ֫;Ljava/lang/String;)V

    move-object/from16 v6, v19

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2a

    :cond_4a
    move-object/from16 v6, v19

    const-string v1, "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping"

    .line 665
    invoke-static {v1}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    :goto_2a
    move-object/from16 v1, p0

    :goto_2b
    add-int/lit8 v0, v0, 0x1

    move-object/from16 v19, v6

    move-object/from16 v31, v8

    move-object/from16 v20, v9

    move-object/from16 v7, v22

    move-object/from16 v6, v23

    move-object/from16 v14, v24

    move-object/from16 v15, v25

    move-object v8, v1

    move-object/from16 v1, p1

    goto/16 :goto_17

    :cond_4b
    move-object/from16 p0, v8

    move-object/from16 v6, v19

    move-object/from16 v9, v20

    move-object/from16 v8, v31

    if-eqz v29, :cond_4c

    .line 694
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    move-object v10, v0

    goto :goto_2c

    :cond_4c
    move-object v10, v4

    .line 697
    :goto_2c
    new-instance v13, Ll/۫᩺֫;

    move-object v0, v13

    move-object/from16 v1, p1

    move-object/from16 v2, v21

    move-object v4, v8

    move-object v5, v9

    move-object/from16 v7, v18

    move-object/from16 v8, p0

    move-object v9, v10

    move/from16 v10, v17

    move-object/from16 v12, v30

    invoke-direct/range {v0 .. v12}, Ll/۫᩺֫;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ll/۠ᩴ֫;Ljava/util/List;ZLjava/util/Map;Ljava/util/List;)V

    return-object v13

    :sswitch_data_0
    .sparse-switch
        -0x392db8c5 -> :sswitch_3
        -0x13dc6572 -> :sswitch_2
        0x3bba3b6 -> :sswitch_1
        0x4de1c5b -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)Ll/ᩴᩴ֫;
    .locals 8

    .line 1434
    sget-object v0, Ll/᩺᩺֫;->ܳ֫:Ljava/util/regex/Pattern;

    const-string v1, "1"

    invoke-static {p0, v0, v1, p2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"

    .line 1435
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    const/16 v4, 0x2c

    const-string v5, "video/mp4"

    sget-object v6, Ll/᩺᩺֫;->֫ۧ:Ljava/util/regex/Pattern;

    const/4 v7, 0x0

    if-eqz v2, :cond_0

    .line 1436
    invoke-static {p0, v6, p2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    .line 1437
    new-instance p1, Ll/ᩴᩴ֫;

    sget-object p2, Ll/᩻ᩴ֫;->ܿ:Ljava/util/UUID;

    .line 1440
    invoke-virtual {p0, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p0

    .line 286
    invoke-direct {p1, p2, v7, v5, p0}, Ll/ᩴᩴ֫;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    return-object p1

    :cond_0
    const-string v2, "com.widevine"

    .line 1441
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1442
    new-instance p1, Ll/ᩴᩴ֫;

    sget-object p2, Ll/᩻ᩴ֫;->ܿ:Ljava/util/UUID;

    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1076
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    const-string v0, "hls"

    .line 286
    invoke-direct {p1, p2, v7, v0, p0}, Ll/ᩴᩴ֫;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    return-object p1

    :cond_1
    const-string v2, "com.microsoft.playready"

    .line 1443
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 1444
    invoke-static {p0, v6, p2}, Ll/᩺᩺֫;->֫(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    .line 1445
    invoke-virtual {p0, v4}, Ljava/lang/String;->indexOf(I)I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p0

    .line 1446
    sget-object p1, Ll/᩻ᩴ֫;->ܽ:Ljava/util/UUID;

    .line 42
    invoke-static {p1, v7, p0}, Ll/ۧۘۧ;->֫(Ljava/util/UUID;[Ljava/util/UUID;[B)[B

    move-result-object p0

    .line 1447
    new-instance p2, Ll/ᩴᩴ֫;

    .line 286
    invoke-direct {p2, p1, v7, v5, p0}, Ll/ᩴᩴ֫;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    return-object p2

    :cond_2
    return-object v7
.end method

.method public static ֫(Ljava/lang/String;[Ll/ᩴᩴ֫;)Ll/᩵ᩴ֫;
    .locals 7

    .line 1371
    array-length v0, p1

    new-array v0, v0, [Ll/ᩴᩴ֫;

    const/4 v1, 0x0

    .line 1372
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    .line 1373
    aget-object v2, p1, v1

    .line 344
    new-instance v3, Ll/ᩴᩴ֫;

    iget-object v4, v2, Ll/ᩴᩴ֫;->ۗ:Ljava/util/UUID;

    iget-object v5, v2, Ll/ᩴᩴ֫;->᩶:Ljava/lang/String;

    iget-object v2, v2, Ll/ᩴᩴ֫;->ۙ:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-direct {v3, v4, v5, v2, v6}, Ll/ᩴᩴ֫;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 1373
    aput-object v3, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1375
    :cond_0
    new-instance p1, Ll/᩵ᩴ֫;

    invoke-direct {p1, p0, v0}, Ll/᩵ᩴ֫;-><init>(Ljava/lang/String;[Ll/ᩴᩴ֫;)V

    return-object p1
.end method

.method public static ֫(Ljava/util/regex/Pattern;Ljava/lang/String;)Z
    .locals 0

    .line 1606
    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 1607
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 1608
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    const-string p1, "YES"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(Ljava/util/regex/Pattern;Ljava/lang/String;)J
    .locals 0

    .line 1502
    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 1503
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 1504
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    .line 155
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1504
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p0

    return-wide p0

    :cond_0
    const-wide/16 p0, -0x1

    return-wide p0
.end method


# virtual methods
.method public final bridge synthetic ֫(Landroid/net/Uri;Ll/᩶۠֫;)Ljava/lang/Object;
    .locals 0

    .line 76
    invoke-virtual {p0, p1, p2}, Ll/᩺᩺֫;->֫(Landroid/net/Uri;Ljava/io/InputStream;)Ll/ۤ᩺֫;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Landroid/net/Uri;Ljava/io/InputStream;)Ll/ۤ᩺֫;
    .locals 6

    .line 323
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 324
    new-instance p2, Ljava/util/ArrayDeque;

    invoke-direct {p2}, Ljava/util/ArrayDeque;-><init>()V

    .line 364
    :try_start_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    move-result v1

    const/16 v2, 0xef

    const/4 v3, 0x0

    if-ne v1, v2, :cond_1

    .line 366
    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    move-result v1

    const/16 v2, 0xbb

    if-ne v1, v2, :cond_6

    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    move-result v1

    const/16 v2, 0xbf

    if-eq v1, v2, :cond_0

    goto :goto_3

    .line 370
    :cond_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    move-result v1

    :cond_1
    :goto_0
    const/4 v2, -0x1

    if-eq v1, v2, :cond_2

    .line 386
    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(I)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 387
    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    move-result v1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_1
    const/4 v5, 0x7

    if-ge v4, v5, :cond_4

    const-string v5, "#EXTM3U"

    .line 375
    invoke-virtual {v5, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-eq v1, v5, :cond_3

    goto :goto_3

    .line 378
    :cond_3
    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    move-result v1

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    if-eq v1, v2, :cond_5

    .line 386
    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(I)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-static {v1}, Ll/ۘ֨֫;->᩷(I)Z

    move-result v3

    if-nez v3, :cond_5

    .line 387
    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    move-result v1

    goto :goto_2

    .line 381
    :cond_5
    invoke-static {v1}, Ll/ۘ֨֫;->᩷(I)Z

    move-result v3

    :cond_6
    :goto_3
    if-eqz v3, :cond_c

    .line 331
    :goto_4
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_b

    .line 332
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 333
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_4

    :cond_7
    const-string v2, "#EXT-X-STREAM-INF"

    .line 335
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 336
    invoke-virtual {p2, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 337
    new-instance v1, Ll/ۨ᩺֫;

    invoke-direct {v1, p2, v0}, Ll/ۨ᩺֫;-><init>(Ljava/util/ArrayDeque;Ljava/io/BufferedReader;)V

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Ll/᩺᩺֫;->֫(Ll/ۨ᩺֫;Ljava/lang/String;)Ll/۫᩺֫;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 357
    invoke-static {v0}, Ll/ۘ֨֫;->֫(Ljava/io/Closeable;)V

    return-object p1

    :cond_8
    :try_start_1
    const-string v2, "#EXT-X-TARGETDURATION"

    .line 338
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_a

    const-string v2, "#EXT-X-MEDIA-SEQUENCE"

    .line 339
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_a

    const-string v2, "#EXTINF"

    .line 340
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_a

    const-string v2, "#EXT-X-KEY"

    .line 341
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_a

    const-string v2, "#EXT-X-BYTERANGE"

    .line 342
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_a

    const-string v2, "#EXT-X-DISCONTINUITY"

    .line 343
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    const-string v2, "#EXT-X-DISCONTINUITY-SEQUENCE"

    .line 344
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    const-string v2, "#EXT-X-ENDLIST"

    .line 345
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    goto :goto_5

    .line 353
    :cond_9
    invoke-virtual {p2, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 346
    :cond_a
    :goto_5
    invoke-virtual {p2, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 347
    iget-object v1, p0, Ll/᩺᩺֫;->֫:Ll/۫᩺֫;

    iget-object v2, p0, Ll/᩺᩺֫;->ۧ:Ll/ۙ᩺֫;

    new-instance v3, Ll/ۨ᩺֫;

    invoke-direct {v3, p2, v0}, Ll/ۨ᩺֫;-><init>(Ljava/util/ArrayDeque;Ljava/io/BufferedReader;)V

    .line 351
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    .line 347
    invoke-static {v1, v2, v3, p1}, Ll/᩺᩺֫;->֫(Ll/۫᩺֫;Ll/ۙ᩺֫;Ll/ۨ᩺֫;Ljava/lang/String;)Ll/ۙ᩺֫;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 357
    invoke-static {v0}, Ll/ۘ֨֫;->֫(Ljava/io/Closeable;)V

    return-object p1

    :cond_b
    invoke-static {v0}, Ll/ۘ֨֫;->֫(Ljava/io/Closeable;)V

    const-string p1, "Failed to parse the playlist, could not identify any tags."

    .line 359
    invoke-static {p1}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1

    :cond_c
    :try_start_2
    const-string p1, "Input does not start with the #EXTM3U header."

    .line 328
    invoke-static {p1}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    .line 357
    invoke-static {v0}, Ll/ۘ֨֫;->֫(Ljava/io/Closeable;)V

    .line 358
    throw p1
.end method
