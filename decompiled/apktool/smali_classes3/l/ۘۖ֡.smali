.class public final Ll/ۘۖ֡;
.super Ll/ܽۖ֡;
.source "P5J2"


# static fields
.field public static final ܳ:Ljava/util/regex/Pattern;


# instance fields
.field public final ܿ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "^total \\d+$"

    .line 53
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ۘۖ֡;->ܳ:Ljava/util/regex/Pattern;

    .line 63
    new-instance v0, Ll/ۗܺ֡;

    return-void
.end method

.method public constructor <init>(Ll/ۗܺ֡;Z)V
    .locals 1

    const-string v0, "([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s*(\\d+)\\s+(?:(\\S+(?:\\s\\S+)*?)\\s+)?(?:(\\S+(?:\\s\\S+)*)\\s+)?(\\d+(?:,\\s*\\d+)?)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3})|(?:\\d{1,2}\u6708\\s+\\d{1,2}\u65e5))\\s+((?:\\d+(?::\\d+)?)|(?:\\d{4}\u5e74))\\s(.*)"

    .line 149
    invoke-direct {p0, v0}, Ll/ܽۖ֡;-><init>(Ljava/lang/String;)V

    .line 150
    invoke-virtual {p0, p1}, Ll/ܽۖ֡;->֫(Ll/ۗܺ֡;)V

    .line 151
    iput-boolean p2, p0, Ll/ۘۖ֡;->ܿ:Z

    return-void
.end method

.method public static synthetic ܿ(Ljava/lang/String;)Z
    .locals 1

    .line 273
    sget-object v0, Ll/ۘۖ֡;->ܳ:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final ֫(Ljava/util/LinkedList;)Ljava/util/List;
    .locals 2

    .line 273
    new-instance v0, Ll/᩺ᩳܽ;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/᩺ᩳܽ;-><init>(I)V

    invoke-static {p1, v0}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    return-object p1
.end method

