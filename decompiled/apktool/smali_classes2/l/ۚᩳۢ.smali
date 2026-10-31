.class public final Ll/ۚᩳۢ;
.super Ljava/lang/Object;
.source "26O7"


# static fields
.field public static final ֫:Ll/ۨۘܽ;

.field public static final ۜ:Ll/ۨۘܽ;

.field public static final ۧ:Ll/ۨۘܽ;

.field public static final ܳ:Ll/ۨۘܽ;

.field public static final ܽ:Ll/ۨۘܽ;

.field public static final ܿ:Ll/ۨۘܽ;

.field public static final ᩳ:Ll/ۨۘܽ;

.field public static final ᩻:Ll/ۨۘܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, " *+(?<directive>\\.class) ++(?<modifiers>(?:(?>public|private|protected|static|final|synchronized|volatile|bridge|transient|varargs|native|interface|abstract|strictfp|synthetic|annotation|enum|constructor|declared-synchronized|whitelist|greylist-max-o|greylist-max-p|greylist-max-q|greylist-max-r|greylist|blacklist|core-platform-api|test-api) ++)*+)(?<type>L[^;\\r\\n]*+;)"

    .line 25
    invoke-static {v0}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v0

    sput-object v0, Ll/ۚᩳۢ;->֫:Ll/ۨۘܽ;

    const-string v0, " *+(?<directive>\\.)method ++(?<modifiers>(?:(?>public|private|protected|static|final|synchronized|volatile|bridge|transient|varargs|native|interface|abstract|strictfp|synthetic|annotation|enum|constructor|declared-synchronized|whitelist|greylist-max-o|greylist-max-p|greylist-max-q|greylist-max-r|greylist|blacklist|core-platform-api|test-api) ++)*+)(?<name>[^ \\r\\n(]++) *+\\( *+(?<parameters>[^ \\r\\n)]*+) *+\\) *+(?<type>\\[*+(?:[VCZBISJDF]|L[^;\\r\\n]*+;))"

    .line 27
    invoke-static {v0}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v0

    sput-object v0, Ll/ۚᩳۢ;->ܿ:Ll/ۨۘܽ;

    const-string v0, " *+(?<directive>\\.)field ++(?<modifiers>(?:(?>public|private|protected|static|final|synchronized|volatile|bridge|transient|varargs|native|interface|abstract|strictfp|synthetic|annotation|enum|constructor|declared-synchronized|whitelist|greylist-max-o|greylist-max-p|greylist-max-q|greylist-max-r|greylist|blacklist|core-platform-api|test-api) ++)*+)(?<name>[^ \\r\\n:]++) *+: *+(?<type>\\[*+(?:[VCZBISJDF]|L[^;\\r\\n]*+;))(?: *+= *+(?<value>[^ \\f\\t\\r\\n\\u00a0\\u1680\\u180e\\u2000-\\u200a\\u2028\\u2029\\u202f\\u205f\\u3000\\ufeff]++))?+"

    .line 29
    invoke-static {v0}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v0

    sput-object v0, Ll/ۚᩳۢ;->ۧ:Ll/ۨۘܽ;

    const-string v0, " *+\\.end ++method"

    .line 31
    invoke-static {v0}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v0

    sput-object v0, Ll/ۚᩳۢ;->ܳ:Ll/ۨۘܽ;

    const-string v0, " *+\\.end ++field"

    .line 32
    invoke-static {v0}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v0

    sput-object v0, Ll/ۚᩳۢ;->ܽ:Ll/ۨۘܽ;

    const-string v0, " *+(?:const-string(?:/jumbo)?+ ++[vp][0-9]++ *+,|\\.field [^\\r\\n=]++=) *+\""

    .line 34
    invoke-static {v0}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v0

    sput-object v0, Ll/ۚᩳۢ;->ۜ:Ll/ۨۘܽ;

    const-string v0, "method ++(?<modifiers>(?:(?>public|private|protected|static|final|synchronized|volatile|bridge|transient|varargs|native|interface|abstract|strictfp|synthetic|annotation|enum|constructor|declared-synchronized|whitelist|greylist-max-o|greylist-max-p|greylist-max-q|greylist-max-r|greylist|blacklist|core-platform-api|test-api) ++)*+)(?<name>[^ \\r\\n(]++) *+\\( *+(?<parameters>[^ \\r\\n)]*+) *+\\) *+(?<type>[^ \\r\\n]++)"

    .line 38
    invoke-static {v0}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v0

    sput-object v0, Ll/ۚᩳۢ;->᩻:Ll/ۨۘܽ;

    const-string v0, "field ++(?<modifiers>(?:(?>public|private|protected|static|final|synchronized|volatile|bridge|transient|varargs|native|interface|abstract|strictfp|synthetic|annotation|enum|constructor|declared-synchronized|whitelist|greylist-max-o|greylist-max-p|greylist-max-q|greylist-max-r|greylist|blacklist|core-platform-api|test-api) ++)*+)(?<name>[^ \\r\\n:]++) *+: *+(?<type>[^ \\r\\n=]++)"

    .line 39
    invoke-static {v0}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v0

    sput-object v0, Ll/ۚᩳۢ;->ᩳ:Ll/ۨۘܽ;

    return-void
.end method

.method public static ֫(Ll/۫ۘܽ;I)Z
    .locals 7

    .line 46
    invoke-virtual {p0}, Ll/۫ۘܽ;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    .line 47
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lt p1, v1, :cond_0

    goto :goto_3

    :cond_0
    const/16 v2, 0xd

    const/16 v3, 0xa

    const/4 v4, 0x1

    if-eqz p1, :cond_1

    add-int/lit8 v5, p1, -0x1

    .line 51
    invoke-interface {v0, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    if-eq v6, v3, :cond_1

    .line 52
    invoke-interface {v0, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    if-ne v5, v2, :cond_2

    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    if-eq v5, v3, :cond_2

    .line 53
    :cond_1
    invoke-virtual {p0, p1}, Ll/۫ۘܽ;->lookingAt(I)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    if-ge p1, v1, :cond_6

    .line 57
    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    if-eq v5, v2, :cond_3

    if-eq v5, v3, :cond_3

    goto :goto_2

    :cond_3
    if-ne v5, v2, :cond_4

    add-int/lit8 v5, p1, 0x1

    if-ge v5, v1, :cond_4

    .line 61
    invoke-interface {v0, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    if-ne v6, v3, :cond_4

    move p1, v5

    :cond_4
    add-int/lit8 v5, p1, 0x1

    if-ge v5, v1, :cond_5

    .line 64
    invoke-virtual {p0, v5}, Ll/۫ۘܽ;->lookingAt(I)Z

    move-result v5

    if-eqz v5, :cond_5

    :goto_1
    return v4

    :cond_5
    :goto_2
    add-int/2addr p1, v4

    goto :goto_0

    :cond_6
    :goto_3
    const/4 p0, 0x0

    return p0
.end method