.method public final ֫()Ll/ۗܺ֡;
    .locals 4

    .line 161
    new-instance v0, Ll/ۗܺ֡;

    const-string v1, "MMM d yyyy"

    const-string v2, "MMM d HH:mm"

    const-string v3, "UNIX"

    invoke-direct {v0, v3, v1, v2}, Ll/ۗܺ֡;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ll/ۤܺ֡;
    .locals 14

    .line 174
    new-instance v0, Ll/ۤܺ֡;

    invoke-direct {v0}, Ll/ۤܺ֡;-><init>()V

    .line 175
    invoke-virtual {v0, p1}, Ll/ۤܺ֡;->ᩳ(Ljava/lang/String;)V

    .line 178
    invoke-virtual {p0, p1}, Ll/ܽۖ֡;->ۧ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_9

    const/4 p1, 0x1

    .line 179
    invoke-virtual {p0, p1}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xf

    .line 180
    invoke-virtual {p0, v2}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x10

    .line 181
    invoke-virtual {p0, v3}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x11

    .line 182
    invoke-virtual {p0, v4}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x12

    .line 183
    invoke-virtual {p0, v5}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v5

    .line 184
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v7, 0x13

    invoke-virtual {p0, v7}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v8, 0x14

    invoke-virtual {p0, v8}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/16 v8, 0x15

    .line 185
    invoke-virtual {p0, v8}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v8

    .line 186
    iget-boolean v9, p0, Ll/ۘۖ֡;->ܿ:Z

    if-eqz v9, :cond_0

    const-string v9, "^\\s+"

    const-string v10, ""

    .line 187
    invoke-virtual {v8, v9, v10}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 190
    :cond_0
    :try_start_0
    invoke-virtual {p0, v7}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v7

    const-string v9, "\u6708"

    invoke-virtual {v7, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 191
    new-instance v7, Ll/ܿۖ֡;

    invoke-direct {v7}, Ll/ܿۖ֡;-><init>()V

    .line 192
    new-instance v9, Ll/ۗܺ֡;

    const-string v10, "UNIX"

    const-string v11, "M\'\u6708\' d\'\u65e5\' yyyy\'\u5e74\'"

    const-string v12, "M\'\u6708\' d\'\u65e5\' HH:mm"

    invoke-direct {v9, v10, v11, v12}, Ll/ۗܺ֡;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v9}, Ll/ܿۖ֡;->֫(Ll/ۗܺ֡;)V

    .line 193
    invoke-virtual {v7, v6}, Ll/ܿۖ֡;->֫(Ljava/lang/String;)Ljava/util/Calendar;

    move-result-object v6

    invoke-virtual {v0, v6}, Ll/ۤܺ֡;->֫(Ljava/util/Calendar;)V

    goto :goto_0

    .line 195
    :cond_1
    invoke-virtual {p0, v6}, Ll/ܽۖ֡;->ܽ(Ljava/lang/String;)Ljava/util/Calendar;

    move-result-object v6

    invoke-virtual {v0, v6}, Ll/ۤܺ֡;->֫(Ljava/util/Calendar;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :goto_0
    const/4 v6, 0x0

    .line 203
    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v7, 0x2d

    const/4 v9, 0x3

    const/4 v10, 0x2

    if-eq v1, v7, :cond_3

    const/16 v7, 0x6c

    if-eq v1, v7, :cond_2

    packed-switch v1, :pswitch_data_0

    const/4 v1, 0x3

    goto :goto_1

    :pswitch_0
    const/4 v1, 0x1

    goto :goto_1

    :pswitch_1
    const/4 v1, 0x0

    const/4 v7, 0x1

    goto :goto_2

    :cond_2
    :pswitch_2
    const/4 v1, 0x2

    goto :goto_1

    :cond_3
    :pswitch_3
    const/4 v1, 0x0

    :goto_1
    const/4 v7, 0x0

    .line 225
    :goto_2
    invoke-virtual {v0, v1}, Ll/ۤܺ֡;->֫(I)V

    const/4 v11, 0x0

    const/4 v12, 0x4

    :goto_3
    if-ge v11, v9, :cond_5

    .line 229
    invoke-virtual {p0, v12}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v9

    const-string v13, "-"

    invoke-virtual {v9, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    xor-int/2addr v9, p1

    invoke-virtual {v0, v11, v6, v9}, Ll/ۤܺ֡;->֫(IIZ)V

    add-int/lit8 v9, v12, 0x1

    .line 230
    invoke-virtual {p0, v9}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    xor-int/2addr v9, p1

    invoke-virtual {v0, v11, p1, v9}, Ll/ۤܺ֡;->֫(IIZ)V

    add-int/lit8 v9, v12, 0x2

    .line 231
    invoke-virtual {p0, v9}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v9

    .line 232
    invoke-virtual {v9, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_4

    invoke-virtual {v9, v6}, Ljava/lang/String;->charAt(I)C

    move-result v9

    invoke-static {v9}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v9

    if-nez v9, :cond_4

    const/4 v9, 0x1

    goto :goto_4

    :cond_4
    const/4 v9, 0x0

    :goto_4
    invoke-virtual {v0, v11, v10, v9}, Ll/ۤܺ֡;->֫(IIZ)V

    add-int/lit8 v11, v11, 0x1

    add-int/lit8 v12, v12, 0x4

    const/4 v9, 0x3

    goto :goto_3

    :cond_5
    if-nez v7, :cond_6

    .line 236
    :try_start_1
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 241
    :catch_1
    :cond_6
    invoke-virtual {v0, v3}, Ll/ۤܺ֡;->ܿ(Ljava/lang/String;)V

    .line 242
    invoke-virtual {v0, v4}, Ll/ۤܺ֡;->֫(Ljava/lang/String;)V

    .line 244
    :try_start_2
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ll/ۤܺ֡;->֫(J)V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_5

    :catch_2
    nop

    :goto_5
    if-ne v1, v10, :cond_8

    const-string p1, " -> "

    .line 251
    invoke-virtual {v8, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    const/4 v1, -0x1

    if-ne p1, v1, :cond_7

    .line 254
    invoke-virtual {v0, v8}, Ll/ۤܺ֡;->ܽ(Ljava/lang/String;)V

    goto :goto_6

    .line 256
    :cond_7
    invoke-virtual {v8, v6, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۤܺ֡;->ܽ(Ljava/lang/String;)V

    add-int/lit8 p1, p1, 0x4

    .line 257
    invoke-virtual {v8, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۤܺ֡;->ۧ(Ljava/lang/String;)V

    goto :goto_6

    .line 260
    :cond_8
    invoke-virtual {v0, v8}, Ll/ۤܺ֡;->ܽ(Ljava/lang/String;)V

    :goto_6
    return-object v0

    :cond_9
    const/4 p1, 0x0

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x62
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
